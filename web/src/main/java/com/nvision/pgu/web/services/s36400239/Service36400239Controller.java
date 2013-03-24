package com.nvision.pgu.web.services.s36400239;

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
@RequestMapping("/services/s" + Service36400239Controller.SERVICE_ID)
@ServiceController(id = Service36400239Controller.SERVICE_ID, title = "Предоставление социальных выплат за счет средств федерального бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений")
@Version("2.0.1")

public class Service36400239Controller extends AbstractServiceOrderControllerEDS24<Service36400239Form> {
    /**
     * id Предоставление социальных выплат за счет средств федерального бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений
     */
    public static final int SERVICE_ID = 36400239;


    @Autowired
    private Service36400239FormValidator validator;

    public Service36400239Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о лице, нуждающемся в государственной услуге",
				"Дополнительные сведения",
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
 		if (binder.getTarget() instanceof Service36400239Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400239Form createNewForm() {
 		return new Service36400239Form();
 	}

    @Override
    public void applyInitRules(Service36400239Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setRecipientaddressSettlementType("1");
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400239Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (form.getDov_enable_changed().booleanValue()) {
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
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400239Form form, boolean goback, Map<String, Object> model) {
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

    @Override
    protected Map<String, Object> formToMap(Service36400239Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if ("off".equalsIgnoreCase(form.getNoEGRP())) {
            decoratedFormAsMap.clearFileLoadField("noEGRPDocLoad");
        }

        if ("on".equalsIgnoreCase(form.getLonely())) {
            decoratedFormAsMap.clearFileLoadField("dulFamilyDocLoad");
            decoratedFormAsMap.clearFileLoadField("sostavFamilyDocLoad");
            decoratedFormAsMap.clearFileLoadField("obrabPDDocLoad");
        }

        if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
            clearDovFields(decoratedFormAsMap);
        }
        if("off".equalsIgnoreCase(form.getIncapable_enable())) {
            clearOpekFields(decoratedFormAsMap);                // Физик

        } else {
            if ("1".equals(form.getDovCategory())) {             //родитель
                clearPopechFields(decoratedFormAsMap);
            }
        }
        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400239Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovOpekLoad",
        "recipientIdentityDocLoad",
        "techInventDocLoad",
        "svidBirthDocLoad",
        "noEGRPDocLoad",
        "regPeopleDocLoad",
        "statusDocLoad",
        "uchetNujdaJPDocLoad",
        "dulFamilyDocLoad",
        "sostavFamilyDocLoad",
        "obrabPDDocLoad",
        "spravNo28DocLoad",
        "EGRPDocLoad"
        );
    }

    private void clearDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");
    }

    private void clearPopechFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovOpekLoad");
    }

    private void clearOpekFields(FormAsMap FAM) {
        FAM.remove("recipientLastName");
        FAM.remove("recipientFirstName");
        FAM.remove("recipientMiddleName");
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
        FAM.remove("recipientPassSeria");
        FAM.remove("recipientPassNo");
        FAM.remove("recipientPassDate");
        FAM.remove("recipientPassFrom");
        FAM.remove("dovCategory");

    }

    private void clearPersonFields (FormAsMap FAM) {}

}