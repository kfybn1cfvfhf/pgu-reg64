package com.nvision.pgu.web.services.s36400101;

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
@RequestMapping("/services/s" + Service36400101Controller.SERVICE_ID)
@ServiceController(id = Service36400101Controller.SERVICE_ID, title = "Назначение опекуном (попечителем), выдача заключения о возможности быть опекуном (попечителем) совершеннолетнего недееспособного (не полностью дееспособного) гражданина")
@Version("1.3")

public class Service36400101Controller extends AbstractServiceOrderControllerEDS24<Service36400101Form> {
    /**
     * id Назначение опекуном (попечителем), выдача заключения о возможности быть опекуном (попечителем) совершеннолетнего недееспособного (не полностью дееспособного) гражданина
     */
    public static final int SERVICE_ID = 36400101;


    @Autowired
    private Service36400101FormValidator validator;

    public Service36400101Controller() {
        List<String> stepList = Arrays.asList(
				"Сведения о заявителе",
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
 		if (binder.getTarget() instanceof Service36400101Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400101Form createNewForm() {
 		return new Service36400101Form();
 	}

    @Override
    public void applyInitRules(Service36400101Form form) throws RuleException {
        form.setAddressSeatSettlementType("1");
        form.setResidenceAdressSettlementType("1");
    }

    protected List<String> getFormFieldsWithFiles(Service36400101Form form, Map<String, Object> model) {
        return Arrays.asList(
        "identityDocLoad",
        "opinionBeGuardLoad",
        "certificateEmploymentLoad",
        "medicalReportLoad",
        "marriageCertificateLoad",
        "writtenConsentLoad",
        "personalDataConsentLoad",
        "guardTrainingLoad",
        "autobiographyLoad",
        "excerptHomeLoad",
        "convictionLoad",
        "accordingPremisesLoad",
        "technicalRulesLoad",
        "certificatePensionLoad",
        "socialPaymentsLoad"
        );
    }

    @Override
    protected Map<String, Object> formToMap(Service36400101Form form) {
        Map<String, Object> formAsMap = super.formToMap(form);
        FormAsMap decoratedFormAsMap =  new FormAsMapImpl(formAsMap);

        decoratedFormAsMap.clearForOrdering();

        if("5".equalsIgnoreCase(form.getIdentityDocType())) {
            decoratedFormAsMap.put("identityDocType", form.getOtherDocTypeName());
        } else {
            decoratedFormAsMap.put("identityDocType", form.getIdentityDocType());
        }
        decoratedFormAsMap.remove("otherDocTypeName");

       return formAsMap;
    }
}