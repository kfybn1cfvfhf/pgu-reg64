package com.nvision.pgu.web.services.utils;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.nvg.idecs.common.util.ws.WsUtils;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;


@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "MainDocTypeController", method = RequestMethod.GET)
public class MainDocTypeController extends AbstractCustomLookupController {

    private static Logger logger = LoggerFactory.getLogger(MainDocTypeController.class);

    private static final String QUERY_MAIN_DOC_LIST_SOAP =

        "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:prof=\"http://idecs.nvg.ru/personaldataservice/ws/common/profile/\">\n" +
        "   <soapenv:Header/>\n" +
        "   <soapenv:Body>\n" +
        "      <prof:getDictionaryRequest>\n" +
        "         <authToken>%s</authToken>\n" +
        "         <dictCode>2</dictCode>\n" +
        "      </prof:getDictionaryRequest>\n" +
        "   </soapenv:Body>\n" +
        "</soapenv:Envelope>";





    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
        return getInnList(null, optionsMap);
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        LookupItemsList itemsList = getInnList(itemCode, optionsMap);
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }
        return null;
    }

    public LookupItemsList getInnList(String code, Map<String, String> optionsMap) throws LookupException {

        String endpoint = ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:po/personaldataservice");
        String query = String.format(QUERY_MAIN_DOC_LIST_SOAP, optionsMap.get("authToken"));
        logger.debug("query:" + query);
        LookupItemsList itemsList = new LookupItemsList();
        try {

            Element el = WsUtils.invoke(endpoint, "http://idecs.nvg.ru/personaldataservice/ws/common/profile/getDictionary", query.getBytes("UTF-8"));

            //NodeList nl = el.getElementsByTagName("dictData");

            String id = null;
            String name = null;


            XPath xPath = XPathFactory.newInstance().newXPath();
            NodeList dicItems = (NodeList)xPath.evaluate("//dictData/dictData", el, XPathConstants.NODESET);

            for (int i = 0; i < dicItems.getLength(); i++) {
                Node fchild = dicItems.item(i).getFirstChild();
				do {
					if (fchild.getNodeName().contains("dictDataId"))
						id = fchild.getTextContent();
					if (fchild.getNodeName().contains("name"))
						name = fchild.getTextContent();
				} while ((fchild = fchild.getNextSibling()) != null);
                itemsList.add(id, name);
            }

        } catch (UnsupportedEncodingException e) {
			e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return itemsList;
    }
}
