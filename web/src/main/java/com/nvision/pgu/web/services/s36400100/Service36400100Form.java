package com.nvision.pgu.web.services.s36400100;

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
public class Service36400100Form extends AbstractServiceOrderForm {

    private Boolean dov_enable_changed = true;
    private Boolean applType_changed = true;
    private Boolean dovUlType_changed = true;
    private String applType;
    private String dov_enable;
    private String dovUlType;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phone;
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
    private String org_email;
    private String org_InnUl;
    private String org_OgrnUl;
    private String placement;
    private FileBean planDocLoad;
    private FileBean pravoDocLoad;
    private FileBean techDocLoad;
    private FileBean arhDocLoad;
    private List<String> lastNamProp = AccessCounterList.createEmpty(String.class);
    private List<String> firstNameProp = AccessCounterList.createEmpty(String.class);
    private List<String> middleNameProp = AccessCounterList.createEmpty(String.class);
    private List<FileBean> agreeDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> agree1DocLoad = AccessCounterList.createEmpty(FileBean.class);
    // address
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
    // postAddress
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
    // orgAddress
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
    private String orgAddressCountry = "643";
    private String orgAddressCountryCode = "ru";
    private String orgAddressCountryInput;
    private String orgAddressSettlementType = "1";
    private String orgAddressCountrySettlement;
    // orgFactAddress
    private String orgFactAddressIndex;
    private String orgFactAddressEnterType;
    private String orgFactAddressRegion;
    private String orgFactAddressRayon;
    private String orgFactAddressCity;
    private String orgFactAddressSettlementText;
    private String orgFactAddressSettlementDict;
    private String orgFactAddressStreetText;
    private String orgFactAddressStreetDict;
    private String orgFactAddressHouse;
    private String orgFactAddressKorpus;
    private String orgFactAddressFlat;
    private String orgFactAddressCountry = "643";
    private String orgFactAddressCountryCode = "ru";
    private String orgFactAddressCountryInput;
    private String orgFactAddressSettlementType = "1";
    private String orgFactAddressCountrySettlement;
    // orgPostAddress
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
    private String orgPostAddressCountry = "643";
    private String orgPostAddressCountryCode = "ru";
    private String orgPostAddressCountryInput;
    private String orgPostAddressSettlementType = "1";
    private String orgPostAddressCountrySettlement;
    // addressPlacement
    private String addressPlacementIndex;
    private String addressPlacementEnterType;
    private String addressPlacementRegion;
    private String addressPlacementRayon;
    private String addressPlacementCity;
    private String addressPlacementSettlementText;
    private String addressPlacementSettlementDict;
    private String addressPlacementStreetText;
    private String addressPlacementStreetDict;
    private String addressPlacementHouse;
    private String addressPlacementKorpus;
    private String addressPlacementFlat;
    private String addressPlacementCountry = "643";
    private String addressPlacementCountryCode = "ru";
    private String addressPlacementCountryInput;
    private String addressPlacementSettlementType = "1";
    private String addressPlacementCountrySettlement;
    private String org_SmallTitle;

    public String getOrg_SmallTitle() {
        return org_SmallTitle;
    }

    public void setOrg_SmallTitle(String org_SmallTitle) {
        this.org_SmallTitle = org_SmallTitle;
    }

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");

