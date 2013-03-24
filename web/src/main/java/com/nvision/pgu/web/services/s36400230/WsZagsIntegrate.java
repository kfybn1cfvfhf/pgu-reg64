package com.nvision.pgu.web.services.s36400230;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKoshenkova
 * Date: 09.03.11
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */
public class WsZagsIntegrate {

    private static final Logger logger = LoggerFactory.getLogger(WsZagsIntegrate.class);

    /**
     * Генерация запросов
     */

    private static String getZagsesSOAP() {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getZagses/>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static String getDaysZBSOAP(String zagsId, String minDat, String maxDat) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getDaysZB>" +
                "<arg0>" + zagsId + "</arg0>" +
                "<arg1>" +
                "<!--Optional:-->" +
                (maxDat == null || maxDat.isEmpty() ?"<maxDat/>" :"<maxDat>" + maxDat + "</maxDat>") +
                "<!--Optional:-->" +
                (minDat == null || minDat.isEmpty() ?"<minDat/>" : "<minDat>" + minDat + "</minDat>") +
                "</arg1>" +
                "</wss:getDaysZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static String getTimesZBSOAP(String zagsId, String datZB) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getTimesZB>" +
                "<arg0>" + zagsId + "</arg0>" +
                "<arg1>" + datZB + "</arg1>" +
                "<arg2/>" +
                "</wss:getTimesZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static final String wsEndpoint = "http://91.144.172.205:81/zagsportal/wsZagsIntegrate";
    private static final String wsSOAPAction = "";

    /**
     * Взаимодействие с веб-сервисом
     */

    private static String sendSoap(String xmlRequest) {
        //Устанавливаем соединение с хостом вебсервиса
        URL urlObj = null;
        URLConnection connection = null;

        try {
            urlObj = new URL(wsEndpoint);
            connection = urlObj.openConnection();
        } catch (MalformedURLException e1) {
            logger.error(("sendSoap 36400230: open connection URL malformed"),e1);
        } catch (IOException e1) {
            logger.error(("sendSoap 36400230: open connection io error "),e1);
        }

        HttpURLConnection httpConn = (HttpURLConnection) connection;

        //Настраиваем HTTP хидеры
        byte[] b = xmlRequest.getBytes(Charset.forName("UTF-8"));

        httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        httpConn.setRequestProperty("SOAPAction", wsSOAPAction);
        try {
            httpConn.setRequestMethod("POST");
        } catch (ProtocolException e) {
            logger.error("sendSoap 36400230: SOAP: ", e) ;
        }
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);

        //Отсылаем SOAP
        OutputStream out2 = null;
        try {
            out2 = httpConn.getOutputStream();
            out2.write(b);
            out2.close();
        } catch (IOException e) {
            logger.error(("sendSoap 36400230: send data io error "), e);
        }

//        return httpConn.getInputStream();

        String s = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));


            String ss;
            while ((ss = br.readLine()) != null) {
                s += ss;
            }
            if (logger.isDebugEnabled()) {
                logger.debug(s);
            }

        } catch (IOException e) {
            logger.error(("sendSoap 36400230: read buffered is io error "), e);
        }

        return s;
    }

    /**
     * Вызов метода и преобразование в JSONObject
     */
    public static JSONObject getZagses(String serial) {
        //Выкачка данных
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + wsEndpoint);
            logger.debug("XML:" + getZagsesSOAP());
        }
        String xmlResponse = sendSoap(getZagsesSOAP());
        if (logger.isDebugEnabled()) {
            logger.debug("End xml:" + xmlResponse);
        }


        //Парсинг
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db;
        Document dom = null;
        try {
            db = dbf.newDocumentBuilder();
            dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName("UTF-8"))));
        } catch (ParserConfigurationException e) {
            logger.error("getZagses 36400230: build document parse config ", e);
        } catch (SAXException e) {
            logger.error("getZagses 36400230: build document parse error", e);
        } catch (IOException e) {
            logger.error("getZagses 36400230: build document io error", e);
        }

        List<Zags> zagses = new ArrayList<Zags>();
        NodeList items = dom.getElementsByTagName("item");
        for (int i = 0; i < items.getLength(); ++i) {
            Node fchild = items.item(i).getFirstChild();
            String idZags = null;
            String nameZags = null;
            do {
                if ("idZags".equals(fchild.getNodeName()))
                    idZags = fchild.getTextContent();
                if ("nameZags".equals(fchild.getNodeName()))
                    nameZags = fchild.getTextContent();
            } while ((fchild = fchild.getNextSibling()) != null);
            zagses.add(new Zags(idZags, nameZags));
        }

        //перевод в JSON

        JSONObject resultObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();

        try {
            for (Zags zags : zagses) {
                JSONObject dicItemObject = new JSONObject();
                dicItemObject.put("code", zags.getIdZags());
                dicItemObject.put("text", zags.getNameZags());
                itemsArray.put(dicItemObject);
            }

            resultObject.put("items", itemsArray);
            resultObject.put("total", zagses.size());
            resultObject.put("title", "Список органов ЗАГС");
            resultObject.put("plain", "true");
            resultObject.put("serial", serial);
        } catch (JSONException e) {
            logger.error("getZagses 36400230: json ", e);
        }

        return resultObject;
    }

    public static JSONObject getDaysZB(String zagsId, String minDat, String maxDat, String serial){
        //Выкачка данных
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + wsEndpoint);
            logger.debug("XML:" + getDaysZBSOAP(zagsId,minDat,maxDat));
        }
        String xmlResponse = sendSoap(getDaysZBSOAP(zagsId,minDat,maxDat));
        if (logger.isDebugEnabled()) {
            logger.debug("End xml:" + xmlResponse);
        }

        //Парсинг
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db;
        Document dom = null;
        try {
            db = dbf.newDocumentBuilder();
            dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName("UTF-8"))));
        } catch (ParserConfigurationException e) {
            logger.error("getDaysZB 36400230: build document parse config ", e);
        } catch (SAXException e) {
            logger.error("getDaysZB 36400230: build document parse error", e);
        } catch (IOException e) {
            logger.error("getDaysZB 36400230: build document io error", e);
        }

        List<Date> daysZB = new ArrayList<Date>();
        NodeList items = dom.getElementsByTagName("item");
        for (int i = 0; i < items.getLength(); ++i) {
//            items.item(i).getTextContent()
//            daysZB.add( );
        }

        JSONObject resultObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();

        try {
            for (Date dayZB : daysZB) {
                JSONObject dicItemObject = new JSONObject();
                dicItemObject.put("code", dayZB);
                dicItemObject.put("text", dayZB.toString());
                itemsArray.put(dicItemObject);
            }

            resultObject.put("items", itemsArray);
            resultObject.put("total", daysZB.size());
            resultObject.put("title", "Список возможных дней регистрации брака");
            resultObject.put("plain", "true");
            resultObject.put("serial", serial);
        } catch (JSONException e) {
            logger.error("getDaysZB 36400230: json ", e);
        }

        return resultObject;
    }

    public static JSONObject getTimesZB(String zagsId, String datZB, String serial){
        //Выкачка данных
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + wsEndpoint);
            logger.debug("XML:" + getTimesZBSOAP(zagsId,datZB));
        }
        String xmlResponse = sendSoap(getTimesZBSOAP(zagsId,datZB));
        if (logger.isDebugEnabled()) {
            logger.debug("End xml:" + xmlResponse);
        }

        //Парсинг
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db;
        Document dom = null;
        try {
            db = dbf.newDocumentBuilder();
            dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName("UTF-8"))));
        } catch (ParserConfigurationException e) {
            logger.error("getTimesZB 36400230: build document parse config ", e);
        } catch (SAXException e) {
            logger.error("getTimesZB 36400230: build document parse error", e);
        } catch (IOException e) {
            logger.error("getTimesZB 36400230: build document io error", e);
        }

        //        <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsServerOut.zags.com/">
