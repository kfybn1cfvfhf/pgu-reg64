package com.nvision.pgu.web.services.s36400230;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdRequest;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdResponse;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s36400230")
@ServiceController(id = Service36400230Controller.SERVICE_ID, title = "Подача электронной заявки на повторную выдачу свидетельства о расторжении брака")
public class Service36400230Controller extends AbstractNakhodkaController<Service36400230Form>
{
    private static final Logger logger = LoggerFactory.getLogger(Service36400230Controller.class);
    /**
     * id Подача электронной заявки на повторную выдачу свидетельства о расторжении брака
     */
    public static final int SERVICE_ID = 36400230;

    @Autowired
    private Service36400230FormValidator validator;

    public Service36400230Controller() {
        setStepMetaList(Arrays.asList(
                new StepMeta(1, "Выбор органа ЗАГС обращения"),
				new StepMeta(2, "Сведения о заявителе"),
				new StepMeta(3, "Место жительства заявителя"),
				new StepMeta(4, "Документ, удостоверяющий личность заявителя"),
				new StepMeta(5, "Сведения о расторжении брака"),
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
    protected void initBinderInternal(WebDataBinder binder)
    {
        if (binder.getTarget() instanceof Service36400230Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    public void applyInitRules(Service36400230Form form) throws RuleException {
        //TODO: apply other init rules
        //Если пол = муж
        if("1".equals(form.getSia_sex())){
            form.setHe_first_name(form.getSia_first_name());
            form.setHe_last_name_husband(form.getSia_last_name());
            form.setHe_middle_name(form.getSia_middle_name());
        //Если пол = жен
        }else{
            form.setShe_first_name(form.getSia_first_name());
            form.setShe_last_name_wife(form.getSia_last_name());
            form.setShe_middle_name(form.getSia_middle_name());
        }
        updateBirthDatePlus14Years(form);
	}
	
	@Override
    protected Service36400230Form createNewForm() {
        return new Service36400230Form();
    }

    protected void updateBirthDatePlus14Years(Service36400230Form form) {
        Date birthDate = form.getDeclarant_birthdate();
        if (null!=birthDate) {
            DateTime yBirthDate = new DateTime(birthDate);
            DateTime yPlus14YearsDate = yBirthDate.plusYears(14);
            Date plus14YearsDate = yPlus14YearsDate.toDate();
            form.setDeclarantBirthDatePlus14Years(plus14YearsDate);
        }
    }

    @Override
    public void applyStepRules(Service36400230Form form) throws RuleException {
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

                case 8:

                    final OrderService orderService = ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_ORDER_SERVICE, OrderService.class);
                    GetOrderByIdRequest orderRequest = new GetOrderByIdRequest();
                    orderRequest.setAuthToken(form.getPguAssertion().getPrincipal().getAuthToken());
                    orderRequest.setOrderId(form.getOrderId());
                    final GetOrderByIdResponse response = orderService.getOrderById(orderRequest);
                    form.setOrderExtId(response.getOrder().getOrderExtId());
                    break;
				
            }
        }
    }

    @RequestMapping(value = "/getzagses")
    public void processGetZagses(HttpServletResponse httpResponse, HttpServletRequest request){
        try {

            httpResponse.setContentType("application/json; charset=UTF-8");
            httpResponse.addHeader("Pragma", "No-Cache");
            httpResponse.addHeader("Cache-Control", "no-cache, must-revalidate");
            httpResponse.addHeader("Cache-Control", "no-store, post-check=0, pre-check=0");
            PrintWriter out = httpResponse.getWriter();
            out.write(WsZagsIntegrate.getZagses(request.getParameter("serial")).toString());
            out.close();
        } catch (IOException e) {
            logger.error("processGetZagses: io error ", e);
        }
    }

    @RequestMapping(value = "/getdayszb")
    public void processGetDaysZB(HttpServletResponse httpResponse, HttpServletRequest request){

    }

    @RequestMapping(value = "/gettimezb")
    public void processGetTimeZB(HttpServletResponse httpResponse, HttpServletRequest request){

    }
}
	