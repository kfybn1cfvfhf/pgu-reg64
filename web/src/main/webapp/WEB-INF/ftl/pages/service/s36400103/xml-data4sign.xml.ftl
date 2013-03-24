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
    <#if form.applType == "1">
        <@addressMacros.addressSoap label='address' applicant=true
        country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
        settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
        settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
        street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
    </#if>
</#assign>

<#assign otherSoapPart>
    <#if form.applType == "2">
        <@addressMacros.addressSoap label='orgAddress' applicant=false
        country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType'
        country_input='orgAddressCountryInput' settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict'
        area='orgAddressRayon' region='orgAddressRegion' settlement_type='orgAddressSettlementType'
        country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
        street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' office='orgAddressFlat' post="orgAddressIndex"  />

        <@addressMacros.addressSoap label='orgPostAddress' applicant=false
        country='orgPostAddressCountry' countryCode='orgPostAddressCountryCode' input='orgPostAddressEnterType'
        country_input='orgPostAddressCountryInput' settlementRF='orgPostAddressSettlementDict' streetRF='orgPostAddressStreetDict'
        area='orgPostAddressRayon' region='orgPostAddressRegion' settlement_type='orgPostAddressSettlementType'
        country_settlement='orgPostAddressCountrySettlement' settlement='orgPostAddressSettlementText' city='orgPostAddressCity'
        street='orgPostAddressStreetText' house='orgPostAddressHouse' corp='orgPostAddressKorpus' office='orgPostAddressFlat' post="orgPostAddressIndex"  />
    </#if>

        <@addressMacros.addressSoap label='landAddress' applicant=false
        country='landAddressCountry' countryCode='landAddressCountryCode' input='landAddressEnterType'
        country_input='landAddressCountryInput' settlementRF='landAddressSettlementDict' streetRF='landAddressStreetDict'
        area='landAddressRayon' region='landAddressRegion' settlement_type='landAddressSettlementType'
        country_settlement='landAddressCountrySettlement' settlement='landAddressSettlementText' city='landAddressCity'
        street='landAddressStreetText' house='landAddressHouse' corp='landAddressKorpus' flat='landAddressFlat' post="landAddressIndex"  />

</#assign>

<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"dov_enable":{"widgetClass":"boolean"},
"dovUlType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"anotherFl_enable":{"widgetClass":"boolean"},
"anotherUl_enable":{"widgetClass":"boolean"},

"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_phone":{"widgetClass":"plaintext"},
"org_fax":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"org_InnUl":{"widgetClass":"plaintext"},
"org_OgrnUl":{"widgetClass":"plaintext"},
"org_firstName":{"widgetClass":"plaintext"},
"org_lastName":{"widgetClass":"plaintext"},
"org_middleName":{"widgetClass":"plaintext"},
"fl_owner_clone":{"widgetClass":"virtualParent", "cloneQuantity":(form.fl_owner_Name?size)!0},
"fl_owner_Name":{"widgetClass":"plaintext", "parentCode":"fl_owner_clone"},
"fl_owner_address":{"widgetClass":"plaintext", "parentCode":"fl_owner_clone"},
"fl_owner_phone":{"widgetClass":"plaintext", "parentCode":"fl_owner_clone"},
"fl_owner_email":{"widgetClass":"plaintext", "parentCode":"fl_owner_clone"},
"fl_owner_identityDocType":{"widgetClass":"plaintext", "parentCode":"fl_owner_clone"},
"ul_owner_clone":{"widgetClass":"virtualParent", "cloneQuantity":(form.ul_owner_FullTitle?size)!0},
"ul_owner_FullTitle":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64", "parentCode":"ul_owner_clone"},
"ul_owner_addressUr":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_addressPost":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_phone":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_fax":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_email":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_Name":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_InnUl":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"ul_owner_OgrnUl":{"widgetClass":"plaintext", "parentCode":"ul_owner_clone"},
"landKadastr":{"widgetClass":"plaintext"},
"landSquare":{"widgetClass":"plaintext"},
"landJobs":{"widgetClass":"dictionary", "dictionaryCode":"64_TYPE_OF_WORK_103"},
"landObjName":{"widgetClass":"plaintext"},
"landDopInfo":{"widgetClass":"plaintext"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovUlNonDovLoad":{},
"dovUlDovLoad":{},
"dovUlPasLoad":{},
"fl_owner_identityDocLoad":{},
"tuDocLoad":{},
"topographyDocLoad":{},
"lowLandDocLoad":{},
"lowObjDocLoad":{},
"techPasDocLoad":{},
"kadastrDocLoad":{}
}
/>
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

<#else >

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />

</#if>
