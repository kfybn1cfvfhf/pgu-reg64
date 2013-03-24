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
    <@addressMacros.addressSoap label='orgAddress' applicant=false
    country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType' country_input='orgAddressCountryInput'
    settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict' area='orgAddressRayon' region='orgAddressRegion'
    settlement_type='orgAddressSettlementType' country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
    street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' office='orgAddressFlat' post="orgAddressIndex"  />

    <@addressMacros.addressSoap label='orgFactAddress' applicant=false
    country='orgFactAddressCountry' countryCode='orgFactAddressCountryCode' input='orgFactAddressEnterType' country_input='orgFactAddressCountryInput'
    settlementRF='orgFactAddressSettlementDict' streetRF='orgFactAddressStreetDict' area='orgFactAddressRayon' region='orgFactAddressRegion'
    settlement_type='orgFactAddressSettlementType' country_settlement='orgFactAddressCountrySettlement' settlement='orgFactAddressSettlementText' city='orgFactAddressCity'
    street='orgFactAddressStreetText' house='orgFactAddressHouse' corp='orgFactAddressKorpus' office='orgFactAddressFlat' post="orgFactAddressIndex"  />
</#assign>

<#assign formElements = {
"dovUlType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_SmallTitle":{"widgetClass":"plaintext"},
"org_FirmTitle":{"widgetClass":"plaintext"},
"org_addressUr":{"widgetClass":"plaintext"},
"org_factAddressUr":{"widgetClass":"plaintext"},
"org_addressEq":{"widgetClass":"boolean"},
"org_addressPost":{"widgetClass":"plaintext"},
"org_phone":{"widgetClass":"plaintext"},
"org_fax":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"org_firstName":{"widgetClass":"plaintext"},
"org_lastName":{"widgetClass":"plaintext"},
"org_middleName":{"widgetClass":"plaintext"},
"org_InnUl":{"widgetClass":"plaintext"},
"org_OgrnUl":{"widgetClass":"plaintext"},
"goalAppl":{"widgetClass":"dictionary", "dictionaryCode":"03_GOAL_APPL_64215"},
"typeMarket":{"widgetClass":"dictionary", "dictionaryCode":"03_TYPE_MARKET_64215"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"dovUlNonDovLoad":{},
"dovUlPasLoad":{},
"docMvRegULLoad":{},
"dovUlDovLoad":{},
"founderDocLoad":{},
"marketDocLoad":{}
}
/>

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
/>