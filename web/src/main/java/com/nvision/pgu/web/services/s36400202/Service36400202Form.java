package com.nvision.pgu.web.services.s36400202;

import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400202Form extends AbstractServiceOrderForm {

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

       this.setBirthdate(null);

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

       this.setBirthdate(privateRoomDataContainer.getBirthdate());

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


    private Boolean dov_enable_changed = true;

    private Boolean incapable_enable_changed = true;

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
    }

    public Boolean getIncapable_enable_changed() {
        return incapable_enable_changed;
    }

    public void setIncapable_enable_changed(Boolean incapable_enable_changed) {
        this.incapable_enable_changed = incapable_enable_changed;
    }

			private String dov_enable;

			private String incapable_enable;			

			private Date birthdate;			
						
			
			private String politicalNationality;
						
						
			
			private String addressIndex;			
						
			
			private String addressCountry ="643";
						
			
			private String addressEnterType="1";
						
			
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
						
						
			
			private String factAddressIndex;			
						
			
			private String factAddressCountry="643";
						
			
			private String factAddressEnterType="1";
						
			
			private String factAddressRegion;			
						
			
			private String factAddressRayon;			
						
			
			private String factAddressSettlementType="1";
						
			
			private String factAddressCity;			
						
			
			private String factAddressSettlementText;			
						
			
			private String factAddressSettlementDict;			
						
			
			private String factAddressStreetText;			
						
			
			private String factAddressStreetDict;			
						
			
			private String factAddressHouse;			
						
			
			private String factAddressKorpus;			
						
			
			private String factAddressFlat;			
						
						
			
			private String addressRegIndex;			
						
			
			private String addressRegCountry ="643";
						
			
			private String addressRegEnterType = "1";
						
			
			private String addressRegRegion;			
						
			
			private String addressRegRayon;			
						
			
			private String addressRegSettlementType = "1";
						
			
			private String addressRegCity;			
						
			
			private String addressRegSettlementText;			
						
			
			private String addressRegSettlementDict;			
						
			
			private String addressRegStreetText;			
						
			
			private String addressRegStreetDict;			
						
			
			private String addressRegHouse;			
						
			
			private String addressRegKorpus;			
						
			
			private String addressRegFlat;
						

			
			private FileBean foreignerDocLoad;			
						
			
			private FileBean residenceDocLoad;			
						
			
			private FileBean refugeeDocLoad;			

						
									
						
			
			private FileBean dovDovLoad;			
						
			
			private FileBean dovPasLoad;			
						
									
						
			
			private FileBean dovOpekLoad;			
						
						
			
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
	
			
						
						
			
			private String recipientLastName;			
						
			
			private String recipientFirstName;			
						
			
			private String recipientMiddleName;			
						
			
			private Date recipientBirthdate;			
						
			
			private String recipientpoliticalNationality;
						
						
			
			private String recipientaddressIndex;			
						
			
			private String recipientaddressCountry="643";
						
			
			private String recipientaddressEnterType = "1";
						
			
			private String recipientaddressRegion;			
						
			
			private String recipientaddressRayon;			
						
			
			private String recipientaddressSettlementType = "1";
						
			
			private String recipientaddressCity;			
						
			
			private String recipientaddressSettlementText;			
						
			
			private String recipientaddressSettlementDict;			
						
			
			private String recipientaddressStreetText;			
						
			
			private String recipientaddressStreetDict;			
						
			
			private String recipientaddressHouse;			
						
			
			private String recipientaddressKorpus;			
						
			
			private String recipientaddressFlat;
						
						
			
			private String recFactAddressIndex;
						
			
			private String recFactAddressCountry = "643";
						
			
			private String recFactAddressEnterType = "1";
						
			
			private String recFactAddressRegion;
						
			
			private String recFactAddressRayon;
						
			
			private String recFactAddressSettlementType = "1";
						
			
			private String recFactAddressCity;
						
			
			private String recFactAddressSettlementText;
						
			
			private String recFactAddressSettlementDict;
						
			
			private String recFactAddressStreetText;
						
			
			private String recFactAddressStreetDict;
						
			
			private String recFactAddressHouse;
						
			
			private String recFactAddressKorpus;
						
			
			private String recFactAddressFlat;
						
						
			
			private String addressRecRegIndex;
						
			
			private String addressRecRegCountry = "643";
						
			
			private String addressRecRegEnterType = "1";
						
			
			private String addressRecRegRegion;
						
			
			private String addressRecRegRayon;
						
			
			private String addressRecRegSettlementType = "1";
						
			
			private String addressRecRegCity;
						
			
			private String addressRecRegSettlementText;
						
			
			private String addressRecRegSettlementDict;
						
			
			private String addressRecRegStreetText;
						
			
			private String addressRecRegStreetDict;
						
			
			private String addressRecRegHouse;
						
			
			private String addressRecRegKorpus;
						
			
			private String addressRecRegFlat;
						
			
			private String addressRecRegSrok;
						
						
			
			private String recipientIentityDocType;
						
			
			private String recipientOtherDocTypeName;
						
			
			private String recipientPassSeria;
						
			
			private String recipientPassNo;
						
			
			private Date recipientPassDate;
						
			
			private String recipientPassFrom;
									
						
			
			private FileBean recipientIdentityDocLoad;
						
			
			private FileBean doc1;

    public FileBean getDoc1() {
        return doc1;
    }

    public void setDoc1(FileBean doc1) {
        this.doc1 = doc1;
    }

    private FileBean recResidenceDocLoad;
						
			
			private FileBean recRefugeeDocLoad;
	
			
						
						
			
			private String goalAppl;
						
			
			private String socSupport;			
						
			
			private String dismissedCh;			
						
						
			
			private String workLastName;			
						
			
			private String workFirstName;			
						
			
			private String workMiddleName;			
						
			
			private Date workBirthdate;			
									
						
			
			private FileBean disabilityDocLoad;			
						
			
			private FileBean employDocLoad;			
						
			
			private FileBean womanDocLoad;			
						
						
			
			private FileBean nalogDocLoad;			
						
			
			private FileBean unemployedDocLoad;			
						
			
			private FileBean socDocLoad;			
						
			
			private FileBean socMedDocLoad;			
	
			
			private String addressRegSrok;
						
			
			private String wayBenefit;			
						
			
			private String addressBenefit;			
						
						
			
			private String nameBankBenefit;			
						
			
			private String filialBankBenefit;			
						
			
			private String bikBankBenefit;			
						
			
			private String corrAccBankBenefit;			
						
			
			private String codeFilialBankBenefit;			
						
			
			private String clientAccBankBenefit;			

			private String agreeCh;			

			private String agree1Ch;

            private String addressCountryCode = "ru";

            private String addressCountryInput;

            private String addressCountrySettlement;

            private String factAddressCountryCode = "ru";

            private String factAddressCountryInput;

            private String factAddressCountrySettlement;

            private String addressRegCountryCode="ru";

            private String addressRegCountryInput;

            private String addressRegCountrySettlement;

            private String recipientaddressCountryCode = "ru";

            private String recipientaddressCountryInput;

            private String recipientaddressCountrySettlement;

            private String recipientaddressaettlementText;

            private String recFactAddressCountryCode = "ru";

            private String recFactAddressCountryInput;

            private String recFactAddressCountrySettlement;

            private String addressRecRegCountryCode = "ru";

            private String addressRecRegCountryInput;

            private String addressRecRegCountrySettlement;



    public String getAddressRecRegCountrySettlement() {
        return addressRecRegCountrySettlement;
    }

    public void setAddressRecRegCountrySettlement(String addressRecRegCountrySettlement) {
        this.addressRecRegCountrySettlement = addressRecRegCountrySettlement;
    }

    public String getAddressRecRegCountryInput() {
        return addressRecRegCountryInput;
    }

    public void setAddressRecRegCountryInput(String addressRecRegCountryInput) {
        this.addressRecRegCountryInput = addressRecRegCountryInput;
    }

    public String getAddressRecRegCountryCode() {
        return addressRecRegCountryCode;
    }

    public void setAddressRecRegCountryCode(String addressRecRegCountryCode) {
        this.addressRecRegCountryCode = addressRecRegCountryCode;
    }

    public String getRecFactAddressCountrySettlement() {
        return recFactAddressCountrySettlement;
    }

    public void setRecFactAddressCountrySettlement(String recFactAddressCountrySettlement) {
        this.recFactAddressCountrySettlement = recFactAddressCountrySettlement;
    }

    public String getRecFactAddressCountryInput() {
        return recFactAddressCountryInput;
    }

    public void setRecFactAddressCountryInput(String recFactAddressCountryInput) {
        this.recFactAddressCountryInput = recFactAddressCountryInput;
    }

    public String getRecFactAddressCountryCode() {
        return recFactAddressCountryCode;
    }

    public void setRecFactAddressCountryCode(String recFactAddressCountryCode) {
        this.recFactAddressCountryCode = recFactAddressCountryCode;
    }

    public String getRecipientaddressaettlementText() {
        return recipientaddressaettlementText;
    }

    public void setRecipientaddressaettlementText(String recipientaddressaettlementText) {
        this.recipientaddressaettlementText = recipientaddressaettlementText;
    }

    public String getRecipientaddressCountryInput() {
        return recipientaddressCountryInput;
    }

    public void setRecipientaddressCountryInput(String recipientaddressCountryInput) {
        this.recipientaddressCountryInput = recipientaddressCountryInput;
    }

    public String getRecipientaddressCountrySettlement() {
        return recipientaddressCountrySettlement;
    }

    public void setRecipientaddressCountrySettlement(String recipientaddressCountrySettlement) {
        this.recipientaddressCountrySettlement = recipientaddressCountrySettlement;
    }

    public String getRecipientaddressCountryCode() {
        return recipientaddressCountryCode;
    }

    public void setRecipientaddressCountryCode(String recipientaddressCountryCode) {
        this.recipientaddressCountryCode = recipientaddressCountryCode;
    }

    public String getAddressRegCountryCode() {
        return addressRegCountryCode;
    }

    public void setAddressRegCountryCode(String addressRegCountryCode) {
        this.addressRegCountryCode = addressRegCountryCode;
    }

    public String getAddressRegCountryInput() {
        return addressRegCountryInput;
    }

    public void setAddressRegCountryInput(String addressRegCountryInput) {
        this.addressRegCountryInput = addressRegCountryInput;
    }

    public String getAddressRegCountrySettlement() {
        return addressRegCountrySettlement;
    }

    public void setAddressRegCountrySettlement(String addressRegCountrySettlement) {
        this.addressRegCountrySettlement = addressRegCountrySettlement;
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

    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }

    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
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

    public String getIncapable_enable() {
        return incapable_enable == null ? "off" : this.incapable_enable;
    }

    public void setIncapable_enable(String incapable_enable) {
        if (this.incapable_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (incapable_enable == null) {  // с вэб-формы пришёл off
                        if (!"off".equals(this.getIncapable_enable())) { // ... а в форме сохранён on
                            this.setIncapable_enable_changed(true);
                        }
                        this.incapable_enable = "off";
                    } else {
                        if (!this.getIncapable_enable().equals(incapable_enable)){
                            this.setIncapable_enable_changed(true);
                        }
                        this.incapable_enable = incapable_enable;
                    }
                } else {
                    this.incapable_enable = incapable_enable;
                }

    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPoliticalNationality() {
        return politicalNationality;
    }

    public void setPoliticalNationality(String politicalNationality) {
        this.politicalNationality = politicalNationality;
    }

    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
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

    public String getFactAddressIndex() {
        return factAddressIndex;
    }

    public void setFactAddressIndex(String factAddressIndex) {
        this.factAddressIndex = factAddressIndex;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
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

    public String getFactAddressSettlementType() {
        return factAddressSettlementType;
    }

    public void setFactAddressSettlementType(String factAddressSettlementType) {
        this.factAddressSettlementType = factAddressSettlementType;
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

    public String getAddressRegIndex() {
        return addressRegIndex;
    }

    public void setAddressRegIndex(String addressRegIndex) {
        this.addressRegIndex = addressRegIndex;
    }

    public String getAddressRegCountry() {
        return addressRegCountry;
    }

    public void setAddressRegCountry(String addressRegCountry) {
        this.addressRegCountry = addressRegCountry;
    }

    public String getAddressRegEnterType() {
        return addressRegEnterType;
    }

    public void setAddressRegEnterType(String addressRegEnterType) {
        this.addressRegEnterType = addressRegEnterType;
    }

    public String getAddressRegRegion() {
        return addressRegRegion;
    }

    public void setAddressRegRegion(String addressRegRegion) {
        this.addressRegRegion = addressRegRegion;
    }

    public String getAddressRegRayon() {
        return addressRegRayon;
    }

    public void setAddressRegRayon(String addressRegRayon) {
        this.addressRegRayon = addressRegRayon;
    }

    public String getAddressRegSettlementType() {
        return addressRegSettlementType;
    }

    public void setAddressRegSettlementType(String addressRegSettlementType) {
        this.addressRegSettlementType = addressRegSettlementType;
    }

    public String getAddressRegCity() {
        return addressRegCity;
    }

    public void setAddressRegCity(String addressRegCity) {
        this.addressRegCity = addressRegCity;
    }

    public String getAddressRegSettlementText() {
        return addressRegSettlementText;
    }

    public void setAddressRegSettlementText(String addressRegSettlementText) {
        this.addressRegSettlementText = addressRegSettlementText;
    }

    public String getAddressRegSettlementDict() {
        return addressRegSettlementDict;
    }

    public void setAddressRegSettlementDict(String addressRegSettlementDict) {
        this.addressRegSettlementDict = addressRegSettlementDict;
    }

    public String getAddressRegStreetText() {
        return addressRegStreetText;
    }

    public void setAddressRegStreetText(String addressRegStreetText) {
        this.addressRegStreetText = addressRegStreetText;
    }

    public String getAddressRegStreetDict() {
        return addressRegStreetDict;
    }

    public void setAddressRegStreetDict(String addressRegStreetDict) {
        this.addressRegStreetDict = addressRegStreetDict;
    }

    public String getAddressRegHouse() {
        return addressRegHouse;
    }

    public void setAddressRegHouse(String addressRegHouse) {
        this.addressRegHouse = addressRegHouse;
    }

    public String getAddressRegKorpus() {
        return addressRegKorpus;
    }

    public void setAddressRegKorpus(String addressRegKorpus) {
        this.addressRegKorpus = addressRegKorpus;
    }

    public String getAddressRegFlat() {
        return addressRegFlat;
    }

    public void setAddressRegFlat(String addressRegFlat) {
        this.addressRegFlat = addressRegFlat;
    }

    public String getAddressRegSrok() {
        return addressRegSrok;
    }

    public void setAddressRegSrok(String addressRegSrok) {
        this.addressRegSrok = addressRegSrok;
    }

    public FileBean getForeignerDocLoad() {
        return foreignerDocLoad;
    }

    public void setForeignerDocLoad(FileBean foreignerDocLoad) {
        this.foreignerDocLoad = foreignerDocLoad;
    }

    public FileBean getResidenceDocLoad() {
        return residenceDocLoad;
    }

    public void setResidenceDocLoad(FileBean residenceDocLoad) {
        this.residenceDocLoad = residenceDocLoad;
    }

    public FileBean getRefugeeDocLoad() {
        return refugeeDocLoad;
    }

    public void setRefugeeDocLoad(FileBean refugeeDocLoad) {
        this.refugeeDocLoad = refugeeDocLoad;
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

    public FileBean getDovOpekLoad() {
        return dovOpekLoad;
    }

    public void setDovOpekLoad(FileBean dovOpekLoad) {
        this.dovOpekLoad = dovOpekLoad;
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

    public String getRecipientLastName() {
        return recipientLastName;
    }

    public void setRecipientLastName(String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }

    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    public void setRecipientFirstName(String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }

    public String getRecipientMiddleName() {
        return recipientMiddleName;
    }

    public void setRecipientMiddleName(String recipientMiddleName) {
        this.recipientMiddleName = recipientMiddleName;
    }

    public Date getRecipientBirthdate() {
        return recipientBirthdate;
    }

    public void setRecipientBirthdate(Date recipientBirthdate) {
        this.recipientBirthdate = recipientBirthdate;
    }

    public String getRecipientpoliticalNationality() {
        return recipientpoliticalNationality;
    }

    public void setRecipientpoliticalNationality(String recipientpoliticalNationality) {
        this.recipientpoliticalNationality = recipientpoliticalNationality;
    }

    public String getRecipientaddressIndex() {
        return recipientaddressIndex;
    }

    public void setRecipientaddressIndex(String recipientaddressIndex) {
        this.recipientaddressIndex = recipientaddressIndex;
    }

    public String getRecipientaddressCountry() {
        return recipientaddressCountry;
    }

    public void setRecipientaddressCountry(String recipientaddressCountry) {
        this.recipientaddressCountry = recipientaddressCountry;
    }

    public String getRecipientaddressEnterType() {
        return recipientaddressEnterType;
    }

    public void setRecipientaddressEnterType(String recipientaddressEnterType) {
        this.recipientaddressEnterType = recipientaddressEnterType;
    }

    public String getRecipientaddressRegion() {
        return recipientaddressRegion;
    }

    public void setRecipientaddressRegion(String recipientaddressRegion) {
        this.recipientaddressRegion = recipientaddressRegion;
    }

    public String getRecipientaddressRayon() {
        return recipientaddressRayon;
    }

    public void setRecipientaddressRayon(String recipientaddressRayon) {
        this.recipientaddressRayon = recipientaddressRayon;
    }

    public String getRecipientaddressSettlementType() {
        return recipientaddressSettlementType;
    }

    public void setRecipientaddressSettlementType(String recipientaddressSettlementType) {
        this.recipientaddressSettlementType = recipientaddressSettlementType;
    }

    public String getRecipientaddressCity() {
        return recipientaddressCity;
    }

    public void setRecipientaddressCity(String recipientaddressCity) {
        this.recipientaddressCity = recipientaddressCity;
    }

    public String getRecipientaddressSettlementText() {
        return recipientaddressSettlementText;
    }

    public void setRecipientaddressSettlementText(String recipientaddressSettlementText) {
        this.recipientaddressSettlementText = recipientaddressSettlementText;
    }

    public String getRecipientaddressSettlementDict() {
        return recipientaddressSettlementDict;
    }

    public void setRecipientaddressSettlementDict(String recipientaddressSettlementDict) {
        this.recipientaddressSettlementDict = recipientaddressSettlementDict;
    }

    public String getRecipientaddressStreetText() {
        return recipientaddressStreetText;
    }

    public void setRecipientaddressStreetText(String recipientaddressStreetText) {
        this.recipientaddressStreetText = recipientaddressStreetText;
    }

    public String getRecipientaddressStreetDict() {
        return recipientaddressStreetDict;
    }

    public void setRecipientaddressStreetDict(String recipientaddressStreetDict) {
        this.recipientaddressStreetDict = recipientaddressStreetDict;
    }

    public String getRecipientaddressHouse() {
        return recipientaddressHouse;
    }

    public void setRecipientaddressHouse(String recipientaddressHouse) {
        this.recipientaddressHouse = recipientaddressHouse;
    }

    public String getRecipientaddressKorpus() {
        return recipientaddressKorpus;
    }

    public void setRecipientaddressKorpus(String recipientaddressKorpus) {
        this.recipientaddressKorpus = recipientaddressKorpus;
    }

    public String getRecipientaddressFlat() {
        return recipientaddressFlat;
    }

    public void setRecipientaddressFlat(String recipientaddressFlat) {
        this.recipientaddressFlat = recipientaddressFlat;
    }

    public String getRecFactAddressIndex() {
        return recFactAddressIndex;
    }

    public void setRecFactAddressIndex(String recFactAddressIndex) {
        this.recFactAddressIndex = recFactAddressIndex;
    }

    public String getRecFactAddressCountry() {
        return recFactAddressCountry;
    }

    public void setRecFactAddressCountry(String recFactAddressCountry) {
        this.recFactAddressCountry = recFactAddressCountry;
    }

    public String getRecFactAddressEnterType() {
        return recFactAddressEnterType;
    }

    public void setRecFactAddressEnterType(String recFactAddressEnterType) {
        this.recFactAddressEnterType = recFactAddressEnterType;
    }

    public String getRecFactAddressRegion() {
        return recFactAddressRegion;
    }

    public void setRecFactAddressRegion(String recFactAddressRegion) {
        this.recFactAddressRegion = recFactAddressRegion;
    }

    public String getRecFactAddressRayon() {
        return recFactAddressRayon;
    }

    public void setRecFactAddressRayon(String recFactAddressRayon) {
        this.recFactAddressRayon = recFactAddressRayon;
    }

    public String getRecFactAddressSettlementType() {
        return recFactAddressSettlementType;
    }

    public void setRecFactAddressSettlementType(String recFactAddressSettlementType) {
        this.recFactAddressSettlementType = recFactAddressSettlementType;
    }

    public String getRecFactAddressCity() {
        return recFactAddressCity;
    }

    public void setRecFactAddressCity(String recFactAddressCity) {
        this.recFactAddressCity = recFactAddressCity;
    }

    public String getRecFactAddressSettlementText() {
        return recFactAddressSettlementText;
    }

    public void setRecFactAddressSettlementText(String recFactAddressSettlementText) {
        this.recFactAddressSettlementText = recFactAddressSettlementText;
    }

    public String getRecFactAddressSettlementDict() {
        return recFactAddressSettlementDict;
    }

    public void setRecFactAddressSettlementDict(String recFactAddressSettlementDict) {
        this.recFactAddressSettlementDict = recFactAddressSettlementDict;
    }

    public String getRecFactAddressStreetText() {
        return recFactAddressStreetText;
    }

    public void setRecFactAddressStreetText(String recFactAddressStreetText) {
        this.recFactAddressStreetText = recFactAddressStreetText;
    }

    public String getRecFactAddressStreetDict() {
        return recFactAddressStreetDict;
    }

    public void setRecFactAddressStreetDict(String recFactAddressStreetDict) {
        this.recFactAddressStreetDict = recFactAddressStreetDict;
    }

    public String getRecFactAddressHouse() {
        return recFactAddressHouse;
    }

    public void setRecFactAddressHouse(String recFactAddressHouse) {
        this.recFactAddressHouse = recFactAddressHouse;
    }

    public String getRecFactAddressKorpus() {
        return recFactAddressKorpus;
    }

    public void setRecFactAddressKorpus(String recFactAddressKorpus) {
        this.recFactAddressKorpus = recFactAddressKorpus;
    }

    public String getRecFactAddressFlat() {
        return recFactAddressFlat;
    }

    public void setRecFactAddressFlat(String recFactAddressFlat) {
        this.recFactAddressFlat = recFactAddressFlat;
    }

    public String getAddressRecRegIndex() {
        return addressRecRegIndex;
    }

    public void setAddressRecRegIndex(String addressRecRegIndex) {
        this.addressRecRegIndex = addressRecRegIndex;
    }

    public String getAddressRecRegCountry() {
        return addressRecRegCountry;
    }

    public void setAddressRecRegCountry(String addressRecRegCountry) {
        this.addressRecRegCountry = addressRecRegCountry;
    }

    public String getAddressRecRegEnterType() {
        return addressRecRegEnterType;
    }

    public void setAddressRecRegEnterType(String addressRecRegEnterType) {
        this.addressRecRegEnterType = addressRecRegEnterType;
    }

    public String getAddressRecRegRegion() {
        return addressRecRegRegion;
    }

    public void setAddressRecRegRegion(String addressRecRegRegion) {
        this.addressRecRegRegion = addressRecRegRegion;
    }

    public String getAddressRecRegRayon() {
        return addressRecRegRayon;
    }

    public void setAddressRecRegRayon(String addressRecRegRayon) {
        this.addressRecRegRayon = addressRecRegRayon;
    }

    public String getAddressRecRegSettlementType() {
        return addressRecRegSettlementType;
    }

    public void setAddressRecRegSettlementType(String addressRecRegSettlementType) {
        this.addressRecRegSettlementType = addressRecRegSettlementType;
    }

    public String getAddressRecRegCity() {
        return addressRecRegCity;
    }

    public void setAddressRecRegCity(String addressRecRegCity) {
        this.addressRecRegCity = addressRecRegCity;
    }

    public String getAddressRecRegSettlementText() {
        return addressRecRegSettlementText;
    }

    public void setAddressRecRegSettlementText(String addressRecRegSettlementText) {
        this.addressRecRegSettlementText = addressRecRegSettlementText;
    }

    public String getAddressRecRegSettlementDict() {
        return addressRecRegSettlementDict;
    }

    public void setAddressRecRegSettlementDict(String addressRecRegSettlementDict) {
        this.addressRecRegSettlementDict = addressRecRegSettlementDict;
    }

    public String getAddressRecRegStreetText() {
        return addressRecRegStreetText;
    }

    public void setAddressRecRegStreetText(String addressRecRegStreetText) {
        this.addressRecRegStreetText = addressRecRegStreetText;
    }

    public String getAddressRecRegStreetDict() {
        return addressRecRegStreetDict;
    }

    public void setAddressRecRegStreetDict(String addressRecRegStreetDict) {
        this.addressRecRegStreetDict = addressRecRegStreetDict;
    }

    public String getAddressRecRegHouse() {
        return addressRecRegHouse;
    }

    public void setAddressRecRegHouse(String addressRecRegHouse) {
        this.addressRecRegHouse = addressRecRegHouse;
    }

    public String getAddressRecRegKorpus() {
        return addressRecRegKorpus;
    }

    public void setAddressRecRegKorpus(String addressRecRegKorpus) {
        this.addressRecRegKorpus = addressRecRegKorpus;
    }

    public String getAddressRecRegFlat() {
        return addressRecRegFlat;
    }

    public void setAddressRecRegFlat(String addressRecRegFlat) {
        this.addressRecRegFlat = addressRecRegFlat;
    }

    public String getAddressRecRegSrok() {
        return addressRecRegSrok;
    }

    public void setAddressRecRegSrok(String addressRecRegSrok) {
        this.addressRecRegSrok = addressRecRegSrok;
    }

    public String getRecipientIentityDocType() {
        return recipientIentityDocType;
    }

    public void setRecipientIentityDocType(String recipientIentityDocType) {
        this.recipientIentityDocType = recipientIentityDocType;
    }

    public String getRecipientOtherDocTypeName() {
        return recipientOtherDocTypeName;
    }

    public void setRecipientOtherDocTypeName(String recipientOtherDocTypeName) {
        this.recipientOtherDocTypeName = recipientOtherDocTypeName;
    }

    public String getRecipientPassSeria() {
        return recipientPassSeria;
    }

    public void setRecipientPassSeria(String recipientPassSeria) {
        this.recipientPassSeria = recipientPassSeria;
    }

    public String getRecipientPassNo() {
        return recipientPassNo;
    }

    public void setRecipientPassNo(String recipientPassNo) {
        this.recipientPassNo = recipientPassNo;
    }

    public Date getRecipientPassDate() {
        return recipientPassDate;
    }

    public void setRecipientPassDate(Date recipientPassDate) {
        this.recipientPassDate = recipientPassDate;
    }

    public String getRecipientPassFrom() {
        return recipientPassFrom;
    }

    public void setRecipientPassFrom(String recipientPassFrom) {
        this.recipientPassFrom = recipientPassFrom;
    }

    public FileBean getRecipientIdentityDocLoad() {
        return recipientIdentityDocLoad;
    }

    public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
        this.recipientIdentityDocLoad = recipientIdentityDocLoad;
    }

    public FileBean getRecResidenceDocLoad() {
        return recResidenceDocLoad;
    }

    public void setRecResidenceDocLoad(FileBean recResidenceDocLoad) {
        this.recResidenceDocLoad = recResidenceDocLoad;
    }

    public FileBean getRecRefugeeDocLoad() {
        return recRefugeeDocLoad;
    }

    public void setRecRefugeeDocLoad(FileBean recRefugeeDocLoad) {
        this.recRefugeeDocLoad = recRefugeeDocLoad;
    }

    public String getGoalAppl() {
        return goalAppl;
    }

    public void setGoalAppl(String goalAppl) {
        this.goalAppl = goalAppl;
    }

    public String getSocSupport() {
        return socSupport;
    }

    public void setSocSupport(String socSupport) {
        this.socSupport = socSupport;
    }

    public String getDismissedCh() {
        return dismissedCh;
    }

    public void setDismissedCh(String dismissedCh) {
        this.dismissedCh = dismissedCh;
    }

    public String getWorkLastName() {
        return workLastName;
    }

    public void setWorkLastName(String workLastName) {
        this.workLastName = workLastName;
    }

    public String getWorkFirstName() {
        return workFirstName;
    }

    public void setWorkFirstName(String workFirstName) {
        this.workFirstName = workFirstName;
    }

    public String getWorkMiddleName() {
        return workMiddleName;
    }

    public void setWorkMiddleName(String workMiddleName) {
        this.workMiddleName = workMiddleName;
    }

    public Date getWorkBirthdate() {
        return workBirthdate;
    }

    public void setWorkBirthdate(Date workBirthdate) {
        this.workBirthdate = workBirthdate;
    }

    public FileBean getDisabilityDocLoad() {
        return disabilityDocLoad;
    }

    public void setDisabilityDocLoad(FileBean disabilityDocLoad) {
        this.disabilityDocLoad = disabilityDocLoad;
    }

    public FileBean getEmployDocLoad() {
        return employDocLoad;
    }

    public void setEmployDocLoad(FileBean employDocLoad) {
        this.employDocLoad = employDocLoad;
    }

    public FileBean getWomanDocLoad() {
        return womanDocLoad;
    }

    public void setWomanDocLoad(FileBean womanDocLoad) {
        this.womanDocLoad = womanDocLoad;
    }

    public FileBean getNalogDocLoad() {
        return nalogDocLoad;
    }

    public void setNalogDocLoad(FileBean nalogDocLoad) {
        this.nalogDocLoad = nalogDocLoad;
    }

    public FileBean getUnemployedDocLoad() {
        return unemployedDocLoad;
    }

    public void setUnemployedDocLoad(FileBean unemployedDocLoad) {
        this.unemployedDocLoad = unemployedDocLoad;
    }

    public FileBean getSocDocLoad() {
        return socDocLoad;
    }

    public void setSocDocLoad(FileBean socDocLoad) {
        this.socDocLoad = socDocLoad;
    }

    public FileBean getSocMedDocLoad() {
        return socMedDocLoad;
    }

    public void setSocMedDocLoad(FileBean socMedDocLoad) {
        this.socMedDocLoad = socMedDocLoad;
    }

    public String getWayBenefit() {
        return wayBenefit;
    }

    public void setWayBenefit(String wayBenefit) {
        this.wayBenefit = wayBenefit;
    }

    public String getAddressBenefit() {
        return addressBenefit;
    }

    public void setAddressBenefit(String addressBenefit) {
        this.addressBenefit = addressBenefit;
    }

    public String getNameBankBenefit() {
        return nameBankBenefit;
    }

    public void setNameBankBenefit(String nameBankBenefit) {
        this.nameBankBenefit = nameBankBenefit;
    }

    public String getFilialBankBenefit() {
        return filialBankBenefit;
    }

    public void setFilialBankBenefit(String filialBankBenefit) {
        this.filialBankBenefit = filialBankBenefit;
    }

    public String getBikBankBenefit() {
        return bikBankBenefit;
    }

    public void setBikBankBenefit(String bikBankBenefit) {
        this.bikBankBenefit = bikBankBenefit;
    }

    public String getCorrAccBankBenefit() {
        return corrAccBankBenefit;
    }

    public void setCorrAccBankBenefit(String corrAccBankBenefit) {
        this.corrAccBankBenefit = corrAccBankBenefit;
    }

    public String getCodeFilialBankBenefit() {
        return codeFilialBankBenefit;
    }

    public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
        this.codeFilialBankBenefit = codeFilialBankBenefit;
    }

    public String getClientAccBankBenefit() {
        return clientAccBankBenefit;
    }

    public void setClientAccBankBenefit(String clientAccBankBenefit) {
        this.clientAccBankBenefit = clientAccBankBenefit;
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
}
