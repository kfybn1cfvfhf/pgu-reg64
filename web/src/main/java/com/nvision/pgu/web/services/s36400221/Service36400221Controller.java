package com.nvision.pgu.web.services.s36400221;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.exceptions.ShowErrorToUserException;
import com.nvision.pgu.core.rules.api.RuleException;

import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.nsi.ws.DicItemList;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import com.nvision.pgu.web.services.utils.NationalityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ru.lanit.samara.pgu.core.util.version.Version;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdRequest;
import ru.nvg.idecs.privateoffice.ws.common.order.GetOrderByIdResponse;
import ru.nvg.idecs.privateoffice.ws.common.order.OrderService;
import ru.nvg.idecs.uddi.ServiceClientFactory;
import ru.nvg.idecs.uddi.UDDINames;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s36400221")
@ServiceController(id = Service36400221Controller.SERVICE_ID, title = "Подача электронной заявки на регистрацию брака")
@Version("0.3")
public class Service36400221Controller extends AbstractNakhodkaController<Service36400221Form> {

    private static final Logger logger = LoggerFactory.getLogger(Service36400221Controller.class);

    /**
     * id Подача электронной заявки на регистрацию брака
     */
    public static final int SERVICE_ID = 36400221;


    @Autowired
    private Service36400221FormValidator validator;

    public Service36400221Controller() {
        setStepMetaList(
                Arrays.asList(
                        new StepMeta(1, "Выбор органа ЗАГС"),
                        new StepMeta(2, "Сведения о женихе и невесте"),
                        new StepMeta(3, "Место рождения"),
                        new StepMeta(4, "Место жительства"),
                        new StepMeta(5, "Документ, удостоверяющий личность"),
                        new StepMeta(6, "Сведения о предыдущем браке"),
                        new StepMeta(7, "Смена фамилии"),
                        new StepMeta(8, "Дополнительная информация", true, "xml"),
                        new StepMeta(9, "Запись на прием", true, "application")
                ));
    }

    @Override
    public Integer getServiceId() {
        return SERVICE_ID;
    }

