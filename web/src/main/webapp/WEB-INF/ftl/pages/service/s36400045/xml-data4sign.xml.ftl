<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">

<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>

<#assign formElements={
"dov_enable":{"widgetClass":"boolean"},
"applEmployedCh":{"widgetClass":"boolean"},
"applWorkPlace":{"widgetClass":"plainText"},
"applWorkPost":{"widgetClass":"plainText"},
"applWorkPhone":{"widgetClass":"plainText"},
"applStatus":{"widgetClass":"dictionary", "dictionaryCode":"0364_APPL_STATUS"},
"parent2DisableCh":{"widgetClass":"boolean"},
"applPrivilegeCh":{"widgetClass":"boolean"},
"privilegeCategory":{"widgetClass":"dictionary", "dictionaryCode":"0364_PRIVILEGE_CATEGORY"},

"parentLastName":{"widgetClass":"plainText"},
"parentFirstName":{"widgetClass":"plainText"},
"parentMiddleName":{"widgetClass":"plainText"},
"parentEmployedCh":{"widgetClass":"boolean"},
"parentWorkPlace":{"widgetClass":"plainText"},
"parentWorkPost":{"widgetClass":"plainText"},
"parentIdentityDocType":{"widgetClass":"customLookup","lookupControllerName":"MainDocTypeController","optionsMap":{"authToken":"${cAuthToken}"} },
"parentPassSeria":{"widgetClass":"plainText"},
"parentPassNo":{"widgetClass":"plainText"},
"parentPassDate":{"widgetClass":"date"},
"parentPassFrom":{"widgetClass":"plainText"},
"SRayon":{"widgetClass":"dictionary","dictionaryCode":"0364_DISTRICT_SO"},
"dou_rd":{"widgetClass":"plainText"},
"childLastName":{"widgetClass":"plainText"},
"childFirstName":{"widgetClass":"plainText"},
"childMiddleName":{"widgetClass":"plainText"},
"childBirthdate":{"widgetClass":"date"},
"childGender":{"widgetClass":"dictionary", "dictionaryCode":"DOU_CH_GENDER"},
"correctCh":{"widgetClass":"boolean"}
} />

<#assign fileloadElements = {
"dovDovLoad":{},
"dovPasLoad":{},
"identityDocLoad":{},
"topPriorityDocLoad":{},
"priorityDocLoad":{},
"advantageDocLoad":{},
"birthCertificateDocLoad":{},
"commissionDocLoad":{}
} />

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