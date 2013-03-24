package com.nvision.pgu.web.services.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import ru.nvg.idecs.identityservice.ws.types.Person;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.sp.principal.IPrincipal;

public class PersonalDataUtils {
	
    private static Logger logger = LoggerFactory.getLogger(PersonalDataUtils.class);

	private PersonalDataUtils() {}
	
    public static Person getPerson(AbstractServiceOrderForm form) {
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
