package com.nvision.pgu.web.services.s36400216;

import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;
import ru.mipt.pfr.ac.AccessControl;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400216Form extends AbstractServiceOrderForm {

    // address
    private String addressIndex;
    private String addressEnterType;
    private String addressRegion;
    private String addressRayon;
    private String addressCity;
    private String addressSettlementText;
    private String addressSettlementDict;
    private String addressStreetText;
    private String addressStreetDict;
    private String addressHouse;
    private String addressKorpus;
    private String addressFlat;
    private String addressCountry = "643";
    private String addressCountryCode = "ru";
    private String addressCountryInput;
    private String addressSettlementType = "1";
    private String addressCountrySettlement;
    // factAddress
    private String factAddressIndex;
    private String factAddressEnterType;
    private String factAddressRegion;
    private String factAddressRayon;
    private String factAddressCity;
    private String factAddressSettlementText;
    private String factAddressSettlementDict;
    private String factAddressStreetText;
    private String factAddressStreetDict;
    private String factAddressHouse;
    private String factAddressKorpus;
    private String factAddressFlat;
    private String factAddressCountry = "643";
    private String factAddressCountryCode = "ru";
    private String factAddressCountryInput;
    private String factAddressSettlementType = "1";
    private String factAddressCountrySettlement;
    // addressPost
    private String addressPostIndex;
    private String addressPostEnterType;
    private String addressPostRegion;
    private String addressPostRayon;
    private String addressPostCity;
    private String addressPostSettlementText;
    private String addressPostSettlementDict;
    private String addressPostStreetText;
    private String addressPostStreetDict;
    private String addressPostHouse;
    private String addressPostKorpus;
    private String addressPostFlat;
    private String addressPostCountry = "643";
    private String addressPostCountryCode = "ru";
    private String addressPostCountryInput;
    private String addressPostSettlementType = "1";
    private String addressPostCountrySettlement;
    // org_addressUr
    private String org_addressUrIndex;
    private String org_addressUrEnterType;
    private String org_addressUrRegion;
    private String org_addressUrRayon;
    private String org_addressUrCity;
    private String org_addressUrSettlementText;
    private String org_addressUrSettlementDict;
    private String org_addressUrStreetText;
    private String org_addressUrStreetDict;
    private String org_addressUrHouse;
    private String org_addressUrKorpus;
    private String org_addressUrFlat;
    private String org_addressUrCountry = "643";
    private String org_addressUrCountryCode = "ru";
    private String org_addressUrCountryInput;
    private String org_addressUrSettlementType = "1";
    private String org_addressUrCountrySettlement;
    // org_addressPost
    private String org_addressPostIndex;
    private String org_addressPostEnterType;
    private String org_addressPostRegion;
    private String org_addressPostRayon;
    private String org_addressPostCity;
    private String org_addressPostSettlementText;
    private String org_addressPostSettlementDict;
    private String org_addressPostStreetText;
    private String org_addressPostStreetDict;
    private String org_addressPostHouse;
    private String org_addressPostKorpus;
    private String org_addressPostFlat;
    private String org_addressPostCountry = "643";
    private String org_addressPostCountryCode = "ru";
    private String org_addressPostCountryInput;
    private String org_addressPostSettlementType = "1";
    private String org_addressPostCountrySettlement;
    // flatAddress
    private String flatAddressIndex;
    private String flatAddressEnterType;
    private String flatAddressRegion;
    private String flatAddressRayon;
    private String flatAddressCity;
    private String flatAddressSettlementText;
    private String flatAddressSettlementDict;
    private String flatAddressStreetText;
    private String flatAddressStreetDict;
    private String flatAddressHouse;
    private String flatAddressKorpus;
    private String flatAddressFlat;
    private String flatAddressCountry = "643";
    private String flatAddressCountryCode = "ru";
    private String flatAddressCountryInput;
    private String flatAddressSettlementType = "1";
    private String flatAddressCountrySettlement;


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

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
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

    public String getAddressSettlementType() {
        return addressSettlementType;
    }

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public String getFactAddressIndex() {
        return factAddressIndex;
    }

    public void setFactAddressIndex(String factAddressIndex) {
        this.factAddressIndex = factAddressIndex;
    }

    public String getFactAddressEnterType() {
        return factAddressEnterType;
    }

    public void setFactAddressEnterType(String factAddressEnterType) {
        this.factAddressEnterType = factAddressEnterType;
    }

    public String getFactAddressRegion() {
        return factAddressRegion;
    }

    public void setFactAddressRegion(String factAddressRegion) {
        this.factAddressRegion = factAddressRegion;
    }

    public String getFactAddressRayon() {
        return factAddressRayon;
    }

    public void setFactAddressRayon(String factAddressRayon) {
        this.factAddressRayon = factAddressRayon;
    }

    public String getFactAddressCity() {
        return factAddressCity;
    }

    public void setFactAddressCity(String factAddressCity) {
        this.factAddressCity = factAddressCity;
    }

    public String getFactAddressSettlementText() {
        return factAddressSettlementText;
    }

    public void setFactAddressSettlementText(String factAddressSettlementText) {
        this.factAddressSettlementText = factAddressSettlementText;
    }

    public String getFactAddressSettlementDict() {
        return factAddressSettlementDict;
    }

    public void setFactAddressSettlementDict(String factAddressSettlementDict) {
        this.factAddressSettlementDict = factAddressSettlementDict;
    }

    public String getFactAddressStreetText() {
        return factAddressStreetText;
    }

    public void setFactAddressStreetText(String factAddressStreetText) {
        this.factAddressStreetText = factAddressStreetText;
    }

    public String getFactAddressStreetDict() {
        return factAddressStreetDict;
    }

    public void setFactAddressStreetDict(String factAddressStreetDict) {
        this.factAddressStreetDict = factAddressStreetDict;
    }

    public String getFactAddressHouse() {
        return factAddressHouse;
    }

    public void setFactAddressHouse(String factAddressHouse) {
        this.factAddressHouse = factAddressHouse;
    }

    public String getFactAddressKorpus() {
        return factAddressKorpus;
    }

    public void setFactAddressKorpus(String factAddressKorpus) {
        this.factAddressKorpus = factAddressKorpus;
    }

    public String getFactAddressFlat() {
        return factAddressFlat;
    }

    public void setFactAddressFlat(String factAddressFlat) {
        this.factAddressFlat = factAddressFlat;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
    }

    public String getFactAddressCountryCode() {
        return factAddressCountryCode;
    }

    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }

    public String getFactAddressCountryInput() {
        return factAddressCountryInput;
    }

    public void setFactAddressCountryInput(String factAddressCountryInput) {
        this.factAddressCountryInput = factAddressCountryInput;
    }

    public String getFactAddressSettlementType() {
        return factAddressSettlementType;
    }

    public void setFactAddressSettlementType(String factAddressSettlementType) {
        this.factAddressSettlementType = factAddressSettlementType;
    }

    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }

    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }

    public String getAddressPostIndex() {
        return addressPostIndex;
    }

    public void setAddressPostIndex(String addressPostIndex) {
        this.addressPostIndex = addressPostIndex;
    }

    public String getAddressPostEnterType() {
        return addressPostEnterType;
    }

    public void setAddressPostEnterType(String addressPostEnterType) {
        this.addressPostEnterType = addressPostEnterType;
    }

    public String getAddressPostRegion() {
        return addressPostRegion;
    }

    public void setAddressPostRegion(String addressPostRegion) {
        this.addressPostRegion = addressPostRegion;
    }

    public String getAddressPostRayon() {
        return addressPostRayon;
    }

    public void setAddressPostRayon(String addressPostRayon) {
        this.addressPostRayon = addressPostRayon;
    }

    public String getAddressPostCity() {
        return addressPostCity;
    }

    public void setAddressPostCity(String addressPostCity) {
        this.addressPostCity = addressPostCity;
    }

    public String getAddressPostSettlementText() {
        return addressPostSettlementText;
    }

    public void setAddressPostSettlementText(String addressPostSettlementText) {
        this.addressPostSettlementText = addressPostSettlementText;
    }

    public String getAddressPostSettlementDict() {
        return addressPostSettlementDict;
    }

    public void setAddressPostSettlementDict(String addressPostSettlementDict) {
        this.addressPostSettlementDict = addressPostSettlementDict;
    }

    public String getAddressPostStreetText() {
        return addressPostStreetText;
    }

    public void setAddressPostStreetText(String addressPostStreetText) {
        this.addressPostStreetText = addressPostStreetText;
    }

    public String getAddressPostStreetDict() {
        return addressPostStreetDict;
    }

    public void setAddressPostStreetDict(String addressPostStreetDict) {
        this.addressPostStreetDict = addressPostStreetDict;
    }

    public String getAddressPostHouse() {
        return addressPostHouse;
    }

    public void setAddressPostHouse(String addressPostHouse) {
        this.addressPostHouse = addressPostHouse;
    }

    public String getAddressPostKorpus() {
        return addressPostKorpus;
    }

    public void setAddressPostKorpus(String addressPostKorpus) {
        this.addressPostKorpus = addressPostKorpus;
    }

    public String getAddressPostFlat() {
        return addressPostFlat;
    }

    public void setAddressPostFlat(String addressPostFlat) {
        this.addressPostFlat = addressPostFlat;
    }

    public String getAddressPostCountry() {
        return addressPostCountry;
    }

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
    }

    public String getAddressPostCountryCode() {
        return addressPostCountryCode;
    }

    public void setAddressPostCountryCode(String addressPostCountryCode) {
        this.addressPostCountryCode = addressPostCountryCode;
    }

    public String getAddressPostCountryInput() {
        return addressPostCountryInput;
    }

    public void setAddressPostCountryInput(String addressPostCountryInput) {
        this.addressPostCountryInput = addressPostCountryInput;
    }

    public String getAddressPostSettlementType() {
        return addressPostSettlementType;
    }

    public void setAddressPostSettlementType(String addressPostSettlementType) {
        this.addressPostSettlementType = addressPostSettlementType;
    }

    public String getAddressPostCountrySettlement() {
        return addressPostCountrySettlement;
    }

    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
    }

    public String getOrg_addressUrIndex() {
        return org_addressUrIndex;
    }

    public void setOrg_addressUrIndex(String org_addressUrIndex) {
        this.org_addressUrIndex = org_addressUrIndex;
    }

    public String getOrg_addressUrEnterType() {
        return org_addressUrEnterType;
    }

    public void setOrg_addressUrEnterType(String org_addressUrEnterType) {
        this.org_addressUrEnterType = org_addressUrEnterType;
    }

    public String getOrg_addressUrRegion() {
        return org_addressUrRegion;
    }

    public void setOrg_addressUrRegion(String org_addressUrRegion) {
        this.org_addressUrRegion = org_addressUrRegion;
    }

    public String getOrg_addressUrRayon() {
        return org_addressUrRayon;
    }

    public void setOrg_addressUrRayon(String org_addressUrRayon) {
        this.org_addressUrRayon = org_addressUrRayon;
    }

    public String getOrg_addressUrCity() {
        return org_addressUrCity;
    }

    public void setOrg_addressUrCity(String org_addressUrCity) {
        this.org_addressUrCity = org_addressUrCity;
    }

    public String getOrg_addressUrSettlementText() {
        return org_addressUrSettlementText;
    }

    public void setOrg_addressUrSettlementText(String org_addressUrSettlementText) {
        this.org_addressUrSettlementText = org_addressUrSettlementText;
    }

    public String getOrg_addressUrSettlementDict() {
        return org_addressUrSettlementDict;
    }

    public void setOrg_addressUrSettlementDict(String org_addressUrSettlementDict) {
        this.org_addressUrSettlementDict = org_addressUrSettlementDict;
    }

    public String getOrg_addressUrStreetText() {
        return org_addressUrStreetText;
    }

    public void setOrg_addressUrStreetText(String org_addressUrStreetText) {
        this.org_addressUrStreetText = org_addressUrStreetText;
    }

    public String getOrg_addressUrStreetDict() {
        return org_addressUrStreetDict;
    }

    public void setOrg_addressUrStreetDict(String org_addressUrStreetDict) {
        this.org_addressUrStreetDict = org_addressUrStreetDict;
    }

    public String getOrg_addressUrHouse() {
        return org_addressUrHouse;
    }

    public void setOrg_addressUrHouse(String org_addressUrHouse) {
        this.org_addressUrHouse = org_addressUrHouse;
    }

    public String getOrg_addressUrKorpus() {
        return org_addressUrKorpus;
    }

    public void setOrg_addressUrKorpus(String org_addressUrKorpus) {
        this.org_addressUrKorpus = org_addressUrKorpus;
    }

    public String getOrg_addressUrFlat() {
        return org_addressUrFlat;
    }

    public void setOrg_addressUrFlat(String org_addressUrFlat) {
        this.org_addressUrFlat = org_addressUrFlat;
    }

    public String getOrg_addressUrCountry() {
        return org_addressUrCountry;
    }

    public void setOrg_addressUrCountry(String org_addressUrCountry) {
        this.org_addressUrCountry = org_addressUrCountry;
    }

    public String getOrg_addressUrCountryCode() {
        return org_addressUrCountryCode;
    }

    public void setOrg_addressUrCountryCode(String org_addressUrCountryCode) {
        this.org_addressUrCountryCode = org_addressUrCountryCode;
    }

    public String getOrg_addressUrCountryInput() {
        return org_addressUrCountryInput;
    }

    public void setOrg_addressUrCountryInput(String org_addressUrCountryInput) {
        this.org_addressUrCountryInput = org_addressUrCountryInput;
    }

    public String getOrg_addressUrSettlementType() {
        return org_addressUrSettlementType;
    }

    public void setOrg_addressUrSettlementType(String org_addressUrSettlementType) {
        this.org_addressUrSettlementType = org_addressUrSettlementType;
    }

    public String getOrg_addressUrCountrySettlement() {
        return org_addressUrCountrySettlement;
    }

    public void setOrg_addressUrCountrySettlement(String org_addressUrCountrySettlement) {
        this.org_addressUrCountrySettlement = org_addressUrCountrySettlement;
    }

    public String getOrg_addressPostIndex() {
        return org_addressPostIndex;
    }

    public void setOrg_addressPostIndex(String org_addressPostIndex) {
        this.org_addressPostIndex = org_addressPostIndex;
    }

    public String getOrg_addressPostEnterType() {
        return org_addressPostEnterType;
    }

    public void setOrg_addressPostEnterType(String org_addressPostEnterType) {
        this.org_addressPostEnterType = org_addressPostEnterType;
    }

    public String getOrg_addressPostRegion() {
        return org_addressPostRegion;
    }

    public void setOrg_addressPostRegion(String org_addressPostRegion) {
        this.org_addressPostRegion = org_addressPostRegion;
    }

    public String getOrg_addressPostRayon() {
        return org_addressPostRayon;
    }

    public void setOrg_addressPostRayon(String org_addressPostRayon) {
        this.org_addressPostRayon = org_addressPostRayon;
    }

    public String getOrg_addressPostCity() {
        return org_addressPostCity;
    }

    public void setOrg_addressPostCity(String org_addressPostCity) {
        this.org_addressPostCity = org_addressPostCity;
    }

    public String getOrg_addressPostSettlementText() {
        return org_addressPostSettlementText;
    }

    public void setOrg_addressPostSettlementText(String org_addressPostSettlementText) {
        this.org_addressPostSettlementText = org_addressPostSettlementText;
    }

    public String getOrg_addressPostSettlementDict() {
        return org_addressPostSettlementDict;
    }

    public void setOrg_addressPostSettlementDict(String org_addressPostSettlementDict) {
        this.org_addressPostSettlementDict = org_addressPostSettlementDict;
    }

    public String getOrg_addressPostStreetText() {
        return org_addressPostStreetText;
    }

    public void setOrg_addressPostStreetText(String org_addressPostStreetText) {
        this.org_addressPostStreetText = org_addressPostStreetText;
    }

    public String getOrg_addressPostStreetDict() {
        return org_addressPostStreetDict;
    }

    public void setOrg_addressPostStreetDict(String org_addressPostStreetDict) {
        this.org_addressPostStreetDict = org_addressPostStreetDict;
    }

    public String getOrg_addressPostHouse() {
        return org_addressPostHouse;
    }

    public void setOrg_addressPostHouse(String org_addressPostHouse) {
        this.org_addressPostHouse = org_addressPostHouse;
    }

    public String getOrg_addressPostKorpus() {
        return org_addressPostKorpus;
    }

    public void setOrg_addressPostKorpus(String org_addressPostKorpus) {
        this.org_addressPostKorpus = org_addressPostKorpus;
    }

    public String getOrg_addressPostFlat() {
        return org_addressPostFlat;
    }

    public void setOrg_addressPostFlat(String org_addressPostFlat) {
        this.org_addressPostFlat = org_addressPostFlat;
    }

    public String getOrg_addressPostCountry() {
        return org_addressPostCountry;
    }

    public void setOrg_addressPostCountry(String org_addressPostCountry) {
        this.org_addressPostCountry = org_addressPostCountry;
    }

    public String getOrg_addressPostCountryCode() {
        return org_addressPostCountryCode;
    }

    public void setOrg_addressPostCountryCode(String org_addressPostCountryCode) {
        this.org_addressPostCountryCode = org_addressPostCountryCode;
    }

    public String getOrg_addressPostCountryInput() {
        return org_addressPostCountryInput;
    }

    public void setOrg_addressPostCountryInput(String org_addressPostCountryInput) {
        this.org_addressPostCountryInput = org_addressPostCountryInput;
    }

    public String getOrg_addressPostSettlementType() {
        return org_addressPostSettlementType;
    }

    public void setOrg_addressPostSettlementType(String org_addressPostSettlementType) {
        this.org_addressPostSettlementType = org_addressPostSettlementType;
    }

    public String getOrg_addressPostCountrySettlement() {
        return org_addressPostCountrySettlement;
    }

    public void setOrg_addressPostCountrySettlement(String org_addressPostCountrySettlement) {
        this.org_addressPostCountrySettlement = org_addressPostCountrySettlement;
    }

    public String getFlatAddressIndex() {
        return flatAddressIndex;
    }

    public void setFlatAddressIndex(String flatAddressIndex) {
        this.flatAddressIndex = flatAddressIndex;
    }

    public String getFlatAddressEnterType() {
        return flatAddressEnterType;
    }

    public void setFlatAddressEnterType(String flatAddressEnterType) {
        this.flatAddressEnterType = flatAddressEnterType;
    }

    public String getFlatAddressRegion() {
        return flatAddressRegion;
    }

    public void setFlatAddressRegion(String flatAddressRegion) {
        this.flatAddressRegion = flatAddressRegion;
    }

    public String getFlatAddressRayon() {
        return flatAddressRayon;
    }

    public void setFlatAddressRayon(String flatAddressRayon) {
        this.flatAddressRayon = flatAddressRayon;
    }

    public String getFlatAddressCity() {
        return flatAddressCity;
    }

    public void setFlatAddressCity(String flatAddressCity) {
        this.flatAddressCity = flatAddressCity;
    }

    public String getFlatAddressSettlementText() {
        return flatAddressSettlementText;
    }

    public void setFlatAddressSettlementText(String flatAddressSettlementText) {
        this.flatAddressSettlementText = flatAddressSettlementText;
    }

    public String getFlatAddressSettlementDict() {
        return flatAddressSettlementDict;
    }

    public void setFlatAddressSettlementDict(String flatAddressSettlementDict) {
        this.flatAddressSettlementDict = flatAddressSettlementDict;
    }

    public String getFlatAddressStreetText() {
        return flatAddressStreetText;
    }

    public void setFlatAddressStreetText(String flatAddressStreetText) {
        this.flatAddressStreetText = flatAddressStreetText;
    }

    public String getFlatAddressStreetDict() {
        return flatAddressStreetDict;
    }

    public void setFlatAddressStreetDict(String flatAddressStreetDict) {
        this.flatAddressStreetDict = flatAddressStreetDict;
    }

    public String getFlatAddressHouse() {
        return flatAddressHouse;
    }

    public void setFlatAddressHouse(String flatAddressHouse) {
        this.flatAddressHouse = flatAddressHouse;
    }

    public String getFlatAddressKorpus() {
        return flatAddressKorpus;
    }

    public void setFlatAddressKorpus(String flatAddressKorpus) {
        this.flatAddressKorpus = flatAddressKorpus;
    }

    public String getFlatAddressFlat() {
        return flatAddressFlat;
    }

    public void setFlatAddressFlat(String flatAddressFlat) {
        this.flatAddressFlat = flatAddressFlat;
    }

    public String getFlatAddressCountry() {
        return flatAddressCountry;
    }

    public void setFlatAddressCountry(String flatAddressCountry) {
        this.flatAddressCountry = flatAddressCountry;
    }

    public String getFlatAddressCountryCode() {
        return flatAddressCountryCode;
    }

    public void setFlatAddressCountryCode(String flatAddressCountryCode) {
        this.flatAddressCountryCode = flatAddressCountryCode;
    }

    public String getFlatAddressCountryInput() {
        return flatAddressCountryInput;
    }

    public void setFlatAddressCountryInput(String flatAddressCountryInput) {
        this.flatAddressCountryInput = flatAddressCountryInput;
    }

    public String getFlatAddressSettlementType() {
        return flatAddressSettlementType;
    }

    public void setFlatAddressSettlementType(String flatAddressSettlementType) {
        this.flatAddressSettlementType = flatAddressSettlementType;
    }

    public String getFlatAddressCountrySettlement() {
        return flatAddressCountrySettlement;
    }

    public void setFlatAddressCountrySettlement(String flatAddressCountrySettlement) {
        this.flatAddressCountrySettlement = flatAddressCountrySettlement;
    }

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setEmail("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setEmail(privateRoomDataContainer.getEmail());
    }

    private Boolean dov_enable_changed = true;
    private Boolean applType_changed = true;
    private Boolean dovUlType_changed = true;

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
    }

    public Boolean getApplType_changed() {
        return applType_changed;
    }

    public void setApplType_changed(Boolean applType_changed) {
        this.applType_changed = applType_changed;
    }

    public Boolean getDovUlType_changed() {
        return dovUlType_changed;
    }

    public void setDovUlType_changed(Boolean dovUlType_changed) {
        this.dovUlType_changed = dovUlType_changed;
    }

	
			
						
			
			private String applType;


			private String dov_enable;


			private String dovUlType;
	
			
						
									
						
			
			private FileBean dovDovLoad;			
						
			
			private FileBean dovPasLoad;			
						
						
			
			private String docType;			
						
			
			private String dovNo;			
						
			
			private Date dovDate;			
	
			
						

						
			
			private String lastName;			
						
			
			private String firstName;			
						
			
			private String middleName;			
						

			private String phone;			
						
			
			private String email;			
						
						
			
			private String identityDocType;			
						
			
			private String otherDocTypeName;			
						
			
			private String passSeria;			
						
			
			private String passNo;			
						
			
			private Date passDate;			
						
			
			private String passFrom;			
									
						
			
			private FileBean identityDocLoad;			
	
			
						
									
						
			
			private FileBean dovUlNonDovLoad;			
						
			

			
			private FileBean dovUlDovLoad;			
						
			
			private FileBean dovUlPasLoad;			
						
						
			
			private String org_FullTitle;			
						
			
			private String org_opf;
						
			
			private String org_SmallTitle;			
						

			private String org_phone;			
						
			
			private String org_email;			
	
			
						
						
			
			private String basisFlat;
									
						
			
			private FileBean socDocLoad;
	
			
						
			
			private String targetAppl;
									
						
						
			
			private FileBean egrpDocLoad;			
						
			
			private FileBean techDocLoad;			
						
			
			private FileBean actDocLoad;			
						
			
			private List<FileBean> gosDocLoad = AccessCounterList.createEmpty(FileBean.class);
						
			
			private String agreeCh;


