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
"reason_re":{"widgetClass":"dictionary", "dictionaryCode":"REASON_RENEW_ACCREDIT"},
"filial":{"widgetClass":"boolean"}
}/>

  <#assign fileloadElements = {

 }/>

  <#if form.filial?has_content && form.filial == "on">
                     <#assign fileloadElements = fileloadElements + {
        "load_doc2":{}
    }/>
  </#if>
  <#switch form.reason_re>
                    <#case "1">
                    <#case "2">
  <#assign fileloadElements = fileloadElements + {
"load_doc0":{},
"load_doc1":{},
"load_doc2":{},
"load_doc3":{},
"load_doc4":{},
"load_doc5":{},
"load_doc8":{}
 }/>

                        <#if form.filial?? && form.filial=="on">
                        <#assign fileloadElements = fileloadElements + {
"load_doc12":{},
"load_doc6":{}
 }/>

                        </#if>
                        <#break>
                    <#case "3">
  <#assign fileloadElements = fileloadElements + {
"load_doc0":{},
"load_doc8":{},
"load_doc9":{},
"load_doc3":{}
 }/>
                        <#if form.filial?? && form.filial=="on">
                              <#assign fileloadElements = fileloadElements + {
"load_doc10":{}
 }/>
                        </#if>
                        <#break>
                    <#case "4">
   <#assign fileloadElements = fileloadElements + {
"load_doc0":{},
"load_doc2":{},
"load_doc3":{},
"load_doc11":{},
"load_doc8":{},
"load_doc13":{}
 }/>
                        <#if form.filial?? && form.filial=="on">
                           <#assign fileloadElements = fileloadElements + {
"load_doc10":{}
 }/>
                        </#if>

                        <#break>
  <#case "5">  
   <#assign fileloadElements = fileloadElements + {
"load_doc0":{},
"load_doc2":{},

"load_doc8":{},
   "load_doc1":{},
   "load_doc3":{},
   "load_doc4":{},
   "load_doc5":{}

 }/>
                        <#if form.filial?? && form.filial=="on">
                           <#assign fileloadElements = fileloadElements + {
"load_doc12":{},
   "load_doc6":{}                           
 }/>
                        </#if>    
      
      
      
      <#break>
                    <#-- case 6 -->
                    <#default>
    <#assign fileloadElements = fileloadElements + {
"load_doc0":{},
"load_doc1":{},
"load_doc4":{},
"load_doc5":{},
"load_doc12":{}  
 }/>
                      




                </#switch>

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