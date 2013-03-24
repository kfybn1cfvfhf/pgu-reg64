package com.nvision.pgu.web.services.s36400242;

import com.nvision.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.sp.principal.IPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nvg.idecs.identityservice.ws.types.Person;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;
import ru.lanit.samara.pgu.core.util.version.Version;

import java.util.Arrays;
import java.util.Map;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller @RequestMapping("/services/s" + Service36400242Controller.SERVICE_ID)
@ServiceController(id = Service36400242Controller.SERVICE_ID,
                   title = "Содействие гражданам в поиске подходящей работы")
@Version("0.1.1")
public class Service36400242Controller extends AbstractServiceOrderControllerEDS24<Service36400242Form> {
    /**
     * id Содействие гражданам в поиске подходящей работы
     */
    public static final int SERVICE_ID = 36400242;


    @Autowired
    private Service36400242FormValidator validator;

    public Service36400242Controller() {
        setStepMetaList(Arrays.asList(
				new StepMeta(1, "Сведения о заявителе"),
				new StepMeta(2, "Сведения об образовании и дополнительных навыках"),
				new StepMeta(3, "Требования по подбору вакансий"),
				new StepMeta(4, "Дополнительная информация", true, "xml")
            ));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder) {
 		if (binder.getTarget() instanceof Service36400242Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400242Form createNewForm() {
 		return new Service36400242Form();
 	}
    @Override
    public void applyInitRules(Service36400242Form form) throws RuleException {
        Person person = getPerson(form);

        if("M".equals(person.getSex().name()))
        {
            form.setSex("Мужской");
        }
        if("F".equals(person.getSex().name()))
        {
            form.setSex("Женский");
        }
        form.setPassport_type(person.getMainDocument().getDocumentTypeName());
    }

    private Person getPerson(Service36400242Form form) {
        final IPrincipal principal = form.getPguAssertion().getPrincipal();
        Assert.notNull(principal, "Principal is null.");

        final Long userId = principal.getUserId();
        Assert.notNull(userId, "userId is null");

        final String authToken = principal.getAuthToken();
        Assert.notNull(authToken, "authToken is null");

        PersonalDataService personalDataService = ServiceClientFactory.getServiceClient(
                UDDINames.NAME_PO_PERSONALDATA_SERVICE, PersonalDataService.class);
        final GetPersonalDataRequest personalDataRequest = new GetPersonalDataRequest();
        personalDataRequest.setAuthToken(authToken);
        personalDataRequest.setUserId(userId);

        final GetPersonalDataResponse personalDataResponse = personalDataService.getPersonalData(personalDataRequest);
        if (personalDataResponse.getError() != null
                && personalDataResponse.getError().getErrorCode() != 0) {
            logger.error(personalDataResponse.getError().getErrorMessage(), personalDataResponse.getError());
            return null;
        }

        return personalDataResponse.getPerson();
    }
    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400242Form form, boolean goback,
            Map<String, Object> model) {
        final StepProcessingResult res = super.determineNextStepNumOnStepProcessing(form, goback, model);

        if ("1".equals(form.getAccount_skills ())) {
        switch (form.getStepNum()) {
            case 2:
                    res.setStepNum(4);
                break;
            case 4:
               if (goback)
                    res.setStepNum(2);
                break;
            }
        }

        return res;
    }
}