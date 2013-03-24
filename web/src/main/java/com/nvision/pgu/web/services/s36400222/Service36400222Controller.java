package com.nvision.pgu.web.services.s36400222;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.sp.principal.IPrincipal;
import com.nvision.pgu.util.SoapManualSender;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import com.nvision.pgu.web.services.utils.NationalityUtils;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.nvg.idecs.identityservice.ws.types.Person;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataRequest;
import ru.nvg.idecs.personaldataservice.ws.common.profile.GetPersonalDataResponse;
import ru.nvg.idecs.personaldataservice.ws.common.profile.PersonalDataService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s36400222")
@ServiceController(id = Service36400222Controller.SERVICE_ID, title = "Подача электронной заявки на выдачу свидетельства о рождении")
@Version("0.3")
public class  Service36400222Controller extends AbstractNakhodkaController<Service36400222Form> {
    private static final Logger logger = LoggerFactory.getLogger(Service36400222Controller.class);

    /**
     * id Регистрация рождения по заявлению родителей
     */
    public static final int SERVICE_ID = 36400222;

    @Autowired
    private Service36400222FormValidator validator;

    public Service36400222Controller() {
        //TODO: enter here step list
        List<String> stepList = Arrays.asList(
                "Выбор органа ЗАГС обращения и формы заявления",
                "Сведения о ребенке",
                "Сведения о родителях",
                "Место рождения родителей",
                "Место жительства родителей",
                "Запись на прием"
        );
        setStepList(stepList);
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400222Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400222Form createNewForm() {
        return new Service36400222Form();
    }

    @Override
    public void applyStepRules(Service36400222Form form) throws RuleException {
        Integer stepNum = form.getStepNum();
        if (stepNum == null) {

        } else {
            switch (stepNum) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

            }
        }
    }

