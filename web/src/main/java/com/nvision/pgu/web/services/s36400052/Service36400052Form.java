package com.nvision.pgu.web.services.s36400052;

import com.nvision.pgu.core.annotations.InitRule;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;

public class Service36400052Form extends AbstractServiceOrderForm {

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

    private String declarant;    //Реализовать выбор между юридическим лицом и индивидуальным предпринимателем радиобаттоном. Если значение поля: Юридическое лицо - переход к шагу 3; если значение поля: ИП - переход к шагу 2.

    //Поле Вид запрашиваемого документа

    //Поле Выбор вида документа


    private String doc_vid;    //радиобаттон: Выбор между «Дубликат документа, подтверждающего наличие лицензии, с приложениями», «Копия документа, подтверждающего наличие лицензии, с приложениями», а также "не требуется"

    //Поле Выбор вида приложения к документу


    private String doc_tip;    //радиобаттон: Выбор между «Дубликат приложения», «Копия приложения», а также "не требуется

    //Поле Причина обращения за дубликатом/копией


    private String reason;    //

    //Поле Серия и номер действующей лицензии (серия-номер)


    private String serie_num;    //в формате - x-x где x - любой набор букв или цифр


    //Закладка Сведения заявителя – индивидуального предпринимателя

    //Поле ФИО лицензиата:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String declarant_name;    //данные СИА

    //Поле Место жительства (с указанием индекса):

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS)
    private String declarant_adress;    //данные СИА


    private FileBean inn;    //

    //Поле Наименование, код подразделения, адрес налоговой инспекции (с указанием почтового индекса)


    private String inn_org;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone_ip;    //Заполняется из СИА c возможностью правки

    //Поле Адрес электронной почты лицензиата

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email_ip;    //Заполняется из СИА c возможностью правки

    //Поле Электронная копия документа

    //Поле <html><i>
    //Размещенное ниже поле предназначено для представления электронной копии документа. Электронная копия документа должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Копия платежного документа, подтверждающего оплату государственной пошлины:

    private FileBean egripLoad;

    public FileBean getEgripLoad() {
        return egripLoad;
    }

    public void setEgripLoad(FileBean egripLoad) {
        this.egripLoad = egripLoad;
    }

    private FileBean load_doc_a1;
    private FileBean load_doc_a2;
    private FileBean load_doc_a3;

    public FileBean getLoad_doc_a3() {
        return load_doc_a3;
    }

    public void setLoad_doc_a3(FileBean load_doc_a3) {
        this.load_doc_a3 = load_doc_a3;
    }

    private FileBean load_doc_b3;

    public FileBean getLoad_doc_b3() {
        return load_doc_b3;
    }

    public void setLoad_doc_b3(FileBean load_doc_b3) {
        this.load_doc_b3 = load_doc_b3;
    }
    //Закладка Сведения заявителя – юридического лица

    //Поле Наименование лицензиата:


    private String org_name_ul;    //

    //Поле Место нахождения юридического лица (с указанием индекса):


    private String org_adress;    //

    //Поле Фамилия, Имя Отчество руководителя лицензиата:


    private String fio_mngr;    //

    //Поле Должность руководителя лицензиата:


    private String place_leader;    //

    //Поле ИНН:


    private String inn_ul;    //

    //Поле Государственный регистрационный номер (ОГРН):


    private String ogrn_ul;    //

    //Поле Телефон лицензиата:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone_ul;    //Данные из СИА с возможностью правки

    //Поле Адрес электронной почты лицензиата:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email_ul;    //Данные из СИА с возможностью правки

    //Поле Электронная копия документа:

    //Поле <html><i>
    //Размещенное ниже поле предназначено для представления электронной копии документа. Электронная копия документа должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Копия платежного документа, подтверждающего оплату государственной пошлины:


    private String egrul_org2;    //

    private String dig_result;

    private String inn_req;    //

    private String juridical_person_form;

