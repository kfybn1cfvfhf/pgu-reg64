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
        <@addressMacros.addressSoap label='factAddress' applicant=true
        country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
        country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
        area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
        country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
        street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
</#assign>

<#assign formElements = {
"socialSupport":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
"accrualMethod":{"widgetClass":"dictionary", "dictionaryCode":"03_WAY_BENEFIT_64206"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"postOffice":{"widgetClass":"plaintext"}
}
/>

<#assign fileloadElements = {
"rehabilitationCertificateLoad":{},
"deathCertificateLoad":{},
"certificatePaymentLoad":{}
}
/>


<@requestPattern.makeSoapRequest
owner=stateOrgCode
departmentCode=stateOrgCode
formElements=formElements
fileloadElements=fileloadElements
applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>