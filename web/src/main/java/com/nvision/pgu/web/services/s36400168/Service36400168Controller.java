package com.nvision.pgu.web.services.s36400168;

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
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400168Controller.SERVICE_ID)
@ServiceController(id = Service36400168Controller.SERVICE_ID, title = "Выдача направления гражданину на прохождение МСЭ")
@Version("0.1")
public class Service36400168Controller extends AbstractServiceOrderControllerEDS24<Service36400168Form> {
    /**
     * id Выдача направления гражданину на прохождение МСЭ
     */
    public static final int SERVICE_ID = 36400168;


    @Autowired
    private Service36400168FormValidator validator;

    public Service36400168Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Дополнительные сведения"
            );
        setStepList(stepList);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400168Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400168Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if(stepProcessingResult.getStepNum() == 2) {
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                stepProcessingResult = new StepProcessingResult(2, "step2applicant.html");
            } else {
                stepProcessingResult = new StepProcessingResult(2, "step2representative.html");
            }
        }

        return stepProcessingResult;
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder)
    {
        if (binder.getTarget() instanceof Service36400168Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400168Form createNewForm() {
        return new Service36400168Form();
    }

    @Override
    protected Map<String, Object> formToMap(Service36400168Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Шаг 1 -

        // Шаг 2

        if ("off".equalsIgnoreCase(form.getDov_enable())) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        // Шаг 3 -

        return formAsMap;
    }

    protected List<String> getFormFieldsWithFiles(Service36400168Form form, Map<String, Object> model) {
        return Arrays.asList(
   "identityDocLoad",
    "dovDovLoad",
    "dovPasLoad",
    "polisDocLoad"
        );
    }
}