package com.nvision.pgu.web.services.s36400239;

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
public class Service36400239Form extends AbstractServiceOrderForm {
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
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone;	//По умолчанию:
    private String identityDocType = "Паспорт гражданина Российской Федерации";	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
    private String passSeria;	//валидация: 4 цифры
    private String passNo;	//валидация: 6 цифр
    private Date passDate;	//Логика:
    private String passFrom;	//Логика:
    private FileBean identityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private String recipientLastName;	//По умолчанию:
    private String recipientFirstName;	//По умолчанию:
    private String recipientMiddleName;	//По умолчанию:
    private String recipientaddressIndex;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressEnterType;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressRegion;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressRayon;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressSettlementType;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressCity;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressSettlementText;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressStreetText;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressStreetDict;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressHouse;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressKorpus;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientaddressFlat;	//в АИС соединять в одну строку и передавать в параметре recipientaddress
    private String recipientIdentityDocType = "Паспорт гражданина Российской Федерации";	//Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
    private String recipientPassSeria;	//валидация: 4 цифры
    private String recipientPassNo;	//валидация: 6 цифр
    private Date recipientPassDate;	//Логика:
    private String recipientPassFrom;	//Логика:
    private FileBean recipientIdentityDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private String baseAppeal;	//64_BASE_APPEAL_64239
    private String lonely;	//По умолчанию деактивирован.
    private String noEGRP;	//Логика:
    private List<FileBean> techInventDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
    private FileBean svidBirthDocLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private List<FileBean> noEGRPDocLoad = AccessCounterList.createEmpty(FileBean.class);	//По умолчанию скрыто.
    private List<FileBean> regPeopleDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
    private List<FileBean> statusDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
    private List<FileBean> uchetNujdaJPDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.
    private List<FileBean> dulFamilyDocLoad = AccessCounterList.createEmpty(FileBean.class);	//По умолчанию отображается.
    private List<FileBean> sostavFamilyDocLoad = AccessCounterList.createEmpty(FileBean.class);	//По умолчанию отображается.
    private List<FileBean> obrabPDDocLoad = AccessCounterList.createEmpty(FileBean.class);	//По умолчанию отображается.
    private FileBean spravNo28DocLoad;	//По умолчанию отображается.
    private List<FileBean> EGRPDocLoad = AccessCounterList.createEmpty(FileBean.class);	//Множественная загрузка.

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

    //Поле <h2>Контакты заявителя</h2>

    //Поле Контактный телефон

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    //Поле <h2>Сведения о документе, удостоверяющем личность заявителя</h2>

