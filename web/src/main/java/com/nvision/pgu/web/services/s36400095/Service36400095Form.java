package com.nvision.pgu.web.services.s36400095;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
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
public class Service36400095Form extends AbstractServiceOrderForm {

    private String applType;
    private String ip_enable;
    private String dov_enable;
    private String dovUlType;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovLastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovFirstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovMiddleName;
    private String dovAddressPost;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovPhone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovEmail;
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
    private String identityDocType = "Паспорт гражданина РФ";
    private String org_dolg;
    private String cultCh; // checkbox
    private FileBean expertDocLoad;
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
    private String org_SmallTitle;
    private String org_phone;
    private String org_fax;
    private String org_email;
    private String org_firstName;
    private String org_lastName;
    private String org_middleName;
    private String org_InnUl;
    private FileBean docMvRegULLoad;
    private String inn;
    private FileBean docMvRegIPLoad;
    private List<String> addressReklConstr = AccessCounterList.createEmpty(String.class);
    private List<String> kadastrNoReklConstr = AccessCounterList.createEmpty(String.class);
    private String expRekl;
    private String typeRekl;
    private String kolStorRekl;
    private String areaRekl;
    private String lightRekl;    //LIGHT_REKLAM_CONSTR_64
    private String vladRekl;
    private String sobSobst;
    private List<String> dogRekl = AccessCounterList.createEmpty(String.class);
    private List<FileBean> dogReklDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> sobSobstDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> eskizReklDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> soglSobstDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean gosposhDocLoad;
    private List<FileBean> egrpDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean soglUOdocLoad;
    // address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressIndex;
    private String addressEnterType;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRegion;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRayon;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_CITY_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressCity;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementText;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementDict;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_STREET_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetText;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_STREET_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetDict;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressHouse;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressKorpus;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
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
    private Boolean dov_enable_changed = true;
    private Boolean applType_changed = true;
    private Boolean dovUlType_changed = true;
    private Boolean ip_enable_changed = true;

    public String getApplType() {
        return this.applType;
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
        return this.dovUlType;
    }

    public void setDovUlType(String dovUlType) {
        if (this.dovUlType != null)
            if (!(this.dovUlType.equalsIgnoreCase(dovUlType))) { // Произошло изменение значения поля.
                this.setDovUlType_changed(true);
            }
        this.dovUlType = dovUlType;
    }

    public String getIp_enable() {
        return this.ip_enable == null ? "off" : this.ip_enable;
    }

