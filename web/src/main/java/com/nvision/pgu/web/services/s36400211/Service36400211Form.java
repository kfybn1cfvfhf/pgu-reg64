package com.nvision.pgu.web.services.s36400211;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.io.StringWriter;
import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400211Form extends AbstractServiceOrderForm {

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
            private String addressCountryCode = "ru";
            private String addressCountryInput;
            private String addressCountrySettlement;


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
            private String factAddressCountryCode = "ru";
            private String factAddressCountryInput;
            private String factAddressCountrySettlement;



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
            private String addressPostCountryCode = "ru";
            private String addressPostCountryInput;
            private String addressPostCountrySettlement;



			private String orgAddressIndex;
			private String orgAddressCountry="643";
			private String orgAddressEnterType;
			private String orgAddressRegion;
			private String orgAddressRayon;
			private String orgAddressSettlementType="1";
			private String orgAddressCity;
			private String orgAddressSettlementText;
			private String orgAddressSettlementDict;
			private String orgAddressStreetText;
			private String orgAddressStreetDict;
			private String orgAddressHouse;
			private String orgAddressKorpus;
			private String orgAddressFlat;
            private String orgAddressCountryCode = "ru";
            private String orgAddressCountryInput;
            private String orgAddressCountrySettlement;



			private String orgFactAddressIndex;
			private String orgFactAddressCountry="643";
			private String orgFactAddressEnterType;
			private String orgFactAddressRegion;
			private String orgFactAddressRayon;
			private String orgFactAddressSettlementType="1";
			private String orgFactAddressCity;
			private String orgFactAddressSettlementText;
			private String orgFactAddressSettlementDict;
			private String orgFactAddressStreetText;
			private String orgFactAddressStreetDict;
			private String orgFactAddressHouse;
			private String orgFactAddressKorpus;
			private String orgFactAddressFlat;
            private String orgFactAddressCountryCode = "ru";
            private String orgFactAddressCountryInput;
            private String orgFactAddressCountrySettlement;



			private String orgPostAddressIndex;
			private String orgPostAddressCountry="643";
			private String orgPostAddressEnterType;
			private String orgPostAddressRegion;
			private String orgPostAddressRayon;
			private String orgPostAddressSettlementType="1";
			private String orgPostAddressCity;
			private String orgPostAddressSettlementText;
			private String orgPostAddressSettlementDict;
			private String orgPostAddressStreetText;
			private String orgPostAddressStreetDict;
			private String orgPostAddressHouse;
			private String orgPostAddressKorpus;
			private String orgPostAddressFlat;
            private String orgPostAddressCountryCode = "ru";
            private String orgPostAddressCountryInput;
            private String orgPostAddressCountrySettlement;


            private String otherAddress;
			private String org_OKPO;
			private String forestPark;
			private String forestPiece;
			private String quarterNo;
			private String pieceNo;
			private String applType;

			private String dov_enable;
            private Boolean dov_enable_changed = true;

            public Boolean getDov_enable_changed() {
                return dov_enable_changed;
            }

            public void setDov_enable_changed(Boolean dov_enable_changed) {
                this.dov_enable_changed = dov_enable_changed;
            }

			private String dovUlType;

			private FileBean dovDovLoad;

            private FileBean dovPasLoad;

			private String lastName;

			private String firstName;

			private String middleName;

			private String address;

			private String phone;

			private String email;

            private String org_fax;

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
			private String org_phone;
			private String org_email;
			private String org_firstName;
			private String org_lastName;
			private String org_middleName;
			private String org_InnUl;
			private String typeInfo;
			private String forest;
			private String pieceForest;
		
			private String noKvart;
			private String noVid;


			
			public void setApplType(String applType) {
					this.applType = applType;
				}
			public String getApplType() {
				return this.applType;
				}
		


            public void setDov_enable(String dov_enable) {

                if (this.dov_enable != null) {
                    if (dov_enable == null) {
                        if (!"off".equals(this.getDov_enable())) {
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
		

			
			public void setDovUlType(String dovUlType) {
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
		

			
			public void setOrg_phone(String org_phone) {
					this.org_phone = org_phone;
				}
			public String getOrg_phone() {
				return this.org_phone;
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

			public void setTypeInfo(String typeInfo) {
					this.typeInfo = typeInfo;
				}
			public String getTypeInfo() {
				return this.typeInfo;
				}
		

			
			public void setForest(String forest) {
					this.forest = forest;
				}
			public String getForest() {
				return this.forest;
				}
		

			
			public void setPieceForest(String pieceForest) {
					this.pieceForest = pieceForest;
				}
			public String getPieceForest() {
				return this.pieceForest;
				}
		

			
			public void setNoKvart(String noKvart) {
					this.noKvart = noKvart;
				}
			public String getNoKvart() {
				return this.noKvart;
				}
		

			
			public void setNoVid(String noVid) {
					this.noVid = noVid;
				}
			public String getNoVid() {
				return this.noVid;
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

    public String getOrgAddressIndex() {
        return orgAddressIndex;
    }

    public void setOrgAddressIndex(String orgAddressIndex) {
        this.orgAddressIndex = orgAddressIndex;
    }

    public String getOrgAddressCountry() {
        return orgAddressCountry;
    }

    public void setOrgAddressCountry(String orgAddressCountry) {
        this.orgAddressCountry = orgAddressCountry;
    }

    public String getOrgAddressEnterType() {
        return orgAddressEnterType;
    }

    public void setOrgAddressEnterType(String orgAddressEnterType) {
        this.orgAddressEnterType = orgAddressEnterType;
    }

    public String getOrgAddressRegion() {
        return orgAddressRegion;
    }

    public void setOrgAddressRegion(String orgAddressRegion) {
        this.orgAddressRegion = orgAddressRegion;
    }

    public String getOrgAddressRayon() {
        return orgAddressRayon;
    }

    public void setOrgAddressRayon(String orgAddressRayon) {
        this.orgAddressRayon = orgAddressRayon;
    }

    public String getOrgAddressSettlementType() {
        return orgAddressSettlementType;
    }

    public void setOrgAddressSettlementType(String orgAddressSettlementType) {
        this.orgAddressSettlementType = orgAddressSettlementType;
    }

    public String getOrgAddressCity() {
        return orgAddressCity;
    }

    public void setOrgAddressCity(String orgAddressCity) {
        this.orgAddressCity = orgAddressCity;
    }

    public String getOrgAddressSettlementText() {
        return orgAddressSettlementText;
    }

    public void setOrgAddressSettlementText(String orgAddressSettlementText) {
        this.orgAddressSettlementText = orgAddressSettlementText;
    }

    public String getOrgAddressSettlementDict() {
        return orgAddressSettlementDict;
    }

    public void setOrgAddressSettlementDict(String orgAddressSettlementDict) {
        this.orgAddressSettlementDict = orgAddressSettlementDict;
    }

    public String getOrgAddressStreetText() {
        return orgAddressStreetText;
    }

    public void setOrgAddressStreetText(String orgAddressStreetText) {
        this.orgAddressStreetText = orgAddressStreetText;
    }

    public String getOrgAddressStreetDict() {
        return orgAddressStreetDict;
    }

    public void setOrgAddressStreetDict(String orgAddressStreetDict) {
        this.orgAddressStreetDict = orgAddressStreetDict;
    }

    public String getOrgAddressHouse() {
        return orgAddressHouse;
    }

    public void setOrgAddressHouse(String orgAddressHouse) {
        this.orgAddressHouse = orgAddressHouse;
    }

    public String getOrgAddressKorpus() {
        return orgAddressKorpus;
    }

    public void setOrgAddressKorpus(String orgAddressKorpus) {
        this.orgAddressKorpus = orgAddressKorpus;
    }

    public String getOrgAddressFlat() {
        return orgAddressFlat;
    }

    public void setOrgAddressFlat(String orgAddressFlat) {
        this.orgAddressFlat = orgAddressFlat;
    }

    public String getOrgFactAddressIndex() {
        return orgFactAddressIndex;
    }

    public void setOrgFactAddressIndex(String orgFactAddressIndex) {
        this.orgFactAddressIndex = orgFactAddressIndex;
    }

    public String getOrgFactAddressCountry() {
        return orgFactAddressCountry;
    }

    public void setOrgFactAddressCountry(String orgFactAddressCountry) {
        this.orgFactAddressCountry = orgFactAddressCountry;
    }

    public String getOrgFactAddressEnterType() {
        return orgFactAddressEnterType;
    }

    public void setOrgFactAddressEnterType(String orgFactAddressEnterType) {
        this.orgFactAddressEnterType = orgFactAddressEnterType;
    }

    public String getOrgFactAddressRegion() {
        return orgFactAddressRegion;
    }

    public void setOrgFactAddressRegion(String orgFactAddressRegion) {
        this.orgFactAddressRegion = orgFactAddressRegion;
    }

    public String getOrgFactAddressRayon() {
        return orgFactAddressRayon;
    }

    public void setOrgFactAddressRayon(String orgFactAddressRayon) {
        this.orgFactAddressRayon = orgFactAddressRayon;
    }

    public String getOrgFactAddressSettlementType() {
        return orgFactAddressSettlementType;
    }

    public void setOrgFactAddressSettlementType(String orgFactAddressSettlementType) {
        this.orgFactAddressSettlementType = orgFactAddressSettlementType;
    }

    public String getOrgFactAddressCity() {
        return orgFactAddressCity;
    }

    public void setOrgFactAddressCity(String orgFactAddressCity) {
        this.orgFactAddressCity = orgFactAddressCity;
    }

    public String getOrgFactAddressSettlementText() {
        return orgFactAddressSettlementText;
    }

    public void setOrgFactAddressSettlementText(String orgFactAddressSettlementText) {
        this.orgFactAddressSettlementText = orgFactAddressSettlementText;
    }

    public String getOrgFactAddressSettlementDict() {
        return orgFactAddressSettlementDict;
    }

    public void setOrgFactAddressSettlementDict(String orgFactAddressSettlementDict) {
        this.orgFactAddressSettlementDict = orgFactAddressSettlementDict;
    }

    public String getOrgFactAddressStreetText() {
        return orgFactAddressStreetText;
    }

    public void setOrgFactAddressStreetText(String orgFactAddressStreetText) {
        this.orgFactAddressStreetText = orgFactAddressStreetText;
    }

    public String getOrgFactAddressStreetDict() {
        return orgFactAddressStreetDict;
    }

    public void setOrgFactAddressStreetDict(String orgFactAddressStreetDict) {
        this.orgFactAddressStreetDict = orgFactAddressStreetDict;
    }

    public String getOrgFactAddressHouse() {
        return orgFactAddressHouse;
    }

    public void setOrgFactAddressHouse(String orgFactAddressHouse) {
        this.orgFactAddressHouse = orgFactAddressHouse;
    }

    public String getOrgFactAddressKorpus() {
        return orgFactAddressKorpus;
    }

    public void setOrgFactAddressKorpus(String orgFactAddressKorpus) {
        this.orgFactAddressKorpus = orgFactAddressKorpus;
    }

    public String getOrgFactAddressFlat() {
        return orgFactAddressFlat;
    }

    public void setOrgFactAddressFlat(String orgFactAddressFlat) {
        this.orgFactAddressFlat = orgFactAddressFlat;
    }

    public String getOrgPostAddressIndex() {
        return orgPostAddressIndex;
    }

    public void setOrgPostAddressIndex(String orgPostAddressIndex) {
        this.orgPostAddressIndex = orgPostAddressIndex;
    }

    public String getOrgPostAddressCountry() {
        return orgPostAddressCountry;
    }

    public void setOrgPostAddressCountry(String orgPostAddressCountry) {
        this.orgPostAddressCountry = orgPostAddressCountry;
    }

    public String getOrgPostAddressEnterType() {
        return orgPostAddressEnterType;
    }

    public void setOrgPostAddressEnterType(String orgPostAddressEnterType) {
        this.orgPostAddressEnterType = orgPostAddressEnterType;
    }

    public String getOrgPostAddressRegion() {
        return orgPostAddressRegion;
    }

    public void setOrgPostAddressRegion(String orgPostAddressRegion) {
        this.orgPostAddressRegion = orgPostAddressRegion;
    }

    public String getOrgPostAddressRayon() {
        return orgPostAddressRayon;
    }

    public void setOrgPostAddressRayon(String orgPostAddressRayon) {
        this.orgPostAddressRayon = orgPostAddressRayon;
    }

    public String getOrgPostAddressSettlementType() {
        return orgPostAddressSettlementType;
    }

    public void setOrgPostAddressSettlementType(String orgPostAddressSettlementType) {
        this.orgPostAddressSettlementType = orgPostAddressSettlementType;
    }

    public String getOrgPostAddressCity() {
        return orgPostAddressCity;
    }

    public void setOrgPostAddressCity(String orgPostAddressCity) {
        this.orgPostAddressCity = orgPostAddressCity;
    }

    public String getOrgPostAddressSettlementText() {
        return orgPostAddressSettlementText;
    }

    public void setOrgPostAddressSettlementText(String orgPostAddressSettlementText) {
        this.orgPostAddressSettlementText = orgPostAddressSettlementText;
    }

    public String getOrgPostAddressSettlementDict() {
        return orgPostAddressSettlementDict;
    }

    public void setOrgPostAddressSettlementDict(String orgPostAddressSettlementDict) {
        this.orgPostAddressSettlementDict = orgPostAddressSettlementDict;
    }

    public String getOrgPostAddressStreetText() {
        return orgPostAddressStreetText;
    }

    public void setOrgPostAddressStreetText(String orgPostAddressStreetText) {
        this.orgPostAddressStreetText = orgPostAddressStreetText;
    }

    public String getOrgPostAddressStreetDict() {
        return orgPostAddressStreetDict;
    }

    public void setOrgPostAddressStreetDict(String orgPostAddressStreetDict) {
        this.orgPostAddressStreetDict = orgPostAddressStreetDict;
    }

    public String getOrgPostAddressHouse() {
        return orgPostAddressHouse;
    }

    public void setOrgPostAddressHouse(String orgPostAddressHouse) {
        this.orgPostAddressHouse = orgPostAddressHouse;
    }

    public String getOrgPostAddressKorpus() {
        return orgPostAddressKorpus;
    }

    public void setOrgPostAddressKorpus(String orgPostAddressKorpus) {
        this.orgPostAddressKorpus = orgPostAddressKorpus;
    }

    public String getOrgPostAddressFlat() {
        return orgPostAddressFlat;
    }

    public void setOrgPostAddressFlat(String orgPostAddressFlat) {
        this.orgPostAddressFlat = orgPostAddressFlat;
    }

    public String getOrg_OKPO() {
        return org_OKPO;
    }

    public void setOrg_OKPO(String org_OKPO) {
        this.org_OKPO = org_OKPO;
    }

    public String getForestPark() {
        return forestPark;
    }

    public void setForestPark(String forestPark) {
        this.forestPark = forestPark;
    }

    public String getForestPiece() {
        return forestPiece;
    }

    public void setForestPiece(String forestPiece) {
        this.forestPiece = forestPiece;
    }

    public String getQuarterNo() {
        return quarterNo;
    }

    public void setQuarterNo(String quarterNo) {
        this.quarterNo = quarterNo;
    }

    public String getPieceNo() {
        return pieceNo;
    }

    public void setPieceNo(String pieceNo) {
        this.pieceNo = pieceNo;
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

    public String getOrgAddressCountryCode() {
        return orgAddressCountryCode;
    }

    public void setOrgAddressCountryCode(String orgAddressCountryCode) {
        this.orgAddressCountryCode = orgAddressCountryCode;
    }

    public String getOrgAddressCountryInput() {
        return orgAddressCountryInput;
    }

    public void setOrgAddressCountryInput(String orgAddressCountryInput) {
        this.orgAddressCountryInput = orgAddressCountryInput;
    }

    public String getOrgAddressCountrySettlement() {
        return orgAddressCountrySettlement;
    }

    public void setOrgAddressCountrySettlement(String orgAddressCountrySettlement) {
        this.orgAddressCountrySettlement = orgAddressCountrySettlement;
    }

    public String getOrgFactAddressCountryCode() {
        return orgFactAddressCountryCode;
    }

    public void setOrgFactAddressCountryCode(String orgFactAddressCountryCode) {
        this.orgFactAddressCountryCode = orgFactAddressCountryCode;
    }

    public String getOrgFactAddressCountryInput() {
        return orgFactAddressCountryInput;
    }

    public void setOrgFactAddressCountryInput(String orgFactAddressCountryInput) {
        this.orgFactAddressCountryInput = orgFactAddressCountryInput;
    }

    public String getOrgFactAddressCountrySettlement() {
        return orgFactAddressCountrySettlement;
    }

    public void setOrgFactAddressCountrySettlement(String orgFactAddressCountrySettlement) {
        this.orgFactAddressCountrySettlement = orgFactAddressCountrySettlement;
    }

    public String getOrgPostAddressCountryCode() {
        return orgPostAddressCountryCode;
    }

    public void setOrgPostAddressCountryCode(String orgPostAddressCountryCode) {
        this.orgPostAddressCountryCode = orgPostAddressCountryCode;
    }

    public String getOrgPostAddressCountryInput() {
        return orgPostAddressCountryInput;
    }

    public void setOrgPostAddressCountryInput(String orgPostAddressCountryInput) {
        this.orgPostAddressCountryInput = orgPostAddressCountryInput;
    }

    public String getOrgPostAddressCountrySettlement() {
        return orgPostAddressCountrySettlement;
    }

    public void setOrgPostAddressCountrySettlement(String orgPostAddressCountrySettlement) {
        this.orgPostAddressCountrySettlement = orgPostAddressCountrySettlement;
    }

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getOrg_fax() {
        return org_fax;
    }

    public void setOrg_fax(String org_fax) {
        this.org_fax = org_fax;
    }
}
