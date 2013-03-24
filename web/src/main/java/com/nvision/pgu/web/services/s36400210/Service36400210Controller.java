package com.nvision.pgu.web.services.s36400210;

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
@RequestMapping("/services/s" + Service36400210Controller.SERVICE_ID)
@ServiceController(id = Service36400210Controller.SERVICE_ID, title = "Выдача разрешения на ввод в эксплуатацию объекта капитального строительства, если его строительство, реконструкция осуществлялись на территориях двух и более муниципальных образований (муниципальных районов городских округов)")
@Version("1.4.1")

public class Service36400210Controller extends AbstractServiceOrderControllerEDS24<Service36400210Form> {
    /**
     * id Выдача разрешения на ввод в эксплуатацию объекта капитального строительства, если его строительство, реконструкция осуществлялись на территориях двух и более муниципальных образований (муниципальных районов городских округов)
     */
    public static final int SERVICE_ID = 36400210;


    @Autowired
    private Service36400210FormValidator validator;

    public Service36400210Controller() {
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения об уполномоченном представителе",
				"Сведения о заявителе",
				"Сведения об организации",
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
 		if (binder.getTarget() instanceof Service36400210Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400210Form createNewForm() {
 		return new Service36400210Form();
 	}

    @Override
    public void applyInitRules(Service36400210Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setAddressPostSettlementType("1");
        form.setOrgAddressSettlementType("1");
    }


    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400210Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if ("1".equalsIgnoreCase(form.getApplType()) && form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue()) {
            if (stepProcessingResult.getStepNum() == 2 && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }
            if (stepProcessingResult.getStepNum() == 3 && "on".equalsIgnoreCase(form.getDov_enable())) {
                form.clearApplicantAttributes();
            }
            form.setDov_enable_changed(false);
            form.setApplType_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400210Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (goback) {
            switch (stepProcessingResult.getStepNum()) {
                case 5:
                    if ("2".equalsIgnoreCase(form.getApplType())) {
                        stepProcessingResult.setStepNum(4);
                        break;
                    }
                case 4:
                    if("1".equalsIgnoreCase(form.getApplType()) && "on".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult.setStepNum(3);
                        break;
                    }
                case 3:
                case 2:
                        stepProcessingResult.setStepNum(2);
            }
        }
        
        switch (stepProcessingResult.getStepNum()) {
            case 2:
                if("1".equalsIgnoreCase(form.getApplType())) {
                    // Физик
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2fisnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(3, "step3fisdov.html");
                    }
                } else {
                    // Юрик
                    if("1".equalsIgnoreCase(form.getDovUlType())) {
                        stepProcessingResult = new StepProcessingResult(3, "step3ulnondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(3, "step3uldov.html");
                    }
                }
                break;
            case 3:
                if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(6,"step6.html");
                    break;
                }
            case 4:
                if ("1".equalsIgnoreCase(form.getApplType()) && "on".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(4,"step4.html");
                    break;
                }
            case 5:
                if ("2".equalsIgnoreCase(form.getApplType())) {
                    stepProcessingResult = new StepProcessingResult(5,"step5.html");
                    break;
                }
            case 6:
                stepProcessingResult = new StepProcessingResult(6,"step6.html");
        }

        return stepProcessingResult;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400210Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovUlNonDovLoad",
        "dovUlDovLoad",
        "aktPriemkiLoad",
        "sootvetsLoad",
        "sootvetsParamLoad",
        "sootvetsTehUslLoad",
        "shemObjectLoad",
        "dogStrahLoad",
        "stroitRazrLoad",
        "pravoDocLoad",
        "planDocLoad",
        "zaklGosStroyLoad"        
        );
    }

    @Override
    protected Map<String, Object> formToMap(Service36400210Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("identityDocType", form.getIdentityDocType());
        }
        decoratedFormAsMap.remove("otherDocTypeName");

        if("5".equalsIgnoreCase(form.getDovIdentityDocType())) {
            decoratedFormAsMap.put("dovIdentityDocType", form.getDovOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("dovIdentityDocType", form.getDovIdentityDocType());
        }
        decoratedFormAsMap.remove("dovOtherDocTypeName");


        if("1".equalsIgnoreCase(form.getApplType())) {
            // Физик
            clearUlFields(decoratedFormAsMap);
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                // Без доверенности
                clearFisDovFields(decoratedFormAsMap);
                clearCommonFields(decoratedFormAsMap);
            }
        } else {
            // Юрик
            clearFisFields(decoratedFormAsMap);
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

    private void clearFisDovFields(FormAsMap FAM) {
        FAM.remove("dovDovLoad");
    }

    private void clearFisFields(FormAsMap FAM) {
        FAM.remove("dov_enable");
        FAM.remove("address");
        FAM.remove("addressPost");
        FAM.remove("phone");
        FAM.remove("email");
        FAM.remove("identityDocType");
        FAM.remove("passSeria");
        FAM.remove("passNo");
        FAM.remove("passDate");
        FAM.remove("passFrom");
        FAM.remove("otherDocTypeName");
        FAM.clearFileLoadField("identityDocLoad");
        clearFisDovFields(FAM);
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
        FAM.remove("org_phone");
        FAM.remove("org_fax");
        FAM.remove("org_email");
        FAM.remove("org_InnUl");
        clearUlDovFields(FAM);
        clearUlNonDovFields(FAM);
    }

    private void clearCommonFields(FormAsMap FAM) {
        FAM.remove("dovLastName");
        FAM.remove("dovFirstName");
        FAM.remove("dovMiddleName");
        FAM.remove("dovIdentityDocType");
        FAM.remove("dovOtherDocTypeName");
        FAM.remove("dovPassSeria");
        FAM.remove("dovPassNo");
        FAM.remove("dovPassDate");
        FAM.remove("dovPassFrom");
        FAM.clearFileLoadField("dovPasLoad");
    }


}