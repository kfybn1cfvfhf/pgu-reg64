
package com.nvision.pgu.web.services.s36400232;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;

import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdRequest;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdResponse;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.UDDINames;

import java.util.Arrays;
import java.util.Map;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 *
 */
@Controller
@RequestMapping("/services/s36400232")
@ServiceController(id = Service36400232Controller.SERVICE_ID, title = "Подача электронной заявки на повторную выдачу свидетельства об установлении отцовства")
public class Service36400232Controller extends AbstractNakhodkaController<Service36400232Form>
{
    /**
     * id Подача электронной заявки на повторную выдачу свидетельства об установлении отцовства
     */
    public static final int SERVICE_ID = 36400232;

    @Autowired
    private Service36400232FormValidator validator;

    public Service36400232Controller() {

        setStepMetaList(Arrays.asList(
                new StepMeta(1, "Выбор органа ЗАГС обращения"),
                new StepMeta(2, "Сведения о заявителе"),
                new StepMeta(3, "Место жительства заявителя"),
                new StepMeta(4, "Сведения о ребенке до установления отцовства"),
                new StepMeta(5, "Сведения о документе, подтверждающем установление отцовства"),
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
         if (binder.getTarget() instanceof Service36400232Form) {
             super.setValidator(validator);
             binder.setValidator(validator);
         }
     }

    @Override
    public void applyInitRules(Service36400232Form form) throws RuleException {
        //TODO: apply other init rules
	}
	
	@Override
    protected Service36400232Form createNewForm() {
        return new Service36400232Form();
    }

    @Override
    public void applyStepRules(Service36400232Form form) throws RuleException {
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
					
                    break;
				
                case 5:
					
                    break;
				
                case 6:
					
                    break;
				
                case 7:
					
                    break;
                case 8:

                    break;
				
            }
        }
    }
        @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400232Form form, boolean goback,
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
	