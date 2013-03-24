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

    <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
    settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
    settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
    street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

</#assign>

<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"dov_enable":{"widgetClass":"boolean"},
"dovUlType":{"formElementId":"dovUlType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица, действующий на основании доверенности"}},
"dovLastName":{"widgetClass":"plaintext"},
"dovFirstName":{"widgetClass":"plaintext"},
"dovMiddleName":{"widgetClass":"plaintext"},
"warrantPlace":{"widgetClass":"plaintext"},
"warrantDate":{"widgetClass":"date"},
"warrantSeria":{"widgetClass":"plaintext"},
"warrantNo":{"widgetClass":"plaintext"},
"dovOtherDocTypeName":{"widgetClass":"plaintext"},
"dovPassSeria":{"widgetClass":"plaintext"},
"dovPassNo":{"widgetClass":"plaintext"},
"dovPassDate":{"widgetClass":"date"},
"dovPassFrom":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary","dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_SmallTitle":{"widgetClass":"plaintext"},
"org_phone":{"widgetClass":"plaintext"},
"org_fax":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"org_InnUl":{"widgetClass":"plaintext"},
"constructionName":{"widgetClass":"plaintext"},
"constructionPlace":{"widgetClass":"plaintext"}
} />

<#if form.applType == "2">
    <#assign otherSoapPart>

        <@addressMacros.addressSoap label='orgAddress' applicant=false country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType' country_input='orgAddressCountryInput'
        settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict' area='orgAddressRayon' region='orgAddressRegion'
        settlement_type='orgAddressSettlementType' country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
        street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' flat='orgAddressFlat' post="orgAddressIndex"  />

    </#assign>

    <#assign formElements =  formElements + {
    "orgAddress":{"formElementId":"orgAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
    }/>


<#else>
    <#assign otherSoapPart>

        <@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

    </#assign>

    <#assign formElements =  formElements + {
    "addressPost":{"formElementId":"addressPost", "widgetClass":"address", "addressSoap":otherSoapPart}
    }/>

</#if>

<#if ((form.applType == "1" && form.dov_enable == "on") || (form.applType == "2"))>
    <#switch form.dovIdentityDocType>
        <#case "1">
        <#case "2">
        <#case "3">
        <#case "4">
            <#assign formElements =  formElements + {
            "dovIdentityDocType":{"formElementId":"dovIdentityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
            }/>
            <#break >

        <#default>
            <#assign formElements =  formElements + {
            "dovIdentityDocType":{"widgetClass":"plaintext"}
            }/>
    </#switch>
</#if>


<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlNonDovLoad":{},
"dovUlDovLoad":{},
"aktPriemkiLoad":{},
"sootvetsLoad":{},
"sootvetsParamLoad":{},
"sootvetsTehUslLoad":{},
"shemObjectLoad":{},
"dogStrahLoad":{},
"stroitRazrLoad":{},
"pravoDocLoad":{},
"planDocLoad":{},
"zaklGosStroyLoad":{}
}
/>

<#if (form.applType == "1" && form.dov_enable == "off")>
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
        "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"},
        "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
        }
        />
        <#break >

    <#default>
        <@requestPattern.makeSoapRequest
        owner=stateOrgCode
        departmentCode=stateOrgCode
        formElements=formElements
        fileloadElements=fileloadElements
        applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
        />
</#switch>
<#else>

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />

</#if>