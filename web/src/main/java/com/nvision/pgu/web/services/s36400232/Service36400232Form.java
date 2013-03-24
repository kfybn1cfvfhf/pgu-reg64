package com.nvision.pgu.web.services.s36400232;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;
import com.nvision.pgu.web.services.utils.PersonalDataUtils;
import ru.nvg.idecs.identityservice.ws.types.Person;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400232Form extends AbstractNakhodkaForm {

    //Закладка Выбор органа ЗАГС обращения

    //Поле ЗАГС обращения
    private String id_agency_in;    //lookup Запрос к веб-сервису списка ЗАГСов
    private String min_doc_date;
    private String telephMain;
    private String adresHttp;
    private String adresZags;
    private String date;
    private String time;
    private String agency_id;

    private String  declarant_place;
    private String orderExtId;

    //Закладка Сведения о заявителе

    //Поле ЗАЯВИТЕЛЬ

    //Поле Фамилия
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String declarant_last_name;    //Заполняется автоматически данными из СИА

    
    //Поле Имя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String declarant_first_name;    //Заполняется автоматически данными из СИА


    //Поле Отчество
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String declarant_middle_name;    //Заполняется автоматически данными из СИА


    //Поле Документ, удостоверяющий личность

    //Поле Тип документа
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String declarant_ident_doc_type = "1";    //

    private String declarant_ident_doc_type_m;


    //Поле Серия
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String declarant_ident_doc_ser;    //


    //Поле Номер
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String declarant_ident_doc_num;    //


    //Поле Организация
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_ident_doc_source;    //


    //Поле Дата выдачи
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_ident_doc_date;    //

    //Поле Дата рождения
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthdate;

    //Закладка Место жительства заявителя

    //Поле Место жительства заявителя

    //Поле Страна
    private String declarant_country = "1";    //


    //Поле Область (край, респ.)
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String declarant_state;    //


    //Поле Район
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String declarant_region;    //


    //Поле Тип населенного пункта
    private String declarant_settlement_type;    //


    //Поле Населенный пункт
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String declarant_settlement;    //


    //Поле Тип улицы
    private String declarant_street_type;    //


    //Поле Улица
    private String declarant_street;    //


    //Поле Дом
    private String declarant_house;    //


    //Поле Корпус
    private String declarant_building;    //


    //Поле Квартира
    private String declarant_flat;    //


    //Закладка Сведения о ребенке до установления отцовства

    //Поле Сведения о ребенке до установления отцовства

    //Поле Фамилия
    private String child_last_name;    //


    //Поле Имя
    private String child_first_name;    //


    //Поле Отчество
    private String child_middle_name;    //


    //Поле Дата рождения
    private Date child_birthday;    //


    //Поле МЕСТО РОЖДЕНИЯ

    //Поле Страна
    private String child_birth_place_country = "1";    //


    //Поле Область (край, респ.)
    private String child_birth_place_state;    //


    //Поле Район
    private String child_birth_place_region;    //


    //Поле Тип населенного пункта
    private String child_birth_place_settlement_type;    //


    private String child_birth_place_settlement_type_gr = "1";

    private String child_birth_place_settlement_type_m;


    //Поле Населенный пункт
    private String child_birth_place_settlement;    //


    //Закладка Сведения о документе, подтверждающем установление отцовства

    //Поле СВЕДЕНИЯ О РЕБЕНКЕ ПОСЛЕ УСТАНОВЛЕНИЯ ОТЦОВСТВА

    //Поле Фамилия
    private String child_affiliation_last_name;    //


    //Поле Имя
    private String child_affiliation_first_name;    //


    //Поле Отчество
    private String child_affiliation_middle_name;    //


    //Поле ОТЕЦ

    //Поле Фамилия
    private String father_last_name;    //


    //Поле Имя
    private String father_first_name;    //


    //Поле Отчество
    private String father_middle_name;    //


    //Поле ДОКУМЕНТ, ПОДТВЕРЖДАЮЩИЙ УСТАНОВЛЕНИЕ ОТЦОВСТВА

    //Поле № записи акта
    private String affiliation_doc_num;    //


    //Поле Дата выдачи
    private Date affiliation_doc_date;    //


    //Поле Место регистрации
    private String affiliation_doc_source;    //


    //Закладка ЗАГС - получатель свидетельства

    //Поле ЗАГС - получатель
    private String addr_agency;    //


    //Поле Адрес органа ЗАГС

    //Поле Почтовый индекс
    private String addr_agency_index;    //Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".


    //Поле Страна
    private String addr_agency_country = "1";    //


    //Поле Область (край, респ.)
    private String addr_agency_state;    //


    //Поле Район
    private String addr_agency_region;    //


    //Поле Тип населенного пункта
    private String addr_agency_place;    //

    //Поле Населенный пункт
    private String addr_agency_settlement;    //


    //Поле Тип улицы
    private String addr_agency_street_type;    //


    //Поле Улица
    private String addr_agency_street;    //


    //Поле Дом
    private String addr_agency_house;    //


    //Поле Корпус
    private String addr_agency_building;    //


    private String doc_type;    //

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }


    //Закладка Дополнительная информация

    //Поле Email заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;    //валидный адрес email
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone;
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

    public String getDeclarant_country() {
        return declarant_country;
    }

    public void setDeclarant_country(String declarant_country) {
        this.declarant_country = declarant_country;
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

    public Date getChild_birthday() {
        return child_birthday;
    }

    public void setChild_birthday(Date child_birthday) {
        this.child_birthday = child_birthday;
    }

    public String getChild_birth_place_country() {
        return child_birth_place_country;
    }

    public void setChild_birth_place_country(String child_birth_place_country) {
        this.child_birth_place_country = child_birth_place_country;
    }

    public String getChild_birth_place_state() {
        return child_birth_place_state;
    }

    public void setChild_birth_place_state(String child_birth_place_state) {
        this.child_birth_place_state = child_birth_place_state;
    }

    public String getChild_birth_place_region() {
        return child_birth_place_region;
    }

    public void setChild_birth_place_region(String child_birth_place_region) {
        this.child_birth_place_region = child_birth_place_region;
    }

    public String getChild_birth_place_settlement_type() {
        return child_birth_place_settlement_type;
    }

    public void setChild_birth_place_settlement_type(String child_birth_place_settlement_type) {
        this.child_birth_place_settlement_type = child_birth_place_settlement_type;
    }

    public String getChild_birth_place_settlement() {
        return child_birth_place_settlement;
    }

    public void setChild_birth_place_settlement(String child_birth_place_settlement) {
        this.child_birth_place_settlement = child_birth_place_settlement;
    }

    public String getChild_affiliation_last_name() {
        return child_affiliation_last_name;
    }

    public void setChild_affiliation_last_name(String child_affiliation_last_name) {
        this.child_affiliation_last_name = child_affiliation_last_name;
    }

    public String getChild_affiliation_first_name() {
        return child_affiliation_first_name;
    }

    public void setChild_affiliation_first_name(String child_affiliation_first_name) {
        this.child_affiliation_first_name = child_affiliation_first_name;
    }

    public String getChild_affiliation_middle_name() {
        return child_affiliation_middle_name;
    }

    public void setChild_affiliation_middle_name(String child_affiliation_middle_name) {
        this.child_affiliation_middle_name = child_affiliation_middle_name;
    }

    public String getFather_last_name() {
        return father_last_name;
    }

    public void setFather_last_name(String father_last_name) {
        this.father_last_name = father_last_name;
    }

    public String getFather_first_name() {
        return father_first_name;
    }

    public void setFather_first_name(String father_first_name) {
        this.father_first_name = father_first_name;
    }

    public String getFather_middle_name() {
        return father_middle_name;
    }

    public void setFather_middle_name(String father_middle_name) {
        this.father_middle_name = father_middle_name;
    }

    public String getAffiliation_doc_num() {
        return affiliation_doc_num;
    }

    public void setAffiliation_doc_num(String affiliation_doc_num) {
        this.affiliation_doc_num = affiliation_doc_num;
    }

    public Date getAffiliation_doc_date() {
        return affiliation_doc_date;
    }

    public void setAffiliation_doc_date(Date affiliation_doc_date) {
        this.affiliation_doc_date = affiliation_doc_date;
    }

    public String getAffiliation_doc_source() {
        return affiliation_doc_source;
    }

    public void setAffiliation_doc_source(String affiliation_doc_source) {
        this.affiliation_doc_source = affiliation_doc_source;
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

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public Date getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(Date declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
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

    public String getDeclarant_ident_doc_type_m() {
        return declarant_ident_doc_type_m;
    }

    public void setDeclarant_ident_doc_type_m(String declarant_ident_doc_type_m) {
        this.declarant_ident_doc_type_m = declarant_ident_doc_type_m;
    }

    public String getDeclarant_place() {
        return declarant_place;
    }

    public void setDeclarant_place(String declarant_place) {
        this.declarant_place = declarant_place;
    }

    public String getChild_birth_place_settlement_type_gr() {
        return child_birth_place_settlement_type_gr;
    }

    public void setChild_birth_place_settlement_type_gr(String child_birth_place_settlement_type_gr) {
        this.child_birth_place_settlement_type_gr = child_birth_place_settlement_type_gr;
    }

    public String getChild_birth_place_settlement_type_m() {
        return child_birth_place_settlement_type_m;
    }

    public void setChild_birth_place_settlement_type_m(String child_birth_place_settlement_type_m) {
        this.child_birth_place_settlement_type_m = child_birth_place_settlement_type_m;
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

    public String getOrderExtId() {
        return orderExtId;
    }

    public void setOrderExtId(String orderExtId) {
        this.orderExtId = orderExtId;
    }

    public String getMin_doc_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Person person = PersonalDataUtils.getPerson(this);

        if(person != null && person.getBirthDate() != null) {
            Calendar calendar = person.getBirthDate().toGregorianCalendar();
            calendar.add(Calendar.YEAR, 14);
            return sdf.format(calendar.getTime());
        }

        return "";
    }
}
	