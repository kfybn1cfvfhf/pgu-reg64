package com.nvision.pgu.web.services.s36400210;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400210Form extends AbstractServiceOrderForm {

    private String applType;	//По умолчанию: значения в справочнике
    private String dov_enable;	//По умолчанию: скрыто
    private String dovUlType;	//По умолчанию: скрыто
    private FileBean dovUlDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovLastName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String dovFirstName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)    private String dovMiddleName;	//По умолчанию:
    private String warrantPlace;	//
    private Date warrantDate;	//
    private String warrantSeria;	//
    private String warrantNo;	//
    private String dovIdentityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
    private String dovOtherDocTypeName;	//По умолчанию:
    private String dovPassSeria;	//Логика:
    private String dovPassNo;	//Логика:
    private Date dovPassDate;	//Логика:
    private String dovPassFrom;	//Логика:
    private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;	//По умолчанию:
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
    private String addressPostCountry = "643";	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostIndex;	//в АИС соединять в одну строку и передавать в параметре addressPost
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
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email;	//По умолчанию:
    private String identityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
    private String otherDocTypeName;	//По умолчанию:
    private String passSeria;	//Логика:
    private String passNo;	//Логика:
    private Date passDate;	//Логика:
    private String passFrom;	//Логика:
    private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private String org_FullTitle;	//
    private String org_opf;	//Удалить метку поля. Разместить между меткой поля #org_FullTitle и самим полем
    private String org_SmallTitle;	//
    private String orgAddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре orgAddress
    private String orgAddressIndex;	//в АИС соединять в одну строку и передавать в параметре orgAddress
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
    private String org_phone;	//Валидация: phone (перекрыть)
    private String org_fax;	//Валидация: phone (перекрыть)
    private String org_email;	//Валидация: email
    private String org_InnUl;	//Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)
    private String constructionName;	//
    private String constructionPlace;	//
    private FileBean aktPriemkiLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean sootvetsLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean sootvetsParamLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private List<FileBean> sootvetsTehUslLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка
    private FileBean shemObjectLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean dogStrahLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean stroitRazrLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private List<FileBean> pravoDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка
    private FileBean planDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean zaklGosStroyLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean dovDovLoad;
    private FileBean dovUlNonDovLoad;



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
		

			public void setDovLastName(String dovLastName) {
					this.dovLastName = dovLastName;
				}
			public String getDovLastName() {
				return this.dovLastName;
				}
		
			//Поле Имя
			
			public void setDovFirstName(String dovFirstName) {
					this.dovFirstName = dovFirstName;
				}
			public String getDovFirstName() {
				return this.dovFirstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setDovMiddleName(String dovMiddleName) {
					this.dovMiddleName = dovMiddleName;
				}
			public String getDovMiddleName() {
				return this.dovMiddleName;
				}
		
			//Поле <h2>Сведения о доверенности</h2>
			
			//Поле Место составления
			
			public void setWarrantPlace(String warrantPlace) {
					this.warrantPlace = warrantPlace;
				}
			public String getWarrantPlace() {
				return this.warrantPlace;
				}
		
			//Поле Дата составления
			
			public void setWarrantDate(Date warrantDate) {
					this.warrantDate = warrantDate;
				}
			public Date getWarrantDate() {
				return this.warrantDate;
				}
		
			//Поле Серия
			
			public void setWarrantSeria(String warrantSeria) {
					this.warrantSeria = warrantSeria;
				}
			public String getWarrantSeria() {
				return this.warrantSeria;
				}
		
			//Поле Регистрационный номер
			
			public void setWarrantNo(String warrantNo) {
					this.warrantNo = warrantNo;
				}
			public String getWarrantNo() {
				return this.warrantNo;
				}
		
			//Поле <h2>Сведения о документе, удостоверяющем личность уполномоченного представителя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			public void setDovIdentityDocType(String dovIdentityDocType) {
					this.dovIdentityDocType = dovIdentityDocType;
				}
			public String getDovIdentityDocType() {
				return this.dovIdentityDocType;
				}
		
			//Поле Название иного документа, удостоверяющего личность
			
			public void setDovOtherDocTypeName(String dovOtherDocTypeName) {
					this.dovOtherDocTypeName = dovOtherDocTypeName;
				}
			public String getDovOtherDocTypeName() {
				return this.dovOtherDocTypeName;
				}
		
			//Поле Серия
			
			public void setDovPassSeria(String dovPassSeria) {
					this.dovPassSeria = dovPassSeria;
				}
			public String getDovPassSeria() {
				return this.dovPassSeria;
				}
		
			//Поле Номер
			
			public void setDovPassNo(String dovPassNo) {
					this.dovPassNo = dovPassNo;
				}
			public String getDovPassNo() {
				return this.dovPassNo;
				}
		
			//Поле Дата выдачи
			
			public void setDovPassDate(Date dovPassDate) {
					this.dovPassDate = dovPassDate;
				}
			public Date getDovPassDate() {
				return this.dovPassDate;
				}
		
			//Поле Кем выдан
			
			public void setDovPassFrom(String dovPassFrom) {
					this.dovPassFrom = dovPassFrom;
				}
			public String getDovPassFrom() {
				return this.dovPassFrom;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Документ, удостоверяющий личность уполномоченного представителя
			
			public void setDovPasLoad(FileBean dovPasLoad) {
					this.dovPasLoad = dovPasLoad;
				}
			public FileBean getDovPasLoad() {
				return this.dovPasLoad;
				}
		
	
	//Закладка Сведения о заявителе
		
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
		
			//Поле <h2>Сведения о месте регистрации заявителя</h2>
			
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
		
			//Поле <h2>Сведения о почтовом адресе заявителя</h2>
			
			//Поле Страна
			
			public void setAddressPostCountry(String addressPostCountry) {
					this.addressPostCountry = addressPostCountry;
				}
			public String getAddressPostCountry() {
				return this.addressPostCountry;
				}
		
			//Поле Индекс
			
			public void setAddressPostIndex(String addressPostIndex) {
					this.addressPostIndex = addressPostIndex;
				}
			public String getAddressPostIndex() {
				return this.addressPostIndex;
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
		
	
	//Закладка Сведения об организации
		
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
			
			//Поле Страна
			
			public void setOrgAddressCountry(String orgAddressCountry) {
					this.orgAddressCountry = orgAddressCountry;
				}
			public String getOrgAddressCountry() {
				return this.orgAddressCountry;
				}
		
			//Поле Индекс
			
			public void setOrgAddressIndex(String orgAddressIndex) {
					this.orgAddressIndex = orgAddressIndex;
				}
			public String getOrgAddressIndex() {
				return this.orgAddressIndex;
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
		
			//Поле <h2>Сведения о регистрации юридического лица</h2>
			
			//Поле Индивидуальный номер налогоплательщика
			
			public void setOrg_InnUl(String org_InnUl) {
					this.org_InnUl = org_InnUl;
				}
			public String getOrg_InnUl() {
				return this.org_InnUl;
				}
		
	
	//Закладка Дополнительные сведения
		
			//Поле Наименование объекта строительства
			
			public void setConstructionName(String constructionName) {
					this.constructionName = constructionName;
				}
			public String getConstructionName() {
				return this.constructionName;
				}
		
			//Поле Сведения о фактическом месте расположения объекта строительства
			
			public void setConstructionPlace(String constructionPlace) {
					this.constructionPlace = constructionPlace;
				}
			public String getConstructionPlace() {
				return this.constructionPlace;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Акт приемки объекта капитального строительства (в случае осуществления строительства, реконструкции на основании договора)
			
			public void setAktPriemkiLoad(FileBean aktPriemkiLoad) {
					this.aktPriemkiLoad = aktPriemkiLoad;
				}
			public FileBean getAktPriemkiLoad() {
				return this.aktPriemkiLoad;
				}
		
			//Поле Документ, подтверждающий соответствие построенного, реконструированного объекта капитального строительства требованиям технических регламентов и подписанный лицом, осуществляющим строительство
			
			public void setSootvetsLoad(FileBean sootvetsLoad) {
					this.sootvetsLoad = sootvetsLoad;
				}
			public FileBean getSootvetsLoad() {
				return this.sootvetsLoad;
				}
		
			//Поле Документ, подтверждающий соответствие параметров построенного, реконструированного объекта капитального строительства проектной документации, в том числе требованиям энергетической эффективности и требованиям оснащенности объекта капитального строительства приборами учета используемых энергетических ресурсов, и подписанный лицом, осуществляющим строительство (лицом, осуществляющим строительство, и застройщиком или техническим заказчиком в случае осуществления строительства, реконструкции на основании договора, а также лицом, осуществляющим строительный контроль, в случае осуществления строительного контроля на основании договора), за исключением случаев осуществления строительства, реконструкции объектов индивидуального жилищного строительства
			
			public void setSootvetsParamLoad(FileBean sootvetsParamLoad) {
					this.sootvetsParamLoad = sootvetsParamLoad;
				}
			public FileBean getSootvetsParamLoad() {
				return this.sootvetsParamLoad;
				}
		
			//Поле Документы, подтверждающие соответствие построенного, реконструированного объекта капитального строительства техническим условиям и подписанные представителями организаций, осуществляющих эксплуатацию сетей инженерно-технического обеспечения (при их наличии)
			
			public void setSootvetsTehUslLoad(List<FileBean> sootvetsTehUslLoad) {
					this.sootvetsTehUslLoad = AccessCounterList.decorate(sootvetsTehUslLoad, FileBean.class);
				}
			public List<FileBean> getSootvetsTehUslLoad() {
				return normalize(this.sootvetsTehUslLoad);
				}
		
			//Поле Схема, отображающая расположение построенного, реконструированного объекта капитального строительства, расположение сетей инженерно-технического обеспечения в границах земельного участка и планировочную организацию земельного участка и подписанная лицом, осуществляющим строительство (лицом, осуществляющим строительство, и застройщиком или техническим заказчиком в случае осуществления строительства, реконструкции на основании договора), за исключением случаев строительства, реконструкции линейного объекта
			
			public void setShemObjectLoad(FileBean shemObjectLoad) {
					this.shemObjectLoad = shemObjectLoad;
				}
			public FileBean getShemObjectLoad() {
				return this.shemObjectLoad;
				}
		
			//Поле Документ, подтверждающий заключение договора обязательного страхования гражданской ответственности владельца опасного объекта за причинение вреда в результате аварии на опасном объекте в соответствии с законодательством Российской Федерации об обязательном страховании гражданской ответственности владельца опасного объекта за причинение вреда в результате аварии на опасном объекте
			
			public void setDogStrahLoad(FileBean dogStrahLoad) {
					this.dogStrahLoad = dogStrahLoad;
				}
			public FileBean getDogStrahLoad() {
				return this.dogStrahLoad;
				}
		
			//Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>
			
			//Поле Разрешение на строительство
			
			public void setStroitRazrLoad(FileBean stroitRazrLoad) {
					this.stroitRazrLoad = stroitRazrLoad;
				}
			public FileBean getStroitRazrLoad() {
				return this.stroitRazrLoad;
				}
		
			//Поле Правоустанавливающие документы на земельный участок
			
			public void setPravoDocLoad(List<FileBean> pravoDocLoad) {
					this.pravoDocLoad = AccessCounterList.decorate(pravoDocLoad, FileBean.class);
				}
			public List<FileBean> getPravoDocLoad() {
				return normalize(this.pravoDocLoad);
				}
		
			//Поле Градостроительный план земельного участка или в случае выдачи разрешения на строительство линейного объекта реквизиты проекта планировки территории и проекта межевания территории
			
			public void setPlanDocLoad(FileBean planDocLoad) {
					this.planDocLoad = planDocLoad;
				}
			public FileBean getPlanDocLoad() {
				return this.planDocLoad;
				}
		
			//Поле Заключение органа государственного строительного надзора (в случае, если предусмотрено осуществление государственного строительного надзора) о соответствии построенного, реконструированного объекта капитального строительства требованиям технических регламентов и проектной документации, в том числе требованиям энергетической эффективности и требованиям оснащенности объекта капитального строительства приборами учета используемых энергетических ресурсов, заключение федерального государственного экологического надзора в случаях, предусмотренных частью 7 статьи 54 Градостроительного Кодекса
			
			public void setZaklGosStroyLoad(FileBean zaklGosStroyLoad) {
					this.zaklGosStroyLoad = zaklGosStroyLoad;
				}
			public FileBean getZaklGosStroyLoad() {
				return this.zaklGosStroyLoad;
				}

    private String factAddress;

    public void setFactAddress(String factAddress) {
        this.factAddress = factAddress;
    }
    public String getFactAddress() {
        return this.factAddress;
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

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
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

}
