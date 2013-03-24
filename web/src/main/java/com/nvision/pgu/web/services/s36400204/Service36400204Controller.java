package com.nvision.pgu.web.services.s36400204;

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
@RequestMapping("/services/s" + Service36400204Controller.SERVICE_ID)
@ServiceController(id = Service36400204Controller.SERVICE_ID, title = "Назначение гражданам, имеющим звание «Почетный гражданин Саратовской области», денежных компенсаций расходов по оплате проезда")
@Version("0.2")
public class Service36400204Controller extends AbstractServiceOrderControllerEDS24<Service36400204Form> {
    /**
     * id Назначение гражданам, имеющим звание «Почетный гражданин Саратовской области», денежных компенсаций расходов по оплате проезда
     */
    public static final int SERVICE_ID = 36400204;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400204FormValidator validator;

    public Service36400204Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о лице, нуждающемся в государственной услуге",
                "Дополнительные сведения"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400204Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400204Form createNewForm() {
        return new Service36400204Form();
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400204Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // сценарий 1
    private boolean isScenario1(Service36400204Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 2
    private boolean isScenario2(Service36400204Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 3
    private boolean isScenario3(Service36400204Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                "1".equals(form.getDovCategory());
    }

    // сценарий 4
    private boolean isScenario4(Service36400204Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                ("2".equals(form.getDovCategory()) || "3".equals(form.getDovCategory()));
    }

    // сценарий 5
    private boolean isScenario5(Service36400204Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                "1".equals(form.getDovCategory());
    }

    // сценарий 6
    private boolean isScenario6(Service36400204Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                ("2".equals(form.getDovCategory()) || "3".equals(form.getDovCategory()));
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400204Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
        String step2_2 = "step2-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";

        if (stepProcessingResult.getStepNum() == 2) {
            // s2
            if (isScenario1(form))
                return new StepProcessingResult(2, step2_2);
            if (isScenario2(form))
                return new StepProcessingResult(2, step2_3);
            if (isScenario3(form))
                return new StepProcessingResult(2, step2_2);
            if (isScenario4(form))
                return new StepProcessingResult(2, step2_4);
            if (isScenario5(form))
                return new StepProcessingResult(2, step2_3);
            if (isScenario6(form))
                return new StepProcessingResult(2, step2_5);
            // s2
            if (!goback)
                stepProcessingResult.setStepNum(3);
            if (goback)
                stepProcessingResult.setStepNum(1);
        }

        // шаг 4(3) 1
        if (stepProcessingResult.getStepNum() == 3) {
            // s3
            if (isScenario3(form) || isScenario4(form) || isScenario5(form) || isScenario6(form))
                return stepProcessingResult;
            // s3
            if (!goback)
                stepProcessingResult.setStepNum(4);
            if (goback) {
                // s2
                if (isScenario1(form))
                    return new StepProcessingResult(2, step2_2);
                if (isScenario2(form))
                    return new StepProcessingResult(2, step2_3);
                if (isScenario3(form))
                    return new StepProcessingResult(2, step2_2);
                if (isScenario4(form))
                    return new StepProcessingResult(2, step2_4);
                if (isScenario5(form))
                    return new StepProcessingResult(2, step2_3);
                if (isScenario6(form))
                    return new StepProcessingResult(2, step2_5);
                // s2
                stepProcessingResult.setStepNum(1); // пропуск шага
            }
        }

        return stepProcessingResult;
    }

    // автоочистка полей
    // поля адреса чистятся в data4sign
    @Override
    protected Map<String, Object> formToMap(Service36400204Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        if (form.getDov_enable().equalsIgnoreCase("off")) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if (form.getIncapable_enable().equalsIgnoreCase("off")) {
            decoratedFormAsMap.remove("recipientLastName");
            decoratedFormAsMap.remove("recipientFirstName");
            decoratedFormAsMap.remove("recipientMiddleName");
            decoratedFormAsMap.remove("recipientbirthdate");
            //recipientAddress очищается в data4sign
            //recipientFactAddress очищается в data4sign
            decoratedFormAsMap.remove("recipientPassSeria");
            decoratedFormAsMap.remove("recipientPassNo");
            decoratedFormAsMap.remove("recipientPassDate");
            decoratedFormAsMap.remove("recipientPassFrom");
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
            decoratedFormAsMap.remove("dovCategory");
        }

        if (form.getDovCategory() != null)
            if (form.getDovCategory().equals("0") || form.getDovCategory().equals("1"))
                decoratedFormAsMap.clearFileLoadField("dovOpekLoad");

        if (form.getAccrualMethod().equals("2")) {
            decoratedFormAsMap.remove("nameBankBenefit");
            decoratedFormAsMap.remove("filialBankBenefit");
            decoratedFormAsMap.remove("bikBankBenefit");
            decoratedFormAsMap.remove("corrAccBankBenefit");
            decoratedFormAsMap.remove("codeFilialBankBenefit");
            decoratedFormAsMap.remove("clientAccBankBenefit");
        }

        if (form.getAccrualMethod().equals("1")) decoratedFormAsMap.remove("postOffice");


        return formAsMap;
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400204Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        // на шаге 2 есть только одна страница с всегда заполненными из ЛК полями
        if (stepProcessingResult.getStepNum() == 2 && form.getRepresentativeStatusChanged()) {
            if (isScenario1(form) || isScenario3(form) || isScenario4(form))
                form.fillApplicantAttributesWithPrivateRoomData(privateRoomDataContainer);
            if (isScenario2(form) || isScenario5(form) || isScenario6(form))
                form.clearApplicantAttributes();

            form.setRepresentativeStatusChanged(false);
        }
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400204Form form, Map<String, Object> model) {

        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovOpekLoad",
                "recipientIdentityDocLoad",
                "honoraryCitizenLoad",
                "certificateLackSupportLoad"
        );
    }


}