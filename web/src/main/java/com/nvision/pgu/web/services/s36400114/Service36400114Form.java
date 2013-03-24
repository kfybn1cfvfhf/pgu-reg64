package com.nvision.pgu.web.services.s36400114;

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
public class Service36400114Form extends AbstractServiceOrderForm {

			private String dov_enable;	//По умолчанию: Не активирован
			private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName;	//По умолчанию:
    private String politicalNationality;	//64_CITIZENSHIP_REFUGEE_64202
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
    private String identityDocType;	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
			private String otherDocTypeName;	//По умолчанию:
			private String passSeria;	//Логика:
			private String passNo;	//Логика:
			private Date passDate;	//Логика:
			private String passFrom;	//Логика:
			private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
			private FileBean bezhDocLoad;	//По умолчанию: скрыто
			private FileBean timeDocLoad;	//По умолчанию: скрыто
			private List<String> childlastName = AccessCounterList.createEmpty(String.class);	//По умолчанию:
			private List<String> childfirstName = AccessCounterList.createEmpty(String.class);	//По умолчанию:
			private List<String> childmiddleName = AccessCounterList.createEmpty(String.class);	//По умолчанию:
			private List<Date> childBirthdate = AccessCounterList.createEmpty(String.class);	//
			private String childCh="off";	//
			private List<String> child1lastName = AccessCounterList.createEmpty(String.class);	//По умолчанию: скрыто
			private List<String> child1firstName = AccessCounterList.createEmpty(String.class);	//По умолчанию: скрыто
			private List<String> child1middleName = AccessCounterList.createEmpty(String.class);	//По умолчанию: скрыто
			private List<Date> child1Birthdate = AccessCounterList.createEmpty(String.class);	//По умолчанию: скрыто
			private List<FileBean> childDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка
			private List<FileBean> child1DocLoad = AccessCounterList.createEmpty(FileBean.class);	//По умолчанию: скрыто
			private String wayBenefit;	//заменить на dictionaryLookup 03_METHOD_ DELIVERY_BENEFIT_64
			private String addressBenefit;	//По умолчанию: скрыто
			private String nameBankBenefit;	//По умолчанию: скрыто
			private String filialBankBenefit;	//По умолчанию: скрыто
			private String bikBankBenefit;	//По умолчанию: скрыто
			private String corrAccBankBenefit;	//По умолчанию: скрыто
			private String codeFilialBankBenefit;	//По умолчанию: скрыто
			private String clientAccBankBenefit;	//По умолчанию: скрыто
			private String statZayav;	//заменить на dictionaryLookup
			private String parentCh;	//По умолчанию: скрыто
			private String parent1Ch;	//По умолчанию: скрыто
			private String parent2Ch;	//
			private String trudCh;	//По умолчанию: скрыто
			private String trud1Ch;	//По умолчанию: скрыто
			private List<FileBean> opecDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private FileBean vipTrudKnigDocLoad;	//По умолчанию: скрыто
			private FileBean trudKnigDocLoad;	//По умолчанию: скрыто
			private List<FileBean> svidDeadDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private List<FileBean> sudLishPravDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private FileBean sudNoRodPopDocLoad;	//По умолчанию: скрыто
			private List<FileBean> spravPosobDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private FileBean sovmProjivDocLoad;	//По умолчанию: скрыто
			private FileBean prikazOtpuskDocLoad;	//По умолчанию: скрыто
			private List<FileBean> soglUsinDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private FileBean spravSocZashGitDocLoad;	//По умолчанию: скрыто
			private FileBean spravSocZashRegDocLoad;	//
			private List<FileBean> igripDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private FileBean noSocStrahDocLoad;	//
			private List<FileBean> slujZanDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private List<FileBean> lishSvobDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private List<FileBean> roziskDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
			private String izmSved;	//
			private String noWork;	//

    private Boolean dov_enable_changed = true;

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
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
		
			//Поле Гражданство
			
			public void setPoliticalNationality(String politicalNationality) {
					this.politicalNationality = politicalNationality;
				}
			public String getPoliticalNationality() {
				return this.politicalNationality;
				}
		
			//Поле <h2>Адрес места регистрации</h2>
			
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
		
			//Поле <h2>Адрес места жительства (пребывания)</h2>
			
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
		
