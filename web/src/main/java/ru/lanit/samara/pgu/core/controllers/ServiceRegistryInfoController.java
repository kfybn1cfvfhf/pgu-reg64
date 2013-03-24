package ru.lanit.samara.pgu.core.controllers;

/**
 * Created by IntelliJ IDEA.
 * User: vlyasovich
 * Date: 26.12.12
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */


import com.nvision.pgu.dao.LookupItemsList;
import com.nvision.pgu.dao.ServiceCatalogNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import ru.lanit.samara.pgu.core.util.WebserviceInvocation;
import ru.nvg.idecs.common.util.ws.WsUtils;
import ru.nvg.idecs.uddi.ServiceClientFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class ServiceRegistryInfoController {

    //NAME_SERVICEREGISTRY_V2_2
    private static final String uddiKey = "uddi:gosuslugi.ru:services:pgu/serviceregistryv2";
    private static final String action = "getServiceInfoV2";
    public static final String SERVICE_ID = "eservice";

    @Autowired
    private ServiceCatalogNew serviceCatalogNew;

    public static final String NAME_RESPONSE_OPTION = "name";
    public static final String CODE_RESPONSE_OPTION = "code";

    private WebserviceInvocation wsInv;

    public ServiceRegistryInfoController() {
        this.wsInv = new WebserviceInvocation() {
            @Override
            public Element invoke(String endpoint, String action, byte[] request) {
                return WsUtils.invoke(endpoint, action, request);
            }
        };
    }

    public String getOrgName(String _serviceId) {

        String soapEndpoint = ServiceClientFactory.getEndpoint(uddiKey);
        //String soapEndpoint = "http://192.168.100.56:8080/govsrvreg/ws/ServiceRegistryV2";
        LookupItemsList itemsList = new LookupItemsList();
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList dicItems = null;
        String orgName = "";
        try {
            Element request = createRequest(createElement(SoapRequest), _serviceId);

            Transformer transformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            StringWriter sw = new StringWriter();
            Source source = new DOMSource(request);
            Result result = new StreamResult(sw);
            transformer.transform(source, result);

            Element response = this.wsInv.invoke(soapEndpoint, action, sw.toString().getBytes("UTF-8"));

            NodeList alltmp = response.getElementsByTagName("respOrgName");

            orgName = alltmp.item(0).getTextContent();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return orgName;
    }

    public static Element createRequest(Element request, String _serviceId) throws Exception {

        XPath xPath = XPathFactory.newInstance().newXPath();
        try {
            Node rCode = (Node) xPath.evaluate("/Envelope/Body/getServiceInfoV2Request/code", request, XPathConstants.NODE);
            Document doc = rCode.getOwnerDocument();
            Element serviceId = doc.createElement("serviceId");
            serviceId.setTextContent(_serviceId);
            rCode.appendChild(serviceId);

        } catch (XPathExpressionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            throw new Exception("Error during create request", e);
        }

        return request;
    }

    private static Element createElement(String request) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = factory.newDocumentBuilder();

            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(request));

            Document doc = db.parse(is);
            return doc.getDocumentElement();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SAXException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    private LookupItemsList.LookupItem getLookupItem(Node elements) {
        Node fchild = elements.getFirstChild();
        String code = null, name = null;

        do {
            String nodeName = fchild.getNodeName();
            if (nodeName == NAME_RESPONSE_OPTION) {
                name = fchild.getTextContent();
            }
            if (nodeName == CODE_RESPONSE_OPTION) {
                code = fchild.getTextContent();
            }
        }
        while ((fchild = fchild.getNextSibling()) != null);
        return new LookupItemsList.LookupItem(code, name);
    }

private static final String SoapRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ws2=\"http://idecs.atc.ru/serviceregistry/ws2/\">"+
   "<soapenv:Header/>"+
   "<soapenv:Body>"+
      "<ws2:getServiceInfoV2Request>"+
         "<code>"+
            //"<serviceId>540100010000285050</serviceId>"+
            "<eServiceId/>"+
         "</code>"+
         "<region>82000000000</region>"+
         "<portalEdition>I</portalEdition>"+
      "</ws2:getServiceInfoV2Request>"+
   "</soapenv:Body>"+
"</soapenv:Envelope>";
/*
private static final String SoapRequest = "<soapenv:Envelope xmlns:cck=\"http://cck.rtk.cp.org/\" xmlns:inc=\"http://www.w3.org/2004/08/xop/include\" xmlns:rev=\"http://smev.gosuslugi.ru/rev111111\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:typ=\"http://idecs.nvg.ru/privateoffice/ws/types/\">"+
   "<soapenv:Header/>"+
   "<soapenv:Body>"+
      "<cck:getElements>"+
         "<rev:Message/>"+
         "<rev:MessageData>"+
            "<rev:AppData>"+
               "<requestHeader>"+
                  "<typ:authToken>1</typ:authToken>"+
                  "<typ:requestId>1</typ:requestId>"+
               "</requestHeader>"+
               "<eServiceHeader/>"+
               "<regData>"+
                  "<okato/>"+
                  "<codeDepartment/>"+
                  "<codeService/>"+
                  "<codeGoal/>"+
                  "<codeFormPGU/>"+
                  "<cardCode>SGosOrg</cardCode>"+
                  "<code/>"+
                  "<owner/>"+
                  "<parentcode>SCHOOL_RD</parentcode>"+
                  "<isSortName/>"+
                  "<firstRow/>"+
                  "<lastRow/>"+
                  "<separator>;</separator>"+
                  "<district/>"+
               "</regData>"+
            "</rev:AppData>"+
         "</rev:MessageData>"+
      "</cck:getElements>"+
   "</soapenv:Body>"+
"</soapenv:Envelope>";
*/
}