        this.setPhone("");
        this.setIdentityDocType("");

        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);

        this.setEmail("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());

        this.setPhone(privateRoomDataContainer.getPhone());
        this.setIdentityDocType("");

        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);

        this.setEmail(privateRoomDataContainer.getEmail());
    }

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
    }

    public Boolean getApplType_changed() {
        return applType_changed;
    }

    public void setApplType_changed(Boolean applType_changed) {
        this.applType_changed = applType_changed;
    }

    public Boolean getDovUlType_changed() {
        return dovUlType_changed;
    }

    public void setDovUlType_changed(Boolean dovUlType_changed) {
        this.dovUlType_changed = dovUlType_changed;
    }

    public String getApplType() {
        return applType;
    }

    public void setApplType(String applType) {
        if (this.applType != null)
            if (!(this.applType.equalsIgnoreCase(applType))) { // Произошло изменение значения поля.
                this.setApplType_changed(true);
            }
        this.applType = applType;
    }

    public String getDov_enable() {
        return dov_enable == null ? "off" : this.dov_enable;
    }

    public void setDov_enable(String dov_enable) {
        if (this.dov_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (dov_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getDov_enable())) { // ... а в форме сохранён on
                    this.setDov_enable_changed(true);
                }
                this.dov_enable = "off";
            } else {
                if (!this.getDov_enable().equals(dov_enable)) {
                    this.setDov_enable_changed(true);
                }
                this.dov_enable = dov_enable;
            }
        } else {
            this.dov_enable = dov_enable;
        }
    }

    public String getDovUlType() {
        return dovUlType;
    }

    public void setDovUlType(String dovUlType) {
        if (this.dovUlType != null)
            if (!(this.dovUlType.equalsIgnoreCase(dovUlType))) { // Произошло изменение значения поля.
                this.setDovUlType_changed(true);
            }
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

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public FileBean getPlanDocLoad() {
        return planDocLoad;
    }

    public void setPlanDocLoad(FileBean planDocLoad) {
        this.planDocLoad = planDocLoad;
    }

    public FileBean getPravoDocLoad() {
        return pravoDocLoad;
    }

    public void setPravoDocLoad(FileBean pravoDocLoad) {
        this.pravoDocLoad = pravoDocLoad;
    }

    public FileBean getTechDocLoad() {
        return techDocLoad;
    }

    public void setTechDocLoad(FileBean techDocLoad) {
        this.techDocLoad = techDocLoad;
    }

    public FileBean getArhDocLoad() {
        return arhDocLoad;
    }

    public void setArhDocLoad(FileBean arhDocLoad) {
        this.arhDocLoad = arhDocLoad;
    }

    public List<String> getLastNamProp() {
        return normalize(lastNamProp);
    }

    public void setLastNamProp(List<String> lastNamProp) {
        this.lastNamProp = AccessCounterList.decorate(lastNamProp, String.class);
    }

    public List<String> getFirstNameProp() {
        return normalize(firstNameProp);
    }

    public void setFirstNameProp(List<String> firstNameProp) {
        this.firstNameProp = AccessCounterList.decorate(firstNameProp, String.class);
    }

    public List<String> getMiddleNameProp() {
        return normalize(middleNameProp);
    }

    public void setMiddleNameProp(List<String> middleNameProp) {
        this.middleNameProp = AccessCounterList.decorate(middleNameProp, String.class);
    }

    public List<FileBean> getAgreeDocLoad() {
        return normalize(agreeDocLoad);
    }

    public void setAgreeDocLoad(List<FileBean> agreeDocLoad) {
        this.agreeDocLoad = AccessCounterList.decorate(agreeDocLoad, FileBean.class);
    }

    public List<FileBean> getAgree1DocLoad() {
        return normalize(agree1DocLoad);
    }

    public void setAgree1DocLoad(List<FileBean> agree1DocLoad) {
        this.agree1DocLoad = AccessCounterList.decorate(agree1DocLoad, FileBean.class);
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

    public String getOrgAddressSettlementType() {
        return orgAddressSettlementType;
    }

    public void setOrgAddressSettlementType(String orgAddressSettlementType) {
        this.orgAddressSettlementType = orgAddressSettlementType;
    }

    public String getOrgAddressCountrySettlement() {
        return orgAddressCountrySettlement;
    }

    public void setOrgAddressCountrySettlement(String orgAddressCountrySettlement) {
        this.orgAddressCountrySettlement = orgAddressCountrySettlement;
    }

    public String getOrgFactAddressIndex() {
        return orgFactAddressIndex;
    }

    public void setOrgFactAddressIndex(String orgFactAddressIndex) {
        this.orgFactAddressIndex = orgFactAddressIndex;
    }

    public String getOrgFactAddressEnterType() {
        return orgFactAddressEnterType;
    }

    public void setOrgFactAddressEnterType(String orgFactAddressEnterType) {
        this.orgFactAddressEnterType = orgFactAddressEnterType;
    }

    public String getOrgFactAddressRegion() {
        return orgFactAddressRegion;
    }

    public void setOrgFactAddressRegion(String orgFactAddressRegion) {
        this.orgFactAddressRegion = orgFactAddressRegion;
    }

    public String getOrgFactAddressRayon() {
        return orgFactAddressRayon;
    }

    public void setOrgFactAddressRayon(String orgFactAddressRayon) {
        this.orgFactAddressRayon = orgFactAddressRayon;
    }

    public String getOrgFactAddressCity() {
        return orgFactAddressCity;
    }

    public void setOrgFactAddressCity(String orgFactAddressCity) {
        this.orgFactAddressCity = orgFactAddressCity;
    }

    public String getOrgFactAddressSettlementText() {
        return orgFactAddressSettlementText;
    }

    public void setOrgFactAddressSettlementText(String orgFactAddressSettlementText) {
        this.orgFactAddressSettlementText = orgFactAddressSettlementText;
    }

    public String getOrgFactAddressSettlementDict() {
        return orgFactAddressSettlementDict;
    }

    public void setOrgFactAddressSettlementDict(String orgFactAddressSettlementDict) {
        this.orgFactAddressSettlementDict = orgFactAddressSettlementDict;
    }

    public String getOrgFactAddressStreetText() {
        return orgFactAddressStreetText;
    }

    public void setOrgFactAddressStreetText(String orgFactAddressStreetText) {
        this.orgFactAddressStreetText = orgFactAddressStreetText;
    }

    public String getOrgFactAddressStreetDict() {
        return orgFactAddressStreetDict;
    }

    public void setOrgFactAddressStreetDict(String orgFactAddressStreetDict) {
        this.orgFactAddressStreetDict = orgFactAddressStreetDict;
    }

    public String getOrgFactAddressHouse() {
        return orgFactAddressHouse;
    }

    public void setOrgFactAddressHouse(String orgFactAddressHouse) {
        this.orgFactAddressHouse = orgFactAddressHouse;
    }

    public String getOrgFactAddressKorpus() {
        return orgFactAddressKorpus;
    }

    public void setOrgFactAddressKorpus(String orgFactAddressKorpus) {
        this.orgFactAddressKorpus = orgFactAddressKorpus;
    }

    public String getOrgFactAddressFlat() {
        return orgFactAddressFlat;
    }

    public void setOrgFactAddressFlat(String orgFactAddressFlat) {
        this.orgFactAddressFlat = orgFactAddressFlat;
    }

    public String getOrgFactAddressCountry() {
        return orgFactAddressCountry;
    }

    public void setOrgFactAddressCountry(String orgFactAddressCountry) {
        this.orgFactAddressCountry = orgFactAddressCountry;
    }

    public String getOrgFactAddressCountryCode() {
        return orgFactAddressCountryCode;
    }

    public void setOrgFactAddressCountryCode(String orgFactAddressCountryCode) {
        this.orgFactAddressCountryCode = orgFactAddressCountryCode;
    }

    public String getOrgFactAddressCountryInput() {
        return orgFactAddressCountryInput;
    }

    public void setOrgFactAddressCountryInput(String orgFactAddressCountryInput) {
        this.orgFactAddressCountryInput = orgFactAddressCountryInput;
    }

    public String getOrgFactAddressSettlementType() {
        return orgFactAddressSettlementType;
    }

    public void setOrgFactAddressSettlementType(String orgFactAddressSettlementType) {
        this.orgFactAddressSettlementType = orgFactAddressSettlementType;
    }

    public String getOrgFactAddressCountrySettlement() {
        return orgFactAddressCountrySettlement;
    }

    public void setOrgFactAddressCountrySettlement(String orgFactAddressCountrySettlement) {
        this.orgFactAddressCountrySettlement = orgFactAddressCountrySettlement;
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

    public String getOrgPostAddressSettlementType() {
        return orgPostAddressSettlementType;
    }

    public void setOrgPostAddressSettlementType(String orgPostAddressSettlementType) {
        this.orgPostAddressSettlementType = orgPostAddressSettlementType;
    }

    public String getOrgPostAddressCountrySettlement() {
        return orgPostAddressCountrySettlement;
    }

    public void setOrgPostAddressCountrySettlement(String orgPostAddressCountrySettlement) {
        this.orgPostAddressCountrySettlement = orgPostAddressCountrySettlement;
    }

    public String getAddressPlacementIndex() {
        return addressPlacementIndex;
    }

    public void setAddressPlacementIndex(String addressPlacementIndex) {
        this.addressPlacementIndex = addressPlacementIndex;
    }

    public String getAddressPlacementEnterType() {
        return addressPlacementEnterType;
    }

    public void setAddressPlacementEnterType(String addressPlacementEnterType) {
        this.addressPlacementEnterType = addressPlacementEnterType;
    }

    public String getAddressPlacementRegion() {
        return addressPlacementRegion;
    }

    public void setAddressPlacementRegion(String addressPlacementRegion) {
        this.addressPlacementRegion = addressPlacementRegion;
    }

    public String getAddressPlacementRayon() {
        return addressPlacementRayon;
    }

    public void setAddressPlacementRayon(String addressPlacementRayon) {
        this.addressPlacementRayon = addressPlacementRayon;
    }

    public String getAddressPlacementCity() {
        return addressPlacementCity;
    }

    public void setAddressPlacementCity(String addressPlacementCity) {
        this.addressPlacementCity = addressPlacementCity;
    }

    public String getAddressPlacementSettlementText() {
        return addressPlacementSettlementText;
    }

    public void setAddressPlacementSettlementText(String addressPlacementSettlementText) {
        this.addressPlacementSettlementText = addressPlacementSettlementText;
    }

    public String getAddressPlacementSettlementDict() {
        return addressPlacementSettlementDict;
    }

    public void setAddressPlacementSettlementDict(String addressPlacementSettlementDict) {
        this.addressPlacementSettlementDict = addressPlacementSettlementDict;
    }

    public String getAddressPlacementStreetText() {
        return addressPlacementStreetText;
    }

    public void setAddressPlacementStreetText(String addressPlacementStreetText) {
        this.addressPlacementStreetText = addressPlacementStreetText;
    }

    public String getAddressPlacementStreetDict() {
        return addressPlacementStreetDict;
    }

    public void setAddressPlacementStreetDict(String addressPlacementStreetDict) {
        this.addressPlacementStreetDict = addressPlacementStreetDict;
    }

    public String getAddressPlacementHouse() {
        return addressPlacementHouse;
    }

    public void setAddressPlacementHouse(String addressPlacementHouse) {
        this.addressPlacementHouse = addressPlacementHouse;
    }

    public String getAddressPlacementKorpus() {
        return addressPlacementKorpus;
    }

    public void setAddressPlacementKorpus(String addressPlacementKorpus) {
        this.addressPlacementKorpus = addressPlacementKorpus;
    }

    public String getAddressPlacementFlat() {
        return addressPlacementFlat;
    }

    public void setAddressPlacementFlat(String addressPlacementFlat) {
        this.addressPlacementFlat = addressPlacementFlat;
    }

    public String getAddressPlacementCountry() {
        return addressPlacementCountry;
    }

    public void setAddressPlacementCountry(String addressPlacementCountry) {
        this.addressPlacementCountry = addressPlacementCountry;
    }

    public String getAddressPlacementCountryCode() {
        return addressPlacementCountryCode;
    }

    public void setAddressPlacementCountryCode(String addressPlacementCountryCode) {
        this.addressPlacementCountryCode = addressPlacementCountryCode;
    }

    public String getAddressPlacementCountryInput() {
        return addressPlacementCountryInput;
    }

    public void setAddressPlacementCountryInput(String addressPlacementCountryInput) {
        this.addressPlacementCountryInput = addressPlacementCountryInput;
    }

    public String getAddressPlacementSettlementType() {
        return addressPlacementSettlementType;
    }

    public void setAddressPlacementSettlementType(String addressPlacementSettlementType) {
        this.addressPlacementSettlementType = addressPlacementSettlementType;
    }

    public String getAddressPlacementCountrySettlement() {
        return addressPlacementCountrySettlement;
    }

    public void setAddressPlacementCountrySettlement(String addressPlacementCountrySettlement) {
        this.addressPlacementCountrySettlement = addressPlacementCountrySettlement;
    }
}
