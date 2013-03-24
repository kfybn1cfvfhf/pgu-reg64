package com.nvision.pgu.web.services.s36400205;

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
@RequestMapping("/services/s" + Service36400205Controller.SERVICE_ID)
@ServiceController(id = Service36400205Controller.SERVICE_ID, title = "Выдача региональных карточек транспортного обслуживания, предоставляющих право бесплатного проезда")
@Version("1.2")
public class Service36400205Controller extends AbstractServiceOrderControllerEDS24<Service36400205Form> {
    /**
     * id Выдача региональных карточек транспортного обслуживания, предоставляющих право бесплатного проезда
     */
    public static final int SERVICE_ID = 36400205;


    @Autowired
    private Service36400205FormValidator validator;

    public Service36400205Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о заявителе (родителе лица, нуждающегося в услуге)",
				"Сведения об опекуне (попечителе) лица, нуждающегося в услуге",
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
 		if (binder.getTarget() instanceof Service36400205Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400205Form createNewForm() {
 		return new Service36400205Form();
 	}

    @Override
    public void applyInitRules(Service36400205Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setFactAddressSettlementType("1");
        form.setRecipientaddressSettlementType("1");
        form.setRecipientFactAdressSettlementType("1");
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400205Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if ((form.getDov_enable_changed().booleanValue() || form.getIncapable_enable_changed().booleanValue())) {
            if ("off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }
            form.setDov_enable_changed(false);
            form.setIncapable_enable_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400205Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
        if (goback) {
            if("off".equalsIgnoreCase(form.getIncapable_enable())) {
                switch (stepProcessingResult.getStepNum()) {                        //физик
                    case 5: stepProcessingResult.setStepNum(2);
                }
            } else {
                if ("1".equals(form.getDovCategory())) {             //родитель
                    switch (stepProcessingResult.getStepNum()) {
                        case 2: stepProcessingResult.setStepNum(1); break;
                        case 4: stepProcessingResult.setStepNum(2); break;
                        case 5: stepProcessingResult.setStepNum(4);
                    }
                } else {
                    switch (stepProcessingResult.getStepNum()) {
                        case 3: stepProcessingResult.setStepNum(1); break;
                        case 4: stepProcessingResult.setStepNum(2); break;
                        case 5: stepProcessingResult.setStepNum(5);
                    }
                }
            }
        }

        if("off".equalsIgnoreCase(form.getIncapable_enable())) {
            switch (stepProcessingResult.getStepNum()) {                        //физик
                case 2:
                    if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                            stepProcessingResult = new StepProcessingResult(2, "step2persnondov.html");
                    } else {
                            stepProcessingResult = new StepProcessingResult(2, "step2persdov.html");
                    }
                    break;
                case 3:
                    stepProcessingResult = new StepProcessingResult(6,"step4.html");
            }
        } else {
            if ("1".equals(form.getDovCategory())) {             //родитель
                switch (stepProcessingResult.getStepNum()) {
                    case 2:
                        if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                            stepProcessingResult = new StepProcessingResult(3, "step2parentnondov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(3, "step2parentdov.html");
                        }
                        break;
                    case 4: stepProcessingResult = new StepProcessingResult(5,"step3.html");
                            break;
                    case 6: stepProcessingResult = new StepProcessingResult(6,"step4.html");
                }
            } else {
                switch (stepProcessingResult.getStepNum()) {
                    case 2:
                        if ("off".equalsIgnoreCase(form.getDov_enable())) {         //без доверенности
                            stepProcessingResult = new StepProcessingResult(4, "step2popechnondov.html");
                        } else {
                            stepProcessingResult = new StepProcessingResult(4, "step2popechdov.html");
                        }
                        break;
                    case 5: stepProcessingResult = new StepProcessingResult(5,"step3.html");
                        break;
                    case 6: stepProcessingResult = new StepProcessingResult(6,"step4.html");
                }

            }
        }

        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400205Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

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
    protected List<String> getFormFieldsWithFiles(Service36400205Form form, Map<String, Object> model) {
        return Arrays.asList(
        "dovDovLoad",
        "dovPasLoad",
        "identityDocLoad",
        "dovOpekLoad",
        "recipientIdentityDocLoad",
        "vetTrudDocLoad",
        "vetVoenSlugDocLoad",
        "vetTrudSODocLoad",
        "vetVOVDocLoad",
        "sprRepDocLoad",
        "svedRojDocLoad",
        "edBiletDocLoad",
        "reshOpecDocLoad",
        "sprObrUchDocLoad",
        "mnogodetDocLoad",
        "childInvDocLoad",
        "ogrZdorDocLoad",
        "geroiDocLoad",
        "udostLgotDocLoad",
        "blokadLenDocLoad",
        "sprInvDocLoad",
        "conclagerDocLoad"
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
        FAM.remove("recipientFactAdressIndex");
        FAM.remove("recipientFactAdressCountry");
        FAM.remove("recipientFactAdressEnterType");
        FAM.remove("recipientFactAdressRegion");
        FAM.remove("recipientFactAdressRayon");
        FAM.remove("recipientFactAdressSettlementType");
        FAM.remove("recipientFactAdressCity");
        FAM.remove("recipientFactAdressSettlementText");
        FAM.remove("recipientFactAdressSettlementDict");
        FAM.remove("recipientFactAdressStreetText");
        FAM.remove("recipientFactAdressStreetDict");
        FAM.remove("recipientFactAdressHouse");
        FAM.remove("recipientFactAdressKorpus");
        FAM.remove("recipientFactAdressFlat");
        FAM.remove("dovCategory");

    }

    private void clearPersonFields (FormAsMap FAM) {}

}