package com.nvision.pgu.web.services.s36400220;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.blocks.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400220Form extends AbstractServiceOrderForm {



	public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setBirthdate(null);
        this.setAddress("");
        this.setPhone("");
        this.setEmail("");

        this.setAddressIndex("");
        this.setAddressRegion("");
        this.setAddressRayon("");
        this.setAddressCountry("643");
        this.setAddressCountryCode("ru");
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
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setAddress(privateRoomDataContainer.getAddress());
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


			private String dov_enable;
			private Boolean dov_enable_changed = true;

    public Boolean getDov_enable_changed() {
        return dov_enable_changed;
    }

    public void setDov_enable_changed(Boolean dov_enable_changed) {
        this.dov_enable_changed = dov_enable_changed;
    }

			private String lastName;

			private String firstName;
			
			
			private String middleName;

			private Date birthdate;

			private String sex;
			
			private String gragdanstvo;

    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_ZIPCODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressIndex;	//в АИС соединять в одну строку и передавать в параметре address
    private String addressCountry = "643";	//в АИС соединять в одну строку и передавать в параметре address
    private String addressEnterType;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_REGION_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRegion;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_DISTRICT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressRayon;	//в АИС соединять в одну строку и передавать в параметре address
    private String addressSettlementType;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_CITY_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressCity;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementText;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_SETTLEMENT_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressSettlementDict;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_STREET_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetText;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_STREET_CODE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressStreetDict;	//в АИС соединять в одну строку и передавать в параметре address
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_HOUSE_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressHouse;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_CORPUS_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressKorpus;	//По умолчанию:
    @InitRule(strategy = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.class, field = ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy.ADDRESS_APPARTMENT_NAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
    private String addressFlat;	//По умолчанию:
    private String addressPostIndex;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostCountry = "643";	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostEnterType;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostRegion;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostRayon;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostSettlementType;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostCity;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostSettlementText;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostSettlementDict;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostStreetText;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostStreetDict;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostHouse;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostKorpus;	//в АИС соединять в одну строку и передавать в параметре addressPost
    private String addressPostFlat;	//в АИС соединять в одну строку и передавать в параметре addressPost

    private String phone;
			
			private String email;
			
			private String identityDocType;
			
			
			private String otherDocTypeName;
			
			private String passSeria;
			
			private String passNo;
			
			private Date passDate;
			
			private String passFrom;
			
			private FileBean identityDocLoad;

    private FileBean dovDovLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
    private FileBean dovPasLoad;	//Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.

    private FileBean docLoadMarriageCertficate;

			private FileBean docLoadNeedingHousing;
			
			private FileBean docLoadDokhod;
			
			private FileBean docLoadDeklENVD;
			
			private FileBean docLoadDeklUSN;
			
			private List<FileBean> docDokhod = AccessCounterList.createEmpty(FileBean.class);

public List<FileBean> getDocDokhod() {
        return normalize(docDokhod);
    }

    public void setDocDokhod(List<FileBean> docDokhod) {
        this.docDokhod = AccessCounterList.decorate(docDokhod, FileBean.class);
    }
      //private FileBean docDokhod;

    //public FileBean getDocDokhod() {
   //     return docDokhod;
  //  }

   // public void setDocDokhod(FileBean docDokhod) {
   //     this.docDokhod = docDokhod;
   // }
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
		

			
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
				}
		

			
			public void setSex(String sex) {
					this.sex = sex;
				}
			public String getSex() {
				return this.sex;
				}
		

			
			public void setGragdanstvo(String gragdanstvo) {
					this.gragdanstvo = gragdanstvo;
				}
			public String getGragdanstvo() {
				return this.gragdanstvo;
				}



    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }
    public String getAddressIndex() {
        return this.addressIndex;
    }

    //Поле Страна

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }
    public String getAddressCountry() {
        return this.addressCountry;
    }

    //Поле Ввод адреса

    public void setAddressEnterType(String addressEnterType) {
        this.addressEnterType = addressEnterType;
    }
    public String getAddressEnterType() {
        return this.addressEnterType;
    }

    //Поле Область (край, республика)

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }
    public String getAddressRegion() {
        return this.addressRegion;
    }

    //Поле Район

    public void setAddressRayon(String addressRayon) {
        this.addressRayon = addressRayon;
    }
    public String getAddressRayon() {
        return this.addressRayon;
    }

    //Поле Тип населенного пункта

    public void setAddressSettlementType(String addressSettlementType) {
        this.addressSettlementType = addressSettlementType;
    }
    public String getAddressSettlementType() {
        return this.addressSettlementType;
    }

    //Поле Город

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }
    public String getAddressCity() {
        return this.addressCity;
    }

    //Поле Населенный пункт

    public void setAddressSettlementText(String addressSettlementText) {
        this.addressSettlementText = addressSettlementText;
    }
    public String getAddressSettlementText() {
        return this.addressSettlementText;
    }

    //Поле Населенный пункт

    public void setAddressSettlementDict(String addressSettlementDict) {
        this.addressSettlementDict = addressSettlementDict;
    }
    public String getAddressSettlementDict() {
        return this.addressSettlementDict;
    }

    //Поле Улица

    public void setAddressStreetText(String addressStreetText) {
        this.addressStreetText = addressStreetText;
    }
    public String getAddressStreetText() {
        return this.addressStreetText;
    }

    //Поле Улица

    public void setAddressStreetDict(String addressStreetDict) {
        this.addressStreetDict = addressStreetDict;
    }
    public String getAddressStreetDict() {
        return this.addressStreetDict;
    }

    //Поле Дом

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }
    public String getAddressHouse() {
        return this.addressHouse;
    }

    //Поле Корпус

    public void setAddressKorpus(String addressKorpus) {
        this.addressKorpus = addressKorpus;
    }
    public String getAddressKorpus() {
        return this.addressKorpus;
    }

    //Поле Квартира

    public void setAddressFlat(String addressFlat) {
        this.addressFlat = addressFlat;
    }
    public String getAddressFlat() {
        return this.addressFlat;
    }

    public void setAddressPostIndex(String addressPostIndex) {
        this.addressPostIndex = addressPostIndex;
    }
    public String getAddressPostIndex() {
        return this.addressPostIndex;
    }

    //Поле Страна

    public void setAddressPostCountry(String addressPostCountry) {
        this.addressPostCountry = addressPostCountry;
    }
    public String getAddressPostCountry() {
        return this.addressPostCountry;
    }

    //Поле Ввод адреса

    public void setAddressPostEnterType(String addressPostEnterType) {
        this.addressPostEnterType = addressPostEnterType;
    }
    public String getAddressPostEnterType() {
        return this.addressPostEnterType;
    }

    //Поле Область (край, республика)

    public void setAddressPostRegion(String addressPostRegion) {
        this.addressPostRegion = addressPostRegion;
    }
    public String getAddressPostRegion() {
        return this.addressPostRegion;
    }

    //Поле Район

    public void setAddressPostRayon(String addressPostRayon) {
        this.addressPostRayon = addressPostRayon;
    }
    public String getAddressPostRayon() {
        return this.addressPostRayon;
    }

    //Поле Тип населенного пункта

    public void setAddressPostSettlementType(String addressPostSettlementType) {
        this.addressPostSettlementType = addressPostSettlementType;
    }
    public String getAddressPostSettlementType() {
        return this.addressPostSettlementType;
    }

    //Поле Город

    public void setAddressPostCity(String addressPostCity) {
        this.addressPostCity = addressPostCity;
    }
    public String getAddressPostCity() {
        return this.addressPostCity;
    }

    //Поле Населенный пункт

    public void setAddressPostSettlementText(String addressPostSettlementText) {
        this.addressPostSettlementText = addressPostSettlementText;
    }
    public String getAddressPostSettlementText() {
        return this.addressPostSettlementText;
    }

    //Поле Населенный пункт

    public void setAddressPostSettlementDict(String addressPostSettlementDict) {
        this.addressPostSettlementDict = addressPostSettlementDict;
    }
    public String getAddressPostSettlementDict() {
        return this.addressPostSettlementDict;
    }

    //Поле Улица

    public void setAddressPostStreetText(String addressPostStreetText) {
        this.addressPostStreetText = addressPostStreetText;
    }
    public String getAddressPostStreetText() {
        return this.addressPostStreetText;
    }

    //Поле Улица

    public void setAddressPostStreetDict(String addressPostStreetDict) {
        this.addressPostStreetDict = addressPostStreetDict;
    }
    public String getAddressPostStreetDict() {
        return this.addressPostStreetDict;
    }

    //Поле Дом

    public void setAddressPostHouse(String addressPostHouse) {
        this.addressPostHouse = addressPostHouse;
    }
    public String getAddressPostHouse() {
        return this.addressPostHouse;
    }

    //Поле Корпус

    public void setAddressPostKorpus(String addressPostKorpus) {
        this.addressPostKorpus = addressPostKorpus;
    }
    public String getAddressPostKorpus() {
        return this.addressPostKorpus;
    }

    //Поле Квартира

    public void setAddressPostFlat(String addressPostFlat) {
        this.addressPostFlat = addressPostFlat;
    }
    public String getAddressPostFlat() {
        return this.addressPostFlat;
    }

    //Поле Контактный телефон
			
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


    public void setDocLoadMarriageCertficate(FileBean docLoadMarriageCertficate) {
					this.docLoadMarriageCertficate = docLoadMarriageCertficate;
				}
			public FileBean getDocLoadMarriageCertficate() {
				return this.docLoadMarriageCertficate;
				}

			public void setDocLoadNeedingHousing(FileBean docLoadNeedingHousing) {
					this.docLoadNeedingHousing = docLoadNeedingHousing;
				}
			public FileBean getDocLoadNeedingHousing() {
				return this.docLoadNeedingHousing;
				}
		

			public void setDocLoadDokhod(FileBean docLoadDokhod) {
					this.docLoadDokhod = docLoadDokhod;
				}
			public FileBean getDocLoadDokhod() {
				return this.docLoadDokhod;
				}
		

			public void setDocLoadDeklENVD(FileBean docLoadDeklENVD) {
					this.docLoadDeklENVD = docLoadDeklENVD;
				}
			public FileBean getDocLoadDeklENVD() {
				return this.docLoadDeklENVD;
				}
		

			public void setDocLoadDeklUSN(FileBean docLoadDeklUSN) {
					this.docLoadDeklUSN = docLoadDeklUSN;
				}
			public FileBean getDocLoadDeklUSN() {
				return this.docLoadDeklUSN;
				}

    private String factAddress;

    public void setFactAddress(String factAddress) {
        this.factAddress = factAddress;
    }
    public String getFactAddress() {
        return this.factAddress;
    }

    private String address;
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
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

    private String addressPost;
    public void setAddressPost(String addressPost) {
        this.addressPost = addressPost;
    }
    public String getAddressPost() {
        return this.addressPost;
    }

    private String addressPostCountryCode = "ru";
    public void setAddressPostCountryCode(String addressPostCountryCode) {
        this.addressPostCountryCode = addressPostCountryCode;
    }
    public String getAddressPostCountryCode() {
        return this.addressPostCountryCode;
    }

    private String addressPostCountryInput;
    public void setAddressPostCountryInput(String addressPostCountryInput) {
        this.addressPostCountryInput = addressPostCountryInput;
    }
    public String getAddressPostCountryInput() {
        return this.addressPostCountryInput;
    }

    private String addressPostCountrySettlement;
    public void setAddressPostCountrySettlement(String addressPostCountrySettlement) {
        this.addressPostCountrySettlement = addressPostCountrySettlement;
    }
    public String getAddressPostCountrySettlement() {
        return this.addressPostCountrySettlement;
    }

}
