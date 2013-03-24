package com.nvision.pgu.web.services.s36400008;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractMedServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;
import java.util.List;

public class Service36400008Form extends AbstractMedServiceOrderForm {

    //Закладка Сведения о заявителе

    //Поле ФИО Заявителя:


    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_IP;    //

    //Поле Место жительства (с указанием индекса):

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
    private String declarantadress;    //данные из СИА

    //Поле Документ, удостоверяющий личность
    //Поле Тип документа:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;    //Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения

    //Поле Серия и номер документа (серия-номер):
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERNUM)
    private String docser;

    //Поле Дата выдачи документа:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date docdate;

    //Поле Наименование органа, выдавшего документ:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String docissuer;


    //Поле ОГРНИП:


    private String ogrnip;    //

    //Поле Наименование регистрирующего органа, в котором находится регистрационное дело:


    private String ogrnip_org;    //

    //Поле Данные документа, подтверждающего факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей

    //Поле Номер бланка документа (серия-номер)


    private String blank_num;    //

    //Поле Дата выдачи


    private Date date_g;    //

    //Поле Наименование органа, выдавшего документ


    private String org_name2;    //

    //Поле ИНН:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.INN)
    private String taxpayer_idIP;    //данные из СИА

    //Поле Контактный телефон ИП

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone_ip;    //Данные из СИА. валидатор - телефон

    //Поле Адрес электронной почты ИП

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email_ip;    //данные из СИА. валидатор - электронная почта

    //Поле Серия и номер бланка


    private String inn_ser;    //

    //Поле Наименование, код подразделения выдавшего документ:


    private String inn_org;    //

    //Поле Дата выдачи:


    private Date inn_date;    //

    //Поле Просьба о направлении информации на указанный адрес эл.почты:


    private String inn_req;    //

    //Поле Наименование, код подразделения,  адрес налоговой инспекции
    //(с указанием почтового индекса):


    private String org_name1;    //

    //Поле Данные документа о постановке соискателя лицензии на учет в налоговом органе


    //Закладка Объекты лицензирования

    //Поле Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест осуществления деятельности, с указанием осуществляемых на них лицензируемых видов работ и услуг:


    private FileBean licensadress_1;    //

    //Поле Копии документов об образовании (послевузовском, дополнительном профессиональном образовании, повышении квалификации) и документы, подтверждающие стаж работы индивидуального предпринимателя, связанный с выполнением работ (услуг):


    private List<FileBean> loaddoc61 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить


    private FileBean add_doc;    //

    //Поле Копия выданного в установленном порядке санитарно-эпидемиологического заключения о соответствии санитарным правилам осуществляемой медицинской деятельности:


    private FileBean loaddoc62;    //

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений,  необходимых для осуществления медицинской деятельности:


    private List<FileBean> loaddoc63 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить


    private FileBean add_doc1;    //

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности:


    private List<FileBean> loaddoc64 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить


    private FileBean add_doc2;    //


    //Закладка Электронные копии документов индивидуального предпринимателя

    //Поле Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику:


    private List<FileBean> loaddoc65 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Копии документов об образовании и квалификации работников соискателя лицензии, осуществляющих техническое обслуживание медицинской техники, или договор с организацией, имеющей лицензию на осуществление этого вида деятельности:


    private List<FileBean> loaddoc67 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Копия платежного поручения с оригинальной отметкой банка о принятии к исполнению платежа за действия, связанные с предоставлением лицензии:


    private FileBean loaddoc68;    //

    //Поле Опись прилагаемых документов


    private FileBean loaddoc70;

    private List<FileBean> loaddoc60 = AccessCounterList.createEmpty(FileBean.class);

    public List<FileBean> getLoaddoc60() {
        return AccessCounterList.decorate(loaddoc60, FileBean.class);
    }

    public void setLoaddoc60(List<FileBean> loaddoc60) {
        this.loaddoc60 = normalize(loaddoc60);
    }

    //Закладка Сведения о заявителе

    //Поле ФИО ИП

    public void setFio_IP(String fio_IP) {
        this.fio_IP = fio_IP;
    }

    public String getFio_IP() {
        return this.fio_IP;
    }

    //Поле Место жительства (с указанием индекса):

    public void setDeclarantadress(String declarantadress) {
        this.declarantadress = declarantadress;
    }

    public String getDeclarantadress() {
        return this.declarantadress;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public String getDoc_type() {
        return this.doc_type;
    }

    public void setDocser(String docser) {
        this.docser = docser;
    }

    public String getDocser() {
        return this.docser;
    }

    public void setDocdate(Date docdate) {
        this.docdate = docdate;
    }

    public Date getDocdate() {
        return this.docdate;
    }

    public void setDocissuer(String docissuer) {
        this.docissuer = docissuer;
    }

    public String getDocissuer() {
        return this.docissuer;
    }

    //Поле ОГРНИП:

    public void setOgrnip(String ogrnip) {
        this.ogrnip = ogrnip;
    }

    public String getOgrnip() {
        return this.ogrnip;
    }

    //Поле Сведения о заявителе (индивидуальный предприниматель или его уполномоченный представитель)

    //Поле Документ, удостоверяющий личность


    //Закладка Сведения о заявителе (продолжение)

    //Поле Наименование регистрирующего органа, в котором находится регистрационное дело:

    public void setOgrnip_org(String ogrnip_org) {
        this.ogrnip_org = ogrnip_org;
    }

    public String getOgrnip_org() {
        return this.ogrnip_org;
    }

    //Поле Данные документа, подтверждающего факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей

    //Поле Номер бланка документа (серия-номер)

    public void setBlank_num(String blank_num) {
        this.blank_num = blank_num;
    }

    public String getBlank_num() {
        return this.blank_num;
    }

    //Поле Дата выдачи

    public void setDate_g(Date date_g) {
        this.date_g = date_g;
    }

    public Date getDate_g() {
        return this.date_g;
    }

    //Поле Наименование органа, выдавшего документ

    public void setOrg_name2(String org_name2) {
        this.org_name2 = org_name2;
    }

    public String getOrg_name2() {
        return this.org_name2;
    }

    //Поле ИНН:

    public void setTaxpayer_idIP(String taxpayer_idIP) {
        this.taxpayer_idIP = taxpayer_idIP;
    }

    public String getTaxpayer_idIP() {
        return this.taxpayer_idIP;
    }

    //Поле Контактный телефон ИП

    public void setPhone_ip(String phone_ip) {
        this.phone_ip = phone_ip;
    }

    public String getPhone_ip() {
        return this.phone_ip;
    }

    //Поле Адрес электронной почты ИП

    public void setEmail_ip(String email_ip) {
        this.email_ip = email_ip;
    }

    public String getEmail_ip() {
        return this.email_ip;
    }

    //Поле Серия и номер бланка

    public void setInn_ser(String inn_ser) {
        this.inn_ser = inn_ser;
    }

    public String getInn_ser() {
        return this.inn_ser;
    }

    //Поле Наименование, код подразделения выдавшего документ:

    public void setInn_org(String inn_org) {
        this.inn_org = inn_org;
    }

    public String getInn_org() {
        return this.inn_org;
    }

    //Поле Дата выдачи:

    public void setInn_date(Date inn_date) {
        this.inn_date = inn_date;
    }

    public Date getInn_date() {
        return this.inn_date;
    }

    //Поле Просьба о направлении информации на указанный адрес эл.почты:

    public void setInn_req(String inn_req) {
        this.inn_req = inn_req;
    }

    public String getInn_req() {
        return this.inn_req;
    }

    //Поле Наименование, код подразделения,  адрес налоговой инспекции
    //(с указанием почтового индекса):

    public void setOrg_name1(String org_name1) {
        this.org_name1 = org_name1;
    }

    public String getOrg_name1() {
        return this.org_name1;
    }

    //Поле Данные документа о постановке соискателя лицензии на учет в налоговом органе


    //Закладка Объекты лицензирования

    //Поле Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Адреса мест осуществления деятельности, с указанием осуществляемых на них лицензируемых видов работ и услуг:

    public void setLicensadress_1(FileBean licensadress_1) {
        this.licensadress_1 = licensadress_1;
    }

    public FileBean getLicensadress_1() {
        return this.licensadress_1;
    }

    //Поле Копии документов об образовании (послевузовском, дополнительном профессиональном образовании, повышении квалификации) и документы, подтверждающие стаж работы индивидуального предпринимателя, связанный с выполнением работ (услуг):

    public void setLoaddoc61(List<FileBean> loaddoc61) {
        this.loaddoc61 = AccessCounterList.decorate(loaddoc61, FileBean.class);
    }

    public List<FileBean> getLoaddoc61() {
        return normalize(this.loaddoc61);
    }

    //Поле Добавить

    public void setAdd_doc(FileBean add_doc) {
        this.add_doc = add_doc;
    }

    public FileBean getAdd_doc() {
        return this.add_doc;
    }

    //Поле Копия выданного в установленном порядке санитарно-эпидемиологического заключения о соответствии санитарным правилам осуществляемой медицинской деятельности:

    public void setLoaddoc62(FileBean loaddoc62) {
        this.loaddoc62 = loaddoc62;
    }

    public FileBean getLoaddoc62() {
        return this.loaddoc62;
    }

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений,  необходимых для осуществления медицинской деятельности:

    public void setLoaddoc63(List<FileBean> loaddoc63) {
        this.loaddoc63 = AccessCounterList.decorate(loaddoc63, FileBean.class);
    }

    public List<FileBean> getLoaddoc63() {
        return normalize(this.loaddoc63);
    }

    //Поле Добавить

    public void setAdd_doc1(FileBean add_doc1) {
        this.add_doc1 = add_doc1;
    }

    public FileBean getAdd_doc1() {
        return this.add_doc1;
    }

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности:

    public void setLoaddoc64(List<FileBean> loaddoc64) {
        this.loaddoc64 = AccessCounterList.decorate(loaddoc64, FileBean.class);
    }

    public List<FileBean> getLoaddoc64() {
        return normalize(this.loaddoc64);
    }

    //Поле Добавить

    public void setAdd_doc2(FileBean add_doc2) {
        this.add_doc2 = add_doc2;
    }

    public FileBean getAdd_doc2() {
        return this.add_doc2;
    }


    //Закладка Электронные копии документов индивидуального предпринимателя

    //Поле Электронные копии документов

    //Поле <html><i>
    //Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику:

    public void setLoaddoc65(List<FileBean> loaddoc65) {
        this.loaddoc65 = AccessCounterList.decorate(loaddoc65, FileBean.class);
    }

    public List<FileBean> getLoaddoc65() {
        return normalize(this.loaddoc65);
    }

    //Поле Копии документов об образовании и квалификации работников соискателя лицензии, осуществляющих техническое обслуживание медицинской техники, или договор с организацией, имеющей лицензию на осуществление этого вида деятельности:

    public void setLoaddoc67(List<FileBean> loaddoc67) {
        this.loaddoc67 = AccessCounterList.decorate(loaddoc67, FileBean.class);
    }

    public List<FileBean> getLoaddoc67() {
        return normalize(this.loaddoc67);
    }

    //Поле Копия платежного поручения с оригинальной отметкой банка о принятии к исполнению платежа за действия, связанные с предоставлением лицензии:

    public void setLoaddoc68(FileBean loaddoc68) {
        this.loaddoc68 = loaddoc68;
    }

    public FileBean getLoaddoc68() {
        return this.loaddoc68;
    }

    //Поле Опись прилагаемых документов

    public void setLoaddoc70(FileBean loaddoc70) {
        this.loaddoc70 = loaddoc70;
    }

    public FileBean getLoaddoc70() {
        return this.loaddoc70;
    }
}
