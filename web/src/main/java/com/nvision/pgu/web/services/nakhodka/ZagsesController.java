package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import com.nvision.pgu.web.services.s36400223.ZagsesUtils;
import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
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
import java.text.MessageFormat;
import java.util.*;

/**
 * @author <a href="mailto:vmostovoy@at-consulting.ru">Mostovoy Vladislav</a>
 * @version $Revision$
 */
@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "Nahodka_Zagses", method = RequestMethod.GET)
public class ZagsesController extends AbstractCustomLookupController {

	private static Logger logger = LoggerFactory.getLogger(ZagsesController.class);

	private static final String CHARSET_NAME = "UTF-8";

	private static final String ZAGSES_SOAP = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
			"	<soapenv:Header/>\n" +
			"	<soapenv:Body>\n" +
			"		<wss:getZagses/>\n" +
			"	</soapenv:Body>\n" +
			"</soapenv:Envelope>\n";
	
	private static final MessageFormat ZAGSES_SOAP_2 = new MessageFormat("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
				"	<soapenv:Header/>\n" +
				"	<soapenv:Body>\n" +
				"		<wss:getExtZagsesByGroup>\n" +
				"			<typeAZ>{0}</typeAZ>\n" +
				"		</wss:getExtZagsesByGroup>\n" +
				"	</soapenv:Body>\n" +
				"</soapenv:Envelope>\n");

