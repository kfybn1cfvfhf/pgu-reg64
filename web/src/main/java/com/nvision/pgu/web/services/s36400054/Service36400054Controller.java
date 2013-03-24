package com.nvision.pgu.web.services.s36400054;


import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMap;
import ru.lanit.samara.pgu.core.util.formasmap.FormAsMapImpl;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s" + Service36400054Controller.SERVICE_ID)
@ServiceController(id = Service36400054Controller.SERVICE_ID, title = "Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей")
@Version("0.4.5")
public class Service36400054Controller extends AbstractServiceOrderControllerEDS24<Service36400054Form> {
    /**
     * id Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей
     */
    public static final int SERVICE_ID = 36400054;


    @Autowired
    private Service36400054FormValidator validator;

    public Service36400054Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о лице, нуждающемся в государственной услуге",
                "Сведения о запрашиваемой услуге",
                "Сведения о способе социальной выплаты"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400054Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400054Form createNewForm() {
        return new Service36400054Form();
    }

    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400054Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // сценарий 1
    // При деактивированном incapable_enable и деактивированном dov_enable
    private boolean isScenario1(Service36400054Form form) {
        return "off".equalsIgnoreCase(form.getIncapable_enable()) &&
                "off".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 2
    // При деактивированном incapable_enable и активированном dov_enable
    private boolean isScenario2(Service36400054Form form) {
        return "off".equalsIgnoreCase(form.getIncapable_enable()) &&
                "on".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 3
    // При активированном incapable_enable и деактивированном dov_enable
    private boolean isScenario3(Service36400054Form form) {
        return "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                "off".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 4
    // При выборе "Опекун" или "Попечитель" и деактивированном dov_enable
    private boolean isScenario4(Service36400054Form form) {
        return "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                "on".equalsIgnoreCase(form.getDov_enable());
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400054Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step2_2 = "step2-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";


        if (stepProcessingResult.getStepNum() == 2) {
            // step 2 copy
            if (isScenario1(form))
                return new StepProcessingResult(2, step2_2);
            if (isScenario2(form))
                return new StepProcessingResult(2, step2_3);
            if (isScenario3(form))
                return new StepProcessingResult(2, step2_4);
            if (isScenario4(form))
                return new StepProcessingResult(2, step2_5);
            // /step 2 copy
            if (!goback)
                stepProcessingResult.setStepNum(3);
            if (goback)
                stepProcessingResult.setStepNum(1);
        }

        // шаг 4(3) 1
        if (stepProcessingResult.getStepNum() == 3) {
            // step 3 copy
            if (isScenario3(form) || isScenario4(form))
                return stepProcessingResult;
            // /step 3 copy
            if (!goback)
                stepProcessingResult.setStepNum(4);
            if (goback) {
                // step 2 copy
                if (isScenario1(form))
                    return new StepProcessingResult(2, step2_2);
                if (isScenario2(form))
                    return new StepProcessingResult(2, step2_3);
                if (isScenario3(form))
                    return new StepProcessingResult(2, step2_4);
                if (isScenario4(form))
                    return new StepProcessingResult(2, step2_5);
                // /step 2 copy

                stepProcessingResult.setStepNum(1); // пропуск шага
            }
        }

        return stepProcessingResult;
    }

    // автоочистка полей
    // поля адреса чистятся в data4sign
    @Override
    protected Map<String, Object> formToMap(Service36400054Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        if (isScenario1(form)) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
            decoratedFormAsMap.remove("recipientLastName");
            decoratedFormAsMap.remove("recipientFirstName");
            decoratedFormAsMap.remove("recipientMiddleName");
            decoratedFormAsMap.remove("recipientBirthDate");
            //объединённые поля rec_address удаляются в data4sign
            //объединённые поля rec_factAddress удаляются в data4sign
            decoratedFormAsMap.remove("recipientIdentityDocType");
            decoratedFormAsMap.remove("recipientOtherDocTypeName");
            decoratedFormAsMap.remove("recipientPassSeria");
            decoratedFormAsMap.remove("recipientPassNo");
            decoratedFormAsMap.remove("recipientPassDate");
            decoratedFormAsMap.remove("recipientPassFrom");
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
        }

        if (isScenario2(form)) {
            decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
            decoratedFormAsMap.remove("recipientLastName");
            decoratedFormAsMap.remove("recipientFirstName");
            decoratedFormAsMap.remove("recipientMiddleName");
            decoratedFormAsMap.remove("recipientBirthDate");
            //объединённые поля rec_address удаляются в data4sign
            //объединённые поля rec_factAddress удаляются в data4sign
            decoratedFormAsMap.remove("recipientIdentityDocType");
            decoratedFormAsMap.remove("recipientOtherDocTypeName");
            decoratedFormAsMap.remove("recipientPassSeria");
            decoratedFormAsMap.remove("recipientPassNo");
            decoratedFormAsMap.remove("recipientPassDate");
            decoratedFormAsMap.remove("recipientPassFrom");
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
        }

        if (isScenario3(form)) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.remove("birthdate");
            //объединённые поля address удаляются в data4sign
            //объединённые поля factAddress удаляются в data4sign
        }

        if (isScenario4(form)) {
            decoratedFormAsMap.remove("birthdate");
            //объединённые поля address удаляются в data4sign
            //объединённые поля factAddress удаляются в data4sign
        }

        // Копирование имени "другого документа"
        if ("5".equalsIgnoreCase(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        }

        if ("5".equalsIgnoreCase(form.getRecipientIdentityDocType()))
            formAsMap.put("recipientIdentityDocType", form.getRecipientOtherDocTypeName());


        return formAsMap;
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400054Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        // на шаге 2 есть только одна страница с всегда заполненными из ЛК полями
        if (stepProcessingResult.getStepNum() == 2 && form.getRepresentativeStatusChanged()) {
            if (isScenario1(form) || isScenario3(form))  // эти страницы (2, 4) выпадают на сценариях 1 и 3
                form.fillApplicantAttributesWithPrivateRoomData(privateRoomDataContainer);
            if (isScenario2(form) || isScenario4(form))
                form.clearApplicantAttributes();

            form.setRepresentativeStatusChanged(false);
        }
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400054Form form, Map<String, Object> model) {

        return Arrays.asList(
                "identityDocLoad",
                "dovOpekLoad",
                "dovDovLoad",
                "dovPasLoad",
                "recipientIdentityDocLoad",
                "costGKUdocLoad"
        );
    }

}