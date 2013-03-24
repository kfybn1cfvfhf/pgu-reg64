package com.nvision.pgu.web.services.s36400231;

import com.nvision.pgu.core.rules.api.RuleException;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdRequest;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdResponse;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import java.util.*;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s36400231")
@ServiceController(id = Service36400231Controller.SERVICE_ID, title = "Подача электронной заявки на повторную выдачу свидетельства о смерти")
public class Service36400231Controller extends AbstractNakhodkaController<Service36400231Form> {
    /**
     * id Подача электронной заявки на повторную выдачу свидетельства о смерти
     */
    public static final int SERVICE_ID = 36400231;
    @Autowired
    private Service36400231FormValidator validator;

    public Service36400231Controller() {
        setStepMetaList(Arrays.asList(
                new StepMeta(1, "Выбор органа ЗАГС обращения"),
                new StepMeta(2, "Сведения о заявителе"),
                new StepMeta(3, "Место жительства заявителя"),
                new StepMeta(4, "Сведения об умершем"),
                new StepMeta(5, "Сведения о документе, подтверждающем смерть"),
                new StepMeta(6, "ЗАГС - получатель свидетельства/справки"),
                new StepMeta(7, "Дополнительная информация", true, "xml"),
                new StepMeta(8, "Запись на прием", true, "application")
        ));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400231Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400231Form createNewForm() {
        return new Service36400231Form();
    }

    @Override
    public void applyStepRules(Service36400231Form form) throws RuleException {
        Integer stepNum = form.getStepNum();
        if (stepNum == null) {

        } else {
            switch (stepNum) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    Date death_date = new Date();
                    Integer day;
                    if (form.getDeath_date_day() != null && !form.getDeath_date_day().isEmpty()) {
                        day = Integer.parseInt(form.getDeath_date_day());
                    } else {
                        day = 1;
                    }
                    Integer month;
                    if (form.getDeath_date_month() != null && !form.getDeath_date_month().isEmpty()) {
                        month = Integer.parseInt(form.getDeath_date_month()) -1;
                    } else {
                        month = 0;
                    }
                    Integer year;
                    if (form.getDeath_date_year() != null && !form.getDeath_date_year().isEmpty()) {
                        year = Integer.parseInt(form.getDeath_date_year());
                    } else {
                        year = 1900;
                    }

                    Calendar calendar = GregorianCalendar.getInstance();
                    calendar.set(year,month,day);
                    form.setDeath_date( calendar.getTime());

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    final OrderService orderService = ServiceClientFactory.getServiceClient(ru.nvg.idecs.uddi.UDDINames.NAME_PO_ORDER_SERVICE, OrderService.class);
                    GetOrderByIdRequest orderRequest = new GetOrderByIdRequest();
                    orderRequest.setAuthToken(form.getPguAssertion().getPrincipal().getAuthToken());
                    orderRequest.setOrderId(form.getOrderId());
                    final GetOrderByIdResponse response = orderService.getOrderById(orderRequest);
                    form.setOrderExtId(response.getOrder().getOrderExtId());
                    break;

            }
        }
    }

    @Override
    public void applyInitRules(Service36400231Form form) throws RuleException {

        form.setDeclarant_country("1");
        StringBuilder mobile = new StringBuilder(form.getContact_phone());
        StringBuilder phone = new StringBuilder(form.getContact_phone_mobile());

        if (!mobile.equals(StringUtils.EMPTY))
            phone = phone.append(",").append(mobile);

        form.setContact_phone(phone.toString());
//        final IPrincipal principal = form.getPguAssertion().getPrincipal();
//        if (principal != null) {
//
//            final Long userId = principal.getUserId();
//            final String authToken = principal.getAuthToken();
//
//            if (userId != null) {
//
//                PersonalDataService personalDataService = ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_PERSONALDATA_SERVICE, PersonalDataService.class);
//
//                final GetPersonalDataRequest personalDataRequest = new GetPersonalDataRequest();
//                personalDataRequest.setAuthToken(authToken);
//                personalDataRequest.setUserId(userId);
//
//                final GetPersonalDataResponse personalDataResponse = personalDataService.getPersonalData(personalDataRequest);
//                if (personalDataResponse.getError() == null || personalDataResponse.getError().getErrorCode() == 0) {
//                    final ru.nvg.idecs.identityservice.ws.types.Person person = personalDataResponse.getPerson();
//
//                    List<AddrElement> elements = person.getRegistrationAddress().getAddrElements().getAddrElement();
//                    for (AddrElement e:elements){
//                        logger.info(String.format("%1$s: %2$s",e.toString(),e.getClass()));
//                    }
//                        //form.setMin_doc_date(person.getMainDocument().getDocumentTypeName());
//                    }
//                }
//            }
    }
}
	