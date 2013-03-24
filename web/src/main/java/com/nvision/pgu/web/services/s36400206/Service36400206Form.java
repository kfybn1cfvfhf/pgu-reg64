package com.nvision.pgu.web.services.s36400206;

import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.io.File;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400206Form extends AbstractServiceOrderForm {

    public void clearApplicantAttributes() {

       this.setLastName("");
       this.setFirstName("");
       this.setMiddleName("");
       this.setPhone("");
       this.setEmail("");

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
						
			
			private String dovCategory;
	
			

			
						
									
						
			
			private FileBean dovDovLoad;			
						
			
			private FileBean dovPasLoad;			
						
									
						
			
			private FileBean dovOpekLoad;			
						
						
			
			private String lastName;			
						
			
			private String firstName;			
						
			
			private String middleName;			
						
						
			
			private String addressIndex;			
						
			
			private String addressCountry ="643";
						
			
			private String addressEnterType = "1";
						
			
			private String addressRegion;			
						
			
			private String addressRayon;			
						
			
			private String addressSettlementType = "1";
						
			
			private String addressCity;			
						
			
			private String addressSettlementText;			
						
			
			private String addressSettlementDict;			
						
			
			private String addressStreetText;			
						
			
			private String addressStreetDict;			
						
			
			private String addressHouse;			
						
			
			private String addressKorpus;			
						
			
			private String addressFlat;			
						
						
			
			private String factAddressIndex;			
						
			
			private String factAddressCountry = "643";
						
			
			private String factAddressEnterType = "1";
						
			
			private String factAddressRegion;			
						
			
			private String factAddressRayon;			
						
			
			private String factAddressSettlementType = "1";
						
			
			private String factAddressCity;			
						
			
			private String factAddressSettlementText;			
						
			
			private String factAddressSettlementDict;			
						
			
			private String factAddressStreetText;			
						
			
			private String factAddressStreetDict;			
						
			
			private String factAddressHouse;			
						
			
			private String factAddressKorpus;			
						
			
			private String factAddressFlat;			
						
			
			private String phone;			
						
			
			private String email;			
						
									
						
			
			private FileBean identityDocLoad;			
	
			
						
						
			
			private String recipientLastName;			
						
			
			private String recipientFirstName;			
						
			
			private String recipientMiddleName;			
						
						
			
			private String recipientaddressIndex;			
						
			
			private String recipientaddressCountry = "643";
						
			
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
						
						
			
			private String recipientfactAddressIndex;			
						
			
			private String recipientfactAddressCountry = "643";
						
			
			private String recipientfactAddressEnterType = "1";
						
			
			private String recipientfactAddressRegion;			
						
			
			private String recipientfactAddressRayon;			
						
			
			private String recipientfactAddressSettlementType = "1";
						
			
			private String recipientfactAddressCity;			
						
			
			private String recipientfactAddressSettlementText;			
						
			
			private String recipientfactAddressSettlementDict;			
						
			
			private String recipientfactAddressStreetText;			
						
			
			private String recipientfactAddressStreetDict;			
						
			
			private String recipientfactAddressHouse;			
						
			
			private String recipientfactAddressKorpus;			
						
			
			private String recipientfactAddressFlat;			
						
									
						
			
			private FileBean recipientIdentityDocLoad;			
	
			
						
						
			
			private String org_soc;
						

			private String wayBenefit;
						
			
			private String addressBenefit;			
						
						
			
			private String nameBankBenefit;			
						
			
			private String filialBankBenefit;			
						
			
			private String bikBankBenefit;			
						
			
			private String corrAccBankBenefit;			
						
			
			private String codeFilialBankBenefit;			
						
			
			private String clientAccBankBenefit;			

			private FileBean spravReabilDocLoad;


    private List<FileBean> oplatTelefDocLoad = AccessCounterList.createEmpty(FileBean.class);

    public List<FileBean> getOplatTelefDocLoad() {
        return normalize(oplatTelefDocLoad);
    }

    public void setOplatTelefDocLoad(List<FileBean> oplatTelefDocLoad) {
        this.oplatTelefDocLoad = AccessCounterList.decorate(oplatTelefDocLoad, FileBean.class);
    }

    private String addressCountryCode = "ru";

    private String addressCountryInput;

    private String addressCountrySettlement;

    private String factAddressCountryCode = "ru";

    private String factAddressCountryInput;

    private String factAddressCountrySettlement;

    private String recipientaddressCountryCode = "ru";

    private String recipientaddressCountryInput;

    private String recipientaddressCountrySettlement;

    private String recipientfactAddressCountryCode = "ru";

    private String recipientfactAddressCountryInput;

    private String recipientfactAddressCountrySettlement;

    private String recipientaddressaettlementText;

    public String getRecipientaddressaettlementText() {
        return recipientaddressaettlementText;
    }

    public void setRecipientaddressaettlementText(String recipientaddressaettlementText) {
        this.recipientaddressaettlementText = recipientaddressaettlementText;
    }

    public String getRecipientaddressCountryCode() {
        return recipientaddressCountryCode;
    }

    public void setRecipientaddressCountryCode(String recipientaddressCountryCode) {
        this.recipientaddressCountryCode = recipientaddressCountryCode;
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

    public String getRecipientfactAddressCountryCode() {
        return recipientfactAddressCountryCode;
    }

    public void setRecipientfactAddressCountryCode(String recipientfactAddressCountryCode) {
        this.recipientfactAddressCountryCode = recipientfactAddressCountryCode;
    }

    public String getRecipientfactAddressCountryInput() {
        return recipientfactAddressCountryInput;
    }

    public void setRecipientfactAddressCountryInput(String recipientfactAddressCountryInput) {
        this.recipientfactAddressCountryInput = recipientfactAddressCountryInput;
    }

    public String getRecipientfactAddressCountrySettlement() {
        return recipientfactAddressCountrySettlement;
    }

    public void setRecipientfactAddressCountrySettlement(String recipientfactAddressCountrySettlement) {
        this.recipientfactAddressCountrySettlement = recipientfactAddressCountrySettlement;
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

    public String getDovCategory() {
        return dovCategory;
    }

    public void setDovCategory(String dovCategory) {
        this.dovCategory = dovCategory;
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

    public String getRecipientfactAddressIndex() {
        return recipientfactAddressIndex;
    }

    public void setRecipientfactAddressIndex(String recipientfactAddressIndex) {
        this.recipientfactAddressIndex = recipientfactAddressIndex;
    }

    public String getRecipientfactAddressCountry() {
        return recipientfactAddressCountry;
    }

    public void setRecipientfactAddressCountry(String recipientfactAddressCountry) {
        this.recipientfactAddressCountry = recipientfactAddressCountry;
    }

    public String getRecipientfactAddressEnterType() {
        return recipientfactAddressEnterType;
    }

    public void setRecipientfactAddressEnterType(String recipientfactAddressEnterType) {
        this.recipientfactAddressEnterType = recipientfactAddressEnterType;
    }

    public String getRecipientfactAddressRegion() {
        return recipientfactAddressRegion;
    }

    public void setRecipientfactAddressRegion(String recipientfactAddressRegion) {
        this.recipientfactAddressRegion = recipientfactAddressRegion;
    }

    public String getRecipientfactAddressRayon() {
        return recipientfactAddressRayon;
    }

    public void setRecipientfactAddressRayon(String recipientfactAddressRayon) {
        this.recipientfactAddressRayon = recipientfactAddressRayon;
    }

    public String getRecipientfactAddressSettlementType() {
        return recipientfactAddressSettlementType;
    }

    public void setRecipientfactAddressSettlementType(String recipientfactAddressSettlementType) {
        this.recipientfactAddressSettlementType = recipientfactAddressSettlementType;
    }

    public String getRecipientfactAddressCity() {
        return recipientfactAddressCity;
    }

    public void setRecipientfactAddressCity(String recipientfactAddressCity) {
        this.recipientfactAddressCity = recipientfactAddressCity;
    }

    public String getRecipientfactAddressSettlementText() {
        return recipientfactAddressSettlementText;
    }

    public void setRecipientfactAddressSettlementText(String recipientfactAddressSettlementText) {
        this.recipientfactAddressSettlementText = recipientfactAddressSettlementText;
    }

    public String getRecipientfactAddressSettlementDict() {
        return recipientfactAddressSettlementDict;
    }

    public void setRecipientfactAddressSettlementDict(String recipientfactAddressSettlementDict) {
        this.recipientfactAddressSettlementDict = recipientfactAddressSettlementDict;
    }

    public String getRecipientfactAddressStreetText() {
        return recipientfactAddressStreetText;
    }

    public void setRecipientfactAddressStreetText(String recipientfactAddressStreetText) {
        this.recipientfactAddressStreetText = recipientfactAddressStreetText;
    }

    public String getRecipientfactAddressStreetDict() {
        return recipientfactAddressStreetDict;
    }

    public void setRecipientfactAddressStreetDict(String recipientfactAddressStreetDict) {
        this.recipientfactAddressStreetDict = recipientfactAddressStreetDict;
    }

    public String getRecipientfactAddressHouse() {
        return recipientfactAddressHouse;
    }

    public void setRecipientfactAddressHouse(String recipientfactAddressHouse) {
        this.recipientfactAddressHouse = recipientfactAddressHouse;
    }

    public String getRecipientfactAddressKorpus() {
        return recipientfactAddressKorpus;
    }

    public void setRecipientfactAddressKorpus(String recipientfactAddressKorpus) {
        this.recipientfactAddressKorpus = recipientfactAddressKorpus;
    }

    public String getRecipientfactAddressFlat() {
        return recipientfactAddressFlat;
    }

    public void setRecipientfactAddressFlat(String recipientfactAddressFlat) {
        this.recipientfactAddressFlat = recipientfactAddressFlat;
    }

    public FileBean getRecipientIdentityDocLoad() {
        return recipientIdentityDocLoad;
    }

    public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
        this.recipientIdentityDocLoad = recipientIdentityDocLoad;
    }

    public String getOrg_soc() {
        return org_soc;
    }

    public void setOrg_soc(String org_soc) {
        this.org_soc = org_soc;
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

    public FileBean getSpravReabilDocLoad() {
        return spravReabilDocLoad;
    }

    public void setSpravReabilDocLoad(FileBean spravReabilDocLoad) {
        this.spravReabilDocLoad = spravReabilDocLoad;
    }

}
