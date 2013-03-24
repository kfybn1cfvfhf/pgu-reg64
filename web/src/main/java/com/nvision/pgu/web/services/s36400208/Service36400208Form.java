package com.nvision.pgu.web.services.s36400208;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.blocks.fioBlock;
import ru.lanit.samara.pgu.core.blocks.identityDocBlock;
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
public class Service36400208Form extends AbstractServiceOrderForm {

        public void clearApplicantAttributes() {
            this.getFioBlock().setFirstName("");
            this.getFioBlock().setLastName("");
            this.getFioBlock().setMiddleName("");
            this.setPhone("");
            this.setEmail("");
        }

        public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
            this.getFioBlock().setLastName(privateRoomDataContainer.getLastName());
            this.getFioBlock().setFirstName(privateRoomDataContainer.getFirstName());
            this.getFioBlock().setMiddleName(privateRoomDataContainer.getMiddleName());
            this.setPhone(privateRoomDataContainer.getPhone());
            this.setEmail(privateRoomDataContainer.getEmail());
        }

    public identityDocBlock getIdentityDocBlock() {
        return new identityDocBlock(this.getStringBlock(), this.getDateBlock());
    }

    public fioBlock getFioBlock() {
        return new fioBlock(this.getStringBlock());
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

            private String otherDocTypeName;

			private String applType;
			
			private String ip_enable;			

			private String dov_enable;
			
			private String dovUlType;
			
			private FileBean dovDovLoad;
			
			private FileBean dovPasLoad;
						
			
			private String phone;			
						
			
			private String email;			

			
						
									
						
			
			private FileBean dovUlNonDovLoad;			
						
			

			
						
									
						
			
			private FileBean dovUlDovLoad;			
						
			
			private FileBean dovUlPasLoad;			
						
						
			
			private String org_FullTitle;			
						
			
			private String org_opf;
						
			
			private String org_SmallTitle;
						
			
			private String org_phone;			
						
			
			private String org_fax;			
						
			
			private String org_email;			
						
			
			private String org_firstName;			
						
			
			private String org_lastName;			
						
			
			private String org_middleName;			
						
			
			private String org_InnUl;			
						
			
			private String org_OgrnUl;			

			private FileBean docMvRegULLoad;			

			private String inn;			
						
			
			private String ogrnip;			
									
						
						
			
			private FileBean docMvRegIPLoad;			
	
			
						
						
			
			private String square;			
						
			
			private String landmark;			
						
			
			private String purposeUse;			
						
			
			private String cadastralRight;			
						
			
			private String soughtRight;
						
			
			private String termUse;			
									
						
						
			
			private FileBean egrpDocLoad;			
						
			
			private FileBean kadastrDocLoad;

            private FileBean identityDocLoad;

    public FileBean getIdentityDocLoad() {
        return identityDocLoad;
    }

    public void setIdentityDocLoad(FileBean identityDocLoad) {
        this.identityDocLoad = identityDocLoad;
    }

    public String getSoughtRight() {
        return soughtRight;
    }

    public void setSoughtRight(String soughtRight) {
        this.soughtRight = soughtRight;
    }

    public void setApplType(String applType) {
                if(this.applType != null)
                    if(!(this.applType.equalsIgnoreCase(applType))) { // Произошло изменение значения поля.
                        this.setApplType_changed(true);
                    }
				this.applType = applType;

				}
			public String getApplType() {
				return this.applType;
				}
		
						
			public void setIp_enable(String ip_enable) {
					this.ip_enable = ip_enable;
				}
			public String getIp_enable() {
				return this.ip_enable == null ? "off" : this.ip_enable;
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
		
						
			public void setDovUlType(String dovUlType) {
                if(this.dovUlType != null)
                    if(!(this.dovUlType.equalsIgnoreCase(dovUlType))) { // Произошло изменение значения поля.
                        this.setDovUlType_changed(true);
                    }
                this.dovUlType = dovUlType;
				}
			public String getDovUlType() {
				return this.dovUlType;
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


    public String getOtherDocTypeName() {
        return otherDocTypeName;
    }

    public void setOtherDocTypeName(String otherDocTypeName) {
        this.otherDocTypeName = otherDocTypeName;
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
		
						
			public void setEmail(String email) {
					this.email = email;
				}
			public String getEmail() {
				return this.email;
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
		
						
			public void setOrg_InnUl(String org_InnUl) {
					this.org_InnUl = org_InnUl;
				}
			public String getOrg_InnUl() {
				return this.org_InnUl;
				}
		
						
			public void setOrg_OgrnUl(String org_OgrnUl) {
					this.org_OgrnUl = org_OgrnUl;
				}
			public String getOrg_OgrnUl() {
				return this.org_OgrnUl;
				}
		
									
						
						
			public void setDocMvRegULLoad(FileBean docMvRegULLoad) {
					this.docMvRegULLoad = docMvRegULLoad;
				}
			public FileBean getDocMvRegULLoad() {
				return this.docMvRegULLoad;
				}
		
	
			
						
						
			public void setInn(String inn) {
					this.inn = inn;
				}
			public String getInn() {
				return this.inn;
				}
		
						
			public void setOgrnip(String ogrnip) {
					this.ogrnip = ogrnip;
				}
			public String getOgrnip() {
				return this.ogrnip;
				}
		
									
						
						
			public void setDocMvRegIPLoad(FileBean docMvRegIPLoad) {
					this.docMvRegIPLoad = docMvRegIPLoad;
				}
			public FileBean getDocMvRegIPLoad() {
				return this.docMvRegIPLoad;
				}
		
	
			
						
						
			public void setSquare(String square) {
					this.square = square;
				}
			public String getSquare() {
				return this.square;
				}
		
						
			public void setLandmark(String landmark) {
					this.landmark = landmark;
				}
			public String getLandmark() {
				return this.landmark;
				}
		
						
			public void setPurposeUse(String purposeUse) {
					this.purposeUse = purposeUse;
				}
			public String getPurposeUse() {
				return this.purposeUse;
				}
		
						
			public void setCadastralRight(String cadastralRight) {
					this.cadastralRight = cadastralRight;
				}
			public String getCadastralRight() {
				return this.cadastralRight;
				}

						
			public void setTermUse(String termUse) {
					this.termUse = termUse;
				}
			public String getTermUse() {
				return this.termUse;
				}
		
									
						
						
			public void setEgrpDocLoad(FileBean egrpDocLoad) {
					this.egrpDocLoad = egrpDocLoad;
				}
			public FileBean getEgrpDocLoad() {
				return this.egrpDocLoad;
				}
		
						
			public void setKadastrDocLoad(FileBean kadastrDocLoad) {
					this.kadastrDocLoad = kadastrDocLoad;
				}
			public FileBean getKadastrDocLoad() {
				return this.kadastrDocLoad;
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

    public String getAddressPostCountrySettlement() {
        return addressPostCountrySettlement;
    }

    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
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

    public String getOrg_addressPostSettlementType() {
        return org_addressPostSettlementType;
    }

    public void setOrg_addressPostSettlementType(String org_addressPostSettlementType) {
        this.org_addressPostSettlementType = org_addressPostSettlementType;
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

    public String getOrg_addressPostCountrySettlement() {
        return org_addressPostCountrySettlement;
    }

    public void setOrg_addressPostCountrySettlement(String org_addressPostCountrySettlement) {
        this.org_addressPostCountrySettlement = org_addressPostCountrySettlement;
    }

    private String address;

    private String addressPostIndex;
    private String addressPostEnterType;
    private String addressPostRegion;
    private String addressPostRayon;
    private String addressPostSettlementType = "1";
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
    private String addressPostCountrySettlement;

    private String org_addressPostIndex;
    private String org_addressPostEnterType;
    private String org_addressPostRegion;
    private String org_addressPostRayon;
    private String org_addressPostSettlementType = "1";
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
    private String org_addressPostCountrySettlement;
		}
