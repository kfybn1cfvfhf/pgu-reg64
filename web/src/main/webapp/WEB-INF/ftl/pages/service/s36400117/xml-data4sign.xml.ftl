<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>
<#import "/macros/address.ftl" as addressMacros>
<#import "block.ftl" as bl>

<#assign applicantSoap>
<@bl.addressSoapParametr param={} />
<@bl.addressPostSoapParametr param={} />
</#assign>

<#assign formElements = {
    "otherDocTypeName":{"widgetClass":"plaintext"},
    "deadLastName":{"widgetClass":"plaintext"},
    "deadFirstName":{"widgetClass":"plaintext"},
    "deadMiddleName":{"widgetClass":"plaintext"},
    "deadChild":{"widgetClass":"boolean"},
    "noSocStrah":{"widgetClass":"boolean"},
    "deadMoney":{"widgetClass":"boolean"},
    "wayBenefit":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_BENEFIT_64"},
    "addressBenefit":{"widgetClass":"plaintext"},
    "nameBankBenefit":{"widgetClass":"plaintext"},
    "filialBankBenefit":{"widgetClass":"plaintext"},
    "bikBankBenefit":{"widgetClass":"plaintext"},
    "corrAccBankBenefit":{"widgetClass":"plaintext"},
    "codeFilialBankBenefit":{"widgetClass":"plaintext"},
    "clientAccBankBenefit":{"widgetClass":"plaintext"},
    "socialSupport":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"}

}/>

<#assign fileloadElements = {
    "identityDocLoad":{},
    "sprDeadDocLoad":{},
    "grrDeadChild":{},
    "deadChildDocLoad":{}
}/>

<#switch form.identityDocType>
    <#case "1">
    <#case "2">
    <#case "3">
    <#case "4">

        <@requestPattern.makeSoapRequest
        owner=stateOrgCode
        departmentCode=stateOrgCode
        formElements=formElements
        fileloadElements=fileloadElements
        applicantAttributes={
        "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"},
        "address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}
        }
        />
        <#break >

    <#default>
        <@requestPattern.makeSoapRequest
        owner=stateOrgCode
        departmentCode=stateOrgCode
        formElements=formElements
        fileloadElements=fileloadElements
        applicantAttributes={"widgetClass":"plaintext"}
        />

</#switch>