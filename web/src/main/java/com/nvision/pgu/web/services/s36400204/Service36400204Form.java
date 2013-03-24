package com.nvision.pgu.web.services.s36400204;


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
public class Service36400204Form extends AbstractServiceOrderForm {

    private String dov_enable;
    private String incapable_enable;
    private String dovCategory;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    private FileBean dovOpekLoad;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private Date birthdate;
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
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private String recipientLastName;
    private String recipientFirstName;
    private String recipientMiddleName;
    private Date recipientbirthdate;
    private String recipientaddressIndex;
    private String recipientaddressEnterType;
    private String recipientaddressRegion;
    private String recipientaddressRayon;
    private String recipientaddressCity;
    private String recipientaddressSettlementText;
    private String recipientaddressSettlementDict;
    private String recipientaddressStreetText;
    private String recipientaddressStreetDict;
    private String recipientaddressHouse;
    private String recipientaddressKorpus;
    private String recipientaddressFlat;
    private String recipientFactAdressIndex;
    private String recipientFactAdressEnterType;
    private String recipientFactAdressRegion;
    private String recipientFactAdressRayon;
    private String recipientFactAdressCity;
    private String recipientFactAdressSettlementText;
    private String recipientFactAdressSettlementDict;
    private String recipientFactAdressementDict;
    private String recipientFactAdressStreetText;
    private String recipientFactAdressStreetDict;
    private String recipientFactAdressHouse;
    private String recipientFactAdressKorpus;
    private String recipientFactAdressFlat;
    private String recipientPassSeria;
    private String recipientPassNo;
    private Date recipientPassDate;
    private String recipientPassFrom;
    private FileBean recipientIdentityDocLoad;
    private String socialSupport;
    private String accrualMethod;
    private String nameBankBenefit;
    private String filialBankBenefit;
    private String bikBankBenefit;
    private String corrAccBankBenefit;
    private String codeFilialBankBenefit;
    private String clientAccBankBenefit;
    private String postOffice;
    private FileBean honoraryCitizenLoad;
    private FileBean certificateLackSupportLoad;
    private String agreementApplicant;
    // для адресного блока
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressSettlementType = "1";
    private String addressCountrySettlement;
    private String factAddressCountry = "643";
    private String factAddressCountryCode = "ru";
    private String factAddressCountryInput;
    private String factAddressSettlementType = "1";
    private String factAddressCountrySettlement;
    private String recipientaddressCountry = "643";
    private String recipientaddressCountryCode = "ru";
    private String recipientaddressCountryInput;
    private String recipientaddressSettlementType = "1";
    private String recipientaddressCountrySettlement;
    private String recipientFactAdressCountry = "643";
    private String recipientFactAdressCountryCode = "ru";
    private String recipientFactAdressCountryInput;
    private String recipientFactAdressSettlementType = "1";
    private String recipientFactAdressCountrySettlement;
    //
    private String identityDocType = "Паспорт гражданина РФ";
    // для очистки полей (требуется для обработки возврата назад)
    private Boolean representativeStatusChanged = true;

    public String getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getRecipientAddressCountryCode() {
        return recipientaddressCountryCode;
    }

    public void setRecipientAddressCountryCode(String recipientaddressCountryCode) {
        this.recipientaddressCountryCode = recipientaddressCountryCode;
    }

    public String getRecipientaddressIndex() {
        return recipientaddressIndex;
    }

    public void setRecipientaddressIndex(String recipientaddressIndex) {
        this.recipientaddressIndex = recipientaddressIndex;
    }

    public String getRecipientaddressEnterType() {
        return recipientaddressEnterType;
    }

    public void setRecipientaddressEnterType(String recipientaddressEnterType) {
        this.recipientaddressEnterType = recipientaddressEnterType;
    }

    public String getRecipientaddressRegion() {
        return recipientaddressRegion;
    }

    public void setRecipientaddressRegion(String recipientaddressRegion) {
        this.recipientaddressRegion = recipientaddressRegion;
    }

    public String getRecipientaddressRayon() {
        return recipientaddressRayon;
    }

    public void setRecipientaddressRayon(String recipientaddressRayon) {
        this.recipientaddressRayon = recipientaddressRayon;
    }

    public String getRecipientaddressCity() {
        return recipientaddressCity;
    }

    public void setRecipientaddressCity(String recipientaddressCity) {
        this.recipientaddressCity = recipientaddressCity;
    }

    public String getRecipientaddressSettlementText() {
        return recipientaddressSettlementText;
    }

    public void setRecipientaddressSettlementText(String recipientaddressSettlementText) {
        this.recipientaddressSettlementText = recipientaddressSettlementText;
    }

    public String getRecipientaddressSettlementDict() {
        return recipientaddressSettlementDict;
    }

