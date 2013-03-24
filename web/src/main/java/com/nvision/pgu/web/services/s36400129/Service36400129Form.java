package com.nvision.pgu.web.services.s36400129;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import com.nvision.pgu.core.rules.api.FieldValueOverwriting;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;

import java.util.Date;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400129Form extends AbstractServiceOrderForm {

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String lastName;			
						
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String firstName;			
						
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String middleName;			

            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.ADDRESS, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String address;			
						
	        @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String phone;			
						
            @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL, overwriting = FieldValueOverwriting.WHEN_SRC_IS_NOT_NULL)
			private String email;			

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
	
			
						
			
			private String rayon;			
						
			
			private String nameSchool;			
						
						
			
			private String childLastName;			
						
			
			private String childFirstName;			
						
			
			private String childMiddleName;			
						
			
			private Date childBirthdate;			
						
			
			private String childGrade;			
						
			

						
									
						
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
		
	
			
						
			public void setRayon(String rayon) {
					this.rayon = rayon;
				}
			public String getRayon() {
				return this.rayon;
				}
		
						
			public void setNameSchool(String nameSchool) {
					this.nameSchool = nameSchool;
				}
			public String getNameSchool() {
				return this.nameSchool;
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
		
						
			public void setChildGrade(String childGrade) {
					this.childGrade = childGrade;
				}
			public String getChildGrade() {
				return this.childGrade;
				}
		

	
		}
