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


    <#if form.applType == "2">
        <@addressMacros.addressSoap label='orgAddress' applicant=false
        country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType'
        country_input='orgAddressCountryInput' settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict'
        area='orgAddressRayon' region='orgAddressRegion' settlement_type='orgAddressSettlementType'
        country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
        street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' flat='orgAddressFlat' post="orgAddressIndex"  />
    </#if>
</#assign>

<#assign applicantSoap>
    <#if form.applType == "1">
        <@addressMacros.addressSoap label='address' applicant=false
        country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
        settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
        settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
        street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
    </#if>
</#assign>

<#if (form.applType == "1")>
<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
"fio_boss":{"widgetClass":"plaintext"},
"ip_phone":{"widgetClass":"plaintext"},
"ip_email":{"widgetClass":"plaintext"},
"doc_type":{"widgetClass":"customLookup","lookupControllerName":"MainDocTypeController","optionsMap":{"authToken":"${cAuthToken}"}},
"doc_num":{"widgetClass":"plaintext"},
"doc_date":{"widgetClass":"date"},
"doc_org":{"widgetClass":"plaintext"},
"lic_num":{"widgetClass":"plaintext"},
"lic_start":{"widgetClass":"date"},
"lic_org":{"widgetClass":"plaintext"},
"lic_reason":{"widgetClass":"dictionary","dictionaryCode":"CHANGE_MED_REASON_IP"},
"lic_basic":{"widgetClass":"plaintext"},
"check_egrp":{"widgetClass":"boolean"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>


      <#switch form.lic_reason>
                    <#case "1">
<#assign fileloadElements = {
"taxPayLoad":{},
"loaddoc61":{},
"copyLicLoad":{},
"staffEducationDocs":{},
"staffAdditionalEducationDocs":{},
"managerEducationDocs":{},
"loaddoc65":{},
"sanCopyLoad":{},
"medActLicenseCopy":{}
}/>
                    <#break>
                    <#case "2">
                    <#case "3">
                    <#case "4">
<#assign fileloadElements = {
"taxPayLoad":{},
"copyLicLoad":{},
"medActLicenseCopy":{}
}/>
                    <#break>
                    <#case "5">
<#assign fileloadElements = {
"loaddoc81":{},
"copyLicPravo":{},
"sanCopyLoad":{},
"staffEducationDocs":{},
"staffAdditionalEducationDocs":{},
"managerEducationDocs":{},
"loaddoc65":{},
"taxPayLoad":{},
"copyLicLoad":{},
"medActLicenseCopy":{}
}/>
                    <#break>
                    <#case "6">
<#assign fileloadElements = {
"loaddoc91":{},
"taxPayLoad":{},
"copyLicLoad":{},
"medActLicenseCopy":{}
}/>
                    <#break>
                    <#case "7">
<#assign fileloadElements = {
"loaddoc71":{},
"taxPayLoad":{},
"copyLicLoad":{}
}/>
                <#break>
                </#switch>
<#assign fileloadElements = fileloadElements + {
"inn_ip":{},
"egripLoad":{}
}/>
<#else>
<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
"fio_zaja":{"widgetClass":"plaintext"},
"phone_zaja":{"widgetClass":"plaintext"},
"enail_zaja":{"widgetClass":"plaintext"},
"full":{"widgetClass":"plaintext"},
"form":{"widgetClass":"plaintext"},
"short_name":{"widgetClass":"plaintext"},
"firm":{"widgetClass":"plaintext"},
"phone":{"widgetClass":"plaintext"},
"email":{"widgetClass":"plaintext"},
"ogrn":{"widgetClass":"plaintext"},
"inn":{"widgetClass":"plaintext"},
"egrul_num":{"widgetClass":"plaintext"},
"egrul_org":{"widgetClass":"plaintext"},
"date_give":{"widgetClass":"date"},
"egrul_place":{"widgetClass":"plaintext"},
"lic_num":{"widgetClass":"plaintext"},
"lic_date_st":{"widgetClass":"date"},
"lic_org":{"widgetClass":"plaintext"},
"check_egrp":{"widgetClass":"boolean"},
"change_reason":{"widgetClass":"dictionary","dictionaryCode":"CHANGE_MED_REASON_UL"}
}/>

  <#switch form.change_reason>
                    <#case "1">
                    <#case "2">
                    <#case "3">
                    <#case "5">
<#assign fileloadElements = {
"dovLicLoad":{},
"taxPayLoad":{},
"medActLicenseCopy":{}
 }/>
                        <#break>
                    <#case "4">
<#assign fileloadElements = {
"copyLicPravo":{},
"loaddoc61":{},
"dovLicLoad":{},
"taxPayLoad":{},
"sanCopyLoad":{},
"loaddoc65":{},
"managerEducationDocs":{},
"staffEducationDocs":{},
"staffAdditionalEducationDocs":{},
"copyLicLoad":{},
"medActLicenseCopy":{}
 }/>
                        <#break>
                    <#case "8">
 <#assign fileloadElements = {
"loaddoc71":{},
"dovLicLoad":{},
"taxPayLoad":{},
"copyLicLoad":{}
 }/>
                        <#break>
                    <#case "6">
      <#assign fileloadElements = {
      "loaddoc81":{},
      "dovLicLoad":{},
      "copyLicLoad":{},
      "sanCopyLoad":{},
      "copyLicPravo":{},
      "loaddoc65":{},
      "staffAdditionalEducationDocs":{},
      "managerEducationDocs":{},
      "staffEducationDocs":{}
      }/>

                        <#break>
                    <#case "7">
   <#assign fileloadElements = {
"loaddoc91":{},
"dovLicLoad":{},
"taxPayLoad":{},
"copyLicLoad":{}
 }/>
                        <#break>
                </#switch>
 <#assign fileloadElements = fileloadElements + {
"egrulLoad":{}
 }/>
</#if>

<#if form.applType == "1">

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />
<#else>
    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    />
</#if>