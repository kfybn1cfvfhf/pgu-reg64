package com.nvision.pgu.web.services.s36400010;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;
import java.util.List;

public class Service36400010Form extends AbstractServiceOrderForm {

    //Поле Сведения о лицензиате (индивидуальном предпринимателе)

    //Поле ФИО индивидуального предпринимателя (отчество, если имеется)
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_boss;    //

    //Поле Адрес места жительства индивидуального предпринимателя (с указанием индекса):


    private String ip_adress;    //

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String ip_phone;    //Данные из СИА, с возможностью правки, валидатор - телефон


    //Поле Адрес электронной почты индивидуального предпринимателя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String ip_email;    //

    //Поле Документ, удостоверяющий личность индивидуального предпринимателя

    //Поле Тип документа
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERNUM)
    private String doc_num;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date doc_date;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String doc_org;    //Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    //Поле <html><b>Сведения о лицензиате (индивидуальном предпринимателе)</b></html>


    //Закладка Сведения о лицензиате - индивидуальном предпринимателе

    //Поле Государственный регистрационный номер записи о государственной регистрации индивидуального предпринимателя (ОГРНИП)


    private String ogrnip;    //Валидатор ОГРНИП

    //Поле ИНН


    private String inn_ip;    //ВАЛИДАТОР ИНН ИП

    //Поле Данные документа, подтверждающего факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей

    //Поле Серия и номер бланка


    private String egrul_num;    //

    //Поле Дата выдачи


    private Date egrul_date;    //

    //Поле Наименование и адрес места нахождения органа, осуществившего государственную регистрацию


    private String egrul_org1;	//
    private String egrul_org2;	//


    //Поле Данные документа о постановке лицензиата на учет в налоговом органе

    //Поле Серия и номер бланка


    private String tax_num;    //

    //Поле Наименование, код подразделения выдавшего документ


    private String tax_org;    //

    //Поле Дата выдачи


    private Date tax_date;    //


    //Закладка Сведения о причине переоформления лицензии


    private String lic_basic;    //

    //Поле Серия и номер действующей лицензии


    private String lic_num;    //

    //Поле Дата начала действия текущей лицензии


    private Date lic_start;    //

    //Поле Дата окончания действия текущей лицензии


    private Date lic_finish;    //

    //Поле Наименование лицензирующего органа, выдавшего лицензию


    private String lic_org;    //

    //Поле Причина переоформления


    private String lic_reason;    //Выбирается из справочника «Причины переоформления лицензии на медицинскую деятельность для индивидуальных предпринимателей». ШАГ 4. Прикрепление электронных копий документов в случае  намерения лицензиата осуществлять медицинскую деятельность по адресам не указанным в лицензии. ШАГ 5. Внесение электронных копий документов и сведений в случае изменения имени, места жительства или реквизитов документа, удостоверяющего личность индивидуального предпринимателя  ШАГ 6. Электронные копии документов, требующихся в случае прекращения деятельности по одному или нескольким адресам мест ее осуществления ШАГ 7. Электронные копии документов, требующихся при намерении лицензиата внести изменения в перечень выполняемых работ (услуг) по одному или нескольким адресам мест ее осуществления ШАГ 8. Электронные копии документов, требующихся в случае изменения перечня выполняемых работ (услуг)  с целью прекращения  по одному или нескольким адресам мест ее осуществления


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Доверенность на лицо, представляющее документы на лицензирование:


    private FileBean loaddoc51;    //

    //Поле Документ, подтверждающего уплату государственной пошлины за переоформление лицензии


    private FileBean loaddoc52;    //Поле прикрепления файла клонируется по кнопке «Добавить»

    //Поле Адреса мест осуществления медицинской деятельности, с указанием  выполняемых работ (услуг)


    private FileBean loaddoc53;    //

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской деятельности


    private List<FileBean> loaddoc54 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности


    private List<FileBean> loaddoc55 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику


    private List<FileBean> loaddoc56 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Копии документов об образовании и квалификации работников соискателя лицензии, осуществляющих техническое обслуживание медицинской техники, или договора с организацией, имеющей лицензию на осуществление этого вида работ и услуг


    private List<FileBean> loaddoc57 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Электронная копия действующей лицензии


    private FileBean loaddoc58;    //

    //Поле Опись прилагаемых документов


    private FileBean loaddoc59;    //


    //Закладка Сведения о изменении данных индивидуального предпринимателя и электронные копии документов

    //Поле Данные документа, подтверждающего факт внесения изменений в  сведения об индивидуальном предпринимателе в Единый государственный реестр индивидуальных предпринимателей

    //Поле Серия и номер документа (формат серия-номер)


    private String egrip_new;    //

    //Поле Дата выдачи


    private Date egrip_date;    //

    //Поле Наименование органа, выдавшего документ


    private String egrip_org;    //

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Доверенность на лицо, представляющее документы на лицензирование:


    private FileBean loaddoc61;    //

    //Поле Документ, подтверждающего уплату государственной пошлины за переоформление лицензии


    private FileBean loaddoc62;    //Поле прикрепления файла клонируется по кнопке «Добавить»

    //Поле Электронная копия действующей лицензии


    private FileBean loaddoc68;    //

    //Поле Опись прилагаемых документов


    private FileBean loaddoc69;    //


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест, по которым прекращена медицинская деятельность, с указанием  даты, с которой фактически она прекращена


    private FileBean loaddoc71;    //

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loaddoc72;    //

    //Поле Документ, подтверждающий уплату государственной пошлины за переоформление лицензии


    private FileBean loaddoc73;    //

    //Поле Опись прилагаемых документов


    private FileBean loaddoc74;    //

    //Поле Электронная копия действующей лицензии


    private FileBean loaddoc75;    //


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест, по которым изменяются виды работ (услуг), с указанием изменяемых выполняемых видов работ (услуг)


    private FileBean loaddoc81;    //

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской


    private List<FileBean> loaddoc82 = AccessCounterList.createEmpty(FileBean.class);

    //Поле Добавить

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности


    private List<FileBean> loaddoc83 = AccessCounterList.createEmpty(FileBean.class);

    //Поле Добавить

    //Поле Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику


   private List<FileBean> loaddoc84 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loaddoc85;    //

    //Поле Документ, подтверждающий уплату государственной пошлины за переоформление лицензии


    private FileBean loaddoc86;    //

    //Поле Опись прилагаемых документов


    private FileBean loaddoc87;    //

    //Поле Электронная копия действующей лицензии


    private FileBean loaddoc88;    //


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест осуществления медицинской деятельности, с указанием прекращаемых выполняемых работ (услуг)


    private FileBean loaddoc91;    //

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loaddoc92;    //

    //Поле Документ, подтверждающий уплату государственной пошлины за переоформление лицензии


    private FileBean loaddoc93;    //

    //Поле Электронная копия действующей лицензии


    private FileBean loaddoc94;    //

    //Поле Опись прилагаемых документов


    private FileBean loaddoc95;    //

    private FileBean loaddoc96;    //

    //Поле Сведения о лицензиате (индивидуальном предпринимателе)

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

    //Поле <html><b>Сведения о лицензиате (индивидуальном предпринимателе)</b></html>


    //Закладка Сведения о лицензиате - индивидуальном предпринимателе

    //Поле Государственный регистрационный номер записи о государственной регистрации индивидуального предпринимателя (ОГРНИП)

    public void setOgrnip(String ogrnip) {
        this.ogrnip = ogrnip;
    }

    public String getOgrnip() {
        return this.ogrnip;
    }

    //Поле ИНН

    public void setInn_ip(String inn_ip) {
        this.inn_ip = inn_ip;
    }

    public String getInn_ip() {
        return this.inn_ip;
    }

    //Поле Данные документа, подтверждающего факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей

    //Поле Серия и номер бланка

    public void setEgrul_num(String egrul_num) {
        this.egrul_num = egrul_num;
    }

    public String getEgrul_num() {
        return this.egrul_num;
    }

    //Поле Дата выдачи

    public void setEgrul_date(Date egrul_date) {
        this.egrul_date = egrul_date;
    }

    public Date getEgrul_date() {
        return this.egrul_date;
    }

    //Поле Наименование и адрес места нахождения органа, осуществившего государственную регистрацию

    public void setEgrul_org1(String egrul_org1) {
            this.egrul_org1 = egrul_org1;
        }
    public String getEgrul_org1() {
        return this.egrul_org1;
        }

    public void setEgrul_org2(String egrul_org2) {
            this.egrul_org2 = egrul_org2;
        }
    public String getEgrul_org2() {
        return this.egrul_org2;
        }

    //Поле Данные документа о постановке лицензиата на учет в налоговом органе

    //Поле Серия и номер бланка

    public void setTax_num(String tax_num) {
        this.tax_num = tax_num;
    }

    public String getTax_num() {
        return this.tax_num;
    }

    //Поле Наименование, код подразделения выдавшего документ

    public void setTax_org(String tax_org) {
        this.tax_org = tax_org;
    }

    public String getTax_org() {
        return this.tax_org;
    }

    //Поле Дата выдачи

    public void setTax_date(Date tax_date) {
        this.tax_date = tax_date;
    }

    public Date getTax_date() {
        return this.tax_date;
    }


    //Закладка Сведения о причине переоформления лицензии

    public void setLic_basic(String lic_basic) {
        this.lic_basic = lic_basic;
    }

    public String getLic_basic() {
        return this.lic_basic;
    }

    //Поле Серия и номер действующей лицензии

    public void setLic_num(String lic_num) {
        this.lic_num = lic_num;
    }

    public String getLic_num() {
        return this.lic_num;
    }




    //Поле Дата начала действия текущей лицензии

    public void setLic_start(Date lic_start) {
        this.lic_start = lic_start;
    }

    public Date getLic_start() {
        return this.lic_start;
    }

    //Поле Дата окончания действия текущей лицензии

    public void setLic_finish(Date lic_finish) {
        this.lic_finish = lic_finish;
    }

    public Date getLic_finish() {
        return this.lic_finish;
    }

    //Поле Наименование лицензирующего органа, выдавшего лицензию

    public void setLic_org(String lic_org) {
        this.lic_org = lic_org;
    }

    public String getLic_org() {
        return this.lic_org;
    }

    //Поле Причина переоформления

    public void setLic_reason(String lic_reason) {
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

    //Поле Документ, подтверждающего уплату государственной пошлины за переоформление лицензии

    public void setLoaddoc52(FileBean loaddoc52) {
        this.loaddoc52 = loaddoc52;
    }

    public FileBean getLoaddoc52() {
        return this.loaddoc52;
    }

    //Поле Адреса мест осуществления медицинской деятельности, с указанием  выполняемых работ (услуг)

    public void setLoaddoc53(FileBean loaddoc53) {
        this.loaddoc53 = loaddoc53;
    }

    public FileBean getLoaddoc53() {
        return this.loaddoc53;
    }

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской деятельности

    public void setLoaddoc54(List<FileBean> loaddoc54) {
        this.loaddoc54 = AccessCounterList.decorate(loaddoc54, FileBean.class);
    }

    public List<FileBean> getLoaddoc54() {
        return normalize(this.loaddoc54);
    }

    //Поле Добавить

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности

    public void setLoaddoc55(List<FileBean> loaddoc55) {
        this.loaddoc55 = AccessCounterList.decorate(loaddoc55, FileBean.class);
    }

    public List<FileBean> getLoaddoc55() {
        return normalize(this.loaddoc55);
    }

    //Поле Добавить

    //Поле Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику

    public void setLoaddoc56(List<FileBean> loaddoc56) {
        this.loaddoc56 = AccessCounterList.decorate(loaddoc56, FileBean.class);
    }

    public List<FileBean> getLoaddoc56() {
        return normalize(this.loaddoc56);
    }

    //Поле Добавить

    //Поле Копии документов об образовании и квалификации работников соискателя лицензии, осуществляющих техническое обслуживание медицинской техники, или договора с организацией, имеющей лицензию на осуществление этого вида работ и услуг

    public void setLoaddoc57(List<FileBean> loaddoc57) {
        this.loaddoc57 = AccessCounterList.decorate(loaddoc57, FileBean.class);
    }

    public List<FileBean> getLoaddoc57() {
        return normalize(this.loaddoc57);
    }

    //Поле Добавить

    //Поле Электронная копия действующей лицензии

    public void setLoaddoc58(FileBean loaddoc58) {
        this.loaddoc58 = loaddoc58;
    }

    public FileBean getLoaddoc58() {
        return this.loaddoc58;
    }

    //Поле Опись прилагаемых документов

    public void setLoaddoc59(FileBean loaddoc59) {
        this.loaddoc59 = loaddoc59;
    }

    public FileBean getLoaddoc59() {
        return this.loaddoc59;
    }


    //Закладка Сведения о изменении данных индивидуального предпринимателя и электронные копии документов

    //Поле Данные документа, подтверждающего факт внесения изменений в  сведения об индивидуальном предпринимателе в Единый государственный реестр индивидуальных предпринимателей

    //Поле Серия и номер документа (формат серия-номер)

    public void setEgrip_new(String egrip_new) {
        this.egrip_new = egrip_new;
    }

    public String getEgrip_new() {
        return this.egrip_new;
    }

    //Поле Дата выдачи

    public void setEgrip_date(Date egrip_date) {
        this.egrip_date = egrip_date;
    }

    public Date getEgrip_date() {
        return this.egrip_date;
    }

    //Поле Наименование органа, выдавшего документ

    public void setEgrip_org(String egrip_org) {
        this.egrip_org = egrip_org;
    }

    public String getEgrip_org() {
        return this.egrip_org;
    }

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Доверенность на лицо, представляющее документы на лицензирование:

    public void setLoaddoc61(FileBean loaddoc61) {
        this.loaddoc61 = loaddoc61;
    }

    public FileBean getLoaddoc61() {
        return this.loaddoc61;
    }

    //Поле Документ, подтверждающего уплату государственной пошлины за переоформление лицензии

    public void setLoaddoc62(FileBean loaddoc62) {
        this.loaddoc62 = loaddoc62;
    }

    public FileBean getLoaddoc62() {
        return this.loaddoc62;
    }


    //Поле Электронная копия действующей лицензии

    public void setLoaddoc68(FileBean loaddoc68) {
        this.loaddoc68 = loaddoc68;
    }

    public FileBean getLoaddoc68() {
        return this.loaddoc68;
    }

    //Поле Опись прилагаемых документов

    public void setLoaddoc69(FileBean loaddoc69) {
        this.loaddoc69 = loaddoc69;
    }

    public FileBean getLoaddoc69() {
        return this.loaddoc69;
    }


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест, по которым прекращена медицинская деятельность, с указанием  даты, с которой фактически она прекращена

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

    //Поле Документ, подтверждающий уплату государственной пошлины за переоформление лицензии

    public void setLoaddoc73(FileBean loaddoc73) {
        this.loaddoc73 = loaddoc73;
    }

    public FileBean getLoaddoc73() {
        return this.loaddoc73;
    }

    //Поле Опись прилагаемых документов

    public void setLoaddoc74(FileBean loaddoc74) {
        this.loaddoc74 = loaddoc74;
    }

    public FileBean getLoaddoc74() {
        return this.loaddoc74;
    }

    //Поле Электронная копия действующей лицензии

    public void setLoaddoc75(FileBean loaddoc75) {
        this.loaddoc75 = loaddoc75;
    }

    public FileBean getLoaddoc75() {
        return this.loaddoc75;
    }


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест, по которым изменяются виды работ (услуг), с указанием изменяемых выполняемых видов работ (услуг)

    public void setLoaddoc81(FileBean loaddoc81) {
        this.loaddoc81 = loaddoc81;
    }

    public FileBean getLoaddoc81() {
        return this.loaddoc81;
    }

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской

    public void setLoaddoc82(List<FileBean> loaddoc82) {
        this.loaddoc82 = AccessCounterList.decorate(loaddoc82, FileBean.class);
    }

    public List<FileBean> getLoaddoc82() {
        return normalize(this.loaddoc82);
    }

    //Поле Добавить

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности

    public void setLoaddoc83(List<FileBean> loaddoc83) {
        this.loaddoc83 = AccessCounterList.decorate(loaddoc83, FileBean.class);
    }

    public List<FileBean> getLoaddoc83() {
        return normalize(this.loaddoc83);
    }

    //Поле Добавить

    //Поле Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику

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

    //Поле Документ, подтверждающий уплату государственной пошлины за переоформление лицензии

    public void setLoaddoc86(FileBean loaddoc86) {
        this.loaddoc86 = loaddoc86;
    }

    public FileBean getLoaddoc86() {
        return this.loaddoc86;
    }

    //Поле Опись прилагаемых документов

    public void setLoaddoc87(FileBean loaddoc87) {
        this.loaddoc87 = loaddoc87;
    }

    public FileBean getLoaddoc87() {
        return this.loaddoc87;
    }

    //Поле Электронная копия действующей лицензии

    public void setLoaddoc88(FileBean loaddoc88) {
        this.loaddoc88 = loaddoc88;
    }

    public FileBean getLoaddoc88() {
        return this.loaddoc88;
    }


    //Закладка Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>
    //
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест осуществления медицинской деятельности, с указанием прекращаемых выполняемых работ (услуг)

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

    //Поле Документ, подтверждающий уплату государственной пошлины за переоформление лицензии

    public void setLoaddoc93(FileBean loaddoc93) {
        this.loaddoc93 = loaddoc93;
    }

    public FileBean getLoaddoc93() {
        return this.loaddoc93;
    }

    //Поле Электронная копия действующей лицензии

    public void setLoaddoc94(FileBean loaddoc94) {
        this.loaddoc94 = loaddoc94;
    }

    public FileBean getLoaddoc94() {
        return this.loaddoc94;
    }

    //Поле Опись прилагаемых документов

    public void setLoaddoc95(FileBean loaddoc95) {
        this.loaddoc95 = loaddoc95;
    }

    public FileBean getLoaddoc95() {
        return this.loaddoc95;
    }

    public FileBean getLoaddoc96() {
        return loaddoc96;
    }

    public void setLoaddoc96(FileBean loaddoc96) {
        this.loaddoc96 = loaddoc96;
    }
}
