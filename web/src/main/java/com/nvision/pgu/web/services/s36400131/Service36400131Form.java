package com.nvision.pgu.web.services.s36400131;

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
public class Service36400131Form extends AbstractServiceOrderForm {

			private String applType;	//По умолчанию: значения в справочнике
			private String ip_enable;	//По умолчанию: скрыт
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
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private Date birthdate;	//По умолчанию:
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
			private String addressHouse;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressKorpus;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String addressFlat;	//в АИС соединять в одну строку и передавать в параметре address
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
			private String passSeria;	//Валидатор: XXXX, где X - одна обязательная цифра (4 цифры)
			private String passNo;	//Валидатор: XXXXXX, где X - одна обязательная цифра (6 цифр)
			private Date passDate;	//
			private String passFrom;	//
			private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovUlNonDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovUlDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovUlPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String org_FullTitle;	//
			private String org_opf;	//Удалить метку поля. Разместить между меткой поля #org_FullTitle и самим полем
			private String org_SmallTitle;	//
			private String orgAddressIndex;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressEnterType;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressRegion;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressRayon;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressSettlementType;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressCity;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressSettlementText;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressStreetText;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressStreetDict;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressHouse;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressKorpus;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgAddressFlat;	//в АИС соединять в одну строку и передавать в параметре orgAddress
			private String orgPostAddressIndex;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressEnterType;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressRegion;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressRayon;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressSettlementType;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressCity;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressSettlementText;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressStreetText;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressStreetDict;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressHouse;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressKorpus;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String orgPostAddressFlat;	//в АИС соединять в одну строку и передавать в параметре orgPostAddress
			private String org_phone;	//Валидация: phone (перекрыть)
			private String org_fax;	//Валидация: phone (перекрыть)
			private String org_email;	//Валидация: email
			private String org_firstName;	//Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)
			private String org_lastName;	//Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)
			private String org_middleName;	//Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)
			private String org_InnUl;	//Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)
			private String org_OgrnUl;	//Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)
			private List<FileBean> founderDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка
			private FileBean docMvRegULLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String inn;	//Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (12 цифр)
			private String ogrnip;	//Валидация: XXXXXXXXXXXXXXX, где X – одна обязательная цифра (15 цифр)
			private FileBean docMvRegIPLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private String nameBankBenefit;	//
			private String filialBankBenefit;	//
			private String bikBankBenefit;	//Валидатор: XXXXXXXXX, где X - одна обязательная цифра (9 цифр)
			private String corrAccBankBenefit;	//Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)
			private String codeFilialBankBenefit;	//Валидатор: XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)
			private String clientAccBankBenefit;	//Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)
			private String zemAddress;	//
			private String squareZem;	//
			private String kadastrZem;	//
			private String useCh;	//
			private String use1Ch;	//
			private FileBean planDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean topDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean pravoDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean egrpDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean kadastrDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.



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

