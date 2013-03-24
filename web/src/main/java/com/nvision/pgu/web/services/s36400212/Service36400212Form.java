package com.nvision.pgu.web.services.s36400212;

import com.nvision.pgu.core.annotations.InitRule;
import com.nvision.pgu.core.converters.AccessCounterList;
import com.nvision.pgu.core.rules.InitRulePersonalDataStrategy;
import ru.lanit.samara.pgu.core.forms.AbstractServiceOrderForm;

import java.util.Date;
import java.util.List;

/**
 * @author aleksisha
 *         Date: Oct 3, 2010
 *         Time: 7:21:39 PM
 */
public class Service36400212Form extends AbstractServiceOrderForm {

    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.LASTNAME)
            private String lastName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.FIRSTNAME)
			private String firstName;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.MIDDLENAME)
			private String middleName;
			private String post;	//
			private String orgName;	//
			private String eduCategoria;
			private String eduPost;	//
			private String eduRealPost;
			private Date eduRealPostData;
			private String eduOsnAttestat;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.PHONE)
			private String phone;
    @InitRule(strategy = InitRulePersonalDataStrategy.class, field = InitRulePersonalDataStrategy.EMAIL)
			private String email;
			private String eduOrg;	//
			private String eduNargady;	//
			private String eduModernKvalif;	//
			private String eduStagSpec;	//
			private String eduStagPost;	//
			private String eduStagOrg;	//
			private String eduGakAgree;
			private String eduAttestAgree;	//

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
		
			public void setPost(String post) {
					this.post = post;
				}
			public String getPost() {
				return this.post;
				}
		
			public void setOrgName(String orgName) {
					this.orgName = orgName;
				}
			public String getOrgName() {
				return this.orgName;
				}
		
			public void setEduCategoria(String eduCategoria) {
					this.eduCategoria = eduCategoria;
				}
			public String getEduCategoria() {
				return this.eduCategoria;
				}
		
			public void setEduPost(String eduPost) {
					this.eduPost = eduPost;
				}
			public String getEduPost() {
				return this.eduPost;
				}
		
			public void setEduRealPost(String eduRealPost) {
					this.eduRealPost = eduRealPost;
				}
			public String getEduRealPost() {
				return this.eduRealPost;
				}
		
			public void setEduRealPostData(Date eduRealPostData) {
					this.eduRealPostData = eduRealPostData;
				}
			public Date getEduRealPostData() {
				return this.eduRealPostData;
				}
		
			public void setEduOsnAttestat(String eduOsnAttestat) {
					this.eduOsnAttestat = eduOsnAttestat;
				}
			public String getEduOsnAttestat() {
				return this.eduOsnAttestat;
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
		
			public void setEduOrg(String eduOrg) {
					this.eduOrg = eduOrg;
				}
			public String getEduOrg() {
				return this.eduOrg;
				}
		
			public void setEduNargady(String eduNargady) {
					this.eduNargady = eduNargady;
				}
			public String getEduNargady() {
				return this.eduNargady;
				}
		
			public void setEduModernKvalif(String eduModernKvalif) {
					this.eduModernKvalif = eduModernKvalif;
				}
			public String getEduModernKvalif() {
				return this.eduModernKvalif;
				}
		
			public void setEduStagSpec(String eduStagSpec) {
					this.eduStagSpec = eduStagSpec;
				}
			public String getEduStagSpec() {
				return this.eduStagSpec;
				}
		
			public void setEduStagPost(String eduStagPost) {
					this.eduStagPost = eduStagPost;
				}
			public String getEduStagPost() {
				return this.eduStagPost;
				}
		
			public void setEduStagOrg(String eduStagOrg) {
					this.eduStagOrg = eduStagOrg;
				}
			public String getEduStagOrg() {
				return this.eduStagOrg;
				}
		
			public void setEduGakAgree(String eduGakAgree) {
					this.eduGakAgree = eduGakAgree;
				}
			public String getEduGakAgree() {
				return this.eduGakAgree;
				}
		
			public void setEduAttestAgree(String eduAttestAgree) {
					this.eduAttestAgree = eduAttestAgree;
				}
			public String getEduAttestAgree() {
				return this.eduAttestAgree;
				}
		
	
		}
