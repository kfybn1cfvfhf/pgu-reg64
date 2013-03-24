package com.nvision.pgu.web.services.s36400236;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400236Form extends AbstractServiceOrderForm {


    private String dov_enable; //checkbox
    private String incapable_enable; //checkbox
    private String catAppl;
    private String familyCh;         //checkbox
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    private FileBean dovOpekLoad;
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
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private String recipientLastName;
    private String recipientFirstName;
    private String recipientMiddleName;
    private String recipientPhone;
    private String recipientEmail;
    private String recipientPostIndex;
    private String recipientPostEnterType;
    private String recipientPostRegion;
    private String recipientPostRayon;
    private String recipientPostCity;
    private String recipientPostSettlementText;
    private String recipientPostSettlementDict;
    private String recipientPostStreetText;
    private String recipientPostStreetDict;
    private String recipientPostHouse;
    private String recipientPostKorpus;
    private String recipientPostFlat;
    private String recipientPassSeria;
    private String recipientPassNo;
    private Date recipientPassDate;
    private String recipientPassFrom;
    private FileBean recipientIdentityDocLoad;
    private List<String> famQuantity = AccessCounterList.createEmpty(String.class);         // клон
    private List<String> famlastName = AccessCounterList.createEmpty(String.class);  // клон
    private List<String> famfirstName = AccessCounterList.createEmpty(String.class); // клон
    private List<String> fammiddleName = AccessCounterList.createEmpty(String.class); // клон
    private List<Date> fambirthdate = AccessCounterList.createEmpty(Date.class); // клон
    private List<String> famkin = AccessCounterList.createEmpty(String.class); // клон
    private List<FileBean> famIdentityDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private List<FileBean> sostavDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private List<FileBean> agree1DocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private String divorceCh;                  //checkbox
    private String dopPravZhil;                //checkbox
    private String egrpNoCh;                   //checkbox
    private FileBean birthDocLoad;
    private List<FileBean> techDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private List<FileBean> pravoDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private List<FileBean> dopDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private List<FileBean> regDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private FileBean workDocLoad;
    private List<FileBean> incomeDocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    private FileBean marryDocLoad;
    private List<FileBean> pravo1DocLoad = AccessCounterList.createEmpty(FileBean.class); // множ
    // для адресного блока
    private String addressPostCountry = "643";
    private String addressPostCountryCode = "ru";
    private String addressPostCountryInput;
    private String addressPostSettlementType = "1";
    private String addressPostCountrySettlement;
    private String recipientPostCountry = "643";
    private String recipientPostCountryCode = "ru";
    private String recipientPostCountryInput;
    private String recipientPostSettlementType = "1";
    private String recipientPostCountrySettlement;
    //
    // для очистки полей (требуется для обработки возврата назад)
    private Boolean representativeStatusChanged = true;

    public void clearApplicantAttributes() {
        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setEmail("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
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

    public String getCatAppl() {
        return catAppl;
    }

    public void setCatAppl(String catAppl) {
        this.catAppl = catAppl;
    }

    public String getFamilyCh() {
        return familyCh == null ? "off" : familyCh;
    }

    public void setFamilyCh(String familyCh) {
        this.familyCh = familyCh;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<String> getFamQuantity() {
        return normalize(famQuantity);
    }

    public void setFamQuantity(List<String> famQuantity) {
        this.famQuantity = AccessCounterList.decorate(famQuantity, String.class);
    }

    public List<String> getFamlastName() {
        return normalize(famlastName);
    }

    public void setFamlastName(List<String> famlastName) {
        this.famlastName = AccessCounterList.decorate(famlastName, String.class);
    }

    public List<String> getFamfirstName() {
        return normalize(famfirstName);
    }

    public void setFamfirstName(List<String> famfirstName) {
        this.famfirstName = AccessCounterList.decorate(famfirstName, String.class);
    }

    public List<String> getFammiddleName() {
        return normalize(fammiddleName);
    }

    public void setFammiddleName(List<String> fammiddleName) {
        this.fammiddleName = AccessCounterList.decorate(fammiddleName, String.class);
    }

    public List<Date> getFambirthdate() {
        return normalize(fambirthdate);
    }

    public void setFambirthdate(List<Date> fambirthdate) {
        this.fambirthdate = AccessCounterList.decorate(fambirthdate, String.class);
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

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getRecipientPostIndex() {
        return recipientPostIndex;
    }

    public void setRecipientPostIndex(String recipientPostIndex) {
        this.recipientPostIndex = recipientPostIndex;
    }

    public String getRecipientPostEnterType() {
        return recipientPostEnterType;
    }

    public void setRecipientPostEnterType(String recipientPostEnterType) {
        this.recipientPostEnterType = recipientPostEnterType;
    }

    public String getRecipientPostRegion() {
        return recipientPostRegion;
    }

    public void setRecipientPostRegion(String recipientPostRegion) {
        this.recipientPostRegion = recipientPostRegion;
    }

    public String getRecipientPostRayon() {
        return recipientPostRayon;
    }

    public void setRecipientPostRayon(String recipientPostRayon) {
        this.recipientPostRayon = recipientPostRayon;
    }

    public String getRecipientPostCity() {
        return recipientPostCity;
    }

    public void setRecipientPostCity(String recipientPostCity) {
        this.recipientPostCity = recipientPostCity;
    }

    public String getRecipientPostSettlementText() {
        return recipientPostSettlementText;
    }

    public void setRecipientPostSettlementText(String recipientPostSettlementText) {
        this.recipientPostSettlementText = recipientPostSettlementText;
    }

    public String getRecipientPostSettlementDict() {
        return recipientPostSettlementDict;
    }

    public void setRecipientPostSettlementDict(String recipientPostSettlementDict) {
        this.recipientPostSettlementDict = recipientPostSettlementDict;
    }

    public String getRecipientPostStreetText() {
        return recipientPostStreetText;
    }

    public void setRecipientPostStreetText(String recipientPostStreetText) {
        this.recipientPostStreetText = recipientPostStreetText;
    }

    public String getRecipientPostStreetDict() {
        return recipientPostStreetDict;
    }

    public void setRecipientPostStreetDict(String recipientPostStreetDict) {
        this.recipientPostStreetDict = recipientPostStreetDict;
    }

    public String getRecipientPostHouse() {
        return recipientPostHouse;
    }

    public void setRecipientPostHouse(String recipientPostHouse) {
        this.recipientPostHouse = recipientPostHouse;
    }

    public String getRecipientPostKorpus() {
        return recipientPostKorpus;
    }

    public void setRecipientPostKorpus(String recipientPostKorpus) {
        this.recipientPostKorpus = recipientPostKorpus;
    }

    public String getRecipientPostFlat() {
        return recipientPostFlat;
    }

    public void setRecipientPostFlat(String recipientPostFlat) {
        this.recipientPostFlat = recipientPostFlat;
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

    public List<String> getFamkin() {
        return normalize(famkin);
    }

    public void setFamkin(List<String> famkin) {
        this.famkin = AccessCounterList.decorate(famkin, String.class);
    }

    public List<FileBean> getFamIdentityDocLoad() {
        return normalize(famIdentityDocLoad);
    }

    public void setFamIdentityDocLoad(List<FileBean> famIdentityDocLoad) {
        this.famIdentityDocLoad = AccessCounterList.decorate(famIdentityDocLoad, FileBean.class);
    }

    public List<FileBean> getSostavDocLoad() {
        return normalize(sostavDocLoad);
    }

    public void setSostavDocLoad(List<FileBean> sostavDocLoad) {
        this.sostavDocLoad = AccessCounterList.decorate(sostavDocLoad, FileBean.class);
    }

    public List<FileBean> getAgree1DocLoad() {
        return normalize(agree1DocLoad);
    }

    public void setAgree1DocLoad(List<FileBean> agree1DocLoad) {
        this.agree1DocLoad = AccessCounterList.decorate(agree1DocLoad, FileBean.class);
    }

    public String getDivorceCh() {
        return divorceCh == null ? "off" : divorceCh;
    }

    public void setDivorceCh(String divorceCh) {
        this.divorceCh = divorceCh;
    }

    public String getDopPravZhil() {
        return dopPravZhil == null ? "off" : dopPravZhil;
    }

    public void setDopPravZhil(String dopPravZhil) {
        this.dopPravZhil = dopPravZhil;
    }

    public String getEgrpNoCh() {
        return egrpNoCh == null ? "off" : egrpNoCh;
    }

    public void setEgrpNoCh(String egrpNoCh) {
        this.egrpNoCh = egrpNoCh;
    }

    public FileBean getBirthDocLoad() {
        return birthDocLoad;
    }

    public void setBirthDocLoad(FileBean birthDocLoad) {
        this.birthDocLoad = birthDocLoad;
    }

    public List<FileBean> getTechDocLoad() {
        return normalize(techDocLoad);
    }

    public void setTechDocLoad(List<FileBean> techDocLoad) {
        this.techDocLoad = AccessCounterList.decorate(techDocLoad, FileBean.class);
    }

    public List<FileBean> getPravoDocLoad() {
        return normalize(pravoDocLoad);
    }

    public void setPravoDocLoad(List<FileBean> pravoDocLoad) {
        this.pravoDocLoad = AccessCounterList.decorate(pravoDocLoad, FileBean.class);
    }

    public List<FileBean> getDopDocLoad() {
        return normalize(dopDocLoad);
    }

    public void setDopDocLoad(List<FileBean> dopDocLoad) {
        this.dopDocLoad = AccessCounterList.decorate(dopDocLoad, FileBean.class);
    }

    public List<FileBean> getRegDocLoad() {
        return normalize(regDocLoad);
    }

    public void setRegDocLoad(List<FileBean> regDocLoad) {
        this.regDocLoad = AccessCounterList.decorate(regDocLoad, FileBean.class);
    }

    public FileBean getWorkDocLoad() {
        return workDocLoad;
    }

    public void setWorkDocLoad(FileBean workDocLoad) {
        this.workDocLoad = workDocLoad;
    }

    public List<FileBean> getIncomeDocLoad() {
        return normalize(incomeDocLoad);
    }

    public void setIncomeDocLoad(List<FileBean> incomeDocLoad) {
        this.incomeDocLoad = AccessCounterList.decorate(incomeDocLoad, FileBean.class);
    }

    public FileBean getMarryDocLoad() {
        return marryDocLoad;
    }

    public void setMarryDocLoad(FileBean marryDocLoad) {
        this.marryDocLoad = marryDocLoad;
    }

    public List<FileBean> getPravo1DocLoad() {
        return normalize(pravo1DocLoad);
    }

    public void setPravo1DocLoad(List<FileBean> pravo1DocLoad) {
        this.pravo1DocLoad = AccessCounterList.decorate(pravo1DocLoad, FileBean.class);
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

    public String getRecipientPostCountry() {
        return recipientPostCountry;
    }

    public void setRecipientPostCountry(String recipientPostCountry) {
        this.recipientPostCountry = recipientPostCountry;
    }

    public String getRecipientPostCountryCode() {
        return recipientPostCountryCode;
    }

    public void setRecipientPostCountryCode(String recipientPostCountryCode) {
        this.recipientPostCountryCode = recipientPostCountryCode;
    }

    public String getRecipientPostCountryInput() {
        return recipientPostCountryInput;
    }

    public void setRecipientPostCountryInput(String recipientPostCountryInput) {
        this.recipientPostCountryInput = recipientPostCountryInput;
    }

    public String getRecipientPostSettlementType() {
        return recipientPostSettlementType;
    }

    public void setRecipientPostSettlementType(String recipientPostSettlementType) {
        this.recipientPostSettlementType = recipientPostSettlementType;
    }

    public String getRecipientPostCountrySettlement() {
        return recipientPostCountrySettlement;
    }

    public void setRecipientPostCountrySettlement(String recipientPostCountrySettlement) {
        this.recipientPostCountrySettlement = recipientPostCountrySettlement;
    }

    public Boolean getRepresentativeStatusChanged() {
        return representativeStatusChanged;
    }

    public void setRepresentativeStatusChanged(Boolean representativeStatusChanged) {
        this.representativeStatusChanged = representativeStatusChanged;
    }
}