package com.nvision.pgu.web.services.s36400114;

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
@RequestMapping("/services/s" + Service36400114Controller.SERVICE_ID)
@ServiceController(id = Service36400114Controller.SERVICE_ID, title = "Выплата ежемесячного пособия по уходу за ребенком")
@Version("1.5")

public class Service36400114Controller extends AbstractServiceOrderControllerEDS24<Service36400114Form> {
    /**
     * id Выплата ежемесячного пособия по уходу за ребенком
     */
    public static final int SERVICE_ID = 36400114;


    @Autowired
    private Service36400114FormValidator validator;

    public Service36400114Controller() {
        List<String> stepList = Arrays.asList(
				"Тип заявителя",
				"Сведения о заявителе",
				"Сведения о ребенке (детях)",
				"Сведения о способе получения пособия",
                "Сведения о получатале услуги",
				"Электронные копии документов",
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
 		if (binder.getTarget() instanceof Service36400114Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400114Form createNewForm() {
 		return new Service36400114Form();
 	}

    @Override
    public void applyInitRules(Service36400114Form form) throws RuleException {
        form.setAddressSettlementType("1");
        form.setAddressPostSettlementType("1");
        form.setFactAddressSettlementType("1");
    }

    @Override
    protected void patchModelAndFormOnStepProcessing(Service36400114Form form, Map<String, Object> model, StepProcessingResult stepProcessingResult) {
        super.patchModelAndFormOnStepProcessing(form, model, stepProcessingResult);

        if (stepProcessingResult.getStepNum() == 2 && (form.getDov_enable_changed().booleanValue())) {
            if("off".equalsIgnoreCase(form.getDov_enable())) {
                form.fillApplicantAttributesWithPrivateRoomData(this.getPrivateRoomDataContainer());
            } else {
                form.clearApplicantAttributes();
            }

            form.setDov_enable_changed(false);
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400114Form form, boolean goback, Map<String, Object> model) {
        StepProcessingResult stepProcessingResult = super.determineNextStepNumOnStepProcessing(form, goback, model);
                if (stepProcessingResult.getStepNum() == 2) {
                    if("off".equalsIgnoreCase(form.getDov_enable())) {
                        stepProcessingResult = new StepProcessingResult(2, "step2nondov.html");
                    } else {
                        stepProcessingResult = new StepProcessingResult(2, "step2dov.html");
                    }
                }
        return stepProcessingResult;
    }

    @Override
    protected Map<String, Object> formToMap(Service36400114Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();



        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("identityDocType", form.getIdentityDocType());
        }
        decoratedFormAsMap.remove("otherDocTypeName");

        if (!"on".equalsIgnoreCase(form.getChildCh())) {
            decoratedFormAsMap.clearFileLoadField("child1DocLoad");
            decoratedFormAsMap.remove("child1lastName");
            decoratedFormAsMap.remove("child1firstName");
            decoratedFormAsMap.remove("child1middleName");
            decoratedFormAsMap.remove("child1Birthdate");
        }

        if ("off".equalsIgnoreCase(form.getParentCh())) {
            decoratedFormAsMap.clearFileLoadField("soglUsinDocLoad");
            decoratedFormAsMap.clearFileLoadField("roziskDocLoad");
        }

        if ("off".equalsIgnoreCase(form.getTrud1Ch())) {
            decoratedFormAsMap.clearFileLoadField("spravPosobDocLoad");
        }

        if (!("on".equalsIgnoreCase(form.getTrudCh()) || "on".equalsIgnoreCase(form.getParent1Ch()))) {
            decoratedFormAsMap.clearFileLoadField("trudKnigDocLoad");
            decoratedFormAsMap.clearFileLoadField("sovmProjivDocLoad");
        }

        if (!("3".equals(form.getStatZayav()) || "4".equals(form.getStatZayav()))) {
            decoratedFormAsMap.clearFileLoadField("opecDocLoad");
        }

        if (!("5".equals(form.getStatZayav()))) {
            decoratedFormAsMap.clearFileLoadField("svidDeadDocLoad");
            decoratedFormAsMap.clearFileLoadField("sudLishPravDocLoad");
            decoratedFormAsMap.clearFileLoadField("lishSvobDocLoad");
        }

        return formAsMap;
    }

    @Override
    protected List<String> getFormFieldsWithFiles(Service36400114Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
                "dovDovLoad",
                "dovPasLoad",
        "bezhDocLoad",
        "timeDocLoad",
        "childDocLoad",
        "child1DocLoad",
        "opecDocLoad",
        "vipTrudKnigDocLoad",
        "trudKnigDocLoad",
        "svidDeadDocLoad",
        "sudLishPravDocLoad",
        "sudNoRodPopDocLoad",
        "spravPosobDocLoad",
        "sovmProjivDocLoad",
        "prikazOtpuskDocLoad",
        "soglUsinDocLoad",
        "spravSocZashGitDocLoad",
        "spravSocZashRegDocLoad",
        "igripDocLoad",
        "noSocStrahDocLoad",
        "slujZanDocLoad"
        );
    }

}