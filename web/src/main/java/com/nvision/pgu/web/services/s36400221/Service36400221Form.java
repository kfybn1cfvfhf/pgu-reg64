package com.nvision.pgu.web.services.s36400221;

import java.util.Date;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;
import org.apache.commons.lang.StringUtils;
/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400221Form extends AbstractNakhodkaForm {

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone;

    public String getContact_phone_mobile() {
        return contact_phone_mobile;
    }

    public void setContact_phone_mobile(String contact_phone_mobile) {
        this.contact_phone_mobile = contact_phone_mobile;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
    private String contact_phone_mobile;

    public String getContact_phone_home() {
        return contact_phone_home;
    }

    public void setContact_phone_home(String contact_phone_home) {
        this.contact_phone_home = contact_phone_home;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone_home;

    private String orderExtId;

    private String time;
    private String date;

    private String he;

    private String she;

    public String getHe() {
        return he;
    }

    public void setHe(String he) {
        this.he = he;
    }

    public String getShe() {
        return she;
    }

    public void setShe(String she) {
        this.she = she;
    }

    //Закладка Выбор органа ЗАГС

    //Поле Выберите желаемое место регистрации
    private String id_agency;    //lookup Запрос к веб-сервису списка ЗАГСов

    private String adresZags;
    private String telephMain;
    private String adresHttp;
    private String agency_id;

    private String groom_birth_place_gr="1";

    public String getGroom_birth_place_gr() {
        return groom_birth_place_gr;
    }

    public void setGroom_birth_place_gr(String groom_birth_place_gr) {
        this.groom_birth_place_gr = groom_birth_place_gr;
    }

    public String getBride_birth_place_gr() {
        return bride_birth_place_gr;
    }

    public void setBride_birth_place_gr(String bride_birth_place_gr) {
        this.bride_birth_place_gr = bride_birth_place_gr;
    }

    private String bride_birth_place_gr="1";
    private String bride_birth_place_m;

    public String getBride_birth_place_m() {
        return bride_birth_place_m;
    }

    public void setBride_birth_place_m(String bride_birth_place_m) {
        this.bride_birth_place_m = bride_birth_place_m;
    }

    public String getGroom_birth_place_m() {
        return groom_birth_place_m;
    }

    public void setGroom_birth_place_m(String groom_birth_place_m) {
        this.groom_birth_place_m = groom_birth_place_m;
    }

    private String groom_birth_place_m;

    public void setId_agency(String id_agency) {
        this.id_agency = id_agency;
    }

    public String getId_agency() {
        return this.id_agency;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;    //валидный адрес email

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email() {
        return this.contact_email;
    }

    //Поле Фамилия
    private String groom_last_name;    //Заполняется автоматически данными из СИА, если пол заявителя - мужской

    //Поле Имя
    private String groom_first_name;    //Заполняется автоматически данными из СИА, если пол заявителя - мужской

    //Поле Отчество
    private String groom_middle_name;    //Заполняется автоматически данными из СИА, если пол заявителя - мужской

    //Поле Дата рождения
    private Date groom_date_of_birth;    //Заполняется автоматически данными из СИА, если пол заявителя - мужской

    //Поле Гражданство
    private String groom_citizenship;

    //Поле Национальность
    private String groom_nationality;    //
    private String groom_nationality_dictionary;

    //Поле Страна
    private String groom_birth_country;    //

    //Поле Область (край, респ.)
    private String groom_birth_state;    //

    //Поле Район
    private String groom_birth_region;    //

    //Поле Тип населенного пункта
    private String groom_birth_place;    //

    //Поле Населенный пункт
    private String groom_birth_settlement;    //

    //Страна
    private String groom_country;    //
    private String groom_place_gr;
    private String bride_place_gr;
    private String groom_ident_doc_type_gr;
    private String groom_ident_doc_type_m;

    public String getGroom_merried_choose() {
        return groom_merried_choose;
    }

    public void setGroom_merried_choose(String groom_merried_choose) {
        if(groom_merried_choose==null)
        {
            this.groom_merried_choose="1";
            return;
        }
        this.groom_merried_choose = groom_merried_choose;
    }

    public String getBride_merried_choose() {
        return bride_merried_choose;
    }

    public void setBride_merried_choose(String bride_merried_choose) {
        if(bride_merried_choose==null)
        {
            this.bride_merried_choose="1";
            return;
        }
        this.bride_merried_choose = bride_merried_choose;
    }

    private String groom_merried_choose;
    private String bride_merried_choose;

    public String getGroom_ident_doc_type_m() {
        return groom_ident_doc_type_m;
    }

    public void setGroom_ident_doc_type_m(String groom_ident_doc_type_m) {
        this.groom_ident_doc_type_m = groom_ident_doc_type_m;
    }

    public String getBride_ident_doc_type_m() {
        return bride_ident_doc_type_m;
    }

    public void setBride_ident_doc_type_m(String bride_ident_doc_type_m) {
        this.bride_ident_doc_type_m = bride_ident_doc_type_m;
    }

    private String bride_ident_doc_type_m;

    public String getGroom_ident_doc_type_gr() {
        return groom_ident_doc_type_gr;
    }

    public void setGroom_ident_doc_type_gr(String groom_ident_doc_type_gr) {
        if(groom_ident_doc_type_gr==null)
        {
            this.groom_ident_doc_type_gr="1";
            return;
        }
        this.groom_ident_doc_type_gr = groom_ident_doc_type_gr;
    }

    public String getBride_ident_doc_type_gr() {
        return bride_ident_doc_type_gr;
    }

    public void setBride_ident_doc_type_gr(String bride_ident_doc_type_gr) {
        if(bride_ident_doc_type_gr==null)
        {
            this.bride_ident_doc_type_gr="1";
            return;
        }
        this.bride_ident_doc_type_gr = bride_ident_doc_type_gr;
    }

    private String bride_ident_doc_type_gr;

    public String getType_street_no() {
        return type_street_no;
    }

    public void setType_street_no(String type_street_no) {
        this.type_street_no = type_street_no;
    }

    private String type_street_no;

    public String getGroom_place_gr() {
        return groom_place_gr;
    }

    public void setGroom_place_gr(String groom_place_gr) {
        if(groom_place_gr==null)
        {
            this.groom_place_gr="1";
            return;
        }
        this.groom_place_gr = groom_place_gr;
    }

    public String getBride_place_gr() {
        return bride_place_gr;
    }

    public void setBride_place_gr(String bride_place_gr) {
        if(bride_place_gr==null)
        {
            this.bride_place_gr="1";
            return;
        }
        this.bride_place_gr = bride_place_gr;
    }

    public String getGroom_place_m() {
        return groom_place_m;
    }

    public void setGroom_place_m(String groom_place_m) {
        this.groom_place_m = groom_place_m;
    }

    public String getBride_place_m() {
        return bride_place_m;
    }

    public void setBride_place_m(String bride_place_m) {
        this.bride_place_m = bride_place_m;
    }

    private String groom_place_m;
    private String bride_place_m;
    //Поле Область (край, респ.)
    private String groom_state;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String sia_state;

    //Поле Район
    private Date reg_date_clone = new Date();
    private String groom_region;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String sia_region;    //

    //Поле Тип населенного пункта
    private String groom_place;    //

    //Поле Населенный пункт
    private String groom_settlement;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String sia_settlement;

    //Поле Улица
    private String groom_street;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String sia_street;

    //Поле Дом
    private String groom_house;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String sia_house;    //

    //Поле Корпус
    private String groom_building;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
    private String sia_building;

    //Поле Квартира
    private String groom_flat;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
    private String sia_flat;

    private String groom_ident_doc_type;    //

    //Поле Серия
    private String groom_doc_ser;    //

    //Поле Номер
    private String groom_doc_num;    //

    //Поле Дата выдачи
    private Date groom_doc_date;    //

    //Поле Организация
    private String groom_doc_source;    //

    //Поле Тип документа
    private String groom_merried_doc_type;    //


    //Поле № записи акта
    private String groom_merried_doc_num;    //

    //Поле Дата выдачи
    private Date groom_merried_doc_date;    //

    //Поле Место регистрации
    private String groom_merried_doc_source;    //

    //Поле Он
    private String groom_new_last_name;    //

    //Поле Дата
    private String reg_date;    //Запрос к веб-сервису

    //Поле Торжественная регистрация
    private String reg_is_grand = "on";    //

    //Поле Время
    private String reg_time;    //lookup Запрос к веб-сервису с учетом выбранной даты

    //Поле Зал
    private String reg_hall;    //lookup Запрос к веб-сервису с учетом выбранной даты

    //Поле Она

    //Поле Фамилия
    private String bride_last_name;    //Заполняется автоматически данными из СИА, если пол заявителя - женский

    //Поле Имя
    private String bride_first_name;    //Заполняется автоматически данными из СИА, если пол заявителя - женский

    //Поле Отчество
    private String bride_middle_name;    //Заполняется автоматически данными из СИА, если пол заявителя - женский

    //Поле Дата рождения
    private Date bride_date_of_birth;    //Заполняется автоматически данными из СИА, если пол заявителя - женский

    //Поле Гражданство
    private String bride_citizenship;    //Заполняется автоматически данными из СИА, если пол заявителя - женский

    //Поле Национальность
    private String bride_nationality;    //
    private String bride_nationality_dictionary;

    //Закладка Место рождения

    //Поле Он

    //Поле Она



    private String bride_birth_country;    //

    //Поле Область (край, респ.)
    private String bride_birth_state;    //

    //Поле Район
    private String bride_birth_region;    //

    //Поле Тип населенного пункта
    private String bride_birth_place;    //

    //Поле Населенный пункт
    private String bride_birth_settlement;    //

    //Закладка Место жительства

    //Поле Он

    //Поле Страна

    //Поле Она

    //Поле Страна
    private String bride_country;    //

    //Поле Область (край, респ.)
    private String bride_state;    //

    //Поле Район
    private String bride_region;    //

    //Поле Тип населенного пункта
    private String bride_place;    //

    //Поле Населенный пункт
    private String bride_settlement;    //

    //Поле Улица
    private String bride_street;    //

    //Поле Дом
    private String bride_house;    //

    //Поле Корпус
    private String bride_building;    //

    //Поле Квартира
    private String bride_flat;    //


    //Закладка Документ, удостоверяющий личность

    //Поле Он

    //Поле Тип документа

    //Поле Она

    //Поле Тип документа
    private String bride_ident_doc_type;    //

    /*@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String sia_ident_doc_type;*/

    //Поле Серия
    private String bride_doc_ser;    //

    //Поле Номер
    private String bride_doc_num;    //

    /*@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String sia_doc_ser;*/

    /*@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String sia_doc_num;*/

    //Поле Дата выдачи
    private Date bride_doc_date;    //

    /*@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date sia_doc_date;*/

    //Поле Организация
    private String bride_doc_source;    //

/*    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String sia_doc_source;*/

    //Закладка Сведения о предыдущем браке

    //Поле Документ, подтверждающий прекращение предыдущего брака

    //Поле Он

    //Поле Она

    //Поле Тип документа
    private String bride_merried_doc_type;    //


    //Поле № записи акта
    private String bride_merried_doc_num;    //


    //Поле Дата выдачи
    private Date bride_merried_doc_date;    //


    //Поле Место регистрации
    private String bride_merried_doc_source;    //

    private String groom_street_type;
    private String bride_street_type;


    //Закладка Смена фамилии

    //Поле Фамилии после заключения брака

    //Поле Она
    private String bride_new_last_name;    //

    private String calculatedHour;
    private String calculatedMin;
    private String calculatedHall;

    public String getCalculatedHour() {
        return calculatedHour;
    }

    public void setCalculatedHour(String calculatedHour) {
        this.calculatedHour = calculatedHour;
    }

    public String getCalculatedMin() {
        return calculatedMin;
    }

    public void setCalculatedMin(String calculatedMin) {
        this.calculatedMin = calculatedMin;
    }

    public String getCalculatedHall() {
        return calculatedHall;
    }

    public void setCalculatedHall(String calculatedHall) {
        this.calculatedHall = calculatedHall;
    }

    public String getGroom_street_type() {
        return groom_street_type;
    }

    public void setGroom_street_type(String groom_street_type) {
       this.groom_street_type = groom_street_type;
    }

    public String getBride_street_type() {
        return bride_street_type;
    }

    public void setBride_street_type(String bride_street_type) {
        this.bride_street_type = bride_street_type;
    }

    public String getBride_last_name() {
        return bride_last_name;
    }

    public void setBride_last_name(String bride_last_name) {
        this.bride_last_name = bride_last_name;
    }

    public String getBride_first_name() {
        return bride_first_name;
    }

    public void setBride_first_name(String bride_first_name) {
        this.bride_first_name = bride_first_name;
    }

    public String getBride_middle_name() {
        return bride_middle_name;
    }

    public void setBride_middle_name(String bride_middle_name) {
        this.bride_middle_name = bride_middle_name;
    }

    public Date getBride_date_of_birth() {
        return bride_date_of_birth;
    }

    public void setBride_date_of_birth(Date bride_date_of_birth) {
        this.bride_date_of_birth = bride_date_of_birth;
    }

    public String getBride_citizenship() {
        return bride_citizenship;
    }

    public void setBride_citizenship(String bride_citizenship) {
        this.bride_citizenship = bride_citizenship;
    }

    public String getBride_nationality() {
        return bride_nationality;
    }

    public String getSia_state() {
        return sia_state;
    }

    public String getSia_region() {
        return sia_region;
    }

    public String getSia_settlement() {
        return sia_settlement;
    }

    public void setSia_settlement(String sia_settlement) {
        this.sia_settlement = sia_settlement;
    }

    public String getSia_street() {
        return sia_street;
    }

    public void setSia_street(String sia_street) {
        this.sia_street = sia_street;
    }

    public String getSia_house() {
        return sia_house;
    }

    public void setSia_house(String sia_house) {
        this.sia_house = sia_house;
    }

    public String getSia_building() {
        return sia_building;
    }

    public String getSia_flat() {
        return sia_flat;
    }

    public void setSia_flat(String sia_flat) {
        this.sia_flat = sia_flat;
    }

    public void setSia_building(String sia_building) {
        this.sia_building = sia_building;
    }

    public void setSia_region(String sia_region) {
        this.sia_region = sia_region;
    }

    public void setSia_state(String sia_state) {
        this.sia_state = sia_state;
    }

    public void setBride_nationality(String bride_nationality) {
        this.bride_nationality = bride_nationality;
    }

    public String getBride_birth_country() {
        return bride_birth_country;
    }

    public void setBride_birth_country(String bride_birth_country) {
        this.bride_birth_country = bride_birth_country;
    }

    public String getBride_birth_state() {
        return bride_birth_state;
    }

    public void setBride_birth_state(String bride_birth_state) {
        this.bride_birth_state = bride_birth_state;
    }

    public String getBride_birth_region() {
        return bride_birth_region;
    }

    public void setBride_birth_region(String bride_birth_region) {
        this.bride_birth_region = bride_birth_region;
    }

    public Date getReg_date_clone() {
        return reg_date_clone;
    }

    public void setReg_date_clone(Date reg_date_clone) {
        this.reg_date_clone = reg_date_clone;
    }

    public String getBride_birth_place() {
        return bride_birth_place;
    }

    public void setBride_birth_place(String bride_birth_place) {
        this.bride_birth_place = bride_birth_place;
    }

    public String getBride_birth_settlement() {
        return bride_birth_settlement;
    }

    public void setBride_birth_settlement(String bride_birth_settlement) {
        this.bride_birth_settlement = bride_birth_settlement;
    }

    public String getBride_country() {
        return bride_country;
    }

    public void setBride_country(String bride_country) {
        this.bride_country = bride_country;
    }

    public String getBride_state() {
        return bride_state;
    }

    public void setBride_state(String bride_state) {
        this.bride_state = bride_state;
    }

    public String getBride_region() {
        return bride_region;
    }

    public void setBride_region(String bride_region) {
        this.bride_region = bride_region;
    }

    public String getBride_place() {
        return bride_place;
    }

    public void setBride_place(String bride_place) {
        this.bride_place = bride_place;
    }

    public String getBride_settlement() {
        return bride_settlement;
    }

    public void setBride_settlement(String bride_settlement) {
        this.bride_settlement = bride_settlement;
    }

    public String getBride_street() {
        return bride_street;
    }

    public void setBride_street(String bride_street) {
        this.bride_street = bride_street;
    }

    public String getBride_house() {
        return bride_house;
    }

    public void setBride_house(String bride_house) {
        this.bride_house = bride_house;
    }

    public String getBride_building() {
        return bride_building;
    }

    public void setBride_building(String bride_building) {
        this.bride_building = bride_building;
    }

    public String getBride_flat() {
        return bride_flat;
    }

    public void setBride_flat(String bride_flat) {
        this.bride_flat = bride_flat;
    }

    public String getBride_ident_doc_type() {
        return bride_ident_doc_type;
    }

    public void setBride_ident_doc_type(String bride_ident_doc_type) {
        this.bride_ident_doc_type = bride_ident_doc_type;
    }

    public String getBride_doc_ser() {
        return bride_doc_ser;
    }

    public void setBride_doc_ser(String bride_doc_ser) {
        this.bride_doc_ser = bride_doc_ser;
    }

/*    public String getSia_ident_doc_type() {
        return sia_ident_doc_type;
    }

    public String getSia_doc_ser() {
        return sia_doc_ser;
    }

    public String getSia_doc_num() {
        return sia_doc_num;
    }

    public Date getSia_doc_date() {
        return sia_doc_date;
    }

    public String getSia_doc_source() {
        return sia_doc_source;
    }

    public void setSia_doc_source(String sia_doc_source) {
        this.sia_doc_source = sia_doc_source;
    }

    public void setSia_doc_date(Date sia_doc_date) {
        this.sia_doc_date = sia_doc_date;
    }

    public void setSia_doc_num(String sia_doc_num) {
        this.sia_doc_num = sia_doc_num;
    }

    public void setSia_doc_ser(String sia_doc_ser) {
        this.sia_doc_ser = sia_doc_ser;
    }

    public void setSia_ident_doc_type(String sia_ident_doc_type) {
        this.sia_ident_doc_type = sia_ident_doc_type;
    }*/

    public String getBride_doc_num() {
        return bride_doc_num;
    }

    public void setBride_doc_num(String bride_doc_num) {
        this.bride_doc_num = bride_doc_num;
    }

    public Date getBride_doc_date() {
        return bride_doc_date;
    }

    public void setBride_doc_date(Date bride_doc_date) {
        this.bride_doc_date = bride_doc_date;
    }

    public String getBride_doc_source() {
        return bride_doc_source;
    }

    public void setBride_doc_source(String bride_doc_source) {
        this.bride_doc_source = bride_doc_source;
    }

    public String getBride_merried_doc_type() {
        return bride_merried_doc_type;
    }

    public void setBride_merried_doc_type(String bride_merried_doc_type) {
        this.bride_merried_doc_type = bride_merried_doc_type;
    }

    public String getBride_merried_doc_num() {
        return bride_merried_doc_num;
    }

    public void setBride_merried_doc_num(String bride_merried_doc_num) {
        this.bride_merried_doc_num = bride_merried_doc_num;
    }

    public Date getBride_merried_doc_date() {
        return bride_merried_doc_date;
    }

    public void setBride_merried_doc_date(Date bride_merried_doc_date) {
        this.bride_merried_doc_date = bride_merried_doc_date;
    }

    public String getBride_merried_doc_source() {
        return bride_merried_doc_source;
    }

    public void setBride_merried_doc_source(String bride_merried_doc_source) {
        this.bride_merried_doc_source = bride_merried_doc_source;
    }

    public String getBride_new_last_name() {
        return bride_new_last_name;
    }

    public void setBride_new_last_name(String bride_new_last_name) {
        this.bride_new_last_name = bride_new_last_name;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getReg_is_grand() {
        return reg_is_grand;
    }

    public void setReg_is_grand(String reg_is_grand) {
        this.reg_is_grand = reg_is_grand;
    }

    public String getReg_time() {
        return reg_time;
    }

    public void setReg_time(String reg_time) {
        this.reg_time = reg_time;
    }

    public String getReg_hall() {
        return reg_hall;
    }

    public void setReg_hall(String reg_hall) {
        this.reg_hall = reg_hall;
    }

    public String getGroom_last_name() {
        return groom_last_name;
    }

    public void setGroom_last_name(String groom_last_name) {
        this.groom_last_name = groom_last_name;
    }

    public String getGroom_first_name() {
        return groom_first_name;
    }

    public void setGroom_first_name(String groom_first_name) {
        this.groom_first_name = groom_first_name;
    }

    public String getGroom_middle_name() {
        return groom_middle_name;
    }

    public void setGroom_middle_name(String groom_middle_name) {
        this.groom_middle_name = groom_middle_name;
    }

    public Date getGroom_date_of_birth() {
        return groom_date_of_birth;
    }

    public void setGroom_date_of_birth(Date groom_date_of_birth) {
        this.groom_date_of_birth = groom_date_of_birth;
    }

    public String getGroom_citizenship() {
        return groom_citizenship;
    }

    public void setGroom_citizenship(String groom_citizenship) {
        this.groom_citizenship = groom_citizenship;
    }

    public String getGroom_nationality() {
        return groom_nationality;
    }

    public void setGroom_nationality(String groom_nationality) {
        this.groom_nationality = groom_nationality;
    }

    public String getGroom_birth_country() {
        return groom_birth_country;
    }

    public void setGroom_birth_country(String groom_birth_country) {
        this.groom_birth_country = groom_birth_country;
    }

    public String getGroom_birth_state() {
        return groom_birth_state;
    }

    public void setGroom_birth_state(String groom_birth_state) {
        this.groom_birth_state = groom_birth_state;
    }

    public String getGroom_birth_region() {
        return groom_birth_region;
    }

    public void setGroom_birth_region(String groom_birth_region) {
        this.groom_birth_region = groom_birth_region;
    }

    public String getGroom_birth_place() {
        return groom_birth_place;
    }

    public void setGroom_birth_place(String groom_birth_place) {
        this.groom_birth_place = groom_birth_place;
    }

    public String getGroom_birth_settlement() {
        return groom_birth_settlement;
    }

    public void setGroom_birth_settlement(String groom_birth_settlement) {
        this.groom_birth_settlement = groom_birth_settlement;
    }

    public String getGroom_country() {
        return groom_country;
    }

    public void setGroom_country(String groom_country) {
        this.groom_country = groom_country;
    }

    public String getGroom_state() {
        return groom_state;
    }

    public void setGroom_state(String groom_state) {
        this.groom_state = groom_state;
    }

    public String getGroom_region() {
        return groom_region;
    }

    public void setGroom_region(String groom_region) {
        this.groom_region = groom_region;
    }

    public String getGroom_place() {
        return groom_place;
    }

    public void setGroom_place(String groom_place) {
        this.groom_place = groom_place;
    }

    public String getGroom_settlement() {
        return groom_settlement;
    }

    public void setGroom_settlement(String groom_settlement) {
        this.groom_settlement = groom_settlement;
    }

    public String getGroom_street() {
        return groom_street;
    }

    public void setGroom_street(String groom_street) {
        this.groom_street = groom_street;
    }

    public String getGroom_house() {
        return groom_house;
    }

    public void setGroom_house(String groom_house) {
        this.groom_house = groom_house;
    }

    public String getGroom_building() {
        return groom_building;
    }

    public void setGroom_building(String groom_building) {
        this.groom_building = groom_building;
    }

    public String getGroom_flat() {
        return groom_flat;
    }

    public void setGroom_flat(String groom_flat) {
        this.groom_flat = groom_flat;
    }

    public String getGroom_ident_doc_type() {
       return groom_ident_doc_type;
    }

    public void setGroom_ident_doc_type(String groom_ident_doc_type) {
        this.groom_ident_doc_type = groom_ident_doc_type;
    }

    public String getGroom_doc_ser() {
        return groom_doc_ser;
    }

    public void setGroom_doc_ser(String groom_doc_ser) {
        this.groom_doc_ser = groom_doc_ser;
    }

    public String getGroom_doc_num() {
        return groom_doc_num;
    }

    public void setGroom_doc_num(String groom_doc_num) {
        this.groom_doc_num = groom_doc_num;
    }

    public Date getGroom_doc_date() {
        return groom_doc_date;
    }

    public void setGroom_doc_date(Date groom_doc_date) {
        this.groom_doc_date = groom_doc_date;
    }

    public String getGroom_doc_source() {
        return groom_doc_source;
    }

    public void setGroom_doc_source(String groom_doc_source) {
        this.groom_doc_source = groom_doc_source;
    }

    public String getGroom_merried_doc_type() {
        return groom_merried_doc_type;
    }

    public void setGroom_merried_doc_type(String groom_merried_doc_type) {
        this.groom_merried_doc_type = groom_merried_doc_type;
    }

    public String getGroom_merried_doc_num() {
        return groom_merried_doc_num;
    }

    public void setGroom_merried_doc_num(String groom_merried_doc_num) {
        this.groom_merried_doc_num = groom_merried_doc_num;
    }

    public Date getGroom_merried_doc_date() {
        return groom_merried_doc_date;
    }

    public void setGroom_merried_doc_date(Date groom_merried_doc_date) {
        this.groom_merried_doc_date = groom_merried_doc_date;
    }

    public String getGroom_merried_doc_source() {
        return groom_merried_doc_source;
    }

    public void setGroom_merried_doc_source(String groom_merried_doc_source) {
        this.groom_merried_doc_source = groom_merried_doc_source;
    }

    public String getGroom_new_last_name() {
        return groom_new_last_name;
    }

    public void setGroom_new_last_name(String groom_new_last_name) {
        this.groom_new_last_name = groom_new_last_name;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
    String sia_sex;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    String sia_last_name;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    String sia_first_name;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    String sia_middle_name;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    Date sia_date_of_birth;

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.)
    String sia_citizenship;

    public String getSia_last_name() {
        return sia_last_name;
    }

    public void setSia_last_name(String sia_last_name) {
        this.sia_last_name = sia_last_name;
    }

    public String getSia_first_name() {
        return sia_first_name;
    }

    public void setSia_first_name(String sia_first_name) {
        this.sia_first_name = sia_first_name;
    }

    public String getSia_middle_name() {
        return sia_middle_name;
    }

    public void setSia_middle_name(String sia_middle_name) {
        this.sia_middle_name = sia_middle_name;
    }

    public Date getSia_date_of_birth() {
        return sia_date_of_birth;
    }

    public void setSia_date_of_birth(Date sia_date_of_birth) {
        this.sia_date_of_birth = sia_date_of_birth;
    }

    public String getSia_sex() {
        return sia_sex;
    }

    public void setSia_sex(String sia_sex) {
        this.sia_sex = sia_sex;
    }

    public String getSia_citizenship() {
        return sia_citizenship;
    }

    public void setSia_citizenship(String sia_citizenship) {
        this.sia_citizenship = sia_citizenship;
    }

    public String getAdresZags() {
        return adresZags;
    }

    public void setAdresZags(String adresZags) {
        this.adresZags = adresZags;
    }

    public String getTelephMain() {
        return telephMain;
    }

    public void setTelephMain(String telephMain) {
        this.telephMain = telephMain;
    }

    public String getAdresHttp() {
        return adresHttp;
    }

    public void setAdresHttp(String adresHttp) {
        this.adresHttp = adresHttp;
    }

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    public String getGroom_nationality_dictionary() {
        return groom_nationality_dictionary;
    }

    public void setGroom_nationality_dictionary(String groom_nationality_dictionary) {
        this.groom_nationality_dictionary = groom_nationality_dictionary;
    }

    public String getBride_nationality_dictionary() {
        return bride_nationality_dictionary;
    }

    public void setBride_nationality_dictionary(String bride_nationality_dictionary) {
        this.bride_nationality_dictionary = bride_nationality_dictionary;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderExtId() {
        return orderExtId;
    }

    public void setOrderExtId(String orderExtId) {
        this.orderExtId = orderExtId;
    }




    //Закладка Место рождения

    //Поле Место рождения

    //Поле Он

    //Поле Страна:



    private String birth_he_country = "643";

    private String he_countryCode = "ru";

    private String he_live_countryCode = "ru";

    private String he_country_settlement = "2";

    private String he_country_settlement_live = "2";

    public String getBirth_he_country() {
        return birth_he_country;
    }

    public void setBirth_he_country(String birth_he_country) {
        this.birth_he_country = birth_he_country;
    }

    public String getHe_countryCode() {
        return he_countryCode;
    }

    public void setHe_countryCode(String he_countryCode) {
        this.he_countryCode = he_countryCode;
    }

    public String getHe_live_countryCode() {
        return he_live_countryCode;
    }

    public void setHe_live_countryCode(String he_live_countryCode) {
        this.he_live_countryCode = he_live_countryCode;
    }

    public String getHe_country_settlement() {
        return he_country_settlement;
    }

    public void setHe_country_settlement(String he_country_settlement) {
        this.he_country_settlement = he_country_settlement;
    }

    public String getHe_country_settlement_live() {
        return he_country_settlement_live;
    }

    public void setHe_country_settlement_live(String he_country_settlement_live) {
        this.he_country_settlement_live = he_country_settlement_live;
    }

    //Поле Область:

    private String birth_he_area;

    public String getBirth_he_area() {
        return birth_he_area;
    }

    public void setBirth_he_area(String birth_he_area) {
        this.birth_he_area = birth_he_area;
    }

    //Поле Район:

    private String birth_he_region;

    public String getBirth_he_region() {
        return birth_he_region;
    }

    public void setBirth_he_region(String birth_he_region) {
        this.birth_he_region = birth_he_region;
    }

    //Поле Город:

    private String birth_he_city;

    public String getBirth_he_city() {
        return birth_he_city;
    }

    public void setBirth_he_city(String birth_he_city) {
        this.birth_he_city = birth_he_city;
    }

    //Поле Населенный пункт:

    private String birth_he_community;

    public String getBirth_he_community() {
        return birth_he_community;
    }

    public void setBirth_he_community(String birth_he_community) {
        this.birth_he_community = birth_he_community;
    }

    //Поле Область:


    private String birth_he_area_txt;    //Показывается если в поле Страна НЕ выбрана Россия

    //Поле Район:


    private String birth_he_region_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия

    private String birth_he_settlement_type = "2";  //

    //Поле Город:


    private String birth_he_city_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия

    //Поле Населенный пункт:


    private String birth_he_community_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия


    //Поле Она

    //Поле Страна:

    private String birth_she_country = "643";

    private String she_countryCode = "ru";

    private String she_live_countryCode = "ru";

    private String she_country_settlement = "2";

    private String she_country_settlement_live = "2";

    public String getBirth_she_country() {
        return birth_she_country;
    }

    public void setBirth_she_country(String birth_she_country) {
        this.birth_she_country = birth_she_country;
    }

    public String getShe_countryCode() {
        return she_countryCode;
    }

    public void setShe_countryCode(String she_countryCode) {
        this.she_countryCode = she_countryCode;
    }

    public String getShe_live_countryCode() {
        return she_live_countryCode;
    }

    public void setShe_live_countryCode(String she_live_countryCode) {
        this.she_live_countryCode = she_live_countryCode;
    }

    public String getShe_country_settlement() {
        return she_country_settlement;
    }

    public void setShe_country_settlement(String she_country_settlement) {
        this.she_country_settlement = she_country_settlement;
    }

    public String getShe_country_settlement_live() {
        return she_country_settlement_live;
    }

    public void setShe_country_settlement_live(String she_country_settlement_live) {
        this.she_country_settlement_live = she_country_settlement_live;
    }


    //Поле Область:

    private String birth_she_area;

    public String getBirth_she_area() {
        return birth_she_area;
    }

    public void setBirth_she_area(String birth_she_area) {
        this.birth_she_area = birth_she_area;
    }

    //Поле Район:

    private String birth_she_region;

    public String getBirth_she_region() {
        return birth_she_region;
    }

    public void setBirth_she_region(String birth_she_region) {
        this.birth_she_region = birth_she_region;
    }

    //Поле Город:

    private String birth_she_city;

    public String getBirth_she_city() {
        return birth_she_city;
    }

    public void setBirth_she_city(String birth_she_city) {
        this.birth_she_city = birth_she_city;
    }

    //Поле Населенный пункт:

    private String birth_she_community;

    public String getBirth_she_community() {
        return birth_she_community;
    }

    public void setBirth_she_community(String birth_she_community) {
        this.birth_she_community = birth_she_community;
    }

    //Поле Область:


    private String birth_she_area_txt;    //Показывается если в поле Страна НЕ выбрана Россия

    //Поле Район:


    private String birth_she_region_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия

    private String birth_she_settlement_type;
    //Поле Город:


    private String birth_she_city_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия

    //Поле Населенный пункт:


    private String birth_she_community_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия


    //Закладка Место жительства

    //Поле Место жительства

    //Поле Он

    //Поле Страна:

    private String living_he_country = "643";

    public String getLiving_he_country() {
        return living_he_country;
    }

    public void setLiving_he_country(String living_he_country) {
        this.living_he_country = living_he_country;
    }

    //Поле Область:

    private String living_he_area;

    public String getLiving_he_area() {
        return living_he_area;
    }

    public void setLiving_he_area(String living_he_area) {
        this.living_he_area = living_he_area;
    }

    //Поле Район:

    private String living_he_region;

    public String getLiving_he_region() {
        return living_he_region;
    }

    public void setLiving_he_region(String living_he_region) {
        this.living_he_region = living_he_region;
    }

    //Поле Город:

    private String living_he_city;

    public String getLiving_he_city() {
        return living_he_city;
    }

    public void setLiving_he_city(String living_he_city) {
        this.living_he_city = living_he_city;
    }

    //Поле Населенный пункт:

    private String living_he_community;

    public String getLiving_he_community() {
        return living_he_community;
    }

    public void setLiving_he_community(String living_he_community) {
        this.living_he_community = living_he_community;
    }

    //Поле Улица:

    private String living_he_street;

    private String living_he_street_txt;
    //Поле Дом:


    private String living_he_house;    //

    //Поле Корпус:


    private String living_he_corp;    //

    //Поле Квартира:


    private String living_he_flat;    //

    //Поле Область:


    private String living_he_area_txt;    //Показывается если в поле Страна НЕ выбрана Россия

    //Поле Район:


    private String living_he_region_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия

    private String living_he_settlement_type;
    //Поле Город:


    private String living_he_city_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия

    //Поле Населенный пункт:


    private String living_he_community_txt;    //Заполняется хотя бы одно из полей. Показывается если в поле Страна НЕ выбрана Россия



    //Закладка Место рождения

    //Поле Место рождения

    //Поле Он

    //Поле Страна:

    //Поле Область:

    //Поле Район:

    //Поле Город:

    //Поле Населенный пункт:

    //Поле Она

    //Поле Страна:

    //Поле Область:

    //Поле Район:

    //Поле Город:

    //Поле Населенный пункт:


    //Закладка Место жительства

    //Поле Место жительства

    //Поле Он

    //Поле Страна:

    //Поле Область:

    //Поле Район:

    //Поле Город:

    //Поле Населенный пункт:

    //Поле Улица:

    public String getLiving_he_street() {
        return living_he_street;
    }

    public void setLiving_he_street(String living_he_street) {
        this.living_he_street = living_he_street;
    }

    //Поле Дом:

    public String getLiving_he_house() {
        return living_he_house;
    }

    public void setLiving_he_house(String living_he_house) {
        this.living_he_house = living_he_house;
    }

    //Поле Корпус:

    public String getLiving_he_corp() {
        return living_he_corp;
    }

    public void setLiving_he_corp(String living_he_corp) {
        this.living_he_corp = living_he_corp;
    }

    //Поле Квартира:

    public String getLiving_he_flat() {
        return living_he_flat;
    }

    public void setLiving_he_flat(String living_he_flat) {
        this.living_he_flat = living_he_flat;
    }

    //new

    private String living_he_address_input = "1";

    public String getLiving_he_address_input() {
        return living_he_address_input;
    }

    public void setLiving_he_address_input(String living_he_address_input) {
        this.living_he_address_input = living_he_address_input;
    }

    private String living_he_country_input;

    public String getLiving_he_country_input() {
        return living_he_country_input;
    }

    public void setLiving_he_country_input(String living_he_country_input) {
        this.living_he_country_input = living_he_country_input;
    }

    private String living_she_settlement_type="2";

    public String getLiving_she_settlement_type() {
        return living_she_settlement_type;
    }

    public void setLiving_she_settlement_type(String living_she_settlement_type) {
        if (living_she_settlement_type == null || living_she_settlement_type.isEmpty()) {
            this.living_she_settlement_type = "2";
        } else {
            this.living_she_settlement_type = living_she_settlement_type;
        }
    }

    public String getLiving_he_area_txt() {
        return living_he_area_txt;
    }

    public void setLiving_he_area_txt(String living_he_area_txt) {
        this.living_he_area_txt = living_he_area_txt;
    }

    public String getLiving_he_region_txt() {
        return living_he_region_txt;
    }

    public void setLiving_he_region_txt(String living_he_region_txt) {
        this.living_he_region_txt = living_he_region_txt;
    }

    public String getLiving_he_community_txt() {
        return living_he_community_txt;
    }

    public void setLiving_he_community_txt(String living_he_community_txt) {
        this.living_he_community_txt = living_he_community_txt;
    }

    public String getLiving_he_city_txt() {
        return living_he_city_txt;
    }

    public void setLiving_he_city_txt(String living_he_city_txt) {
        this.living_he_city_txt = living_he_city_txt;
    }

    public String getLiving_he_street_txt() {
        return living_he_street_txt;
    }

    public void setLiving_he_street_txt(String living_he_street_txt) {
        this.living_he_street_txt = living_he_street_txt;
    }

    // new 2
    public String getLiving_he_settlement_type() {
        return living_he_settlement_type;
    }

    public void setLiving_he_settlement_type(String living_he_settlement_type) {
        this.living_he_settlement_type = living_he_settlement_type;
    }

    private String living_she_country_input;

    public String getLiving_she_country_input() {
        return living_she_country_input;
    }

    public void setLiving_she_country_input(String living_she_country_input) {
        this.living_she_country_input = living_she_country_input;
    }

    private String living_she_community_txt;

    public String getLiving_she_community_txt() {
        return living_she_community_txt;
    }

    public void setLiving_she_community_txt(String living_she_community_txt) {
        this.living_she_community_txt = living_she_community_txt;
    }

    private String living_she_city_txt;

    public String getLiving_she_city_txt() {
        return living_she_city_txt;
    }

    public void setLiving_she_city_txt(String living_she_city_txt) {
        this.living_she_city_txt = living_she_city_txt;
    }

    private String living_she_street_txt;

    public String getLiving_she_street_txt() {
        return living_she_street_txt;
    }

    public void setLiving_she_street_txt(String living_she_street_txt) {
        this.living_she_street_txt = living_she_street_txt;
    }

    // new 3_1

    private String birth_he_country_input;

    public String getBirth_he_country_input() {
        return birth_he_country_input;
    }

    public void setBirth_he_country_input(String birth_he_country_input) {
        this.birth_he_country_input = birth_he_country_input;
    }

    private String birth_she_country_input;

    public String getBirth_she_country_input() {
        return birth_she_country_input;
    }

    public void setBirth_she_country_input(String birth_she_country_input) {
        this.birth_she_country_input = birth_she_country_input;
    }

    public String getBirth_he_settlement_type() {
        return birth_he_settlement_type;
    }

    public void setBirth_he_settlement_type(String birth_he_settlement_type) {
        this.birth_he_settlement_type = StringUtils.isBlank(birth_he_settlement_type) ? "2" : birth_he_settlement_type;
    }

    public String getBirth_she_settlement_type() {
        return birth_she_settlement_type;
    }

    public void setBirth_she_settlement_type(String birth_she_settlement_type) {
        this.birth_she_settlement_type = StringUtils.isBlank(birth_she_settlement_type) ? "2" : birth_she_settlement_type;
    }

    public String getBirth_he_community_txt() {
        return birth_he_community_txt;
    }

    public void setBirth_he_community_txt(String birth_he_community_txt) {
        this.birth_he_community_txt = birth_he_community_txt;
    }

    public String getBirth_she_community_txt() {
        return birth_she_community_txt;
    }

    public void setBirth_she_community_txt(String birth_she_community_txt) {
        this.birth_she_community_txt = birth_she_community_txt;
    }

    public String getBirth_he_city_txt() {
        return birth_he_city_txt;
    }

    public void setBirth_he_city_txt(String birth_he_city_txt) {
        this.birth_he_city_txt = birth_he_city_txt;
    }

    public String getBirth_she_city_txt() {
        return birth_she_city_txt;
    }

    public void setBirth_she_city_txt(String birth_she_city_txt) {
        this.birth_she_city_txt = birth_she_city_txt;
    }






}
