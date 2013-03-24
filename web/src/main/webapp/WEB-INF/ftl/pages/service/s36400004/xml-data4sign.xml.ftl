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
"filial":{"widgetClass":"boolean"}
}/>


<#assign fileloadElements = {
"load_doc1":{},
"load_doc0":{},
"load_doc3":{},
"load_doc4":{},
"load_doc6":{}
 }/>
  <#if form.filial?has_content && form.filial == "on">
                     <#assign fileloadElements = fileloadElements + {
        "load_doc2":{}
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