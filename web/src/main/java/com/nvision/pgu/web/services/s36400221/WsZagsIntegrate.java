package com.nvision.pgu.web.services.s36400221;

import com.nvision.pgu.web.services.s36400221.entities.Zags;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WsZagsIntegrate {
    /**
     * Генерация запросов
     */

	private static Logger logger = LoggerFactory.getLogger(WsZagsIntegrate.class);

	private static final String DAYS_QUEUE_SOAP = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
				"<soapenv:Header/>" +
				"<soapenv:Body>" +
				"<wss:getDaysQue>" +
				"<arg0>%s</arg0>" +
				"<arg1/>" +
				"<arg2>AZ_SM</arg2>" +
				"</wss:getDaysQue>" +
				"</soapenv:Body>" +
				"</soapenv:Envelope>";

	private static final String TIMES_QUEUE_SOAP = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
				"<soapenv:Header/>" +
				"<soapenv:Body>" +
				"<wss:getTimesQue>" +
				"<arg0>%s</arg0>" +
				"<arg1>%s</arg1>" +
				"<arg2>AZ_SM</arg2>" +
				"</wss:getTimesQue>" +
				"</soapenv:Body>" +
				"</soapenv:Envelope>";

    private static String getZagsesSOAP() {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
               "<soapenv:Header/>" +
               "<soapenv:Body>" +
               "<wss:getZagses/>" +
               "</soapenv:Body>" +
               "</soapenv:Envelope>";
    }

    private static String getDaysZBSOAP(String zagsId, String minDat, String maxDat, String blTorj) {
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
               "<arg2>" + blTorj + "</arg2>" +
               "</wss:getDaysZB>" +
               "</soapenv:Body>" +
               "</soapenv:Envelope>";
    }

    private static String getTimesZBSOAP(String zagsId, String datZB, String blTorj) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">" +
                "<soapenv:Header/>" +
                "<soapenv:Body>" +
                "<wss:getTimesZB>" +
                "<arg0>" + zagsId + "</arg0>" +
                "<arg1>" + datZB + "</arg1>" +
                "<arg2>" + blTorj + "</arg2>" +
                "</wss:getTimesZB>" +
                "</soapenv:Body>" +
                "</soapenv:Envelope>";
    }

    private static String getMinMaxDaysZBSOAP(String zagsId, String blTorj) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsServerOut.zags.com/\">\n" +
               "<soapenv:Header/>" +
                    "<soapenv:Body>" +
                        "<wss:getMinMaxDaysZB>" +
                            "<arg0>" + zagsId + "</arg0>" +
                            "<arg1>" + blTorj + "</arg1>" +
                        "</wss:getMinMaxDaysZB>" +
                    "</soapenv:Body>" +
               "</soapenv:Envelope>";
    }

            //"http://91.144.172.205:81/zagsportal/wsZagsIntegrate";
    private static final String wsSOAPAction = "";

    /**
     * Взаимодействие с веб-сервисом
     */
    private static String sendSoap(String xmlRequest){
        return sendSoap(xmlRequest,"uddi:gosuslugi.ru:services:36400221");
    }

    private static String sendSoap(String xmlRequest, String uddi) {
        //Устанавливаем соединение с хостом вебсервиса
        URL urlObj = null;
        URLConnection connection = null;

        try {
            urlObj = new URL(ServiceClientFactory.getEndpoint(uddi));
            connection = urlObj.openConnection();
        } catch (MalformedURLException e1) {
            logger.error(("sendSoap: open connection URL malformed"),e1);
        } catch (IOException e1) {
            logger.error(("sendSoap: open connection io error "),e1);
        }

        HttpURLConnection httpConn = (HttpURLConnection) connection;

        //Настраиваем HTTP хедеры
        byte[] b = xmlRequest.getBytes(Charset.forName("UTF-8"));

        httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        httpConn.setRequestProperty("SOAPAction", wsSOAPAction);
        try {
            httpConn.setRequestMethod("POST");
        } catch (ProtocolException e) {
            logger.error(("sendSoap " + e.getLocalizedMessage()),e);
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
            logger.error(e.getLocalizedMessage(),e);
        }

//        return httpConn.getInputStream();

        String s = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));


            String ss;
            while ((ss = br.readLine()) != null) {
                s += ss;
            }
            logger.debug(s);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(),e);
        }

        return s;
    }

    private static Map<String,String> getMinMaxDaysZB(String zagsId, String blTorj){
        //Выкачка данных
        if (logger.isInfoEnabled()) {
            logger.info("End:" + ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:36400221"));
        }
        if (logger.isDebugEnabled()) {
            logger.debug("XML:" + getZagsesSOAP());
        }
        String xmlResponse = sendSoap(getMinMaxDaysZBSOAP(zagsId,blTorj));
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
            logger.error("getMinMaxDaysZB" ,e);
        } catch (SAXException e) {
            logger.error("getMinMaxDaysZB",e);
        } catch (IOException e) {
            logger.error("getMinMaxDaysZB",e);
        }

        NodeList maxDatL = dom.getElementsByTagName("maxDat");
        NodeList minDatL = dom.getElementsByTagName("minDat");

        if ((maxDatL != null) && (minDatL != null)) {
            Map<String,String> m = new HashMap<String,String>();
            m.put("maxDat",maxDatL.item(0).getTextContent());
            m.put("minDat",minDatL.item(0).getTextContent());
            return m;
        }

        return null;
    }

    /**
     * Вызов метода и преобразование в JSONObject
     */
    public static JSONObject getZagses(String serial) {
        final String uddi = "uddi:gosuslugi.ru:services:Nahodka_Zagses";

        //Выкачка данных
        if (logger.isInfoEnabled()) {
            logger.info("End:" + ServiceClientFactory.getEndpoint(uddi));
        }
        if (logger.isDebugEnabled()) {
            logger.debug("XML:" + getZagsesSOAP());
        }
        String xmlResponse = sendSoap(getZagsesSOAP(),uddi);
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
            logger.error(e.getLocalizedMessage(),e);
        } catch (SAXException e) {
            logger.error(e.getLocalizedMessage(),e);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(),e);
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
            logger.error(e.getLocalizedMessage(),e);
        }

        return resultObject;
    }

    public static JSONObject getDaysZB(String zagsId, String blTorj, String serial){
        Map<String,String> minmax = getMinMaxDaysZB(zagsId,blTorj);

        //Выкачка данных
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:36400221"));
            logger.debug("XML:" + getDaysZBSOAP(zagsId,minmax.get("minDat"),minmax.get("maxDat"),blTorj));
        }
        String xmlResponse = sendSoap(getDaysZBSOAP(zagsId,minmax.get("minDat"),minmax.get("maxDat"),blTorj));
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
            logger.error(e.getLocalizedMessage(),e);
        } catch (SAXException e) {
            logger.error(e.getLocalizedMessage(),e);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(),e);
        }

        List<String> daysZB = new ArrayList<String>();
        NodeList items = dom.getElementsByTagName("item");
