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
"politicalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientBirthdate":{"widgetClass":"date"},
"recipientpoliticalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
"recipientOtherDocTypeName":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"groundsService":{"widgetClass":"dictionary", "dictionaryCode":"64_GROUNDS_SERVICE_64021"},
"zayavIP":{"widgetClass":"boolean"},
"familyAmount":{"widgetClass":"plaintext"},
"family":{"widgetClass":"virtualParent", "cloneQuantity":(form.familyLastName?size)!0},
"familyLastName":{"widgetClass":"plaintext", "parentCode":"family"},
"familyFirstName":{"widgetClass":"plaintext", "parentCode":"family"},
"familyMiddleName":{"widgetClass":"plaintext", "parentCode":"family"},
"familyBirthDate":{"widgetClass":"date", "parentCode":"family"},
"familyRelationships":{"widgetClass":"dictionary", "dictionaryCode":"64_FAMILY_RELATIONSHIP_64021", "parentCode":"family"},
"familyIP":{"widgetClass":"boolean", "parentCode":"family"},
"agreementApplicant":{"widgetClass":"boolean"}
} />

<#if form.incapable_enable == "on">
    <#switch form.recipientIdentityDocType>
        <#case "1">
        <#case "2">
        <#case "3">
        <#case "4">
            <#assign formElements =  formElements + {
            "recipientIdentityDocType":{"widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
            }/>
            <#break >

        <#default>
            <#assign formElements =  formElements + {
            "recipientIdentityDocType":{"widgetClass":"plaintext"}
            }/>
    </#switch>
</#if>

<#if form.incapable_enable == "on">
    <#assign otherSoapPart>

        <@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

        <@addressMacros.addressSoap label='recipientaddress' applicant=false country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType' country_input='recipientaddressCountryInput'
        settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
        settlement_type='recipientaddressSettlementType' country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressSettlementText' city='recipientaddressCity'
        street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />

    </#assign>
<#else>
    <#assign otherSoapPart>

        <@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

    </#assign>
</#if>

<#assign formElements =  formElements + {
"addressPost":{"formElementId":"addressPost", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"idDocumentFamilyLoad":{},
"kinshipLoad":{},
"birthCertificateLoad":{},
"houseBookLoad":{},
"declarationIncomeLoad":{},
"personalIncomeLoad":{},
"otherIncomeLoad":{},
"realEstateLoad":{},
"priceMotorLoad":{},
"certificateInsuranceLoad":{},
"technicalInventoryLoad":{},
"rightHousingLoad":{},
"extractLoad":{},
"imputedIncomeLoad":{},
"socialPaymentsLoad":{},
"semploymentServicesLoad":{},
"socialAssistanceLoad":{},
"transportDocLoad":{},
"inventCostEastLoad":{},
"cadastrCostZemLoad":{},
"vipIzEGRPLoad":{}
}
/>


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
        applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
        />
</#switch>
