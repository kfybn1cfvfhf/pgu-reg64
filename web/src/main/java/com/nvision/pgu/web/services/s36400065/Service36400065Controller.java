package com.nvision.pgu.web.services.s36400065;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
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
@RequestMapping("/services/s" + Service36400065Controller.SERVICE_ID)
@ServiceController(id = Service36400065Controller.SERVICE_ID, title = "Выплата ежемесячной денежной выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан в Саратовской области")
@Version("1.7")

public class Service36400065Controller extends AbstractServiceOrderControllerEDS24<Service36400065Form> {
    /**
     * id Выплата ежемесячной денежной выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан в Саратовской области
     */
    public static final int SERVICE_ID = 36400065;


    @Autowired
    private Service36400065FormValidator validator;

    public Service36400065Controller() {
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
 		if (binder.getTarget() instanceof Service36400065Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400065Form createNewForm() {
 		return new Service36400065Form();
 	}

    @Override
    public void applyInitRules(Service36400065Form form) throws RuleException {
        form.setCentralHeating("1");
        form.setRightRegister("1");
        form.setOldHousing("1");
        form.setAddressSettlementType("1");
        form.setFactAddressSettlementType("1");
        form.setAddressPostSettlementType("1");
        form.setRecipientaddressSettlementType("1");
        form.setAddressPostSettlementTypeBenefit("1");
    }

        @Override
    protected void patchModelAndFormOnStepProcessing(Service36400065Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400065Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
        if (goback) {
            switch(stepProcessingResult.getStepNum()) {
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
                        stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opeknondov.html");
                        }
                    }
                } else {
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) { //по доверенности
                        // Физик
                        stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2opekdov.html");
                        }
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
        }

        return stepProcessingResult;
    }

    private void clearDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");
    }

    private void clearOpekPopechFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovOpekLoad");
    }

    private void clearNonFisFields(FormAsMap FAM) {
        FAM.remove("recipientLastName");
        FAM.remove("recipientFirstName");
        FAM.remove("recipientMiddleName");
        FAM.remove("recipientpoliticalNationality");
        FAM.remove("recipientaddressIndex");
        FAM.remove("recipientaddressCountry");
        FAM.remove("recipientaddressEnterType");
        FAM.remove("recipientaddressRegion");
        FAM.remove("recipientaddressRayon");
        FAM.remove("recipientaddressSettlementType");
        FAM.remove("recipientaddressCity");
        FAM.remove("recipientaddressSettlementText");
        FAM.remove("recipientaddressSettlementDict");
        FAM.remove("recipientaddressStreetText");
        FAM.remove("recipientaddressStreetDict");
        FAM.remove("recipientaddressHouse");
        FAM.remove("recipientaddressKorpus");
        FAM.remove("recipientaddressFlat");
        FAM.remove("recipientIdentityDocType");
        FAM.remove("recipientOtherDocTypeName");
        FAM.remove("recipientPassSeria");
        FAM.remove("recipientPassNo");
        FAM.remove("recipientPassDate");
        FAM.remove("recipientPassFrom");
        FAM.clearFileLoadField("recipientIdentityDocLoad");
    }

    private void clearPersonFields (FormAsMap FAM) {}

    @Override
    protected Map<String, Object> formToMap(Service36400065Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

/*        if ("1".equals(form.getCentralHeating())) {
            decoratedFormAsMap.put("centralHeating", "Имеется");
        } else {
            decoratedFormAsMap.put("centralHeating", "Отсутствует");
        }

        if ("1".equals(form.getCentralHeating())) {
            decoratedFormAsMap.put("rightRegister", "Зарегистрировано");
        } else {
            decoratedFormAsMap.put("rightRegister", "Не зарегистрировано");
        }

        if ("1".equals(form.getCentralHeating())) {
            decoratedFormAsMap.put("oldHousing", "Относится");
        } else {
            decoratedFormAsMap.put("oldHousing", "Не относится");
        }*/

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("identityDocType", form.getIdentityDocType());
        }
        decoratedFormAsMap.remove("otherDocTypeName");

        if ("5".equals(form.getRecipientIdentityDocType())) {
            formAsMap.put("recipientIdentityDocType", form.getRecipientOtherDocTypeName());
        } else {
            formAsMap.put("recipientIdentityDocType", form.getRecipientIdentityDocType());
        }
        decoratedFormAsMap.remove("recipientOtherDocTypeName");

        if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
            clearDovFields(decoratedFormAsMap);
        }
        if("off".equalsIgnoreCase(form.getIncapable_enable())) {
            clearNonFisFields(decoratedFormAsMap);                // Физик
            clearOpekPopechFields(decoratedFormAsMap);
            decoratedFormAsMap.remove("dovCategory");
        } else {
            if (!"1".equals(form.getDovCategory())) {             //не родитель
                clearPersonFields(decoratedFormAsMap);
            } else {
                clearOpekPopechFields(decoratedFormAsMap);
            }
        }
        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400065Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovOpekLoad",
        "recipientIdentityDocLoad",
        "registrationCertificateLoad",
        "identitySingleSampleLoad",
        "disabilityDocLoad",
        "birthCertificateLoad",
        "medicalCommissionLoad",
        "houseBookLoad",
        "technicalCertificateLoad",
        "oldContractPrivatizationLoad",
        "oldLeaseAgreementLoad",
        "contractPrivatizationLoad",
        "leaseAgreementLoad"
        );
    }


}