    public void setRecipientaddressSettlementDict(String recipientaddressSettlementDict) {
        this.recipientaddressSettlementDict = recipientaddressSettlementDict;
    }

    public String getRecipientaddressStreetText() {
        return recipientaddressStreetText;
    }

    public void setRecipientaddressStreetText(String recipientaddressStreetText) {
        this.recipientaddressStreetText = recipientaddressStreetText;
    }

    public String getRecipientaddressStreetDict() {
        return recipientaddressStreetDict;
    }

    public void setRecipientaddressStreetDict(String recipientaddressStreetDict) {
        this.recipientaddressStreetDict = recipientaddressStreetDict;
    }

    public String getRecipientaddressHouse() {
        return recipientaddressHouse;
    }

    public void setRecipientaddressHouse(String recipientaddressHouse) {
        this.recipientaddressHouse = recipientaddressHouse;
    }

    public String getRecipientaddressKorpus() {
        return recipientaddressKorpus;
    }

    public void setRecipientaddressKorpus(String recipientaddressKorpus) {
        this.recipientaddressKorpus = recipientaddressKorpus;
    }

    public String getRecipientaddressFlat() {
        return recipientaddressFlat;
    }

    public void setRecipientaddressFlat(String recipientaddressFlat) {
        this.recipientaddressFlat = recipientaddressFlat;
    }

    public String getRecipientFactAdressIndex() {
        return recipientFactAdressIndex;
    }

    public void setRecipientFactAdressIndex(String recipientFactAdressIndex) {
        this.recipientFactAdressIndex = recipientFactAdressIndex;
    }

    public String getRecipientFactAdressEnterType() {
        return recipientFactAdressEnterType;
    }

    public void setRecipientFactAdressEnterType(String recipientFactAdressEnterType) {
        this.recipientFactAdressEnterType = recipientFactAdressEnterType;
    }

    public String getRecipientFactAdressRegion() {
        return recipientFactAdressRegion;
    }

    public void setRecipientFactAdressRegion(String recipientFactAdressRegion) {
        this.recipientFactAdressRegion = recipientFactAdressRegion;
    }

    public String getRecipientFactAdressRayon() {
        return recipientFactAdressRayon;
    }

    public void setRecipientFactAdressRayon(String recipientFactAdressRayon) {
        this.recipientFactAdressRayon = recipientFactAdressRayon;
    }

    public String getRecipientFactAdressCity() {
        return recipientFactAdressCity;
    }

    public void setRecipientFactAdressCity(String recipientFactAdressCity) {
        this.recipientFactAdressCity = recipientFactAdressCity;
    }

    public String getRecipientFactAdressSettlementText() {
        return recipientFactAdressSettlementText;
    }

    public void setRecipientFactAdressSettlementText(String recipientFactAdressSettlementText) {
        this.recipientFactAdressSettlementText = recipientFactAdressSettlementText;
    }

    public String getRecipientFactAdressSettlementDict() {
        return recipientFactAdressSettlementDict;
    }

    public void setRecipientFactAdressSettlementDict(String recipientFactAdressSettlementDict) {
        this.recipientFactAdressSettlementDict = recipientFactAdressSettlementDict;
    }

    public String getRecipientFactAdressementDict() {
        return recipientFactAdressementDict;
    }

    public void setRecipientFactAdressementDict(String recipientFactAdressementDict) {
        this.recipientFactAdressementDict = recipientFactAdressementDict;
    }

    public String getRecipientFactAdressStreetText() {
        return recipientFactAdressStreetText;
    }

    public void setRecipientFactAdressStreetText(String recipientFactAdressStreetText) {
        this.recipientFactAdressStreetText = recipientFactAdressStreetText;
    }

    public String getRecipientFactAdressStreetDict() {
        return recipientFactAdressStreetDict;
    }

    public void setRecipientFactAdressStreetDict(String recipientFactAdressStreetDict) {
        this.recipientFactAdressStreetDict = recipientFactAdressStreetDict;
    }

    public String getRecipientFactAdressHouse() {
        return recipientFactAdressHouse;
    }

    public void setRecipientFactAdressHouse(String recipientFactAdressHouse) {
        this.recipientFactAdressHouse = recipientFactAdressHouse;
    }

    public String getRecipientFactAdressKorpus() {
        return recipientFactAdressKorpus;
    }

    public void setRecipientFactAdressKorpus(String recipientFactAdressKorpus) {
        this.recipientFactAdressKorpus = recipientFactAdressKorpus;
    }

    public String getRecipientFactAdressFlat() {
        return recipientFactAdressFlat;
    }

    public void setRecipientFactAdressFlat(String recipientFactAdressFlat) {
        this.recipientFactAdressFlat = recipientFactAdressFlat;
    }

    public String getRecipientaddressCountry() {
        return recipientaddressCountry;
    }

