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

<#if form.addressSettlementDict?has_content || form.addressCity?has_content>
   <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                           settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                           settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>

</#if>

<#if form.factAddressSettlementDict?has_content || form.factAddressCity?has_content>

<@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                       settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                       settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                       street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"/>

</#if>
</#assign>


<#assign otherSoapPart>



<#if form.addressPostStreetDict?has_content || form.addressPostCity?has_content>

<@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
                                       settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
                                       settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                                       street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"/>

</#if>


<#if form.recipientaddressSettlementDict?has_content || form.recipientaddressCity?has_content>

<@addressMacros.addressSoap label='recipientaddress' applicant=false country='recipientaddressCountry'
countryCode='recipientAddressCountryCode' input='recipientaddressEnterType'
country_input='recipientAddressCountryInput'settlementRF='recipientaddressSettlementDict'
streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
settlement_type='recipientaddressSettlementType' country_settlement='recipientAddressCountrySettlement'
settlement='recipientaddressSettlementText' city='recipientaddressCity'
street='recipientaddressStreetText' house='recipientaddressHouse'
corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"/>

</#if>

</#assign>

<#assign formElements = {
    "dov_enable":{"widgetClass":"boolean"},
    "incapable_enable":{"widgetClass":"boolean"},
    "dovCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_DOV_CATEGORY_64206"},
    "politicalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
    "recipientLastName":{"widgetClass":"plaintext"},
    "recipientFirstName":{"widgetClass":"plaintext"},
    "recipientMiddleName":{"widgetClass":"plaintext"},
    "recipientSnils":{"widgetClass":"plaintext"},
     "recipientBirthdate":{"widgetClass":"date"},
     "recipientBirthPlace":{"widgetClass":"plaintext"},
     "recipientSex":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Мужской","2":"Женский"}},
    "recipientpoliticalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
    "recipientPhone":{"widgetClass":"plaintext"},
    "recipientEmail":{"widgetClass":"plaintext"},
    "recipientPassSeria":{"widgetClass":"plaintext"},
    "recipientPassNo":{"widgetClass":"plaintext"},
    "recipientPassDate":{"widgetClass":"date"},
    "recipientPassFrom":{"widgetClass":"plaintext"},
    "seriaMedPolice":{"widgetClass":"plaintext"},
    "noMedPolice":{"widgetClass":"plaintext"},
    "nameOrgMedPolice":{"widgetClass":"plaintext"},
    "grInvalid":{"formElementId":"grInvalid", "widgetClass":"staticOptions", "items":{"1":"I группа",
                                                                         "2":"II группа",
                                                                         "3":"III группа",
                                                                         "4":"Ребенок-инвалид"}},
"fullLifeInvalid":{"widgetClass":"boolean"},
    "socStatus":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_STATUS"},
    "wayDeliveryBenefit":{"widgetClass":"dictionary", "dictionaryCode":"64_WAY_DELIVETY_RESULT"},
"rec_address":{"formElementId":"rec_address", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#if form.incapable_enable = "on">
<#switch form.recipientIdentityDocType>
<#case "1">
<#case "2">
<#case "3">
<#case "4">

<#assign formElements = formElements +{
"recipientIdentityDocType":{"formElementId":"recipientIdentityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
}
/>
<#break >
<#default>
 <#assign formElements = formElements +{
"recipientIdentityDocType":{"widgetClass":"plaintext"}
}
 />
</#switch>
</#if>


<#assign fileloadElements = {
    "identityDocLoad":{},
    "dovDovLoad":{},
    "dovPasLoad":{},
    "dovOpekLoad":{},
    "recipientIdentityDocLoad":{},
    "epicrisisDocLoad":{}
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
            }
            applicantAttributes= applicantAttributes + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
            />
            <#break >

        <#default>
            <@requestPattern.makeSoapRequest
            owner=stateOrgCode
            departmentCode=stateOrgCode
            formElements=formElements
            fileloadElements=fileloadElements
            applicantAttributes={"widgetClass":"plaintext"}
            applicantAttributes= applicantAttributes + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
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
