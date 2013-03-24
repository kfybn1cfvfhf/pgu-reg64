package com.nvision.pgu.web.services.s36400110;

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
public class Service36400110Form extends AbstractServiceOrderForm {
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

                   public Boolean getDov_enable_changed() {
                       return dov_enable_changed;
                   }

                   public void setDov_enable_changed(Boolean dov_enable_changed) {
                       this.dov_enable_changed = dov_enable_changed;
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
			private String addressPostEnterType="1";
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
			private String socialSupport;
			private String preferentialStatus;
			private String wayService;
			private String agreementApplicant;
			private String wayBenefit;
			private String addressBenefit;
			private String nameBankBenefit;
			private String filialBankBenefit;
			private String bikBankBenefit;
			private String corrAccBankBenefit;
			private String codeFilialBankBenefit;
			private String clientAccBankBenefit;
			private FileBean svidRegDocLoad;
			private FileBean udostVeteranDocLoad;
			private FileBean udostVeteranSODocLoad;
			private FileBean veteranVOVDocLoad;
			private FileBean spravPostradRepresDocLoad;
			private FileBean pensiaDocLoad;
			private FileBean reabilDocLoad;
            private String recipientIdentityDocType;

    public String getRecipientIdentityDocType() {
        return recipientIdentityDocType;
    }

    public void setRecipientIdentityDocType(String recipientIdentityDocType) {
        this.recipientIdentityDocType = recipientIdentityDocType;
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
		

			
			public void setDovCategory(String dovCategory) {
					this.dovCategory = dovCategory;
				}
			public String getDovCategory() {
				return this.dovCategory;
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
		

			public void setDovOpekLoad(FileBean dovOpekLoad) {
					this.dovOpekLoad = dovOpekLoad;
				}
			public FileBean getDovOpekLoad() {
				return this.dovOpekLoad;
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

			
			public void setAddressIndex(String addressIndex) {
					this.addressIndex = addressIndex;
				}
			public String getAddressIndex() {
				return this.addressIndex;
				}
		

			
			public void setAddressEnterType(String addressEnterType) {
					this.addressEnterType = addressEnterType;
				}
			public String getAddressEnterType() {
				return this.addressEnterType;
				}
		

			
			public void setAddressRegion(String addressRegion) {
					this.addressRegion = addressRegion;
				}
			public String getAddressRegion() {
				return this.addressRegion;
				}
		

			
			public void setAddressRayon(String addressRayon) {
					this.addressRayon = addressRayon;
				}
			public String getAddressRayon() {
				return this.addressRayon;
				}
		

			
			public void setAddressSettlementType(String addressSettlementType) {
					this.addressSettlementType = addressSettlementType;
				}
			public String getAddressSettlementType() {
				return this.addressSettlementType;
				}
		

			
			public void setAddressCity(String addressCity) {
					this.addressCity = addressCity;
				}
			public String getAddressCity() {
				return this.addressCity;
				}
		

			
			public void setAddressSettlementText(String addressSettlementText) {
					this.addressSettlementText = addressSettlementText;
				}
			public String getAddressSettlementText() {
				return this.addressSettlementText;
				}
		

			
			public void setAddressSettlementDict(String addressSettlementDict) {
					this.addressSettlementDict = addressSettlementDict;
				}
			public String getAddressSettlementDict() {
				return this.addressSettlementDict;
				}
		

			
			public void setAddressStreetText(String addressStreetText) {
					this.addressStreetText = addressStreetText;
				}
			public String getAddressStreetText() {
				return this.addressStreetText;
				}
		

			
			public void setAddressStreetDict(String addressStreetDict) {
					this.addressStreetDict = addressStreetDict;
				}
			public String getAddressStreetDict() {
				return this.addressStreetDict;
				}
		

			
			public void setAddressHouse(String addressHouse) {
					this.addressHouse = addressHouse;
				}
			public String getAddressHouse() {
				return this.addressHouse;
				}
		

			
			public void setAddressKorpus(String addressKorpus) {
					this.addressKorpus = addressKorpus;
				}
			public String getAddressKorpus() {
				return this.addressKorpus;
				}
		

			
			public void setAddressFlat(String addressFlat) {
					this.addressFlat = addressFlat;
				}
			public String getAddressFlat() {
				return this.addressFlat;
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

			public void setRecipientaddressIndex(String recipientaddressIndex) {
					this.recipientaddressIndex = recipientaddressIndex;
				}
			public String getRecipientaddressIndex() {
				return this.recipientaddressIndex;
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
		

			public void setAgreementApplicant(String agreementApplicant) {
					this.agreementApplicant = agreementApplicant;
				}
			public String getAgreementApplicant() {
				return this.agreementApplicant;
				}
		

			public void setAddressBenefit(String addressBenefit) {
					this.addressBenefit = addressBenefit;
				}
			public String getAddressBenefit() {
				return this.addressBenefit;
				}
		

			

			
			public void setNameBankBenefit(String nameBankBenefit) {
					this.nameBankBenefit = nameBankBenefit;
				}
			public String getNameBankBenefit() {
				return this.nameBankBenefit;
				}
		

			
			public void setFilialBankBenefit(String filialBankBenefit) {
					this.filialBankBenefit = filialBankBenefit;
				}
			public String getFilialBankBenefit() {
				return this.filialBankBenefit;
				}
		

			
			public void setBikBankBenefit(String bikBankBenefit) {
					this.bikBankBenefit = bikBankBenefit;
				}
			public String getBikBankBenefit() {
				return this.bikBankBenefit;
				}
		

			
			public void setCorrAccBankBenefit(String corrAccBankBenefit) {
					this.corrAccBankBenefit = corrAccBankBenefit;
				}
			public String getCorrAccBankBenefit() {
				return this.corrAccBankBenefit;
				}
		

			
			public void setCodeFilialBankBenefit(String codeFilialBankBenefit) {
					this.codeFilialBankBenefit = codeFilialBankBenefit;
				}
			public String getCodeFilialBankBenefit() {
				return this.codeFilialBankBenefit;
				}
		

			
			public void setClientAccBankBenefit(String clientAccBankBenefit) {
					this.clientAccBankBenefit = clientAccBankBenefit;
				}
			public String getClientAccBankBenefit() {
				return this.clientAccBankBenefit;
				}
		




			

			
			public void setSvidRegDocLoad(FileBean svidRegDocLoad) {
					this.svidRegDocLoad = svidRegDocLoad;
				}
			public FileBean getSvidRegDocLoad() {
				return this.svidRegDocLoad;
				}
		

			
			public void setUdostVeteranDocLoad(FileBean udostVeteranDocLoad) {
					this.udostVeteranDocLoad = udostVeteranDocLoad;
				}
			public FileBean getUdostVeteranDocLoad() {
				return this.udostVeteranDocLoad;
				}
		

			
			public void setUdostVeteranSODocLoad(FileBean udostVeteranSODocLoad) {
					this.udostVeteranSODocLoad = udostVeteranSODocLoad;
				}
			public FileBean getUdostVeteranSODocLoad() {
				return this.udostVeteranSODocLoad;
				}
		

			
			public void setVeteranVOVDocLoad(FileBean veteranVOVDocLoad) {
					this.veteranVOVDocLoad = veteranVOVDocLoad;
				}
			public FileBean getVeteranVOVDocLoad() {
				return this.veteranVOVDocLoad;
				}
		

			
			public void setSpravPostradRepresDocLoad(FileBean spravPostradRepresDocLoad) {
					this.spravPostradRepresDocLoad = spravPostradRepresDocLoad;
				}
			public FileBean getSpravPostradRepresDocLoad() {
				return this.spravPostradRepresDocLoad;
				}
		

			
			public void setPensiaDocLoad(FileBean pensiaDocLoad) {
					this.pensiaDocLoad = pensiaDocLoad;
				}
			public FileBean getPensiaDocLoad() {
				return this.pensiaDocLoad;
				}
		

			

			
			public void setReabilDocLoad(FileBean reabilDocLoad) {
					this.reabilDocLoad = reabilDocLoad;
				}
			public FileBean getReabilDocLoad() {
				return this.reabilDocLoad;
				}

    public String getPoliticalNationality() {
        return politicalNationality;
    }

    public void setPoliticalNationality(String politicalNationality) {
        this.politicalNationality = politicalNationality;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
    }

    public String getAddressPostCountry() {
        return addressPostCountry;
    }

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
    }

    public String getRecipientpoliticalNationality() {
        return recipientpoliticalNationality;
    }

    public void setRecipientpoliticalNationality(String recipientpoliticalNationality) {
        this.recipientpoliticalNationality = recipientpoliticalNationality;
    }

    public String getRecipientaddressCountry() {
        return recipientaddressCountry;
    }

    public void setRecipientaddressCountry(String recipientaddressCountry) {
        this.recipientaddressCountry = recipientaddressCountry;
    }

    public String getSocialSupport() {
        return socialSupport;
    }

    public void setSocialSupport(String socialSupport) {
        this.socialSupport = socialSupport;
    }

    public String getPreferentialStatus() {
        return preferentialStatus;
    }

    public void setPreferentialStatus(String preferentialStatus) {
        this.preferentialStatus = preferentialStatus;
    }

    public String getWayService() {
        return wayService;
    }

    public void setWayService(String wayService) {
        this.wayService = wayService;
    }

    public String getWayBenefit() {
        return wayBenefit;
    }

    public void setWayBenefit(String wayBenefit) {
        this.wayBenefit = wayBenefit;
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

}
