<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>
<#assign formElements = {
"declarant_post_ul":{"widgetClass":"plaintext"},
"zaja_email":{"widgetClass":"plaintext"},
"declarant_name_ul":{"widgetClass":"plaintext"},
"org_name_ul":{"widgetClass":"plaintext"},
"org_form":{"widgetClass":"plaintext"},
"short_name":{"widgetClass":"plaintext"},
"firm_name":{"widgetClass":"plaintext"},
"org_adress":{"widgetClass":"plaintext"},
"tel_ul":{"widgetClass":"plaintext"},
"email_ul":{"widgetClass":"plaintext"},
"request":{"widgetClass":"boolean"},
"check_egrp":{"widgetClass":"boolean"}
}/>
<#assign formElements = formElements + {
    "licensObject":{"widgetClass":"virtualParent", "cloneQuantity":form.license_objects_address?size},
    "actionKind":{"widgetClass":"multiselectableDictionary", "dictionaryCode":"DRUGS_TURNOVER_ACTION_KIND", "parentCode":"licensObject"},
    "license_objects_address":{"widgetClass":"plainText", "parentCode":"licensObject"}
}/>
<#assign fileloadElements = {
"load_doc2":{},
"load_doc13":{},
"load_doc5":{},
"load_doc6":{},
"load_doc7":{},
"load_doc8":{},
"load_doc16":{},
"load_doc17":{},
"load_doc18":{},
"load_doc10":{},
"load_doc19":{},
"load_doc20":{},
"load_doc21":{},
"load_doc22":{},
"load_doc12":{}
 }/>
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