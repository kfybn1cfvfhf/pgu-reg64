package com.nvision.pgu.web.services.s36400171;

import com.nvision.pgu.core.converters.AccessCounterList;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400171Form extends AbstractServiceOrderForm {

    public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setBirthdate(null);
        this.setPassDate(null);
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
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
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
			private Date recipientBirthdate;
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
			private String socialSupport;
     		private FileBean rewardingCertificateLoad;
			private List<FileBean> experienceCertificateLoad = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> workActivityLoad = AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> employmentHistoryLoad = AccessCounterList.createEmpty(FileBean.class);

    private String recipientAddressCountryCode="ru";
    private String recipientAddressCountryInput;
    private String recipientAddressCountrySettlement;
    private String addressCountryCode = "ru";

    private String rec_address;

    public String getRec_address() {
        return rec_address;
    }

    public void setRec_address(String rec_address) {
        this.rec_address = rec_address;
    }

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

    public Date getRecipientBirthdate() {
        return recipientBirthdate;
    }

    public void setRecipientBirthdate(Date recipientBirthdate) {
        this.recipientBirthdate = recipientBirthdate;
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

    public String getSocialSupport() {
        return socialSupport;
    }

    public void setSocialSupport(String socialSupport) {
        this.socialSupport = socialSupport;
    }

    public FileBean getRewardingCertificateLoad() {
        return rewardingCertificateLoad;
    }

    public void setRewardingCertificateLoad(FileBean rewardingCertificateLoad) {
        this.rewardingCertificateLoad = rewardingCertificateLoad;
    }

    public List<FileBean> getExperienceCertificateLoad() {
        return normalize(experienceCertificateLoad);
    }

    public void setExperienceCertificateLoad(List<FileBean> experienceCertificateLoad) {
        this.experienceCertificateLoad =  AccessCounterList.decorate(experienceCertificateLoad, FileBean.class);
    }

    public List<FileBean> getWorkActivityLoad() {
        return normalize(workActivityLoad);
    }

    public void setWorkActivityLoad(List<FileBean> workActivityLoad) {
        this.workActivityLoad  = AccessCounterList.decorate(workActivityLoad, FileBean.class);
    }

    public List<FileBean> getEmploymentHistoryLoad() {
        return normalize(employmentHistoryLoad);
    }

    public void setEmploymentHistoryLoad(List<FileBean> employmentHistoryLoad) {
        this.employmentHistoryLoad  = AccessCounterList.decorate(employmentHistoryLoad, FileBean.class);
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
			
			private FileBean dovDovLoad;			
						
			
			private FileBean dovPasLoad;			
						
						
			
			private String lastName;			
						
			
			private String firstName;			
						
			
			private String middleName;			
						
			
			private Date birthdate;			
						
			

						
			
			private String address;			
						

						
			
			private String phone;			
						
			
			private String email;			

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
						
			
			private String recipientFactAddress;			
						
			
			private String recipientAddress;			
						
			
			private String recipientAddressEq;			
						
			
			private String recipientAddressPost;			
						
			
			private String recipientPhone;			
						
			
			private String recipientEmail;			
						
						
			
			private String recipientPassSeria;			
						
			
			private String recipientPassNo;			
						
			
			private Date recipientPassDate;			
						
			
			private String recipientPassFrom;			
									
						
			
			private FileBean recipientIdentityDocLoad;			
	
			
						
			
			private String gkuUspn;
						
			
			private String catAppl;
						
						
			
			private String pensDocLoad;

			
			private FileBean ordenDocLoad;			
						
			
			private List<FileBean> trudDocLoad = AccessCounterList.createEmpty(FileBean.class);
						
			
			private List<FileBean> beginDocLoad = AccessCounterList.createEmpty(FileBean.class);
						
			
			private List<FileBean> workDocLoad = AccessCounterList.createEmpty(FileBean.class);


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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public FileBean getDovOpekLoad() {
        return dovOpekLoad;
    }

    public void setDovOpekLoad(FileBean dovOpekLoad) {
        this.dovOpekLoad = dovOpekLoad;
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

    public Date getRecipientBirthDate() {
        return recipientBirthDate;
    }

    public void setRecipientBirthDate(Date recipientBirthDate) {
        this.recipientBirthDate = recipientBirthDate;
    }

    public String getRecipientFactAddress() {
        return recipientFactAddress;
    }

    public void setRecipientFactAddress(String recipientFactAddress) {
        this.recipientFactAddress = recipientFactAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getRecipientAddressEq() {
        return recipientAddressEq;
    }

    public void setRecipientAddressEq(String recipientAddressEq) {
        this.recipientAddressEq = recipientAddressEq;
    }

    public String getRecipientAddressPost() {
        return recipientAddressPost;
    }

    public void setRecipientAddressPost(String recipientAddressPost) {
        this.recipientAddressPost = recipientAddressPost;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
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

    public String getGkuUspn() {
        return gkuUspn;
    }

    public void setGkuUspn(String gkuUspn) {
        this.gkuUspn = gkuUspn;
    }

    public String getCatAppl() {
        return catAppl;
    }

    public void setCatAppl(String catAppl) {
        this.catAppl = catAppl;
    }

    public String getPensDocLoad() {
        return pensDocLoad;
    }

    public void setPensDocLoad(String pensDocLoad) {
        this.pensDocLoad = pensDocLoad;
    }

    public FileBean getOrdenDocLoad() {
        return ordenDocLoad;
    }

    public void setOrdenDocLoad(FileBean ordenDocLoad) {
        this.ordenDocLoad = ordenDocLoad;
    }

    public List<FileBean> getTrudDocLoad() {
        return normalize(trudDocLoad);
    }

    public void setTrudDocLoad(List<FileBean> trudDocLoad) {
        this.trudDocLoad = AccessCounterList.decorate(trudDocLoad, FileBean.class);
    }

    public List<FileBean> getBeginDocLoad() {
        return normalize(beginDocLoad);
    }

    public void setBeginDocLoad(List<FileBean> beginDocLoad) {
        this.beginDocLoad = AccessCounterList.decorate(beginDocLoad, FileBean.class);
    }

    public List<FileBean> getWorkDocLoad() {
        return normalize(workDocLoad);
    }

    public void setWorkDocLoad(List<FileBean> workDocLoad) {
        this.workDocLoad = AccessCounterList.decorate(workDocLoad, FileBean.class);
    }
}
