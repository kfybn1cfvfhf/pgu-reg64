package com.nvision.pgu.web.services.s36400045;

import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400045Form extends AbstractServiceOrderForm {

    private Boolean representativeStatusChanged = true;

    public Boolean getRepresentativeStatusChanged() {
        return representativeStatusChanged;
    }

    public void setRepresentativeStatusChanged(Boolean representativeStatusChanged) {
        this.representativeStatusChanged = representativeStatusChanged;
    }

    public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setPhone("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setEmail("");
    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {

        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setIdentityDocType(privateRoomDataContainer.getIdentityDocType());
        this.setPassSeria(privateRoomDataContainer.getPassSeria());
        this.setPassNo(privateRoomDataContainer.getPassNo());
        this.setPassFrom(privateRoomDataContainer.getPassFrom());
        this.setPassDate(privateRoomDataContainer.getPassDate());
        this.setEmail(privateRoomDataContainer.getEmail());
    }


			private String dov_enable;
			
			private FileBean dovDovLoad;			
						
			
			private FileBean dovPasLoad;			
						
									
						
			
			private String lastName;			
						
			
			private String firstName;			
						
			
			private String middleName;			
							
						
			
			private String phone;			
						
			
			private String email;			
						
			
			private String applEmployedCh;			
						
						
			
			private String applWorkPlace;			
						
			
			private String applWorkPost;			
						
			
			private String applWorkPhone;			
						
						
			
			private String identityDocType;			
						
			
			private String passSeria;			
						
			
			private String passNo;			
						
			
			private Date passDate;			
						
			
			private String passFrom;			
									
						
			
			private FileBean identityDocLoad;			
						
			
			private String applStatus;
						
			
			private String parent2DisableCh;			
						
			
			private String applPrivilegeCh;			
						
						
			
			private String privilegeCategory;
									

			private FileBean topPriorityDocLoad;			
						
			
			private FileBean priorityDocLoad;			
						
			
			private FileBean advantageDocLoad;			
	
			
						
						
			
			private String parentLastName;			
						
			
			private String parentFirstName;			
						
			
			private String parentMiddleName;			
						
			
			private String parentEmployedCh;			
						
						
			
			private String parentWorkPlace;			
						
			
			private String parentWorkPost;			
						
						
			
			private String parentIdentityDocType;			
						
			
			private String parentPassSeria;			
						
			
			private String parentPassNo;			
						
			
			private Date parentPassDate;			
						
			
			private String parentPassFrom;			
	
			
						
			
			private String dou_rd;

			
			private String childLastName;			
						
			
			private String childFirstName;			
						
			
			private String childMiddleName;			
						
			
			private Date childBirthdate;
						
			
			private String childGender;			
						
			
			private String correctCh;			
									
						
			
			private FileBean birthCertificateDocLoad;			
						
			
			private FileBean commissionDocLoad;

            private String SRayon;

    public String getSRayon() {
        return SRayon;
    }

    public void setSRayon(String SRayon) {
        this.SRayon = SRayon;
    }

    public void setDov_enable(String dov_enable) {
        // если пользователь изменил тип заявителя, поднимаем соответствующий флаг
        if (this.dov_enable != null) { // происходит сохранение данных с вэб-формы, а не заливка данных из драфта
            if (dov_enable == null) {  // с вэб-формы пришёл off
                if (!"off".equals(this.getDov_enable())) { // ... а в форме сохранён on
                    this.setRepresentativeStatusChanged(true);
                }
                this.dov_enable = "off";
            } else {
                if (!this.getDov_enable().equals(dov_enable)){
                    this.setRepresentativeStatusChanged(true);
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
		
						
			public void setApplEmployedCh(String applEmployedCh) {
					this.applEmployedCh = applEmployedCh;
				}
			public String getApplEmployedCh() {
				return this.applEmployedCh == null ? "off" : this.applEmployedCh;
				}
		
						
						
			public void setApplWorkPlace(String applWorkPlace) {
					this.applWorkPlace = applWorkPlace;
				}
			public String getApplWorkPlace() {
				return this.applWorkPlace;
				}
		
						
			public void setApplWorkPost(String applWorkPost) {
					this.applWorkPost = applWorkPost;
				}
			public String getApplWorkPost() {
				return this.applWorkPost;
				}
		
						
			public void setApplWorkPhone(String applWorkPhone) {
					this.applWorkPhone = applWorkPhone;
				}
			public String getApplWorkPhone() {
				return this.applWorkPhone;
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
		
						
			public void setApplStatus(String applStatus) {
					this.applStatus = applStatus;
				}
			public String getApplStatus() {
				return this.applStatus;
				}
		
						
			public void setParent2DisableCh(String parent2DisableCh) {
					this.parent2DisableCh = parent2DisableCh;
				}
			public String getParent2DisableCh() {
				return this.parent2DisableCh == null ? "off" : this.parent2DisableCh;
				}
		
						
			public void setApplPrivilegeCh(String applPrivilegeCh) {
					this.applPrivilegeCh = applPrivilegeCh;
				}
			public String getApplPrivilegeCh() {
				return this.applPrivilegeCh == null ? "off" : this.applPrivilegeCh;
				}
		
						
						
			public void setPrivilegeCategory(String privilegeCategory) {
					this.privilegeCategory = privilegeCategory;
				}
			public String getPrivilegeCategory() {
				return this.privilegeCategory;
				}
		
									
						
			public void setTopPriorityDocLoad(FileBean topPriorityDocLoad) {
					this.topPriorityDocLoad = topPriorityDocLoad;
				}
			public FileBean getTopPriorityDocLoad() {
				return this.topPriorityDocLoad;
				}
		
						
			public void setPriorityDocLoad(FileBean priorityDocLoad) {
					this.priorityDocLoad = priorityDocLoad;
				}
			public FileBean getPriorityDocLoad() {
				return this.priorityDocLoad;
				}
		
						
			public void setAdvantageDocLoad(FileBean advantageDocLoad) {
					this.advantageDocLoad = advantageDocLoad;
				}
			public FileBean getAdvantageDocLoad() {
				return this.advantageDocLoad;
				}
		
	
			
						
						
			public void setParentLastName(String parentLastName) {
					this.parentLastName = parentLastName;
				}
			public String getParentLastName() {
				return this.parentLastName;
				}
		
						
			public void setParentFirstName(String parentFirstName) {
					this.parentFirstName = parentFirstName;
				}
			public String getParentFirstName() {
				return this.parentFirstName;
				}
		
						
			public void setParentMiddleName(String parentMiddleName) {
					this.parentMiddleName = parentMiddleName;
				}
			public String getParentMiddleName() {
				return this.parentMiddleName;
				}
		
						
			public void setParentEmployedCh(String parentEmployedCh) {
					this.parentEmployedCh = parentEmployedCh;
				}
			public String getParentEmployedCh() {
				return this.parentEmployedCh == null ? "off" : this.parentEmployedCh;
				}
		
						
						
			public void setParentWorkPlace(String parentWorkPlace) {
					this.parentWorkPlace = parentWorkPlace;
				}
			public String getParentWorkPlace() {
				return this.parentWorkPlace;
				}
		
						
			public void setParentWorkPost(String parentWorkPost) {
					this.parentWorkPost = parentWorkPost;
				}
			public String getParentWorkPost() {
				return this.parentWorkPost;
				}
		
						
						
			public void setParentIdentityDocType(String parentIdentityDocType) {
					this.parentIdentityDocType = parentIdentityDocType;
				}
			public String getParentIdentityDocType() {
				return this.parentIdentityDocType;
				}
		
						
			public void setParentPassSeria(String parentPassSeria) {
					this.parentPassSeria = parentPassSeria;
				}
			public String getParentPassSeria() {
				return this.parentPassSeria;
				}
		
						
			public void setParentPassNo(String parentPassNo) {
					this.parentPassNo = parentPassNo;
				}
			public String getParentPassNo() {
				return this.parentPassNo;
				}
		
						
			public void setParentPassDate(Date parentPassDate) {
					this.parentPassDate = parentPassDate;
				}
			public Date getParentPassDate() {
				return this.parentPassDate;
				}
		
						
			public void setParentPassFrom(String parentPassFrom) {
					this.parentPassFrom = parentPassFrom;
				}
			public String getParentPassFrom() {
				return this.parentPassFrom;
				}

						
			public void setDou_rd(String dou_rd) {
					this.dou_rd = dou_rd;
				}
			public String getDou_rd() {
				return this.dou_rd;
				}
		
						
						
			public void setChildLastName(String childLastName) {
					this.childLastName = childLastName;
				}
			public String getChildLastName() {
				return this.childLastName;
				}
		
						
			public void setChildFirstName(String childFirstName) {
					this.childFirstName = childFirstName;
				}
			public String getChildFirstName() {
				return this.childFirstName;
				}
		
						
			public void setChildMiddleName(String childMiddleName) {
					this.childMiddleName = childMiddleName;
				}
			public String getChildMiddleName() {
				return this.childMiddleName;
				}
		
						
			public void setChildBirthdate(Date childBirthdate) {
					this.childBirthdate = childBirthdate;
				}
			public Date getChildBirthdate() {
				return this.childBirthdate;
				}
		
						
			public void setChildGender(String childGender) {
					this.childGender = childGender;
				}
			public String getChildGender() {
				return this.childGender;
				}
		
						
			public void setCorrectCh(String correctCh) {
					this.correctCh = correctCh;
				}
			public String getCorrectCh() {
				return this.correctCh;
				}

			public void setBirthCertificateDocLoad(FileBean birthCertificateDocLoad) {
					this.birthCertificateDocLoad = birthCertificateDocLoad;
				}
			public FileBean getBirthCertificateDocLoad() {
				return this.birthCertificateDocLoad;
				}
		
						
			public void setCommissionDocLoad(FileBean commissionDocLoad) {
					this.commissionDocLoad = commissionDocLoad;
				}
			public FileBean getCommissionDocLoad() {
				return this.commissionDocLoad;
				}
		
	
		}