    public void setRecipientaddressCountry(String recipientaddressCountry) {
        this.recipientaddressCountry = recipientaddressCountry;
    }

    public String getRecipientaddressCountryCode() {
        return recipientaddressCountryCode;
    }

    public void setRecipientaddressCountryCode(String recipientaddressCountryCode) {
        this.recipientaddressCountryCode = recipientaddressCountryCode;
    }

    public String getRecipientaddressCountryInput() {
        return recipientaddressCountryInput;
    }

    public void setRecipientaddressCountryInput(String recipientaddressCountryInput) {
        this.recipientaddressCountryInput = recipientaddressCountryInput;
    }

    public String getRecipientaddressSettlementType() {
        return recipientaddressSettlementType;
    }

    public void setRecipientaddressSettlementType(String recipientaddressSettlementType) {
        this.recipientaddressSettlementType = recipientaddressSettlementType;
    }

    public String getRecipientaddressCountrySettlement() {
        return recipientaddressCountrySettlement;
    }

    public void setRecipientaddressCountrySettlement(String recipientaddressCountrySettlement) {
        this.recipientaddressCountrySettlement = recipientaddressCountrySettlement;
    }

    public String getRecipientFactAdressCountry() {
        return recipientFactAdressCountry;
    }

    public void setRecipientFactAdressCountry(String recipientFactAdressCountry) {
        this.recipientFactAdressCountry = recipientFactAdressCountry;
    }

    public String getRecipientFactAdressCountryCode() {
        return recipientFactAdressCountryCode;
    }

    public void setRecipientFactAdressCountryCode(String recipientFactAdressCountryCode) {
        this.recipientFactAdressCountryCode = recipientFactAdressCountryCode;
    }

    public String getRecipientFactAdressCountryInput() {
        return recipientFactAdressCountryInput;
    }

    public void setRecipientFactAdressCountryInput(String recipientFactAdressCountryInput) {
        this.recipientFactAdressCountryInput = recipientFactAdressCountryInput;
    }

    public String getRecipientFactAdressSettlementType() {
        return recipientFactAdressSettlementType;
    }

    public void setRecipientFactAdressSettlementType(String recipientFactAdressSettlementType) {
        this.recipientFactAdressSettlementType = recipientFactAdressSettlementType;
    }

    public String getRecipientFactAdressCountrySettlement() {
        return recipientFactAdressCountrySettlement;
    }

    public void setRecipientFactAdressCountrySettlement(String recipientFactAdressCountrySettlement) {
        this.recipientFactAdressCountrySettlement = recipientFactAdressCountrySettlement;
    }

    public String getRecipientAddressCountry() {
        return recipientaddressCountry;
    }

    public void setRecipientAddressCountry(String recipientaddressCountry) {
        this.recipientaddressCountry = recipientaddressCountry;
    }

    public String getRecipientAddressCountryInput() {
        return recipientaddressCountryInput;
    }

    public void setRecipientAddressCountryInput(String recipientaddressCountryInput) {
        this.recipientaddressCountryInput = recipientaddressCountryInput;
    }

    public String getRecipientAddressCountrySettlement() {
        return recipientaddressCountrySettlement;
    }

