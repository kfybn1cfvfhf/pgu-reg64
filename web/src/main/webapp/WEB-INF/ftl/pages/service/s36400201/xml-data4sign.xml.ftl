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
    <@addressMacros.addressSoap label='factAddress' applicant=true
    country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
    country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
    area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
    country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex" />
</#assign>

<#assign otherSoapPart>
    <@addressMacros.addressSoap label='stayAddress' applicant=false
    country='stayAddressCountry' countryCode='stayAddressCountryCode' input='stayAddressEnterType'
    country_input='stayAddressCountryInput' settlementRF='stayAddressSettlementDict' streetRF='stayAddressStreetDict'
    area='stayAddressRayon' region='stayAddressRegion' settlement_type='stayAddressSettlementType'
    country_settlement='stayAddressCountrySettlement' settlement='stayAddressSettlementText' city='stayAddressCity'
    street='stayAddressStreetText' house='stayAddressHouse' corp='stayAddressKorpus' flat='stayAddressFlat' post="stayAddressIndex" />
</#assign>

<#assign formElements = {
        "citizenship":{"widgetClass":"dictionary", "dictionaryCode":"64_POLITICAL_NATIONALITY_64065"},
        "target":{"widgetClass":"dictionary", "dictionaryCode":"0364_TARGET_APPEAL_201"},
        "additionally":{"widgetClass":"plaintext"},
        "agree":{"widgetClass":"boolean"},
        "otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
        "identityDocLoad":{},
        "emplDocLoad":{},
        "rightHousingExplDocLoad":{},
        "rightHousingNonEgrpDocLoad":{},
        "medicalReportDocLoad":{},
        "certMarriageDocLoad":{},
        "writtenConsentDocLoad":{},
        "trainingDocLoad":{},
        "autobiographyDocLoad":{},
        "certCznMvDocLoad":{},
        "rightHousingOmsuMvDocLoad":{},
        "rightHousingEgrpMvDocLoad":{},
        "certMvdMvDocLoad":{},
        "sanNormsMvDocLoad":{},
        "techNormsMvDocLoad":{},
        "certPensMvDocLoad":{}
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
        applicantAttributes={"identityDocType":{"formElementId":"identityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}} + {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
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

