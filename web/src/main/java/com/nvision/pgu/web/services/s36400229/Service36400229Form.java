package com.nvision.pgu.web.services.s36400229;

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
public class Service36400229Form extends AbstractNakhodkaForm {

	/*
	 * Для первого шага
	 */
	private String telephMain;
	private String adresHttp;
	private String adresZags;
    
    private String declarant_ident_doc_type_gr;
    private String declarant_ident_doc_type_m;
    private String declarant_place_gr;
    private String  child_birth_place_settlement_type_gr;
    private String  addr_agency_place_gr;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone_home;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
    private String contact_phone_mobile;

    private String contact_phone;

    private String date;
    private String time;

    private String orderExtId;

    public String getAddr_agency_place_gr() {
        return addr_agency_place_gr;
    }

    public void setAddr_agency_place_gr(String addr_agency_place_gr) {
        if(addr_agency_place_gr==null)
        {
            this.addr_agency_place_gr="1";
            return;
        }
        this.addr_agency_place_gr = addr_agency_place_gr;
    }

    public String getAddr_agency_place_m() {
        return addr_agency_place_m;
    }

    public void setAddr_agency_place_m(String addr_agency_place_m) {
        this.addr_agency_place_m = addr_agency_place_m;
    }

    private String  addr_agency_place_m;

    public String getChild_birth_place_settlement_type_gr() {
        return child_birth_place_settlement_type_gr;
    }

    public void setChild_birth_place_settlement_type_gr(String child_birth_place_settlement_type_gr) {
        if(child_birth_place_settlement_type_gr==null)
        {
            this.child_birth_place_settlement_type_gr="1";
            return;
        }
        this.child_birth_place_settlement_type_gr = child_birth_place_settlement_type_gr;
    }

    public String getChild_birth_place_settlement_type_m() {
        return child_birth_place_settlement_type_m;
    }

    public void setChild_birth_place_settlement_type_m(String child_birth_place_settlement_type_m) {
        this.child_birth_place_settlement_type_m = child_birth_place_settlement_type_m;
    }

    private String  child_birth_place_settlement_type_m;

    public String getType_street_no() {
        return type_street_no;
    }

    public void setType_street_no(String type_street_no) {
        this.type_street_no = type_street_no;
    }

    private String type_street_no;

    public String getDeclarant_place_gr() {
        return declarant_place_gr;
    }

    public void setDeclarant_place_gr(String declarant_place_gr) {
        if(declarant_place_gr==null)
        {
            this.declarant_place_gr="1";
            return;
        }
        this.declarant_place_gr = declarant_place_gr;
    }

    public String getDeclarant_place_m() {
        return declarant_place_m;
    }

    public void setDeclarant_place_m(String declarant_place_m) {
        this.declarant_place_m = declarant_place_m;
    }

    private String declarant_place_m;
    public String getDeclarant_ident_doc_type_gr() {
        return declarant_ident_doc_type_gr;
    }

    public void setDeclarant_ident_doc_type_gr(String declarant_ident_doc_type_gr) {
        if(declarant_ident_doc_type_gr==null)
        {
            this.declarant_ident_doc_type_gr="1";
            return;
        }
        this.declarant_ident_doc_type_gr = declarant_ident_doc_type_gr;
    }

    public String getDeclarant_ident_doc_type_m() {
        return declarant_ident_doc_type_m;
    }

    public void setDeclarant_ident_doc_type_m(String declarant_ident_doc_type_m) {
        this.declarant_ident_doc_type_m = declarant_ident_doc_type_m;
    }

    private String agency_id;

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