    //Поле Тип документа, удостоверяющего личность

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }
    public String getIdentityDocType() {
        return this.identityDocType;
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

    //Поле <h2>Дополнительные сведения</h2>

    //Поле Заявитель обращается на  основании

    public void setBaseAppeal(String baseAppeal) {
        this.baseAppeal = baseAppeal;
    }
    public String getBaseAppeal() {
        return this.baseAppeal;
    }

    //Поле Получатель услуги является одиноким

    public void setLonely(String lonely) {
        this.lonely = lonely;
    }
    public String getLonely() {
        return this.lonely == null ? "off" : this.lonely;
    }

    //Поле Право собственности на жилое помещение не зарегистрировано в Едином государственном реестре прав на недвижимое имущество и сделок с ним

    public void setNoEGRP(String noEGRP) {
        this.noEGRP = noEGRP;
    }
    public String getNoEGRP() {
        return this.noEGRP == null ? "off" : this.noEGRP;
    }


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
    //Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
    //</i></html>

    //Поле Документ соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителя, членов его семьи, рожденных до 1 января 1998, в том числе  выданные на фамилию, имя, отчество имевшиеся у них до их изменения

    public void setTechInventDocLoad(List<FileBean> techInventDocLoad) {
        this.techInventDocLoad = AccessCounterList.decorate(techInventDocLoad, FileBean.class);
    }
    public List<FileBean> getTechInventDocLoad() {
        return normalize(this.techInventDocLoad);
    }

    //Поле Свидетельство о рождении получателя услуги

    public void setSvidBirthDocLoad(FileBean svidBirthDocLoad) {
        this.svidBirthDocLoad = svidBirthDocLoad;
    }
    public FileBean getSvidBirthDocLoad() {
        return this.svidBirthDocLoad;
    }

    //Поле Копии документов, подтверждающие право собственности на жилое помещение, либо копия договора социального найма жилого помещения

    public void setNoEGRPDocLoad(List<FileBean> noEGRPDocLoad) {
        this.noEGRPDocLoad = AccessCounterList.decorate(noEGRPDocLoad, FileBean.class);
    }
    public List<FileBean> getNoEGRPDocLoad() {
        return normalize(this.noEGRPDocLoad);
    }

    //Поле Справка о зарегистрированных лицах и лицах снятых с регистрационного учета, но сохранивших право пользования жилыми помещениями, выдаваемую жилищными или жилищно-строительными кооперативами

    public void setRegPeopleDocLoad(List<FileBean> regPeopleDocLoad) {
        this.regPeopleDocLoad = AccessCounterList.decorate(regPeopleDocLoad, FileBean.class);
    }
    public List<FileBean> getRegPeopleDocLoad() {
        return normalize(this.regPeopleDocLoad);
    }

    //Поле Документы, подтверждающие статус ветерана или инвалида

    public void setStatusDocLoad(List<FileBean> statusDocLoad) {
        this.statusDocLoad = AccessCounterList.decorate(statusDocLoad, FileBean.class);
    }
    public List<FileBean> getStatusDocLoad() {
        return normalize(this.statusDocLoad);
    }

    //Поле Документы, свидетельствующие о постановке граждан на учет при признании нуждающимися в улучшении жилищных условий органами местного самоуправления

    public void setUchetNujdaJPDocLoad(List<FileBean> uchetNujdaJPDocLoad) {
        this.uchetNujdaJPDocLoad = AccessCounterList.decorate(uchetNujdaJPDocLoad, FileBean.class);
    }
    public List<FileBean> getUchetNujdaJPDocLoad() {
        return normalize(this.uchetNujdaJPDocLoad);
    }

    //Поле Копии документов удостоверяющих личность всех членов семьи

    public void setDulFamilyDocLoad(List<FileBean> dulFamilyDocLoad) {
        this.dulFamilyDocLoad = AccessCounterList.decorate(dulFamilyDocLoad, FileBean.class);
    }
    public List<FileBean> getDulFamilyDocLoad() {
        return normalize(this.dulFamilyDocLoad);
    }

    //Поле Документы, подтверждающие состав семьи

    public void setSostavFamilyDocLoad (List<FileBean> sostavFamilyDocLoad) {
        this.sostavFamilyDocLoad = AccessCounterList.decorate(sostavFamilyDocLoad,FileBean.class);
    }

    public List<FileBean> getSostavFamilyDocLoad () {
        return normalize(this.sostavFamilyDocLoad);
    }

    //Поле Согласие на обработку персональных данных всех членов семьи заявителя

    public void setObrabPDDocLoad(List<FileBean> obrabPDDocLoad) {
        this.obrabPDDocLoad = AccessCounterList.decorate(obrabPDDocLoad, FileBean.class);
    }
    public List<FileBean> getObrabPDDocLoad() {
        return normalize(this.obrabPDDocLoad);
    }

    //Поле <h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>

    //Поле Справка о заключении брака по форме №28

    public void setSpravNo28DocLoad(FileBean spravNo28DocLoad) {
        this.spravNo28DocLoad = spravNo28DocLoad;
    }
    public FileBean getSpravNo28DocLoad() {
        return this.spravNo28DocLoad;
    }

    //Поле Документы соответствующего органа государственной регистрации прав на недвижимое имущество и сделок с ним на территории Саратовской области об отсутствии (наличии) недвижимости у заявителя и членов его семьи, в том числе выданные на фамилию, имя, отчество имевшиеся у них до их изменения, в случае если данные изменения произошли после 6 июля 1997 года

    public void setEGRPDocLoad(List<FileBean> EGRPDocLoad) {
        this.EGRPDocLoad = AccessCounterList.decorate(EGRPDocLoad, FileBean.class);
    }
    public List<FileBean> getEGRPDocLoad() {
        return normalize(this.EGRPDocLoad);
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
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
}
