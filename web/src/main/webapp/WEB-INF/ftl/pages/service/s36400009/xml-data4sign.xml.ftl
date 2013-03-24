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


<#assign applicantSoap>
<#if form.applType == "1">
   <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                           settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                           settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                           street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"/>
   </#if>
</#assign>

<#assign otherSoapPart>

<#if form.applType == "2">
<@addressMacros.addressSoap label='org_addressPost' applicant=false country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType' country_input='org_addressPostCountryInput'
                                       settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict' area='org_addressPostRayon' region='org_addressPostRegion'
                                       settlement_type='org_addressPostSettlementType' country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
                                       street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' office='org_addressPostFlat' post="org_addressPostIndex"/>
</#if>
</#assign>



<#assign formElements = {
    "applType":{"formElementId":"applType", "widgetClass":"staticOptions", "items":{"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}},
    "dov_enable":{"widgetClass":"boolean"},
    "dovUlType":{"formElementId":"dovUlType", "widgetClass":"staticOptions", "items":{"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"}},
    "org_FullTitle":{"widgetClass":"plaintext"},
    "org_opf":{"widgetClass":"dictionary", "dictionaryCode":"FORM_OF_INCORPORATION_64"},
    "org_SmallTitle":{"widgetClass":"plaintext"},
    "org_FirmNazTitle":{"widgetClass":"plaintext"},
    "org_phone":{"widgetClass":"plaintext"},
    "org_email":{"widgetClass":"plaintext"},
    "org_InnUl":{"widgetClass":"plaintext"},
    "org_OgrnUl":{"widgetClass":"plaintext"},

    "documentNumberUL":{"widgetClass":"plaintext"},
    "dateIssueUL":{"widgetClass":"date"},
    "issuingAuthorityUL":{"widgetClass":"plaintext"},
    "licenseNumber":{"widgetClass":"plaintext"},
    "startDateLicense":{"widgetClass":"date"},
    "nameLicensingAuthority":{"widgetClass":"plaintext"},
    "reason_reIP":{"formElementId":"reason_reIP", "widgetClass":"staticOptions", "items":{
        '1':'Изменение индивидуальным предпринимателем адресов мест осуществления медицинской деятельности, оказываемых услуг, составляющих лицензируемый вид деятельности',
        '2':'Изменение имени, фамилии и (в случае, если имеется) отчества индивидуального предпринимателя',
        '3':'Изменение места жительства индивидуального предпринимателя',
        '4':'Изменение реквизитов документа, удостоверяющего личность индивидуального предпринимателя',
        '5':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности',
        '6':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности с целью прекращения',
        '7':'Изменение индивидуальным предпринимателем адресов мест осуществления медицинской деятельности или выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности, с целью прекращения'
    }},
    "documentBase":{"widgetClass":"plaintext"},
    "ownership":{"widgetClass":"boolean"},
    "documentNumber":{"widgetClass":"plaintext"},
    "dateIssue":{"widgetClass":"date"},
    "licenseNumberUL":{"widgetClass":"plaintext"},
    "startDateLicenseUL":{"widgetClass":"date"},
    "nameLicensingAuthorityUL":{"widgetClass":"plaintext"},
    "reason_reUL":{"formElementId":"reason_reUL", "widgetClass":"staticOptions", "items":{
        '1':'Реорганизация юридического лица в форме преобразования',
        '2':'Изменение наименования юридического лица',
        '3':'Изменение адреса места нахождения юридического лица',
        '4':'Изменение юридическим лицом адресов мест осуществления лицензируемого вида деятельности, оказываемых услуг, составляющих лицензируемый вид деятельности',
        '5':'Реорганизация юридических лиц в форме слияния',
        '6':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности',
        '7':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности с целью прекращения',
        '8':'Изменение юридическим лицом адресов мест осуществления лицензируемого вида деятельности и выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности с целью прекращения'
    }},
    "otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#assign fileloadElements = {
    "identityDocLoad":{},
     "docMvRegIPLoad":{},
     "docMvRegULLoad":{},
     "docMvRegFNSLoad":{},
    "dovUlNonDovLoad":{},
    "dovDovLoad":{},
    "dovPasLoad":{},
    "dovUlPasLoad":{},
    "dovUlDovLoad":{},
"load_doc1":{},
"load_doc4":{},
"load_doc6":{},
"load_doc7":{},
"load_doc9":{},
"load_doc3":{},
"load_doc5":{},
"load_doc17":{},
"load_doc13":{},
"load_doc15":{},
"load_doc14":{},
"load_doc16":{},
"load_doc18":{},
"load_doc20":{},
"load_doc21":{},
"load_doc22":{}
}/>

<#if form.applType?? && form.applType=="1">

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
            "identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}
            } + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
            />
            <#break >

        <#default>
            <@requestPattern.makeSoapRequest
            owner=stateOrgCode
            departmentCode=stateOrgCode
            formElements=formElements
            fileloadElements=fileloadElements
             applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
            />

    </#switch>

<#else >

    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
     applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />

</#if>
