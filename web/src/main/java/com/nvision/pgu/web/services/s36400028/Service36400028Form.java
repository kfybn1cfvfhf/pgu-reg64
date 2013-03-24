package com.nvision.pgu.web.services.s36400028;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400028Form extends AbstractServiceOrderForm {


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

    //Поле Образование


    private String obrType;    //

    private String obrOrg;    //

    private String obrYear;    //

    //Поле Профессия (специальность)


    private String obrProfByObr;    //

    //Поле Профессия (специальность)


    private String obrProfMain;    //

    //Поле Стаж осн.


    private String obrProfMainExp;    //

    //Поле Дополнительная профессия (специальность)


    private String obrProfExtra;    //

    //Поле Стаж доп.


    private String obrProfExtraExp;    //

    //Поле Дополнительные навыки

    //Поле Знание иностранного языка


    private String obrLanguage;    //Если стоит галочка, то становится доступным поле #obrLangName.
//Если галочки нет, то поле #obrLangName недоступно и его значение = “”

    //Поле Язык


    private String obrLangName;    //Доступность поля управляется переменной #obrLanguage

    //Поле Знание и умение пользоваться ЭВМ


    private String obrPC;    //

    //Поле Наличие водительского удостоверения


    private String obrDriver;    //Если стоит галочка, то становится доступным поле # obrDriverCat.
//Если галочки нет, то поле # obrDriverCat недоступно и его значение = “”

    //Поле Категории


    private String obrDriverCat;    //Доступность поля управляется переменной #obrDriver


    //Закладка Данные о заявителе

    //Поле Укажите условия последнего места работы

    //Поле Профессия (специальность), квалификация


    private String workProf;    //

    //Поле Период работы с


    private Date workStart;    //дата, от -100 до +10 лет

    //Поле по


    private Date workEnd;    //дата, от -100 до +10 лет

    //Поле Характер работы


    private String workType;    //


    //Закладка Данные о заявителе

    //Поле Укажите пожелания к общественной работе

    //Поле Профессия (специальность), квалификация


    private String wantProf;


    // Поле Должность

    private String wantPosition;

    //Поле Вид деятельности


    private String wantWork;    //

    //Поле Дополнительные пожелания


    private String wantOther;    //

    //Поле Выбор места получения услуги


    private String czn;    //В качестве значения переменной передается поле dicitem_extcode из БД


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
        this.obrType = obrType;
    }

    public String getObrType() {
        return this.obrType;
    }

    public String getObrProfByObr() {
        return obrProfByObr;
    }

    public void setObrProfByObr(String obrProfByObr) {
        this.obrProfByObr = obrProfByObr;
    }

//Поле Профессия (специальность)

    public void setObrProfMain(String obrProfMain) {
        this.obrProfMain = obrProfMain;
    }

    public String getObrProfMain() {
        return this.obrProfMain;
    }

    //Поле Стаж осн.

    public void setObrProfMainExp(String obrProfMainExp) {
        this.obrProfMainExp = obrProfMainExp;
    }

    public String getObrProfMainExp() {
        return this.obrProfMainExp;
    }

    //Поле Дополнительная профессия (специальность)

    public void setObrProfExtra(String obrProfExtra) {
        this.obrProfExtra = obrProfExtra;
    }

    public String getObrProfExtra() {
        return this.obrProfExtra;
    }

    //Поле Стаж доп.

    public void setObrProfExtraExp(String obrProfExtraExp) {
        this.obrProfExtraExp = obrProfExtraExp;
    }

    public String getObrProfExtraExp() {
        return this.obrProfExtraExp;
    }

    //Поле Дополнительные навыки

    //Поле Знание иностранного языка

    public void setObrLanguage(String obrLanguage) {
        this.obrLanguage = obrLanguage;
    }

    public String getObrLanguage() {
        return this.obrLanguage;
    }

    //Поле Язык

    public void setObrLangName(String obrLangName) {
        this.obrLangName = obrLangName;
    }

    public String getObrLangName() {
        return this.obrLangName;
    }

    //Поле Знание и умение пользоваться ЭВМ

    public void setObrPC(String obrPC) {
        this.obrPC = obrPC;
    }

    public String getObrPC() {
        return this.obrPC;
    }

    //Поле Наличие водительского удостоверения

    public void setObrDriver(String obrDriver) {
        this.obrDriver = obrDriver;
    }

    public String getObrDriver() {
        return this.obrDriver;
    }

    //Поле Категории

    public void setObrDriverCat(String obrDriverCat) {
        this.obrDriverCat = obrDriverCat;
    }

    public String getObrDriverCat() {
        return this.obrDriverCat;
    }


    //Закладка Данные о заявителе

    //Поле Укажите условия последнего места работы

    //Поле Профессия (специальность), квалификация

    public void setWorkProf(String workProf) {
        this.workProf = workProf;
    }

    public String getWorkProf() {
        return this.workProf;
    }

    //Поле Период работы с

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public Date getWorkStart() {
        return this.workStart;
    }

    //Поле по

    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }

    public Date getWorkEnd() {
        return this.workEnd;
    }

    //Поле Характер работы

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkType() {
        return this.workType;
    }


    //Закладка Данные о заявителе

    //Поле Укажите пожелания к общественной работе

    //Поле Профессия (специальность), квалификация

    public void setWantProf(String wantProf) {
        this.wantProf = wantProf;
    }

    public String getWantProf() {
        return this.wantProf;
    }

    // Поле Должность

    public String getWantPosition() {
        return wantPosition;
    }

    public void setWantPosition(String wantPosition) {
        this.wantPosition = wantPosition;
    }

    //Поле Вид деятельности

    public void setWantWork(String wantWork) {
        this.wantWork = wantWork;
    }

    public String getWantWork() {
        return this.wantWork;
    }

    //Поле Дополнительные пожелания

    public void setWantOther(String wantOther) {
        this.wantOther = wantOther;
    }

    public String getWantOther() {
        return this.wantOther;
    }

    //Поле Выбор места получения услуги

    public void setCzn(String czn) {
        this.czn = czn;
    }

    public String getCzn() {
        return this.czn;
    }

    public String getObrOrg() {
        return obrOrg;
    }

    public void setObrOrg(String obrOrg) {
        this.obrOrg = obrOrg;
    }

    public String getObrYear() {
        return obrYear;
    }

    public void setObrYear(String obrYear) {
        this.obrYear = obrYear;
    }
}
