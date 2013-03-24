package com.nvision.pgu.web.services.s36400027;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36700027Form extends AbstractServiceOrderForm {


    //Закладка Данные о заявителе

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

    //Поле СНИЛС

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SNILS)
    private String snils;    //

    //Поле Сведения о запрашиваемой услуге

    //Поле Укажите период выплат c


    private Date date_start;    //

    //Поле по


    private Date date_end;    //

    //Поле Выбор места получения услуги:


    private String czn;    //

    //Поле Выписку из приказов, являющихся основанием для начисления социальных выплат


    private String q1;    //

    //Поле Результат предоставления государственной услуги прошу направить:

    //Поле На электронную почту


    private String q2;    //

    //Поле Email


    private String email;    //

    //Поле На почтовый адрес:


    private String q3;    //

    //Поле Индекс
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE)
    private String prAddrIndex;
    private String addrIndex;    //

    //Поле Область
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME)
    private String prAddrObl;
    private String addrObl;    //

    //Поле Район
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME)
    private String prAddrRaion;
    private String addrRaion;    //

    //Поле Город/населенный пункт
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME)
    private String prAddrGorod;
    private String addrGorod;    //

    //Поле Улица
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME)
    private String prAddrUl;
    private String addrUl;    //

    //Поле Дом
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME)
    private String prAddrDom;
    private String addrDom;    //

    //Поле Корпус
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME)
    private String prAddrKorp;
    private String addrKorp;    //

    //Поле Квартира
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME)
    private String prAddrKvart;
    private String addrKvart;    //


    //Закладка Данные о заявителе

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

    //Поле СНИЛС

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getSnils() {
        return this.snils;
    }

    //Поле Сведения о запрашиваемой услуге

    //Поле Укажите период выплат c

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_start() {
        return this.date_start;
    }

    //Поле по

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Date getDate_end() {
        return this.date_end;
    }

    //Поле Выбор места получения услуги:

    public void setCzn(String czn) {
        this.czn = czn;
    }

    public String getCzn() {
        return this.czn;
    }

    //Поле Выписку из приказов, являющихся основанием для начисления социальных выплат

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ1() {
        return this.q1;
    }

    //Поле Результат предоставления государственной услуги прошу направить:

    //Поле На электронную почту

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ2() {
        return this.q2;
    }

    //Поле Email

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    //Поле На почтовый адрес:

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ3() {
        return this.q3;
    }

    //Поле Индекс
    public String getPrAddrIndex() {
        return prAddrIndex;
    }

    public void setPrAddrIndex(String prAddrIndex) {
        this.prAddrIndex = prAddrIndex;
    }

    public void setAddrIndex(String addrIndex) {
        this.addrIndex = addrIndex;
    }

    public String getAddrIndex() {
        return this.addrIndex;
    }

    //Поле Область
    public String getPrAddrObl() {
        return prAddrObl;
    }

    public void setPrAddrObl(String prAddrObl) {
        this.prAddrObl = prAddrObl;
    }

    public void setAddrObl(String addrObl) {
        this.addrObl = addrObl;
    }

    public String getAddrObl() {
        return this.addrObl;
    }

    //Поле Район
    public String getPrAddrRaion() {
        return prAddrRaion;
    }

    public void setPrAddrRaion(String prAddrRaion) {
        this.prAddrRaion = prAddrRaion;
    }

    public void setAddrRaion(String addrRaion) {
        this.addrRaion = addrRaion;
    }

    public String getAddrRaion() {
        return this.addrRaion;
    }

    //Поле Город/населенный пункт
    public String getPrAddrGorod() {
        return prAddrGorod;
    }

    public void setPrAddrGorod(String prAddrGorod) {
        this.prAddrGorod = prAddrGorod;
    }

    public void setAddrGorod(String addrGorod) {
        this.addrGorod = addrGorod;
    }

    public String getAddrGorod() {
        return this.addrGorod;
    }

    //Поле Улица
    public String getPrAddrUl() {
        return prAddrUl;
    }

    public void setPrAddrUl(String prAddrUl) {
        this.prAddrUl = prAddrUl;
    }

    public void setAddrUl(String addrUl) {
        this.addrUl = addrUl;
    }

    public String getAddrUl() {
        return this.addrUl;
    }

    //Поле Дом
    public String getPrAddrDom() {
        return prAddrDom;
    }

    public void setPrAddrDom(String prAddrDom) {
        this.prAddrDom = prAddrDom;
    }

    public void setAddrDom(String addrDom) {
        this.addrDom = addrDom;
    }

    public String getAddrDom() {
        return this.addrDom;
    }

    //Поле Корпус
    public String getPrAddrKorp() {
        return prAddrKorp;
    }

    public void setPrAddrKorp(String prAddrKorp) {
        this.prAddrKorp = prAddrKorp;
    }

    public void setAddrKorp(String addrKorp) {
        this.addrKorp = addrKorp;
    }

    public String getAddrKorp() {
        return this.addrKorp;
    }

    //Поле Квартира
    public String getPrAddrKvart() {
        return prAddrKvart;
    }

    public void setPrAddrKvart(String prAddrKvart) {
        this.prAddrKvart = prAddrKvart;
    }

    public void setAddrKvart(String addrKvart) {
        this.addrKvart = addrKvart;
    }

    public String getAddrKvart() {
        return this.addrKvart;
    }


}
