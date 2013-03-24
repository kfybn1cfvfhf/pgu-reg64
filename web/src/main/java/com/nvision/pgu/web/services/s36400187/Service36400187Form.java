package com.nvision.pgu.web.services.s36400187;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400187Form extends AbstractServiceOrderForm  {


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
            private String factAddressCountryCode="ru";
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
            private String addressPostCountryCode="ru";
            private String addressPostCountryInput;
            private String addressPostCountrySettlement;


			private FileBean dovUlPasLoad;


			private String orgFactAddressIndex;
			private String orgFactAddressCountry="643";
			private String orgFactAddressEnterType;
			private String orgFactAddressRegion;
			private String orgFactAddressRayon;
			private String orgFactAddressSettlementType="1";
			private String orgFactAddressCity;
			private String orgFactAddressSettlementText;
			private String orgFactAddressSettlementDict;
			private String orgFactAddressStreetText;
			private String orgFactAddressStreetDict;
			private String orgFactAddressHouse;
			private String orgFactAddressKorpus;
			private String orgFactAddressFlat;
            private String orgFactAddressCountryCode="ru";
            private String orgFactAddressCountryInput;
            private String orgFactAddressCountrySettlement;


			private String orgPostAddressIndex;
			private String orgPostAddressCountry="643";
			private String orgPostAddressEnterType;
			private String orgPostAddressRegion;
			private String orgPostAddressRayon;
			private String orgPostAddressSettlementType="1";
			private String orgPostAddressCity;
			private String orgPostAddressSettlementText;
			private String orgPostAddressSettlementDict;
			private String orgPostAddressStreetText;
			private String orgPostAddressStreetDict;
			private String orgPostAddressHouse;
			private String orgPostAddressKorpus;
			private String orgPostAddressFlat;
            private String orgPostAddressCountryCode="ru";
            private String orgPostAddressCountryInput;
            private String orgPostAddressCountrySettlement;

			private FileBean EGRULDocLoad;
			private String inn;

			private FileBean EGRIPDocLoad;
			private String intention;
			private String sobstTS;
			private FileBean gosRegTSDocLoad;
			private FileBean dogArendaTSDocLoad;
			private FileBean dovTSDocLoad;
			private FileBean gosposhDocLoad;



			private String applType;	//По умолчанию: значения в справочнике
			private String dov_enable;	//По умолчанию: скрыто
			private String dovUlType;	//По умолчанию: скрыто
			private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String lastName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String firstName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String middleName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)

			private String address;
			private String otherAddress;	//По умолчанию:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String phone;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String email;	//По умолчанию:
			private String identityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
			private String otherDocTypeName;	//По умолчанию:
			private String passSeria;	//Логика:
			private String passNo;	//Логика:
			private Date passDate;	//Логика:
			private String passFrom;	//Логика:
			private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovUlNonDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovUlDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovUiPasLoad;	//
			private String org_FullTitle;	//
			private String org_opf;	//Удалить метку поля. Разместить между меткой поля #org_FullTitle и самим полем
			private String org_InnUl;	//Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)
			private String org_OgrnUl;	//Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)
			private String org_firstName;	//Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)
			private String org_lastName;	//Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)
			private String org_middleName;	//Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)
			private String org_phone;	//Валидация: phone (перекрыть)
			private String org_email;	//Валидация: email
			private String qoalTaxi;	//03_GOAL_TAXI_64187
		
			private FileBean regDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean transDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
            private String org_fax;

    public String getOrg_fax() {
        return org_fax;
    }

    public void setOrg_fax(String org_fax) {
        this.org_fax = org_fax;
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

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
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
		
			public void setDovUlDovLoad(FileBean dovUlDovLoad) {
					this.dovUlDovLoad = dovUlDovLoad;
				}
			public FileBean getDovUlDovLoad() {
				return this.dovUlDovLoad;
				}
		
			public void setDovUiPasLoad(FileBean dovUiPasLoad) {
					this.dovUiPasLoad = dovUiPasLoad;
				}
			public FileBean getDovUiPasLoad() {
				return this.dovUiPasLoad;
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
		
			public void setQoalTaxi(String qoalTaxi) {
					this.qoalTaxi = qoalTaxi;
				}
			public String getQoalTaxi() {
				return this.qoalTaxi;
				}
		
			public void setRegDocLoad(FileBean regDocLoad) {
					this.regDocLoad = regDocLoad;
				}
			public FileBean getRegDocLoad() {
				return this.regDocLoad;
				}
		
			public void setTransDocLoad(FileBean transDocLoad) {
					this.transDocLoad = transDocLoad;
				}
			public FileBean getTransDocLoad() {
				return this.transDocLoad;
				}

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

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
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
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setOtherDocTypeName("");

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

    public FileBean getDovUlPasLoad() {
        return dovUlPasLoad;
    }

    public void setDovUlPasLoad(FileBean dovUlPasLoad) {
        this.dovUlPasLoad = dovUlPasLoad;
    }

    public String getOrgFactAddressIndex() {
        return orgFactAddressIndex;
    }

    public void setOrgFactAddressIndex(String orgFactAddressIndex) {
        this.orgFactAddressIndex = orgFactAddressIndex;
    }

    public String getOrgFactAddressCountry() {
        return orgFactAddressCountry;
    }

    public void setOrgFactAddressCountry(String orgFactAddressCountry) {
        this.orgFactAddressCountry = orgFactAddressCountry;
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

    public String getOrgFactAddressSettlementType() {
        return orgFactAddressSettlementType;
    }

    public void setOrgFactAddressSettlementType(String orgFactAddressSettlementType) {
        this.orgFactAddressSettlementType = orgFactAddressSettlementType;
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



    public String getOrgPostAddressIndex() {
        return orgPostAddressIndex;
    }

    public void setOrgPostAddressIndex(String orgPostAddressIndex) {
        this.orgPostAddressIndex = orgPostAddressIndex;
    }

    public String getOrgPostAddressCountry() {
        return orgPostAddressCountry;
    }

    public void setOrgPostAddressCountry(String orgPostAddressCountry) {
        this.orgPostAddressCountry = orgPostAddressCountry;
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

    public String getOrgPostAddressSettlementType() {
        return orgPostAddressSettlementType;
    }

    public void setOrgPostAddressSettlementType(String orgPostAddressSettlementType) {
        this.orgPostAddressSettlementType = orgPostAddressSettlementType;
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

    public String getOrgFactAddressCountrySettlement() {
        return orgFactAddressCountrySettlement;
    }

    public void setOrgFactAddressCountrySettlement(String orgFactAddressCountrySettlement) {
        this.orgFactAddressCountrySettlement = orgFactAddressCountrySettlement;
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

    public String getOrgPostAddressCountrySettlement() {
        return orgPostAddressCountrySettlement;
    }

    public void setOrgPostAddressCountrySettlement(String orgPostAddressCountrySettlement) {
        this.orgPostAddressCountrySettlement = orgPostAddressCountrySettlement;
    }

    public FileBean getEGRULDocLoad() {
        return EGRULDocLoad;
    }

    public void setEGRULDocLoad(FileBean EGRULDocLoad) {
        this.EGRULDocLoad = EGRULDocLoad;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public FileBean getEGRIPDocLoad() {
        return EGRIPDocLoad;
    }

    public void setEGRIPDocLoad(FileBean EGRIPDocLoad) {
        this.EGRIPDocLoad = EGRIPDocLoad;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public String getSobstTS() {
        return sobstTS;
    }

    public void setSobstTS(String sobstTS) {
        this.sobstTS = sobstTS;
    }

    public FileBean getGosRegTSDocLoad() {
        return gosRegTSDocLoad;
    }

    public void setGosRegTSDocLoad(FileBean gosRegTSDocLoad) {
        this.gosRegTSDocLoad = gosRegTSDocLoad;
    }

    public FileBean getDogArendaTSDocLoad() {
        return dogArendaTSDocLoad;
    }

    public void setDogArendaTSDocLoad(FileBean dogArendaTSDocLoad) {
        this.dogArendaTSDocLoad = dogArendaTSDocLoad;
    }

    public FileBean getDovTSDocLoad() {
        return dovTSDocLoad;
    }

    public void setDovTSDocLoad(FileBean dovTSDocLoad) {
        this.dovTSDocLoad = dovTSDocLoad;
    }

    public FileBean getGosposhDocLoad() {
        return gosposhDocLoad;
    }

    public void setGosposhDocLoad(FileBean gosposhDocLoad) {
        this.gosposhDocLoad = gosposhDocLoad;
    }
}