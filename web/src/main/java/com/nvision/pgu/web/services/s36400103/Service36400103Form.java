package com.nvision.pgu.web.services.s36400103;


import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

public class Service36400103Form extends AbstractServiceOrderForm {

    private String applType;
    private String dov_enable;
    private String dovUlType;
    private String anotherFl_enable;
    private String anotherUl_enable;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
    private String identityDocType;
    private String otherDocTypeName;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private FileBean dovUlNonDovLoad;
    private FileBean dovUlDovLoad;
    private FileBean dovUlPasLoad;
    private String org_FullTitle;
    private String org_opf;
    private String org_phone;
    private String org_fax;

    public String getAnotherFl_enable() {
        return anotherFl_enable == null ? "off" : anotherFl_enable;
    }

    public void setAnotherFl_enable(String anotherFl_enable) {
        this.anotherFl_enable = anotherFl_enable;
    }

    public String getAnotherUl_enable() {
        return anotherUl_enable == null ? "off" : anotherUl_enable;
    }

    public void setAnotherUl_enable(String anotherUl_enable) {
        this.anotherUl_enable = anotherUl_enable;
    }

    private String org_email;
    private String org_lastName;
    private String org_firstName;
    private String org_middleName;
    private String org_InnUl;
    private String org_OgrnUl;
    private List<String> fl_owner_Name = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_address = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_phone = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_email = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_identityDocType = AccessCounterList.createEmpty(String.class);
    private List<FileBean> fl_owner_identityDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<String> ul_owner_FullTitle = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_opf = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_addressUr = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_addressPost = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_phone = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_fax = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_email = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_Name = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_InnUl = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_OgrnUl = AccessCounterList.createEmpty(String.class);
    private String landKadastr;
    private String landSquare;
    private String landJobs;
    private String landObjName;
    private String landDopInfo;
    private FileBean tuDocLoad;
    private FileBean topographyDocLoad;
    private FileBean lowLandDocLoad;
    private FileBean lowObjDocLoad;
    private FileBean techPasDocLoad;
    private FileBean kadastrDocLoad;


    // для очистки полей (требуется для обработки возврата назад)
    private Boolean representativeStatusChanged = true;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressIndex;
    private String addressEnterType;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRegion;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRayon;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressCity;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementText;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementDict;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetText;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetDict;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressHouse;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressKorpus;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressFlat;
    private String orgAddressIndex;
    private String orgAddressEnterType;
    private String orgAddressRegion;
    private String orgAddressRayon;
    private String orgAddressCity;
    private String orgAddressSettlementText;
    private String orgAddressSettlementDict;
    private String orgAddressStreetText;
    private String orgAddressStreetDict;
    private String orgAddressHouse;
    private String orgAddressKorpus;
    private String orgAddressFlat;
    private String orgPostAddressIndex;
    private String orgPostAddressEnterType;
    private String orgPostAddressRegion;
    private String orgPostAddressRayon;
    private String orgPostAddressCity;
    private String orgPostAddressSettlementText;
    private String orgPostAddressSettlementDict;
    private String orgPostAddressStreetText;
    private String orgPostAddressStreetDict;
    private String orgPostAddressHouse;
    private String orgPostAddressKorpus;
    private String orgPostAddressFlat;
    private String landAddressIndex;
    private String landAddressEnterType;
    private String landAddressRegion;
    private String landAddressRayon;
    private String landAddressCity;
    private String landAddressSettlementText;
    private String landAddressSettlementDict;
    private String landAddressStreetText;
    private String landAddressStreetDict;
    private String landAddressHouse;
    private String landAddressKorpus;
    private String landAddressFlat;
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressCountrySettlement;
    private String addressSettlementType = "1";
    private String orgAddressCountry = "643";
    private String orgAddressCountryCode = "ru";
    private String orgAddressCountryInput;
    private String orgAddressCountrySettlement;
    private String orgAddressSettlementType = "1";
    private String orgPostAddressCountry = "643";
    private String orgPostAddressCountryCode = "ru";
    private String orgPostAddressCountryInput;
    private String orgPostAddressCountrySettlement;
    private String orgPostAddressSettlementType = "1";
    private String landAddressCountry = "643";
    private String landAddressCountryCode = "ru";
    private String landAddressCountryInput;
    private String landAddressCountrySettlement;
    private String landAddressSettlementType = "1";

