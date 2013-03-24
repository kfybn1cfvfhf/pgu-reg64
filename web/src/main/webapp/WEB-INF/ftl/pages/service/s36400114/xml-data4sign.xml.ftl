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

    <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
    settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
    settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

</#assign>


<#assign otherSoapPart>

        <@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"politicalNationality":{"widgetClass":"dictionary", "dictionaryCode":"64_CITIZENSHIP_REFUGEE_64202"},
"addressPost":{"formElementId":"addressPost", "widgetClass":"address", "addressSoap":otherSoapPart},
"childClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.childlastName?size)!0},
"childlastName":{"widgetClass":"plaintext", "parentCode":"childClone"},
"childfirstName":{"widgetClass":"plaintext", "parentCode":"childClone"},
"childmiddleName":{"widgetClass":"plaintext", "parentCode":"childClone"},
"childBirthdate":{"widgetClass":"date", "parentCode":"childClone"},
"childCh":{"widgetClass":"boolean"},
"child1Clone":{"widgetClass":"virtualParent", "cloneQuantity":(form.child1lastName?size)!0},
"child1lastName":{"widgetClass":"plaintext", "parentCode":"child1Clone"},
"child1firstName":{"widgetClass":"plaintext", "parentCode":"child1Clone"},
"child1middleName":{"widgetClass":"plaintext", "parentCode":"child1Clone"},
"child1Birthdate":{"widgetClass":"date", "parentCode":"child1Clone"},
"wayBenefit":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_BENEFIT_64"},
"addressBenefit":{"widgetClass":"plaintext"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"statZayav":{"widgetClass":"dictionary", "dictionaryCode":"03_STATUS_ZAYAV_64114"},
"parentCh":{"widgetClass":"boolean"},
"parent1Ch":{"widgetClass":"boolean"},
"parent2Ch":{"widgetClass":"boolean"},
"trudCh":{"widgetClass":"boolean"},
"trud1Ch":{"widgetClass":"boolean"},
"izmSved":{"widgetClass":"boolean"},
"noWork":{"widgetClass":"boolean"}
} />


<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"bezhDocLoad":{},
"timeDocLoad":{},
"childDocLoad":{},
"child1DocLoad":{},
"opecDocLoad":{},
"vipTrudKnigDocLoad":{},
"trudKnigDocLoad":{},
"svidDeadDocLoad":{},
"sudLishPravDocLoad":{},
"sudNoRodPopDocLoad":{},
"spravPosobDocLoad":{},
"sovmProjivDocLoad":{},
"prikazOtpuskDocLoad":{},
"soglUsinDocLoad":{},
"spravSocZashGitDocLoad":{},
"spravSocZashRegDocLoad":{},
"igripDocLoad":{},
"noSocStrahDocLoad":{},
"slujZanDocLoad":{}
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
