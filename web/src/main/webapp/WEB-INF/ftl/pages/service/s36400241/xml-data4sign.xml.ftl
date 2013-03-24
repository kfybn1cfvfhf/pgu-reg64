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

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"dovCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_DOV_CATEGORY_64206"},
"politicalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientpoliticalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
"recipientOtherDocTypeName":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"wayBenefit":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_BENEFIT_64"},
"addressBenefit":{"widgetClass":"plaintext"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"org_soc":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
"agree":{"widgetClass":"boolean"}
} />

<#if form.incapable_enable == "on">
<#switch form.recipientIdentityDocType>
    <#case "1">
    <#case "2">
    <#case "3">
    <#case "4">
        <#assign formElements =  formElements + {
            "recipientIdentityDocType":{"widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
        }/>
        <#break >

            <#default>
        <#assign formElements =  formElements + {
            "recipientIdentityDocType":{"widgetClass":"plaintext"}
        }/>
</#switch>
</#if>

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"recipientIdentityDocLoad":{},
"udostovDocLoad":{}
}
/>
<#assign applicantSoap>

    <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
    settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
    settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
    street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

    <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
    settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
    settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

</#assign>


<#if form.incapable_enable == "on">
    <#assign otherSoapPart>

    <@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
    settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
    settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
    street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

    <@addressMacros.addressSoap label='recipientAddress' applicant=false country='recipientAddressCountry' countryCode='recipientAddressCountryCode' input='recipientAddressEnterType' country_input='recipientAddressCountryInput'
    settlementRF='recipientAddressSettlementDict' streetRF='recipientAddressStreetDict' area='recipientAddressRayon' region='recipientAddressRegion'
    settlement_type='recipientAddressSettlementType' country_settlement='recipientAddressCountrySettlement' settlement='recipientAddressSettlementText' city='recipientAddressCity'
    street='recipientAddressStreetText' house='recipientAddressHouse' corp='recipientAddressKorpus' flat='recipientAddressFlat' post="recipientAddressIndex"  />

    </#assign>

<#else>
    <#assign otherSoapPart>

        <@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

    </#assign>
</#if>

<#assign formElements =  formElements + {
"addressPost":{"formElementId":"addressPost", "widgetClass":"address", "addressSoap":otherSoapPart}
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
