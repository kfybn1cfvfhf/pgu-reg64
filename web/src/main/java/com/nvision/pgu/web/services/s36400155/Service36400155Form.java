package com.nvision.pgu.web.services.s36400155;

import com.nvision.pgu.core.util.FileBean;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.util.IPrivateRoomDataContainer;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400155Form extends AbstractServiceOrderForm {

    public void clearApplicantAttributes() {

        this.setLastName("");
        this.setFirstName("");
        this.setMiddleName("");
        this.setAddress("");
        this.setFactAddress("");
        this.setPhone("");
        this.setIdentityDocType("");
        this.setPassSeria("");
        this.setPassNo("");
        this.setPassFrom("");
        this.setPassDate(null);
        this.setBirthdate(null);
        this.setSex("");

    }

    public void fillApplicantAttributesWithPrivateRoomData(IPrivateRoomDataContainer privateRoomDataContainer) {

        this.setLastName(privateRoomDataContainer.getLastName());
        this.setFirstName(privateRoomDataContainer.getFirstName());
        this.setMiddleName(privateRoomDataContainer.getMiddleName());
        this.setBirthdate(privateRoomDataContainer.getBirthdate());
        this.setSex(privateRoomDataContainer.getSex());
        this.setAddress(privateRoomDataContainer.getAddress());
        this.setFactAddress(privateRoomDataContainer.getAddress());
        this.setPhone(privateRoomDataContainer.getPhone());
        this.setIdentityDocType(privateRoomDataContainer.getIdentityDocType());
        this.setPassSeria(privateRoomDataContainer.getPassSeria());
        this.setPassNo(privateRoomDataContainer.getPassNo());
        this.setPassFrom(privateRoomDataContainer.getPassFrom());
        this.setPassDate(privateRoomDataContainer.getPassDate());


    }


             private String dov_enable;


			
			private FileBean dovDovLoad;
			
			private FileBean dovPasLoad;
			
			private String lastName;
			
			private String firstName;
			private String middleName;
			
			private Date birthdate;
			
			private String sex;
			private String address;
			
			private String factAddress;
			private String phone;
			
			private String email;
			private String polis;
			
			private String workplace;
			private String identityDocType;
			private String passSeria;
			private String passNo;
			private Date passDate;
			
			private String passFrom;
			private FileBean polisDocLoad;
			private String lpu;
			private String doctor;
			private Date desiredDate;
             private Boolean dov_enable_changed = true;

       public Boolean getDov_enable_changed() {
           return dov_enable_changed;
       }

       public void setDov_enable_changed(Boolean dov_enable_changed) {
           this.dov_enable_changed = dov_enable_changed;
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

			public void setAddress(String address) {
					this.address = address;
				}
			public String getAddress() {
				return this.address;
				}

			public void setFactAddress(String factAddress) {
					this.factAddress = factAddress;
				}
			public String getFactAddress() {
				return this.factAddress;
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

			public void setPolis(String polis) {
					this.polis = polis;
				}
			public String getPolis() {
				return this.polis;
				}

			public void setWorkplace(String workplace) {
					this.workplace = workplace;
				}
			public String getWorkplace() {
				return this.workplace;
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

			public void setPolisDocLoad(FileBean polisDocLoad) {
					this.polisDocLoad = polisDocLoad;
				}
			public FileBean getPolisDocLoad() {
				return this.polisDocLoad;
				}

			public void setLpu(String lpu) {
					this.lpu = lpu;
				}
			public String getLpu() {
				return this.lpu;
				}

			public void setDoctor(String doctor) {
					this.doctor = doctor;
				}
			public String getDoctor() {
				return this.doctor;
				}

			public void setDesiredDate(Date desiredDate) {
					this.desiredDate = desiredDate;
				}
			public Date getDesiredDate() {
				return this.desiredDate;
				}
		
	
		}