    public List<String> getUl_owner_opf() {
        return normalize(ul_owner_opf);
    }

    public void setUl_owner_opf(List<String> ul_owner_opf) {
        this.ul_owner_opf = AccessCounterList.decorate(ul_owner_opf, String.class);
    }

    public String getApplType() {
        return applType;
    }

    public void setApplType(String applType) {
        this.applType = applType;
    }

    public String getDov_enable() {
        return dov_enable == null ? "off" : dov_enable;
    }

    public void setDov_enable(String dov_enable) {
        this.dov_enable = dov_enable;
    }

    public String getDovUlType() {
        return dovUlType;
    }

    public void setDovUlType(String dovUlType) {
        this.dovUlType = dovUlType;
    }

    public FileBean getDovDovLoad() {
        return dovDovLoad;
    }

    public void setDovDovLoad(FileBean dovDovLoad) {
        this.dovDovLoad = dovDovLoad;
    }

    public FileBean getDovPasLoad() {
        return dovPasLoad;
    }

    public void setDovPasLoad(FileBean dovPasLoad) {
        this.dovPasLoad = dovPasLoad;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getOtherDocTypeName() {
        return otherDocTypeName;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
    }

    public String getPassSeria() {
        return passSeria;
    }

    public void setPassSeria(String passSeria) {
        this.passSeria = passSeria;
    }

    public String getPassNo() {
        return passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public Date getPassDate() {
        return passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    public String getPassFrom() {
        return passFrom;
    }

    public void setPassFrom(String passFrom) {
        this.passFrom = passFrom;
    }

    public FileBean getIdentityDocLoad() {
        return identityDocLoad;
    }

    public void setIdentityDocLoad(FileBean identityDocLoad) {
        this.identityDocLoad = identityDocLoad;
    }

    public FileBean getDovUlNonDovLoad() {
        return dovUlNonDovLoad;
    }

    public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
        this.dovUlNonDovLoad = dovUlNonDovLoad;
    }

    public FileBean getDovUlDovLoad() {
        return dovUlDovLoad;
    }

    public void setDovUlDovLoad(FileBean dovUlDovLoad) {
        this.dovUlDovLoad = dovUlDovLoad;
    }

    public FileBean getDovUlPasLoad() {
        return dovUlPasLoad;
    }

    public void setDovUlPasLoad(FileBean dovUlPasLoad) {
        this.dovUlPasLoad = dovUlPasLoad;
    }

    public String getOrg_FullTitle() {
        return org_FullTitle;
    }

    public void setOrg_FullTitle(String org_FullTitle) {
        this.org_FullTitle = org_FullTitle;
    }

    public String getOrg_opf() {
        return org_opf;
    }

    public void setOrg_opf(String org_opf) {
        this.org_opf = org_opf;
    }

    // Методы автоочистки полей

    public String getOrg_phone() {
        return org_phone;
    }

    public void setOrg_phone(String org_phone) {
        this.org_phone = org_phone;
    }

    public String getOrg_fax() {
        return org_fax;
    }

    public void setOrg_fax(String org_fax) {
        this.org_fax = org_fax;
    }

    public String getOrg_email() {
        return org_email;
    }

    public void setOrg_email(String org_email) {
        this.org_email = org_email;
    }

    public String getOrg_lastName() {
        return org_lastName;
    }

    public void setOrg_lastName(String org_lastName) {
        this.org_lastName = org_lastName;
    }

    public String getOrg_firstName() {
        return org_firstName;
    }

    public void setOrg_firstName(String org_firstName) {
        this.org_firstName = org_firstName;
    }

    public String getOrg_middleName() {
        return org_middleName;
    }

    public void setOrg_middleName(String org_middleName) {
        this.org_middleName = org_middleName;
    }

    public String getOrg_InnUl() {
        return org_InnUl;
    }

    public void setOrg_InnUl(String org_InnUl) {
        this.org_InnUl = org_InnUl;
    }

    public String getOrg_OgrnUl() {
        return org_OgrnUl;
    }

    public void setOrg_OgrnUl(String org_OgrnUl) {
        this.org_OgrnUl = org_OgrnUl;
    }

    public List<String> getFl_owner_Name() {
        return normalize(fl_owner_Name);
    }

    public void setFl_owner_Name(List<String> fl_owner_Name) {
        this.fl_owner_Name = AccessCounterList.decorate(fl_owner_Name, String.class);
    }

    public List<String> getFl_owner_address() {
        return normalize(fl_owner_address);
    }

    public void setFl_owner_address(List<String> fl_owner_address) {
        this.fl_owner_address = AccessCounterList.decorate(fl_owner_address, String.class);
    }

    public List<String> getFl_owner_phone() {
        return normalize(fl_owner_phone);
    }

    public void setFl_owner_phone(List<String> fl_owner_phone) {
        this.fl_owner_phone = AccessCounterList.decorate(fl_owner_phone, String.class);
    }

    public List<String> getFl_owner_email() {
        return normalize(fl_owner_email);
    }

    public void setFl_owner_email(List<String> fl_owner_email) {
        this.fl_owner_email = AccessCounterList.decorate(fl_owner_email, String.class);
    }

    public List<String> getFl_owner_identityDocType() {
        return normalize(fl_owner_identityDocType);
    }

    public void setFl_owner_identityDocType(List<String> fl_owner_identityDocType) {
        this.fl_owner_identityDocType = AccessCounterList.decorate(fl_owner_identityDocType, String.class);
    }

    public List<FileBean> getFl_owner_identityDocLoad() {
        return normalize(fl_owner_identityDocLoad);
    }

    public void setFl_owner_identityDocLoad(List<FileBean> fl_owner_identityDocLoad) {
        this.fl_owner_identityDocLoad = AccessCounterList.decorate(fl_owner_identityDocLoad, FileBean.class);
    }

    public List<String> getUl_owner_FullTitle() {
        return normalize(ul_owner_FullTitle);
    }

    public void setUl_owner_FullTitle(List<String> ul_owner_FullTitle) {
        this.ul_owner_FullTitle = AccessCounterList.decorate(ul_owner_FullTitle, String.class);
    }

    public List<String> getUl_owner_addressUr() {
        return normalize(ul_owner_addressUr);
    }

    public void setUl_owner_addressUr(List<String> ul_owner_addressUr) {
        this.ul_owner_addressUr = AccessCounterList.decorate(ul_owner_addressUr, String.class);
    }

    public List<String> getUl_owner_addressPost() {
        return normalize(ul_owner_addressPost);
    }

    public void setUl_owner_addressPost(List<String> ul_owner_addressPost) {
        this.ul_owner_addressPost = AccessCounterList.decorate(ul_owner_addressPost, String.class);
    }

    public List<String> getUl_owner_phone() {
        return normalize(ul_owner_phone);
    }

    public void setUl_owner_phone(List<String> ul_owner_phone) {
        this.ul_owner_phone = AccessCounterList.decorate(ul_owner_phone, String.class);
    }

    public List<String> getUl_owner_fax() {
        return normalize(ul_owner_fax);
    }

    public void setUl_owner_fax(List<String> ul_owner_fax) {
        this.ul_owner_fax = AccessCounterList.decorate(ul_owner_fax, String.class);
    }

    public List<String> getUl_owner_email() {
        return normalize(ul_owner_email);
    }

    public void setUl_owner_email(List<String> ul_owner_email) {
        this.ul_owner_email = AccessCounterList.decorate(ul_owner_email, String.class);
    }

    public List<String> getUl_owner_Name() {
        return normalize(ul_owner_Name);
    }

    public void setUl_owner_Name(List<String> ul_owner_Name) {
        this.ul_owner_Name = AccessCounterList.decorate(ul_owner_Name, String.class);
    }

    public List<String> getUl_owner_InnUl() {
        return normalize(ul_owner_InnUl);
    }

    public void setUl_owner_InnUl(List<String> ul_owner_InnUl) {
        this.ul_owner_InnUl = AccessCounterList.decorate(ul_owner_InnUl, String.class);
    }

    public List<String> getUl_owner_OgrnUl() {
        return normalize(ul_owner_OgrnUl);
    }

    public void setUl_owner_OgrnUl(List<String> ul_owner_OgrnUl) {
        this.ul_owner_OgrnUl = AccessCounterList.decorate(ul_owner_OgrnUl, String.class);
    }

    public String getLandKadastr() {
        return landKadastr;
    }

    public void setLandKadastr(String landKadastr) {
        this.landKadastr = landKadastr;
    }

    public String getLandSquare() {
        return landSquare;
    }

    public void setLandSquare(String landSquare) {
        this.landSquare = landSquare;
    }

    public String getLandJobs() {
        return landJobs;
    }

    public void setLandJobs(String landJobs) {
        this.landJobs = landJobs;
    }

    public String getLandObjName() {
        return landObjName;
    }

    public void setLandObjName(String landObjName) {
        this.landObjName = landObjName;
    }

    public String getLandDopInfo() {
        return landDopInfo;
    }

    public void setLandDopInfo(String landDopInfo) {
        this.landDopInfo = landDopInfo;
    }

    public FileBean getTuDocLoad() {
        return tuDocLoad;
    }

    public void setTuDocLoad(FileBean tuDocLoad) {
        this.tuDocLoad = tuDocLoad;
    }

    public FileBean getTopographyDocLoad() {
        return topographyDocLoad;
    }

    public void setTopographyDocLoad(FileBean topographyDocLoad) {
        this.topographyDocLoad = topographyDocLoad;
    }

    public FileBean getLowLandDocLoad() {
        return lowLandDocLoad;
    }

    public void setLowLandDocLoad(FileBean lowLandDocLoad) {
        this.lowLandDocLoad = lowLandDocLoad;
    }

    public FileBean getLowObjDocLoad() {
        return lowObjDocLoad;
    }

    public void setLowObjDocLoad(FileBean lowObjDocLoad) {
        this.lowObjDocLoad = lowObjDocLoad;
    }

    public FileBean getTechPasDocLoad() {
        return techPasDocLoad;
    }

    public void setTechPasDocLoad(FileBean techPasDocLoad) {
        this.techPasDocLoad = techPasDocLoad;
    }

    public FileBean getKadastrDocLoad() {
        return kadastrDocLoad;
    }

    public void setKadastrDocLoad(FileBean kadastrDocLoad) {
        this.kadastrDocLoad = kadastrDocLoad;
    }

    public Boolean getRepresentativeStatusChanged() {
        return representativeStatusChanged;
    }

    public void setRepresentativeStatusChanged(boolean representativeStatusChanged) {
        this.representativeStatusChanged = representativeStatusChanged;
    }

    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressEnterType() {
        return addressEnterType;
    }

    public void setAddressEnterType(String addressEnterType) {
        this.addressEnterType = addressEnterType;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressRayon() {
        return addressRayon;
    }

    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressSettlementText() {
        return addressSettlementText;
    }

    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }

    public String getAddressSettlementDict() {
        return addressSettlementDict;
    }

    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }

    public String getAddressStreetText() {
        return addressStreetText;
    }

    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }

