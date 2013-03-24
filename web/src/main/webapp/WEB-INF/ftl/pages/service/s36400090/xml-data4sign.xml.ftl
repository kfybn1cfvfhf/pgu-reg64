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

    <#--addressPost-->
    <#if form.addressPostCity?has_content || form.addressPostSettlementDict?has_content>
        <@addressMacros.addressSoap label='addressPost' applicant=false
        country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
        country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
        area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
        country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
    </#if>

<#--orgAddress-->
    <#if form.orgAddressCity?has_content || form.orgAddressSettlementDict?has_content>
        <@addressMacros.addressSoap label='orgAddress' applicant=false
        country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType'
        country_input='orgAddressCountryInput' settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict'
        area='orgAddressRayon' region='orgAddressRegion' settlement_type='orgAddressSettlementType'
        country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
        street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' office='orgAddressFlat' post="orgAddressIndex"  />
    </#if>

</#assign>

<#assign applicantSoap>
        <@addressMacros.addressSoap label='address' applicant=true
        country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
        settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
        settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
        street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
</#assign>

<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"constructionName":{"widgetClass":"plaintext"},
"constructionPlace":{"widgetClass":"plaintext"},
"dov_enable":{"widgetClass":"boolean"},
"dovFirstName":{"widgetClass":"plaintext"},
"dovLastName":{"widgetClass":"plaintext"},
"dovMiddleName":{"widgetClass":"plaintext"},
"dovPassDate":{"widgetClass":"date"},
"dovPassFrom":{"widgetClass":"plaintext"},
"dovPassNo":{"widgetClass":"plaintext"},
"dovPassSeria":{"widgetClass":"plaintext"},
"dovUlType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"org_email":{"widgetClass":"plaintext"},
"org_fax":{"widgetClass":"plaintext"},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_InnUl":{"widgetClass":"plaintext"},
"org_OgrnUl":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_phone":{"widgetClass":"plaintext"},
"org_SmallTitle":{"widgetClass":"plaintext"},
"warrantDate":{"widgetClass":"date"},
"warrantNo":{"widgetClass":"plaintext"},
"warrantPlace":{"widgetClass":"plaintext"},
"warrantSeria":{"widgetClass":"plaintext"},

"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}
/>

<#assign fileloadElements = {
"accreditationDocLoad":{},
"agreeDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlDovLoad":{},
"dovUlNonDovLoad":{},
"expertDocLoad":{},
"identityDocLoad":{},
"materialDocLoad":{},
"planDocLoad":{},
"pravoDocLoad":{},
"resolutionDocLoad":{}
}
/>

<#if form.dovIdentityDocType??>
    <#switch form.dovIdentityDocType>
        <#case "1">
        <#case "2">
        <#case "3">
        <#case "4">
            <#assign formElements = formElements + {
            "dovIdentityDocType":{"widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
            }/>
            <#break >
        <#default>
            <#assign formElements = formElements + {
            "dovIdentityDocType":{"widgetClass":"plaintext"}
            }/>
            <#break >
    </#switch>

</#if>

<#if form.applType?? && form.applType=="1">

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

<#else >

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />

</#if>
