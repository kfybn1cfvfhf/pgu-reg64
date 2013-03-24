package com.nvision.pgu.web.services.s36400001;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.StringUtils;

import java.util.Date;
import java.util.List;

public class Service36400001Form extends AbstractServiceOrderForm {
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
    //Закладка Сведения о заявителе

    //Поле Личные данные и контакты заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio;    //Данные из СИА. Недоступно для редактирования

    //Поле Дата рождения:
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date birsday;    //Данные из СИА. Недоступно для редактирования

    //Поле Контактный телефон заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String contactPhone;    //Данные из СИА. Доступно для редактирования.

    //Поле Адрес электронной почты заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String contactEmail;    //Данные из СИА. Доступно для редактирования. Значение валидируется по маске адреса электронной почты

    //Поле Почтовый адрес

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
    private String post_address;    //Данные из СИА

    //Поле Документ удостоверяющий личность

    //Поле Тип документа

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE)
    private String doc_type;    //Данные из СИА

    //Поле Серия

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES)
    private String doc_series;    //Данные из СИА

    //Поле Номер

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER)
    private String doc_number;    //Данные из СИА

    //Поле Выдавшая организация

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG)
    private String doc_entity;    //Данные из СИА

    //Поле Дата выдачи
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date doc_date;


//Закладка Электронные копии документов

    //Поле Электронные копии документов.

    //Поле Заявление образовательного учреждения, согласованное с учредителем:


    private FileBean load_doc0;    //

    //Поле Копии учредительных документов (устав и (или) учредительный договор):


    private List<FileBean> load_doc1 = AccessCounterList.createEmpty(FileBean.class);    //Поле прикрепления файла клонируется по кнопке «Добавить»

    //Поле Добавить

    //Поле Копии свидетельства регистрационного органа на право владения (оперативного управления, хозяйственного ведения) зданиями, строениями, сооружениями помещениями, территориями, используемыми для образовательного процесса,
//или копия договора на аренду зданий, строений, сооружений, помещений, территорий, используемых для образовательного процесса, с отметкой об их регистрации в регистрационном органе,
//или копия договора безвозмездного пользования зданиями, строениями, сооружениями помещениями, территориями, используемыми для образовательного процесса

    private List<FileBean> load_doc2 = AccessCounterList.createEmpty(FileBean.class);    //Поле прикрепления файла клонируется по кнопке «Добавить»


    //Поле Добавить

    //Поле Копия документа, подтверждающего проведение учредителем государственного или муниципального учреждения экспертной оценки последствий договора аренды (если помещения арендуются в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей)


    private List<FileBean> load_doc3 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Справка о материально-техническом обеспечении образовательной деятельности по заявленным к лицензированию образовательным программам (форма №3), подписанная руководителем соискателя лицензии или лицензиата

    private List<FileBean> load_doc4 = AccessCounterList.createEmpty(FileBean.class);

    //Поле Копия положения о филиале (если у учреждения имеется филиал)

    private FileBean load_doc5;

    //Поле Документ, подтверждающий уплату государственной пошлины с отметкой казначейства или банка

    private FileBean load_doc6;

    private FileBean load_doc7;    //

    private FileBean load_doc8;    //

    private FileBean load_doc13;    //
    private FileBean load_doc14;

    private String isTenant;

    private FileBean load_doc15;

    public FileBean getLoad_doc15() {
        return load_doc15;
    }

    public void setLoad_doc15(FileBean load_doc15) {
        this.load_doc15 = load_doc15;
    }

    public String getIsTenant() {
        return isTenant;
    }

    public void setIsTenant(String isTenant) {
        if (!StringUtils.isValid(isTenant)) {
            this.isTenant = "off";
        } else {
            this.isTenant = isTenant;
        }
    }

    private String isBranch;

    public String getIsBranch() {
        return isBranch;
    }

    public void setIsBranch(String isBranch) {
        if (!StringUtils.isValid(isBranch)) {
            this.isBranch = "off";
        } else {
            this.isBranch = isBranch;
        }
    }

    private String isOrgWithEduUnit;

    public String getIsOrgWithEduUnit() {
        return isOrgWithEduUnit;
    }

    public void setIsOrgWithEduUnit(String isOrgWithEduUnit) {
        if (!StringUtils.isValid(isOrgWithEduUnit)) {
            this.isOrgWithEduUnit = "off";
        } else {
            this.isOrgWithEduUnit = isOrgWithEduUnit;
        }
    }


    //Закладка Сведения о заявителе

    //Поле Личные данные и контакты заявителя

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return this.fio;
    }

    //Поле Дата рождения:

    public void setBirsday(Date birsday) {
        this.birsday = birsday;
    }

    public Date getBirsday() {
        return this.birsday;
    }

    //Поле Контактный телефон заявителя:

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    //Поле Адрес электронной почты заявителя:

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    //Поле Почтовый адрес

    public void setPost_address(String post_address) {
        this.post_address = post_address;
    }

    public String getPost_address() {
        return this.post_address;
    }

    //Поле Документ удостоверяющий личность

    //Поле Тип документа

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }

    public String getDoc_type() {
        return this.doc_type;
    }

    //Поле Серия

    public void setDoc_series(String doc_series) {
        this.doc_series = doc_series;
    }

    public String getDoc_series() {
        return this.doc_series;
    }

    //Поле Номер

    public void setDoc_number(String doc_number) {
        this.doc_number = doc_number;
    }

    public String getDoc_number() {
        return this.doc_number;
    }

    //Поле Выдавшая организация

    public void setDoc_entity(String doc_entity) {
        this.doc_entity = doc_entity;
    }

    public String getDoc_entity() {
        return this.doc_entity;
    }

    //Поле Дата выдачи

    public void setDoc_date(Date doc_date) {
        this.doc_date = doc_date;
    }

    public Date getDoc_date() {
        return this.doc_date;
    }

