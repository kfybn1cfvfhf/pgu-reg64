package com.nvision.pgu.web.services.s36400065;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400065Form extends AbstractServiceOrderForm {


	
			private String dov_enable;	//По умолчанию: Не активирован
			private String incapable_enable;	//По умолчанию: Не активирован
			private String dovCategory;	//64_DOV_CATEGORY_64206
			private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovOpekLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String lastName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String firstName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String middleName;	//По умолчанию:
			private String politicalNationality;	//64_POLITICAL_NATIONALITY_64065
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressIndex;	//в АИС соединять в одну строку и передавать в параметре address
			private String addressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре address
			private String addressEnterType;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressRegion;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressRayon;	//в АИС соединять в одну строку и передавать в параметре address
			private String addressSettlementType;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressCity;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressSettlementText;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressStreetText;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressStreetDict;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressHouse;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressKorpus;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressFlat;	//По умолчанию:
			private String factAddressIndex;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressEnterType;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressRegion;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressRayon;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressSettlementType;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressCity;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressSettlementText;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressStreetText;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressStreetDict;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressHouse;	//По умолчанию:
			private String factAddressKorpus;	//По умолчанию:
			private String factAddressFlat;	//По умолчанию:
			private String addressPostIndex;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostCountry = "643";	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostEnterType;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostRegion;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostRayon;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostSettlementType;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostCity;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostSettlementText;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostSettlementDict;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostStreetText;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostStreetDict;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostHouse;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostKorpus;	//в АИС соединять в одну строку и передавать в параметре addressPost
			private String addressPostFlat;	//в АИС соединять в одну строку и передавать в параметре addressPost
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
			private String recipientLastName;	//По умолчанию:
			private String recipientFirstName;	//По умолчанию:
			private String recipientMiddleName;	//По умолчанию:
			private String recipientpoliticalNationality;	//64_POLITICAL_NATIONALITY_64065
			private String recipientaddressIndex;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре address
			private String recipientaddressEnterType;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressRegion;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressRayon;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressSettlementType;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressCity;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressSettlementText;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressStreetText;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressStreetDict;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressHouse;	//По умолчанию:
			private String recipientaddressKorpus;	//По умолчанию:
			private String recipientaddressFlat;	//По умолчанию:
			private String recipientIdentityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
			private String recipientOtherDocTypeName;	//По умолчанию:
			private String recipientPassSeria;	//Логика:
			private String recipientPassNo;	//Логика:
			private Date recipientPassDate;	//Логика:
			private String recipientPassFrom;	//Логика:
			private FileBean recipientIdentityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String socialSupport;	//64_SOCIAL_SUPPORT_64053
			private String seatApplicant;	//
			private String preferentialStatus;	//64_PREFERENTIAL_STATUS_64053
			private String accrualMethod;	//03_WAY_BENEFIT_64206
			private String nameBankBenefit;	//По умолчанию: скрыто
			private String filialBankBenefit;	//
			private String bikBankBenefit;	//По умолчанию: скрыто
			private String corrAccBankBenefit;	//По умолчанию: скрыто
			private String codeFilialBankBenefit;	//По умолчанию: скрыто
			private String clientAccBankBenefit;	//По умолчанию: скрыто
			private String addressPostIndexBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostCountryBenefit = "643";	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostEnterTypeBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostRegionBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostRayonBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefitBenefit
			private String addressPostSettlementTypeBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostCityBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostSettlementTextBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostSettlementDictBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostStreetTextBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostStreetDictBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostHouseBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostKorpusBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String addressPostFlatBenefit;	//в АИС соединять в одну строку и передавать в параметре addressPostBenefit
			private String centralHeating;	//Заменить на radiogroup.
			private String rightRegister;	//Заменить на radiogroup.
			private String oldHousing;	//Заменить на radiogroup.
			private FileBean registrationCertificateLoad;	//По умолчанию: скрыто
			private FileBean identitySingleSampleLoad;	//По умолчанию: скрыто
			private FileBean disabilityDocLoad;	//По умолчанию: скрыто
			private FileBean birthCertificateLoad;	//По умолчанию: скрыто
			private FileBean medicalCommissionLoad;	//По умолчанию: скрыто
			private FileBean houseBookLoad;	//
			private FileBean technicalCertificateLoad;	//По умолчанию: скрыто
			private FileBean oldContractPrivatizationLoad;	//По умолчанию: скрыто
			private FileBean oldLeaseAgreementLoad;	//По умолчанию: скрыто
			private FileBean contractPrivatizationLoad;	//По умолчанию: скрыто
			private FileBean leaseAgreementLoad;	//По умолчанию: скрыто
			private String agreementApplicant;	//

    private Boolean dov_enable_changed = true;
    private Boolean incapable_enable_changed = true;

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

    public void setIncapable_enable(String incapable_enable) {
        if (this.incapable_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (incapable_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getIncapable_enable())) { // ... а в форме сохранён on
                    this.setIncapable_enable_changed(true);
                }
                this.incapable_enable = "off";
            } else {
                if (!this.getIncapable_enable().equals(incapable_enable)){
                    this.setIncapable_enable_changed(true);
                }
                this.incapable_enable = incapable_enable;
            }
        } else {
            this.incapable_enable = incapable_enable;
        }

    }

    public String getIncapable_enable() {
        return incapable_enable == null ? "off" : this.incapable_enable;
    }


    public void setDovCategory(String dovCategory) {
					this.dovCategory = dovCategory;
				}
			public String getDovCategory() {
				return this.dovCategory;
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
		
			public void setDovOpekLoad(FileBean dovOpekLoad) {
					this.dovOpekLoad = dovOpekLoad;
				}
			public FileBean getDovOpekLoad() {
				return this.dovOpekLoad;
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
		
			public void setPoliticalNationality(String politicalNationality) {
					this.politicalNationality = politicalNationality;
				}
			public String getPoliticalNationality() {
				return this.politicalNationality;
				}
		
			public void setAddressIndex(String addressIndex) {
					this.addressIndex = addressIndex;
				}
			public String getAddressIndex() {
				return this.addressIndex;
				}

			public void setAddressCountry(String addressCountry) {
					this.addressCountry = addressCountry;
				}
			public String getAddressCountry() {
				return this.addressCountry;
				}
		
			public void setAddressEnterType(String addressEnterType) {
					this.addressEnterType = addressEnterType;
				}
			public String getAddressEnterType() {
				return this.addressEnterType;
				}

			public void setAddressRegion(String addressRegion) {
					this.addressRegion = addressRegion;
				}
			public String getAddressRegion() {
				return this.addressRegion;
				}

			public void setAddressRayon(String addressRayon) {
					this.addressRayon = addressRayon;
				}
			public String getAddressRayon() {
				return this.addressRayon;
				}
		
			public void setAddressSettlementType(String addressSettlementType) {
					this.addressSettlementType = addressSettlementType;
				}
			public String getAddressSettlementType() {
				return this.addressSettlementType;
				}
		
			public void setAddressCity(String addressCity) {
					this.addressCity = addressCity;
				}
			public String getAddressCity() {
				return this.addressCity;
				}
		
			public void setAddressSettlementText(String addressSettlementText) {
					this.addressSettlementText = addressSettlementText;
				}
			public String getAddressSettlementText() {
				return this.addressSettlementText;
				}
		
			public void setAddressSettlementDict(String addressSettlementDict) {
					this.addressSettlementDict = addressSettlementDict;
				}
			public String getAddressSettlementDict() {
				return this.addressSettlementDict;
				}
		
			public void setAddressStreetText(String addressStreetText) {
					this.addressStreetText = addressStreetText;
				}
			public String getAddressStreetText() {
				return this.addressStreetText;
				}
		
			public void setAddressStreetDict(String addressStreetDict) {
					this.addressStreetDict = addressStreetDict;
				}
			public String getAddressStreetDict() {
				return this.addressStreetDict;
				}
		
			public void setAddressHouse(String addressHouse) {
					this.addressHouse = addressHouse;
				}
			public String getAddressHouse() {
				return this.addressHouse;
				}
		
			public void setAddressKorpus(String addressKorpus) {
					this.addressKorpus = addressKorpus;
				}
			public String getAddressKorpus() {
				return this.addressKorpus;
				}
		
			public void setAddressFlat(String addressFlat) {
					this.addressFlat = addressFlat;
				}
			public String getAddressFlat() {
				return this.addressFlat;
				}
		
			public void setFactAddressIndex(String factAddressIndex) {
					this.factAddressIndex = factAddressIndex;
				}
			public String getFactAddressIndex() {
				return this.factAddressIndex;
				}
		
			public void setFactAddressCountry(String factAddressCountry) {
					this.factAddressCountry = factAddressCountry;
				}
			public String getFactAddressCountry() {
				return this.factAddressCountry;
				}
		
			public void setFactAddressEnterType(String factAddressEnterType) {
					this.factAddressEnterType = factAddressEnterType;
				}
			public String getFactAddressEnterType() {
				return this.factAddressEnterType;
				}

			public void setFactAddressRegion(String factAddressRegion) {
					this.factAddressRegion = factAddressRegion;
				}
			public String getFactAddressRegion() {
				return this.factAddressRegion;
				}
		
			public void setFactAddressRayon(String factAddressRayon) {
					this.factAddressRayon = factAddressRayon;
				}
			public String getFactAddressRayon() {
				return this.factAddressRayon;
				}
		
			public void setFactAddressSettlementType(String factAddressSettlementType) {
					this.factAddressSettlementType = factAddressSettlementType;
				}
			public String getFactAddressSettlementType() {
				return this.factAddressSettlementType;
				}
		
			public void setFactAddressCity(String factAddressCity) {
					this.factAddressCity = factAddressCity;
				}
			public String getFactAddressCity() {
				return this.factAddressCity;
				}
		
			public void setFactAddressSettlementText(String factAddressSettlementText) {
					this.factAddressSettlementText = factAddressSettlementText;
				}
			public String getFactAddressSettlementText() {
				return this.factAddressSettlementText;
				}
		
			public void setFactAddressSettlementDict(String factAddressSettlementDict) {
					this.factAddressSettlementDict = factAddressSettlementDict;
				}
			public String getFactAddressSettlementDict() {
				return this.factAddressSettlementDict;
				}
		
			public void setFactAddressStreetText(String factAddressStreetText) {
					this.factAddressStreetText = factAddressStreetText;
				}
			public String getFactAddressStreetText() {
				return this.factAddressStreetText;
				}
		
			public void setFactAddressStreetDict(String factAddressStreetDict) {
					this.factAddressStreetDict = factAddressStreetDict;
				}
			public String getFactAddressStreetDict() {
				return this.factAddressStreetDict;
				}
		
			public void setFactAddressHouse(String factAddressHouse) {
					this.factAddressHouse = factAddressHouse;
				}
			public String getFactAddressHouse() {
				return this.factAddressHouse;
				}
		
			public void setFactAddressKorpus(String factAddressKorpus) {
					this.factAddressKorpus = factAddressKorpus;
				}
			public String getFactAddressKorpus() {
				return this.factAddressKorpus;
				}
		
			public void setFactAddressFlat(String factAddressFlat) {
					this.factAddressFlat = factAddressFlat;
				}
			public String getFactAddressFlat() {
				return this.factAddressFlat;
				}
		
			public void setAddressPostIndex(String addressPostIndex) {
					this.addressPostIndex = addressPostIndex;
				}
			public String getAddressPostIndex() {
				return this.addressPostIndex;
				}
		
			public void setAddressPostCountry(String addressPostCountry) {
					this.addressPostCountry = addressPostCountry;
				}
			public String getAddressPostCountry() {
				return this.addressPostCountry;
				}
		
			public void setAddressPostEnterType(String addressPostEnterType) {
					this.addressPostEnterType = addressPostEnterType;
				}
			public String getAddressPostEnterType() {
				return this.addressPostEnterType;
				}
		
			public void setAddressPostRegion(String addressPostRegion) {
					this.addressPostRegion = addressPostRegion;
				}
			public String getAddressPostRegion() {
				return this.addressPostRegion;
				}
		
			public void setAddressPostRayon(String addressPostRayon) {
					this.addressPostRayon = addressPostRayon;
				}
			public String getAddressPostRayon() {
				return this.addressPostRayon;
				}
		
			public void setAddressPostSettlementType(String addressPostSettlementType) {
					this.addressPostSettlementType = addressPostSettlementType;
				}
			public String getAddressPostSettlementType() {
				return this.addressPostSettlementType;
				}
		
			public void setAddressPostCity(String addressPostCity) {
					this.addressPostCity = addressPostCity;
				}
			public String getAddressPostCity() {
				return this.addressPostCity;
				}
		
			public void setAddressPostSettlementText(String addressPostSettlementText) {
					this.addressPostSettlementText = addressPostSettlementText;
				}
			public String getAddressPostSettlementText() {
				return this.addressPostSettlementText;
				}
		
			public void setAddressPostSettlementDict(String addressPostSettlementDict) {
					this.addressPostSettlementDict = addressPostSettlementDict;
				}
			public String getAddressPostSettlementDict() {
				return this.addressPostSettlementDict;
				}
		
			public void setAddressPostStreetText(String addressPostStreetText) {
					this.addressPostStreetText = addressPostStreetText;
				}
			public String getAddressPostStreetText() {
				return this.addressPostStreetText;
				}
		
			public void setAddressPostStreetDict(String addressPostStreetDict) {
					this.addressPostStreetDict = addressPostStreetDict;
				}
			public String getAddressPostStreetDict() {
				return this.addressPostStreetDict;
				}
		
			public void setAddressPostHouse(String addressPostHouse) {
					this.addressPostHouse = addressPostHouse;
				}
			public String getAddressPostHouse() {
				return this.addressPostHouse;
				}
		
			public void setAddressPostKorpus(String addressPostKorpus) {
					this.addressPostKorpus = addressPostKorpus;
				}
			public String getAddressPostKorpus() {
				return this.addressPostKorpus;
				}
		
			public void setAddressPostFlat(String addressPostFlat) {
					this.addressPostFlat = addressPostFlat;
				}
			public String getAddressPostFlat() {
				return this.addressPostFlat;
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
		
			public void setRecipientLastName(String recipientLastName) {
					this.recipientLastName = recipientLastName;
				}
			public String getRecipientLastName() {
				return this.recipientLastName;
				}
		
			public void setRecipientFirstName(String recipientFirstName) {
					this.recipientFirstName = recipientFirstName;
				}
			public String getRecipientFirstName() {
				return this.recipientFirstName;
				}
		
			public void setRecipientMiddleName(String recipientMiddleName) {
					this.recipientMiddleName = recipientMiddleName;
				}
			public String getRecipientMiddleName() {
				return this.recipientMiddleName;
				}
		
			public void setRecipientpoliticalNationality(String recipientpoliticalNationality) {
					this.recipientpoliticalNationality = recipientpoliticalNationality;
				}
			public String getRecipientpoliticalNationality() {
				return this.recipientpoliticalNationality;
				}
		
			public void setRecipientaddressIndex(String recipientaddressIndex) {
					this.recipientaddressIndex = recipientaddressIndex;
				}
			public String getRecipientaddressIndex() {
				return this.recipientaddressIndex;
				}
		
			public void setRecipientaddressCountry(String recipientaddressCountry) {
					this.recipientaddressCountry = recipientaddressCountry;
				}
			public String getRecipientaddressCountry() {
				return this.recipientaddressCountry;
				}
		
			public void setRecipientaddressEnterType(String recipientaddressEnterType) {
					this.recipientaddressEnterType = recipientaddressEnterType;
				}
			public String getRecipientaddressEnterType() {
				return this.recipientaddressEnterType;
				}

			public void setRecipientaddressRegion(String recipientaddressRegion) {
					this.recipientaddressRegion = recipientaddressRegion;
				}
			public String getRecipientaddressRegion() {
				return this.recipientaddressRegion;
				}

			public void setRecipientaddressRayon(String recipientaddressRayon) {
					this.recipientaddressRayon = recipientaddressRayon;
				}
			public String getRecipientaddressRayon() {
				return this.recipientaddressRayon;
				}

			public void setRecipientaddressSettlementType(String recipientaddressSettlementType) {
					this.recipientaddressSettlementType = recipientaddressSettlementType;
				}
			public String getRecipientaddressSettlementType() {
				return this.recipientaddressSettlementType;
				}

			public void setRecipientaddressCity(String recipientaddressCity) {
					this.recipientaddressCity = recipientaddressCity;
				}
			public String getRecipientaddressCity() {
				return this.recipientaddressCity;
				}

			public void setRecipientaddressSettlementText(String recipientaddressSettlementText) {
					this.recipientaddressSettlementText = recipientaddressSettlementText;
				}
			public String getRecipientaddressSettlementText() {
				return this.recipientaddressSettlementText;
				}

			public void setRecipientaddressSettlementDict(String recipientaddressSettlementDict) {
					this.recipientaddressSettlementDict = recipientaddressSettlementDict;
				}
			public String getRecipientaddressSettlementDict() {
				return this.recipientaddressSettlementDict;
				}

			public void setRecipientaddressStreetText(String recipientaddressStreetText) {
					this.recipientaddressStreetText = recipientaddressStreetText;
				}
			public String getRecipientaddressStreetText() {
				return this.recipientaddressStreetText;
				}

			public void setRecipientaddressStreetDict(String recipientaddressStreetDict) {
					this.recipientaddressStreetDict = recipientaddressStreetDict;
				}
			public String getRecipientaddressStreetDict() {
				return this.recipientaddressStreetDict;
				}

			public void setRecipientaddressHouse(String recipientaddressHouse) {
					this.recipientaddressHouse = recipientaddressHouse;
				}
			public String getRecipientaddressHouse() {
				return this.recipientaddressHouse;
				}

			public void setRecipientaddressKorpus(String recipientaddressKorpus) {
					this.recipientaddressKorpus = recipientaddressKorpus;
				}
			public String getRecipientaddressKorpus() {
				return this.recipientaddressKorpus;
				}

			public void setRecipientaddressFlat(String recipientaddressFlat) {
					this.recipientaddressFlat = recipientaddressFlat;
				}
			public String getRecipientaddressFlat() {
				return this.recipientaddressFlat;
				}

			public void setRecipientIdentityDocType(String recipientIdentityDocType) {
					this.recipientIdentityDocType = recipientIdentityDocType;
				}
			public String getRecipientIdentityDocType() {
				return this.recipientIdentityDocType;
				}

			public void setRecipientOtherDocTypeName(String recipientOtherDocTypeName) {
					this.recipientOtherDocTypeName = recipientOtherDocTypeName;
				}
			public String getRecipientOtherDocTypeName() {
				return this.recipientOtherDocTypeName;
				}

			public void setRecipientPassSeria(String recipientPassSeria) {
					this.recipientPassSeria = recipientPassSeria;
				}
			public String getRecipientPassSeria() {
				return this.recipientPassSeria;
				}

			public void setRecipientPassNo(String recipientPassNo) {
					this.recipientPassNo = recipientPassNo;
				}
			public String getRecipientPassNo() {
				return this.recipientPassNo;
				}

			public void setRecipientPassDate(Date recipientPassDate) {
					this.recipientPassDate = recipientPassDate;
				}
			public Date getRecipientPassDate() {
				return this.recipientPassDate;
				}

			public void setRecipientPassFrom(String recipientPassFrom) {
					this.recipientPassFrom = recipientPassFrom;
				}
			public String getRecipientPassFrom() {
				return this.recipientPassFrom;
				}

			public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
					this.recipientIdentityDocLoad = recipientIdentityDocLoad;
				}
			public FileBean getRecipientIdentityDocLoad() {
				return this.recipientIdentityDocLoad;
				}
		
			public void setSocialSupport(String socialSupport) {
					this.socialSupport = socialSupport;
				}
			public String getSocialSupport() {
				return this.socialSupport;
				}

			public void setSeatApplicant(String seatApplicant) {
					this.seatApplicant = seatApplicant;
				}
			public String getSeatApplicant() {
				return this.seatApplicant;
				}
		
			public void setPreferentialStatus(String preferentialStatus) {
					this.preferentialStatus = preferentialStatus;
				}
			public String getPreferentialStatus() {
				return this.preferentialStatus;
				}
		
			public void setAccrualMethod(String accrualMethod) {
					this.accrualMethod = accrualMethod;
				}
			public String getAccrualMethod() {
				return this.accrualMethod;
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
		
			public void setBikBankBenefit(String bikBankBenefit) {
					this.bikBankBenefit = bikBankBenefit;
				}
			public String getBikBankBenefit() {
				return this.bikBankBenefit;
				}
		
			public void setCorrAccBankBenefit(String corrAccBankBenefit) {
					this.corrAccBankBenefit = corrAccBankBenefit;
				}
			public String getCorrAccBankBenefit() {
				return this.corrAccBankBenefit;
				}

			public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
					this.codeFilialBankBenefit = codeFilialBankBenefit;
				}
			public String getCodeFilialBankBenefit() {
				return this.codeFilialBankBenefit;
				}

			public void setClientAccBankBenefit(String clientAccBankBenefit) {
					this.clientAccBankBenefit = clientAccBankBenefit;
				}
			public String getClientAccBankBenefit() {
				return this.clientAccBankBenefit;
				}

			public void setAddressPostIndexBenefit(String addressPostIndexBenefit) {
					this.addressPostIndexBenefit = addressPostIndexBenefit;
				}
			public String getAddressPostIndexBenefit() {
				return this.addressPostIndexBenefit;
				}
		
			public void setAddressPostCountryBenefit(String addressPostCountryBenefit) {
					this.addressPostCountryBenefit = addressPostCountryBenefit;
				}
			public String getAddressPostCountryBenefit() {
				return this.addressPostCountryBenefit;
				}
		
			public void setAddressPostEnterTypeBenefit(String addressPostEnterTypeBenefit) {
					this.addressPostEnterTypeBenefit = addressPostEnterTypeBenefit;
				}
			public String getAddressPostEnterTypeBenefit() {
				return this.addressPostEnterTypeBenefit;
				}
		
			public void setAddressPostRegionBenefit(String addressPostRegionBenefit) {
					this.addressPostRegionBenefit = addressPostRegionBenefit;
				}
			public String getAddressPostRegionBenefit() {
				return this.addressPostRegionBenefit;
				}
		
			public void setAddressPostRayonBenefit(String addressPostRayonBenefit) {
					this.addressPostRayonBenefit = addressPostRayonBenefit;
				}
			public String getAddressPostRayonBenefit() {
				return this.addressPostRayonBenefit;
				}

			public void setAddressPostSettlementTypeBenefit(String addressPostSettlementTypeBenefit) {
					this.addressPostSettlementTypeBenefit = addressPostSettlementTypeBenefit;
				}
			public String getAddressPostSettlementTypeBenefit() {
				return this.addressPostSettlementTypeBenefit;
				}

			public void setAddressPostCityBenefit(String addressPostCityBenefit) {
					this.addressPostCityBenefit = addressPostCityBenefit;
				}
			public String getAddressPostCityBenefit() {
				return this.addressPostCityBenefit;
				}

			public void setAddressPostSettlementTextBenefit(String addressPostSettlementTextBenefit) {
					this.addressPostSettlementTextBenefit = addressPostSettlementTextBenefit;
				}
			public String getAddressPostSettlementTextBenefit() {
				return this.addressPostSettlementTextBenefit;
				}

			public void setAddressPostSettlementDictBenefit(String addressPostSettlementDictBenefit) {
					this.addressPostSettlementDictBenefit = addressPostSettlementDictBenefit;
				}
			public String getAddressPostSettlementDictBenefit() {
				return this.addressPostSettlementDictBenefit;
				}

			public void setAddressPostStreetTextBenefit(String addressPostStreetTextBenefit) {
					this.addressPostStreetTextBenefit = addressPostStreetTextBenefit;
				}
			public String getAddressPostStreetTextBenefit() {
				return this.addressPostStreetTextBenefit;
				}

			public void setAddressPostStreetDictBenefit(String addressPostStreetDictBenefit) {
					this.addressPostStreetDictBenefit = addressPostStreetDictBenefit;
				}
			public String getAddressPostStreetDictBenefit() {
				return this.addressPostStreetDictBenefit;
				}
		
			public void setAddressPostHouseBenefit(String addressPostHouseBenefit) {
					this.addressPostHouseBenefit = addressPostHouseBenefit;
				}
			public String getAddressPostHouseBenefit() {
				return this.addressPostHouseBenefit;
				}
		
			public void setAddressPostKorpusBenefit(String addressPostKorpusBenefit) {
					this.addressPostKorpusBenefit = addressPostKorpusBenefit;
				}
			public String getAddressPostKorpusBenefit() {
				return this.addressPostKorpusBenefit;
				}
		
			public void setAddressPostFlatBenefit(String addressPostFlatBenefit) {
					this.addressPostFlatBenefit = addressPostFlatBenefit;
				}
			public String getAddressPostFlatBenefit() {
				return this.addressPostFlatBenefit;
				}
		
			public void setCentralHeating(String centralHeating) {
					this.centralHeating = centralHeating;
				}
			public String getCentralHeating() {
				return this.centralHeating;
				}
		
			public void setRightRegister(String rightRegister) {
					this.rightRegister = rightRegister;
				}
			public String getRightRegister() {
				return this.rightRegister;
				}
		
			public void setOldHousing(String oldHousing) {
					this.oldHousing = oldHousing;
				}
			public String getOldHousing() {
				return this.oldHousing;
				}
		
			public void setRegistrationCertificateLoad(FileBean registrationCertificateLoad) {
					this.registrationCertificateLoad = registrationCertificateLoad;
				}
			public FileBean getRegistrationCertificateLoad() {
				return this.registrationCertificateLoad;
				}
		
			public void setIdentitySingleSampleLoad(FileBean identitySingleSampleLoad) {
					this.identitySingleSampleLoad = identitySingleSampleLoad;
				}
			public FileBean getIdentitySingleSampleLoad() {
				return this.identitySingleSampleLoad;
				}
		
			public void setDisabilityDocLoad(FileBean disabilityDocLoad) {
					this.disabilityDocLoad = disabilityDocLoad;
				}
			public FileBean getDisabilityDocLoad() {
				return this.disabilityDocLoad;
				}
		
			public void setBirthCertificateLoad(FileBean birthCertificateLoad) {
					this.birthCertificateLoad = birthCertificateLoad;
				}
			public FileBean getBirthCertificateLoad() {
				return this.birthCertificateLoad;
				}
		
			public void setMedicalCommissionLoad(FileBean medicalCommissionLoad) {
					this.medicalCommissionLoad = medicalCommissionLoad;
				}
			public FileBean getMedicalCommissionLoad() {
				return this.medicalCommissionLoad;
				}
		
			public void setHouseBookLoad(FileBean houseBookLoad) {
					this.houseBookLoad = houseBookLoad;
				}
			public FileBean getHouseBookLoad() {
				return this.houseBookLoad;
				}
		
			public void setTechnicalCertificateLoad(FileBean technicalCertificateLoad) {
					this.technicalCertificateLoad = technicalCertificateLoad;
				}
			public FileBean getTechnicalCertificateLoad() {
				return this.technicalCertificateLoad;
				}
		
			public void setOldContractPrivatizationLoad(FileBean oldContractPrivatizationLoad) {
					this.oldContractPrivatizationLoad = oldContractPrivatizationLoad;
				}
			public FileBean getOldContractPrivatizationLoad() {
				return this.oldContractPrivatizationLoad;
				}
		
			public void setOldLeaseAgreementLoad(FileBean oldLeaseAgreementLoad) {
					this.oldLeaseAgreementLoad = oldLeaseAgreementLoad;
				}
			public FileBean getOldLeaseAgreementLoad() {
				return this.oldLeaseAgreementLoad;
				}

			public void setContractPrivatizationLoad(FileBean contractPrivatizationLoad) {
					this.contractPrivatizationLoad = contractPrivatizationLoad;
				}
			public FileBean getContractPrivatizationLoad() {
				return this.contractPrivatizationLoad;
				}
		
			public void setLeaseAgreementLoad(FileBean leaseAgreementLoad) {
					this.leaseAgreementLoad = leaseAgreementLoad;
				}
			public FileBean getLeaseAgreementLoad() {
				return this.leaseAgreementLoad;
				}
		
			public void setAgreementApplicant(String agreementApplicant) {
					this.agreementApplicant = agreementApplicant;
				}
			public String getAgreementApplicant() {
				return this.agreementApplicant;
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

        this.setAddressIndex("");
        this.setAddressRegion("");
        this.setAddressRayon("");
        this.setAddressCountry("643");
        this.setAddressCountryCode("ru");
        this.setAddressCity("");
        this.setAddressSettlementText("");
        this.setAddressSettlementDict("");
        this.setAddressStreetText("");
        this.setAddressStreetDict("");
        this.setAddressHouse("");
        this.setAddressKorpus("");
        this.setAddressFlat("");

    }

    private String address;
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }

    private String addressCountryCode = "ru";
    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }
    public String getAddressCountryCode() {
        return this.addressCountryCode;
    }

    private String addressCountryInput;
    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }
    public String getAddressCountryInput() {
        return this.addressCountryInput;
    }

    private String addressCountrySettlement;
    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }
    public String getAddressCountrySettlement() {
        return this.addressCountrySettlement;
    }

    private String factAddressCountryCode = "ru";
    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }
    public String getFactAddressCountryCode() {
        return this.factAddressCountryCode;
    }

    private String factAddressCountryInput;
    public void setFactAddressCountryInput(String factAddressCountryInput) {
        this.factAddressCountryInput = factAddressCountryInput;
    }
    public String getFactAddressCountryInput() {
        return this.factAddressCountryInput;
    }

    private String factAddressCountrySettlement;
    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }
    public String getFactAddressCountrySettlement() {
        return this.factAddressCountrySettlement;
    }

    private String addressPost;
    public void setAddressPost(String addressPost) {
        this.addressPost = addressPost;
    }
    public String getAddressPost() {
        return this.addressPost;
    }

    private String addressPostCountryCode = "ru";
    public void setAddressPostCountryCode(String addressPostCountryCode) {
        this.addressPostCountryCode = addressPostCountryCode;
    }
    public String getAddressPostCountryCode() {
        return this.addressPostCountryCode;
    }

    private String addressPostCountryInput;
    public void setAddressPostCountryInput(String addressPostCountryInput) {
        this.addressPostCountryInput = addressPostCountryInput;
    }
    public String getAddressPostCountryInput() {
        return this.addressPostCountryInput;
    }

    private String addressPostCountrySettlement;
    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
    }
    public String getAddressPostCountrySettlement() {
        return this.addressPostCountrySettlement;
    }

    private String recipientaddress;
    public void setRecipientaddress(String recipientaddress) {
        this.recipientaddress = recipientaddress;
    }
    public String getRecipientaddress() {
        return this.recipientaddress;
    }

    private String recipientaddressCountryCode = "ru";
    public void setRecipientaddressCountryCode(String recipientaddressCountryCode) {
        this.recipientaddressCountryCode = recipientaddressCountryCode;
    }
    public String getRecipientaddressCountryCode() {
        return this.recipientaddressCountryCode;
    }

    private String recipientaddressCountryInput;
    public void setRecipientaddressCountryInput(String recipientaddressCountryInput) {
        this.recipientaddressCountryInput = recipientaddressCountryInput;
    }
    public String getRecipientaddressCountryInput() {
        return this.recipientaddressCountryInput;
    }

    private String recipientaddressCountrySettlement;
    public void setRecipientaddressCountrySettlement(String recipientaddressCountrySettlement) {
        this.recipientaddressCountrySettlement = recipientaddressCountrySettlement;
    }
    public String getRecipientaddressCountrySettlement() {
        return this.recipientaddressCountrySettlement;
    }

    private String addressPostBenefit;
    public void setAddressPostBenefit(String addressPostBenefit) {
        this.addressPostBenefit = addressPostBenefit;
    }
    public String getAddressPostBenefit() {
        return this.addressPostBenefit;
    }

    private String addressPostCountryCodeBenefit = "ru";
    public void setAddressPostCountryCodeBenefit(String addressPostCountryCodeBenefit) {
        this.addressPostCountryCodeBenefit = addressPostCountryCodeBenefit;
    }
    public String getAddressPostCountryCodeBenefit() {
        return this.addressPostCountryCodeBenefit;
    }

    private String addressPostCountryInputBenefit;
    public void setAddressPostCountryInputBenefit(String addressPostCountryInputBenefit) {
        this.addressPostCountryInputBenefit = addressPostCountryInputBenefit;
    }
    public String getAddressPostCountryInputBenefit() {
        return this.addressPostCountryInputBenefit;
    }

    private String addressPostCountrySettlementBenefit;
    public void setAddressPostCountrySettlementBenefit(String addressPostCountrySettlementBenefit) {
        this.addressPostCountrySettlementBenefit = addressPostCountrySettlementBenefit;
    }
    public String getAddressPostCountrySettlementBenefit() {
        return this.addressPostCountrySettlementBenefit;
    }

}
