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
"phone":{"widgetClass":"plaintext"},
"answerRg":{"widgetClass":"dictionary","dictionaryCode":"TYPE_ANSW_APPL"},
"adressReg":{"widgetClass":"plaintext"},
"adressPost":{"widgetClass":"plaintext"},
"email":{"widgetClass":"plaintext"},
"adressObj":{"widgetClass":"plaintext"},
"corpCh":{"widgetClass":"boolean"},
"bossCh":{"widgetClass":"boolean"}
}/>
<#if form.corpCh == "on">
<#assign formElements = formElements + {
"corp":{"widgetClass":"plaintext"},
"bossName":{"widgetClass":"plaintext"},
"adressReg":{"widgetClass":"plaintext"},
"adressPost":{"widgetClass":"plaintext"},
"email":{"widgetClass":"plaintext"},
"adressObj":{"widgetClass":"plaintext"}
}/>
</#if>
<#assign fileloadElements = {
"loaddoc":{}
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