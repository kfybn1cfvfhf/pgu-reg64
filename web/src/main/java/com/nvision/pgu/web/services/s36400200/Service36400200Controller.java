package com.nvision.pgu.web.services.s36400200;

import com.nvision.pgu.core.annotations.ServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.controllers.blocks.AbstractServiceOrderControllerEDS24;
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
@RequestMapping("/services/s" + Service36400200Controller.SERVICE_ID)
@ServiceController(id = Service36400200Controller.SERVICE_ID, title = "Прием заявлений, постановка на учет и предоставление информации об организации оказания специализированной медицинской помощи в специализированных медицинских учреждениях")
@Version("0.2")
public class Service36400200Controller extends AbstractServiceOrderControllerEDS24<Service36400200Form> {
    /**
     * id Прием заявлений, постановка на учет и предоставление информации об организации оказания специализированной медицинской помощи в специализированных медицинских учреждениях
     */
    public static final int SERVICE_ID = 36400200;


    @Autowired
    private Service36400200FormValidator validator;

    public Service36400200Controller() {
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
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400200Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400200Form createNewForm() {
 		return new Service36400200Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400200Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400200Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        // При активированном incapable_enable
        if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
            // активированном dov_enable
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                // При выборе "Родителя" осуществляется переход на ШАГ 3,6 (ШАГИ 2,4,5 пропускаются)
                if ("1".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                    }
                }
                // При выборе "Опекун" или "Попечитель" осуществляется переход на ШАГ 5,6 (ШАГИ 2,3,4 пропускаются)
                if ("2".equalsIgnoreCase(form.getDovCategory()) || "3".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-5.html");
                    }
                }

            // деактивированном dov_enable
            } else {
                // При выборе "Родителя" осуществляется переход на ШАГ 2,6 (ШАГИ 3,4,5 пропускаются)
                if ("1".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                    }
                }
                // При выборе "Опекун" или "Попечитель" осуществляется переход на ШАГ 4,6 (ШАГИ 2,3,5 пропускаются)
                if ("2".equalsIgnoreCase(form.getDovCategory()) || "3".equalsIgnoreCase(form.getDovCategory())) {
                    if(stepProcessingResult.getStepNum() == 2) {
                        stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                    }
                }
            }

        // При деактивированном incapable_enable
        } else {
            // активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5,6 пропускаются)
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
                    }
                }
            // деактивированном dov_enable  осуществляется переход на ШАГ 2 (ШАГ 3,4,5,6 пропускаются)
            } else {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
                    }
                }
            }
        }

        return stepProcessingResult;
    }

    @Override
       protected Map<String, Object> formToMap(Service36400200Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
           Map<String, Object> formAsMap = super.formToMap(form);
           FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
           decoratedFormAsMap.clearForOrdering();

           // Очистка полей
           if ("off".equals(form.getDov_enable())) {
           decoratedFormAsMap.clearFileLoadField("dovDovLoad");
           decoratedFormAsMap.clearFileLoadField("dovPasLoad");
           }

           if ("off".equals(form.getIncapable_enable())) {
           decoratedFormAsMap.remove("recipientLastName");
           decoratedFormAsMap.remove("recipientFirstName");
           decoratedFormAsMap.remove("recipientMiddleName");
           decoratedFormAsMap.remove("recipientpoliticalNationality");
           decoratedFormAsMap.remove("recipientaddressIndex");
           decoratedFormAsMap.remove("recipientaddressCountry");
           decoratedFormAsMap.remove("recipientaddressEnterType");
           decoratedFormAsMap.remove("recipientaddressRegion");
           decoratedFormAsMap.remove("recipientaddressRayon");
           decoratedFormAsMap.remove("recipientaddressSettlementType");
           decoratedFormAsMap.remove("recipientaddressCity");
           decoratedFormAsMap.remove("recipientaddressSettlementText");
           decoratedFormAsMap.remove("recipientaddressSettlementDict");
           decoratedFormAsMap.remove("recipientaddressStreetText");
           decoratedFormAsMap.remove("recipientaddressStreetDict");
           decoratedFormAsMap.remove("recipientaddressHouse");
           decoratedFormAsMap.remove("recipientaddressKorpus");
           decoratedFormAsMap.remove("recipientaddressFlat");
           decoratedFormAsMap.remove("recipientIdentityDoc");
           decoratedFormAsMap.remove("recipientIentityDocType");
           decoratedFormAsMap.remove("recipientOtherDocTypeName");
           decoratedFormAsMap.remove("recipientPassSeria");
           decoratedFormAsMap.remove("recipientPassNo");
           decoratedFormAsMap.remove("recipientPassDate");
           decoratedFormAsMap.remove("recipientPassFrom");
           decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
           }

           if ("0".equals(form.getDovCategory())) {
           decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
           }

           if ("1".equals(form.getDovCategory())) {
           decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
           }


           return formAsMap;
       }

     @Override
    protected List<String> getFormFieldsWithFiles(Service36400200Form form, Map<String, Object> model) {
        return Arrays.asList(
    "identityDocLoad",
    "dovDovLoad",
    "dovPasLoad",
    "dovOpekLoad",
    "recipientIdentityDocLoad",
    "epicrisisDocLoad"
        );
    }
}