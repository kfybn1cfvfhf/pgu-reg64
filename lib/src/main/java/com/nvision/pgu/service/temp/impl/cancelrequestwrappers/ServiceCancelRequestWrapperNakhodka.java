package com.nvision.pgu.service.temp.impl.cancelrequestwrappers;

import com.nvision.pgu.service.core.exception.CancelRequestException;
import com.nvision.pgu.service.core.impl.cancelrequestwrappers.AbstractWsdlCancelRequestWrapper;
import com.nvision.pgu.service.core.model.CancelRequest;
import com.nvision.pgu.service.core.model.CancelResponse;
import com.nvision.pgu.service.core.util.StreamToString;
import com.nvision.pgu.service.temp.impl.callwrappers.nahodka.NachodkaTwoRequestsCallWrapper;
import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Element;
import ru.nvg.idecs.common.util.ws.XmlUtils;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdV2Request;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdV2Response;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;

public class ServiceCancelRequestWrapperNakhodka extends AbstractWsdlCancelRequestWrapper {

    private static final String REQUEST;
    private static final String DELETE_SUCCESS = "true";
    private static final Long ERROR_CODE_SUCCESS = 0L;
    private static final Long ERROR_CODE_NOT_FOUND = -1L;
    private static final String BINDING_KEY = "nahodka_zagssession";


    static {
        try {
            /* Loading request message template from resources */
            REQUEST = StreamToString.convertStreamToString(ServiceCancelRequestWrapperNakhodka.class.getClassLoader()
                    .getResourceAsStream("request/cancelNakhodka.xml"));
        } catch (IOException e) {
            throw new RuntimeException("Can not initialize ServiceCancelRequestWrapperNakhodka", e);
        }
    }

    @Override
    public Element cancel(CancelRequest cancelRequest, Map<String, Object> context)
            throws CancelRequestException {
        return invoke(cancelRequest);
    }

    @Override
    public CancelRequest prepareCancelRequest(String authToken, String userId,
                                              String serviceId, String orderId, String reason, Map<String, Object> context)
            throws CancelRequestException {

        logger.info("Preparing cancel request");

        OrderService orderService = ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_ORDER_SERVICE, OrderService.class);

        GetOrderByIdV2Request req = new GetOrderByIdV2Request();
        req.setAuthToken(authToken);
        req.setOrderId(Long.parseLong(orderId));

        logger.debug(String.format("Search for order with authToken = %s and OrderId = %s", authToken, orderId));

        GetOrderByIdV2Response resp = orderService.getOrderByIdV2(req);

        if (resp.getError() != null && resp.getError().getErrorCode() != 0)
            throw new CancelRequestException("Slot id not found");

        String slotId = resp.getOrder().getOrderExtId();


        String xml = MessageFormat.format(REQUEST, slotId);


        String region = NachodkaTwoRequestsCallWrapper.region;
        String endpoint = "";
        if (StringUtils.isNotBlank(BINDING_KEY + "_" + region)) {
            endpoint = getEndpoint(BINDING_KEY + "_" + region);
        } else {
            endpoint = getEndpoint(BINDING_KEY);
        }
        logger.info(String.format("Cancel request:\n%s", xml));
        logger.info("ENDPOINT: " + endpoint);
        return new CancelRequest(serviceId, endpoint, "1.1", "", xml.getBytes());

    }

    @Override
    public CancelResponse processResult(Element result, Map<String, Object> context)
            throws CancelRequestException {

        final XPath xpath = XPathFactory.newInstance().newXPath();

        logger.info("Processing cancel request result");

        logger.debug(String.format("Response:\n%s", XmlUtils.serializeNode(result)));

        String resultMessage;
        try {
            resultMessage = xpath.evaluate("./*[local-name() = 'return']", result);
        } catch (XPathExpressionException e) {
            throw new CancelRequestException(e.getLocalizedMessage(), e);
        }

        logger.debug(String.format("Result message:\n%s", resultMessage));

        if (DELETE_SUCCESS.equalsIgnoreCase(normalize(resultMessage)))
            return new CancelResponse("Заявка успешно отменена", ERROR_CODE_SUCCESS, "");
        else
            return new CancelResponse("Заявка не найдена", ERROR_CODE_NOT_FOUND, "Заявка не найдена");
    }

    private static String normalize(String input) {
        return input == null ? "" : input.trim();
    }

}
