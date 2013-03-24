package com.nvision.pgu.web.services.s36400203;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400203Form extends AbstractServiceOrderForm {

    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
    private String address; // дополнительное поле адресного блока
    private String factAddressCountryCode = "ru"; // дополнительное поле адресного блока
    private String factAddressCountry = "643";
    private String factAddressCountryInput;  // дополнительное поле адресного блока
    private String factAddressCountrySettlement;  // дополнительное поле адресного блока
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
    private String socialSupport;
    private String accrualMethod;
    private String nameBankBenefit;
    private String filialBankBenefit;
    private String bikBankBenefit;
    private String corrAccBankBenefit;
    private String codeFilialBankBenefit;
    private String clientAccBankBenefit;
    private String postOffice;
    private FileBean rehabilitationCertificateLoad;
    private FileBean deathCertificateLoad;
    private FileBean certificatePaymentLoad;

    public String getFactAddressCountryCode() {
        return factAddressCountryCode;
    }

    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getFactAddressIndex() {
        return this.factAddressIndex;
    }

    public void setFactAddressIndex(String factAddressIndex) {
        this.factAddressIndex = factAddressIndex;
    }

    public String getFactAddressEnterType() {
        return this.factAddressEnterType;
    }

    public void setFactAddressEnterType(String factAddressEnterType) {
        this.factAddressEnterType = factAddressEnterType;
    }

    public String getFactAddressRegion() {
        return this.factAddressRegion;
    }

    public void setFactAddressRegion(String factAddressRegion) {
        this.factAddressRegion = factAddressRegion;
    }

    public String getFactAddressRayon() {
        return this.factAddressRayon;
    }

    public void setFactAddressRayon(String factAddressRayon) {
        this.factAddressRayon = factAddressRayon;
    }

    public String getFactAddressSettlementType() {
        return this.factAddressSettlementType;
    }

    public void setFactAddressSettlementType(String factAddressSettlementType) {
        this.factAddressSettlementType = factAddressSettlementType;
    }

    public String getFactAddressCity() {
        return this.factAddressCity;
    }

    public void setFactAddressCity(String factAddressCity) {
        this.factAddressCity = factAddressCity;
    }

    public String getFactAddressSettlementText() {
        return this.factAddressSettlementText;
    }

    public void setFactAddressSettlementText(String factAddressSettlementText) {
        this.factAddressSettlementText = factAddressSettlementText;
    }

    public String getFactAddressSettlementDict() {
        return this.factAddressSettlementDict;
    }

    public void setFactAddressSettlementDict(String factAddressSettlementDict) {
        this.factAddressSettlementDict = factAddressSettlementDict;
    }

    public String getFactAddressStreetText() {
        return this.factAddressStreetText;
    }

    public void setFactAddressStreetText(String factAddressStreetText) {
        this.factAddressStreetText = factAddressStreetText;
    }

    public String getFactAddressStreetDict() {
        return this.factAddressStreetDict;
    }

    public void setFactAddressStreetDict(String factAddressStreetDict) {
        this.factAddressStreetDict = factAddressStreetDict;
    }

    public String getFactAddressHouse() {
        return this.factAddressHouse;
    }

    public void setFactAddressHouse(String factAddressHouse) {
        this.factAddressHouse = factAddressHouse;
    }

    public String getFactAddressKorpus() {
        return this.factAddressKorpus;
    }

    public void setFactAddressKorpus(String factAddressKorpus) {
        this.factAddressKorpus = factAddressKorpus;
    }

    public String getFactAddressFlat() {
        return this.factAddressFlat;
    }

    public void setFactAddressFlat(String factAddressFlat) {
        this.factAddressFlat = factAddressFlat;
    }

    public String getNameBankBenefit() {
        return this.nameBankBenefit;
    }

    public void setNameBankBenefit(String nameBankBenefit) {
        this.nameBankBenefit = nameBankBenefit;
    }

    public String getFilialBankBenefit() {
        return this.filialBankBenefit;
    }

    public void setFilialBankBenefit(String filialBankBenefit) {
        this.filialBankBenefit = filialBankBenefit;
    }

    public String getBikBankBenefit() {
        return this.bikBankBenefit;
    }

    public void setBikBankBenefit(String bikBankBenefit) {
        this.bikBankBenefit = bikBankBenefit;
    }

    public String getCorrAccBankBenefit() {
        return this.corrAccBankBenefit;
    }

    public void setCorrAccBankBenefit(String corrAccBankBenefit) {
        this.corrAccBankBenefit = corrAccBankBenefit;
    }

    public String getCodeFilialBankBenefit() {
        return this.codeFilialBankBenefit;
    }

    public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
        this.codeFilialBankBenefit = codeFilialBankBenefit;
    }

    public String getClientAccBankBenefit() {
        return this.clientAccBankBenefit;
    }

    public void setClientAccBankBenefit(String clientAccBankBenefit) {
        this.clientAccBankBenefit = clientAccBankBenefit;
    }

    public String getPostOffice() {
        return this.postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public FileBean getRehabilitationCertificateLoad() {
        return this.rehabilitationCertificateLoad;
    }

    public void setRehabilitationCertificateLoad(FileBean rehabilitationCertificateLoad) {
        this.rehabilitationCertificateLoad = rehabilitationCertificateLoad;
    }

    public FileBean getDeathCertificateLoad() {
        return this.deathCertificateLoad;
    }

    public void setDeathCertificateLoad(FileBean deathCertificateLoad) {
        this.deathCertificateLoad = deathCertificateLoad;
    }

    public FileBean getCertificatePaymentLoad() {
        return this.certificatePaymentLoad;
    }

    public void setCertificatePaymentLoad(FileBean certificatePaymentLoad) {
        this.certificatePaymentLoad = certificatePaymentLoad;
    }


}
