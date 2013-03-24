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
<#--в if statement должно быть поле, однозначно показывающее, была ли открыта страница-->

    <#if form.addressPostCity?has_content || form.addressPostSettlementDict?has_content>
        <@addressMacros.addressSoap label='addressPost' applicant=false
        country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
        country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
        area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
        country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
    </#if>

    <#if form.orgPostAddressCity?has_content || form.orgPostAddressSettlementDict?has_content>
        <@addressMacros.addressSoap label='orgPostAddress' applicant=false
        country='orgPostAddressCountry' countryCode='orgPostAddressCountryCode' input='orgPostAddressEnterType'
        country_input='orgPostAddressCountryInput' settlementRF='orgPostAddressSettlementDict' streetRF='orgPostAddressStreetDict'
        area='orgPostAddressRayon' region='orgPostAddressRegion' settlement_type='orgPostAddressSettlementType'
        country_settlement='orgPostAddressCountrySettlement' settlement='orgPostAddressSettlementText' city='orgPostAddressCity'
        street='orgPostAddressStreetText' house='orgPostAddressHouse' corp='orgPostAddressKorpus' office='orgPostAddressFlat' post="orgPostAddressIndex"  />
    </#if>

</#assign>

<#assign applicantSoap>

    <#if form.factAddressCity?has_content || form.factAddressSettlementDict?has_content>
        <@addressMacros.addressSoap label='factAddress' applicant=true
        country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
        country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
        area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
        country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
        street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
    </#if>

</#assign>

<#assign formElements = {
"applType":{"widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_sokr":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"wayResult":{"widgetClass":"staticOptions", "items":{"1":"Почта России","2":"Электронная почта"}},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}
/>

<#assign fileloadElements = {
}
/>

<@requestPattern.makeSoapRequest
owner=stateOrgCode
departmentCode=stateOrgCode
formElements=formElements
fileloadElements=fileloadElements
applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>