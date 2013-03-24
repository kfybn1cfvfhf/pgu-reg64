package com.nvision.pgu.web.services.s36400240;


import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400240Form extends AbstractServiceOrderForm {


    private String incapable_enable;
    private FileBean dovOpekLoad;
    //
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
    //
    private String identityDocType = "Паспорт гражданина РФ";
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    //
    private String recipientLastName;
    private String recipientFirstName;
    private String recipientMiddleName;
    //
    private String recipientIdentityDocType = "Паспорт гражданина РФ";
    private String recipientPassSeria;
    private String recipientPassNo;
    private Date recipientPassDate;
    private String recipientPassFrom;
    private FileBean recipientIdentityDocLoad;
    //
    private String socNo;
    private Date socDate;
    private String socFio;
    //
    private String addressPostIndex;
    private String addressPostEnterType;
    private String addressPostRegion;
    private String addressPostRayon;
    private String addressPostCity;
    private String addressPostSettlementText;
    private String addressPostSettlementDict;
    private String addressPostStreetText;
    private String addressPostStreetDict;
    private String addressPostHouse;
    private String addressPostKorpus;
    private String addressPostFlat;
    private String addressPostCountry = "643";
    private String addressPostCountryCode = "ru";
    private String addressPostCountryInput;
    private String addressPostSettlementType = "1";
    private String addressPostCountrySettlement;
    //
    private String addressRentIndex;
    private String addressRentEnterType;
    private String addressRentRegion;
    private String addressRentRayon;
    private String addressRentCity;
    private String addressRentSettlementText;
    private String addressRentSettlementDict;
    private String addressRentStreetText;
    private String addressRentStreetDict;
    private String addressRentHouse;
    private String addressRentKorpus;
    private String addressRentFlat;
    private String addressRentCountry = "643";
    private String addressRentCountryCode = "ru";
    private String addressRentCountryInput;
    private String addressRentSettlementType = "1";
    private String addressRentCountrySettlement;
    //
    private Boolean incapable_enable_changed = true;
    private String otherAddress;

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getAddressPostIndex() {
        return addressPostIndex;
    }

    public void setAddressPostIndex(String addressPostIndex) {
        this.addressPostIndex = addressPostIndex;
    }

    public String getAddressPostEnterType() {
        return addressPostEnterType;
    }

    public void setAddressPostEnterType(String addressPostEnterType) {
        this.addressPostEnterType = addressPostEnterType;
    }

    public String getAddressPostRegion() {
        return addressPostRegion;
    }

    public void setAddressPostRegion(String addressPostRegion) {
        this.addressPostRegion = addressPostRegion;
    }

    public String getAddressPostRayon() {
        return addressPostRayon;
    }

    public void setAddressPostRayon(String addressPostRayon) {
        this.addressPostRayon = addressPostRayon;
    }

    public String getAddressPostCity() {
        return addressPostCity;
    }

    public void setAddressPostCity(String addressPostCity) {
        this.addressPostCity = addressPostCity;
    }

    public String getAddressPostSettlementText() {
        return addressPostSettlementText;
    }

    public void setAddressPostSettlementText(String addressPostSettlementText) {
        this.addressPostSettlementText = addressPostSettlementText;
    }

    public String getAddressPostSettlementDict() {
        return addressPostSettlementDict;
    }

    public void setAddressPostSettlementDict(String addressPostSettlementDict) {
        this.addressPostSettlementDict = addressPostSettlementDict;
    }

    public String getAddressPostStreetText() {
        return addressPostStreetText;
    }

    public void setAddressPostStreetText(String addressPostStreetText) {
        this.addressPostStreetText = addressPostStreetText;
    }

    public String getAddressPostStreetDict() {
        return addressPostStreetDict;
    }

    public void setAddressPostStreetDict(String addressPostStreetDict) {
        this.addressPostStreetDict = addressPostStreetDict;
    }

    public String getAddressPostHouse() {
        return addressPostHouse;
    }

    public void setAddressPostHouse(String addressPostHouse) {
        this.addressPostHouse = addressPostHouse;
    }

    public String getAddressPostKorpus() {
        return addressPostKorpus;
    }

    public void setAddressPostKorpus(String addressPostKorpus) {
        this.addressPostKorpus = addressPostKorpus;
    }

    public String getAddressPostFlat() {
        return addressPostFlat;
    }

    public void setAddressPostFlat(String addressPostFlat) {
        this.addressPostFlat = addressPostFlat;
    }

    public String getAddressPostCountry() {
        return addressPostCountry;
    }

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
    }

    public String getAddressPostCountryCode() {
        return addressPostCountryCode;
    }

    public void setAddressPostCountryCode(String addressPostCountryCode) {
        this.addressPostCountryCode = addressPostCountryCode;
    }

    public String getAddressPostCountryInput() {
        return addressPostCountryInput;
    }

    public void setAddressPostCountryInput(String addressPostCountryInput) {
        this.addressPostCountryInput = addressPostCountryInput;
    }

    public String getAddressPostSettlementType() {
        return addressPostSettlementType;
    }

    public void setAddressPostSettlementType(String addressPostSettlementType) {
        this.addressPostSettlementType = addressPostSettlementType;
    }

    public String getAddressPostCountrySettlement() {
        return addressPostCountrySettlement;
    }

    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
    }

    public String getAddressRentIndex() {
        return addressRentIndex;
    }

    public void setAddressRentIndex(String addressRentIndex) {
        this.addressRentIndex = addressRentIndex;
    }

    public String getAddressRentEnterType() {
        return addressRentEnterType;
    }

    public void setAddressRentEnterType(String addressRentEnterType) {
        this.addressRentEnterType = addressRentEnterType;
    }

    public String getAddressRentRegion() {
        return addressRentRegion;
    }

    public void setAddressRentRegion(String addressRentRegion) {
        this.addressRentRegion = addressRentRegion;
    }

    public String getAddressRentRayon() {
        return addressRentRayon;
    }

    public void setAddressRentRayon(String addressRentRayon) {
        this.addressRentRayon = addressRentRayon;
    }

    public String getAddressRentCity() {
        return addressRentCity;
    }

    public void setAddressRentCity(String addressRentCity) {
        this.addressRentCity = addressRentCity;
    }

    public String getAddressRentSettlementText() {
        return addressRentSettlementText;
    }

    public void setAddressRentSettlementText(String addressRentSettlementText) {
        this.addressRentSettlementText = addressRentSettlementText;
    }

    public String getAddressRentSettlementDict() {
        return addressRentSettlementDict;
    }

    public void setAddressRentSettlementDict(String addressRentSettlementDict) {
        this.addressRentSettlementDict = addressRentSettlementDict;
    }

    public String getAddressRentStreetText() {
        return addressRentStreetText;
    }

    public void setAddressRentStreetText(String addressRentStreetText) {
        this.addressRentStreetText = addressRentStreetText;
    }

    public String getAddressRentStreetDict() {
        return addressRentStreetDict;
    }

    public void setAddressRentStreetDict(String addressRentStreetDict) {
        this.addressRentStreetDict = addressRentStreetDict;
    }

    public String getAddressRentHouse() {
        return addressRentHouse;
    }

    public void setAddressRentHouse(String addressRentHouse) {
        this.addressRentHouse = addressRentHouse;
    }

    public String getAddressRentKorpus() {
        return addressRentKorpus;
    }

    public void setAddressRentKorpus(String addressRentKorpus) {
        this.addressRentKorpus = addressRentKorpus;
    }

    public String getAddressRentFlat() {
        return addressRentFlat;
    }

    public void setAddressRentFlat(String addressRentFlat) {
        this.addressRentFlat = addressRentFlat;
    }

    public String getAddressRentCountry() {
        return addressRentCountry;
    }

    public void setAddressRentCountry(String addressRentCountry) {
        this.addressRentCountry = addressRentCountry;
    }

    public String getAddressRentCountryCode() {
        return addressRentCountryCode;
    }

    public void setAddressRentCountryCode(String addressRentCountryCode) {
        this.addressRentCountryCode = addressRentCountryCode;
    }

    public String getAddressRentCountryInput() {
        return addressRentCountryInput;
    }

    public void setAddressRentCountryInput(String addressRentCountryInput) {
        this.addressRentCountryInput = addressRentCountryInput;
    }

    public String getAddressRentSettlementType() {
        return addressRentSettlementType;
    }

    public void setAddressRentSettlementType(String addressRentSettlementType) {
        this.addressRentSettlementType = addressRentSettlementType;
    }

    public String getAddressRentCountrySettlement() {
        return addressRentCountrySettlement;
    }

    public void setAddressRentCountrySettlement(String addressRentCountrySettlement) {
        this.addressRentCountrySettlement = addressRentCountrySettlement;
    }

    public Boolean getIncapable_enable_changed() {
        return incapable_enable_changed;
    }

    public void setIncapable_enable_changed(Boolean incapable_enable_changed) {
        this.incapable_enable_changed = incapable_enable_changed;
    }

    // требуется для словаря, который определяет последующие шаги, однако может не появитсья на форме
    public String getIncapable_enable() {
        return incapable_enable == null ? "off" : incapable_enable;
    }

    public void setIncapable_enable(String incapable_enable) {
        if (this.incapable_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (incapable_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getIncapable_enable())) { // ... а в форме сохранён on
                    this.setIncapable_enable_changed(true);
                }
                this.incapable_enable = "off";
            } else {
                if (!this.getIncapable_enable().equals(incapable_enable)) {
                    this.setIncapable_enable_changed(true);
                }
                this.incapable_enable = incapable_enable;
            }
        } else {
            this.incapable_enable = incapable_enable;
        }
    }

    public String getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getRecipientIdentityDocType() {
        return recipientIdentityDocType;
    }

    public void setRecipientIdentityDocType(String recipientIdentityDocType) {
        this.recipientIdentityDocType = recipientIdentityDocType;
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

    public String getSocNo() {
        return socNo;
    }

    public void setSocNo(String socNo) {
        this.socNo = socNo;
    }

    public Date getSocDate() {
        return socDate;
    }

    public void setSocDate(Date socDate) {
        this.socDate = socDate;
    }

    public String getSocFio() {
        return socFio;
    }

    public void setSocFio(String socFio) {
        this.socFio = socFio;
    }
}