    @Override
    protected void initBinderInternal(WebDataBinder binder) {
        if (binder.getTarget() instanceof Service36400221Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }
    
    private String getKeyByValue(String dicCode,String value)
    {
        try {
            DicItemList it = getDicRegistry().listItemsByName(dicCode, value, 1, 1);
            if (it.getList().getItem().size() > 0) {
                return(it.getList().getItem().get(0).getKey().getCode());
            }
            else
            {
                logger.warn("Cannot find element in "+dicCode +" with value" +value);
            }
        } catch (DicNotFoundException e) {
            logger.warn("Cannot find element in "+dicCode +" with value" +value);
        }
        return null;
    }

    @Override
    public void applyInitRules(Service36400221Form form) throws RuleException {

        form.setGroom_nationality_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "woman"));
        form.setBride_nationality_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "man"));

        String citizenCode=getKeyByValue("GRAJD_LS", "Российской Федерации");
        form.setGroom_citizenship(citizenCode);
        form.setBride_citizenship(citizenCode);
        String countryCode=getKeyByValue("COUNTRY_LS", "Россия");
        form.setGroom_birth_country(countryCode);
        form.setBride_birth_country(countryCode);
        form.setGroom_country(countryCode);
        form.setBride_country(countryCode);
        String docCode=getKeyByValue("DUL_LS", "Паспорт гражданина РФ");
        //Disable according to this ticket:
        //http://jira.egov.at-consulting.ru/browse/PGU-6488
        //form.setGroom_ident_doc_type(docCode);
        //form.setBride_ident_doc_type(docCode);

        form.setType_street_no(getKeyByValue("STREET_TYPE_LS", "нет улицы"));
        
        String MALE_SEX = "1";
        String FEMALE_SEX = "2";
        String DEFAULT_STRING_VALUE = "";
        
        if (MALE_SEX.equals(form.getSia_sex())) {

            form.setGroom_first_name(form.getSia_first_name());
            form.setGroom_last_name(form.getSia_last_name());
            form.setGroom_middle_name(form.getSia_middle_name());
            form.setGroom_date_of_birth(form.getSia_date_of_birth());
            form.setGroom_new_last_name(form.getSia_last_name());
            form.setGroom_state(form.getSia_state());
            form.setGroom_region(form.getSia_region());
            form.setGroom_settlement(form.getSia_settlement());
            form.setGroom_street(form.getSia_street());
            form.setGroom_house(form.getSia_house());
            form.setGroom_building(form.getSia_building());
            form.setGroom_flat(form.getSia_flat());
            /*form.setGroom_ident_doc_type(form.getSia_ident_doc_type());
            form.setGroom_doc_ser(form.getSia_doc_ser());
            form.setGroom_doc_num(form.getSia_doc_num());
            form.setGroom_doc_date(form.getSia_doc_date());
            form.setGroom_doc_source(form.getSia_doc_source());*/
            
            //force clear opposite sex fields
            //form.setBride_ident_doc_type("");
        } 
        else if (FEMALE_SEX.equals(form.getSia_sex())) {
            form.setBride_first_name(form.getSia_first_name());
            form.setBride_last_name(form.getSia_last_name());
            form.setBride_middle_name(form.getSia_middle_name());
            form.setBride_date_of_birth(form.getSia_date_of_birth());
            form.setBride_new_last_name(form.getSia_last_name());
            form.setBride_state(form.getSia_state());
            form.setBride_region(form.getSia_region());
            form.setBride_settlement(form.getSia_settlement());
            form.setBride_street(form.getSia_street());
            form.setBride_house(form.getSia_house());
            form.setBride_building(form.getSia_building());
            form.setBride_flat(form.getSia_flat());
            /*form.setBride_ident_doc_type(form.getSia_ident_doc_type());
            form.setBride_doc_ser(form.getSia_doc_ser());
            form.setBride_doc_num(form.getSia_doc_num());
            form.setBride_doc_date(form.getSia_doc_date());
            form.setBride_doc_source(form.getSia_doc_source());*/

            //force clear opposite sex fields
            //form.setGroom_ident_doc_type("");
        } else {
            
        }

        String mobile = form.getContact_phone_home();
        String phone = form.getContact_phone_mobile();
        if(!mobile.isEmpty())
            phone = phone + "," + mobile;

        form.setContact_phone(phone);
    }

    @Override
    protected Service36400221Form createNewForm() {
        return new Service36400221Form();
    }

    @Override
    public void applyStepRules(Service36400221Form form) throws RuleException {
        Integer stepNum = form.getStepNum();

        String[] calculatedHourMinHall = parseHourMinHallSplitBySharp(form.getReg_time());
        if (null != calculatedHourMinHall) {
            form.setCalculatedHour(calculatedHourMinHall[0]);
            form.setCalculatedMin(calculatedHourMinHall[1]);
            form.setCalculatedHall(calculatedHourMinHall[2]);
        }

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

                case 7:

                    break;

                case 8:

                    break;

            }
        }
    }

    @RequestMapping(value = "/getzagses")
    public void processGetZagses(HttpServletResponse httpResponse, HttpServletRequest request) {
        try {

            httpResponse.setContentType("application/json; charset=UTF-8");
            httpResponse.addHeader("Pragma", "No-Cache");
            httpResponse.addHeader("Cache-Control", "no-cache, must-revalidate");
            httpResponse.addHeader("Cache-Control", "no-store, post-check=0, pre-check=0");
            PrintWriter out = httpResponse.getWriter();
            out.write(WsZagsIntegrate.getZagses(request.getParameter("serial")).toString());
            out.close();
        } catch (IOException e) {
            logger.error("processGetZagses: io error", e);
        }
    }

    @RequestMapping(value = "/getdayszb")
    public void processGetDaysZB(HttpServletResponse httpResponse, HttpServletRequest request) {
        try {

            httpResponse.setContentType("application/json; charset=UTF-8");
            httpResponse.addHeader("Pragma", "No-Cache");
            httpResponse.addHeader("Cache-Control", "no-cache, must-revalidate");
            httpResponse.addHeader("Cache-Control", "no-store, post-check=0, pre-check=0");
            PrintWriter out = httpResponse.getWriter();
            //TODO: Реализовать зависимость первых 2ух парам. от полей на форме
            out.write(WsZagsIntegrate.getDaysZB("0010", "ZB_TORG", request.getParameter("serial")).toString());
            out.close();
        } catch (IOException e) {
            logger.error("processGetDaysZB: io error", e);
        }
    }

    @RequestMapping(value = "/gettimeszb")
    public void processGetTimeZB(HttpServletResponse httpResponse, HttpServletRequest request) {
        try {

            httpResponse.setContentType("application/json; charset=UTF-8");
            httpResponse.addHeader("Pragma", "No-Cache");
            httpResponse.addHeader("Cache-Control", "no-cache, must-revalidate");
            httpResponse.addHeader("Cache-Control", "no-store, post-check=0, pre-check=0");
            PrintWriter out = httpResponse.getWriter();
            //TODO: Реализовать зависимость первых 3ех парам. от полей на форме
            out.write(WsZagsIntegrate.getTimesZB("0010", "2011-05-21T00:00:00+04:00", "ZB_TORG", request.getParameter("serial")).toString());
            out.close();
        } catch (IOException e) {
            logger.error("processGetTimeZB: io error", e);
        }
    }

    @Override
    public void fillModelByForm(Map<String, Object> model, Service36400221Form form) throws ShowErrorToUserException {
        super.fillModelByForm(model, form);

        //TODO move userSelectedRegion to base class
        //model.put("okato", getUserSelectedRegion(model));

        //model.put("insoftSourceIdByUserSelectedRegion", UtilsInsoft.getInsoftSourceIdByUserSelectedRegion(this, model, logger));
    }


