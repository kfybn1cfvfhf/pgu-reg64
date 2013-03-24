package com.nvision.pgu.web.services.s36400054;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400054Form extends AbstractServiceOrderForm {
    private String dov_enable;
    private String incapable_enable;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private Date birthdate;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressIndex;
    private String addressEnterType;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRegion;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRayon;

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    private String addressSettlementType = "1";
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
    private String factAddressIndex;
    private String factAddressEnterType;
    private String factAddressRegion;
    private String factAddressRayon;
    private String factAddressSettlementType = "1";
    private String factAddressCity;
    private String factAddressSettlementText;
    private String factAddressSettlementDict;
    private String factAddressStreetText;
    private String factAddressStreetDict;
    private String factAddressHouse;
    private String factAddressKorpus;
    private String factAddressFlat;
    private String otherDocTypeName;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    private FileBean dovOpekLoad;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    private String phoneWork;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
    private String identityDocType;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private String recipientLastName;
    private String recipientFirstName;
    private String recipientMiddleName;
    private Date recipientBirthDate;
    private String rec_addressIndex;
    private String rec_addressEnterType;
    private String rec_addressRegion;
    private String rec_addressRayon;
    private String rec_addressSettlementType = "1";
    private String rec_addressCity;
    private String rec_addressSettlementText;
    private String rec_addressSettlementDict;
    private String rec_addressStreetText;
    private String rec_addressStreetDict;
    private String rec_addressHouse;
    private String rec_addressKorpus;
    private String rec_addressFlat;
    private String rec_factAddressIndex;
    private String rec_factAddressEnterType;
    private String rec_factAddressRegion;
    private String rec_factAddressRayon;
    private String rec_factAddressSettlementType = "1";
    private String rec_factAddressCity;
    private String rec_factAddressSettlementText;
    private String rec_factAddressSettlementDict;
    private String rec_factAddressStreetText;
    private String rec_factAddressStreetDict;
    private String rec_factAddressHouse;
    private String rec_factAddressKorpus;
    private String rec_factAddressFlat;
    private String recipientIdentityDocType;
    private String recipientOtherDocTypeName;
    private String recipientPassSeria;
    private String recipientPassNo;
    private Date recipientPassDate;
    private String recipientPassFrom;
    private FileBean recipientIdentityDocLoad;
    private String jp_addressIndex;
    private String jp_addressEnterType;
    private String jp_addressRegion;
    private String jp_addressRayon;
    private String jp_addressSettlementType = "1";
    private String jp_addressCity;
    private String jp_addressSettlementText;
    private String jp_addressSettlementDict;
    private String jp_addressStreetText;
    private String jp_addressStreetDict;
    private String jp_addressHouse;
    private String jp_addressKorpus;
    private String jp_addressFlat;
    private Date dateDogSocNaim;
    private String noDogSocNaim;
    private String org_soc;
    private String bed;
    private String qt_bed;
    private String cost_bed;
    private String table;
    private String qt_table;
    private String cost_table;
    private String wardrobe;
    private String qt_wardrobe;
    private String cost_wardrobe;
    private String chair;
    private String qt_chair;
    private String cost_chair;
    private String icebox;
    private String qt_icebox;
    private String cost_icebox;
    private String gaz;
    private String cost_gaz;
    private String gku;
    private String qt_gku;
    private String cost_gku;
    private FileBean costGKUdocLoad;
    private String wayBenefit;
    private String addressBenefit;
    private String nameBankBenefit;
    private String filialBankBenefit;
    private String bikBankBenefit;
    private String corrAccBankBenefit;
    private String codeFilialBankBenefit;
    private String clientAccBankBenefit;
    private String agree;

    public String getDov_enable() {
        return dov_enable == null ? "off" : dov_enable;
    }

    public void setDov_enable(String dov_enable) {
        this.dov_enable = dov_enable;
    }

    public String getIncapable_enable() {
        return incapable_enable == null ? "off" : incapable_enable;
    }

    public void setIncapable_enable(String incapable_enable) {
        this.incapable_enable = incapable_enable;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
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

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
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

    public String getFactAddressIndex() {
        return factAddressIndex;
    }

    public void setFactAddressIndex(String factAddressIndex) {
        this.factAddressIndex = factAddressIndex;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
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

    public String getFactAddressSettlementType() {
        return factAddressSettlementType;
    }

    public void setFactAddressSettlementType(String factAddressSettlementType) {
        this.factAddressSettlementType = factAddressSettlementType;
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

    public String getOtherDocTypeName() {
        return otherDocTypeName;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
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

    public FileBean getDovOpekLoad() {
        return dovOpekLoad;
    }

    public void setDovOpekLoad(FileBean dovOpekLoad) {
        this.dovOpekLoad = dovOpekLoad;
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

    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
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

    public String getRecipientLastName() {
        return recipientLastName;
    }

    public void setRecipientLastName(String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }

    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    public void setRecipientFirstName(String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }

    public String getRecipientMiddleName() {
        return recipientMiddleName;
    }

    public void setRecipientMiddleName(String recipientMiddleName) {
        this.recipientMiddleName = recipientMiddleName;
    }

    public Date getRecipientBirthDate() {
        return recipientBirthDate;
    }

    public void setRecipientBirthDate(Date recipientBirthDate) {
        this.recipientBirthDate = recipientBirthDate;
    }

    public String getRec_addressIndex() {
        return rec_addressIndex;
    }

    public void setRec_addressIndex(String rec_addressIndex) {
        this.rec_addressIndex = rec_addressIndex;
    }

    public String getRec_addressCountry() {
        return rec_addressCountry;
    }

    public void setRec_addressCountry(String rec_addressCountry) {
        this.rec_addressCountry = rec_addressCountry;
    }

    public String getRec_addressEnterType() {
        return rec_addressEnterType;
    }

    public void setRec_addressEnterType(String rec_addressEnterType) {
        this.rec_addressEnterType = rec_addressEnterType;
    }

    public String getRec_addressRegion() {
        return rec_addressRegion;
    }

    public void setRec_addressRegion(String rec_addressRegion) {
        this.rec_addressRegion = rec_addressRegion;
    }

    public String getRec_addressRayon() {
        return rec_addressRayon;
    }

    public void setRec_addressRayon(String rec_addressRayon) {
        this.rec_addressRayon = rec_addressRayon;
    }

    public String getRec_addressSettlementType() {
        return rec_addressSettlementType;
    }

    public void setRec_addressSettlementType(String rec_addressSettlementType) {
        this.rec_addressSettlementType = rec_addressSettlementType;
    }

    public String getRec_addressCity() {
        return rec_addressCity;
    }

    public void setRec_addressCity(String rec_addressCity) {
        this.rec_addressCity = rec_addressCity;
    }

    public String getRec_addressSettlementText() {
        return rec_addressSettlementText;
    }

    public void setRec_addressSettlementText(String rec_addressSettlementText) {
        this.rec_addressSettlementText = rec_addressSettlementText;
    }

    public String getRec_addressSettlementDict() {
        return rec_addressSettlementDict;
    }

    public void setRec_addressSettlementDict(String rec_addressSettlementDict) {
        this.rec_addressSettlementDict = rec_addressSettlementDict;
    }

    public String getRec_addressStreetText() {
        return rec_addressStreetText;
    }

    public void setRec_addressStreetText(String rec_addressStreetText) {
        this.rec_addressStreetText = rec_addressStreetText;
    }

    public String getRec_addressStreetDict() {
        return rec_addressStreetDict;
    }

    public void setRec_addressStreetDict(String rec_addressStreetDict) {
        this.rec_addressStreetDict = rec_addressStreetDict;
    }

    public String getRec_addressHouse() {
        return rec_addressHouse;
    }

    public void setRec_addressHouse(String rec_addressHouse) {
        this.rec_addressHouse = rec_addressHouse;
    }

    public String getRec_addressKorpus() {
        return rec_addressKorpus;
    }

    public void setRec_addressKorpus(String rec_addressKorpus) {
        this.rec_addressKorpus = rec_addressKorpus;
    }

    public String getRec_addressFlat() {
        return rec_addressFlat;
    }

    public void setRec_addressFlat(String rec_addressFlat) {
        this.rec_addressFlat = rec_addressFlat;
    }

    public String getRec_factAddressIndex() {
        return rec_factAddressIndex;
    }

    public void setRec_factAddressIndex(String rec_factAddressIndex) {
        this.rec_factAddressIndex = rec_factAddressIndex;
    }

    public String getRec_factAddressCountry() {
        return rec_factAddressCountry;
    }

    public void setRec_factAddressCountry(String rec_factAddressCountry) {
        this.rec_factAddressCountry = rec_factAddressCountry;
    }

    public String getRec_factAddressEnterType() {
        return rec_factAddressEnterType;
    }

    public void setRec_factAddressEnterType(String rec_factAddressEnterType) {
        this.rec_factAddressEnterType = rec_factAddressEnterType;
    }

    public String getRec_factAddressRegion() {
        return rec_factAddressRegion;
    }

    public void setRec_factAddressRegion(String rec_factAddressRegion) {
        this.rec_factAddressRegion = rec_factAddressRegion;
    }

    public String getRec_factAddressRayon() {
        return rec_factAddressRayon;
    }

    public void setRec_factAddressRayon(String rec_factAddressRayon) {
        this.rec_factAddressRayon = rec_factAddressRayon;
    }

    public String getRec_factAddressSettlementType() {
        return rec_factAddressSettlementType;
    }

    public void setRec_factAddressSettlementType(String rec_factAddressSettlementType) {
        this.rec_factAddressSettlementType = rec_factAddressSettlementType;
    }

    public String getRec_factAddressCity() {
        return rec_factAddressCity;
    }

    public void setRec_factAddressCity(String rec_factAddressCity) {
        this.rec_factAddressCity = rec_factAddressCity;
    }

    public String getRec_factAddressSettlementText() {
        return rec_factAddressSettlementText;
    }

    public void setRec_factAddressSettlementText(String rec_factAddressSettlementText) {
        this.rec_factAddressSettlementText = rec_factAddressSettlementText;
    }

    public String getRec_factAddressSettlementDict() {
        return rec_factAddressSettlementDict;
    }

    public void setRec_factAddressSettlementDict(String rec_factAddressSettlementDict) {
        this.rec_factAddressSettlementDict = rec_factAddressSettlementDict;
    }

    public String getRec_factAddressStreetText() {
        return rec_factAddressStreetText;
    }

    public void setRec_factAddressStreetText(String rec_factAddressStreetText) {
        this.rec_factAddressStreetText = rec_factAddressStreetText;
    }

    public String getRec_factAddressStreetDict() {
        return rec_factAddressStreetDict;
    }

    public void setRec_factAddressStreetDict(String rec_factAddressStreetDict) {
        this.rec_factAddressStreetDict = rec_factAddressStreetDict;
    }

    public String getRec_factAddressHouse() {
        return rec_factAddressHouse;
    }

    public void setRec_factAddressHouse(String rec_factAddressHouse) {
        this.rec_factAddressHouse = rec_factAddressHouse;
    }

    public String getRec_factAddressKorpus() {
        return rec_factAddressKorpus;
    }

    public void setRec_factAddressKorpus(String rec_factAddressKorpus) {
        this.rec_factAddressKorpus = rec_factAddressKorpus;
    }

    public String getRec_factAddressFlat() {
        return rec_factAddressFlat;
    }

    public void setRec_factAddressFlat(String rec_factAddressFlat) {
        this.rec_factAddressFlat = rec_factAddressFlat;
    }

    public String getRecipientIdentityDocType() {
        return recipientIdentityDocType;
    }

    public void setRecipientIdentityDocType(String recipientIdentityDocType) {
        this.recipientIdentityDocType = recipientIdentityDocType;
    }

    public String getRecipientOtherDocTypeName() {
        return recipientOtherDocTypeName;
    }

    public void setRecipientOtherDocTypeName(String recipientOtherDocTypeName) {
        this.recipientOtherDocTypeName = recipientOtherDocTypeName;
    }

    public String getRecipientPassSeria() {
        return recipientPassSeria;
    }

    public void setRecipientPassSeria(String recipientPassSeria) {
        this.recipientPassSeria = recipientPassSeria;
    }

    public String getRecipientPassNo() {
        return recipientPassNo;
    }

    public void setRecipientPassNo(String recipientPassNo) {
        this.recipientPassNo = recipientPassNo;
    }

    public Date getRecipientPassDate() {
        return recipientPassDate;
    }

    public void setRecipientPassDate(Date recipientPassDate) {
        this.recipientPassDate = recipientPassDate;
    }

    public String getRecipientPassFrom() {
        return recipientPassFrom;
    }

    public void setRecipientPassFrom(String recipientPassFrom) {
        this.recipientPassFrom = recipientPassFrom;
    }

    public FileBean getRecipientIdentityDocLoad() {
        return recipientIdentityDocLoad;
    }

    public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
        this.recipientIdentityDocLoad = recipientIdentityDocLoad;
    }

    public String getJp_addressIndex() {
        return jp_addressIndex;
    }

    public void setJp_addressIndex(String jp_addressIndex) {
        this.jp_addressIndex = jp_addressIndex;
    }

    public String getJp_addressCountry() {
        return jp_addressCountry;
    }

    public void setJp_addressCountry(String jp_addressCountry) {
        this.jp_addressCountry = jp_addressCountry;
    }

    public String getJp_addressEnterType() {
        return jp_addressEnterType;
    }

    public void setJp_addressEnterType(String jp_addressEnterType) {
        this.jp_addressEnterType = jp_addressEnterType;
    }

    public String getJp_addressRegion() {
        return jp_addressRegion;
    }

    public void setJp_addressRegion(String jp_addressRegion) {
        this.jp_addressRegion = jp_addressRegion;
    }

    public String getJp_addressRayon() {
        return jp_addressRayon;
    }

    public void setJp_addressRayon(String jp_addressRayon) {
        this.jp_addressRayon = jp_addressRayon;
    }

    public String getJp_addressSettlementType() {
        return jp_addressSettlementType;
    }

    public void setJp_addressSettlementType(String jp_addressSettlementType) {
        this.jp_addressSettlementType = jp_addressSettlementType;
    }

    public String getJp_addressCity() {
        return jp_addressCity;
    }

    public void setJp_addressCity(String jp_addressCity) {
        this.jp_addressCity = jp_addressCity;
    }

    public String getJp_addressSettlementText() {
        return jp_addressSettlementText;
    }

    public void setJp_addressSettlementText(String jp_addressSettlementText) {
        this.jp_addressSettlementText = jp_addressSettlementText;
    }

    public String getJp_addressSettlementDict() {
        return jp_addressSettlementDict;
    }

    public void setJp_addressSettlementDict(String jp_addressSettlementDict) {
        this.jp_addressSettlementDict = jp_addressSettlementDict;
    }

    public String getJp_addressStreetText() {
        return jp_addressStreetText;
    }

    public void setJp_addressStreetText(String jp_addressStreetText) {
        this.jp_addressStreetText = jp_addressStreetText;
    }

    public String getJp_addressStreetDict() {
        return jp_addressStreetDict;
    }

    public void setJp_addressStreetDict(String jp_addressStreetDict) {
        this.jp_addressStreetDict = jp_addressStreetDict;
    }

    public String getJp_addressHouse() {
        return jp_addressHouse;
    }

    public void setJp_addressHouse(String jp_addressHouse) {
        this.jp_addressHouse = jp_addressHouse;
    }

    public String getJp_addressKorpus() {
        return jp_addressKorpus;
    }

    public void setJp_addressKorpus(String jp_addressKorpus) {
        this.jp_addressKorpus = jp_addressKorpus;
    }

    public String getJp_addressFlat() {
        return jp_addressFlat;
    }

    public void setJp_addressFlat(String jp_addressFlat) {
        this.jp_addressFlat = jp_addressFlat;
    }

    public Date getDateDogSocNaim() {
        return dateDogSocNaim;
    }

    public void setDateDogSocNaim(Date dateDogSocNaim) {
        this.dateDogSocNaim = dateDogSocNaim;
    }

    public String getNoDogSocNaim() {
        return noDogSocNaim;
    }

    public void setNoDogSocNaim(String noDogSocNaim) {
        this.noDogSocNaim = noDogSocNaim;
    }

    public String getOrg_soc() {
        return org_soc;
    }

    public void setOrg_soc(String org_soc) {
        this.org_soc = org_soc;
    }

    public String getBed() {
        return bed == null ? "off" : bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getQt_bed() {
        return qt_bed;
    }

    public void setQt_bed(String qt_bed) {
        this.qt_bed = qt_bed;
    }

    public String getCost_bed() {
        return cost_bed;
    }

    public void setCost_bed(String cost_bed) {
        this.cost_bed = cost_bed;
    }

    public String getTable() {
        return table == null ? "off" : table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getQt_table() {
        return qt_table;
    }

    public void setQt_table(String qt_table) {
        this.qt_table = qt_table;
    }

    public String getCost_table() {
        return cost_table;
    }

    public void setCost_table(String cost_table) {
        this.cost_table = cost_table;
    }

    public String getWardrobe() {
        return wardrobe == null ? "off" : wardrobe;
    }

    public void setWardrobe(String wardrobe) {
        this.wardrobe = wardrobe;
    }

    public String getQt_wardrobe() {
        return qt_wardrobe;
    }

    public void setQt_wardrobe(String qt_wardrobe) {
        this.qt_wardrobe = qt_wardrobe;
    }

    public String getCost_wardrobe() {
        return cost_wardrobe;
    }

    public void setCost_wardrobe(String cost_wardrobe) {
        this.cost_wardrobe = cost_wardrobe;
    }

    public String getChair() {
        return chair == null ? "off" : chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getQt_chair() {
        return qt_chair;
    }

    public void setQt_chair(String qt_chair) {
        this.qt_chair = qt_chair;
    }

    public String getCost_chair() {
        return cost_chair;
    }

    public void setCost_chair(String cost_chair) {
        this.cost_chair = cost_chair;
    }

    public String getIcebox() {
        return icebox == null ? "off" : icebox;
    }

    public void setIcebox(String icebox) {
        this.icebox = icebox;
    }

    public String getQt_icebox() {
        return qt_icebox;
    }

    public void setQt_icebox(String qt_icebox) {
        this.qt_icebox = qt_icebox;
    }

    public String getCost_icebox() {
        return cost_icebox;
    }

    public void setCost_icebox(String cost_icebox) {
        this.cost_icebox = cost_icebox;
    }

    public String getGaz() {
        return gaz == null ? "off" : gaz;
    }

    public void setGaz(String gaz) {
        this.gaz = gaz;
    }

    public String getCost_gaz() {
        return cost_gaz;
    }

    public void setCost_gaz(String cost_gaz) {
        this.cost_gaz = cost_gaz;
    }

    public String getGku() {
        return gku == null ? "off" : gku;
    }

    public void setGku(String gku) {
        this.gku = gku;
    }

    public String getQt_gku() {
        return qt_gku;
    }

    public void setQt_gku(String qt_gku) {
        this.qt_gku = qt_gku;
    }

    public String getCost_gku() {
        return cost_gku;
    }

    public void setCost_gku(String cost_gku) {
        this.cost_gku = cost_gku;
    }

    public FileBean getCostGKUdocLoad() {
        return costGKUdocLoad;
    }

    public void setCostGKUdocLoad(FileBean costGKUdocLoad) {
        this.costGKUdocLoad = costGKUdocLoad;
    }

    public String getWayBenefit() {
        return wayBenefit;
    }

    public void setWayBenefit(String wayBenefit) {
        this.wayBenefit = wayBenefit;
    }

    public String getAddressBenefit() {
        return addressBenefit;
    }

    public void setAddressBenefit(String addressBenefit) {
        this.addressBenefit = addressBenefit;
    }

    public String getNameBankBenefit() {
        return nameBankBenefit;
    }

    public void setNameBankBenefit(String nameBankBenefit) {
        this.nameBankBenefit = nameBankBenefit;
    }

    public String getFilialBankBenefit() {
        return filialBankBenefit;
    }

    public void setFilialBankBenefit(String filialBankBenefit) {
        this.filialBankBenefit = filialBankBenefit;
    }

    public String getBikBankBenefit() {
        return bikBankBenefit;
    }

    public void setBikBankBenefit(String bikBankBenefit) {
        this.bikBankBenefit = bikBankBenefit;
    }

    public String getCorrAccBankBenefit() {
        return corrAccBankBenefit;
    }

    public void setCorrAccBankBenefit(String corrAccBankBenefit) {
        this.corrAccBankBenefit = corrAccBankBenefit;
    }

    public String getCodeFilialBankBenefit() {
        return codeFilialBankBenefit;
    }

    public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
        this.codeFilialBankBenefit = codeFilialBankBenefit;
    }

    public String getClientAccBankBenefit() {
        return clientAccBankBenefit;
    }

    public void setClientAccBankBenefit(String clientAccBankBenefit) {
        this.clientAccBankBenefit = clientAccBankBenefit;
    }

    public String getAgree() {
        return agree == null ? "off" : agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    // Методы автоочистки полей

    public Boolean getRepresentativeStatusChanged() {
        return representativeStatusChanged;
    }

    public void setRepresentativeStatusChanged(boolean representativeStatusChanged) {
        this.representativeStatusChanged = representativeStatusChanged;
    }

    public void clearApplicantAttributes() {
        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setBirthdate(null);
        this.setPhone("");
        this.setEmail("");
        this.setAddressIndex("");
        this.setAddressRegion("");
        this.setAddressRayon("");
        this.setAddressCity("");
        this.setAddressSettlementText("");
        this.setAddressSettlementDict("");
        this.setAddressStreetText("");
        this.setAddressStreetDict("");
        this.setAddressHouse("");
        this.setAddressKorpus("");
        this.setAddressFlat("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setAddressIndex(privateRoomDataContainer.getAddressIndex());
        this.setAddressRegion(privateRoomDataContainer.getAddressRegion());
        this.setAddressRayon(privateRoomDataContainer.getAddressRayon());
        this.setAddressCity(privateRoomDataContainer.getAddressCity());
        this.setAddressSettlementText(privateRoomDataContainer.getAddressSettlementText());
        this.setAddressSettlementDict(privateRoomDataContainer.getAddressSettlementDict());
        this.setAddressStreetText(privateRoomDataContainer.getAddressStreetText());
        this.setAddressStreetDict(privateRoomDataContainer.getAddressStreetDict());
        this.setAddressHouse(privateRoomDataContainer.getAddressHouse());
        this.setAddressKorpus(privateRoomDataContainer.getAddressKorpus());
        this.setAddressFlat(privateRoomDataContainer.getAddressFlat());
    }

    // для очистки полей (требуется для обработки возврата назад)
    private Boolean representativeStatusChanged = true;

    // для адресного блока
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressCountrySettlement;
    private String factAddressCountry = "643";
    private String factAddressCountryCode = "ru";
    private String factAddressCountryInput;
    private String factAddressCountrySettlement;
    private String rec_factAddressCountry = "643";
    private String rec_factAddressCountryCode = "ru";
    private String rec_factAddressCountryInput;
    private String rec_factAddressCountrySettlement;
    private String rec_addressCountry = "643";
    private String rec_addressCountryCode = "ru";
    private String rec_addressCountryInput;
    private String rec_addressCountrySettlement;
    private String jp_addressCountry = "643";
    private String jp_addressCountryCode = "ru";
    private String jp_addressCountryInput;
    private String jp_addressCountrySettlement;
    //
    private String address;
    private String otherAddress;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getJp_addressCountryCode() {
        return jp_addressCountryCode;
    }

    public void setJp_addressCountryCode(String jp_addressCountryCode) {
        this.jp_addressCountryCode = jp_addressCountryCode;
    }

    public String getJp_addressCountryInput() {
        return jp_addressCountryInput;
    }

    public void setJp_addressCountryInput(String jp_addressCountryInput) {
        this.jp_addressCountryInput = jp_addressCountryInput;
    }

    public String getJp_addressCountrySettlement() {
        return jp_addressCountrySettlement;
    }

    public void setJp_addressCountrySettlement(String jp_addressCountrySettlement) {
        this.jp_addressCountrySettlement = jp_addressCountrySettlement;
    }

    public String getRec_addressCountrySettlement() {
        return rec_addressCountrySettlement;
    }

    public void setRec_addressCountrySettlement(String rec_addressCountrySettlement) {
        this.rec_addressCountrySettlement = rec_addressCountrySettlement;
    }

    public String getRec_addressCountryInput() {
        return rec_addressCountryInput;
    }

    public void setRec_addressCountryInput(String rec_addressCountryInput) {
        this.rec_addressCountryInput = rec_addressCountryInput;
    }

    public String getRec_addressCountryCode() {
        return rec_addressCountryCode;
    }

    public void setRec_addressCountryCode(String rec_addressCountryCode) {
        this.rec_addressCountryCode = rec_addressCountryCode;
    }

    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }

    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }

    public String getFactAddressCountryInput() {
        return factAddressCountryInput;
    }

    public void setFactAddressCountryInput(String factAddressCountryInput) {
        this.factAddressCountryInput = factAddressCountryInput;
    }

    public String getFactAddressCountryCode() {
        return factAddressCountryCode;
    }

    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public String getRec_factAddressCountryCode() {
        return rec_factAddressCountryCode;
    }

    public void setRec_factAddressCountryCode(String rec_factAddressCountryCode) {
        this.rec_factAddressCountryCode = rec_factAddressCountryCode;
    }

    public String getRec_factAddressCountryInput() {
        return rec_factAddressCountryInput;
    }

    public void setRec_factAddressCountryInput(String rec_factAddressCountryInput) {
        this.rec_factAddressCountryInput = rec_factAddressCountryInput;
    }

    public String getRec_factAddressCountrySettlement() {
        return rec_factAddressCountrySettlement;
    }

    public void setRec_factAddressCountrySettlement(String rec_factAddressCountrySettlement) {
        this.rec_factAddressCountrySettlement = rec_factAddressCountrySettlement;
    }
}
