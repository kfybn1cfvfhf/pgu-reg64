package com.nvision.pgu.service.temp.impl.callwrappers.nahodka;

import com.nvision.pgu.service.core.impl.callwrappers.CommonCallWrapper;
import com.nvision.pgu.service.core.model.OrderStatus;
import com.nvision.pgu.service.core.model.ServiceResult;
import com.nvision.pgu.service.temp.impl.utils.ElementStub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.nvg.idecs.common.util.ws.XmlUtils;
import ru.nvg.idecs.common.util.ws.soap.CustomSOAPFaultException;
import ru.nvg.idecs.privateoffice.ws.types.EServiceResult;
import java.util.Map;

/**
 * @author v.torchilov <v.torchilov@gmail.com>
 * @version $Revision
 */
public class NakdkaCallWrapper extends CommonCallWrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(NakdkaCallWrapper.class);
    private static final String ERROR_MESSAGE = "SERVICE_NAHODKA_ERROR_MESSAGE";


    @Override
    public Element call(String eServiceId, String soapVersion, String endpoint, String soapAction, byte[] wrapRequest, Map<String, Object> context) {
        try {
			LOGGER.info("ENDPOINT: " + endpoint);
            return super.call(eServiceId, soapVersion, endpoint, soapAction, wrapRequest, context);
        } catch (CustomSOAPFaultException sfe) {
            String faultString = sfe.getFaultString();
            if (sfe.getFaultString().split(":").length > 1) {
                faultString = sfe.getFaultString().split(":")[1];
            }
            context.put(ERROR_MESSAGE, faultString);
            LOGGER.debug("SOAP Fault: \"{}\" for service {}", faultString, eServiceId);
            return new ElementStub();
        }
    }

    @Override
    public ServiceResult processResult(Element result, String processCode, Map<String, Object> context) {
        boolean orderCanBeCancelled = true;
        EServiceResult eServiceResult = new EServiceResult();
        if (context.containsKey(ERROR_MESSAGE)) {
            final String errorComment = String.valueOf(context.get(ERROR_MESSAGE));
            return new ServiceResult(OrderStatus.STATUS_REJECT, errorComment, null, orderCanBeCancelled);
        } else {
            NodeList node = result.getElementsByTagName("return");
            if (null == node || node.getLength() == 0) {
                node = result.getElementsByTagName("errorDescription");
                return new ServiceResult(OrderStatus.STATUS_REJECT, XmlUtils.getTextValue((Element) node.item(0)),
                        null, true);
            }
            eServiceResult.setExtOrderNumber(node.item(0).getChildNodes().item(1).getChildNodes().item(2).getTextContent());
        }

        //return new ServiceResult(OrderStatus.STATUS_SENT_TO_DEPARTMENT, null, orderCanBeCancelled);
        return new ServiceResult(eServiceResult, null, orderCanBeCancelled);
    }

}
