package com.nvision.pgu.web.services.s36400241;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400241Form extends AbstractServiceOrderForm {

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
			private String factAddressHouse;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressKorpus;	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressFlat;	//в АИС соединять в одну строку и передавать в параметре factAddress
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
			private String recipientAddressIndex;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressEnterType;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressRegion;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressRayon;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressSettlementType;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressCity;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressSettlementText;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressStreetText;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressStreetDict;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressHouse;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressKorpus;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientAddressFlat;	//в АИС соединять в одну строку и передавать в параметре recipientAddress
			private String recipientIdentityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
			private String recipientOtherDocTypeName;	//По умолчанию:
			private String recipientPassSeria;	//Логика:
			private String recipientPassNo;	//Логика:
			private Date recipientPassDate;	//Логика:
			private String recipientPassFrom;	//Логика:
			private FileBean recipientIdentityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String wayBenefit;	//03_METHOD_ DELIVERY_BENEFIT_64
			private String addressBenefit;	//По умолчанию: скрыто
			private String nameBankBenefit;	//По умолчанию: скрыто
			private String filialBankBenefit;	//По умолчанию: скрыто
			private String bikBankBenefit;	//По умолчанию: скрыто
			private String corrAccBankBenefit;	//По умолчанию: скрыто
			private String codeFilialBankBenefit;	//По умолчанию: скрыто
			private String clientAccBankBenefit;	//По умолчанию: скрыто
			private String org_soc;	//64_SOCIAL_SUPPORT_64053
			private String agree;	//
			private List<FileBean> udostovDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.

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
		
			//Поле Документ, удостоверяющий личность уполномоченного представителя
			
			public void setDovPasLoad(FileBean dovPasLoad) {
					this.dovPasLoad = dovPasLoad;
				}
			public FileBean getDovPasLoad() {
				return this.dovPasLoad;
				}
		
			//Поле <h2>Сведения, подверждающие полномочия опекуна или попечителя</h2>
			
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, подтверждающий факт установления опеки (попечительства)
			
			public void setDovOpekLoad(FileBean dovOpekLoad) {
					this.dovOpekLoad = dovOpekLoad;
				}
			public FileBean getDovOpekLoad() {
				return this.dovOpekLoad;
				}
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле Фамилия
			
			public void setLastName(String lastName) {
					this.lastName = lastName;
				}
			public String getLastName() {
				return this.lastName;
				}
		
			//Поле Имя
			
			public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			public String getFirstName() {
				return this.firstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setMiddleName(String middleName) {
					this.middleName = middleName;
				}
			public String getMiddleName() {
				return this.middleName;
				}
		
			//Поле Гражданство
			
			public void setPoliticalNationality(String politicalNationality) {
					this.politicalNationality = politicalNationality;
				}
			public String getPoliticalNationality() {
				return this.politicalNationality;
				}
		
			//Поле <h2>Сведения о месте регистрации заявителя</h2>
			
			//Поле Индекс
			
			public void setAddressIndex(String addressIndex) {
					this.addressIndex = addressIndex;
				}
			public String getAddressIndex() {
				return this.addressIndex;
				}
		
			//Поле Страна
			
			public void setAddressCountry(String addressCountry) {
					this.addressCountry = addressCountry;
				}
			public String getAddressCountry() {
				return this.addressCountry;
				}
		
			//Поле Ввод адреса
			
			public void setAddressEnterType(String addressEnterType) {
					this.addressEnterType = addressEnterType;
				}
			public String getAddressEnterType() {
				return this.addressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setAddressRegion(String addressRegion) {
					this.addressRegion = addressRegion;
				}
			public String getAddressRegion() {
				return this.addressRegion;
				}
		
			//Поле Район
			
			public void setAddressRayon(String addressRayon) {
					this.addressRayon = addressRayon;
				}
			public String getAddressRayon() {
				return this.addressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setAddressSettlementType(String addressSettlementType) {
					this.addressSettlementType = addressSettlementType;
				}
			public String getAddressSettlementType() {
				return this.addressSettlementType;
				}
		
			//Поле Город
			
			public void setAddressCity(String addressCity) {
					this.addressCity = addressCity;
				}
			public String getAddressCity() {
				return this.addressCity;
				}
		
			//Поле Населенный пункт
			
			public void setAddressSettlementText(String addressSettlementText) {
					this.addressSettlementText = addressSettlementText;
				}
			public String getAddressSettlementText() {
				return this.addressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setAddressSettlementDict(String addressSettlementDict) {
					this.addressSettlementDict = addressSettlementDict;
				}
			public String getAddressSettlementDict() {
				return this.addressSettlementDict;
				}
		
			//Поле Улица
			
			public void setAddressStreetText(String addressStreetText) {
					this.addressStreetText = addressStreetText;
				}
			public String getAddressStreetText() {
				return this.addressStreetText;
				}
		
			//Поле Улица
			
			public void setAddressStreetDict(String addressStreetDict) {
					this.addressStreetDict = addressStreetDict;
				}
			public String getAddressStreetDict() {
				return this.addressStreetDict;
				}
		
			//Поле Дом
			
			public void setAddressHouse(String addressHouse) {
					this.addressHouse = addressHouse;
				}
			public String getAddressHouse() {
				return this.addressHouse;
				}
		
			//Поле Корпус
			
			public void setAddressKorpus(String addressKorpus) {
					this.addressKorpus = addressKorpus;
				}
			public String getAddressKorpus() {
				return this.addressKorpus;
				}
		
			//Поле Квартира
			
			public void setAddressFlat(String addressFlat) {
					this.addressFlat = addressFlat;
				}
			public String getAddressFlat() {
				return this.addressFlat;
				}
		
			//Поле <h2>Сведения о месте жительства (пребывания) заявителя</h2>
			
			//Поле Индекс
			
			public void setFactAddressIndex(String factAddressIndex) {
					this.factAddressIndex = factAddressIndex;
				}
			public String getFactAddressIndex() {
				return this.factAddressIndex;
				}
		
			//Поле Страна
			
			public void setFactAddressCountry(String factAddressCountry) {
					this.factAddressCountry = factAddressCountry;
				}
			public String getFactAddressCountry() {
				return this.factAddressCountry;
				}
		
			//Поле Ввод адреса
			
			public void setFactAddressEnterType(String factAddressEnterType) {
					this.factAddressEnterType = factAddressEnterType;
				}
			public String getFactAddressEnterType() {
				return this.factAddressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setFactAddressRegion(String factAddressRegion) {
					this.factAddressRegion = factAddressRegion;
				}
			public String getFactAddressRegion() {
				return this.factAddressRegion;
				}
		
			//Поле Район
			
			public void setFactAddressRayon(String factAddressRayon) {
					this.factAddressRayon = factAddressRayon;
				}
			public String getFactAddressRayon() {
				return this.factAddressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setFactAddressSettlementType(String factAddressSettlementType) {
					this.factAddressSettlementType = factAddressSettlementType;
				}
			public String getFactAddressSettlementType() {
				return this.factAddressSettlementType;
				}
		
			//Поле Город
			
			public void setFactAddressCity(String factAddressCity) {
					this.factAddressCity = factAddressCity;
				}
			public String getFactAddressCity() {
				return this.factAddressCity;
				}
		
			//Поле Населенный пункт
			
			public void setFactAddressSettlementText(String factAddressSettlementText) {
					this.factAddressSettlementText = factAddressSettlementText;
				}
			public String getFactAddressSettlementText() {
				return this.factAddressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setFactAddressSettlementDict(String factAddressSettlementDict) {
					this.factAddressSettlementDict = factAddressSettlementDict;
				}
			public String getFactAddressSettlementDict() {
				return this.factAddressSettlementDict;
				}
		
			//Поле Улица
			
			public void setFactAddressStreetText(String factAddressStreetText) {
					this.factAddressStreetText = factAddressStreetText;
				}
			public String getFactAddressStreetText() {
				return this.factAddressStreetText;
				}
		
			//Поле Улица
			
			public void setFactAddressStreetDict(String factAddressStreetDict) {
					this.factAddressStreetDict = factAddressStreetDict;
				}
			public String getFactAddressStreetDict() {
				return this.factAddressStreetDict;
				}
		
			//Поле Дом
			
			public void setFactAddressHouse(String factAddressHouse) {
					this.factAddressHouse = factAddressHouse;
				}
			public String getFactAddressHouse() {
				return this.factAddressHouse;
				}
		
			//Поле Корпус
			
			public void setFactAddressKorpus(String factAddressKorpus) {
					this.factAddressKorpus = factAddressKorpus;
				}
			public String getFactAddressKorpus() {
				return this.factAddressKorpus;
				}
		
			//Поле Квартира
			
			public void setFactAddressFlat(String factAddressFlat) {
					this.factAddressFlat = factAddressFlat;
				}
			public String getFactAddressFlat() {
				return this.factAddressFlat;
				}
		
			//Поле <h2>Сведения о почтовом адресе заявителя</h2>
			
			//Поле Индекс
			
			public void setAddressPostIndex(String addressPostIndex) {
					this.addressPostIndex = addressPostIndex;
				}
			public String getAddressPostIndex() {
				return this.addressPostIndex;
				}
		
			//Поле Страна
			
			public void setAddressPostCountry(String addressPostCountry) {
					this.addressPostCountry = addressPostCountry;
				}
			public String getAddressPostCountry() {
				return this.addressPostCountry;
				}
		
			//Поле Ввод адреса
			
			public void setAddressPostEnterType(String addressPostEnterType) {
					this.addressPostEnterType = addressPostEnterType;
				}
			public String getAddressPostEnterType() {
				return this.addressPostEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setAddressPostRegion(String addressPostRegion) {
					this.addressPostRegion = addressPostRegion;
				}
			public String getAddressPostRegion() {
				return this.addressPostRegion;
				}
		
			//Поле Район
			
			public void setAddressPostRayon(String addressPostRayon) {
					this.addressPostRayon = addressPostRayon;
				}
			public String getAddressPostRayon() {
				return this.addressPostRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setAddressPostSettlementType(String addressPostSettlementType) {
					this.addressPostSettlementType = addressPostSettlementType;
				}
			public String getAddressPostSettlementType() {
				return this.addressPostSettlementType;
				}
		
			//Поле Город
			
			public void setAddressPostCity(String addressPostCity) {
					this.addressPostCity = addressPostCity;
				}
			public String getAddressPostCity() {
				return this.addressPostCity;
				}
		
			//Поле Населенный пункт
			
			public void setAddressPostSettlementText(String addressPostSettlementText) {
					this.addressPostSettlementText = addressPostSettlementText;
				}
			public String getAddressPostSettlementText() {
				return this.addressPostSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setAddressPostSettlementDict(String addressPostSettlementDict) {
					this.addressPostSettlementDict = addressPostSettlementDict;
				}
			public String getAddressPostSettlementDict() {
				return this.addressPostSettlementDict;
				}
		
			//Поле Улица
			
			public void setAddressPostStreetText(String addressPostStreetText) {
					this.addressPostStreetText = addressPostStreetText;
				}
			public String getAddressPostStreetText() {
				return this.addressPostStreetText;
				}
		
			//Поле Улица
			
			public void setAddressPostStreetDict(String addressPostStreetDict) {
					this.addressPostStreetDict = addressPostStreetDict;
				}
			public String getAddressPostStreetDict() {
				return this.addressPostStreetDict;
				}
		
			//Поле Дом
			
			public void setAddressPostHouse(String addressPostHouse) {
					this.addressPostHouse = addressPostHouse;
				}
			public String getAddressPostHouse() {
				return this.addressPostHouse;
				}
		
			//Поле Корпус
			
			public void setAddressPostKorpus(String addressPostKorpus) {
					this.addressPostKorpus = addressPostKorpus;
				}
			public String getAddressPostKorpus() {
				return this.addressPostKorpus;
				}
		
			//Поле Квартира
			
			public void setAddressPostFlat(String addressPostFlat) {
					this.addressPostFlat = addressPostFlat;
				}
			public String getAddressPostFlat() {
				return this.addressPostFlat;
				}
		
			//Поле <h2>Контакты заявителя</h2>
			
			//Поле Контактный телефон
			
			public void setPhone(String phone) {
					this.phone = phone;
				}
			public String getPhone() {
				return this.phone;
				}
		
			//Поле Адрес электронной почты
			
			public void setEmail(String email) {
					this.email = email;
				}
			public String getEmail() {
				return this.email;
				}
		
			//Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			public void setIdentityDocType(String identityDocType) {
					this.identityDocType = identityDocType;
				}
			public String getIdentityDocType() {
				return this.identityDocType;
				}
		
			//Поле Название иного документа, удостоверяющего личность
			
			public void setOtherDocTypeName(String otherDocTypeName) {
					this.otherDocTypeName = otherDocTypeName;
				}
			public String getOtherDocTypeName() {
				return this.otherDocTypeName;
				}
		
			//Поле Серия
			
			public void setPassSeria(String passSeria) {
					this.passSeria = passSeria;
				}
			public String getPassSeria() {
				return this.passSeria;
				}
		
			//Поле Номер
			
			public void setPassNo(String passNo) {
					this.passNo = passNo;
				}
			public String getPassNo() {
				return this.passNo;
				}
		
			//Поле Дата выдачи
			
			public void setPassDate(Date passDate) {
					this.passDate = passDate;
				}
			public Date getPassDate() {
				return this.passDate;
				}
		
			//Поле Кем выдан
			
			public void setPassFrom(String passFrom) {
					this.passFrom = passFrom;
				}
			public String getPassFrom() {
				return this.passFrom;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность заявителя
			
			public void setIdentityDocLoad(FileBean identityDocLoad) {
					this.identityDocLoad = identityDocLoad;
				}
			public FileBean getIdentityDocLoad() {
				return this.identityDocLoad;
				}
		
	
	//Закладка Сведения о лице, нуждающемся в государственной услуге
		
			//Поле <h2>Сведения о лице, нуждающемся в услуге</h2>
			
			//Поле Фамилия
			
			public void setRecipientLastName(String recipientLastName) {
					this.recipientLastName = recipientLastName;
				}
			public String getRecipientLastName() {
				return this.recipientLastName;
				}
		
			//Поле Имя
			
			public void setRecipientFirstName(String recipientFirstName) {
					this.recipientFirstName = recipientFirstName;
				}
			public String getRecipientFirstName() {
				return this.recipientFirstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setRecipientMiddleName(String recipientMiddleName) {
					this.recipientMiddleName = recipientMiddleName;
				}
			public String getRecipientMiddleName() {
				return this.recipientMiddleName;
				}
		
			//Поле Гражданство
			
			public void setRecipientpoliticalNationality(String recipientpoliticalNationality) {
					this.recipientpoliticalNationality = recipientpoliticalNationality;
				}
			public String getRecipientpoliticalNationality() {
				return this.recipientpoliticalNationality;
				}
		
			//Поле <h2>Сведения о месте регистрации лица, имеющего право на получение услуги</h2>
			
			//Поле Индекс
			
			public void setRecipientAddressIndex(String recipientAddressIndex) {
					this.recipientAddressIndex = recipientAddressIndex;
				}
			public String getRecipientAddressIndex() {
				return this.recipientAddressIndex;
				}
		
			//Поле Страна
			
			public void setRecipientAddressCountry(String recipientAddressCountry) {
					this.recipientAddressCountry = recipientAddressCountry;
				}
			public String getRecipientAddressCountry() {
				return this.recipientAddressCountry;
				}
		
			//Поле Ввод адреса
			
			public void setRecipientAddressEnterType(String recipientAddressEnterType) {
					this.recipientAddressEnterType = recipientAddressEnterType;
				}
			public String getRecipientAddressEnterType() {
				return this.recipientAddressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setRecipientAddressRegion(String recipientAddressRegion) {
					this.recipientAddressRegion = recipientAddressRegion;
				}
			public String getRecipientAddressRegion() {
				return this.recipientAddressRegion;
				}
		
			//Поле Район
			
			public void setRecipientAddressRayon(String recipientAddressRayon) {
					this.recipientAddressRayon = recipientAddressRayon;
				}
			public String getRecipientAddressRayon() {
				return this.recipientAddressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setRecipientAddressSettlementType(String recipientAddressSettlementType) {
					this.recipientAddressSettlementType = recipientAddressSettlementType;
				}
			public String getRecipientAddressSettlementType() {
				return this.recipientAddressSettlementType;
				}
		
			//Поле Город
			
			public void setRecipientAddressCity(String recipientAddressCity) {
					this.recipientAddressCity = recipientAddressCity;
				}
			public String getRecipientAddressCity() {
				return this.recipientAddressCity;
				}
		
			//Поле Населенный пункт
			
			public void setRecipientAddressSettlementText(String recipientAddressSettlementText) {
					this.recipientAddressSettlementText = recipientAddressSettlementText;
				}
			public String getRecipientAddressSettlementText() {
				return this.recipientAddressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setRecipientAddressSettlementDict(String recipientAddressSettlementDict) {
					this.recipientAddressSettlementDict = recipientAddressSettlementDict;
				}
			public String getRecipientAddressSettlementDict() {
				return this.recipientAddressSettlementDict;
				}
		
			//Поле Улица
			
			public void setRecipientAddressStreetText(String recipientAddressStreetText) {
					this.recipientAddressStreetText = recipientAddressStreetText;
				}
			public String getRecipientAddressStreetText() {
				return this.recipientAddressStreetText;
				}
		
			//Поле Улица
			
			public void setRecipientAddressStreetDict(String recipientAddressStreetDict) {
					this.recipientAddressStreetDict = recipientAddressStreetDict;
				}
			public String getRecipientAddressStreetDict() {
				return this.recipientAddressStreetDict;
				}
		
			//Поле Дом
			
			public void setRecipientAddressHouse(String recipientAddressHouse) {
					this.recipientAddressHouse = recipientAddressHouse;
				}
			public String getRecipientAddressHouse() {
				return this.recipientAddressHouse;
				}
		
			//Поле Корпус
			
			public void setRecipientAddressKorpus(String recipientAddressKorpus) {
					this.recipientAddressKorpus = recipientAddressKorpus;
				}
			public String getRecipientAddressKorpus() {
				return this.recipientAddressKorpus;
				}
		
			//Поле Квартира
			
			public void setRecipientAddressFlat(String recipientAddressFlat) {
					this.recipientAddressFlat = recipientAddressFlat;
				}
			public String getRecipientAddressFlat() {
				return this.recipientAddressFlat;
				}
		
			//Поле <h2>Сведения о документе, удостоверяющем личность лица, нуждающегося в услуге</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			public void setRecipientIdentityDocType(String recipientIdentityDocType) {
					this.recipientIdentityDocType = recipientIdentityDocType;
				}
			public String getRecipientIdentityDocType() {
				return this.recipientIdentityDocType;
				}
		
			//Поле Название иного документа, удостоверяющего личность
			
			public void setRecipientOtherDocTypeName(String recipientOtherDocTypeName) {
					this.recipientOtherDocTypeName = recipientOtherDocTypeName;
				}
			public String getRecipientOtherDocTypeName() {
				return this.recipientOtherDocTypeName;
				}
		
			//Поле Серия
			
			public void setRecipientPassSeria(String recipientPassSeria) {
					this.recipientPassSeria = recipientPassSeria;
				}
			public String getRecipientPassSeria() {
				return this.recipientPassSeria;
				}
		
			//Поле Номер
			
			public void setRecipientPassNo(String recipientPassNo) {
					this.recipientPassNo = recipientPassNo;
				}
			public String getRecipientPassNo() {
				return this.recipientPassNo;
				}
		
			//Поле Дата выдачи
			
			public void setRecipientPassDate(Date recipientPassDate) {
					this.recipientPassDate = recipientPassDate;
				}
			public Date getRecipientPassDate() {
				return this.recipientPassDate;
				}
		
			//Поле Кем выдан
			
			public void setRecipientPassFrom(String recipientPassFrom) {
					this.recipientPassFrom = recipientPassFrom;
				}
			public String getRecipientPassFrom() {
				return this.recipientPassFrom;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность лица, нуждающегося в услуге
			
			public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
					this.recipientIdentityDocLoad = recipientIdentityDocLoad;
				}
			public FileBean getRecipientIdentityDocLoad() {
				return this.recipientIdentityDocLoad;
				}
		
	
	//Закладка Сведения о начисления ежегодной денежной выплаты
		
			//Поле <h2>Сведения о способе начисления ежегодной денежной выплаты</h2>
			
			//Поле Способ перечисления социальной выплаты
			
			public void setWayBenefit(String wayBenefit) {
					this.wayBenefit = wayBenefit;
				}
			public String getWayBenefit() {
				return this.wayBenefit;
				}
		
			//Поле Номер почтового отделения, на которое будет осуществляться перечисление выплаты
			
			public void setAddressBenefit(String addressBenefit) {
					this.addressBenefit = addressBenefit;
				}
			public String getAddressBenefit() {
				return this.addressBenefit;
				}
		
			//Поле <h2>Сведения о кредитной организации и номер лицевого счета заявителя</h2>
			
			//Поле Наименование кредитной организации
			
			public void setNameBankBenefit(String nameBankBenefit) {
					this.nameBankBenefit = nameBankBenefit;
				}
			public String getNameBankBenefit() {
				return this.nameBankBenefit;
				}
		
			//Поле Наименование филиала и/или номер отделения
			
			public void setFilialBankBenefit(String filialBankBenefit) {
					this.filialBankBenefit = filialBankBenefit;
				}
			public String getFilialBankBenefit() {
				return this.filialBankBenefit;
				}
		
			//Поле Банковский идентификационный код
			
			public void setBikBankBenefit(String bikBankBenefit) {
					this.bikBankBenefit = bikBankBenefit;
				}
			public String getBikBankBenefit() {
				return this.bikBankBenefit;
				}
		
			//Поле Корреспондентский счет
			
			public void setCorrAccBankBenefit(String corrAccBankBenefit) {
					this.corrAccBankBenefit = corrAccBankBenefit;
				}
			public String getCorrAccBankBenefit() {
				return this.corrAccBankBenefit;
				}
		
			//Поле Код подразделения
			
			public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
					this.codeFilialBankBenefit = codeFilialBankBenefit;
				}
			public String getCodeFilialBankBenefit() {
				return this.codeFilialBankBenefit;
				}
		
			//Поле Номер лицевого счета
			
			public void setClientAccBankBenefit(String clientAccBankBenefit) {
					this.clientAccBankBenefit = clientAccBankBenefit;
				}
			public String getClientAccBankBenefit() {
				return this.clientAccBankBenefit;
				}
		
	
	//Закладка Дополнительные сведения
		
			//Поле Управление социальной поддержки населения
			
			public void setOrg_soc(String org_soc) {
					this.org_soc = org_soc;
				}
			public String getOrg_soc() {
				return this.org_soc;
				}
		
			//Поле Обязуюсь сообщать в управление социальной поддержки населения об обстоятельствах, влияющих на изменение размера ежегодной денежной выплаты, а так же об обстоятельствах влекущих прекращение ежегодной денежной выплаты в течение двух недель
			
			public void setAgree(String agree) {
					this.agree = agree;
				}
			public String getAgree() {
				return this.agree;
				}
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Удостоверение о награждении нагрудным знаком «Почетный донор России» или «Почетный донор СССР»
			
			public void setUdostovDocLoad(List<FileBean> udostovDocLoad) {
					this.udostovDocLoad = AccessCounterList.decorate(udostovDocLoad, FileBean.class);
				}
			public List<FileBean> getUdostovDocLoad() {
				return normalize(this.udostovDocLoad);
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

    private String recipientAddress;
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
    public String getRecipientAddress() {
        return this.recipientAddress;
    }

    private String recipientAddressCountryCode = "ru";
    public void setRecipientAddressCountryCode(String recipientAddressCountryCode) {
        this.recipientAddressCountryCode = recipientAddressCountryCode;
    }
    public String getRecipientAddressCountryCode() {
        return this.recipientAddressCountryCode;
    }

    private String recipientAddressCountryInput;
    public void setRecipientAddressCountryInput(String recipientAddressCountryInput) {
        this.recipientAddressCountryInput = recipientAddressCountryInput;
    }
    public String getRecipientAddressCountryInput() {
        return this.recipientAddressCountryInput;
    }

    private String recipientAddressCountrySettlement;
    public void setRecipientAddressCountrySettlement(String recipientAddressCountrySettlement) {
        this.recipientAddressCountrySettlement = recipientAddressCountrySettlement;
    }
    public String getRecipientAddressCountrySettlement() {
        return this.recipientAddressCountrySettlement;
    }


}