	private String doc_type;    //

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }


    //Закладка Выбор органа ЗАГС обращения

    //Поле ЗАГС обращения


    private String id_agency_in;    //lookup Запрос к веб-сервису списка ЗАГСов

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getId_agency_in() {
        return this.id_agency_in;
    }


    //Закладка Сведения о заявителе

    //Поле ЗАЯВИТЕЛЬ

    //Поле Фамилия

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String declarant_last_name;    //Заполняется автоматически данными из СИА

    public void setDeclarant_last_name(String declarant_last_name) {
        this.declarant_last_name = declarant_last_name;
    }

    public String getDeclarant_last_name() {
        return this.declarant_last_name;
    }

    //Поле Имя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String declarant_first_name;    //Заполняется автоматически данными из СИА

    public void setDeclarant_first_name(String declarant_first_name) {
        this.declarant_first_name = declarant_first_name;
    }

    public String getDeclarant_first_name() {
        return this.declarant_first_name;
    }

    //Поле Отчество

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String declarant_middle_name;    //Заполняется автоматически данными из СИА

    public void setDeclarant_middle_name(String declarant_middle_name) {
        this.declarant_middle_name = declarant_middle_name;
    }

    public String getDeclarant_middle_name() {
        return this.declarant_middle_name;
    }

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String declarant_ident_doc_type;    //

    public void setDeclarant_ident_doc_type(String declarant_ident_doc_type) {
        this.declarant_ident_doc_type = declarant_ident_doc_type;
    }

    public String getDeclarant_ident_doc_type() {
        return this.declarant_ident_doc_type;
    }

    //Поле Серия

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String declarant_ident_doc_ser;    //

    public void setDeclarant_ident_doc_ser(String declarant_ident_doc_ser) {
        this.declarant_ident_doc_ser = declarant_ident_doc_ser;
    }

    public String getDeclarant_ident_doc_ser() {
        return this.declarant_ident_doc_ser;
    }

    //Поле Номер

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String declarant_ident_doc_num;    //

    public void setDeclarant_ident_doc_num(String declarant_ident_doc_num) {
        this.declarant_ident_doc_num = declarant_ident_doc_num;
    }

    public String getDeclarant_ident_doc_num() {
        return this.declarant_ident_doc_num;
    }

    //Поле Организация

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_ident_doc_source;    //

    public void setDeclarant_ident_doc_source(String declarant_ident_doc_source) {
        this.declarant_ident_doc_source = declarant_ident_doc_source;
    }

    public String getDeclarant_ident_doc_source() {
        return this.declarant_ident_doc_source;
    }

    //Поле Дата выдачи

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_ident_doc_date;    //

    public void setDeclarant_ident_doc_date(Date declarant_ident_doc_date) {
        this.declarant_ident_doc_date = declarant_ident_doc_date;
    }

    public Date getDeclarant_ident_doc_date() {
        return this.declarant_ident_doc_date;
    }

    //Поле Дата рождения заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthdate;

    public Date getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(Date declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
    }

    //Закладка Место жительства заявителя

    //Поле Место жительства заявителя

    //Поле Страна


    private String declarant_country = "Россия";    //

    public void setDeclarant_country(String declarant_country) {
        this.declarant_country = declarant_country;
    }

    public String getDeclarant_country() {
        return this.declarant_country;
    }

    //Поле Область (край, респ.)
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String declarant_state;    //Заполняется автоматически данными из СИА

    public void setDeclarant_state(String declarant_state) {
        this.declarant_state = declarant_state;
    }

    public String getDeclarant_state() {
        return this.declarant_state;
    }

    //Поле Район
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String declarant_region;    //Заполняется автоматически данными из СИА

    public void setDeclarant_region(String declarant_region) {
        this.declarant_region = declarant_region;
    }

    public String getDeclarant_region() {
        return this.declarant_region;
    }

    //Поле Тип населенного пункта      SETTELEMENT_TYPE

    private String declarant_place;    //

    public void setDeclarant_place(String declarant_place) {
        this.declarant_place = declarant_place;
    }

    public String getDeclarant_place() {
        return this.declarant_place;
    }

    //Поле Населенный пункт

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String declarant_settlement;    //

    public void setDeclarant_settlement(String declarant_settlement) {
        this.declarant_settlement = declarant_settlement;
    }

    public String getDeclarant_settlement() {
        return this.declarant_settlement;
    }

    //Поле Тип улицы
    private String declarant_street_type;    //

    public void setDeclarant_street_type(String declarant_street_type) {
        this.declarant_street_type = declarant_street_type;
    }

    public String getDeclarant_street_type() {
        return this.declarant_street_type;
    }

    //Поле Улица

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String declarant_street;    //

    public void setDeclarant_street(String declarant_street) {
        this.declarant_street = declarant_street;
    }

    public String getDeclarant_street() {
        return this.declarant_street;
    }

    //Поле Дом

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String declarant_house;    //

    public void setDeclarant_house(String declarant_house) {
        this.declarant_house = declarant_house;
    }

    public String getDeclarant_house() {
        return this.declarant_house;
    }

    //Поле Корпус

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_CODE)
    private String declarant_building;    //

    public void setDeclarant_building(String declarant_building) {
        this.declarant_building = declarant_building;
    }

    public String getDeclarant_building() {
        return this.declarant_building;
    }

    //Поле Квартира

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_CODE)
    private String declarant_flat;    //

    public void setDeclarant_flat(String declarant_flat) {
        this.declarant_flat = declarant_flat;
    }

    public String getDeclarant_flat() {
        return this.declarant_flat;
    }


    //Закладка Сведения о ребенке

    //Поле Сведения о ребенке

    //Поле Фамилия


    private String child_last_name;    //

    public void setChild_last_name(String child_last_name) {
        this.child_last_name = child_last_name;
    }

    public String getChild_last_name() {
        return this.child_last_name;
    }

    //Поле Имя


    private String child_first_name;    //

    public void setChild_first_name(String child_first_name) {
        this.child_first_name = child_first_name;
    }

    public String getChild_first_name() {
        return this.child_first_name;
    }

    //Поле Отчество


    private String child_middle_name;    //

    public void setChild_middle_name(String child_middle_name) {
        this.child_middle_name = child_middle_name;
    }

    public String getChild_middle_name() {
        return this.child_middle_name;
    }

    //Поле Дата рождения


    private Date child_birthday;    //

    public void setChild_birthday(Date child_birthday) {
        this.child_birthday = child_birthday;
    }

    public Date getChild_birthday() {
        return this.child_birthday;
    }

    //Поле МЕСТО РОЖДЕНИЯ

    //Поле Страна


    private String child_birth_place_country = "Россия";    //

    public void setChild_birth_place_country(String child_birth_place_country) {
        this.child_birth_place_country = child_birth_place_country;
    }

    public String getChild_birth_place_country() {
        return this.child_birth_place_country;
    }

    //Поле Область (край, респ.)


    private String child_birth_place_state;    //

    public void setChild_birth_place_state(String child_birth_place_state) {
        this.child_birth_place_state = child_birth_place_state;
    }

    public String getChild_birth_place_state() {
        return this.child_birth_place_state;
    }

    //Поле Район


    private String child_birth_place_region;    //

    public void setChild_birth_place_region(String child_birth_place_region) {
        this.child_birth_place_region = child_birth_place_region;
    }

    public String getChild_birth_place_region() {
        return this.child_birth_place_region;
    }

    //Поле Тип населенного пункта


    private String child_birth_place_settlement_type;    //

    public void setChild_birth_place_settlement_type(String child_birth_place_settlement_type) {
        this.child_birth_place_settlement_type = child_birth_place_settlement_type;
    }

    public String getChild_birth_place_settlement_type() {
        return this.child_birth_place_settlement_type;
    }

    //Поле Населенный пункт


    private String child_birth_place_settlement;    //

    public void setChild_birth_place_settlement(String child_birth_place_settlement) {
        this.child_birth_place_settlement = child_birth_place_settlement;
    }

    public String getChild_birth_place_settlement() {
        return this.child_birth_place_settlement;
    }


    //Закладка Сведения о документе, подтверждающем рождение ребенка

    //Поле СВЕДЕНИЯ О МАТЕРИ

    //Поле Фамилия


    private String mother_last_name;    //

    public void setMother_last_name(String mother_last_name) {
        this.mother_last_name = mother_last_name;
    }

    public String getMother_last_name() {
        return this.mother_last_name;
    }

    //Поле Имя


    private String mother_first_name;    //

    public void setMother_first_name(String mother_first_name) {
        this.mother_first_name = mother_first_name;
    }

    public String getMother_first_name() {
        return this.mother_first_name;
    }

    //Поле Отчество


    private String mother_middle_name;    //

    public void setMother_middle_name(String mother_middle_name) {
        this.mother_middle_name = mother_middle_name;
    }

    public String getMother_middle_name() {
        return this.mother_middle_name;
    }

    //Поле СВЕДЕНИЯ ОБ ОТЦЕ

    //Поле Фамилия


    private String father_last_name;    //

    public void setFather_last_name(String father_last_name) {
        this.father_last_name = father_last_name;
    }

    public String getFather_last_name() {
        return this.father_last_name;
    }

    //Поле Имя


    private String father_first_name;    //

    public void setFather_first_name(String father_first_name) {
        this.father_first_name = father_first_name;
    }

    public String getFather_first_name() {
        return this.father_first_name;
    }

    //Поле Отчество


    private String father_middle_name;    //

    public void setFather_middle_name(String father_middle_name) {
        this.father_middle_name = father_middle_name;
    }

    public String getFather_middle_name() {
        return this.father_middle_name;
    }

    //Поле ДОКУМЕНТ, ПОДТВЕРЖДАЮЩИЙ РОЖДЕНИЕ РЕБЕНКА

    //Поле № записи акта


    private String birth_doc_num;    //

    public void setBirth_doc_num(String birth_doc_num) {
        this.birth_doc_num = birth_doc_num;
    }

    public String getBirth_doc_num() {
        return this.birth_doc_num;
    }

    //Поле Дата выдачи


    private Date birth_doc_date;    //

    public void setBirth_doc_date(Date birth_doc_date) {
        this.birth_doc_date = birth_doc_date;
    }

    public Date getBirth_doc_date() {
        return this.birth_doc_date;
    }

    //Поле Место регистрации


    private String birth_doc_source;    //

    public void setBirth_doc_source(String birth_doc_source) {
        this.birth_doc_source = birth_doc_source;
    }

    public String getBirth_doc_source() {
        return this.birth_doc_source;
    }


    //Закладка ЗАГС - получатель свидетельства

    //Поле ЗАГС - получатель


    private String addr_agency;    //

    public void setAddr_agency(String addr_agency) {
        this.addr_agency = addr_agency;
    }

    public String getAddr_agency() {
        return this.addr_agency;
    }

    //Поле Адрес органа ЗАГС

    //Поле Почтовый индекс


    private String addr_agency_index;    //Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".

    public void setAddr_agency_index(String addr_agency_index) {
        this.addr_agency_index = addr_agency_index;
    }

    public String getAddr_agency_index() {
        return this.addr_agency_index;
    }

    //Поле Страна


    private String addr_agency_country;    //

    public void setAddr_agency_country(String addr_agency_country) {
        this.addr_agency_country = addr_agency_country;
    }

    public String getAddr_agency_country() {
        return this.addr_agency_country;
    }

    //Поле Область (край, респ.)


    private String addr_agency_state;    //

    public void setAddr_agency_state(String addr_agency_state) {
        this.addr_agency_state = addr_agency_state;
    }

    public String getAddr_agency_state() {
        return this.addr_agency_state;
    }

    //Поле Район


    private String addr_agency_region;    //

    public void setAddr_agency_region(String addr_agency_region) {
        this.addr_agency_region = addr_agency_region;
    }

    public String getAddr_agency_region() {
        return this.addr_agency_region;
    }

    //Поле Тип населенного пункта


    private String addr_agency_place;    //

    public void setAddr_agency_place(String addr_agency_place) {
        this.addr_agency_place = addr_agency_place;
    }

    public String getAddr_agency_place() {
        return this.addr_agency_place;
    }

    //Поле Населенный пункт


    private String addr_agency_settlement;    //

    public void setAddr_agency_settlement(String addr_agency_settlement) {
        this.addr_agency_settlement = addr_agency_settlement;
    }

    public String getAddr_agency_settlement() {
        return this.addr_agency_settlement;
    }

    //Поле Тип улицы


    private String addr_agency_street_type;    //

    public void setAddr_agency_street_type(String addr_agency_street_type) {
        this.addr_agency_street_type = addr_agency_street_type;
    }

    public String getAddr_agency_street_type() {
        return this.addr_agency_street_type;
    }

    //Поле Улица


    private String addr_agency_street;    //

    public void setAddr_agency_street(String addr_agency_street) {
        this.addr_agency_street = addr_agency_street;
    }

    public String getAddr_agency_street() {
        return this.addr_agency_street;
    }

    //Поле Дом


    private String addr_agency_house;    //

    public void setAddr_agency_house(String addr_agency_house) {
        this.addr_agency_house = addr_agency_house;
    }

    public String getAddr_agency_house() {
        return this.addr_agency_house;
    }

    //Поле Корпус


    private String addr_agency_building;    //

    public void setAddr_agency_building(String addr_agency_building) {
        this.addr_agency_building = addr_agency_building;
    }

    public String getAddr_agency_building() {
        return this.addr_agency_building;
    }


    //Закладка Дополнительная информация

    //Поле Email заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;    //валидный адрес email

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email() {
        return this.contact_email;
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

    public String getContact_phone_home() {
        return contact_phone_home;
    }

    public void setContact_phone_home(String contact_phone_home) {
        this.contact_phone_home = contact_phone_home;
    }

    public String getContact_phone_mobile() {
        return contact_phone_mobile;
    }

    public void setContact_phone_mobile(String contact_phone_mobile) {
        this.contact_phone_mobile = contact_phone_mobile;
    }

    // new

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

    // child

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

}
	