package com.nvision.pgu.web.services.s36400219;

import com.nvision.pgu.core.annotations.ServiceController;
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
@RequestMapping("/services/s" + Service36400219Controller.SERVICE_ID)
@ServiceController(id = Service36400219Controller.SERVICE_ID, title = "Назначение единовременного пособия при всех формах устройства детей-сирот и детей, оставшихся без попечения родителей, в семью")
@Version("2.3")
public class Service36400219Controller extends AbstractServiceOrderControllerEDS24<Service36400219Form> {
    /**
     * id Назначение единовременного пособия при всех формах устройства детей-сирот и детей, оставшихся без попечения родителей, в семью
     */
    public static final int SERVICE_ID = 36400219;


    @Autowired
    private Service36400219FormValidator validator;

    public Service36400219Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения об уполномоченном представителе",
                "Сведения о заявителе",
                "Сведения о банковских реквизитах заявителя",
                "Сведения о ребенке (детях) переданных на воспитание в семью",
                "Электронные копии документов"
        );
        setStepList(stepList);
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400219Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (stepProcessingResult.getStepNum() == 2) {
            if (!form.getStat_zayav().contains("3") && "on".equalsIgnoreCase(form.getDov_enable())) {

                stepProcessingResult = new StepProcessingResult(2, "step2Dov.html");
            } else {
                stepProcessingResult = new StepProcessingResult(3, "step3NoDov.html");
            }
        }
        if (stepProcessingResult.getStepNum() == 3) {
            if (goback) {
                if (!form.getStat_zayav().contains("3") && "on".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2Dov.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(1, "step1.html");
                }
            } else {
                if (!form.getStat_zayav().contains("3") && "on".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(3, "step3Dov.html");
                }
            }
        }


        return stepProcessingResult;
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400219Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 3) {

            if (!form.getStat_zayav().contains("3") && "on".equalsIgnoreCase(form.getDov_enable())) {
                form.clearApplicantAttributes();
            } else {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }

        }
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400219Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400219Form createNewForm() {
        return new Service36400219Form();
    }

    @Override
    protected Map<String, Object> formToMap(Service36400219Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);


        if(form.getStat_zayav().equals("3")) {
            decoratedFormAsMap.remove("dov_enable");
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.remove("dovLastName");
            decoratedFormAsMap.remove("dovFirstName");
            decoratedFormAsMap.remove("dovMiddleName");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if(form.getDov_enable().equalsIgnoreCase("off")) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.remove("dovLastName");
            decoratedFormAsMap.remove("dovFirstName");
            decoratedFormAsMap.remove("dovMiddleName");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if(form.getStat_child().equals("1") || form.getStat_child().equals("2")) {
            decoratedFormAsMap.clearFileLoadField("usinDocLoad");
            decoratedFormAsMap.clearFileLoadField("priemSDocLoad");
        }

        if(form.getStat_child().equals("3")) {
            decoratedFormAsMap.clearFileLoadField("opecDocLoad");
            decoratedFormAsMap.clearFileLoadField("priemSDocLoad");
        }

        if(form.getStat_child().equals("4")) {
            decoratedFormAsMap.clearFileLoadField("opecDocLoad");
            decoratedFormAsMap.clearFileLoadField("usinDocLoad");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400219Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
                "vospitDocLoad",
                "sberKnigDocLoad"

        );
    }

}