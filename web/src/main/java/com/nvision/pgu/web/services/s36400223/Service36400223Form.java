package com.nvision.pgu.web.services.s36400223;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400223Form extends AbstractNakhodkaForm {

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

    // Закладка Выбор органа ЗАГС обращения

    // Поле ЗАГС обращения
    private String id_agency_in; // lookup Запрос к веб-сервису списка ЗАГСов

    // Дополнительная строка информации снизу
    private String adresZags;
    private String telephMain;
    private String adresHttp;
    private String agency_id;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone;

    // Закладка Сведения о заявителе

    // Поле ЗАЯВИТЕЛЬ

    // Поле Фамилия
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String declarant_last_name; // Заполняется автоматически данными из СИА

    // Поле Имя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String declarant_first_name; // Заполняется автоматически данными из СИА

    // Поле Отчество
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String declarant_middle_name; // Заполняется автоматически данными из СИА

    // Поле Документ, удостоверяющий личность

    // Поле Тип документа
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String declarant_ident_doc_type; //

    // Поле Серия
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String declarant_ident_doc_ser; //

    // Поле Номер
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String declarant_ident_doc_num; //

    // Поле Дата выдачи
    @InitRule(strategy = InitRulePersonalDataStrategy.class,
            field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_ident_doc_date; //

    // Поле Дата рождения заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthdate;

    // Поле Организация
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_ident_doc_source; //

    // Закладка Место жительства заявителя

    // Поле Место жительства заявителя

    // Поле Индекс
    private String declarant_index; //

    // Поле Страна
    private String declarant_country; //

    // Поле Область (край, респ.)
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String declarant_state; //

    // Поле Район
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String declarant_region; //

    // Поле Тип населенного пункта
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_CODE)
    private String declarant_place; //

    // Поле Населенный пункт
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String declarant_settlement; //

    // Поле Тип улицы
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_CODE)
    private String declarant_street_type; //

    // Поле Улица
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String declarant_street; //

    // Поле Дом
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String declarant_house; //

    // Поле Корпус
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
    private String declarant_building; //

    // Поле Квартира
    @InitRule(strategy = InitRulePersonalDataStrategy.class,
            field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
    private String declarant_flat; //

    // Закладка Сведения об умершем

    // Поле Сведения об умершем

    // Поле Фамилия
    private String death_person_last_name; //

    // Поле Имя
    private String death_person_first_name; //

    // Поле Отчество
    private String death_person_middle_name; //

    // Поле Пол
    private String death_person_sex; //

    // Поле Дата рождения
    private String death_person_birthday_day;
    private String death_person_birthday_month;
    private String death_person_birthday_year;

    // Поле Дата смерти
    private String death_date_day;
    private String death_date_month;
    private String death_date_year;

    // Поле Гражданство
    private String death_person_citizenship; //

    // Поле Национальность
    private String death_person_nationality; //

    // Поле Документ, удостоверяющий личность умершего

    // Поле Тип документа
    private String death_person_ident_doc_type; //

    // Поле Серия
    private String death_person_ident_doc_ser; //

    // Поле Номер
    private String death_person_ident_doc_num; //

    // Поле Организация
    private String death_person_ident_doc_source; //

    // Поле Дата выдачи
    private Date death_person_ident_doc_date; //

    // Закладка Место рождения,  жительства, смерти

    // Поле Место рождения умершего

    // Поле Страна
    private String death_person_birth_country; //

    // Поле Область (край, респ.)
    private String death_person_birth_state; //

    // Поле Район
    private String death_person_birth_region; //

    // Поле Тип населенного пункта
    private String death_person_birth_settlement_type; //

    // Поле Населенный пункт
    private String death_person_birth_settlement; //

    // Поле Место жительства умершего

    // Поле Страна
    private String death_person_living_country = "Россия"; //

    // Поле Область (край, респ.)
    private String death_person_living_state; //

    // Поле Район
    private String death_person_living_region; //

    // Поле Тип населенного пункта
    private String death_person_living_settlement_type; //

    // Поле Населенный пункт
    private String death_person_living_settlement; //

    // Поле Тип улицы
    private String death_person_living_street_type; //

    // Поле Улица
    private String death_person_living_street; //

    // Поле Дом
    private String death_person_living_house; //

    // Поле Корпус
    private String death_person_living_building; //

    // Поле Квартира
    private String death_person_living_flat; //

    // Поле Место смерти

    // Поле Страна
    private String death_country; //

    // Поле Область (край, респ.)
    private String death_state; //

    // Поле Район
    private String death_region; //

    // Поле Тип населенного пункта
    private String death_settlement_type; //

    // Поле Населенный пункт
    private String death_settlement; //

    // Закладка Запись на прием

    // Поле `

    // Поле Дата
    private String date; // lookup Обращение к методу GetDayQue

    // Поле Время
    private String time; // lookup Обращение к методу GetTimeQue

    // Поле Контактные данные

    // Поле E-mail заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email; //

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getId_agency_in() {
        return this.id_agency_in;
    }

    public void setDeclarant_last_name(String declarant_last_name) {
        this.declarant_last_name = declarant_last_name;
    }

    public String getDeclarant_last_name() {
        return this.declarant_last_name;
    }

    public void setDeclarant_first_name(String declarant_first_name) {
        this.declarant_first_name = declarant_first_name;
    }

    public String getDeclarant_first_name() {
        return this.declarant_first_name;
    }

    public void setDeclarant_middle_name(String declarant_middle_name) {
        this.declarant_middle_name = declarant_middle_name;
    }

    public String getDeclarant_middle_name() {
        return this.declarant_middle_name;
    }

    public void setDeclarant_ident_doc_type(String declarant_ident_doc_type) {
        this.declarant_ident_doc_type = declarant_ident_doc_type;
    }

    public String getDeclarant_ident_doc_type() {
        return this.declarant_ident_doc_type;
    }

    public void setDeclarant_ident_doc_ser(String declarant_ident_doc_ser) {
        this.declarant_ident_doc_ser = declarant_ident_doc_ser;
    }

    public String getDeclarant_ident_doc_ser() {
        return this.declarant_ident_doc_ser;
    }

    public void setDeclarant_ident_doc_num(String declarant_ident_doc_num) {
        this.declarant_ident_doc_num = declarant_ident_doc_num;
    }

    public String getDeclarant_ident_doc_num() {
        return this.declarant_ident_doc_num;
    }

    public void setDeclarant_ident_doc_date(Date declarant_ident_doc_date) {
        this.declarant_ident_doc_date = declarant_ident_doc_date;
    }

    public Date getDeclarant_ident_doc_date() {
        return this.declarant_ident_doc_date;
    }

    public void setDeclarant_ident_doc_source(String declarant_ident_doc_source) {
        this.declarant_ident_doc_source = declarant_ident_doc_source;
    }

    public String getDeclarant_ident_doc_source() {
        return this.declarant_ident_doc_source;
    }

    public void setDeclarant_index(String declarant_index) {
        this.declarant_index = declarant_index;
    }

    public String getDeclarant_index() {
        return this.declarant_index;
    }

    public void setDeclarant_country(String declarant_country) {
        this.declarant_country = declarant_country;
    }

    public String getDeclarant_country() {
        return this.declarant_country;
    }

    public void setDeclarant_state(String declarant_state) {
        this.declarant_state = declarant_state;
    }

    public String getDeclarant_state() {
        return this.declarant_state;
    }

    public void setDeclarant_region(String declarant_region) {
        this.declarant_region = declarant_region;
    }

    public String getDeclarant_region() {
        return this.declarant_region;
    }

    public void setDeclarant_place(String declarant_place) {
        this.declarant_place = declarant_place;
    }

    public String getDeclarant_place() {
        return this.declarant_place;
    }

    public void setDeclarant_settlement(String declarant_settlement) {
        this.declarant_settlement = declarant_settlement;
    }

    public String getDeclarant_settlement() {
        return this.declarant_settlement;
    }

    public void setDeclarant_street_type(String declarant_street_type) {
        this.declarant_street_type = declarant_street_type;
    }

    public String getDeclarant_street_type() {
        return this.declarant_street_type;
    }

    public void setDeclarant_street(String declarant_street) {
        this.declarant_street = declarant_street;
    }

    public String getDeclarant_street() {
        return this.declarant_street;
    }

    public void setDeclarant_house(String declarant_house) {
        this.declarant_house = declarant_house;
    }

    public String getDeclarant_house() {
        return this.declarant_house;
    }

    public void setDeclarant_building(String declarant_building) {
        this.declarant_building = declarant_building;
    }

    public String getDeclarant_building() {
        return this.declarant_building;
    }

    public void setDeclarant_flat(String declarant_flat) {
        this.declarant_flat = declarant_flat;
    }

    public String getDeclarant_flat() {
        return this.declarant_flat;
    }

    public void setDeath_person_last_name(String death_person_last_name) {
        this.death_person_last_name = death_person_last_name;
    }

    public String getDeath_person_last_name() {
        return this.death_person_last_name;
    }

    public void setDeath_person_first_name(String death_person_first_name) {
        this.death_person_first_name = death_person_first_name;
    }

    public String getDeath_person_first_name() {
        return this.death_person_first_name;
    }

    public void setDeath_person_middle_name(String death_person_middle_name) {
        this.death_person_middle_name = death_person_middle_name;
    }

    public String getDeath_person_middle_name() {
        return this.death_person_middle_name;
    }

    public void setDeath_person_sex(String death_person_sex) {
        this.death_person_sex = death_person_sex;
    }

    public String getDeath_person_sex() {
        return this.death_person_sex;
    }

    public String getDeath_date_day() {
        return death_date_day;
    }

    public void setDeath_date_day(String death_date_day) {
        this.death_date_day = death_date_day;
    }

    public String getDeath_date_month() {
        return death_date_month;
    }

    public void setDeath_date_month(String death_date_month) {
        this.death_date_month = death_date_month;
    }

    public String getDeath_date_year() {
        return death_date_year;
    }

    public void setDeath_date_year(String death_date_year) {
        this.death_date_year = death_date_year;
    }

    public void setDeath_person_citizenship(String death_person_citizenship) {
        this.death_person_citizenship = death_person_citizenship;
    }

    public String getDeath_person_citizenship() {
        return this.death_person_citizenship;
    }

    public void setDeath_person_nationality(String death_person_nationality) {
        this.death_person_nationality = death_person_nationality;
    }

    public String getDeath_person_nationality() {
        return this.death_person_nationality;
    }

    public void setDeath_person_ident_doc_type(String death_person_ident_doc_type) {
        this.death_person_ident_doc_type = death_person_ident_doc_type;
    }

    public String getDeath_person_ident_doc_type() {
        return this.death_person_ident_doc_type;
    }

    public void setDeath_person_ident_doc_ser(String death_person_ident_doc_ser) {
        this.death_person_ident_doc_ser = death_person_ident_doc_ser;
    }

    public String getDeath_person_ident_doc_ser() {
        return this.death_person_ident_doc_ser;
    }

    public void setDeath_person_ident_doc_num(String death_person_ident_doc_num) {
        this.death_person_ident_doc_num = death_person_ident_doc_num;
    }

    public String getDeath_person_ident_doc_num() {
        return this.death_person_ident_doc_num;
    }

    public void setDeath_person_ident_doc_source(String death_person_ident_doc_source) {
        this.death_person_ident_doc_source = death_person_ident_doc_source;
    }

    public String getDeath_person_ident_doc_source() {
        return this.death_person_ident_doc_source;
    }

    public void setDeath_person_ident_doc_date(Date death_person_ident_doc_date) {
        this.death_person_ident_doc_date = death_person_ident_doc_date;
    }

    public Date getDeath_person_ident_doc_date() {
        return this.death_person_ident_doc_date;
    }

    public void setDeath_person_birth_country(String death_person_birth_country) {
        this.death_person_birth_country = death_person_birth_country;
    }

    public String getDeath_person_birth_country() {
        return this.death_person_birth_country;
    }

    public void setDeath_person_birth_state(String death_person_birth_state) {
        this.death_person_birth_state = death_person_birth_state;
    }

    public String getDeath_person_birth_state() {
        return this.death_person_birth_state;
    }

    public void setDeath_person_birth_region(String death_person_birth_region) {
        this.death_person_birth_region = death_person_birth_region;
    }

    public String getDeath_person_birth_region() {
        return this.death_person_birth_region;
    }

    public void setDeath_person_birth_settlement_type(String death_person_birth_settlement_type) {
        this.death_person_birth_settlement_type = death_person_birth_settlement_type;
    }

    public String getDeath_person_birth_settlement_type() {
        return this.death_person_birth_settlement_type;
    }

    public void setDeath_person_birth_settlement(String death_person_birth_settlement) {
        this.death_person_birth_settlement = death_person_birth_settlement;
    }

    public String getDeath_person_birth_settlement() {
        return this.death_person_birth_settlement;
    }

    public void setDeath_person_living_country(String death_person_living_country) {
        this.death_person_living_country = death_person_living_country;
    }

    public String getDeath_person_living_country() {
        return this.death_person_living_country;
    }

    public void setDeath_person_living_state(String death_person_living_state) {
        this.death_person_living_state = death_person_living_state;
    }

    public String getDeath_person_living_state() {
        return this.death_person_living_state;
    }

    public void setDeath_person_living_region(String death_person_living_region) {
        this.death_person_living_region = death_person_living_region;
    }

    public String getDeath_person_living_region() {
        return this.death_person_living_region;
    }

    public void setDeath_person_living_settlement_type(String death_person_living_settlement_type) {
        this.death_person_living_settlement_type = death_person_living_settlement_type;
    }

    public String getDeath_person_living_settlement_type() {
        return this.death_person_living_settlement_type;
    }

    public void setDeath_person_living_settlement(String death_person_living_settlement) {
        this.death_person_living_settlement = death_person_living_settlement;
    }

    public String getDeath_person_living_settlement() {
        return this.death_person_living_settlement;
    }

    public void setDeath_person_living_street_type(String death_person_living_street_type) {
        this.death_person_living_street_type = death_person_living_street_type;
    }

    public String getDeath_person_living_street_type() {
        return this.death_person_living_street_type;
    }

    public void setDeath_person_living_street(String death_person_living_street) {
        this.death_person_living_street = death_person_living_street;
    }

    public String getDeath_person_living_street() {
        return this.death_person_living_street;
    }

    public void setDeath_person_living_house(String death_person_living_house) {
        this.death_person_living_house = death_person_living_house;
    }

    public String getDeath_person_living_house() {
        return this.death_person_living_house;
    }

    public void setDeath_person_living_building(String death_person_living_building) {
        this.death_person_living_building = death_person_living_building;
    }

    public String getDeath_person_living_building() {
        return this.death_person_living_building;
    }

    public void setDeath_person_living_flat(String death_person_living_flat) {
        this.death_person_living_flat = death_person_living_flat;
    }

    public String getDeath_person_living_flat() {
        return this.death_person_living_flat;
    }

    public void setDeath_country(String death_country) {
        this.death_country = death_country;
    }

    public String getDeath_country() {
        return this.death_country;
    }

    public void setDeath_state(String death_state) {
        this.death_state = death_state;
    }

    public String getDeath_state() {
        return this.death_state;
    }

    public void setDeath_region(String death_region) {
        this.death_region = death_region;
    }

    public String getDeath_region() {
        return this.death_region;
    }

    public void setDeath_settlement_type(String death_settlement_type) {
        this.death_settlement_type = death_settlement_type;
    }

    public String getDeath_settlement_type() {
        return this.death_settlement_type;
    }

    public void setDeath_settlement(String death_settlement) {
        this.death_settlement = death_settlement;
    }

    public String getDeath_settlement() {
        return this.death_settlement;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email() {
        return this.contact_email;
    }

    public String getDeath_person_birthday_day() {
        return death_person_birthday_day;
    }

    public void setDeath_person_birthday_day(String death_person_birthday_day) {
        this.death_person_birthday_day = death_person_birthday_day;
    }

    public String getDeath_person_birthday_month() {
        return death_person_birthday_month;
    }

    public void setDeath_person_birthday_month(String death_person_birthday_month) {
        this.death_person_birthday_month = death_person_birthday_month;
    }

    public String getDeath_person_birthday_year() {
        return death_person_birthday_year;
    }

    public void setDeath_person_birthday_year(String death_person_birthday_year) {
        this.death_person_birthday_year = death_person_birthday_year;
    }

    public Date getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(Date declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
    }

    public String getAdresHttp() {
        return adresHttp;
    }

    public void setAdresHttp(String adresHttp) {
        this.adresHttp = adresHttp;
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

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }
}
