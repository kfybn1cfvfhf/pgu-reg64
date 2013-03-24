package com.nvision.pgu.web.services.s36400108;

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
public class Service36400108Form extends AbstractServiceOrderForm {

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

        this.setSnils("");
        this.setBirthdate(null);
        this.setSex("");


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
        this.setSnils(privateRoomDataContainer.getSnils());
        this.setSex(privateRoomDataContainer.getSex());

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

            private String sex;
			private String dov_enable;
            private Boolean dov_enable_changed = true;

            public Boolean getDov_enable_changed() {
                return dov_enable_changed;
            }

            public void setDov_enable_changed(Boolean dov_enable_changed) {
                this.dov_enable_changed = dov_enable_changed;
            }
			private String incapable_enable;
			private String dovCategory;
			private FileBean dovDovLoad;
			private FileBean dovPasLoad;
			private FileBean dovOpekLoad;
			private String lastName;
			private String firstName;
			private String middleName;
			private String snils;
			private Date birthdate;
			private String politicalNationality;
			private String addressIndex;
			private String addressCountry="643";
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
			private String factAddressIndex;
			private String factAddressCountry="643";
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
			private String addressPostIndex;
			private String addressPostCountry="643";
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
			private String recipientSnils;
			private Date recipientBirthdate;
			private String recipientBirthPlace;
			private String recipientSex;
			private String recipientpoliticalNationality;
			private String recipientaddressIndex;
			private String recipientaddressCountry="643";
			private String recipientaddressEnterType;
			private String recipientaddressRegion;
			private String recipientaddressRayon;
			private String recipientaddressSettlementType="1";
			private String recipientaddressCity;
			private String recipientaddressSettlementText;
			private String recipientaddressSettlementDict;
			private String recipientaddressStreetText;
			private String recipientaddressStreetDict;
			private String recipientaddressHouse;
			private String recipientaddressKorpus;
			private String recipientaddressFlat;
			private String recipientIentityDocType;
			private String recipientOtherDocTypeName;
			private String recipientPassSeria;
			private String recipientPassNo;
			private Date recipientPassDate;
			private String recipientPassFrom;
			private FileBean recipientIdentityDocLoad;
			private String seriaMedPolice;
			private String noMedPolice;
			private String nameOrgMedPolice;
			private String grInvalid1;
			private String grInvalid2;
			private String grInvalid3;
			private String childInvalid;
			private String fullLifeInvalid;
			private String socStatus;
			private String wayDeliveryBenefit;
			private FileBean epicrisisDocLoad;
		    private String recipientIdentityDocType;

           private String rec_address;
           private String address;
           private String grInvalid;

    public String getGrInvalid() {
        return grInvalid;
    }

    public void setGrInvalid(String grInvalid) {
        this.grInvalid = grInvalid;
    }

    public String getRec_address() {
        return rec_address;
    }

    public void setRec_address(String rec_address) {
        this.rec_address = rec_address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String addressCountryCode = "ru";
    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }
    public String getAddressCountryCode() {
        return this.addressCountryCode;
    }