			//Поле <h2>Почтовый адрес</h2>
			
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
		
			//Поле Документ, удостоверяющий личность, с отметкой о выдаче вида на жительство или удостоверение беженца
			
			public void setBezhDocLoad(FileBean bezhDocLoad) {
					this.bezhDocLoad = bezhDocLoad;
				}
			public FileBean getBezhDocLoad() {
				return this.bezhDocLoad;
				}
		
			//Поле Разрешение на временное проживание по состоянию на 31 декабря 2006 года
			
			public void setTimeDocLoad(FileBean timeDocLoad) {
					this.timeDocLoad = timeDocLoad;
				}
			public FileBean getTimeDocLoad() {
				return this.timeDocLoad;
				}
		
	
	//Закладка Сведения о ребенке (детях)
		
			//Поле <h2>Сведения о ребенке (детях), на которых назначается пособие</h2>
			
			//Поле Фамилия
			
			public void setChildlastName(List<String> childlastName) {
					this.childlastName = AccessCounterList.decorate(childlastName, String.class);
				}
			public List<String> getChildlastName() {
				return normalize(this.childlastName);
				}
		
			//Поле Имя
			
			public void setChildfirstName(List<String> childfirstName) {
					this.childfirstName = AccessCounterList.decorate(childfirstName, String.class);
				}
			public List<String> getChildfirstName() {
				return normalize(this.childfirstName);
				}
		
			//Поле Отчество (если имеется)
			
			public void setChildmiddleName(List<String> childmiddleName) {
					this.childmiddleName = AccessCounterList.decorate(childmiddleName, String.class);
				}
			public List<String> getChildmiddleName() {
				return normalize(this.childmiddleName);
				}
		
			//Поле Дата рождения
			
			public void setChildBirthdate(List<Date> childBirthdate) {
					this.childBirthdate = AccessCounterList.decorate(childBirthdate, Date.class);
				}
			public List<Date> getChildBirthdate() {
				return normalize(this.childBirthdate);
				}
		
			//Поле Добавить сведения о ребенке
			
			//Поле Предыдущие дети, рожденные матерью ребенка (детей) по уходу за которым (которыми) назначается пособие, отсутствуют:
			
			public void setChildCh(String childCh) {
					this.childCh = childCh;
				}
			public String getChildCh() {
				return this.childCh;
				}
		
			//Поле <h2>Сведения о предыдущем ребенке (детях), рожденных матерью ребенка (детей) по уходу за которым (которыми) назначается пособие</h2>
			
			//Поле Фамилия
			
			public void setChild1lastName(List<String> child1lastName) {
					this.child1lastName = AccessCounterList.decorate(child1lastName, String.class);
				}
			public List<String> getChild1lastName() {
				return normalize(this.child1lastName);
				}
		
			//Поле Имя
			
			public void setChild1firstName(List<String> child1firstName) {
					this.child1firstName = AccessCounterList.decorate(child1firstName, String.class);
				}
			public List<String> getChild1firstName() {
				return normalize(this.child1firstName);
				}
		
			//Поле Отчество (если имеется)
			
			public void setChild1middleName(List<String> child1middleName) {
					this.child1middleName = AccessCounterList.decorate(child1middleName, String.class);
				}
			public List<String> getChild1middleName() {
				return normalize(this.child1middleName);
				}
		
			//Поле Дата рождения
			
			public void setChild1Birthdate(List<Date> child1Birthdate) {
					this.child1Birthdate = AccessCounterList.decorate(child1Birthdate, Date.class);
				}
			public List<Date> getChild1Birthdate() {
				return normalize(this.child1Birthdate);
				}
		
			//Поле Добавить сведения о ребенке
			
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Свидетельство о рождении (усыновлении) ребенка (детей), за которым осуществляется уход
			
			public void setChildDocLoad(List<FileBean> childDocLoad) {
					this.childDocLoad = AccessCounterList.decorate(childDocLoad, FileBean.class);
				}
			public List<FileBean> getChildDocLoad() {
				return normalize(this.childDocLoad);
				}
		
			//Поле Свидетельство о рождении (усыновлении, смерти) предыдущего ребенка (детей)
			
