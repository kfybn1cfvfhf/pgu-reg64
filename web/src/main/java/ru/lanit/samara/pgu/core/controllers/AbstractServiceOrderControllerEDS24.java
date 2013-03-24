package ru.lanit.samara.pgu.core.controllers;

import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.annotations.Transient;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import com.nvision.pgu.core.services.ServiceResponseException;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.*;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: vlyasovich
 * Date: 26.11.12
 * Time: 9:43
 * To change this template use File | Settings | File Templates.
 */
abstract public class AbstractServiceOrderControllerEDS24<F extends AbstractServiceOrderForm> extends com.nvision.pgu.core.controllers.AbstractServiceOrderControllerEDS24<F>{

    private static Logger logger = LoggerFactory.getLogger(AbstractServiceOrderControllerEDS24.class);
    private static final String PATCH_MODEL_ERROR_MESSAGE = "[LANIT] Error patching form on step processing";

    @Autowired
    private IPrivateRoomDataContainer privateRoomDataContainer;

    protected IPrivateRoomDataContainer getPrivateRoomDataContainer() {
        return this.privateRoomDataContainer;
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

        Map<String, Object> formAsMap = super.formToMap(form);

        return formAsMap;

    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, F form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        ServiceRegistryInfoController cl1 = new ServiceRegistryInfoController();

        model.put("stateOrgName", cl1.getOrgName(form.getServiceTargetExtId()));

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(F form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        Object obj = model.get("form");
        if (obj instanceof AbstractServiceOrderForm) {
            AbstractServiceOrderForm f = (AbstractServiceOrderForm)obj;
            Field[] fields = f.getClass().getDeclaredFields();
            for (Field formField : fields) {
                String fieldValue = null;
                try {
                    fieldValue = BeanUtils.getProperty(f, formField.getName());
                    if ((formField.getType().equals(String.class)) && (fieldValue == null)) {
                        BeanUtils.setProperty(f, formField.getName(), "");
                    }
                } catch (IllegalAccessException e) {
                    logger.error(PATCH_MODEL_ERROR_MESSAGE, e);
                } catch (NoSuchMethodException e) {
                    logger.error(PATCH_MODEL_ERROR_MESSAGE, e);
                } catch (InvocationTargetException e) {
                    logger.error(PATCH_MODEL_ERROR_MESSAGE, e);
                }

            }
        }
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

    @Override
    protected String buildXML(F form, Map<String, Object> requestModel, String xmlPrefix) throws ShowErrorToUserException {
        if (form.getFormInfo() != null) {
            String orgCode = form.getFormInfo().getStateOrgCode();
            if (orgCode != null) {
                requestModel.put("stateOrgCode", orgCode);
            } else {
                requestModel.put("stateOrgCode", "");
            }
        }
        return super.buildXML(form, requestModel, xmlPrefix);
    }
}
