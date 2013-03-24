package com.nvision.pgu.web.services.s36400050;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;
import com.nvision.pgu.dic.DicItemNotFoundException;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.dic.DicRegistryUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Service36400050Form extends AbstractServiceOrderForm {
      @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
     private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
    private String lastName;
     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
    private String middleName;

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

     private String applType;
    public void setApplType(String applType) {
           this.applType = applType;
     			}

	public String getApplType() {
		return this.applType;
				}

    // orgAddress
    private String orgAddressIndex;
    private String orgAddressEnterType;
    private String orgAddressRegion;
    private String orgAddressRayon;
    private String orgAddressCity;
    private String orgAddressSettlementText;
    private String orgAddressSettlementDict;
    private String orgAddressStreetText;
    private String orgAddressStreetDict;
    private String orgAddressHouse;
    private String orgAddressKorpus;
    private String orgAddressFlat;
    private String orgAddressCountry = "643";
    private String orgAddressCountryCode = "ru";
    private String orgAddressCountryInput;
    private String orgAddressSettlementType = "1";
    private String orgAddressCountrySettlement;
    // address
    private String addressIndex;
    private String addressEnterType;
    private String addressRegion;
    private String addressRayon;
    private String addressCity;
    private String addressSettlementText;
    private String addressSettlementDict;
    private String addressStreetText;
    private String addressStreetDict;
    private String addressHouse;
    private String addressKorpus;
    private String addressFlat;
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressSettlementType = "1";
    private String addressCountrySettlement;

    private String boss_platform;    //

    private String full;    //

    private String form;    //

    private String short_name;    //

    private String firm;    //

    private String phone;    //валидатор телефон

    private String ask;    //в случае отметки эл.почта ниже становится обязательным для заполнения

    private String email;    //валидатор - email

    private String ogrn;    //валижатор - ОГРН юр.лица

    private String inn;    //валидатор - ИНН юр.лица

    private String egrul_num;    //валидатор: Заполняется в формате серия-номер

    private String egrul_org;    //

    private Date date_give;    //

    private String egrul_place;

    private Date lic_date_st;    //

    private String lic_num;    //

    private String lic_org;    //

    private String change_reason;    //Выбирается из справочника «Причины переоформления лицензии на медицинскую деятельность для юридических лиц»(change_med_reason_org) В зависимости от выбранной причины происходит переход на один из шагов 4-8:

    private FileBean dovLicLoad;    //

    private List<FileBean> loaddoc65 = AccessCounterList.createEmpty(FileBean.class);    //Поле прикрепления файла клонируется по кнопке «Добавить»



    private List<FileBean> sanCopyLoad = AccessCounterList.createEmpty(FileBean.class);

    private List<FileBean> copyLicPravo = AccessCounterList.createEmpty(FileBean.class);

    private FileBean copyLicLoad;

    private FileBean egripLoad;

    public FileBean getLoaddoc85() {
        return loaddoc85;
    }

    public void setLoaddoc85(FileBean loaddoc85) {
        this.loaddoc85 = loaddoc85;
    }

    public FileBean getEgripLoad() {
        return egripLoad;
    }

    public void setEgripLoad(FileBean egripLoad) {
        this.egripLoad = egripLoad;
    }

    private  FileBean taxPayLoad;

    private  String check_egrp  = "off";

    public String getCheck_egrp() {
        return check_egrp;
    }

    public void setCheck_egrp(String check_egrp) {
        this.check_egrp = check_egrp;
    }

    public FileBean getTaxPayLoad() {
        return taxPayLoad;
    }

    public void setTaxPayLoad(FileBean taxPayLoad) {
        this.taxPayLoad = taxPayLoad;
    }

    private FileBean medActLicenseCopy;

    private  FileBean egrulLoad;

    public FileBean getEgrulLoad() {
        return egrulLoad;
    }

    public void setEgrulLoad(FileBean egrulLoad) {
        this.egrulLoad = egrulLoad;
    }

    public FileBean getMedActLicenseCopy() {
        return medActLicenseCopy;
    }

    public void setMedActLicenseCopy(FileBean medActLicenseCopy) {
        this.medActLicenseCopy = medActLicenseCopy;
    }

     public List<FileBean> getCopyLicPravo() {
        return normalize(this.copyLicPravo);
    }

    public void setCopyLicPravo(List<FileBean> copyLicPravo) {
        this.copyLicPravo = AccessCounterList.decorate(copyLicPravo, FileBean.class);
    }

    public String getOrgAddressIndex() {
        return orgAddressIndex;
    }

    public void setOrgAddressIndex(String orgAddressIndex) {
        this.orgAddressIndex = orgAddressIndex;
    }

    public String getOrgAddressEnterType() {
        return orgAddressEnterType;
    }

    public void setOrgAddressEnterType(String orgAddressEnterType) {
        this.orgAddressEnterType = orgAddressEnterType;
    }

    public String getOrgAddressRegion() {
        return orgAddressRegion;
    }

    public void setOrgAddressRegion(String orgAddressRegion) {
        this.orgAddressRegion = orgAddressRegion;
    }

    public String getOrgAddressRayon() {
        return orgAddressRayon;
    }

    public void setOrgAddressRayon(String orgAddressRayon) {
        this.orgAddressRayon = orgAddressRayon;
    }

    public String getOrgAddressCity() {
        return orgAddressCity;
    }

    public void setOrgAddressCity(String orgAddressCity) {
        this.orgAddressCity = orgAddressCity;
    }

    public String getOrgAddressSettlementText() {
        return orgAddressSettlementText;
    }

    public void setOrgAddressSettlementText(String orgAddressSettlementText) {
        this.orgAddressSettlementText = orgAddressSettlementText;
    }

    public String getOrgAddressSettlementDict() {
        return orgAddressSettlementDict;
    }

    public void setOrgAddressSettlementDict(String orgAddressSettlementDict) {
        this.orgAddressSettlementDict = orgAddressSettlementDict;
    }

    public String getOrgAddressStreetText() {
        return orgAddressStreetText;
    }

    public void setOrgAddressStreetText(String orgAddressStreetText) {
        this.orgAddressStreetText = orgAddressStreetText;
    }

    public String getOrgAddressStreetDict() {
        return orgAddressStreetDict;
    }

    public void setOrgAddressStreetDict(String orgAddressStreetDict) {
        this.orgAddressStreetDict = orgAddressStreetDict;
    }

    public String getOrgAddressHouse() {
        return orgAddressHouse;
    }

    public void setOrgAddressHouse(String orgAddressHouse) {
        this.orgAddressHouse = orgAddressHouse;
    }

    public String getOrgAddressKorpus() {
        return orgAddressKorpus;
    }

    public void setOrgAddressKorpus(String orgAddressKorpus) {
        this.orgAddressKorpus = orgAddressKorpus;
    }

    public String getOrgAddressFlat() {
        return orgAddressFlat;
    }

    public void setOrgAddressFlat(String orgAddressFlat) {
        this.orgAddressFlat = orgAddressFlat;
    }

    public String getOrgAddressCountry() {
        return orgAddressCountry;
    }

    public void setOrgAddressCountry(String orgAddressCountry) {
        this.orgAddressCountry = orgAddressCountry;
    }

    public String getOrgAddressCountryCode() {
        return orgAddressCountryCode;
    }

    public void setOrgAddressCountryCode(String orgAddressCountryCode) {
        this.orgAddressCountryCode = orgAddressCountryCode;
    }

    public String getOrgAddressCountryInput() {
        return orgAddressCountryInput;
    }

    public void setOrgAddressCountryInput(String orgAddressCountryInput) {
        this.orgAddressCountryInput = orgAddressCountryInput;
    }

    public String getOrgAddressSettlementType() {
        return orgAddressSettlementType;
    }

    public void setOrgAddressSettlementType(String orgAddressSettlementType) {
        this.orgAddressSettlementType = orgAddressSettlementType;
    }

    public String getOrgAddressCountrySettlement() {
        return orgAddressCountrySettlement;
    }

    public void setOrgAddressCountrySettlement(String orgAddressCountrySettlement) {
        this.orgAddressCountrySettlement = orgAddressCountrySettlement;
    }

    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressEnterType() {
        return addressEnterType;
    }

    public void setAddressEnterType(String addressEnterType) {
        this.addressEnterType = addressEnterType;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressRayon() {
        return addressRayon;
    }

    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressSettlementText() {
        return addressSettlementText;
    }

    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }

    public String getAddressSettlementDict() {
        return addressSettlementDict;
    }

    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }

    public String getAddressStreetText() {
        return addressStreetText;
    }

    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }

    public String getAddressStreetDict() {
        return addressStreetDict;
    }

    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressKorpus() {
        return addressKorpus;
    }

    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }

    public String getAddressFlat() {
        return addressFlat;
    }

    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public List<FileBean> getSanCopyLoad() {
        return normalize(this.sanCopyLoad);
    }

    public void setSanCopyLoad(List<FileBean> sanCopyLoad) {
        this.sanCopyLoad = AccessCounterList.decorate(sanCopyLoad, FileBean.class);
    }

    public List<FileBean> getManagerEducationDocs() {
        return normalize(managerEducationDocs);
    }

    public void setManagerEducationDocs(List<FileBean> managerEducationDocs) {
        this.managerEducationDocs = AccessCounterList.decorate(managerEducationDocs, FileBean.class);
    }

    private List<FileBean> staffAdditionalEducationDocs = AccessCounterList.createEmpty(FileBean.class);

    public List<FileBean> getStaffAdditionalEducationDocs() {
        return normalize(staffAdditionalEducationDocs);
    }

    public void setStaffAdditionalEducationDocs(List<FileBean> staffAdditionalEducationDocs) {
        this.staffAdditionalEducationDocs = AccessCounterList.decorate(staffAdditionalEducationDocs, FileBean.class);
    }

    private List<FileBean> staffEducationDocs = AccessCounterList.createEmpty(FileBean.class);

    public List<FileBean> getStaffEducationDocs() {
        return normalize(staffEducationDocs);
    }

    public void setStaffEducationDocs(List<FileBean> staffEducationDocs) {
        this.staffEducationDocs = AccessCounterList.decorate(staffEducationDocs, FileBean.class);
    }

    public void setFio_zaja(String fio_zaja) {
        this.fio_zaja = fio_zaja;
    }

    public String getFio_zaja() {
        return this.fio_zaja;
    }

    public void setPhone_zaja(String phone_zaja) {
        this.phone_zaja = phone_zaja;
    }

    public String getPhone_zaja() {
        return this.phone_zaja;
    }

    public void setEnail_zaja(String enail_zaja) {
        this.enail_zaja = enail_zaja;
    }

    public String getEnail_zaja() {
        return this.enail_zaja;
    }

    public void setFio_ex(String fio_ex) {
        this.fio_ex = fio_ex;
    }

    public String getFio_ex() {
        return this.fio_ex;
    }

    public void setFio_boss(String fio_boss) {
        this.fio_boss = fio_boss;
    }

    public String getFio_boss() {
        return this.fio_boss;
    }

    public void setBoss_platform(String boss_platform) {
        this.boss_platform = boss_platform;
    }

    public String getBoss_platform() {
        return this.boss_platform;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getFull() {
        return this.full;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return this.form;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getShort_name() {
        return this.short_name;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getFirm() {
        return this.firm;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getAsk() {
        return this.ask;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return this.ogrn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return this.inn;
    }

    public void setEgrul_num(String egrul_num) {
        this.egrul_num = egrul_num;
    }

    public String getEgrul_num() {
        return this.egrul_num;
    }

    public void setEgrul_org(String egrul_org) {
        this.egrul_org = egrul_org;
    }

    public String getEgrul_org() {
        return this.egrul_org;
    }

    public void setDate_give(Date date_give) {
        this.date_give = date_give;
    }

    public Date getDate_give() {
        return this.date_give;
    }

    public void setEgrul_place(String egrul_place) {
        this.egrul_place = egrul_place;
    }

    public String getEgrul_place() {
        return this.egrul_place;
    }

    public void setLic_date_st(Date lic_date_st) {
        this.lic_date_st = lic_date_st;
    }

    public Date getLic_date_st() {
        return this.lic_date_st;
    }

    public void setLic_num(String lic_num) {
        this.lic_num = lic_num;
    }

    public String getLic_num() {
        return this.lic_num;
    }

    public void setLic_org(String lic_org) {
        this.lic_org = lic_org;
    }

    public String getLic_org() {
        return this.lic_org;
    }

    public void setChange_reason(String change_reason) {
        this.change_reason = change_reason;
    }

    public String getChange_reason() {
        return this.change_reason;
    }

    public void setDovLicLoad(FileBean dovLicLoad) {
        this.dovLicLoad = dovLicLoad;
    }

    public FileBean getDovLicLoad() {
        return this.dovLicLoad;
    }

     public FileBean getCopyLicLoad() {
        return copyLicLoad;
    }

    public void setCopyLicLoad(FileBean copyLicLoad) {
        this.copyLicLoad = copyLicLoad;
    }

    public void setLoaddoc61(FileBean loaddoc61) {
        this.loaddoc61 = loaddoc61;
    }

    public FileBean getLoaddoc61() {
        return this.loaddoc61;
    }

    public void setLoaddoc65(List<FileBean> loaddoc65) {
        this.loaddoc65 = AccessCounterList.decorate(loaddoc65, FileBean.class);
    }

    public List<FileBean> getLoaddoc65() {
        return normalize(this.loaddoc65);
    }

    public void setLoaddoc71(FileBean loaddoc71) {
        this.loaddoc71 = loaddoc71;
    }

    public FileBean getLoaddoc71() {
        return this.loaddoc71;
    }

    public void setLoaddoc81(FileBean loaddoc81) {
        this.loaddoc81 = loaddoc81;
    }

    public FileBean getLoaddoc81() {
        return this.loaddoc81;
    }

    public void setLoaddoc91(FileBean loaddoc91) {
        this.loaddoc91 = loaddoc91;
    }

    public FileBean getLoaddoc91() {
        return this.loaddoc91;
    }

        @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_zaja;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone_zaja;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String enail_zaja;


    private String fio_ex;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_boss;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String ip_phone;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String ip_email;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String prDocTypeCode;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String pc_doc_num_1;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String pc_doc_num_2;

    public void setPc_doc_num_1(String pc_doc_num_1) {
        this.pc_doc_num_1 = pc_doc_num_1;
    }

    public void setPc_doc_num_2(String pc_doc_num_2) {
        this.pc_doc_num_2 = pc_doc_num_2;
    }

    private String pc_doc_num;

    public String getPc_doc_num() {
        return pc_doc_num_1 + "-" + pc_doc_num_2;
    }

    public void setPc_doc_num(String pc_doc_num) {
        this.pc_doc_num = pc_doc_num;
    }

    private String doc_num;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date pc_doc_date;

    public Date getPc_doc_date() {
        return pc_doc_date;
    }

    public void setPc_doc_date(Date pc_doc_date) {
        this.pc_doc_date = pc_doc_date;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date doc_date;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String pc_doc_org;

    public String getPc_doc_org() {
        return pc_doc_org;
    }

    public void setPc_doc_org(String pc_doc_org) {
        this.pc_doc_org = pc_doc_org;
    }

    private String doc_org;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения


    private FileBean inn_ip;

    private String lic_basic;

    private String lic_reason;

    private FileBean loaddoc51;

    private List<FileBean> loaddoc56 = AccessCounterList.createEmpty(FileBean.class);    //


    private List<FileBean> loaddoc57 = AccessCounterList.createEmpty(FileBean.class);    //

    private FileBean loaddoc61;

    private FileBean loaddoc71;


    private FileBean loaddoc72;

    private FileBean loaddoc81;

    private List<FileBean> managerEducationDocs = AccessCounterList.createEmpty(FileBean.class);

    private FileBean loaddoc85;

    private FileBean loaddoc91;



    private FileBean loaddoc92;
    private FileBean loaddoc95;

    private List<FileBean> loaddoc104 = AccessCounterList.createEmpty(FileBean.class);


    public void setIp_phone(String ip_phone) {
        this.ip_phone = ip_phone;
    }

    public String getIp_phone() {
        return this.ip_phone;
    }


    public void setIp_email(String ip_email) {
        this.ip_email = ip_email;
    }

    public String getIp_email() {
        return this.ip_email;
    }


    public String getPrDocTypeCode() {
        return prDocTypeCode;
    }


    DicRegistryUI dicRegistry;
    public void setDicRegistry(DicRegistryUI dicRegistry) {
        this.dicRegistry = dicRegistry;
    }


    public void setPrDocTypeCode(String prDocTypeCode) throws DicItemNotFoundException, DicNotFoundException {
        this.prDocTypeCode = prDocTypeCode;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }
    public String getDoc_type() {
        return this.doc_type;
    }


    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }

    public String getDoc_num() {
        //return this.doc_num;
        if (this.doc_num == null)
            return getPc_doc_num();
        else
            return this.doc_num;
    }


    public void setDoc_date(Date doc_date) {
        this.doc_date = doc_date;
    }

    public Date getDoc_date() {
        return this.doc_date;
    }


    public void setDoc_org(String doc_org) {
        this.doc_org = doc_org;
    }

    public String getDoc_org() {
        return this.doc_org;
    }


    public void setInn_ip(FileBean inn_ip) {
        this.inn_ip = inn_ip;
    }

    public FileBean getInn_ip() {
        return this.inn_ip;
    }


    public void setLic_basic(String lic_basic) {
        this.lic_basic = lic_basic;
    }

    public String getLic_basic() {
        return this.lic_basic;
    }



    public void setLoaddoc51(FileBean loaddoc51) {
        this.loaddoc51 = loaddoc51;
    }

    public FileBean getLoaddoc51() {
        return this.loaddoc51;
    }


    public void setLoaddoc56(List<FileBean> loaddoc56) {
        this.loaddoc56 = AccessCounterList.decorate(loaddoc56, FileBean.class);
    }

    public List<FileBean> getLoaddoc56() {
        return normalize(this.loaddoc56);
    }

    public void setLoaddoc57(List<FileBean> loaddoc57) {
        this.loaddoc57 = AccessCounterList.decorate(loaddoc57, FileBean.class);
    }

    public List<FileBean> getLoaddoc57() {
        return normalize(this.loaddoc57);
    }


    public void setLoaddoc72(FileBean loaddoc72) {
        this.loaddoc72 = loaddoc72;
    }

    public FileBean getLoaddoc72() {
        return this.loaddoc72;
    }



    //Поле Доверенность на лицо, представляющее документы на лицензирование

    public void setLoaddoc92(FileBean loaddoc92) {
        this.loaddoc92 = loaddoc92;
    }

    public FileBean getLoaddoc92() {
        return this.loaddoc92;
    }

    public void setLoaddoc104(List<FileBean> loaddoc104) {
        this.loaddoc104 = AccessCounterList.decorate(loaddoc104, FileBean.class);
    }

    public List<FileBean> getLoaddoc104() {
        return normalize(this.loaddoc104);
    }

    public String getLic_reason() {
        return lic_reason;
    }

    public void setLic_reason(String lic_reason) {
        this.lic_reason = lic_reason;
    }

    public FileBean getLoaddoc95() {
        return loaddoc95;
    }

    public void setLoaddoc95(FileBean loaddoc95) {
        this.loaddoc95 = loaddoc95;
    }
}


