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

   <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                           settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                           settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>

</#assign>

<#assign otherSoapPart>
<#if form.recipientaddressSettlementDict?has_content || form.recipientaddressCity?has_content>

<@addressMacros.addressSoap label='recipientaddress' applicant=false country='recipientaddressCountry'
countryCode='recipientAddressCountryCode' input='recipientaddressEnterType'
country_input='recipientAddressCountryInput'settlementRF='recipientaddressSettlementDict'
streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
settlement_type='recipientaddressSettlementType' country_settlement='recipientAddressCountrySettlement'
settlement='recipientaddressSettlementText' city='recipientaddressCity'
street='recipientaddressStreetText' house='recipientaddressHouse'
corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"/>

</#if>

</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"addressEq":{"widgetClass":"boolean"},
"addressPost":{"widgetClass":"plaintext"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientBirthDate":{"widgetClass":"date"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"pensDocLoad":{"widgetClass":"plaintext"},
"socialSupport":{"widgetClass":"dictionary", "dictionaryCode":"03_GKU_USPN_64102"},
"catAppl":{"widgetClass":"dictionary", "dictionaryCode":"03_CATEGORY_APPL_64171"},
"rec_address":{"formElementId":"rec_address", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"dovDovLoad":{},
"dovPasLoad":{},
"identityDocLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"rewardingCertificateLoad":{},
"experienceCertificateLoad":{},
"workActivityLoad":{},
"employmentHistoryLoad":{}
}
/>


<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>