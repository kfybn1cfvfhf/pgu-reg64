package ru.lanit.samara.pgu.core.controllers;


import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.annotations.Transient;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import com.nvision.pgu.core.services.ServiceResponseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.*;
import java.util.List;
import java.util.Map;

abstract public class AbstractServiceOrderController<F extends AbstractServiceOrderForm> extends com.nvision.pgu.core.controllers.AbstractServiceOrderController<F> {

    @Autowired
    private IPrivateRoomDataContainer privateRoomDataContainer;

    protected IPrivateRoomDataContainer getPrivateRoomDataContainer() {
        return this.privateRoomDataContainer;
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, F form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }


    @Override
    protected Map<String, Object> formToMap(F form) {

        // FIX: ядерный баг при обработке необязательных клонируемых полей с множественным выбором, аннотированных @JsonArrayToList
        for (Class formClass = form.getClass(); formClass != null; formClass = formClass.getSuperclass()) {
            for (Field formField : formClass.getDeclaredFields()) {
                int modifiers = formField.getModifiers();
                if ((Modifier.isStatic(modifiers)) || (Modifier.isTransient(modifiers)) || (formField.getAnnotation(Transient.class) != null)) {
                    continue;
                }

                String fieldName = formField.getName();
                if (formField.getType().equals(List.class) && formField.getGenericType() instanceof ParameterizedType) {
                    ParameterizedType formFieldParametrizedType = (ParameterizedType) formField.getGenericType();
                    Type[] formFieldTypeArguments = formFieldParametrizedType.getActualTypeArguments();
                    if (formFieldTypeArguments.length == 1 && formFieldTypeArguments[0].equals(String.class) && formField.getAnnotation(JsonArrayToList.class) != null) {
                        try {
                            Method getter = formClass.getMethod("get" + StringUtils.capitalize(fieldName), new Class[0]);
                            List<String> fieldValue = (List<String>)getter.invoke(form, new Object[0]);
                            for (int jsonArrayNum = 0; jsonArrayNum < fieldValue.size(); jsonArrayNum++) {
                                if (fieldValue.get(jsonArrayNum) != null && fieldValue.get(jsonArrayNum).isEmpty()) {
                                    fieldValue.set(jsonArrayNum, "[]");
                                }
                            }
                        } catch (NoSuchMethodException e) {
                            logger.error("Getter not found for " + fieldName + " field");
                        } catch (InvocationTargetException e) {
                            logger.error("Getter invokation error for " + fieldName + " field");
                        } catch (IllegalAccessException e) {
                            logger.error("Illegal access to getter of " + fieldName + " field");
                        }
                    }
                }
            }
        }

        return super.formToMap(form);
    }

    @Override
    protected String processOrder(F form, Map<String, Object> model, HttpServletRequest request) throws ServiceResponseException, ShowErrorToUserException {
        if (form.getFormInfo() != null) {
            String orgCode = form.getFormInfo().getStateOrgCode();
            if (orgCode != null) {
                model.put("stateOrgCode", orgCode);
            } else {
                model.put("stateOrgCode", "");
            }
        }
        return super.processOrder(form, model, request);
    }

}
