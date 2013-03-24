package com.nvision.pgu.web.services.s36400025;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400025Form extends AbstractServiceOrderForm {


	
	//Закладка Сведения о заявителе
		
			//Поле Сведения о заявителе
			
			//Поле Фамилия
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
			private String lastName;	//
		
			//Поле Имя
			
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
			private String firstName;	//
		
			//Поле Отчество
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
			private String middleName;	//
		
			//Поле Дата рождения
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
			private Date birthdate;	//
		
			//Поле Гражданство
			

			private String citizenship;	//
		
			//Поле Пол
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
			private String sex;	//
		
			//Поле Адрес места жительства (пребывания)
			
			//Поле Индекс
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE)
			private String addrIndex;	//
		
			//Поле Область
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
			private String addrObl;	//
		
			//Поле Район
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
			private String addrRaion;	//
		
			//Поле Город/населенный пункт
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
			private String addrGorod;	//
		
			//Поле Улица
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
			private String addrUl;	//
		
			//Поле Дом
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
			private String addrDom;	//
		
			//Поле Корпус
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
			private String addrKorp;	//
		
			//Поле Квартира
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
			private String addrKvart;	//
		
			//Поле Номер контактного телефона
			
			@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
			private String tel;	//
		
			//Поле Электронная почта
			

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
			private String mail;	//
		
	
	//Закладка Данные о заявителе
		
			//Поле Образование
			private String WantQualification;
			
			private String ObrType;	//
		
			//Поле Учебное заведение
			
			
			private String ObrOrg;	//
		
			//Поле Год окончания
			
			
			private String ObrYear;	//дата, от -100 до +10 лет
		
			//Поле Профессия (специальность), квалификация (по образованию)
			
			
			private String ObrProfByObr;	//
		
			//Поле Основная профессия (специальность), квалификация, должность
			
			
			private String ObrProfMain;	//
		
			//Поле Стаж осн.
			
			
			private String ObrProfMainExp;	//
		
			//Поле Дополнительная профессия (специальность), квалификация, должность
			
			
			private String ObrProfExtra;	//
		
			//Поле Стаж доп.
			
			
			private String ObrProfExtraExp;	//
		
			//Поле Дополнительные навыки
			
			//Поле Знание иностранного языка
			
			
			private String ObrLanguage;	//Если стоит галочка, то становится доступным поле #ObrLangName.
//Если галочки нет, то поле #ObrLangName недоступно и его значение = “”
		
			//Поле Язык
			
			
			private String ObrLangName;	//Доступность поля управляется переменной #ObrLanguage
		
			//Поле Знание и умение пользоваться ЭВМ
			
			
			private String ObrPC;	//
		
			//Поле Наличие водительского удостоверения
			
			
			private String ObrDriver;	//Если стоит галочка, то становится доступным поле # ObrDriverCat.
