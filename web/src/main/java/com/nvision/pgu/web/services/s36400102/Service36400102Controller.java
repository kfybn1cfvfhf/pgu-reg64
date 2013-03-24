package com.nvision.pgu.web.services.s36400102;

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
@RequestMapping("/services/s" + Service36400102Controller.SERVICE_ID)
@ServiceController(id = Service36400102Controller.SERVICE_ID, title = "Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам")
@Version("2.4")

public class Service36400102Controller extends AbstractServiceOrderControllerEDS24<Service36400102Form> {
    /**
     * id Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам
     */
    public static final int SERVICE_ID = 36400102;


    @Autowired
    private Service36400102FormValidator validator;

    public Service36400102Controller() {
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о лице, нуждающемся в государственной услуге",
				"Сведения о запрашиваемой услуге",
				"Сведения о запрашиваемой услуге",
				"Электронные копии документов"
            );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400102Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400102Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if ((form.getDov_enable_changed().booleanValue() || form.getIncapable_enable_changed().booleanValue())) {
            if (stepProcessingResult.getStepNum() == 2 && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }
            form.setDov_enable_changed(false);
            form.setIncapable_enable_changed(false);
        }
    }

    @Override
 	protected Service36400102Form createNewForm() {
 		return new Service36400102Form();
 	}

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400102Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
        if (goback) {
          switch(stepProcessingResult.getStepNum()) {
            case 5:
                if ("2".equals(form.getGoalRef())) {
                    stepProcessingResult.setStepNum(5);
                } else {
                    stepProcessingResult.setStepNum(4);
                }
                break;
            case 3:
                if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                    stepProcessingResult.setStepNum(3);
                    break;
                }
            case 2:
                stepProcessingResult.setStepNum(2);
                break;
          }
        }

        switch (stepProcessingResult.getStepNum()) {

            case 2:
                if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                    // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2fisnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2opeknondov.html");
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) { //по доверенности
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                    }
                }
                break;
            case 3:
                if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                    stepProcessingResult = new StepProcessingResult(3,"step3.html");
                    break;
                }
            case 4:
                stepProcessingResult = new StepProcessingResult(4,"step4.html");
                break;
            case 5:
                if ("2".equals(form.getGoalRef())) {
                    stepProcessingResult = new StepProcessingResult(5,"step5.html");
                    break;
                }
            case 6:
                stepProcessingResult = new StepProcessingResult(6,"step6.html");
                break;
        }

        return stepProcessingResult;
    }

    private void clearDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");

    }

    private void clearOpekFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovOpekLoad");
        FAM.remove("recipientLastName");
        FAM.remove("recipientFirstName");
        FAM.remove("recipientMiddleName");
        FAM.remove("recipientSnils");
    }

    private void clearNotReference(FormAsMap FAM) {
        FAM.remove("fam1LastName");
        FAM.remove("fam1FirstName");
        FAM.remove("fam1MiddleName");
        FAM.remove("socSupport");
    }

    @Override
    protected Map<String, Object> formToMap(Service36400102Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        }

        if (!"2".equals(form.getGoalRef())) {
            clearNotReference(decoratedFormAsMap);
        }

        if("off".equalsIgnoreCase(form.getDov_enable())) {      // Без доверенности
            clearDovFields(decoratedFormAsMap);
        }

        if("off".equalsIgnoreCase(form.getIncapable_enable())) {                // Физик
            clearOpekFields(decoratedFormAsMap);
        }
        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400102Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovOpekLoad",
        "sostavDocLoad",
        "familyDocLoad",
        "agree1DocLoad",
        "socDocLoad"
        );
    }


}