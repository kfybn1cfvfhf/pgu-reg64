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
"reason_re":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{
"1":"Прекращение реализации образовательных программ, прекращение осуществления образовательной деятельности по адресу места ее осуществления",
"2":"Изменение наименований образовательных программ, указанных в приложении к документу, подтверждающему наличие лицензии",
"3":"Переоформление лицензии на бессрочную в пределах срока ее действия",
"4":"Необходимость дополнения документа, подтверждающего наличие лицензии, сведениями о филиалах лицензиата, и (или) об адресах мест осуществления образовательной деятельности, и (или) об образовательных программах, изменение места нахождения лицензиата",
"5":"Возникновение образовательного учреждения, научной организации или иной организации в результате реорганизации в форме слияния в случае наличия лицензии у одного или нескольких реорганизованных юридических лиц, реорганизация образовательного учреждения, научной организации или иной организации в форме присоединения к ним юридического лица в случае наличия лицензии у присоединенного юридического лица",
"6":"Реорганизация лицензиата в форме преобразования, изменение наименования лицензиата (в том числе в случае создания образовательного учреждения путем изменения типа существующего государственного или муниципального образовательного учреждения, установления иного государственного статуса образовательного учреждения), изменение наименования места нахождения лицензиата, изменение наименования адреса места осуществления образовательной деятельности"
}},
"checkBox1":{"widgetClass":"boolean"},
"checkBox2":{"widgetClass":"boolean"},
"checkBox3":{"widgetClass":"boolean"}
}
/>

<#assign fileloadElements = {
"load_doc0":{},
"load_doc39":{},
"load_doc38":{},
"load_doc40":{},
"load_doc1":{},
"load_doc4":{},
"load_doc7":{},
"load_doc5":{},
"load_doc3":{},
"load_doc6":{},
"load_doc28":{},
"load_doc37":{},
"load_doc35":{},
"load_doc29":{}
}
/>

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
