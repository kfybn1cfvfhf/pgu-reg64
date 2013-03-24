package com.nvision.pgu.web.services.s36400009;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400009Form extends AbstractServiceOrderForm {

     public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setEmail("");
        this.setIdentityDocType("");
        this.setOtherDocTypeName("");
        this.setPassDate(null);
        this.setPassFrom("");
        this.setPassNo("");
        this.setPassSeria("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {

        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType("");
        this.setOtherDocTypeName("");
        this.setPassDate(null);
        this.setPassFrom("");
        this.setPassNo("");
        this.setPassSeria("");
    }


			private String applType;
			private String dov_enable;
			private String dovUlType;
            private Boolean dov_enable_changed = true;

			private FileBean dovDovLoad;
			private FileBean dovPasLoad;

			private String inn;
			
			private String factAddressCountry="643";
			private String factAddressIndex;
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
			
			private String identityDocType;
			private String otherDocTypeName;
			private String passSeria;
			private String passNo;
			private Date passDate;
			private String passFrom;
			private FileBean identityDocLoad;
			private FileBean docMvRegIPLoad;
			private FileBean docMvRegFNSLoad;
			private FileBean dovUlNonDovLoad;

			private String lastName;
			private String firstName;
			private String middleName;
			private String phone;
			private String email;

			private FileBean dovUlDovLoad;
			private FileBean dovUlPasLoad;

			private String org_FullTitle;
			private String org_opf;
			private String org_SmallTitle;
			private String org_FirmNazTitle;
			private String org_InnUl;
			private String org_OgrnUl;

			private String org_addressPostCountry="643";
			private String org_addressPostIndex;
			private String org_addressPostEnterType;
			private String org_addressPostRegion;
			private String org_addressPostRayon;
			private String org_addressPostSettlementType="1";
			private String org_addressPostCity;
			private String org_addressPostSettlementText;
			private String org_addressPostSettlementDict;
			private String org_addressPostStreetText;
			private String org_addressPostStreetDict;
			private String org_addressPostHouse;
			private String org_addressPostKorpus;
			private String org_addressPostFlat;
            private String org_addressPostCountryCode = "ru";
            private String org_addressPostCountryInput;
            private String org_addressPostCountrySettlement;
			
			private String org_phone;
			private String org_email;
			private String documentNumberUL;
			private Date dateIssueUL;
			private String issuingAuthorityUL;
			private FileBean docMvRegULLoad;
			private String licenseNumber;
			private Date startDateLicense;
			private String nameLicensingAuthority;
			private String reason_reIP;
			private String documentBase;


			
			private String documentNumber;
			private Date dateIssue;
			private String issuingAuthority;
			private FileBean load_doc16;
			private FileBean load_doc18;
			private String licenseNumberUL;
			private Date startDateLicenseUL;
			private String nameLicensingAuthorityUL;
			private String reason_reUL;
            private String ownership;
			private FileBean load_doc21;
			private List<FileBean> load_doc20 = AccessCounterList.createEmpty(FileBean.class);
			private FileBean load_doc14;
			private List<FileBean> load_doc6 = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc7  = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc9= AccessCounterList.createEmpty(FileBean.class);
			private FileBean load_doc1;
			private FileBean load_doc22;
			private List<FileBean> load_doc4= AccessCounterList.createEmpty(FileBean.class);
			private FileBean load_doc3;
			private List<FileBean> load_doc5= AccessCounterList.createEmpty(FileBean.class);
			private FileBean load_doc23;
			private FileBean load_doc15;
			private FileBean load_doc17;
			private FileBean load_doc13;


			
			public void setApplType(String applType) {
					this.applType = applType;
				}
			public String getApplType() {
				return this.applType;
				}
		

			   public void setDov_enable(String dov_enable) {

                if (this.dov_enable != null) {
                    if (dov_enable == null) {
                        if (!"off".equals(this.getDov_enable())) {
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
                return this.dov_enable == null ? "off" : this.dov_enable;
            }
		

			public void setDovUlType(String dovUlType) {
					this.dovUlType = dovUlType;
				}
			public String getDovUlType() {
				return this.dovUlType;
				}

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
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

    public FileBean getDocMvRegIPLoad() {
        return docMvRegIPLoad;
    }

    public void setDocMvRegIPLoad(FileBean docMvRegIPLoad) {
        this.docMvRegIPLoad = docMvRegIPLoad;
    }

    public FileBean getDocMvRegFNSLoad() {
        return docMvRegFNSLoad;
    }

    public void setDocMvRegFNSLoad(FileBean docMvRegFNSLoad) {
        this.docMvRegFNSLoad = docMvRegFNSLoad;
    }

    public FileBean getDovUlNonDovLoad() {
        return dovUlNonDovLoad;
    }

    public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
        this.dovUlNonDovLoad = dovUlNonDovLoad;
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

    public String getOrg_SmallTitle() {
        return org_SmallTitle;
    }

    public void setOrg_SmallTitle(String org_SmallTitle) {
        this.org_SmallTitle = org_SmallTitle;
    }

    public String getOrg_FirmNazTitle() {
        return org_FirmNazTitle;
    }

    public void setOrg_FirmNazTitle(String org_FirmNazTitle) {
        this.org_FirmNazTitle = org_FirmNazTitle;
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

    public String getOrg_addressPostCountry() {
        return org_addressPostCountry;
    }

    public void setOrg_addressPostCountry(String org_addressPostCountry) {
        this.org_addressPostCountry = org_addressPostCountry;
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

    public String getOrg_addressPostSettlementType() {
        return org_addressPostSettlementType;
    }

    public void setOrg_addressPostSettlementType(String org_addressPostSettlementType) {
        this.org_addressPostSettlementType = org_addressPostSettlementType;
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

    public String getOrg_addressPostCountrySettlement() {
        return org_addressPostCountrySettlement;
    }

    public void setOrg_addressPostCountrySettlement(String org_addressPostCountrySettlement) {
        this.org_addressPostCountrySettlement = org_addressPostCountrySettlement;
    }

    public String getOrg_phone() {
        return org_phone;
    }

    public void setOrg_phone(String org_phone) {
        this.org_phone = org_phone;
    }

    public String getOrg_email() {
        return org_email;
    }

    public void setOrg_email(String org_email) {
        this.org_email = org_email;
    }

    public String getDocumentNumberUL() {
        return documentNumberUL;
    }

    public void setDocumentNumberUL(String documentNumberUL) {
        this.documentNumberUL = documentNumberUL;
    }

    public Date getDateIssueUL() {
        return dateIssueUL;
    }

    public void setDateIssueUL(Date dateIssueUL) {
        this.dateIssueUL = dateIssueUL;
    }

    public String getIssuingAuthorityUL() {
        return issuingAuthorityUL;
    }

    public void setIssuingAuthorityUL(String issuingAuthorityUL) {
        this.issuingAuthorityUL = issuingAuthorityUL;
    }

    public FileBean getDocMvRegULLoad() {
        return docMvRegULLoad;
    }

    public void setDocMvRegULLoad(FileBean docMvRegULLoad) {
        this.docMvRegULLoad = docMvRegULLoad;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getStartDateLicense() {
        return startDateLicense;
    }

    public void setStartDateLicense(Date startDateLicense) {
        this.startDateLicense = startDateLicense;
    }

    public String getNameLicensingAuthority() {
        return nameLicensingAuthority;
    }

    public void setNameLicensingAuthority(String nameLicensingAuthority) {
        this.nameLicensingAuthority = nameLicensingAuthority;
    }

    public String getReason_reIP() {
        return reason_reIP;
    }

    public void setReason_reIP(String reason_reIP) {
        this.reason_reIP = reason_reIP;
    }

    public String getDocumentBase() {
        return documentBase;
    }

    public void setDocumentBase(String documentBase) {
        this.documentBase = documentBase;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public FileBean getLoad_doc16() {
        return load_doc16;
    }

    public void setLoad_doc16(FileBean load_doc16) {
        this.load_doc16 = load_doc16;
    }

    public FileBean getLoad_doc18() {
        return load_doc18;
    }

    public void setLoad_doc18(FileBean load_doc18) {
        this.load_doc18 = load_doc18;
    }

    public String getLicenseNumberUL() {
        return licenseNumberUL;
    }

    public void setLicenseNumberUL(String licenseNumberUL) {
        this.licenseNumberUL = licenseNumberUL;
    }

    public Date getStartDateLicenseUL() {
        return startDateLicenseUL;
    }

    public void setStartDateLicenseUL(Date startDateLicenseUL) {
        this.startDateLicenseUL = startDateLicenseUL;
    }

    public String getNameLicensingAuthorityUL() {
        return nameLicensingAuthorityUL;
    }

    public void setNameLicensingAuthorityUL(String nameLicensingAuthorityUL) {
        this.nameLicensingAuthorityUL = nameLicensingAuthorityUL;
    }

    public String getReason_reUL() {
        return reason_reUL;
    }

    public void setReason_reUL(String reason_reUL) {
        this.reason_reUL = reason_reUL;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public FileBean getLoad_doc21() {
        return load_doc21;
    }

    public void setLoad_doc21(FileBean load_doc21) {
        this.load_doc21 = load_doc21;
    }

    public List<FileBean> getLoad_doc20() {
        return normalize(load_doc20);
    }

    public void setLoad_doc20(List<FileBean> load_doc20) {
        this.load_doc20 = AccessCounterList.decorate(load_doc20, FileBean.class);
    }

    public FileBean getLoad_doc14() {
        return load_doc14;
    }

    public void setLoad_doc14(FileBean load_doc14) {
        this.load_doc14 = load_doc14;
    }

    public List<FileBean> getLoad_doc6() {
        return normalize(load_doc6);
    }

    public void setLoad_doc6(List<FileBean> load_doc6) {
        this.load_doc6 =  AccessCounterList.decorate(load_doc6, FileBean.class);
    }

    public List<FileBean> getLoad_doc7() {
        return normalize(load_doc7);
    }

    public void setLoad_doc7(List<FileBean> load_doc7) {
        this.load_doc7 = AccessCounterList.decorate(load_doc7, FileBean.class);
    }

    public List<FileBean> getLoad_doc9() {
        return normalize(load_doc9);
    }

    public void setLoad_doc9(List<FileBean> load_doc9) {
        this.load_doc9 = AccessCounterList.decorate(load_doc7, FileBean.class);
    }

    public FileBean getLoad_doc1() {
        return load_doc1;
    }

    public void setLoad_doc1(FileBean load_doc1) {
        this.load_doc1 = load_doc1;
    }

    public FileBean getLoad_doc22() {
        return load_doc22;
    }

    public void setLoad_doc22(FileBean load_doc22) {
        this.load_doc22 = load_doc22;
    }

			public void setLoad_doc4(List<FileBean> load_doc4) {
					this.load_doc4 = AccessCounterList.decorate(load_doc4, FileBean.class);
				}
			public List<FileBean> getLoad_doc4() {
				return normalize(this.load_doc4);
				}

    public FileBean getLoad_doc3() {
        return load_doc3;
    }

    public void setLoad_doc3(FileBean load_doc3) {
        this.load_doc3 = load_doc3;
    }

			public void setLoad_doc5(List<FileBean> load_doc5) {
					this.load_doc5 = AccessCounterList.decorate(load_doc5, FileBean.class);
				}
			public List<FileBean> getLoad_doc5() {
				return normalize(this.load_doc5);
				}

    public FileBean getLoad_doc23() {
        return load_doc23;
    }

    public void setLoad_doc23(FileBean load_doc23) {
        this.load_doc23 = load_doc23;
    }

    public FileBean getLoad_doc15() {
        return load_doc15;
    }

    public void setLoad_doc15(FileBean load_doc15) {
        this.load_doc15 = load_doc15;
    }

    public FileBean getLoad_doc17() {
        return load_doc17;
    }

    public void setLoad_doc17(FileBean load_doc17) {
        this.load_doc17 = load_doc17;
    }

    public FileBean getLoad_doc13() {
        return load_doc13;
    }

    public void setLoad_doc13(FileBean load_doc13) {
        this.load_doc13 = load_doc13;
    }
}
