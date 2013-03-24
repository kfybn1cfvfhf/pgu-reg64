package com.nvision.pgu.web.services.s36400226;

import com.nvision.pgu.core.annotations.ServiceController;
import com.nvision.pgu.core.rules.api.RuleException;
import com.nvision.pgu.dic.DicItemNotFoundException;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaController;
import com.nvision.pgu.web.services.utils.NationalityUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 5:46:19 PM
 */
@Controller
@RequestMapping("/services/s" + Service36400226Controller.SERVICE_ID)
@ServiceController(id = Service36400226Controller.SERVICE_ID, title = "Регистрация усыновления (удочерения)")

public class Service36400226Controller extends AbstractNakhodkaController<Service36400226Form> {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    private static String NOZJVL = "NOZJVL";
    private static String ZJVL_HE = "ZJVL_HE";
    private static String ZJVL_SHE = "ZJVL_SHE";
    private static String ZJVL_BOTH = "ZJVL_BOTH";
    private static String ONE = "1";

    /**
     * id Регистрация усыновления (удочерения)
     */
    public static final int SERVICE_ID = 36400226;


    @Autowired
    private Service36400226FormValidator validator;

    public Service36400226Controller() {

        List<String> stepList = Arrays.asList(
                "Выбор органа ЗАГС обращения",
                "Сведения о ребенке",
                "Основание для усыновления (удочерения)",
                "Сведения об усыновителях",
                "Место рождения усыновителей",
                "Место жительства усыновителей",
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
        if (binder.getTarget() instanceof Service36400226Form) {
            super.setValidator(validator);
            binder.setValidator(validator);
        }
    }

    @Override
    protected Service36400226Form createNewForm() {
        return new Service36400226Form();
    }

    @Override
    public void applyStepRules(Service36400226Form form) throws RuleException {
        Integer stepNum = form.getStepNum();
        if (stepNum != null) {
            switch (stepNum) {

                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    //dirty solution(should be in js)-----------------------------------------
                    //выбор верхней границы для даты
                    /*Не может быть больше даты рождения ребенка
                      Дата рождения должна быть меньше #decision_date - 16 лет.
                      Если задана дата в #merried_doc_date, то дата рождения должна быть меньше #merried_doc_date - 16 лет.
                    */
                    
                   if (form.getMerried_doc_date() != null) {
                        Date merried_date = DateUtils.addYears(form.getMerried_doc_date(), -16);
                        if (merried_date.getTime() > form.getChild_ident_birth_date().getTime()) {
                            form.setEdge_date(form.getChild_ident_birth_date());
                        } else {
                            form.setEdge_date(merried_date);
                        }
                    } else {
                        form.setEdge_date(form.getChild_ident_birth_date());
                    }
                    Date decision_date = DateUtils.addYears(form.getDecision_date(), -16);
                    if(form.getEdge_date().getTime() > decision_date.getTime()) {
                        form.setEdge_date(decision_date);
                    }
                    Date current_date = DateUtils.addYears(new Date(),-18);
                    if(form.getEdge_date().getTime() > current_date.getTime()) {
                        form.setEdge_date(current_date);
                    }

                    //----------------------------------------------------
                    try {
                        String declarent_type;
                        if (form.getDeclarant() == null || form.getDeclarant().equals(StringUtils.EMPTY)) {
                            declarent_type = getDicRegistry().getItemByKey("US_DECLARANT_LS", NOZJVL).getName();
                            form.setDeclarant(NOZJVL);
                        } else {
                            declarent_type = getDicRegistry().getItemByKey("US_DECLARANT_LS", form.getDeclarant()).getName();
                        }
                        form.setDeclarant_info(declarent_type);

                        if (form.getDeclarant().equals(ZJVL_BOTH)) {
                            form.setHe_args_required(true);
                            form.setShe_args_required(true);
                        } else if(form.getDeclarant().equals(ZJVL_HE)){
                            form.setHe_args_required(true);
                            form.setShe_args_required(false);
                        } else if (form.getDeclarant().equals(ZJVL_SHE)){
                            form.setHe_args_required(false);
                            form.setShe_args_required(true);
                        } else{                         // NOZJVL
                            form.setHe_args_required(false);
                            form.setShe_args_required(false);
                        }
                    } catch (DicNotFoundException e) {
                        e.printStackTrace();
                    } catch (DicItemNotFoundException e) {
                        e.printStackTrace();
                    }
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

    private void setSiaParamsToForm(Service36400226Form form) {
        String MALE_SEX = ONE;

        if (MALE_SEX.equals(form.getPerson_sex())) {
            form.setHe_last_name(form.getPerson_last_name());
            form.setHe_first_name(form.getPerson_first_name());
            form.setHe_middle_name(form.getPerson_middle_name());
            form.setHe_birth_date(form.getPerson_birth_date());
            form.setHe_doc_type_gr(ONE);
            form.setHe_doc_ser(form.getPerson_doc_ser());
            form.setHe_doc_number(form.getPerson_doc_num());
            form.setHe_doc_date(form.getPerson_doc_date());
            form.setHe_doc_place(form.getPerson_doc_source());
            form.setHe_living_state(form.getPerson_state());
            form.setHe_living_region(form.getPerson_region());
            form.setHe_living_settlement(form.getPerson_settlement());
            form.setHe_living_street(form.getPerson_street());
            form.setHe_living_house(form.getPerson_house());
            form.setHe_living_building(form.getPerson_building());
            form.setHe_living_flat(form.getPerson_flat());
        } else {   //FEMALE_SEX == 2
            form.setShe_last_name(form.getPerson_last_name());
            form.setShe_first_name(form.getPerson_first_name());
            form.setShe_middle_name(form.getPerson_middle_name());
            form.setShe_birth_date(form.getPerson_birth_date());
            form.setShe_doc_type_gr(ONE);
            form.setShe_doc_ser(form.getPerson_doc_ser());
            form.setShe_doc_number(form.getPerson_doc_num());
            form.setShe_doc_date(form.getPerson_doc_date());
            form.setShe_doc_place(form.getPerson_doc_source());
            form.setShe_living_state(form.getPerson_state());
            form.setShe_living_region(form.getPerson_region());
            form.setShe_living_settlement(form.getPerson_settlement());
            form.setShe_living_street(form.getPerson_street());
            form.setShe_living_house(form.getPerson_house());
            form.setShe_living_building(form.getPerson_building());
            form.setShe_living_flat(form.getPerson_flat());
        }

    }

    @Override
    public void applyInitRules(Service36400226Form form) throws RuleException {

        String mobile = form.getContact_phone_home();
        String phone = form.getContact_phone_mobile();
        if(!mobile.isEmpty())
            phone = phone + "," + mobile;

        form.setContact_phone(phone);

        form.setChild_country(ONE);
        form.setChild_settlement_type_gr(ONE);
        //form.setChild_sex(ONE);
        form.setMerried_doc_source_gr(ONE);

        form.setHe_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "man"));
        form.setShe_nation_dictionary(NationalityUtils.getNahodkaNationality(getDicRegistry(), "woman"));

        form.setHe_birth_place_settlement_type_gr(ONE);
        form.setShe_birth_place_settlement_type_gr(ONE);

        form.setHe_living_place_gr(ONE);
        form.setShe_living_place_gr(ONE);

        form.setHe_doc_type_gr("1");
        form.setShe_doc_type_gr("1");

        form.setHe_doc_type(ONE);
        form.setShe_doc_type(ONE);

        form.setHe_citizenship("3");
        form.setShe_citizenship("3");

        form.setHe_living_country(ONE);
        form.setShe_living_country(ONE);

        form.setHe_birth_place_country(ONE);
        form.setShe_birth_place_country(ONE);

        setSiaParamsToForm(form);

    }
}

   
    