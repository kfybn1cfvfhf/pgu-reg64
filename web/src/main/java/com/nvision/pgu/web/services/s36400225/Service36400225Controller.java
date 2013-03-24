package com.nvision.pgu.web.services.s36400225;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.sp.principal.IPrincipal;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import com.nvision.pgu.web.services.utils.NationalityUtils;
import org.apache.commons.lang.time.DateUtils;
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

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s" + Service36400225Controller.SERVICE_ID)
@ServiceController(id = Service36400225Controller.SERVICE_ID, title = "Регистрация установления отцовства по совместному заявлению родителей")

public class Service36400225Controller extends AbstractNakhodkaController<Service36400225Form> {
    /**
     * id Регистрация установления отцовства по совместному заявлению родителей
     */

    public static final int SERVICE_ID = 36400225;


    @Autowired
    private Service36400225FormValidator validator;


    public Service36400225Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Выбор органа ЗАГС обращения и формы заявления",
                "Сведения о ребенке",
                "Сведения о родителях",
                "Место рождения родителей",
                "Место жительства родителей",
                "Запись на прием"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400225Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400225Form createNewForm() {
        return new Service36400225Form();
    }

    @Override
    public void applyInitRules(Service36400225Form form) throws RuleException {

        form.setDeclarant_father_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "woman"));
        form.setDeclarant_mother_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "man"));

        form.setMerried_akt_zags_gr("1");// "из справочника"
        form.setChild_settlement_type_gr("1");// "из справочника"
        form.setChild_country("1");// "Россия"
        form.setFather_birth_place_country("1");// "Россия"
        form.setMother_birth_place_country("1");// "Россия"
        form.setFather_living_country("1");// "Россия"
        form.setMother_living_country("1");// "Россия"

        form.setDeclarant_father_doc_type_gr("1");// "из справочника"
        form.setDeclarant_father_doc_type("1");
        form.setDeclarant_mother_doc_type_gr("1");// "из справочника"
        form.setDeclarant_mother_doc_type("1");

        form.setFather_birth_place_settlement_type_gr("1");// "из справочника"
        form.setMother_birth_place_settlement_type_gr("1");// "из справочника"

        form.setFather_living_place_gr("1");// "из справочника"
        form.setMother_living_place_gr("1");// "из справочника"

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
                            //System.out.println("It`s man");
                            form.setDeclarant_father_last_name(person.getLastName());
                            form.setDeclarant_father_first_name(person.getFirstName());
                            form.setDeclarant_father_middle_name(person.getMiddleName());
                            form.setDeclarant_father_birth_date(person.getBirthDate().toGregorianCalendar().getTime());
                            form.setDeclarant_father_doc_type(String.valueOf(person.getMainDocument().getDocumentType()));
                            form.setDeclarant_father_doc_ser(person.getMainDocument().getDocSeries());
                            form.setDeclarant_father_doc_number(person.getMainDocument().getDocNumber());
                            form.setDeclarant_father_doc_date(person.getMainDocument().getIssueDate().toGregorianCalendar().getTime());
                            form.setDeclarant_father_doc_place(person.getMainDocument().getIssueOrg());
                        } else {
                            //System.out.println("It`s woman");
                            form.setDeclarant_mother_last_name(person.getLastName());
                            form.setDeclarant_mother_first_name(person.getFirstName());
                            form.setDeclarant_mother_middle_name(person.getMiddleName());
                            form.setDeclarant_mother_birth_date(person.getBirthDate().toGregorianCalendar().getTime());
                            form.setDeclarant_mother_doc_type(String.valueOf(person.getMainDocument().getDocumentType()));
                            form.setDeclarant_mother_doc_ser(person.getMainDocument().getDocSeries());
                            form.setDeclarant_mother_doc_number(person.getMainDocument().getDocNumber());
                            form.setDeclarant_mother_doc_date(person.getMainDocument().getIssueDate().toGregorianCalendar().getTime());
                            form.setDeclarant_mother_doc_place(person.getMainDocument().getIssueOrg());
                        }
                        //form.setContact_email(person.getContacts().getContactData().get(0).getContactData());
                    }
                }
            }
        }
    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400225Form form, boolean goback, Map<String, Object> model) {
        final StepProcessingResult res = super.determineNextStepNumOnStepProcessing(form, goback, model);
        if (form.getStepNum() == 1) {
            String date = form.getDeath_doc_date_day();
            if (date != null && !date.equals("") && date.substring(0, 1).equals("0")) {
                form.setDeath_doc_date_day(date.substring(1, date.length()));
            }
            String certificateDateDay = form.getCertificate_date_day();
            if (certificateDateDay != null && !certificateDateDay.equals("") && certificateDateDay.substring(0, 1).equals("0")) {
                form.setCertificate_date_day(certificateDateDay.substring(1, certificateDateDay.length()));
            }
        }
        return res;
    }

    @Override
    public void applyStepRules(Service36400225Form form) throws RuleException {
        Integer stepNum = form.getStepNum();
        if (stepNum != null) {
            switch (stepNum) {

                case 1:

                    break;

                case 2:
                    form.setEdge_date(DateUtils.addYears(new Date(), -14));
                    if(form.getChild_birth_date() != null) {
                    if (form.getEdge_date().getTime() > form.getChild_birth_date().getTime())
                        form.setEdge_date(form.getChild_birth_date());
                    }

                    break;
                case 3:


                    break;
                case 4:

                    break;


                case 5:


                    break;
                case 6:

                    break;
            }
        }

    }

}