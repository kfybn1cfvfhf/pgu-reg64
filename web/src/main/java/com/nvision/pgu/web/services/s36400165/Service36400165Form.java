package com.nvision.pgu.web.services.s36400165;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400165Form extends AbstractServiceOrderForm {
        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
     private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;
     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;

			private String dovUlType;
			private FileBean dovUlNonDovLoad;
			private FileBean dovUlDovLoad;
			private FileBean dovUlPasLoad;
			private String org_FullTitle;
			private String org_opf;
			private String org_SmallTitle;
			private String org_phone;
			private String org_email;
			private String org_firstName;
			private String org_lastName;
			private String org_middleName;
			private String org_InnUl;
			private String org_OgrnUl;
			private FileBean docMvRegULLoad;
			private String nameBankBenefit;
			private String filialBankBenefit;
			private String clientAccBankBenefit;
			private String license;
			private String licenseNum;
			private String licenseReg;
			private Date licenseSrok;
			private List<String> orgPlace = AccessCounterList.createEmpty(String.class);
			private List<String> activKind = AccessCounterList.createEmpty(String.class);
			private FileBean dutyDocLoad;
            private String orgaddressIndex;
			private String orgaddressCountry="643";
			private String orgaddressEnterType;
			private String orgaddressRegion;
			private String orgaddressRayon;
			private String orgaddressSettlementType="1";
			private String orgaddressCity;
			private String orgaddressSettlementText;
			private String orgaddressSettlementDict;
			private String orgaddressStreetText;
			private String orgaddressStreetDict;
			private String orgaddressHouse;
			private String orgaddressKorpus;
			private String orgaddressFlat;
            private String orgaddressCountryCode = "ru";
            private String orgaddressCountryInput;
			private String orgaddressCountrySettlement;
            private Date licensePo;
            private  String orgaddress;

    public String getOrgaddress() {
        return orgaddress;
    }

    public void setOrgaddress(String orgaddress) {
        this.orgaddress = orgaddress;
    }

    public String getOrgaddressIndex() {
        return orgaddressIndex;
    }

    public void setOrgaddressIndex(String orgaddressIndex) {
        this.orgaddressIndex = orgaddressIndex;
    }

    public String getOrgaddressCountry() {
        return orgaddressCountry;
    }

    public void setOrgaddressCountry(String orgaddressCountry) {
        this.orgaddressCountry = orgaddressCountry;
    }

    public String getOrgaddressEnterType() {
        return orgaddressEnterType;
    }

    public void setOrgaddressEnterType(String orgaddressEnterType) {
        this.orgaddressEnterType = orgaddressEnterType;
    }

    public String getOrgaddressRegion() {
        return orgaddressRegion;
    }

    public void setOrgaddressRegion(String orgaddressRegion) {
        this.orgaddressRegion = orgaddressRegion;
    }

    public String getOrgaddressRayon() {
        return orgaddressRayon;
    }

    public void setOrgaddressRayon(String orgaddressRayon) {
        this.orgaddressRayon = orgaddressRayon;
    }

    public String getOrgaddressSettlementType() {
        return orgaddressSettlementType;
    }

    public void setOrgaddressSettlementType(String orgaddressSettlementType) {
        this.orgaddressSettlementType = orgaddressSettlementType;
    }

    public String getOrgaddressCity() {
        return orgaddressCity;
    }

    public void setOrgaddressCity(String orgaddressCity) {
        this.orgaddressCity = orgaddressCity;
    }

    public String getOrgaddressSettlementText() {
        return orgaddressSettlementText;
    }

    public void setOrgaddressSettlementText(String orgaddressSettlementText) {
        this.orgaddressSettlementText = orgaddressSettlementText;
    }

    public String getOrgaddressSettlementDict() {
        return orgaddressSettlementDict;
    }

    public void setOrgaddressSettlementDict(String orgaddressSettlementDict) {
        this.orgaddressSettlementDict = orgaddressSettlementDict;
    }

    public String getOrgaddressStreetText() {
        return orgaddressStreetText;
    }

    public void setOrgaddressStreetText(String orgaddressStreetText) {
        this.orgaddressStreetText = orgaddressStreetText;
    }

    public String getOrgaddressStreetDict() {
        return orgaddressStreetDict;
    }

    public void setOrgaddressStreetDict(String orgaddressStreetDict) {
        this.orgaddressStreetDict = orgaddressStreetDict;
    }

    public String getOrgaddressHouse() {
        return orgaddressHouse;
    }

    public void setOrgaddressHouse(String orgaddressHouse) {
        this.orgaddressHouse = orgaddressHouse;
    }

    public String getOrgaddressKorpus() {
        return orgaddressKorpus;
    }

    public void setOrgaddressKorpus(String orgaddressKorpus) {
        this.orgaddressKorpus = orgaddressKorpus;
    }

    public String getOrgaddressFlat() {
        return orgaddressFlat;
    }

    public void setOrgaddressFlat(String orgaddressFlat) {
        this.orgaddressFlat = orgaddressFlat;
    }

    public String getOrgaddressCountryCode() {
        return orgaddressCountryCode;
    }

    public void setOrgaddressCountryCode(String orgaddressCountryCode) {
        this.orgaddressCountryCode = orgaddressCountryCode;
    }

    public String getOrgaddressCountryInput() {
        return orgaddressCountryInput;
    }

    public void setOrgaddressCountryInput(String orgaddressCountryInput) {
        this.orgaddressCountryInput = orgaddressCountryInput;
    }

    public String getOrgaddressCountrySettlement() {
        return orgaddressCountrySettlement;
    }

    public void setOrgaddressCountrySettlement(String orgaddressCountrySettlement) {
        this.orgaddressCountrySettlement = orgaddressCountrySettlement;
    }

    public void setDovUlType(String dovUlType) {
					this.dovUlType = dovUlType;
				}
			public String getDovUlType() {
				return this.dovUlType;
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
		

			
			public void setOrg_SmallTitle(String org_SmallTitle) {
					this.org_SmallTitle = org_SmallTitle;
				}
			public String getOrg_SmallTitle() {
				return this.org_SmallTitle;
				}
		




			
			public void setOrg_phone(String org_phone) {
					this.org_phone = org_phone;
				}
			public String getOrg_phone() {
				return this.org_phone;
				}
		

			
			public void setOrg_email(String org_email) {
					this.org_email = org_email;
				}
			public String getOrg_email() {
				return this.org_email;
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
		

			
			public void setOrg_InnUl(String org_InnUl) {
					this.org_InnUl = org_InnUl;
				}
			public String getOrg_InnUl() {
				return this.org_InnUl;
				}
		

			
			public void setOrg_OgrnUl(String org_OgrnUl) {
					this.org_OgrnUl = org_OgrnUl;
				}
			public String getOrg_OgrnUl() {
				return this.org_OgrnUl;
				}
		

			
			public void setDocMvRegULLoad(FileBean docMvRegULLoad) {
					this.docMvRegULLoad = docMvRegULLoad;
				}
			public FileBean getDocMvRegULLoad() {
				return this.docMvRegULLoad;
				}
		
	

			public void setNameBankBenefit(String nameBankBenefit) {
					this.nameBankBenefit = nameBankBenefit;
				}
			public String getNameBankBenefit() {
				return this.nameBankBenefit;
				}
		

			
			public void setFilialBankBenefit(String filialBankBenefit) {
					this.filialBankBenefit = filialBankBenefit;
				}
			public String getFilialBankBenefit() {
				return this.filialBankBenefit;
				}
		

			
			public void setClientAccBankBenefit(String clientAccBankBenefit) {
					this.clientAccBankBenefit = clientAccBankBenefit;
				}
			public String getClientAccBankBenefit() {
				return this.clientAccBankBenefit;
				}
		

			public void setLicense(String license) {
					this.license = license;
				}
			public String getLicense() {
				return this.license;
				}
		

			public void setLicenseNum(String licenseNum) {
					this.licenseNum = licenseNum;
				}
			public String getLicenseNum() {
				return this.licenseNum;
				}

			
			public void setLicenseReg(String licenseReg) {
					this.licenseReg = licenseReg;
				}
			public String getLicenseReg() {
				return this.licenseReg;
				}

			
			public void setLicenseSrok(Date licenseSrok) {
					this.licenseSrok = licenseSrok;
				}
			public Date getLicenseSrok() {
				return this.licenseSrok;
				}

    public List<String> getOrgPlace() {
        return normalize(this.orgPlace);
    }

    public void setOrgPlace(List<String> orgPlace) {
        this.orgPlace =  AccessCounterList.decorate(orgPlace, String.class);
    }

    public List<String> getActivKind() {
        return normalize(activKind);
    }

    public void setActivKind(List<String> activKind) {
        this.activKind = AccessCounterList.decorate(activKind, String.class);
    }


    public Date getLicensePo() {
        return licensePo;
    }

    public void setLicensePo(Date licensePo) {
        this.licensePo = licensePo;
    }

    public void setDutyDocLoad(FileBean dutyDocLoad) {
					this.dutyDocLoad = dutyDocLoad;
				}
			public FileBean getDutyDocLoad() {
				return this.dutyDocLoad;
				}



}
