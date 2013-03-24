package com.nvision.pgu.web.services.s36400051;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
//import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;
import com.nvision.pgu.core.util.StringUtils;
import com.nvision.pgu.dic.DicItemNotFoundException;
import com.nvision.pgu.dic.DicNotFoundException;
import com.nvision.pgu.dic.DicRegistryUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Service36400051Form extends AbstractServiceOrderForm {


    //Закладка Сведения о заявителе

    //Поле Фамилия, Имя, Отчество заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_zaja;    //Данные из СИА

    //Поле Контактный телефон заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone_zaja;    //Данные из СИА, с возможностью правки, валидатор - телефон

    //Поле Адрес электронной почты заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String enail_zaja;    //Данные из СИА, валидатор - email

    //Поле Сведения о лицензиате (индивидуальном предпринимателе)

    //Поле Совпадает с ФИО Заявителя


    private String fio_ex;    //В случае проставления следующее поле блокируется и заполняется данными ФИО заявителя

    //Поле ФИО индивидуального предпринимателя (отчество, если имеется)

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_boss;    //

    //Поле Адрес места жительства индивидуального предпринимателя (с указанием индекса):

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
    private String ip_adress;    //

    //Поле Контактный телефон индивидуального предпринимателя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String ip_phone;    //Данные из СИА, с возможностью правки, валидатор - телефон


    //Поле Адрес электронной почты индивидуального предпринимателя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String ip_email;    //

    //Поле Документ, удостоверяющий личность индивидуального предпринимателя

    //Поле Тип документа
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String prDocTypeCode;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    //Поле Серия и номер документа (серия-номер)


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
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERNUM)
    private String doc_num;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    //Поле Дата выдачи документа

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date pc_doc_date;

    public Date getPc_doc_date() {
        return pc_doc_date;
    }

    public void setPc_doc_date(Date pc_doc_date) {
        this.pc_doc_date = pc_doc_date;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date doc_date;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    //Поле Наименование органа, выдавшего документ

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String pc_doc_org;

    public String getPc_doc_org() {
        return pc_doc_org;
    }

    public void setPc_doc_org(String pc_doc_org) {
        this.pc_doc_org = pc_doc_org;
    }
    
    //@InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String doc_org;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения


    private String inn_ip;    //ВАЛИДАТОР ИНН ИП

    private String lic_basic;

    private String lic_reason;    //Выбирается из справочника «Причины переоформления лицензии на медицинскую деятельность для индивидуальных предпринимателей». ШАГ 4. Прикрепление электронных копий документов в случае  намерения лицензиата осуществлять медицинскую деятельность по адресам не указанным в лицензии. ШАГ 5. Внесение электронных копий документов и сведений в случае изменения имени, места жительства или реквизитов документа, удостоверяющего личность индивидуального предпринимателя  ШАГ 6. Электронные копии документов, требующихся в случае прекращения деятельности по одному или нескольким адресам мест ее осуществления ШАГ 7. Электронные копии документов, требующихся при намерении лицензиата внести изменения в перечень выполняемых работ (услуг) по одному или нескольким адресам мест ее осуществления ШАГ 8. Электронные копии документов, требующихся в случае изменения перечня выполняемых работ (услуг)  с целью прекращения  по одному или нескольким адресам мест ее осуществления


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Доверенность на лицо, представляющее документы на лицензирование:


    private FileBean loaddoc51;

    private List<FileBean> loaddoc56 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Копии документов об образовании и квалификации работников соискателя лицензии, осуществляющих техническое обслуживание медицинской техники, или договора с организацией, имеющей лицензию на осуществление этого вида работ и услуг


    private List<FileBean> loaddoc57 = AccessCounterList.createEmpty(FileBean.class);    //

    private FileBean loaddoc61;

    private FileBean loaddoc71;    //

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loaddoc72;

    private FileBean loaddoc81;

    private List<FileBean> managerEducationDocs = AccessCounterList.createEmpty(FileBean.class);

    public List<FileBean> getManagerEducationDocs() {
        return normalize(managerEducationDocs);
    }

    public void setManagerEducationDocs(List<FileBean> managerEducationDocs) {
        this.managerEducationDocs = AccessCounterList.decorate(managerEducationDocs, FileBean.class);
    }



   private List<FileBean> loaddoc84 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loaddoc85;

    private FileBean loaddoc91;    //

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loaddoc92;
    private FileBean loaddoc95;

    private List<FileBean> loaddoc104 = AccessCounterList.createEmpty(FileBean.class);


    public void setFio_zaja(String fio_zaja) {
        this.fio_zaja = fio_zaja;
    }

    public String getFio_zaja() {
        return this.fio_zaja;
    }

    //Поле Контактный телефон заявителя

    public void setPhone_zaja(String phone_zaja) {
        this.phone_zaja = phone_zaja;
    }

    public String getPhone_zaja() {
        return this.phone_zaja;
    }

    //Поле Адрес электронной почты заявителя

    public void setEnail_zaja(String enail_zaja) {
        this.enail_zaja = enail_zaja;
    }

    public String getEnail_zaja() {
        return this.enail_zaja;
    }

    //Поле Сведения о лицензиате (индивидуальном предпринимателе)

    //Поле Совпадает с ФИО Заявителя

    public void setFio_ex(String fio_ex) {
        this.fio_ex = fio_ex;
    }

    public String getFio_ex() {
        return this.fio_ex;
    }

    //Поле ФИО индивидуального предпринимателя (отчество, если имеется)

    public void setFio_boss(String fio_boss) {
        this.fio_boss = fio_boss;
    }

    public String getFio_boss() {
        return this.fio_boss;
    }

    //Поле Адрес места жительства индивидуального предпринимателя (с указанием индекса):

    public void setIp_adress(String ip_adress) {
        this.ip_adress = ip_adress;
    }

    public String getIp_adress() {
        return this.ip_adress;
    }

    //Поле Контактный телефон индивидуального предпринимателя

    public void setIp_phone(String ip_phone) {
        this.ip_phone = ip_phone;
    }

    public String getIp_phone() {
        return this.ip_phone;
    }

    //Поле Адрес электронной почты индивидуального предпринимателя

    public void setIp_email(String ip_email) {
        this.ip_email = ip_email;
    }

    public String getIp_email() {
        return this.ip_email;
    }

    //Поле Документ, удостоверяющий личность индивидуального предпринимателя

    //Поле Тип документа

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

    //Поле Серия и номер документа (серия-номер)

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

    //Поле Дата выдачи документа

    public void setDoc_date(Date doc_date) {
        this.doc_date = doc_date;
    }

    public Date getDoc_date() {
        return this.doc_date;
    }

    //Поле Наименование органа, выдавшего документ

    public void setDoc_org(String doc_org) {
        this.doc_org = doc_org;
    }

    public String getDoc_org() {
        return this.doc_org;
    }


    //Поле ИНН

    public void setInn_ip(String inn_ip) {
        this.inn_ip = inn_ip;
    }

    public String getInn_ip() {
        return this.inn_ip;
    }


    public void setLic_basic(String lic_basic) {
        this.lic_basic = lic_basic;
    }

    public String getLic_basic() {
        return this.lic_basic;
    }

    public void setLic_reason(String lic_reason) {
        if (this.getLic_reason() != null && !this.getLic_reason().equals(lic_reason)) {
            this.setManagerEducationDocs(new ArrayList<FileBean>());

        }
        this.lic_reason = lic_reason;
    }

    public String getLic_reason() {
        return this.lic_reason;
    }


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Доверенность на лицо, представляющее документы на лицензирование:

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


    public void setLoaddoc61(FileBean loaddoc61) {
        this.loaddoc61 = loaddoc61;
    }

    public FileBean getLoaddoc61() {
        return this.loaddoc61;
    }


    public void setLoaddoc71(FileBean loaddoc71) {
        this.loaddoc71 = loaddoc71;
    }

    public FileBean getLoaddoc71() {
        return this.loaddoc71;
    }

    //Поле Доверенность на лицо, представляющее документы на лицензирование

    public void setLoaddoc72(FileBean loaddoc72) {
        this.loaddoc72 = loaddoc72;
    }

    public FileBean getLoaddoc72() {
        return this.loaddoc72;
    }

    public void setLoaddoc81(FileBean loaddoc81) {
        this.loaddoc81 = loaddoc81;
    }

    public FileBean getLoaddoc81() {
        return this.loaddoc81;
    }


    public void setLoaddoc84(List<FileBean> loaddoc84) {
        this.loaddoc84 = AccessCounterList.decorate(loaddoc84, FileBean.class);
    }

    public List<FileBean> getLoaddoc84() {
        return normalize(this.loaddoc84);
    }

    //Поле Добавить

    //Поле Доверенность на лицо, представляющее документы на лицензирование

    public void setLoaddoc85(FileBean loaddoc85) {
        this.loaddoc85 = loaddoc85;
    }

    public FileBean getLoaddoc85() {
        return this.loaddoc85;
    }

    public void setLoaddoc91(FileBean loaddoc91) {
        this.loaddoc91 = loaddoc91;
    }

    public FileBean getLoaddoc91() {
        return this.loaddoc91;
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

}
