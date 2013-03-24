package com.nvision.pgu.web.services.s36400222;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400222Form extends AbstractNakhodkaForm {
    // Закладка Выбор органа ЗАГС обращения
    private String hintAgr;


    // Поле ЗАГС обращения
    private String id_agency_in; // lookup Запрос к веб-сервису списка ЗАГСов

    // Поле Информация о ЗАГСе
    private String agency_in_info; //

    private String adresZags;
    private String telephMain;
    private String adresHttp;
    private String agency_id;

    // Поле Заявитель
    private String declarant; //
    private String usluga_form;

    // Закладка Сведения о ребенке

    // Поле Ребенок

    // Поле Фамилия
    private String child_last_name; //

    // Поле Имя
    private String child_first_name; //

    // Поле Отчество
    private String child_middle_name; //

    // Поле Дата рождения
    private Date child_ident_birth_date; //

    // Поле Пол
    private String child_sex; //

    // Поле Место рождения

    // Поле Страна
    private String child_country = "1"; //

    // Поле Область (край, респ.)
    private String child_state; //

    // Поле Район
    private String child_region; //

    // Поле Тип населенного пункта
    private String child_settlement_type; //

    // Поле Населенный пункт
    private String child_settlement; //

    // Закладка Сведения о родителях

    // Поле Отец

    // Поле Фамилия
    private String father_last_name; //

    // Поле Имя
    private String father_first_name; //

    // Поле Отчество
    private String father_middle_name; //

    // Поле Дата рождения
    private Date father_birth_date; //

    // Поле Гражданство
    private String father_citizenship; //

    // Поле Национальность
    private String father_nation; //
    private String he_nation_dictionary;

    // Поле Документ, удостоверяющий личность

    // Поле Тип документа
    private String father_doc_type; //

    // Поле Серия
    private String father_doc_ser; //

    // Поле Номер
    private String father_doc_number; //

    // Поле Дата выдачи
    private Date father_doc_date; //

    // Поле Кем выдан
    private String father_doc_place; //

    // Поле Мать

    // Поле Фамилия
    private String mother_last_name; //

    // Поле Имя
    private String mother_first_name; //

    // Поле Отчество
    private String mother_middle_name; //

    // Поле Дата рождения
    private Date mother_birth_date; //

    // Поле Гражданство
    private String mother_citizenship; //

    // Поле Национальность
    private String mother_nation; //
    private String she_nation_dictionary;

    // Поле Документ, удостоверяющий личность

    // Поле Тип документа
    private String mother_doc_type; //

    // Поле Серия
    private String mother_doc_ser; //

    // Поле Номер
    private String mother_doc_number; //

    // Поле Дата выдачи
    private Date mother_doc_date; //

    // Поле Кем выдан
    private String mother_doc_place; //

    // Закладка Место рождения родителей

    // Поле МЕСТО РОЖДЕНИЯ ОТЦА

    // Поле Страна
    private String father_birth_place_country = "1"; //

    // Поле Область (край, респ.)
    private String father_birth_place_state; //

    // Поле Район
    private String father_birth_place_region; //

    //Способ заполнения (из справочника или вручную

    // Поле Тип населенного пункта
    private String father_birth_place_settlement_type; //


    // Поле Населенный пункт
    private String father_birth_place_settlement; //

    // Поле МЕСТО РОЖДЕНИЯ МАТЕРИ

    // Поле Страна
    private String mother_birth_place_country = "1"; //

    // Поле Область (край, респ.)
    private String mother_birth_place_state; //

    // Поле Район
    private String mother_birth_place_region; //


    // Поле Тип населенного пункта
    private String mother_birth_place_settlement_type; //

    // Поле Населенный пункт
    private String mother_birth_place_settlement; //

    // Закладка Место жительства родителей

    // Поле МЕСТО ЖИТЕЛЬСТВА ОТЦА

    // Поле Страна
    private String father_living_country = "1"; //

    // Поле Область (край, респ.)
    private String father_living_state; //

    // Поле Район
    private String father_living_region; //


    // Поле Тип населенного пункта
    private String father_living_place; //

    // Поле Населенный пункт
    private String father_living_settlement_type; //
    private String father_living_settlement_type_m;
    private String father_living_settlement; //

    // Поле Тип улицы
    private String father_living_street_type; //

    // Поле Улица
    private String father_living_street; //

    // Поле Дом
    private String father_living_house; //

    // Поле Корпус
    private String father_living_building; //

    // Поле Квартира
    private String father_living_flat; //

    // Поле МЕСТО ЖИТЕЛЬСТВА МАТЕРИ

    // Поле Страна
    private String mother_living_country = "1"; //

    // Поле Область (край, респ.)
    private String mother_living_state; //

    // Поле Район
    private String mother_living_region; //


    // Поле Тип населенного пункта
    private String mother_living_place; //

    // Поле Населенный пункт
    private String mother_living_settlement_type; //
    private String mother_living_settlement_type_m; //
    private String mother_living_settlement; //

    // Поле Тип улицы
    private String mother_living_street_type; //

    // Поле Улица
    private String mother_living_street; //

    // Поле Дом
    private String mother_living_house; //

    // Поле Корпус
    private String mother_living_building; //

    // Поле Квартира
    private String mother_living_flat; //

    // Закладка Документ-основание для указания отцовства

    // Поле Документ -основание для указания отцовства

    // Поле Тип документа
    private String father_cause_doc_type; //

    // Поле Запись Акта №
    private String father_cause_doc_num; //

    // Поле Дата
    private Date father_cause_doc_date; //

    // Поле Наименование органа ЗАГС
    private String father_cause_doc_source; //

    // Поле Наименование органа ЗАГС из Справочника
    private String father_cause_doc_source_list; //

    // Способ заполнения наименования органа ЗАГС
    private String father_cause_doc_source_gr; //

    // Закладка Запись на прием

    // Поле Дата и время приема для получения свидетельства

    // Поле Дата
    private String date; // lookup Обращение к методу GetDayQue

    // Поле Время
    private String time; // lookup Обращение к методу GetTimeQue

//  Поле Контактные данные

    // Поле E-mail заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email; //
    private String child_settlement_type_gr;
    private String child_settlement_type_m;
    private String mother_doc_type_gr;
    private String mother_doc_type_m;
    private String father_doc_type_gr;
    private String father_doc_type_m;
    private String father_birth_place_settlement_type_gr;
    private String father_birth_place_settlement_type_m;
    private String mother_birth_place_settlement_type_gr;
    private String mother_birth_place_settlement_type_m;
    private String father_living_place_gr;
    private String father_living_place_m;
    private String mother_living_place_gr;
    private String mother_living_place_m;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
    private String contact_phone_mobile;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone_home;
    private String contact_phone;
    //Поле Дата рождения
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
//    private Date declarant_birthdate;
    private String declarant_birthdate;

    public String getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(String declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
    }

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getId_agency_in() {
        return this.id_agency_in;
    }

    public void setAgency_in_info(String agency_in_info) {
        this.agency_in_info = agency_in_info;
    }

    public String getAgency_in_info() {
        return this.agency_in_info;
    }

    public void setDeclarant(String declarant) {
        this.declarant = declarant;
    }

    public String getDeclarant() {
        return this.declarant;
    }

    public String getUsluga_form() {
        return usluga_form;
    }

    public void setUsluga_form(String usluga_form) {
        this.usluga_form = usluga_form;
    }

    public void setChild_last_name(String child_last_name) {
        this.child_last_name = child_last_name;
    }

    public String getChild_last_name() {
        return this.child_last_name;
    }

    public void setChild_first_name(String child_first_name) {
        this.child_first_name = child_first_name;
    }

    public String getChild_first_name() {
        return this.child_first_name;
    }

    public void setChild_middle_name(String child_middle_name) {
        this.child_middle_name = child_middle_name;
    }

    public String getChild_middle_name() {
        return this.child_middle_name;
    }

    public void setChild_ident_birth_date(Date child_ident_birth_date) {
        this.child_ident_birth_date = child_ident_birth_date;
    }

    public Date getChild_ident_birth_date() {
        return this.child_ident_birth_date;
    }

    public void setChild_sex(String child_sex) {
        this.child_sex = child_sex;
    }

    public String getChild_sex() {
        return this.child_sex;
    }

    public void setChild_country(String child_country) {
        this.child_country = child_country;
    }

    public String getChild_country() {
        return this.child_country;
    }

    public void setChild_state(String child_state) {
        this.child_state = child_state;
    }

    public String getChild_state() {
        return this.child_state;
    }

    public void setChild_region(String child_region) {
        this.child_region = child_region;
    }

    public String getChild_region() {
        return this.child_region;
    }

    public void setChild_settlement_type(String child_settlement_type) {
        this.child_settlement_type = child_settlement_type;
    }

    public String getChild_settlement_type() {
        return this.child_settlement_type;
    }

    public void setChild_settlement(String child_settlement) {
        this.child_settlement = child_settlement;
    }

    public String getChild_settlement() {
        return this.child_settlement;
    }

    public void setFather_last_name(String father_last_name) {
        this.father_last_name = father_last_name;
    }

    public String getFather_last_name() {
        return this.father_last_name;
    }

    public void setFather_first_name(String father_first_name) {
        this.father_first_name = father_first_name;
    }

    public String getFather_first_name() {
        return this.father_first_name;
    }

    public void setFather_middle_name(String father_middle_name) {
        this.father_middle_name = father_middle_name;
    }

    public String getFather_middle_name() {
        return this.father_middle_name;
    }

    public void setFather_birth_date(Date father_birth_date) {
        this.father_birth_date = father_birth_date;
    }

    public Date getFather_birth_date() {
        return this.father_birth_date;
    }

    public void setFather_citizenship(String father_citizenship) {
        this.father_citizenship = father_citizenship;
    }

    public String getFather_citizenship() {
        return this.father_citizenship;
    }

    public void setFather_nation(String father_nation) {
        this.father_nation = father_nation;
    }

    public String getFather_nation() {
        return this.father_nation;
    }

    public void setFather_doc_type(String father_doc_type) {
        this.father_doc_type = father_doc_type;
    }

    public String getFather_doc_type() {
        return this.father_doc_type;
    }

    public void setFather_doc_ser(String father_doc_ser) {
        this.father_doc_ser = father_doc_ser;
    }

    public String getFather_doc_ser() {
        return this.father_doc_ser;
    }

    public void setFather_doc_number(String father_doc_number) {
        this.father_doc_number = father_doc_number;
    }

    public String getFather_doc_number() {
        return this.father_doc_number;
    }

    public void setFather_doc_date(Date father_doc_date) {
        this.father_doc_date = father_doc_date;
    }

    public Date getFather_doc_date() {
        return this.father_doc_date;
    }

    public void setFather_doc_place(String father_doc_place) {
        this.father_doc_place = father_doc_place;
    }

    public String getFather_doc_place() {
        return this.father_doc_place;
    }

    public void setMother_last_name(String mother_last_name) {
        this.mother_last_name = mother_last_name;
    }

    public String getMother_last_name() {
        return this.mother_last_name;
    }

    public void setMother_first_name(String mother_first_name) {
        this.mother_first_name = mother_first_name;
    }

    public String getMother_first_name() {
        return this.mother_first_name;
    }

    public void setMother_middle_name(String mother_middle_name) {
        this.mother_middle_name = mother_middle_name;
    }

    public String getMother_middle_name() {
        return this.mother_middle_name;
    }

    public void setMother_birth_date(Date mother_birth_date) {
        this.mother_birth_date = mother_birth_date;
    }

    public Date getMother_birth_date() {
        return this.mother_birth_date;
    }

    public void setMother_citizenship(String mother_citizenship) {
        this.mother_citizenship = mother_citizenship;
    }

    public String getMother_citizenship() {
        return this.mother_citizenship;
    }

    public void setMother_nation(String mother_nation) {
        this.mother_nation = mother_nation;
    }

    public String getMother_nation() {
        return this.mother_nation;
    }

    public void setMother_doc_type(String mother_doc_type) {
        this.mother_doc_type = mother_doc_type;
    }

    public String getMother_doc_type() {
        return this.mother_doc_type;
    }

    public void setMother_doc_ser(String mother_doc_ser) {
        this.mother_doc_ser = mother_doc_ser;
    }

    public String getMother_doc_ser() {
        return this.mother_doc_ser;
    }

    public void setMother_doc_number(String mother_doc_number) {
        this.mother_doc_number = mother_doc_number;
    }

    public String getMother_doc_number() {
        return this.mother_doc_number;
    }

    public void setMother_doc_date(Date mother_doc_date) {
        this.mother_doc_date = mother_doc_date;
    }

    public Date getMother_doc_date() {
        return this.mother_doc_date;
    }

    public void setMother_doc_place(String mother_doc_place) {
        this.mother_doc_place = mother_doc_place;
    }

    public String getMother_doc_place() {
        return this.mother_doc_place;
    }

    public void setFather_birth_place_country(String father_birth_place_country) {
        this.father_birth_place_country = father_birth_place_country;
    }

    public String getFather_birth_place_country() {
        return this.father_birth_place_country;
    }

    public void setFather_birth_place_state(String father_birth_place_state) {
        this.father_birth_place_state = father_birth_place_state;
    }

    public String getFather_birth_place_state() {
        return this.father_birth_place_state;
    }

    public void setFather_birth_place_region(String father_birth_place_region) {
        this.father_birth_place_region = father_birth_place_region;
    }

    public String getFather_birth_place_region() {
        return this.father_birth_place_region;
    }

    public void setFather_birth_place_settlement_type(String father_birth_place_settlement_type) {
        this.father_birth_place_settlement_type = father_birth_place_settlement_type;
    }

    public String getFather_birth_place_settlement_type() {
        return this.father_birth_place_settlement_type;
    }

    public void setFather_birth_place_settlement(String father_birth_place_settlement) {
        this.father_birth_place_settlement = father_birth_place_settlement;
    }

    public String getFather_birth_place_settlement() {
        return this.father_birth_place_settlement;
    }

    public void setMother_birth_place_country(String mother_birth_place_country) {
        this.mother_birth_place_country = mother_birth_place_country;
    }

    public String getMother_birth_place_country() {
        return this.mother_birth_place_country;
    }

    public void setMother_birth_place_state(String mother_birth_place_state) {
        this.mother_birth_place_state = mother_birth_place_state;
    }

    public String getMother_birth_place_state() {
        return this.mother_birth_place_state;
    }

    public void setMother_birth_place_region(String mother_birth_place_region) {
        this.mother_birth_place_region = mother_birth_place_region;
    }

    public String getMother_birth_place_region() {
        return this.mother_birth_place_region;
    }

    public void setMother_birth_place_settlement_type(String mother_birth_place_settlement_type) {
        this.mother_birth_place_settlement_type = mother_birth_place_settlement_type;
    }

    public String getMother_birth_place_settlement_type() {
        return this.mother_birth_place_settlement_type;
    }

    public void setMother_birth_place_settlement(String mother_birth_place_settlement) {
        this.mother_birth_place_settlement = mother_birth_place_settlement;
    }

    public String getMother_birth_place_settlement() {
        return this.mother_birth_place_settlement;
    }

    public void setFather_living_country(String father_living_country) {
        this.father_living_country = father_living_country;
    }

    public String getFather_living_country() {
        return this.father_living_country;
    }

    public void setFather_living_state(String father_living_state) {
        this.father_living_state = father_living_state;
    }

    public String getFather_living_state() {
        return this.father_living_state;
    }

    public void setFather_living_region(String father_living_region) {
        this.father_living_region = father_living_region;
    }

    public String getFather_living_region() {
        return this.father_living_region;
    }

    public void setFather_living_place(String father_living_place) {
        this.father_living_place = father_living_place;
    }

    public String getFather_living_place() {
        return this.father_living_place;
    }

    public String getFather_living_settlement_type() {
        return father_living_settlement_type;
    }

    public void setFather_living_settlement_type(String father_living_settlement_type) {
        this.father_living_settlement_type = father_living_settlement_type;
    }

    public void setFather_living_settlement(String father_living_settlement) {
        this.father_living_settlement = father_living_settlement;
    }

    public String getFather_living_settlement() {
        return this.father_living_settlement;
    }

    public void setFather_living_street_type(String father_living_street_type) {
        this.father_living_street_type = father_living_street_type;
    }

    public String getFather_living_street_type() {
        return this.father_living_street_type;
    }

    public void setFather_living_street(String father_living_street) {
        this.father_living_street = father_living_street;
    }

    public String getFather_living_street() {
        return this.father_living_street;
    }

    public void setFather_living_house(String father_living_house) {
        this.father_living_house = father_living_house;
    }

    public String getFather_living_house() {
        return this.father_living_house;
    }

    public void setFather_living_building(String father_living_building) {
        this.father_living_building = father_living_building;
    }

    public String getFather_living_building() {
        return this.father_living_building;
    }

    public void setFather_living_flat(String father_living_flat) {
        this.father_living_flat = father_living_flat;
    }

    public String getFather_living_flat() {
        return this.father_living_flat;
    }

    public void setMother_living_country(String mother_living_country) {
        this.mother_living_country = mother_living_country;
    }

    public String getMother_living_country() {
        return this.mother_living_country;
    }

    public void setMother_living_state(String mother_living_state) {
        this.mother_living_state = mother_living_state;
    }

    public String getMother_living_state() {
        return this.mother_living_state;
    }

    public void setMother_living_region(String mother_living_region) {
        this.mother_living_region = mother_living_region;
    }

    public String getMother_living_region() {
        return this.mother_living_region;
    }

    public void setMother_living_place(String mother_living_place) {
        this.mother_living_place = mother_living_place;
    }

    public String getMother_living_place() {
        return this.mother_living_place;
    }

    public String getMother_living_settlement_type() {
        return mother_living_settlement_type;
    }

    public void setMother_living_settlement_type(String mother_living_settlement_type) {
        this.mother_living_settlement_type = mother_living_settlement_type;
    }

    public void setMother_living_settlement(String mother_living_settlement) {
        this.mother_living_settlement = mother_living_settlement;
    }

    public String getMother_living_settlement() {
        return this.mother_living_settlement;
    }

    public void setMother_living_street_type(String mother_living_street_type) {
        this.mother_living_street_type = mother_living_street_type;
    }

    public String getMother_living_street_type() {
        return this.mother_living_street_type;
    }

    public void setMother_living_street(String mother_living_street) {
        this.mother_living_street = mother_living_street;
    }

    public String getMother_living_street() {
        return this.mother_living_street;
    }

    public void setMother_living_house(String mother_living_house) {
        this.mother_living_house = mother_living_house;
    }

    public String getMother_living_house() {
        return this.mother_living_house;
    }

    public void setMother_living_building(String mother_living_building) {
        this.mother_living_building = mother_living_building;
    }

    public String getMother_living_building() {
        return this.mother_living_building;
    }

    public void setMother_living_flat(String mother_living_flat) {
        this.mother_living_flat = mother_living_flat;
    }

    public String getMother_living_flat() {
        return this.mother_living_flat;
    }

    public void setFather_cause_doc_type(String father_cause_doc_type) {
        this.father_cause_doc_type = father_cause_doc_type;
    }

    public String getFather_cause_doc_type() {
        return this.father_cause_doc_type;
    }

    public void setFather_cause_doc_num(String father_cause_doc_num) {
        this.father_cause_doc_num = father_cause_doc_num;
    }

    public String getFather_cause_doc_num() {
        return this.father_cause_doc_num;
    }

    public void setFather_cause_doc_date(Date father_cause_doc_date) {
        this.father_cause_doc_date = father_cause_doc_date;
    }

    public Date getFather_cause_doc_date() {
        return this.father_cause_doc_date;
    }

    public void setFather_cause_doc_source(String father_cause_doc_source) {
        this.father_cause_doc_source = father_cause_doc_source;
    }

    public String getFather_cause_doc_source() {
        return this.father_cause_doc_source;
    }

    public void setFather_cause_doc_source_list(String father_cause_doc_source_list) {
        this.father_cause_doc_source_list = father_cause_doc_source_list;
    }

    public String getFather_cause_doc_source_list() {
        return this.father_cause_doc_source_list;
    }

    public void setFather_cause_doc_source_gr(String father_cause_doc_source_gr) {
        this.father_cause_doc_source_gr = father_cause_doc_source_gr;
    }

    public String getFather_cause_doc_source_gr() {
        return this.father_cause_doc_source_gr;
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

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email() {
        return this.contact_email;
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

    public String getChild_settlement_type_gr() {
        return child_settlement_type_gr;
    }

    public void setChild_settlement_type_gr(String child_settlement_type_gr) {
        this.child_settlement_type_gr = child_settlement_type_gr;
    }

    public String getChild_settlement_type_m() {
        return child_settlement_type_m;
    }

    public void setChild_settlement_type_m(String child_settlement_type_m) {
        this.child_settlement_type_m = child_settlement_type_m;
    }

    public String getMother_doc_type_gr() {
        return mother_doc_type_gr;
    }

    public void setMother_doc_type_gr(String mother_doc_type_gr) {
        this.mother_doc_type_gr = mother_doc_type_gr;
    }

    public String getMother_doc_type_m() {
        return mother_doc_type_m;
    }

    public void setMother_doc_type_m(String mother_doc_type_m) {
        this.mother_doc_type_m = mother_doc_type_m;
    }

    public String getFather_doc_type_gr() {
        return father_doc_type_gr;
    }

    public void setFather_doc_type_gr(String father_doc_type_gr) {
        this.father_doc_type_gr = father_doc_type_gr;
    }

    public String getFather_doc_type_m() {
        return father_doc_type_m;
    }

    public void setFather_doc_type_m(String father_doc_type_m) {
        this.father_doc_type_m = father_doc_type_m;
    }

    public String getFather_birth_place_settlement_type_gr() {
        return father_birth_place_settlement_type_gr;
    }

    public void setFather_birth_place_settlement_type_gr(String father_birth_place_settlement_type_gr) {
        this.father_birth_place_settlement_type_gr = father_birth_place_settlement_type_gr;
    }

    public String getFather_birth_place_settlement_type_m() {
        return father_birth_place_settlement_type_m;
    }

    public void setFather_birth_place_settlement_type_m(String father_birth_place_settlement_type_m) {
        this.father_birth_place_settlement_type_m = father_birth_place_settlement_type_m;
    }

    public String getMother_birth_place_settlement_type_gr() {
        return mother_birth_place_settlement_type_gr;
    }

    public void setMother_birth_place_settlement_type_gr(String mother_birth_place_settlement_type_gr) {
        this.mother_birth_place_settlement_type_gr = mother_birth_place_settlement_type_gr;
    }

    public String getMother_birth_place_settlement_type_m() {
        return mother_birth_place_settlement_type_m;
    }

    public void setMother_birth_place_settlement_type_m(String mother_birth_place_settlement_type_m) {
        this.mother_birth_place_settlement_type_m = mother_birth_place_settlement_type_m;
    }

    public String getFather_living_place_gr() {
        return father_living_place_gr;
    }

    public void setFather_living_place_gr(String father_living_place_gr) {
        this.father_living_place_gr = father_living_place_gr;
    }

    public String getFather_living_place_m() {
        return father_living_place_m;
    }

    public void setFather_living_place_m(String father_living_place_m) {
        this.father_living_place_m = father_living_place_m;
    }

    public String getMother_living_place_gr() {
        return mother_living_place_gr;
    }

    public void setMother_living_place_gr(String mother_living_place_gr) {
        this.mother_living_place_gr = mother_living_place_gr;
    }

    public String getMother_living_place_m() {
        return mother_living_place_m;
    }

    public void setMother_living_place_m(String mother_living_place_m) {
        this.mother_living_place_m = mother_living_place_m;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }


    public String getHintAgr() {
        return hintAgr;
    }

    public void setHintAgr(String hintAgr) {
        this.hintAgr = hintAgr;
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


    public String getFather_living_settlement_type_m() {
        return father_living_settlement_type_m;
    }

    public void setFather_living_settlement_type_m(String father_living_settlement_type_m) {
        this.father_living_settlement_type_m = father_living_settlement_type_m;
    }

    public String getMother_living_settlement_type_m() {
        return mother_living_settlement_type_m;
    }

    public void setMother_living_settlement_type_m(String mother_living_settlement_type_m) {
        this.mother_living_settlement_type_m = mother_living_settlement_type_m;
    }

    public String getContact_phone_mobile() {
        return contact_phone_mobile;
    }

    public void setContact_phone_mobile(String contact_phone_mobile) {
        this.contact_phone_mobile = contact_phone_mobile;
    }

    public String getContact_phone_home() {
        return contact_phone_home;
    }

    public void setContact_phone_home(String contact_phone_home) {
        this.contact_phone_home = contact_phone_home;
    }

    // new address


    private String birth_child_country = "643";
    public String getBirth_child_country() {
    return birth_child_country;
}
public void setBirth_child_country(String birth_child_country) {
    this.birth_child_country = birth_child_country;
}

    private String child_countryCode = "ru";
    public String getChild_countryCode() {
    return child_countryCode;
}
public void setChild_countryCode(String child_countryCode) {
    this.child_countryCode = child_countryCode;
}

    private String birth_child_input = "1";
    public String getBirth_child_input() {
    return birth_child_input;
}
public void setBirth_child_input(String birth_child_input) {
    this.birth_child_input = birth_child_input;
}

    private String birth_child_country_input;
    public String getBirth_child_country_input() {
    return birth_child_country_input;
}
public void setBirth_child_country_input(String birth_child_country_input) {
    this.birth_child_country_input = birth_child_country_input;
}

    private String birth_child_community;
public String getBirth_child_community() {
    return birth_child_community;
}
public void setBirth_child_community(String birth_child_community) {
    this.birth_child_community = birth_child_community;
}

    private String birth_child_area_txt;
    public String getBirth_child_area_txt() {
    return birth_child_area_txt;
}
public void setBirth_child_area_txt(String birth_child_area_txt) {
    this.birth_child_area_txt = birth_child_area_txt;
}

    private String birth_child_region_txt;
    public String getBirth_child_region_txt() {
    return birth_child_region_txt;
}
public void setBirth_child_region_txt(String birth_child_region_txt) {
    this.birth_child_region_txt = birth_child_region_txt;
}

    private String birth_child_settlement_type = "2";
    public String getBirth_child_settlement_type() {
    return birth_child_settlement_type;
}
public void setBirth_child_settlement_type(String birth_child_settlement_type) {
    this.birth_child_settlement_type = StringUtils.isBlank(birth_child_settlement_type) ? "2" : birth_child_settlement_type;
}

    private String child_country_settlement = "2";
    public String getChild_country_settlement() {
    return child_country_settlement;
}
public void setChild_country_settlement(String child_country_settlement) {
    this.child_country_settlement = child_country_settlement;
}

    private String birth_child_community_txt;
    public String getBirth_child_community_txt() {
    return birth_child_community_txt;
}
public void setBirth_child_community_txt(String birth_child_community_txt) {
    this.birth_child_community_txt = birth_child_community_txt;
}

    private String birth_child_city_txt;
    public String getBirth_child_city_txt() {
    return birth_child_city_txt;
}
public void setBirth_child_city_txt(String birth_child_city_txt) {
    this.birth_child_city_txt = birth_child_city_txt;
}


    private String birth_he_country = "643";
		public String getBirth_he_country() {
        return birth_he_country;
    }
    public void setBirth_he_country(String birth_he_country) {
        this.birth_he_country = birth_he_country;
    }

		private String he_countryCode = "ru";
		public String getHe_countryCode() {
        return he_countryCode;
    }
    public void setHe_countryCode(String he_countryCode) {
        this.he_countryCode = he_countryCode;
    }

		private String birth_he_input = "1";
		public String getBirth_he_input() {
        return birth_he_input;
    }
    public void setBirth_he_input(String birth_he_input) {
        this.birth_he_input = birth_he_input;
    }

		private String birth_he_country_input;
		public String getBirth_he_country_input() {
        return birth_he_country_input;
    }
    public void setBirth_he_country_input(String birth_he_country_input) {
        this.birth_he_country_input = birth_he_country_input;
    }

		private String birth_he_community;
    public String getBirth_he_community() {
        return birth_he_community;
    }
    public void setBirth_he_community(String birth_he_community) {
        this.birth_he_community = birth_he_community;
    }

		private String birth_he_area_txt;
		public String getBirth_he_area_txt() {
        return birth_he_area_txt;
    }
    public void setBirth_he_area_txt(String birth_he_area_txt) {
        this.birth_he_area_txt = birth_he_area_txt;
    }

		private String birth_he_region_txt;
		public String getBirth_he_region_txt() {
        return birth_he_region_txt;
    }
    public void setBirth_he_region_txt(String birth_he_region_txt) {
        this.birth_he_region_txt = birth_he_region_txt;
    }

		private String birth_he_settlement_type = "2";
		public String getBirth_he_settlement_type() {
        return birth_he_settlement_type;
    }
    public void setBirth_he_settlement_type(String birth_he_settlement_type) {
        this.birth_he_settlement_type = StringUtils.isBlank(birth_he_settlement_type) ? "2" : birth_he_settlement_type;
    }

		private String he_country_settlement = "2";
		public String getHe_country_settlement() {
        return he_country_settlement;
    }
    public void setHe_country_settlement(String he_country_settlement) {
        this.he_country_settlement = he_country_settlement;
    }

		private String birth_he_community_txt;
		public String getBirth_he_community_txt() {
        return birth_he_community_txt;
    }
    public void setBirth_he_community_txt(String birth_he_community_txt) {
        this.birth_he_community_txt = birth_he_community_txt;
    }

		private String birth_he_city_txt;
		public String getBirth_he_city_txt() {
        return birth_he_city_txt;
    }
    public void setBirth_he_city_txt(String birth_he_city_txt) {
        this.birth_he_city_txt = birth_he_city_txt;
    }


    private String birth_she_country = "643";
		public String getBirth_she_country() {
        return birth_she_country;
    }
    public void setBirth_she_country(String birth_she_country) {
        this.birth_she_country = birth_she_country;
    }

		private String she_countryCode = "ru";
		public String getShe_countryCode() {
        return she_countryCode;
    }
    public void setShe_countryCode(String she_countryCode) {
        this.she_countryCode = she_countryCode;
    }

		private String birth_she_input = "1";
		public String getBirth_she_input() {
        return birth_she_input;
    }
    public void setBirth_she_input(String birth_she_input) {
        this.birth_she_input = birth_she_input;
    }

		private String birth_she_country_input;
		public String getBirth_she_country_input() {
        return birth_she_country_input;
    }
    public void setBirth_she_country_input(String birth_she_country_input) {
        this.birth_she_country_input = birth_she_country_input;
    }

		private String birth_she_community;
    public String getBirth_she_community() {
        return birth_she_community;
    }
    public void setBirth_she_community(String birth_she_community) {
        this.birth_she_community = birth_she_community;
    }

		private String birth_she_area_txt;
		public String getBirth_she_area_txt() {
        return birth_she_area_txt;
    }
    public void setBirth_she_area_txt(String birth_she_area_txt) {
        this.birth_she_area_txt = birth_she_area_txt;
    }


		private String birth_she_region_txt;
		public String getBirth_she_region_txt() {
        return birth_she_region_txt;
    }
    public void setBirth_she_region_txt(String birth_she_region_txt) {
        this.birth_she_region_txt = birth_she_region_txt;
    }

		private String birth_she_settlement_type = "2";
		public String getBirth_she_settlement_type() {
        return birth_she_settlement_type;
    }
    public void setBirth_she_settlement_type(String birth_she_settlement_type) {
        this.birth_she_settlement_type = StringUtils.isBlank(birth_she_settlement_type) ? "2" : birth_she_settlement_type;
    }

		private String she_country_settlement = "2";
		public String getShe_country_settlement() {
        return she_country_settlement;
    }
    public void setShe_country_settlement(String she_country_settlement) {
        this.she_country_settlement = she_country_settlement;
    }

		private String birth_she_community_txt;
		public String getBirth_she_community_txt() {
        return birth_she_community_txt;
    }
    public void setBirth_she_community_txt(String birth_she_community_txt) {
        this.birth_she_community_txt = birth_she_community_txt;
    }

		private String birth_she_city_txt;
		public String getBirth_she_city_txt() {
        return birth_she_city_txt;
    }
    public void setBirth_she_city_txt(String birth_she_city_txt) {
        this.birth_she_city_txt = birth_she_city_txt;
    }



    private String living_he_country = "643";
public String getLiving_he_country() {
    return living_he_country;
}
public void setLiving_he_country(String living_he_country) {
    this.living_he_country = living_he_country;
}

    private String he_live_countryCode = "ru";
    public String getHe_live_countryCode() {
    return he_live_countryCode;
}
public void setHe_live_countryCode(String he_live_countryCode) {
    this.he_live_countryCode = he_live_countryCode;
}

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

    private String living_he_community;
public String getLiving_he_community() {
    return living_he_community;
}
public void setLiving_he_community(String living_he_community) {
    this.living_he_community = living_he_community;
}

    private String living_he_street;
    public String getLiving_he_street() {
    return living_he_street;
}
public void setLiving_he_street(String living_he_street) {
    this.living_he_street = living_he_street;
}

    private String living_he_area_txt;
    public String getLiving_he_area_txt() {
    return living_he_area_txt;
}
public void setLiving_he_area_txt(String living_he_area_txt) {
    this.living_he_area_txt = living_he_area_txt;
}

    private String living_he_region_txt;
    public String getLiving_he_region_txt() {
    return living_he_region_txt;
}
public void setLiving_he_region_txt(String living_he_region_txt) {
    this.living_he_region_txt = living_he_region_txt;
}

    private String living_he_settlement_type;
    public String getLiving_he_settlement_type() {
    return living_he_settlement_type;
}
public void setLiving_he_settlement_type(String living_he_settlement_type) {
    this.living_he_settlement_type = living_he_settlement_type;
}

    private String he_country_settlement_live = "2";
    public String getHe_country_settlement_live() {
    return he_country_settlement_live;
}
public void setHe_country_settlement_live(String he_country_settlement_live) {
    this.he_country_settlement_live = he_country_settlement_live;
}

    private String living_he_community_txt;
    public String getLiving_he_community_txt() {
    return living_he_community_txt;
}
public void setLiving_he_community_txt(String living_he_community_txt) {
    this.living_he_community_txt = living_he_community_txt;
}

    private String living_he_city_txt;
    public String getLiving_he_city_txt() {
    return living_he_city_txt;
}
public void setLiving_he_city_txt(String living_he_city_txt) {
    this.living_he_city_txt = living_he_city_txt;
}

    private String living_he_street_txt;
    public String getLiving_he_street_txt() {
    return living_he_street_txt;
}
public void setLiving_he_street_txt(String living_he_street_txt) {
    this.living_he_street_txt = living_he_street_txt;
}

    private String living_he_house;
    public String getLiving_he_house() {
    return living_he_house;
}
public void setLiving_he_house(String living_he_house) {
    this.living_he_house = living_he_house;
}

    private String living_he_corp;
    public String getLiving_he_corp() {
    return living_he_corp;
}
public void setLiving_he_corp(String living_he_corp) {
    this.living_he_corp = living_he_corp;
}

    private String living_he_flat;
    public String getLiving_he_flat() {
    return living_he_flat;
}
public void setLiving_he_flat(String living_he_flat) {
    this.living_he_flat = living_he_flat;
}




    private String living_she_country = "643";
public String getLiving_she_country() {
    return living_she_country;
}
public void setLiving_she_country(String living_she_country) {
    this.living_she_country = living_she_country;
}

    private String she_live_countryCode = "ru";
    public String getShe_live_countryCode() {
    return she_live_countryCode;
}
public void setShe_live_countryCode(String she_live_countryCode) {
    this.she_live_countryCode = she_live_countryCode;
}

    private String living_she_address_input = "1";
public String getLiving_she_address_input() {
    return living_she_address_input;
}
public void setLiving_she_address_input(String living_she_address_input) {
    this.living_she_address_input = living_she_address_input;
}

    private String living_she_country_input;
    public String getLiving_she_country_input() {
    return living_she_country_input;
}
public void setLiving_she_country_input(String living_she_country_input) {
    this.living_she_country_input = living_she_country_input;
}

    private String living_she_community;
public String getLiving_she_community() {
    return living_she_community;
}
public void setLiving_she_community(String living_she_community) {
    this.living_she_community = living_she_community;
}

    private String living_she_street;
    public String getLiving_she_street() {
    return living_she_street;
}
public void setLiving_she_street(String living_she_street) {
    this.living_she_street = living_she_street;
}

    private String living_she_area_txt;
    public String getLiving_she_area_txt() {
    return living_she_area_txt;
}
public void setLiving_she_area_txt(String living_she_area_txt) {
    this.living_she_area_txt = living_she_area_txt;
}

    private String living_she_region_txt;
    public String getLiving_she_region_txt() {
    return living_she_region_txt;
}
public void setLiving_she_region_txt(String living_she_region_txt) {
    this.living_she_region_txt = living_she_region_txt;
}

    private String living_she_settlement_type;
    public String getLiving_she_settlement_type() {
    return living_she_settlement_type;
}
public void setLiving_she_settlement_type(String living_she_settlement_type) {
    this.living_she_settlement_type = living_she_settlement_type;
}

    private String she_country_settlement_live = "2";
    public String getShe_country_settlement_live() {
    return she_country_settlement_live;
}
public void setShe_country_settlement_live(String she_country_settlement_live) {
    this.she_country_settlement_live = she_country_settlement_live;
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

    private String living_she_house;
    public String getLiving_she_house() {
    return living_she_house;
}
public void setLiving_she_house(String living_she_house) {
    this.living_she_house = living_she_house;
}

    private String living_she_corp;
    public String getLiving_she_corp() {
    return living_she_corp;
}
public void setLiving_she_corp(String living_she_corp) {
    this.living_she_corp = living_she_corp;
}

    private String living_she_flat;
    public String getLiving_she_flat() {
    return living_she_flat;
}
public void setLiving_she_flat(String living_she_flat) {
    this.living_she_flat = living_she_flat;
}




}
