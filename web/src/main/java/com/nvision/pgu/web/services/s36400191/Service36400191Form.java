package com.nvision.pgu.web.services.s36400191;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;
import ru.lanit.samara.pgu.core.rules.InitRulePersonalDataStrategy;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400191Form extends AbstractServiceOrderForm {

		 @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String lastName;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
           	private String firstName;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
     		private String middleName;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SNILS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String snils;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.SEX, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String sex;
	     @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.BIRTHDATE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
            private Date birthdate;
			 @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String factAddress;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String address;
			private String addressEq;
			private String addressPost;
		 @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_TYPE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String identityDocType;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_SERIES, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String passSeria;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_NUMBER, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String passNo;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEDATE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private Date passDate;
         @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MAINDOCUMENT_ISSUEORG, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String passFrom;
			private String mnnName;

			
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
		

			
			public void setSex(String sex) {
					this.sex = sex;
				}
			public String getSex() {
				return this.sex;
				}
		

			
			public void setBirthdate(Date birthdate) {
					this.birthdate = birthdate;
				}
			public Date getBirthdate() {
				return this.birthdate;
				}
		

			public void setFactAddress(String factAddress) {
					this.factAddress = factAddress;
				}
			public String getFactAddress() {
				return this.factAddress;
				}
		

			
			public void setAddress(String address) {
					this.address = address;
				}
			public String getAddress() {
				return this.address;
				}
		

			
			public void setAddressEq(String addressEq) {
					this.addressEq = addressEq;
				}
			public String getAddressEq() {
				return this.addressEq;
				}
		

			
			public void setAddressPost(String addressPost) {
					this.addressPost = addressPost;
				}
			public String getAddressPost() {
				return this.addressPost;
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
		

			
			public void setMnnName(String mnnName) {
					this.mnnName = mnnName;
				}
			public String getMnnName() {
				return this.mnnName;
				}
		
	
		}
