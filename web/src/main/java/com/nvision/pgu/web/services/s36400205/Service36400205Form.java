package com.nvision.pgu.web.services.s36400205;

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
public class Service36400205Form extends AbstractServiceOrderForm {
			private String dov_enable;	//По умолчанию: Не активирован
			private String incapable_enable;	//По умолчанию: Не активирован
			private String dovCategory;	//64_DOV_CATEGORY_64206
			private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovOpekLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressIndex;	//в АИС соединять в одну строку и передавать в параметре address
    private String addressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре address
    private String addressEnterType;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRegion;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRayon;	//в АИС соединять в одну строку и передавать в параметре address
    private String addressSettlementType;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_CITY_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressCity;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementText;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_STREET_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetText;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_STREET_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetDict;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressHouse;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressKorpus;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressFlat;	//По умолчанию:
    private String factAddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре factAddress
			private String factAddressIndex;	//в АИС соединять в одну строку и передавать в параметре factAddress
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
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;	//По умолчанию:
    private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String recipientLastName;	//По умолчанию:
			private String recipientFirstName;	//По умолчанию:
			private String recipientMiddleName;	//По умолчанию:
			private String recipientaddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре recipientaddress
			private String recipientaddressIndex;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
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
			private String recipientFactAdressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressIndex;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressEnterType;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressRegion;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressRayon;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressSettlementType;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressCity;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressSettlementText;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressStreetText;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressStreetDict;	//в АИС соединять в одну строку и передавать в параметре recipientFactAdress
			private String recipientFactAdressHouse;	//По умолчанию:
			private String recipientFactAdressKorpus;	//По умолчанию:
			private String recipientFactAdressFlat;	//По умолчанию:
			private String socialSupport;	//64_SOCIAL_SUPPORT_64053
			private String preferentialStatus;	//64_PREFERENTIAL_STATUS_64205
			private FileBean recipientIdentityDocLoad;	//По умолчанию: скрыто
			private FileBean vetTrudDocLoad;	//По умолчанию: скрыто
			private FileBean vetVoenSlugDocLoad;	//По умолчанию: скрыто
			private FileBean vetTrudSODocLoad;	//По умолчанию: скрыто
			private FileBean vetVOVDocLoad;	//По умолчанию: скрыто
			private FileBean sprRepDocLoad;	//По умолчанию: скрыто
			private FileBean svedRojDocLoad;	//По умолчанию: скрыто
			private FileBean edBiletDocLoad;	//По умолчанию: скрыто
			private FileBean reshOpecDocLoad;	//По умолчанию: скрыто
			private FileBean sprObrUchDocLoad;	//По умолчанию: скрыто
			private FileBean mnogodetDocLoad;	//По умолчанию: скрыто
			private FileBean childInvDocLoad;	//По умолчанию: скрыто
			private FileBean ogrZdorDocLoad;	//По умолчанию: скрыто
			private FileBean geroiDocLoad;	//По умолчанию: скрыто
			private FileBean udostLgotDocLoad;	//По умолчанию: скрыто
			private FileBean blokadLenDocLoad;	//По умолчанию: скрыто
			private FileBean sprInvDocLoad;	//По умолчанию: скрыто
			private FileBean conclagerDocLoad;	//По умолчанию: скрыто


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
		
			//Поле <h2>Сведения об опекуне (попечителе) лица, нуждающегося в услуге</h2>
			
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
		
			//Поле <h2>Сведения о месте регистрации опекуна (попечителя) лица, нуждающегося в услуге</h2>
			
			//Поле Страна
			
			public void setAddressCountry(String addressCountry) {
					this.addressCountry = addressCountry;
				}
			public String getAddressCountry() {
				return this.addressCountry;
				}
		
			//Поле Индекс
			
