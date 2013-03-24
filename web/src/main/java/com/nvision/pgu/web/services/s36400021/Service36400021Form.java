package com.nvision.pgu.web.services.s36400021;

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
public class Service36400021Form extends AbstractServiceOrderForm {


    private String dov_enable;	//По умолчанию: Не активирован
    private String incapable_enable;	//По умолчанию: Не активирован
    private String dovCategory;	//64_DOV_CATEGORY_64206
    private String politicalNationality;	//64_POLITICAL_NATIONALITY_64065
    private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean dovOpekLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
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
    private String addressHouse;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressKorpus;	//По умолчанию:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressFlat;	//По умолчанию:
    private String addressPostIndex;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostCountry="643";	//в АИС соединять в одну строку и передавать в параметре addressPost
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
    private String phone;	//По умолчанию:
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
    private Date recipientBirthdate;	//По умолчанию:
    private String recipientpoliticalNationality;	//64_POLITICAL_NATIONALITY_64065
    private String recipientaddressIndex;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressCountry="643";	//в АИС соединять в одну строку и передавать в параметре address
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
    private String groundsService;	//64_GROUNDS_SERVICE_64021
    private String zayavIP;	//По умолчанию: не активирован
    private String familyAmount;	//По умолчанию:
    private List<String> familyLastName = AccessCounterList.createEmpty(String.class);
    private List<String> familyFirstName = AccessCounterList.createEmpty(String.class);
    private List<String> familyMiddleName = AccessCounterList.createEmpty(String.class);
    private List<Date> familyBirthDate = AccessCounterList.createEmpty(Date.class);
    private List<String> familyRelationships = AccessCounterList.createEmpty(String.class);
    private List<String> familyIP = AccessCounterList.createEmpty(String.class);
    private List<FileBean> idDocumentFamilyLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> kinshipLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> birthCertificateLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean houseBookLoad;
    private List<FileBean> declarationIncomeLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> personalIncomeLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> otherIncomeLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> realEstateLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> priceMotorLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> certificateInsuranceLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> technicalInventoryLoad = AccessCounterList.createEmpty(FileBean.class);
    private FileBean rightHousingLoad;
    private List<FileBean> extractLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> imputedIncomeLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> socialPaymentsLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> semploymentServicesLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> socialAssistanceLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> transportDocLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> inventCostEastLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> cadastrCostZemLoad = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> vipIzEGRPLoad = AccessCounterList.createEmpty(FileBean.class);
    private String agreementApplicant;

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

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public Date getBirthdate() {
        return this.birthdate;
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

    //Поле <h2>Сведения о почтовом адресе законного представителя</h2>

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

    //Поле <h2>Контакты законного представителя</h2>

    //Поле Контактный телефон

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    //Поле <h2>Сведения о документе, удостоверяющем личность законного представителя</h2>

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

    //Поле Документ, удостоверяющий личность законного представителя

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

    //Поле Дата рождения

    public void setRecipientBirthdate(Date recipientBirthdate) {
        this.recipientBirthdate = recipientBirthdate;
    }
    public Date getRecipientBirthdate() {
        return this.recipientBirthdate;
    }

    //Поле Гражданство нуждающегося в услуге

    public void setRecipientpoliticalNationality(String recipientpoliticalNationality) {
        this.recipientpoliticalNationality = recipientpoliticalNationality;
    }
    public String getRecipientpoliticalNationality() {
        return this.recipientpoliticalNationality;
    }

    //Поле <h2>Сведения о месте регистрации лица, нуждающегося в услуге</h2>

    //Поле Индекс

    public void setRecipientaddressIndex(String recipientaddressIndex) {
        this.recipientaddressIndex = recipientaddressIndex;
    }
    public String getRecipientaddressIndex() {
        return this.recipientaddressIndex;
    }

    //Поле Страна

    public void setRecipientaddressCountry(String recipientaddressCountry) {
        this.recipientaddressCountry = recipientaddressCountry;
    }
    public String getRecipientaddressCountry() {
        return this.recipientaddressCountry;
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


    //Закладка Дополнительные сведения

    //Поле <h2>Дополнительные сведения, необходимые для предоставления услуги</h2>

    //Поле Основания предоставления услуги

    public void setGroundsService(String groundsService) {
        this.groundsService = groundsService;
    }
    public String getGroundsService() {
        return this.groundsService;
    }

    //Поле Заявитель является индивидуальным предпринимателем

    public void setZayavIP(String zayavIP) {
        this.zayavIP = zayavIP;
    }
    public String getZayavIP() {
        return this.zayavIP;
    }

    //Поле <h2>Сведения о составе семьи</h2>

    //Поле Количество членов семьи заявителя

    public void setFamilyAmount(String familyAmount) {
        this.familyAmount = familyAmount;
    }
    public String getFamilyAmount() {
        return this.familyAmount;
    }

    //Поле Фамилия

    public void setFamilyLastName(List<String> familyLastName) {
        this.familyLastName = AccessCounterList.decorate(familyLastName, String.class);
    }
    public List<String> getFamilyLastName() {
        return normalize(this.familyLastName);
    }

    //Поле Имя

    public void setFamilyFirstName(List<String> familyFirstName) {
        this.familyFirstName = AccessCounterList.decorate(familyFirstName, String.class);
    }
    public List<String> getFamilyFirstName() {
        return normalize(this.familyFirstName);
    }

    //Поле Отчество (если имеется)

    public void setFamilyMiddleName(List<String> familyMiddleName) {
        this.familyMiddleName = AccessCounterList.decorate(familyMiddleName, String.class);
    }
    public List<String> getFamilyMiddleName() {
        return normalize(this.familyMiddleName);
    }

    //Поле Дата рождения

    public void setFamilyBirthDate(List<Date> familyBirthDate) {
        this.familyBirthDate = AccessCounterList.decorate(familyBirthDate, Date.class);
    }
    public List<Date> getFamilyBirthDate() {
        return normalize(this.familyBirthDate);
    }

    //Поле Родственные отношения

    public void setFamilyRelationships(List<String> familyRelationships) {
        this.familyRelationships = AccessCounterList.decorate(familyRelationships, String.class);
    }
    public List<String> getFamilyRelationships() {
        return normalize(this.familyRelationships);
    }

    //Поле Член семьи вляется индивидуальным предпринимателем

    public void setFamilyIP(List<String> familyIP) {
        this.familyIP = AccessCounterList.decorate(familyIP, String.class);
    }
    public List<String> getFamilyIP() {
        return normalizeCheck(this.familyIP);
    }

    public void setIdDocumentFamilyLoad(List<FileBean> idDocumentFamilyLoad) {
        this.idDocumentFamilyLoad = AccessCounterList.decorate(idDocumentFamilyLoad, FileBean.class);
    }
    public List<FileBean> getIdDocumentFamilyLoad() {
        return normalize(this.idDocumentFamilyLoad);
    }

    //Поле Документ, подтверждающий родственные отношения с заявителем

    public void setKinshipLoad(List<FileBean> kinshipLoad) {
        this.kinshipLoad = AccessCounterList.decorate(kinshipLoad, FileBean.class);
    }
    public List<FileBean> getKinshipLoad() {
        return normalize(this.kinshipLoad);
    }

    //Поле Свидетельство о рождении

    public void setBirthCertificateLoad(List<FileBean> birthCertificateLoad) {
        this.birthCertificateLoad = AccessCounterList.decorate(birthCertificateLoad, FileBean.class);
    }
    public List<FileBean> getBirthCertificateLoad() {
        return normalize(this.birthCertificateLoad);
    }

    //Поле Справка о зарегистрированных лицах и лицах, снятых с регистрационного учета, но сохранивших право пользования жилым помещением, выдаваемая управляющей организацией, ТСЖ, ЖСК и др. (справка формы №1)

    public void setHouseBookLoad(FileBean houseBookLoad) {
        this.houseBookLoad = houseBookLoad;
    }
    public FileBean getHouseBookLoad() {
        return this.houseBookLoad;
    }

    //Поле Декларация по налогу на доходы физических лиц за год предшествующий дате подаче заявления, заверенной налоговым органом по месту жительства, если в соответствии с законодательством заявитель и член семьи (одинокий гражданин) обязан предоставлять указанную декларацию

    public void setDeclarationIncomeLoad(List<FileBean> declarationIncomeLoad) {
        this.declarationIncomeLoad = AccessCounterList.decorate(declarationIncomeLoad, FileBean.class);
    }
    public List<FileBean> getDeclarationIncomeLoad() {
        return normalize(this.declarationIncomeLoad);
    }

    //Поле Добавить

    //Поле Справка о доходах физического лица (2-НДФЛ)

    public void setPersonalIncomeLoad(List<FileBean> personalIncomeLoad) {
        this.personalIncomeLoad = AccessCounterList.decorate(personalIncomeLoad, FileBean.class);
    }
    public List<FileBean> getPersonalIncomeLoad() {
        return normalize(this.personalIncomeLoad);
    }

    //Поле Добавить

    //Поле Справка, подтверждающая получение всех иных видов доходов заявителя и членов его семьи в денежной и натуральной форме (компенсационные выплаты, вознаграждения, материальная помощь, стипендии, страховые выплаты, проценты по вкладам, доходы по акциям, алименты и т.д.)

    public void setOtherIncomeLoad(List<FileBean> otherIncomeLoad) {
        this.otherIncomeLoad = AccessCounterList.decorate(otherIncomeLoad, FileBean.class);
    }
    public List<FileBean> getOtherIncomeLoad() {
        return normalize(this.otherIncomeLoad);
    }

    //Поле Добавить

    //Поле Справка с данными о рыночной стоимости недвижимого имущества, определенной независимыми оценщиками

    public void setRealEstateLoad(List<FileBean> realEstateLoad) {
        this.realEstateLoad = AccessCounterList.decorate(realEstateLoad, FileBean.class);
    }
    public List<FileBean> getRealEstateLoad() {
        return normalize(this.realEstateLoad);
    }

    //Поле Добавить

    //Поле Документ о рыночной стоимости принадлежащего заявителю и членам его семьи транспортного средства, выданный независимыми оценщиками

    public void setPriceMotorLoad(List<FileBean> priceMotorLoad) {
        this.priceMotorLoad = AccessCounterList.decorate(priceMotorLoad, FileBean.class);
    }
    public List<FileBean> getPriceMotorLoad() {
        return normalize(this.priceMotorLoad);
    }

    //Поле Добавить

    //Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>

    //Поле Страховое свидетельство обязательного пенсионного страхования всех членов семьи

    public void setCertificateInsuranceLoad(List<FileBean> certificateInsuranceLoad) {
        this.certificateInsuranceLoad = AccessCounterList.decorate(certificateInsuranceLoad, FileBean.class);
    }
    public List<FileBean> getCertificateInsuranceLoad() {
        return normalize(this.certificateInsuranceLoad);
    }

    //Поле Добавить

    //Поле Документ соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителя и членов его семьи, рожденных до 1 января до 1998 года, в том числе выданных на фамилию, имя, отчество, имевшиеся у них до их изменения

    public void setTechnicalInventoryLoad(List<FileBean> technicalInventoryLoad) {
        this.technicalInventoryLoad = AccessCounterList.decorate(technicalInventoryLoad, FileBean.class);
    }
    public List<FileBean> getTechnicalInventoryLoad() {
        return normalize(this.technicalInventoryLoad);
    }

    //Поле Добавить

    //Поле Документ, подтверждающий право на внеочередное получение жилья

    public void setRightHousingLoad(FileBean rightHousingLoad) {
        this.rightHousingLoad = rightHousingLoad;
    }
    public FileBean getRightHousingLoad() {
        return this.rightHousingLoad;
    }

    //Поле Выписка из Единого государственного реестра индивидуальных предпринимателей

    public void setExtractLoad(List<FileBean> extractLoad) {
        this.extractLoad = AccessCounterList.decorate(extractLoad, FileBean.class);
    }
    public List<FileBean> getExtractLoad() {
        return normalize(this.extractLoad);
    }

    //Поле Добавить

    //Поле Декларация по единому налогу на вмененный доход за год предшествующий дате подаче заявления, заверенной налоговым органом по месту жительства, если член семьи (одинокий гражданин) зарегистрирован как индивидуальный предприниматель и является плательщиком налога на вмененный доход

    public void setImputedIncomeLoad(List<FileBean> imputedIncomeLoad) {
        this.imputedIncomeLoad = AccessCounterList.decorate(imputedIncomeLoad, FileBean.class);
    }
    public List<FileBean> getImputedIncomeLoad() {
        return normalize(this.imputedIncomeLoad);
    }

    //Поле Добавить

    //Поле Сведения о размере социальных выплат застрахованного лица из бюджетов всех уровней

    public void setSocialPaymentsLoad(List<FileBean> socialPaymentsLoad) {
        this.socialPaymentsLoad = AccessCounterList.decorate(socialPaymentsLoad, FileBean.class);
    }
    public List<FileBean> getSocialPaymentsLoad() {
        return normalize(this.socialPaymentsLoad);
    }

    //Поле Добавить

    //Поле Сведения о размере выплат из органов службы занятости

    public void setSemploymentServicesLoad(List<FileBean> semploymentServicesLoad) {
        this.semploymentServicesLoad = AccessCounterList.decorate(semploymentServicesLoad, FileBean.class);
    }
    public List<FileBean> getSemploymentServicesLoad() {
        return normalize(this.semploymentServicesLoad);
    }

    //Поле Добавить

    //Поле Сведения о размере социальных выплатах физическому лицу, признанному нуждающимся в адресной социальной помощи

    public void setSocialAssistanceLoad(List<FileBean> socialAssistanceLoad) {
        this.socialAssistanceLoad = AccessCounterList.decorate(socialAssistanceLoad, FileBean.class);
    }
    public List<FileBean> getSocialAssistanceLoad() {
        return normalize(this.socialAssistanceLoad);
    }

    //Поле Добавить

    //Поле Документы, выданные соответствующими организациями подтверждающие наличие либо отсутствие транспортных средств, принадлежащих заявителю и членам его семьи, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения

    public void setTransportDocLoad(List<FileBean> transportDocLoad) {
        this.transportDocLoad = AccessCounterList.decorate(transportDocLoad, FileBean.class);
    }
    public List<FileBean> getTransportDocLoad() {
        return normalize(this.transportDocLoad);
    }

    //Поле Добавить

    //Поле Документ об инвентаризационной стоимости недвижимого имущества, принадлежащего на праве собственности заявителю и членам его семьи (жилые дома, квартиры, дачи, гаражи и иные строение, помещения, сооружения), выдаваемый органами, осуществляющими техническую инвентаризацию по выбору заявителя

    public void setInventCostEastLoad(List<FileBean> inventCostEastLoad) {
        this.inventCostEastLoad = AccessCounterList.decorate(inventCostEastLoad, FileBean.class);
    }
    public List<FileBean> getInventCostEastLoad() {
        return normalize(this.inventCostEastLoad);
    }

    //Поле Добавить

    //Поле Документ о величине кадастровой стоимости земельных участков, выдаваемый органами, осуществляющими ведение земельного кадастра

    public void setCadastrCostZemLoad(List<FileBean> cadastrCostZemLoad) {
        this.cadastrCostZemLoad = AccessCounterList.decorate(cadastrCostZemLoad, FileBean.class);
    }
    public List<FileBean> getCadastrCostZemLoad() {
        return normalize(this.cadastrCostZemLoad);
    }

    //Поле Добавить

    //Поле Выписка из Единого государственного реестра прав на недвижимое имущество и сделок с ним на заявителя и членов его семьи, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения

    public void setVipIzEGRPLoad(List<FileBean> vipIzEGRPLoad) {
        this.vipIzEGRPLoad = AccessCounterList.decorate(vipIzEGRPLoad, FileBean.class);
    }
    public List<FileBean> getVipIzEGRPLoad() {
        return normalize(this.vipIzEGRPLoad);
    }

    //Поле Добавить

    //Поле <h2>Перечень соглашений</h2>

    //Поле Об изменении места жительства, составе семьи, семейного положения, а также в случае улучшения жилищных условий, когда норма общей площади жилого помещения на одного члена семьи станет равной норме предоставления жилых помещений по договору социального найма или превысит, или при возникновении других обстоятельств при которых необходимость предоставления жилого помещения отпадет, обязуюсь проинформировать не позднее 30 дней со дня возникновения таких изменений

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
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setPhone(privateRoomDataContainer.getPhone());
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
        this.setBirthdate(null);
        this.setPhone("");
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
