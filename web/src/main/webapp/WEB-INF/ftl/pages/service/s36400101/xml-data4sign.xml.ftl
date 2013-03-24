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

<#assign otherSoapPart>

    <@addressMacros.addressSoap label='residenceAdress' applicant=false country='residenceAdressCountry' countryCode='residenceAdressCountryCode' input='residenceAdressEnterType' country_input='residenceAdressCountryInput'
    settlementRF='residenceAdressSettlementDict' streetRF='residenceAdressStreetDict' area='residenceAdressRayon' region='residenceAdressRegion'
    settlement_type='residenceAdressSettlementType' country_settlement='residenceAdressCountrySettlement' settlement='residenceAdressSettlementText' city='residenceAdressCity'
    street='residenceAdressStreetText' house='residenceAdressHouse' corp='residenceAdressKorpus' flat='residenceAdressFlat' post="residenceAdressIndex"  />

    <@addressMacros.addressSoap label='addressSeat' applicant=false country='addressSeatCountry' countryCode='addressSeatCountryCode' input='addressSeatEnterType' country_input='addressSeatCountryInput'
    settlementRF='addressSeatSettlementDict' streetRF='addressSeatStreetDict' area='addressSeatRayon' region='addressSeatRegion'
    settlement_type='addressSeatSettlementType' country_settlement='addressSeatCountrySettlement' settlement='addressSeatSettlementText' city='addressSeatCity'
    street='addressSeatStreetText' house='addressSeatHouse' corp='addressSeatKorpus' flat='addressSeatFlat' post="addressSeatIndex"  />
</#assign>


<#assign formElements = {
"politicalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
"addressPost":{"formElementId":"addressPost", "widgetClass":"address", "addressSoap":otherSoapPart},
"targetAppeal":{"widgetClass":"dictionary", "dictionaryCode":"0364_TARGET_APPEAL_101"},
"materialCapabilities":{"widgetClass":"boolean"},
"furtherInform":{"widgetClass":"plaintext"}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"opinionBeGuardLoad":{},
"certificateEmploymentLoad":{},
"medicalReportLoad":{},
"marriageCertificateLoad":{},
"writtenConsentLoad":{},
"personalDataConsentLoad":{},
"guardTrainingLoad":{},
"autobiographyLoad":{},
"excerptHomeLoad":{},
"convictionLoad":{},
"accordingPremisesLoad":{},
"technicalRulesLoad":{},
"certificatePensionLoad":{},
"socialPaymentsLoad":{}
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
        "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
        }
        />
        <#break >

    <#default>
        <@requestPattern.makeSoapRequest
        owner=stateOrgCode
        departmentCode=stateOrgCode
        formElements=formElements
        fileloadElements=fileloadElements
        applicantAttributes={}
        />
</#switch>
