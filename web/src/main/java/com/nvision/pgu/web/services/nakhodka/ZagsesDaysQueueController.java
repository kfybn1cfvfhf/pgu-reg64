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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author <a href="mailto:vmostovoy@at-consulting.ru">Mostovoy Vladislav</a>
 * @version $Revision$
 */
@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "Nahodka_DayQue", method = RequestMethod.GET)
public class ZagsesDaysQueueController extends AbstractCustomLookupController {

    private static Logger logger = LoggerFactory.getLogger(ZagsesDaysQueueController.class);

    private static final String CHARSET_NAME = "UTF-8";

    private static final String DAYS_QUEUE_SOAP = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://wsService.zags.com/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "<soapenv:Body>\n" +
            "<ns0:getDaysQue>\n" +
            "<idZags>%s</idZags> \n" +
            "<dateRange/> \n" +
            "<kindQue>%s</kindQue> \n" +
            "</ns0:getDaysQue>\n" +
            "</soapenv:Body>\n" +
            "</soapenv:Envelope>";

    private static final String MIN_MAX_SOAP = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://wsService.zags.com/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "<soapenv:Body>\n" +
            "<ns0:getDaysQue>\n" +
            "<idZags>%s</idZags> \n" +
            "<dateRange/> \n" +
            "<kindQue>%s</kindQue> \n" +
            "</ns0:getDaysQue>\n" +
            "</soapenv:Body>\n" +
            "</soapenv:Envelope>";

    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
        return getDaysQue(null, optionsMap.get("id_agency_in"), optionsMap.get("operation_type"), optionsMap);
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        LookupItemsList itemsList = getDaysQue(itemCode, optionsMap.get("id_agency_in"), optionsMap.get("operation_type"), optionsMap);
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }
        return null;
    }

    public static LookupItemsList getDaysQue(String code, String agencyId, String dateType, Map<String, String> optionsMap) {
        String upperDateType = dateType.toUpperCase();
        String daysQueueSoap = String.format(DAYS_QUEUE_SOAP, agencyId, dateType);
        logger.debug("XML:" + daysQueueSoap);

        String endpoint = CustomLookupUtil.findEndpoint(optionsMap, "nahodka_que");
        logger.info("Endpoint: " + endpoint);
        String xmlResponse = ZagsesUtils.sendSoap(endpoint, "", daysQueueSoap);
        logger.debug("End xml:" + xmlResponse);

        LookupItemsList itemsList = new LookupItemsList();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date toDay = new Date();

            NodeList items = dom.getElementsByTagName("item");
            for (int i = 0; i < items.getLength(); ++i) {
                Node fNode = items.item(i);

                String iCode = fNode.getTextContent();
                if (iCode == null)
                    continue;

                String iValue = iCode.substring(0, 10);
                try {
                    if (code == null) {
                        iValue = new SimpleDateFormat("dd.MM.yyyy").format(dateFormat.parse(iValue));//преобразование к формату dd.MM.yyyy
                        itemsList.add(iCode, iValue);
                    } else if (iCode.equals(code)) {
                        itemsList.add(iCode, iValue);
                        break;
                    }
                } catch (ParseException e) {
                    logger.error(e.getLocalizedMessage(), e);
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
