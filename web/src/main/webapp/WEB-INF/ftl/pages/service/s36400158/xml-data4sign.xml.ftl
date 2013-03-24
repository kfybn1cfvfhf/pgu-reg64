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

</#assign>


<#assign otherSoapPart>
 <#if form.addressPostEnterTypeBenefit?has_content>
 <@addressMacros.addressSoap label='addressPostBenefit' applicant=false country='addressPostCountryBenefit' countryCode='addressPostCountryCodeBenefit' input='addressPostEnterTypeBenefit' country_input='addressPostCountryInputBenefit'
                settlementRF='addressPostSettlementDictBenefit' streetRF='addressPostStreetDictBenefit' area='addressPostRayonBenefit' region='addressPostRegionBenefit'
                settlement_type='addressPostSettlementTypeBenefit' country_settlement='addressPostCountrySettlementBenefit' settlement='addressPostSettlementTextBenefit' city='addressPostCityBenefit'
                street='addressPostStreetTextBenefit' house='addressPostHouseBenefit' corp='addressPostKorpusBenefit' flat='addressPostFlatBenefit' post="addressPostIndexBenefit"  />
 </#if>


<#if form.addressSeatStreetDict?has_content || form.addressSeatCity?has_content>

<@addressMacros.addressSoap label='addressSeat' applicant=false country='addressSeatCountry' countryCode='addressSeatCountryCode' input='addressSeatEnterType' country_input='addressSeatCountryInput'
                                       settlementRF='addressSeatSettlementDict' streetRF='addressSeatStreetDict' area='addressSeatRayon' region='addressSeatRegion'
                                       settlement_type='addressSeatSettlementType' country_settlement='addressSeatCountrySettlement' settlement='addressSeatSettlementText' city='addressSeatCity'
                                       street='addressSeatStreetText' house='addressSeatHouse' corp='addressSeatKorpus' flat='addressSeatFlat' post="addressSeatIndex"/>

</#if>


</#assign>

<#assign formElements = {
    "dov_enable":{"widgetClass":"boolean"},
    "dovLastName":{"widgetClass":"plaintext"},
    "dovFirstName":{"widgetClass":"plaintext"},
    "dovMiddleName":{"widgetClass":"plaintext"},
    "dovPlace":{"widgetClass":"plaintext"},
     "dovDate":{"widgetClass":"date"},
     "dovSeria":{"widgetClass":"plaintext"},
"dovNumber":{"widgetClass":"plaintext"},
"dovRegNumber":{"widgetClass":"plaintext"},
"dovPassSeria":{"widgetClass":"plaintext"},
"dovPassNo":{"widgetClass":"plaintext"},
"dovPassDate":{"widgetClass":"date"},
"dovPassFrom":{"widgetClass":"plaintext"},
    "documentAgree":{"widgetClass":"dictionary", "dictionaryCode":"03_DOC_AGREE_64158"},
    "eduLastName":{"widgetClass":"plaintext"},
    "eduFirstName":{"widgetClass":"plaintext"},
    "eduMiddleName":{"widgetClass":"plaintext"},
    "kindAttestat":{"widgetClass":"plaintext"},
    "eduSeria":{"widgetClass":"plaintext"},
    "eduNumber":{"widgetClass":"plaintext"},
    "eduFrom":{"widgetClass":"plaintext"},
    "eduDate":{"widgetClass":"date"},
    "regNum":{"widgetClass":"plaintext"},
"apostil":{"widgetClass":"plaintext"},
 "wayObtain":{"widgetClass":"dictionary", "dictionaryCode":"64_WAY_OF_DELIVERY_64158"},
    "agreeCh":{"widgetClass":"boolean"},
 "agree1Ch":{"widgetClass":"boolean"},
"rec_address":{"formElementId":"rec_address", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#if form.dov_enable= "on">
<#switch form.dovIdentityDocType>
<#case "1">
<#case "2">
<#case "3">
<#case "4">

<#assign formElements = formElements +{
"dovIdentityDocType":{"formElementId":"dovIdentityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
}
/>
<#break >
<#default>
 <#assign formElements = formElements +{
"dovIdentityDocType":{"widgetClass":"plaintext"}
}
 />
</#switch>
</#if>


<#assign fileloadElements = {
    "identityDocLoad":{},
    "dovDovLoad":{},
    "dovPasLoad":{},
    "surnameDocLoad":{},
    "eduDocLoad":{},
    "edu1DocLoad":{},
    "apostilDocLoad":{}
}/>


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