    public void setIp_enable(String ip_enable) {
        if (this.ip_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (ip_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getIp_enable())) { // ... а в форме сохранён on
                    this.setIp_enable_changed(true);
                }
                this.ip_enable = "off";
            } else {
                if (!this.getIp_enable().equals(ip_enable)) {
                    this.setIp_enable_changed(true);
                }
                this.ip_enable = ip_enable;
            }
        } else {
            this.ip_enable = ip_enable;
        }
    }

    public FileBean getDovDovLoad() {
        return this.dovDovLoad;
    }

    public void setDovDovLoad(FileBean dovDovLoad) {
        this.dovDovLoad = dovDovLoad;
    }

    public String getOrg_dolg() {
        return org_dolg;
    }

    public void setOrg_dolg(String org_dolg) {
        this.org_dolg = org_dolg;
    }

    public String getCultCh() {
        return cultCh == null ? "off" : cultCh;
    }

    public void setCultCh(String cultCh) {
        this.cultCh = cultCh;
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

    public FileBean getExpertDocLoad() {
        return expertDocLoad;
    }

    public void setExpertDocLoad(FileBean expertDocLoad) {
        this.expertDocLoad = expertDocLoad;
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

    public String getDovAddressPost() {
        return this.dovAddressPost;
    }

    public void setDovAddressPost(String dovAddressPost) {
        this.dovAddressPost = dovAddressPost;
    }

    public String getDovPhone() {
        return this.dovPhone;
    }

    public void setDovPhone(String dovPhone) {
        this.dovPhone = dovPhone;
    }

    public String getDovEmail() {
        return this.dovEmail;
    }

    public void setDovEmail(String dovEmail) {
        this.dovEmail = dovEmail;
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

    public String getIdentityDocType() {
        return this.identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
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

    public FileBean getDovUlNonDovLoad() {
        return this.dovUlNonDovLoad;
    }

    public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
        this.dovUlNonDovLoad = dovUlNonDovLoad;
    }

    public FileBean getDovUlDovLoad() {
        return this.dovUlDovLoad;
    }

    public void setDovUlDovLoad(FileBean dovUlDovLoad) {
        this.dovUlDovLoad = dovUlDovLoad;
    }

    public FileBean getDovUlPasLoad() {
        return this.dovUlPasLoad;
    }

    public void setDovUlPasLoad(FileBean dovUlPasLoad) {
        this.dovUlPasLoad = dovUlPasLoad;
    }

    public String getOrg_FullTitle() {
        return this.org_FullTitle;
    }

    public void setOrg_FullTitle(String org_FullTitle) {
        this.org_FullTitle = org_FullTitle;
    }

    public String getOrg_opf() {
        return this.org_opf;
    }

    public void setOrg_opf(String org_opf) {
        this.org_opf = org_opf;
    }

    public String getOrg_SmallTitle() {
        return this.org_SmallTitle;
    }

    public void setOrg_SmallTitle(String org_SmallTitle) {
        this.org_SmallTitle = org_SmallTitle;
    }

    public String getOrg_phone() {
        return this.org_phone;
    }

    public void setOrg_phone(String org_phone) {
        this.org_phone = org_phone;
    }

    public String getOrg_fax() {
        return this.org_fax;
    }

    public void setOrg_fax(String org_fax) {
        this.org_fax = org_fax;
    }

    public String getOrg_email() {
        return this.org_email;
    }

    public void setOrg_email(String org_email) {
        this.org_email = org_email;
    }

    public String getOrg_firstName() {
        return this.org_firstName;
    }

    public void setOrg_firstName(String org_firstName) {
        this.org_firstName = org_firstName;
    }

    public String getOrg_lastName() {
        return this.org_lastName;
    }

    public void setOrg_lastName(String org_lastName) {
        this.org_lastName = org_lastName;
    }

    public String getOrg_middleName() {
        return this.org_middleName;
    }

    public void setOrg_middleName(String org_middleName) {
        this.org_middleName = org_middleName;
    }

    public String getOrg_InnUl() {
        return this.org_InnUl;
    }

    public void setOrg_InnUl(String org_InnUl) {
        this.org_InnUl = org_InnUl;
    }

    public FileBean getDocMvRegULLoad() {
        return this.docMvRegULLoad;
    }

    public void setDocMvRegULLoad(FileBean docMvRegULLoad) {
        this.docMvRegULLoad = docMvRegULLoad;
    }

    public String getInn() {
        return this.inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public FileBean getDocMvRegIPLoad() {
        return this.docMvRegIPLoad;
    }

    public void setDocMvRegIPLoad(FileBean docMvRegIPLoad) {
        this.docMvRegIPLoad = docMvRegIPLoad;
    }

    public List<String> getAddressReklConstr() {
        return normalize(this.addressReklConstr);
    }

    public void setAddressReklConstr(List<String> addressReklConstr) {
        this.addressReklConstr = AccessCounterList.decorate(addressReklConstr, String.class);
    }

    public List<String> getKadastrNoReklConstr() {
        return normalize(this.kadastrNoReklConstr);
    }

    public void setKadastrNoReklConstr(List<String> kadastrNoReklConstr) {
        this.kadastrNoReklConstr = AccessCounterList.decorate(kadastrNoReklConstr, String.class);
    }

    public String getExpRekl() {
        return this.expRekl;
    }

    public void setExpRekl(String expRekl) {
        this.expRekl = expRekl;
    }

    public String getTypeRekl() {
        return this.typeRekl;
    }

    public void setTypeRekl(String typeRekl) {
        this.typeRekl = typeRekl;
    }

    public String getKolStorRekl() {
        return this.kolStorRekl;
    }

    public void setKolStorRekl(String kolStorRekl) {
        this.kolStorRekl = kolStorRekl;
    }

    public String getAreaRekl() {
        return this.areaRekl;
    }

    public void setAreaRekl(String areaRekl) {
        this.areaRekl = areaRekl;
    }

    public String getLightRekl() {
        return this.lightRekl;
    }

    public void setLightRekl(String lightRekl) {
        this.lightRekl = lightRekl;
    }

    public String getVladRekl() {
        return this.vladRekl == null ? "off" : this.vladRekl;
    }

    public void setVladRekl(String vladRekl) {
        this.vladRekl = vladRekl;
    }

    public String getSobSobst() {
        return this.sobSobst == null ? "off" : this.sobSobst;
    }

    public void setSobSobst(String sobSobst) {
        this.sobSobst = sobSobst;
    }

    public List<String> getDogRekl() {
        return normalize(this.dogRekl);
    }

    public void setDogRekl(List<String> dogRekl) {
        this.dogRekl = AccessCounterList.decorate(dogRekl, String.class);
    }

    public List<FileBean> getDogReklDocLoad() {
        return normalize(this.dogReklDocLoad);
    }

    public void setDogReklDocLoad(List<FileBean> dogReklDocLoad) {
        this.dogReklDocLoad = AccessCounterList.decorate(dogReklDocLoad, FileBean.class);
    }

    public List<FileBean> getSobSobstDocLoad() {
        return normalize(this.sobSobstDocLoad);
    }

    public void setSobSobstDocLoad(List<FileBean> sobSobstDocLoad) {
        this.sobSobstDocLoad = AccessCounterList.decorate(sobSobstDocLoad, FileBean.class);
    }

    public List<FileBean> getEskizReklDocLoad() {
        return normalize(eskizReklDocLoad);
    }

    public void setEskizReklDocLoad(List<FileBean> eskizReklDocLoad) {
        this.eskizReklDocLoad = AccessCounterList.decorate(eskizReklDocLoad, FileBean.class);
    }

    public List<FileBean> getSoglSobstDocLoad() {
        return normalize(this.soglSobstDocLoad);
    }

    public void setSoglSobstDocLoad(List<FileBean> soglSobstDocLoad) {
        this.soglSobstDocLoad = AccessCounterList.decorate(soglSobstDocLoad, FileBean.class);
    }

    public FileBean getGosposhDocLoad() {
        return this.gosposhDocLoad;
    }

    public void setGosposhDocLoad(FileBean gosposhDocLoad) {
        this.gosposhDocLoad = gosposhDocLoad;
    }

    public List<FileBean> getEgrpDocLoad() {
        return normalize(this.egrpDocLoad);
    }

    public void setEgrpDocLoad(List<FileBean> egrpDocLoad) {
        this.egrpDocLoad = AccessCounterList.decorate(egrpDocLoad, FileBean.class);
    }

    public FileBean getSoglUOdocLoad() {
        return this.soglUOdocLoad;
    }

    public void setSoglUOdocLoad(FileBean soglUOdocLoad) {
        this.soglUOdocLoad = soglUOdocLoad;
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

    public Boolean getIp_enable_changed() {
        return ip_enable_changed;
    }

    public void setIp_enable_changed(Boolean ip_enable_changed) {
        this.ip_enable_changed = ip_enable_changed;
    }

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
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


}
