package com.nvision.pgu.web.services.s36400102;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
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
public class Service36400102Form extends AbstractServiceOrderForm {

    private String dov_enable;
    private String incapable_enable;
    private FileBean dovDovLoad;
    private FileBean dovPasLoad;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SNILS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String snils;
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
    private FileBean dovOpekLoad;
    private String recipientLastName;
    private String recipientFirstName;
    private String recipientMiddleName;
    private String recipientSnils;
    private String gkuUspn;    //64_SOCIAL_SUPPORT_64053
    private String goalRef;    //03_GOAL_REF_64102
    private List<String> famLastName = AccessCounterList.createEmpty(String.class);
    private List<String> famFirstName = AccessCounterList.createEmpty(String.class);
    private List<String> famMiddleName = AccessCounterList.createEmpty(String.class);
    private List<String> famReason = AccessCounterList.createEmpty(String.class);
    private List<String> fam1LastName = AccessCounterList.createEmpty(String.class);
    private List<String> fam1FirstName = AccessCounterList.createEmpty(String.class);
    private List<String> fam1MiddleName = AccessCounterList.createEmpty(String.class);
    @JsonArrayToList
    private List<String> socSupport = AccessCounterList.createEmpty(String.class);
    private FileBean sostavDocLoad;
    private List<FileBean> familyDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> agree1DocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> socDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private Boolean dov_enable_changed = true;
    private Boolean incapable_enable_changed = true;
    // residenceAddress
    private String residenceAddressIndex;
    private String residenceAddressEnterType;
    private String residenceAddressRegion;
    private String residenceAddressRayon;
    private String residenceAddressCity;
    private String residenceAddressSettlementText;
    private String residenceAddressSettlementDict;
    private String residenceAddressStreetText;
    private String residenceAddressStreetDict;
    private String residenceAddressHouse;
    private String residenceAddressKorpus;
    private String residenceAddressFlat;
    private String residenceAddressCountry = "643";
    private String residenceAddressCountryCode = "ru";
    private String residenceAddressCountryInput;
    private String residenceAddressSettlementType = "1";
    private String residenceAddressCountrySettlement;
    // stayAddress
    private String stayAddressIndex;
    private String stayAddressEnterType;
    private String stayAddressRegion;
    private String stayAddressRayon;
    private String stayAddressCity;
    private String stayAddressSettlementText;
    private String stayAddressSettlementDict;
    private String stayAddressStreetText;
    private String stayAddressStreetDict;
    private String stayAddressHouse;
    private String stayAddressKorpus;
    private String stayAddressFlat;
    private String stayAddressCountry = "643";
    private String stayAddressCountryCode = "ru";
    private String stayAddressCountryInput;
    private String stayAddressSettlementType = "1";
    private String stayAddressCountrySettlement;
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
    // recipientResidenceAddress
    private String recipientResidenceAddressIndex;
    private String recipientResidenceAddressEnterType;
    private String recipientResidenceAddressRegion;
    private String recipientResidenceAddressRayon;
    private String recipientResidenceAddressCity;
    private String recipientResidenceAddressSettlementText;
    private String recipientResidenceAddressSettlementDict;
    private String recipientResidenceAddressStreetText;
    private String recipientResidenceAddressStreetDict;
    private String recipientResidenceAddressHouse;
    private String recipientResidenceAddressKorpus;
    private String recipientResidenceAddressFlat;
    private String recipientResidenceAddressCountry = "643";
    private String recipientResidenceAddressCountryCode = "ru";
    private String recipientResidenceAddressCountryInput;
    private String recipientResidenceAddressSettlementType = "1";
    private String recipientResidenceAddressCountrySettlement;
    // recipientStayAddress
    private String recipientStayAddressIndex;
    private String recipientStayAddressEnterType;
    private String recipientStayAddressRegion;
    private String recipientStayAddressRayon;
    private String recipientStayAddressCity;
    private String recipientStayAddressSettlementText;
    private String recipientStayAddressSettlementDict;
    private String recipientStayAddressStreetText;
    private String recipientStayAddressStreetDict;
    private String recipientStayAddressHouse;
    private String recipientStayAddressKorpus;
    private String recipientStayAddressFlat;
    private String recipientStayAddressCountry = "643";
    private String recipientStayAddressCountryCode = "ru";
    private String recipientStayAddressCountryInput;
    private String recipientStayAddressSettlementType = "1";
    private String recipientStayAddressCountrySettlement;
    // recipientFactAddress
    private String recipientFactAddressIndex;
    private String recipientFactAddressEnterType;
    private String recipientFactAddressRegion;
    private String recipientFactAddressRayon;
    private String recipientFactAddressCity;
    private String recipientFactAddressSettlementText;
    private String recipientFactAddressSettlementDict;
    private String recipientFactAddressStreetText;
    private String recipientFactAddressStreetDict;
    private String recipientFactAddressHouse;
    private String recipientFactAddressKorpus;
    private String recipientFactAddressFlat;
    private String recipientFactAddressCountry = "643";
    private String recipientFactAddressCountryCode = "ru";
    private String recipientFactAddressCountryInput;
    private String recipientFactAddressSettlementType = "1";
    private String recipientFactAddressCountrySettlement;

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

