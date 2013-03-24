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
    <@addressMacros.addressSoap label='residenceAdress' applicant=false
    country='residenceAddressCountry' countryCode='residenceAddressCountryCode' input='residenceAddressEnterType'
    country_input='residenceAddressCountryInput' settlementRF='residenceAddressSettlementDict' streetRF='residenceAddressStreetDict'
    area='residenceAddressRayon' region='residenceAddressRegion' settlement_type='residenceAddressSettlementType'
    country_settlement='residenceAddressCountrySettlement' settlement='residenceAddressSettlementText' city='residenceAddressCity'
    street='residenceAddressStreetText' house='residenceAddressHouse' corp='residenceAddressKorpus' flat='residenceAddressFlat' post="residenceAddressIndex"  />

    <@addressMacros.addressSoap label='stayAdress' applicant=false
    country='stayAddressCountry' countryCode='stayAddressCountryCode' input='stayAddressEnterType'
    country_input='stayAddressCountryInput' settlementRF='stayAddressSettlementDict' streetRF='stayAddressStreetDict'
    area='stayAddressRayon' region='stayAddressRegion' settlement_type='stayAddressSettlementType'
    country_settlement='stayAddressCountrySettlement' settlement='stayAddressSettlementText' city='stayAddressCity'
    street='stayAddressStreetText' house='stayAddressHouse' corp='stayAddressKorpus' flat='stayAddressFlat' post="stayAddressIndex"  />

    <@addressMacros.addressSoap label='factAddress' applicant=false
    country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
    country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
    area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
    country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

    <#if form.incapable_enable == "on">
        <@addressMacros.addressSoap label='recipientResidenceAdress' applicant=false
        country='recipientResidenceAddressCountry' countryCode='recipientResidenceAddressCountryCode' input='recipientResidenceAddressEnterType'
        country_input='recipientResidenceAddressCountryInput' settlementRF='recipientResidenceAddressSettlementDict' streetRF='recipientResidenceAddressStreetDict'
        area='recipientResidenceAddressRayon' region='recipientResidenceAddressRegion' settlement_type='recipientResidenceAddressSettlementType'
        country_settlement='recipientResidenceAddressCountrySettlement' settlement='recipientResidenceAddressSettlementText' city='recipientResidenceAddressCity'
        street='recipientResidenceAddressStreetText' house='recipientResidenceAddressHouse' corp='recipientResidenceAddressKorpus' flat='recipientResidenceAddressFlat' post="recipientResidenceAddressIndex"  />

        <@addressMacros.addressSoap label='recipientStayAdress' applicant=false
        country='recipientStayAddressCountry' countryCode='recipientStayAddressCountryCode' input='recipientStayAddressEnterType'
        country_input='recipientStayAddressCountryInput' settlementRF='recipientStayAddressSettlementDict' streetRF='recipientStayAddressStreetDict'
        area='recipientStayAddressRayon' region='recipientStayAddressRegion' settlement_type='recipientStayAddressSettlementType'
        country_settlement='recipientStayAddressCountrySettlement' settlement='recipientStayAddressSettlementText' city='recipientStayAddressCity'
        street='recipientStayAddressStreetText' house='recipientStayAddressHouse' corp='recipientStayAddressKorpus' flat='recipientStayAddressFlat' post="recipientStayAddressIndex"  />

        <@addressMacros.addressSoap label='recipientFactAddress' applicant=false
        country='recipientFactAddressCountry' countryCode='recipientFactAddressCountryCode' input='recipientFactAddressEnterType'
        country_input='recipientFactAddressCountryInput' settlementRF='recipientFactAddressSettlementDict' streetRF='recipientFactAddressStreetDict'
        area='recipientFactAddressRayon' region='recipientFactAddressRegion' settlement_type='recipientFactAddressSettlementType'
        country_settlement='recipientFactAddressCountrySettlement' settlement='recipientFactAddressSettlementText' city='recipientFactAddressCity'
        street='recipientFactAddressStreetText' house='recipientFactAddressHouse' corp='recipientFactAddressKorpus' flat='recipientFactAddressFlat' post="recipientFactAddressIndex"  />
    </#if>
</#assign>

<#assign formElements = {
"dov_enable":{"widgetClass":"boolean"},
"incapable_enable":{"widgetClass":"boolean"},
"recipientLastName":{"widgetClass":"plaintext"},
"recipientFirstName":{"widgetClass":"plaintext"},
"recipientMiddleName":{"widgetClass":"plaintext"},
"recipientSnils":{"widgetClass":"plaintext"},
"gkuUspn":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
"goalRef":{"widgetClass":"dictionary", "dictionaryCode":"03_GOAL_REF_64102"},
"personClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.famLastName?size)!0},
"famLastName":{"widgetClass":"plaintext", "parentCode":"personClone"},
"famFirstName":{"widgetClass":"plaintext", "parentCode":"personClone"},
"famMiddleName":{"widgetClass":"plaintext", "parentCode":"personClone"},
"famReason":{"widgetClass":"plaintext", "parentCode":"personClone"},
"person1Clone":{"widgetClass":"virtualParent", "cloneQuantity":(form.fam1LastName?size)!0},
"fam1LastName":{"widgetClass":"plaintext", "parentCode":"person1Clone"},
"fam1FirstName":{"widgetClass":"plaintext", "parentCode":"person1Clone"},
"fam1MiddleName":{"widgetClass":"plaintext", "parentCode":"person1Clone"},
"socSupport":{"widgetClass":"multiselectableDictionary", "dictionaryCode":"03_SOC_SUPPORT_64102", "parentCode":"person1Clone"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
} />

<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"dovOpekLoad":{},
"sostavDocLoad":{},
"familyDocLoad":{},
"agree1DocLoad":{},
"socDocLoad":{}
}
/>

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