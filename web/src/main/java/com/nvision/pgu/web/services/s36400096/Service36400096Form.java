package com.nvision.pgu.web.services.s36400096;


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
public class Service36400096Form extends AbstractServiceOrderForm {

    private String applType;
    private String dov_enable;
    private String dovUlType;
    private String otherApplCh;
    private String fl_owner_enable;
    private String ul_owner_enable;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String sex;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;
    private String identityDocType;
    private String otherDocTypeName;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private FileBean dovUlNonDovLoad;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovlastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovfirstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovmiddleName;
    private FileBean dovUlDovLoad;
    private FileBean dovUlPasLoad;
    private String org_FullTitle;
    private String org_opf;	//FORM_OF_INCORPORATION_64
    private String org_SmallTitle;
    private List<FileBean> founderDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<String> fl_owner_lastName = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_firstName = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_middleName = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_docType = AccessCounterList.createEmpty(String.class);
    private List<String> fl_owner_docNum = AccessCounterList.createEmpty(String.class);
    private List<Date> fl_owner_docDate = AccessCounterList.createEmpty(Date.class);
    private List<FileBean> fl_owner_DocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<String> ul_owner_FullTitle = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_opf = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_SmallTitle = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_docType = AccessCounterList.createEmpty(String.class);
    private List<String> ul_owner_docNum = AccessCounterList.createEmpty(String.class);
    private List<Date> ul_owner_docDate = AccessCounterList.createEmpty(Date.class);
    private List<FileBean> ul_owner_DocLoad = AccessCounterList.createEmpty(FileBean.class);
    private String roomStatusNow;	//64_STATUS_PREMISES_64096
    private String roomStatusAfter;	//64_STATUS_PREMISES_64096
    private String roomPurpose;
    private String wayOfDelivery;	//64_WAY_OF_DELIVERY_64096
    private FileBean proectDocLoad;
    private List<FileBean> decisionDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean agreeUlDocLoad;
    private FileBean lowDocLoad;
    private FileBean housePlanDocLoad;
    private FileBean techPlanDocLoad;
    private FileBean techPassport;
    private String agree1Ch;
    private String agree2Ch;
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
    // org_addressPost
    private String org_addressPostIndex;
    private String org_addressPostEnterType;
    private String org_addressPostRegion;
    private String org_addressPostRayon;
    private String org_addressPostCity;
    private String org_addressPostSettlementText;
    private String org_addressPostSettlementDict;
    private String org_addressPostStreetText;
    private String org_addressPostStreetDict;
    private String org_addressPostHouse;
    private String org_addressPostKorpus;
    private String org_addressPostFlat;
    private String org_addressPostCountry = "643";
    private String org_addressPostCountryCode = "ru";
    private String org_addressPostCountryInput;
    private String org_addressPostSettlementType = "1";
    private String org_addressPostCountrySettlement;
    // roomAddress
    private String roomAddressIndex;
    private String roomAddressEnterType;
    private String roomAddressRegion;
    private String roomAddressRayon;
    private String roomAddressCity;
    private String roomAddressSettlementText;
    private String roomAddressSettlementDict;
    private String roomAddressStreetText;
    private String roomAddressStreetDict;
    private String roomAddressHouse;
    private String roomAddressKorpus;
    private String roomAddressFlat;
    private String roomAddressCountry = "643";
    private String roomAddressCountryCode = "ru";
    private String roomAddressCountryInput;
    private String roomAddressSettlementType = "1";
    private String roomAddressCountrySettlement;

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

    public String getOrg_addressPostIndex() {
        return org_addressPostIndex;
    }

    public void setOrg_addressPostIndex(String org_addressPostIndex) {
        this.org_addressPostIndex = org_addressPostIndex;
    }

    public String getOrg_addressPostEnterType() {
        return org_addressPostEnterType;
    }

    public void setOrg_addressPostEnterType(String org_addressPostEnterType) {
        this.org_addressPostEnterType = org_addressPostEnterType;
    }

    public String getOrg_addressPostRegion() {
        return org_addressPostRegion;
    }

    public void setOrg_addressPostRegion(String org_addressPostRegion) {
        this.org_addressPostRegion = org_addressPostRegion;
    }

    public String getOrg_addressPostRayon() {
        return org_addressPostRayon;
    }

    public void setOrg_addressPostRayon(String org_addressPostRayon) {
        this.org_addressPostRayon = org_addressPostRayon;
    }

    public String getOrg_addressPostCity() {
        return org_addressPostCity;
    }

