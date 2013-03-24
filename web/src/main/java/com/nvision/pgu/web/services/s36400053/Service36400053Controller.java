package com.nvision.pgu.web.services.s36400053;

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
@RequestMapping("/services/s" + Service36400053Controller.SERVICE_ID)
@ServiceController(id = Service36400053Controller.SERVICE_ID, title = "Организация отдыха и оздоровления детей, находящихся в трудной жизненной ситуации, проживающих на территории Саратовской области")
@Version("0.3")
public class Service36400053Controller extends AbstractServiceOrderControllerEDS24<Service36400053Form> {
    /**
     * id Организация отдыха и оздоровления детей, находящихся в трудной жизненной ситуации, проживающих на территории Саратовской области
     */
    public static final int SERVICE_ID = 36400053;


    @Autowired
    private Service36400053FormValidator validator;

    public Service36400053Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Тип заявителя",
                "Сведения о заявителе и получателе услуги",
                "Условия получения денежной выплаты",
                "Сведения о совместно проживающих",
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
 		if (binder.getTarget() instanceof Service36400053Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400053Form createNewForm() {
 		return new Service36400053Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400053Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2) {

            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                form.clearApplicantAttributes();
            } else {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }

            form.setDov_enable_changed(false);
            //getDicRegistry().getItemByKey()
        }

    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400053Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);


        if (stepProcessingResult.getStepNum() == 2) {
            if ("on".equalsIgnoreCase(form.getDov_enable())) {
                stepProcessingResult = new StepProcessingResult(2, "step2-2.html");
            } else {
                stepProcessingResult = new StepProcessingResult(2, "step2-1.html");
            }
        }


        return stepProcessingResult;
    }


    @Override
    protected Map<String, Object> formToMap(Service36400053Form form) { // вызывается только перед формированием SOAP-запроса в ведомство
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);
        decoratedFormAsMap.clearForOrdering();

        // Очистка полей
        if("3".equals(form.getApplChild())) {
            decoratedFormAsMap.remove("applCategory");
            decoratedFormAsMap.remove("birthdateAppl");
            decoratedFormAsMap.remove("placeJob");
        }
        if("1".equals(form.getApplChild()) || "2".equals(form.getApplChild())) {
            decoratedFormAsMap.remove("guardianLabel");
            decoratedFormAsMap.remove("guardianDocNote");
            decoratedFormAsMap.clearFileLoadField("dovOpekLoad");
            decoratedFormAsMap.clearFileLoadField("guardianDocMoneyLoad");
        }
        if("1".equals(form.getRecipientStatus()) || "3".equals(form.getRecipientStatus()) || "5".equals(form.getRecipientStatus())) {
            decoratedFormAsMap.remove("recipientStatusDocNote");
        }
        if(!"6".equals(form.getRecipientStatus())) {
            decoratedFormAsMap.clearFileLoadField("recipientDangerDocLoad");
        }
        if(!"2".equals(form.getRecipientStatus())) {
            decoratedFormAsMap.clearFileLoadField("recipientWarDocLoad");
        }
        if(!"7".equals(form.getRecipientStatus())) {
            decoratedFormAsMap.clearFileLoadField("recipientProvisionDocLoad");
        }
        if(!"4".equals(form.getRecipientStatus())) {
            decoratedFormAsMap.clearFileLoadField("recipientInvalidDocLoad");
        }
        if(!"5".equals(form.getRecipientIdentityDocType())) {
            decoratedFormAsMap.remove("recipientOtherDocTypeName");
        }

        // ДУЛ: другой документ
        if ("5".equals(form.getIdentityDocType())) {
            formAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            formAsMap.put("identityDocType", form.getIdentityDocType());
            decoratedFormAsMap.remove("otherDocTypeName");
        }

        // ДУЛ: другой документ
        if ("5".equals(form.getRecipientIdentityDocType())) {
            formAsMap.put("recipientIdentityDocType", form.getRecipientOtherDocTypeName());
        } else {
            formAsMap.put("recipientIdentityDocType", form.getRecipientIdentityDocType());
            decoratedFormAsMap.remove("recipientOtherDocTypeName");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400053Form form, Map<String, Object> model) {
        return Arrays.asList(
                "identityDocLoad",
                "dovOpekLoad",
                "guardianDocMoneyLoad",
                "dovDovLoad",
                "dovPasLoad",
                "identityDocLoad",
                "dovOpekLoad",
                "guardianDocMoneyLoad",
                "recipientDangerDocLoad",
                "recipientWarDocLoad",
                "recipientProvisionDocLoad",
                "recipientInvalidDocLoad",
                "recipientIdentityDocLoad",
                "familyRentDocLoad",
                "familyPensionDocLoad"
        );
    }

}