    public String getAddressStreetDict() {
        return addressStreetDict;
    }

    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressKorpus() {
        return addressKorpus;
    }

    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }

    public String getAddressFlat() {
        return addressFlat;
    }

    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }

    public String getOrgAddressIndex() {
        return orgAddressIndex;
    }

    public void setOrgAddressIndex(String orgAddressIndex) {
        this.orgAddressIndex = orgAddressIndex;
    }

    public String getOrgAddressEnterType() {
        return orgAddressEnterType;
    }

    public void setOrgAddressEnterType(String orgAddressEnterType) {
        this.orgAddressEnterType = orgAddressEnterType;
    }

    public String getOrgAddressRegion() {
        return orgAddressRegion;
    }

    public void setOrgAddressRegion(String orgAddressRegion) {
        this.orgAddressRegion = orgAddressRegion;
    }

    public String getOrgAddressRayon() {
        return orgAddressRayon;
    }

    public void setOrgAddressRayon(String orgAddressRayon) {
        this.orgAddressRayon = orgAddressRayon;
    }

    public String getOrgAddressCity() {
        return orgAddressCity;
    }

    public void setOrgAddressCity(String orgAddressCity) {
        this.orgAddressCity = orgAddressCity;
    }

    public String getOrgAddressSettlementText() {
        return orgAddressSettlementText;
    }

    public void setOrgAddressSettlementText(String orgAddressSettlementText) {
        this.orgAddressSettlementText = orgAddressSettlementText;
    }

    public String getOrgAddressSettlementDict() {
        return orgAddressSettlementDict;
    }

    public void setOrgAddressSettlementDict(String orgAddressSettlementDict) {
        this.orgAddressSettlementDict = orgAddressSettlementDict;
    }

    public String getOrgAddressStreetText() {
        return orgAddressStreetText;
    }

    public void setOrgAddressStreetText(String orgAddressStreetText) {
        this.orgAddressStreetText = orgAddressStreetText;
    }

    public String getOrgAddressStreetDict() {
        return orgAddressStreetDict;
    }

    public void setOrgAddressStreetDict(String orgAddressStreetDict) {
        this.orgAddressStreetDict = orgAddressStreetDict;
    }

    public String getOrgAddressHouse() {
        return orgAddressHouse;
    }

    public void setOrgAddressHouse(String orgAddressHouse) {
        this.orgAddressHouse = orgAddressHouse;
    }

    public String getOrgAddressKorpus() {
        return orgAddressKorpus;
    }

    public void setOrgAddressKorpus(String orgAddressKorpus) {
        this.orgAddressKorpus = orgAddressKorpus;
    }

    public String getOrgAddressFlat() {
        return orgAddressFlat;
    }

    public void setOrgAddressFlat(String orgAddressFlat) {
        this.orgAddressFlat = orgAddressFlat;
    }

    public String getOrgPostAddressIndex() {
        return orgPostAddressIndex;
    }

    public void setOrgPostAddressIndex(String orgPostAddressIndex) {
        this.orgPostAddressIndex = orgPostAddressIndex;
    }

    public String getOrgPostAddressEnterType() {
        return orgPostAddressEnterType;
    }

    public void setOrgPostAddressEnterType(String orgPostAddressEnterType) {
        this.orgPostAddressEnterType = orgPostAddressEnterType;
    }

    public String getOrgPostAddressRegion() {
        return orgPostAddressRegion;
    }

    public void setOrgPostAddressRegion(String orgPostAddressRegion) {
        this.orgPostAddressRegion = orgPostAddressRegion;
    }

    public String getOrgPostAddressRayon() {
        return orgPostAddressRayon;
    }

    public void setOrgPostAddressRayon(String orgPostAddressRayon) {
        this.orgPostAddressRayon = orgPostAddressRayon;
    }

    public String getOrgPostAddressCity() {
        return orgPostAddressCity;
    }

    public void setOrgPostAddressCity(String orgPostAddressCity) {
        this.orgPostAddressCity = orgPostAddressCity;
    }

    public String getOrgPostAddressSettlementText() {
        return orgPostAddressSettlementText;
    }

    public void setOrgPostAddressSettlementText(String orgPostAddressSettlementText) {
        this.orgPostAddressSettlementText = orgPostAddressSettlementText;
    }

    public String getOrgPostAddressSettlementDict() {
        return orgPostAddressSettlementDict;
    }

    public void setOrgPostAddressSettlementDict(String orgPostAddressSettlementDict) {
        this.orgPostAddressSettlementDict = orgPostAddressSettlementDict;
    }

    public String getOrgPostAddressStreetText() {
        return orgPostAddressStreetText;
    }

    public void setOrgPostAddressStreetText(String orgPostAddressStreetText) {
        this.orgPostAddressStreetText = orgPostAddressStreetText;
    }

    public String getOrgPostAddressStreetDict() {
        return orgPostAddressStreetDict;
    }

    public void setOrgPostAddressStreetDict(String orgPostAddressStreetDict) {
        this.orgPostAddressStreetDict = orgPostAddressStreetDict;
    }

    public String getOrgPostAddressHouse() {
        return orgPostAddressHouse;
    }

    public void setOrgPostAddressHouse(String orgPostAddressHouse) {
        this.orgPostAddressHouse = orgPostAddressHouse;
    }

    public String getOrgPostAddressKorpus() {
        return orgPostAddressKorpus;
    }

    public void setOrgPostAddressKorpus(String orgPostAddressKorpus) {
        this.orgPostAddressKorpus = orgPostAddressKorpus;
    }

    public String getOrgPostAddressFlat() {
        return orgPostAddressFlat;
    }

    public void setOrgPostAddressFlat(String orgPostAddressFlat) {
        this.orgPostAddressFlat = orgPostAddressFlat;
    }

    public String getLandAddressIndex() {
        return landAddressIndex;
    }

    public void setLandAddressIndex(String landAddressIndex) {
        this.landAddressIndex = landAddressIndex;
    }

    public String getLandAddressEnterType() {
        return landAddressEnterType;
    }

    public void setLandAddressEnterType(String landAddressEnterType) {
        this.landAddressEnterType = landAddressEnterType;
    }

    public String getLandAddressRegion() {
        return landAddressRegion;
    }

    public void setLandAddressRegion(String landAddressRegion) {
        this.landAddressRegion = landAddressRegion;
    }

    public String getLandAddressRayon() {
        return landAddressRayon;
    }

    public void setLandAddressRayon(String landAddressRayon) {
        this.landAddressRayon = landAddressRayon;
    }

    public String getLandAddressCity() {
        return landAddressCity;
    }

    public void setLandAddressCity(String landAddressCity) {
        this.landAddressCity = landAddressCity;
    }

    public String getLandAddressSettlementText() {
        return landAddressSettlementText;
    }

    public void setLandAddressSettlementText(String landAddressSettlementText) {
        this.landAddressSettlementText = landAddressSettlementText;
    }

    public String getLandAddressSettlementDict() {
        return landAddressSettlementDict;
    }

    public void setLandAddressSettlementDict(String landAddressSettlementDict) {
        this.landAddressSettlementDict = landAddressSettlementDict;
    }

    public String getLandAddressStreetText() {
        return landAddressStreetText;
    }

    public void setLandAddressStreetText(String landAddressStreetText) {
        this.landAddressStreetText = landAddressStreetText;
    }

    public String getLandAddressStreetDict() {
        return landAddressStreetDict;
    }

    public void setLandAddressStreetDict(String landAddressStreetDict) {
        this.landAddressStreetDict = landAddressStreetDict;
    }

    public String getLandAddressHouse() {
        return landAddressHouse;
    }

    public void setLandAddressHouse(String landAddressHouse) {
        this.landAddressHouse = landAddressHouse;
    }

    public String getLandAddressKorpus() {
        return landAddressKorpus;
    }

    public void setLandAddressKorpus(String landAddressKorpus) {
        this.landAddressKorpus = landAddressKorpus;
    }

    public String getLandAddressFlat() {
        return landAddressFlat;
    }

    public void setLandAddressFlat(String landAddressFlat) {
        this.landAddressFlat = landAddressFlat;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getOrgAddressCountry() {
        return orgAddressCountry;
    }

    public void setOrgAddressCountry(String orgAddressCountry) {
        this.orgAddressCountry = orgAddressCountry;
    }

    public String getOrgAddressCountryCode() {
        return orgAddressCountryCode;
    }

    public void setOrgAddressCountryCode(String orgAddressCountryCode) {
        this.orgAddressCountryCode = orgAddressCountryCode;
    }

    public String getOrgAddressCountryInput() {
        return orgAddressCountryInput;
    }

    public void setOrgAddressCountryInput(String orgAddressCountryInput) {
        this.orgAddressCountryInput = orgAddressCountryInput;
    }

    public String getOrgAddressCountrySettlement() {
        return orgAddressCountrySettlement;
    }

    public void setOrgAddressCountrySettlement(String orgAddressCountrySettlement) {
        this.orgAddressCountrySettlement = orgAddressCountrySettlement;
    }

    public String getOrgAddressSettlementType() {
        return orgAddressSettlementType;
    }

    public void setOrgAddressSettlementType(String orgAddressSettlementType) {
        this.orgAddressSettlementType = orgAddressSettlementType;
    }

    public String getOrgPostAddressCountry() {
        return orgPostAddressCountry;
    }

    public void setOrgPostAddressCountry(String orgPostAddressCountry) {
        this.orgPostAddressCountry = orgPostAddressCountry;
    }

    public String getOrgPostAddressCountryCode() {
        return orgPostAddressCountryCode;
    }

    public void setOrgPostAddressCountryCode(String orgPostAddressCountryCode) {
        this.orgPostAddressCountryCode = orgPostAddressCountryCode;
    }

    public String getOrgPostAddressCountryInput() {
        return orgPostAddressCountryInput;
    }

    public void setOrgPostAddressCountryInput(String orgPostAddressCountryInput) {
        this.orgPostAddressCountryInput = orgPostAddressCountryInput;
    }

    public String getOrgPostAddressCountrySettlement() {
        return orgPostAddressCountrySettlement;
    }

    public void setOrgPostAddressCountrySettlement(String orgPostAddressCountrySettlement) {
        this.orgPostAddressCountrySettlement = orgPostAddressCountrySettlement;
    }

    public String getOrgPostAddressSettlementType() {
        return orgPostAddressSettlementType;
    }

    public void setOrgPostAddressSettlementType(String orgPostAddressSettlementType) {
        this.orgPostAddressSettlementType = orgPostAddressSettlementType;
    }

    public String getLandAddressCountry() {
        return landAddressCountry;
    }

    public void setLandAddressCountry(String landAddressCountry) {
        this.landAddressCountry = landAddressCountry;
    }

    public String getLandAddressCountryCode() {
        return landAddressCountryCode;
    }

    public void setLandAddressCountryCode(String landAddressCountryCode) {
        this.landAddressCountryCode = landAddressCountryCode;
    }

    public String getLandAddressCountryInput() {
        return landAddressCountryInput;
    }

    public void setLandAddressCountryInput(String landAddressCountryInput) {
        this.landAddressCountryInput = landAddressCountryInput;
    }

    public String getLandAddressCountrySettlement() {
        return landAddressCountrySettlement;
    }

    public void setLandAddressCountrySettlement(String landAddressCountrySettlement) {
        this.landAddressCountrySettlement = landAddressCountrySettlement;
    }

    public String getLandAddressSettlementType() {
        return landAddressSettlementType;
    }

    public void setLandAddressSettlementType(String landAddressSettlementType) {
        this.landAddressSettlementType = landAddressSettlementType;
    }

    public void clearApplicantAttributes() {
        setFirstName("");
        setLastName("");
        setMiddleName("");
        setPhone("");
        setEmail("");

//        this.setAddressIndex("");
//        this.setAddressRegion("");
//        this.setAddressRayon("");
//        this.setAddressCity("");
//
//        this.setAddressSettlementText("");
//        this.setAddressSettlementDict("");
//        this.setAddressStreetText("");
//        this.setAddressStreetDict("");
//
//        this.setAddressHouse("");
//        this.setAddressKorpus("");
//        this.setAddressFlat("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());

//        this.setAddressIndex(privateRoomDataContainer.getAddressIndex());
//        this.setAddressRegion(privateRoomDataContainer.getAddressRegion());
//        this.setAddressRayon(privateRoomDataContainer.getAddressRayon());
//        this.setAddressCity(privateRoomDataContainer.getAddressCity());
//
//        this.setAddressSettlementText(privateRoomDataContainer.getAddressSettlementText());
//        this.setAddressSettlementDict(privateRoomDataContainer.getAddressSettlementDict());
//        this.setAddressStreetText(privateRoomDataContainer.getAddressStreetText());
//        this.setAddressStreetDict(privateRoomDataContainer.getAddressStreetDict());
//
//        this.setAddressHouse(privateRoomDataContainer.getAddressHouse());
//        this.setAddressKorpus(privateRoomDataContainer.getAddressKorpus());
//        this.setAddressFlat(privateRoomDataContainer.getAddressFlat());
    }
}
