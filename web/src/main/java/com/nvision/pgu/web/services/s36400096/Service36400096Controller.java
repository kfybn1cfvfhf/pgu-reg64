package com.nvision.pgu.web.services.s36400096;

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
@RequestMapping("/services/s" + Service36400096Controller.SERVICE_ID)
@ServiceController(id = Service36400096Controller.SERVICE_ID, title = "Выдача решения о переводе или об отказе в переводе жилого помещения в нежилое или нежилого помещения в жилое помещение")
@Version("2.3.1")

public class Service36400096Controller extends AbstractServiceOrderControllerEDS24<Service36400096Form> {
    /**
     * id Выдача решения о переводе или об отказе в переводе жилого помещения в нежилое или нежилого помещения в жилое помещение
     */
    public static final int SERVICE_ID = 36400096;


    @Autowired
    private Service36400096FormValidator validator;

    public Service36400096Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о других собственниках помещения, являющихся физическими лицами",
				"Сведения о других собственниках помещения, являющихся юридическими лицами",
				"Сведения о помещении, в отношении которого принимается решение о переводе",
				"Соглашения"
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
 		if (binder.getTarget() instanceof Service36400096Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400096Form createNewForm() {
 		return new Service36400096Form();
 	}

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400096Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue() || form.getApplType_changed().booleanValue() || form.getDovUlType_changed().booleanValue())) {

            if("1".equalsIgnoreCase(form.getApplType()) && "off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
            form.setApplType_changed(false);
            form.setDovUlType_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400096Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if (goback) {
          switch (stepProcessingResult.getStepNum()) {
             case 4:
                if ("on".equalsIgnoreCase(form.getUl_owner_enable())) {
                    stepProcessingResult.setStepNum(4);
                    break;
                }
             case 3:
                 if("on".equalsIgnoreCase(form.getFl_owner_enable())) {
                     stepProcessingResult.setStepNum(3);
                 } else {
                     stepProcessingResult.setStepNum(2);
                 }
                 break;
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
            if ("on".equalsIgnoreCase(form.getFl_owner_enable())) {
                stepProcessingResult = new StepProcessingResult(3,"step3.html");
                stepProcessingResult.setStepNum(3);
                break;
            }
          case 4:
              if ("on".equalsIgnoreCase(form.getUl_owner_enable())) {
                  stepProcessingResult = new StepProcessingResult(4,"step4.html");
                  stepProcessingResult.setStepNum(4);
                  break;
              }
          case 5:
              if (("2".equals(form.getApplType()) || "on".equalsIgnoreCase(form.getUl_owner_enable()))) {        //шаг 8
                stepProcessingResult = new StepProcessingResult(5,"step5.html");        // отображается поле decisionDocLoad
              } else {
                  stepProcessingResult = new StepProcessingResult(5,"step5-1.html");
              }
              stepProcessingResult.setStepNum(5);
        }

        return stepProcessingResult;
    }

    private void clearFlOwnerFields(FormAsMap FAM) {
        FAM.remove("fl_owner_lastName");
        FAM.remove("fl_owner_firstName");
        FAM.remove("fl_owner_middleName");
        FAM.remove("fl_owner_docType");
        FAM.remove("fl_owner_docNum");
        FAM.remove("fl_owner_docDate");
        FAM.clearFileLoadField("fl_owner_DocLoad");
    }

    private void clearUlOwnerFields(FormAsMap FAM) {
        FAM.remove("ul_owner_FullTitle");
        FAM.remove("ul_owner_opf");
        FAM.remove("ul_owner_SmallTitle");
        FAM.remove("ul_owner_docType");
        FAM.remove("ul_owner_docNum");
        FAM.remove("ul_owner_docDate");
        FAM.clearFileLoadField("ul_owner_DocLoad");
    }

    private void clearFisDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovDovLoad");
        FAM.clearFileLoadField("dovPasLoad");

    }

    private void clearFisFields(FormAsMap FAM) {
        FAM.remove("dov_enable");
        FAM.remove("addressPost");
        FAM.remove("phone");
        FAM.remove("email");
        FAM.remove("sex");
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

    private void clearDovFIOFields(FormAsMap FAM) {
        FAM.remove("dovlastName");
        FAM.remove("dovfirstName");
        FAM.remove("dovmiddleName");
    }

    private void clearUlNonDovFields(FormAsMap FAM) {
        FAM.clearFileLoadField("dovUlNonDovLoad");
    }

    private void clearUlFields(FormAsMap FAM) {
        FAM.remove("dovUlType");
        FAM.remove("org_FullTitle");
        FAM.remove("org_opf");
        FAM.remove("org_SmallTitle");
        FAM.remove("org_addressPost");
        FAM.remove("org_phone");
        FAM.clearFileLoadField("dovUlPasLoad");
        FAM.clearFileLoadField("founderDocLoad");
        clearUlDovFields(FAM);
        clearUlNonDovFields(FAM);
    }

    @Override
    protected Map<String, Object> formToMap(Service36400096Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if ("1".equals(form.getSex())) {
            decoratedFormAsMap.put("sex", "male");
        } else {
            decoratedFormAsMap.put("sex", "female");
        }

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
            decoratedFormAsMap.remove("otherDocTypeName");
        }

        if (!("2".equals(form.getApplType()) || "on".equalsIgnoreCase(form.getUl_owner_enable()))) {        //шаг 8
            decoratedFormAsMap.clearFileLoadField("decisionDocLoad");
        }

        if("1".equalsIgnoreCase(form.getApplType())) {
            // Физик
            clearUlFields(decoratedFormAsMap);
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                // Без доверенности
                clearFisDovFields(decoratedFormAsMap);
                clearDovFIOFields(decoratedFormAsMap);
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
        if ("off".equalsIgnoreCase(form.getFl_owner_enable())) {
            clearFlOwnerFields(decoratedFormAsMap);
        }
        if ("off".equalsIgnoreCase(form.getUl_owner_enable())) {
            clearUlOwnerFields(decoratedFormAsMap);
        }
        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400096Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "dovDovLoad",
        "dovPasLoad",
        "dovUlNonDovLoad",
        "dovUlPasLoad",
        "founderDocLoad",
        "dovUlDovLoad",
        "fl_owner_DocLoad",
        "ul_owner_DocLoad",
        "proectDocLoad",
        "decisionDocLoad",
        "agreeUlDocLoad",
        "lowDocLoad",
        "housePlanDocLoad",
        "techPlanDocLoad",
        "techPassport"
        );
    }


}