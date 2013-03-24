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
"fio":{"widgetClass":"plaintext"},
"contactPhone":{"widgetClass":"plaintext"},
"contactEmail":{"widgetClass":"plaintext"},
"isTenant":{"widgetClass":"boolean"},
"isBranch":{"widgetClass":"boolean"},
"isOrgWithEduUnit":{"widgetClass":"boolean"}
}/>


<#assign fileloadElements = {
"load_doc1":{},
"load_doc0":{},
"load_doc2":{},
"load_doc6":{},
"load_doc13":{},
"load_doc14":{},
"load_doc3":{},
"load_doc4":{},
"load_doc15":{}
 }/>
<#if form.isTenant=="on">
           <#assign fileloadElements = fileloadElements + {
        "load_doc5":{}
    }/>
</#if>
<#if form.isBranch=="on">
            <#assign fileloadElements = fileloadElements + {
        "load_doc7":{}
    }/>
</#if>
 <#if form.isOrgWithEduUnit=="on">
            <#assign fileloadElements = fileloadElements + {
        "load_doc8":{}
    }/>
</#if>

<@requestPattern.makeSoapRequest
    owner = stateOrgCode
    departmentCode = stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
     applicantAttributes={}
/>