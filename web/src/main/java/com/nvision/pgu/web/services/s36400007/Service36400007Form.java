package com.nvision.pgu.web.services.s36400007;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400007Form extends AbstractServiceOrderForm {

        public void clearApplicantAttributes() {
        this.setFirstName("");
        this.setLastName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setEmail("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setOtherDocTypeName("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {
        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setEmail(privateRoomDataContainer.getEmail());
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setOtherDocTypeName("");

    }


			private String applType;
			private String dov_enable;
			private String dovUlType;
            private Boolean dov_enable_changed = true;
            private Boolean applType_changed = true;
            private Boolean dovUlType_changed = true;

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

    private FileBean dovDovLoad;
			private FileBean dovPasLoad;
			private String inn;
			
			
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
			private String factAddressCountryCode="ru";
            private String factAddressCountryInput;
            private String factAddressCountrySettlement;
			
			private String identityDocType;
			private String otherDocTypeName;
			private String passSeria;
			private String passNo;
			private Date passDate;
			private String passFrom;
			private FileBean identityDocLoad;
			private FileBean docMvRegIPLoad;
			private FileBean docMvRegFNSLoad;
			private FileBean dovUlNonDovLoad;
			private String lastName;
			private String firstName;
			private String middleName;
			private String phone;
			private String email;
			private FileBean dovUlDovLoad;
			private FileBean dovUlPasLoad;
			private String org_FullTitle;
			private String org_opf;
			private String org_SmallTitle;
			private String org_FirmNazTitle;
			private String org_InnUl;
			private String org_OgrnUl;


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
            private String org_addressPostCountryCode="ru";
            private String org_addressPostCountryInput;
            private String org_addressPostCountrySettlement;
            //private String address;
           // private String otherAddress;
			private String org_phone;
			private String org_email;
			private String requestSend;
			private List<FileBean> founderDocLoad= AccessCounterList.createEmpty(FileBean.class);
			private FileBean docMvRegULLoad;
			private List<FileBean> load_doc2= AccessCounterList.createEmpty(FileBean.class);
			private String ownership;
			private FileBean load_doc1;
			private List<FileBean> load_doc12= AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc4= AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc6= AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc7= AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc8= AccessCounterList.createEmpty(FileBean.class);
			private List<FileBean> load_doc9= AccessCounterList.createEmpty(FileBean.class);
			private FileBean load_doc3;
			private List<FileBean> load_doc5= AccessCounterList.createEmpty(FileBean.class);
			private FileBean load_doc10;
			private List<FileBean> load_doc11= AccessCounterList.createEmpty(FileBean.class);
			


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
		

			
			public void setInn(String inn) {
					this.inn = inn;
				}
			public String getInn() {
				return this.inn;
				}
		

			
			public void setFactAddressIndex(String factAddressIndex) {
					this.factAddressIndex = factAddressIndex;
				}
			public String getFactAddressIndex() {
				return this.factAddressIndex;
				}
		
			//Поле Ввод адреса
			
			public void setFactAddressEnterType(String factAddressEnterType) {
					this.factAddressEnterType = factAddressEnterType;
				}
			public String getFactAddressEnterType() {
				return this.factAddressEnterType;
				}
		
			//Поле Область (край, республика)
			
			public void setFactAddressRegion(String factAddressRegion) {
					this.factAddressRegion = factAddressRegion;
				}
			public String getFactAddressRegion() {
				return this.factAddressRegion;
				}
		
			//Поле Район
			
			public void setFactAddressRayon(String factAddressRayon) {
					this.factAddressRayon = factAddressRayon;
				}
			public String getFactAddressRayon() {
				return this.factAddressRayon;
				}
		
			//Поле Тип населенного пункта
			
			public void setFactAddressSettlementType(String factAddressSettlementType) {
					this.factAddressSettlementType = factAddressSettlementType;
				}
			public String getFactAddressSettlementType() {
				return this.factAddressSettlementType;
				}
		
			//Поле Город
			
			public void setFactAddressCity(String factAddressCity) {
					this.factAddressCity = factAddressCity;
				}
			public String getFactAddressCity() {
				return this.factAddressCity;
				}
		
			//Поле Населенный пункт
			
			public void setFactAddressSettlementText(String factAddressSettlementText) {
					this.factAddressSettlementText = factAddressSettlementText;
				}
			public String getFactAddressSettlementText() {
				return this.factAddressSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setFactAddressSettlementDict(String factAddressSettlementDict) {
					this.factAddressSettlementDict = factAddressSettlementDict;
				}
			public String getFactAddressSettlementDict() {
				return this.factAddressSettlementDict;
				}
		
			//Поле Улица
			
			public void setFactAddressStreetText(String factAddressStreetText) {
					this.factAddressStreetText = factAddressStreetText;
				}
			public String getFactAddressStreetText() {
				return this.factAddressStreetText;
				}
		
			//Поле Улица
			
			public void setFactAddressStreetDict(String factAddressStreetDict) {
					this.factAddressStreetDict = factAddressStreetDict;
				}
			public String getFactAddressStreetDict() {
				return this.factAddressStreetDict;
				}
		
			//Поле Дом
			
			public void setFactAddressHouse(String factAddressHouse) {
					this.factAddressHouse = factAddressHouse;
				}
			public String getFactAddressHouse() {
				return this.factAddressHouse;
				}
		
			//Поле Корпус
			
			public void setFactAddressKorpus(String factAddressKorpus) {
					this.factAddressKorpus = factAddressKorpus;
				}
			public String getFactAddressKorpus() {
				return this.factAddressKorpus;
				}
		
			//Поле Квартира
			
			public void setFactAddressFlat(String factAddressFlat) {
					this.factAddressFlat = factAddressFlat;
				}
			public String getFactAddressFlat() {
				return this.factAddressFlat;
				}
		
			//Поле <h2>Сведения о документе, удостоверяющем личность индивидуального предпринимателя</h2>
			
			//Поле Тип документа, удостоверяющего личность
			
			public void setIdentityDocType(String identityDocType) {
					this.identityDocType = identityDocType;
				}
			public String getIdentityDocType() {
				return this.identityDocType;
				}
		
			//Поле Название иного документа, удостоверяющего личность
			
			public void setOtherDocTypeName(String otherDocTypeName) {
					this.otherDocTypeName = otherDocTypeName;
				}
			public String getOtherDocTypeName() {
				return this.otherDocTypeName;
				}
		
			//Поле Серия
			
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

			
			public void setIdentityDocLoad(FileBean identityDocLoad) {
					this.identityDocLoad = identityDocLoad;
				}
			public FileBean getIdentityDocLoad() {
				return this.identityDocLoad;
				}
		

			public void setDocMvRegIPLoad(FileBean docMvRegIPLoad) {
					this.docMvRegIPLoad = docMvRegIPLoad;
				}
			public FileBean getDocMvRegIPLoad() {
				return this.docMvRegIPLoad;
				}
		

			
			public void setDocMvRegFNSLoad(FileBean docMvRegFNSLoad) {
					this.docMvRegFNSLoad = docMvRegFNSLoad;
				}
			public FileBean getDocMvRegFNSLoad() {
				return this.docMvRegFNSLoad;
				}
		
	

			public void setDovUlNonDovLoad(FileBean dovUlNonDovLoad) {
					this.dovUlNonDovLoad = dovUlNonDovLoad;
				}
			public FileBean getDovUlNonDovLoad() {
				return this.dovUlNonDovLoad;
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
		
			//Поле Адрес электронной почты
			
			public void setEmail(String email) {
					this.email = email;
				}
			public String getEmail() {
				return this.email;
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
		


			public void setOrg_SmallTitle(String org_SmallTitle) {
					this.org_SmallTitle = org_SmallTitle;
				}
			public String getOrg_SmallTitle() {
				return this.org_SmallTitle;
				}
		

			
			public void setOrg_FirmNazTitle(String org_FirmNazTitle) {
					this.org_FirmNazTitle = org_FirmNazTitle;
				}
			public String getOrg_FirmNazTitle() {
				return this.org_FirmNazTitle;
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
		
			//Поле Тип населенного пункта
			
			public void setOrg_addressPostSettlementType(String org_addressPostSettlementType) {
					this.org_addressPostSettlementType = org_addressPostSettlementType;
				}
			public String getOrg_addressPostSettlementType() {
				return this.org_addressPostSettlementType;
				}
		
			//Поле Город
			
			public void setOrg_addressPostCity(String org_addressPostCity) {
					this.org_addressPostCity = org_addressPostCity;
				}
			public String getOrg_addressPostCity() {
				return this.org_addressPostCity;
				}
		
			//Поле Населенный пункт
			
			public void setOrg_addressPostSettlementText(String org_addressPostSettlementText) {
					this.org_addressPostSettlementText = org_addressPostSettlementText;
				}
			public String getOrg_addressPostSettlementText() {
				return this.org_addressPostSettlementText;
				}
		
			//Поле Населенный пункт
			
			public void setOrg_addressPostSettlementDict(String org_addressPostSettlementDict) {
					this.org_addressPostSettlementDict = org_addressPostSettlementDict;
				}
			public String getOrg_addressPostSettlementDict() {
				return this.org_addressPostSettlementDict;
				}
		
			//Поле Улица
			
			public void setOrg_addressPostStreetText(String org_addressPostStreetText) {
					this.org_addressPostStreetText = org_addressPostStreetText;
				}
			public String getOrg_addressPostStreetText() {
				return this.org_addressPostStreetText;
				}
		
			//Поле Улица
			
			public void setOrg_addressPostStreetDict(String org_addressPostStreetDict) {
					this.org_addressPostStreetDict = org_addressPostStreetDict;
				}
			public String getOrg_addressPostStreetDict() {
				return this.org_addressPostStreetDict;
				}
		
			//Поле Дом
			
			public void setOrg_addressPostHouse(String org_addressPostHouse) {
					this.org_addressPostHouse = org_addressPostHouse;
				}
			public String getOrg_addressPostHouse() {
				return this.org_addressPostHouse;
				}
		
			//Поле Корпус
			
			public void setOrg_addressPostKorpus(String org_addressPostKorpus) {
					this.org_addressPostKorpus = org_addressPostKorpus;
				}
			public String getOrg_addressPostKorpus() {
				return this.org_addressPostKorpus;
				}
		
			//Поле Офис (помещение)
			
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
		

			public void setOrg_email(String org_email) {
					this.org_email = org_email;
				}
			public String getOrg_email() {
				return this.org_email;
				}
		

			public void setRequestSend(String requestSend) {
					this.requestSend = requestSend;
				}
			public String getRequestSend() {
				return this.requestSend;
				}
		

			public void setFounderDocLoad(List<FileBean> founderDocLoad) {
					this.founderDocLoad = AccessCounterList.decorate(founderDocLoad, FileBean.class);
				}
			public List<FileBean> getFounderDocLoad() {
				return normalize(this.founderDocLoad);
				}

			
			public void setDocMvRegULLoad(FileBean docMvRegULLoad) {
					this.docMvRegULLoad = docMvRegULLoad;
				}
			public FileBean getDocMvRegULLoad() {
				return this.docMvRegULLoad;
				}
		

			
			public void setLoad_doc2(List<FileBean> load_doc2) {
					this.load_doc2 =  AccessCounterList.decorate(load_doc2, FileBean.class);
				}
			public List<FileBean> getLoad_doc2() {
				return normalize(this.load_doc2);
				}
		

			public void setOwnership(String ownership) {
					this.ownership = ownership;
				}
			public String getOwnership() {
				return this.ownership;
				}
		

			
			public void setLoad_doc1(FileBean load_doc1) {
					this.load_doc1 = load_doc1;
				}
			public FileBean getLoad_doc1() {
				return this.load_doc1;
				}
		

			
			public void setLoad_doc12(List<FileBean> load_doc12) {
					this.load_doc12 =  AccessCounterList.decorate(load_doc12, FileBean.class);
				}
			public List<FileBean> getLoad_doc12() {
				return normalize(this.load_doc12);
				}
		

			
			public void setLoad_doc4(List<FileBean> load_doc4) {
					this.load_doc4 = AccessCounterList.decorate(load_doc4, FileBean.class);
				}
			public List<FileBean> getLoad_doc4() {
				return normalize(this.load_doc4);
				}
		

			
			public void setLoad_doc6(List<FileBean> load_doc6) {
					this.load_doc6 = AccessCounterList.decorate(load_doc6, FileBean.class);
				}
			public List<FileBean> getLoad_doc6() {
				return normalize(this.load_doc6);
				}
		

			
			public void setLoad_doc7(List<FileBean> load_doc7) {
					this.load_doc7 = AccessCounterList.decorate(load_doc7, FileBean.class);
				}
			public List<FileBean> getLoad_doc7() {
				return normalize(this.load_doc7);
				}
		

			public void setLoad_doc8(List<FileBean> load_doc8) {
					this.load_doc8 = AccessCounterList.decorate(load_doc7, FileBean.class);
				}
			public List<FileBean> getLoad_doc8() {
				return normalize(this.load_doc8);
				}
		

			
			public void setLoad_doc9(List<FileBean> load_doc9) {
					this.load_doc9 = AccessCounterList.decorate(load_doc9, FileBean.class);
				}
			public List<FileBean> getLoad_doc9() {
				return normalize(this.load_doc9);
				}

			
			public void setLoad_doc3(FileBean load_doc3) {
					this.load_doc3 = load_doc3;
				}
			public FileBean getLoad_doc3() {
				return this.load_doc3;
				}
		

			
			public void setLoad_doc5(List<FileBean> load_doc5) {
					this.load_doc5 = AccessCounterList.decorate(load_doc5, FileBean.class);
				}
			public List<FileBean> getLoad_doc5() {
				return normalize(this.load_doc5);
				}
		

			
			public void setLoad_doc10(FileBean load_doc10) {
					this.load_doc10 = load_doc10;
				}
			public FileBean getLoad_doc10() {
				return this.load_doc10;
				}
		

			
			public void setLoad_doc11(List<FileBean> load_doc11) {
					this.load_doc11 = AccessCounterList.decorate(load_doc11, FileBean.class);
				}
			public List<FileBean> getLoad_doc11() {
				return normalize(this.load_doc11);
				}

    public String getFactAddressCountry() {
        return factAddressCountry;
    }

    public void setFactAddressCountry(String factAddressCountry) {
        this.factAddressCountry = factAddressCountry;
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

    public String getOrg_opf() {
        return org_opf;
    }

    public void setOrg_opf(String org_opf) {
        this.org_opf = org_opf;
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


}
