package com.nvision.pgu.web.services.s36400016;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;
import com.nvision.pgu.core.util.StringUtils;
import ru.lanit.samara.pgu.core.forms.AbstractMedServiceOrderForm;

import java.util.Date;
import java.util.List;

public class Service36400016Form extends AbstractMedServiceOrderForm {

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


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String declarant_name_ul;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String declarant_post_ul;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String zaja_email;
    private String org_name_ul;
    private String org_form;
    private String short_name;
    private String firm_name;
    private String tel_ul;
    private String request = "off";
    private String email_ul;
    private String org_adress;
    private String ogrn;
    private String inn;
    private  String check_egrp  = "off";

    public String getCheck_egrp() {
        return check_egrp;
    }

    public void setCheck_egrp(String check_egrp) {
        this.check_egrp = check_egrp;
    }

    @JsonArrayToList
    private List<String> actionKind = AccessCounterList.createEmpty(String.class);


    private List<String> license_objects_address = AccessCounterList.createEmpty(String.class);
    private List<FileBean> load_doc2 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean load_doc10;
     private FileBean load_doc13;
     private FileBean load_doc16;

    public FileBean getLoad_doc16() {
        return load_doc16;
    }

    public FileBean getLoad_doc10() {
        return load_doc10;
    }

    public void setLoad_doc10(FileBean load_doc10) {
        this.load_doc10 = load_doc10;
    }

    public void setLoad_doc16(FileBean load_doc16) {

        this.load_doc16 = load_doc16;
    }

    public FileBean getLoad_doc20() {
        return load_doc20;
    }

    public void setLoad_doc20(FileBean load_doc20) {
        this.load_doc20 = load_doc20;
    }

    private FileBean load_doc20;

    public FileBean getLoad_doc17() {
        return load_doc17;
    }

    public void setLoad_doc17(FileBean load_doc17) {
        this.load_doc17 = load_doc17;
    }

    private FileBean load_doc17;
    private FileBean load_doc18;

    public FileBean getLoad_doc18() {
        return load_doc18;
    }

    public void setLoad_doc18(FileBean load_doc18) {
        this.load_doc18 = load_doc18;
    }

    private List<FileBean> load_doc5 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc6 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc7 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc8 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc9 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc12 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc19 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc21 = AccessCounterList.createEmpty(FileBean.class);
    private List<FileBean> load_doc22 = AccessCounterList.createEmpty(FileBean.class);

     public void setLoad_doc22(List<FileBean> load_doc22) {
        this.load_doc22 = AccessCounterList.decorate(load_doc22, FileBean.class);
    }

    public List<FileBean> getLoad_doc22() {
        return normalize(this.load_doc22);
    }

     public void setLoad_doc21(List<FileBean> load_doc21) {
        this.load_doc21 = AccessCounterList.decorate(load_doc21, FileBean.class);
    }

    public List<FileBean> getLoad_doc21() {
        return normalize(this.load_doc21);
    }

    public void setLoad_doc19(List<FileBean> load_doc19) {
        this.load_doc19 = AccessCounterList.decorate(load_doc19, FileBean.class);
    }

    public List<FileBean> getLoad_doc19() {
        return normalize(this.load_doc19);
    }

    public void setDeclarant_name_ul(String declarant_name_ul) {
        this.declarant_name_ul = declarant_name_ul;
    }

    public String getDeclarant_name_ul() {
        return this.declarant_name_ul;
    }

    //Поле Контактный телефон заявителя

    public void setDeclarant_post_ul(String declarant_post_ul) {
        this.declarant_post_ul = declarant_post_ul;
    }

    public String getDeclarant_post_ul() {
        return this.declarant_post_ul;
    }

    //Поле Адрес электронной почты заявителя

    public void setZaja_email(String zaja_email) {
        this.zaja_email = zaja_email;
    }

    public String getZaja_email() {
        return this.zaja_email;
    }

    //Поле Сведения о соискателе (юридическом лице)

    //Поле Полное наименование юридического лица:

    public void setOrg_name_ul(String org_name_ul) {
        this.org_name_ul = org_name_ul;
    }

    public String getOrg_name_ul() {
        return this.org_name_ul;
    }

    //Поле Организационно-правовая форма юридическеого лица

    public void setOrg_form(String org_form) {
        this.org_form = org_form;
    }

    public String getOrg_form() {
        return this.org_form;
    }

    //Поле Сокращенное наименование юридического лица

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getShort_name() {
        return this.short_name;
    }

