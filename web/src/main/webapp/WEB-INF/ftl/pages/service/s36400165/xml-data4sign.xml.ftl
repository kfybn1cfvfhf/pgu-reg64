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

<#assign otherSoapPart>
<#--в if statement должно быть поле, однозначно показывающее, была ли открыта страница-->
    <@addressMacros.addressSoap label='orgaddress' applicant=false country='orgaddressCountry' countryCode='orgaddressCountryCode' input='orgaddressEnterType' country_input='orgaddressCountryInput'
                                       settlementRF='orgaddressSettlementDict' streetRF='orgaddressStreetDict' area='orgaddressRayon' region='orgaddressRegion'
                                       settlement_type='orgaddressSettlementType' country_settlement='orgaddressCountrySettlement' settlement='orgaddressSettlementText' city='orgaddressCity'
                                       street='orgaddressStreetText' house='orgaddressHouse' corp='orgaddressKorpus' flat='orgaddressFlat' post="orgaddressIndex"  />



</#assign>

<#assign formElements = {
"dovUlType":{"widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
"org_FullTitle":{"widgetClass":"plaintext"},
"org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
"org_SmallTitle":{"widgetClass":"plaintext"},
"org_phone":{"widgetClass":"plaintext"},
"org_email":{"widgetClass":"plaintext"},
"org_firstName":{"widgetClass":"plaintext"},
"org_lastName":{"widgetClass":"plaintext"},
"org_middleName":{"widgetClass":"plaintext"},
"org_InnUl":{"widgetClass":"plaintext"},
"org_OgrnUl":{"widgetClass":"plaintext"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"license":{"widgetClass":"plaintext"},
"licenseNum":{"widgetClass":"plaintext"},
"licenseReg":{"widgetClass":"plaintext"},
"licenseSrok":{"widgetClass":"date"},
"licensePo":{"widgetClass":"date"},
"orgClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.orgPlace?size)!0},
"orgPlace":{"widgetClass":"plaintext", "parentCode":"orgClone"},
"activKind":{"widgetClass":"plaintext", "parentCode":"orgClone"},
"orgaddress":{"formElementId":"orgaddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>
<#assign fileloadElements = {
 "dovUlNonDovLoad":{},
 "dovUlPasLoad":{},
 "docMvRegULLoad":{},
 "dovUlDovLoad":{},
 "dutyDocLoad":{}
 }/>
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