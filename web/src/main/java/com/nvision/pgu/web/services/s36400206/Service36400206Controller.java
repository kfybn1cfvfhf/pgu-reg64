package com.nvision.pgu.web.services.s36400206;

import com.nvision.pgu.core.annotations.ServiceController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400206Controller.SERVICE_ID)
@ServiceController(id = Service36400206Controller.SERVICE_ID, title = "Возмещение реабилитированным лицам расходов на установку телефона в пределах установленного тарифа")
@Version("2.1")
public class Service36400206Controller extends AbstractServiceOrderControllerEDS24<Service36400206Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400206Controller.class);
    /**
     * id Получение субсидий на поддержку элитного семеноводства
     */
    public static final int SERVICE_ID = 36400206;
    public static String region = "";
    public static final String XML_PREFIX = "req";


    @Autowired
    private Service36400206FormValidator validator;

    public Service36400206Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе",
                "Сведения о лице, нуждающемся в государственной услуге",
                "Сведения о запрашиваемой услуге",
                "Электронные копии документов"
        );
        setStepList(stepList);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400206Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && form.getDov_enable_changed().booleanValue()) {

            if ("off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
        }
    }

    // сценарий 1
    private boolean isScenario1(Service36400206Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 2
    private boolean isScenario2(Service36400206Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "off".equalsIgnoreCase(form.getIncapable_enable());
    }

    // сценарий 3
    private boolean isScenario3(Service36400206Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                "1".equals(form.getDovCategory());
    }

    // сценарий 4
    private boolean isScenario4(Service36400206Form form) {
        return "off".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                ("2".equals(form.getDovCategory()) || "3".equals(form.getDovCategory()));
    }

    // сценарий 5
    private boolean isScenario5(Service36400206Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                "1".equals(form.getDovCategory());
    }

    // сценарий 6
    private boolean isScenario6(Service36400206Form form) {
        return "on".equalsIgnoreCase(form.getDov_enable()) &&
                "on".equalsIgnoreCase(form.getIncapable_enable()) &&
                ("2".equals(form.getDovCategory()) || "3".equals(form.getDovCategory()));
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400206Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        String step2_2 = "step2-2.html";
        String step2_3 = "step2-3.html";
        String step2_4 = "step2-4.html";
        String step2_5 = "step2-5.html";

        // шаг 2 (2,3,4,5)
        if (stepProcessingResult.getStepNum() == 2) {
            if (!goback) {
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
            }
        }

        // шаг 3 (6)
        if (stepProcessingResult.getStepNum() == 3) {
            if (!goback) {
                if (isScenario1(form) || isScenario2(form))
                    stepProcessingResult.setStepNum(4);
            }
            if (goback) {
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
            }
        }

        return stepProcessingResult;
    }


    @Override
    protected Map<String, Object> formToMap(Service36400206Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap = new FormAsMapImpl(formAsMap);


        if ("off".equalsIgnoreCase(form.getIncapable_enable())) {
            decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
            decoratedFormAsMap.remove("recipientLastName");
            decoratedFormAsMap.remove("recipientFirstName");
            decoratedFormAsMap.remove("recipientMiddleName");
            decoratedFormAsMap.remove("recipientaddress");
            decoratedFormAsMap.remove("recipientfactAddress");
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
        }

        if ("off".equalsIgnoreCase(form.getDov_enable())) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if ("2".equalsIgnoreCase(form.getWayBenefit())) {
            decoratedFormAsMap.remove("addressBenefit");
        }

        if ("1".equalsIgnoreCase(form.getWayBenefit())) {
            decoratedFormAsMap.remove("nameBankBenefit");
            decoratedFormAsMap.remove("filialBankBenefit");
            decoratedFormAsMap.remove("bikBankBenefit");
            decoratedFormAsMap.remove("corrAccBankBenefit");
            decoratedFormAsMap.remove("codeFilialBankBenefit");
            decoratedFormAsMap.remove("clientAccBankBenefit");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400206Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "dovOpekLoad",
                "recipientIdentityDocLoad",
                "spravReabilDocLoad",
                "oplatTelefDocLoad"
        );
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400206Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400206Form createNewForm() {
        return new Service36400206Form();
    }

}