    public void setIp_enable(String ip_enable) {
        if (this.ip_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (ip_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getIp_enable())) { // ... а в форме сохранён on
                    this.setIp_enable_changed(true);
                }
                this.ip_enable = "off";
            } else {
                if (!this.getIp_enable().equals(ip_enable)){
                    this.setIp_enable_changed(true);
                }
                this.ip_enable = ip_enable;
            }
        } else {
            this.ip_enable = ip_enable;
        }
    }
    public String getIp_enable() {
        return this.ip_enable == null ? "off" : this.ip_enable;
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
		
			//Поле Дата рождения
			
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
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
		
			//Поле <h2>Сведения о паспортных данных заявителя</h2>
			
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
			
			//Поле Паспорт заявителя
			
			public void setIdentityDocLoad(FileBean identityDocLoad) {
					this.identityDocLoad = identityDocLoad;
				}
			public FileBean getIdentityDocLoad() {
				return this.identityDocLoad;
				}
		
	
	//Закладка Сведения о заявителе
		
			//Поле <h2>Сведения об уполномоченном представителе</h2>
			
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, подтверждающий полномочия лица на осуществление действий от имени заявителя (копия решения о назначении или об избрании либо приказа о назначении физического лица на должность), в соответствии с которым такое физическое лицо обладает правом действовать от имени заявителя без доверенности
			
			public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
					this.dovUlNonDovLoad = dovUlNonDovLoad;
				}
			public FileBean getDovUlNonDovLoad() {
				return this.dovUlNonDovLoad;
				}
		
			//Поле Документ, удостоверяющий личность уполномоченного представителя
			

			public void setDovUlDovLoad(FileBean dovUlDovLoad) {
					this.dovUlDovLoad = dovUlDovLoad;
				}
			public FileBean getDovUlDovLoad() {
				return this.dovUlDovLoad;
				}
		
			//Поле Документ, удостоверяющий личность уполномоченного представителя
			
			public void setDovUlPasLoad(FileBean dovUlPasLoad) {
					this.dovUlPasLoad = dovUlPasLoad;
				}
			public FileBean getDovUlPasLoad() {
				return this.dovUlPasLoad;
				}
		
			//Поле <h2>Сведения об организации</h2>
			
			//Поле Полное наименование организации
			
			public void setOrg_FullTitle(String org_FullTitle) {
					this.org_FullTitle = org_FullTitle;
				}
			public String getOrg_FullTitle() {
				return this.org_FullTitle;
				}
		
			//Поле Организационно-правовая форма
			
			public void setOrg_opf(String org_opf) {
					this.org_opf = org_opf;
				}
			public String getOrg_opf() {
				return this.org_opf;
				}
		
			//Поле Сокращенное наименование организации
			
			public void setOrg_SmallTitle(String org_SmallTitle) {
					this.org_SmallTitle = org_SmallTitle;
				}
			public String getOrg_SmallTitle() {
				return this.org_SmallTitle;
				}
		
			//Поле <h2>Сведения о юридическом адресе организации</h2>
			
			//Поле Индекс
			
			public void setOrgAddressIndex(String orgAddressIndex) {
					this.orgAddressIndex = orgAddressIndex;
				}
			public String getOrgAddressIndex() {
				return this.orgAddressIndex;
				}
		
			//Поле Страна
			
			public void setOrgAddressCountry(String orgAddressCountry) {
					this.orgAddressCountry = orgAddressCountry;
				}
			public String getOrgAddressCountry() {
				return this.orgAddressCountry;
				}
		
			//Поле Ввод адреса
			
			public void setOrgAddressEnterType(String orgAddressEnterType) {
					this.orgAddressEnterType = orgAddressEnterType;
				}
			public String getOrgAddressEnterType() {
				return this.orgAddressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setOrgAddressRegion(String orgAddressRegion) {
					this.orgAddressRegion = orgAddressRegion;
				}
			public String getOrgAddressRegion() {
				return this.orgAddressRegion;
				}
		
			//Поле Район
			
			public void setOrgAddressRayon(String orgAddressRayon) {
					this.orgAddressRayon = orgAddressRayon;
				}
			public String getOrgAddressRayon() {
				return this.orgAddressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setOrgAddressSettlementType(String orgAddressSettlementType) {
					this.orgAddressSettlementType = orgAddressSettlementType;
				}
			public String getOrgAddressSettlementType() {
				return this.orgAddressSettlementType;
				}
		
			//Поле Город
			
			public void setOrgAddressCity(String orgAddressCity) {
					this.orgAddressCity = orgAddressCity;
				}
			public String getOrgAddressCity() {
				return this.orgAddressCity;
				}
		
			//Поле Населенный пункт
			
			public void setOrgAddressSettlementText(String orgAddressSettlementText) {
					this.orgAddressSettlementText = orgAddressSettlementText;
				}
			public String getOrgAddressSettlementText() {
				return this.orgAddressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setOrgAddressSettlementDict(String orgAddressSettlementDict) {
					this.orgAddressSettlementDict = orgAddressSettlementDict;
				}
			public String getOrgAddressSettlementDict() {
				return this.orgAddressSettlementDict;
				}
		
			//Поле Улица
			
			public void setOrgAddressStreetText(String orgAddressStreetText) {
					this.orgAddressStreetText = orgAddressStreetText;
				}
			public String getOrgAddressStreetText() {
				return this.orgAddressStreetText;
				}
		
			//Поле Улица
			
			public void setOrgAddressStreetDict(String orgAddressStreetDict) {
					this.orgAddressStreetDict = orgAddressStreetDict;
				}
			public String getOrgAddressStreetDict() {
				return this.orgAddressStreetDict;
				}
		
			//Поле Дом
			
			public void setOrgAddressHouse(String orgAddressHouse) {
					this.orgAddressHouse = orgAddressHouse;
				}
			public String getOrgAddressHouse() {
				return this.orgAddressHouse;
				}
		
			//Поле Корпус
			
			public void setOrgAddressKorpus(String orgAddressKorpus) {
					this.orgAddressKorpus = orgAddressKorpus;
				}
			public String getOrgAddressKorpus() {
				return this.orgAddressKorpus;
				}
		
			//Поле Офис (помещение):
			
			public void setOrgAddressFlat(String orgAddressFlat) {
					this.orgAddressFlat = orgAddressFlat;
				}
			public String getOrgAddressFlat() {
				return this.orgAddressFlat;
				}
		
			//Поле <h2>Сведения о почтовом адресе организации</h2>
			
			//Поле Индекс
			
			public void setOrgPostAddressIndex(String orgPostAddressIndex) {
					this.orgPostAddressIndex = orgPostAddressIndex;
				}
			public String getOrgPostAddressIndex() {
				return this.orgPostAddressIndex;
				}
		
			//Поле Страна
			
			public void setOrgPostAddressCountry(String orgPostAddressCountry) {
					this.orgPostAddressCountry = orgPostAddressCountry;
				}
			public String getOrgPostAddressCountry() {
				return this.orgPostAddressCountry;
				}
		
			//Поле Ввод адреса
			
			public void setOrgPostAddressEnterType(String orgPostAddressEnterType) {
					this.orgPostAddressEnterType = orgPostAddressEnterType;
				}
			public String getOrgPostAddressEnterType() {
				return this.orgPostAddressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setOrgPostAddressRegion(String orgPostAddressRegion) {
					this.orgPostAddressRegion = orgPostAddressRegion;
				}
			public String getOrgPostAddressRegion() {
				return this.orgPostAddressRegion;
				}
		
			//Поле Район
			
			public void setOrgPostAddressRayon(String orgPostAddressRayon) {
					this.orgPostAddressRayon = orgPostAddressRayon;
				}
			public String getOrgPostAddressRayon() {
				return this.orgPostAddressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setOrgPostAddressSettlementType(String orgPostAddressSettlementType) {
					this.orgPostAddressSettlementType = orgPostAddressSettlementType;
				}
			public String getOrgPostAddressSettlementType() {
				return this.orgPostAddressSettlementType;
				}
		
			//Поле Город
			
			public void setOrgPostAddressCity(String orgPostAddressCity) {
					this.orgPostAddressCity = orgPostAddressCity;
				}
			public String getOrgPostAddressCity() {
				return this.orgPostAddressCity;
				}
		
			//Поле Населенный пункт
			
			public void setOrgPostAddressSettlementText(String orgPostAddressSettlementText) {
					this.orgPostAddressSettlementText = orgPostAddressSettlementText;
				}
			public String getOrgPostAddressSettlementText() {
				return this.orgPostAddressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setOrgPostAddressSettlementDict(String orgPostAddressSettlementDict) {
					this.orgPostAddressSettlementDict = orgPostAddressSettlementDict;
				}
			public String getOrgPostAddressSettlementDict() {
				return this.orgPostAddressSettlementDict;
				}
		
			//Поле Улица
			
			public void setOrgPostAddressStreetText(String orgPostAddressStreetText) {
					this.orgPostAddressStreetText = orgPostAddressStreetText;
				}
			public String getOrgPostAddressStreetText() {
				return this.orgPostAddressStreetText;
				}
		
			//Поле Улица
			
			public void setOrgPostAddressStreetDict(String orgPostAddressStreetDict) {
					this.orgPostAddressStreetDict = orgPostAddressStreetDict;
				}
			public String getOrgPostAddressStreetDict() {
				return this.orgPostAddressStreetDict;
				}
		
			//Поле Дом
			
			public void setOrgPostAddressHouse(String orgPostAddressHouse) {
					this.orgPostAddressHouse = orgPostAddressHouse;
				}
			public String getOrgPostAddressHouse() {
				return this.orgPostAddressHouse;
				}
		
			//Поле Корпус
			
			public void setOrgPostAddressKorpus(String orgPostAddressKorpus) {
					this.orgPostAddressKorpus = orgPostAddressKorpus;
				}
			public String getOrgPostAddressKorpus() {
				return this.orgPostAddressKorpus;
				}
		
			//Поле Офис (помещение):
			
			public void setOrgPostAddressFlat(String orgPostAddressFlat) {
					this.orgPostAddressFlat = orgPostAddressFlat;
				}
			public String getOrgPostAddressFlat() {
				return this.orgPostAddressFlat;
				}
		
			//Поле <h2>Сведения о контактной информации организации</h2>
			
			//Поле Контактный телефон
			
			public void setOrg_phone(String org_phone) {
					this.org_phone = org_phone;
				}
			public String getOrg_phone() {
				return this.org_phone;
				}
		
			//Поле Номер факса
			
			public void setOrg_fax(String org_fax) {
					this.org_fax = org_fax;
				}
			public String getOrg_fax() {
				return this.org_fax;
				}
		
			//Поле Адрес электронной почты
			
			public void setOrg_email(String org_email) {
					this.org_email = org_email;
				}
			public String getOrg_email() {
				return this.org_email;
				}
		
			//Поле Фамилия руководителя
			
			public void setOrg_firstName(String org_firstName) {
					this.org_firstName = org_firstName;
				}
			public String getOrg_firstName() {
				return this.org_firstName;
				}
		
			//Поле Имя руководителя
			
			public void setOrg_lastName(String org_lastName) {
					this.org_lastName = org_lastName;
				}
			public String getOrg_lastName() {
				return this.org_lastName;
				}
		
			//Поле Отчество руководителя (если имеется)
			
			public void setOrg_middleName(String org_middleName) {
					this.org_middleName = org_middleName;
				}
			public String getOrg_middleName() {
				return this.org_middleName;
				}
		
			//Поле Индивидуальный номер налогоплательщика
			
			public void setOrg_InnUl(String org_InnUl) {
					this.org_InnUl = org_InnUl;
				}
			public String getOrg_InnUl() {
				return this.org_InnUl;
				}
		
			//Поле Основной государственный регистрационный номер юридического лица
			
			public void setOrg_OgrnUl(String org_OgrnUl) {
					this.org_OgrnUl = org_OgrnUl;
				}
			public String getOrg_OgrnUl() {
				return this.org_OgrnUl;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Копии учредительных документов юридического лица и все изменения и дополнения к ним, если таковые имелись
			
			public void setFounderDocLoad(List<FileBean> founderDocLoad) {
					this.founderDocLoad = AccessCounterList.decorate(founderDocLoad, FileBean.class);
				}
			public List<FileBean> getFounderDocLoad() {
				return normalize(this.founderDocLoad);
				}
		
			//Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>
			
			//Поле Копия свидетельства о государственной регистрации юридического лица:
			
			public void setDocMvRegULLoad(FileBean docMvRegULLoad) {
					this.docMvRegULLoad = docMvRegULLoad;
				}
			public FileBean getDocMvRegULLoad() {
				return this.docMvRegULLoad;
				}
		
	
	//Закладка Сведения о регистрации заявителя в качестве индивидуального предпринимателя
		
			//Поле <h2>Сведения о регистрации заявителя в качестве индивидуального предпринимателя</h2>
			
			//Поле Индивидуальный номер налогоплательщика
			
			public void setInn(String inn) {
					this.inn = inn;
				}
			public String getInn() {
				return this.inn;
				}
		
			//Поле Основной государственный регистрационный номер индивидуального предпринимателя
			
			public void setOgrnip(String ogrnip) {
					this.ogrnip = ogrnip;
				}
			public String getOgrnip() {
				return this.ogrnip;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>
			
			//Поле Копия свидетельства о государственной регистрации физического лица в качестве индивидуального предпринимателя
			
			public void setDocMvRegIPLoad(FileBean docMvRegIPLoad) {
					this.docMvRegIPLoad = docMvRegIPLoad;
				}
			public FileBean getDocMvRegIPLoad() {
				return this.docMvRegIPLoad;
				}
		
	
	//Закладка Сведения о банковских реквизитах
		
			//Поле <h2>Сведения о банковских реквизитах</h2>
			
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
		
	
	//Закладка Сведения о расположении земельного участка
		
			//Поле <h2>Сведения о расположении земельного участка</h2>
			
			//Поле Адрес земельного участка
			
			public void setZemAddress(String zemAddress) {
					this.zemAddress = zemAddress;
				}
			public String getZemAddress() {
				return this.zemAddress;
				}
		
			//Поле Площадь земельного участка (кв.м)
			
			public void setSquareZem(String squareZem) {
					this.squareZem = squareZem;
				}
			public String getSquareZem() {
				return this.squareZem;
				}
		
			//Поле Номер кадастрового плана территории
			
			public void setKadastrZem(String kadastrZem) {
					this.kadastrZem = kadastrZem;
				}
			public String getKadastrZem() {
				return this.kadastrZem;
				}
		
			//Поле <h2>Назначение земельного участка</h2>
			
			//Поле Разрешенное использование
			
			public void setUseCh(String useCh) {
					this.useCh = useCh;
				}
			public String getUseCh() {
				return this.useCh;
				}
		
			//Поле Фактическое использование
			
			public void setUse1Ch(String use1Ch) {
					this.use1Ch = use1Ch;
				}
			public String getUse1Ch() {
				return this.use1Ch;
				}
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Схема расположения земельного участка на кадастровом плане (карте) соответствующей территории в кадастровом квартале
			
			public void setPlanDocLoad(FileBean planDocLoad) {
					this.planDocLoad = planDocLoad;
				}
			public FileBean getPlanDocLoad() {
				return this.planDocLoad;
				}
		
			//Поле Схема расположения земельного участка на топографо-геодезическом плане в кадастровом квартале
			
			public void setTopDocLoad(FileBean topDocLoad) {
					this.topDocLoad = topDocLoad;
				}
			public FileBean getTopDocLoad() {
				return this.topDocLoad;
				}
		
			//Поле Копии документов, удостоверяющих (устанавливающих) права на недвижимое имущество в случае отсутствия сведений в Едином государственном реестре прав на недвижимое имущество и сделок с ним
			
			public void setPravoDocLoad(FileBean pravoDocLoad) {
					this.pravoDocLoad = pravoDocLoad;
				}
			public FileBean getPravoDocLoad() {
				return this.pravoDocLoad;
				}
		
			//Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>
			
			//Поле Выписка из Единого государственного реестра прав на недвижимое имущество и сделок с ним (содержащая общедоступные сведения о зарегистрированных правах на объект недвижимости)
			
			public void setEgrpDocLoad(FileBean egrpDocLoad) {
					this.egrpDocLoad = egrpDocLoad;
				}
			public FileBean getEgrpDocLoad() {
				return this.egrpDocLoad;
				}
		
			//Поле Кадастровый план территории
			
			public void setKadastrDocLoad(FileBean kadastrDocLoad) {
					this.kadastrDocLoad = kadastrDocLoad;
				}
			public FileBean getKadastrDocLoad() {
				return this.kadastrDocLoad;
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

    private String orgAddress;
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }
    public String getOrgAddress() {
        return this.orgAddress;
    }

    private String orgAddressCountryCode = "ru";
    public void setOrgAddressCountryCode(String orgAddressCountryCode) {
        this.orgAddressCountryCode = orgAddressCountryCode;
    }
    public String getOrgAddressCountryCode() {
        return this.orgAddressCountryCode;
    }

    private String orgAddressCountryInput;
    public void setOrgAddressCountryInput(String orgAddressCountryInput) {
        this.orgAddressCountryInput = orgAddressCountryInput;
    }
    public String getOrgAddressCountryInput() {
        return this.orgAddressCountryInput;
    }

    private String orgAddressCountrySettlement;
    public void setOrgAddressCountrySettlement(String orgAddressCountrySettlement) {
        this.orgAddressCountrySettlement = orgAddressCountrySettlement;
    }
    public String getOrgAddressCountrySettlement() {
        return this.orgAddressCountrySettlement;
    }

    private String orgPostAddress;
    public void setOrgPostAddress(String orgPostAddress) {
        this.orgPostAddress = orgPostAddress;
    }
    public String getOrgPostAddress() {
        return this.orgPostAddress;
    }

    private String orgPostAddressCountryCode = "ru";
    public void setOrgPostAddressCountryCode(String orgPostAddressCountryCode) {
        this.orgPostAddressCountryCode = orgPostAddressCountryCode;
    }
    public String getOrgPostAddressCountryCode() {
        return this.orgPostAddressCountryCode;
    }

    private String orgPostAddressCountryInput;
    public void setOrgPostAddressCountryInput(String orgPostAddressCountryInput) {
        this.orgPostAddressCountryInput = orgPostAddressCountryInput;
    }
    public String getOrgPostAddressCountryInput() {
        return this.orgPostAddressCountryInput;
    }

    private String orgPostAddressCountrySettlement;
    public void setOrgPostAddressCountrySettlement(String orgPostAddressCountrySettlement) {
        this.orgPostAddressCountrySettlement = orgPostAddressCountrySettlement;
    }
    public String getOrgPostAddressCountrySettlement() {
        return this.orgPostAddressCountrySettlement;
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
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
        this.setBirthdate(null);
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

    private Boolean dov_enable_changed = true;
    private Boolean applType_changed = true;
    private Boolean dovUlType_changed = true;
    private Boolean ip_enable_changed = true;

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

    public void setIp_enable_changed(Boolean ip_enable_changed) {
        this.ip_enable_changed = ip_enable_changed;
    }

    public Boolean getIp_enable_changed() {
        return ip_enable_changed;
    }


}
