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
   <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                           settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                           settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>
   </#if>
<#if form.applType == "1">
   <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                           settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                           settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                           street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"/>
   </#if>
</#assign>

<#assign otherSoapPart>
<#if form.applType == "1">
<@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
                                           settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
                                           settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                                           street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"/>
</#if>

<#if form.applType == "2">
<@addressMacros.addressSoap label='orgAddress' applicant=false country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType' country_input='orgAddressCountryInput'
                                           settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict' area='orgAddressRayon' region='orgAddressRegion'
                                           settlement_type='orgAddressSettlementType' country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
                                           street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' office='orgAddressFlat' post="orgAddressIndex"/>
</#if>

    <#if form.applType == "2">
    <@addressMacros.addressSoap label='orgFactAddress' applicant=false country='orgFactAddressCountry' countryCode='orgFactAddressCountryCode' input='orgFactAddressEnterType' country_input='orgFactAddressCountryInput'
                                               settlementRF='orgFactAddressSettlementDict' streetRF='orgFactAddressStreetDict' area='orgFactAddressRayon' region='orgFactAddressRegion'
                                               settlement_type='orgFactAddressSettlementType' country_settlement='orgFactAddressCountrySettlement' settlement='orgFactAddressSettlementText' city='orgFactAddressCity'
                                               street='orgFactAddressStreetText' house='orgFactAddressHouse' corp='orgFactAddressKorpus' office='orgFactAddressFlat' post="orgFactAddressIndex"/>
    </#if>

<#if form.applType == "2">
<@addressMacros.addressSoap label='orgPostAddress' applicant=false country='orgPostAddressCountry' countryCode='orgPostAddressCountryCode' input='orgPostAddressEnterType' country_input='orgPostAddressCountryInput'
                                           settlementRF='orgPostAddressSettlementDict' streetRF='orgPostAddressStreetDict' area='orgPostAddressRayon' region='orgPostAddressRegion'
                                           settlement_type='orgPostAddressSettlementType' country_settlement='orgPostAddressCountrySettlement' settlement='orgPostAddressSettlementText' city='orgPostAddressCity'
                                           street='orgPostAddressStreetText' house='orgPostAddressHouse' corp='orgPostAddressKorpus' office='orgPostAddressFlat' post="orgPostAddressIndex"/>
</#if>

</#assign>

<#assign formElements = {
    "applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо, зарегистрированное в качестве индивидуального предпринимателя","2":"Юридическое лицо"}},
    "dov_enable":{"widgetClass":"boolean"},
    "dovUlType":{"formElementId":"dovUlType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
    "fax":{"widgetClass":"plaintext"},
    "org_FullTitle":{"widgetClass":"plaintext"},
    "org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
    "org_SmallTitle":{"widgetClass":"plaintext"},
    "org_phone":{"widgetClass":"plaintext"},
    "org_email":{"widgetClass":"plaintext"},
    "org_fax":{"widgetClass":"plaintext"},
    "org_firstName":{"widgetClass":"plaintext"},
    "org_lastName":{"widgetClass":"plaintext"},
    "org_middleName":{"widgetClass":"plaintext"},
    "org_InnUl":{"widgetClass":"plaintext"},
    "org_OgrnUl":{"widgetClass":"plaintext"},
    "OgrnIp":{"widgetClass":"plaintext"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlNonDovLoad":{},
"dovUlPasLoad":{},
"dovUlDovLoad":{},
"founderDocLoad":{},
"EGRULDocLoad":{},
"EGRIPDocLoad":{},
"EGRPDocLoad":{},
"kadVipDocLoad":{},
"gosposhDocLoad":{}

}/>

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
            applicantAttributes={
            "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
            } + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
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

<#else >

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements

    />

</#if>