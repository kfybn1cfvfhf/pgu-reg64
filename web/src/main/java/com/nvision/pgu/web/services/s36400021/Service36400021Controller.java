package com.nvision.pgu.web.services.s36400021;

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
@RequestMapping("/services/s" + Service36400021Controller.SERVICE_ID)
@ServiceController(id = Service36400021Controller.SERVICE_ID, title = "Принятие на учет граждан в качестве нуждающихся в жилых помещениях в целях предоставлении жилых помещений муниципального жилищного фонда по договорам социального найма")
@Version("1.7")

public class Service36400021Controller extends AbstractServiceOrderControllerEDS24<Service36400021Form> {
    /**
     * id Принятие на учет граждан в качестве нуждающихся в жилых помещениях в целях предоставлении жилых помещений муниципального жилищного фонда по договорам социального найма
     */
    public static final int SERVICE_ID = 36400021;


    @Autowired
    private Service36400021FormValidator validator;

    public Service36400021Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о законном представителе",
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
 		if (binder.getTarget() instanceof Service36400021Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400021Form createNewForm() {
 		return new Service36400021Form();
 	}

    @Override
    public void applyInitRules(Service36400021Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setAddressPostSettlementType("1");
        form.setRecipientaddressSettlementType("1");
    }


    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400021Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if ((form.getDov_enable_changed().booleanValue() || form.getIncapable_enable_changed().booleanValue())) {
            if (stepProcessingResult.getStepNum() == 2 && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }
            if (stepProcessingResult.getStepNum() == 3 && "on".equalsIgnoreCase(form.getDov_enable())) {
                form.clearApplicantAttributes();
            }
            form.setDov_enable_changed(false);
            form.setIncapable_enable_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400021Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
        if (goback) {
            if ("off".equalsIgnoreCase(form.getDov_enable())) {
                switch(stepProcessingResult.getStepNum()) {
                    case 4:
                        if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                            stepProcessingResult.setStepNum(3);
                            break;
                        }
                    case 3:
                        stepProcessingResult.setStepNum(2);
                        break;
                }
            } else {
                switch(stepProcessingResult.getStepNum()) {
                    case 4:
                        if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                            stepProcessingResult.setStepNum(4);
                            break;
                        }
                    case 3:
                        stepProcessingResult.setStepNum(2);
                        break;
                }

            }
        }
        if ("off".equalsIgnoreCase(form.getDov_enable())) {
            switch (stepProcessingResult.getStepNum()) {
                case 2:
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
                    break;
                case 3:
                    if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                        stepProcessingResult = new StepProcessingResult(4,"step4.html");
                        break;
                    }
                case 5:
                    stepProcessingResult = new StepProcessingResult(5,"step5.html");
            }
        } else {
            switch (stepProcessingResult.getStepNum()) {
                case 2:
                    if("off".equalsIgnoreCase(form.getIncapable_enable())) { //по доверенности
                        // Физик
                        stepProcessingResult = new StepProcessingResult(3, "step3persdov.html");
                    } else {
                        if ("1".equals(form.getDovCategory())) {             //родитель
                            stepProcessingResult = new StepProcessingResult(3, "step3persdov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(3, "step3opekdov.html");
                        }
                    }
                    break;
                case 4:
                    if ("on".equalsIgnoreCase(form.getIncapable_enable())) {
                        stepProcessingResult = new StepProcessingResult(4,"step4.html");
                        break;
                    }
                case 5: stepProcessingResult = new StepProcessingResult(5, "step5.html"); break;
            }
        }
        return stepProcessingResult;
    }

    private void clearDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");
    }

    private void clearOpekFields(FormAsMap FAM) {
        FAM.remove("recipientLastName");
        FAM.remove("recipientFirstName");
        FAM.remove("recipientMiddleName");
        FAM.remove("recipientBirthdate");
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

    private void clearPersonFields (FormAsMap FAM) {
        FAM.remove("politicalNationality");
    }

    private void clearNonPersonParentFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovOpekLoad");
    }

    @Override
    protected Map<String, Object> formToMap(Service36400021Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

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
            clearOpekFields(decoratedFormAsMap);                // Физик
            decoratedFormAsMap.remove("dovCategory");
            clearNonPersonParentFields(decoratedFormAsMap);
        } else {
            if (!"1".equals(form.getDovCategory())) {             //опекун-попечитель
                clearPersonFields(decoratedFormAsMap);
            } else {
                clearNonPersonParentFields(decoratedFormAsMap);
            }
        }
        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400021Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovOpekLoad",
        "recipientIdentityDocLoad",
        "idDocumentFamilyLoad",
        "kinshipLoad",
        "birthCertificateLoad",
        "houseBookLoad",
        "declarationIncomeLoad",
        "personalIncomeLoad",
        "otherIncomeLoad",
        "realEstateLoad",
        "priceMotorLoad",
        "certificateInsuranceLoad",
        "technicalInventoryLoad",
        "rightHousingLoad",
        "extractLoad",
        "imputedIncomeLoad",
        "socialPaymentsLoad",
        "semploymentServicesLoad",
        "socialAssistanceLoad",
        "transportDocLoad",
        "inventCostEastLoad",
        "cadastrCostZemLoad",
        "vipIzEGRPLoad"
        );
    }

}