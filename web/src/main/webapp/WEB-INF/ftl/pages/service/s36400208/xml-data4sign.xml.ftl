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

    <#if form.addressPostCity?has_content || form.addressPostSettlementDict?has_content>
    <@addressMacros.addressSoap label='addressPost' applicant=false
    country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
    country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
    area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
    country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
    street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
    </#if>

    <#if form.org_addressPostCity?has_content || form.org_addressPostSettlementDict?has_content>
        <@addressMacros.addressSoap label='org_addressPost' applicant=false
country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType'
country_input='org_addressPostCountryInput' settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict'
area='org_addressPostRayon' region='org_addressPostRegion' settlement_type='org_addressPostSettlementType'
country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' flat='org_addressPostFlat' post="org_addressPostIndex"  />
    </#if>

</#assign>

<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"ip_enable":{"widgetClass":"boolean"},
"dov_enable":{"widgetClass":"boolean"},
"dovUlType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_phone":{"widgetClass":"plaintext"},
"org_fax":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"org_firstName":{"widgetClass":"plaintext"},
"org_lastName":{"widgetClass":"plaintext"},
"org_middleName":{"widgetClass":"plaintext"},
"org_InnUl":{"widgetClass":"plaintext"},
"org_OgrnUl":{"widgetClass":"plaintext"},
"ogrnip":{"widgetClass":"plaintext"},
"square":{"widgetClass":"plaintext"},
"landmark":{"widgetClass":"plaintext"},
"purposeUse":{"widgetClass":"plaintext"},
"cadastralRight":{"widgetClass":"plaintext"},
"soughtRight":{"widgetClass":"dictionary", "dictionaryCode":"03_SOUGHT_RIGHT_64208"},
"termUse":{"widgetClass":"plaintext"},
"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlNonDovLoad":{},
"dovUlPasLoad":{},
"docMvRegULLoad":{},
"dovUlDovLoad":{},
"docMvRegIPLoad":{},
"egrpDocLoad":{},
"kadastrDocLoad":{},
"identityDocLoad":{}
}
/>

<#if form.applType?? && form.applType == "1">

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
            applicantAttributes={"widgetClass":"plaintext"}
            />

    </#switch>

<#else >

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    />


</#if>