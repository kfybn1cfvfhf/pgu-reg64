package com.nvision.pgu.web.services.s36400236;

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
@RequestMapping("/services/s" + Service36400236Controller.SERVICE_ID)
@ServiceController(id = Service36400236Controller.SERVICE_ID, title = "Предоставление социальных выплат за счет средств областного бюджета на строительство (приобретение) жилья гражданам")
@Version("0.3.1")
public class Service36400236Controller extends AbstractServiceOrderControllerEDS24<Service36400236Form> {
    /**
     * id Предоставление социальных выплат за счет средств областного бюджета на строительство (приобретение) жилья гражданам
     */
    public static final int SERVICE_ID = 36400236;
    @Autowired
    IPrivateRoomDataContainer privateRoomDataContainer;
    @Autowired
    private Service36400236FormValidator validator;

    public Service36400236Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о лице, нуждающемся в государственной услуге",
                "Сведения о членах семьи",
                "Электронные копии документов"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400236Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400236Form createNewForm() {
        return new Service36400236Form();
    }

    // автоочистка полей
    @Override
    protected Map<String, Object> formToMap(Service36400236Form form) {
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
            decoratedFormAsMap.remove("recipientPhone");
            decoratedFormAsMap.remove("recipientEmail");
            decoratedFormAsMap.remove("recipientPostIndex");
            decoratedFormAsMap.remove("recipientPostCountry");
            decoratedFormAsMap.remove("recipientPostEnterType");
            decoratedFormAsMap.remove("recipientPostRegion");
            decoratedFormAsMap.remove("recipientPostRayon");
            decoratedFormAsMap.remove("recipientPostSettlementType");
            decoratedFormAsMap.remove("recipientPostCity");
            decoratedFormAsMap.remove("recipientPostSettlementText");
            decoratedFormAsMap.remove("recipientPostSettlementDict");
            decoratedFormAsMap.remove("recipientPostStreetText");
            decoratedFormAsMap.remove("recipientPostStreetDict");
            decoratedFormAsMap.remove("recipientPostHouse");
            decoratedFormAsMap.remove("recipientPostKorpus");
            decoratedFormAsMap.remove("recipientPostFlat");
            decoratedFormAsMap.remove("recipientPassSeria");
            decoratedFormAsMap.remove("recipientPassNo");
            decoratedFormAsMap.remove("recipientPassDate");
            decoratedFormAsMap.remove("recipientPassFrom");
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
            decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
        }

        if (form.getCatAppl().equals("3") && form.getFamilyCh().equalsIgnoreCase("off")) {
            decoratedFormAsMap.remove("famQuantity");
            decoratedFormAsMap.remove("famlastName");
            decoratedFormAsMap.remove("famfirstName");
            decoratedFormAsMap.remove("fammiddleName");
            decoratedFormAsMap.remove("fambirthdate");
            decoratedFormAsMap.remove("famkin");
            decoratedFormAsMap.clearFileLoadField("famIdentityDocLoad");
            decoratedFormAsMap.remove("add_fam");
            decoratedFormAsMap.clearFileLoadField("sostavDocLoad");
            decoratedFormAsMap.clearFileLoadField("agree1DocLoad");
        }

        if (form.getCatAppl().equals("1") || form.getCatAppl().equals("2")) {
            decoratedFormAsMap.remove("familyCh");
            decoratedFormAsMap.clearFileLoadField("workDocLoad");
        }

        if (form.getDivorceCh().equalsIgnoreCase("off"))
            decoratedFormAsMap.clearFileLoadField("marryDocLoad");

        if (form.getDopPravZhil().equalsIgnoreCase("off"))
            decoratedFormAsMap.clearFileLoadField("dopDocLoad");

        if (form.getEgrpNoCh().equalsIgnoreCase("off"))
            decoratedFormAsMap.clearFileLoadField("pravoDocLoad");

        return formAsMap;
    }

    @Override
    protected void fillModelByForm(Map<String, Object> model, Service36400236Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        model.put("privateRoomData", this.privateRoomDataContainer);
    }

    // сценарий 1
    private boolean isScenario1(Service36400236Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 2
    private boolean isScenario2(Service36400236Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 3
    private boolean isScenario3(Service36400236Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 4
    private boolean isScenario4(Service36400236Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable());
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400236Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step2_2 = "step2-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";

        if (stepProcessingResult.getStepNum() == 2) {
            // s2
            if (!goback) {
                if (isScenario1(form))
                    return new StepProcessingResult(2, step2_2);
                if (isScenario2(form))
                    return new StepProcessingResult(2, step2_3);
                if (isScenario3(form))
                    return new StepProcessingResult(2, step2_4);
                if (isScenario4(form))
                    return new StepProcessingResult(2, step2_5);
                if (goback)
                    stepProcessingResult.setStepNum(1);
            }
            // s2
        }

        // шаг 3 (6)
        if (stepProcessingResult.getStepNum() == 3) {
            // s3
            if (!goback) {
                if (isScenario3(form) || isScenario4(form))
                    return stepProcessingResult;
                if (isScenario1(form) || isScenario2(form))
                    stepProcessingResult.setStepNum(4);
            }
            if (goback) {
                // s2
                if (isScenario1(form))
                    return new StepProcessingResult(2, step2_2);
                if (isScenario2(form))
                    return new StepProcessingResult(2, step2_3);
                if (isScenario3(form))
                    return new StepProcessingResult(2, step2_4);
                if (isScenario4(form))
                    return new StepProcessingResult(2, step2_5);
                if (goback)
                    stepProcessingResult.setStepNum(1);
                // s2
                // s3
            }
        }

        // шаг 4 (7)
        if (stepProcessingResult.getStepNum() == 4) {
            if (!goback) {
                if ("1".equals(form.getCatAppl()) || "2".equals(form.getCatAppl()) || "on".equalsIgnoreCase(form.getFamilyCh()))
                    return stepProcessingResult;
                else
                    stepProcessingResult.setStepNum(5);
            }
            if (goback) {
                // s3
                if (isScenario3(form) || isScenario4(form))
                    stepProcessingResult.setStepNum(3);
                if (isScenario1(form) || isScenario2(form)) {

                    // s2
                    if (isScenario1(form))
                        return new StepProcessingResult(2, step2_2);
                    if (isScenario2(form))
                        return new StepProcessingResult(2, step2_3);
                    if (isScenario3(form))
                        return new StepProcessingResult(2, step2_4);
                    if (isScenario4(form))
                        return new StepProcessingResult(2, step2_5);

                    stepProcessingResult.setStepNum(1);
                }
                // s2
                // s3

            }
        }

        return stepProcessingResult;
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400236Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2) {
            if (isScenario1(form) || isScenario3(form)) {
                form.fillApplicantAttributesWithPrivateRoomData(privateRoomDataContainer);
            }
            if (isScenario2(form) || isScenario4(form)) {
                form.clearApplicantAttributes();
            }
        }
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400236Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovOpekLoad",
                "recipientIdentityDocLoad",
                "famIdentityDocLoad",
                "sostavDocLoad",
                "agree1DocLoad",
                "birthDocLoad",
                "techDocLoad",
                "pravoDocLoad",
                "dopDocLoad",
                "regDocLoad",
                "workDocLoad",
                "incomeDocLoad",
                "marryDocLoad",
                "pravo1DocLoad"
        );
    }

}