public String getApplType() {
        return applType;
    }

    public void setApplType(String applType) {
                if(this.applType != null)
                    if(!(this.applType.equalsIgnoreCase(applType))) { // Произошло изменение значения поля.
                        this.setApplType_changed(true);
                    }
				this.applType = applType;
    }

    public String getDov_enable() {
        return dov_enable == null ? "off" : this.dov_enable;
    }

    public void setDov_enable(String dov_enable) {
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

    public String getDovUlType() {
        return dovUlType;
    }

    public void setDovUlType(String dovUlType) {
        if(this.dovUlType != null)
            if(!(this.dovUlType.equalsIgnoreCase(dovUlType))) { // Произошло изменение значения поля.
                this.setDovUlType_changed(true);
            }
        this.dovUlType = dovUlType;

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

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDovNo() {
        return dovNo;
    }

    public void setDovNo(String dovNo) {
        this.dovNo = dovNo;
    }

    public Date getDovDate() {
        return dovDate;
    }

    public void setDovDate(Date dovDate) {
        this.dovDate = dovDate;
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

    public FileBean getDovUlNonDovLoad() {
        return dovUlNonDovLoad;
    }

    public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
        this.dovUlNonDovLoad = dovUlNonDovLoad;
    }

    public FileBean getDovUlDovLoad() {
        return dovUlDovLoad;
    }

    public void setDovUlDovLoad(FileBean dovUlDovLoad) {
        this.dovUlDovLoad = dovUlDovLoad;
    }

    public FileBean getDovUlPasLoad() {
        return dovUlPasLoad;
    }

    public void setDovUlPasLoad(FileBean dovUlPasLoad) {
        this.dovUlPasLoad = dovUlPasLoad;
    }

    public String getOrg_FullTitle() {
        return org_FullTitle;
    }

    public void setOrg_FullTitle(String org_FullTitle) {
        this.org_FullTitle = org_FullTitle;
    }

    public String getOrg_opf() {
        return org_opf;
    }

    public void setOrg_opf(String org_opf) {
        this.org_opf = org_opf;
    }

    public String getOrg_SmallTitle() {
        return org_SmallTitle;
    }

    public void setOrg_SmallTitle(String org_SmallTitle) {
        this.org_SmallTitle = org_SmallTitle;
    }

    public String getOrg_phone() {
        return org_phone;
    }

    public void setOrg_phone(String org_phone) {
        this.org_phone = org_phone;
    }

    public String getOrg_email() {
        return org_email;
    }

    public void setOrg_email(String org_email) {
        this.org_email = org_email;
    }

    public String getBasisFlat() {
        return basisFlat;
    }

    public void setBasisFlat(String basisFlat) {
        this.basisFlat = basisFlat;
    }

    public FileBean getSocDocLoad() {
        return socDocLoad;
    }

    public void setSocDocLoad(FileBean socDocLoad) {
        this.socDocLoad = socDocLoad;
    }

    public String getTargetAppl() {
        return targetAppl;
    }

    public void setTargetAppl(String targetAppl) {
        this.targetAppl = targetAppl;
    }

    public FileBean getEgrpDocLoad() {
        return egrpDocLoad;
    }

    public void setEgrpDocLoad(FileBean egrpDocLoad) {
        this.egrpDocLoad = egrpDocLoad;
    }

    public FileBean getTechDocLoad() {
        return techDocLoad;
    }

    public void setTechDocLoad(FileBean techDocLoad) {
        this.techDocLoad = techDocLoad;
    }

    public FileBean getActDocLoad() {
        return actDocLoad;
    }

    public void setActDocLoad(FileBean actDocLoad) {
        this.actDocLoad = actDocLoad;
    }

    public List<FileBean> getGosDocLoad() {
        return normalize(gosDocLoad);
    }

    public void setGosDocLoad(List<FileBean> gosDocLoad) {
        this.gosDocLoad = AccessCounterList.decorate(gosDocLoad, FileBean.class);
    }

    public String getAgreeCh() {
        return agreeCh == null ? "off" : this.agreeCh;
    }

    public void setAgreeCh(String agreeCh) {
        this.agreeCh = agreeCh;
    }
}
