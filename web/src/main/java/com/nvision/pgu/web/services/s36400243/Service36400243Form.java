package com.nvision.pgu.web.services.s36400243;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400243Form extends AbstractServiceOrderForm {
    // Закладка Сведения о работодателе

    // Поле Полное наименование юридического лица:


    private String org_name; //

    // Поле Организационно-правовая форма:


    private String opf; //

    // Поле ОГРН:


    private String ogrn; // В строку можно ввести только строку следующего формата: «ххххххххххххххх», где х=0…9, т.е. 13 цифр

    // Поле ИНН:


    private String inn; // В строку можно ввести только строку следующего формата: «хххххххххххх», где х=0…9, т.е. 10 цифр

    // Поле Форма собственности:


    private String ownership; //

    // Поле Вид экономической деятельности (по ОКВЭД):


    private String okved; //

    // Поле Ф.И.О. руководителя:


    private String boss_name; //

    // Поле Контактный телефон руководителя:


    private String boss_phone; //

    // Закладка Контактная информация

    // Поле Ф.И.О заявителя:

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String dec_name; // Недоступно для редактирования. Данные из СИА

    // Поле Должность заявителя:


    private String dec_position; //

    // Поле Телефон заявителя:


    private String tel; //

    // Поле Адрес электронной почты заявителя:


    private String mail; // Значение должно валидироваться по маске электронной почты: x@x.x

    // Поле Адрес юридического лица по учредительным документам

    // Поле Индекс:


    private String addr_index_doc; //

    // Поле Регион/Область:


    private String commonAddress; //

    // Поле Улица:


    private String addr_ul_doc; // Содержимое поля #street  выбирается из справочника КЛАДР в соответствии с Город/Населенный пункт.

    // Поле Дом:


    private String addr_dom_doc; //

    // Поле Корпус (строение):


    private String addr_korp_doc; //

    // Поле Фактический адрес юридического лица

    // Поле Фактический адрес юридического лица совпадает с адресом по учредительным документам?


    private String coincidenc_adress; //

    // Поле Индекс:


    private String addr_index; // Доступность поля и его значение зависят от флага #coincidenc_adress

    // Поле Регион/Область:


    private String fcommonAddress; // Доступность поля и его значение зависят от флага #coincidenc_adress

    // Поле Улица:


    private String addr_ul; // Содержимое поля #fstreet выбирается из справочника КЛАДР в соответствии с Город/Населенный пункт..

//  Доступность поля и его значение зависят от флага #coincidenc_adress
//  
//  Доступность поля и его значение зависят от флага #coincidenc_adress

    // Поле Дом:


    private String addr_dom; // Доступность поля и его значение зависят от флага #coincidenc_adress

    // Поле Корпус (строение):


    private String addr_korp; // Доступность поля и его значение зависят от флага #coincidenc_adress

    // Поле Выберите район для получения услуги:


    private String raion; // Выбирается из справочника КЛАДР в соответствии с Регион/Область

    // Закладка Требования к работнику

    // Поле Требования к работнику

    // Поле Образование (не ниже):


    private String education;

    // Поле Профессия (должность):


    private String spec;
    // Поле Квалификационный разряд, категория:


    private String category;

    // Поле Стаж работы (не менее):


    private String experience;

    // Поле Минимальный возраст:


    private String min_age;

    // Поле Максимальный возраст:


    private String max_age;

    // Поле Пол:


    private String sex;


    public String getAddr_dom() {
        return addr_dom;
    }

    public void setAddr_dom(String addr_dom) {
        this.addr_dom = addr_dom;
    }

    public String getAddr_dom_doc() {
        return addr_dom_doc;
    }

    public void setAddr_dom_doc(String addr_dom_doc) {
        this.addr_dom_doc = addr_dom_doc;
    }

    public String getAddr_index() {
        return addr_index;
    }

    public void setAddr_index(String addr_index) {
        this.addr_index = addr_index;
    }

    public String getAddr_index_doc() {
        return addr_index_doc;
    }

    public void setAddr_index_doc(String addr_index_doc) {
        this.addr_index_doc = addr_index_doc;
    }

    public String getAddr_korp() {
        return addr_korp;
    }

    public void setAddr_korp(String addr_korp) {
        this.addr_korp = addr_korp;
    }

    public String getAddr_korp_doc() {
        return addr_korp_doc;
    }

    public void setAddr_korp_doc(String addr_korp_doc) {
        this.addr_korp_doc = addr_korp_doc;
    }

    public String getAddr_ul() {
        return addr_ul;
    }

    public void setAddr_ul(String addr_ul) {
        this.addr_ul = addr_ul;
    }

    public String getAddr_ul_doc() {
        return addr_ul_doc;
    }

    public void setAddr_ul_doc(String addr_ul_doc) {
        this.addr_ul_doc = addr_ul_doc;
    }

    public String getBoss_name() {
        return boss_name;
    }

    public void setBoss_name(String boss_name) {
        this.boss_name = boss_name;
    }

    public String getBoss_phone() {
        return boss_phone;
    }

    public void setBoss_phone(String boss_phone) {
        this.boss_phone = boss_phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCoincidenc_adress() {
        return coincidenc_adress;
    }

    public void setCoincidenc_adress(String coincidenc_adress) {
        this.coincidenc_adress = coincidenc_adress;
    }

    public String getDec_name() {
        return dec_name;
    }

    public void setDec_name(String dec_name) {
        this.dec_name = dec_name;
    }

    public String getDec_position() {
        return dec_position;
    }

    public void setDec_position(String dec_position) {
        this.dec_position = dec_position;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMax_age() {
        return max_age;
    }

    public void setMax_age(String max_age) {
        this.max_age = max_age;
    }

    public String getMin_age() {
        return min_age;
    }

    public void setMin_age(String min_age) {
        this.min_age = min_age;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOkved() {
        return okved;
    }

    public void setOkved(String okved) {
        this.okved = okved;
    }

    public String getOpf() {
        return opf;
    }

    public void setOpf(String opf) {
        this.opf = opf;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getRaion() {
        return raion;
    }

    public void setRaion(String raion) {
        this.raion = raion;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCommonAddress() {
        return commonAddress;
    }

    public void setCommonAddress(String commonAddress) {
        this.commonAddress = commonAddress;
    }

    public String getFcommonAddress() {
        return fcommonAddress;
    }

    public void setFcommonAddress(String fcommonAddress) {
        this.fcommonAddress = fcommonAddress;
    }
}