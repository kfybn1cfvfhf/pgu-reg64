package com.nvision.pgu.web.services.s36400224;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.sp.principal.IPrincipal;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import com.nvision.pgu.web.services.utils.NationalityUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nvg.idecs.identityservice.ws.types.Person;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * @author vmostovoy
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s" + Service36400224Controller.SERVICE_ID)
@ServiceController(id = Service36400224Controller.SERVICE_ID, title = "Регистрация расторжения брака")

public class Service36400224Controller extends AbstractNakhodkaController<Service36400224Form> {
    /**
     * id Регистрация расторжения брака
     */
    public static final int SERVICE_ID = 36400224;


    @Autowired
    private Service36400224FormValidator validator;

    public Service36400224Controller() {
        List<String> stepList = Arrays.asList(
				"Выбор органа ЗАГС обращения и формы заявления",
				"Сведения о супругах",
				"Место рождения супругов",
				"Место жительства супругов",
				"Запись на прием"
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
 		if (binder.getTarget() instanceof Service36400224Form) {
 			super.setValidator(validator);
 			binder.setValidator(validator);
 		}
 	}
	
	@Override
 	protected Service36400224Form createNewForm() {
 		return new Service36400224Form();
 	}

    protected void updateBirthDatePlus14Years(Service36400224Form form) {
        Date birthDate = form.getDeclarant_birthdate();
        if (null!=birthDate) {
            DateTime yBirthDate = new DateTime(birthDate);
            DateTime yPlus14YearsDate = yBirthDate.plusYears(14);
            Date plus14YearsDate = yPlus14YearsDate.toDate();
            form.setDeclarantBirthDatePlus14Years(plus14YearsDate);
        }
    }


	@Override
    public void applyInitRules(Service36400224Form form) throws RuleException {
        String mobile = form.getContact_phone_temp_home();
        String phone = form.getContact_phone_temp_mobile();
        if(!mobile.isEmpty()){
            phone = phone + "," + mobile;
        }
        form.setContact_phone(phone);


        form.setHe_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "man"));
        form.setShe_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "woman"));

        form.setHe_doc_type_gr("1");
		form.setShe_doc_type_gr("1");
		form.setMerried_akt_zags_gr("1");// radiogroup
		form.setHe_birth_place_country("1"); // Россия
		form.setShe_birth_place_country("1"); // Россия
		form.setHe_living_country("1");
		form.setShe_living_country("1");
		form.setHe_birth_place_settlement_type_gr("1");// radiogroup
		form.setShe_birth_place_settlement_type_gr("1");// radiogroup
		form.setHe_living_place_gr("1"); // radiogroup
		form.setShe_living_place_gr("1");// radiogroup
        if (form.getSex().equals("1")){
            form.setDeclarant("ZJVL_HE");
            form.setPriznan_to_who("2");
            form.setDecision_to_who("2");
        } else{
            form.setDeclarant("ZJVL_SHE");
            form.setPriznan_to_who("1");
            form.setDecision_to_who("1");
        }
        final IPrincipal principal = form.getPguAssertion().getPrincipal();
        if (principal != null) {

            final Long userId = principal.getUserId();
            final String authToken = principal.getAuthToken();

            if (userId != null) {

                PersonalDataService personalDataService = ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_PERSONALDATA_SERVICE, PersonalDataService.class);

                final GetPersonalDataRequest personalDataRequest = new GetPersonalDataRequest();
                personalDataRequest.setAuthToken(authToken);
                personalDataRequest.setUserId(userId);

                final GetPersonalDataResponse personalDataResponse = personalDataService.getPersonalData(personalDataRequest);
                if (personalDataResponse.getError() == null || personalDataResponse.getError().getErrorCode() == 0) {
                    final Person person = personalDataResponse.getPerson();

                    if ((person != null) && (person.getSex() != null)) {

                        if (person.getSex().toString().equals("M")) {
                            form.setHe_last_name_merried(person.getLastName());
                            form.setHe_first_name(person.getFirstName());
                            form.setHe_middle_name(person.getMiddleName());
                            form.setHe_birth_date(person.getBirthDate().toGregorianCalendar().getTime());
                            form.setHe_doc_type(String.valueOf(person.getMainDocument().getDocumentType()));
                            form.setHe_doc_ser(person.getMainDocument().getDocSeries());
                            form.setHe_doc_number(person.getMainDocument().getDocNumber());

							XMLGregorianCalendar calendar = person.getMainDocument().getIssueDate();
                            if(calendar!=null)  {
								form.setHe_doc_date(calendar.toGregorianCalendar().getTime());
								logger.warn("Person document issue date is null");
							}
                            form.setHe_doc_place(person.getMainDocument().getIssueOrg());
                            form.setDeclarant_ident_doc_type_gr(person.getMainDocument().getDocumentTypeName());
                        } else {
                            form.setShe_last_name_merried(person.getLastName());
                            form.setShe_first_name(person.getFirstName());
                            form.setShe_middle_name(person.getMiddleName());
                            form.setShe_birth_date(person.getBirthDate().toGregorianCalendar().getTime());
                            form.setShe_doc_type(String.valueOf(person.getMainDocument().getDocumentType()));
                            form.setShe_doc_ser(person.getMainDocument().getDocSeries());
                            form.setShe_doc_number(person.getMainDocument().getDocNumber());

							XMLGregorianCalendar calendar = person.getMainDocument().getIssueDate();
                            if(calendar!=null)  {
								form.setShe_doc_date(calendar.toGregorianCalendar().getTime());
								logger.warn("Person document issue date is null");
							}
                            form.setShe_doc_place(person.getMainDocument().getIssueOrg());
                        }
                    }
                }
            }
        }

        updateBirthDatePlus14Years(form);
    }

    @Override
    public void applyStepRules(Service36400224Form form) throws RuleException {
        Integer stepNum = form.getStepNum();

        updateBirthDatePlus14Years(form);

        if (stepNum == null) {

        }
        else {
            switch (stepNum) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

            }
        }
    }

}