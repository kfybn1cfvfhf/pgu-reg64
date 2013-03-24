package com.nvision.pgu.web.services.s36400171;

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
 * @author aleksisha   1
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400171Controller.SERVICE_ID)
@ServiceController(id = Service36400171Controller.SERVICE_ID, title = "Присвоение звания «Ветеран труда»")
@Version("2.0")
public class Service36400171Controller extends AbstractServiceOrderControllerEDS24<Service36400171Form> {
    /**
     * id Присвоение звания «Ветеран труда»
     */
    public static final int SERVICE_ID = 36400171;


    @Autowired
    private Service36400171FormValidator validator;

    public Service36400171Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о лице, нуждающемся в государственной услуге",
				"Сведения о запрашиваемой услуге"
            );
        setStepList(stepList);
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400171Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
    super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getIncapable_enable_changed())) {
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }
        form.setDov_enable_changed(false);
        form.setIncapable_enable_changed(false);
    }
    }


    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400171Form form, boolean goback, Map<String, Object> model) {
           StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

            if(stepProcessingResult.getStepNum() == 2) {
                if("off".equalsIgnoreCase(form.getDov_enable())) {
                    if("on".equalsIgnoreCase(form.getIncapable_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2opeknodov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2nodov.html");
                    }
                } else {
                    if("on".equalsIgnoreCase(form.getIncapable_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2dov.html");
                    }
                }
            }

            if(stepProcessingResult.getStepNum() == 3) {
                if(!goback) {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                        // Если один из них выключен, обход 3-его шага
                        stepProcessingResult.setStepNum(4);
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                        // Если нужен обход третьего шага
                        // (код скопирован вслепую)
                        if("off".equalsIgnoreCase(form.getDov_enable())) {
                            if("on".equalsIgnoreCase(form.getIncapable_enable())) {
                                stepProcessingResult = new StepProcessingResult(2, "step2opeknodov.html");
                            } else {
                                stepProcessingResult = new StepProcessingResult(2, "step2nodov.html");
                            }
                        } else {
                            if("on".equalsIgnoreCase(form.getIncapable_enable())) {
                                stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                            } else {
                                stepProcessingResult = new StepProcessingResult(2, "step2dov.html");
                            }
                        }
                    }
                }
            }

        return stepProcessingResult;
    }


    private void clear3step(FormAsMap FAM) {
        FAM.remove("recipientLastName");
        FAM.remove("recipientFirstName");
        FAM.remove("recipientMiddleName");
        FAM.remove("recipientBirthDate");
        FAM.remove("recipientFactAddress");
        FAM.remove("recipientAddress");
        FAM.remove("recipientAddressEq");
        FAM.remove("recipientAddressPost");
        FAM.remove("recipientPhone");
        FAM.remove("recipientEmail");
        FAM.remove("recipientPassSeria");
        FAM.remove("recipientPassNo");
        FAM.remove("recipientPassDate");
        FAM.remove("recipientPassFrom");
        FAM.clearFileLoadField("recipientIdentityDocLoad");
    }

    @Override
    protected Map<String, Object> formToMap(Service36400171Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

       decoratedFormAsMap.clearForOrdering();
        if("off".equalsIgnoreCase(form.getIncapable_enable())) {
            // Очистка всего 3-го шага при обходе
            clear3step(decoratedFormAsMap);
        }

        if("off".equalsIgnoreCase(form.getDov_enable())) {
            if("on".equalsIgnoreCase(form.getIncapable_enable())) {
                decoratedFormAsMap.clearFileLoadField("dovDovLoad");
                decoratedFormAsMap.clearFileLoadField("dovPasLoad");
            } else {
                decoratedFormAsMap.clearFileLoadField("dovDovLoad");
                decoratedFormAsMap.clearFileLoadField("dovPasLoad");
                decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
            }
        } else {
            if("on".equalsIgnoreCase(form.getIncapable_enable())) {

            } else {
                decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
            }
        }

       return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400171Form form, Map<String, Object> model) {

        return Arrays.asList(
            "dovDovLoad",
            "dovPasLoad",
            "identityDocLoad",
            "dovOpekLoad",
            "recipientIdentityDocLoad",
"rewardingCertificateLoad",
"experienceCertificateLoad",
"workActivityLoad",
"employmentHistoryLoad"
        );

    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400171Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400171Form createNewForm() {
 		return new Service36400171Form();
 	}

}