			public void setChild1DocLoad(List<FileBean> child1DocLoad) {
					this.child1DocLoad = AccessCounterList.decorate(child1DocLoad, FileBean.class);
				}
			public List<FileBean> getChild1DocLoad() {
				return normalize(this.child1DocLoad);
				}
		
	
	//Закладка Сведения о способе получения пособия
		
			//Поле <h2>Сведения о способе доставки назначенного пособия</h2>
			
			//Поле Способ доставки назначенного пособия
			
			public void setWayBenefit(String wayBenefit) {
					this.wayBenefit = wayBenefit;
				}
			public String getWayBenefit() {
				return this.wayBenefit;
				}
		
			//Поле Почтовый адрес по которому будет осуществлятся доставка пособия
			
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
		
	
	//Закладка Электронные копии документов
		
			//Поле Статус получателя услуги по отношению к ребенку, на которого назначается пособие
			
			public void setStatZayav(String statZayav) {
					this.statZayav = statZayav;
				}
			public String getStatZayav() {
				return this.statZayav;
				}
		
			//Поле Родители ребенка уклоняются от воспитания детей или от защиты их прав и интересов или отказались взять своего ребенка из воспитательных, лечебных учреждений, учреждений социальной защиты населения и других аналогичных учреждений
			
			public void setParentCh(String parentCh) {
					this.parentCh = parentCh;
				}
			public String getParentCh() {
				return this.parentCh  == null ? "off" : this.parentCh;
				}
		
			//Поле Мать и (или) отец умерли, объявлены умершими, лишены родительских прав, ограничены в родительских правах, признаны безвестно отсутствующими, недееспособными (ограниченно дееспособными), по состоянию здоровья не могут лично воспитывать и содержать ребенка, отбывают наказание в учреждениях, исполняющих наказание в виде лишения свободы, находятся в местах содержания под стражей подозреваемых и обвиняемых в совершении преступлений, уклоняются от воспитания детей или от защиты их прав и интересов или отказались взять своего ребенка из воспитательных, лечебных учреждений, учреждений социальной защиты населения и других аналогичных учреждений.
			
			public void setParent1Ch(String parent1Ch) {
					this.parent1Ch = parent1Ch;
				}
			public String getParent1Ch() {
				return this.parent1Ch == null ? "off" : this.parent1Ch;
				}
		
			//Поле Получателями услуги являются уволенные в период отпуска по уходу за ребенком (матери, уволенные в период беременности, отпуска по беременности) в связи с ликвидацией организации, прекращением физическими лицами деятельности в качестве индивидуальных предпринимателей, прекращением полномочий нотариусами, занимающимися частной практикой, и прекращением статуса адвоката, а также в связи с прекращением деятельности иными физическими лицами, профессиональная деятельность которых в соответствии с федеральными законами подлежит государственной регистрации и (или) лицензированию, не получающие пособие по безработице
			
			public void setParent2Ch(String parent2Ch) {
					this.parent2Ch = parent2Ch;
				}
			public String getParent2Ch() {
				return this.parent2Ch == null ? "off" : this.parent2Ch;
				}
		
			//Поле Получателями услуги являются лица, фактически осуществляющие уход за ребенком, не подлежащие обязательному социальному страхованию и не получающие пособие по безработице (в том числе обучающиеся по очной форме обучения в образовательных учреждениях и находящиеся в отпуске по уходу за ребенком)
			
			public void setTrudCh(String trudCh) {
					this.trudCh = trudCh;
				}
			public String getTrudCh() {
				return this.trudCh == null ? "off" : this.trudCh;
				}
		
			//Поле Второй родитель является работающим или оба родителя работают
			
			public void setTrud1Ch(String trud1Ch) {
					this.trud1Ch = trud1Ch;
				}
			public String getTrud1Ch() {
				return this.trud1Ch == null ? "off" : this.trud1Ch;
				}
		
			//Поле <html><i>
	//Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Выписка из решения об установлении над ребенком опеки
			
			public void setOpecDocLoad(List<FileBean> opecDocLoad) {
					this.opecDocLoad = AccessCounterList.decorate(opecDocLoad, FileBean.class);
				}
			public List<FileBean> getOpecDocLoad() {
				return normalize(this.opecDocLoad);
				}
		
