package com.nvision.pgu.web.services.nakhodka;

import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.dao.LookupItemsList.LookupItem;
import com.nvision.pgu.util.WsUtils;
import com.nvision.pgu.web.controller.AbstractCustomLookupController;
import com.nvision.pgu.web.controller.lookup.LookupException;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: gsa
 * Date: 29.04.11
 * Time: 0:24
 * To change this template use File | Settings | File Templates.
 */
//   public static final java.lang.String MAPPING_BASE = "/widgets/customLookup/";

@Controller
@RequestMapping(value = AbstractCustomLookupController.MAPPING_BASE + "Service36400228SoapLookupZags", method = RequestMethod.GET)
public class Service36400228SoapLookupZags extends AbstractCustomLookupController {
    private static Logger logger = LoggerFactory.getLogger(Service36400228SoapLookupZags.class);


    @Override
    public LookupItemsList getItemsList(String parentItemCode, Integer itemsPerPage, Integer pageIndex, String searchText, Map<String, String> optionsMap) throws LookupException {
        return getListProfile(parentItemCode, "36400228", optionsMap);  //TODO заменить на рельный номер услуги
    }

    @Override
    public String getValueByCode(String itemCode, Map<String, String> optionsMap) throws LookupException {
        LookupItemsList itemsList = getListProfile(itemCode, "36400228", optionsMap); //TODO заменить на рельный номер услуги
        if (itemsList.iterator().hasNext()) {
            return itemsList.get(itemCode).getText();
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private MessageFormat getListProfileSOAP(String profile_id, String opt_account_id) {
        return new MessageFormat("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">"+
                "<soapenv:Header/>"+
                "<soapenv:Body>"+
                "<wss:getExtZagsesByGroup> " +
                "<typeAZ>{0}</typeAZ>" +
                "</wss:getExtZagsesByGroup> "+
                "</soapenv:Body>"    +
                "</soapenv:Envelope> ") ;
    }

    private LookupItemsList getListProfile(String itemCode, String serviceId, Map<String, String> optionsMap) {
        final String endpoint = CustomLookupUtil.findEndpoint(optionsMap, "nahodka_zagses");
        String typeAz=optionsMap.get("typeAZ");
        if(typeAz==null)
        {
            typeAz="AZ_ZB";
        }
        logger.info("Endpoint: " + endpoint);
        logger.info("Message: " +getListProfileSOAP(itemCode, "0").format(new String[]{typeAz}));
        Element rootEl = WsUtils.invoke(endpoint, "", getListProfileSOAP(itemCode, "0").format(new String[]{typeAz}).getBytes(Charset.forName("UTF-8")));
        NodeList nl = rootEl.getElementsByTagName("item");

        LookupItemsList itemsList = new LookupItemsList();
        if (nl != null && nl.getLength() > 0) {
            for (int i = 0; i < nl.getLength(); ++i) {
                Node curNode = nl.item(i).getFirstChild();

                boolean elemValid = false;
                String name = null;
                String id = null;
                org.json.JSONObject address = new org.json.JSONObject();
                do {
                    if("zagses".equals(curNode.getNodeName()))
                    {
                      curNode=curNode.getFirstChild();
                    }
                    if ("idZags".equals(curNode.getNodeName())) {
                        id = curNode.getTextContent();
                        elemValid = true;
                    }
                    if ("nameZags".equals(curNode.getNodeName())) {
                        name = curNode.getTextContent();
                        elemValid = true;
                    }


//                        <adresZags>
//                           <gos>Российская Федерация</gos>
//                           <subGos>Астраханская область</subGos>
//                           <rayon/>
//                           <gorod/>
//                           <nasPun>Астрахань</nasPun>
//                           <typeNP>г.</typeNP>
//                           <street>Академика Королева</street>
//                           <typeStr>ул.</typeStr>
//                           <house>26</house>
//                           <korp/>
//                           <kvart/>
//                           <indMal/>
//                        </adresZags>
//   Строка должна быть   <gos, subGos, rayon, typeNP nasPun, typeStr street, д. house, корп. korp>

                    if ("adresZags".equals(curNode.getNodeName())) {
                        try {
                            Node nodeAddr = curNode.getFirstChild();
                            do {
                                address.put(nodeAddr.getNodeName(), nodeAddr.getTextContent());
                            } while ((nodeAddr = nodeAddr.getNextSibling()) != null);
                            String fullAdr = "Адрес: ";
                            String s = "";
                            if (!"".equals(s = address.getString("gos"))) fullAdr += s;
                            if (!"".equals(s = address.getString("subGos"))) fullAdr += ", " + s;
                            if (!"".equals(s = address.getString("rayon"))) fullAdr += ", " + s;
                            if (!"".equals(s = address.getString("typeNP"))) fullAdr += ", " + s + " ";
                            if (!"".equals(s = address.getString("nasPun"))) fullAdr += s;
                            if (!"".equals(s = address.getString("typeStr"))) fullAdr += ", " + s + " ";
                            if (!"".equals(s = address.getString("street"))) fullAdr += s;
                            if (!"".equals(s = address.getString("house"))) fullAdr += ", " + "д. " + s;
                            if (!"".equals(s = address.getString("korp"))) fullAdr += ", " + "корп. " + s;
                            fullAdr += ".";
                            address.put("fullAdr", fullAdr);
                        } catch (JSONException e) {
                            logger.error(e.getLocalizedMessage(), e);
                        }
                        elemValid = true;
                    }
                    //Заполняем телефон
                    if ("telephMain".equals(curNode.getNodeName())) {
                        try {
                            String telephMain =curNode.getTextContent();
                            address.put("telephMain", telephMain);
                        } catch (JSONException e) {
                            logger.error(e.getLocalizedMessage(), e);
                        }
                        elemValid = true;
                    }
                    //Заполняем адрес сайта
                    if ("adresHttp".equals(curNode.getNodeName())) {
                        try {
                            String adresHttp =curNode.getTextContent();
                            address.put("adresHttp", adresHttp);
                        } catch (JSONException e) {
                            logger.error(e.getLocalizedMessage(), e);
                        }
                        elemValid = true;
                    }
                } while ((curNode = curNode.getNextSibling()) != null);
                if (elemValid) {
                    itemsList.add(id, name, address);
                }
            }
            // 13/01/2012 Pishnyuk
            //Collections.sort((List <LookupItem>) (itemsList.subList(0, itemsList.size())), sortItemNameCompare);
        }
        //return itemsList;
        return getSortLookupItemsList(itemsList);
    }

    private static LookupItemsList getSortLookupItemsList(LookupItemsList lookupItemsList){
        List<LookupItemsList.LookupItem> itemList = new ArrayList<LookupItem>();
        for(LookupItemsList.LookupItem lookupItem : lookupItemsList){
            itemList.add(lookupItem);
        }
        Collections.sort(itemList, sortItemNameCompare);
        LookupItemsList sortLookupItemList = new LookupItemsList();
        for(LookupItemsList.LookupItem lookupItem : itemList){
            sortLookupItemList.add(lookupItem);
        }
        return sortLookupItemList;
    }

    static Comparator<LookupItem> sortItemNameCompare = new Comparator<LookupItem>() {

        public int compare(LookupItem item1, LookupItem item2) {
            return item1.getText().compareToIgnoreCase(item2.getText());
        }
    };

}
