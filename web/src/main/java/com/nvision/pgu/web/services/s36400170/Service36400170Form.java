package com.nvision.pgu.web.services.s36400170;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400170Form extends AbstractServiceOrderForm {

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String sex;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private Date birthdate;
    private String age;
    private String sitizenship;	//KIND_OF_CITIZENSHIP
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    private String identityDocType;
    private String otherDocTypeName;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private String eduType;	//64_EDUCATION_170
    private String eduOrg;
    private String eduYear;
    private String eduProf;
    private String profName;
    private String profQual;
    private String profPost;
    private String profAge;
    private String dopProfName;
    private String dopProfQual;
    private String dopProfPost;
    private String dopProfAge;
    private String skillLanguage;
    private String skillLangName;
    private String skillPC;
    private String skillDriver;
    private String skillDriverCat;
    private String testAgreeCh1;
    private String testAgreeCh2;
    private String testAgreeCh3;
    private String testAgreeCh4;
    private String testAgreeCh5;
    private String testAgreeCh6;
    private String applCat1;
    private String applCat2;
    private String applCat3;
    private List<FileBean> applCatDoc1Load = AccessCounterList.createEmpty(FileBean.class);
    private FileBean applCatDoc2Load;
    private FileBean applCatDoc3Load;
    private String prichObr;
    // factAddress
    private String factAddressIndex;
    private String factAddressEnterType;
    private String factAddressRegion;
    private String factAddressRayon;
    private String factAddressCity;
    private String factAddressSettlementText;
    private String factAddressSettlementDict;
    private String factAddressStreetText;
    private String factAddressStreetDict;
    private String factAddressHouse;
    private String factAddressKorpus;
    private String factAddressFlat;
    private String factAddressCountry = "643";
    private String factAddressCountryCode = "ru";
    private String factAddressCountryInput;
    private String factAddressSettlementType = "1";
    private String factAddressCountrySettlement;

    public String getPrichObr() {
        return prichObr;
    }

    public void setPrichObr(String prichObr) {
        this.prichObr = prichObr;
    }

    public String getFactAddressIndex() {
        return factAddressIndex;
    }

    public void setFactAddressIndex(String factAddressIndex) {
        this.factAddressIndex = factAddressIndex;
    }

    public String getFactAddressEnterType() {
        return factAddressEnterType;
    }

    public void setFactAddressEnterType(String factAddressEnterType) {
        this.factAddressEnterType = factAddressEnterType;
    }

    public String getFactAddressRegion() {
        return factAddressRegion;
    }

    public void setFactAddressRegion(String factAddressRegion) {
        this.factAddressRegion = factAddressRegion;
    }

    public String getFactAddressRayon() {
        return factAddressRayon;
    }

    public void setFactAddressRayon(String factAddressRayon) {
        this.factAddressRayon = factAddressRayon;
    }

    public String getFactAddressCity() {
        return factAddressCity;
    }

    public void setFactAddressCity(String factAddressCity) {
        this.factAddressCity = factAddressCity;
    }

    public String getFactAddressSettlementText() {
        return factAddressSettlementText;
    }

    public void setFactAddressSettlementText(String factAddressSettlementText) {
        this.factAddressSettlementText = factAddressSettlementText;
    }

    public String getFactAddressSettlementDict() {
        return factAddressSettlementDict;
    }

    public void setFactAddressSettlementDict(String factAddressSettlementDict) {
        this.factAddressSettlementDict = factAddressSettlementDict;
    }

    public String getFactAddressStreetText() {
        return factAddressStreetText;
    }

    public void setFactAddressStreetText(String factAddressStreetText) {
        this.factAddressStreetText = factAddressStreetText;
    }

    public String getFactAddressStreetDict() {
        return factAddressStreetDict;
    }

    public void setFactAddressStreetDict(String factAddressStreetDict) {
        this.factAddressStreetDict = factAddressStreetDict;
    }

    public String getFactAddressHouse() {
        return factAddressHouse;
    }

    public void setFactAddressHouse(String factAddressHouse) {
        this.factAddressHouse = factAddressHouse;
    }

    public String getFactAddressKorpus() {
        return factAddressKorpus;
    }

    public void setFactAddressKorpus(String factAddressKorpus) {
        this.factAddressKorpus = factAddressKorpus;
    }

    public String getFactAddressFlat() {
        return factAddressFlat;
    }

    public void setFactAddressFlat(String factAddressFlat) {
        this.factAddressFlat = factAddressFlat;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
    }

    public String getFactAddressCountryCode() {
        return factAddressCountryCode;
    }

    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }

    public String getFactAddressCountryInput() {
        return factAddressCountryInput;
    }

    public void setFactAddressCountryInput(String factAddressCountryInput) {
        this.factAddressCountryInput = factAddressCountryInput;
    }

    public String getFactAddressSettlementType() {
        return factAddressSettlementType;
    }

    public void setFactAddressSettlementType(String factAddressSettlementType) {
        this.factAddressSettlementType = factAddressSettlementType;
    }

    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }

    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }

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

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getMiddleName() {
        return this.middleName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return this.sex;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return this.age;
    }

    public void setSitizenship(String sitizenship) {
        this.sitizenship = sitizenship;
    }
    public String getSitizenship() {
        return this.sitizenship;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }
    public String getIdentityDocType() {
        return this.identityDocType;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
    }
    public String getOtherDocTypeName() {
        return this.otherDocTypeName;
    }

    public void setPassSeria(String passSeria) {
        this.passSeria = passSeria;
    }
    public String getPassSeria() {
        return this.passSeria;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }
    public String getPassNo() {
        return this.passNo;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }
    public Date getPassDate() {
        return this.passDate;
    }

    public void setPassFrom(String passFrom) {
        this.passFrom = passFrom;
    }
    public String getPassFrom() {
        return this.passFrom;
    }

    public void setIdentityDocLoad(FileBean identityDocLoad) {
        this.identityDocLoad = identityDocLoad;
    }
    public FileBean getIdentityDocLoad() {
        return this.identityDocLoad;
    }

    public void setEduType(String eduType) {
        this.eduType = eduType;
    }
    public String getEduType() {
        return this.eduType;
    }

    public void setEduOrg(String eduOrg) {
        this.eduOrg = eduOrg;
    }
    public String getEduOrg() {
        return this.eduOrg;
    }

    public void setEduYear(String eduYear) {
        this.eduYear = eduYear;
    }
    public String getEduYear() {
        return this.eduYear;
    }

    public void setEduProf(String eduProf) {
        this.eduProf = eduProf;
    }
    public String getEduProf() {
        return this.eduProf;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }
    public String getProfName() {
        return this.profName;
    }

    public void setProfQual(String profQual) {
        this.profQual = profQual;
    }
    public String getProfQual() {
        return this.profQual;
    }

    public void setProfPost(String profPost) {
        this.profPost = profPost;
    }
    public String getProfPost() {
        return this.profPost;
    }

    public void setProfAge(String profAge) {
        this.profAge = profAge;
    }
    public String getProfAge() {
        return this.profAge;
    }

    public void setDopProfName(String dopProfName) {
        this.dopProfName = dopProfName;
    }
    public String getDopProfName() {
        return this.dopProfName;
    }

    public void setDopProfQual(String dopProfQual) {
        this.dopProfQual = dopProfQual;
    }
    public String getDopProfQual() {
        return this.dopProfQual;
    }

    public void setDopProfPost(String dopProfPost) {
        this.dopProfPost = dopProfPost;
    }
    public String getDopProfPost() {
        return this.dopProfPost;
    }

    public void setDopProfAge(String dopProfAge) {
        this.dopProfAge = dopProfAge;
    }
    public String getDopProfAge() {
        return this.dopProfAge;
    }

    public void setSkillLanguage(String skillLanguage) {
        this.skillLanguage = skillLanguage;
    }
    public String getSkillLanguage() {

        return this.skillLanguage == null ? "off" : this.skillLanguage;
    }

    public void setSkillLangName(String skillLangName) {
        this.skillLangName = skillLangName;
    }
    public String getSkillLangName() {
        return this.skillLangName;
    }

    public void setSkillPC(String skillPC) {
        this.skillPC = skillPC;
    }
    public String getSkillPC() {
        return this.skillPC == null ? "off" : this.skillPC;
    }

    public void setSkillDriver(String skillDriver) {
        this.skillDriver = skillDriver;
    }
    public String getSkillDriver() {
        return this.skillDriver == null ? "off" :this.skillDriver;
    }

    public void setSkillDriverCat(String skillDriverCat) {
        this.skillDriverCat = skillDriverCat;
    }
    public String getSkillDriverCat() {
        return this.skillDriverCat;
    }

    public void setTestAgreeCh1(String testAgreeCh1) {
        this.testAgreeCh1 = testAgreeCh1;
    }
    public String getTestAgreeCh1() {
        return this.testAgreeCh1 == null ? "off" : this.testAgreeCh1;
    }

    public void setTestAgreeCh2(String testAgreeCh2) {
        this.testAgreeCh2 = testAgreeCh2;
    }
    public String getTestAgreeCh2() {
        return this.testAgreeCh2 == null ? "off" : this.testAgreeCh2;
    }

    public void setTestAgreeCh3(String testAgreeCh3) {
        this.testAgreeCh3 = testAgreeCh3;
    }
    public String getTestAgreeCh3() {
        return this.testAgreeCh3 == null ? "off" : this.testAgreeCh3;
    }

    public void setTestAgreeCh4(String testAgreeCh4) {
        this.testAgreeCh4 = testAgreeCh4;
    }
    public String getTestAgreeCh4() {
        return this.testAgreeCh4 == null ? "off" : this.testAgreeCh4;
    }

    public void setTestAgreeCh5(String testAgreeCh5) {
        this.testAgreeCh5 = testAgreeCh5;
    }
    public String getTestAgreeCh5() {
        return this.testAgreeCh5 == null ? "off" : this.testAgreeCh5;
    }

    public void setTestAgreeCh6(String testAgreeCh6) {
        this.testAgreeCh6 = testAgreeCh6;
    }
    public String getTestAgreeCh6() {
        return this.testAgreeCh6  == null ? "off" : this.testAgreeCh6;
    }

    public void setApplCat1(String applCat1) {
        this.applCat1 = applCat1;
    }
    public String getApplCat1() {
        return this.applCat1 == null ? "off" : this.applCat1;
    }

    public void setApplCat2(String applCat2) {
        this.applCat2 = applCat2;
    }
    public String getApplCat2() {
        return this.applCat2 == null ? "off" : this.applCat2;
    }

    public void setApplCat3(String applCat3) {
        this.applCat3 = applCat3;
    }
    public String getApplCat3() {
        return this.applCat3 == null ? "off" : this.applCat3;
    }

    public void setApplCatDoc1Load(List<FileBean> applCatDoc1Load) {
        this.applCatDoc1Load = AccessCounterList.decorate(applCatDoc1Load, FileBean.class);
    }
    public List<FileBean> getApplCatDoc1Load() {
        return normalize(this.applCatDoc1Load);
    }

    public void setApplCatDoc2Load(FileBean applCatDoc2Load) {
        this.applCatDoc2Load = applCatDoc2Load;
    }
    public FileBean getApplCatDoc2Load() {
        return this.applCatDoc2Load;
    }

    public void setApplCatDoc3Load(FileBean applCatDoc3Load) {
        this.applCatDoc3Load = applCatDoc3Load;
    }
    public FileBean getApplCatDoc3Load() {
        return this.applCatDoc3Load;
    }

}
