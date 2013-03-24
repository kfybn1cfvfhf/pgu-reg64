package com.nvision.pgu.web.services.s36400158;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400158Form extends AbstractServiceOrderForm {


    public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setEmail("");
        this.setIdentityDocType("");
        this.setOtherDocTypeName("");
        this.setPassDate(null);
        this.setPassFrom("");
        this.setPassNo("");
        this.setPassSeria("");


        this.setAddressIndex("");
        this.setAddressRegion("");
        this.setAddressRayon("");
        this.setAddressCity("");
        this.setAddressSettlementText("");
        this.setAddressSettlementDict("");
        this.setAddressStreetText("");
        this.setAddressStreetDict("");
        this.setAddressHouse("");
        this.setAddressKorpus("");
        this.setAddressFlat("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {

        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType("");
        this.setOtherDocTypeName("");
        this.setPassDate(null);
        this.setPassFrom("");
        this.setPassNo("");
        this.setPassSeria("");

        this.setAddressIndex(privateRoomDataContainer.getAddressIndex());
        this.setAddressRegion(privateRoomDataContainer.getAddressRegion());
        this.setAddressRayon(privateRoomDataContainer.getAddressRayon());
        this.setAddressCity(privateRoomDataContainer.getAddressCity());
        this.setAddressSettlementText(privateRoomDataContainer.getAddressSettlementText());
        this.setAddressSettlementDict(privateRoomDataContainer.getAddressSettlementDict());
        this.setAddressStreetText(privateRoomDataContainer.getAddressStreetText());
        this.setAddressStreetDict(privateRoomDataContainer.getAddressStreetDict());
        this.setAddressHouse(privateRoomDataContainer.getAddressHouse());
        this.setAddressKorpus(privateRoomDataContainer.getAddressKorpus());
        this.setAddressFlat(privateRoomDataContainer.getAddressFlat());
    }

			private String dov_enable;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.LASTNAME)
			private String dovLastName;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.FIRSTNAME)
			private String dovFirstName;
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.MIDDLENAME)
			private String dovMiddleName;
			private String dovPlace;
			private Date dovDate;
			private String dovSeria;
			private String dovNumber;
			private String dovRegNumber;
			private String dovIdentityDocType;
			private String dovOtherDocTypeName;
			private String dovPassSeria;
			private String dovPassNo;
			private Date dovPassDate;
			private String dovPassFrom;
			private FileBean dovDovLoad;
			private FileBean dovPasLoad;
			private String lastName;
			private String firstName;
			private String middleName;

			
			private String addressCountry="643";
			private String addressIndex;
			private String addressEnterType;
			private String addressRegion;
			private String addressRayon;
			private String addressSettlementType="1";
			private String addressCity;
			private String addressSettlementText;
			private String addressSettlementDict;
			private String addressStreetText;
			private String addressStreetDict;
			private String addressHouse;
			private String addressKorpus;
			private String addressFlat;
            private String addressCountryCode = "ru";
            private String addressCountryInput;
            private String addressCountrySettlement;


			private String addressSeatCountry="643";
			private String addressSeatIndex;
			private String addressSeatEnterType;
			private String addressSeatRegion;
			private String addressSeatRayon;
			private String addressSeatSettlementType="1";
			private String addressSeatCity;
			private String addressSeatSettlementText;
			private String addressSeatSettlementDict;
			private String addressSeatStreetText;
			private String addressSeatStreetDict;
			private String addressSeatHouse;
			private String addressSeatKorpus;
			private String addressSeatFlat;
            private String addressSeatCountryCode = "ru";
            private String addressSeatCountryInput;
            private String addressSeatCountrySettlement;


			private String phone;
			private String email;
			private String identityDocType;
			private String otherDocTypeName;
			private String passSeria;
			private String passNo;
			private Date passDate;
			private String passFrom;
			private FileBean identityDocLoad;
			private FileBean surnameDocLoad;
			private String documentAgree;
			private String eduLastName;
			private String eduFirstName;
			private String eduMiddleName;
			private String kindAttestat;
			private String eduSeria;
			private String eduNumber;
			private String eduFrom;
			private Date eduDate;
			private String regNum;
			private String apostil;
			private String wayObtain;


			private String addressPostCountryBenefit="643";
			private String addressPostIndexBenefit;
			private String addressPostEnterTypeBenefit;
			private String addressPostRegionBenefit;
			private String addressPostRayonBenefit;
			private String addressPostSettlementTypeBenefit="1";
			private String addressPostCityBenefit;
			private String addressPostSettlementTextBenefit;
			private String addressPostSettlementDictBenefit;
			private String addressPostStreetTextBenefit;
			private String addressPostStreetDictBenefit;
			private String addressPostHouseBenefit;
			private String addressPostKorpusBenefit;
			private String addressPostFlatBenefit;
            private String addressPostCountryCodeBenefit = "ru";
            private String addressPostCountryInputBenefit;
            private String addressPostCountrySettlementBenefit;

			
			private String agreeCh;
			private String agree1Ch;
			private FileBean eduDocLoad;
			private FileBean edu1DocLoad;
			private FileBean apostilDocLoad;
			 private Boolean dov_enable_changed = true;

            public Boolean getDov_enable_changed() {
                return dov_enable_changed;
            }

            public void setDov_enable_changed(Boolean dov_enable_changed) {
                this.dov_enable_changed = dov_enable_changed;
            }


			 public void setDov_enable(String dov_enable) {
                // если пользователь изменил тип заявителя, поднимаем соответствующий флаг
                if (this.dov_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
                    if (dov_enable == null) {  // с вэб-формы пришёл off
                        if (!"off".equals(this.getDov_enable())) { // ... а в форме сохранён on
                            this.setDov_enable_changed(true);
                        }
                        this.dov_enable = "off";
                    } else {
                        if (!this.getDov_enable().equals(dov_enable)){
                            this.setDov_enable_changed(true);
                        }
                        this.dov_enable = dov_enable;
                    }
                } else {
                    this.dov_enable = dov_enable;
                }
            }

            public String getDov_enable() {
                return this.dov_enable == null ? "off" : this.dov_enable;
            }


    public String getDovLastName() {
        return dovLastName;
    }

    public void setDovLastName(String dovLastName) {
        this.dovLastName = dovLastName;
    }

    public String getDovFirstName() {
        return dovFirstName;
    }

    public void setDovFirstName(String dovFirstName) {
        this.dovFirstName = dovFirstName;
    }

    public String getDovMiddleName() {
        return dovMiddleName;
    }

    public void setDovMiddleName(String dovMiddleName) {
        this.dovMiddleName = dovMiddleName;
    }

    public String getDovPlace() {
        return dovPlace;
    }

    public void setDovPlace(String dovPlace) {
        this.dovPlace = dovPlace;
    }

    public Date getDovDate() {
        return dovDate;
    }

    public void setDovDate(Date dovDate) {
        this.dovDate = dovDate;
    }

    public String getDovSeria() {
        return dovSeria;
    }

    public void setDovSeria(String dovSeria) {
        this.dovSeria = dovSeria;
    }

    public String getDovNumber() {
        return dovNumber;
    }

    public void setDovNumber(String dovNumber) {
        this.dovNumber = dovNumber;
    }

    public String getDovRegNumber() {
        return dovRegNumber;
    }

    public void setDovRegNumber(String dovRegNumber) {
        this.dovRegNumber = dovRegNumber;
    }

    public String getDovIdentityDocType() {
        return dovIdentityDocType;
    }

    public void setDovIdentityDocType(String dovIdentityDocType) {
        this.dovIdentityDocType = dovIdentityDocType;
    }

    public String getDovOtherDocTypeName() {
        return dovOtherDocTypeName;
    }

    public void setDovOtherDocTypeName(String dovOtherDocTypeName) {
        this.dovOtherDocTypeName = dovOtherDocTypeName;
    }

    public String getDovPassSeria() {
        return dovPassSeria;
    }

    public void setDovPassSeria(String dovPassSeria) {
        this.dovPassSeria = dovPassSeria;
    }

    public String getDovPassNo() {
        return dovPassNo;
    }

    public void setDovPassNo(String dovPassNo) {
        this.dovPassNo = dovPassNo;
    }

    public Date getDovPassDate() {
        return dovPassDate;
    }

    public void setDovPassDate(Date dovPassDate) {
        this.dovPassDate = dovPassDate;
    }

    public String getDovPassFrom() {
        return dovPassFrom;
    }

    public void setDovPassFrom(String dovPassFrom) {
        this.dovPassFrom = dovPassFrom;
    }

    public FileBean getDovDovLoad() {
        return dovDovLoad;
    }

    public void setDovDovLoad(FileBean dovDovLoad) {
        this.dovDovLoad = dovDovLoad;
    }

    public FileBean getDovPasLoad() {
        return dovPasLoad;
    }

    public void setDovPasLoad(FileBean dovPasLoad) {
        this.dovPasLoad = dovPasLoad;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressEnterType() {
        return addressEnterType;
    }

    public void setAddressEnterType(String addressEnterType) {
        this.addressEnterType = addressEnterType;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressRayon() {
        return addressRayon;
    }

    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressSettlementText() {
        return addressSettlementText;
    }

    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }

    public String getAddressSettlementDict() {
        return addressSettlementDict;
    }

    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }

    public String getAddressStreetText() {
        return addressStreetText;
    }

    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }

    public String getAddressStreetDict() {
        return addressStreetDict;
    }

    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressKorpus() {
        return addressKorpus;
    }

    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }

    public String getAddressFlat() {
        return addressFlat;
    }

    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public String getAddressSeatCountry() {
        return addressSeatCountry;
    }

    public void setAddressSeatCountry(String addressSeatCountry) {
        this.addressSeatCountry = addressSeatCountry;
    }

    public String getAddressSeatIndex() {
        return addressSeatIndex;
    }

    public void setAddressSeatIndex(String addressSeatIndex) {
        this.addressSeatIndex = addressSeatIndex;
    }

    public String getAddressSeatEnterType() {
        return addressSeatEnterType;
    }

    public void setAddressSeatEnterType(String addressSeatEnterType) {
        this.addressSeatEnterType = addressSeatEnterType;
    }

    public String getAddressSeatRegion() {
        return addressSeatRegion;
    }

    public void setAddressSeatRegion(String addressSeatRegion) {
        this.addressSeatRegion = addressSeatRegion;
    }

    public String getAddressSeatRayon() {
        return addressSeatRayon;
    }

    public void setAddressSeatRayon(String addressSeatRayon) {
        this.addressSeatRayon = addressSeatRayon;
    }

    public String getAddressSeatSettlementType() {
        return addressSeatSettlementType;
    }

    public void setAddressSeatSettlementType(String addressSeatSettlementType) {
        this.addressSeatSettlementType = addressSeatSettlementType;
    }

    public String getAddressSeatCity() {
        return addressSeatCity;
    }

    public void setAddressSeatCity(String addressSeatCity) {
        this.addressSeatCity = addressSeatCity;
    }

    public String getAddressSeatSettlementText() {
        return addressSeatSettlementText;
    }

    public void setAddressSeatSettlementText(String addressSeatSettlementText) {
        this.addressSeatSettlementText = addressSeatSettlementText;
    }

    public String getAddressSeatSettlementDict() {
        return addressSeatSettlementDict;
    }

    public void setAddressSeatSettlementDict(String addressSeatSettlementDict) {
        this.addressSeatSettlementDict = addressSeatSettlementDict;
    }

    public String getAddressSeatStreetText() {
        return addressSeatStreetText;
    }

    public void setAddressSeatStreetText(String addressSeatStreetText) {
        this.addressSeatStreetText = addressSeatStreetText;
    }

    public String getAddressSeatStreetDict() {
        return addressSeatStreetDict;
    }

    public void setAddressSeatStreetDict(String addressSeatStreetDict) {
        this.addressSeatStreetDict = addressSeatStreetDict;
    }

    public String getAddressSeatHouse() {
        return addressSeatHouse;
    }

    public void setAddressSeatHouse(String addressSeatHouse) {
        this.addressSeatHouse = addressSeatHouse;
    }

    public String getAddressSeatKorpus() {
        return addressSeatKorpus;
    }

    public void setAddressSeatKorpus(String addressSeatKorpus) {
        this.addressSeatKorpus = addressSeatKorpus;
    }

    public String getAddressSeatFlat() {
        return addressSeatFlat;
    }

    public void setAddressSeatFlat(String addressSeatFlat) {
        this.addressSeatFlat = addressSeatFlat;
    }

    public String getAddressSeatCountryCode() {
        return addressSeatCountryCode;
    }

    public void setAddressSeatCountryCode(String addressSeatCountryCode) {
        this.addressSeatCountryCode = addressSeatCountryCode;
    }

    public String getAddressSeatCountryInput() {
        return addressSeatCountryInput;
    }

    public void setAddressSeatCountryInput(String addressSeatCountryInput) {
        this.addressSeatCountryInput = addressSeatCountryInput;
    }

    public String getAddressSeatCountrySettlement() {
        return addressSeatCountrySettlement;
    }

    public void setAddressSeatCountrySettlement(String addressSeatCountrySettlement) {
        this.addressSeatCountrySettlement = addressSeatCountrySettlement;
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

    public String getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(String identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getOtherDocTypeName() {
        return otherDocTypeName;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
    }

    public String getPassSeria() {
        return passSeria;
    }

    public void setPassSeria(String passSeria) {
        this.passSeria = passSeria;
    }

    public String getPassNo() {
        return passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public Date getPassDate() {
        return passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    public String getPassFrom() {
        return passFrom;
    }

    public void setPassFrom(String passFrom) {
        this.passFrom = passFrom;
    }

    public FileBean getIdentityDocLoad() {
        return identityDocLoad;
    }

    public void setIdentityDocLoad(FileBean identityDocLoad) {
        this.identityDocLoad = identityDocLoad;
    }

    public FileBean getSurnameDocLoad() {
        return surnameDocLoad;
    }

    public void setSurnameDocLoad(FileBean surnameDocLoad) {
        this.surnameDocLoad = surnameDocLoad;
    }

    public String getDocumentAgree() {
        return documentAgree;
    }

    public void setDocumentAgree(String documentAgree) {
        this.documentAgree = documentAgree;
    }

    public String getEduLastName() {
        return eduLastName;
    }

    public void setEduLastName(String eduLastName) {
        this.eduLastName = eduLastName;
    }

    public String getEduFirstName() {
        return eduFirstName;
    }

    public void setEduFirstName(String eduFirstName) {
        this.eduFirstName = eduFirstName;
    }

    public String getEduMiddleName() {
        return eduMiddleName;
    }

    public void setEduMiddleName(String eduMiddleName) {
        this.eduMiddleName = eduMiddleName;
    }

    public String getKindAttestat() {
        return kindAttestat;
    }

    public void setKindAttestat(String kindAttestat) {
        this.kindAttestat = kindAttestat;
    }

    public String getEduSeria() {
        return eduSeria;
    }

    public void setEduSeria(String eduSeria) {
        this.eduSeria = eduSeria;
    }

    public String getEduNumber() {
        return eduNumber;
    }

    public void setEduNumber(String eduNumber) {
        this.eduNumber = eduNumber;
    }

    public String getEduFrom() {
        return eduFrom;
    }

    public void setEduFrom(String eduFrom) {
        this.eduFrom = eduFrom;
    }

    public Date getEduDate() {
        return eduDate;
    }

    public void setEduDate(Date eduDate) {
        this.eduDate = eduDate;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getApostil() {
        return apostil;
    }

    public void setApostil(String apostil) {
        this.apostil = apostil;
    }

    public String getWayObtain() {
        return wayObtain;
    }

    public void setWayObtain(String wayObtain) {
        this.wayObtain = wayObtain;
    }

    public String getAddressPostCountryBenefit() {
        return addressPostCountryBenefit;
    }

    public void setAddressPostCountryBenefit(String addressPostCountryBenefit) {
        this.addressPostCountryBenefit = addressPostCountryBenefit;
    }

    public String getAddressPostIndexBenefit() {
        return addressPostIndexBenefit;
    }

    public void setAddressPostIndexBenefit(String addressPostIndexBenefit) {
        this.addressPostIndexBenefit = addressPostIndexBenefit;
    }

    public String getAddressPostEnterTypeBenefit() {
        return addressPostEnterTypeBenefit;
    }

    public void setAddressPostEnterTypeBenefit(String addressPostEnterTypeBenefit) {
        this.addressPostEnterTypeBenefit = addressPostEnterTypeBenefit;
    }

    public String getAddressPostRegionBenefit() {
        return addressPostRegionBenefit;
    }

    public void setAddressPostRegionBenefit(String addressPostRegionBenefit) {
        this.addressPostRegionBenefit = addressPostRegionBenefit;
    }

    public String getAddressPostRayonBenefit() {
        return addressPostRayonBenefit;
    }

    public void setAddressPostRayonBenefit(String addressPostRayonBenefit) {
        this.addressPostRayonBenefit = addressPostRayonBenefit;
    }

    public String getAddressPostSettlementTypeBenefit() {
        return addressPostSettlementTypeBenefit;
    }

    public void setAddressPostSettlementTypeBenefit(String addressPostSettlementTypeBenefit) {
        this.addressPostSettlementTypeBenefit = addressPostSettlementTypeBenefit;
    }

    public String getAddressPostCityBenefit() {
        return addressPostCityBenefit;
    }

    public void setAddressPostCityBenefit(String addressPostCityBenefit) {
        this.addressPostCityBenefit = addressPostCityBenefit;
    }

    public String getAddressPostSettlementTextBenefit() {
        return addressPostSettlementTextBenefit;
    }

    public void setAddressPostSettlementTextBenefit(String addressPostSettlementTextBenefit) {
        this.addressPostSettlementTextBenefit = addressPostSettlementTextBenefit;
    }

    public String getAddressPostSettlementDictBenefit() {
        return addressPostSettlementDictBenefit;
    }

    public void setAddressPostSettlementDictBenefit(String addressPostSettlementDictBenefit) {
        this.addressPostSettlementDictBenefit = addressPostSettlementDictBenefit;
    }

    public String getAddressPostStreetTextBenefit() {
        return addressPostStreetTextBenefit;
    }

    public void setAddressPostStreetTextBenefit(String addressPostStreetTextBenefit) {
        this.addressPostStreetTextBenefit = addressPostStreetTextBenefit;
    }

    public String getAddressPostStreetDictBenefit() {
        return addressPostStreetDictBenefit;
    }

    public void setAddressPostStreetDictBenefit(String addressPostStreetDictBenefit) {
        this.addressPostStreetDictBenefit = addressPostStreetDictBenefit;
    }

    public String getAddressPostHouseBenefit() {
        return addressPostHouseBenefit;
    }

    public void setAddressPostHouseBenefit(String addressPostHouseBenefit) {
        this.addressPostHouseBenefit = addressPostHouseBenefit;
    }

    public String getAddressPostKorpusBenefit() {
        return addressPostKorpusBenefit;
    }

    public void setAddressPostKorpusBenefit(String addressPostKorpusBenefit) {
        this.addressPostKorpusBenefit = addressPostKorpusBenefit;
    }

    public String getAddressPostFlatBenefit() {
        return addressPostFlatBenefit;
    }

    public void setAddressPostFlatBenefit(String addressPostFlatBenefit) {
        this.addressPostFlatBenefit = addressPostFlatBenefit;
    }

    public String getAddressPostCountryCodeBenefit() {
        return addressPostCountryCodeBenefit;
    }

    public void setAddressPostCountryCodeBenefit(String addressPostCountryCodeBenefit) {
        this.addressPostCountryCodeBenefit = addressPostCountryCodeBenefit;
    }

    public String getAddressPostCountryInputBenefit() {
        return addressPostCountryInputBenefit;
    }

    public void setAddressPostCountryInputBenefit(String addressPostCountryInputBenefit) {
        this.addressPostCountryInputBenefit = addressPostCountryInputBenefit;
    }

    public String getAddressPostCountrySettlementBenefit() {
        return addressPostCountrySettlementBenefit;
    }

    public void setAddressPostCountrySettlementBenefit(String addressPostCountrySettlementBenefit) {
        this.addressPostCountrySettlementBenefit = addressPostCountrySettlementBenefit;
    }

    public String getAgreeCh() {
        return agreeCh;
    }

    public void setAgreeCh(String agreeCh) {
        this.agreeCh = agreeCh;
    }

    public String getAgree1Ch() {
        return agree1Ch;
    }

    public void setAgree1Ch(String agree1Ch) {
        this.agree1Ch = agree1Ch;
    }

    public FileBean getEduDocLoad() {
        return eduDocLoad;
    }

    public void setEduDocLoad(FileBean eduDocLoad) {
        this.eduDocLoad = eduDocLoad;
    }

    public FileBean getEdu1DocLoad() {
        return edu1DocLoad;
    }

    public void setEdu1DocLoad(FileBean edu1DocLoad) {
        this.edu1DocLoad = edu1DocLoad;
    }

    public FileBean getApostilDocLoad() {
        return apostilDocLoad;
    }

    public void setApostilDocLoad(FileBean apostilDocLoad) {
        this.apostilDocLoad = apostilDocLoad;
    }
}