			public void setAddressIndex(String addressIndex) {
					this.addressIndex = addressIndex;
				}
			public String getAddressIndex() {
				return this.addressIndex;
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
		
			//Поле <h2>Сведения о месте жительства (пребывания) опекуна (попечителя) лица, нуждающегося в услуге</h2>
			
			//Поле Страна
			
			public void setFactAddressCountry(String factAddressCountry) {
					this.factAddressCountry = factAddressCountry;
				}
			public String getFactAddressCountry() {
				return this.factAddressCountry;
				}
		
			//Поле Индекс
			
			public void setFactAddressIndex(String factAddressIndex) {
					this.factAddressIndex = factAddressIndex;
				}
			public String getFactAddressIndex() {
				return this.factAddressIndex;
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
		
			//Поле <h2>Контакты опекуна (попечителя) лица, нуждающегося в услуге</h2>
			
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
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность опекуна (попечителя) лица, нуждающегося в услуге
			
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
		
			//Поле <h2>Сведения о месте регистрации лица, нуждающегося в услуге</h2>
			
			//Поле Страна
			
			public void setRecipientaddressCountry(String recipientaddressCountry) {
					this.recipientaddressCountry = recipientaddressCountry;
				}
			public String getRecipientaddressCountry() {
				return this.recipientaddressCountry;
				}
		
			//Поле Индекс
			
			public void setRecipientaddressIndex(String recipientaddressIndex) {
					this.recipientaddressIndex = recipientaddressIndex;
				}
			public String getRecipientaddressIndex() {
				return this.recipientaddressIndex;
				}
		
			//Поле Ввод адреса
			
			public void setRecipientaddressEnterType(String recipientaddressEnterType) {
					this.recipientaddressEnterType = recipientaddressEnterType;
				}
			public String getRecipientaddressEnterType() {
				return this.recipientaddressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setRecipientaddressRegion(String recipientaddressRegion) {
					this.recipientaddressRegion = recipientaddressRegion;
				}
			public String getRecipientaddressRegion() {
				return this.recipientaddressRegion;
				}
		
			//Поле Район
			
			public void setRecipientaddressRayon(String recipientaddressRayon) {
					this.recipientaddressRayon = recipientaddressRayon;
				}
			public String getRecipientaddressRayon() {
				return this.recipientaddressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setRecipientaddressSettlementType(String recipientaddressSettlementType) {
					this.recipientaddressSettlementType = recipientaddressSettlementType;
				}
			public String getRecipientaddressSettlementType() {
				return this.recipientaddressSettlementType;
				}
		
			//Поле Город
			
			public void setRecipientaddressCity(String recipientaddressCity) {
					this.recipientaddressCity = recipientaddressCity;
				}
			public String getRecipientaddressCity() {
				return this.recipientaddressCity;
				}
		
			//Поле Населенный пункт
			
			public void setRecipientaddressSettlementText(String recipientaddressSettlementText) {
					this.recipientaddressSettlementText = recipientaddressSettlementText;
				}
			public String getRecipientaddressSettlementText() {
				return this.recipientaddressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setRecipientaddressSettlementDict(String recipientaddressSettlementDict) {
					this.recipientaddressSettlementDict = recipientaddressSettlementDict;
				}
			public String getRecipientaddressSettlementDict() {
				return this.recipientaddressSettlementDict;
				}
		
			//Поле Улица
			
			public void setRecipientaddressStreetText(String recipientaddressStreetText) {
					this.recipientaddressStreetText = recipientaddressStreetText;
				}
			public String getRecipientaddressStreetText() {
				return this.recipientaddressStreetText;
				}
		
			//Поле Улица
			
			public void setRecipientaddressStreetDict(String recipientaddressStreetDict) {
					this.recipientaddressStreetDict = recipientaddressStreetDict;
				}
			public String getRecipientaddressStreetDict() {
				return this.recipientaddressStreetDict;
				}
		
			//Поле Дом
			
			public void setRecipientaddressHouse(String recipientaddressHouse) {
					this.recipientaddressHouse = recipientaddressHouse;
				}
			public String getRecipientaddressHouse() {
				return this.recipientaddressHouse;
				}
		
			//Поле Корпус
			
			public void setRecipientaddressKorpus(String recipientaddressKorpus) {
					this.recipientaddressKorpus = recipientaddressKorpus;
				}
			public String getRecipientaddressKorpus() {
				return this.recipientaddressKorpus;
				}
		
			//Поле Квартира
			
			public void setRecipientaddressFlat(String recipientaddressFlat) {
					this.recipientaddressFlat = recipientaddressFlat;
				}
			public String getRecipientaddressFlat() {
				return this.recipientaddressFlat;
				}
		
			//Поле <h2>Сведения о месте жительства (пребывания) лица, нуждающегося в услуге</h2>
			
			//Поле Страна
			
			public void setRecipientFactAdressCountry(String recipientFactAdressCountry) {
					this.recipientFactAdressCountry = recipientFactAdressCountry;
				}
			public String getRecipientFactAdressCountry() {
				return this.recipientFactAdressCountry;
				}
		
			//Поле Индекс
			
			public void setRecipientFactAdressIndex(String recipientFactAdressIndex) {
					this.recipientFactAdressIndex = recipientFactAdressIndex;
				}
			public String getRecipientFactAdressIndex() {
				return this.recipientFactAdressIndex;
				}
		
			//Поле Ввод адреса
			
			public void setRecipientFactAdressEnterType(String recipientFactAdressEnterType) {
					this.recipientFactAdressEnterType = recipientFactAdressEnterType;
				}
			public String getRecipientFactAdressEnterType() {
				return this.recipientFactAdressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setRecipientFactAdressRegion(String recipientFactAdressRegion) {
					this.recipientFactAdressRegion = recipientFactAdressRegion;
				}
			public String getRecipientFactAdressRegion() {
				return this.recipientFactAdressRegion;
				}
		
			//Поле Район
			
			public void setRecipientFactAdressRayon(String recipientFactAdressRayon) {
					this.recipientFactAdressRayon = recipientFactAdressRayon;
				}
			public String getRecipientFactAdressRayon() {
				return this.recipientFactAdressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setRecipientFactAdressSettlementType(String recipientFactAdressSettlementType) {
					this.recipientFactAdressSettlementType = recipientFactAdressSettlementType;
				}
			public String getRecipientFactAdressSettlementType() {
				return this.recipientFactAdressSettlementType;
				}
		
			//Поле Город
			
			public void setRecipientFactAdressCity(String recipientFactAdressCity) {
					this.recipientFactAdressCity = recipientFactAdressCity;
				}
			public String getRecipientFactAdressCity() {
				return this.recipientFactAdressCity;
				}
		
			//Поле Населенный пункт
			
			public void setRecipientFactAdressSettlementText(String recipientFactAdressSettlementText) {
					this.recipientFactAdressSettlementText = recipientFactAdressSettlementText;
				}
			public String getRecipientFactAdressSettlementText() {
				return this.recipientFactAdressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setRecipientFactAdressSettlementDict(String recipientFactAdressSettlementDict) {
					this.recipientFactAdressSettlementDict = recipientFactAdressSettlementDict;
				}
			public String getRecipientFactAdressSettlementDict() {
				return this.recipientFactAdressSettlementDict;
				}
		
			//Поле Улица
			
			public void setRecipientFactAdressStreetText(String recipientFactAdressStreetText) {
					this.recipientFactAdressStreetText = recipientFactAdressStreetText;
				}
			public String getRecipientFactAdressStreetText() {
				return this.recipientFactAdressStreetText;
				}
		
			//Поле Улица
			
			public void setRecipientFactAdressStreetDict(String recipientFactAdressStreetDict) {
					this.recipientFactAdressStreetDict = recipientFactAdressStreetDict;
				}
			public String getRecipientFactAdressStreetDict() {
				return this.recipientFactAdressStreetDict;
				}
		
			//Поле Дом
			
			public void setRecipientFactAdressHouse(String recipientFactAdressHouse) {
					this.recipientFactAdressHouse = recipientFactAdressHouse;
				}
			public String getRecipientFactAdressHouse() {
				return this.recipientFactAdressHouse;
				}
		
			//Поле Корпус
			
			public void setRecipientFactAdressKorpus(String recipientFactAdressKorpus) {
					this.recipientFactAdressKorpus = recipientFactAdressKorpus;
				}
			public String getRecipientFactAdressKorpus() {
				return this.recipientFactAdressKorpus;
				}
		
			//Поле Квартира
			
			public void setRecipientFactAdressFlat(String recipientFactAdressFlat) {
					this.recipientFactAdressFlat = recipientFactAdressFlat;
				}
			public String getRecipientFactAdressFlat() {
				return this.recipientFactAdressFlat;
				}
		
	
	//Закладка Дополнительные сведения
		
			//Поле <h2>Дополнительные сведения, необходимые для предоставления услуги</h2>
			
			//Поле Орган социальной поддержки населения, предоставляющий государственную услугу
			
			public void setSocialSupport(String socialSupport) {
					this.socialSupport = socialSupport;
				}
			public String getSocialSupport() {
				return this.socialSupport;
				}
		
			//Поле Льготный статус лица, нуждающегося в услуге
			
			public void setPreferentialStatus(String preferentialStatus) {
					this.preferentialStatus = preferentialStatus;
				}
			public String getPreferentialStatus() {
				return this.preferentialStatus;
				}
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность лица, нуждающегося в услуге
			
			public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
					this.recipientIdentityDocLoad = recipientIdentityDocLoad;
				}
			public FileBean getRecipientIdentityDocLoad() {
				return this.recipientIdentityDocLoad;
				}
		
			//Поле Удостоверение ветерана труда
			
			public void setVetTrudDocLoad(FileBean vetTrudDocLoad) {
					this.vetTrudDocLoad = vetTrudDocLoad;
				}
			public FileBean getVetTrudDocLoad() {
				return this.vetTrudDocLoad;
				}
		
			//Поле Удостоверение ветерана военной службы
			
			public void setVetVoenSlugDocLoad(FileBean vetVoenSlugDocLoad) {
					this.vetVoenSlugDocLoad = vetVoenSlugDocLoad;
				}
			public FileBean getVetVoenSlugDocLoad() {
				return this.vetVoenSlugDocLoad;
				}
		
			//Поле Удостоверение ветерана труда Саратовской области
			
			public void setVetTrudSODocLoad(FileBean vetTrudSODocLoad) {
					this.vetTrudSODocLoad = vetTrudSODocLoad;
				}
			public FileBean getVetTrudSODocLoad() {
				return this.vetTrudSODocLoad;
				}
		
			//Поле Удостоверение ветерана Великой Отечественной войны
			
			public void setVetVOVDocLoad(FileBean vetVOVDocLoad) {
					this.vetVOVDocLoad = vetVOVDocLoad;
				}
			public FileBean getVetVOVDocLoad() {
				return this.vetVOVDocLoad;
				}
		
			//Поле Справка правоохранительных органов о реабилитации или признании пострадавшим от политических репрессий
			
			public void setSprRepDocLoad(FileBean sprRepDocLoad) {
					this.sprRepDocLoad = sprRepDocLoad;
				}
			public FileBean getSprRepDocLoad() {
				return this.sprRepDocLoad;
				}
		
			//Поле Свидетельство о рождении ребенка либо паспорт на ребенка старше 14 лет
			
			public void setSvedRojDocLoad(FileBean svedRojDocLoad) {
					this.svedRojDocLoad = svedRojDocLoad;
				}
			public FileBean getSvedRojDocLoad() {
				return this.svedRojDocLoad;
				}
		
			//Поле Единый билет, выданный органами опеки и попечительства администрации муниципального района
			
			public void setEdBiletDocLoad(FileBean edBiletDocLoad) {
					this.edBiletDocLoad = edBiletDocLoad;
				}
			public FileBean getEdBiletDocLoad() {
				return this.edBiletDocLoad;
				}
		
			//Поле Решение (постановление) об установлении опеки или попечительства над ребенком
			
			public void setReshOpecDocLoad(FileBean reshOpecDocLoad) {
					this.reshOpecDocLoad = reshOpecDocLoad;
				}
			public FileBean getReshOpecDocLoad() {
				return this.reshOpecDocLoad;
				}
		
			//Поле Справка из образовательного учреждения  с обязательным указанием бюджета финансирования учреждения
			
			public void setSprObrUchDocLoad(FileBean sprObrUchDocLoad) {
					this.sprObrUchDocLoad = sprObrUchDocLoad;
				}
			public FileBean getSprObrUchDocLoad() {
				return this.sprObrUchDocLoad;
				}
		
			//Поле Удостоверение и вкладыш к удостоверению многодетной семьи
			
			public void setMnogodetDocLoad(FileBean mnogodetDocLoad) {
					this.mnogodetDocLoad = mnogodetDocLoad;
				}
			public FileBean getMnogodetDocLoad() {
				return this.mnogodetDocLoad;
				}
		
			//Поле Справка федерального учреждения медико-социальной экспертизы об установлении ребенку категории «ребенок-инвалид»
			
			public void setChildInvDocLoad(FileBean childInvDocLoad) {
					this.childInvDocLoad = childInvDocLoad;
				}
			public FileBean getChildInvDocLoad() {
				return this.childInvDocLoad;
				}
		
			//Поле Заключение медицинского учреждения о наличии у ребенка ограниченных возможностей здоровья
			
			public void setOgrZdorDocLoad(FileBean ogrZdorDocLoad) {
					this.ogrZdorDocLoad = ogrZdorDocLoad;
				}
			public FileBean getOgrZdorDocLoad() {
				return this.ogrZdorDocLoad;
				}
		
			//Поле Документ, удостоверяющий статус Героя или полного кавалера ордена Славы
			
			public void setGeroiDocLoad(FileBean geroiDocLoad) {
					this.geroiDocLoad = geroiDocLoad;
				}
			public FileBean getGeroiDocLoad() {
				return this.geroiDocLoad;
				}
		
			//Поле Удостоверение единого образца, установленного для каждой льготной категории граждан законодательством
			
			public void setUdostLgotDocLoad(FileBean udostLgotDocLoad) {
					this.udostLgotDocLoad = udostLgotDocLoad;
				}
			public FileBean getUdostLgotDocLoad() {
				return this.udostLgotDocLoad;
				}
		
			//Поле Удостоверение к знаку «Жителю блокадного Ленинграда»
			
			public void setBlokadLenDocLoad(FileBean blokadLenDocLoad) {
					this.blokadLenDocLoad = blokadLenDocLoad;
				}
			public FileBean getBlokadLenDocLoad() {
				return this.blokadLenDocLoad;
				}
		
			//Поле Справка федерального учреждения медико-социальной экспертизы, подтверждающую факт установления инвалидности
			
			public void setSprInvDocLoad(FileBean sprInvDocLoad) {
					this.sprInvDocLoad = sprInvDocLoad;
				}
			public FileBean getSprInvDocLoad() {
				return this.sprInvDocLoad;
				}
		
			//Поле Удостоверение о праве на льготы бывшим несовершеннолетним узником концлагерей, гетто, других мест принудительного содержания, созданных фашистами и их союзниками в период Второй мировой войны
			
			public void setConclagerDocLoad(FileBean conclagerDocLoad) {
					this.conclagerDocLoad = conclagerDocLoad;
				}
			public FileBean getConclagerDocLoad() {
				return this.conclagerDocLoad;
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

    public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setEmail("");

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

    private String recipientFactAdress;
    public void setRecipientFactAdress(String recipientFactAdress) {
        this.recipientFactAdress = recipientFactAdress;
    }
    public String getRecipientFactAdress() {
        return this.recipientFactAdress;
    }

    private String recipientFactAdressCountryCode = "ru";
    public void setRecipientFactAdressCountryCode(String recipientFactAdressCountryCode) {
        this.recipientFactAdressCountryCode = recipientFactAdressCountryCode;
    }
    public String getRecipientFactAdressCountryCode() {
        return this.recipientFactAdressCountryCode;
    }

    private String recipientFactAdressCountryInput;
    public void setRecipientFactAdressCountryInput(String recipientFactAdressCountryInput) {
        this.recipientFactAdressCountryInput = recipientFactAdressCountryInput;
    }
    public String getRecipientFactAdressCountryInput() {
        return this.recipientFactAdressCountryInput;
    }

    private String recipientFactAdressCountrySettlement;
    public void setRecipientFactAdressCountrySettlement(String recipientFactAdressCountrySettlement) {
        this.recipientFactAdressCountrySettlement = recipientFactAdressCountrySettlement;
    }
    public String getRecipientFactAdressCountrySettlement() {
        return this.recipientFactAdressCountrySettlement;
    }

}
