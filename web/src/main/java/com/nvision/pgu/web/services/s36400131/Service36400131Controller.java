package com.nvision.pgu.web.services.s36400131;

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
@RequestMapping("/services/s" + Service36400131Controller.SERVICE_ID)
@ServiceController(id = Service36400131Controller.SERVICE_ID, title = "Прием заявлений и выдача документов о согласовании проектов границ земельных участков")
@Version("1.2")

public class Service36400131Controller extends AbstractServiceOrderControllerEDS24<Service36400131Form> {
    /**
     * id Прием заявлений и выдача документов о согласовании проектов границ земельных участков
     */
    public static final int SERVICE_ID = 36400131;


    @Autowired
    private Service36400131FormValidator validator;

    public Service36400131Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о регистрации заявителя в качестве индивидуального предпринимателя",
				"Сведения о банковских реквизитах",
				"Сведения о расположении земельного участка"
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
 		if (binder.getTarget() instanceof Service36400131Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400131Form createNewForm() {
 		return new Service36400131Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400131Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue())) {

            if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
            form.setApplType_changed(false);
        }
    }

    protected List<String> getFormFieldsWithFiles(Service36400131Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovUlNonDovLoad",
        "dovUlPasLoad",
        "founderDocLoad",
        "docMvRegULLoad",
        "dovUlDovLoad",
        "docMvRegIPLoad",
        "planDocLoad",
        "topDocLoad",
        "pravoDocLoad",
        "egrpDocLoad",
        "kadastrDocLoad"
        );
    }

    @Override
    public void applyInitRules(Service36400131Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setFactAddressSettlementType("1");
        form.setAddressPostSettlementType("1");
        form.setOrgAddressSettlementType("1");
        form.setOrgPostAddressSettlementType("1");
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400131Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (goback) {
            switch (stepProcessingResult.getStepNum()) {
                case 5:
                    stepProcessingResult.setStepNum(5);
                    break;
                case 4:
                        stepProcessingResult.setStepNum(4);
                        break;
                case 3:
                    if("1".equalsIgnoreCase(form.getApplType()) && "on".equalsIgnoreCase(form.getIp_enable())) {
                        stepProcessingResult.setStepNum(3);
                    } else {
                        stepProcessingResult.setStepNum(2);
                    }
            }
        }
        switch (stepProcessingResult.getStepNum()) {
            case 2:
                if("1".equalsIgnoreCase(form.getApplType())) {
                    // Физик
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisdov.html");
                    }
                } else {
                    // Юрик
                    if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2ulnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2uldov.html");
                    }
                }
                break;
            case 3:
                if ("1".equalsIgnoreCase(form.getApplType()) && "on".equalsIgnoreCase(form.getIp_enable())) {
                    stepProcessingResult = new StepProcessingResult(3,"step3.html");
                    break;
                }
            case 4:
                    stepProcessingResult = new StepProcessingResult(4,"step4.html");
                    break;
            case 5:
                stepProcessingResult = new StepProcessingResult(5,"step5.html");
        }

        return stepProcessingResult;
    }

    private void clearFisDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovPasLoad");
        FAM.clearFileLoadField("dovDovLoad");
    }

    private void clearFisFields(FormAsMap FAM) {
        FAM.remove("dov_enable");
        FAM.remove("ip_enable");
        FAM.remove("address");
        FAM.remove("factAddress");
        FAM.remove("addressPost");
        FAM.remove("phone");
        FAM.remove("email");
        FAM.remove("passSeria");
        FAM.remove("passNo");
        FAM.remove("passDate");
        FAM.remove("passFrom");
        FAM.clearFileLoadField("identityDocLoad");
        clearFisDovFields(FAM);
    }

    private void clearIPFields(FormAsMap FAM) {
        FAM.remove("inn");
        FAM.remove("ogrnip");
        FAM.clearFileLoadField("docMvRegIPLoad");
    }

    private void clearUlDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlDovLoad");
    }

    private void clearUlNonDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlNonDovLoad");
    }

    private void clearUlFields(FormAsMap FAM) {
        FAM.remove("dovUlType");
        FAM.remove("org_FullTitle");
        FAM.remove("org_opf");
        FAM.remove("org_SmallTitle");
        FAM.remove("orgAddress");
        FAM.remove("orgPostAddress");
        FAM.remove("org_phone");
        FAM.remove("org_fax");
        FAM.remove("org_email");
        FAM.remove("org_firstName");
        FAM.remove("org_lastName");
        FAM.remove("org_middleName");
        FAM.remove("org_InnUl");
        FAM.remove("org_OgrnUl");
        FAM.clearFileLoadField("dovUlPasLoad");
        FAM.clearFileLoadField("founderDocLoad");
        FAM.clearFileLoadField("docMvRegULLoad");
        clearUlDovFields(FAM);
        clearUlNonDovFields(FAM);
    }

    @Override
    protected Map<String, Object> formToMap(Service36400131Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if("1".equalsIgnoreCase(form.getApplType())) {
            // Физик
            clearUlFields(decoratedFormAsMap);
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                // Без доверенности
                clearFisDovFields(decoratedFormAsMap);
            }
            if ("off".equalsIgnoreCase(form.getIp_enable())) {
                //не ясляется ИП
                clearIPFields(decoratedFormAsMap);
            }
        } else {
            // Юрик
            clearFisFields(decoratedFormAsMap);
            clearIPFields(decoratedFormAsMap);
            if("1".equalsIgnoreCase(form.getDovUlType())) {
                // Без доверенности
                clearUlDovFields(decoratedFormAsMap);
            } else {
                // по доверенности
                clearUlNonDovFields(decoratedFormAsMap);
            }
        }
        return formAsMap;
    }

}