    public void setOrg_addressPostCity(String org_addressPostCity) {
        this.org_addressPostCity = org_addressPostCity;
    }

    public String getOrg_addressPostSettlementText() {
        return org_addressPostSettlementText;
    }

    public void setOrg_addressPostSettlementText(String org_addressPostSettlementText) {
        this.org_addressPostSettlementText = org_addressPostSettlementText;
    }

    public String getOrg_addressPostSettlementDict() {
        return org_addressPostSettlementDict;
    }

    public void setOrg_addressPostSettlementDict(String org_addressPostSettlementDict) {
        this.org_addressPostSettlementDict = org_addressPostSettlementDict;
    }

    public String getOrg_addressPostStreetText() {
        return org_addressPostStreetText;
    }

    public void setOrg_addressPostStreetText(String org_addressPostStreetText) {
        this.org_addressPostStreetText = org_addressPostStreetText;
    }

    public String getOrg_addressPostStreetDict() {
        return org_addressPostStreetDict;
    }

    public void setOrg_addressPostStreetDict(String org_addressPostStreetDict) {
        this.org_addressPostStreetDict = org_addressPostStreetDict;
    }

    public String getOrg_addressPostHouse() {
        return org_addressPostHouse;
    }

    public void setOrg_addressPostHouse(String org_addressPostHouse) {
        this.org_addressPostHouse = org_addressPostHouse;
    }

    public String getOrg_addressPostKorpus() {
        return org_addressPostKorpus;
    }

    public void setOrg_addressPostKorpus(String org_addressPostKorpus) {
        this.org_addressPostKorpus = org_addressPostKorpus;
    }

    public String getOrg_addressPostFlat() {
        return org_addressPostFlat;
    }

    public void setOrg_addressPostFlat(String org_addressPostFlat) {
        this.org_addressPostFlat = org_addressPostFlat;
    }

    public String getOrg_addressPostCountry() {
        return org_addressPostCountry;
    }

    public void setOrg_addressPostCountry(String org_addressPostCountry) {
        this.org_addressPostCountry = org_addressPostCountry;
    }

    public String getOrg_addressPostCountryCode() {
        return org_addressPostCountryCode;
    }

    public void setOrg_addressPostCountryCode(String org_addressPostCountryCode) {
        this.org_addressPostCountryCode = org_addressPostCountryCode;
    }

    public String getOrg_addressPostCountryInput() {
        return org_addressPostCountryInput;
    }

    public void setOrg_addressPostCountryInput(String org_addressPostCountryInput) {
        this.org_addressPostCountryInput = org_addressPostCountryInput;
    }

    public String getOrg_addressPostSettlementType() {
        return org_addressPostSettlementType;
    }

    public void setOrg_addressPostSettlementType(String org_addressPostSettlementType) {
        this.org_addressPostSettlementType = org_addressPostSettlementType;
    }

    public String getOrg_addressPostCountrySettlement() {
        return org_addressPostCountrySettlement;
    }

    public void setOrg_addressPostCountrySettlement(String org_addressPostCountrySettlement) {
        this.org_addressPostCountrySettlement = org_addressPostCountrySettlement;
    }

    public String getRoomAddressIndex() {
        return roomAddressIndex;
    }

    public void setRoomAddressIndex(String roomAddressIndex) {
        this.roomAddressIndex = roomAddressIndex;
    }

    public String getRoomAddressEnterType() {
        return roomAddressEnterType;
    }

    public void setRoomAddressEnterType(String roomAddressEnterType) {
        this.roomAddressEnterType = roomAddressEnterType;
    }

    public String getRoomAddressRegion() {
        return roomAddressRegion;
    }

    public void setRoomAddressRegion(String roomAddressRegion) {
        this.roomAddressRegion = roomAddressRegion;
    }

    public String getRoomAddressRayon() {
        return roomAddressRayon;
    }

    public void setRoomAddressRayon(String roomAddressRayon) {
        this.roomAddressRayon = roomAddressRayon;
    }

    public String getRoomAddressCity() {
        return roomAddressCity;
    }

    public void setRoomAddressCity(String roomAddressCity) {
        this.roomAddressCity = roomAddressCity;
    }

    public String getRoomAddressSettlementText() {
        return roomAddressSettlementText;
    }

    public void setRoomAddressSettlementText(String roomAddressSettlementText) {
        this.roomAddressSettlementText = roomAddressSettlementText;
    }

    public String getRoomAddressSettlementDict() {
        return roomAddressSettlementDict;
    }

    public void setRoomAddressSettlementDict(String roomAddressSettlementDict) {
        this.roomAddressSettlementDict = roomAddressSettlementDict;
    }