//Если галочки нет, то поле # ObrDriverCat недоступно и его значение = “”
		
			//Поле Категории
			
			
			private String ObrDriverCat;	//Доступность поля управляется переменной #ObrDriver
		
	
	//Закладка Данные о заявителе
		
			//Поле Профессия (специальность), квалификация
			
			
			private String WorkProf;	//
		
			//Поле Период работы с
			
			
			private Date WorkStart;	//дата, от -100 до +10 лет
		
			//Поле по
			
			
			private Date WorkEnd;	//дата, от -100 до +10 лет
		
			//Поле Характер работы
			
			
			private String WorkType;	//
		
			//Поле Заработная плата, руб.
			
			
			private String WorkMoney;	//
		
	
	//Закладка Данные о заявителе
		
			//Поле Профессия (специальность), квалификация
			
			
			private String WantProf;	//
		
			//Поле Должность
			
			
			private String WantPost;	//
		
			//Поле Вид деятельности
			
			
			private String WantWork;	//
		
			//Поле Характер работы
			
			
			private String WantType;	//В качестве значения переменной передается поле dicitem_extcode из БД
		
			//Поле Заработная плата, руб.
			
			
			private String WantMoney;	//
		
			//Поле Дополнительные пожелания
			
			
			private String WantOther;	//
		
	
	//Закладка Данные о заявителе
		
			//Поле Прошу рассмотреть возможность собеседования с работодателями по вакансиям, размещенным на сайте www.trudvsem.ru из списка: (указать номер выбранной вакансии и профессию)
			
			//Поле № Вакансии
			
			
			private String ExtarN1;	//
		
			//Поле профессия
			
			
			private String ExtraPost1;	//
		
			//Поле № Вакансии
			
			
			private String ExtarN2;	//
		
			//Поле профессия
			
			
			private String ExtraPost2;	//
		
			//Поле № Вакансии
			
			
			private String ExtarN3;	//
		
			//Поле профессия
			
			
			private String ExtraPost3;	//
		
			//Поле Выбор места получения услуги
			
			
			private String czn;	//В качестве значения переменной передается поле dicitem_extcode из БД
		
			//Поле Прошу предоставить информацию о проведении ярмарок вакансий
			
			
			private String Q1;	//
		
	

	
	//Закладка Сведения о заявителе
		
			//Поле Сведения о заявителе
			
			//Поле Фамилия
			
			public void setLastName(String lastName) {
					this.lastName = lastName;
				}
			public String getLastName() {
				return this.lastName;
				}
		
			//Поле Имя
			
			public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			public String getFirstName() {
				return this.firstName;
				}
		
			//Поле Отчество
			
			public void setMiddleName(String middleName) {
					this.middleName = middleName;
				}
			public String getMiddleName() {
				return this.middleName;
				}
		
			//Поле Дата рождения
			
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
				}
		
			//Поле Гражданство
			
			public void setCitizenship(String citizenship) {
					this.citizenship = citizenship;
				}
			public String getCitizenship() {
				return this.citizenship;
				}
		
			//Поле Пол
			
			public void setSex(String sex) {
					this.sex = sex;
				}
			public String getSex() {
				return this.sex;
				}
		
			//Поле Адрес места жительства (пребывания)
			
			//Поле Индекс
			
			public void setAddrIndex(String addrIndex) {
					this.addrIndex = addrIndex;
				}
			public String getAddrIndex() {
				return this.addrIndex;
				}
		
			//Поле Область
			
			public void setAddrObl(String addrObl) {
					this.addrObl = addrObl;
				}
			public String getAddrObl() {
				return this.addrObl;
				}
		
			//Поле Район
			
			public void setAddrRaion(String addrRaion) {
					this.addrRaion = addrRaion;
				}
			public String getAddrRaion() {
				return this.addrRaion;
				}
		
			//Поле Город/населенный пункт
			
			public void setAddrGorod(String addrGorod) {
					this.addrGorod = addrGorod;
				}
			public String getAddrGorod() {
				return this.addrGorod;
				}
		
			//Поле Улица
			
			public void setAddrUl(String addrUl) {
					this.addrUl = addrUl;
				}
			public String getAddrUl() {
				return this.addrUl;
				}
		
			//Поле Дом
			
			public void setAddrDom(String addrDom) {
					this.addrDom = addrDom;
				}
			public String getAddrDom() {
				return this.addrDom;
				}
		
			//Поле Корпус
			
			public void setAddrKorp(String addrKorp) {
					this.addrKorp = addrKorp;
				}
			public String getAddrKorp() {
				return this.addrKorp;
				}
		
			//Поле Квартира
			
			public void setAddrKvart(String addrKvart) {
					this.addrKvart = addrKvart;
				}
			public String getAddrKvart() {
				return this.addrKvart;
				}
		
			//Поле Номер контактного телефона
			
			public void setTel(String tel) {
					this.tel = tel;
				}
			public String getTel() {
				return this.tel;
				}
		
			//Поле Электронная почта
			
			public void setMail(String mail) {
					this.mail = mail;
				}
			public String getMail() {
				return this.mail;
				}
		
	
	//Закладка Данные о заявителе
		
			//Поле Образование
			
			public void setObrType(String obrType) {
					this.ObrType = obrType;
				}
			public String getObrType() {
				return this.ObrType;
				}
		
			//Поле Учебное заведение
			
			public void setObrOrg(String obrOrg) {
					this.ObrOrg = obrOrg;
				}
			public String getObrOrg() {
				return this.ObrOrg;
				}
		
			//Поле Год окончания
			
			public void setObrYear(String obrYear) {
                this.ObrYear = obrYear;
            }
			public String getObrYear() {
				return this.ObrYear;
            }
		
			//Поле Профессия (специальность), квалификация (по образованию)
			
			public void setObrProfByObr(String obrProfByObr) {
					this.ObrProfByObr = obrProfByObr;
				}
			public String getObrProfByObr() {
				return this.ObrProfByObr;
				}
		
			//Поле Основная профессия (специальность), квалификация, должность
			
			public void setObrProfMain(String obrProfMain) {
					this.ObrProfMain = obrProfMain;
				}
			public String getObrProfMain() {
				return this.ObrProfMain;
				}
		
			//Поле Стаж осн.
			
			public void setObrProfMainExp(String obrProfMainExp) {
					this.ObrProfMainExp = obrProfMainExp;
				}
			public String getObrProfMainExp() {
				return this.ObrProfMainExp;
				}
		
			//Поле Дополнительная профессия (специальность), квалификация, должность
			
			public void setObrProfExtra(String obrProfExtra) {
					this.ObrProfExtra = obrProfExtra;
				}
			public String getObrProfExtra() {
				return this.ObrProfExtra;
				}
		
			//Поле Стаж доп.
			
			public void setObrProfExtraExp(String obrProfExtraExp) {
					this.ObrProfExtraExp = obrProfExtraExp;
				}
			public String getObrProfExtraExp() {
				return this.ObrProfExtraExp;
				}
		
			//Поле Дополнительные навыки
			
			//Поле Знание иностранного языка
			
			public void setObrLanguage(String obrLanguage) {
					this.ObrLanguage = obrLanguage;
				}
			public String getObrLanguage() {
				return this.ObrLanguage;
				}
		
			//Поле Язык
			
			public void setObrLangName(String obrLangName) {
					this.ObrLangName = obrLangName;
				}
			public String getObrLangName() {
				return this.ObrLangName;
				}
		
			//Поле Знание и умение пользоваться ЭВМ
			
			public void setObrPC(String obrPC) {
					this.ObrPC = obrPC;
				}
			public String getObrPC() {
				return this.ObrPC;
				}
		
			//Поле Наличие водительского удостоверения
			
			public void setObrDriver(String obrDriver) {
					this.ObrDriver = obrDriver;
				}
			public String getObrDriver() {
				return this.ObrDriver;
				}
		
			//Поле Категории
			
			public void setObrDriverCat(String obrDriverCat) {
					this.ObrDriverCat = obrDriverCat;
				}
			public String getObrDriverCat() {
				return this.ObrDriverCat;
				}
		
	
	//Закладка Данные о заявителе
		
			//Поле Профессия (специальность), квалификация
			
			public void setWorkProf(String workProf) {
					this.WorkProf = workProf;
				}
			public String getWorkProf() {
				return this.WorkProf;
				}
		
			//Поле Период работы с
			
			public void setWorkStart(Date workStart) {
					this.WorkStart = workStart;
				}
			public Date getWorkStart() {
				return this.WorkStart;
				}
		
			//Поле по
			
			public void setWorkEnd(Date workEnd) {
					this.WorkEnd = workEnd;
				}
			public Date getWorkEnd() {
				return this.WorkEnd;
				}
		
			//Поле Характер работы
			
			public void setWorkType(String workType) {
					this.WorkType = workType;
				}
			public String getWorkType() {
				return this.WorkType;
				}
		
			//Поле Заработная плата, руб.
			
			public void setWorkMoney(String workMoney) {
					this.WorkMoney = workMoney;
				}
			public String getWorkMoney() {
				return this.WorkMoney;
				}
		
	
	//Закладка Данные о заявителе
		
			//Поле Профессия (специальность), квалификация
			
			public void setWantProf(String wantProf) {
					this.WantProf = wantProf;
				}
			public String getWantProf() {
				return this.WantProf;
				}
		
			//Поле Должность
			
			public void setWantPost(String wantPost) {
					this.WantPost = wantPost;
				}
			public String getWantPost() {
				return this.WantPost;
				}
		
			//Поле Вид деятельности
			
			public void setWantWork(String wantWork) {
					this.WantWork = wantWork;
				}
			public String getWantWork() {
				return this.WantWork;
				}
		
			//Поле Характер работы
			
			public void setWantType(String wantType) {
					this.WantType = wantType;
				}
			public String getWantType() {
				return this.WantType;
				}
		
			//Поле Заработная плата, руб.
			
			public void setWantMoney(String wantMoney) {
					this.WantMoney = wantMoney;
				}
			public String getWantMoney() {
				return this.WantMoney;
				}
		
			//Поле Дополнительные пожелания
			
			public void setWantOther(String wantOther) {
					this.WantOther = wantOther;
				}
			public String getWantOther() {
				return this.WantOther;
				}
		
	
	//Закладка Данные о заявителе
		
			//Поле Прошу рассмотреть возможность собеседования с работодателями по вакансиям, размещенным на сайте www.trudvsem.ru из списка: (указать номер выбранной вакансии и профессию)
			
			//Поле № Вакансии
			
			public void setExtarN1(String extarN1) {
					this.ExtarN1 = extarN1;
				}
			public String getExtarN1() {
				return this.ExtarN1;
				}
		
			//Поле профессия
			
			public void setExtraPost1(String extraPost1) {
					this.ExtraPost1 = extraPost1;
				}
			public String getExtraPost1() {
				return this.ExtraPost1;
				}
		
			//Поле № Вакансии
			
			public void setExtarN2(String extarN2) {
					this.ExtarN2 = extarN2;
				}
			public String getExtarN2() {
				return this.ExtarN2;
				}
		
			//Поле профессия
			
			public void setExtraPost2(String extraPost2) {
					this.ExtraPost2 = extraPost2;
				}
			public String getExtraPost2() {
				return this.ExtraPost2;
				}
		
			//Поле № Вакансии
			
			public void setExtarN3(String extarN3) {
					this.ExtarN3 = extarN3;
				}
			public String getExtarN3() {
				return this.ExtarN3;
				}
		
			//Поле профессия
			
			public void setExtraPost3(String extraPost3) {
					this.ExtraPost3 = extraPost3;
				}
			public String getExtraPost3() {
				return this.ExtraPost3;
				}
		
			//Поле Выбор места получения услуги
			
			public void setCzn(String czn) {
					this.czn = czn;
				}
			public String getCzn() {
				return this.czn;
				}
		
			//Поле Прошу предоставить информацию о проведении ярмарок вакансий
			
			public void setQ1(String q1) {
					this.Q1 = q1;
				}
			public String getQ1() {
				return this.Q1;
				}


            public String getWantQualification() {
                return WantQualification;
            }

            public void setWantQualification(String wantQualification) {
                WantQualification = wantQualification;
            }
}
