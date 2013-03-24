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

<#if form.addressPostStreetDict?has_content || form.addressPostCity?has_content>
<@addressMacros.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
                                       settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
                                       settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                                       street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"/>
</#if>

<#if form.objectEstateAddressSettlementDict?has_content || form.objectEstateAddressCity?has_content>
<@addressMacros.addressSoap label='objectEstateAddress' applicant=false country='objectEstateAddressCountry' countryCode='objectEstateAddressCountryCode' input='objectEstateAddressEnterType' country_input='objectEstateAddressCountryInput'
                                       settlementRF='objectEstateAddressSettlementDict' streetRF='objectEstateAddressStreetDict' area='objectEstateAddressRayon' region='objectEstateAddressRegion'
                                       settlement_type='objectEstateAddressSettlementType' country_settlement='objectEstateAddressCountrySettlement' settlement='objectEstateAddressSettlementText' city='objectEstateAddressCity'
                                       street='objectEstateAddressStreetText' house='objectEstateAddressHouse' corp='objectEstateAddressKorpus' office='objectEstateAddressFlat' post="objectEstateAddressIndex"/>
</#if>

<#if form.org_addressUrSettlementDict?has_content || form.org_addressUrCity?has_content>
<@addressMacros.addressSoap label='org_addressUr' applicant=false country='org_addressUrCountry' countryCode='org_addressUrCountryCode' input='org_addressUrEnterType' country_input='org_addressUrCountryInput'
                                       settlementRF='org_addressUrSettlementDict' streetRF='org_addressUrStreetDict' area='org_addressUrRayon' region='org_addressUrRegion'
                                       settlement_type='org_addressUrSettlementType' country_settlement='org_addressUrCountrySettlement' settlement='org_addressUrSettlementText' city='org_addressUrCity'
                                       street='org_addressUrStreetText' house='org_addressUrHouse' corp='org_addressUrKorpus' office='org_addressUrFlat' post="org_addressUrIndex"  />
</#if>


<#if form.org_addressUrSettlementDict?has_content || form.org_addressUrCity?has_content>
<@addressMacros.addressSoap label='org_addressPost' applicant=false country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType' country_input='org_addressPostCountryInput'
                                       settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict' area='org_addressPostRayon' region='org_addressPostRegion'
                                       settlement_type='org_addressPostSettlementType' country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
                                       street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' flat='org_addressPostFlat' post="org_addressPostIndex"  />
</#if>

</#assign>


<#assign formElements = {
    "applType":{"widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
    "dov_enable":{"widgetClass":"boolean"},
    "dovUlType":{"widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
    "org_FullTitle":{"widgetClass":"plaintext"},
    "org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
    "org_SmallTitle":{"widgetClass":"plaintext"},
     "otheraddress":{"formElementId":"otheraddress", "widgetClass":"address", "addressSoap":otherSoapPart},
    "org_phone":{"widgetClass":"plaintext"},
    "org_fax":{"widgetClass":"plaintext"},
    "org_email":{"widgetClass":"plaintext"},
    "org_firstName":{"widgetClass":"plaintext"},
    "org_lastName":{"widgetClass":"plaintext"},
    "org_middleName":{"widgetClass":"plaintext"},
    "objectName":{"widgetClass":"plaintext"},
    "objectEstateSpace":{"widgetClass":"plaintext"},
    "objectCadastralNumber":{"widgetClass":"plaintext"},
    "waydelivery":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_RESULT_64"}
}

/>


<#assign fileloadElements = {
    "identityDocLoad":{},
    "dovDovLoad":{},
    "dovPasLoad":{},
    "dovUlNonDovLoad":{},
    "dovUlDovLoad":{},
    "dovUlPasLoad":{},
    "dovApplicantDoc":{}
}
/>
<#assign applicantSoap>

<@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                       settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                       settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                       street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex" />

</#assign>
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
        "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}} + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}

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

<#else >

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
/>
</#if>