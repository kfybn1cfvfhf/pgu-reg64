package com.nvision.pgu.web.services.s36400029;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;
import java.util.List;

public class Service36400029Form extends AbstractServiceOrderForm {


    //Закладка Сведения о заявителе

    //Поле Сведения о заявителе

    //Поле Фамилия

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;    //

    //Поле Имя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String firstName;    //

    //Поле Отчество

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;    //

    //Поле Дата рождения

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date birthdate;    //

    //Поле Гражданство


    private String citizenship;    //

    //Поле Пол
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
    private String sex;    //

    //Поле Адрес места жительства (пребывания)

    //Поле Индекс

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE)
    private String addrIndex;    //

    //Поле Область

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String addrObl;    //

    //Поле Район

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String addrRaion;    //

    //Поле Город/населенный пункт

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String addrGorod;    //

    //Поле Улица

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String addrUl;    //

    //Поле Дом

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String addrDom;    //

    //Поле Корпус

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
    private String addrKorp;    //

    //Поле Квартира

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
    private String addrKvart;    //

    //Поле Номер контактного телефона

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String tel;    //

    //Поле Электронная почта

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String mail;    //


    //Закладка Данные о заявителе

    //Поле Укажите, относитесь ли Вы к одной из следующих категорий, дающих право на получение дополнительных услуг со стороны службы занятости населения:
    @JsonArrayToList
    private String categories;

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    private String wantOther;

    public String getWantOther() {
        return wantOther;
    }

    public void setWantOther(String wantOther) {
        this.wantOther = wantOther;
    }

    private String czn;    //В качестве значения переменной передается поле dicitem_extcode из БД

    public void setCzn(String czn) {
        this.czn = czn;
    }

    public String getCzn() {
        return this.czn;
    }


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

}
