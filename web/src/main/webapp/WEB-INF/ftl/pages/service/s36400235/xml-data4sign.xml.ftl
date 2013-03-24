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
    <@addressMacros.addressSoap label='address' applicant=true
    country='addressCountry' countryCode='addressCountryCode' input='addressEnterType'
    country_input='addressCountryInput' settlementRF='addressSettlementDict' streetRF='addressStreetDict'
    area='addressRayon' region='addressRegion' settlement_type='addressSettlementType'
    country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
    street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
</#assign>

<#assign formElements = {
"compFamilyClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.familyLastName?size)!0},
"familyLastName":{"widgetClass":"plaintext", "parentCode":"virtualParent"},
"familyFirstName":{"widgetClass":"plaintext", "parentCode":"virtualParent"},
"familyMiddleName":{"widgetClass":"plaintext", "parentCode":"virtualParent"},
"familyRelation":{"widgetClass":"dictionary", "dictionaryCode":"64_FAMILY_RELATION_64235", "parentCode":"virtualParent"},
"noEGRP":{"widgetClass":"boolean"}
}/>

<#assign fileloadElements = {
"identityDocLoad":{},
"identityFamilyDocLoad":{},
"compFamilyDocLoad":{},
"techInventDocLoad":{},
"motherCapDocLoad":{},
"noEGRPDocLoad":{},
"regPeopleDocLoad":{},
"dohodDocLoad":{},
"noSobstDocLoad":{},
"EGRPDocLoad":{},
"uchetNujdaJPDocLoad":{}
}/>

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
        applicantAttributes={"identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}} + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
        />
        <#break >

    <#default>
        <@requestPattern.makeSoapRequest
        owner=stateOrgCode
        departmentCode=stateOrgCode
        formElements=formElements
        fileloadElements=fileloadElements
        applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
        />

</#switch>