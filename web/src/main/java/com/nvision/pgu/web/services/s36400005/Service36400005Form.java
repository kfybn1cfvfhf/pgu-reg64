package com.nvision.pgu.web.services.s36400005;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.util.FileBean;

import java.util.ArrayList;
import java.util.List;

public class Service36400005Form extends AbstractServiceOrderForm {
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
    //Добавить чекбокс "Лицензиат осуществляет деятельность в филиале"
    private String filial;

    //Закладка Сведения о заявителе

    //Поле Сведения о заявителе

    //Поле Фамилия, Имя, Отчество заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String fio;    //Данные из СИА. Недоступно для редактирования

    //Поле Контактный телефон заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String phone;    //Данные из СИА. Доступно для редактирования

    //Поле Адрес электронной почты заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String email;    //Данные из СИА. Доступно для редактирования. Валидатор - email

    //Поле Причина переоформления свидетельства о государственной аккредитации


    private String reason_re;


    private FileBean load_doc0;
    private FileBean load_doc1;
    private FileBean load_doc2;
    private List<FileBean> load_doc3 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean load_doc4;
    private FileBean load_doc5;
    private FileBean load_doc6;
    private FileBean load_doc7;
    private FileBean load_doc8;
    private List<FileBean> load_doc9 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean load_doc10;
    private List<FileBean> load_doc11 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean load_doc12;
    private List<FileBean> load_doc13 = AccessCounterList.createEmpty(FileBean.class);
    private FileBean load_doc14;
    private FileBean load_doc15;


    //Закладка Сведения о заявителе

    //Поле Сведения о заявителе

    //Поле Фамилия, Имя, Отчество заявителя:

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

    public void setReason_re(String reason_re) {
        if (this.reason_re != null && !reason_re.equals(this.reason_re)) {
            this.setLoad_doc0(null);
            this.setLoad_doc1(null);
            this.setLoad_doc2(null);
            this.setLoad_doc3(new ArrayList<FileBean>());
            this.setLoad_doc4(null);
            this.setLoad_doc5(null);
            this.setLoad_doc6(null);
            this.setLoad_doc7(null);
            this.setLoad_doc8(null);
            this.setLoad_doc9(new ArrayList<FileBean>());
            this.setLoad_doc10(null);
            this.setLoad_doc11(new ArrayList<FileBean>());
            this.setLoad_doc12(null);
            this.setLoad_doc13(new ArrayList<FileBean>());
            this.setLoad_doc14(null);
            this.setLoad_doc15(null);
        }
        this.reason_re = reason_re;
    }

    public String getReason_re() {
        return this.reason_re;
    }


    //Закладка Электронные копии документов (продолжение)

    //Поле Заявление образовательного учреждения:

    public void setLoad_doc0(FileBean load_doc0) {
        this.load_doc0 = load_doc0;
    }

    public FileBean getLoad_doc0() {
        return this.load_doc0;
    }

    public FileBean getLoad_doc1() {
        return load_doc1;
    }

    public void setLoad_doc1(FileBean load_doc1) {
        this.load_doc1 = load_doc1;
    }

    public FileBean getLoad_doc2() {
        return load_doc2;
    }

    public void setLoad_doc2(FileBean load_doc2) {
        this.load_doc2 = load_doc2;
    }

    public List<FileBean> getLoad_doc3() {
        return normalize(load_doc3);
    }

    public void setLoad_doc3(List<FileBean> load_doc3) {
        this.load_doc3 = AccessCounterList.decorate(load_doc3, FileBean.class);
    }

    public FileBean getLoad_doc4() {
        return load_doc4;
    }

    public void setLoad_doc4(FileBean load_doc4) {
        this.load_doc4 = load_doc4;
    }

    public FileBean getLoad_doc5() {
        return load_doc5;
    }

    public void setLoad_doc5(FileBean load_doc5) {
        this.load_doc5 = load_doc5;
    }

    public FileBean getLoad_doc6() {
        return load_doc6;
    }

    public void setLoad_doc6(FileBean load_doc6) {
        this.load_doc6 = load_doc6;
    }

    public FileBean getLoad_doc7() {
        return load_doc7;
    }

    public void setLoad_doc7(FileBean load_doc7) {
        this.load_doc7 = load_doc7;
    }

    public FileBean getLoad_doc8() {
        return load_doc8;
    }

    public void setLoad_doc8(FileBean load_doc8) {
        this.load_doc8 = load_doc8;
    }

    public List<FileBean> getLoad_doc9() {
        return normalize(load_doc9);
    }

    public void setLoad_doc9(List<FileBean> load_doc9) {
        this.load_doc9 = AccessCounterList.decorate(load_doc9, FileBean.class);
    }

    public FileBean getLoad_doc10() {
        return load_doc10;
    }

    public void setLoad_doc10(FileBean load_doc10) {
        this.load_doc10 = load_doc10;
    }

    public List<FileBean> getLoad_doc11() {
        return normalize(load_doc11);
    }

    public void setLoad_doc11(List<FileBean> load_doc11) {
        this.load_doc11 = AccessCounterList.decorate(load_doc11, FileBean.class);
    }

    public FileBean getLoad_doc12() {
        return load_doc12;
    }

    public void setLoad_doc12(FileBean load_doc12) {
        this.load_doc12 = load_doc12;
    }

    public List<FileBean> getLoad_doc13() {
        return normalize(load_doc13);
    }

    public void setLoad_doc13(List<FileBean> load_doc13) {
        this.load_doc13 = AccessCounterList.decorate(load_doc13, FileBean.class);
    }

    public FileBean getLoad_doc14() {
        return load_doc14;
    }

    public void setLoad_doc14(FileBean load_doc14) {
        this.load_doc14 = load_doc14;
    }

    public FileBean getLoad_doc15() {
        return load_doc15;
    }

    public void setLoad_doc15(FileBean load_doc15) {
        this.load_doc15 = load_doc15;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

}
