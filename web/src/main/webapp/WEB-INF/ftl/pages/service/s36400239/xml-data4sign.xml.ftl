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
    street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"dovCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_DOV_CATEGORY_64206"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientIdentityDocType":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"baseAppeal":{"widgetClass":"dictionary", "dictionaryCode":"64_BASE_APPEAL_64239"},
"lonely":{"widgetClass":"boolean"},
"noEGRP":{"widgetClass":"boolean"}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"techInventDocLoad":{},
"svidBirthDocLoad":{},
"noEGRPDocLoad":{},
"regPeopleDocLoad":{},
"statusDocLoad":{},
"uchetNujdaJPDocLoad":{},
"dulFamilyDocLoad":{},
"sostavFamilyDocLoad":{},
"obrabPDDocLoad":{},
"spravNo28DocLoad":{},
"EGRPDocLoad":{}
}
/>

<#if form.incapable_enable == "on">
    <#assign otherSoapPart>
        <@addressMacros.addressSoap label='recipientaddress' applicant=false country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType' country_input='recipientaddressCountryInput'
        settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
        settlement_type='recipientaddressSettlementType' country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressSettlementText' city='recipientaddressCity'
        street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />
    </#assign>

    <#assign formElements =  formElements + {
    "recipientaddress":{"formElementId":"recipientaddress", "widgetClass":"address", "addressSoap":otherSoapPart}
    }/>

</#if>

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={
        "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
    }
/>