    public String getRoomAddressStreetText() {
        return roomAddressStreetText;
    }

    public void setRoomAddressStreetText(String roomAddressStreetText) {
        this.roomAddressStreetText = roomAddressStreetText;
    }

    public String getRoomAddressStreetDict() {
        return roomAddressStreetDict;
    }

    public void setRoomAddressStreetDict(String roomAddressStreetDict) {
        this.roomAddressStreetDict = roomAddressStreetDict;
    }

    public String getRoomAddressHouse() {
        return roomAddressHouse;
    }

    public void setRoomAddressHouse(String roomAddressHouse) {
        this.roomAddressHouse = roomAddressHouse;
    }

    public String getRoomAddressKorpus() {
        return roomAddressKorpus;
    }

    public void setRoomAddressKorpus(String roomAddressKorpus) {
        this.roomAddressKorpus = roomAddressKorpus;
    }

    public String getRoomAddressFlat() {
        return roomAddressFlat;
    }

    public void setRoomAddressFlat(String roomAddressFlat) {
        this.roomAddressFlat = roomAddressFlat;
    }

    public String getRoomAddressCountry() {
        return roomAddressCountry;
    }

    public void setRoomAddressCountry(String roomAddressCountry) {
        this.roomAddressCountry = roomAddressCountry;
    }

    public String getRoomAddressCountryCode() {
        return roomAddressCountryCode;
    }

    public void setRoomAddressCountryCode(String roomAddressCountryCode) {
        this.roomAddressCountryCode = roomAddressCountryCode;
    }

    public String getRoomAddressCountryInput() {
        return roomAddressCountryInput;
    }

    public void setRoomAddressCountryInput(String roomAddressCountryInput) {
        this.roomAddressCountryInput = roomAddressCountryInput;
    }

    public String getRoomAddressSettlementType() {
        return roomAddressSettlementType;
    }

    public void setRoomAddressSettlementType(String roomAddressSettlementType) {
        this.roomAddressSettlementType = roomAddressSettlementType;
    }

    public String getRoomAddressCountrySettlement() {
        return roomAddressCountrySettlement;
    }

    public void setRoomAddressCountrySettlement(String roomAddressCountrySettlement) {
        this.roomAddressCountrySettlement = roomAddressCountrySettlement;
    }

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

