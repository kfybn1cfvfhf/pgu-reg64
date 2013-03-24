package com.nvision.pgu.web.services.s36400225;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400225Form extends AbstractNakhodkaForm {

    //Закладка Выбор органа ЗАГС обращения

    private Date edge_date;
    
    //Поле ЗАГС обращения
    private String id_agency_in;	//lookup Запрос к веб-сервису списка ЗАГСов

    //Поле Информация о ЗАГСе
    private String agency_in_info;	//

    private String adresZags;
    private String telephMain;
    private String adresHttp;
    private String agency_id;

    private String excludeCodesNationalityForMother;
    private String excludeCodesNationalityForFather;

    //Поле Форма заявления
    private String usluga_form;

    //Поле Документ, подтверждающий регистрацию брака
    private String reason_doc;

    //Поле <html><i><font size = "8">Данные о браке заполняются только в том случае, если брак был заключен после рождения ребенка </font></html>

    //Поле Тип документа

    //Поле Номер
    private String death_doc_num;	//

    //Поле <html><i><font size = "8">Если точная дата  неизвестна, то заполните только поля, значения которых вы знаете</font></i></html>

    //Поле Дата выдачи свидетельства (число, месяц, год)

    //Поле
    private String death_doc_date_day;	//маска ввода: двухзначное число от 01 до 31

    //Поле
    private String death_doc_date_month;	//Если выбран февраль, то проверять, что число не больше 28, 29

    //Поле
    private String death_doc_date_year;	//Проверять год на високосность

    //Поле Наименование органа ЗАГС
    private String death_doc_source;	//

    //Поле Наименование суда
    private String court_name;	//

    //Поле Дата решения
    private Date decision_date;	//

    //Поле Тип решения
    private String decision_type;	//PRIZNANUO_DECISION_TYPE
//1. NONEPRIZNAN Не указано
//2. MISSING Решение суда о признании матери безвестно отсутствующей
//3. DISABLE Решение суда о признании матери недееспособной
//4. DEPRIVAT Решение суда о признании матери лишённой родительских прав

    //Поле Номер справки
    private String certificate_num;	//

    //Поле <html><i><font size = "8">Если точная дата  неизвестна, то заполните только поля, значения которых вы знаете</font></i></html>

    //Поле Дата выдачи справки (число, месяц, год)

    private Date certificate_date; //

    //Поле
    private String certificate_date_day;	//

    //Поле
    private String certificate_date_month;	//

    //Поле
    private String certificate_date_year;	//

    //Поле Наименование организации, выдавшей справку
    private String certificate_source;	//

    //Поле Реквизиты решения суда

    //Поле Наименование суда
    private String name_law;	//

    //Поле Дата
    private Date decision_law_date;	//

    //Поле Тип решения суда
    private String decision_law_type;	//RSUO_DECISION_TYPE
//1. NONERS Не указано
//2. RSUO Решение суда об установлении отцовства
//3. RSUFP Решение суда об установлении факта признания отцовства

    //Закладка Сведения о ребенке

    //Поле Сведения о ребенке

    //Поле Дата рождения
    private Date child_birth_date;	//

    //Поле Пол
    private String child_sex;	//

    //Поле Место рождения

    //Поле Страна
    private String child_country = "Россия";	//

    //Поле Область (край, респ.)
    private String child_state;	//

    //Поле Район
    private String child_region;	//

    //Поле Тип населенного пункта

    //Поле Населенный пункт
    private String child_settlement;	//

    private String child_settlement_type;	//

    //Поле Реквизиты записи акта о рождении ребенка

    //Поле Запись Акта №
    private String birth_akt_num;	//

    //Поле Дата
    private Date birth_name;	//

    //Поле Наименование органа ЗАГС
    private String birth_zags;	//

    //Поле ФИО ребенка до установления отцовства

    //Поле Фамилия
    private String child_before_last_name;	//

    //Поле Имя
    private String child_before_first_name;	//

    //Поле Отчество
    private String child_before_middle_name;	//

    //Поле ФИО ребенка после установления отцовства

    //Поле Фамилия
    private String child_after_last_name;	//

    //Поле Имя
    private String child_after_first_name;	//

    //Поле Отчество
    private String child_after_middle_name;	//


    //Закладка Сведения о родителях

    //Поле Отец

    //Поле Фамилия
    private String declarant_father_last_name;	//

    //Поле Имя
    private String declarant_father_first_name;	//

    //Поле Отчество
    private String declarant_father_middle_name;	//

    //Поле Дата рождения
    private Date declarant_father_birth_date;	//

    //Поле Гражданство

    //Поле Национальность
    private String declarant_father_nation;	//

    private String declarant_father_nation_dictionary;
    //Поле Документ, удостоверяющий личность

    //Поле Тип документа

    //Поле Серия
    private String declarant_father_doc_ser;	//

    //Поле Номер
    private String declarant_father_doc_number;	//

    //Поле Дата выдачи
    private Date declarant_father_doc_date;	//

    //Поле Кем выдан
    private String declarant_father_doc_place;	//

    //Поле Мать

    //Поле Фамилия
    private String declarant_mother_last_name;	//

    //Поле Имя
    private String declarant_mother_first_name;	//

    //Поле Отчество
    private String declarant_mother_middle_name;	//

    //Поле Дата рождения
    private Date declarant_mother_birth_date;	//

    //Поле Гражданство

    //Поле Национальность
    private String declarant_mother_nation;	//

    private String declarant_mother_nation_dictionary;

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа

    //Поле Серия
    private String declarant_mother_doc_ser;	//

    //Поле Номер
    private String declarant_mother_doc_number;	//

    //Поле Дата выдачи
    private Date declarant_mother_doc_date;	//

    //Поле Кем выдан
    private String declarant_mother_doc_place;	//

    private String declarant_father_citizenship;	//

    //Закладка Место рождения родителей

    //Поле МЕСТО РОЖДЕНИЯ ОТЦА

    //Поле Страна
    private String father_birth_place_country = "Россия";	//

    //Поле Область (край, респ.)
    private String father_birth_place_state;	//

    //Поле Район
    private String father_birth_place_region;	//

    //Поле Тип населенного пункта

    //Поле Населенный пункт
    private String father_birth_place_settlement;	//

    //Поле МЕСТО РОЖДЕНИЯ МАТЕРИ

    //Поле Страна
    private String mother_birth_place_country = "Россия";	//

    //Поле Область (край, респ.)
    private String mother_birth_place_state;	//

    //Поле Район
    private String mother_birth_place_region;	//

    //Поле Тип населенного пункта

    //Поле Населенный пункт
    private String mother_birth_place_settlement;	//

    //Закладка Место жительства родителей

    //Поле МЕСТО ЖИТЕЛЬСТВА ОТЦА

    //Поле Страна
    private String father_living_country = "Россия";	//

    //Поле Область (край, респ.)
    private String father_living_state;	//

    //Поле Район
    private String father_living_region;	//

    //Поле Тип населенного пункта

    //Поле Населенный пункт
    private String father_living_settlement;	//

    //Поле Тип улицы

    //Поле Улица
    private String father_living_street;	//

    //Поле Дом
    private String father_living_house;	//

    //Поле Корпус
    private String father_living_building;	//

    //Поле Квартира
    private String father_living_flat;	//

    //Поле МЕСТО ЖИТЕЛЬСТВА МАТЕРИ

    //Поле Страна
    private String mother_living_country = "Россия";	//

    //Поле Область (край, респ.)
    private String mother_living_state;	//

    //Поле Район
    private String mother_living_region;	//

    //Поле Тип населенного пункта

    //Поле Населенный пункт
    private String mother_living_settlement;	//

    //Поле Тип улицы

    //Поле Улица
    private String mother_living_street;	//

    //Поле Дом
    private String mother_living_house;	//

    //Поле Корпус
    private String mother_living_building;	//

    //Поле Квартира
    private String mother_living_flat;	//


    //Закладка Документ, подтверждающий регистрацию брака

    //Поле Реквизиты записи акта о регистрации брака

    //Поле <html><i>Данные о браке заполняются только в том случае, если брак был заключен после рождения ребенка </html>

    //Поле Запись Акта №
    private String merried_akt_num;	//

    //Поле Дата
    private Date merried_akt_date;	//

    //дата рождения заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthday;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contact_phone_temp_home="";

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
    private String contact_phone_temp_mobile="";

    private String contact_phone;



    //Поле Наименование органа ЗАГС
    private String merried_akt_zags;

    // NEW
    //Способ заполнения наименования органа ЗАГС
    private String merried_akt_zags_gr;

    public String getMerried_akt_zags_gr() {
        return merried_akt_zags_gr;
    }

    public void setMerried_akt_zags_gr(String merried_akt_zags_gr) {
        this.merried_akt_zags_gr = merried_akt_zags_gr;
    }

    // Наименование органа ЗАГС
    private String merried_akt_zags_list;

    public String getMerried_akt_zags_list() {
        return merried_akt_zags_list;
    }

    public void setMerried_akt_zags_list(String merried_akt_zags_list) {
        this.merried_akt_zags_list = merried_akt_zags_list;
    }

    //Способ заполнения типа населенного пункта
    private String child_settlement_type_gr;
    public String getChild_settlement_type_gr() {
        return child_settlement_type_gr;
    }

    public void setChild_settlement_type_gr(String child_settlement_type_gr) {
        this.child_settlement_type_gr = child_settlement_type_gr;
    }

    // Тип населенного пункта
    private String  child_settlement_type_m;

    public String getChild_settlement_type_m() {
        return child_settlement_type_m;
    }

    public void setChild_settlement_type_m(String child_settlement_type_m) {
        this.child_settlement_type_m = child_settlement_type_m;
    }

    // Способ заполнения типа документа
    //----------------------------------ОТЕЦ-----------------------------------------//
    private String  declarant_father_doc_type_gr;

    public String getDeclarant_father_doc_type_gr() {
        return declarant_father_doc_type_gr;
    }

    public void setDeclarant_father_doc_type_gr(String declarant_father_doc_type_gr) {
        this.declarant_father_doc_type_gr = declarant_father_doc_type_gr;
    }

    // Тип документа
    private String  declarant_father_doc_type_m;

    public String getDeclarant_father_doc_type_m() {
        return declarant_father_doc_type_m;
    }

    public void setDeclarant_father_doc_type_m(String declarant_father_doc_type_m) {
        this.declarant_father_doc_type_m = declarant_father_doc_type_m;
    }

    // Способ заполнения типа населенного пункта
    public String getFather_birth_place_settlement_type_gr() {
        return father_birth_place_settlement_type_gr;
    }

    public void setFather_birth_place_settlement_type_gr(String father_birth_place_settlement_type_gr) {
        this.father_birth_place_settlement_type_gr = father_birth_place_settlement_type_gr;
    }

    private String father_birth_place_settlement_type_gr;

    //Тип населенного пункта
    private String father_birth_place_settlement_type_m;

    public String getFather_birth_place_settlement_type_m() {
        return father_birth_place_settlement_type_m;
    }

    public void setFather_birth_place_settlement_type_m(String father_birth_place_settlement_type_m) {
        this.father_birth_place_settlement_type_m = father_birth_place_settlement_type_m;
    }

    private String father_living_place_gr;

    public String getFather_living_place_gr() {
        return father_living_place_gr;
    }

    public void setFather_living_place_gr(String father_living_place_gr) {
        this.father_living_place_gr = father_living_place_gr;
    }

    private String father_living_place_m;

    public String getFather_living_place_m() {
        return father_living_place_m;
    }

    public void setFather_living_place_m(String father_living_place_m) {
        this.father_living_place_m = father_living_place_m;
    }

    //----------------------------------ОТЕЦ-----------------------------------------//
    //----------------------------------МАТЬ-----------------------------------------//
    // Способ заполнения типа документа
    private String  declarant_mother_doc_type_gr;

    public String getDeclarant_mother_doc_type_gr() {
        return declarant_mother_doc_type_gr;
    }

    public void setDeclarant_mother_doc_type_gr(String declarant_mother_doc_type_gr) {
        this.declarant_mother_doc_type_gr = declarant_mother_doc_type_gr;
    }

    // Тип документа
    private String  declarant_mother_doc_type_m;

    public String getDeclarant_mother_doc_type_m() {
        return declarant_mother_doc_type_m;
    }

    public void setDeclarant_mother_doc_type_m(String declarant_mother_doc_type_m) {
        this.declarant_mother_doc_type_m = declarant_mother_doc_type_m;
    }

    private String mother_birth_place_settlement_type_gr;

    public String getMother_birth_place_settlement_type_gr() {
        return mother_birth_place_settlement_type_gr;
    }

    public void setMother_birth_place_settlement_type_gr(String mother_birth_place_settlement_type_gr) {
        this.mother_birth_place_settlement_type_gr = mother_birth_place_settlement_type_gr;
    }



    private String mother_birth_place_settlement_type_m;

    public String getMother_birth_place_settlement_type_m() {
        return mother_birth_place_settlement_type_m;
    }

    public void setMother_birth_place_settlement_type_m(String mother_birth_place_settlement_type_m) {
        this.mother_birth_place_settlement_type_m = mother_birth_place_settlement_type_m;
    }

    private String mother_living_place_gr;

    public String getMother_living_place_gr() {
        return mother_living_place_gr;
    }

    public void setMother_living_place_gr(String mother_living_place_gr) {
        this.mother_living_place_gr = mother_living_place_gr;
    }


    
    private String mother_living_place_m;

    public String getMother_living_place_m() {
        return mother_living_place_m;
    }

    public void setMother_living_place_m(String mother_living_place_m) {
        this.mother_living_place_m = mother_living_place_m;
    }



    //----------------------------------МАТЬ-----------------------------------------//



    // NEW

    //Закладка Запись на прием

    //Поле Дата и время приема для получения свидетельства

    //Поле Дата
    private String date;	//lookup Обращение к методу GetDayQue

    //Поле Время
    private String time;	//lookup Обращение к методу GetTimeQue

    //Поле Контактные данные

    //Поле E-mail заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;	//

    //Закладка Выбор органа ЗАГС обращения

    //Поле ЗАГС обращения
    private String declarant_mother_citizenship;
    private String declarant_father_doc_type;
    private String declarant_mother_doc_type;
    private String father_birth_place_settlement_type;
    private String mother_birth_place_settlement_type;
    private String father_living_street_type;
    private String mother_living_street_type;
    private String father_living_place;
    private String mother_living_place;

    public String getFather_living_place() {
        return father_living_place;
    }

    public void setFather_living_place(String father_living_place) {
        this.father_living_place = father_living_place;
    }

    public String getMother_living_place() {
        return mother_living_place;
    }

    public void setMother_living_place(String mother_living_place) {
        this.mother_living_place = mother_living_place;
    }

    public String getFather_living_street_type() {
        return father_living_street_type;
    }

    public void setFather_living_street_type(String father_living_street_type) {
        this.father_living_street_type = father_living_street_type;
    }

    public String getMother_living_street_type() {
        return mother_living_street_type;
    }

    public void setMother_living_street_type(String mother_living_street_type) {
        this.mother_living_street_type = mother_living_street_type;
    }

    public String getFather_birth_place_settlement_type() {
        return father_birth_place_settlement_type;
    }

    public void setFather_birth_place_settlement_type(String father_birth_place_settlement_type) {
        this.father_birth_place_settlement_type = father_birth_place_settlement_type;
    }

    public String getMother_birth_place_settlement_type() {
        return mother_birth_place_settlement_type;
    }

    public void setMother_birth_place_settlement_type(String mother_birth_place_settlement_type) {
        this.mother_birth_place_settlement_type = mother_birth_place_settlement_type;
    }

    public String getDeclarant_mother_citizenship() {
        return declarant_mother_citizenship;
    }

    public void setDeclarant_mother_citizenship(String declarant_mother_citizenship) {
        this.declarant_mother_citizenship = declarant_mother_citizenship;
    }

    public String getDeclarant_father_doc_type() {
        return declarant_father_doc_type;
    }

    public void setDeclarant_father_doc_type(String declarant_father_doc_type) {
        this.declarant_father_doc_type = declarant_father_doc_type;
    }

    public String getDeclarant_mother_doc_type() {
        return declarant_mother_doc_type;
    }

    public void setDeclarant_mother_doc_type(String declarant_mother_doc_type) {
        this.declarant_mother_doc_type = declarant_mother_doc_type;
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

    public Date getChild_birth_date() {
        return child_birth_date;
    }

    public void setChild_birth_date(Date child_birth_date) {
        this.child_birth_date = child_birth_date;
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

    public String getChild_settlement() {
        return child_settlement;
    }

    public void setChild_settlement(String child_settlement) {
        this.child_settlement = child_settlement;
    }

    public String getBirth_akt_num() {
        return birth_akt_num;
    }

    public void setBirth_akt_num(String birth_akt_num) {
        this.birth_akt_num = birth_akt_num;
    }

    public Date getBirth_name() {
        return birth_name;
    }

    public void setBirth_name(Date birth_name) {
        this.birth_name = birth_name;
    }

    public String getBirth_zags() {
        return birth_zags;
    }

    public void setBirth_zags(String birth_zags) {
        this.birth_zags = birth_zags;
    }

    public String getChild_before_last_name() {
        return child_before_last_name;
    }

    public void setChild_before_last_name(String child_before_last_name) {
        this.child_before_last_name = child_before_last_name;
    }

    public String getChild_before_first_name() {
        return child_before_first_name;
    }

    public void setChild_before_first_name(String child_before_first_name) {
        this.child_before_first_name = child_before_first_name;
    }

    public String getChild_before_middle_name() {
        return child_before_middle_name;
    }

    public void setChild_before_middle_name(String child_before_middle_name) {
        this.child_before_middle_name = child_before_middle_name;
    }

    public String getChild_after_last_name() {
        return child_after_last_name;
    }

    public void setChild_after_last_name(String child_after_last_name) {
        this.child_after_last_name = child_after_last_name;
    }

    public String getChild_after_first_name() {
        return child_after_first_name;
    }

    public void setChild_after_first_name(String child_after_first_name) {
        this.child_after_first_name = child_after_first_name;
    }

    public String getChild_after_middle_name() {
        return child_after_middle_name;
    }

    public void setChild_after_middle_name(String child_after_middle_name) {
        this.child_after_middle_name = child_after_middle_name;
    }

    public String getDeclarant_father_last_name() {
        return declarant_father_last_name;
    }

    public void setDeclarant_father_last_name(String declarant_father_last_name) {
        this.declarant_father_last_name = declarant_father_last_name;
    }

    public String getDeclarant_father_first_name() {
        return declarant_father_first_name;
    }

    public void setDeclarant_father_first_name(String declarant_father_first_name) {
        this.declarant_father_first_name = declarant_father_first_name;
    }

    public String getDeclarant_father_middle_name() {
        return declarant_father_middle_name;
    }

    public void setDeclarant_father_middle_name(String declarant_father_middle_name) {
        this.declarant_father_middle_name = declarant_father_middle_name;
    }

    public Date getDeclarant_father_birth_date() {
        return declarant_father_birth_date;
    }

    public void setDeclarant_father_birth_date(Date declarant_father_birth_date) {
        this.declarant_father_birth_date = declarant_father_birth_date;
    }

    public String getDeclarant_father_nation() {
        return declarant_father_nation;
    }

    public void setDeclarant_father_nation(String declarant_father_nation) {
        this.declarant_father_nation = declarant_father_nation;
    }

    public String getDeclarant_father_doc_ser() {
        return declarant_father_doc_ser;
    }

    public void setDeclarant_father_doc_ser(String declarant_father_doc_ser) {
        this.declarant_father_doc_ser = declarant_father_doc_ser;
    }

    public String getDeclarant_father_doc_number() {
        return declarant_father_doc_number;
    }

    public void setDeclarant_father_doc_number(String declarant_father_doc_number) {
        this.declarant_father_doc_number = declarant_father_doc_number;
    }

    public Date getDeclarant_father_doc_date() {
        return declarant_father_doc_date;
    }

    public void setDeclarant_father_doc_date(Date declarant_father_doc_date) {
        this.declarant_father_doc_date = declarant_father_doc_date;
    }

    public String getDeclarant_father_doc_place() {
        return declarant_father_doc_place;
    }

    public void setDeclarant_father_doc_place(String declarant_father_doc_place) {
        this.declarant_father_doc_place = declarant_father_doc_place;
    }

    public String getDeclarant_mother_last_name() {
        return declarant_mother_last_name;
    }

    public void setDeclarant_mother_last_name(String declarant_mother_last_name) {
        this.declarant_mother_last_name = declarant_mother_last_name;
    }

    public String getDeclarant_mother_first_name() {
        return declarant_mother_first_name;
    }

    public void setDeclarant_mother_first_name(String declarant_mother_first_name) {
        this.declarant_mother_first_name = declarant_mother_first_name;
    }

    public String getDeclarant_mother_middle_name() {
        return declarant_mother_middle_name;
    }

    public void setDeclarant_mother_middle_name(String declarant_mother_middle_name) {
        this.declarant_mother_middle_name = declarant_mother_middle_name;
    }

    public Date getDeclarant_mother_birth_date() {
        return declarant_mother_birth_date;
    }

    public void setDeclarant_mother_birth_date(Date declarant_mother_birth_date) {
        this.declarant_mother_birth_date = declarant_mother_birth_date;
    }

    public String getDeclarant_mother_nation() {
        return declarant_mother_nation;
    }

    public void setDeclarant_mother_nation(String declarant_mother_nation) {
        this.declarant_mother_nation = declarant_mother_nation;
    }

    public String getDeclarant_mother_doc_ser() {
        return declarant_mother_doc_ser;
    }

    public void setDeclarant_mother_doc_ser(String declarant_mother_doc_ser) {
        this.declarant_mother_doc_ser = declarant_mother_doc_ser;
    }

    public String getDeclarant_mother_doc_number() {
        return declarant_mother_doc_number;
    }

    public void setDeclarant_mother_doc_number(String declarant_mother_doc_number) {
        this.declarant_mother_doc_number = declarant_mother_doc_number;
    }

    public Date getDeclarant_mother_doc_date() {
        return declarant_mother_doc_date;
    }

    public void setDeclarant_mother_doc_date(Date declarant_mother_doc_date) {
        this.declarant_mother_doc_date = declarant_mother_doc_date;
    }

    public String getDeclarant_mother_doc_place() {
        return declarant_mother_doc_place;
    }

    public void setDeclarant_mother_doc_place(String declarant_mother_doc_place) {
        this.declarant_mother_doc_place = declarant_mother_doc_place;
    }

    public String getFather_birth_place_country() {
        return father_birth_place_country;
    }

    public void setFather_birth_place_country(String father_birth_place_country) {
        this.father_birth_place_country = father_birth_place_country;
    }

    public String getFather_birth_place_state() {
        return father_birth_place_state;
    }

    public void setFather_birth_place_state(String father_birth_place_state) {
        this.father_birth_place_state = father_birth_place_state;
    }

    public String getFather_birth_place_region() {
        return father_birth_place_region;
    }

    public void setFather_birth_place_region(String father_birth_place_region) {
        this.father_birth_place_region = father_birth_place_region;
    }

    public String getFather_birth_place_settlement() {
        return father_birth_place_settlement;
    }

    public void setFather_birth_place_settlement(String father_birth_place_settlement) {
        this.father_birth_place_settlement = father_birth_place_settlement;
    }

    public String getMother_birth_place_country() {
        return mother_birth_place_country;
    }

    public void setMother_birth_place_country(String mother_birth_place_country) {
        this.mother_birth_place_country = mother_birth_place_country;
    }

    public String getMother_birth_place_state() {
        return mother_birth_place_state;
    }

    public void setMother_birth_place_state(String mother_birth_place_state) {
        this.mother_birth_place_state = mother_birth_place_state;
    }

    public String getMother_birth_place_region() {
        return mother_birth_place_region;
    }

    public void setMother_birth_place_region(String mother_birth_place_region) {
        this.mother_birth_place_region = mother_birth_place_region;
    }

    public String getMother_birth_place_settlement() {
        return mother_birth_place_settlement;
    }

    public void setMother_birth_place_settlement(String mother_birth_place_settlement) {
        this.mother_birth_place_settlement = mother_birth_place_settlement;
    }

    public String getFather_living_country() {
        return father_living_country;
    }

    public void setFather_living_country(String father_living_country) {
        this.father_living_country = father_living_country;
    }

    public String getFather_living_state() {
        return father_living_state;
    }

    public void setFather_living_state(String father_living_state) {
        this.father_living_state = father_living_state;
    }

    public String getFather_living_region() {
        return father_living_region;
    }

    public void setFather_living_region(String father_living_region) {
        this.father_living_region = father_living_region;
    }

    public String getFather_living_settlement() {
        return father_living_settlement;
    }

    public void setFather_living_settlement(String father_living_settlement) {
        this.father_living_settlement = father_living_settlement;
    }

    public String getFather_living_street() {
        return father_living_street;
    }

    public void setFather_living_street(String father_living_street) {
        this.father_living_street = father_living_street;
    }

    public String getFather_living_house() {
        return father_living_house;
    }

    public void setFather_living_house(String father_living_house) {
        this.father_living_house = father_living_house;
    }

    public String getFather_living_building() {
        return father_living_building;
    }

    public void setFather_living_building(String father_living_building) {
        this.father_living_building = father_living_building;
    }

    public String getFather_living_flat() {
        return father_living_flat;
    }

    public void setFather_living_flat(String father_living_flat) {
        this.father_living_flat = father_living_flat;
    }

    public String getMother_living_country() {
        return mother_living_country;
    }

    public void setMother_living_country(String mother_living_country) {
        this.mother_living_country = mother_living_country;
    }

    public String getMother_living_state() {
        return mother_living_state;
    }

    public void setMother_living_state(String mother_living_state) {
        this.mother_living_state = mother_living_state;
    }

    public String getMother_living_region() {
        return mother_living_region;
    }

    public void setMother_living_region(String mother_living_region) {
        this.mother_living_region = mother_living_region;
    }

    public String getMother_living_settlement() {
        return mother_living_settlement;
    }

    public void setMother_living_settlement(String mother_living_settlement) {
        this.mother_living_settlement = mother_living_settlement;
    }

    public String getMother_living_street() {
        return mother_living_street;
    }

    public void setMother_living_street(String mother_living_street) {
        this.mother_living_street = mother_living_street;
    }

    public String getMother_living_house() {
        return mother_living_house;
    }

    public void setMother_living_house(String mother_living_house) {
        this.mother_living_house = mother_living_house;
    }

    public String getMother_living_building() {
        return mother_living_building;
    }

    public void setMother_living_building(String mother_living_building) {
        this.mother_living_building = mother_living_building;
    }

    public String getMother_living_flat() {
        return mother_living_flat;
    }

    public void setMother_living_flat(String mother_living_flat) {
        this.mother_living_flat = mother_living_flat;
    }

    public String getMerried_akt_num() {
        return merried_akt_num;
    }

    public void setMerried_akt_num(String merried_akt_num) {
        this.merried_akt_num = merried_akt_num;
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

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getChild_settlement_type() {
        return child_settlement_type;
    }

    public void setChild_settlement_type(String child_settlement_type) {
        this.child_settlement_type = child_settlement_type;
    }

    public String getDeclarant_father_citizenship() {
        return declarant_father_citizenship;
    }

    public void setDeclarant_father_citizenship(String declarant_father_citizenship) {
        this.declarant_father_citizenship = declarant_father_citizenship;
    }

    public String getUsluga_form() {
        return usluga_form;
    }

    public void setUsluga_form(String usluga_form) {
        this.usluga_form = usluga_form;
    }

    public String getDeath_doc_num() {
        return death_doc_num;
    }

    public void setDeath_doc_num(String death_doc_num) {
        this.death_doc_num = death_doc_num;
    }

    public String getDeath_doc_date_day() {
        return death_doc_date_day;
    }

    public void setDeath_doc_date_day(String death_doc_date_day) {
        this.death_doc_date_day = death_doc_date_day;
    }

    public String getDeath_doc_date_month() {
        return death_doc_date_month;
    }

    public void setDeath_doc_date_month(String death_doc_date_month) {
        this.death_doc_date_month = death_doc_date_month;
    }

    public String getDeath_doc_date_year() {
        return death_doc_date_year;
    }

    public void setDeath_doc_date_year(String death_doc_date_year) {
        this.death_doc_date_year = death_doc_date_year;
    }

    public String getDeath_doc_source() {
        return death_doc_source;
    }

    public void setDeath_doc_source(String death_doc_source) {
        this.death_doc_source = death_doc_source;
    }

    public String getCourt_name() {
        return court_name;
    }

    public void setCourt_name(String court_name) {
        this.court_name = court_name;
    }

    public Date getDecision_date() {
        return decision_date;
    }

    public void setDecision_date(Date decision_date) {
        this.decision_date = decision_date;
    }

    public String getDecision_type() {
        return decision_type;
    }

    public void setDecision_type(String decision_type) {
        this.decision_type = decision_type;
    }

    public String getCertificate_num() {
        return certificate_num;
    }

    public void setCertificate_num(String certificate_num) {
        this.certificate_num = certificate_num;
    }

    public String getCertificate_date_day() {
        return certificate_date_day;
    }

    public void setCertificate_date_day(String certificate_date_day) {
        this.certificate_date_day = certificate_date_day;
    }

    public String getCertificate_date_month() {
        return certificate_date_month;
    }

    public void setCertificate_date_month(String certificate_date_month) {
        this.certificate_date_month = certificate_date_month;
    }

    public String getCertificate_date_year() {
        return certificate_date_year;
    }

    public void setCertificate_date_year(String certificate_date_year) {
        this.certificate_date_year = certificate_date_year;
    }

    public String getCertificate_source() {
        return certificate_source;
    }

    public void setCertificate_source(String certificate_source) {
        this.certificate_source = certificate_source;
    }

    public String getName_law() {
        return name_law;
    }

    public void setName_law(String name_law) {
        this.name_law = name_law;
    }

    public Date getDecision_law_date() {
        return decision_law_date;
    }

    public void setDecision_law_date(Date decision_law_date) {
        this.decision_law_date = decision_law_date;
    }

    public String getDecision_law_type() {
        return decision_law_type;
    }

    public void setDecision_law_type(String decision_law_type) {
        this.decision_law_type = decision_law_type;
    }

    public String getReason_doc() {
        return reason_doc;
    }

    public void setReason_doc(String reason_doc) {
        this.reason_doc = reason_doc;
    }

    public Date getCertificate_date() {
        return certificate_date;
    }

    public void setCertificate_date(Date certificate_date) {
        this.certificate_date = certificate_date;
    }

    public Date getDeclarant_birthday() {
        return declarant_birthday;
    }

    public void setDeclarant_birthday(Date declarant_birthday) {
        this.declarant_birthday = declarant_birthday;
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

    public String getExcludeCodesNationalityForMother() {
        return excludeCodesNationalityForMother;
    }

    public void setExcludeCodesNationalityForMother(String excludeCodesNationalityForMother) {
        this.excludeCodesNationalityForMother = excludeCodesNationalityForMother;
    }

    public String getExcludeCodesNationalityForFather() {
        return excludeCodesNationalityForFather;
    }

    public void setExcludeCodesNationalityForFather(String excludeCodesNationalityForFather) {
        this.excludeCodesNationalityForFather = excludeCodesNationalityForFather;
    }

    public Date getEdge_date() {
        return edge_date;
    }

    public void setEdge_date(Date edge_date) {
        this.edge_date = edge_date;
    }

    public String getContact_phone() {
        String s = "";
        boolean mobile=false;
        if ((getContact_phone_temp_mobile() != null) && !getContact_phone_temp_mobile().equals("")){
            s+=getContact_phone_temp_mobile();
            mobile=true;
        }

        if ((getContact_phone_temp_home() != null) && !getContact_phone_temp_home().equals("")){
            if(mobile){
                s+=",";
            }
            s+=getContact_phone_temp_home();
        }
        return s;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
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

    public String getDeclarant_father_nation_dictionary() {
        return declarant_father_nation_dictionary;
    }

    public void setDeclarant_father_nation_dictionary(String declarant_father_nation_dictionary) {
        this.declarant_father_nation_dictionary = declarant_father_nation_dictionary;
    }

    public String getDeclarant_mother_nation_dictionary() {
        return declarant_mother_nation_dictionary;
    }

    public void setDeclarant_mother_nation_dictionary(String declarant_mother_nation_dictionary) {
        this.declarant_mother_nation_dictionary = declarant_mother_nation_dictionary;
    }
}
