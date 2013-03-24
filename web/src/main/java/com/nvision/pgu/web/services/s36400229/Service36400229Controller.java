package com.nvision.pgu.web.services.s36400229;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.nsi.ws.DicItemList;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdRequest;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdResponse;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import java.util.Arrays;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s36400229")
@ServiceController(id = Service36400229Controller.SERVICE_ID,
                   title = "Подача электронной заявки на повторную выдачу свидетельства о рождении")
@Version("0.3")
public class Service36400229Controller extends AbstractNakhodkaController<Service36400229Form> {
    /**
     * id Подача электронной заявки на повторную выдачу свидетельства о рождении
     */
    public static final int SERVICE_ID = 36400229;
    private static final String DEFAULT_COUNTRY = "Россия";

    @Autowired
    private Service36400229FormValidator validator;

    public Service36400229Controller() {
        setStepMetaList(Arrays.asList(
                new StepMeta(1, "Выбор органа ЗАГС обращения"),
                new StepMeta(2, "Сведения о заявителе"),
                new StepMeta(3, "Место жительства заявителя"),
                new StepMeta(4, "Сведения о ребенке"),
                new StepMeta(5, "Сведения о документе, подтверждающем рождение ребенка"),
                new StepMeta(6, "ЗАГС - получатель свидетельства/справки"),
                new StepMeta(7, "Дополнительная информация", true, "xml"),
                new StepMeta(7, "Запись на прием", true, "application")
        ));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400229Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }
    private String getKeyByValue(String dicCode,String value)
    {
        try {
            DicItemList it = getDicRegistry().listItemsByName(dicCode, value, 1, 1);
            if (it.getList().getItem().size() > 0) {
                return(it.getList().getItem().get(0).getKey().getCode());
            }
            else
            {
                logger.warn("Cannot find element in "+dicCode +" with value" +value);
            }
        } catch (DicNotFoundException e) {
            logger.warn("Cannot find element in "+dicCode +" with value" +value);
        }
        return null;
    }

    @Override
    public void applyInitRules(Service36400229Form form) throws RuleException {

        String countryCode=getKeyByValue("NAHODKA_COUNTRY", DEFAULT_COUNTRY);
        form.setDeclarant_country(countryCode);

        //Артем, идея хорошая, но почему-то это не работает.
        //Временно комментирую в контроллере и шаблоне на шаге 3, и возвращаю стандартный вариант.
        //form.setType_street_no(getKeyByValue("NAHODKA_STREET_TYPE", "нет улицы"));

        form.setChild_birth_place_country(countryCode);
        form.setAddr_agency_country(countryCode);

        form.setDeclarant_place(form.getDeclarant_place());

        String mobile = form.getContact_phone_home();
        String phone = form.getContact_phone_mobile();
        if(!mobile.isEmpty()){
            phone = phone + "," + mobile;
        }

        form.setContact_phone(phone);
    }

    @Override
    protected Service36400229Form createNewForm() {
        return new Service36400229Form();
    }

    @Override
    public void applyStepRules(Service36400229Form form) throws RuleException {
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
}
	