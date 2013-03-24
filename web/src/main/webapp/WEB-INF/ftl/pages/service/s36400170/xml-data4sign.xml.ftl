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
    <@addressMacros.addressSoap label='factAddress' applicant=true
    country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
    settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
    settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
</#assign>

<#assign formElements = {
"prichObr":{"widgetClass":"plaintext"},
"age":{"widgetClass":"plaintext"},
"sitizenship":{"widgetClass":"dictionary", "dictionaryCode":"KIND_OF_CITIZENSHIP"},
"eduType":{"widgetClass":"dictionary", "dictionaryCode":"64_EDUCATION_170"},
"eduOrg":{"widgetClass":"plaintext"},
"eduYear":{"widgetClass":"plaintext"},
"eduProf":{"widgetClass":"plaintext"},
"profName":{"widgetClass":"plaintext"},
"profQual":{"widgetClass":"plaintext"},
"profPost":{"widgetClass":"plaintext"},
"profAge":{"widgetClass":"plaintext"},
"dopProfName":{"widgetClass":"plaintext"},
"dopProfQual":{"widgetClass":"plaintext"},
"dopProfPost":{"widgetClass":"plaintext"},
"dopProfAge":{"widgetClass":"plaintext"},
"skillLanguage":{"widgetClass":"boolean"},
"skillLangName":{"widgetClass":"plaintext"},
"skillPC":{"widgetClass":"boolean"},
"skillDriver":{"widgetClass":"boolean"},
"skillDriverCat":{"widgetClass":"plaintext"},
"testAgreeCh1":{"widgetClass":"boolean"},
"testAgreeCh2":{"widgetClass":"boolean"},
"testAgreeCh3":{"widgetClass":"boolean"},
"testAgreeCh4":{"widgetClass":"boolean"},
"testAgreeCh5":{"widgetClass":"boolean"},
"testAgreeCh6":{"widgetClass":"boolean"},
"applCat1":{"widgetClass":"boolean"},
"applCat2":{"widgetClass":"boolean"},
"applCat3":{"widgetClass":"boolean"}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"applCatDoc1Load":{},
"applCatDoc2Load":{},
"applCatDoc3Load":{}
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