package com.nvision.pgu.web.services.s36400238;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400238Form extends AbstractServiceOrderForm {

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
			private String phone;
			private String email;
			private FileBean identityDocLoad;
			private String recipientLastName;
			private String recipientFirstName;
			private String recipientMiddleName;
			private String rec_addressIndex;
			private String rec_addressCountry="643";
			private String rec_addressEnterType;
			private String rec_addressRegion;
			private String rec_addressRayon;
			private String rec_addressSettlementType="1";
			private String rec_addressCity;
			private String rec_addressSettlementText;
			private String rec_addressSettlementDict;
			private String rec_addressStreetText;
			private String rec_addressStreetDict;
			private String rec_addressHouse;
			private String rec_addressKorpus;
			private String rec_addressFlat;
			private String rec_factAddressIndex;
			private String rec_factAddressCountry="643";
			private String rec_factAddressEnterType;
    		private String rec_factAddressRegion;
			private String rec_factAddressRayon;
			private String rec_factAddressSettlementType="1";
			private String rec_factAddressCity;
			private String rec_factAddressSettlementText;
			private String rec_factAddressSettlementDict;
			private String rec_factAddressStreetText;
			private String rec_factAddressStreetDict;
			private String rec_factAddressHouse;
			private String rec_factAddressKorpus;
			private String rec_factAddressFlat;
			private FileBean recipientIdentityDocLoad;
			private String wayBenefit;
			private String addressBenefit;
			private String nameBankBenefit;
			private String filialBankBenefit;
			private String bikBankBenefit;
			private String corrAccBankBenefit;
			private String codeFilialBankBenefit;
			private String clientAccBankBenefit;
			private String org_soc;
			private String wayService;
			private String noTrudKnig;
			private String pens;
			private String noCentrOtoplen;
			private String socRab;
			private FileBean svidRegDocLoad;
			private FileBean trudKnigDocLoad;
			private FileBean sprTrudDocLoad;
			private FileBean sostFamilyDocLoad;
			private FileBean pensDocLoad;
			private FileBean pechDocLoad;
			private FileBean techPaspDocLoad;
			private FileBean trudDogDocLoad;
			private FileBean sprSocRabDocLoad;
			private String agree;
		    private String addressCountryCode = "ru";
            private String factAddressCountryCode = "ru";
            private String rec_AddressCountryCode = "ru";
            private String rec_factAddressCountryCode = "ru";
	        private String addressCountryInput;
            private String factAddressCountryInput;
            private String rec_AddressCountryInput;
	        private String rec_factAddressCountryInput;
            private String addressCountrySettlement;
		    private String factAddressCountrySettlement;
            private String rec_AddressCountrySettlement;
			private String rec_factAddressCountrySettlement;

    private String rec_address;
    private String rec_factAddress;
    private String address;


    public String getRec_address() {
        return rec_address;
    }

    public void setRec_address(String rec_address) {
        this.rec_address = rec_address;
    }

    public String getRec_factAddress() {
        return rec_factAddress;
    }

    public void setRec_factAddress(String rec_factAddress) {
        this.rec_factAddress = rec_factAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getFactAddressCountryCode() {
        return factAddressCountryCode;
    }

    public void setFactAddressCountryCode(String factAddressCountryCode) {
        this.factAddressCountryCode = factAddressCountryCode;
    }

    public String getRec_AddressCountryCode() {
        return rec_AddressCountryCode;
    }

    public void setRec_AddressCountryCode(String rec_AddressCountryCode) {
        this.rec_AddressCountryCode = rec_AddressCountryCode;
    }

    public String getRec_factAddressCountryCode() {
        return rec_factAddressCountryCode;
    }

    public void setRec_factAddressCountryCode(String rec_factAddressCountryCode) {
        this.rec_factAddressCountryCode = rec_factAddressCountryCode;
    }

    public String getAddressCountryInput() {
        return addressCountryInput;
    }

    public void setAddressCountryInput(String addressCountryInput) {
        this.addressCountryInput = addressCountryInput;
    }

    public String getFactAddressCountryInput() {
        return factAddressCountryInput;
    }

    public void setFactAddressCountryInput(String factAddressCountryInput) {
        this.factAddressCountryInput = factAddressCountryInput;
    }

    public String getRec_AddressCountryInput() {
        return rec_AddressCountryInput;
    }

    public void setRec_AddressCountryInput(String rec_AddressCountryInput) {
        this.rec_AddressCountryInput = rec_AddressCountryInput;
    }

    public String getRec_factAddressCountryInput() {
        return rec_factAddressCountryInput;
    }

    public void setRec_factAddressCountryInput(String rec_factAddressCountryInput) {
        this.rec_factAddressCountryInput = rec_factAddressCountryInput;
    }

    public String getAddressCountrySettlement() {
        return addressCountrySettlement;
    }

    public void setAddressCountrySettlement(String addressCountrySettlement) {
        this.addressCountrySettlement = addressCountrySettlement;
    }

    public String getFactAddressCountrySettlement() {
        return factAddressCountrySettlement;
    }

    public void setFactAddressCountrySettlement(String factAddressCountrySettlement) {
        this.factAddressCountrySettlement = factAddressCountrySettlement;
    }

    public String getRec_AddressCountrySettlement() {
        return rec_AddressCountrySettlement;
    }

    public void setRec_AddressCountrySettlement(String rec_AddressCountrySettlement) {
        this.rec_AddressCountrySettlement = rec_AddressCountrySettlement;
    }

    public String getRec_factAddressCountrySettlement() {
        return rec_factAddressCountrySettlement;
    }

    public void setRec_factAddressCountrySettlement(String rec_factAddressCountrySettlement) {
        this.rec_factAddressCountrySettlement = rec_factAddressCountrySettlement;
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
		

			

			
			public void setRec_addressIndex(String rec_addressIndex) {
					this.rec_addressIndex = rec_addressIndex;
				}
			public String getRec_addressIndex() {
				return this.rec_addressIndex;
				}
		
			public void setRec_addressEnterType(String rec_addressEnterType) {
					this.rec_addressEnterType = rec_addressEnterType;
				}
			public String getRec_addressEnterType() {
				return this.rec_addressEnterType;
				}
		

			
			public void setRec_addressRegion(String rec_addressRegion) {
					this.rec_addressRegion = rec_addressRegion;
				}
			public String getRec_addressRegion() {
				return this.rec_addressRegion;
				}
		

			
			public void setRec_addressRayon(String rec_addressRayon) {
					this.rec_addressRayon = rec_addressRayon;
				}
			public String getRec_addressRayon() {
				return this.rec_addressRayon;
				}
		

			
			public void setRec_addressSettlementType(String rec_addressSettlementType) {
					this.rec_addressSettlementType = rec_addressSettlementType;
				}
			public String getRec_addressSettlementType() {
				return this.rec_addressSettlementType;
				}
		

			
			public void setRec_addressCity(String rec_addressCity) {
					this.rec_addressCity = rec_addressCity;
				}
			public String getRec_addressCity() {
				return this.rec_addressCity;
				}
		

			
			public void setRec_addressSettlementText(String rec_addressSettlementText) {
					this.rec_addressSettlementText = rec_addressSettlementText;
				}
			public String getRec_addressSettlementText() {
				return this.rec_addressSettlementText;
				}
		

			
			public void setRec_addressSettlementDict(String rec_addressSettlementDict) {
					this.rec_addressSettlementDict = rec_addressSettlementDict;
				}
			public String getRec_addressSettlementDict() {
				return this.rec_addressSettlementDict;
				}
		

			
			public void setRec_addressStreetText(String rec_addressStreetText) {
					this.rec_addressStreetText = rec_addressStreetText;
				}
			public String getRec_addressStreetText() {
				return this.rec_addressStreetText;
				}
		

			
			public void setRec_addressStreetDict(String rec_addressStreetDict) {
					this.rec_addressStreetDict = rec_addressStreetDict;
				}
			public String getRec_addressStreetDict() {
				return this.rec_addressStreetDict;
				}
		

			
			public void setRec_addressHouse(String rec_addressHouse) {
					this.rec_addressHouse = rec_addressHouse;
				}
			public String getRec_addressHouse() {
				return this.rec_addressHouse;
				}
		

			
			public void setRec_addressKorpus(String rec_addressKorpus) {
					this.rec_addressKorpus = rec_addressKorpus;
				}
			public String getRec_addressKorpus() {
				return this.rec_addressKorpus;
				}
		

			
			public void setRec_addressFlat(String rec_addressFlat) {
					this.rec_addressFlat = rec_addressFlat;
				}
			public String getRec_addressFlat() {
				return this.rec_addressFlat;
				}
		

			

			
			public void setRec_factAddressIndex(String rec_factAddressIndex) {
					this.rec_factAddressIndex = rec_factAddressIndex;
				}
			public String getRec_factAddressIndex() {
				return this.rec_factAddressIndex;
				}
		
			public void setRec_factAddressEnterType(String rec_factAddressEnterType) {
					this.rec_factAddressEnterType = rec_factAddressEnterType;
				}
			public String getRec_factAddressEnterType() {
				return this.rec_factAddressEnterType;
				}
		

			
			public void setRec_factAddressRegion(String rec_factAddressRegion) {
					this.rec_factAddressRegion = rec_factAddressRegion;
				}
			public String getRec_factAddressRegion() {
				return this.rec_factAddressRegion;
				}
		

			
			public void setRec_factAddressRayon(String rec_factAddressRayon) {
					this.rec_factAddressRayon = rec_factAddressRayon;
				}
			public String getRec_factAddressRayon() {
				return this.rec_factAddressRayon;
				}
		

			
			public void setRec_factAddressSettlementType(String rec_factAddressSettlementType) {
					this.rec_factAddressSettlementType = rec_factAddressSettlementType;
				}
			public String getRec_factAddressSettlementType() {
				return this.rec_factAddressSettlementType;
				}
		

			
			public void setRec_factAddressCity(String rec_factAddressCity) {
					this.rec_factAddressCity = rec_factAddressCity;
				}
			public String getRec_factAddressCity() {
				return this.rec_factAddressCity;
				}
		

			
			public void setRec_factAddressSettlementText(String rec_factAddressSettlementText) {
					this.rec_factAddressSettlementText = rec_factAddressSettlementText;
				}
			public String getRec_factAddressSettlementText() {
				return this.rec_factAddressSettlementText;
				}
		

			
			public void setRec_factAddressSettlementDict(String rec_factAddressSettlementDict) {
					this.rec_factAddressSettlementDict = rec_factAddressSettlementDict;
				}
			public String getRec_factAddressSettlementDict() {
				return this.rec_factAddressSettlementDict;
				}
		

			
			public void setRec_factAddressStreetText(String rec_factAddressStreetText) {
					this.rec_factAddressStreetText = rec_factAddressStreetText;
				}
			public String getRec_factAddressStreetText() {
				return this.rec_factAddressStreetText;
				}
		

			
			public void setRec_factAddressStreetDict(String rec_factAddressStreetDict) {
					this.rec_factAddressStreetDict = rec_factAddressStreetDict;
				}
			public String getRec_factAddressStreetDict() {
				return this.rec_factAddressStreetDict;
				}
		

			
			public void setRec_factAddressHouse(String rec_factAddressHouse) {
					this.rec_factAddressHouse = rec_factAddressHouse;
				}
			public String getRec_factAddressHouse() {
				return this.rec_factAddressHouse;
				}
		

			
			public void setRec_factAddressKorpus(String rec_factAddressKorpus) {
					this.rec_factAddressKorpus = rec_factAddressKorpus;
				}
			public String getRec_factAddressKorpus() {
				return this.rec_factAddressKorpus;
				}
		

			
			public void setRec_factAddressFlat(String rec_factAddressFlat) {
					this.rec_factAddressFlat = rec_factAddressFlat;
				}
			public String getRec_factAddressFlat() {
				return this.rec_factAddressFlat;
				}
		
			public void setRecipientIdentityDocLoad(FileBean recipientIdentityDocLoad) {
					this.recipientIdentityDocLoad = recipientIdentityDocLoad;
				}
			public FileBean getRecipientIdentityDocLoad() {
				return this.recipientIdentityDocLoad;
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
		

			public void setNoTrudKnig(String noTrudKnig) {
					this.noTrudKnig = noTrudKnig;
				}
			public String getNoTrudKnig() {
				return this.noTrudKnig;
				}
		

			
			public void setPens(String pens) {
					this.pens = pens;
				}
			public String getPens() {
				return this.pens;
				}
		

			
			public void setNoCentrOtoplen(String noCentrOtoplen) {
					this.noCentrOtoplen = noCentrOtoplen;
				}
			public String getNoCentrOtoplen() {
				return this.noCentrOtoplen;
				}
		

			
			public void setSocRab(String socRab) {
					this.socRab = socRab;
				}
			public String getSocRab() {
				return this.socRab;
				}
		

			public void setSvidRegDocLoad(FileBean svidRegDocLoad) {
					this.svidRegDocLoad = svidRegDocLoad;
				}
			public FileBean getSvidRegDocLoad() {
				return this.svidRegDocLoad;
				}
		

			
			public void setTrudKnigDocLoad(FileBean trudKnigDocLoad) {
					this.trudKnigDocLoad = trudKnigDocLoad;
				}
			public FileBean getTrudKnigDocLoad() {
				return this.trudKnigDocLoad;
				}
		

			
			public void setSprTrudDocLoad(FileBean sprTrudDocLoad) {
					this.sprTrudDocLoad = sprTrudDocLoad;
				}
			public FileBean getSprTrudDocLoad() {
				return this.sprTrudDocLoad;
				}
		

			
			public void setSostFamilyDocLoad(FileBean sostFamilyDocLoad) {
					this.sostFamilyDocLoad = sostFamilyDocLoad;
				}
			public FileBean getSostFamilyDocLoad() {
				return this.sostFamilyDocLoad;
				}
		

			
			public void setPensDocLoad(FileBean pensDocLoad) {
					this.pensDocLoad = pensDocLoad;
				}
			public FileBean getPensDocLoad() {
				return this.pensDocLoad;
				}
		

			
			public void setPechDocLoad(FileBean pechDocLoad) {
					this.pechDocLoad = pechDocLoad;
				}
			public FileBean getPechDocLoad() {
				return this.pechDocLoad;
				}
		

			
			public void setTechPaspDocLoad(FileBean techPaspDocLoad) {
					this.techPaspDocLoad = techPaspDocLoad;
				}
			public FileBean getTechPaspDocLoad() {
				return this.techPaspDocLoad;
				}
		

			
			public void setTrudDogDocLoad(FileBean trudDogDocLoad) {
					this.trudDogDocLoad = trudDogDocLoad;
				}
			public FileBean getTrudDogDocLoad() {
				return this.trudDogDocLoad;
				}
		

			
			public void setSprSocRabDocLoad(FileBean sprSocRabDocLoad) {
					this.sprSocRabDocLoad = sprSocRabDocLoad;
				}
			public FileBean getSprSocRabDocLoad() {
				return this.sprSocRabDocLoad;
				}

			public void setAgree(String agree) {
					this.agree = agree;
				}
			public String getAgree() {
				return this.agree;
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

    public String getRec_addressCountry() {
        return rec_addressCountry;
    }

    public void setRec_addressCountry(String rec_addressCountry) {
        this.rec_addressCountry = rec_addressCountry;
    }

    public String getRec_factAddressCountry() {
        return rec_factAddressCountry;
    }

    public void setRec_factAddressCountry(String rec_factAddressCountry) {
        this.rec_factAddressCountry = rec_factAddressCountry;
    }

    public String getWayBenefit() {
        return wayBenefit;
    }

    public void setWayBenefit(String wayBenefit) {
        this.wayBenefit = wayBenefit;
    }

    public String getOrg_soc() {
        return org_soc;
    }

    public void setOrg_soc(String org_soc) {
        this.org_soc = org_soc;
    }

    public String getWayService() {
        return wayService;
    }

    public void setWayService(String wayService) {
        this.wayService = wayService;
    }
}
