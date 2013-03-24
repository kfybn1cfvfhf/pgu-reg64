package com.nvision.pgu.web.services.s36400066;

import com.nvision.pgu.core.annotations.InitRule;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;

public class Service36400066Form extends AbstractServiceOrderForm {
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
       private String middleName;


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String firstName;

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String midlle;

    private String answerRg;

    private String corpCh;

    private String bossCh;

    private String corp;

    private String bossName;

    private String adressPost;

    private String adressRegCh;

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
    private String adressReg;

    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email;

    private String adressObjCh;

    private String adressObj;

    private FileBean loaddoc;


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public void setMidlle(String midlle) {
        this.midlle = midlle;
    }

    public String getMidlle() {
        return this.midlle;
    }


    public void setAnswerRg(String answerRg) {
        this.answerRg = answerRg;
    }

    public String getAnswerRg() {
        return this.answerRg;
    }


    public void setCorpCh(String corpCh) {
        this.corpCh = corpCh;
    }

    public String getCorpCh() {
        return this.corpCh == null ? "off" : this.corpCh;
    }


    public void setBossCh(String bossCh) {
        this.bossCh = bossCh;
    }

    public String getBossCh() {
        return this.bossCh;
    }


    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getCorp() {
        return this.corp;
    }


    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getBossName() {
        return this.bossName;
    }


    public void setAdressPost(String adressPost) {
        this.adressPost = adressPost;
    }

    public String getAdressPost() {
        return this.adressPost;
    }


    public void setAdressRegCh(String adressRegCh) {
        this.adressRegCh = adressRegCh;
    }

    public String getAdressRegCh() {
        return this.adressRegCh;
    }


    public void setAdressReg(String adressReg) {
        this.adressReg = adressReg;
    }

    public String getAdressReg() {
        return this.adressReg;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }


    public void setAdressObjCh(String adressObjCh) {
        this.adressObjCh = adressObjCh;
    }

    public String getAdressObjCh() {
        return this.adressObjCh;
    }


    public void setAdressObj(String adressObj) {
        this.adressObj = adressObj;
    }

    public String getAdressObj() {
        return this.adressObj;
    }


    public void setLoaddoc(FileBean loaddoc) {
        this.loaddoc = loaddoc;
    }

    public FileBean getLoaddoc() {
        return this.loaddoc;
    }


}
