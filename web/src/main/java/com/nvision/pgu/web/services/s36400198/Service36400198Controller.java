package com.nvision.pgu.web.services.s36400198;

import com.nvision.pgu.core.annotations.ServiceController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/services/s" + Service36400198Controller.SERVICE_ID)
@ServiceController(id = Service36400198Controller.SERVICE_ID, title = "Выдача справок о составе семьи жителям частных жилых домов")
@Version("1.2")
public class Service36400198Controller extends AbstractServiceOrderControllerEDS24<Service36400198Form> {
    public static final Logger LOGGER = LoggerFactory.getLogger(Service36400198Controller.class);
    /**
     * id Выдача справок о составе семьи жителям частных жилых домов
     */
    public static final int SERVICE_ID = 36400198;
    public static String region = "";
    public static final String XML_PREFIX = "req";


    //@Autowired
    //private Service36400198FormValidator validator;

    public Service36400198Controller() {
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
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		//if (binder.getTarget() instanceof Service36400198Form) {
 		//	super.setValidator(validator);
 		//	binder.setValidator(validator);
 		//}
 	}
	
	@Override
 	protected Service36400198Form createNewForm() {
 		return new Service36400198Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400198Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);
        // 2-1, 2-3
        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getIncapable_enable_changed())) {

            if(("on".equalsIgnoreCase(form.getDov_enable()) && ("on".equalsIgnoreCase(form.getIncapable_enable())))
                || ("on".equalsIgnoreCase(form.getDov_enable()) && ("off".equalsIgnoreCase(form.getIncapable_enable())))) {
                form.clearApplicantAttributes();
            } else {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }

            form.setDov_enable_changed(false);
            form.setIncapable_enable_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400198Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        //При активации отображается ШАГ4,6 (Шаги 2,3,5 скрыты)
        if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
            if(stepProcessingResult.getStepNum() == 2) {
                stepProcessingResult = new StepProcessingResult(2, "step2-3.html");
            }

            // При одновременной активации чекбоксов #dov_enable и #incapable_enable отображается ШАГ5,6 (Шаги 2,3,4 скрыты)
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-4.html");
                }
            }

        } else {

            //При активации отображается ШАГ3 (Шаги 2,4,5,6 скрыты)
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
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
                //При деактивации отображается ШАГ2  (Шаги 3,4,5,6 скрыт)
            } else {
                if(stepProcessingResult.getStepNum() == 2) {
                    stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                }
                if(stepProcessingResult.getStepNum() == 3) {
                    if (!goback) {
                        stepProcessingResult.setStepNum(4);
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
                    }
                }
            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400198Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        /* ДУЛ: другой документ
        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            formAsMap.put("identityDocType", form.getIdentityDocType());
        }*/
        if ("off".equalsIgnoreCase(form.getDov_enable())){
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

            if ("off".equalsIgnoreCase(form.getIncapable_enable())){
            decoratedFormAsMap.clearFileLoadField("recipientIdentityDocLoad");
            decoratedFormAsMap.remove("recipientLastName");
            decoratedFormAsMap.remove("recipientFirstName");
            decoratedFormAsMap.remove("recipientMiddleName");
            decoratedFormAsMap.remove("recipientbirthdate");
            decoratedFormAsMap.remove("recipientaddressCountry");
            decoratedFormAsMap.remove("recipientaddressIndex");
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
            decoratedFormAsMap.remove("recipientPassSeria");
            decoratedFormAsMap.remove("recipientPassNo");
            decoratedFormAsMap.remove("recipientPassDate");
            decoratedFormAsMap.remove("recipientPassFrom");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400198Form form, Map<String, Object> model) {
        return Arrays.asList(
            "identityDocLoad",
            "dovDovLoad",
            "dovPasLoad",
            "dovOpekLoad",
            "recipientIdentityDocLoad",
            "houseBookLoad"
        );
    }

}