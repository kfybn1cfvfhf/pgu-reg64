package com.nvision.pgu.web.services.s36400224;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.Transient;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.web.services.nakhodka.AbstractNakhodkaForm;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400224Form extends AbstractNakhodkaForm {

    //Закладка Выбор органа ЗАГС обращения и формы заявления
	
	private String he_doc_type_gr;
	private String he_birth_place_settlement_type_m;
	private String she_birth_place_settlement_type_m;
	private String he_living_place_gr;

	public String getHe_living_place_gr() {
		return he_living_place_gr;
	}

	public void setHe_living_place_gr(String he_living_place_gr) {
		this.he_living_place_gr = he_living_place_gr;
	}

	public String getShe_living_place_gr() {
		return she_living_place_gr;
	}

	public void setShe_living_place_gr(String she_living_place_gr) {
		this.she_living_place_gr = she_living_place_gr;
	}

	public String getHe_living_place_m() {
		return he_living_place_m;
	}

	public void setHe_living_place_m(String he_living_place_m) {
		this.he_living_place_m = he_living_place_m;
	}

	public String getShe_living_place_m() {
		return she_living_place_m;
	}

	public void setShe_living_place_m(String she_living_place_m) {
		this.she_living_place_m = she_living_place_m;
	}

	private String she_living_place_gr;
	private String he_living_place_m;
	private String she_living_place_m;

	public String getHe_birth_place_settlement_type_m() {
		return he_birth_place_settlement_type_m;
	}

	public void setHe_birth_place_settlement_type_m(String he_birth_place_settlement_type_m) {
		this.he_birth_place_settlement_type_m = he_birth_place_settlement_type_m;
	}

	public String getShe_birth_place_settlement_type_m() {
		return she_birth_place_settlement_type_m;
	}

	public void setShe_birth_place_settlement_type_m(String she_birth_place_settlement_type_m) {
		this.she_birth_place_settlement_type_m = she_birth_place_settlement_type_m;
	}

	public String getHe_birth_place_settlement_type_gr() {
		return he_birth_place_settlement_type_gr;
	}

	public void setHe_birth_place_settlement_type_gr(String he_birth_place_settlement_type_gr) {
		this.he_birth_place_settlement_type_gr = he_birth_place_settlement_type_gr;
	}

	public String getShe_birth_place_settlement_type_gr() {
		return she_birth_place_settlement_type_gr;
	}

	public void setShe_birth_place_settlement_type_gr(String she_birth_place_settlement_type_gr) {
		this.she_birth_place_settlement_type_gr = she_birth_place_settlement_type_gr;
	}

	private String he_birth_place_settlement_type_gr;
	private String she_birth_place_settlement_type_gr;

	public String getHe_doc_type_gr() {
		return he_doc_type_gr;
	}

	public void setHe_doc_type_gr(String he_doc_type_gr) {
		this.he_doc_type_gr = he_doc_type_gr;
	}

	public String getShe_doc_type_gr() {
		return she_doc_type_gr;
	}

	public void setShe_doc_type_gr(String she_doc_type_gr) {
		this.she_doc_type_gr = she_doc_type_gr;
	}

	public String getHe_doc_type_m() {
		return he_doc_type_m;
	}

	public void setHe_doc_type_m(String he_doc_type_m) {
		this.he_doc_type_m = he_doc_type_m;
	}

	public String getShe_doc_type_m() {
		return she_doc_type_m;
	}

	public void setShe_doc_type_m(String she_doc_type_m) {
		this.she_doc_type_m = she_doc_type_m;
	}

	private String she_doc_type_gr;
	private String he_doc_type_m;
	private String she_doc_type_m;
	private String merried_akt_zags_list;

	public String getMerried_akt_zags_list() {
		return merried_akt_zags_list;
	}

	public void setMerried_akt_zags_list(String merried_akt_zags_list) {
		this.merried_akt_zags_list = merried_akt_zags_list;
	}

	private String merried_akt_zags_gr;

	public String getMerried_akt_zags_gr() {
		return merried_akt_zags_gr;
	}

	public void setMerried_akt_zags_gr(String merried_akt_zags_gr) {
		this.merried_akt_zags_gr = merried_akt_zags_gr;
	}

	//Поле ЗАГС обращения
    private String id_agency_in;    //lookup Запрос к веб-сервису списка ЗАГСов

    private String agency_id;

    @Transient
    private String aggregate_usluga_type_person;

    private String aggregate_usluga_type_person_;



    //Поле Информация о ЗАГСе
    private String agency_in_info;    //

    //Поле Форма заявления

    //Поле Реквизиты записи акта о заключении расторгаемого брака

    //Поле Запись Акта №
    private String merried_akt_num;    //

    //Поле Дата
    private Date merried_akt_date;    //

    //Поле Наименование органа ЗАГС
    private String merried_akt_zags;    //

    //Поле Основание для расторжения брака

    //Поле Тип документа

    //Поле Наименование суда
    private String court_name;    //Отображается, если Форма заявления = 2 и Тип документа = 1

    //Поле Дата решения
    private Date decision_date;    //Отображается, если Форма заявления = 2 и Тип документа = 1

    //Поле Решение суда в отношении
    private String decision_to_who;    //1. Супруга
//2. Супруги
//Отображается, если Форма заявления = 2 и Тип документа = 1

    //Поле Тип решения
    private String decision_type;    //PRIZNANRB_DECISION_TYPE
//1. NONEPRIZNAN Не указано
//2. MISSING Решение о признании второго супруга безвестно отсутствующим
//3. DISABLE Решение о признании второго супруга недееспособным
//Отображается, если Форма заявления = 2 и Тип документа = 1

    //Поле Наименование суда
    private String priznan_law;    //Отображается, если Форма заявления = 2 и Тип документа = 2

    //Поле Дата решения
    private Date priznan_date;    //Отображается, если Форма заявления = 2 и Тип документа = 2

    //Поле Решение суда в отношении
    private String priznan_to_who;    //Отображается, если Форма заявления = 2 и Тип документа = 2

    //Поле Срок
    private String srok;    //Отображается, если Тип документа = 2
//Отображается, если Форма заявления = 2 и Тип документа = 2

    //Поле Наименование суда
    private String name_law;    //Отображается, если Форма заявления = 3

    //Поле Дата
    private Date decision_law_date;    //Отображается, если Форма заявления = 3

    //Поле Заявитель
    private String declarant;    //RB_DECLARANT
//ZJVL_HE - Муж
//ZJVL_SHE  - Жена
//ZJVL_BOTH  - Оба супруга
//Отображается, если Форма заявления = 3

    //Закладка Сведения о супругах

    //Поле Он

    //Поле Фамилия (до расторжения брака)
    private String he_last_name_merried;    //

    //Поле Фамилия (после расторжения брака)
    private String he_last_name_notmerried;    //

    //Поле Имя
    private String he_first_name;    //

    //Поле Отчество
    private String he_middle_name;    //

    //Поле Дата рождения
    private Date he_birth_date;    //

    //Поле Гражданство
    private String he_citizenship;    //
    private String he_nation_dictionary;

    //Поле Национальность
    private String he_nation;    //

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа
    private String he_doc_type;    //

    //Поле Серия
    private String he_doc_ser;    //

    //Поле Номер
    private String he_doc_number;    //

    //Поле Дата выдачи
    private Date he_doc_date;    //

    //Поле Кем выдан
    private String he_doc_place;    //

    //Поле Она

    //Поле Фамилия (до расторжения брака)
    private String she_last_name_merried;    //

    //Поле Фамилия (после расторжения брака)
    private String she_last_name_notmerried;    //

    //Поле Имя
    private String she_first_name;    //

    //Поле Отчество
    private String she_middle_name;    //

    //Поле Дата рождения
    private Date she_birth_date;    //

    //Поле Гражданство
    private String she_citizenship;    //
    private String she_nation_dictionary;
    //Поле Национальность
    private String she_nation;    //

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа
    private String she_doc_type;    //

    //Поле Серия
    private String she_doc_ser;    //

    //Поле Номер
    private String she_doc_number;    //

    //Поле Дата выдачи
    private Date she_doc_date;    //

    //Поле Кем выдан
    private String she_doc_place;    //

    //Закладка Место рождения супругов

    //Поле Он

    //Поле Страна
    private String he_birth_place_country = "Россия";    //

    //Поле Область (край, респ.)
    private String he_birth_place_state;    //

    //Поле Район
    private String he_birth_place_region;    //

    //Поле Тип населенного пункта
    private String he_birth_place_settlement_type;    //

    //Поле Населенный пункт
    private String he_birth_place_settlement;    //

    //Поле Она

    //Поле Страна
    private String she_birth_place_country = "Россия";    //

    //Поле Область (край, респ.)
    private String she_birth_place_state;    //

    //Поле Район
    private String she_birth_place_region;    //

    //Поле Тип населенного пункта
    private String she_birth_place_settlement_type;    //

    //Поле Населенный пункт
    private String she_birth_place_settlement;    //


    //Закладка Место жительства супругов

    //Поле Он

    //Поле Страна
    private String he_living_country = "Россия";    //

    //Поле Область (край, респ.)
    private String he_living_state;    //

    //Поле Район
    private String he_living_region;    //

    //Поле Тип населенного пункта
    private String he_living_place;    //

    //Поле Населенный пункт
    private String he_living_settlement;    //

    //Поле Тип улицы
    private String he_living_street_type;    //

    //Поле Улица
    private String he_living_street;    //

    //Поле Дом
    private String he_living_house;    //

    //Поле Корпус
    private String he_living_building;    //

    //Поле Квартира
    private String he_living_flat;    //

    //Поле Она

    //Поле Страна
    private String she_living_country = "Россия";    //

    //Поле Область (край, респ.)
    private String she_living_state;    //

    //Поле Район
    private String she_living_region;    //

    //Поле Тип населенного пункта
    private String she_living_place;    //

    //Поле Населенный пункт
    private String she_living_settlement;    //

    //Поле Тип улицы
    private String she_living_street_type;    //

    //Поле Улица
    private String she_living_street;    //

    //Поле Дом
    private String she_living_house;    //

    //Поле Корпус
    private String she_living_building;    //

    //Поле Квартира
    private String she_living_flat;    //


    //Закладка Запись на прием

    //Поле Дата и время приема для получения свидетельства

    //Поле Дата
    private String date;    //lookup Обращение к методу GetDayQue

    //Поле Время
    private String time;    //lookup Обращение к методу GetTimeQue

    //Поле Контактные данные


    //Поле телефон
     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
     private String contact_phone_temp_home="";

     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MOBILE)
     private String contact_phone_temp_mobile="";

    private String contact_phone;

    //Поле E-mail заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contact_email;    //

    private String usluga_form;
    private String reason_doc;

    private String adresZags;
    private String telephMain;
    private String adresHttp;

    //Скрытое поле даты рождения заявителя
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date declarant_birthdate;
    
    private Date declarantBirthDatePlus14Years;

    public Date getDeclarantBirthDatePlus14Years() {
        return declarantBirthDatePlus14Years;
    }

    public void setDeclarantBirthDatePlus14Years(Date declarantBirthDatePlus14Years) {
        this.declarantBirthDatePlus14Years = declarantBirthDatePlus14Years;
    }

    public Date getDeclarant_birthdate() {
        return declarant_birthdate;
    }

    public void setDeclarant_birthdate(Date declarant_birthdate) {
        this.declarant_birthdate = declarant_birthdate;
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

    public String getUsluga_form() {
        return usluga_form;
    }

    public void setUsluga_form(String usluga_form) {
        this.usluga_form = usluga_form;
    }

    public String getReason_doc() {
        return reason_doc;
    }

    public void setReason_doc(String reason_doc) {
        this.reason_doc = reason_doc;
    }

    //Закладка Выбор органа ЗАГС обращения и формы заявления

    //Поле ЗАГС обращения

    public void setId_agency_in(String id_agency_in) {
        this.id_agency_in = id_agency_in;
    }

    public String getId_agency_in() {
        return this.id_agency_in;
    }

    //Поле Информация о ЗАГСе

    public void setAgency_in_info(String agency_in_info) {
        this.agency_in_info = agency_in_info;
    }

    public String getAgency_in_info() {
        return this.agency_in_info;
    }

    //Поле Форма заявления

    //Поле Реквизиты записи акта о заключении расторгаемого брака

    //Поле Запись Акта №

    public void setMerried_akt_num(String merried_akt_num) {
        this.merried_akt_num = merried_akt_num;
    }

    public String getMerried_akt_num() {
        return this.merried_akt_num;
    }

    //Поле Дата

    public void setMerried_akt_date(Date merried_akt_date) {
        this.merried_akt_date = merried_akt_date;
    }

    public Date getMerried_akt_date() {
        return this.merried_akt_date;
    }

    //Поле Наименование органа ЗАГС

    public void setMerried_akt_zags(String merried_akt_zags) {
        this.merried_akt_zags = merried_akt_zags;
    }

    public String getMerried_akt_zags() {
        return this.merried_akt_zags;
    }

    //Поле Основание для расторжения брака

    //Поле Тип документа

    //Поле Наименование суда

    public void setCourt_name(String court_name) {
        this.court_name = court_name;
    }

    public String getCourt_name() {
        return this.court_name;
    }

    //Поле Дата решения

    public void setDecision_date(Date decision_date) {
        this.decision_date = decision_date;
    }

    public Date getDecision_date() {
        return this.decision_date;
    }

    //Поле Решение суда в отношении

    public void setDecision_to_who(String decision_to_who) {
        this.decision_to_who = decision_to_who;
    }

    public String getDecision_to_who() {
        return this.decision_to_who;
    }

    //Поле Тип решения

    public void setDecision_type(String decision_type) {
        this.decision_type = decision_type;
    }

    public String getDecision_type() {
        return this.decision_type;
    }

    //Поле Наименование суда

    public void setPriznan_law(String priznan_law) {
        this.priznan_law = priznan_law;
    }

    public String getPriznan_law() {
        return this.priznan_law;
    }

    //Поле Дата решения

    public void setPriznan_date(Date priznan_date) {
        this.priznan_date = priznan_date;
    }

    public Date getPriznan_date() {
        return this.priznan_date;
    }

    //Поле Решение суда в отношении

    public void setPriznan_to_who(String priznan_to_who) {
        this.priznan_to_who = priznan_to_who;
    }

    public String getPriznan_to_who() {
        return this.priznan_to_who;
    }

    //Поле Срок

    public void setSrok(String srok) {
        this.srok = srok;
    }

    public String getSrok() {
        return this.srok;
    }

    //Поле Наименование суда

    public void setName_law(String name_law) {
        this.name_law = name_law;
    }

    public String getName_law() {
        return this.name_law;
    }

    //Поле Дата

    public void setDecision_law_date(Date decision_law_date) {
        this.decision_law_date = decision_law_date;
    }

    public Date getDecision_law_date() {
        return this.decision_law_date;
    }

    //Поле Заявитель

    public void setDeclarant(String declarant) {
        this.declarant = declarant;
    }

    public String getDeclarant() {
        return this.declarant;
    }


    //Закладка Сведения о супругах

    //Поле Он

    //Поле Фамилия (до расторжения брака)

    public void setHe_last_name_merried(String he_last_name_merried) {
        this.he_last_name_merried = he_last_name_merried;
    }

    public String getHe_last_name_merried() {
        return this.he_last_name_merried;
    }

    //Поле Фамилия (после расторжения брака)

    public void setHe_last_name_notmerried(String he_last_name_notmerried) {
        this.he_last_name_notmerried = he_last_name_notmerried;
    }

    public String getHe_last_name_notmerried() {
        return this.he_last_name_notmerried;
    }

    //Поле Имя

    public void setHe_first_name(String he_first_name) {
        this.he_first_name = he_first_name;
    }

    public String getHe_first_name() {
        return this.he_first_name;
    }

    //Поле Отчество

    public void setHe_middle_name(String he_middle_name) {
        this.he_middle_name = he_middle_name;
    }

    public String getHe_middle_name() {
        return this.he_middle_name;
    }

    //Поле Дата рождения

    public void setHe_birth_date(Date he_birth_date) {
        this.he_birth_date = he_birth_date;
    }

    public Date getHe_birth_date() {
        return this.he_birth_date;
    }

    //Поле Гражданство

    public void setHe_citizenship(String he_citizenship) {
        this.he_citizenship = he_citizenship;
    }

    public String getHe_citizenship() {
        return this.he_citizenship;
    }

    //Поле Национальность

    public void setHe_nation(String he_nation) {
        this.he_nation = he_nation;
    }

    public String getHe_nation() {
        return this.he_nation;
    }

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа

    public void setHe_doc_type(String he_doc_type) {
        this.he_doc_type = he_doc_type;
    }

    public String getHe_doc_type() {
        return this.he_doc_type;
    }

    //Поле Серия

    public void setHe_doc_ser(String he_doc_ser) {
        this.he_doc_ser = he_doc_ser;
    }

    public String getHe_doc_ser() {
        return this.he_doc_ser;
    }

    //Поле Номер

    public void setHe_doc_number(String he_doc_number) {
        this.he_doc_number = he_doc_number;
    }

    public String getHe_doc_number() {
        return this.he_doc_number;
    }

    //Поле Дата выдачи

    public void setHe_doc_date(Date he_doc_date) {
        this.he_doc_date = he_doc_date;
    }

    public Date getHe_doc_date() {
        return this.he_doc_date;
    }

    //Поле Кем выдан

    public void setHe_doc_place(String he_doc_place) {
        this.he_doc_place = he_doc_place;
    }

    public String getHe_doc_place() {
        return this.he_doc_place;
    }

    //Поле Она

    //Поле Фамилия (до расторжения брака)

    public void setShe_last_name_merried(String she_last_name_merried) {
        this.she_last_name_merried = she_last_name_merried;
    }

    public String getShe_last_name_merried() {
        return this.she_last_name_merried;
    }

    //Поле Фамилия (после расторжения брака)

    public void setShe_last_name_notmerried(String she_last_name_notmerried) {
        this.she_last_name_notmerried = she_last_name_notmerried;
    }

    public String getShe_last_name_notmerried() {
        return this.she_last_name_notmerried;
    }

    //Поле Имя

    public void setShe_first_name(String she_first_name) {
        this.she_first_name = she_first_name;
    }

    public String getShe_first_name() {
        return this.she_first_name;
    }

    //Поле Отчество

    public void setShe_middle_name(String she_middle_name) {
        this.she_middle_name = she_middle_name;
    }

    public String getShe_middle_name() {
        return this.she_middle_name;
    }

    //Поле Дата рождения

    public void setShe_birth_date(Date she_birth_date) {
        this.she_birth_date = she_birth_date;
    }

    public Date getShe_birth_date() {
        return this.she_birth_date;
    }

    //Поле Гражданство

    public void setShe_citizenship(String she_citizenship) {
        this.she_citizenship = she_citizenship;
    }

    public String getShe_citizenship() {
        return this.she_citizenship;
    }

    //Поле Национальность

    public void setShe_nation(String she_nation) {
        this.she_nation = she_nation;
    }

    public String getShe_nation() {
        return this.she_nation;
    }

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа

    public void setShe_doc_type(String she_doc_type) {
        this.she_doc_type = she_doc_type;
    }

    public String getShe_doc_type() {
        return this.she_doc_type;
    }

    //Поле Серия

    public void setShe_doc_ser(String she_doc_ser) {
        this.she_doc_ser = she_doc_ser;
    }

    public String getShe_doc_ser() {
        return this.she_doc_ser;
    }

    //Поле Номер

    public void setShe_doc_number(String she_doc_number) {
        this.she_doc_number = she_doc_number;
    }

    public String getShe_doc_number() {
        return this.she_doc_number;
    }

    //Поле Дата выдачи

    public void setShe_doc_date(Date she_doc_date) {
        this.she_doc_date = she_doc_date;
    }

    public Date getShe_doc_date() {
        return this.she_doc_date;
    }

    //Поле Кем выдан

    public void setShe_doc_place(String she_doc_place) {
        this.she_doc_place = she_doc_place;
    }

    public String getShe_doc_place() {
        return this.she_doc_place;
    }


    //Закладка Место рождения супругов

    //Поле Он

    //Поле Страна

    public void setHe_birth_place_country(String he_birth_place_country) {
        this.he_birth_place_country = he_birth_place_country;
    }

    public String getHe_birth_place_country() {
        return this.he_birth_place_country;
    }

    //Поле Область (край, респ.)

    public void setHe_birth_place_state(String he_birth_place_state) {
        this.he_birth_place_state = he_birth_place_state;
    }

    public String getHe_birth_place_state() {
        return this.he_birth_place_state;
    }

    //Поле Район

    public void setHe_birth_place_region(String he_birth_place_region) {
        this.he_birth_place_region = he_birth_place_region;
    }

    public String getHe_birth_place_region() {
        return this.he_birth_place_region;
    }

    //Поле Тип населенного пункта

    public void setHe_birth_place_settlement_type(String he_birth_place_settlement_type) {
        this.he_birth_place_settlement_type = he_birth_place_settlement_type;
    }

    public String getHe_birth_place_settlement_type() {
        return this.he_birth_place_settlement_type;
    }

    //Поле Населенный пункт

    public void setHe_birth_place_settlement(String he_birth_place_settlement) {
        this.he_birth_place_settlement = he_birth_place_settlement;
    }

    public String getHe_birth_place_settlement() {
        return this.he_birth_place_settlement;
    }

    //Поле Она

    //Поле Страна

    public void setShe_birth_place_country(String she_birth_place_country) {
        this.she_birth_place_country = she_birth_place_country;
    }

    public String getShe_birth_place_country() {
        return this.she_birth_place_country;
    }

    //Поле Область (край, респ.)

    public void setShe_birth_place_state(String she_birth_place_state) {
        this.she_birth_place_state = she_birth_place_state;
    }

    public String getShe_birth_place_state() {
        return this.she_birth_place_state;
    }

    //Поле Район

    public void setShe_birth_place_region(String she_birth_place_region) {
        this.she_birth_place_region = she_birth_place_region;
    }

    public String getShe_birth_place_region() {
        return this.she_birth_place_region;
    }

    //Поле Тип населенного пункта

    public void setShe_birth_place_settlement_type(String she_birth_place_settlement_type) {
        this.she_birth_place_settlement_type = she_birth_place_settlement_type;
    }

    public String getShe_birth_place_settlement_type() {
        return this.she_birth_place_settlement_type;
    }

    //Поле Населенный пункт

    public void setShe_birth_place_settlement(String she_birth_place_settlement) {
        this.she_birth_place_settlement = she_birth_place_settlement;
    }

    public String getShe_birth_place_settlement() {
        return this.she_birth_place_settlement;
    }


    //Закладка Место жительства супругов

    //Поле Он

    //Поле Страна

    public void setHe_living_country(String he_living_country) {
        this.he_living_country = he_living_country;
    }

    public String getHe_living_country() {
        return this.he_living_country;
    }

    //Поле Область (край, респ.)

    public void setHe_living_state(String he_living_state) {
        this.he_living_state = he_living_state;
    }

    public String getHe_living_state() {
        return this.he_living_state;
    }

    //Поле Район

    public void setHe_living_region(String he_living_region) {
        this.he_living_region = he_living_region;
    }

    public String getHe_living_region() {
        return this.he_living_region;
    }

    //Поле Тип населенного пункта

    public void setHe_living_place(String he_living_place) {
        this.he_living_place = he_living_place;
    }

    public String getHe_living_place() {
        return this.he_living_place;
    }

    //Поле Населенный пункт

    public void setHe_living_settlement(String he_living_settlement) {
        this.he_living_settlement = he_living_settlement;
    }

    public String getHe_living_settlement() {
        return this.he_living_settlement;
    }

    //Поле Тип улицы

    public void setHe_living_street_type(String he_living_street_type) {
        this.he_living_street_type = he_living_street_type;
    }

    public String getHe_living_street_type() {
        return this.he_living_street_type;
    }

    //Поле Улица

    public void setHe_living_street(String he_living_street) {
        this.he_living_street = he_living_street;
    }

    public String getHe_living_street() {
        return this.he_living_street;
    }

    //Поле Дом

    public void setHe_living_house(String he_living_house) {
        this.he_living_house = he_living_house;
    }

    public String getHe_living_house() {
        return this.he_living_house;
    }

    //Поле Корпус

    public void setHe_living_building(String he_living_building) {
        this.he_living_building = he_living_building;
    }

    public String getHe_living_building() {
        return this.he_living_building;
    }

    //Поле Квартира

    public void setHe_living_flat(String he_living_flat) {
        this.he_living_flat = he_living_flat;
    }

    public String getHe_living_flat() {
        return this.he_living_flat;
    }

    //Поле Она

    //Поле Страна

    public void setShe_living_country(String she_living_country) {
        this.she_living_country = she_living_country;
    }

    public String getShe_living_country() {
        return this.she_living_country;
    }

    //Поле Область (край, респ.)

    public void setShe_living_state(String she_living_state) {
        this.she_living_state = she_living_state;
    }

    public String getShe_living_state() {
        return this.she_living_state;
    }

    //Поле Район

    public void setShe_living_region(String she_living_region) {
        this.she_living_region = she_living_region;
    }

    public String getShe_living_region() {
        return this.she_living_region;
    }

    //Поле Тип населенного пункта

    public void setShe_living_place(String she_living_place) {
        this.she_living_place = she_living_place;
    }

    public String getShe_living_place() {
        return this.she_living_place;
    }

    //Поле Населенный пункт

    public void setShe_living_settlement(String she_living_settlement) {
        this.she_living_settlement = she_living_settlement;
    }

    public String getShe_living_settlement() {
        return this.she_living_settlement;
    }

    //Поле Тип улицы

    public void setShe_living_street_type(String she_living_street_type) {
        this.she_living_street_type = she_living_street_type;
    }

    public String getShe_living_street_type() {
        return this.she_living_street_type;
    }

    //Поле Улица

    public void setShe_living_street(String she_living_street) {
        this.she_living_street = she_living_street;
    }

    public String getShe_living_street() {
        return this.she_living_street;
    }

    //Поле Дом

    public void setShe_living_house(String she_living_house) {
        this.she_living_house = she_living_house;
    }

    public String getShe_living_house() {
        return this.she_living_house;
    }

    //Поле Корпус

    public void setShe_living_building(String she_living_building) {
        this.she_living_building = she_living_building;
    }

    public String getShe_living_building() {
        return this.she_living_building;
    }

    //Поле Квартира

    public void setShe_living_flat(String she_living_flat) {
        this.she_living_flat = she_living_flat;
    }

    public String getShe_living_flat() {
        return this.she_living_flat;
    }


    //Закладка Запись на прием

    //Поле Дата и время приема для получения свидетельства

    //Поле Дата

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    //Поле Время

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    //Поле Контактные данные

    //Поле E-mail заявителя

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_email() {
        return this.contact_email;
    }

    public String getAggregate_usluga_type_person() {
        return aggregate_usluga_type_person;
    }

    public void setAggregate_usluga_type_person(String aggregate_usluga_type_person) {
        this.aggregate_usluga_type_person = aggregate_usluga_type_person;
    }

        public String getAggregate_usluga_type_person_() {
        return aggregate_usluga_type_person_;
    }

    public void setAggregate_usluga_type_person_(String aggregate_usluga_type_person_) {
        this.aggregate_usluga_type_person_ = aggregate_usluga_type_person_;
    }


    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

}
