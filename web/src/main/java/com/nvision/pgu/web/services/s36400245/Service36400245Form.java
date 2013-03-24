package com.nvision.pgu.web.services.s36400245;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.util.FileBean;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400245Form extends AbstractServiceOrderForm {


	
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

            private String unprotected;
		
			//Поле Место регистрации
			
			//Поле Почтовый индекс:
			
			
			private String addr_Index;	//
		
			//Поле Регион/Область:
			
			
			private String addr_obl;	//Выбирается из справочника КЛАДР
		
			//Поле Район:
			
			
			private String addr_raion;	//Выбирается из справочника КЛАДР в соответствии с Регионом/Областью
		
			//Поле Город/Населенный пункт:
			
			
			private String addr_gorod;	//Выбирается из справочника КЛАДР в соответствии с Регионом/Областью
		
			//Поле Улица:
			
			
			private String addr_ul;	//Выбирается из справочника КЛАДР в соответствии с Городом/Населенным пунктом
		
			//Поле Дом:
			
			
			private String addr_dom;	//
		
			//Поле Корпус (строение):
			
			
			private String addr_korp;	//
		
			//Поле Квартира:
			
			
			private String addr_kvart;	//
		
			//Поле Контактные данные
			
			//Поле Контактный телефон:
			
			
			private String tel;	//
		
			//Поле Адрес электронной почты:
			
			
			private String mail;	//Значение должно валидироваться по маске электронной почты: x@x.x
		
	
	//Закладка Сведения об образовании и дополнительная информация
		
			//Поле Сведения об образовании
			
			//Поле Образование:
			
			
			private String obr_type;	//
		
			//Поле Наименование учебного заведения:
			
			
			private String institution;	//
		
			//Поле Дата окончания:
			
			
			private Date expiry_date;	//Не старше текущей
		
			//Поле Специальность (профессия, должность) по образованию:
			
			
			private String speciality_diploma;	//Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)
		
			//Поле Дополнительная информация
			
			//Поле Отношение к занятости:
			
			
			private String employment;	//
		
			//Поле Желаете получить информацию по имеющимся вакансиям?
			
			
			private String vacancy_view;	//Если стоит галочка, передавать «Да», иначе – «Нет».
		
			//Поле Район, по которому интересует информация
			
			
			private String addr_raion_info;	//Доступно для редактирования, если в атрибуте «Желаете получить информацию по имеющимся вакансиям?» стоит галочка, иначе не доступно.
//Выбирается из справочника КЛАДР в соответствии с Регионом/Областью
		
	

	
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
		
			//Поле Категория испытывающих трудности  в поиске работы:
			
			public void setUnprotected(String unprotected) {
					this.unprotected = unprotected;
				}
			public String getUnprotected() {
				return this.unprotected;
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
			
			public void setAddr_obl(String addr_obl) {
					this.addr_obl = addr_obl;
				}
			public String getAddr_obl() {
				return this.addr_obl;
				}
		
			//Поле Район:
			
			public void setAddr_raion(String addr_raion) {
					this.addr_raion = addr_raion;
				}
			public String getAddr_raion() {
				return this.addr_raion;
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
		
			//Поле Контактные данные
			
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
		
	
	//Закладка Сведения об образовании и дополнительная информация
		
			//Поле Сведения об образовании
			
			//Поле Образование:
			
			public void setObr_type(String obr_type) {
					this.obr_type = obr_type;
				}
			public String getObr_type() {
				return this.obr_type;
				}
		
			//Поле Наименование учебного заведения:
			
			public void setInstitution(String institution) {
					this.institution = institution;
				}
			public String getInstitution() {
				return this.institution;
				}
		
			//Поле Дата окончания:
			
			public void setExpiry_date(Date expiry_date) {
					this.expiry_date = expiry_date;
				}
			public Date getExpiry_date() {
				return this.expiry_date;
				}
		
			//Поле Специальность (профессия, должность) по образованию:
			
			public void setSpeciality_diploma(String speciality_diploma) {
					this.speciality_diploma = speciality_diploma;
				}
			public String getSpeciality_diploma() {
				return this.speciality_diploma;
				}
		
			//Поле Дополнительная информация
			
			//Поле Отношение к занятости:
			
			public void setEmployment(String employment) {
					this.employment = employment;
				}
			public String getEmployment() {
				return this.employment;
				}
		
			//Поле Желаете получить информацию по имеющимся вакансиям?
			
			public void setVacancy_view(String vacancy_view) {
					this.vacancy_view = vacancy_view;
				}
			public String getVacancy_view() {
				return this.vacancy_view;
				}
		
			//Поле Район, по которому интересует информация
			
			public void setAddr_raion_info(String addr_raion_info) {
					this.addr_raion_info = addr_raion_info;
				}
			public String getAddr_raion_info() {
				return this.addr_raion_info;
				}
		
	
		}