//        daysZB.add(new Date());
        for (int i = 0; i < items.getLength(); ++i) {
            daysZB.add(items.item(i).getTextContent());
        }

        JSONObject resultObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();

        try {
            for (String dayZB : daysZB) {
                JSONObject dicItemObject = new JSONObject();
                dicItemObject.put("code", dayZB);
                dicItemObject.put("text", dayZB);
                itemsArray.put(dicItemObject);
            }

            resultObject.put("items", itemsArray);
            resultObject.put("total", daysZB.size());
            resultObject.put("title", "Список возможных дней регистрации брака");
            resultObject.put("plain", "true");
            resultObject.put("serial", serial);
        } catch (JSONException e) {
            logger.error(e.getLocalizedMessage(),e);
        }

        return resultObject;
    }

    public static JSONObject getTimesZB(String zagsId, String datZB, String blTorj, String serial){

        //Выкачка данных
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:36400221"));
            logger.debug("XML:" + getTimesZBSOAP(zagsId,datZB,blTorj));
        }
        String xmlResponse = sendSoap(getTimesZBSOAP(zagsId,datZB,blTorj));
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
            logger.error(e.getLocalizedMessage(),e);
        } catch (SAXException e) {
            logger.error(e.getLocalizedMessage(),e);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(),e);
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


        List<Map<String,String>> timesZB = new ArrayList<Map<String,String>>();
        NodeList items = dom.getElementsByTagName("item");
        for (int i = 0; i < items.getLength(); ++i) {
//            daysZB.add(items.item(i).getTextContent());
            Map<String,String> m = new HashMap<String,String>();
            Node fNode = items.item(i).getFirstChild();
            do{
                if ("hourZB".equals(fNode.getNodeName()))
                    m.put("hourZB",fNode.getTextContent());
                if ("minZB".equals(fNode.getNodeName()))
                    m.put("minZB",fNode.getTextContent());
                if ("namZal".equals(fNode.getNodeName()))
                    m.put("namZal",fNode.getTextContent());
            }while((fNode = fNode.getNextSibling()) != null);
            timesZB.add(m);
        }

        JSONObject resultObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();

        try {
            for (Map<String,String> timeZB : timesZB) {
                JSONObject dicItemObject = new JSONObject();
                dicItemObject.put("code", (timeZB.get("hourZB") + ":" +  timeZB.get("minZB")).toString());
                dicItemObject.put("text", (timeZB.get("hourZB") + ":" +  timeZB.get("minZB")).toString());
                itemsArray.put(dicItemObject);
            }

            resultObject.put("items", itemsArray);
            resultObject.put("total", timesZB.size());
            resultObject.put("title", "Список возможных дней регистрации брака");
            resultObject.put("plain", "true");
            resultObject.put("serial", serial);
        } catch (JSONException e) {
            logger.error(e.getLocalizedMessage(),e);
        }

        return resultObject;
    }


	public static JSONObject getDaysQue(String agencyId, String serial){
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:36400221"));
        }

        String daysQueueSoap = String.format(DAYS_QUEUE_SOAP, agencyId);
        if (logger.isDebugEnabled()) {
            logger.debug("XML:" + daysQueueSoap);
        }

        String xmlResponse = sendSoap(daysQueueSoap);
        if (logger.isDebugEnabled()) {
            logger.debug("End xml:" + xmlResponse);
        }

        List<Map<String,String>> timesQueue = new ArrayList<Map<String,String>>();

			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName("UTF-8"))));

				NodeList items = dom.getElementsByTagName("item");
				for (int i = 0; i < items.getLength(); ++i) {
					Map<String,String> m = new HashMap<String,String>();

					Node fNode = items.item(i).getFirstChild();
					do{
						if ("hourZB".equals(fNode.getNodeName()))
							m.put("hourZB",fNode.getTextContent());
						if ("minZB".equals(fNode.getNodeName()))
							m.put("minZB",fNode.getTextContent());
						if ("namZal".equals(fNode.getNodeName()))
							m.put("namZal",fNode.getTextContent());
					} while((fNode = fNode.getNextSibling()) != null);

					timesQueue.add(m);
				}
			} catch (ParserConfigurationException e) {
				logger.error(e.getLocalizedMessage(), e);

			} catch (SAXException e) {
				logger.error(e.getLocalizedMessage(), e);

			} catch (IOException e) {
				logger.error(e.getLocalizedMessage(), e);
			}

			JSONObject result = new JSONObject();
			JSONArray items = new JSONArray();

			try {
				for (Map<String,String> timeZB : timesQueue) {
					JSONObject item = new JSONObject();

					String date = String.format("%s:%s", timeZB.get("hourZB"), timeZB.get("minZB"));

					item.put("code", date);
					item.put("text", date);

					items.put(item);
				}

				result.put("items", items);
				result.put("total", timesQueue.size());
				result.put("title", "Список возможных дней регистрации брака");
				result.put("plain", "true");
				result.put("serial", serial);

			} catch (JSONException e) {
				logger.error(e.getLocalizedMessage(), e);
			}

			return result;
		}

	public static JSONObject getTimesQue(String agencyId, String date, String serial){
        if (logger.isDebugEnabled()) {
            logger.debug("End:" + ServiceClientFactory.getEndpoint("uddi:gosuslugi.ru:services:36400221"));
        }

        String daysQueueSoap = String.format(TIMES_QUEUE_SOAP, agencyId, date);
        if (logger.isDebugEnabled()) {
            logger.debug("XML:" + daysQueueSoap);
        }

        String xmlResponse = sendSoap(daysQueueSoap);
        if (logger.isDebugEnabled()) {
            logger.debug("End xml:" + xmlResponse);
        }

        List<Map<String,String>> timesQueue = new ArrayList<Map<String,String>>();

			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document dom = db.parse(new ByteArrayInputStream(xmlResponse.getBytes(Charset.forName("UTF-8"))));

				NodeList items = dom.getElementsByTagName("item");
				for (int i = 0; i < items.getLength(); ++i) {
					Map<String,String> m = new HashMap<String,String>();

					Node fNode = items.item(i).getFirstChild();
					do{
						if ("hourZB".equals(fNode.getNodeName()))
							m.put("hourZB",fNode.getTextContent());
						if ("minZB".equals(fNode.getNodeName()))
							m.put("minZB",fNode.getTextContent());
						if ("namZal".equals(fNode.getNodeName()))
							m.put("namZal",fNode.getTextContent());
					} while((fNode = fNode.getNextSibling()) != null);

					timesQueue.add(m);
				}
			} catch (ParserConfigurationException e) {
				logger.error(e.getLocalizedMessage(), e);

			} catch (SAXException e) {
				logger.error(e.getLocalizedMessage(), e);

			} catch (IOException e) {
				logger.error(e.getLocalizedMessage(), e);
			}

			JSONObject result = new JSONObject();
			JSONArray items = new JSONArray();

			try {
				for (Map<String,String> timeZB : timesQueue) {
					JSONObject item = new JSONObject();

					String time = String.format("%s:%s", timeZB.get("hourZB"), timeZB.get("minZB"));

					item.put("code", time);
					item.put("text", time);

					items.put(item);
				}

				result.put("items", items);
				result.put("total", timesQueue.size());
				result.put("title", "Список возможных дней регистрации брака");
				result.put("plain", "true");
				result.put("serial", serial);

			} catch (JSONException e) {
				logger.error(e.getLocalizedMessage(), e);
			}

			return result;
		}
}
