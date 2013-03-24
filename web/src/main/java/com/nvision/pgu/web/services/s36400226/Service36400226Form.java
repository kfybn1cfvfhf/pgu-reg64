package com.nvision.pgu.web.services.s36400226;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400226Form extends AbstractNakhodkaForm {

   private Date  edge_date;
    
    //Данные полученные из ЛК

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
    private String person_sex;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String person_last_name;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String person_first_name;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String person_middle_name;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String person_state;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String person_region;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String person_settlement;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String person_street;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String person_house;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
    private String person_building;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
    private String person_flat;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String person_ident_doc_type;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String person_doc_ser;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String person_doc_num;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date person_doc_date;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String person_doc_source;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date person_birth_date;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE_OR_PHONE)
    private String contact_phone;

    public String getContact_phone_home() {
        return contact_phone_home;
    }

    public void setContact_phone_home(String contact_phone_home) {
        this.contact_phone_home = contact_phone_home;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone_home;

    public String getContact_phone_mobile() {
        return contact_phone_mobile;
    }

    public void setContact_phone_mobile(String contact_phone_mobile) {
        this.contact_phone_mobile = contact_phone_mobile;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
    private String contact_phone_mobile;

    //Закладка Выбор органа ЗАГС обращения

    //Поле ЗАГС обращения
    private String id_agency_in;
    //Поле Информация о ЗАГСе
    private String agency_in_info;
    private String agency_id;
    private String adresZags;
    private String telephMain;
    private String adresHttp;


    //Закладка Сведения о ребенке

    //Поле Фамилия
    private String child_last_name;
    //Поле Имя
    private String child_first_name;
    //Поле Отчество
    private String child_middle_name;
    //Поле Дата рождения
    private Date child_ident_birth_date;
    //Поле Пол
    private String child_sex;
    //Поле Страна
    private String child_country;
    //Поле Область (край, респ.)
    private String child_state;
    //Поле Район
    private String child_region;
    //Поле Способ заполнения типа населенного пункта
    private String child_settlement_type_gr;
    //Поле Тип населенного пункта для заполнения из словаря
    private String child_settlement_type;
    //Поле Тип населенного пункта для ручного заполнения
    private String child_settlement_type_m;
    //Поле Населенный пункт
    private String child_settlement;


    //Закладка Основание для усыновления (удочерения)

    //Поле Заявитель
    private String declarant;
    //Поле Решение суда
    private String decision_law;
    //Поле Дата
    private Date decision_date;
    //Поле Номер акта
    private String merried_doc_num;
    //Поле Дата
    private Date merried_doc_date;
    //Способо заполнения поля ЗАГС
    private String  merried_doc_source_gr;
    //Поле ЗАГС из справочника
    private String  merried_doc_source_list;
    //Поле ЗАГС вручную
    private String merried_doc_source;


    //Закладка Сведения об усыновителях
    private String aggregate_args_required;
    //Флаг необходимости заполнения его данных
    private Boolean he_args_required;
    //Флаг необходимости заполнения ее данных
    private Boolean she_args_required;
    //Пол из ЛК
    ///private String gender;

    //Тип заявителя, зависит от значения в поле declarant
    private String declarant_info;

    //Поле Он
    //Поле Фамилия
    private String he_last_name;
    //Поле Имя
    private String he_first_name;
    //Поле Отчество
    private String he_middle_name;
    //Поле Дата рождения
    private Date he_birth_date;
    //Поле Гражданство
    private String he_citizenship;
    //Поле Национальность
    private String he_nation;
    private String he_nation_dictionary;
    //Поле Способ заполнения типа документа
    private String he_doc_type_gr;
    //Поле Тип документа для заполнения из словаря
    private String he_doc_type;
    //Поле Тип документа для ручного заполнения
    private String he_doc_type_m;
    //Поле Серия
    private String he_doc_ser;
    //Поле Номер
    private String he_doc_number;
    //Поле Дата выдачи
    private Date he_doc_date;
    //Поле Кем выдан
    private String he_doc_place;

    //Поле Она
    //Поле Фамилия
    private String she_last_name;
    //Поле Имя
    private String she_first_name;
    //Поле Отчество
    private String she_middle_name;
    //Поле Дата рождения
    private Date she_birth_date;
    //Поле Гражданство
    private String she_citizenship;
    //Поле Национальность
    private String she_nation;
    private String she_nation_dictionary;
    //Поле Способ заполнения типа документа
    private String she_doc_type_gr;
    //Поле Тип документа для заполнения из словаря
    private String she_doc_type;
    //Поле Тип документа для ручного заполнения
    private String she_doc_type_m;
    //Поле Серия
    private String she_doc_ser;
    //Поле Номер
    private String she_doc_number;
    //Поле Дата выдачи
    private Date she_doc_date;
    //Поле Кем выдан
    private String she_doc_place;


    //Закладка Место рождения усыновителей

    //Поле Он
    //Поле Страна
    private String he_birth_place_country;
    //Поле Область (край, респ.)
    private String he_birth_place_state;
    //Поле Район
    private String he_birth_place_region;
    //Поле Способ заполнения типа населенного пункта
    private String he_birth_place_settlement_type_gr;
    //Поле Тип населенного пункта для заполнения из словаря
    private String he_birth_place_settlement_type;
    //Поле Тип населенного пункта для ручного заполнения
    private String he_birth_place_settlement_type_m;
    //Поле Населенный пункт
    private String he_birth_place_settlement;

    //Поле Она
    //Поле Страна
    private String she_birth_place_country;
    //Поле Область (край, респ.)
    private String she_birth_place_state;
    //Поле Район
    private String she_birth_place_region;
    //Поле Способ заполнения типа населенного пункта
    private String she_birth_place_settlement_type_gr;
    //Поле Тип населенного пункта для заполнения из словаря
    private String she_birth_place_settlement_type;
    //Поле Тип населенного пункта для ручного заполнения
    private String she_birth_place_settlement_type_m;
    //Поле Населенный пункт
    private String she_birth_place_settlement;


    //Закладка Место жительства усыновителей

    //Поле Он
    //Поле Страна
    private String he_living_country;
    //Поле Область (край, респ.)
    private String he_living_state;
    //Поле Район
    private String he_living_region;
    //Поле Тип Способ заполнения типа населенного пункта
    private String he_living_place_gr;
    //Поле Тип населенного пункта для заполнения из словаря
    private String he_living_place;
    //Поле Тип населенного пункта для ручного заполнения
    private String he_living_place_m;
    //Поле Населенный пункт
    private String he_living_settlement;
    //Поле Тип улицы
    private String he_living_street_type;
    //Поле Улица
    private String he_living_street;
    //Поле Дом
    private String he_living_house;
    //Поле Корпус
    private String he_living_building;
    //Поле Квартира
    private String he_living_flat;

    //Поле Она
    //Поле Страна
    private String she_living_country;
    //Поле Область (край, респ.)
    private String she_living_state;
    //Поле Район
    private String she_living_region;
    //Поле Тип Способ заполнения типа населенного пункта
    private String she_living_place_gr;
    //Поле Тип населенного пункта для заполнения из словаря
    private String she_living_place;
    //Поле Тип населенного пункта для ручного заполнения
    private String she_living_place_m;
    //Поле Населенный пункт
    private String she_living_settlement;
    //Поле Тип улицы
    private String she_living_street_type;
    //Поле Улица
    private String she_living_street;
    //Поле Дом
    private String she_living_house;
    //Поле Корпус
    private String she_living_building;
    //Поле Квартира
    private String she_living_flat;


    //Закладка Запись на прием

    //Поле Дата
    private String date;
    //Поле Время
    private String time;


    //getters and setters


    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    

    public String getId_agency_in() {
        return id_agency_in;
    }

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getAgency_in_info() {
        return agency_in_info;
    }

    public void setAgency_in_info(String agency_in_info) {
        this.agency_in_info = agency_in_info;
    }

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
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

    public String getChild_last_name() {
        return child_last_name;
    }

    public void setChild_last_name(String child_last_name) {
        this.child_last_name = child_last_name;
    }

    public String getChild_first_name() {
        return child_first_name;
    }

    public void setChild_first_name(String child_first_name) {
        this.child_first_name = child_first_name;
    }

    public String getChild_middle_name() {
        return child_middle_name;
    }

    public void setChild_middle_name(String child_middle_name) {
        this.child_middle_name = child_middle_name;
    }

    public Date getChild_ident_birth_date() {
        return child_ident_birth_date;
    }

    public void setChild_ident_birth_date(Date child_ident_birth_date) {
        this.child_ident_birth_date = child_ident_birth_date;
    }

    public String getChild_sex() {
        return child_sex;
    }

    public void setChild_sex(String child_sex) {
        this.child_sex = child_sex;
    }

    public String getChild_country() {
        return child_country;
    }

    public void setChild_country(String child_country) {
        this.child_country = child_country;
    }

    public String getChild_state() {
        return child_state;
    }

    public void setChild_state(String child_state) {
        this.child_state = child_state;
    }

    public String getChild_region() {
        return child_region;
    }

    public void setChild_region(String child_region) {
        this.child_region = child_region;
    }

    public String getChild_settlement_type_gr() {
        return child_settlement_type_gr;
    }

    public void setChild_settlement_type_gr(String child_settlement_type_gr) {
        this.child_settlement_type_gr = child_settlement_type_gr;
    }

    public String getChild_settlement_type() {
        return child_settlement_type;
    }

    public void setChild_settlement_type(String child_settlement_type) {
        this.child_settlement_type = child_settlement_type;
    }

    public String getChild_settlement_type_m() {
        return child_settlement_type_m;
    }

    public void setChild_settlement_type_m(String child_settlement_type_m) {
        this.child_settlement_type_m = child_settlement_type_m;
    }

    public String getChild_settlement() {
        return child_settlement;
    }

    public void setChild_settlement(String child_settlement) {
        this.child_settlement = child_settlement;
    }

    public String getDeclarant() {
        return declarant;
    }

    public void setDeclarant(String declarant) {
        this.declarant = declarant;
    }

    public String getDecision_law() {
        return decision_law;
    }

    public void setDecision_law(String decision_law) {
        this.decision_law = decision_law;
    }

    public Date getDecision_date() {

        return decision_date;
    }

    public void setDecision_date(Date decision_date) {
        this.decision_date = decision_date;
    }

    public String getMerried_doc_num() {
        return merried_doc_num;
    }

    public void setMerried_doc_num(String merried_doc_num) {
        this.merried_doc_num = merried_doc_num;
    }

    public Date getMerried_doc_date() {
        return merried_doc_date;
    }

    public void setMerried_doc_date(Date merried_doc_date) {
        this.merried_doc_date = merried_doc_date;
    }

    public String getMerried_doc_source() {
        return merried_doc_source;
    }

    public void setMerried_doc_source(String merried_doc_source) {
        this.merried_doc_source = merried_doc_source;
    }

    public Boolean getHe_args_required() {
        return he_args_required;
    }

    public void setHe_args_required(Boolean he_args_required) {
        this.he_args_required = he_args_required;
    }

    public Boolean getShe_args_required() {
        return she_args_required;
    }

    public void setShe_args_required(Boolean she_args_required) {
        this.she_args_required = she_args_required;
    }

   // public String getGender() {
   //     return gender;
  //  }

    //public void setGender(String gender) {
   //     this.gender = gender;
   // }

    public String getHe_last_name() {
        return he_last_name;
    }

    public void setHe_last_name(String he_last_name) {
        this.he_last_name = he_last_name;
    }

    public String getHe_first_name() {
        return he_first_name;
    }

    public void setHe_first_name(String he_first_name) {
        this.he_first_name = he_first_name;
    }

    public String getHe_middle_name() {
        return he_middle_name;
    }

    public void setHe_middle_name(String he_middle_name) {
        this.he_middle_name = he_middle_name;
    }

    public Date getHe_birth_date() {
        return he_birth_date;
    }

    public void setHe_birth_date(Date he_birth_date) {
        this.he_birth_date = he_birth_date;
    }

    public String getHe_citizenship() {
        return he_citizenship;
    }

    public void setHe_citizenship(String he_citizenship) {

        this.he_citizenship = he_citizenship;
    }

    public String getHe_nation() {
        return he_nation;
    }

    public void setHe_nation(String he_nation) {
        this.he_nation = he_nation;
    }

    public String getHe_doc_type_gr() {
        return he_doc_type_gr;
    }

    public void setHe_doc_type_gr(String he_doc_type_gr) {
        this.he_doc_type_gr = he_doc_type_gr;
    }

    public String getHe_doc_type() {
        return he_doc_type;
    }

    public void setHe_doc_type(String he_doc_type) {

        this.he_doc_type = he_doc_type;
    }

    public String getHe_doc_type_m() {
        return he_doc_type_m;
    }

    public void setHe_doc_type_m(String he_doc_type_m) {
        this.he_doc_type_m = he_doc_type_m;
    }

    public String getHe_doc_ser() {
        return he_doc_ser;
    }

    public void setHe_doc_ser(String he_doc_ser) {
        this.he_doc_ser = he_doc_ser;
    }

    public String getHe_doc_number() {
        return he_doc_number;
    }

    public void setHe_doc_number(String he_doc_number) {
        this.he_doc_number = he_doc_number;
    }

    public Date getHe_doc_date() {
        return he_doc_date;
    }

    public void setHe_doc_date(Date he_doc_date) {
        this.he_doc_date = he_doc_date;
    }

    public String getHe_doc_place() {
        return he_doc_place;
    }

    public void setHe_doc_place(String he_doc_place) {
        this.he_doc_place = he_doc_place;
    }

    public String getShe_last_name() {
        return she_last_name;
    }

    public void setShe_last_name(String she_last_name) {
        this.she_last_name = she_last_name;
    }

    public String getShe_first_name() {
        return she_first_name;
    }

    public void setShe_first_name(String she_first_name) {
        this.she_first_name = she_first_name;
    }

    public String getShe_middle_name() {
        return she_middle_name;
    }

    public void setShe_middle_name(String she_middle_name) {
        this.she_middle_name = she_middle_name;
    }

    public Date getShe_birth_date() {
        return she_birth_date;
    }

    public void setShe_birth_date(Date she_birth_date) {
        this.she_birth_date = she_birth_date;
    }

    public String getShe_citizenship() {
        return she_citizenship;
    }

    public void setShe_citizenship(String she_citizenship) {

        this.she_citizenship = she_citizenship;
    }

    public String getShe_nation() {
        return she_nation;
    }

    public void setShe_nation(String she_nation) {
        this.she_nation = she_nation;
    }

    public String getShe_doc_type_gr() {
        return she_doc_type_gr;
    }

    public void setShe_doc_type_gr(String she_doc_type_gr) {
        this.she_doc_type_gr = she_doc_type_gr;
    }

    public String getShe_doc_type() {
        return she_doc_type;
    }

    public void setShe_doc_type(String she_doc_type) {

        this.she_doc_type = she_doc_type;
    }

    public String getShe_doc_type_m() {
        return she_doc_type_m;
    }

    public void setShe_doc_type_m(String she_doc_type_m) {
        this.she_doc_type_m = she_doc_type_m;
    }

    public String getShe_doc_ser() {
        return she_doc_ser;
    }

    public void setShe_doc_ser(String she_doc_ser) {
        this.she_doc_ser = she_doc_ser;
    }

    public String getShe_doc_number() {
        return she_doc_number;
    }

    public void setShe_doc_number(String she_doc_number) {
        this.she_doc_number = she_doc_number;
    }

    public Date getShe_doc_date() {
        return she_doc_date;
    }

    public void setShe_doc_date(Date she_doc_date) {
        this.she_doc_date = she_doc_date;
    }

    public String getShe_doc_place() {
        return she_doc_place;
    }

    public void setShe_doc_place(String she_doc_place) {
        this.she_doc_place = she_doc_place;
    }

    public String getHe_birth_place_country() {
        return he_birth_place_country;
    }

    public void setHe_birth_place_country(String he_birth_place_country) {
        this.he_birth_place_country = he_birth_place_country;
    }

    public String getHe_birth_place_state() {
        return he_birth_place_state;
    }

    public void setHe_birth_place_state(String he_birth_place_state) {
        this.he_birth_place_state = he_birth_place_state;
    }

    public String getHe_birth_place_region() {
        return he_birth_place_region;
    }

    public void setHe_birth_place_region(String he_birth_place_region) {
        this.he_birth_place_region = he_birth_place_region;
    }

    public String getHe_birth_place_settlement_type_gr() {
        return he_birth_place_settlement_type_gr;
    }

    public void setHe_birth_place_settlement_type_gr(String he_birth_place_settlement_type_gr) {
        this.he_birth_place_settlement_type_gr = he_birth_place_settlement_type_gr;
    }

    public String getHe_birth_place_settlement_type() {
        return he_birth_place_settlement_type;
    }

    public void setHe_birth_place_settlement_type(String he_birth_place_settlement_type) {
        this.he_birth_place_settlement_type = he_birth_place_settlement_type;
    }

    public String getHe_birth_place_settlement_type_m() {
        return he_birth_place_settlement_type_m;
    }

    public void setHe_birth_place_settlement_type_m(String he_birth_place_settlement_type_m) {
        this.he_birth_place_settlement_type_m = he_birth_place_settlement_type_m;
    }

    public String getHe_birth_place_settlement() {
        return he_birth_place_settlement;
    }

    public void setHe_birth_place_settlement(String he_birth_place_settlement) {
        this.he_birth_place_settlement = he_birth_place_settlement;
    }

    public String getShe_birth_place_country() {
        return she_birth_place_country;
    }

    public void setShe_birth_place_country(String she_birth_place_country) {
        this.she_birth_place_country = she_birth_place_country;
    }

    public String getShe_birth_place_state() {
        return she_birth_place_state;
    }

    public void setShe_birth_place_state(String she_birth_place_state) {
        this.she_birth_place_state = she_birth_place_state;
    }

    public String getShe_birth_place_region() {
        return she_birth_place_region;
    }

    public void setShe_birth_place_region(String she_birth_place_region) {
        this.she_birth_place_region = she_birth_place_region;
    }

    public String getShe_birth_place_settlement_type_gr() {
        return she_birth_place_settlement_type_gr;
    }

    public void setShe_birth_place_settlement_type_gr(String she_birth_place_settlement_type_gr) {
        this.she_birth_place_settlement_type_gr = she_birth_place_settlement_type_gr;
    }

    public String getShe_birth_place_settlement_type() {
        return she_birth_place_settlement_type;
    }

    public void setShe_birth_place_settlement_type(String she_birth_place_settlement_type) {
        this.she_birth_place_settlement_type = she_birth_place_settlement_type;
    }

    public String getShe_birth_place_settlement_type_m() {
        return she_birth_place_settlement_type_m;
    }

    public void setShe_birth_place_settlement_type_m(String she_birth_place_settlement_type_m) {
        this.she_birth_place_settlement_type_m = she_birth_place_settlement_type_m;
    }

    public String getShe_birth_place_settlement() {
        return she_birth_place_settlement;
    }

    public void setShe_birth_place_settlement(String she_birth_place_settlement) {
        this.she_birth_place_settlement = she_birth_place_settlement;
    }

    public String getHe_living_country() {
        return he_living_country;
    }

    public void setHe_living_country(String he_living_country) {
        this.he_living_country = he_living_country;
    }

    public String getHe_living_state() {
        return he_living_state;
    }

    public void setHe_living_state(String he_living_state) {
        this.he_living_state = he_living_state;
    }

    public String getHe_living_region() {
        return he_living_region;
    }

    public void setHe_living_region(String he_living_region) {
        this.he_living_region = he_living_region;
    }

    public String getHe_living_place_gr() {
        return he_living_place_gr;
    }

    public void setHe_living_place_gr(String he_living_place_gr) {
        this.he_living_place_gr = he_living_place_gr;
    }

    public String getHe_living_place() {
        return he_living_place;
    }

    public void setHe_living_place(String he_living_place) {
        this.he_living_place = he_living_place;
    }

    public String getHe_living_place_m() {
        return he_living_place_m;
    }

    public void setHe_living_place_m(String he_living_place_m) {
        this.he_living_place_m = he_living_place_m;
    }

    public String getHe_living_settlement() {
        return he_living_settlement;
    }

    public void setHe_living_settlement(String he_living_settlement) {
        this.he_living_settlement = he_living_settlement;
    }

    public String getHe_living_street_type() {
        return he_living_street_type;
    }

    public void setHe_living_street_type(String he_living_street_type) {

        this.he_living_street_type = he_living_street_type;
    }

    public String getHe_living_street() {
        return he_living_street;
    }

    public void setHe_living_street(String he_living_street) {
        this.he_living_street = he_living_street;
    }

    public String getHe_living_house() {
        return he_living_house;
    }

    public void setHe_living_house(String he_living_house) {
        this.he_living_house = he_living_house;
    }

    public String getHe_living_building() {
        return he_living_building;
    }

    public void setHe_living_building(String he_living_building) {
        this.he_living_building = he_living_building;
    }

    public String getHe_living_flat() {
        return he_living_flat;
    }

    public void setHe_living_flat(String he_living_flat) {
        this.he_living_flat = he_living_flat;
    }

    public String getShe_living_country() {
        return she_living_country;
    }

    public void setShe_living_country(String she_living_country) {
        this.she_living_country = she_living_country;
    }

    public String getShe_living_state() {
        return she_living_state;
    }

    public void setShe_living_state(String she_living_state) {
        this.she_living_state = she_living_state;
    }

    public String getShe_living_region() {
        return she_living_region;
    }

    public void setShe_living_region(String she_living_region) {
        this.she_living_region = she_living_region;
    }

    public String getShe_living_place_gr() {
        return she_living_place_gr;
    }

    public void setShe_living_place_gr(String she_living_place_gr) {
        this.she_living_place_gr = she_living_place_gr;
    }

    public String getShe_living_place() {
        return she_living_place;
    }

    public void setShe_living_place(String she_living_place) {
        this.she_living_place = she_living_place;
    }

    public String getShe_living_place_m() {
        return she_living_place_m;
    }

    public void setShe_living_place_m(String she_living_place_m) {
        this.she_living_place_m = she_living_place_m;
    }

    public String getShe_living_settlement() {
        return she_living_settlement;
    }

    public void setShe_living_settlement(String she_living_settlement) {
        this.she_living_settlement = she_living_settlement;
    }

    public String getShe_living_street_type() {
        return she_living_street_type;
    }

    public void setShe_living_street_type(String she_living_street_type) {
        this.she_living_street_type = she_living_street_type;
    }

    public String getShe_living_street() {
        return she_living_street;
    }

    public void setShe_living_street(String she_living_street) {
        this.she_living_street = she_living_street;
    }

    public String getShe_living_house() {
        return she_living_house;
    }

    public void setShe_living_house(String she_living_house) {
        this.she_living_house = she_living_house;
    }

    public String getShe_living_building() {
        return she_living_building;
    }

    public void setShe_living_building(String she_living_building) {
        this.she_living_building = she_living_building;
    }

    public String getShe_living_flat() {
        return she_living_flat;
    }

    public void setShe_living_flat(String she_living_flat) {
        this.she_living_flat = she_living_flat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPerson_state() {
        return person_state;
    }

    public void setPerson_state(String person_state) {
        this.person_state = person_state;
    }

    public String getPerson_region() {
        return person_region;
    }

    public void setPerson_region(String person_region) {
        this.person_region = person_region;
    }

    public String getPerson_settlement() {
        return person_settlement;
    }

    public void setPerson_settlement(String person_settlement) {
        this.person_settlement = person_settlement;
    }

    public String getPerson_street() {
        return person_street;
    }

    public void setPerson_street(String person_street) {
        this.person_street = person_street;
    }

    public String getPerson_house() {
        return person_house;
    }

    public void setPerson_house(String person_house) {
        this.person_house = person_house;
    }

    public String getPerson_building() {
        return person_building;
    }

    public void setPerson_building(String person_building) {
        this.person_building = person_building;
    }

    public String getPerson_flat() {
        return person_flat;
    }

    public void setPerson_flat(String person_flat) {
        this.person_flat = person_flat;
    }

    public String getPerson_ident_doc_type() {
        return person_ident_doc_type;
    }

    public void setPerson_ident_doc_type(String person_ident_doc_type) {
        this.person_ident_doc_type = person_ident_doc_type;
    }

    public String getPerson_doc_ser() {
        return person_doc_ser;
    }

    public void setPerson_doc_ser(String person_doc_ser) {
        this.person_doc_ser = person_doc_ser;
    }

    public String getPerson_doc_num() {
        return person_doc_num;
    }

    public void setPerson_doc_num(String person_doc_num) {
        this.person_doc_num = person_doc_num;
    }

    public Date getPerson_doc_date() {
        return person_doc_date;
    }

    public void setPerson_doc_date(Date person_doc_date) {
        this.person_doc_date = person_doc_date;
    }

    public String getPerson_doc_source() {
        return person_doc_source;
    }

    public void setPerson_doc_source(String person_doc_source) {
        this.person_doc_source = person_doc_source;
    }

    public Date getPerson_birth_date() {
        return person_birth_date;
    }

    public void setPerson_birth_date(Date person_birth_date) {
        this.person_birth_date = person_birth_date;
    }

    public String getDeclarant_info() {
        return declarant_info;
    }

    public void setDeclarant_info(String declarant_info) {
        this.declarant_info = declarant_info;
    }

    public String getHe_nation_dictionary() {
        return he_nation_dictionary;
    }

    public void setHe_nation_dictionary(String he_nation_dictionary) {
        this.he_nation_dictionary = he_nation_dictionary;
    }

    public String getShe_nation_dictionary() {
        return she_nation_dictionary;
    }

    public void setShe_nation_dictionary(String she_nation_dictionary) {
        this.she_nation_dictionary = she_nation_dictionary;
    }

    public String getPerson_sex() {
        return person_sex;
    }

    public void setPerson_sex(String person_sex) {
        this.person_sex = person_sex;
    }

    public String getPerson_last_name() {
        return person_last_name;
    }

    public void setPerson_last_name(String person_last_name) {
        this.person_last_name = person_last_name;
    }

    public String getPerson_first_name() {
        return person_first_name;
    }

    public void setPerson_first_name(String person_first_name) {
        this.person_first_name = person_first_name;
    }

    public String getPerson_middle_name() {
        return person_middle_name;
    }

    public void setPerson_middle_name(String person_middle_name) {
        this.person_middle_name = person_middle_name;
    }

    public String getMerried_doc_source_gr() {
        return merried_doc_source_gr;
    }

    public void setMerried_doc_source_gr(String merried_doc_source_gr) {
        this.merried_doc_source_gr = merried_doc_source_gr;
    }

    public String getMerried_doc_source_list() {
        return merried_doc_source_list;
    }

    public void setMerried_doc_source_list(String merried_doc_source_list) {
        this.merried_doc_source_list = merried_doc_source_list;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public Date getEdge_date() {
        return edge_date;
    }

    public void setEdge_date(Date edge_date) {
        this.edge_date = edge_date;
    }

    public String getAggregate_args_required() {
        return aggregate_args_required;
    }

    public void setAggregate_args_required(String aggregate_args_required) {
        this.aggregate_args_required = aggregate_args_required;
    }
}
