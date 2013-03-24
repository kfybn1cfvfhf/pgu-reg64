package com.nvision.pgu.web.services.s36400045;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.web.services.s36400045.preordering.clearstep3;
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

@Controller
@RequestMapping("/services/s" + Service36400045Controller.SERVICE_ID)
@ServiceController(id = Service36400045Controller.SERVICE_ID, title = "Прием заявлений, постановка на учет и зачисление детей в образовательные учреждения реализующие основную образовательную программу дошкольного образования (детские сады)")
@Version("0.3")
public class Service36400045Controller extends AbstractServiceOrderControllerEDS24<Service36400045Form> {
    /**
     * id Прием заявлений, постановка на учет и зачисление детей в образовательные учреждения реализующие основную образовательную программу дошкольного образования (детские сады)
     */
    public static final int SERVICE_ID = 36400045;


    @Autowired
    private Service36400045FormValidator validator;

    public Service36400045Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о втором родителе или лице его заменяющем",
				"Сведения о ребенке"
            );
        setStepList(stepList);
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400045Form form, boolean goback, Map<String, Object> model) {
           StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);

            if(stepProcessingResult.getStepNum() == 2) {
                if("on".equalsIgnoreCase(form.getDov_enable())) {
                    stepProcessingResult = new StepProcessingResult(2, "step2dov.html");
                } else {
                    stepProcessingResult = new StepProcessingResult(2, "step2nodov.html");
                }
            }

        //2-4
        if (form.getStepNum() == 2 && !goback && "on".equalsIgnoreCase(form.getParent2DisableCh())) {
            stepProcessingResult.setStepNum(4);
        }

        if (form.getStepNum() == 4 && goback && "on".equalsIgnoreCase(form.getParent2DisableCh())) {
            if("on".equalsIgnoreCase(form.getDov_enable())) {
                stepProcessingResult = new StepProcessingResult(2, "step2dov.html");
            } else {
                stepProcessingResult = new StepProcessingResult(2, "step2nodov.html");
            }
        }

         return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400045Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        if("on".equalsIgnoreCase(form.getParent2DisableCh())) {
            decoratedFormAsMap = new clearstep3(decoratedFormAsMap);
        } else {
            if("off".equalsIgnoreCase(form.getParentEmployedCh())) {
                decoratedFormAsMap.remove("parentWorkPlace");
                decoratedFormAsMap.remove("parentWorkPost");
            }
        }

        if("off".equalsIgnoreCase(form.getDov_enable())) {
            decoratedFormAsMap.clearFileLoadField("dovDovLoad");
            decoratedFormAsMap.clearFileLoadField("dovPasLoad");
        }

        if("off".equalsIgnoreCase(form.getApplEmployedCh())) {
            decoratedFormAsMap.remove("applWorkPlace");
            decoratedFormAsMap.remove("applWorkPost");
            decoratedFormAsMap.remove("parentWorkPost");
        }

        if("off".equalsIgnoreCase(form.getApplPrivilegeCh())) {
            decoratedFormAsMap.remove("privilegeCategory");
            decoratedFormAsMap.clearFileLoadField("topPriorityDocLoad");
            decoratedFormAsMap.clearFileLoadField("priorityDocLoad");
            decoratedFormAsMap.clearFileLoadField("advantageDocLoad");
        }

        if("1".equalsIgnoreCase(form.getPrivilegeCategory())) {
            decoratedFormAsMap.clearFileLoadField("priorityDocLoad");
            decoratedFormAsMap.clearFileLoadField("advantageDocLoad");
        }

        if("2".equalsIgnoreCase(form.getPrivilegeCategory())) {
            decoratedFormAsMap.clearFileLoadField("topPriorityDocLoad");
            decoratedFormAsMap.clearFileLoadField("advantageDocLoad");
        }

        if("3".equalsIgnoreCase(form.getPrivilegeCategory())) {
            decoratedFormAsMap.clearFileLoadField("topPriorityDocLoad");
            decoratedFormAsMap.clearFileLoadField("priorityDocLoad");
        }

        if("off".equalsIgnoreCase(form.getCorrectCh())) {
            decoratedFormAsMap.clearFileLoadField("commissionDocLoad");
        }

        decoratedFormAsMap.clearForOrdering();

        return formAsMap;
    }


    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400045Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && form.getRepresentativeStatusChanged().booleanValue()) {
            if ("on".equals(form.getDov_enable())) {
                form.clearApplicantAttributes();
            } else {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            }

            form.setRepresentativeStatusChanged(false);
        }
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400045Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400045Form createNewForm() {
 		return new Service36400045Form();
 	}

         protected List<String> getFormFieldsWithFiles(Service36400045Form form, Map<String, Object> model) {
        return Arrays.asList(
"dovDovLoad",
"dovPasLoad",
"identityDocLoad",
"topPriorityDocLoad",
"priorityDocLoad",
"advantageDocLoad",
"birthCertificateDocLoad",
"commissionDocLoad"
        );
    }

}