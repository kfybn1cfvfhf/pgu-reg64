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

<#assign formElements = {
"accNum":{"widgetClass":"plaintext"}
}/>

<#assign fileloadElements = {

}/>

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>