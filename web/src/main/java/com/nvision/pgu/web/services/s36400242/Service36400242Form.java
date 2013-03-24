package com.nvision.pgu.web.services.s36400242;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400242Form extends AbstractServiceOrderForm {



    //Закладка Сведения о заявителе

    //Поле Фамилия:


            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
			private String last_name;	//Недоступно для редактирования. Данные из СИА.

			//Поле Имя:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
			private String first_name;	//Недоступно для редактирования. Данные из СИА.

			//Поле Отчество:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
			private String middle_name;	//Недоступно для редактирования. Данные из СИА.

			//Поле Дата рождения:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
			private Date birth_date;	//Недоступно для редактирования. Данные из СИА.

			//Поле Пол:

			private String sex;	//Недоступно для редактирования. Данные из СИА.

			//Поле Гражданство:


			private String citizenship;	//

			//Поле Документ, удостоверяющий личность

			//Поле Тип документа:

			private String passport_type;	//Недоступно для редактирования. Данные из СИА.

			//Поле Серия:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
			private String passport_series;	//Недоступно для редактирования. Данные из СИА.

			//Поле Номер:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
			private String passport_number;	//Недоступно для редактирования. Данные из СИА.

			//Поле Кем выдан:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
			private String passport_given_out;	//Недоступно для редактирования. Данные из СИА.

			//Поле Дата выдачи:

			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
			private Date passport_delivery_date;	//Недоступно для редактирования. Данные из СИА.

    //Поле Место регистрации

    //Поле Почтовый индекс:


    private String addr_Index;	//

    //Поле Регион/Область:


    private String addr_city;	//Выбирается из справочника КЛАДР

    //Поле Город/Населенный пункт:


    private String addr_gorod;	//Выбирается из справочника КЛАДР в соответствии с Регион/Область

    //Поле Улица:


    private String addr_ul;	//Выбирается из справочника КЛАДР в соответствии с Город/Населенный пункт

    //Поле Дом:


    private String addr_dom;	//

    //Поле Корпус (строение):


    private String addr_korp;	//

    //Поле Квартира:


    private String addr_kvart;	//

    //Поле Контактный телефон:


    private String tel;	//

    //Поле Адрес электронной почты:


    private String mail;	//Значение должно валидироваться по маске электронной почты: x@x.x


    //Закладка Сведения об образовании и дополнительных навыках

    //Поле Сведения об образовании

    //Поле Образование:


    private List<String> obr_type = AccessCounterList.createEmpty(String.class);	//

    //Поле Наименование учебного заведения:


    private List<String> institution = AccessCounterList.createEmpty(String.class);	//

    //Поле Дата окончания:


    private List<Date> issueDate = AccessCounterList.createEmpty(Date.class);	//Формат даты DD-MM-YYYY (число-месяц-год)

    //Поле Специальность (профессия, должность) по образованию:


    private List<String> speciality_diploma = AccessCounterList.createEmpty(String.class);	//Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)

    //Поле Отношения к занятости:


    private List<String> employment = AccessCounterList.createEmpty(String.class);	//

    //Поле Дополнительные навыки

    //Поле Знание иностранного языка:


    private String obr_language;	//Если стоит галочка, то становится доступным поле #obr_lang_name.
//Если галочки нет, то поле #obr_lang_name недоступно и его значение = “”

    //Поле Язык:


    private String obr_lang_name;	//Доступность поля управляется переменной #obr_language

    //Поле Знание и умение пользоваться ЭВМ:


    private String obr_pc;	//

    //Поле Наличие водительского удостоверения:


    private String obr_driver;	//Если стоит галочка, то становится доступным поле #obr_driver_cat.
//Если галочки нет, то поле #obr_driver_cat недоступно и его значение = “”

    //Поле Категория:


    private String obr_driver_cat;	//Доступность поля управляется переменной #obr_driver

    //Поле С четом личных профессиональных навыков?


    private String account_skills;	//Если поле «С учетом профессиональных навыков?» #account_skills равно значению «ДА» осуществить переход к ШАГУ 4
//Если поле «С учетом профессиональных навыков?» #account_skills  равно значению «НЕТ» осуществить переход к ШАГУ 3, затем к ШАГУ 4


    //Закладка Требования по подбору вакансий

    //Поле Параметры для поиска вакансий

    //Поле Район:


    private String addr_raion;	//Выбирается из справочника КЛАДР в соответствии с Регион/Область

    //Поле Профессия (должность):


    private String prof;	//Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)

    //Поле Квалификационный разряд, категория:


    private String work;	//

    //Поле Режим (график) работы:


    private String mode;	//

    //Поле Вид эконономической деятельности:


    private String type;	//

    //Поле Заработная плата (не ниже), руб.:


    private String money;	//

    //Поле Характер работы:


    private String character;	//


    //Закладка Дополнительная информация

    //Поле Основная профессия (должность):


    private String  basic_trade;	//Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)

    //Поле Стаж работы по основной профессии (лет):


    private String  experience;	//Сколько полных лет

    //Поле Заработная плата на последнем месте работы, руб.:


    private String  basic_money;	//


    //Закладка Сведения о заявителе

    //Поле Фамилия:

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getLast_name() {
        return this.last_name;
    }

    //Поле Имя:

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getFirst_name() {
        return this.first_name;
    }

    //Поле Отчество:

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }
    public String getMiddle_name() {
        return this.middle_name;
    }

    //Поле Дата рождения:

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
    public Date getBirth_date() {
        return this.birth_date;
    }

    //Поле Пол:

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return this.sex;
    }

    //Поле Гражданство:

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    public String getCitizenship() {
        return this.citizenship;
    }

    //Поле Документ, удостоверяющий личность

    //Поле Тип документа:

    public void setPassport_type(String passport_type) {
        this.passport_type = passport_type;
    }
    public String getPassport_type() {
        return this.passport_type;
    }

    //Поле Серия:

    public void setPassport_series(String passport_series) {
        this.passport_series = passport_series;
    }
    public String getPassport_series() {
        return this.passport_series;
    }

    //Поле Номер:

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }
    public String getPassport_number() {
        return this.passport_number;
    }

    //Поле Кем выдан:

    public void setPassport_given_out(String passport_given_out) {
        this.passport_given_out = passport_given_out;
    }
    public String getPassport_given_out() {
        return this.passport_given_out;
    }

    //Поле Дата выдачи:

    public void setPassport_delivery_date(Date passport_delivery_date) {
        this.passport_delivery_date = passport_delivery_date;
    }
    public Date getPassport_delivery_date() {
        return this.passport_delivery_date;
    }

    //Поле Место регистрации

    //Поле Почтовый индекс:

    public void setAddr_Index(String addr_Index) {
        this.addr_Index = addr_Index;
    }
    public String getAddr_Index() {
        return this.addr_Index;
    }

    //Поле Регион/Область:

    public void setAddr_city(String addr_city) {
        this.addr_city = addr_city;
    }
    public String getAddr_city() {
        return this.addr_city;
    }

    //Поле Город/Населенный пункт:

    public void setAddr_gorod(String addr_gorod) {
        this.addr_gorod = addr_gorod;
    }
    public String getAddr_gorod() {
        return this.addr_gorod;
    }

    //Поле Улица:

    public void setAddr_ul(String addr_ul) {
        this.addr_ul = addr_ul;
    }
    public String getAddr_ul() {
        return this.addr_ul;
    }

    //Поле Дом:

    public void setAddr_dom(String addr_dom) {
        this.addr_dom = addr_dom;
    }
    public String getAddr_dom() {
        return this.addr_dom;
    }

    //Поле Корпус (строение):

    public void setAddr_korp(String addr_korp) {
        this.addr_korp = addr_korp;
    }
    public String getAddr_korp() {
        return this.addr_korp;
    }

    //Поле Квартира:

    public void setAddr_kvart(String addr_kvart) {
        this.addr_kvart = addr_kvart;
    }
    public String getAddr_kvart() {
        return this.addr_kvart;
    }

    //Поле Контактный телефон:

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getTel() {
        return this.tel;
    }

    //Поле Адрес электронной почты:

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return this.mail;
    }


    //Закладка Сведения об образовании и дополнительных навыках

    //Поле Сведения об образовании

    //Поле Образование:

    public void setObr_type(List<String> obr_type) {
        this.obr_type = AccessCounterList.decorate(obr_type, String.class);
    }
    public List<String> getObr_type() {
        return this.obr_type;
    }

    //Поле Наименование учебного заведения:

    public void setInstitution(List<String> institution) {
        this.institution =  AccessCounterList.decorate(institution, String.class);
    }
    public List<String> getInstitution() {
        return this.institution;
    }

    //Поле Дата окончания:

    public void setIssueDate(List<Date> issueDate) {
        this.issueDate =  AccessCounterList.decorate(issueDate, Date.class);
    }
    public List<Date> getIssueDate() {
        return this.issueDate;
    }

    //Поле Специальность (профессия, должность) по образованию:

    public void setSpeciality_diploma(List<String> speciality_diploma) {
        this.speciality_diploma =  AccessCounterList.decorate(speciality_diploma, String.class);
    }
    public List<String> getSpeciality_diploma() {
        return this.speciality_diploma;
    }

    //Поле Отношения к занятости:

    public void setEmployment(List<String> employment) {
        this.employment =  AccessCounterList.decorate(employment, String.class);
    }
    public List<String> getEmployment() {
        return this.employment;
    }

    //Поле Дополнительные навыки

    //Поле Знание иностранного языка:

    public void setObr_language(String obr_language) {
        this.obr_language = obr_language;
    }
    public String getObr_language() {
        return this.obr_language;
    }

    //Поле Язык:

    public void setObr_lang_name(String obr_lang_name) {
        this.obr_lang_name = obr_lang_name;
    }
    public String getObr_lang_name() {
        return this.obr_lang_name;
    }

    //Поле Знание и умение пользоваться ЭВМ:

    public void setObr_pc(String obr_pc) {
        this.obr_pc = obr_pc;
    }
    public String getObr_pc() {
        return this.obr_pc;
    }

    //Поле Наличие водительского удостоверения:

    public void setObr_driver(String obr_driver) {
        this.obr_driver = obr_driver;
    }
    public String getObr_driver() {
        return this.obr_driver;
    }

    //Поле Категория:

    public void setObr_driver_cat(String obr_driver_cat) {
        this.obr_driver_cat = obr_driver_cat;
    }
    public String getObr_driver_cat() {
        return this.obr_driver_cat;
    }

    //Поле С четом личных профессиональных навыков?

    public void setAccount_skills(String account_skills) {
        this.account_skills = account_skills;
    }
    public String getAccount_skills() {
        return this.account_skills;
    }


    //Закладка Требования по подбору вакансий

    //Поле Параметры для поиска вакансий

    //Поле Район:

    public void setAddr_raion(String addr_raion) {
        this.addr_raion = addr_raion;
    }
    public String getAddr_raion() {
        return this.addr_raion;
    }

    //Поле Профессия (должность):

    public void setProf(String prof) {
        this.prof = prof;
    }
    public String getProf() {
        return this.prof;
    }

    //Поле Квалификационный разряд, категория:

    public void setWork(String work) {
        this.work = work;
    }
    public String getWork() {
        return this.work;
    }

    //Поле Режим (график) работы:

    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getMode() {
        return this.mode;
    }

    //Поле Вид эконономической деятельности:

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    //Поле Заработная плата (не ниже), руб.:

    public void setMoney(String money) {
        this.money = money;
    }
    public String getMoney() {
        return this.money;
    }

    //Поле Характер работы:

    public void setCharacter(String character) {
        this.character = character;
    }
    public String getCharacter() {
        return this.character;
    }


    //Закладка Дополнительная информация

    //Поле Основная профессия (должность):

    public void setBasic_trade(String  basic_trade) {
        this.basic_trade = basic_trade;
    }
    public String getBasic_trade() {
        return this.basic_trade;
    }

    //Поле Стаж работы по основной профессии (лет):

    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getExperience() {
        return this.experience;
    }

    //Поле Заработная плата на последнем месте работы, руб.:

    public void setBasic_money(String basic_money) {
        this.basic_money = basic_money;
    }
    public String getBasic_money() {
        return this.basic_money;
    }
}