//    @Override
//    public String processStepInternal(
//            Integer stepNum,
//            Service36400221Form form, BindingResult result,
//            Map<String, Object> model
//    ) throws RuleException, IOException, TemplateException {
//        if (result.hasErrors()) {
//            form.setHasNextStep(true);
//            form.setStepNum(stepNum);
//            return getViewNamePrefix() + "/step"+stepNum+".html";
//        }
//        else {
//            if (stepNum < getStepCount()) {
//                form.setHasNextStep(true);
//                form.setStepNum(stepNum+1);
//                return getViewNamePrefix() + "/step"+(form.getStepNum())+".html";
//            }
//            else {
//                int res = orderService(form);
//                return "forward:/s"+getServiceId()+"/result";
//            }
//        }
//    }
//
//    @RequestMapping("/result")
//    public String processResult() {
//        return "UnderConstruction.html";
//    }

    @Override
    protected StepProcessingResult determineNextStepNumOnStepProcessing(Service36400221Form form, boolean goback,
                                                                        Map<String, Object> model) {
        final StepProcessingResult res = super.determineNextStepNumOnStepProcessing(form, goback, model);
        switch (form.getStepNum()) {
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                final OrderService orderService = ServiceClientFactory.getServiceClient(UDDINames.NAME_PO_ORDER_SERVICE, OrderService.class);
                GetOrderByIdRequest orderRequest = new GetOrderByIdRequest();
                orderRequest.setAuthToken(form.getPguAssertion().getPrincipal().getAuthToken());
                orderRequest.setOrderId(form.getOrderId());
                final GetOrderByIdResponse response = orderService.getOrderById(orderRequest);
                form.setOrderExtId(response.getOrder().getOrderExtId());
                break;
        }
        return res;
    }

    public static String[] parseHourMinHall(String inputString) {
        if (null == inputString) {
            return null;
        }

        String regex1 = "(.*)\\s-\\s(\\d\\d):(\\d\\d)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(inputString);

        String regex2 = "(\\d\\d):(\\d\\d)\\s-\\s(.*)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(inputString);

        String regex3 = "(\\s?)-\\s(\\d\\d):(\\d\\d)";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(inputString);

        String regex4 = "(\\d\\d):(\\d\\d)\\s-(\\s?)";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(inputString);

        String regex5 = "(.*)\\s-(\\s?)";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(inputString);

        String regex6 = "(\\s?)-\\s(.*)";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(inputString);

        String preHourQue = "";
        String preMinQue = "";
        String preNamKabinet = "";
        boolean found = false;

        if (matcher1.matches()) {
            preHourQue = matcher1.group(2);
            preMinQue = matcher1.group(3);
            preNamKabinet = matcher1.group(1);
            found = true;
        } else if (matcher2.matches()) {
            preHourQue = matcher2.group(1);
            preMinQue = matcher2.group(2);
            preNamKabinet = matcher2.group(3);
            found = true;
        } else if (matcher3.matches()) {
            preHourQue = matcher3.group(2);
            preMinQue = matcher3.group(3);
            preNamKabinet = "";
            found = true;
        } else if (matcher4.matches()) {
            preHourQue = matcher4.group(1);
            preMinQue = matcher4.group(2);
            preNamKabinet = "";
            found = true;
        } else if (matcher5.matches()) {
            preHourQue = "";
            preMinQue = "";
            preNamKabinet = matcher5.group(1);
            found = true;
        } else if (matcher6.matches()) {
            preHourQue = "";
            preMinQue = "";
            preNamKabinet = matcher6.group(2);
            found = true;
        }

        String[] result = null;
        String[] proposedResult = {preHourQue, preMinQue, preNamKabinet};
        if (found) {
            result = proposedResult;
        }
        return result;
    }

    public static String[] parseHourMinHallSplitBySharp(String inputString) {
        if (null == inputString) {
            return null;
        }

        String regex1 = "(.*)#(\\d\\d)#(\\d\\d)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(inputString);

        String regex2 = "(\\d\\d)#(\\d\\d)#(.*)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(inputString);

        String regex3 = "(\\d\\d)#(\\d\\d)";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(inputString);

        String regex4 = "(.*)";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(inputString);

        String preHourQue = "";
        String preMinQue = "";
        String preNamKabinet = "";
        boolean found = false;

        if (matcher1.matches()) {
            preHourQue = matcher1.group(2);
            preMinQue = matcher1.group(3);
            preNamKabinet = matcher1.group(1);
            found = true;
        } else if (matcher2.matches()) {
            preHourQue = matcher2.group(1);
            preMinQue = matcher2.group(2);
            preNamKabinet = matcher2.group(3);
            found = true;
        } else if (matcher3.matches()) {
            preHourQue = matcher3.group(1);
            preMinQue = matcher3.group(2);
            preNamKabinet = "";
            found = true;
        } else if (matcher4.matches()) {
            preHourQue = "";
            preMinQue = "";
            preNamKabinet = matcher4.group(1);
            found = true;
        }

        String[] result = null;
        String[] proposedResult = {preHourQue, preMinQue, preNamKabinet};
        if (found) {
            result = proposedResult;
        }
        return result;
    }
}
