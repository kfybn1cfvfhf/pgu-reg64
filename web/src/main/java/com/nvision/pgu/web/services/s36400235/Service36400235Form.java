package com.nvision.pgu.web.services.s36400235;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400235Form extends AbstractServiceOrderForm {

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
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
    private String identityDocType;
    private String otherDocTypeName;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private List<String> familyLastName = AccessCounterList.createEmpty(String.class);
    private List<String> familyFirstName = AccessCounterList.createEmpty(String.class);
    private List<String> familyMiddleName = AccessCounterList.createEmpty(String.class);
    private List<String> familyRelation = AccessCounterList.createEmpty(String.class);
    private List<FileBean> identityFamilyDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> compFamilyDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private String noEGRP; // checkbox
    private List<FileBean> techInventDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean motherCapDocLoad;
    private List<FileBean> noEGRPDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> regPeopleDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> dohodDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean noSobstDocLoad;
    private List<FileBean> EGRPDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean uchetNujdaJPDocLoad;
    // extra and pre-defined fields for address block
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressCountrySettlement;
    private String addressSettlementType = "1";
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressIndex() {
        return this.addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressCountry() {
        return this.addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressEnterType() {
        return this.addressEnterType;
    }

    public void setAddressEnterType(String addressEnterType) {
        this.addressEnterType = addressEnterType;
    }

    public String getAddressRegion() {
        return this.addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressRayon() {
        return this.addressRayon;
    }

    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }

    public String getAddressSettlementType() {
        return this.addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getAddressCity() {
        return this.addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressSettlementText() {
        return this.addressSettlementText;
    }

    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }

    public String getAddressSettlementDict() {
        return this.addressSettlementDict;
    }

    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }

    public String getAddressStreetText() {
        return this.addressStreetText;
    }

    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }

    public String getAddressStreetDict() {
        return this.addressStreetDict;
    }

    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }

    public String getAddressHouse() {
        return this.addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressKorpus() {
        return this.addressKorpus;
    }

    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }

    public String getAddressFlat() {
        return this.addressFlat;
    }

    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }

    public String getIdentityDocType() {
        return this.identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getOtherDocTypeName() {
        return this.otherDocTypeName;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
    }

    public String getPassSeria() {
        return this.passSeria;
    }

    public void setPassSeria(String passSeria) {
        this.passSeria = passSeria;
    }

    public String getPassNo() {
        return this.passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public Date getPassDate() {
        return this.passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    public String getPassFrom() {
        return this.passFrom;
    }

    public void setPassFrom(String passFrom) {
        this.passFrom = passFrom;
    }

    public FileBean getIdentityDocLoad() {
        return this.identityDocLoad;
    }

    public void setIdentityDocLoad(FileBean identityDocLoad) {
        this.identityDocLoad = identityDocLoad;
    }

    public List<String> getFamilyLastName() {
        return normalize(this.familyLastName);
    }

    public void setFamilyLastName(List<String> familyLastName) {
        this.familyLastName = AccessCounterList.decorate(familyLastName, String.class);
    }

    public List<String> getFamilyFirstName() {
        return normalize(this.familyFirstName);
    }

    public void setFamilyFirstName(List<String> familyFirstName) {
        this.familyFirstName = AccessCounterList.decorate(familyFirstName, String.class);
    }

    public List<String> getFamilyMiddleName() {
        return normalize(this.familyMiddleName);
    }

    public void setFamilyMiddleName(List<String> familyMiddleName) {
        this.familyMiddleName = AccessCounterList.decorate(familyMiddleName, String.class);
    }

    public List<String> getFamilyRelation() {
        return normalize(this.familyRelation);
    }

    public void setFamilyRelation(List<String> familyRelation) {
        this.familyRelation = AccessCounterList.decorate(familyRelation, String.class);
    }

    public List<FileBean> getIdentityFamilyDocLoad() {
        return normalize(this.identityFamilyDocLoad);
    }

    public void setIdentityFamilyDocLoad(List<FileBean> identityFamilyDocLoad) {
        this.identityFamilyDocLoad = AccessCounterList.decorate(identityFamilyDocLoad, FileBean.class);
    }

    public List<FileBean> getCompFamilyDocLoad() {
        return normalize(this.compFamilyDocLoad);
    }

    public void setCompFamilyDocLoad(List<FileBean> compFamilyDocLoad) {
        this.compFamilyDocLoad = AccessCounterList.decorate(compFamilyDocLoad, FileBean.class);
    }

    public String getNoEGRP() {
        return noEGRP == null ? "off" : noEGRP;
    }

    public void setNoEGRP(String noEGRP) {
        this.noEGRP = noEGRP;
    }

    public List<FileBean> getTechInventDocLoad() {
        return normalize(this.techInventDocLoad);
    }

    public void setTechInventDocLoad(List<FileBean> techInventDocLoad) {
        this.techInventDocLoad = AccessCounterList.decorate(techInventDocLoad, FileBean.class);
    }

    public FileBean getMotherCapDocLoad() {
        return this.motherCapDocLoad;
    }

    public void setMotherCapDocLoad(FileBean motherCapDocLoad) {
        this.motherCapDocLoad = motherCapDocLoad;
    }

    public List<FileBean> getNoEGRPDocLoad() {
        return normalize(this.noEGRPDocLoad);
    }

    public void setNoEGRPDocLoad(List<FileBean> noEGRPDocLoad) {
        this.noEGRPDocLoad = AccessCounterList.decorate(noEGRPDocLoad, FileBean.class);
    }

    public List<FileBean> getRegPeopleDocLoad() {
        return normalize(this.regPeopleDocLoad);
    }

    public void setRegPeopleDocLoad(List<FileBean> regPeopleDocLoad) {
        this.regPeopleDocLoad = AccessCounterList.decorate(regPeopleDocLoad, FileBean.class);
    }

    public List<FileBean> getDohodDocLoad() {
        return normalize(this.dohodDocLoad);
    }

    public void setDohodDocLoad(List<FileBean> dohodDocLoad) {
        this.dohodDocLoad = AccessCounterList.decorate(dohodDocLoad, FileBean.class);
    }

    public FileBean getNoSobstDocLoad() {
        return this.noSobstDocLoad;
    }

    public void setNoSobstDocLoad(FileBean noSobstDocLoad) {
        this.noSobstDocLoad = noSobstDocLoad;
    }

    public List<FileBean> getEGRPDocLoad() {
        return normalize(this.EGRPDocLoad);
    }

    public void setEGRPDocLoad(List<FileBean> EGRPDocLoad) {
        this.EGRPDocLoad = AccessCounterList.decorate(EGRPDocLoad, FileBean.class);
    }

    public FileBean getUchetNujdaJPDocLoad() {
        return this.uchetNujdaJPDocLoad;
    }

    public void setUchetNujdaJPDocLoad(FileBean uchetNujdaJPDocLoad) {
        this.uchetNujdaJPDocLoad = uchetNujdaJPDocLoad;
    }


}
