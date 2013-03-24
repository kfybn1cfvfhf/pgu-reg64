package com.nvision.pgu.web.services.s36400231;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;
import com.nvision.pgu.web.services.utils.PersonalDataUtils;

import ru.nvg.idecs.identityservice.ws.types.Person;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400231Form extends AbstractNakhodkaForm {
    private String doc_type; //

    // Закладка Выбор органа ЗАГС обращения

    // Инфо
    private String telephMain;
    private String adresHttp;
    private String adresZags;
    private String agency_id;

    // Поле ЗАГС обращения
    private String id_agency_in; // lookup Запрос к веб-сервису списка ЗАГСов

    private String orderExtId;

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

    // Поле Организация
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_ident_doc_source; //

    private String min_doc_date;

    // Поле Дата выдачи
    @InitRule(strategy = InitRulePersonalDataStrategy.class,field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_ident_doc_date; //

    // Закладка Место жительства заявителя

    // Поле Место жительства заявителя



    // Поле Область (край, респ.)
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String declarant_state; //

    // Поле Район
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String declarant_region; //

    // Поле Тип населенного пункта
    private String declarant_settlement_type; //

    // Поле Населенный пункт
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String declarant_settlement; //

    // Поле Тип улицы
    private String declarant_street_type; //

    // Поле Улица
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String declarant_street; //

    // Поле Дом
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String declarant_house; //

    // Поле Корпус
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_CODE)
    private String declarant_building; //

    // Поле Квартира
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_CODE)
    private String declarant_flat; //

    // Закладка Сведения об умершем

    // Поле Фамилия
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String death_person_last_name; //

    // Поле Имя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String death_person_first_name; //

    // Поле Отчество
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String death_person_middle_name; //

    // Поле Дата смерти
    private Date death_date; //
    private String death_date_day;
    private String death_date_month;
    private String death_date_year;



    // Поле МЕСТО СМЕРТИ

    // Поле Страна
    private String death_place_country = "1"; //

    // Поле Область (край, респ.)
    private String death_place_state; //

    public String getDeclarant_place() {
        return declarant_place;
    }

    public void setDeclarant_place(String declarant_place) {
        this.declarant_place = declarant_place;
    }

    private String declarant_place;
    // Поле Район
    private String death_place_region; //

    // Поле Тип населенного пункта
    private String death_place_settlement_type; //

    // Поле Населенный пункт
    private String death_place_settlement; //

    // Закладка Сведения о документе, подтверждающем смерть

    // Поле ДОКУМЕНТ, ПОДТВЕРЖДАЮЩИЙ СМЕРТЬ

    // Поле № записи акта
    private String death_doc_num; //

    // Поле Дата выдачи
    private Date death_doc_date; //

    // Поле Место регистрации
    private String death_doc_source; //

    // Закладка ЗАГС - получатель свидетельства

    // Поле ЗАГС - получатель
    private String addr_agency; //

    // Поле Адрес органа ЗАГС

    // Поле Почтовый индекс
    private String addr_agency_index; // Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".

    // Поле Страна
    private String addr_agency_country = "1"; //

    // Поле Область (край, респ.)
    private String addr_agency_state; //

    // Поле Район
    private String addr_agency_region; //

    // Поле Тип населенного пункта
    private String addr_agency_place; //

    // Поле Населенный пункт
    private String addr_agency_settlement; //

    // Поле Тип улицы
    private String addr_agency_street_type; //

    // Поле Улица
    private String addr_agency_street; //

    // Поле Дом
    private String addr_agency_house; //

    // Поле Корпус
    private String addr_agency_building; //

    // Закладка Дополнительная информация

    // Поле Email заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email; // валидный адрес email

    public String getDeclarant_country() {
        return declarant_country;
    }

    public void setDeclarant_country(String declarant_country) {
        this.declarant_country = declarant_country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //Поле Дата
    private String date;    //lookup Обращение к методу GetDayQue

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //Поле Время
    private String time;    //lookup Обращение к методу GetTimeQue

    private String  declarant_country;

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_phone_mobile() {
        return contact_phone_mobile;
    }

    public void setContact_phone_mobile(String contact_phone_mobile) {
        this.contact_phone_mobile = contact_phone_mobile;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
    private String contact_phone_mobile;





    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public String getId_agency_in() {
        return id_agency_in;
    }

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getDeclarant_last_name() {
        return declarant_last_name;
    }

    public void setDeclarant_last_name(String declarant_last_name) {
        this.declarant_last_name = declarant_last_name;
    }

    public String getDeclarant_first_name() {
        return declarant_first_name;
    }

    public void setDeclarant_first_name(String declarant_first_name) {
        this.declarant_first_name = declarant_first_name;
    }

    public String getDeclarant_middle_name() {
        return declarant_middle_name;
    }

    public void setDeclarant_middle_name(String declarant_middle_name) {
        this.declarant_middle_name = declarant_middle_name;
    }

    public String getMin_doc_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Person person = PersonalDataUtils.getPerson(this);
        String result = "";
        if(person != null && person.getBirthDate() != null) {
            Calendar calendar = person.getBirthDate().toGregorianCalendar();
            calendar.add(Calendar.YEAR, 14);
            result = sdf.format(calendar.getTime());
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, -106);
            result = sdf.format(calendar.getTime());
        }

        return result;
    }


    public String getDeclarant_ident_doc_type() {
        return declarant_ident_doc_type;
    }

    public void setDeclarant_ident_doc_type(String declarant_ident_doc_type) {
        this.declarant_ident_doc_type = declarant_ident_doc_type;
    }

    public String getDeclarant_ident_doc_ser() {
        return declarant_ident_doc_ser;
    }

    public void setDeclarant_ident_doc_ser(String declarant_ident_doc_ser) {
        this.declarant_ident_doc_ser = declarant_ident_doc_ser;
    }

    public String getDeclarant_ident_doc_num() {
        return declarant_ident_doc_num;
    }

    public void setDeclarant_ident_doc_num(String declarant_ident_doc_num) {
        this.declarant_ident_doc_num = declarant_ident_doc_num;
    }

    public String getDeclarant_ident_doc_source() {
        return declarant_ident_doc_source;
    }

    public void setDeclarant_ident_doc_source(String declarant_ident_doc_source) {
        this.declarant_ident_doc_source = declarant_ident_doc_source;
    }

    public Date getDeclarant_ident_doc_date() {
        return declarant_ident_doc_date;
    }

    public void setDeclarant_ident_doc_date(Date declarant_ident_doc_date) {
        this.declarant_ident_doc_date = declarant_ident_doc_date;
    }

    public String getDeclarant_state() {
        return declarant_state;
    }

    public void setDeclarant_state(String declarant_state) {
        this.declarant_state = declarant_state;
    }

    public String getDeclarant_region() {
        return declarant_region;
    }

    public void setDeclarant_region(String declarant_region) {
        this.declarant_region = declarant_region;
    }

    public String getDeclarant_settlement_type() {
        return declarant_settlement_type;
    }

    public void setDeclarant_settlement_type(String declarant_settlement_type) {
        this.declarant_settlement_type = declarant_settlement_type;
    }

    public String getDeclarant_settlement() {
        return declarant_settlement;
    }

    public void setDeclarant_settlement(String declarant_settlement) {
        this.declarant_settlement = declarant_settlement;
    }

    public String getDeclarant_street_type() {
        return declarant_street_type;
    }

    public void setDeclarant_street_type(String declarant_street_type) {
        this.declarant_street_type = declarant_street_type;
    }

    public String getDeclarant_street() {
        return declarant_street;
    }

    public void setDeclarant_street(String declarant_street) {
        this.declarant_street = declarant_street;
    }

    public String getDeclarant_house() {
        return declarant_house;
    }

    public void setDeclarant_house(String declarant_house) {
        this.declarant_house = declarant_house;
    }

    public String getDeclarant_building() {
        return declarant_building;
    }

    public void setDeclarant_building(String declarant_building) {
        this.declarant_building = declarant_building;
    }

    public String getDeclarant_flat() {
        return declarant_flat;
    }

    public void setDeclarant_flat(String declarant_flat) {
        this.declarant_flat = declarant_flat;
    }

    public String getDeath_person_last_name() {
        return death_person_last_name;
    }

    public void setDeath_person_last_name(String death_person_last_name) {
        this.death_person_last_name = death_person_last_name;
    }

    public String getDeath_person_first_name() {
        return death_person_first_name;
    }

    public void setDeath_person_first_name(String death_person_first_name) {
        this.death_person_first_name = death_person_first_name;
    }

    public String getDeath_person_middle_name() {
        return death_person_middle_name;
    }

    public void setDeath_person_middle_name(String death_person_middle_name) {
        this.death_person_middle_name = death_person_middle_name;
    }

    public String getDeath_place_country() {
        return death_place_country;
    }

    public void setDeath_place_country(String death_place_country) {
        this.death_place_country = death_place_country;
    }

    public String getDeath_place_state() {
        return death_place_state;
    }

    public void setDeath_place_state(String death_place_state) {
        this.death_place_state = death_place_state;
    }

    public String getDeath_place_region() {
        return death_place_region;
    }

    public void setDeath_place_region(String death_place_region) {
        this.death_place_region = death_place_region;
    }

    public String getDeath_place_settlement_type() {
        return death_place_settlement_type;
    }

    public void setDeath_place_settlement_type(String death_place_settlement_type) {
        this.death_place_settlement_type = death_place_settlement_type;
    }

    public String getDeath_place_settlement() {
        return death_place_settlement;
    }

    public void setDeath_place_settlement(String death_place_settlement) {
        this.death_place_settlement = death_place_settlement;
    }

    public String getDeath_doc_num() {
        return death_doc_num;
    }

    public void setDeath_doc_num(String death_doc_num) {
        this.death_doc_num = death_doc_num;
    }

    public Date getDeath_doc_date() {
        return death_doc_date;
    }

    public void setDeath_doc_date(Date death_doc_date) {
        this.death_doc_date = death_doc_date;
    }

    public String getDeath_doc_source() {
        return death_doc_source;
    }

    public void setDeath_doc_source(String death_doc_source) {
        this.death_doc_source = death_doc_source;
    }

    public String getAddr_agency() {
        return addr_agency;
    }

    public void setAddr_agency(String addr_agency) {
        this.addr_agency = addr_agency;
    }

    public String getAddr_agency_index() {
        return addr_agency_index;
    }

    public void setAddr_agency_index(String addr_agency_index) {
        this.addr_agency_index = addr_agency_index;
    }

    public String getAddr_agency_country() {
        return addr_agency_country;
    }

    public void setAddr_agency_country(String addr_agency_country) {
        this.addr_agency_country = addr_agency_country;
    }

    public String getAddr_agency_state() {
        return addr_agency_state;
    }

    public void setAddr_agency_state(String addr_agency_state) {
        this.addr_agency_state = addr_agency_state;
    }

    public String getAddr_agency_region() {
        return addr_agency_region;
    }

    public void setAddr_agency_region(String addr_agency_region) {
        this.addr_agency_region = addr_agency_region;
    }

    public String getAddr_agency_place() {
        return addr_agency_place;
    }

    public void setAddr_agency_place(String addr_agency_place) {
        this.addr_agency_place = addr_agency_place;
    }

    public String getAddr_agency_settlement() {
        return addr_agency_settlement;
    }

    public void setAddr_agency_settlement(String addr_agency_settlement) {
        this.addr_agency_settlement = addr_agency_settlement;
    }

    public String getAddr_agency_street_type() {
        return addr_agency_street_type;
    }

    public void setAddr_agency_street_type(String addr_agency_street_type) {
        this.addr_agency_street_type = addr_agency_street_type;
    }

    public String getAddr_agency_street() {
        return addr_agency_street;
    }

    public void setAddr_agency_street(String addr_agency_street) {
        this.addr_agency_street = addr_agency_street;
    }

    public String getAddr_agency_house() {
        return addr_agency_house;
    }

    public void setAddr_agency_house(String addr_agency_house) {
        this.addr_agency_house = addr_agency_house;
    }

    public String getAddr_agency_building() {
        return addr_agency_building;
    }

    public void setAddr_agency_building(String addr_agency_building) {
        this.addr_agency_building = addr_agency_building;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
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

    public String getAdresZags() {
        return adresZags;
    }

    public void setAdresZags(String adresZags) {
        this.adresZags = adresZags;
    }

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    public String getDeath_date_year() {
        return death_date_year;
    }

    public void setDeath_date_year(String death_date_year) {
        this.death_date_year = death_date_year;
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

    public Date getDeath_date() {
        return death_date;
    }

    public void setDeath_date(Date death_date) {
        this.death_date = death_date;
    }

    public String getOrderExtId() {
        return orderExtId;
    }

    public void setOrderExtId(String orderExtId) {
        this.orderExtId = orderExtId;
    }
}
