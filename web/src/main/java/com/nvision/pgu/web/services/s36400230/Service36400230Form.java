package com.nvision.pgu.web.services.s36400230;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400230Form extends AbstractNakhodkaForm {


    //Закладка Выбор органа ЗАГС обращения

    //Поле Выберете ЗАГС обращения
    private String id_agency_in;    //lookup Запрос к веб-сервису списка ЗАГСов

    private String agency_id;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone;

    private String date;
    private String time;

    private String orderExtId;

    //Закладка Сведения о заявителе

    //Поле ЗАЯВИТЕЛЬ

    //Поле Фамилия
    private String declarant_place;

    public String getDeclarant_place() {
        return declarant_place;
    }

    public void setDeclarant_place(String declarant_place) {
        this.declarant_place = declarant_place;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String declarant_last_name;    //Заполняется автоматически данными из СИА


    //Поле Имя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String declarant_first_name;    //Заполняется автоматически данными из СИА


    //Поле Отчество
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String declarant_middle_name;    //Заполняется автоматически данными из СИА

    //Закладка Место жительства заявителя

    //Поле Место жительства

    //Поле Страна
    private String declarant_country = "1";    //

    //Поле Область (край, респ.)
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String declarant_state;    //


    //Поле Район
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String declarant_region;    //


    //Поле Населенный пункт
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String declarant_settlement;    //


    //Поле Тип улицы
    private String declarant_street_type;    //


    //Поле Улица
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String declarant_street;    //


    //Поле Дом
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String declarant_house;    //


    //Поле Корпус
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
    private String declarant_building;    //


    //Поле Квартира
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
    private String declarant_flat;    //

    private String doc_type;    //

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }


    //Закладка Документ, удостоверяющий личность заявителя

    //Поле Документ, удостоверяющий личность заявителя

    //Поле Тип документа
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String declarant_ident_doc_type="21";    //


    //Поле Серия
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String declarant_doc_ser;    //


    //Поле Номер
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String declarant_doc_num;    //


    //Поле Дата выдачи
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_doc_date;    //

    //Скрытое поле даты рождения заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthdate;


    //Поле Организация
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_doc_source;    //

    
    public Date getStart_date()
    {
        Calendar now=new GregorianCalendar();
        now.setTime(getDeclarant_birthdate());
        now.add(Calendar.YEAR,14);
        return(now.getTime());
    }
	
	private Date start_date;
	
	public void setStart_date(Date d) {
		this.start_date = d;
	}

    //Закладка Сведения о расторжении брака

    //Поле ОН

    //Поле Фамилия до расторжения брака
    private String he_last_name_husband;    //


    //Поле Имя
    private String he_first_name;    //


    //Поле Отчество
    private String he_middle_name;    //


    //Поле ОНА

    //Поле Фамилия до расторжения брака
    private String she_last_name_wife;    //


    //Поле Имя
    private String she_first_name;    //


    //Поле Отчество
    private String she_middle_name;    //


    //Поле Документ, удостоверяющий расторжение брака

    //Поле № записи акта
    private String divorce_doc_num;    //


    //Поле Дата выдачи
    private Date divorce_doc_date;    //


    //Поле Место регистрации
    private String divorce_doc_source;    //


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
    
    private String adresZags;
    private String telephMain;
    private String adresHttp;

    //Поле Отчество
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birth_date;    //Заполняется автоматически данными из СИА

    private Date declarantBirthDatePlus14Years;

    public Date getDeclarant_birth_date() {
        return declarant_birth_date;
    }

    public void setDeclarant_birth_date(Date declarant_birth_date) {
        this.declarant_birth_date = declarant_birth_date;
    }

    public Date getDeclarantBirthDatePlus14Years() {
        return declarantBirthDatePlus14Years;
    }

    public void setDeclarantBirthDatePlus14Years(Date declarantBirthDatePlus14Years) {
        this.declarantBirthDatePlus14Years = declarantBirthDatePlus14Years;
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

    //Закладка Дополнительная информация

    //Поле Email заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;    //валидный адрес email

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

    public String getDeclarant_ident_doc_type() {
        return declarant_ident_doc_type;
    }

    public void setDeclarant_ident_doc_type(String declarant_ident_doc_type) {
        this.declarant_ident_doc_type = declarant_ident_doc_type;
    }

    public String getDeclarant_doc_ser() {
        return declarant_doc_ser;
    }

    public void setDeclarant_doc_ser(String declarant_doc_ser) {
        this.declarant_doc_ser = declarant_doc_ser;
    }

    public String getDeclarant_doc_num() {
        return declarant_doc_num;
    }

    public void setDeclarant_doc_num(String declarant_doc_num) {
        this.declarant_doc_num = declarant_doc_num;
    }

    public Date getDeclarant_doc_date() {
        return declarant_doc_date;
    }

    public void setDeclarant_doc_date(Date declarant_doc_date) {
        this.declarant_doc_date = declarant_doc_date;
    }

    public String getDeclarant_doc_source() {
        return declarant_doc_source;
    }

    public void setDeclarant_doc_source(String declarant_doc_source) {
        this.declarant_doc_source = declarant_doc_source;
    }

    public String getHe_last_name_husband() {
        return he_last_name_husband;
    }

    public void setHe_last_name_husband(String he_last_name_husband) {
        this.he_last_name_husband = he_last_name_husband;
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

    public String getShe_last_name_wife() {
        return she_last_name_wife;
    }

    public void setShe_last_name_wife(String she_last_name_wife) {
        this.she_last_name_wife = she_last_name_wife;
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

    public String getDivorce_doc_num() {
        return divorce_doc_num;
    }

    public void setDivorce_doc_num(String divorce_doc_num) {
        this.divorce_doc_num = divorce_doc_num;
    }

    public Date getDivorce_doc_date() {
        return divorce_doc_date;
    }

    public void setDivorce_doc_date(Date divorce_doc_date) {
        this.divorce_doc_date = divorce_doc_date;
    }

    public String getDivorce_doc_source() {
        return divorce_doc_source;
    }

    public void setDivorce_doc_source(String divorce_doc_source) {
        this.divorce_doc_source = divorce_doc_source;
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


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String sia_last_name;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String sia_first_name;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String sia_middle_name;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
    private String sia_sex;


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

    public String getSia_sex() {
        return sia_sex;
    }

    public void setSia_sex(String sia_sex) {
        this.sia_sex = sia_sex;
    }

    public Date getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(Date declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
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
}
	