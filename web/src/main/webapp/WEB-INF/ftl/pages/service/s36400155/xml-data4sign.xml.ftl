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
"dov_enable":{"widgetClass":"boolean"},
"polis":{"widgetClass":"plaintext"},
"workplace":{"widgetClass":"plaintext"},
"email":{"widgetClass":"plaintext"},
"doctor":{"widgetClass":"dictionary","dictionaryCode":"03_DOCTOR_05155"},
"lpu":{"widgetClass":"dictionary","dictionaryCode":"03_LPU_05155"},
"desiredDate":{"widgetClass":"date"}
  }
/>
<#assign fileloadElements = {
"dovDovLoad":{},
"dovPasLoad":{},
"polisDocLoad":{}

}
/>


<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={
        "identityDocType":{
        "formElementId":"identityDocType",
        "widgetClass":"customLookup",
        "lookupControllerName":"MainDocTypeController",
        "optionsMap":{"authToken":"${cAuthToken}"}
        }
    }
/>