package ru.lanit.samara.pgu.core.util;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.processors.InitRuleProcessor;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.rules.api.RuleRegistry;
import com.nvision.pgu.sp.principal.IPrincipal;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.sp.assertion.IPguAssertion;
import ru.lanit.samara.pgu.sp.assertion.IPguAssertionWrap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PrivateRoomDataContainer extends AbstractServiceOrderForm implements IPrivateRoomDataContainer {

    public static PrivateRoomDataContainer createInstance(IPguAssertionWrap pguAssertionWrap, IPguAssertion pguAssertion, RuleRegistry ruleRegistry) {

        PrivateRoomDataContainer newInstance = new PrivateRoomDataContainer();

        newInstance.setPguAssertion(pguAssertionWrap.getPguAssertion());

        IPrincipal userPrincipal = pguAssertion.getPrincipal();

        Map map = new HashMap();
        map.put(IPrincipal.class.getSimpleName(), userPrincipal);

        InitRuleProcessor<PrivateRoomDataContainer> initRuleProcessor = new InitRuleProcessor<PrivateRoomDataContainer>();
        initRuleProcessor.setRuleRegistry(ruleRegistry);
        initRuleProcessor.process(newInstance, map);

        return newInstance;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String lastName = "";

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String firstName = "";

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String middleName = "";

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
    private Date birthdate;

    @Override
    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHPLACE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String birthplace = "";

    @Override
    public String getBirthplace() {
        return birthplace;
    }

    @Override
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String sex = "";

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SNILS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String snils = "";

    @Override
    public String getSnils() {
        return snils;
    }

    @Override
    public void setSnils(String snils) {
        this.snils = snils;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String identityDocType = "";

    @Override
    public String getIdentityDocType() {
        return identityDocType;
    }

    @Override
    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }
/*
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String identityDocTypeName = "";

    @Override
    public String getIdentityDocTypeName() {
        return identityDocTypeName;
    }

    @Override
    public void setIdentityDocTypeName(String identityDocTypeName) {
        this.identityDocTypeName = identityDocTypeName;
    }
*/
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String passSeria = "";

    @Override
    public String getPassSeria() {
        return passSeria;
    }

    @Override
    public void setPassSeria(String passSeria) {
        this.passSeria = passSeria;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String passNo = "";

    @Override
    public String getPassNo() {
        return passNo;
    }

    @Override
    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERNUM, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String passSerNum;

    @Override
    public String getPassSerNum() {
        return this.passSerNum;
    }

    @Override
    public void setPassSerNum(String passSerNum) {
        this.passSerNum = passSerNum;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String passFrom = "";

    @Override
    public String getPassFrom() {
        return passFrom;
    }

    @Override
    public void setPassFrom(String passFrom) {
        this.passFrom = passFrom;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE)
    private Date passDate;

    @Override
    public Date getPassDate() {
        return passDate;
    }

    @Override
    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String address = "";

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String phone = "";

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String email = "";

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.INN, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String inn = "";

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public void setInn(String inn) {
        this.inn = inn;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressIndex = "";
    @Override
    public String getAddressIndex() {
        return addressIndex;
    }
    @Override
    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRegion = "";
    @Override
    public String getAddressRegion() {
        return addressRegion;
    }
    @Override
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRayon = "";
    @Override
    public String getAddressRayon() {
        return addressRayon;
    }
    @Override
    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CITY_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressCity = "";
    @Override
    public String getAddressCity() {
        return addressCity;
    }
    @Override
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementText = "";
    @Override
    public String getAddressSettlementText() {
        return addressSettlementText;
    }
    @Override
    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementDict = "";
    @Override
    public String getAddressSettlementDict() {
        return addressSettlementDict;
    }
    @Override
    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetText = "";
    @Override
    public String getAddressStreetText() {
        return addressStreetText;
    }
    @Override
    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_STREET_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetDict = "";
    @Override
    public String getAddressStreetDict() {
        return addressStreetDict;
    }
    @Override
    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressHouse = "";
    @Override
    public String getAddressHouse() {
        return addressHouse;
    }
    @Override
    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressKorpus = "";
    @Override
    public String getAddressKorpus() {
        return addressKorpus;
    }
    @Override
    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressFlat = "";
    @Override
    public String getAddressFlat() {
        return addressFlat;
    }
    @Override
    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }



}





















