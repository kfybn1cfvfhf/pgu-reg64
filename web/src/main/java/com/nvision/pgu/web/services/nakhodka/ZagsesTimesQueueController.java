package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import com.nvision.pgu.web.services.s36400223.ZagsesUtils;
import org.apache.commons.lang.StringUtils;
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
import java.util.Map;

/**
 * @author <a href="mailto:vmostovoy@at-consulting.ru">Mostovoy Vladislav</a>
 * @version $Revision$
 */
@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "Nahodka_TimeQue", method = RequestMethod.GET)
public class ZagsesTimesQueueController extends AbstractCustomLookupController {

	private static Logger logger = LoggerFactory.getLogger(ZagsesTimesQueueController.class);

	private static final String CHARSET_NAME = "UTF-8";

		private static final String TIMES_QUEUE_SOAP = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
			"   <soapenv:Header/>\n" +
			"   <soapenv:Body>\n" +
			"      <wss:getTimesQue>\n" +
			"         <idZags>%s</idZags>\n" +
			"         <datQue>%s</datQue>\n" +
			"         <kindQue>%s</kindQue>\n" +
			"      </wss:getTimesQue>\n" +
			"   </soapenv:Body>\n" +
			"</soapenv:Envelope>";

	@Override
	public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
		return getTimesQue(null, parentItemCode, optionsMap.get("id_agency_in"), optionsMap.get("operation_type"), optionsMap);
	}

	@Override
	public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
		if(itemCode == null){
			return null;
		}
		String parentItemCode = itemCode.split("#")[0];
		LookupItemsList itemsList = getTimesQue(itemCode, parentItemCode, optionsMap.get("id_agency_in"), optionsMap.get("operation_type"), optionsMap);
		if(itemsList.iterator().hasNext()){
			return itemsList.get(itemCode).getText();
		}
		return null;
	}

	public static LookupItemsList getTimesQue(String code, String date, String agencyId, String timeType, Map<String, String> optionsMap) {
        String upperTimeType=timeType.toUpperCase();
		String daysQueueSoap = String.format(TIMES_QUEUE_SOAP, agencyId, date, upperTimeType);
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

			NodeList items = dom.getElementsByTagName("item");
			for (int i = 0; i < items.getLength(); ++i) {

				StringBuilder time = new StringBuilder(date).append("#");

				Node fNode = items.item(i).getFirstChild();
				do {
					String nValue = fNode.getTextContent();
					if(nValue == null)
						continue;

					if ("hourQue".equals(fNode.getNodeName())){
						time.append(StringUtils.leftPad(nValue, 2, "0"));
						time.append(":");
					} else if ("minQue".equals(fNode.getNodeName())){
						time.append(StringUtils.rightPad(nValue, 2, "0"));
						time.append("#");
					} else if ("namKabinet".equals(fNode.getNodeName())){
						time.append(nValue);
					}
				} while ((fNode = fNode.getNextSibling()) != null);

				String message;
                String[] messageList = time.toString().split("#");
                if(messageList.length > 2)
                    message =  messageList[1]+ " - " + messageList[2];
                else
                    message =  messageList[1];
                if(code == null){
					itemsList.add(time.toString(), message);

				} else if(code.equals(time.toString())){
					itemsList.add(time.toString(), message);
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
