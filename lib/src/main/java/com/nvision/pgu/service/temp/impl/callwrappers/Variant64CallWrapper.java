package com.nvision.pgu.service.temp.impl.callwrappers;

import com.nvision.pgu.service.core.impl.callwrappers.MR243CallWrapper;
import com.nvision.pgu.service.core.model.OrderStatus;
import com.nvision.pgu.service.core.model.ServiceResult;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import ru.nvg.idecs.common.util.ws.XmlUtils;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Map;


import org.apache.commons.lang.StringUtils;
import ru.nvg.idecs.common.util.ws.IOUtils;
import ru.nvg.idecs.privateoffice.ws.types.Document;
import ru.nvg.idecs.privateoffice.ws.types.Documents;
import ru.nvg.idecs.privateoffice.ws.types.EServiceResult;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;


public class Variant64CallWrapper extends MR243CallWrapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(Variant64CallWrapper.class);

    @Override
    protected String buildSoapXml(final Map<String, Object> xmlContext, final byte[] data, final long orderId,
                                  Map<String, Object> context) throws IOException, TemplateException {
        if (context.get("AUTH_TOKEN") == null) {
            throw new RuntimeException("Authtoken not found");
        }
        xmlContext.put("typeCode", "GSRV");
        xmlContext.put("status", "REQUEST");
        xmlContext.put("exchangeType", "1");

        String request = super.buildSoapXml(xmlContext, data, orderId, context);

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(request);
        }
        return request;
    }

    @Override
    protected String sign(String xml) throws IOException, NoSuchAlgorithmException, KeyStoreException, CertificateException {
        String sign = super.sign(xml);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(sign);
        }

        return sign;    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public ServiceResult processResult(Element result, String processCode, Map<String, Object> context) {
        ServiceResult serviceResult = new ServiceResult();
        if (null != result) {

            XPath xpath = XPathFactory.newInstance().newXPath();
            try {
                final int errorCode = Integer.parseInt(xpath.evaluate("//*[name() = 'id']", result));
                final String description = xpath.evaluate("//*[name() = 'infostring']", result);

                boolean isCorrectResponse = errorCode > 0;
                serviceResult.setState(isCorrectResponse ? ServiceResult.RESULT: ServiceResult.INPUT_ERROR);

                EServiceResult eServiceResult = new EServiceResult();
                eServiceResult.setComment(description);

                eServiceResult.setOrderStatusId(String.valueOf(isCorrectResponse ? OrderStatus.STATUS_EXECUTED.getId() : OrderStatus.STATUS_ERROR_SEND_TO_DEPARTMENT.getId()));

                final String docfile = xpath.evaluate("//*[name() = 'BinaryData']", result);
                if(!docfile.equals("")){
                    eServiceResult.setDocuments(new Documents());

                    final Document doc = new Document();
                    doc.setDocumentId("documentId");
                    doc.setDocumentName("documentName");
                    doc.setDocumentTypeCode("documentTypeCode");
                    doc.setDocumentName("Результат");

                    final String mimeType = xpath.evaluate("//*[name() = 'reportfiletype']", result);
                    if(!StringUtils.isEmpty(mimeType)){
                        if(mimeType.contains("zip"))
                            doc.setDocumentName("Результат.zip");
                        doc.setMimeType(mimeType.trim());
                    }

                    byte[] data = IOUtils.decodeBase64(docfile);
                    final DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(data, "UTF-8"));
                    doc.setContent(dataHandler);

                    eServiceResult.getDocuments().getDocument().add(doc);
                }

                serviceResult.setResponseServiceResult(eServiceResult);
                serviceResult.setHasResult(true);

                serviceResult.setContent("");

            } catch (XPathExpressionException e) {
                LOGGER.info("Cannot find return node", e);
            }
        }

        serviceResult.addData("IS_SUCCESS", String.valueOf(serviceResult.getState() == ServiceResult.RESULT));

        return serviceResult;
    }
}