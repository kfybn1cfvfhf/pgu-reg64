package com.nvision.pgu.web.services.s36400120;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400120Form extends AbstractServiceOrderForm {


			private String lonelyCh;
			private String dov_enable;
			private String incapable_enable;
			private String dovCategory;	//64_DOV_CATEGORY_64206
			private FileBean dovDovLoad;
			private FileBean dovPasLoad;
			private FileBean dovOpekLoad;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String middleName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SNILS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String snils;

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String email;
			private String identityDocType="Паспорт гражданина РФ";

			private String passSeria;
			private String passNo;
			private Date passDate;
			private String passFrom;
			private FileBean identityDocLoad;
			private String recipientLastName;
			private String recipientFirstName;
			private String recipientMiddleName;
			private String recipientSnils;
			private String recipientAddress;
			private String recipientIdentityDocType="Паспорт гражданина РФ";

			private String recipientPassSeria;
			private String recipientPassNo;
			private Date recipientPassDate;
			private String recipientPassFrom;
			private FileBean recipientIdentityDocLoad;


            private List<String> fam_member_lastName= AccessCounterList.createEmpty(String.class);
            private List<String> fam_member_firstName= AccessCounterList.createEmpty(String.class);
            private List<String> fam_member_middleName= AccessCounterList.createEmpty(String.class);
			private List<String> fam_member_snils= AccessCounterList.createEmpty(String.class);
			private List<String> fam_member_kin= AccessCounterList.createEmpty(String.class);



			private String fam_member_identityDocType;
			private List<FileBean> fam_member_identityDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> fam_member_kinDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private String sitizenCategory;	//64_CATEGORY_OF_SITIZENS_120
			private String applReason;	//64_REASON_OF_APPLICATION
			private List<FileBean> regDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> techDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private FileBean rightDocLoad;
			private List<FileBean> incomeDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> otherDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> gosRegDocLoad = AccessCounterList.createEmpty(FileBean.class);
			private FileBean opfDocLoad;
			private FileBean socDocLoad;
			private FileBean egrpDocLoad;
			private List<FileBean> gosRegChangeDocLoad  = AccessCounterList.createEmpty(FileBean.class);
			private FileBean dogovorDocLoad;
		
	
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

    		private String recipientAddressCountry="643";
			private String recipientAddressIndex;
			private String recipientAddressEnterType;
			private String recipientAddressRegion;
			private String recipientAddressRayon;
			private String recipientAddressSettlementType="1";
			private String recipientAddressCity;
			private String recipientAddressSettlementText;
			private String recipientAddressSettlementDict;
			private String recipientAddressStreetText;
			private String recipientAddressStreetDict;
			private String recipientAddressHouse;
			private String recipientAddressKorpus;
			private String recipientAddressFlat;
            private String recipientAddressCountryCode = "ru";
            private String recipientAddressCountryInput;
            private String recipientAddressCountrySettlement;


    public String getRecipientAddressCountry() {
        return recipientAddressCountry;
    }

    public void setRecipientAddressCountry(String recipientAddressCountry) {
        this.recipientAddressCountry = recipientAddressCountry;
    }

    public String getRecipientAddressIndex() {
        return recipientAddressIndex;
    }

    public void setRecipientAddressIndex(String recipientAddressIndex) {
        this.recipientAddressIndex = recipientAddressIndex;
    }

    public String getRecipientAddressEnterType() {
        return recipientAddressEnterType;
    }

    public void setRecipientAddressEnterType(String recipientAddressEnterType) {
        this.recipientAddressEnterType = recipientAddressEnterType;
    }

    public String getRecipientAddressRegion() {
        return recipientAddressRegion;
    }

    public void setRecipientAddressRegion(String recipientAddressRegion) {
        this.recipientAddressRegion = recipientAddressRegion;
    }

    public String getRecipientAddressRayon() {
        return recipientAddressRayon;
    }

    public void setRecipientAddressRayon(String recipientAddressRayon) {
        this.recipientAddressRayon = recipientAddressRayon;
    }

    public String getRecipientAddressSettlementType() {
        return recipientAddressSettlementType;
    }

    public void setRecipientAddressSettlementType(String recipientAddressSettlementType) {
        this.recipientAddressSettlementType = recipientAddressSettlementType;
    }

    public String getRecipientAddressCity() {
        return recipientAddressCity;
    }

    public void setRecipientAddressCity(String recipientAddressCity) {
        this.recipientAddressCity = recipientAddressCity;
    }

    public String getRecipientAddressSettlementText() {
        return recipientAddressSettlementText;
    }

    public void setRecipientAddressSettlementText(String recipientAddressSettlementText) {
        this.recipientAddressSettlementText = recipientAddressSettlementText;
    }

    public String getRecipientAddressSettlementDict() {
        return recipientAddressSettlementDict;
    }

    public void setRecipientAddressSettlementDict(String recipientAddressSettlementDict) {
        this.recipientAddressSettlementDict = recipientAddressSettlementDict;
    }

    public String getRecipientAddressStreetText() {
        return recipientAddressStreetText;
    }

    public void setRecipientAddressStreetText(String recipientAddressStreetText) {
        this.recipientAddressStreetText = recipientAddressStreetText;
    }

    public String getRecipientAddressStreetDict() {
        return recipientAddressStreetDict;
    }

    public void setRecipientAddressStreetDict(String recipientAddressStreetDict) {
        this.recipientAddressStreetDict = recipientAddressStreetDict;
    }

    public String getRecipientAddressHouse() {
        return recipientAddressHouse;
    }

    public void setRecipientAddressHouse(String recipientAddressHouse) {
        this.recipientAddressHouse = recipientAddressHouse;
    }

    public String getRecipientAddressKorpus() {
        return recipientAddressKorpus;
    }

    public void setRecipientAddressKorpus(String recipientAddressKorpus) {
        this.recipientAddressKorpus = recipientAddressKorpus;
    }

    public String getRecipientAddressFlat() {
        return recipientAddressFlat;
    }

    public void setRecipientAddressFlat(String recipientAddressFlat) {
        this.recipientAddressFlat = recipientAddressFlat;
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

    //Закладка Тип заявителя
		
			//Поле Заявитель является одиноким
            public void setLonelyCh(String lonelyCh) {
                if (this.lonelyCh != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
                    if (lonelyCh == null) {  // с вэб-формы пришёл off
                        this.lonelyCh = "off";
                    } else {
                        this.lonelyCh = lonelyCh;
                    }
                } else {
                    this.lonelyCh = lonelyCh;
                }

            }
    public String getLonelyCh() {
        return lonelyCh == null ? "off" : this.lonelyCh;
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
    public String getDov_enable() {
        return dov_enable == null ? "off" : this.dov_enable;
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
    public String getIncapable_enable() {
        return incapable_enable == null ? "off" : this.incapable_enable;
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
		
			public void setSnils(String snils) {
					this.snils = snils;
				}
			public String getSnils() {
				return this.snils;
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
		
			public void setRecipientSnils(String recipientSnils) {
					this.recipientSnils = recipientSnils;
				}
			public String getRecipientSnils() {
				return this.recipientSnils;
				}
		
			public void setRecipientAddress(String recipientAddress) {
					this.recipientAddress = recipientAddress;
				}
			public String getRecipientAddress() {
				return this.recipientAddress;
				}
		
			public void setRecipientIdentityDocType(String recipientIdentityDocType) {
					this.recipientIdentityDocType = recipientIdentityDocType;
				}
			public String getRecipientIdentityDocType() {
				return this.recipientIdentityDocType;
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


    public List<String> getFam_member_lastName() {
        return fam_member_lastName;
    }

    public void setFam_member_lastName(List<String> fam_member_lastName) {
        this.fam_member_lastName =  AccessCounterList.decorate(fam_member_lastName, String.class);
    }

    public List<String> getFam_member_firstName() {
        return fam_member_firstName;
    }

    public void setFam_member_firstName(List<String> fam_member_firstName) {
        this.fam_member_firstName =  AccessCounterList.decorate(fam_member_firstName, String.class);
    }

    public List<String> getFam_member_middleName() {
        return fam_member_middleName;
    }

    public void setFam_member_middleName(List<String> fam_member_middleName) {
        this.fam_member_middleName = AccessCounterList.decorate(fam_member_middleName, String.class);
    }

    public void setFam_member_snils(List<String> fam_member_snils) {
					this.fam_member_snils = AccessCounterList.decorate(fam_member_snils, String.class);
				}
			public List<String> getFam_member_snils() {
				return normalize(this.fam_member_snils);
				}
		
			public void setFam_member_kin(List<String> fam_member_kin) {
					this.fam_member_kin = AccessCounterList.decorate(fam_member_kin, String.class);
				}
			public List<String> getFam_member_kin() {
				return normalize(this.fam_member_kin);
				}

			public void setFam_member_identityDocType(String fam_member_identityDocType) {
					this.fam_member_identityDocType = fam_member_identityDocType;
				}
			public String getFam_member_identityDocType() {
				return this.fam_member_identityDocType;
				}
		
			public void setFam_member_identityDocLoad(List<FileBean> fam_member_identityDocLoad) {
					this.fam_member_identityDocLoad = AccessCounterList.decorate(fam_member_identityDocLoad, FileBean.class);
				}
			public List<FileBean> getFam_member_identityDocLoad() {
				return normalize(this.fam_member_identityDocLoad);
				}
		
			public void setFam_member_kinDocLoad(List<FileBean> fam_member_kinDocLoad) {
					this.fam_member_kinDocLoad = AccessCounterList.decorate(fam_member_kinDocLoad, FileBean.class);
				}
			public List<FileBean> getFam_member_kinDocLoad() {
				return normalize(this.fam_member_kinDocLoad);
				}
		
			public void setSitizenCategory(String sitizenCategory) {
					this.sitizenCategory = sitizenCategory;
				}
			public String getSitizenCategory() {
				return this.sitizenCategory;
				}
		
			public void setApplReason(String applReason) {
					this.applReason = applReason;
				}
			public String getApplReason() {
				return this.applReason;
				}

			public void setRegDocLoad(List<FileBean> regDocLoad) {
					this.regDocLoad = AccessCounterList.decorate(regDocLoad, FileBean.class);
				}
			public List<FileBean> getRegDocLoad() {
				return normalize(this.regDocLoad);
				}

			public void setTechDocLoad(List<FileBean> techDocLoad) {
					this.techDocLoad = AccessCounterList.decorate(techDocLoad, FileBean.class);
				}
			public List<FileBean> getTechDocLoad() {
				return normalize(this.techDocLoad);
				}
		
			public void setRightDocLoad(FileBean rightDocLoad) {
					this.rightDocLoad = rightDocLoad;
				}
			public FileBean getRightDocLoad() {
				return this.rightDocLoad;
				}

			public void setIncomeDocLoad(List<FileBean> incomeDocLoad) {
					this.incomeDocLoad = AccessCounterList.decorate(incomeDocLoad, FileBean.class);
				}
			public List<FileBean> getIncomeDocLoad() {
				return normalize(this.incomeDocLoad);
				}

			public void setOtherDocLoad(List<FileBean> otherDocLoad) {
					this.otherDocLoad = AccessCounterList.decorate(otherDocLoad, FileBean.class);
				}
			public List<FileBean> getOtherDocLoad() {
				return normalize(this.otherDocLoad);
				}

			public void setGosRegDocLoad(List<FileBean> gosRegDocLoad) {
					this.gosRegDocLoad = AccessCounterList.decorate(gosRegDocLoad, FileBean.class);
				}
			public List<FileBean> getGosRegDocLoad() {
				return normalize(this.gosRegDocLoad);
				}

			public void setOpfDocLoad(FileBean opfDocLoad) {
					this.opfDocLoad = opfDocLoad;
				}
			public FileBean getOpfDocLoad() {
				return this.opfDocLoad;
				}

			public void setSocDocLoad(FileBean socDocLoad) {
					this.socDocLoad = socDocLoad;
				}
			public FileBean getSocDocLoad() {
				return this.socDocLoad;
				}

			public void setEgrpDocLoad(FileBean egrpDocLoad) {
					this.egrpDocLoad = egrpDocLoad;
				}
			public FileBean getEgrpDocLoad() {
				return this.egrpDocLoad;
				}

			public void setGosRegChangeDocLoad(List<FileBean> gosRegChangeDocLoad) {
					this.gosRegChangeDocLoad = AccessCounterList.decorate(gosRegChangeDocLoad, FileBean.class);
				}
			public List<FileBean> getGosRegChangeDocLoad() {
				return  normalize(this.gosRegChangeDocLoad);
				}

			public void setDogovorDocLoad(FileBean dogovorDocLoad) {
					this.dogovorDocLoad = dogovorDocLoad;
				}
			public FileBean getDogovorDocLoad() {
				return this.dogovorDocLoad;
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

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setSnils("");
        this.setPhone("");
        this.setEmail("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);


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
        this.setSnils(privateRoomDataContainer.getSnils());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);


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

}
