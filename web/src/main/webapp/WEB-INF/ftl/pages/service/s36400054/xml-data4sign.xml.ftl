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

    <#if form.rec_addressCity?has_content || form.rec_addressSettlementDict?has_content>
        <@addressMacros.addressSoap label='rec_address' applicant=false
        country='rec_addressCountry' countryCode='rec_addressCountryCode' input='rec_addressEnterType'
        country_input='rec_addressCountryInput' settlementRF='rec_addressSettlementDict' streetRF='rec_addressStreetDict'
        area='rec_addressRayon' region='rec_addressRegion' settlement_type='rec_addressSettlementType'
        country_settlement='rec_addressCountrySettlement' settlement='rec_addressSettlementText' city='rec_addressCity'
        street='rec_addressStreetText' house='rec_addressHouse' corp='rec_addressKorpus' flat='rec_addressFlat' post="rec_addressIndex"  />
    </#if>

    <#if form.rec_factAddressCity?has_content || form.rec_factAddressSettlementDict?has_content>
        <@addressMacros.addressSoap label='rec_factAddress' applicant=false
        country='rec_factAddressCountry' countryCode='rec_factAddressCountryCode' input='rec_factAddressEnterType'
        country_input='rec_factAddressCountryInput' settlementRF='rec_factAddressSettlementDict' streetRF='rec_factAddressStreetDict'
        area='rec_factAddressRayon' region='rec_factAddressRegion' settlement_type='rec_factAddressSettlementType'
        country_settlement='rec_factAddressCountrySettlement' settlement='rec_factAddressSettlementText' city='rec_factAddressCity'
        street='rec_factAddressStreetText' house='rec_factAddressHouse' corp='rec_factAddressKorpus' flat='rec_factAddressFlat' post="rec_factAddressIndex"  />
    </#if>

    <#if form.jp_addressCity?has_content || form.jp_addressSettlementDict?has_content>
        <@addressMacros.addressSoap label='jp_address' applicant=false
        country='jp_addressCountry' countryCode='jp_addressCountryCode' input='jp_addressEnterType'
        country_input='jp_addressCountryInput' settlementRF='jp_addressSettlementDict' streetRF='jp_addressStreetDict'
        area='jp_addressRayon' region='jp_addressRegion' settlement_type='jp_addressSettlementType'
        country_settlement='jp_addressCountrySettlement' settlement='jp_addressSettlementText' city='jp_addressCity'
        street='jp_addressStreetText' house='jp_addressHouse' corp='jp_addressKorpus' flat='jp_addressFlat' post="jp_addressIndex"  />
    </#if>
</#assign>

<#assign applicantSoap>
    <#if form.addressCity?has_content || form.addressSettlementDict?has_content>
        <@addressMacros.addressSoap label='address' applicant=true
        country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
        settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
        settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
        street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
    </#if>

    <#if form.factAddressCity?has_content || form.factAddressSettlementDict?has_content>
        <@addressMacros.addressSoap label='factAddress' applicant=true
        country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
        country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
        area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
        country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
        street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
    </#if>

</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"phoneWork":{"widgetClass":"plaintext"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientBirthDate":{"widgetClass":"date"},
"recipientIdentityDocType":{"widgetClass":"dictionary", "dictionaryCode":"DUL_LS"},
"recipientOtherDocTypeName":{"widgetClass":"plaintext"},
"recipientPassSeria":{"widgetClass":"plaintext"},
"recipientPassNo":{"widgetClass":"plaintext"},
"recipientPassDate":{"widgetClass":"date"},
"recipientPassFrom":{"widgetClass":"plaintext"},
"dateDogSocNaim":{"widgetClass":"date"},
"noDogSocNaim":{"widgetClass":"plaintext"},
"org_soc":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
"bed":{"widgetClass":"boolean"},
"qt_bed":{"widgetClass":"plaintext"},
"cost_bed":{"widgetClass":"plaintext"},
"table":{"widgetClass":"boolean"},
"qt_table":{"widgetClass":"plaintext"},
"cost_table":{"widgetClass":"plaintext"},
"wardrobe":{"widgetClass":"boolean"},
"qt_wardrobe":{"widgetClass":"plaintext"},
"cost_wardrobe":{"widgetClass":"plaintext"},
"chair":{"widgetClass":"boolean"},
"qt_chair":{"widgetClass":"plaintext"},
"cost_chair":{"widgetClass":"plaintext"},
"icebox":{"widgetClass":"boolean"},
"qt_icebox":{"widgetClass":"plaintext"},
"cost_icebox":{"widgetClass":"plaintext"},
"gaz":{"widgetClass":"boolean"},
"cost_gaz":{"widgetClass":"plaintext"},
"gku":{"widgetClass":"boolean"},
"qt_gku":{"widgetClass":"plaintext"},
"cost_gku":{"widgetClass":"plaintext"},
"wayBenefit":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_BENEFIT_64"},
"addressBenefit":{"widgetClass":"plaintext"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"agree":{"widgetClass":"boolean"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}
/>

<#assign fileloadElements = {
"identityDocLoad":{},
"dovOpekLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"recipientIdentityDocLoad":{},
"costGKUdocLoad":{}
}
/>

<#if form.recipientIdentityDocType??>
    <#switch form.recipientIdentityDocType>
        <#case "1">
        <#case "2">
        <#case "3">
        <#case "4">
            <#assign formElements = formElements + {
            "recipientIdentityDocType":{"widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
            }/>
            <#break >
        <#default>
            <#assign formElements = formElements + {
            "recipientIdentityDocType":{"widgetClass":"plaintext"}
            }/>
            <#break >
    </#switch>

</#if>

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
