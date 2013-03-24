<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>
<#import "/macros/address.ftl" as addressMacros>

<#assign applicantSoap>
    <#if form.incapable_enable == "off">
        <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                   settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                   settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                   street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>


        <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                    settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                    settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"/>
    </#if>
</#assign>

<#assign otherSoapPart>

    <#if form.incapable_enable == "off">
        <@addressMacros.addressSoap label='addressReg' applicant=false country='addressRegCountry' countryCode='addressRegCountryCode' input='addressRegEnterType' country_input='addressRegCountryInput'
                                   settlementRF='addressRegSettlementDict' streetRF='addressRegStreetDict' area='addressRegRayon' region='addressRegRegion'
                                   settlement_type='addressRegSettlementType' country_settlement='addressRegCountrySettlement' settlement='addressRegSettlementText' city='addressRegCity'
                                   street='addressRegStreetText' house='addressRegHouse' corp='addressRegKorpus' flat='addressRegFlat' post="addressRegIndex"/>
    <#else>

        <@addressMacros.addressSoap label='recipientaddress' applicant=false country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType' country_input='recipientaddressCountryInput'
                                   settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
                                   settlement_type='recipientaddressSettlementType' country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressaettlementText' city='recipientaddressCity'
                                   street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"/>

        <@addressMacros.addressSoap label='recFactAddress' applicant=false country='recFactAddressCountry' countryCode='recFactAddressCountryCode' input='recFactAddressEnterType' country_input='recFactAddressCountryInput'
                                                    settlementRF='recFactAddressSettlementDict' streetRF='recFactAddressStreetDict' area='recFactAddressRayon' region='recFactAddressRegion'
                                                    settlement_type='recFactAddressSettlementType' country_settlement='recFactAddressCountrySettlement' settlement='recFactAddressSettlementText' city='recFactAddressCity'
                                                    street='recFactAddressStreetText' house='recFactAddressHouse' corp='recFactAddressKorpus' flat='recFactAddressFlat' post="recFactAddressIndex"/>

        <@addressMacros.addressSoap label='addressRecReg' applicant=false country='addressRecRegCountry' countryCode='addressRecRegCountryCode' input='addressRecRegEnterType' country_input='addressRecRegCountryInput'
                                   settlementRF='addressRecRegSettlementDict' streetRF='addressRecRegStreetDict' area='addressRecRegRayon' region='addressRecRegRegion'
                                   settlement_type='addressRecRegSettlementType' country_settlement='addressRecRegCountrySettlement' settlement='addressRecRegSettlementText' city='addressRecRegCity'
                                   street='addressRecRegStreetText' house='addressRecRegHouse' corp='addressRecRegKorpus' flat='addressRecRegFlat' post="addressRecRegIndex"/>
    </#if>
</#assign>

<#assign formElements = {
"addressReg":{"formElementId":"addressReg", "widgetClass":"address", "addressSoap":otherSoapPart},
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"politicalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_CITIZENSHIP_REFUGEE_64202"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientSnils":{"widgetClass":"plaintext"},
"recipientBirthdate":{"widgetClass":"date"},
"recipientpoliticalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_CITIZENSHIP_REFUGEE_64202"},
"recipientOtherDocTypeName":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"goalAppl":{"widgetClass":"dictionary", "dictionaryCode":"03_GOAL_APPL_64202"},
"socSupport":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
"dismissedCh":{"widgetClass":"boolean"},
"workLastName":{"widgetClass":"plaintext"},
"addressRegSrok":{"widgetClass":"plaintext"},
"workFirstName":{"widgetClass":"plaintext"},
"workMiddleName":{"widgetClass":"plaintext"},
"addressRecRegSrok":{"widgetClass":"plaintext"},
"workBirthdate":{"widgetClass":"date"},
"wayBenefit":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_BENEFIT_64"},
"addressBenefit":{"widgetClass":"plaintext"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"agreeCh":{"widgetClass":"boolean"},
"agree1Ch":{"widgetClass":"boolean"}
} />

<#assign fileloadElements =  {
"identityDocLoad":{},
"foreignerDocLoad":{},
"residenceDocLoad":{},
"refugeeDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"doc1":{},
"recResidenceDocLoad":{},
"recRefugeeDocLoad":{},
"disabilityDocLoad":{},
"employDocLoad":{},
"womanDocLoad":{},
"nalogDocLoad":{},
"unemployedDocLoad":{},
"socDocLoad":{},
"socMedDocLoad":{}
}
/>

<#if form.incapable_enable = "on">
<#switch form.recipientIentityDocType>
<#case "1">
<#case "2">
<#case "3">
<#case "4">

<#assign formElements = formElements +{
"recipientIentityDocType":{"formElementId":"recipientIentityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
}
/>
<#break >
<#default>
 <#assign formElements = formElements +{
"recipientIentityDocType":{"widgetClass":"plaintext"}
}
 />
</#switch>
</#if>

<#if form.incapable_enable == "off">

<#switch form.identityDocType>
<#case "1">
<#case "2">
<#case "3">
<#case "4">

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={
        "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"},
        "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
    }
/>
<#break >

<#default>
<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={"identityDocType":{"formElementId":"identityDocType", "widgetClass":"plaintext"},
     "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
    }
/>
</#switch>

<#else>

<#switch form.identityDocType>
<#case "1">
<#case "2">
<#case "3">
<#case "4">
<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={
        "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"},
        "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
    }
/>
<#break >

<#default>
<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={"identityDocType":{"formElementId":"identityDocType", "widgetClass":"plaintext"},
     "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
    }
/>
</#switch>

</#if>