    public void setOtherApplCh(String otherApplCh) {
        if (this.otherApplCh != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (otherApplCh == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getOtherApplCh())) { // ... а в форме сохранён on
                    this.setOtherApplCh_changed(true);
                }
                this.otherApplCh = "off";
            } else {
                if (!this.getOtherApplCh().equals(otherApplCh)){
                    this.setOtherApplCh_changed(true);
                }
                this.otherApplCh = otherApplCh;
            }
        } else {
            this.otherApplCh = otherApplCh;
        }
    }

    public String getOtherApplCh() {
        return otherApplCh == null ? "off" : this.otherApplCh;
    }

    public void setFl_owner_enable(String fl_owner_enable) {
        if (this.fl_owner_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (fl_owner_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getFl_owner_enable())) { // ... а в форме сохранён on
                    this.setFl_owner_enable_changed(true);
                }
                this.fl_owner_enable = "off";
            } else {
                if (!this.getFl_owner_enable().equals(fl_owner_enable)){
                    this.setFl_owner_enable_changed(true);
                }
                this.fl_owner_enable = fl_owner_enable;
            }
        } else {
            this.fl_owner_enable = fl_owner_enable;
        }
    }

    public String getFl_owner_enable() {
        return fl_owner_enable == null ? "off" : this.fl_owner_enable;
    }

    public void setUl_owner_enable(String ul_owner_enable) {
        if (this.ul_owner_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (ul_owner_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getUl_owner_enable())) { // ... а в форме сохранён on
                    this.setUl_owner_enable_changed(true);
                }
                this.ul_owner_enable = "off";
            } else {
                if (!this.getUl_owner_enable().equals(ul_owner_enable)){
                    this.setUl_owner_enable_changed(true);
                }
                this.ul_owner_enable = ul_owner_enable;
            }
        } else {
            this.ul_owner_enable = ul_owner_enable;
        }
    }

    public String getUl_owner_enable() {
        return ul_owner_enable == null ? "off" : this.ul_owner_enable;
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

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return this.sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
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

    public void setDovlastName(String dovlastName) {
        this.dovlastName = dovlastName;
    }
    public String getDovlastName() {
        return this.dovlastName;
    }

    public void setDovfirstName(String dovfirstName) {
        this.dovfirstName = dovfirstName;
    }
    public String getDovfirstName() {
        return this.dovfirstName;
    }

    public void setDovmiddleName(String dovmiddleName) {
        this.dovmiddleName = dovmiddleName;
    }
    public String getDovmiddleName() {
        return this.dovmiddleName;
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

    public void setOrg_SmallTitle(String org_SmallTitle) {
        this.org_SmallTitle = org_SmallTitle;
    }
    public String getOrg_SmallTitle() {
        return this.org_SmallTitle;
    }

    public void setFounderDocLoad(List<FileBean> founderDocLoad) {
        this.founderDocLoad = AccessCounterList.decorate(founderDocLoad, FileBean.class);
    }
    public List<FileBean> getFounderDocLoad() {
        return normalize(this.founderDocLoad);
    }

    public void setFl_owner_lastName(List<String> fl_owner_lastName) {
        this.fl_owner_lastName = AccessCounterList.decorate(fl_owner_lastName, String.class);
    }
    public List<String> getFl_owner_lastName() {
        return normalize(this.fl_owner_lastName);
    }

    public void setFl_owner_firstName(List<String> fl_owner_firstName) {
        this.fl_owner_firstName = AccessCounterList.decorate(fl_owner_firstName, String.class);
    }
    public List<String> getFl_owner_firstName() {
        return normalize(this.fl_owner_firstName);
    }

    public void setFl_owner_middleName(List<String> fl_owner_middleName) {
        this.fl_owner_middleName = AccessCounterList.decorate(fl_owner_middleName, String.class);
    }
    public List<String> getFl_owner_middleName() {
        return normalize(this.fl_owner_middleName);
    }

    public void setFl_owner_docType(List<String> fl_owner_docType) {
        this.fl_owner_docType = AccessCounterList.decorate(fl_owner_docType, String.class);
    }
    public List<String> getFl_owner_docType() {
        return normalize(this.fl_owner_docType);
    }

    public void setFl_owner_docNum(List<String> fl_owner_docNum) {
        this.fl_owner_docNum = AccessCounterList.decorate(fl_owner_docNum, String.class);
    }
    public List<String> getFl_owner_docNum() {
        return normalize(this.fl_owner_docNum);
    }

    public void setFl_owner_docDate(List<Date> fl_owner_docDate) {
        this.fl_owner_docDate = AccessCounterList.decorate(fl_owner_docDate, Date.class);
    }
    public List<Date> getFl_owner_docDate() {
        return normalize(this.fl_owner_docDate);
    }

    public void setFl_owner_DocLoad(List<FileBean> fl_owner_DocLoad) {
        this.fl_owner_DocLoad = AccessCounterList.decorate(fl_owner_DocLoad, FileBean.class);
    }
    public List<FileBean> getFl_owner_DocLoad() {
        return normalize(this.fl_owner_DocLoad);
    }

    public void setUl_owner_FullTitle(List<String> ul_owner_FullTitle) {
        this.ul_owner_FullTitle = AccessCounterList.decorate(ul_owner_FullTitle, String.class);
    }
    public List<String> getUl_owner_FullTitle() {
        return normalize(this.ul_owner_FullTitle);
    }

    public void setUl_owner_opf(List<String> ul_owner_opf) {
        this.ul_owner_opf = AccessCounterList.decorate(ul_owner_opf, String.class);
    }
    public List<String> getUl_owner_opf() {
        return normalize(this.ul_owner_opf);
    }

    public void setUl_owner_SmallTitle(List<String> ul_owner_SmallTitle) {
        this.ul_owner_SmallTitle = AccessCounterList.decorate(ul_owner_SmallTitle, String.class);
    }
    public List<String> getUl_owner_SmallTitle() {
        return normalize(this.ul_owner_SmallTitle);
    }

    public void setUl_owner_docType(List<String> ul_owner_docType) {
        this.ul_owner_docType = AccessCounterList.decorate(ul_owner_docType, String.class);
    }
    public List<String> getUl_owner_docType() {
        return normalize(this.ul_owner_docType);
    }

    public void setUl_owner_docNum(List<String> ul_owner_docNum) {
        this.ul_owner_docNum = AccessCounterList.decorate(ul_owner_docNum, String.class);
    }
    public List<String> getUl_owner_docNum() {
        return normalize(this.ul_owner_docNum);
    }

    public void setUl_owner_docDate(List<Date> ul_owner_docDate) {
        this.ul_owner_docDate = AccessCounterList.decorate(ul_owner_docDate, Date.class);
    }
    public List<Date> getUl_owner_docDate() {
        return normalize(this.ul_owner_docDate);
    }

    public void setUl_owner_DocLoad(List<FileBean> ul_owner_DocLoad) {
        this.ul_owner_DocLoad = AccessCounterList.decorate(ul_owner_DocLoad, FileBean.class);
    }
    public List<FileBean> getUl_owner_DocLoad() {
        return normalize(this.ul_owner_DocLoad);
    }

    public void setRoomStatusNow(String roomStatusNow) {
        this.roomStatusNow = roomStatusNow;
    }
    public String getRoomStatusNow() {
        return this.roomStatusNow;
    }

    public void setRoomStatusAfter(String roomStatusAfter) {
        this.roomStatusAfter = roomStatusAfter;
    }
    public String getRoomStatusAfter() {
        return this.roomStatusAfter;
    }

    public void setRoomPurpose(String roomPurpose) {
        this.roomPurpose = roomPurpose;
    }
    public String getRoomPurpose() {
        return this.roomPurpose;
    }

    public void setWayOfDelivery(String wayOfDelivery) {
        this.wayOfDelivery = wayOfDelivery;
    }
    public String getWayOfDelivery() {
        return this.wayOfDelivery;
    }

    public void setProectDocLoad(FileBean proectDocLoad) {
        this.proectDocLoad = proectDocLoad;
    }
    public FileBean getProectDocLoad() {
        return this.proectDocLoad;
    }

    public void setDecisionDocLoad(List<FileBean> decisionDocLoad) {
        this.decisionDocLoad = AccessCounterList.decorate(decisionDocLoad, FileBean.class);
    }
    public List<FileBean> getDecisionDocLoad() {
        return normalize(this.decisionDocLoad);
    }

    public void setAgreeUlDocLoad(FileBean agreeUlDocLoad) {
        this.agreeUlDocLoad = agreeUlDocLoad;
    }
    public FileBean getAgreeUlDocLoad() {
        return this.agreeUlDocLoad;
    }

    public void setLowDocLoad(FileBean lowDocLoad) {
        this.lowDocLoad = lowDocLoad;
    }
    public FileBean getLowDocLoad() {
        return this.lowDocLoad;
    }

    public void setHousePlanDocLoad(FileBean housePlanDocLoad) {
        this.housePlanDocLoad = housePlanDocLoad;
    }
    public FileBean getHousePlanDocLoad() {
        return this.housePlanDocLoad;
    }

    public void setTechPlanDocLoad(FileBean techPlanDocLoad) {
        this.techPlanDocLoad = techPlanDocLoad;
    }
    public FileBean getTechPlanDocLoad() {
        return this.techPlanDocLoad;
    }

    public void setTechPassport(FileBean techPassport) {
        this.techPassport = techPassport;
    }
    public FileBean getTechPassport() {
        return this.techPassport;
    }

    public void setAgree1Ch(String agree1Ch) {
        this.agree1Ch = agree1Ch;
    }
    public String getAgree1Ch() {
        return this.agree1Ch;
    }

    public void setAgree2Ch(String agree2Ch) {
        this.agree2Ch = agree2Ch;
    }
    public String getAgree2Ch() {
        return this.agree2Ch;
    }

    private Boolean dov_enable_changed = true;
    private Boolean applType_changed = true;
    private Boolean dovUlType_changed = true;
    private Boolean otherApplCh_changed = true;
    private Boolean fl_owner_enable_changed = true;
    private Boolean ul_owner_enable_changed = true;

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

    public void setOtherApplCh_changed(Boolean otherApplCh_changed) {
        this.otherApplCh_changed = otherApplCh_changed;
    }

    public Boolean getOtherApplCh_changed() {
        return otherApplCh_changed;
    }

    public void setFl_owner_enable_changed(Boolean fl_owner_enable_changed) {
        this.fl_owner_enable_changed = fl_owner_enable_changed;
    }

    public Boolean getFl_owner_enable_changed() {
        return fl_owner_enable_changed;
    }

    public void setUl_owner_enable_changed(Boolean ul_owner_enable_changed) {
        this.ul_owner_enable_changed = ul_owner_enable_changed;
    }

    public Boolean getUl_owner_enable_changed() {
        return ul_owner_enable_changed;
    }
    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setEmail("");
        this.setSex("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setOtherDocTypeName("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setSex(privateRoomDataContainer.getSex());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setOtherDocTypeName("");

    }

    public void clearDecisionDocLoad() {
        this.decisionDocLoad = AccessCounterList.createEmpty(FileBean.class);
    }

}
