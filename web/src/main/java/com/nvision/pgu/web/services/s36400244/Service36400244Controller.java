package com.nvision.pgu.web.services.s36400244;

import com.nvision.pgu.core.controllers.AbstractServiceOrderControllerEDS24;
import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.sp.principal.IPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.nvg.idecs.identityservice.ws.types.Person;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import java.util.Arrays;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400244Controller.SERVICE_ID)
@ServiceController(id = Service36400244Controller.SERVICE_ID, title = "Организация проведения оплачиваемых общественных работ")
@Version("0.1.1")
public class Service36400244Controller extends AbstractServiceOrderControllerEDS24<Service36400244Form> {
public static final Logger LOGGER = LoggerFactory.getLogger(Service36400244Controller.class);
    /**
     * id Организация проведения оплачиваемых общественных работ
     */
    public static final int SERVICE_ID = 36400244;


    @Autowired
    private Service36400244FormValidator validator;

    public Service36400244Controller() {
        setStepMetaList(Arrays.asList(
                new StepMeta(1, "Сведения о заявителе"),
                new StepMeta(2, "Сведения об образовании и дополнительная информация", true, "xml")
        ));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 	{
 		if (binder.getTarget() instanceof Service36400244Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400244Form createNewForm() {
 		return new Service36400244Form();
 	}

    @Override
    public void applyInitRules(Service36400244Form form) throws RuleException {
        Person person = getPerson(form);

        form.setSex(person.getSex().name());
        form.setPassport_type(person.getMainDocument().getDocumentTypeName());
    }

    private Person getPerson(Service36400244Form form) {
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
}