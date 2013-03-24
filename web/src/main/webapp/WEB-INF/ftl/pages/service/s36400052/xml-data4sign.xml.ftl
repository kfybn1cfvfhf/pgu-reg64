<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>
 <#if form.declarant == "1">
<#assign formElements = {
"declarant":{"widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
"phone_ip":{"widgetClass":"plaintext"},
"email_ip":{"widgetClass":"plaintext"},
"declarant_name":{"widgetClass":"plaintext"},
"serie_num":{"widgetClass":"plaintext"},
"declarant_adress":{"widgetClass":"plaintext"},
"dig_result":{"widgetClass":"boolean"},
"inn_req":{"widgetClass":"boolean"}
}/>
<#else>
<#assign formElements = {
"declarant":{"widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
"email_ul":{"widgetClass":"plaintext"},
"juridical_person_form":{"widgetClass":"plaintext"},
"phone_ul":{"widgetClass":"plaintext"},
"org_name_ul":{"widgetClass":"plaintext"},
"serie_num":{"widgetClass":"plaintext"},
"org_adress":{"widgetClass":"plaintext"},
"fio_mngr":{"widgetClass":"plaintext"},
"inn_ul":{"widgetClass":"plaintext"},
"ogrn_ul":{"widgetClass":"plaintext"},
"dig_result":{"widgetClass":"boolean"},
"inn_req":{"widgetClass":"boolean"}
}/>
</#if>
<#assign formElements = formElements + {
"doc_vid":{"widgetClass":"staticOptions", "items":{"1":"Дубликат","2":"Копия"}},
"doc_tip":{"widgetClass":"staticOptions", "items":{"1":"Утрата","2":"Порча"}}
}/>
<#assign fileloadElements = {
"inn":{},
"egripLoad":{},
"load_doc_a2":{},
"load_doc_a1":{}
 }/>
                <#if form.declarant == "2">
                <#assign fileloadElements = fileloadElements + {
"load_doc_b3":{}
 }/>
                <#else>
                <#assign fileloadElements = fileloadElements + {
"load_doc_a3":{}
 }/>
                </#if>
<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
     applicantAttributes={
        "doc_type":{
        "formElementId":"doc_type",
        "widgetClass":"customLookup",
        "lookupControllerName":"MainDocTypeController",
        "optionsMap":{"authToken":"${cAuthToken}"}
        }
    }
/>