    public String getIncapable_enable() {
        return incapable_enable == null ? "off" : this.incapable_enable;
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

    public FileBean getDovDovLoad() {
        return this.dovDovLoad;
    }

    public void setDovDovLoad(FileBean dovDovLoad) {
        this.dovDovLoad = dovDovLoad;
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

    public String getSnils() {
        return this.snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
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

    public String getOtherDocTypeName() {
        return this.otherDocTypeName;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
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

    public FileBean getDovOpekLoad() {
        return this.dovOpekLoad;
    }

    public void setDovOpekLoad(FileBean dovOpekLoad) {
        this.dovOpekLoad = dovOpekLoad;
    }

    public String getRecipientLastName() {
        return this.recipientLastName;
    }

    public void setRecipientLastName(String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }

    public String getRecipientFirstName() {
        return this.recipientFirstName;
    }

    public void setRecipientFirstName(String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }

    public String getRecipientMiddleName() {
        return this.recipientMiddleName;
    }

    public void setRecipientMiddleName(String recipientMiddleName) {
        this.recipientMiddleName = recipientMiddleName;
    }

    public String getRecipientSnils() {
        return this.recipientSnils;
    }

    public void setRecipientSnils(String recipientSnils) {
        this.recipientSnils = recipientSnils;
    }

    public String getGkuUspn() {
        return this.gkuUspn;
    }

    public void setGkuUspn(String gkuUspn) {
        this.gkuUspn = gkuUspn;
    }

    public String getGoalRef() {
        return this.goalRef;
    }

    public void setGoalRef(String goalRef) {
        this.goalRef = goalRef;
    }

    public List<String> getFamLastName() {
        return normalize(this.famLastName);
    }

    public void setFamLastName(List<String> famLastName) {
        this.famLastName = AccessCounterList.decorate(famLastName, String.class);
    }

    public List<String> getFamFirstName() {
        return normalize(this.famFirstName);
    }

    public void setFamFirstName(List<String> famFirstName) {
        this.famFirstName = AccessCounterList.decorate(famFirstName, String.class);
    }

    public List<String> getFamMiddleName() {
        return normalize(this.famMiddleName);
    }

    public void setFamMiddleName(List<String> famMiddleName) {
        this.famMiddleName = AccessCounterList.decorate(famMiddleName, String.class);
    }

    public List<String> getFamReason() {
        return normalize(this.famReason);
    }

    public void setFamReason(List<String> famReason) {
        this.famReason = AccessCounterList.decorate(famReason, String.class);
    }

    public List<String> getFam1LastName() {
        return normalize(this.fam1LastName);
    }

    public void setFam1LastName(List<String> fam1LastName) {
        this.fam1LastName = AccessCounterList.decorate(fam1LastName, String.class);
    }

    public List<String> getFam1FirstName() {
        return normalize(this.fam1FirstName);
    }

    public void setFam1FirstName(List<String> fam1FirstName) {
        this.fam1FirstName = AccessCounterList.decorate(fam1FirstName, String.class);
    }

    public List<String> getFam1MiddleName() {
        return normalize(this.fam1MiddleName);
    }

    public void setFam1MiddleName(List<String> fam1MiddleName) {
        this.fam1MiddleName = AccessCounterList.decorate(fam1MiddleName, String.class);
    }

    public List<String> getSocSupport() {
        return normalize(this.socSupport);
    }

    public void setSocSupport(List<String> socSupport) {
        this.socSupport = AccessCounterList.decorate(socSupport, String.class);
    }

    public FileBean getSostavDocLoad() {
        return this.sostavDocLoad;
    }

    public void setSostavDocLoad(FileBean sostavDocLoad) {
        this.sostavDocLoad = sostavDocLoad;
    }

    public List<FileBean> getFamilyDocLoad() {
        return normalize(this.familyDocLoad);
    }

    public void setFamilyDocLoad(List<FileBean> familyDocLoad) {
        this.familyDocLoad = AccessCounterList.decorate(familyDocLoad, FileBean.class);
    }

    public List<FileBean> getAgree1DocLoad() {
        return normalize(this.agree1DocLoad);
    }

    public void setAgree1DocLoad(List<FileBean> agree1DocLoad) {
        this.agree1DocLoad = AccessCounterList.decorate(agree1DocLoad, FileBean.class);
    }

    public List<FileBean> getSocDocLoad() {
        return normalize(this.socDocLoad);
    }

    public void setSocDocLoad(List<FileBean> socDocLoad) {
        this.socDocLoad = AccessCounterList.decorate(socDocLoad, FileBean.class);
    }

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
    }

    public Boolean getIncapable_enable_changed() {
        return incapable_enable_changed;
    }

    public void setIncapable_enable_changed(Boolean incapable_enable_changed) {
        this.incapable_enable_changed = incapable_enable_changed;
    }

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setSnils("");
        this.setPhone("");
        this.setEmail("");
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
        this.setSnils(privateRoomDataContainer.getSnils());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setOtherDocTypeName("");

    }

    public String getResidenceAddressIndex() {
        return residenceAddressIndex;
    }

    public void setResidenceAddressIndex(String residenceAddressIndex) {
        this.residenceAddressIndex = residenceAddressIndex;
    }

    public String getResidenceAddressEnterType() {
        return residenceAddressEnterType;
    }

    public void setResidenceAddressEnterType(String residenceAddressEnterType) {
        this.residenceAddressEnterType = residenceAddressEnterType;
    }

    public String getResidenceAddressRegion() {
        return residenceAddressRegion;
    }

    public void setResidenceAddressRegion(String residenceAddressRegion) {
        this.residenceAddressRegion = residenceAddressRegion;
    }

    public String getResidenceAddressRayon() {
        return residenceAddressRayon;
    }

    public void setResidenceAddressRayon(String residenceAddressRayon) {
        this.residenceAddressRayon = residenceAddressRayon;
    }

    public String getResidenceAddressCity() {
        return residenceAddressCity;
    }

    public void setResidenceAddressCity(String residenceAddressCity) {
        this.residenceAddressCity = residenceAddressCity;
    }

    public String getResidenceAddressSettlementText() {
        return residenceAddressSettlementText;
    }

    public void setResidenceAddressSettlementText(String residenceAddressSettlementText) {
        this.residenceAddressSettlementText = residenceAddressSettlementText;
    }

    public String getResidenceAddressSettlementDict() {
        return residenceAddressSettlementDict;
    }

    public void setResidenceAddressSettlementDict(String residenceAddressSettlementDict) {
        this.residenceAddressSettlementDict = residenceAddressSettlementDict;
    }

    public String getResidenceAddressStreetText() {
        return residenceAddressStreetText;
    }

    public void setResidenceAddressStreetText(String residenceAddressStreetText) {
        this.residenceAddressStreetText = residenceAddressStreetText;
    }

    public String getResidenceAddressStreetDict() {
        return residenceAddressStreetDict;
    }

    public void setResidenceAddressStreetDict(String residenceAddressStreetDict) {
        this.residenceAddressStreetDict = residenceAddressStreetDict;
    }

    public String getResidenceAddressHouse() {
        return residenceAddressHouse;
    }

    public void setResidenceAddressHouse(String residenceAddressHouse) {
        this.residenceAddressHouse = residenceAddressHouse;
    }

    public String getResidenceAddressKorpus() {
        return residenceAddressKorpus;
    }

    public void setResidenceAddressKorpus(String residenceAddressKorpus) {
        this.residenceAddressKorpus = residenceAddressKorpus;
    }

    public String getResidenceAddressFlat() {
        return residenceAddressFlat;
    }

    public void setResidenceAddressFlat(String residenceAddressFlat) {
        this.residenceAddressFlat = residenceAddressFlat;
    }

    public String getResidenceAddressCountry() {
        return residenceAddressCountry;
    }

    public void setResidenceAddressCountry(String residenceAddressCountry) {
        this.residenceAddressCountry = residenceAddressCountry;
    }

    public String getResidenceAddressCountryCode() {
        return residenceAddressCountryCode;
    }

    public void setResidenceAddressCountryCode(String residenceAddressCountryCode) {
        this.residenceAddressCountryCode = residenceAddressCountryCode;
    }

    public String getResidenceAddressCountryInput() {
        return residenceAddressCountryInput;
    }

    public void setResidenceAddressCountryInput(String residenceAddressCountryInput) {
        this.residenceAddressCountryInput = residenceAddressCountryInput;
    }

    public String getResidenceAddressSettlementType() {
        return residenceAddressSettlementType;
    }

    public void setResidenceAddressSettlementType(String residenceAddressSettlementType) {
        this.residenceAddressSettlementType = residenceAddressSettlementType;
    }

    public String getResidenceAddressCountrySettlement() {
        return residenceAddressCountrySettlement;
    }

    public void setResidenceAddressCountrySettlement(String residenceAddressCountrySettlement) {
        this.residenceAddressCountrySettlement = residenceAddressCountrySettlement;
    }

    public String getStayAddressIndex() {
        return stayAddressIndex;
    }

    public void setStayAddressIndex(String stayAddressIndex) {
        this.stayAddressIndex = stayAddressIndex;
    }

    public String getStayAddressEnterType() {
        return stayAddressEnterType;
    }

    public void setStayAddressEnterType(String stayAddressEnterType) {
        this.stayAddressEnterType = stayAddressEnterType;
    }

    public String getStayAddressRegion() {
        return stayAddressRegion;
    }

    public void setStayAddressRegion(String stayAddressRegion) {
        this.stayAddressRegion = stayAddressRegion;
    }

    public String getStayAddressRayon() {
        return stayAddressRayon;
    }

    public void setStayAddressRayon(String stayAddressRayon) {
        this.stayAddressRayon = stayAddressRayon;
    }

    public String getStayAddressCity() {
        return stayAddressCity;
    }

    public void setStayAddressCity(String stayAddressCity) {
        this.stayAddressCity = stayAddressCity;
    }

    public String getStayAddressSettlementText() {
        return stayAddressSettlementText;
    }

    public void setStayAddressSettlementText(String stayAddressSettlementText) {
        this.stayAddressSettlementText = stayAddressSettlementText;
    }

    public String getStayAddressSettlementDict() {
        return stayAddressSettlementDict;
    }

    public void setStayAddressSettlementDict(String stayAddressSettlementDict) {
        this.stayAddressSettlementDict = stayAddressSettlementDict;
    }

    public String getStayAddressStreetText() {
        return stayAddressStreetText;
    }

    public void setStayAddressStreetText(String stayAddressStreetText) {
        this.stayAddressStreetText = stayAddressStreetText;
    }

    public String getStayAddressStreetDict() {
        return stayAddressStreetDict;
    }

    public void setStayAddressStreetDict(String stayAddressStreetDict) {
        this.stayAddressStreetDict = stayAddressStreetDict;
    }

    public String getStayAddressHouse() {
        return stayAddressHouse;
    }

    public void setStayAddressHouse(String stayAddressHouse) {
        this.stayAddressHouse = stayAddressHouse;
    }

    public String getStayAddressKorpus() {
        return stayAddressKorpus;
    }

    public void setStayAddressKorpus(String stayAddressKorpus) {
        this.stayAddressKorpus = stayAddressKorpus;
    }

    public String getStayAddressFlat() {
        return stayAddressFlat;
    }

    public void setStayAddressFlat(String stayAddressFlat) {
        this.stayAddressFlat = stayAddressFlat;
    }

    public String getStayAddressCountry() {
        return stayAddressCountry;
    }

    public void setStayAddressCountry(String stayAddressCountry) {
        this.stayAddressCountry = stayAddressCountry;
    }

    public String getStayAddressCountryCode() {
        return stayAddressCountryCode;
    }

    public void setStayAddressCountryCode(String stayAddressCountryCode) {
        this.stayAddressCountryCode = stayAddressCountryCode;
    }

    public String getStayAddressCountryInput() {
        return stayAddressCountryInput;
    }

    public void setStayAddressCountryInput(String stayAddressCountryInput) {
        this.stayAddressCountryInput = stayAddressCountryInput;
    }

    public String getStayAddressSettlementType() {
        return stayAddressSettlementType;
    }

    public void setStayAddressSettlementType(String stayAddressSettlementType) {
        this.stayAddressSettlementType = stayAddressSettlementType;
    }

    public String getStayAddressCountrySettlement() {
        return stayAddressCountrySettlement;
    }

    public void setStayAddressCountrySettlement(String stayAddressCountrySettlement) {
        this.stayAddressCountrySettlement = stayAddressCountrySettlement;
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

    public String getRecipientResidenceAddressIndex() {
        return recipientResidenceAddressIndex;
    }

    public void setRecipientResidenceAddressIndex(String recipientResidenceAddressIndex) {
        this.recipientResidenceAddressIndex = recipientResidenceAddressIndex;
    }

    public String getRecipientResidenceAddressEnterType() {
        return recipientResidenceAddressEnterType;
    }

    public void setRecipientResidenceAddressEnterType(String recipientResidenceAddressEnterType) {
        this.recipientResidenceAddressEnterType = recipientResidenceAddressEnterType;
    }

    public String getRecipientResidenceAddressRegion() {
        return recipientResidenceAddressRegion;
    }

    public void setRecipientResidenceAddressRegion(String recipientResidenceAddressRegion) {
        this.recipientResidenceAddressRegion = recipientResidenceAddressRegion;
    }

    public String getRecipientResidenceAddressRayon() {
        return recipientResidenceAddressRayon;
    }

    public void setRecipientResidenceAddressRayon(String recipientResidenceAddressRayon) {
        this.recipientResidenceAddressRayon = recipientResidenceAddressRayon;
    }

    public String getRecipientResidenceAddressCity() {
        return recipientResidenceAddressCity;
    }

    public void setRecipientResidenceAddressCity(String recipientResidenceAddressCity) {
        this.recipientResidenceAddressCity = recipientResidenceAddressCity;
    }

    public String getRecipientResidenceAddressSettlementText() {
        return recipientResidenceAddressSettlementText;
    }

    public void setRecipientResidenceAddressSettlementText(String recipientResidenceAddressSettlementText) {
        this.recipientResidenceAddressSettlementText = recipientResidenceAddressSettlementText;
    }

    public String getRecipientResidenceAddressSettlementDict() {
        return recipientResidenceAddressSettlementDict;
    }

    public void setRecipientResidenceAddressSettlementDict(String recipientResidenceAddressSettlementDict) {
        this.recipientResidenceAddressSettlementDict = recipientResidenceAddressSettlementDict;
    }

    public String getRecipientResidenceAddressStreetText() {
        return recipientResidenceAddressStreetText;
    }

    public void setRecipientResidenceAddressStreetText(String recipientResidenceAddressStreetText) {
        this.recipientResidenceAddressStreetText = recipientResidenceAddressStreetText;
    }

    public String getRecipientResidenceAddressStreetDict() {
        return recipientResidenceAddressStreetDict;
    }

    public void setRecipientResidenceAddressStreetDict(String recipientResidenceAddressStreetDict) {
        this.recipientResidenceAddressStreetDict = recipientResidenceAddressStreetDict;
    }

    public String getRecipientResidenceAddressHouse() {
        return recipientResidenceAddressHouse;
    }

    public void setRecipientResidenceAddressHouse(String recipientResidenceAddressHouse) {
        this.recipientResidenceAddressHouse = recipientResidenceAddressHouse;
    }

    public String getRecipientResidenceAddressKorpus() {
        return recipientResidenceAddressKorpus;
    }

    public void setRecipientResidenceAddressKorpus(String recipientResidenceAddressKorpus) {
        this.recipientResidenceAddressKorpus = recipientResidenceAddressKorpus;
    }

    public String getRecipientResidenceAddressFlat() {
        return recipientResidenceAddressFlat;
    }

    public void setRecipientResidenceAddressFlat(String recipientResidenceAddressFlat) {
        this.recipientResidenceAddressFlat = recipientResidenceAddressFlat;
    }

    public String getRecipientResidenceAddressCountry() {
        return recipientResidenceAddressCountry;
    }

    public void setRecipientResidenceAddressCountry(String recipientResidenceAddressCountry) {
        this.recipientResidenceAddressCountry = recipientResidenceAddressCountry;
    }

    public String getRecipientResidenceAddressCountryCode() {
        return recipientResidenceAddressCountryCode;
    }

    public void setRecipientResidenceAddressCountryCode(String recipientResidenceAddressCountryCode) {
        this.recipientResidenceAddressCountryCode = recipientResidenceAddressCountryCode;
    }

    public String getRecipientResidenceAddressCountryInput() {
        return recipientResidenceAddressCountryInput;
    }

    public void setRecipientResidenceAddressCountryInput(String recipientResidenceAddressCountryInput) {
        this.recipientResidenceAddressCountryInput = recipientResidenceAddressCountryInput;
    }

    public String getRecipientResidenceAddressSettlementType() {
        return recipientResidenceAddressSettlementType;
    }

    public void setRecipientResidenceAddressSettlementType(String recipientResidenceAddressSettlementType) {
        this.recipientResidenceAddressSettlementType = recipientResidenceAddressSettlementType;
    }

    public String getRecipientResidenceAddressCountrySettlement() {
        return recipientResidenceAddressCountrySettlement;
    }

    public void setRecipientResidenceAddressCountrySettlement(String recipientResidenceAddressCountrySettlement) {
        this.recipientResidenceAddressCountrySettlement = recipientResidenceAddressCountrySettlement;
    }

    public String getRecipientStayAddressIndex() {
        return recipientStayAddressIndex;
    }

    public void setRecipientStayAddressIndex(String recipientStayAddressIndex) {
        this.recipientStayAddressIndex = recipientStayAddressIndex;
    }

    public String getRecipientStayAddressEnterType() {
        return recipientStayAddressEnterType;
    }

    public void setRecipientStayAddressEnterType(String recipientStayAddressEnterType) {
        this.recipientStayAddressEnterType = recipientStayAddressEnterType;
    }

    public String getRecipientStayAddressRegion() {
        return recipientStayAddressRegion;
    }

    public void setRecipientStayAddressRegion(String recipientStayAddressRegion) {
        this.recipientStayAddressRegion = recipientStayAddressRegion;
    }

    public String getRecipientStayAddressRayon() {
        return recipientStayAddressRayon;
    }

    public void setRecipientStayAddressRayon(String recipientStayAddressRayon) {
        this.recipientStayAddressRayon = recipientStayAddressRayon;
    }

    public String getRecipientStayAddressCity() {
        return recipientStayAddressCity;
    }

    public void setRecipientStayAddressCity(String recipientStayAddressCity) {
        this.recipientStayAddressCity = recipientStayAddressCity;
    }

    public String getRecipientStayAddressSettlementText() {
        return recipientStayAddressSettlementText;
    }

    public void setRecipientStayAddressSettlementText(String recipientStayAddressSettlementText) {
        this.recipientStayAddressSettlementText = recipientStayAddressSettlementText;
    }

    public String getRecipientStayAddressSettlementDict() {
        return recipientStayAddressSettlementDict;
    }

    public void setRecipientStayAddressSettlementDict(String recipientStayAddressSettlementDict) {
        this.recipientStayAddressSettlementDict = recipientStayAddressSettlementDict;
    }

    public String getRecipientStayAddressStreetText() {
        return recipientStayAddressStreetText;
    }

    public void setRecipientStayAddressStreetText(String recipientStayAddressStreetText) {
        this.recipientStayAddressStreetText = recipientStayAddressStreetText;
    }

    public String getRecipientStayAddressStreetDict() {
        return recipientStayAddressStreetDict;
    }

    public void setRecipientStayAddressStreetDict(String recipientStayAddressStreetDict) {
        this.recipientStayAddressStreetDict = recipientStayAddressStreetDict;
    }

    public String getRecipientStayAddressHouse() {
        return recipientStayAddressHouse;
    }

    public void setRecipientStayAddressHouse(String recipientStayAddressHouse) {
        this.recipientStayAddressHouse = recipientStayAddressHouse;
    }

    public String getRecipientStayAddressKorpus() {
        return recipientStayAddressKorpus;
    }

    public void setRecipientStayAddressKorpus(String recipientStayAddressKorpus) {
        this.recipientStayAddressKorpus = recipientStayAddressKorpus;
    }

    public String getRecipientStayAddressFlat() {
        return recipientStayAddressFlat;
    }

    public void setRecipientStayAddressFlat(String recipientStayAddressFlat) {
        this.recipientStayAddressFlat = recipientStayAddressFlat;
    }

    public String getRecipientStayAddressCountry() {
        return recipientStayAddressCountry;
    }

    public void setRecipientStayAddressCountry(String recipientStayAddressCountry) {
        this.recipientStayAddressCountry = recipientStayAddressCountry;
    }

    public String getRecipientStayAddressCountryCode() {
        return recipientStayAddressCountryCode;
    }

    public void setRecipientStayAddressCountryCode(String recipientStayAddressCountryCode) {
        this.recipientStayAddressCountryCode = recipientStayAddressCountryCode;
    }

    public String getRecipientStayAddressCountryInput() {
        return recipientStayAddressCountryInput;
    }

    public void setRecipientStayAddressCountryInput(String recipientStayAddressCountryInput) {
        this.recipientStayAddressCountryInput = recipientStayAddressCountryInput;
    }

    public String getRecipientStayAddressSettlementType() {
        return recipientStayAddressSettlementType;
    }

    public void setRecipientStayAddressSettlementType(String recipientStayAddressSettlementType) {
        this.recipientStayAddressSettlementType = recipientStayAddressSettlementType;
    }

    public String getRecipientStayAddressCountrySettlement() {
        return recipientStayAddressCountrySettlement;
    }

    public void setRecipientStayAddressCountrySettlement(String recipientStayAddressCountrySettlement) {
        this.recipientStayAddressCountrySettlement = recipientStayAddressCountrySettlement;
    }

    public String getRecipientFactAddressIndex() {
        return recipientFactAddressIndex;
    }

    public void setRecipientFactAddressIndex(String recipientFactAddressIndex) {
        this.recipientFactAddressIndex = recipientFactAddressIndex;
    }

    public String getRecipientFactAddressEnterType() {
        return recipientFactAddressEnterType;
    }

    public void setRecipientFactAddressEnterType(String recipientFactAddressEnterType) {
        this.recipientFactAddressEnterType = recipientFactAddressEnterType;
    }

    public String getRecipientFactAddressRegion() {
        return recipientFactAddressRegion;
    }

    public void setRecipientFactAddressRegion(String recipientFactAddressRegion) {
        this.recipientFactAddressRegion = recipientFactAddressRegion;
    }

    public String getRecipientFactAddressRayon() {
        return recipientFactAddressRayon;
    }

    public void setRecipientFactAddressRayon(String recipientFactAddressRayon) {
        this.recipientFactAddressRayon = recipientFactAddressRayon;
    }

    public String getRecipientFactAddressCity() {
        return recipientFactAddressCity;
    }

    public void setRecipientFactAddressCity(String recipientFactAddressCity) {
        this.recipientFactAddressCity = recipientFactAddressCity;
    }

    public String getRecipientFactAddressSettlementText() {
        return recipientFactAddressSettlementText;
    }

    public void setRecipientFactAddressSettlementText(String recipientFactAddressSettlementText) {
        this.recipientFactAddressSettlementText = recipientFactAddressSettlementText;
    }

    public String getRecipientFactAddressSettlementDict() {
        return recipientFactAddressSettlementDict;
    }

    public void setRecipientFactAddressSettlementDict(String recipientFactAddressSettlementDict) {
        this.recipientFactAddressSettlementDict = recipientFactAddressSettlementDict;
    }

    public String getRecipientFactAddressStreetText() {
        return recipientFactAddressStreetText;
    }

    public void setRecipientFactAddressStreetText(String recipientFactAddressStreetText) {
        this.recipientFactAddressStreetText = recipientFactAddressStreetText;
    }

    public String getRecipientFactAddressStreetDict() {
        return recipientFactAddressStreetDict;
    }

    public void setRecipientFactAddressStreetDict(String recipientFactAddressStreetDict) {
        this.recipientFactAddressStreetDict = recipientFactAddressStreetDict;
    }

    public String getRecipientFactAddressHouse() {
        return recipientFactAddressHouse;
    }

    public void setRecipientFactAddressHouse(String recipientFactAddressHouse) {
        this.recipientFactAddressHouse = recipientFactAddressHouse;
    }

    public String getRecipientFactAddressKorpus() {
        return recipientFactAddressKorpus;
    }

    public void setRecipientFactAddressKorpus(String recipientFactAddressKorpus) {
        this.recipientFactAddressKorpus = recipientFactAddressKorpus;
    }

    public String getRecipientFactAddressFlat() {
        return recipientFactAddressFlat;
    }

    public void setRecipientFactAddressFlat(String recipientFactAddressFlat) {
        this.recipientFactAddressFlat = recipientFactAddressFlat;
    }

    public String getRecipientFactAddressCountry() {
        return recipientFactAddressCountry;
    }

    public void setRecipientFactAddressCountry(String recipientFactAddressCountry) {
        this.recipientFactAddressCountry = recipientFactAddressCountry;
    }

    public String getRecipientFactAddressCountryCode() {
        return recipientFactAddressCountryCode;
    }

    public void setRecipientFactAddressCountryCode(String recipientFactAddressCountryCode) {
        this.recipientFactAddressCountryCode = recipientFactAddressCountryCode;
    }

    public String getRecipientFactAddressCountryInput() {
        return recipientFactAddressCountryInput;
    }

    public void setRecipientFactAddressCountryInput(String recipientFactAddressCountryInput) {
        this.recipientFactAddressCountryInput = recipientFactAddressCountryInput;
    }

    public String getRecipientFactAddressSettlementType() {
        return recipientFactAddressSettlementType;
    }

    public void setRecipientFactAddressSettlementType(String recipientFactAddressSettlementType) {
        this.recipientFactAddressSettlementType = recipientFactAddressSettlementType;
    }

    public String getRecipientFactAddressCountrySettlement() {
        return recipientFactAddressCountrySettlement;
    }

    public void setRecipientFactAddressCountrySettlement(String recipientFactAddressCountrySettlement) {
        this.recipientFactAddressCountrySettlement = recipientFactAddressCountrySettlement;
    }
}
