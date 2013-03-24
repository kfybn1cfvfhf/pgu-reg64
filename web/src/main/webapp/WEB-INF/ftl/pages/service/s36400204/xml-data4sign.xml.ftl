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
    <#if form.incapable_enable == "on">
        <@addressMacros.addressSoap label='recipientaddress' applicant=false
        country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType'
        country_input='recipientaddressCountryInput' settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict'
        area='recipientaddressRayon' region='recipientaddressRegion' settlement_type='recipientaddressSettlementType'
        country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressSettlementText' city='recipientaddressCity'
        street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />

        <@addressMacros.addressSoap label='recipientFactAdress' applicant=false
        country='recipientFactAdressCountry' countryCode='recipientFactAdressCountryCode' input='recipientFactAdressEnterType'
        country_input='recipientFactAdressCountryInput' settlementRF='recipientFactAdressSettlementDict' streetRF='recipientFactAdressStreetDict'
        area='recipientFactAdressRayon' region='recipientFactAdressRegion' settlement_type='recipientFactAdressSettlementType'
        country_settlement='recipientFactAdressCountrySettlement' settlement='recipientFactAdressSettlementText' city='recipientFactAdressCity'
        street='recipientFactAdressStreetText' house='recipientFactAdressHouse' corp='recipientFactAdressKorpus' flat='recipientFactAdressFlat' post="recipientFactAdressIndex"  />
    </#if>
</#assign>

<#assign applicantSoap>
    <@addressMacros.addressSoap label='address' applicant=true
    country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
    settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
    settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
    street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />


    <@addressMacros.addressSoap label='factAddress' applicant=true
    country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
    country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
    area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
    country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"dovCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_DOV_CATEGORY_64206"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientbirthdate":{"widgetClass":"date"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"socialSupport":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
"accrualMethod":{"widgetClass":"dictionary", "dictionaryCode":"03_WAY_BENEFIT_64206"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"postOffice":{"widgetClass":"plaintext"},
"agreementApplicant":{"widgetClass":"boolean"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}
/>

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"honoraryCitizenLoad":{},
"certificateLackSupportLoad":{}
}
/>


<@requestPattern.makeSoapRequest
owner=stateOrgCode
departmentCode=stateOrgCode
formElements=formElements
fileloadElements=fileloadElements
applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>

