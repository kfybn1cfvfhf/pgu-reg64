package com.nvision.pgu.web.services.s36400201;
import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400201Form extends AbstractServiceOrderForm {
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
    private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;
    private String citizenship;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email;
    private String identityDocType;
    private String otherDocTypeName;
    private String passSeria;
    private String passNo;
    private Date passDate;
    private String passFrom;
    private FileBean identityDocLoad;
    private String target;
    private String additionally;
    private String agree;
    private FileBean emplDocLoad;
    private FileBean rightHousingExplDocLoad;
    private FileBean rightHousingNonEgrpDocLoad;
    private FileBean medicalReportDocLoad;
    private FileBean certMarriageDocLoad;
    private FileBean trainingDocLoad;
    private FileBean autobiographyDocLoad;
    private FileBean certCznMvDocLoad;
    private FileBean rightHousingOmsuMvDocLoad;
    private FileBean rightHousingEgrpMvDocLoad;
    private FileBean certMvdMvDocLoad;
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
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    public String getCitizenship() {
        return this.citizenship;
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
    public void setTarget(String target) {
        this.target = target;
    }
    public String getTarget() {
        return this.target;
    }
    public void setAdditionally(String additionally) {
        this.additionally = additionally;
    }
    public String getAdditionally() {
        return this.additionally;
    }
    public void setAgree(String agree) {
        this.agree = agree;
    }
    public String getAgree() {
        return this.agree;
    }
    public void setEmplDocLoad(FileBean emplDocLoad) {
        this.emplDocLoad = emplDocLoad;
    }
    public FileBean getEmplDocLoad() {
        return this.emplDocLoad;
    }
    public void setRightHousingExplDocLoad(FileBean rightHousingExplDocLoad) {
        this.rightHousingExplDocLoad = rightHousingExplDocLoad;
    }
    public FileBean getRightHousingExplDocLoad() {
        return this.rightHousingExplDocLoad;
    }
    public void setRightHousingNonEgrpDocLoad(FileBean rightHousingNonEgrpDocLoad) {
        this.rightHousingNonEgrpDocLoad = rightHousingNonEgrpDocLoad;
    }
    public FileBean getRightHousingNonEgrpDocLoad() {
        return this.rightHousingNonEgrpDocLoad;
    }
    public void setMedicalReportDocLoad(FileBean medicalReportDocLoad) {
        this.medicalReportDocLoad = medicalReportDocLoad;
    }
    public FileBean getMedicalReportDocLoad() {
        return this.medicalReportDocLoad;
    }
    public void setCertMarriageDocLoad(FileBean certMarriageDocLoad) {
        this.certMarriageDocLoad = certMarriageDocLoad;
    }
    public FileBean getCertMarriageDocLoad() {
        return this.certMarriageDocLoad;
    }
    public void setTrainingDocLoad(FileBean trainingDocLoad) {
        this.trainingDocLoad = trainingDocLoad;
    }
    public FileBean getTrainingDocLoad() {
        return this.trainingDocLoad;
    }
    public void setAutobiographyDocLoad(FileBean autobiographyDocLoad) {
        this.autobiographyDocLoad = autobiographyDocLoad;
    }
    public FileBean getAutobiographyDocLoad() {
        return this.autobiographyDocLoad;
    }
    public void setCertCznMvDocLoad(FileBean certCznMvDocLoad) {
        this.certCznMvDocLoad = certCznMvDocLoad;
    }
    public FileBean getCertCznMvDocLoad() {
        return this.certCznMvDocLoad;
    }
    public void setRightHousingOmsuMvDocLoad(FileBean rightHousingOmsuMvDocLoad) {
        this.rightHousingOmsuMvDocLoad = rightHousingOmsuMvDocLoad;
    }
    public FileBean getRightHousingOmsuMvDocLoad() {
        return this.rightHousingOmsuMvDocLoad;
    }
    public void setRightHousingEgrpMvDocLoad(FileBean rightHousingEgrpMvDocLoad) {
        this.rightHousingEgrpMvDocLoad = rightHousingEgrpMvDocLoad;
    }
    public FileBean getRightHousingEgrpMvDocLoad() {
        return this.rightHousingEgrpMvDocLoad;
    }
    public void setCertMvdMvDocLoad(FileBean certMvdMvDocLoad) {
        this.certMvdMvDocLoad = certMvdMvDocLoad;
    }
    public FileBean getCertMvdMvDocLoad() {
        return this.certMvdMvDocLoad;
    }
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
    private String stayAddressIndex;
    private String stayAddressEnterType;
    private String stayAddressRegion;
    private String stayAddressRayon;
    private String stayAddressSettlementType = "1";
    private String stayAddressCity;
    private String stayAddressSettlementText;
    private String stayAddressSettlementDict;
    private String stayAddressStreetText;
    private String stayAddressStreetDict;
    private String stayAddressHouse;
    private String stayAddressKorpus;
    private String stayAddressFlat;


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
    public String getStayAddressIndex() {
        return stayAddressIndex;
    }
    public void setStayAddressIndex(String stayAddressIndex) {
        this.stayAddressIndex = stayAddressIndex;
    }
    public String getStayAddressCountry() {
        return stayAddressCountry;
    }
    public void setStayAddressCountry(String stayAddressCountry) {
        this.stayAddressCountry = stayAddressCountry;
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
    public String getStayAddressSettlementType() {
        return stayAddressSettlementType;
    }
    public void setStayAddressSettlementType(String stayAddressSettlementType) {
        this.stayAddressSettlementType = stayAddressSettlementType;
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

    // для адресного блока
    private String factAddressCountry = "643";
    private String factAddressCountryCode = "ru";
    private String factAddressCountryInput;
    private String factAddressCountrySettlement;
    private String stayAddressCountry = "643";
    private String stayAddressCountryCode = "ru";
    private String stayAddressCountryInput;
    private String stayAddressCountrySettlement;
    private String otherAddress;
    private String address;

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStayAddressCountryCode() {
        return stayAddressCountryCode;
    }
    public void setStayAddressCountryCode(String stayAddressCountryCode) {
        this.stayAddressCountryCode = stayAddressCountryCode;
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
    public String getStayAddressCountryInput() {
        return stayAddressCountryInput;
    }
    public void setStayAddressCountryInput(String stayAddressCountryInput) {
        this.stayAddressCountryInput = stayAddressCountryInput;
    }
    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }
    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }
    public String getStayAddressCountrySettlement() {
        return stayAddressCountrySettlement;
    }
    public void setStayAddressCountrySettlement(String stayAddressCountrySettlement) {
        this.stayAddressCountrySettlement = stayAddressCountrySettlement;
    }

    // поля множественной загрузки
    private List<FileBean> writtenConsentDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> sanNormsMvDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> techNormsMvDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> certPensMvDocLoad = AccessCounterList.createEmpty(FileBean.class);


    public List<FileBean> getTechNormsMvDocLoad() {
        return normalize(this.techNormsMvDocLoad);
    }

    public void setTechNormsMvDocLoad(List<FileBean> techNormsMvDocLoad) {
        this.techNormsMvDocLoad = AccessCounterList.decorate(techNormsMvDocLoad, FileBean.class);
    }

    public List<FileBean> getWrittenConsentDocLoad() {
        return normalize(this.writtenConsentDocLoad);
    }

    public void setWrittenConsentDocLoad(List<FileBean> writtenConsentDocLoad) {
        this.writtenConsentDocLoad = AccessCounterList.decorate(writtenConsentDocLoad, FileBean.class);
    }

    public List<FileBean> getSanNormsMvDocLoad() {
        return normalize(this.sanNormsMvDocLoad);
    }

    public void setSanNormsMvDocLoad(List<FileBean> sanNormsMvDocLoad) {
        this.sanNormsMvDocLoad = AccessCounterList.decorate(sanNormsMvDocLoad, FileBean.class);
    }

    public List<FileBean> getCertPensMvDocLoad() {
        return normalize(this.certPensMvDocLoad);
    }

    public void setCertPensMvDocLoad(List<FileBean> certPensMvDocLoad) {
        this.certPensMvDocLoad = AccessCounterList.decorate(certPensMvDocLoad, FileBean.class);
    }
}