	@Override
	public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
		return getZagses(null, optionsMap);
	}

	@Override
	public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
		LookupItemsList itemsList = getZagses(itemCode, optionsMap);
		if (itemsList.iterator().hasNext()) {
			return itemsList.get(itemCode).getText();
		}
		return null;
	}

	/**
	 * Вызов метода и преобразование в JSONObject
	 *
	 * Использует optionsMap.get("method")
	 * Если он равен "36400224", то используется метод getExtZagsesByGroup
	 *
	 * Использует optionsMap.get("typeAZ"), по умолчанию typeAZ = "AZ_ZB" (см. ZAGSES_SOAP_2)
	 *
     * @pargam code
     * @param optionsMap
     * @return
	 */
	public static LookupItemsList getZagses(String code, Map<String, String> optionsMap) {
		String request="", method = "", typeAZ = "AZ_RB";
        if(StringUtils.isNotBlank(optionsMap.get("typeAZ"))){
            typeAZ=optionsMap.get("typeAZ");
        }

		//если передали специальный для 36400224 параметр через optionsMap:
		if (optionsMap.get("method") != null && optionsMap.get("method").equals("36400224")) { // не менять этот фрагмент, сделано для 36400224
			method = "getExtZagsesByGroup";
			request = ZAGSES_SOAP_2.format(new String[]{typeAZ});
			logger.info("XML:\n\n" + request);
	        final String endpoint = CustomLookupUtil.findEndpoint(optionsMap, "nahodka_zagses");
			logger.info("METHOD: " + method);
	        String xmlResponse = ZagsesUtils.sendSoap(endpoint, method, request);
			return getSortLookupItemsList(parseGetExtZagsesByGroupResponce(xmlResponse, code));
		}

        if (optionsMap.get("method") != null && optionsMap.get("method").equals("getExtZagsesByGroup")) {
            method = "getExtZagsesByGroup";
            request = ZAGSES_SOAP_2.format(new String[]{typeAZ});
            logger.info("XML:\n\n" + request);
            final String endpoint = CustomLookupUtil.findEndpoint(optionsMap, "nahodka_zagses");
            logger.info("METHOD: " + method);
            String xmlResponse = ZagsesUtils.sendSoap(endpoint, method, request);
            return getSortLookupItemsList(parseGetExtZagsesByGroupResponce(xmlResponse, code));
        }

		//так было изначально; если ничего дополнительно не передавали:
		if (optionsMap.get("method") == null || optionsMap.get("method").isEmpty() || optionsMap.get("method") == "default") { // не менять, рассчитанно на нетронутые услуги
			method = "getZagses";
			request = ZAGSES_SOAP;
			logger.info("XML:\n\n" + request);
	        final String endpoint_default = CustomLookupUtil.findEndpoint(optionsMap, "nahodka_zagses");
			logger.info("METHOD: " + method);
	        String xmlResponse = ZagsesUtils.sendSoap(endpoint_default, method, request);

			LookupItemsList itemsList = new LookupItemsList();
			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));
	
				NodeList items = dom.getElementsByTagName("item");

				for (int i = 0; i < items.getLength(); ++i) {
					Node fchild = items.item(i).getFirstChild();
	
					String idZags = null;
	                String idZagsOnly = null;
					String addrHttp = null;
					String addrZags = null;
					String telephMain = null;
					String nameZags = null;


					do {
						if ("idZags".equals(fchild.getNodeName()))
							idZags = fchild.getTextContent();
	                        idZagsOnly = idZags;
						if ("telephMain".equals(fchild.getNodeName()))
							telephMain = fchild.getTextContent();
						if ("adresHttp".equals(fchild.getNodeName()))
							addrHttp = fchild.getTextContent();
						if ("adresZags".equals(fchild.getNodeName()))
							addrZags = extractZagsAddress(fchild);
						if ("nameZags".equals(fchild.getNodeName()))
							nameZags = fchild.getTextContent();
					} while ((fchild = fchild.getNextSibling()) != null);

                    //telephMain = "(123)1234567";
                    //addrZags = "address";
					idZags = String.format("%s#%s#%s#%s#%s", idZags, nameZags, telephMain, addrHttp, addrZags);
	                org.json.JSONObject address = new org.json.JSONObject();
	                address.put("idZagsOnly",idZagsOnly);
	                address.put("telephMain",telephMain);
	                address.put("adresHttp",addrHttp);
	                address.put("addrZags",addrZags);
					if (code == null) {

                        itemsList.add(idZags, nameZags,address);
					} else if (code.equals(idZagsOnly)) {
						itemsList.add(idZags, nameZags,address);
						break;
					}
				}
	            //Collections.sort(itemsList.subList(0, itemsList.size()), sortItemNameCompare);
			} catch (ParserConfigurationException e) {
				logger.error(e.getLocalizedMessage(), e);
	
			} catch (SAXException e) {
				logger.error(e.getLocalizedMessage(), e);
	
			} catch (IOException e) {
				logger.error(e.getLocalizedMessage(), e);
			} catch (JSONException e){
	            logger.error(e.getLocalizedMessage(), e);
	        }
			
	        return getSortLookupItemsList(itemsList);
		}
		return null;
	}

	/**
	 * Парсит ответ метода GetExtZagsesByGroupResponce (используется в 99041, не менять)
	 * @param xmlResponse полученный xml
	 * @param code
	 * @return
	 */
	private static LookupItemsList parseGetExtZagsesByGroupResponce(String xmlResponse, String code) {
		LookupItemsList itemsList = new LookupItemsList();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName(CHARSET_NAME))));

			NodeList zagses = dom.getElementsByTagName("zagses");
			logger.info("Total zagses: " + zagses.getLength());
			for (int i = 0; i < zagses.getLength(); ++i) {
				Node fchild = zagses.item(i).getFirstChild();
                if(fchild==null)
                {
                    break;
                }

				String idZags = null;
                String idZagsOnly = null;
				String addrHttp = null;
				String addrZags = null;
				String telephMain = null;
				String nameZags = null;
                if(fchild!=null){
				do {
					if ("idZags".equals(fchild.getNodeName())) {
						idZags = fchild.getTextContent();
                        idZagsOnly = idZags;
                    }
					if ("telephMain".equals(fchild.getNodeName()))
						telephMain = fchild.getTextContent();
					if ("adresHttp".equals(fchild.getNodeName()))
						addrHttp = fchild.getTextContent();
					if ("adresZags".equals(fchild.getNodeName()))
						addrZags = extractZagsAddress(fchild);
					if ("nameZags".equals(fchild.getNodeName()))
						nameZags = fchild.getTextContent();
				} while ((fchild = fchild.getNextSibling()) != null);

				idZags = String.format("%s#%s#%s#%s#%s", idZags, nameZags, telephMain, addrHttp, addrZags);
                org.json.JSONObject address = new org.json.JSONObject();
                address.put("idZagsOnly",idZagsOnly);
                address.put("telephMain",telephMain);
                address.put("adresHttp",addrHttp);
                address.put("addrZags",addrZags);
                    if (code == null) {
					itemsList.add(idZags, nameZags,address);
				} else if (code.equals(idZags)) {
					itemsList.add(idZags, nameZags,address);
					break;
				}
			}
            }
		} catch (ParserConfigurationException e) {
			logger.error(e.getLocalizedMessage(), e);

		} catch (SAXException e) {
			logger.error(e.getLocalizedMessage(), e);

		} catch (IOException e) {
			logger.error(e.getLocalizedMessage(), e);
		} catch (JSONException e){
            logger.error(e.getLocalizedMessage(), e);
        }
		
		return itemsList;
	}

    private static LookupItemsList getSortLookupItemsList(LookupItemsList lookupItemsList){
        List<LookupItemsList.LookupItem> itemList = new ArrayList<LookupItemsList.LookupItem>();
        for(LookupItemsList.LookupItem lookupItem : lookupItemsList) {
            itemList.add(lookupItem);
        }
        Collections.sort(itemList, sortItemNameCompare);
        LookupItemsList sortLookupItemList = new LookupItemsList();
        for(LookupItemsList.LookupItem lookupItem : itemList){
            sortLookupItemList.add(lookupItem);
        }
        return sortLookupItemList;
    }

	private static String extractZagsAddress(Node node) {
		Assert.notNull(node, "Argument node must be not null");

		String gos = null;
		String subGos = null;
		String rayon = null;
		String nasPun = null;
		String typeNP = null;
		String street = null;
		String typeStr = null;
		String house = null;
		String korp = null;

		Node fСhild = node.getFirstChild();

		do {
			if ("gos".equals(fСhild.getNodeName()))
				gos = fСhild.getTextContent();

			if ("subGos".equals(fСhild.getNodeName()))
				subGos = fСhild.getTextContent();

			if ("rayon".equals(fСhild.getNodeName()))
				rayon = fСhild.getTextContent();

			if ("nasPun".equals(fСhild.getNodeName()))
				nasPun = fСhild.getTextContent();

			if ("typeNP".equals(fСhild.getNodeName()))
				typeNP = fСhild.getTextContent();

			if ("street".equals(fСhild.getNodeName()))
				street = fСhild.getTextContent();

			if ("typeStr".equals(fСhild.getNodeName()))
				typeStr = fСhild.getTextContent();

			if ("house".equals(fСhild.getNodeName()))
				house = fСhild.getTextContent();

			if ("korp".equals(fСhild.getNodeName()))
				korp = fСhild.getTextContent();

		} while ((fСhild = fСhild.getNextSibling()) != null);

		StringBuilder address = new StringBuilder();
		if(!StringUtils.isEmpty(gos))
			address.append(gos).append(", ");
		if(!StringUtils.isEmpty(subGos))
			address.append(subGos).append(", ");
		if(!StringUtils.isEmpty(rayon))
			address.append(rayon).append(", ");
		if(!StringUtils.isEmpty(typeNP))
			address.append(typeNP).append(" ");
		if(!StringUtils.isEmpty(nasPun))
			address.append(nasPun).append(", ");
		if(!StringUtils.isEmpty(typeStr))
			address.append(typeStr).append(" ");
		if(!StringUtils.isEmpty(street))
			address.append(street).append(", ");
		if(!StringUtils.isEmpty(house))
			address.append("д. ").append(house).append(" ");
		if(!StringUtils.isEmpty(korp))
			address.append("кор. ").append(korp);
		address.append(".");

		return address.toString();
	}

    static Comparator<LookupItemsList.LookupItem> sortItemNameCompare = new Comparator<LookupItemsList.LookupItem>() {

        public int compare(LookupItemsList.LookupItem item1, LookupItemsList.LookupItem item2) {
            return item1.getText().compareToIgnoreCase(item2.getText());
        }
    };

}
