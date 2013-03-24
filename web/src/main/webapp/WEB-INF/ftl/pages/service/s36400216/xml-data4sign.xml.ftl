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
    <#if form.applType == "1">
        <@addressMacros.addressSoap label='address' applicant=true
        country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
        settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
        settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
        street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

        <@addressMacros.addressSoap label='factAddress' applicant=true
        country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
        settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
        settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
        street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
    </#if>
</#assign>

<#assign otherSoapPart>
    <#if form.applType == "1">
        <@addressMacros.addressSoap label='addressPost' applicant=false
        country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
    </#if>

    <#if form.applType == "2">
        <@addressMacros.addressSoap label='org_addressUr' applicant=false
        country='org_addressUrCountry' countryCode='org_addressUrCountryCode' input='org_addressUrEnterType'
        country_input='org_addressUrCountryInput' settlementRF='org_addressUrSettlementDict' streetRF='org_addressUrStreetDict'
        area='org_addressUrRayon' region='org_addressUrRegion' settlement_type='org_addressUrSettlementType'
        country_settlement='org_addressUrCountrySettlement' settlement='org_addressUrSettlementText' city='org_addressUrCity'
        street='org_addressUrStreetText' house='org_addressUrHouse' corp='org_addressUrKorpus' office='org_addressUrFlat' post="org_addressUrIndex"  />

        <@addressMacros.addressSoap label='org_addressPost' applicant=false
        country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType'
        country_input='org_addressPostCountryInput' settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict'
        area='org_addressPostRayon' region='org_addressPostRegion' settlement_type='org_addressPostSettlementType'
        country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
        street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' office='org_addressPostFlat' post="org_addressPostIndex"  />
    </#if>

    <@addressMacros.addressSoap label='flatAddress' applicant=false
    country='flatAddressCountry' countryCode='flatAddressCountryCode' input='flatAddressEnterType'
    country_input='flatAddressCountryInput' settlementRF='flatAddressSettlementDict' streetRF='flatAddressStreetDict'
    area='flatAddressRayon' region='flatAddressRegion' settlement_type='flatAddressSettlementType'
    country_settlement='flatAddressCountrySettlement' settlement='flatAddressSettlementText' city='flatAddressCity'
    street='flatAddressStreetText' house='flatAddressHouse' corp='flatAddressKorpus' flat='flatAddressFlat' post="flatAddressIndex"  />
</#assign>

<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"dov_enable":{"widgetClass":"boolean"},
"dovUlType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"docType":{"widgetClass":"plaintext"},
"dovNo":{"widgetClass":"plaintext"},
"dovDate":{"widgetClass":"date"},
"addressEq":{"widgetClass":"boolean"},
"addressPost":{"widgetClass":"plaintext"},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_SmallTitle":{"widgetClass":"plaintext"},
"org_addressUr":{"widgetClass":"plaintext"},
"org_addressEq":{"widgetClass":"boolean"},
"org_addressPost":{"widgetClass":"plaintext"},
"org_phone":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"flatAddress":{"widgetClass":"plaintext"},
"basisFlat":{"widgetClass":"dictionary", "dictionaryCode":"03_BASIS_FLAT_64216"},
"targetAppl":{"widgetClass":"dictionary", "dictionaryCode":"03_TARGET_APPL_64216"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlNonDovLoad":{},
"dovUlPasLoad":{},
"dovUlDovLoad":{},
"socDocLoad":{},
"egrpDocLoad":{},
"techDocLoad":{},
"actDocLoad":{},
"gosDocLoad":{}
}
/>

<#if form.applType == "1">
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
<#else>
    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />
</#if>