<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>
<#if (form.applType == "1")>
<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"fio_IP":{"widgetClass":"plaintext"},
"place_live":{"widgetClass":"plaintext"},
"tel":{"widgetClass":"plaintext"},
"email":{"widgetClass":"plaintext"},
"request":{"widgetClass":"boolean"},
"doc_type":{"widgetClass":"customLookup","lookupControllerName":"MainDocTypeController","optionsMap":{"authToken":"${cAuthToken}"}},
"docSer":{"widgetClass":"plaintext"},
"docDate":{"widgetClass":"date"},
"docIssuer":{"widgetClass":"plaintext"},
"check_egrp":{"widgetClass":"boolean"}
}/>
<#assign formElements = formElements + {
    "licensObject":{"widgetClass":"virtualParent", "cloneQuantity":form.licensAdress_1?size},
    "licensAdress_1":{"widgetClass":"plainText", "parentCode":"licensObject"},
    "objectLicensKind_1":{"widgetClass":"dictionary", "dictionaryCode":"VID_OBJ_FARMA", "parentCode":"licensObject"},
    "farmWorks_1":{"widgetClass":"multiselectableDictionary", "dictionaryCode":"VID_RABOT_FARMA", "parentCode":"licensObject"}
}/>
<#assign fileloadElements = {
"loadsan":{},
"loadDocG1":{},
"loadDocH1":{},
"loadDocF1":{},
"loadDocZ1":{},
"el_cash":{},
"el_prof":{},
"docegip":{},
"loadDocdov2":{},
"loaddoc_okpo":{},
"loaddoc_building":{},
"loaddoc_manager":{}
 }/>


<#else>


<#assign formElements = {
"applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Физическое лицо","2":"Юридическое лицо"}},
"phone_zaja":{"widgetClass":"plaintext"},
"juristic_Person_Fio":{"widgetClass":"plaintext"},
"email_zaja":{"widgetClass":"plaintext"},
"juristic_Person_Fullname":{"widgetClass":"plaintext"},
"org_form":{"widgetClass":"plaintext"},
"org_short_name":{"widgetClass":"plaintext"},
"firmname":{"widgetClass":"plaintext"},
"is_med_org":{"widgetClass":"boolean"},
"declarantAdressUL":{"widgetClass":"plaintext"},
"phone_ul":{"widgetClass":"plaintext"},
"email_ul":{"widgetClass":"plaintext"},
"request":{"widgetClass":"boolean"},
"ogrnUL":{"widgetClass":"plaintext"},
"innUL":{"widgetClass":"plaintext"},
"check_egrp":{"widgetClass":"boolean"}
}/>
<#assign formElements = formElements + {
    "licensObject":{"widgetClass":"virtualParent", "cloneQuantity":form.licensAdress_1?size},
    "licensAdress_1":{"widgetClass":"plainText", "parentCode":"licensObject"},
    "objectLicensKind_1":{"widgetClass":"dictionary", "dictionaryCode":"VID_OBJ_FARMA", "parentCode":"licensObject"},
    "farmWorks_1":{"widgetClass":"multiselectableDictionary", "dictionaryCode":"VID_RABOT_FARMA", "parentCode":"licensObject"}
}/>



<#if form.is_med_org=="on">
<#assign fileloadElements = {
"loadDocB1":{},
"loadDocB5":{},
"loadDocB3":{},
"loaddoc_okpo":{},
"loaddoc_building":{},
"lic_med":{},
"el_cash":{},
"docegul":{},
"loadDocB8":{}
 }/>

<#else>

<#assign fileloadElements = {
"loadDocA1":{},
"loadDocI1":{},
"el_prof":{},
"el_pravo":{},
"sanit":{},
"el_cash":{},
"docegul":{},
"el_farmac":{}
 }/>
</#if>
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