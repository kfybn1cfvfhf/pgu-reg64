package com.nvision.pgu.web.services.s36400004;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;

import java.util.List;

public class Service36400004Form extends AbstractServiceOrderForm {

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

    //Добавить чекбокс "Лицензиат обращается за разрешением на осуществление деятельности в филиале"
    private String filial;

//Закладка Сведения о заявителе

    //Поле Личные данные и контакты заявителя

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio;    //Данные из СИА. Недоступно для редактирования

    //Поле Контактный телефон заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone;    //Данные из СИА. Доступно для редактирования. Значение валидируется по маске: (N)К, где N = 0..9, количество цифр, не более 5-ти, К = 0..9, количество цифр не более 7

    //Поле Адрес электронной почты заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email;    //Данные из СИА. Доступно для редактирования. Валидатор - email

//Закладка Электронные копии документов

    //Поле Заявление образовательного учреждения:


    private FileBean load_doc0;    //

    //Поле Копия устава образовательного учреждения:


    private FileBean load_doc1;    //

    //Поле Копия положения о филиале образовательного учреждения (в случае проведения государственной аккредитации в отношении филиала, а так же в случае установления иного государственного статуса образовательного учреждения в течение срока действия свидетельства о государственной аккредитации):


    private FileBean load_doc2;    //

    //Поле Отчет о результатах самообследования образовательного учреждения:


    private List<FileBean> load_doc3 = AccessCounterList.createEmpty(FileBean.class);    //

    //Поле Копии учебных планов образовательного учреждения по всем образовательным программам, заявленным для государственной аккредитации:


    private List<FileBean> load_doc4 = AccessCounterList.createEmpty(FileBean.class);    //Поле прикрепления файла клонируется по кнопке «Добавить»


    //Поле Добавить


    //Поле Копии документа, подтверждающего наличие лицензии на осуществление образовательной деятельности, с приложением (приложениями), а так же свидетельства о государственной аккредитации с приложением (приложениями) (если указанные документы выданы иным лицензирующим или аккредитационным органом):

    private List<FileBean> load_doc6 = AccessCounterList.createEmpty(FileBean.class);

//Закладка Сведения о заявителе

    //Поле Личные данные и контакты заявителя

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return this.fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Закладка Электронные копии документов

    //Поле Электронные копии документов.

    //Поле Заявление образовательного учреждения:

    public void setLoad_doc0(FileBean load_doc0) {
        this.load_doc0 = load_doc0;
    }

    public FileBean getLoad_doc0() {
        return this.load_doc0;
    }

    //Поле Копия устава образовательного учреждения:

    public void setLoad_doc1(FileBean load_doc1) {
        this.load_doc1 = load_doc1;
    }

    public FileBean getLoad_doc1() {
        return this.load_doc1;
    }

    //Поле Копия положения о филиале образовательного учреждения (в случае проведения государственной аккредитации в отношении филиала, а так же в случае установления иного государственного статуса образовательного учреждения в течение срока действия свидетельства о государственной аккредитации):

    public void setLoad_doc2(FileBean load_doc2) {
        this.load_doc2 = load_doc2;
    }

    public FileBean getLoad_doc2() {
        return this.load_doc2;
    }

    //Поле Отчет о результатах самообследования образовательного учреждения:

    public void setLoad_doc3(List<FileBean> load_doc3) {
        this.load_doc3 = AccessCounterList.decorate(load_doc3, FileBean.class);
    }

    public List<FileBean> getLoad_doc3() {
        return normalize(this.load_doc3);
    }

    //Поле Копии учебных планов образовательного учреждения по всем образовательным программам, заявленным для государственной аккредитации:

    public void setLoad_doc4(List<FileBean> load_doc4) {
        this.load_doc4 = AccessCounterList.decorate(load_doc4, FileBean.class);
    }

    public List<FileBean> getLoad_doc4() {
        return normalize(this.load_doc4);
    }

    public void setLoad_doc6(List<FileBean> load_doc6) {
        this.load_doc6 = AccessCounterList.decorate(load_doc6, FileBean.class);
    }

    public List<FileBean> getLoad_doc6() {
        return normalize(this.load_doc6);
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }
}