    private String addressCountryInput;
    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }
    public String getAddressCountryInput() {
        return this.addressCountryInput;
    }

    private String addressCountrySettlement;
    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }
    public String getAddressCountrySettlement() {
        return this.addressCountrySettlement;
    }

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
    private String recipientAddressCountryCode="ru";
    private String recipientAddressCountryInput;
    private String recipientAddressCountrySettlement;
    private String addressPostCountryCode="ru";
    private String addressPostCountryInput;
    private String addressPostCountrySettlement;

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

    public String getRecipientAddressCountryCode() {
        return recipientAddressCountryCode;
    }

    public void setRecipientAddressCountryCode(String recipientAddressCountryCode) {
        this.recipientAddressCountryCode = recipientAddressCountryCode;
    }

    public String getRecipientAddressCountryInput() {
        return recipientAddressCountryInput;
    }

    public void setRecipientAddressCountryInput(String recipientAddressCountryInput) {
        this.recipientAddressCountryInput = recipientAddressCountryInput;
    }

    public String getRecipientAddressCountrySettlement() {
        return recipientAddressCountrySettlement;
    }

    public void setRecipientAddressCountrySettlement(String recipientAddressCountrySettlement) {
        this.recipientAddressCountrySettlement = recipientAddressCountrySettlement;
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
		

			
			public void setIncapable_enable(String incapable_enable) {
					this.incapable_enable = incapable_enable;
				}
			  public String getIncapable_enable() {
        return incapable_enable == null ? "off" : incapable_enable;
    }

			public void setRecipientLastName(String recipientLastName) {
					this.recipientLastName = recipientLastName;
				}
			public String getRecipientLastName() {
				return this.recipientLastName;
				}
		

			
			public void setRecipientFirstName(String recipientFirstName) {
					this.recipientFirstName = recipientFirstName;
				}
			public String getRecipientFirstName() {
				return this.recipientFirstName;
				}
		

			
			public void setRecipientMiddleName(String recipientMiddleName) {
					this.recipientMiddleName = recipientMiddleName;
				}
			public String getRecipientMiddleName() {
				return this.recipientMiddleName;
				}

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setRecipientSnils(String recipientSnils) {
					this.recipientSnils = recipientSnils;
				}
			public String getRecipientSnils() {
				return this.recipientSnils;
				}
		

			
			public void setRecipientBirthdate(Date recipientBirthdate) {
					this.recipientBirthdate = recipientBirthdate;
				}
			public Date getRecipientBirthdate() {
				return this.recipientBirthdate;
				}
		

			
			public void setRecipientBirthPlace(String recipientBirthPlace) {
					this.recipientBirthPlace = recipientBirthPlace;
				}
			public String getRecipientBirthPlace() {
				return this.recipientBirthPlace;
				}


    public String getRecipientSex() {
        return recipientSex;
    }

    public void setRecipientSex(String recipientSex) {
        this.recipientSex = recipientSex;
    }

    public void setRecipientpoliticalNationality(String recipientpoliticalNationality) {
					this.recipientpoliticalNationality = recipientpoliticalNationality;
				}
			public String getRecipientpoliticalNationality() {
				return this.recipientpoliticalNationality;
				}
		

			

			
			public void setRecipientaddressIndex(String recipientaddressIndex) {
					this.recipientaddressIndex = recipientaddressIndex;
				}
			public String getRecipientaddressIndex() {
				return this.recipientaddressIndex;
				}
		

			
			public void setRecipientaddressCountry(String recipientaddressCountry) {
					this.recipientaddressCountry = recipientaddressCountry;
				}
			public String getRecipientaddressCountry() {
				return this.recipientaddressCountry;
				}
		

			
			public void setRecipientaddressEnterType(String recipientaddressEnterType) {
					this.recipientaddressEnterType = recipientaddressEnterType;
				}
			public String getRecipientaddressEnterType() {
				return this.recipientaddressEnterType;
				}
		

			
			public void setRecipientaddressRegion(String recipientaddressRegion) {
					this.recipientaddressRegion = recipientaddressRegion;
				}
			public String getRecipientaddressRegion() {
				return this.recipientaddressRegion;
				}
		

			
			public void setRecipientaddressRayon(String recipientaddressRayon) {
					this.recipientaddressRayon = recipientaddressRayon;
				}
			public String getRecipientaddressRayon() {
				return this.recipientaddressRayon;
				}
		

			
			public void setRecipientaddressSettlementType(String recipientaddressSettlementType) {
					this.recipientaddressSettlementType = recipientaddressSettlementType;
				}
			public String getRecipientaddressSettlementType() {
				return this.recipientaddressSettlementType;
				}
		

			
			public void setRecipientaddressCity(String recipientaddressCity) {
					this.recipientaddressCity = recipientaddressCity;
				}
			public String getRecipientaddressCity() {
				return this.recipientaddressCity;
				}
		

			
			public void setRecipientaddressSettlementText(String recipientaddressSettlementText) {
					this.recipientaddressSettlementText = recipientaddressSettlementText;
				}
			public String getRecipientaddressSettlementText() {
				return this.recipientaddressSettlementText;
				}
		

			
			public void setRecipientaddressSettlementDict(String recipientaddressSettlementDict) {
					this.recipientaddressSettlementDict = recipientaddressSettlementDict;
				}
			public String getRecipientaddressSettlementDict() {
				return this.recipientaddressSettlementDict;
				}
		

			
			public void setRecipientaddressStreetText(String recipientaddressStreetText) {
					this.recipientaddressStreetText = recipientaddressStreetText;
				}
			public String getRecipientaddressStreetText() {
				return this.recipientaddressStreetText;
				}
		

			
			public void setRecipientaddressStreetDict(String recipientaddressStreetDict) {
					this.recipientaddressStreetDict = recipientaddressStreetDict;
				}
			public String getRecipientaddressStreetDict() {
				return this.recipientaddressStreetDict;
				}
		

			
			public void setRecipientaddressHouse(String recipientaddressHouse) {
					this.recipientaddressHouse = recipientaddressHouse;
				}
			public String getRecipientaddressHouse() {
				return this.recipientaddressHouse;
				}
		

			
			public void setRecipientaddressKorpus(String recipientaddressKorpus) {
					this.recipientaddressKorpus = recipientaddressKorpus;
				}
			public String getRecipientaddressKorpus() {
				return this.recipientaddressKorpus;
				}
		

			
			public void setRecipientaddressFlat(String recipientaddressFlat) {
					this.recipientaddressFlat = recipientaddressFlat;
				}
			public String getRecipientaddressFlat() {
				return this.recipientaddressFlat;
				}
		

			

			
			public void setRecipientIentityDocType(String recipientIentityDocType) {
					this.recipientIentityDocType = recipientIentityDocType;
				}
			public String getRecipientIentityDocType() {
				return this.recipientIentityDocType;
				}
		

			
			public void setRecipientOtherDocTypeName(String recipientOtherDocTypeName) {
					this.recipientOtherDocTypeName = recipientOtherDocTypeName;
				}
			public String getRecipientOtherDocTypeName() {
				return this.recipientOtherDocTypeName;
				}
		

			
			public void setRecipientPassSeria(String recipientPassSeria) {
					this.recipientPassSeria = recipientPassSeria;
				}
			public String getRecipientPassSeria() {
				return this.recipientPassSeria;
				}
		

			
			public void setRecipientPassNo(String recipientPassNo) {
					this.recipientPassNo = recipientPassNo;
				}
			public String getRecipientPassNo() {
				return this.recipientPassNo;
				}
		

			
			public void setRecipientPassDate(Date recipientPassDate) {
					this.recipientPassDate = recipientPassDate;
				}
			public Date getRecipientPassDate() {
				return this.recipientPassDate;
				}
		

			
			public void setRecipientPassFrom(String recipientPassFrom) {
					this.recipientPassFrom = recipientPassFrom;
				}
			public String getRecipientPassFrom() {
				return this.recipientPassFrom;
				}
		




			

			
			public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
					this.recipientIdentityDocLoad = recipientIdentityDocLoad;
				}
			public FileBean getRecipientIdentityDocLoad() {
				return this.recipientIdentityDocLoad;
				}
		
	

		

			

			
			public void setSeriaMedPolice(String seriaMedPolice) {
					this.seriaMedPolice = seriaMedPolice;
				}
			public String getSeriaMedPolice() {
				return this.seriaMedPolice;
				}
		

			
			public void setNoMedPolice(String noMedPolice) {
					this.noMedPolice = noMedPolice;
				}
			public String getNoMedPolice() {
				return this.noMedPolice;
				}
		

			
			public void setNameOrgMedPolice(String nameOrgMedPolice) {
					this.nameOrgMedPolice = nameOrgMedPolice;
				}
			public String getNameOrgMedPolice() {
				return this.nameOrgMedPolice;
				}

			public void setChildInvalid(String childInvalid) {
					this.childInvalid = childInvalid;
				}
			public String getChildInvalid() {
				return this.childInvalid;
				}
		

			
			public void setFullLifeInvalid(String fullLifeInvalid) {
					this.fullLifeInvalid = fullLifeInvalid;
				}
			public String getFullLifeInvalid() {
				return this.fullLifeInvalid;
				}
		

			

			
			public void setSocStatus(String socStatus) {
					this.socStatus = socStatus;
				}
			public String getSocStatus() {
				return this.socStatus;
				}
		

			

			
			public void setWayDeliveryBenefit(String wayDeliveryBenefit) {
					this.wayDeliveryBenefit = wayDeliveryBenefit;
				}
			public String getWayDeliveryBenefit() {
				return this.wayDeliveryBenefit;
				}
		




			

			
			public void setEpicrisisDocLoad(FileBean epicrisisDocLoad) {
					this.epicrisisDocLoad = epicrisisDocLoad;
				}
			public FileBean getEpicrisisDocLoad() {
				return this.epicrisisDocLoad;
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

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
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

    public String getAddressPostIndex() {
        return addressPostIndex;
    }

    public void setAddressPostIndex(String addressPostIndex) {
        this.addressPostIndex = addressPostIndex;
    }

    public String getAddressPostCountry() {
        return addressPostCountry;
    }

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
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

    public String getAddressPostSettlementType() {
        return addressPostSettlementType;
    }

    public void setAddressPostSettlementType(String addressPostSettlementType) {
        this.addressPostSettlementType = addressPostSettlementType;
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

    public String getGrInvalid1() {
        return grInvalid1;
    }

    public void setGrInvalid1(String grInvalid1) {
        this.grInvalid1 = grInvalid1;
    }

    public String getGrInvalid2() {
        return grInvalid2;
    }

    public void setGrInvalid2(String grInvalid2) {
        this.grInvalid2 = grInvalid2;
    }

    public String getGrInvalid3() {
        return grInvalid3;
    }

    public void setGrInvalid3(String grInvalid3) {
        this.grInvalid3 = grInvalid3;
    }

    public String getRecipientIdentityDocType() {
        return recipientIdentityDocType;
    }

    public void setRecipientIdentityDocType(String recipientIdentityDocType) {
        this.recipientIdentityDocType = recipientIdentityDocType;
    }
}
