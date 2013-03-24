package com.nvision.pgu.web.services.utils;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.*;

@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "TimeSlotsNakhodka",
        method = RequestMethod.GET)

public class TimeCustomLookUpControllerNakhodka extends AbstractCustomLookupController{
     private static Logger logger = LoggerFactory.getLogger(TimeCustomLookUpControllerNakhodka.class);
    private static final String CHARSET_NAME = "UTF-8";
    private static final String SOAP_ACTION = "getTimesQue";

    private static final MessageFormat SOAP_QUERY = new MessageFormat("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <wss:getTimesQue>\n" +
            "         <idZags>{0}</idZags>\n" +
            "         <datQue>{1}</datQue>\n" +
            "         <kindQue>{2}</kindQue>\n" +
            "      </wss:getTimesQue>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>");

    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex,
                                        String searchText, Map<String, String> optionsMap)
            throws LookupException {
        return getOrgs(null, optionsMap);
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        LookupItemsList itemsList = getOrgs(itemCode, optionsMap);
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }

        return null;
    }

    public static LookupItemsList getOrgs(String code, Map<String, String> optionsMap) {
        String okato = optionsMap.get("okato");
        String zagzId = optionsMap.get("zagzId").substring(0, 4);
        String date = optionsMap.get("date");

        String que_kind =  optionsMap.get("que_kind");
        if (null==que_kind) {
            que_kind = "AZ_POVT";
        }

        String endpoint = ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:nahodka_que_" + okato);

        String query = SOAP_QUERY.format(new String[]{zagzId,date,que_kind});
        String xmlResponse = Utils.sendSoap(endpoint, SOAP_ACTION, query);

        LookupItemsList itemsList = new LookupItemsList();
        List<String> values = new ArrayList<String>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));

            NodeList items = dom.getElementsByTagName("item");

            String hourQue = null;
            String minQue = null;
            String namKabinet = null;
            String typeQue = null;

            for (int i = 0; i < items.getLength(); ++i) {
                Node fchild = items.item(i).getFirstChild();

                do {
                    if (fchild.getNodeName().contains("hourQue")) {
                        hourQue = fchild.getTextContent();
                    }

                    if (fchild.getNodeName().contains("minQue")) {
                        minQue = fchild.getTextContent();
                    }

                    if (fchild.getNodeName().contains("namKabinet")) {
                        namKabinet = fchild.getTextContent();
                    }

                    if (fchild.getNodeName().contains("typeQue")) {
                        typeQue = fchild.getTextContent();
                    }

                } while ((fchild = fchild.getNextSibling()) != null);

                String time = formatNumber(hourQue) + ":" + formatNumber(minQue) + ":" + namKabinet + ":" + typeQue;
                values.add(time);
            }
        } catch (ParserConfigurationException e) {
            logger.error(e.getLocalizedMessage(), e);
        } catch (SAXException e) {
            logger.error(e.getLocalizedMessage(), e);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        }

        Collections.sort(values);
        for (String value : values){
            itemsList.add(value, value.substring(0, 5));
        }

        return itemsList;
    }

    private static String formatNumber(String num){
        return (num.length() == 1 ? "0" : "") + num;
    }
}
