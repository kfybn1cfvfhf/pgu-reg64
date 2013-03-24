package com.nvision.pgu.web.services.s36400228;

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
public class Service36400228Form extends AbstractNakhodkaForm {

    //Закладка Выбор органа ЗАГС обращения

    //Поле Выберете ЗАГС обращения
    private String id_agency_in;    //lookup Запрос к веб-сервису списка ЗАГСов

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

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthdate;

    private String declarant_birthdateString;

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

    //Поле Тип населенного пункта
    private String declarant_place;    //

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

    public String getDeclarant_ident_doc_type_m() {
        return declarant_ident_doc_type_m;
    }

    public void setDeclarant_ident_doc_type_m(String declarant_ident_doc_type_m) {
        this.declarant_ident_doc_type_m = declarant_ident_doc_type_m;
    }

    private String declarant_ident_doc_type_m;



    public String getDeclarant_ident_doc_type_gr() {
        return declarant_ident_doc_type_gr;
    }

    public void setDeclarant_ident_doc_type_gr(String declarant_ident_doc_type_gr) {
        this.declarant_ident_doc_type_gr = declarant_ident_doc_type_gr;
    }

    private String declarant_ident_doc_type_gr;
    //Поле Тип документа
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String declarant_ident_doc_type;    //

    //Поле Серия
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String declarant_doc_ser;    //

    //Поле Номер
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String declarant_doc_num;    //

    //Поле Дата выдачи
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_doc_date;    //

    //Поле Организация
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_doc_source;    //

    //Закладка Сведения о браке

    //Поле Муж

    //Поле Фамилия до брака
    private String husband_last_name_before;    //

    //Поле Имя
    private String husband_first_name;    //

    //Поле Отчество
    private String husband_middle_name;    //

    //Поле Жена

    //Поле Фамилия до брака
    private String wife_last_name_before;    //

    //Поле Имя
    private String wife_first_name;    //

    //Поле Отчество
    private String wife_middle_name;    //

    //Поле Документ, удостоверяющий брак

    //Поле № записи акта
    private String merried_doc_num;    //

    //Поле Дата выдачи
    private Date merried_doc_date;    //

    //Поле Место регистрации
    private String merried_doc_source;    //

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

    // Поле записи на прием
    private String free_time_slot;

    public String getAdresZags() {
        return adresZags;
    }

    public void setAdresZags(String adresZags) {
        this.adresZags = adresZags;
    }

    private String adresZags;

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

    private String telephMain;
    private String adresHttp;
    private String agency_id;

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    //Закладка Дополнительная информация

    //Поле Телефон заявителя
     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
     private String contact_phone_temp_home="";

     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
     private String contact_phone_temp_mobile="";


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone;    //телефон


    //Поле Email заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;    //валидный адрес email

    //Поле Дата
    private String date;    //lookup Обращение к методу GetDayQue

    //Поле Время
    private String time;    //lookup Обращение к методу GetTimeQue



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

    public String getDeclarant_place() {
        return declarant_place;
    }

    public void setDeclarant_place(String declarant_place) {
        this.declarant_place = declarant_place;
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

    public String getHusband_last_name_before() {
        return husband_last_name_before;
    }

    public void setHusband_last_name_before(String husband_last_name_before) {
        this.husband_last_name_before = husband_last_name_before;
    }

    public String getHusband_first_name() {
        return husband_first_name;
    }

    public void setHusband_first_name(String husband_first_name) {
        this.husband_first_name = husband_first_name;
    }

    public String getHusband_middle_name() {
        return husband_middle_name;
    }

    public void setHusband_middle_name(String husband_middle_name) {
        this.husband_middle_name = husband_middle_name;
    }

    public String getWife_last_name_before() {
        return wife_last_name_before;
    }

    public void setWife_last_name_before(String wife_last_name_before) {
        this.wife_last_name_before = wife_last_name_before;
    }

    public String getWife_first_name() {
        return wife_first_name;
    }

    public void setWife_first_name(String wife_first_name) {
        this.wife_first_name = wife_first_name;
    }

    public String getWife_middle_name() {
        return wife_middle_name;
    }

    public void setWife_middle_name(String wife_middle_name) {
        this.wife_middle_name = wife_middle_name;
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

    public Date getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(Date declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
    }

    public String getFree_time_slot() {
        return free_time_slot;
    }

    public String getContact_phone_temp_home() {
          return contact_phone_temp_home;
      }

      public void setContact_phone_temp_home(String contact_phone_temp_home) {
          this.contact_phone_temp_home = contact_phone_temp_home;
      }

      public String getContact_phone_temp_mobile() {
          return contact_phone_temp_mobile;
      }

      public void setContact_phone_temp_mobile(String contact_phone_temp_mobile) {
          this.contact_phone_temp_mobile = contact_phone_temp_mobile;
      }

      public String getContact_phone() {
          return this.contact_phone;
      }

      public void setContact_phone(String contact_phone) {
          this.contact_phone = contact_phone;
      }


    public void setFree_time_slot(String free_time_slot) {
        this.free_time_slot = free_time_slot;

    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeclarant_birthdateString() {
        return declarant_birthdate.toString();
    }

    public void setDeclarant_birthdateString(String declarant_birthdateString) {
        this.declarant_birthdateString = declarant_birthdateString;
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


}
	