    public void setRecipientAddressCountrySettlement(String recipientaddressCountrySettlement) {
        this.recipientaddressCountrySettlement = recipientaddressCountrySettlement;
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

    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }

    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }

    public String getAgreementApplicant() {
        return agreementApplicant == null ? "off" : agreementApplicant;
    }

    public void setAgreementApplicant(String agreementApplicant) {
        this.agreementApplicant = agreementApplicant;
    }

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

    public String getDovCategory() {
        return dovCategory;
    }

    public void setDovCategory(String dovCategory) {
        this.dovCategory = dovCategory;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
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

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
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

    public Date getRecipientbirthdate() {
        return recipientbirthdate;
    }

    public void setRecipientbirthdate(Date recipientbirthdate) {
        this.recipientbirthdate = recipientbirthdate;
    }

    public String getRecipientAddressIndex() {
        return recipientaddressIndex;
    }

    public void setRecipientAddressIndex(String recipientaddressIndex) {
        this.recipientaddressIndex = recipientaddressIndex;
    }

    public String getRecipientAddressEnterType() {
        return recipientaddressEnterType;
    }

    public void setRecipientAddressEnterType(String recipientaddressEnterType) {
        this.recipientaddressEnterType = recipientaddressEnterType;
    }

    public String getRecipientAddressRegion() {
        return recipientaddressRegion;
    }

    public void setRecipientAddressRegion(String recipientaddressRegion) {
        this.recipientaddressRegion = recipientaddressRegion;
    }

    public String getRecipientAddressRayon() {
        return recipientaddressRayon;
    }

    public void setRecipientAddressRayon(String recipientaddressRayon) {
        this.recipientaddressRayon = recipientaddressRayon;
    }

    public String getRecipientAddressCity() {
        return recipientaddressCity;
    }

    public void setRecipientAddressCity(String recipientaddressCity) {
        this.recipientaddressCity = recipientaddressCity;
    }

    public String getRecipientAddressSettlementText() {
        return recipientaddressSettlementText;
    }

    public void setRecipientAddressSettlementText(String recipientaddressSettlementText) {
        this.recipientaddressSettlementText = recipientaddressSettlementText;
    }

    public String getRecipientAddressSettlementDict() {
        return recipientaddressSettlementDict;
    }

    public void setRecipientAddressSettlementDict(String recipientaddressSettlementDict) {
        this.recipientaddressSettlementDict = recipientaddressSettlementDict;
    }

    public String getRecipientAddressStreetText() {
        return recipientaddressStreetText;
    }

    public void setRecipientAddressStreetText(String recipientaddressStreetText) {
        this.recipientaddressStreetText = recipientaddressStreetText;
    }

    public String getRecipientAddressStreetDict() {
        return recipientaddressStreetDict;
    }

    public void setRecipientAddressStreetDict(String recipientaddressStreetDict) {
        this.recipientaddressStreetDict = recipientaddressStreetDict;
    }

    public String getRecipientAddressHouse() {
        return recipientaddressHouse;
    }

    public void setRecipientAddressHouse(String recipientaddressHouse) {
        this.recipientaddressHouse = recipientaddressHouse;
    }

    public String getRecipientAddressKorpus() {
        return recipientaddressKorpus;
    }

    public void setRecipientAddressKorpus(String recipientaddressKorpus) {
        this.recipientaddressKorpus = recipientaddressKorpus;
    }

    public String getRecipientAddressFlat() {
        return recipientaddressFlat;
    }

    public void setRecipientAddressFlat(String recipientaddressFlat) {
        this.recipientaddressFlat = recipientaddressFlat;
    }

    public String getRecipientAddressSettlementType() {
        return recipientaddressSettlementType;
    }

    public void setRecipientAddressSettlementType(String recipientaddressSettlementType) {
        this.recipientaddressSettlementType = recipientaddressSettlementType;
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

    public String getSocialSupport() {
        return socialSupport;
    }

    public void setSocialSupport(String socialSupport) {
        this.socialSupport = socialSupport;
    }

    public String getAccrualMethod() {
        return accrualMethod;
    }

    public void setAccrualMethod(String accrualMethod) {
        this.accrualMethod = accrualMethod;
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

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public FileBean getHonoraryCitizenLoad() {
        return honoraryCitizenLoad;
    }

    public void setHonoraryCitizenLoad(FileBean honoraryCitizenLoad) {
        this.honoraryCitizenLoad = honoraryCitizenLoad;
    }

    public FileBean getCertificateLackSupportLoad() {
        return certificateLackSupportLoad;
    }

    public void setCertificateLackSupportLoad(FileBean certificateLackSupportLoad) {
        this.certificateLackSupportLoad = certificateLackSupportLoad;
    }

    public Boolean getRepresentativeStatusChanged() {
        return representativeStatusChanged;
    }

    public void setRepresentativeStatusChanged(Boolean representativeStatusChanged) {
        this.representativeStatusChanged = representativeStatusChanged;
    }

    public void clearApplicantAttributes() {
        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setBirthdate(null);
        this.setPhone("");
        this.setEmail("");
//        this.setAddressIndex("");
//        this.setAddressRegion("");
//        this.setAddressRayon("");
//        this.setAddressCity("");
//        this.setAddressSettlementText("");
//        this.setAddressSettlementDict("");
//        this.setAddressStreetText("");
//        this.setAddressStreetDict("");
//        this.setAddressHouse("");
//        this.setAddressKorpus("");
//        this.setAddressFlat("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
//        this.setAddressIndex(privateRoomDataContainer.getAddressIndex());
//        this.setAddressRegion(privateRoomDataContainer.getAddressRegion());
//        this.setAddressRayon(privateRoomDataContainer.getAddressRayon());
//        this.setAddressCity(privateRoomDataContainer.getAddressCity());
//        this.setAddressSettlementText(privateRoomDataContainer.getAddressSettlementText());
//        this.setAddressSettlementDict(privateRoomDataContainer.getAddressSettlementDict());
//        this.setAddressStreetText(privateRoomDataContainer.getAddressStreetText());
//        this.setAddressStreetDict(privateRoomDataContainer.getAddressStreetDict());
//        this.setAddressHouse(privateRoomDataContainer.getAddressHouse());
//        this.setAddressKorpus(privateRoomDataContainer.getAddressKorpus());
//        this.setAddressFlat(privateRoomDataContainer.getAddressFlat());
    }
}
