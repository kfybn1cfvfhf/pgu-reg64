
package com.nvision.pgu.web.services.s36400228;

import com.nvision.pgu.core.rules.api.RuleException;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.services.ServiceClientFactory;
import com.nvision.pgu.sp.principal.IPrincipal;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import com.nvision.pgu.web.services.utils.PersonalDataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.nvg.idecs.identityservice.ws.types.AddrElement;
import ru.nvg.idecs.identityservice.ws.types.Person;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdRequest;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdResponse;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.UDDINames;

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
@RequestMapping("/services/s36400228")
@ServiceController(id = Service36400228Controller.SERVICE_ID, title = "Подача электронной заявки на повторную выдачу свидетельства о браке")
@Version("0.3")
public class Service36400228Controller extends AbstractNakhodkaController<Service36400228Form>
{
    /**
     * id Подача электронной заявки на повторную выдачу свидетельства о браке
     */
    public static final int SERVICE_ID = 36400228;

    @Autowired
    private Service36400228FormValidator validator;

    public Service36400228Controller() {

//
//        //TODO: enter here step list
//        List<String> stepList = Arrays.asList(
//				"Выбор органа ЗАГС обращения",
//				"Сведения о заявителе",
//				"Место жительства заявителя",
//				"Документ, удостоверяющий личность заявителя",
//				"Сведения о браке",
//				"ЗАГС - получатель свидетельства/справки",
//				"Дополнительная информация"
//            );
//        setStepList(stepList);
//
//
            setStepMetaList(Arrays.asList(
            new StepMeta(1, "Выбор органа ЗАГС обращения"),
            new StepMeta(2, "Сведения о заявителе"),
            new StepMeta(3, "Место жительства заявителя"),
            new StepMeta(4, "Документ, удостоверяющий личность заявителя"),
            new StepMeta(5, "Сведения о браке"),
            new StepMeta(6, "ЗАГС - получатель свидетельства/справки"),
            new StepMeta(7, "Дополнительная информация", true,"xml"),
            new StepMeta(8, "Запись на прием", true, "application")));


    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

	@Override
    protected void initBinderInternal(WebDataBinder binder)
 {
 if (binder.getTarget() instanceof Service36400228Form) {
super.setValidator(validator);
binder.setValidator(validator);
}
}

    @Override
    public void applyInitRules(Service36400228Form form) throws RuleException {
        String mobile = form.getContact_phone_temp_home();
        String phone = form.getContact_phone_temp_mobile();
        if(!mobile.isEmpty()){
            phone = phone + "," + mobile;
        }
        form.setContact_phone(phone);


        //form.setDeclarant_ident_doc_type_gr("1");
        //form.setDeclarant_ident_doc_type("1");
        // TODO когда содержимое справочников для типов документов в ЛК и БД будет совпадать!!!
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
                    final ru.nvg.idecs.identityservice.ws.types.Person person = personalDataResponse.getPerson();

                    List<AddrElement> elements = person.getRegistrationAddress().getAddrElements().getAddrElement();
                    for (AddrElement e:elements){
                        logger.info(String.format("%1$s: %2$s",e.toString(),e.getClass()));
                    }

                    //form.setDeclarant_ident_doc_type(Long.toString(person.getMainDocument().getDocumentType()));
                }
            }
        }
        //TODO: apply other init rules
	}
	
@Override
protected Service36400228Form createNewForm() {
return new Service36400228Form();
}

    @Override
    public void applyStepRules(Service36400228Form form) throws RuleException {

        Integer stepNum = form.getStepNum();
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
					Person p = PersonalDataUtils.getPerson(form);
					String firstName = p.getFirstName();
					String lastName = p.getLastName();
					String middleName = p.getMiddleName();
					if (p.getSex().value().equals("F")) {
						form.setWife_first_name(firstName);
						form.setWife_last_name_before(lastName);
						form.setWife_middle_name(middleName);
					} else {
						form.setHusband_first_name(firstName);
						form.setHusband_last_name_before(lastName);
						form.setHusband_middle_name(middleName);
					}
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

//    @Override
//    public String processStepInternal(
//            Integer stepNum,
//            Service36400230Form form, BindingResult result,
//            Map<String, Object> model
//    ) throws RuleException, IOException, TemplateException {
//        if (result.hasErrors()) {
//            form.setHasNextStep(true);
//            form.setStepNum(stepNum);
//            return getViewNamePrefix() + "/step"+stepNum+".html";
//        }
//        else {
//            if (stepNum < getStepCount()) {
//                form.setHasNextStep(true);
//                form.setStepNum(stepNum+1);
//                return getViewNamePrefix() + "/step"+(form.getStepNum())+".html";
//            }
//            else {
//                int res = orderService(form,model);
//                return "forward:/s"+getServiceId()+"/result";
//            }
//        }
//    }

//    @RequestMapping("/result")
//    public String processResult() {
//        return "UnderConstruction.html";
//    }
         @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400228Form form, boolean goback,
                                                                        Map<String, Object> model) {
        final StepProcessingResult res = super.determineNextStepNumOnStepProcessing(form, goback, model);
        switch (form.getStepNum()) {
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
            case 8:
                   final OrderService orderService = ru.nvg.idecs.uddi.ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_ORDER_SERVICE, OrderService.class);
                GetOrderByIdRequest orderRequest = new GetOrderByIdRequest();
                orderRequest.setAuthToken(form.getPguAssertion().getPrincipal().getAuthToken());
                orderRequest.setOrderId(form.getOrderId());
                final GetOrderByIdResponse response = orderService.getOrderById(orderRequest);
                form.setOrderExtId(response.getOrder().getOrderExtId());
                break;
        }
        return res;
    }
}
	