//           <soapenv:Header/>
//           <soapenv:Body>
//              <wss:getTimesZBResponse>
//                 <return>
//                    <!--Zero or more repetitions:-->
//                    <item>
//                       <blTorj>?</blTorj>
//                       <!--Optional:-->
//                       <dateZB>?</dateZB>
//                       <hourZB>?</hourZB>
//                       <minZB>?</minZB>
//                       <!--Optional:-->
//                       <namZal>?</namZal>
//                    </item>
//                 </return>
//              </wss:getTimesZBResponse>
//           </soapenv:Body>
//        </soapenv:Envelope>


        List<Date> daysZB = new ArrayList<Date>();
        NodeList items = dom.getElementsByTagName("item");
        for (int i = 0; i < items.getLength(); ++i) {
//            items.item(i).getTextContent()
//            daysZB.add( );
        }

        JSONObject resultObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();

        try {
            for (Date dayZB : daysZB) {
                JSONObject dicItemObject = new JSONObject();
                dicItemObject.put("code", dayZB);
                dicItemObject.put("text", dayZB.toString());
                itemsArray.put(dicItemObject);
            }

            resultObject.put("items", itemsArray);
            resultObject.put("total", daysZB.size());
            resultObject.put("title", "Список возможных дней регистрации брака");
            resultObject.put("plain", "true");
            resultObject.put("serial", serial);
        } catch (JSONException e) {
            logger.error("getTimesZB 36400230: json ", e);
        }

        return resultObject;


        //getTimesZBSOAP(String zagsId, String datZB)
//        return null;
    }






}
