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
                                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>

</#assign>

<#assign otherSoapPart>
<#if form.recipientAddressSettlementDict?has_content || form.recipientAddressCity?has_content>

<@addressMacros.addressSoap label='recipientAddress' applicant=false country='recipientAddressCountry'
countryCode='recipientAddressCountryCode' input='recipientAddressEnterType'
country_input='recipientAddressCountryInput'settlementRF='recipientAddressSettlementDict'
streetRF='recipientAddressStreetDict' area='recipientAddressRayon' region='recipientAddressRegion'
settlement_type='recipientAddressSettlementType' country_settlement='recipientAddressCountrySettlement'
settlement='recipientAddressSettlementText' city='recipientAddressCity'
street='recipientAddressStreetText' house='recipientAddressHouse'
corp='recipientAddressKorpus' flat='recipientAddressFlat' post="recipientAddressIndex"/>

</#if>
</#assign>
<#assign formElements = {
"lonelyCh":{"widgetClass":"boolean"},
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"dovCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_DOV_CATEGORY_64206"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientSnils":{"widgetClass":"plaintext"},

"recipientIdentityDocType":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},

"famClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.fam_member_lastName?size)!0},
"fam_member_lastName":{"widgetClass":"plaintext", "parentCode":"famClone"},
"fam_member_firstName":{"widgetClass":"plaintext", "parentCode":"famClone"},
"fam_member_middleName":{"widgetClass":"plaintext", "parentCode":"famClone"},
"fam_member_snils":{"widgetClass":"plaintext", "parentCode":"famClone"},
"fam_member_kin":{"widgetClass":"plaintext", "parentCode":"famClone"},

"sitizenCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_CATEGORY_OF_SITIZENS_120"},
"applReason":{"widgetClass":"dictionary", "dictionaryCode":"64_REASON_OF_APPLICATION"},
"rec_address":{"formElementId":"rec_address", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"fam_member_identityDocLoad":{},
"fam_member_kinDocLoad":{},
"regDocLoad":{},
"techDocLoad":{},
"rightDocLoad":{},
"incomeDocLoad":{},
"otherDocLoad":{},
"gosRegDocLoad":{},
"opfDocLoad":{},
"socDocLoad":{},
"egrpDocLoad":{},
"gosRegChangeDocLoad":{},
"dogovorDocLoad":{}
}
/>

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