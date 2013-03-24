package com.nvision.pgu.web.services.s36400017;

import com.nvision.pgu.core.annotations.InitRule;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.dao.CustomLookupRegistry;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400017Form extends AbstractServiceOrderForm {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
     private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;
     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;

    //Закладка Сведения о заявителе

    //Поле Личные данные и контакты заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio;    //Данные из СИА. Недоступно для редактирования

    //Поле Дата рождения:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date birsday;    //Данные из СИА. Недоступно для редактирования

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX)
    private String sex;    //Данные из СИА. Недоступно для редактирования

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
    private String address;    //Данные из СИА. Недоступно для редактирования

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String type1;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String series;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String number;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date issuedate;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String issueorg;

    private String document;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SNILS)
    private String snils;    //Данные из СИА. Недоступно для редактирования

    //Закладка Сведения о заявителе

    //Поле Личные данные и контакты заявителя

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return this.fio;
    }

    //Поле Дата рождения:

    public void setBirsday(Date birsday) {
        this.birsday = birsday;
    }

    public Date getBirsday() {
        return this.birsday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType1() {
        return this.type1;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return this.series;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Date getIssuedate() {
        return this.issuedate;
    }

    public void setIssueorg(String issueorg) {
        this.issueorg = issueorg;
    }

    public String getIssueorg() {
        return this.issueorg;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    CustomLookupRegistry customLookupRegistry;
    public void setCustomLookupRegistry(CustomLookupRegistry customLookupRegistry) {
        this.customLookupRegistry = customLookupRegistry;
    }

    public String getDocument() {

        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        String stringDate = formatDate.format(getIssuedate());

        String type1name = new String();
        try {
            Map opts = new HashMap<String, String>();
            opts.put("authToken",getPguAssertion().getPrincipal().getAuthToken());
            type1name = customLookupRegistry.getController("MainDocTypeController").getValueByCode(getType1(), opts);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return type1name + ", " + getSeries() + ", " + getNumber() + ", " + stringDate + ", " + getIssueorg();
    }

    //Поле СНИЛС:

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getSnils() {
        return this.snils;
    }
}
