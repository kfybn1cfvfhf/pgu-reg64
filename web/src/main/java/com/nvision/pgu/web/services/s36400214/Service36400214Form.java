package com.nvision.pgu.web.services.s36400214;

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
public class Service36400214Form extends AbstractServiceOrderForm {

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
    }


			private String applType;
			private String dov_enable;
			private String dovUlType;
            private Boolean dov_enable_changed = true;
            private Boolean applType_changed = true;
            private Boolean dovUlType_changed = true;
			private FileBean dovDovLoad;
			private FileBean dovPasLoad;
			private String lastName;
			private String firstName;
			private String middleName;
			private String phone;
			private String email;

			private String factAddressCountry="643";
			private String factAddressIndex;
			private String factAddressEnterType;
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
            private String factAddressCountryCode= "ru";
    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }
    public String getFactAddressCountryCode() {
        return this.factAddressCountryCode;
    }

            private String factAddressCountryInput;
    public void setFactAddressCountryInput(String factAddressCountryInput) {
        this.factAddressCountryInput = factAddressCountryInput;
    }
    public String getFactAddressCountryInput() {
        return this.factAddressCountryInput;
    }

            private String factAddressCountrySettlement;
    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }
    public String getFactAddressCountrySettlement() {
        return this.factAddressCountrySettlement;
    }

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

			private String org_addressUrCountry="643";
			private String org_addressUrIndex;
			private String org_addressUrEnterType;
			private String org_addressUrRegion;
			private String org_addressUrRayon;
			private String org_addressUrSettlementType="1";
			private String org_addressUrCity;
			private String org_addressUrSettlementText;
			private String org_addressUrSettlementDict;
			private String org_addressUrStreetText;
			private String org_addressUrStreetDict;
			private String org_addressUrHouse;
			private String org_addressUrKorpus;
			private String org_addressUrFlat;
            private String org_addressUrCountryCode= "ru";
            private String org_addressUrCountryInput;
            private String org_addressUrCountrySettlement;

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

    public String getOrg_addressUrCountrySettlement() {
        return org_addressUrCountrySettlement;
    }

    public void setOrg_addressUrCountrySettlement(String org_addressUrCountrySettlement) {
        this.org_addressUrCountrySettlement = org_addressUrCountrySettlement;
    }


            private String org_addressPostCountry="643";
			private String org_addressPostIndex;
			private String org_addressPostEnterType;
			private String org_addressPostRegion;
			private String org_addressPostRayon;
			private String org_addressPostSettlementType="1";
			private String org_addressPostCity;
			private String org_addressPostSettlementText;
			private String org_addressPostSettlementDict;
			private String org_addressPostStreetText;
			private String org_addressPostStreetDict;
			private String org_addressPostHouse;
			private String org_addressPostKorpus;
			private String org_addressPostFlat;
            private String org_addressPostCountryCode= "ru";
            private String org_addressPostCountryInput;
            private String org_addressPostCountrySettlement;

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

    public String getOrg_addressPostCountrySettlement() {
        return org_addressPostCountrySettlement;
    }

    public void setOrg_addressPostCountrySettlement(String org_addressPostCountrySettlement) {
        this.org_addressPostCountrySettlement = org_addressPostCountrySettlement;
    }

            private String org_phone;
			private String org_fax;
			private String org_email;
			private String org_firstName;
			private String org_lastName;
			private String org_middleName;
			private String objectName;


			private String objectEstateAddressCountry="643";
			private String objectEstateAddressIndex;
			private String objectEstateAddressEnterType;
			private String objectEstateAddressRegion;
			private String objectEstateAddressRayon;
			private String objectEstateAddressSettlementType="1";
			private String objectEstateAddressCity;
			private String objectEstateAddressSettlementText;
			private String objectEstateAddressSettlementDict;
			private String objectEstateAddressStreetText;
			private String objectEstateAddressStreetDict;
			private String objectEstateAddressHouse;
			private String objectEstateAddressKorpus;
			private String objectEstateAddressFlat;
            private String objectEstateAddressCountryCode= "ru";
            private String objectEstateAddressCountryInput;
            private String objectEstateAddressCountrySettlement;

    public String getObjectEstateAddressCountryCode() {
        return objectEstateAddressCountryCode;
    }

    public void setObjectEstateAddressCountryCode(String objectEstateAddressCountryCode) {
        this.objectEstateAddressCountryCode = objectEstateAddressCountryCode;
    }

    public String getObjectEstateAddressCountryInput() {
        return objectEstateAddressCountryInput;
    }

    public void setObjectEstateAddressCountryInput(String objectEstateAddressCountryInput) {
        this.objectEstateAddressCountryInput = objectEstateAddressCountryInput;
    }

    public String getObjectEstateAddressCountrySettlement() {
        return objectEstateAddressCountrySettlement;
    }

    public void setObjectEstateAddressCountrySettlement(String objectEstateAddressCountrySettlement) {
        this.objectEstateAddressCountrySettlement = objectEstateAddressCountrySettlement;
    }

            private String objectEstateSpace;
			private String objectCadastralNumber;
			private FileBean dovApplicantDoc;
			private String waydelivery;


			private String addressPostCountry="643";
			private String addressPostIndex;
			private String addressPostEnterType;
			private String addressPostRegion;
			private String addressPostRayon;
			private String addressPostSettlementType="1";
			private String addressPostCity;
			private String addressPostSettlementText;
			private String addressPostSettlementDict;
			private String addressPostStreetText;
			private String addressPostStreetDict;
			private String addressPostHouse;
			private String addressPostKorpus;
			private String addressPostFlat;
            private String addressPostCountryCode= "ru";
            private String addressPostCountryInput;
            private String addressPostCountrySettlement;

            private String otheradress;

    public String getOtheradress() {
        return otheradress;
    }

    public void setOtheradress(String otheradress) {
        this.otheradress = otheradress;
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

    public String getAddressPostCountrySettlement() {
        return addressPostCountrySettlement;
    }

    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
    }

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
		

			
			public void setDovDovLoad(FileBean dovDovLoad) {
					this.dovDovLoad = dovDovLoad;
				}
			public FileBean getDovDovLoad() {
				return this.dovDovLoad;
				}
		

			
			public void setDovPasLoad(FileBean dovPasLoad) {
					this.dovPasLoad = dovPasLoad;
				}
			public FileBean getDovPasLoad() {
				return this.dovPasLoad;
				}
		

			

			
			public void setLastName(String lastName) {
					this.lastName = lastName;
				}
			public String getLastName() {
				return this.lastName;
				}
		

			
			public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			public String getFirstName() {
				return this.firstName;
				}
		

			
			public void setMiddleName(String middleName) {
					this.middleName = middleName;
				}
			public String getMiddleName() {
				return this.middleName;
				}
		

			

			
			public void setPhone(String phone) {
					this.phone = phone;
				}
			public String getPhone() {
				return this.phone;
				}
		

			
			public void setEmail(String email) {
					this.email = email;
				}
			public String getEmail() {
				return this.email;
				}
		

			

			
			public void setFactAddressCountry(String factAddressCountry) {
					this.factAddressCountry = factAddressCountry;
				}
			public String getFactAddressCountry() {
				return this.factAddressCountry;
				}
		

			
			public void setFactAddressIndex(String factAddressIndex) {
					this.factAddressIndex = factAddressIndex;
				}
			public String getFactAddressIndex() {
				return this.factAddressIndex;
				}
		

			
			public void setFactAddressEnterType(String factAddressEnterType) {
					this.factAddressEnterType = factAddressEnterType;
				}
			public String getFactAddressEnterType() {
				return this.factAddressEnterType;
				}
		

			
			public void setFactAddressRegion(String factAddressRegion) {
					this.factAddressRegion = factAddressRegion;
				}
			public String getFactAddressRegion() {
				return this.factAddressRegion;
				}
		

			
			public void setFactAddressRayon(String factAddressRayon) {
					this.factAddressRayon = factAddressRayon;
				}
			public String getFactAddressRayon() {
				return this.factAddressRayon;
				}
		

			
			public void setFactAddressSettlementType(String factAddressSettlementType) {
					this.factAddressSettlementType = factAddressSettlementType;
				}
			public String getFactAddressSettlementType() {
				return this.factAddressSettlementType;
				}
		

			
			public void setFactAddressCity(String factAddressCity) {
					this.factAddressCity = factAddressCity;
				}
			public String getFactAddressCity() {
				return this.factAddressCity;
				}
		

			
			public void setFactAddressSettlementText(String factAddressSettlementText) {
					this.factAddressSettlementText = factAddressSettlementText;
				}
			public String getFactAddressSettlementText() {
				return this.factAddressSettlementText;
				}
		

			
			public void setFactAddressSettlementDict(String factAddressSettlementDict) {
					this.factAddressSettlementDict = factAddressSettlementDict;
				}
			public String getFactAddressSettlementDict() {
				return this.factAddressSettlementDict;
				}
		

			
			public void setFactAddressStreetText(String factAddressStreetText) {
					this.factAddressStreetText = factAddressStreetText;
				}
			public String getFactAddressStreetText() {
				return this.factAddressStreetText;
				}
		

			
			public void setFactAddressStreetDict(String factAddressStreetDict) {
					this.factAddressStreetDict = factAddressStreetDict;
				}
			public String getFactAddressStreetDict() {
				return this.factAddressStreetDict;
				}
		

			
			public void setFactAddressHouse(String factAddressHouse) {
					this.factAddressHouse = factAddressHouse;
				}
			public String getFactAddressHouse() {
				return this.factAddressHouse;
				}
		

			
			public void setFactAddressKorpus(String factAddressKorpus) {
					this.factAddressKorpus = factAddressKorpus;
				}
			public String getFactAddressKorpus() {
				return this.factAddressKorpus;
				}
		

			
			public void setFactAddressFlat(String factAddressFlat) {
					this.factAddressFlat = factAddressFlat;
				}
			public String getFactAddressFlat() {
				return this.factAddressFlat;
				}
		

			

			
			public void setIdentityDocType(String identityDocType) {
					this.identityDocType = identityDocType;
				}
			public String getIdentityDocType() {
				return this.identityDocType;
				}
		

			
			public void setOtherDocTypeName(String otherDocTypeName) {
					this.otherDocTypeName = otherDocTypeName;
				}
			public String getOtherDocTypeName() {
				return this.otherDocTypeName;
				}
		

			
			public void setPassSeria(String passSeria) {
					this.passSeria = passSeria;
				}
			public String getPassSeria() {
				return this.passSeria;
				}
		

			
			public void setPassNo(String passNo) {
					this.passNo = passNo;
				}
			public String getPassNo() {
				return this.passNo;
				}
		

			
			public void setPassDate(Date passDate) {
					this.passDate = passDate;
				}
			public Date getPassDate() {
				return this.passDate;
				}
		

			
			public void setPassFrom(String passFrom) {
					this.passFrom = passFrom;
				}
			public String getPassFrom() {
				return this.passFrom;
				}
		




			

			
			public void setIdentityDocLoad(FileBean identityDocLoad) {
					this.identityDocLoad = identityDocLoad;
				}
			public FileBean getIdentityDocLoad() {
				return this.identityDocLoad;
				}
		
	

		

			




			

			
			public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
					this.dovUlNonDovLoad = dovUlNonDovLoad;
				}
			public FileBean getDovUlNonDovLoad() {
				return this.dovUlNonDovLoad;
				}
		



			
			public void setDovUlDovLoad(FileBean dovUlDovLoad) {
					this.dovUlDovLoad = dovUlDovLoad;
				}
			public FileBean getDovUlDovLoad() {
				return this.dovUlDovLoad;
				}
		

			
			public void setDovUlPasLoad(FileBean dovUlPasLoad) {
					this.dovUlPasLoad = dovUlPasLoad;
				}
			public FileBean getDovUlPasLoad() {
				return this.dovUlPasLoad;
				}
		

			

			
			public void setOrg_FullTitle(String org_FullTitle) {
					this.org_FullTitle = org_FullTitle;
				}
			public String getOrg_FullTitle() {
				return this.org_FullTitle;
				}
		

			
			public void setOrg_opf(String org_opf) {
					this.org_opf = org_opf;
				}
			public String getOrg_opf() {
				return this.org_opf;
				}
		

			
			public void setOrg_SmallTitle(String org_SmallTitle) {
					this.org_SmallTitle = org_SmallTitle;
				}
			public String getOrg_SmallTitle() {
				return this.org_SmallTitle;
				}
		

			

			
			public void setOrg_addressUrCountry(String org_addressUrCountry) {
					this.org_addressUrCountry = org_addressUrCountry;
				}
			public String getOrg_addressUrCountry() {
				return this.org_addressUrCountry;
				}
		

			
			public void setOrg_addressUrIndex(String org_addressUrIndex) {
					this.org_addressUrIndex = org_addressUrIndex;
				}
			public String getOrg_addressUrIndex() {
				return this.org_addressUrIndex;
				}
		

			
			public void setOrg_addressUrEnterType(String org_addressUrEnterType) {
					this.org_addressUrEnterType = org_addressUrEnterType;
				}
			public String getOrg_addressUrEnterType() {
				return this.org_addressUrEnterType;
				}
		

			
			public void setOrg_addressUrRegion(String org_addressUrRegion) {
					this.org_addressUrRegion = org_addressUrRegion;
				}
			public String getOrg_addressUrRegion() {
				return this.org_addressUrRegion;
				}
		

			
			public void setOrg_addressUrRayon(String org_addressUrRayon) {
					this.org_addressUrRayon = org_addressUrRayon;
				}
			public String getOrg_addressUrRayon() {
				return this.org_addressUrRayon;
				}
		

			
			public void setOrg_addressUrSettlementType(String org_addressUrSettlementType) {
					this.org_addressUrSettlementType = org_addressUrSettlementType;
				}
			public String getOrg_addressUrSettlementType() {
				return this.org_addressUrSettlementType;
				}
		

			
			public void setOrg_addressUrCity(String org_addressUrCity) {
					this.org_addressUrCity = org_addressUrCity;
				}
			public String getOrg_addressUrCity() {
				return this.org_addressUrCity;
				}
		

			
			public void setOrg_addressUrSettlementText(String org_addressUrSettlementText) {
					this.org_addressUrSettlementText = org_addressUrSettlementText;
				}
			public String getOrg_addressUrSettlementText() {
				return this.org_addressUrSettlementText;
				}
		

			
			public void setOrg_addressUrSettlementDict(String org_addressUrSettlementDict) {
					this.org_addressUrSettlementDict = org_addressUrSettlementDict;
				}
			public String getOrg_addressUrSettlementDict() {
				return this.org_addressUrSettlementDict;
				}
		

			
			public void setOrg_addressUrStreetText(String org_addressUrStreetText) {
					this.org_addressUrStreetText = org_addressUrStreetText;
				}
			public String getOrg_addressUrStreetText() {
				return this.org_addressUrStreetText;
				}
		

			
			public void setOrg_addressUrStreetDict(String org_addressUrStreetDict) {
					this.org_addressUrStreetDict = org_addressUrStreetDict;
				}
			public String getOrg_addressUrStreetDict() {
				return this.org_addressUrStreetDict;
				}
		

			
			public void setOrg_addressUrHouse(String org_addressUrHouse) {
					this.org_addressUrHouse = org_addressUrHouse;
				}
			public String getOrg_addressUrHouse() {
				return this.org_addressUrHouse;
				}
		

			
			public void setOrg_addressUrKorpus(String org_addressUrKorpus) {
					this.org_addressUrKorpus = org_addressUrKorpus;
				}
			public String getOrg_addressUrKorpus() {
				return this.org_addressUrKorpus;
				}
		

			
			public void setOrg_addressUrFlat(String org_addressUrFlat) {
					this.org_addressUrFlat = org_addressUrFlat;
				}
			public String getOrg_addressUrFlat() {
				return this.org_addressUrFlat;
				}
		

			

			
			public void setOrg_addressPostCountry(String org_addressPostCountry) {
					this.org_addressPostCountry = org_addressPostCountry;
				}
			public String getOrg_addressPostCountry() {
				return this.org_addressPostCountry;
				}
		

			
			public void setOrg_addressPostIndex(String org_addressPostIndex) {
					this.org_addressPostIndex = org_addressPostIndex;
				}
			public String getOrg_addressPostIndex() {
				return this.org_addressPostIndex;
				}
		

			
			public void setOrg_addressPostEnterType(String org_addressPostEnterType) {
					this.org_addressPostEnterType = org_addressPostEnterType;
				}
			public String getOrg_addressPostEnterType() {
				return this.org_addressPostEnterType;
				}
		

			
			public void setOrg_addressPostRegion(String org_addressPostRegion) {
					this.org_addressPostRegion = org_addressPostRegion;
				}
			public String getOrg_addressPostRegion() {
				return this.org_addressPostRegion;
				}
		

			
			public void setOrg_addressPostRayon(String org_addressPostRayon) {
					this.org_addressPostRayon = org_addressPostRayon;
				}
			public String getOrg_addressPostRayon() {
				return this.org_addressPostRayon;
				}
		

			
			public void setOrg_addressPostSettlementType(String org_addressPostSettlementType) {
					this.org_addressPostSettlementType = org_addressPostSettlementType;
				}
			public String getOrg_addressPostSettlementType() {
				return this.org_addressPostSettlementType;
				}
		

			
			public void setOrg_addressPostCity(String org_addressPostCity) {
					this.org_addressPostCity = org_addressPostCity;
				}
			public String getOrg_addressPostCity() {
				return this.org_addressPostCity;
				}
		

			
			public void setOrg_addressPostSettlementText(String org_addressPostSettlementText) {
					this.org_addressPostSettlementText = org_addressPostSettlementText;
				}
			public String getOrg_addressPostSettlementText() {
				return this.org_addressPostSettlementText;
				}
		

			
			public void setOrg_addressPostSettlementDict(String org_addressPostSettlementDict) {
					this.org_addressPostSettlementDict = org_addressPostSettlementDict;
				}
			public String getOrg_addressPostSettlementDict() {
				return this.org_addressPostSettlementDict;
				}
		

			
			public void setOrg_addressPostStreetText(String org_addressPostStreetText) {
					this.org_addressPostStreetText = org_addressPostStreetText;
				}
			public String getOrg_addressPostStreetText() {
				return this.org_addressPostStreetText;
				}
		

			
			public void setOrg_addressPostStreetDict(String org_addressPostStreetDict) {
					this.org_addressPostStreetDict = org_addressPostStreetDict;
				}
			public String getOrg_addressPostStreetDict() {
				return this.org_addressPostStreetDict;
				}
		

			
			public void setOrg_addressPostHouse(String org_addressPostHouse) {
					this.org_addressPostHouse = org_addressPostHouse;
				}
			public String getOrg_addressPostHouse() {
				return this.org_addressPostHouse;
				}
		

			
			public void setOrg_addressPostKorpus(String org_addressPostKorpus) {
					this.org_addressPostKorpus = org_addressPostKorpus;
				}
			public String getOrg_addressPostKorpus() {
				return this.org_addressPostKorpus;
				}
		

			
			public void setOrg_addressPostFlat(String org_addressPostFlat) {
					this.org_addressPostFlat = org_addressPostFlat;
				}
			public String getOrg_addressPostFlat() {
				return this.org_addressPostFlat;
				}
		

			

			
			public void setOrg_phone(String org_phone) {
					this.org_phone = org_phone;
				}
			public String getOrg_phone() {
				return this.org_phone;
				}
		

			
			public void setOrg_fax(String org_fax) {
					this.org_fax = org_fax;
				}
			public String getOrg_fax() {
				return this.org_fax;
				}
		

			
			public void setOrg_email(String org_email) {
					this.org_email = org_email;
				}
			public String getOrg_email() {
				return this.org_email;
				}
		

			

			
			public void setOrg_firstName(String org_firstName) {
					this.org_firstName = org_firstName;
				}
			public String getOrg_firstName() {
				return this.org_firstName;
				}
		

			
			public void setOrg_lastName(String org_lastName) {
					this.org_lastName = org_lastName;
				}
			public String getOrg_lastName() {
				return this.org_lastName;
				}
		

			
			public void setOrg_middleName(String org_middleName) {
					this.org_middleName = org_middleName;
				}
			public String getOrg_middleName() {
				return this.org_middleName;
				}
		
	

		

			

			
			public void setObjectName(String objectName) {
					this.objectName = objectName;
				}
			public String getObjectName() {
				return this.objectName;
				}
		

			

			
			public void setObjectEstateAddressCountry(String objectEstateAddressCountry) {
					this.objectEstateAddressCountry = objectEstateAddressCountry;
				}
			public String getObjectEstateAddressCountry() {
				return this.objectEstateAddressCountry;
				}
		

			
			public void setObjectEstateAddressIndex(String objectEstateAddressIndex) {
					this.objectEstateAddressIndex = objectEstateAddressIndex;
				}
			public String getObjectEstateAddressIndex() {
				return this.objectEstateAddressIndex;
				}
		

			
			public void setObjectEstateAddressEnterType(String objectEstateAddressEnterType) {
					this.objectEstateAddressEnterType = objectEstateAddressEnterType;
				}
			public String getObjectEstateAddressEnterType() {
				return this.objectEstateAddressEnterType;
				}
		

			
			public void setObjectEstateAddressRegion(String objectEstateAddressRegion) {
					this.objectEstateAddressRegion = objectEstateAddressRegion;
				}
			public String getObjectEstateAddressRegion() {
				return this.objectEstateAddressRegion;
				}
		

			
			public void setObjectEstateAddressRayon(String objectEstateAddressRayon) {
					this.objectEstateAddressRayon = objectEstateAddressRayon;
				}
			public String getObjectEstateAddressRayon() {
				return this.objectEstateAddressRayon;
				}
		

			
			public void setObjectEstateAddressSettlementType(String objectEstateAddressSettlementType) {
					this.objectEstateAddressSettlementType = objectEstateAddressSettlementType;
				}
			public String getObjectEstateAddressSettlementType() {
				return this.objectEstateAddressSettlementType;
				}
		

			
			public void setObjectEstateAddressCity(String objectEstateAddressCity) {
					this.objectEstateAddressCity = objectEstateAddressCity;
				}
			public String getObjectEstateAddressCity() {
				return this.objectEstateAddressCity;
				}
		

			
			public void setObjectEstateAddressSettlementText(String objectEstateAddressSettlementText) {
					this.objectEstateAddressSettlementText = objectEstateAddressSettlementText;
				}
			public String getObjectEstateAddressSettlementText() {
				return this.objectEstateAddressSettlementText;
				}
		

			
			public void setObjectEstateAddressSettlementDict(String objectEstateAddressSettlementDict) {
					this.objectEstateAddressSettlementDict = objectEstateAddressSettlementDict;
				}
			public String getObjectEstateAddressSettlementDict() {
				return this.objectEstateAddressSettlementDict;
				}
		

			
			public void setObjectEstateAddressStreetText(String objectEstateAddressStreetText) {
					this.objectEstateAddressStreetText = objectEstateAddressStreetText;
				}
			public String getObjectEstateAddressStreetText() {
				return this.objectEstateAddressStreetText;
				}
		

			
			public void setObjectEstateAddressStreetDict(String objectEstateAddressStreetDict) {
					this.objectEstateAddressStreetDict = objectEstateAddressStreetDict;
				}
			public String getObjectEstateAddressStreetDict() {
				return this.objectEstateAddressStreetDict;
				}
		

			
			public void setObjectEstateAddressHouse(String objectEstateAddressHouse) {
					this.objectEstateAddressHouse = objectEstateAddressHouse;
				}
			public String getObjectEstateAddressHouse() {
				return this.objectEstateAddressHouse;
				}
		

			
			public void setObjectEstateAddressKorpus(String objectEstateAddressKorpus) {
					this.objectEstateAddressKorpus = objectEstateAddressKorpus;
				}
			public String getObjectEstateAddressKorpus() {
				return this.objectEstateAddressKorpus;
				}
		

			
			public void setObjectEstateAddressFlat(String objectEstateAddressFlat) {
					this.objectEstateAddressFlat = objectEstateAddressFlat;
				}
			public String getObjectEstateAddressFlat() {
				return this.objectEstateAddressFlat;
				}
		

			
			public void setObjectEstateSpace(String objectEstateSpace) {
					this.objectEstateSpace = objectEstateSpace;
				}
			public String getObjectEstateSpace() {
				return this.objectEstateSpace;
				}
		

			
			public void setObjectCadastralNumber(String objectCadastralNumber) {
					this.objectCadastralNumber = objectCadastralNumber;
				}
			public String getObjectCadastralNumber() {
				return this.objectCadastralNumber;
				}
		




			

			
			public void setDovApplicantDoc(FileBean dovApplicantDoc) {
					this.dovApplicantDoc = dovApplicantDoc;
				}
			public FileBean getDovApplicantDoc() {
				return this.dovApplicantDoc;
				}
		
	

		

			

			
			public void setWaydelivery(String waydelivery) {
					this.waydelivery = waydelivery;
				}
			public String getWaydelivery() {
				return this.waydelivery;
				}
		

			

			
			public void setAddressPostCountry(String addressPostCountry) {
					this.addressPostCountry = addressPostCountry;
				}
			public String getAddressPostCountry() {
				return this.addressPostCountry;
				}
		

			
			public void setAddressPostIndex(String addressPostIndex) {
					this.addressPostIndex = addressPostIndex;
				}
			public String getAddressPostIndex() {
				return this.addressPostIndex;
				}
		

			
			public void setAddressPostEnterType(String addressPostEnterType) {
					this.addressPostEnterType = addressPostEnterType;
				}
			public String getAddressPostEnterType() {
				return this.addressPostEnterType;
				}
		

			
			public void setAddressPostRegion(String addressPostRegion) {
					this.addressPostRegion = addressPostRegion;
				}
			public String getAddressPostRegion() {
				return this.addressPostRegion;
				}
		

			
			public void setAddressPostRayon(String addressPostRayon) {
					this.addressPostRayon = addressPostRayon;
				}
			public String getAddressPostRayon() {
				return this.addressPostRayon;
				}
		

			
			public void setAddressPostSettlementType(String addressPostSettlementType) {
					this.addressPostSettlementType = addressPostSettlementType;
				}
			public String getAddressPostSettlementType() {
				return this.addressPostSettlementType;
				}
		

			
			public void setAddressPostCity(String addressPostCity) {
					this.addressPostCity = addressPostCity;
				}
			public String getAddressPostCity() {
				return this.addressPostCity;
				}
		

			
			public void setAddressPostSettlementText(String addressPostSettlementText) {
					this.addressPostSettlementText = addressPostSettlementText;
				}
			public String getAddressPostSettlementText() {
				return this.addressPostSettlementText;
				}
		

			
			public void setAddressPostSettlementDict(String addressPostSettlementDict) {
					this.addressPostSettlementDict = addressPostSettlementDict;
				}
			public String getAddressPostSettlementDict() {
				return this.addressPostSettlementDict;
				}
		

			
			public void setAddressPostStreetText(String addressPostStreetText) {
					this.addressPostStreetText = addressPostStreetText;
				}
			public String getAddressPostStreetText() {
				return this.addressPostStreetText;
				}
		

			
			public void setAddressPostStreetDict(String addressPostStreetDict) {
					this.addressPostStreetDict = addressPostStreetDict;
				}
			public String getAddressPostStreetDict() {
				return this.addressPostStreetDict;
				}
		

			
			public void setAddressPostHouse(String addressPostHouse) {
					this.addressPostHouse = addressPostHouse;
				}
			public String getAddressPostHouse() {
				return this.addressPostHouse;
				}
		

			
			public void setAddressPostKorpus(String addressPostKorpus) {
					this.addressPostKorpus = addressPostKorpus;
				}
			public String getAddressPostKorpus() {
				return this.addressPostKorpus;
				}
		

			
			public void setAddressPostFlat(String addressPostFlat) {
					this.addressPostFlat = addressPostFlat;
				}
			public String getAddressPostFlat() {
				return this.addressPostFlat;
				}


	
		}
