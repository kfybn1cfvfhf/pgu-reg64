package com.nvision.pgu.web.services.s36400227;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;

import java.util.Date;

/**
 * @author orolik
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400227Form extends AbstractNakhodkaForm {

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

    private String agency_id;

    private String merried_akt_num;

    private String merried_akt_prefix;

    private String merried_akt_restored = "off";
    
    private Date merried_akt_date;

    public String getMerried_akt_num() {
        return merried_akt_num;
    }

    public void setMerried_akt_num(String merried_akt_num) {
        this.merried_akt_num = merried_akt_num;
    }

    public String getMerried_akt_prefix() {
        return merried_akt_prefix;
    }

    public void setMerried_akt_prefix(String merried_akt_prefix) {
        this.merried_akt_prefix = merried_akt_prefix;
    }

    public String getMerried_akt_restored() {
        return merried_akt_restored;
    }

    public void setMerried_akt_restored(String merried_akt_restored) {
        this.merried_akt_restored = merried_akt_restored;
    }

    public Date getMerried_akt_date() {
        return merried_akt_date;
    }

    public void setMerried_akt_date(Date merried_akt_date) {
        this.merried_akt_date = merried_akt_date;
    }

    public String getMerried_akt_zags() {
        return merried_akt_zags;
    }

    public void setMerried_akt_zags(String merried_akt_zags) {
        this.merried_akt_zags = merried_akt_zags;
    }

    private String merried_akt_zags;

    // Поле Информация о ЗАГСе

    private String agency_in_info; //

    private String adresZags;
    private String telephMain;
    private String adresHttp;
    // Закладка Сведения о заявителе

    // Поле Заявитель

    // Поле Фамилия


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String declarant_last_name; // Заполняется автоматически данными из СИА

    // Поле Имя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String declarant_first_name; // Заполняется автоматически данными из СИА

    // Поле Отчество


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String declarant_middle_name; // Заполняется автоматически данными из СИА

    // Поле Дата рождения

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birth_date; //

    // Поле Гражданство


    private String declarant_citizenship = "3"; //

    // Поле Национальность


    private String declarant_nation; //

    // Поле Документ, удостоверяющий личность
    
    // Поле Способ заполнения типа документа
    
    private String declarant_ident_doc_type_gr = "1";

    // Поле Тип документа (заполняется из Справочника)


    private String declarant_ident_doc_type = "1"; //

    // Поле Тип документа (заполняется Вручную)

    private String declarant_ident_doc_type_m;

    // Поле Серия

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String declarant_ident_doc_ser; //

    // Поле Номер

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String declarant_ident_doc_num; //

    // Поле Дата выдачи

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date declarant_ident_doc_date; //

    // Поле Организация

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String declarant_ident_doc_source; //

    // Поле Семейное положение


    private String declarant_family_status; // FAMILY_STATUS

    // Закладка Сведения о факте рождения заявителя

    // Поле Документ, подтверждающий рождение заявителя

    // Поле Номер


    private String birth_doc_num; //

    // Поле Дата выдачи


    private Date birth_doc_date; //

    // Поле Организация


    private String birth_doc_org; //

    // Поле Место рождения

    // Поле Страна


    private String declarant_birth_place_country = "1"; //  = "Россия"

    // Поле Область (край, респ.)


    private String declarant_birth_place_state; //

    // Поле Район


    private String declarant_birth_place_region; //

    // Поле Способ заполнения типа населенного пункта


    private String declarant_birth_place_settlement_type_gr = "1"; //

    // Поле Тип населенного пункта (заполняется Вручную)


    private String declarant_birth_place_settlement_type_m; //

    // Поле Тип населенного пункта (заполняется Из Справочника)


    private String declarant_birth_place_settlement_type; //

    // Поле Населенный пункт


    private String declarant_birth_place_settlement; //

    // Закладка Место жительства заявителя

    // Поле Место жительства заявителя

    // Поле Страна


    private String declarant_country = "1"; //

    // Поле Область (край, респ.)


    private String declarant_state; //

    // Поле Район


    private String declarant_region; //

    // Поле Способ заполнения типа населенного пункта


    private String declarant_settlement_type_gr = "1"; //

    // Поле Тип населенного пункта (заполняется Вручную)


    private String declarant_settlement_type_m; //

    // Поле Тип населенного пункта (заполняется Из Справочника)


    private String declarant_settlement_type; //

    // Поле Населенный пункт


    private String declarant_settlement; //

    // Поле Тип улицы


    private String declarant_street_type; //

    // Поле Улица


    private String declarant_street; //

    // Поле Дом


    private String declarant_house; //

    // Поле Корпус


    private String declarant_building; //

    // Поле Квартира


    private String declarant_flat; //

    // Закладка ФИО после перемены имени

    // Поле ФИО после перемены имени

    // Поле Фамилия


    private String person_new_last_name; //

    // Поле Имя


    private String person_new_first_name; //

    // Поле Отчество


    private String person_new_middle_name; //

    // Поле Причина перемены имени


    private String change_name_reason; //

    // Закладка Запись на прием

    // Поле Дата и время приема для получения свидетельства

    // Поле Дата


    private String date; // Обращение к методу GetDayQue

    // Поле Время


    private String time; // Обращение к методу GetTimeQue

    // Поле Контактные данные

    // Поле Телефон


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone; // Автоматически подставляется из СИА

    // Поле E-mail заявителя


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email; //

    // Закладка Выбор органа ЗАГС обращения

    // Поле ЗАГС обращения

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getId_agency_in() {
        return this.id_agency_in;
    }

    // Поле Информация о ЗАГСе

    public void setAgency_in_info(String agency_in_info) {
        this.agency_in_info = agency_in_info;
    }

    public String getAgency_in_info() {
        return this.agency_in_info;
    }

    // Закладка Сведения о заявителе

    // Поле Заявитель

    // Поле Фамилия

    public void setDeclarant_last_name(String declarant_last_name) {
        this.declarant_last_name = declarant_last_name;
    }

    public String getDeclarant_last_name() {
        return this.declarant_last_name;
    }

    // Поле Имя

    public void setDeclarant_first_name(String declarant_first_name) {
        this.declarant_first_name = declarant_first_name;
    }

    public String getDeclarant_first_name() {
        return this.declarant_first_name;
    }

    // Поле Отчество

    public void setDeclarant_middle_name(String declarant_middle_name) {
        this.declarant_middle_name = declarant_middle_name;
    }

    public String getDeclarant_middle_name() {
        return this.declarant_middle_name;
    }

    // Поле Дата рождения

    public void setDeclarant_birth_date(Date declarant_birth_date) {
        this.declarant_birth_date = declarant_birth_date;
    }

    public Date getDeclarant_birth_date() {
        return this.declarant_birth_date;
    }

    // Поле Гражданство

    public void setDeclarant_citizenship(String declarant_citizenship) {
        this.declarant_citizenship = declarant_citizenship;
    }

    public String getDeclarant_citizenship() {
        return this.declarant_citizenship;
    }

    // Поле Национальность

    public void setDeclarant_nation(String declarant_nation) {
        this.declarant_nation = declarant_nation;
    }

    public String getDeclarant_nation() {
        return this.declarant_nation;
    }

    // Поле Документ, удостоверяющий личность

    // Поле Способ заполнения типа документа

    public void setDeclarant_ident_doc_type_gr(String declarant_ident_doc_type_gr) {
        this.declarant_ident_doc_type_gr = declarant_ident_doc_type_gr;
    }

    public String getDeclarant_ident_doc_type_gr() {
        return this.declarant_ident_doc_type_gr;
    }

    // Поле Тип документа (заполняется из Справочника)

    public void setDeclarant_ident_doc_type(String declarant_ident_doc_type) {
        this.declarant_ident_doc_type = declarant_ident_doc_type;
    }

    public String getDeclarant_ident_doc_type() {
        return this.declarant_ident_doc_type;
    }

    // Поле Тип документа (заполняется Вручную)

    public void setDeclarant_ident_doc_type_m(String declarant_ident_doc_type_m) {
        this.declarant_ident_doc_type_m = declarant_ident_doc_type_m;
    }

    public String getDeclarant_ident_doc_type_m() {
        return this.declarant_ident_doc_type_m;
    }

    // Поле Серия

    public void setDeclarant_ident_doc_ser(String declarant_ident_doc_ser) {
        this.declarant_ident_doc_ser = declarant_ident_doc_ser;
    }

    public String getDeclarant_ident_doc_ser() {
        return this.declarant_ident_doc_ser;
    }

    // Поле Номер

    public void setDeclarant_ident_doc_num(String declarant_ident_doc_num) {
        this.declarant_ident_doc_num = declarant_ident_doc_num;
    }

    public String getDeclarant_ident_doc_num() {
        return this.declarant_ident_doc_num;
    }

    // Поле Дата выдачи

    public void setDeclarant_ident_doc_date(Date declarant_ident_doc_date) {
        this.declarant_ident_doc_date = declarant_ident_doc_date;
    }

    public Date getDeclarant_ident_doc_date() {
        return this.declarant_ident_doc_date;
    }

    // Поле Организация

    public void setDeclarant_ident_doc_source(String declarant_ident_doc_source) {
        this.declarant_ident_doc_source = declarant_ident_doc_source;
    }

    public String getDeclarant_ident_doc_source() {
        return this.declarant_ident_doc_source;
    }

    // Поле Семейное положение

    public void setDeclarant_family_status(String declarant_family_status) {
        this.declarant_family_status = declarant_family_status;
    }

    public String getDeclarant_family_status() {
        return this.declarant_family_status;
    }

    // Закладка Сведения о факте рождения заявителя

    // Поле Документ, подтверждающий рождение заявителя

    // Поле Номер

    public void setBirth_doc_num(String birth_doc_num) {
        this.birth_doc_num = birth_doc_num;
    }

    public String getBirth_doc_num() {
        return this.birth_doc_num;
    }

    // Поле Дата выдачи

    public void setBirth_doc_date(Date birth_doc_date) {
        this.birth_doc_date = birth_doc_date;
    }

    public Date getBirth_doc_date() {
        return this.birth_doc_date;
    }

    // Поле Организация

    public void setBirth_doc_org(String birth_doc_org) {
        this.birth_doc_org = birth_doc_org;
    }

    public String getBirth_doc_org() {
        return this.birth_doc_org;
    }

    // Поле Место рождения

    // Поле Страна

    public void setDeclarant_birth_place_country(String declarant_birth_place_country) {
        this.declarant_birth_place_country = declarant_birth_place_country;
    }

    public String getDeclarant_birth_place_country() {
        return this.declarant_birth_place_country;
    }

    // Поле Область (край, респ.)

    public void setDeclarant_birth_place_state(String declarant_birth_place_state) {
        this.declarant_birth_place_state = declarant_birth_place_state;
    }

    public String getDeclarant_birth_place_state() {
        return this.declarant_birth_place_state;
    }

    // Поле Район

    public void setDeclarant_birth_place_region(String declarant_birth_place_region) {
        this.declarant_birth_place_region = declarant_birth_place_region;
    }

    public String getDeclarant_birth_place_region() {
        return this.declarant_birth_place_region;
    }

    // Поле Способ заполнения типа населенного пункта

    public void setDeclarant_birth_place_settlement_type_gr(String declarant_birth_place_settlement_type_gr) {
        this.declarant_birth_place_settlement_type_gr = declarant_birth_place_settlement_type_gr;
    }

    public String getDeclarant_birth_place_settlement_type_gr() {
        return this.declarant_birth_place_settlement_type_gr;
    }

    // Поле Тип населенного пункта (заполняется Вручную)

    public void setDeclarant_birth_place_settlement_type_m(String declarant_birth_place_settlement_type_m) {
        this.declarant_birth_place_settlement_type_m = declarant_birth_place_settlement_type_m;
    }

    public String getDeclarant_birth_place_settlement_type_m() {
        return this.declarant_birth_place_settlement_type_m;
    }

    // Поле Тип населенного пункта (заполняется Из Справочника)

    public void setDeclarant_birth_place_settlement_type(String declarant_birth_place_settlement_type) {
        this.declarant_birth_place_settlement_type = declarant_birth_place_settlement_type;
    }

    public String getDeclarant_birth_place_settlement_type() {
        return this.declarant_birth_place_settlement_type;
    }

    // Поле Населенный пункт

    public void setDeclarant_birth_place_settlement(String declarant_birth_place_settlement) {
        this.declarant_birth_place_settlement = declarant_birth_place_settlement;
    }

    public String getDeclarant_birth_place_settlement() {
        return this.declarant_birth_place_settlement;
    }

    // Закладка Место жительства заявителя

    // Поле Место жительства заявителя

    // Поле Страна

    public void setDeclarant_country(String declarant_country) {
        this.declarant_country = declarant_country;
    }

    public String getDeclarant_country() {
        return this.declarant_country;
    }

    // Поле Область (край, респ.)

    public void setDeclarant_state(String declarant_state) {
        this.declarant_state = declarant_state;
    }

    public String getDeclarant_state() {
        return this.declarant_state;
    }

    // Поле Район

    public void setDeclarant_region(String declarant_region) {
        this.declarant_region = declarant_region;
    }

    public String getDeclarant_region() {
        return this.declarant_region;
    }

    // Поле Способ заполнения типа населенного пункта


    public void setDeclarant_settlement_type_gr(String declarant_settlement_type_gr) {
        this.declarant_settlement_type_gr = declarant_settlement_type_gr;
    }

    public String getDeclarant_settlement_type_gr() {
        return this.declarant_settlement_type_gr;
    }

    // Поле Тип населенного пункта (заполняется Вручную)


    public void setDeclarant_settlement_type_m(String declarant_settlement_type_m) {
        this.declarant_settlement_type_m = declarant_settlement_type_m;
    }

    public String getDeclarant_settlement_type_m() {
        return this.declarant_settlement_type_m;
    }

    // Поле Тип населенного пункта (заполняется Из Справочника)

    public void setDeclarant_settlement_type(String declarant_settlement_type) {
        this.declarant_settlement_type = declarant_settlement_type;
    }

    public String getDeclarant_settlement_type() {
        return this.declarant_settlement_type;
    }

    // Поле Населенный пункт

    public void setDeclarant_settlement(String declarant_settlement) {
        this.declarant_settlement = declarant_settlement;
    }

    public String getDeclarant_settlement() {
        return this.declarant_settlement;
    }

    // Поле Тип улицы

    public void setDeclarant_street_type(String declarant_street_type) {
        this.declarant_street_type = declarant_street_type;
    }

    public String getDeclarant_street_type() {
        return this.declarant_street_type;
    }

    // Поле Улица

    public void setDeclarant_street(String declarant_street) {
        this.declarant_street = declarant_street;
    }

    public String getDeclarant_street() {
        return this.declarant_street;
    }

    // Поле Дом

    public void setDeclarant_house(String declarant_house) {
        this.declarant_house = declarant_house;
    }

    public String getDeclarant_house() {
        return this.declarant_house;
    }

    // Поле Корпус

    public void setDeclarant_building(String declarant_building) {
        this.declarant_building = declarant_building;
    }

    public String getDeclarant_building() {
        return this.declarant_building;
    }

    // Поле Квартира

    public void setDeclarant_flat(String declarant_flat) {
        this.declarant_flat = declarant_flat;
    }

    public String getDeclarant_flat() {
        return this.declarant_flat;
    }

    // Закладка ФИО после перемены имени

    // Поле ФИО после перемены имени

    // Поле Фамилия

    public void setPerson_new_last_name(String person_new_last_name) {
        this.person_new_last_name = person_new_last_name;
    }

    public String getPerson_new_last_name() {
        return this.person_new_last_name;
    }

    // Поле Имя

    public void setPerson_new_first_name(String person_new_first_name) {
        this.person_new_first_name = person_new_first_name;
    }

    public String getPerson_new_first_name() {
        return this.person_new_first_name;
    }

    // Поле Отчество

    public void setPerson_new_middle_name(String person_new_middle_name) {
        this.person_new_middle_name = person_new_middle_name;
    }

    public String getPerson_new_middle_name() {
        return this.person_new_middle_name;
    }

    // Поле Причина перемены имени

    public void setChange_name_reason(String change_name_reason) {
        this.change_name_reason = change_name_reason;
    }

    public String getChange_name_reason() {
        return this.change_name_reason;
    }

    // Закладка Запись на прием

    // Поле Дата и время приема для получения свидетельства

    // Поле Дата

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    // Поле Время

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    // Поле Контактные данные

    // Поле Телефон

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_phone() {
        return this.contact_phone;
    }

    // Поле E-mail заявителя

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email() {
        return this.contact_email;
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
}
