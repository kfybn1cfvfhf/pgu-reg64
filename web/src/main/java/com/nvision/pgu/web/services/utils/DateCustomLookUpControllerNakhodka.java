package com.nvision.pgu.web.services.utils;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import org.json.JSONException;
import org.json.JSONObject;
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
import java.util.Map;

@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "DateSlotsNakhodka",
        method = RequestMethod.GET)

public class DateCustomLookUpControllerNakhodka extends AbstractCustomLookupController{
     private static Logger logger = LoggerFactory.getLogger(DateCustomLookUpControllerNakhodka.class);
    private static final String CHARSET_NAME = "UTF-8";
    private static final String SOAP_ACTION = "getDaysQue";

    private static final MessageFormat SOAP_QUERY = new MessageFormat("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <wss:getDaysQue>\n" +
            "         <idZags>{0}</idZags>\n" +
            "         <dateRange>\n" +
            "            <!--Optional:-->\n" +
            "            <minDat></minDat>\n" +
            "            <!--Optional:-->\n" +
            "            <maxDat></maxDat>\n" +
            "         </dateRange>\n" +
            "         <kindQue>{1}</kindQue>\n" +
            "      </wss:getDaysQue>\n" +
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
        String id_agency_in = optionsMap.get("id_agency_in").substring(0, 4);

        String que_kind =  optionsMap.get("que_kind");
        if (null==que_kind) {
            que_kind = "AZ_POVT";
        }

       String endpoint = ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:nahodka_que_" + okato);

        String query = SOAP_QUERY.format(new String[]{id_agency_in,que_kind});
        String xmlResponse = Utils.sendSoap(endpoint, SOAP_ACTION, query);

        LookupItemsList itemsList = new LookupItemsList();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));

            NodeList items = dom.getElementsByTagName("item");
            JSONObject attr;

            for (int i = 0; i < items.getLength(); ++i) {
                Node itemNode = items.item(i);
                String item = itemNode.getTextContent().substring(0, 10);

                attr = new JSONObject();
                try {
                      attr.append("item", item);
                } catch (JSONException e) {
                    logger.error(e.getLocalizedMessage(), e);
                }

                 itemsList.add(item, item);
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
