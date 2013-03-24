package com.nvision.pgu.web.services.s36400152;

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
public class Service36400152Form extends AbstractServiceOrderForm {

    private String applType;
    private String dov_enable;
    private String dovUlType;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String address;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
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
    private String org_opf;	//FORM_OF_INCORPORATION_64
    private String org_addressUr;
    private String org_phone;
    private String org_fax;
    private String org_firstName;
    private String org_lastName;
    private String org_middleName;
    private String actOrgan;
    private Date actDate;
    private String actNum;
    private String actCopyAmount;
    private String actDopInfo;
    private String actPurpose;
    private List<FileBean> actDocLoad = AccessCounterList.createEmpty(FileBean.class);

    public void setApplType(String applType) {
        if(this.applType != null)
            if(!(this.applType.equalsIgnoreCase(applType))) { // Произошло изменение значения поля.
                this.setApplType_changed(true);
            }
        this.applType = applType;

    }
    public String getApplType() {
        return this.applType;
    }

    public void setDov_enable(String dov_enable) {
        if (this.dov_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (dov_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getDov_enable())) { // ... а в форме сохранён on
                    this.setDov_enable_changed(true);
                }
                this.dov_enable = "off";
            } else {
                if (!this.getDov_enable().equals(dov_enable)){
                    this.setDov_enable_changed(true);
                }
                this.dov_enable = dov_enable;
            }
        } else {
            this.dov_enable = dov_enable;
        }

    }
    public String getDov_enable() {
        return dov_enable == null ? "off" : this.dov_enable;
    }


    public void setDovUlType(String dovUlType) {
        if(this.dovUlType != null)
            if(!(this.dovUlType.equalsIgnoreCase(dovUlType))) { // Произошло изменение значения поля.
                this.setDovUlType_changed(true);
            }
        this.dovUlType = dovUlType;
    }
    public String getDovUlType() {
        return this.dovUlType;
    }

    public void setDovDovLoad(FileBean dovDovLoad) {
        this.dovDovLoad = dovDovLoad;
    }
    public FileBean getDovDovLoad() {
        return this.dovDovLoad;
    }

    public void setDovPasLoad(FileBean dovPasLoad) {
        this.dovPasLoad = dovPasLoad;
    }
    public FileBean getDovPasLoad() {
        return this.dovPasLoad;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getMiddleName() {
        return this.middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }
    public String getIdentityDocType() {
        return this.identityDocType;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
    }
    public String getOtherDocTypeName() {
        return this.otherDocTypeName;
    }

    public void setPassSeria(String passSeria) {
        this.passSeria = passSeria;
    }
    public String getPassSeria() {
        return this.passSeria;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }
    public String getPassNo() {
        return this.passNo;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }
    public Date getPassDate() {
        return this.passDate;
    }

    public void setPassFrom(String passFrom) {
        this.passFrom = passFrom;
    }
    public String getPassFrom() {
        return this.passFrom;
    }

    public void setIdentityDocLoad(FileBean identityDocLoad) {
        this.identityDocLoad = identityDocLoad;
    }
    public FileBean getIdentityDocLoad() {
        return this.identityDocLoad;
    }

    public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
        this.dovUlNonDovLoad = dovUlNonDovLoad;
    }
    public FileBean getDovUlNonDovLoad() {
        return this.dovUlNonDovLoad;
    }

    public void setDovUlDovLoad(FileBean dovUlDovLoad) {
        this.dovUlDovLoad = dovUlDovLoad;
    }
    public FileBean getDovUlDovLoad() {
        return this.dovUlDovLoad;
    }

    public void setDovUlPasLoad(FileBean dovUlPasLoad) {
        this.dovUlPasLoad = dovUlPasLoad;
    }
    public FileBean getDovUlPasLoad() {
        return this.dovUlPasLoad;
    }

    public void setOrg_FullTitle(String org_FullTitle) {
        this.org_FullTitle = org_FullTitle;
    }
    public String getOrg_FullTitle() {
        return this.org_FullTitle;
    }

    public void setOrg_opf(String org_opf) {
        this.org_opf = org_opf;
    }
    public String getOrg_opf() {
        return this.org_opf;
    }

    public void setOrg_addressUr(String org_addressUr) {
        this.org_addressUr = org_addressUr;
    }
    public String getOrg_addressUr() {
        return this.org_addressUr;
    }

    public void setOrg_phone(String org_phone) {
        this.org_phone = org_phone;
    }
    public String getOrg_phone() {
        return this.org_phone;
    }

    public void setOrg_fax(String org_fax) {
        this.org_fax = org_fax;
    }
    public String getOrg_fax() {
        return this.org_fax;
    }

    public void setOrg_firstName(String org_firstName) {
        this.org_firstName = org_firstName;
    }
    public String getOrg_firstName() {
        return this.org_firstName;
    }

    public void setOrg_lastName(String org_lastName) {
        this.org_lastName = org_lastName;
    }
    public String getOrg_lastName() {
        return this.org_lastName;
    }

    public void setOrg_middleName(String org_middleName) {
        this.org_middleName = org_middleName;
    }
    public String getOrg_middleName() {
        return this.org_middleName;
    }

    public void setActOrgan(String actOrgan) {
        this.actOrgan = actOrgan;
    }
    public String getActOrgan() {
        return this.actOrgan;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }
    public Date getActDate() {
        return this.actDate;
    }

    public void setActNum(String actNum) {
        this.actNum = actNum;
    }
    public String getActNum() {
        return this.actNum;
    }

    public void setActCopyAmount(String actCopyAmount) {
        this.actCopyAmount = actCopyAmount;
    }
    public String getActCopyAmount() {
        return this.actCopyAmount;
    }

    public void setActDopInfo(String actDopInfo) {
        this.actDopInfo = actDopInfo;
    }
    public String getActDopInfo() {
        return this.actDopInfo;
    }

    public void setActPurpose(String actPurpose) {
        this.actPurpose = actPurpose;
    }
    public String getActPurpose() {
        return this.actPurpose;
    }

    public void setActDocLoad(List<FileBean> actDocLoad) {
        this.actDocLoad = AccessCounterList.decorate(actDocLoad, FileBean.class);
    }
    public List<FileBean> getActDocLoad() {
        return normalize(this.actDocLoad);
    }

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setAddress("");

        this.setPhone("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);

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
        this.setAddress(privateRoomDataContainer.getAddress());

        this.setPhone(privateRoomDataContainer.getPhone());
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);

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

    private String addressIndex;
			private String addressCountry="643";
			private String addressEnterType;
			private String addressRegion;
			private String addressRayon;
			private String addressSettlementType="1";
			private String addressCity;
			private String addressSettlementText;
			private String addressSettlementDict;
			private String addressStreetText;
			private String addressStreetDict;
			private String addressHouse;
			private String addressKorpus;
			private String addressFlat;
            private String addressCountryCode = "ru";
            private String addressCountryInput;
            private String addressCountrySettlement;


			private String factAddressIndex;
			private String factAddressCountry="643";
			private String factAddressEnterType;
			private String factAddressRegion;
			private String factAddressRayon;
			private String factAddressSettlementType="1";
			private String factAddressCity;
			private String factAddressSettlementText;
			private String factAddressSettlementDict;
			private String factAddressStreetText;
			private String factAddressStreetDict;
			private String factAddressHouse;
			private String factAddressKorpus;
			private String factAddressFlat;
            private String factAddressCountryCode = "ru";
            private String factAddressCountryInput;
            private String factAddressCountrySettlement;



			private String addressPostIndex;
			private String addressPostCountry="643";
			private String addressPostEnterType;
			private String addressPostRegion;
			private String addressPostRayon;
			private String addressPostSettlementType="1";
			private String addressPostCity;
			private String addressPostSettlementText;
			private String addressPostSettlementDict;
			private String addressPostStreetText;
			private String addressPostStreetDict;
			private String addressPostHouse;
			private String addressPostKorpus;
			private String addressPostFlat;
            private String addressPostCountryCode = "ru";
            private String addressPostCountryInput;
            private String addressPostCountrySettlement;



			private String orgAddressIndex;
			private String orgAddressCountry="643";
			private String orgAddressEnterType;
			private String orgAddressRegion;
			private String orgAddressRayon;
			private String orgAddressSettlementType="1";
			private String orgAddressCity;
			private String orgAddressSettlementText;
			private String orgAddressSettlementDict;
			private String orgAddressStreetText;
			private String orgAddressStreetDict;
			private String orgAddressHouse;
			private String orgAddressKorpus;
			private String orgAddressFlat;
            private String orgAddressCountryCode = "ru";
            private String orgAddressCountryInput;
            private String orgAddressCountrySettlement;
    private Boolean dov_enable_changed = true;
    private Boolean applType_changed = true;
    private Boolean dovUlType_changed = true;

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

    public String getAddressPostIndex() {
        return addressPostIndex;
    }

    public void setAddressPostIndex(String addressPostIndex) {
        this.addressPostIndex = addressPostIndex;
    }

    public String getAddressPostCountry() {
        return addressPostCountry;
    }

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
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

    public String getAddressPostSettlementType() {
        return addressPostSettlementType;
    }

    public void setAddressPostSettlementType(String addressPostSettlementType) {
        this.addressPostSettlementType = addressPostSettlementType;
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

    public String getOrgAddressCountry() {
        return orgAddressCountry;
    }

    public void setOrgAddressCountry(String orgAddressCountry) {
        this.orgAddressCountry = orgAddressCountry;
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

    public String getOrgAddressSettlementType() {
        return orgAddressSettlementType;
    }

    public void setOrgAddressSettlementType(String orgAddressSettlementType) {
        this.orgAddressSettlementType = orgAddressSettlementType;
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
}
