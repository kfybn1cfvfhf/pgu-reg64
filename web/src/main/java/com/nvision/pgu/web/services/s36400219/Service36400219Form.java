package com.nvision.pgu.web.services.s36400219;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400219Form extends AbstractServiceOrderForm {

    @JsonArrayToList
    private String stat_zayav = "[]";
    private String dov_enable = "off";
    private FileBean dovDovLoad;
    @InitRule(strategy = com.nvision.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String dovLastName;
    @InitRule(strategy = com.nvision.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String dovFirstName;
    @InitRule(strategy = com.nvision.pgu.core.rules.InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String dovMiddleName;
    private FileBean dovPasLoad;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthdate;
    private String phone;
    private String email;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private String nameBankBenefit;
    private String filialBankBenefit;
    private String bikBankBenefit;
    private String corrAccBankBenefit;
    private String codeFilialBankBenefit;
    private String clientAccBankBenefit;
    private List<String> lastNameChild = AccessCounterList.createEmpty(String.class);
    private List<String> firstNameChild = AccessCounterList.createEmpty(String.class);
    private List<String> middleNameChild = AccessCounterList.createEmpty(String.class);
    private List<Date> birthdateChild = AccessCounterList.createEmpty(Date.class);
    private List<String> stat_child = AccessCounterList.createEmpty(String.class);
    private List<String> vospitDocType = AccessCounterList.createEmpty(String.class);
    private List<String> vospitNo = AccessCounterList.createEmpty(String.class);
    private List<Date> vospitData = AccessCounterList.createEmpty(Date.class);
    private List<Date> vospitData_ZS = AccessCounterList.createEmpty(Date.class);
    private List<String> vospitFrom = AccessCounterList.createEmpty(String.class);
    private FileBean sberKnigDocLoad;
    private List<FileBean> vospitDocLoad = AccessCounterList.createEmpty(String.class);
    private String identityDocType = "Паспорт гражданина РФ";
    // address
    private String addressIndex;
    private String addressEnterType;
    private String addressRegion;
    private String addressRayon;
    private String addressCity;
    private String addressSettlementText;
    private String addressSettlementDict;
    private String addressStreetText;
    private String addressStreetDict;
    private String addressHouse;
    private String addressKorpus;
    private String addressFlat;
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressSettlementType = "1";
    private String addressCountrySettlement;
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
    // addressPost
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

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
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

    public String getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
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

    public FileBean getDovDovLoad() {
        return dovDovLoad;
    }

    public void setDovDovLoad(FileBean dovDovLoad) {
        this.dovDovLoad = dovDovLoad;
    }

    public List<FileBean> getVospitDocLoad() {
        return vospitDocLoad;
    }

    public void setVospitDocLoad(List<FileBean> vospitDocLoad) {
        this.vospitDocLoad = vospitDocLoad;
    }

    public String getStat_zayav() {
        return this.stat_zayav;
    }

    public void setStat_zayav(String stat_zayav) {
        this.stat_zayav = stat_zayav;
    }

    public String getDov_enable() {
        return dov_enable == null ? "off" : dov_enable;
    }

    public void setDov_enable(String dov_enable) {
        this.dov_enable = dov_enable;
    }

    public String getDovLastName() {
        return this.dovLastName;
    }

    public void setDovLastName(String dovLastName) {
        this.dovLastName = dovLastName;
    }

    public String getDovFirstName() {
        return this.dovFirstName;
    }

    public void setDovFirstName(String dovFirstName) {
        this.dovFirstName = dovFirstName;
    }

    public String getDovMiddleName() {
        return this.dovMiddleName;
    }

    public void setDovMiddleName(String dovMiddleName) {
        this.dovMiddleName = dovMiddleName;
    }

    public FileBean getDovPasLoad() {
        return this.dovPasLoad;
    }

    public void setDovPasLoad(FileBean dovPasLoad) {
        this.dovPasLoad = dovPasLoad;
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

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public List<String> getLastNameChild() {
        return this.lastNameChild;
    }

    public void setLastNameChild(List<String> lastNameChild) {
        this.lastNameChild = lastNameChild;
    }

    public List<String> getFirstNameChild() {
        return this.firstNameChild;
    }

    public void setFirstNameChild(List<String> firstNameChild) {
        this.firstNameChild = firstNameChild;
    }

    public List<String> getMiddleNameChild() {
        return this.middleNameChild;
    }

    public void setMiddleNameChild(List<String> middleNameChild) {
        this.middleNameChild = middleNameChild;
    }

    public List<Date> getBirthdateChild() {
        return this.birthdateChild;
    }

    public void setBirthdateChild(List<Date> birthdateChild) {
        this.birthdateChild = birthdateChild;
    }

    public List<String> getStat_child() {
        return this.stat_child;
    }

    public void setStat_child(List<String> stat_child) {
        this.stat_child = stat_child;
    }

    public List<String> getVospitDocType() {
        return this.vospitDocType;
    }

    public void setVospitDocType(List<String> vospitDocType) {
        this.vospitDocType = vospitDocType;
    }

    public List<String> getVospitNo() {
        return this.vospitNo;
    }

    public void setVospitNo(List<String> vospitNo) {
        this.vospitNo = vospitNo;
    }

    public List<Date> getVospitData() {
        return this.vospitData;
    }

    public void setVospitData(List<Date> vospitData) {
        this.vospitData = vospitData;
    }

    public List<Date> getVospitData_ZS() {
        return this.vospitData_ZS;
    }

    public void setVospitData_ZS(List<Date> vospitData_ZS) {
        this.vospitData_ZS = vospitData_ZS;
    }

    public List<String> getVospitFrom() {
        return this.vospitFrom;
    }

    public void setVospitFrom(List<String> vospitFrom) {
        this.vospitFrom = vospitFrom;
    }

    public FileBean getSberKnigDocLoad() {
        return this.sberKnigDocLoad;
    }

    public void setSberKnigDocLoad(FileBean sberKnigDocLoad) {
        this.sberKnigDocLoad = sberKnigDocLoad;
    }


}