			//Поле Выписка из трудовой книжки (военного билета) о последнем месте работы (службы), заверенную в установленном порядке, копию приказа о предоставлении отпуска по уходу за ребенком, справку о размере ранее выплаченного пособия по беременности и родам, ежемесячного пособия по уходу за ребенком
			
			public void setVipTrudKnigDocLoad(FileBean vipTrudKnigDocLoad) {
					this.vipTrudKnigDocLoad = vipTrudKnigDocLoad;
				}
			public FileBean getVipTrudKnigDocLoad() {
				return this.vipTrudKnigDocLoad;
				}
		
			//Поле Трудовая книжка
			
			public void setTrudKnigDocLoad(FileBean trudKnigDocLoad) {
					this.trudKnigDocLoad = trudKnigDocLoad;
				}
			public FileBean getTrudKnigDocLoad() {
				return this.trudKnigDocLoad;
				}
		
			//Поле Свидетельства о смерти родителей
			
			public void setSvidDeadDocLoad(List<FileBean> svidDeadDocLoad) {
					this.svidDeadDocLoad = AccessCounterList.decorate(svidDeadDocLoad, FileBean.class);
				}
			public List<FileBean> getSvidDeadDocLoad() {
				return normalize(this.svidDeadDocLoad);
				}
		
			//Поле Решения суда о лишении родителей родительских прав (об ограничении в родительских правах), признании родителей недееспособными (ограниченно дееспособными), безвестно отсутствующими или умершими
			
			public void setSudLishPravDocLoad(List<FileBean> sudLishPravDocLoad) {
					this.sudLishPravDocLoad = AccessCounterList.decorate(sudLishPravDocLoad, FileBean.class);
				}
			public List<FileBean> getSudLishPravDocLoad() {
				return normalize(this.sudLishPravDocLoad);
				}
		
			//Поле Решение суда об установлении факта отсутствия родительского попечения над ребенком (в том числе в связи с болезнью родителей)
			
			public void setSudNoRodPopDocLoad(FileBean sudNoRodPopDocLoad) {
					this.sudNoRodPopDocLoad = sudNoRodPopDocLoad;
				}
			public FileBean getSudNoRodPopDocLoad() {
				return this.sudNoRodPopDocLoad;
				}
		
			//Поле Справка с места работы (учебы, службы) отца (матери, обоих родителей) ребенка о том, что он (она, они) не использует указанный отпуск и не получает пособия (работодатели, образовательные учреждения)
			
			public void setSpravPosobDocLoad(List<FileBean> spravPosobDocLoad) {
					this.spravPosobDocLoad = AccessCounterList.decorate(spravPosobDocLoad, FileBean.class);
				}
			public List<FileBean> getSpravPosobDocLoad() {
				return normalize(this.spravPosobDocLoad);
				}
		
			//Поле Документ, подтверждающий совместное проживание на территории Российской Федерации ребенка с одним из родителей либо лицом, его заменяющим, осуществляющим уход за ним, выданный организацией, уполномоченной на его выдачу
			
			public void setSovmProjivDocLoad(FileBean sovmProjivDocLoad) {
					this.sovmProjivDocLoad = sovmProjivDocLoad;
				}
			public FileBean getSovmProjivDocLoad() {
				return this.sovmProjivDocLoad;
				}
		
			//Поле Приказ о предоставлении отпуска по уходу за ребенком, справку о размере ранее выплаченного пособия по беременности и родам, ежемесячного пособия по уходу за ребенком
			
			public void setPrikazOtpuskDocLoad(FileBean prikazOtpuskDocLoad) {
					this.prikazOtpuskDocLoad = prikazOtpuskDocLoad;
				}
			public FileBean getPrikazOtpuskDocLoad() {
				return this.prikazOtpuskDocLoad;
				}
		
			//Поле Заявления родителей о согласии на усыновление (удочерение) ребенка, оформленное в установленном порядке
			
			public void setSoglUsinDocLoad(List<FileBean> soglUsinDocLoad) {
					this.soglUsinDocLoad = AccessCounterList.decorate(soglUsinDocLoad, FileBean.class);
				}
			public List<FileBean> getSoglUsinDocLoad() {
				return normalize(this.soglUsinDocLoad);
				}
		
			//Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>
			