    @Override
    public void applyInitRules(Service36400222Form form) throws RuleException {
        form.setHe_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "man"));
        form.setShe_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "woman"));
        form.setFather_birth_place_settlement_type_gr("1");
        form.setMother_birth_place_settlement_type_gr("1");
        form.setChild_country("1");
        form.setFather_birth_place_country("1");
        form.setMother_birth_place_country("1");
        form.setFather_living_country("1");
        form.setMother_living_country("1");
        
        form.setFather_living_place_gr("1");
        form.setMother_living_place_gr("1");

        form.setFather_cause_doc_source_gr("1");
        form.setChild_settlement_type_gr("1");
        form.setFather_doc_type_gr("1");
        form.setMother_doc_type_gr("1");
        String phone = "";
        if (StringUtils.isNotBlank(form.getContact_phone_home())) {
            phone = form.getContact_phone_home();
            if (StringUtils.isNotBlank(form.getContact_phone_mobile())) {
                phone = phone + " , ";
            }
        }
        if (StringUtils.isNotBlank(form.getContact_phone_mobile())) {
            phone = phone + form.getContact_phone_mobile();
        }
        form.setContact_phone(phone);
        final IPrincipal principal = form.getPguAssertion().getPrincipal();
        if (principal != null) {

            final Long userId = principal.getUserId();
            final String authToken = principal.getAuthToken();

            if (userId != null) {

                PersonalDataService personalDataService = ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_PERSONALDATA_SERVICE, PersonalDataService.class);

                final GetPersonalDataRequest personalDataRequest = new GetPersonalDataRequest();
                personalDataRequest.setAuthToken(authToken);
                personalDataRequest.setUserId(userId);

                final GetPersonalDataResponse personalDataResponse = personalDataService.getPersonalData(personalDataRequest);
                if (personalDataResponse.getError() == null || personalDataResponse.getError().getErrorCode() == 0) {
                    final Person person = personalDataResponse.getPerson();

                    if ((person != null) && (person.getSex() != null)) {
                        //System.out.println("Sex = " + person.getSex());
                        if (person.getSex().toString().equals("M")) {
                            form.setFather_last_name(person.getLastName());
                            form.setFather_first_name(person.getFirstName());
                            form.setFather_middle_name(person.getMiddleName());
                            if (person.getBirthDate() != null)
                                form.setFather_birth_date(person.getBirthDate().toGregorianCalendar().getTime());
                            //form.setFather_doc_type(String.valueOf(person.getMainDocument().getDocumentType()));
                            //form.setFather_doc_ser(person.getMainDocument().getDocSeries());
                            //form.setFather_doc_number(person.getMainDocument().getDocNumber());

                            XMLGregorianCalendar calendar = person.getMainDocument().getIssueDate();
                            if (calendar != null) {
                                //form.setFather_doc_date(calendar.toGregorianCalendar().getTime());
                                logger.warn("Person document issue date is null");
                            }
                            //form.setFather_doc_place(person.getMainDocument().getIssueOrg());
                        } else {
                            form.setMother_last_name(person.getLastName());
                            form.setMother_first_name(person.getFirstName());
                            form.setMother_middle_name(person.getMiddleName());
                            if (person.getBirthDate() != null)
                                form.setMother_birth_date(person.getBirthDate().toGregorianCalendar().getTime());
                            //form.setMother_doc_type(String.valueOf(person.getMainDocument().getDocumentType()));
                            //form.setMother_doc_ser(person.getMainDocument().getDocSeries());
                            //form.setMother_doc_number(person.getMainDocument().getDocNumber());

                            XMLGregorianCalendar calendar = person.getMainDocument().getIssueDate();
                            if (calendar != null) {
                                //form.setMother_doc_date(calendar.toGregorianCalendar().getTime());
                                logger.warn("Person document issue date is null");
                            }
                            //form.setMother_doc_place(person.getMainDocument().getIssueOrg());
                        }
                    }
                }
            }
        }
    }

    private static String zagsesRequestString =
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wss=\"http://wsService.zags.com/\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <wss:getZagses/>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";

    @RequestMapping(value = "/lookupGetZagses")
    public void processLookUpGetZagses(HttpServletResponse httpResponse, HttpServletRequest httpRequest) {
        String responseString = SoapManualSender.getResponse(zagsesRequestString,
                "http://192.168.100.18:7777/gateway/services/SID0003184?wsdl",
                "uddi:gosuslugi.ru:services:Nahodka_Zagses");

        //System.out.println("response=" + responseString);
        JSONObject resultObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();
        List<JSONObject> itemsList = new ArrayList<JSONObject>();
        List<String> adresList = new ArrayList<String>();

        try {
            if (responseString != null) {
                XMLInputFactory factory = XMLInputFactory.newInstance();
                XMLStreamReader reader = factory.createXMLStreamReader(new ByteArrayInputStream(responseString.getBytes("UTF-8")));
                while (reader.hasNext()) {
                    int eventType = reader.next();
                    if (eventType == XMLStreamConstants.START_ELEMENT) {
                        String localName = reader.getLocalName();
                        String adresZags = "";
                        if (localName.equals("item")) {
                            JSONObject item = new JSONObject();
                            String codeZags = getXmlNodeStringContent(reader, "idZags");
                            String nameZags = getXmlNodeStringContent(reader, "nameZags");
                            String telephMain = getXmlNodeStringContent(reader, "telephMain");
                            String adresHttp = getXmlNodeStringContent(reader, "adresHttp");

                            if (nameZags != null) {
                                item.put("text", nameZags);
                            }
                            if (codeZags != null) {
                                item.put("code", codeZags);
                            }
                            if (telephMain != null) {
                                item.put("telephMain", telephMain);
                            }
                            if (adresHttp != null) {
                                item.put("adresHttp", adresHttp);
                            }
                            itemsList.add(item);

                        } else if (localName.equals("adresZags")) {
                            adresZags = createAdresZagsString(reader);
                            adresList.add(adresZags);
                        }

                    }
                }

                for (int i = 0; i < itemsList.size(); i++) {
                    JSONObject item = itemsList.get(i);
                    item.put("adresZags", adresList.get(i));
                    itemsArray.put(item);
                }


            }

            resultObject.put("items", itemsArray);
            resultObject.put("total", itemsArray.length());
            resultObject.put("title", "Список загсов");
            resultObject.put("plain", "true");
            resultObject.put("serial", httpRequest.getParameter("serial"));

        } catch (JSONException e) {
            logger.error("processLookUpGetZagses: json", e);
        } catch (XMLStreamException e) {
            logger.error("processLookUpGetZagses: parse error", e);
        } catch (UnsupportedEncodingException e) {
            logger.error("processLookUpGetZagses: unsupported encoding", e);
        }


        PrintWriter out = null;
        try {
            httpResponse.setContentType("application/json; charset=UTF-8");
            httpResponse.addHeader("Pragma", "No-Cache");
            httpResponse.addHeader("Cache-Control", "no-cache, must-revalidate");
            httpResponse.addHeader("Cache-Control", "no-store, post-check=0, pre-check=0");
            out = httpResponse.getWriter();
            out.write(resultObject.toString());

        } catch (IOException e) {
            logger.error("processLookUpGetZagses: io error", e);
        } finally {
            out.close();
        }

    }

    private static JSONObject getZagses(XMLStreamReader reader) {
        JSONObject entity = new JSONObject();
        try {
            while (reader.hasNext()) {
                int elementType = reader.next();
                switch (elementType) {
                    case XMLStreamConstants.END_ELEMENT: {
                        if (reader.getLocalName().equals("item")) {
                            return entity;
                        }
                        break;
                    }
                    case XMLStreamConstants.START_ELEMENT: {
                        String localName = reader.getLocalName();
                        if (localName.equals("nameZags")) {
                            entity.put("text", getXmlNodeStringContent(reader, "code"));
                        }
                        /*}else if(localName.equals("name")){
                            entity.put("text", getXmlNodeStringContent(reader, "name"));
                        }else if(localName.equals("p")){
                            entity.put("parent", getXmlNodeStringContent(reader, "p"));
                        }  */
                        break;
                    }
                }
            }
        } catch (JSONException e) {
            logger.error("getZagses: json", e);
        } catch (XMLStreamException e) {
            logger.error("getZagses: parse error", e);
        }
        return entity;
    }


    private static String getXmlNodeStringContent(XMLStreamReader reader, String closeTagName) {
        String value = null;
        boolean flag = false;
        try {
            while (reader.hasNext()) {
                int elementType = reader.next();
                switch (elementType) {
                    case XMLStreamConstants.START_ELEMENT: {
                        if (reader.getLocalName().equals(closeTagName)) {
                            flag = true;
                        }
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT: {
                        if (reader.getLocalName().equals(closeTagName)) {
                            if (value != null) {
                                return value.trim();
                            }
                        }
                        break;
                    }
                    case XMLStreamConstants.CHARACTERS: {
                        if (value == null) {
                            value = new String();
                        }
                        if (flag) {
                            value += reader.getText();
                        }
                    }
                }
            }
        } catch (XMLStreamException e) {
            logger.error("getXmlNodeStringContent: parse error", e);
        }
        return value;
    }


    private String createAdresZagsString(XMLStreamReader reader) {
        String gos = getXmlNodeStringContent(reader, "gos");
        String subGos = getXmlNodeStringContent(reader, "subGos");
        String rayon = getXmlNodeStringContent(reader, "rayon");
        String nasPun = getXmlNodeStringContent(reader, "nasPun");
        String typeNP = getXmlNodeStringContent(reader, "typeNP");
        String street = getXmlNodeStringContent(reader, "street");
        String typeStr = getXmlNodeStringContent(reader, "typeStr");
        String house = getXmlNodeStringContent(reader, "house");
        String korp = getXmlNodeStringContent(reader, "korp");


        // Строка вида: gos, subGos, rayon, typeNP nasPun, typeStr street, д. house, корп. korp
        StringBuffer sb = new StringBuffer();
        appendNotEmptyString(sb, gos);
        appendNotEmptyString(sb, subGos);
        appendNotEmptyString(sb, rayon);

        sb.append(typeNP + " ");
        appendNotEmptyString(sb, nasPun);

        sb.append(typeStr + " ");
        appendNotEmptyString(sb, street);

        if (!StringUtils.isEmpty(house)) {
            sb.append("д. " + house);
        }

        if (!StringUtils.isEmpty(korp)) {
            sb.append(", " + korp + ".");
        } else {
            sb.append(".");
        }

        return sb.toString();
    }

    private void appendNotEmptyString(StringBuffer sb, String str) {
        if (!StringUtils.isEmpty(str)) {
            sb.append(str + ", ");
        }

    }
}
	