package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import com.nvision.pgu.web.services.s36400223.ZagsesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: igavrilov
 * Date: 19.04.11
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "Nahodka_DateTimeZB_getDaysZB", method = RequestMethod.GET)
public class ZagsesDaysZBController extends AbstractCustomLookupController {
    private static Logger logger = LoggerFactory.getLogger(ZagsesDaysZBController.class);

    private static final String CHARSET_NAME = "UTF-8";

    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
        String zagsId = optionsMap.get("id_agency");
        String blTorj = "on".equals(optionsMap.get("reg_is_grand")) ? "ZB_TORG" : "ZB_NETORG";
        return getDaysZB(null, zagsId, blTorj, optionsMap);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        String zagsId = optionsMap.get("id_agency");
        String blTorj = "on".equals(optionsMap.get("reg_is_grand")) ? "ZB_TORG" : "ZB_NETORG";
        LookupItemsList itemsList = getDaysZB(itemCode, zagsId, blTorj, optionsMap);
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private static String getMinMaxDaysZBSOAP(String zagsId, String blTorj) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getMinMaxDaysZB>" +
                "<idZags>" + zagsId + "</idZags>" +
                "<torj>" + blTorj + "</torj>" +
                "</wss:getMinMaxDaysZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static String getDaysSOAP(String zagsId, String blTorj) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getDaysZB>" +
                "<idZags>" + zagsId + "</idZags>" +
                "<torj>" + blTorj + "</torj>" +
                "</wss:getDaysZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static String getDaysZBSOAP(String zagsId, String minDat, String maxDat, String blTorj) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getDaysZB>" +
                "<idZags>" + zagsId + "</idZags>" +
                "<dateRange>" +
                (minDat == null || minDat.isEmpty() ? "<minDat/>" : "<minDat>" + minDat + "</minDat>") +
                (maxDat == null || maxDat.isEmpty() ? "<maxDat/>" : "<maxDat>" + maxDat + "</maxDat>") +
                "</dateRange>" +
                "<torj>" + blTorj + "</torj>" +
                "</wss:getDaysZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static Map<String, String> getMinMaxDaysZB(String zagsId, String blTorj, Map<String, String> optionsMap) {
        //Выкачка данных
        String endpoint = CustomLookupUtil.findEndpoint(optionsMap, "Nahodka_DateTimeZB");
//		logger.info("Endpoint: " + endpoint);
		String soapToSend = getMinMaxDaysZBSOAP(zagsId, blTorj);
//		logger.info("XML:" + soapToSend);
		String xmlResponse = ZagsesUtils.sendSoap(endpoint, "", soapToSend);
//		logger.info("End xml (response):" + xmlResponse);


        //Парсинг
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db;
        Document dom = null;
        try {
            db = dbf.newDocumentBuilder();
            dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName("UTF-8"))));
        } catch (ParserConfigurationException e) {
            logger.error(e.getLocalizedMessage(), e);
        } catch (SAXException e) {
            logger.error(e.getLocalizedMessage(), e);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        }

        NodeList maxDatL = dom.getElementsByTagName("maxDat");
        NodeList minDatL = dom.getElementsByTagName("minDat");

        if ((maxDatL != null) && (minDatL != null)) {
            Map<String, String> m = new HashMap<String, String>();
            m.put("minDat", minDatL.item(0).getTextContent());
            m.put("maxDat", maxDatL.item(0).getTextContent());
//            m.put("maxDat", minDatL.item(0).getTextContent());
//            m.put("minDat", maxDatL.item(0).getTextContent());

            return m;
        }

        return null;
    }

    public static LookupItemsList getDaysZB(String code, String zagsId, String blTorj, Map<String, String> optionsMap) {
        Map<String, String> minMaxDays = null;
		zagsId = zagsId.split("#")[0]; //zagsid выглядит как: 0070#Загс района...
      /*  if ((minMaxDays = getMinMaxDaysZB(zagsId, blTorj, optionsMap)) == null) {
            logger.error("failed to call getMinMaxDaysZB");
            return null;
        }       */

        String endpoint = ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:Nahodka_DateTimeZB_" + CustomLookupUtil.extractRegion(optionsMap));
//		logger.info("End:" + endpoint);
		String soapToSend = getDaysSOAP(zagsId, blTorj);//getDaysZBSOAP(zagsId, minMaxDays.get("minDat"), minMaxDays.get("maxDat"), blTorj);
//		logger.info("XML:" + soapToSend);
		String xmlResponse = ZagsesUtils.sendSoap(endpoint, "", soapToSend);
//		logger.info("End xml:" + xmlResponse);

        LookupItemsList itemsList = new LookupItemsList();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));

            NodeList items = dom.getElementsByTagName("item");
            for (int i = 0; i < items.getLength(); ++i) {
                String dayItem = items.item(i).getTextContent();

                String dateConv = null;
                XMLGregorianCalendar xgc = null;
                try {
                    xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(dayItem);
                } catch (DatatypeConfigurationException e) {
                    logger.error(e.getLocalizedMessage(), e);
                }
                Date dayItemAsDate = xgc.toGregorianCalendar().getTime();
                dateConv = (new SimpleDateFormat("dd.MM.yyyy")).format(dayItemAsDate);


                if (code == null) {
                    itemsList.add(dayItem, dateConv);
                } else if (code.equals(dayItem)) {
                    itemsList.add(dayItem, dateConv);
                    break;
                }
            }
        } catch (ParserConfigurationException e) {
            logger.error(e.getLocalizedMessage(), e);

        } catch (SAXException e) {
            logger.error(e.getLocalizedMessage(), e);

        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        }

        return itemsList;
    }

}
