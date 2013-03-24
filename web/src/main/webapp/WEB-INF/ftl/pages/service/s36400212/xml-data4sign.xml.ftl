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
"post":{"widgetClass":"plaintext"},
"orgName":{"widgetClass":"plaintext"},
"eduCategoria":{"formElementId":"eduCategoria", "widgetClass":"staticOptions", "items":{"1":"Первая категория","2":"Высшая категория"}},
"#eduPost":{"widgetClass":"plaintext"},
"eduRealPost":{"formElementId":"eduRealPost", "widgetClass":"staticOptions", "items":{"1":"Первая категория","2":"Высшая категория","3":"Не имею категории"}},
"eduRealPostData":{"widgetClass":"date"},
"eduOsnAttestat":{"widgetClass":"plaintext"},
"eduOrg":{"widgetClass":"plaintext"},
"eduNargady":{"widgetClass":"plaintext"},
"eduModernKvalif":{"widgetClass":"plaintext"},
"eduStagSpec":{"widgetClass":"plaintext"},
"eduStagPost":{"widgetClass":"plaintext"},
"eduStagOrg":{"widgetClass":"plaintext"},
"eduGakAgree":{"formElementId":"eduGakAgree", "widgetClass":"staticOptions", "items":{"1":"в моем присутствии","2":"без моего присутствия"}},
"eduAttestAgree":{"widgetClass":"boolean"}
} />

<#assign fileloadElements = {}
/>

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={}
/>