			//Поле Справка из органов социальной защиты населения по месту жительства отца, матери ребенка о неполучении ежемесячного пособия по уходу за ребенком
			
			public void setSpravSocZashGitDocLoad(FileBean spravSocZashGitDocLoad) {
					this.spravSocZashGitDocLoad = spravSocZashGitDocLoad;
				}
			public FileBean getSpravSocZashGitDocLoad() {
				return this.spravSocZashGitDocLoad;
				}
		
			//Поле Справка из органа социальной защиты населения по месту регистрации, подтверждающую, что ежемесячное пособие по уходу за ребенком не назначалось и не выплачивалось
			
			public void setSpravSocZashRegDocLoad(FileBean spravSocZashRegDocLoad) {
					this.spravSocZashRegDocLoad = spravSocZashRegDocLoad;
				}
			public FileBean getSpravSocZashRegDocLoad() {
				return this.spravSocZashRegDocLoad;
				}
		
			//Поле Документы, подтверждающие статус физических лиц, осуществляющих деятельность в качестве индивидуальных предпринимателей (выписка из единого государственного реестра индивидуальных предпринимателей)
			
			public void setIgripDocLoad(List<FileBean> igripDocLoad) {
					this.igripDocLoad = AccessCounterList.decorate(igripDocLoad, FileBean.class);
				}
			public List<FileBean> getIgripDocLoad() {
				return normalize(this.igripDocLoad);
				}
		
			//Поле Справка из территориального органа Фонда социального страхования Российской Федерации об отсутствии регистрации родителей (одного из родителей), опекуна ребенка в территориальных органах Фонда социального страхования Российской Федерации в качестве страхователя и о неполучении ежемесячного пособия по уходу за ребенком за счет средств обязательного социального страхования
			
			public void setNoSocStrahDocLoad(FileBean noSocStrahDocLoad) {
					this.noSocStrahDocLoad = noSocStrahDocLoad;
				}
			public FileBean getNoSocStrahDocLoad() {
				return this.noSocStrahDocLoad;
				}
		
			//Поле Справка из органа государственной службы занятости населения о невыплате пособия по безработице
			
			public void setSlujZanDocLoad(List<FileBean> slujZanDocLoad) {
					this.slujZanDocLoad = AccessCounterList.decorate(slujZanDocLoad, FileBean.class);
				}
			public List<FileBean> getSlujZanDocLoad() {
				return normalize(this.slujZanDocLoad);
				}
		
			//Поле Справка о нахождении родителей под стражей или об отбывании ими наказания в виде лишения свободы
			
			public void setLishSvobDocLoad(List<FileBean> lishSvobDocLoad) {
					this.lishSvobDocLoad = AccessCounterList.decorate(lishSvobDocLoad, FileBean.class);
				}
			public List<FileBean> getLishSvobDocLoad() {
				return normalize(this.lishSvobDocLoad);
				}
		
			//Поле Справка из органов внутренних дел о том, что место нахождения разыскиваемых родителей не установлено
			
			public void setRoziskDocLoad(List<FileBean> roziskDocLoad) {
					this.roziskDocLoad = AccessCounterList.decorate(roziskDocLoad, FileBean.class);
				}
			public List<FileBean> getRoziskDocLoad() {
				return normalize(this.roziskDocLoad);
				}
		
	
	//Закладка Дополнительные сведения
		
			//Поле Я ознакомился(лась) с обстоятельствами, влекущими изменение размера пособия или прекращение его выплаты,  и обязуюсь своевременно (не позднее, чем в месячный срок) извещать орган социальной защиты населения о их наступлении
			
			public void setIzmSved(String izmSved) {
					this.izmSved = izmSved;
				}
			public String getIzmSved() {
				return this.izmSved;
				}
		
			//Поле Получатель услуги нигде не работал и не работает по трудовому договору, не осуществляет деятельность в качестве индивидуального предпринимателя, адвоката, нотариуса, занимающегося частной практикой, не относится к иным физическим лицам, профессиональная деятельность которых в соответствии с федеральными законами подлежит государственной регистрации и (или) лицензированию
			
			public void setNoWork(String noWork) {
					this.noWork = noWork;
				}
			public String getNoWork() {
				return this.noWork;
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

}
