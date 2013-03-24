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
        <@addressMacros.addressSoap label='addressPost' applicant=false
        country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
        country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
        area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
        country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
</#assign>

<#assign formElements = {
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart},
"socGroup":{"widgetClass":"dictionary", "dictionaryCode":"64_SOC_GROUP_64233"},
"period":{"widgetClass":"dictionary", "dictionaryCode":"64_PERIOD_64233"},
"periodClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.date?size)!0},
"date":{"widgetClass":"date", "parentCode":"periodClone"},
"from":{"widgetClass":"date", "parentCode":"periodClone"},
"quartClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.quart?size)!0},
"quart":{"widgetClass":"dictionary", "dictionaryCode":"64_QUARTER_64233", "parentCode":"quartClone"},
"year":{"widgetClass":"plaintext", "parentCode":"quartClone"},
"benefit":{"widgetClass":"dictionary", "dictionaryCode":"64_BENEFIT_64233"}
} />

<#assign fileloadElements = {} />

<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
/>
