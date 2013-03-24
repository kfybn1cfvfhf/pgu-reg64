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

    <@addressMacros.addressSoap label='addressPost' applicant=false
    country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
    country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
    area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
    country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
    street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' office='addressPostFlat' post="addressPostIndex"  />

    <@addressMacros.addressSoap label='addressRent' applicant=false
    country='addressRentCountry' countryCode='addressRentCountryCode' input='addressRentEnterType'
    country_input='addressRentCountryInput' settlementRF='addressRentSettlementDict' streetRF='addressRentStreetDict'
    area='addressRentRayon' region='addressRentRegion' settlement_type='addressRentSettlementType'
    country_settlement='addressRentCountrySettlement' settlement='addressRentSettlementText' city='addressRentCity'
    street='addressRentStreetText' house='addressRentHouse' corp='addressRentKorpus' office='addressRentFlat' post="addressRentIndex"  />

</#assign>

<#assign formElements = {
"incapable_enable":{"widgetClass":"boolean"},

"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},

"recipientPhone":{"widgetClass":"plaintext"},
"recipientEmail":{"widgetClass":"plaintext"},

<#--"recipientIdentityDocType":{"widgetClass":"dictionary", "dictionaryCode":"DUL_LS"},-->
"recipientIdentityDocType":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},

"socNo":{"widgetClass":"plaintext"},
"socDate":{"widgetClass":"date"},
"socFio":{"widgetClass":"plaintext"},

"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{}
}
/>

<@requestPattern.makeSoapRequest
owner=stateOrgCode
departmentCode=stateOrgCode
formElements=formElements
fileloadElements=fileloadElements
<#--applicantAttributes={"identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}}-->
/>

