package com.nvision.pgu.service.temp.impl.callwrappers.nahodka;


import com.nvision.pgu.service.core.impl.callwrappers.CommonCallWrapper;
import com.nvision.pgu.service.core.model.OrderStatus;
import com.nvision.pgu.service.core.model.ServiceResult;
import com.nvision.pgu.service.temp.impl.utils.ElementStub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.nvg.idecs.common.util.ws.XmlUtils;
import ru.nvg.idecs.common.util.ws.soap.CustomSOAPFaultException;
import ru.nvg.idecs.privateoffice.ws.types.EServiceResult;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.StringWriter;
import java.util.Map;

public class NachodkaTwoRequestsCallWrapper extends CommonCallWrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(NachodkaTwoRequestsCallWrapper.class);
    private static final String ERROR_MESSAGE = "SERVICE_NAHODKA_ERROR_MESSAGE";
    private static final String BINDING_KEY = "uddi:gosuslugi.ru:services:nahodka_que";
    private static final String ACTION = "putQueSession";
    private static final String ACTION_RESPONSE = ACTION + "Response";
    public static String region = "";

    @Override
    public ServiceResult processResult(Element result, String processCode, Map<String, Object> context) {


        boolean orderCanBeCancelled = true;
        EServiceResult eServiceResult = new EServiceResult();
        ServiceResult serviceResult = new ServiceResult(eServiceResult, XmlUtils.serializeNode(result), true);
        if (LOGGER.isInfoEnabled()) {
            Transformer transformer = null;
            try {
                transformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            StringWriter sw = new StringWriter();
            Source source = new DOMSource(result);
            Result r = new StreamResult(sw);
            try {
                transformer.transform(source, r);
            }
            catch (TransformerException e) {
                e.printStackTrace();
            }
            LOGGER.info(sw.toString());
        }
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
            XPath xpath = XPathFactory.newInstance().newXPath();
            final Node requestType;
            try {
                requestType = (Node) xpath.evaluate("//*[local-name() = '" + ACTION_RESPONSE + "']", result, XPathConstants.NODE);
                if (requestType == null || requestType.getFirstChild() == null) {


                    eServiceResult.setExtOrderNumber(node.item(0).getChildNodes().item(1).getChildNodes().item(2).getTextContent());

                }
            } catch (XPathExpressionException e) {
                LOGGER.error(e.getLocalizedMessage());
            }

        }


        return new ServiceResult(eServiceResult, null, orderCanBeCancelled);
    }

    @Override
    public Element call(String eServiceId, String soapVersion, String endpoint, String soapAction, byte[] wrapRequest, Map<String, Object> context) {
        try {
            String request = new String(wrapRequest);
            String openingTag = "<typ:regionCode>";
            String closingTag = "</typ:regionCode>";

            int i = request.indexOf(openingTag);
            if (request.indexOf(openingTag) != -1) {
                region = request.substring(i + openingTag.length(),
                        request.indexOf(closingTag));
                region = region.substring(0, 2) + "000000000";
            }
            if (request.contains(ACTION)) {

                endpoint = ServiceClientFactory.getEndpoint(BINDING_KEY + "_" + region);

            }

            LOGGER.info("ENDPOINT: " + endpoint);
            return super.call(eServiceId, soapVersion, endpoint, soapAction, wrapRequest, context);
        } catch (CustomSOAPFaultException sfe) {
            String faultString = sfe.getFaultString();
            if (sfe.getFaultString().split(":").length > 1) {
                faultString = sfe.getFaultString().split(":")[1];
            }
            context.put(ERROR_MESSAGE, faultString);
            LOGGER.error("SOAP Fault: \"{}\" for service {}", faultString, eServiceId);
            return new ElementStub();
        }
    }
}
