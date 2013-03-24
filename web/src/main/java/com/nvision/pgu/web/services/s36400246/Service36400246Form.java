package com.nvision.pgu.web.services.s36400246;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400246Form extends AbstractServiceOrderForm {
    // Закладка Сведения о заявителе

    // Поле Фамилия:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String last_name; // Недоступно для редактирования. Данные из СИА.

    // Поле Имя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String first_name; // Недоступно для редактирования. Данные из СИА.

    // Поле Отчество:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middle_name; // Недоступно для редактирования. Данные из СИА.

    // Поле Дата рождения:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date birth_date; // Недоступно для редактирования. Данные из СИА.

    // Поле Пол:

    private String sex; // Недоступно для редактирования. Данные из СИА.

    // Поле Гражданство:


    private String citizenship; //

    // Поле Документ, удостоверяющий личность

    // Поле Тип документа:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String passport_type; // Недоступно для редактирования. Данные из СИА.

    // Поле Серия:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String passport_series; // Недоступно для редактирования. Данные из СИА.

    // Поле Номер:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String passport_number; // Недоступно для редактирования. Данные из СИА.

    // Поле Кем выдан:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String passport_given_out; // Недоступно для редактирования. Данные из СИА.

    // Поле Дата выдачи:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date passport_delivery_date; // Недоступно для редактирования. Данные из СИА.

    // Поле Место регистрации

    // Поле Почтовый индекс:


    private String addr_Index; //

    // Поле Регион/Область:


    private String addr_common; // Выбирается из справочника КЛАДР

    // Поле Улица:


    private String addr_ul; // Выбирается из справочника КЛАДР в соответствии с Городом/Населенным пунктом

    // Поле Дом:


    private String addr_dom; //

    // Поле Корпус (строение):


    private String addr_korp; //

    // Поле Квартира:


    private String addr_kvart; //

    // Поле Контактные данные

    // Поле Контактный телефон:


    private String tel; //

    // Поле Адрес электронной почты:


    private String mail; // Значение должно валидироваться по маске электронной почты: x@x.x

    public String getAddr_dom() {
        return addr_dom;
    }

    public void setAddr_dom(String addr_dom) {
        this.addr_dom = addr_dom;
    }

    public String getAddr_Index() {
        return addr_Index;
    }

    public void setAddr_Index(String addr_Index) {
        this.addr_Index = addr_Index;
    }

    public String getAddr_korp() {
        return addr_korp;
    }

    public void setAddr_korp(String addr_korp) {
        this.addr_korp = addr_korp;
    }

    public String getAddr_kvart() {
        return addr_kvart;
    }

    public void setAddr_kvart(String addr_kvart) {
        this.addr_kvart = addr_kvart;
    }

    public String getAddr_ul() {
        return addr_ul;
    }

    public void setAddr_ul(String addr_ul) {
        this.addr_ul = addr_ul;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public Date getPassport_delivery_date() {
        return passport_delivery_date;
    }

    public void setPassport_delivery_date(Date passport_delivery_date) {
        this.passport_delivery_date = passport_delivery_date;
    }

    public String getPassport_given_out() {
        return passport_given_out;
    }

    public void setPassport_given_out(String passport_given_out) {
        this.passport_given_out = passport_given_out;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getPassport_series() {
        return passport_series;
    }

    public void setPassport_series(String passport_series) {
        this.passport_series = passport_series;
    }

    public String getPassport_type() {
        return passport_type;
    }

    public void setPassport_type(String passport_type) {
        this.passport_type = passport_type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr_common() {
        return addr_common;
    }

    public void setAddr_common(String addr_common) {
        this.addr_common = addr_common;
    }
}
