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
    "declarant":{"widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
    "doc_vid":{"widgetClass":"staticOptions", "items":{"1":"Дубликат","2":"Копия"}},
    "doc_tip":{"widgetClass":"staticOptions", "items":{"1":"Утрата","2":"Порча"}},
    "serie_num":{"widgetClass":"plaintext"}
        }/>

 <#if form.declarant == "1">

  <#assign formElements = formElements + {
  "declarant_name":{"widgetClass":"plaintext"},
  "declarant_adress":{"widgetClass":"plaintext"},
  "phone_ip":{"widgetClass":"plaintext"},
  "dig_result":{"widgetClass":"boolean"},
  "email_ip":{"widgetClass":"plaintext"},
  "inn_req":{"widgetClass":"boolean"}
   }/>
 <#else>
   <#assign formElements = formElements + {
  "org_name_ul":{"widgetClass":"plaintext"},
  "juridical_person_form":{"widgetClass":"plaintext"},
  "org_adress":{"widgetClass":"plaintext"},
   "fio_mngr":{"widgetClass":"plaintext"},
"inn_ul":{"widgetClass":"plaintext"},
"ogrn_ul":{"widgetClass":"plaintext"},
"ogrn_ul":{"widgetClass":"plaintext"},
  "phone_ul":{"widgetClass":"plaintext"},
     "dig_result":{"widgetClass":"boolean"},
  "email_ul":{"widgetClass":"plaintext"},
  "inn_req":{"widgetClass":"boolean"}
   }/>
 </#if>

    <#assign fileloadElements = {
    "inn":{},
    "ogrnip":{},
    "load_doc_a1":{},
    "load_doc_a2":{},
    "load_doc_a3":{}
     }/>
<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
     applicantAttributes={

    }
/>