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
import java.util.Calendar;
import java.util.Formatter;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: igavrilov
 * Date: 19.04.11
 * Time: 18:08
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "Nahodka_DateTimeZB_getTimesZB", method = RequestMethod.GET)
public class ZagsesTimesZBController extends AbstractCustomLookupController {
    private static Logger logger = LoggerFactory.getLogger(ZagsesTimesZBController.class);

    private static final String CHARSET_NAME = "UTF-8";

    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
        String zagsId = optionsMap.get("id_agency");
        String datZB = optionsMap.get("reg_date");
        String blTorj = "on".equals(optionsMap.get("reg_is_grand")) ? "ZB_TORG" : "ZB_NETORG";
        // лукап reg_hall поставляет в запрос содержимое reg_time,
        // с помощью этого можно определить что показывать время или наим. залов
        boolean isTimeToShow = !optionsMap.containsKey("reg_time");

        return getTimesZB(null, zagsId, datZB, blTorj, isTimeToShow, optionsMap);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        String zagsId = optionsMap.get("id_agency");
        String datZB = optionsMap.get("reg_date");
        String blTorj = "on".equals(optionsMap.get("reg_is_grand")) ? "ZB_TORG" : "ZB_NETORG";
        // лукап reg_hall поставляет в запрос содержимое reg_time,
        // с помощью этого можно определить что показывать время или наим. залов
        boolean isTimeToShow = !optionsMap.containsKey("reg_time");
        LookupItemsList itemsList = getTimesZB(null, zagsId, datZB, blTorj, isTimeToShow, optionsMap);
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }
        return null;
    }

    private static String getTimesZBSOAP(String zagsId, String datZB, String blTorj) {
		zagsId = zagsId.split("#")[0];
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getTimesZB>" +
                "<idZags>" + zagsId + "</idZags>" +
                "<datZB>" + datZB + "</datZB>" +
                "<torj>" + blTorj + "</torj>" +
                "</wss:getTimesZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    public static LookupItemsList getTimesZB(String code, String zagsId, String datZB, String blTorj, boolean isTimeToShow, Map<String, String> optionsMap) {
        String endpoint = CustomLookupUtil.findEndpoint(optionsMap, "Nahodka_DateTimeZB");
        logger.info("Endpoint: " + endpoint);

        String soapToSend = getTimesZBSOAP(zagsId, datZB, blTorj);
        logger.debug("XML:" + soapToSend);
        String xmlResponse = ZagsesUtils.sendSoap(endpoint, "", soapToSend);
        logger.debug("End xml:" + xmlResponse);

        LookupItemsList itemsList = new LookupItemsList();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));

            NodeList items = dom.getElementsByTagName("item");
            for (int i = 0; i < items.getLength(); ++i) {
                Node fChild = items.item(i).getFirstChild();
                String hourZB = "";
                String minZB = "";
                String namZal = "";

                Calendar calendar= Calendar.getInstance();

                do {
                    if ("hourZB".equals(fChild.getNodeName()))
                        hourZB = fChild.getTextContent();
                    if ("minZB".equals(fChild.getNodeName()))
                        minZB = fChild.getTextContent();
                        if(!"".equals(minZB)){
                            calendar.set(2000, 12, 31, Integer.parseInt(hourZB), Integer.parseInt(minZB));
                            Formatter formatter = new Formatter();
                            formatter.format("%tH", calendar);
                            hourZB = formatter.toString();
                            formatter = new Formatter();
                            formatter.format("%tM", calendar);
                            minZB = formatter.toString();
                        }
                    if ("namZal".equals(fChild.getNodeName()))
                        namZal = fChild.getTextContent();

                } while ((fChild = fChild.getNextSibling()) != null);

                String currCode = hourZB + "#" + minZB + "#" + namZal;
                String currText = namZal + " - " + hourZB + ":" + minZB;
                if (isTimeToShow) {
                    currText = hourZB + ":" + minZB + " - " + namZal;
                }

                if (code == null) {
                    itemsList.add(currCode, currText);
                } else if (code.equals(currCode)) {
                    itemsList.add(currCode, currText);
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