//Закладка Электронные копии документов

    //Поле Электронные копии документов.

    //Поле <html><i>
//Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
//</i></html>

    //Поле Заявление образовательного учреждения, согласованное с учредителем:


    public void setLoad_doc0(FileBean load_doc0) {
        this.load_doc0 = load_doc0;
    }

    public FileBean getLoad_doc0() {
        return this.load_doc0;
    }

    //Поле Копии учредительных документов (устав и (или) учредительный договор):

    public void setLoad_doc1(List<FileBean> load_doc1) {
        this.load_doc1 = AccessCounterList.decorate(load_doc1, FileBean.class);
    }

    public List<FileBean> getLoad_doc1() {
        return normalize(this.load_doc1);
    }

    //Поле Добавить

    //Поле Копии свидетельства регистрационного органа на право владения (оперативного управления, хозяйственного ведения) зданиями, строениями, сооружениями помещениями, территориями, используемыми для образовательного процесса,
//или копия договора на аренду зданий, строений, сооружений, помещений, территорий, используемых для образовательного процесса, с отметкой об их регистрации в регистрационном органе,
//или копия договора безвозмездного пользования зданиями, строениями, сооружениями помещениями, территориями, используемыми для образовательного процесса
    public void setLoad_doc2(List<FileBean> load_doc2) {
        this.load_doc2 = AccessCounterList.decorate(load_doc2, FileBean.class);
    }

    public List<FileBean> getLoad_doc2() {
        return normalize(this.load_doc2);
    }


    //Поле Добавить

    //Поле Копия документа, подтверждающего проведение учредителем государственного или муниципального учреждения экспертной оценки последствий договора аренды (если помещения арендуются в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей)

    public void setLoad_doc3(List<FileBean> load_doc3) {
        this.load_doc3 = AccessCounterList.decorate(load_doc3, FileBean.class);
    }

    public List<FileBean> getLoad_doc3() {
        return normalize(this.load_doc3);
    }

    //Поле Справка о материально-техническом обеспечении образовательной деятельности по заявленным к лицензированию образовательным программам (форма №3), подписанная руководителем соискателя лицензии или лицензиата
    public void setLoad_doc4(List<FileBean> load_doc4) {
        this.load_doc4 = AccessCounterList.decorate(load_doc4, FileBean.class);
    }

    public List<FileBean> getLoad_doc4() {
        return normalize(this.load_doc4);
    }


    //Поле Копия положения о филиале (если у учреждения имеется филиал)
    public void setLoad_doc5(FileBean load_doc5) {
        this.load_doc5 = load_doc5;
    }

    public FileBean getLoad_doc5() {
        return this.load_doc5;
    }

    //Поле Документ, подтверждающий уплату государственной пошлины с отметкой казначейства или банка
    public void setLoad_doc6(FileBean load_doc6) {
        this.load_doc6 = load_doc6;
    }

    public FileBean getLoad_doc6() {
        return this.load_doc6;
    }


    public void setLoad_doc7(FileBean load_doc7) {
        this.load_doc7 = load_doc7;
    }

    public FileBean getLoad_doc7() {
        return this.load_doc7;
    }


    public void setLoad_doc8(FileBean load_doc8) {
        this.load_doc8 = load_doc8;
    }

    public FileBean getLoad_doc8() {
        return this.load_doc8;
    }

    public void setLoad_doc13(FileBean load_doc13) {
        this.load_doc13 = load_doc13;
    }

    public FileBean getLoad_doc13() {
        return this.load_doc13;
    }

    public void setLoad_doc14(FileBean load_doc14) {
        this.load_doc14 = load_doc14;
    }

    public FileBean getLoad_doc14() {
        return this.load_doc14;
    }


}