    //Поле Фирменное наименование юридического лица

    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }

    public String getFirm_name() {
        return this.firm_name;
    }

    //Поле Контактный телефон юридического лица:

    public void setTel_ul(String tel_ul) {
        this.tel_ul = tel_ul;
    }

    public String getTel_ul() {
        return this.tel_ul;
    }

    //Поле Просьба о направлении юридическому лицу в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты

    public void setRequest(String request) {
        if (StringUtils.isValid(request))
            this.request = request;
        else
            this.request = "off";
    }

    public String getRequest() {
        return this.request;
    }

    //Поле Адрес электронной почты юридического лица:

    public void setEmail_ul(String email_ul) {
        this.email_ul = email_ul;
    }

    public String getEmail_ul() {
        return this.email_ul;
    }

    //Поле Место нахождения юридического лица (с указанием индекса)

    public void setOrg_adress(String org_adress) {
        this.org_adress = org_adress;
    }

    public String getOrg_adress() {
        return this.org_adress;
    }


    //Закладка Сведения о  юридическом лице

    //Поле Государственный регистрационный номер записи о создании юридического лица (ОГРН)

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return this.ogrn;
    }

    //Поле ИНН

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return this.inn;
    }


    public List<String> getActionKind() {
        return normalize(this.actionKind);
    }

    public void setActionKind(List<String> actionKind) {
        this.actionKind = AccessCounterList.decorate(actionKind, String.class);
    }

    //Поле Адрес мест осуществления деятельности (с указанием индекса):

    public void setLicense_objects_address(List<String> license_objects_address) {
        this.license_objects_address = AccessCounterList.decorate(license_objects_address, String.class);
    }

    public List<String> getLicense_objects_address() {
        return normalize(this.license_objects_address);
    }

    public void setLoad_doc2(List<FileBean> load_doc2) {
        this.load_doc2 = AccessCounterList.decorate(load_doc2, FileBean.class);
    }

    public List<FileBean> getLoad_doc2() {
        return normalize(this.load_doc2);
    }

    public void setLoad_doc13(FileBean load_doc13) {
        this.load_doc13 = load_doc13;
    }

    public FileBean getLoad_doc13() {
        return this.load_doc13;
    }

    //Поле Копии документов, подтверждающих  право собственности или иное законное основание помещений для осуществления деятельности, связанной с оборотом наркотических средств и психотропных веществ

    public void setLoad_doc5(List<FileBean> load_doc5) {
        this.load_doc5 = AccessCounterList.decorate(load_doc5, FileBean.class);
    }

    public List<FileBean> getLoad_doc5() {
        return normalize(this.load_doc5);
    }

    //Поле Добавить

    //Поле Копии документов, подтверждающих  право собственности или иное законное основание использования оборудования для осуществления деятельности, связанной с оборотом наркотических средств и психотропных веществ

    public void setLoad_doc6(List<FileBean> load_doc6) {
        this.load_doc6 = AccessCounterList.decorate(load_doc6, FileBean.class);
    }

    public List<FileBean> getLoad_doc6() {
        return normalize(this.load_doc6);
    }

    //Поле Добавить

    //Поле Копии сертификата специалиста, подтверждающего соответствующую профессиональную подготовку руководителя юридического лица или руководителя соответствующего подразделения

    public void setLoad_doc7(List<FileBean> load_doc7) {
        this.load_doc7 = AccessCounterList.decorate(load_doc7, FileBean.class);
    }

    public List<FileBean> getLoad_doc7() {
        return normalize(this.load_doc7);
    }

    //Поле Добавить

    //Поле Копии документов об образовании лиц, осуществляющих деятельность, связанную с оборотом наркотических средств и психотропных веществ, а также о квалификации фармацевтических и медицинских работников

    public void setLoad_doc8(List<FileBean> load_doc8) {
        this.load_doc8 = AccessCounterList.decorate(load_doc8, FileBean.class);
    }

    public List<FileBean> getLoad_doc8() {
        return normalize(this.load_doc8);
    }

    //Поле Добавить

    //Поле Копии справок, выданных учреждениями государственной или муниципальной системы здравоохранения об отсутствии у работников заболеваний наркоманией, токсикоманией, хроническим алкоголизмом, а также об отсутствии среди указанных  лиц, признанных непригодными к осуществлению отдельных видов профессиональной деятельности и деятельности, связанной с источником повышенной опасности

    public void setLoad_doc9(List<FileBean> load_doc9) {
        this.load_doc9 = AccessCounterList.decorate(load_doc9, FileBean.class);
    }

    public List<FileBean> getLoad_doc9() {
        return normalize(this.load_doc9);
    }

    public void setLoad_doc12(List<FileBean> load_doc12) {
        this.load_doc12 = AccessCounterList.decorate(load_doc12, FileBean.class);
    }

    public List<FileBean> getLoad_doc12() {
        return normalize(this.load_doc12);
    }

}
