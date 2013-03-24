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

    <@addressMacros.addressSoap label='factAddress' applicant=true
    country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
    country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
    area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
    country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
</#assign>

<#assign otherSoapPart>
    <@addressMacros.addressSoap label='addressPost' applicant=false
    country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
    country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
    area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
    country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
    street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"birthplace":{"widgetClass":"plaintext"},
"purpose":{"widgetClass":"dictionary", "dictionaryCode":"03_PURPOSE_APPL_64180"},
"sertKind":{"widgetClass":"plaintext"},
"sertSeria":{"widgetClass":"plaintext"},
"sertNo":{"widgetClass":"plaintext"},
"sertCat":{"widgetClass":"plaintext"},
"sertOrg":{"widgetClass":"plaintext"},
"sertDate":{"widgetClass":"date"},
"drivingCategory":{"widgetClass":"boolean"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"meddocLoad":{},
"edudocLoad":{},
"drivingdocLoad":{},
"dutydocLoad":{}
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