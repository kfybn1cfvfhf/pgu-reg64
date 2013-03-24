package com.nvision.pgu.web.services.s36400090;

import com.nvision.pgu.core.annotations.ServiceController;
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
@RequestMapping("/services/s" + Service36400090Controller.SERVICE_ID)
@ServiceController(id = Service36400090Controller.SERVICE_ID, title = "Выдача разрешений на строительство, реконструкцию объектов капитального строительства")
@Version("0.3")
public class Service36400090Controller extends AbstractServiceOrderControllerEDS24<Service36400090Form> {
    /**
     * id Выдача разрешений на строительство, реконструкцию объектов капитального строительства
     */
    public static final int SERVICE_ID = 36400090;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400090FormValidator validator;

    public Service36400090Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения об уполномоченном представителе",
                "Сведения о заявителе",
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
        if (binder.getTarget() instanceof Service36400090Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400090Form createNewForm() {
        return new Service36400090Form();
    }

    // сценарий 1
    // При деактивированном incapable_enable и деактивированном dov_enable
    private boolean isScenario1(Service36400090Form form) {
        return "1".equals(form.getApplType()) &&
                "off".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 2
    // При деактивированном incapable_enable и активированном dov_enable
    private boolean isScenario2(Service36400090Form form) {
        return "1".equals(form.getApplType()) &&
                "on".equalsIgnoreCase(form.getDov_enable());
    }

    // сценарий 3
    // При активированном incapable_enable и деактивированном dov_enable
    private boolean isScenario3(Service36400090Form form) {
        if (form.getDovUlType() == null) return false;
        return "2".equals(form.getApplType()) &&
                "1".equals(form.getDovUlType());
    }

    // сценарий 4
    // При выборе "Опекун" или "Попечитель" и деактивированном dov_enable
    private boolean isScenario4(Service36400090Form form) {
        if (form.getDovUlType() == null) return false;
        return "2".equals(form.getApplType()) &&
                "2".equals(form.getDovUlType());
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400090Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step3_2 = "step3-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";
        String step3_6 = "step3-6.html";
        String step3_7 = "step3-7.html";


        if (stepProcessingResult.getStepNum() == 2) {
            // step 2 copy
            if (isScenario1(form))
                stepProcessingResult.setStepNum(3);
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
            if (isScenario1(form))
                return new StepProcessingResult(3, step3_2);
            if (isScenario2(form))
                return new StepProcessingResult(3, step3_6);
            if (isScenario3(form))
                return new StepProcessingResult(3, step3_7);
            if (isScenario4(form))
                return new StepProcessingResult(3, step3_7);
            // /step 3 copy
            if (!goback)
                stepProcessingResult.setStepNum(4);
            if (goback) {
                // step 2 copy
                if (isScenario1(form))
                    stepProcessingResult.setStepNum(3);
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
    protected Map<String, Object> formToMap(Service36400090Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);

        if (isScenario1(form)) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            decoratedFormAsMap.remove("dovWarrant");
            decoratedFormAsMap.remove("warrantPlace");
            decoratedFormAsMap.remove("warrantDate");
            decoratedFormAsMap.remove("warrantSeria");
            decoratedFormAsMap.remove("warrantNo");
            decoratedFormAsMap.remove("dovLastName");
            decoratedFormAsMap.remove("dovFirstName");
            decoratedFormAsMap.remove("dovMiddleName");
            decoratedFormAsMap.remove("dovIdentityDocType");
            decoratedFormAsMap.remove("dovPassSeria");
            decoratedFormAsMap.remove("dovPassNo");
            decoratedFormAsMap.remove("dovPassDate");
            decoratedFormAsMap.remove("dovPassFrom");
        }

        if (isScenario2(form)) {

        }

        if (isScenario3(form)) {
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.remove("dovWarrant");
            decoratedFormAsMap.remove("warrantPlace");
            decoratedFormAsMap.remove("warrantDate");
            decoratedFormAsMap.remove("warrantSeria");
            decoratedFormAsMap.remove("warrantNo");
        }

        if (isScenario4(form)) {
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
        }

        if (form.getApplType().equals("1")) {
            decoratedFormAsMap.clearFileLoadField("dovUlNonDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovUlDovLoad");
            decoratedFormAsMap.remove("dovUlType");
            decoratedFormAsMap.remove("org_FullTitle");
            decoratedFormAsMap.remove("org_opf");
            decoratedFormAsMap.remove("org_SmallTitle");
            decoratedFormAsMap.remove("org_phone");
            decoratedFormAsMap.remove("org_fax");
            decoratedFormAsMap.remove("org_email");
            decoratedFormAsMap.remove("org_InnUl");
            decoratedFormAsMap.remove("org_OgrnUl");
        }

        if (form.getApplType().equals("2")) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.remove("dov_enable");
            decoratedFormAsMap.remove("identityDocType");
            decoratedFormAsMap.remove("otherDocTypeName");
            decoratedFormAsMap.remove("passSeria");
            decoratedFormAsMap.remove("passNo");
            decoratedFormAsMap.remove("passDate");
            decoratedFormAsMap.remove("passFrom");
            decoratedFormAsMap.clearFileLoadField("identityDocLoad");
        }

        // TODO: очистка адресных блоков?

        if (form.getIdentityDocType().equals("5"))
            formAsMap.put("identityDocType", form.getOtherDocTypeName());

        if (form.getDovIdentityDocType().equals("5"))
            formAsMap.put("dovIdentityDocType", form.getDovOtherDocTypeName());

        return formAsMap;
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400090Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        // на шаге 2 есть только одна страница с всегда заполненными из ЛК полями
        if (stepProcessingResult.getStepNum() == 2 && form.getRepresentativeStatusChanged()) {
            if (isScenario1(form))
                form.fillApplicantAttributesWithPrivateRoomData(privateRoomDataContainer);
            if (isScenario2(form))
                form.clearApplicantAttributes();

            form.setRepresentativeStatusChanged(false);
        }
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400090Form form, Map<String, Object> model) {

        return Arrays.asList(
                "accreditationDocLoad",
                "agreeDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovUlDovLoad",
                "dovUlNonDovLoad",
                "expertDocLoad",
                "identityDocLoad",
                "materialDocLoad",
                "planDocLoad",
                "pravoDocLoad",
                "resolutionDocLoad"
        );
    }


}