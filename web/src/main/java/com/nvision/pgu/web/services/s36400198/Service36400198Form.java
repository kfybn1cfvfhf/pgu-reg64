package com.nvision.pgu.web.services.s36400198;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400198Form extends AbstractServiceOrderForm {

    public void clearApplicantAttributes() {

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

        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");

        this.setPhone("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setBirthdate(null);
        this.setPassDate(null);
        this.setBirthPlace("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
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

        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setBirthPlace("");
    }

			private String birthPlace;


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



			private Date recipientbirthdate;
			private String recipientBirthPlace;


			private String recipientaddressCountry="643";
			private String recipientaddressIndex;
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
			private String recipientaddressCountryCode = "ru";
			private String recipientaddressCountryInput;
            private String recipientaddressCountrySettlement;

			private FileBean houseBookLoad;
			private String agreementApplicant;


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
			private FileBean dovDovLoad;
			private FileBean dovPasLoad;
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
			private String lastName;
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
			private String firstName;
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
			private String middleName;
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE)
			private Date birthdate;
			private String address;

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
			private String phone;
			private String passSeria;
			private String passNo;
			private Date passDate;
			private String passFrom;
			private FileBean identityDocLoad;
			private FileBean dovOpekLoad;
			private String recipientLastName;
			private String recipientFirstName;
			private String recipientMiddleName;
			private Date recipientBirthDate;


			private String recipientPassSeria;
			private String recipientPassNo;
			private Date recipientPassDate;
			private String recipientPassFrom;
			private FileBean recipientIdentityDocLoad;
			private String agreeCh;
			private FileBean houseDocLoad;
            private String rec_address;

    public String getRec_address() {
        return rec_address;
    }

    public void setRec_address(String rec_address) {
        this.rec_address = rec_address;
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
		
	

			public void setDovDovLoad(FileBean dovDovLoad) {
					this.dovDovLoad = dovDovLoad;
				}
			public FileBean getDovDovLoad() {
				return this.dovDovLoad;
				}
		
			//Поле Документ, удостоверяющий личность уполномоченного представителя
			
			public void setDovPasLoad(FileBean dovPasLoad) {
					this.dovPasLoad = dovPasLoad;
				}
			public FileBean getDovPasLoad() {
				return this.dovPasLoad;
				}
		
			//Поле <h2>Сведения о заявителе</h2>
			
			//Поле Фамилия
			
			public void setLastName(String lastName) {
					this.lastName = lastName;
				}
			public String getLastName() {
				return this.lastName;
				}
		
			//Поле Имя
			
			public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
			public String getFirstName() {
				return this.firstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setMiddleName(String middleName) {
					this.middleName = middleName;
				}
			public String getMiddleName() {
				return this.middleName;
				}
		
			//Поле Дата рождения
			
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
				}

			public void setAddress(String address) {
					this.address = address;
				}
			public String getAddress() {
				return this.address;
				}
		

			public void setPhone(String phone) {
					this.phone = phone;
				}
			public String getPhone() {
				return this.phone;
				}
		

			public void setPassSeria(String passSeria) {
					this.passSeria = passSeria;
				}
			public String getPassSeria() {
				return this.passSeria;
				}
		
			//Поле Номер
			
			public void setPassNo(String passNo) {
					this.passNo = passNo;
				}
			public String getPassNo() {
				return this.passNo;
				}
		
			//Поле Дата выдачи
			
			public void setPassDate(Date passDate) {
					this.passDate = passDate;
				}
			public Date getPassDate() {
				return this.passDate;
				}
		
			//Поле Кем выдан
			
			public void setPassFrom(String passFrom) {
					this.passFrom = passFrom;
				}
			public String getPassFrom() {
				return this.passFrom;
				}
		
			//Поле <html><i>
	//Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
	//Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
	//</i></html>
			
			//Поле Паспорт заявителя
			
			public void setIdentityDocLoad(FileBean identityDocLoad) {
					this.identityDocLoad = identityDocLoad;
				}
			public FileBean getIdentityDocLoad() {
				return this.identityDocLoad;
				}
		
			//Поле Документ, подтверждающий факт установления опеки (попечительства)
			
			public void setDovOpekLoad(FileBean dovOpekLoad) {
					this.dovOpekLoad = dovOpekLoad;
				}
			public FileBean getDovOpekLoad() {
				return this.dovOpekLoad;
				}
		
	

			
			public void setRecipientLastName(String recipientLastName) {
					this.recipientLastName = recipientLastName;
				}
			public String getRecipientLastName() {
				return this.recipientLastName;
				}
		
			//Поле Имя
			
			public void setRecipientFirstName(String recipientFirstName) {
					this.recipientFirstName = recipientFirstName;
				}
			public String getRecipientFirstName() {
				return this.recipientFirstName;
				}
		
			//Поле Отчество (если имеется)
			
			public void setRecipientMiddleName(String recipientMiddleName) {
					this.recipientMiddleName = recipientMiddleName;
				}
			public String getRecipientMiddleName() {
				return this.recipientMiddleName;
				}
		
			//Поле Дата рождения
			
			public void setRecipientBirthDate(Date recipientBirthDate) {
					this.recipientBirthDate = recipientBirthDate;
				}
			public Date getRecipientBirthDate() {
				return this.recipientBirthDate;
				}
		


			
			public void setRecipientPassSeria(String recipientPassSeria) {
					this.recipientPassSeria = recipientPassSeria;
				}
			public String getRecipientPassSeria() {
				return this.recipientPassSeria;
				}
		
			//Поле Номер
			
			public void setRecipientPassNo(String recipientPassNo) {
					this.recipientPassNo = recipientPassNo;
				}
			public String getRecipientPassNo() {
				return this.recipientPassNo;
				}
		
			//Поле Дата выдачи
			
			public void setRecipientPassDate(Date recipientPassDate) {
					this.recipientPassDate = recipientPassDate;
				}
			public Date getRecipientPassDate() {
				return this.recipientPassDate;
				}
		
			//Поле Кем выдан
			
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

			public void setAgreeCh(String agreeCh) {
					this.agreeCh = agreeCh;
				}
			public String getAgreeCh() {
				return this.agreeCh;
				}

			
			public void setHouseDocLoad(FileBean houseDocLoad) {
					this.houseDocLoad = houseDocLoad;
				}
			public FileBean getHouseDocLoad() {
				return this.houseDocLoad;
				}

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
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

    public Date getRecipientbirthdate() {
        return recipientbirthdate;
    }

    public void setRecipientbirthdate(Date recipientbirthdate) {
        this.recipientbirthdate = recipientbirthdate;
    }

    public String getRecipientBirthPlace() {
        return recipientBirthPlace;
    }

    public void setRecipientBirthPlace(String recipientBirthPlace) {
        this.recipientBirthPlace = recipientBirthPlace;
    }

    public String getRecipientaddressCountry() {
        return recipientaddressCountry;
    }

    public void setRecipientaddressCountry(String recipientaddressCountry) {
        this.recipientaddressCountry = recipientaddressCountry;
    }

    public String getRecipientaddressIndex() {
        return recipientaddressIndex;
    }

    public void setRecipientaddressIndex(String recipientaddressIndex) {
        this.recipientaddressIndex = recipientaddressIndex;
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

    public FileBean getHouseBookLoad() {
        return houseBookLoad;
    }

    public void setHouseBookLoad(FileBean houseBookLoad) {
        this.houseBookLoad = houseBookLoad;
    }

    public String getAgreementApplicant() {
        return agreementApplicant;
    }

    public void setAgreementApplicant(String agreementApplicant) {
        this.agreementApplicant = agreementApplicant;
    }
}
