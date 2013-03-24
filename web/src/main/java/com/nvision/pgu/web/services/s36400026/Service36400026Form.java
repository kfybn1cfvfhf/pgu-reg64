package com.nvision.pgu.web.services.s36400026;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.annotations.JsonArrayToList;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400026Form extends AbstractServiceOrderForm {


    //Закладка Основные сведения

    //Поле Укажите данные об организации

    //Поле Наименование организации


    private String brandName;    //

    //Поле Дата регистрации ЕГРЮЛ/ЕГРИП


    private Date ogrnDate;    //дата в прошлом

    //Поле ОГРН


    private String ogrn;    //Либо ОГРН ЮЛ либо ОГРН ИП

    //Поле Организационно-правовая форма


    private String orgFormCode;    //

    //Поле Форма собственности


    private String ownershipCode;    //

    //Поле Вид экономической деятельности (по ОКВЭД)


    private String okvedCode;    //


    //Закладка Контактная информация

    //Поле Контактная информация

    //Поле Ф.И.О.

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIO)
    private String decName;    //

    //Поле Должность


    private String decProf;    //

    //Поле Телефон

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
    private String decMobilePhone;    //

    //Поле Факс


    private String decFax;    //

    //Поле E-mail

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
    private String decEmail;    //

    //Поле Юридический адрес

    //Поле Индекс


    private String adrPostalCode = "";    //

    //Поле Регион


    private String adrOKATO = "";    //

    //Поле Район


    private String adrLocality = "";    //

    //Поле Город


    private String adrCity = "";    //

    //Поле Улица


    private String adrStreet = "";    //

    //Поле Дом


    private String adrHouse = "";    //

    //Поле Корпус


    private String adrBuilding = "";    //

    //Поле Квартира


    private String adrFlat = "";    //

    //Поле Фактический адрес

    //Поле Совпадение адресов


    private String addrIdentical = "off";    //

    //Поле Индекс


    private String fAdrPostalCode;    //

    //Поле Регион


    private String fAdrOKATO;    //Передаем DICITEM_EXTCODE

    //Поле Район


    private String fAdrLocality;    //

    //Поле Город


    private String fAdrCity;    //

    //Поле Улица


    private String fAdrStreet;    //

    //Поле Дом


    private String fAdrHouse;    //

    //Поле Корпус


    private String fAdrBuilding;    //

    //Поле Квартира


    private String fAdrFlat;    //

    //Поле Подбор центра

    //Поле Выберите центр занятости населения для получения данной услуги


    private String czn;    //Передаем DICITEM_EXTCODE


    //Закладка Дополнительно

    //Поле Дополнительные сведения о юридическом лице

    //Поле Численность работников


    private String workers;    //> 0

    //Поле Уволено в году


    private String discharge;    //>= 0

    //Поле Количество рабочих мест


    private String workersCount;    //>= Численность работников

    //Поле Соц.пакет
    @JsonArrayToList
    private String socialPacket;

    //Поле Укажите способ размещения вакансий

    //Поле Разместить в банке вакансия

    @JsonArrayToList
    private String bankVacan;    //

    //Поле В БВ на территориальном уровне


    private String placement1;    //

    //Поле В БВ на межтерриториальном уровне


    private String placement2;    //

    //Поле В БВ на федеральном уровне


    private String placement3;    //

    //Поле В сети интернет


    private String placement4;    //

    //Поле В средствах массовой информации


    private String placement5;    //

    //Поле На стэндах


    private String placement6;    //

    //Поле На ярмарках вакансий


    private String placement7;    //

    //Поле Согласен на участие в следующих мероприятиях акивной политики занятости (выбрать нужное)

    //Поле Участвовать в ярмарках


    private String active_Actions;    //

    //Поле Участвовать в опл. общ. работах


    private String active_Actions1;    //

    //Поле Участвовать во временном трудоустройстве


    private String active_Actions2;    //

    //Поле Участвовать в первичном трудоустройстве


    private String active_Actions3;    //

    //Поле Участвовать во вр.трудоустройстве безработных


    private String active_Actions4;    //


    //Закладка Сведения о вакансиях

    //Поле Сведения о вакансиях предприятия

    //Поле Профессия


    private List<String> prof = AccessCounterList.createEmpty(String.class);  //

    //Поле Квалификация


    private List<String> kval = AccessCounterList.createEmpty(String.class);  //

    //Поле Разряд


    private List<String> razrjad = AccessCounterList.createEmpty(String.class);  //

    //Поле Количество мест


    private List<String> countVacancy = AccessCounterList.createEmpty(String.class);  //

    //Поле Система оплаты


    private List<String> systOplat = AccessCounterList.createEmpty(String.class);  //

    //Поле Минимальная зарплата


    private List<String> srZarplat = AccessCounterList.createEmpty(String.class);  //

    //Поле Максимальная зарплата


    private List<String> maxZarplat = AccessCounterList.createEmpty(String.class);  //

    //Поле Характер работы


    private List<String> workType = AccessCounterList.createEmpty(String.class);  //

    //Поле Режим работы


    private List<String> workRegim = AccessCounterList.createEmpty(String.class);  //

    //Поле Условия труда


    private List<String> workExtrim = AccessCounterList.createEmpty(String.class);  //

    //Поле Начало работы


    private List<String> workBeginTime = AccessCounterList.createEmpty(String.class);  //

    //Поле Окончание работы


    private List<String> workEndTime = AccessCounterList.createEmpty(String.class);  //

    //Поле Соц.льготы

    @JsonArrayToList
    private List<String> workSocial = AccessCounterList.createEmpty(String.class);  //

    //Поле Карточка требований к соискателю

    //Поле Образование


    private List<String> education = AccessCounterList.createEmpty(String.class);  //

    //Поле Специальность


    private List<String> specifikation = AccessCounterList.createEmpty(String.class);  //

    //Поле Минимальный стаж


    private List<String> profStage = AccessCounterList.createEmpty(String.class);  //

    //Поле Минимальный возраст


    private List<String> miniAge = AccessCounterList.createEmpty(String.class);  //

    //Поле Максимальный возраст


    private List<String> maxAge = AccessCounterList.createEmpty(String.class);  //

    //Поле Пол


    private List<String> pol = AccessCounterList.createEmpty(String.class);  //

    //Поле Дополнительные требования


    private List<String> dopWorkersParametrs = AccessCounterList.createEmpty(String.class);  //


    private String driveway;

    //Закладка Основные сведения

    //Поле Укажите данные об организации

    //Поле Наименование организации

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    //Поле Дата регистрации ЕГРЮЛ/ЕГРИП

    public void setOgrnDate(Date ogrnDate) {
        this.ogrnDate = ogrnDate;
    }

    public Date getOgrnDate() {
        return this.ogrnDate;
    }

    //Поле ОГРН

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOgrn() {
        return this.ogrn;
    }

    //Поле Организационно-правовая форма

    public void setOrgFormCode(String orgFormCode) {
        this.orgFormCode = orgFormCode;
    }

    public String getOrgFormCode() {
        return this.orgFormCode;
    }

    //Поле Форма собственности

    public void setOwnershipCode(String ownershipCode) {
        this.ownershipCode = ownershipCode;
    }

    public String getOwnershipCode() {
        return this.ownershipCode;
    }

    //Поле Вид экономической деятельности (по ОКВЭД)

    public void setOkvedCode(String okvedCode) {
        this.okvedCode = okvedCode;
    }

    public String getOkvedCode() {
        return this.okvedCode;
    }


    //Закладка Контактная информация

    //Поле Контактная информация

    //Поле Ф.И.О.

    public void setDecName(String decName) {
        this.decName = decName;
    }

    public String getDecName() {
        return this.decName;
    }

    //Поле Должность

    public void setDecProf(String decProf) {
        this.decProf = decProf;
    }

    public String getDecProf() {
        return this.decProf;
    }

    //Поле Телефон

    public void setDecMobilePhone(String decMobilePhone) {
        this.decMobilePhone = decMobilePhone;
    }

    public String getDecMobilePhone() {
        return this.decMobilePhone;
    }

    //Поле Факс

    public void setDecFax(String decFax) {
        this.decFax = decFax;
    }

    public String getDecFax() {
        return this.decFax;
    }

    //Поле E-mail

    public void setDecEmail(String decEmail) {
        this.decEmail = decEmail;
    }

    public String getDecEmail() {
        return this.decEmail;
    }

    //Поле Юридический адрес

    //Поле Индекс

    public void setAdrPostalCode(String adrPostalCode) {
        this.adrPostalCode = adrPostalCode;
    }

    public String getAdrPostalCode() {
        return this.adrPostalCode;
    }

    //Поле Регион

    public void setAdrOKATO(String adrOKATO) {
        this.adrOKATO = adrOKATO;
    }

    public String getAdrOKATO() {
        return this.adrOKATO;
    }

    //Поле Район

    public void setAdrLocality(String adrLocality) {
        this.adrLocality = adrLocality;
    }

    public String getAdrLocality() {
        return this.adrLocality;
    }

    //Поле Город

    public void setAdrCity(String adrCity) {
        this.adrCity = adrCity;
    }

    public String getAdrCity() {
        return this.adrCity;
    }

    //Поле Улица

    public void setAdrStreet(String adrStreet) {
        this.adrStreet = adrStreet;
    }

    public String getAdrStreet() {
        return this.adrStreet;
    }

    //Поле Дом

    public void setAdrHouse(String adrHouse) {
        this.adrHouse = adrHouse;
    }

    public String getAdrHouse() {
        return this.adrHouse;
    }

    //Поле Корпус

    public void setAdrBuilding(String adrBuilding) {
        this.adrBuilding = adrBuilding;
    }

    public String getAdrBuilding() {
        return this.adrBuilding;
    }

    //Поле Квартира

    public void setAdrFlat(String adrFlat) {
        this.adrFlat = adrFlat;
    }

    public String getAdrFlat() {
        return this.adrFlat;
    }

    //Поле Фактический адрес

    //Поле Совпадение адресов

    public void setAddrIdentical(String addrIdentical) {
        this.addrIdentical = addrIdentical;
    }

    public String getAddrIdentical() {
        return this.addrIdentical;
    }

    //Поле Индекс

    public void setFAdrPostalCode(String fAdrPostalCode) {
        this.fAdrPostalCode = fAdrPostalCode;
    }

    public String getFAdrPostalCode() {
        return this.fAdrPostalCode;
    }

    //Поле Регион

    public void setFAdrOKATO(String fAdrOKATO) {
        this.fAdrOKATO = fAdrOKATO;
    }

    public String getFAdrOKATO() {
        return this.fAdrOKATO;
    }

    //Поле Район

    public void setFAdrLocality(String fAdrLocality) {
        this.fAdrLocality = fAdrLocality;
    }

    public String getFAdrLocality() {
        return this.fAdrLocality;
    }

    //Поле Город

    public void setFAdrCity(String fAdrCity) {
        this.fAdrCity = fAdrCity;
    }

    public String getFAdrCity() {
        return this.fAdrCity;
    }

    //Поле Улица

    public void setFAdrStreet(String fAdrStreet) {
        this.fAdrStreet = fAdrStreet;
    }

    public String getFAdrStreet() {
        return this.fAdrStreet;
    }

    //Поле Дом

    public void setFAdrHouse(String fAdrHouse) {
        this.fAdrHouse = fAdrHouse;
    }

    public String getFAdrHouse() {
        return this.fAdrHouse;
    }

    //Поле Корпус

    public void setFAdrBuilding(String fAdrBuilding) {
        this.fAdrBuilding = fAdrBuilding;
    }

    public String getFAdrBuilding() {
        return this.fAdrBuilding;
    }

    //Поле Квартира

    public void setFAdrFlat(String fAdrFlat) {
        this.fAdrFlat = fAdrFlat;
    }

    public String getFAdrFlat() {
        return this.fAdrFlat;
    }

    //Поле Подбор центра

    //Поле Выберите центр занятости населения для получения данной услуги

    public void setCzn(String czn) {
        this.czn = czn;
    }

    public String getCzn() {
        return this.czn;
    }


    //Закладка Дополнительно

    //Поле Дополнительные сведения о юридическом лице

    //Поле Численность работников

    public void setWorkers(String workers) {
        this.workers = workers;
    }

    public String getWorkers() {
        return this.workers;
    }

    //Поле Уволено в году

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    public String getDischarge() {
        return this.discharge;
    }

    //Поле Количество рабочих мест

    public void setWorkersCount(String workersCount) {
        this.workersCount = workersCount;
    }

    public String getWorkersCount() {
        return this.workersCount;
    }

    //Поле Соц.пакет

    public void setSocialPacket(String socialPacket) {
        this.socialPacket = socialPacket;
    }

    public String getSocialPacket() {
        return this.socialPacket;
    }

    //Поле Укажите способ размещения вакансий

    //Поле Разместить в банке вакансия

    public void setBankVacan(String bankVacan) {
        this.bankVacan = bankVacan;
    }

    public String getBankVacan() {
        return this.bankVacan;
    }

    //Поле В БВ на территориальном уровне

    public void setPlacement1(String placement1) {
        this.placement1 = placement1;
    }

    public String getPlacement1() {
        return this.placement1;
    }

    //Поле В БВ на межтерриториальном уровне

    public void setPlacement2(String placement2) {
        this.placement2 = placement2;
    }

    public String getPlacement2() {
        return this.placement2;
    }

    //Поле В БВ на федеральном уровне

    public void setPlacement3(String placement3) {
        this.placement3 = placement3;
    }

    public String getPlacement3() {
        return this.placement3;
    }

    //Поле В сети интернет

    public void setPlacement4(String placement4) {
        this.placement4 = placement4;
    }

    public String getPlacement4() {
        return this.placement4;
    }

    //Поле В средствах массовой информации

    public void setPlacement5(String placement5) {
        this.placement5 = placement5;
    }

    public String getPlacement5() {
        return this.placement5;
    }

    //Поле На стэндах

    public void setPlacement6(String placement6) {
        this.placement6 = placement6;
    }

    public String getPlacement6() {
        return this.placement6;
    }

    //Поле На ярмарках вакансий

    public void setPlacement7(String placement7) {
        this.placement7 = placement7;
    }

    public String getPlacement7() {
        return this.placement7;
    }

    //Поле Согласен на участие в следующих мероприятиях акивной политики занятости (выбрать нужное)

    //Поле Участвовать в ярмарках

    public void setActive_Actions(String active_Actions) {
        this.active_Actions = active_Actions;
    }

    public String getActive_Actions() {
        return this.active_Actions;
    }

    //Поле Участвовать в опл. общ. работах

    public void setActive_Actions1(String active_Actions1) {
        this.active_Actions1 = active_Actions1;
    }

    public String getActive_Actions1() {
        return this.active_Actions1;
    }

    //Поле Участвовать во временном трудоустройстве

    public void setActive_Actions2(String active_Actions2) {
        this.active_Actions2 = active_Actions2;
    }

    public String getActive_Actions2() {
        return this.active_Actions2;
    }

    //Поле Участвовать в первичном трудоустройстве

    public void setActive_Actions3(String active_Actions3) {
        this.active_Actions3 = active_Actions3;
    }

    public String getActive_Actions3() {
        return this.active_Actions3;
    }

    //Поле Участвовать во вр.трудоустройстве безработных

    public void setActive_Actions4(String active_Actions4) {
        this.active_Actions4 = active_Actions4;
    }

    public String getActive_Actions4() {
        return this.active_Actions4;
    }


    //Закладка Сведения о вакансиях

    //Поле Сведения о вакансиях предприятия

    //Поле Профессия

    public void setProf(List<String> prof) {
        this.prof = AccessCounterList.decorate(prof, String.class);
    }

    public List<String> getProf() {
        return normalize(this.prof);
    }

    //Поле Квалификация

    public void setKval(List<String> kval) {
        this.kval = AccessCounterList.decorate(kval, String.class);
    }

    public List<String> getKval() {
        return normalize(this.kval);
    }

    //Поле Разряд

    public void setRazrjad(List<String> razrjad) {
        this.razrjad = AccessCounterList.decorate(razrjad, String.class);
    }

    public List<String> getRazrjad() {
        return normalize(this.razrjad);
    }

    //Поле Количество мест

    public void setCountVacancy(List<String> countVacancy) {
        this.countVacancy = AccessCounterList.decorate(countVacancy, String.class);
    }

    public List<String> getCountVacancy() {
        return normalize(this.countVacancy);
    }

    //Поле Система оплаты

    public void setSystOplat(List<String> systOplat) {
        this.systOplat = AccessCounterList.decorate(systOplat, String.class);
    }

    public List<String> getSystOplat() {
        return normalize(this.systOplat);
    }

    //Поле Минимальная зарплата

    public void setSrZarplat(List<String> srZarplat) {
        this.srZarplat = AccessCounterList.decorate(srZarplat, String.class);
    }

    public List<String> getSrZarplat() {
        return normalize(this.srZarplat);
    }

    //Поле Максимальная зарплата

    public void setMaxZarplat(List<String> maxZarplat) {
        this.maxZarplat = AccessCounterList.decorate(maxZarplat, String.class);
    }

    public List<String> getMaxZarplat() {
        return normalize(this.maxZarplat);
    }

    //Поле Характер работы

    public void setWorkType(List<String> workType) {
        this.workType = AccessCounterList.decorate(workType, String.class);
    }

    public List<String> getWorkType() {
        return normalize(this.workType);
    }

    //Поле Режим работы

    public void setWorkRegim(List<String> workRegim) {
        this.workRegim = AccessCounterList.decorate(workRegim, String.class);
    }

    public List<String> getWorkRegim() {
        return normalize(this.workRegim);
    }

    //Поле Условия труда

    public void setWorkExtrim(List<String> workExtrim) {
        this.workExtrim = AccessCounterList.decorate(workExtrim, String.class);
    }

    public List<String> getWorkExtrim() {
        return normalize(this.workExtrim);
    }

    //Поле Начало работы

    public void setWorkBeginTime(List<String> workBeginTime) {
        this.workBeginTime = AccessCounterList.decorate(workBeginTime, String.class);
    }

    public List<String> getWorkBeginTime() {
        return normalize(this.workBeginTime);
    }

    //Поле Окончание работы

    public void setWorkEndTime(List<String> workEndTime) {
        this.workEndTime = AccessCounterList.decorate(workEndTime, String.class);
    }

    public List<String> getWorkEndTime() {
        return normalize(this.workEndTime);
    }

    //Поле Соц.льготы

    public void setWorkSocial(List<String> workSocial) {
        this.workSocial = AccessCounterList.decorate(workSocial, String.class);
    }

    public List<String> getWorkSocial() {
        return normalize(this.workSocial);
    }

    //Поле Карточка требований к соискателю

    //Поле Образование

    public void setEducation(List<String> education) {
        this.education = AccessCounterList.decorate(education, String.class);
    }

    public List<String> getEducation() {
        return normalize(this.education);
    }

    //Поле Специальность

    public void setSpecifikation(List<String> specifikation) {
        this.specifikation = AccessCounterList.decorate(specifikation, String.class);
    }

    public List<String> getSpecifikation() {
        return normalize(this.specifikation);
    }

    //Поле Минимальный стаж

    public void setProfStage(List<String> profStage) {
        this.profStage = AccessCounterList.decorate(profStage, String.class);
    }

    public List<String> getProfStage() {
        return normalize(this.profStage);
    }

    //Поле Минимальный возраст

    public void setMiniAge(List<String> miniAge) {
        this.miniAge = AccessCounterList.decorate(miniAge, String.class);
    }

    public List<String> getMiniAge() {
        return normalize(this.miniAge);
    }

    //Поле Максимальный возраст

    public void setMaxAge(List<String> maxAge) {
        this.maxAge = AccessCounterList.decorate(maxAge, String.class);
    }

    public List<String> getMaxAge() {
        return normalize(this.maxAge);
    }

    //Поле Пол

    public void setPol(List<String> pol) {
        this.pol = AccessCounterList.decorate(pol, String.class);
    }

    public List<String> getPol() {
        return normalize(this.pol);
    }

    //Поле Дополнительные требования

    public void setDopWorkersParametrs(List<String> dopWorkersParametrs) {
        this.dopWorkersParametrs = AccessCounterList.decorate(dopWorkersParametrs, String.class);
    }

    public List<String> getDopWorkersParametrs() {
        return normalize(this.dopWorkersParametrs);
    }

    public String getDriveway() {
        return driveway;
    }

    public void setDriveway(String driveway) {
        this.driveway = driveway;
    }
}
