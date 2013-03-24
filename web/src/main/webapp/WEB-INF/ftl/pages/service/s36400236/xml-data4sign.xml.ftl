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

    <@addressMacros.addressSoap label='addressPost' applicant=false
    country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
    country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
    area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
    country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
    street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

    <#if form.recipientPostCity?has_content || form.recipientPostSettlementDict?has_content>
        <@addressMacros.addressSoap label='recipientPost' applicant=false
        country='recipientPostCountry' countryCode='recipientPostCountryCode' input='recipientPostEnterType'
        country_input='recipientPostCountryInput' settlementRF='recipientPostSettlementDict' streetRF='recipientPostStreetDict'
        area='recipientPostRayon' region='recipientPostRegion' settlement_type='recipientPostSettlementType'
        country_settlement='recipientPostCountrySettlement' settlement='recipientPostSettlementText' city='recipientPostCity'
        street='recipientPostStreetText' house='recipientPostHouse' corp='recipientPostKorpus' flat='recipientPostFlat' post="recipientPostIndex"  />
    </#if>

</#assign>


<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"catAppl":{"widgetClass":"dictionary", "dictionaryCode":"03_CATEGORY_APPL_64236"},
"familyCh":{"widgetClass":"boolean"},

"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientPhone":{"widgetClass":"plaintext"},
"recipientEmail":{"widgetClass":"plaintext"},

"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},

"famQuantity":{"widgetClass":"plaintext"},
"famClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.famlastName?size)!0},
"famlastName":{"widgetClass":"plaintext", "parentCode":"famClone"},
"famfirstName":{"widgetClass":"plaintext" , "parentCode":"famClone"},
"fammiddleName":{"widgetClass":"plaintext" , "parentCode":"famClone"},
"fambirthdate":{"widgetClass":"date", "parentCode":"famClone"},
"famkin":{"widgetClass":"plaintext", "parentCode":"famClone"},

"divorceCh":{"widgetClass":"boolean"},
"dopPravZhil":{"widgetClass":"boolean"},
"egrpNoCh":{"widgetClass":"boolean"},

"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"dovDovLoad":{},
"dovPasLoad":{},
"identityDocLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"famIdentityDocLoad":{},
"sostavDocLoad":{},
"agree1DocLoad":{},
"birthDocLoad":{},
"techDocLoad":{},
"pravoDocLoad":{},
"dopDocLoad":{},
"regDocLoad":{},
"workDocLoad":{},
"incomeDocLoad":{},
"marryDocLoad":{},
"pravo1DocLoad":{}
}
/>


<@requestPattern.makeSoapRequest
owner=stateOrgCode
departmentCode=stateOrgCode
formElements=formElements
fileloadElements=fileloadElements
/>