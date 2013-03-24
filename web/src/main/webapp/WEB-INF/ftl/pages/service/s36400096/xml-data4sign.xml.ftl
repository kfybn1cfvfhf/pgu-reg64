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

    <#if form.applType == "2">
        <@addressMacros.addressSoap label='org_addressPost' applicant=false
        country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType'
        country_input='org_addressPostCountryInput' settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict'
        area='org_addressPostRayon' region='org_addressPostRegion' settlement_type='org_addressPostSettlementType'
        country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
        street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' office='org_addressPostFlat' post="org_addressPostIndex"  />
    </#if>

    <@addressMacros.addressSoap label='roomAddress' applicant=false
    country='roomAddressCountry' countryCode='roomAddressCountryCode' input='roomAddressEnterType'
    country_input='roomAddressCountryInput' settlementRF='roomAddressSettlementDict' streetRF='roomAddressStreetDict'
    area='roomAddressRayon' region='roomAddressRegion' settlement_type='roomAddressSettlementType'
    country_settlement='roomAddressCountrySettlement' settlement='roomAddressSettlementText' city='roomAddressCity'
    street='roomAddressStreetText' house='roomAddressHouse' corp='roomAddressKorpus' flat='roomAddressFlat' post="roomAddressIndex"  />

    <#if form.applType == "1">
        <@addressMacros.addressSoap label='addressPost' applicant=false
        country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
        country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
        area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
        country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
    </#if>

</#assign>

<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"dov_enable":{"widgetClass":"boolean"},
"dovUlType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"otherApplCh":{"widgetClass":"boolean"},
"fl_owner_enable":{"widgetClass":"boolean"},
"ul_owner_enable":{"widgetClass":"boolean"},
"dovlastName":{"widgetClass":"plaintext"},
"dovfirstName":{"widgetClass":"plaintext"},
"dovmiddleName":{"widgetClass":"plaintext"},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_SmallTitle":{"widgetClass":"plaintext"},
"fl_owner":{"widgetClass":"virtualParent", "cloneQuantity":(form.fl_owner_lastName?size)!0},
"fl_owner_lastName":{"widgetClass":"plaintext", "parentCode":"fl_owner"},
"fl_owner_firstName":{"widgetClass":"plaintext", "parentCode":"fl_owner"},
"fl_owner_middleName":{"widgetClass":"plaintext", "parentCode":"fl_owner"},
"fl_owner_docType":{"widgetClass":"plaintext", "parentCode":"fl_owner"},
"fl_owner_docNum":{"widgetClass":"plaintext", "parentCode":"fl_owner"},
"fl_owner_docDate":{"widgetClass":"date", "parentCode":"fl_owner"},
"ul_owner":{"widgetClass":"virtualParent", "cloneQuantity":(form.ul_owner_FullTitle?size)!0},
"ul_owner_FullTitle":{"widgetClass":"plaintext", "parentCode":"ul_owner"},
"ul_owner_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64", "parentCode":"ul_owner"},
"ul_owner_SmallTitle":{"widgetClass":"plaintext", "parentCode":"ul_owner"},
"ul_owner_docType":{"widgetClass":"plaintext", "parentCode":"ul_owner"},
"ul_owner_docNum":{"widgetClass":"plaintext", "parentCode":"ul_owner"},
"ul_owner_docDate":{"widgetClass":"date", "parentCode":"ul_owner"},
"roomStatusNow":{"widgetClass":"dictionary","dictionaryCode":"64_STATUS_PREMISES_64096"},
"roomStatusAfter":{"widgetClass":"dictionary","dictionaryCode":"64_STATUS_PREMISES_64096"},
"roomPurpose":{"widgetClass":"plaintext"},
"wayOfDelivery":{"widgetClass":"dictionary","dictionaryCode":"64_WAY_OF_DELIVERY_64096"},
"agree1Ch":{"widgetClass":"boolean"},
"agree2Ch":{"widgetClass":"boolean"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}

} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlNonDovLoad":{},
"dovUlPasLoad":{},
"founderDocLoad":{},
"dovUlDovLoad":{},
"fl_owner_DocLoad":{},
"ul_owner_DocLoad":{},
"proectDocLoad":{},
"decisionDocLoad":{},
"agreeUlDocLoad":{},
"lowDocLoad":{},
"housePlanDocLoad":{},
"techPlanDocLoad":{},
"techPassport":{}
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
<#else>
    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    />
</#if>