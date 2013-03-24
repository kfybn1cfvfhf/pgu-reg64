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
"rayon":{"widgetClass":"dictionary","dictionaryCode":"0364_DISTRICT_SO"},
"nameSchool":{"widgetClass":"plainText"},
"childLastName":{"widgetClass":"plainText"},
"childFirstName":{"widgetClass":"plainText"},
"childMiddleName":{"widgetClass":"plainText"},
"childBirthdate":{"widgetClass":"date"},
"childGrade":{"widgetClass":"plainText"}
}/>

<#assign fileloadElements = {}/>

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