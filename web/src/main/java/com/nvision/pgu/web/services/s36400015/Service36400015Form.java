package com.nvision.pgu.web.services.s36400015;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import org.apache.commons.lang.StringUtils;
import ru.lanit.samara.pgu.core.forms.AbstractMedServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400015Form extends AbstractMedServiceOrderForm {

    //Закладка Сведения о заявителе - индивидуальном предпринимателе

    //Поле Сведения о соискателе (индивидуальном предпринимателе)

    //Поле ФИО индивидуального предпринимателя (отчество если имеется)

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio_IP;    //

    //Поле Адрес места жительства индивидуального предпринимателя (с указанием индекса)


    private String place_live;    //

    //Поле Контактный телефон индивидуального предпримателя:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String tel;    //валидатор - телефон, Данные СИА с возможностью правки

    //Поле Просьба о направлении индивидуальному предпринимателю в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты


    private String request;    //в случае заполнения адрес эл.плчты становится обязательным для заполнения

    //Поле Адрес электронной почты индивидуального предпринимателя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email;    //Данные СИА с возможностью правки

    //Поле Документ, удостоверяющий личность индивидуального предпринимателя

    //Поле Тип документа
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;

    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    //Поле Серия и номер документа:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERNUM)
    private String docSer;    //валидатор серия-номер

    //Поле Дата выдачи документа:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date docDate;    //

    //Поле Орган, выдавший документ:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String docIssuer;    //

    //Поле Данные документа, подтверждающего факт внесения сведений о индивидуальном предпринимателе в Единый государственный реестр индивидуальных предпринимателей

    //Поле Наименование органа, выдавшего документ


    private String egipogv;    //

    //Поле Дата выдачи


    private Date egipdate;

    //Поле Адрес места нахождения органа, осуществившего государственную регистрацию:


    private String egipadress;    //

    //Поле Номер и серия бланка


    private String egipser;    //валидатор серия-номер

    //Поле ОГРНИП:


    private String ogrn;    //Допускается ввод только цифровых символов. Корректный номер состоит из 15-ти символов.  Валидатор - ОГРНИП

    //Поле Данные документа о постановке соискателя лицензии на учет в налоговом органе

    //Поле Наименование, код подразделения, адрес налоговой инспекции (с указанием почтового индекса):


    private String regogv;    //

    //Поле Дата выдачи


    private Date regdate;

    //Поле Номер и серия бланка


    private String regser;    //валидатор серия-номер

    //Поле ИНН:


    private String inn;    //Формат: "xxxxxxxxxxxx", где x = 0..9. Иными словами, 12 цифр.


    //Закладка Объекты лицензирования

    //Поле Объект лицензирования

    //Поле Вид обособленного объекта:


    private List<String> objectLicensKind_1 = AccessCounterList.createEmpty(String.class);    //Выбирается из справочника «Вид обособленного объекта»

    //Поле Адрес места осуществления деятельности (с указанием индекса):


    private List<String> licensAdress_1 = AccessCounterList.createEmpty(String.class);    //

    //Поле Виды работ, осуществляемые на объекте:

    @JsonArrayToList
    private List<String> farmWorks_1 = AccessCounterList.createEmpty(String.class);

    //Закладка Электронные копии документов индивидуального предпринимателя

    //Поле Электронные копии документов

    //Поле Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:


    private FileBean loadsan;    //

    //Поле Копии документов, подтверждающих получение работниками соискателя лицензии высшего или среднего фармацевтического образования (дипломы) и сертификатов специалистов:


    private List<FileBean> loadDocF1 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии (лицензиата) принадлежащих ему на праве собственности или на ином законном основании соответствующих помещений:


    private List<FileBean> loadDocG1 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Добавить

    //Поле Документы, подтверждающие оснащение предприятия оборудованием, техническими средствами и приборами, необходимыми для осуществления лицензируемой деятельности:


    private List<FileBean> loadDocH1 = AccessCounterList.createEmpty(String.class);    //

    //Поле Добавить

    //Поле Документ, подтверждающий уплату государственной пошлины за предоставление лицензии


    private FileBean loadDocZ1;    //

    //Поле Доверенность на лицо, представляющее документы на лицензирование


    private FileBean loadDocdov1;    //

    //Поле Опись прилагаемых дкоументов


    private FileBean loadDocdov2;

    private FileBean loaddoc_manager;

    public FileBean getLoaddoc_manager() {
        return loaddoc_manager;
    }

    public void setLoaddoc_manager(FileBean loaddoc_manager) {
        this.loaddoc_manager = loaddoc_manager;
    }

    //Закладка Сведения о заявителе - индивидуальном предпринимателе

    //Поле Сведения о заявителе (индивидуальный предприниматель или его уполномоченный представитель)

    public void setFio_IP(String fio_IP) {
        this.fio_IP = fio_IP;
    }

    public String getFio_IP() {
        return this.fio_IP;
    }

    //Поле Адрес места жительства индивидуального предпринимателя (с указанием индекса)

    public void setPlace_live(String place_live) {
        this.place_live = place_live;
    }

    public String getPlace_live() {
        return this.place_live;
    }

    //Поле Контактный телефон индивидуального предпримателя:

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    //Поле Просьба о направлении индивидуальному предпринимателю в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты

    public void setRequest(String request) {
        if (StringUtils.isNotEmpty(request)) {
            this.request = request;
        } else {
            this.request = "off";
        }
    }

    public String getRequest() {
        return this.request;
    }

    //Поле Адрес электронной почты индивидуального предпринимателя:

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    //Поле Документ, удостоверяющий личность индивидуального предпринимателя


    public void setDocSer(String docSer) {
        this.docSer = docSer;
    }

    public String getDocSer() {
        return this.docSer;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Date getDocDate() {
        return this.docDate;
    }

    public void setDocIssuer(String docIssuer) {
        this.docIssuer = docIssuer;
    }

    public String getDocIssuer() {
        return this.docIssuer;
    }

    //Поле Данные документа, подтверждающего факт внесения сведений о индивидуальном предпринимателе в Единый государственный реестр индивидуальных предпринимателей

    //Поле Наименование органа, выдавшего документ

    public void setEgipogv(String egipogv) {
        this.egipogv = egipogv;
    }

    public String getEgipogv() {
        return this.egipogv;
    }

    //Поле Дата выдачи

    public Date getEgipdate() {
        return egipdate;
    }

    public void setEgipdate(Date egipdate) {
        this.egipdate = egipdate;
    }


    //Поле Адрес места нахождения органа, осуществившего государственную регистрацию:

    public void setEgipadress(String egipadress) {
        this.egipadress = egipadress;
    }

    public String getEgipadress() {
        return this.egipadress;
    }

    //Поле Номер и серия бланка

    public void setEgipser(String egipser) {
        this.egipser = egipser;
    }

    public String getEgipser() {
        return this.egipser;
    }

    //Поле ОГРНИП:

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return this.ogrn;
    }

    //Поле Данные документа о постановке соискателя лицензии на учет в налоговом органе

    //Поле Наименование, код подразделения, адрес налоговой инспекции (с указанием почтового индекса):

    public void setRegogv(String regogv) {
        this.regogv = regogv;
    }

    public String getRegogv() {
        return this.regogv;
    }

    //Поле Дата выдачи

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    //Поле Номер и серия бланка

    public void setRegser(String regser) {
        this.regser = regser;
    }

    public String getRegser() {
        return this.regser;
    }

    //Поле ИНН:

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return this.inn;
    }


    //Закладка Объекты лицензирования

    //Поле Объект лицензирования

    //Поле Вид обособленного объекта:

    public void setObjectLicensKind_1(List<String> objectLicensKind_1) {
        this.objectLicensKind_1 = AccessCounterList.decorate(objectLicensKind_1, String.class);
    }

    public List<String> getObjectLicensKind_1() {
        return normalize(this.objectLicensKind_1);
    }

    //Поле Адрес места осуществления деятельности (с указанием индекса):

    public void setLicensAdress_1(List<String> licensAdress_1) {
        this.licensAdress_1 = AccessCounterList.decorate(licensAdress_1, String.class);
    }

    public List<String> getLicensAdress_1() {
        return normalize(this.licensAdress_1);
    }

    //Поле Виды работ, осуществляемые на объекте:

    public void setFarmWorks_1(List<String> farmWorks_1) {
        this.farmWorks_1 = AccessCounterList.decorate(farmWorks_1, String.class);
    }

    public List<String> getFarmWorks_1() {
        return normalize(this.farmWorks_1);
    }

    //Поле Добавить


    //Закладка Электронные копии документов индивидуального предпринимателя

    //Поле Электронные копии документов

    //Поле Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:

    public void setLoadsan(FileBean loadsan) {
        this.loadsan = loadsan;
    }

    public FileBean getLoadsan() {
        return this.loadsan;
    }

    //Поле Копии документов, подтверждающих получение работниками соискателя лицензии высшего или среднего фармацевтического образования (дипломы) и сертификатов специалистов:

    public void setLoadDocF1(List<FileBean> loadDocF1) {
        this.loadDocF1 = AccessCounterList.decorate(loadDocF1, FileBean.class);
    }

    public List<FileBean> getLoadDocF1() {
        return normalize(this.loadDocF1);
    }

    //Поле Добавить

    //Поле Копии документов, подтверждающих наличие у соискателя лицензии (лицензиата) принадлежащих ему на праве собственности или на ином законном основании соответствующих помещений:

    public void setLoadDocG1(List<FileBean> loadDocG1) {
        this.loadDocG1 = AccessCounterList.decorate(loadDocG1, FileBean.class);
    }

    public List<FileBean> getLoadDocG1() {
        return normalize(this.loadDocG1);
    }

    //Поле Добавить

    //Поле Документы, подтверждающие оснащение предприятия оборудованием, техническими средствами и приборами, необходимыми для осуществления лицензируемой деятельности:

    public void setLoadDocH1(List<FileBean> loadDocH1) {
        this.loadDocH1 = AccessCounterList.decorate(loadDocH1, String.class);
    }

    public List<FileBean> getLoadDocH1() {
        return normalize(this.loadDocH1);
    }

    //Поле Добавить

    //Поле Документ, подтверждающий уплату государственной пошлины за предоставление лицензии

    public void setLoadDocZ1(FileBean loadDocZ1) {
        this.loadDocZ1 = loadDocZ1;
    }

    public FileBean getLoadDocZ1() {
        return this.loadDocZ1;
    }

    //Поле Доверенность на лицо, представляющее документы на лицензирование

    public void setLoadDocdov1(FileBean loadDocdov1) {
        this.loadDocdov1 = loadDocdov1;
    }

    public FileBean getLoadDocdov1() {
        return this.loadDocdov1;
    }

    //Поле Опись прилагаемых дкоументов

    public void setLoadDocdov2(FileBean loadDocdov2) {
        this.loadDocdov2 = loadDocdov2;
    }

    public FileBean getLoadDocdov2() {
        return this.loadDocdov2;
    }


}