//Закладка Тип заявителя

    //Поле Заявитель:

    public void setDeclarant(String declarant) {
        this.declarant = declarant;
    }

    public String getDeclarant() {
        return this.declarant;
    }

    //Поле Вид запрашиваемого документа

    //Поле Выбор вида документа

    public void setDoc_vid(String doc_vid) {
        this.doc_vid = doc_vid;
    }

    public String getDoc_vid() {
        return this.doc_vid;
    }

    //Поле Выбор вида приложения к документу

    public void setDoc_tip(String doc_tip) {
        this.doc_tip = doc_tip;
    }

    public String getDoc_tip() {
        return this.doc_tip;
    }

    //Поле Причина обращения за дубликатом/копией

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return this.reason;
    }

    //Поле Серия и номер действующей лицензии (серия-номер)

    public void setSerie_num(String serie_num) {
        this.serie_num = serie_num;
    }

    public String getSerie_num() {
        return this.serie_num;
    }


    //Закладка Сведения заявителя – индивидуального предпринимателя

    //Поле ФИО лицензиата:

    public void setDeclarant_name(String declarant_name) {
        this.declarant_name = declarant_name;
    }

    public String getDeclarant_name() {
        return this.declarant_name;
    }

    //Поле Место жительства (с указанием индекса):

    public void setDeclarant_adress(String declarant_adress) {
        this.declarant_adress = declarant_adress;
    }

    public String getDeclarant_adress() {
        return this.declarant_adress;
    }

    //Поле ИНН:

    public void setInn(FileBean inn) {
        this.inn = inn;
    }

    public FileBean getInn() {
        return this.inn;
    }

    //Поле Наименование, код подразделения, адрес налоговой инспекции (с указанием почтового индекса)

    public void setInn_org(String inn_org) {
        this.inn_org = inn_org;
    }

    public String getInn_org() {
        return this.inn_org;
    }



    //Поле Телефон лицензиата

    public void setPhone_ip(String phone_ip) {
        this.phone_ip = phone_ip;
    }

    public String getPhone_ip() {
        return this.phone_ip;
    }

    //Поле Адрес электронной почты лицензиата

    public void setEmail_ip(String email_ip) {
        this.email_ip = email_ip;
    }

    public String getEmail_ip() {
        return this.email_ip;
    }

    //Поле Электронная копия документа

    //Поле <html><i>
    //Размещенное ниже поле предназначено для представления электронной копии документа. Электронная копия документа должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    //Поле Копия платежного документа, подтверждающего оплату государственной пошлины:

    public void setLoad_doc_a1(FileBean load_doc_a1) {
        this.load_doc_a1 = load_doc_a1;
    }

    public FileBean getLoad_doc_a1() {
        return this.load_doc_a1;
    }


    public void setLoad_doc_a2(FileBean load_doc_a2) {
        this.load_doc_a2 = load_doc_a2;
    }

    public FileBean getLoad_doc_a2() {
        return this.load_doc_a2;
    }


    //Закладка Сведения заявителя – юридического лица

    //Поле Наименование лицензиата:

    public void setOrg_name_ul(String org_name_ul) {
        this.org_name_ul = org_name_ul;
    }

    public String getOrg_name_ul() {
        return this.org_name_ul;
    }

    //Поле Место нахождения юридического лица (с указанием индекса):

    public void setOrg_adress(String org_adress) {
        this.org_adress = org_adress;
    }

    public String getOrg_adress() {
        return this.org_adress;
    }

    //Поле Фамилия, Имя Отчество руководителя лицензиата:

    public void setFio_mngr(String fio_mngr) {
        this.fio_mngr = fio_mngr;
    }

    public String getFio_mngr() {
        return this.fio_mngr;
    }

    //Поле ИНН:

    public void setInn_ul(String inn_ul) {
        this.inn_ul = inn_ul;
    }

    public String getInn_ul() {
        return this.inn_ul;
    }

    //Поле Государственный регистрационный номер (ОГРН):

    public void setOgrn_ul(String ogrn_ul) {
        this.ogrn_ul = ogrn_ul;
    }

    public String getOgrn_ul() {
        return this.ogrn_ul;
    }

    //Поле Телефон лицензиата:

    public void setPhone_ul(String phone_ul) {
        this.phone_ul = phone_ul;
    }

    public String getPhone_ul() {
        return this.phone_ul;
    }

    //Поле Адрес электронной почты лицензиата:

    public void setEmail_ul(String email_ul) {
        this.email_ul = email_ul;
    }

    public String getEmail_ul() {
        return this.email_ul;
    }

    //Поле Электронная копия документа:

    //Поле <html><i>
    //Размещенное ниже поле предназначено для представления электронной копии документа. Электронная копия документа должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br>
    //</i></html>

    public String getDig_result() {
        return dig_result;
    }

    public void setDig_result(String dig_result) {
        this.dig_result = dig_result;
    }

    public void setInn_req(String inn_req) {
        this.inn_req = inn_req;
    }

    public String getInn_req() {
        return this.inn_req;
    }

    public String getJuridical_person_form() {
        return juridical_person_form;
    }

    public void setJuridical_person_form(String juridical_person_form) {
        this.juridical_person_form = juridical_person_form;
    }
}
