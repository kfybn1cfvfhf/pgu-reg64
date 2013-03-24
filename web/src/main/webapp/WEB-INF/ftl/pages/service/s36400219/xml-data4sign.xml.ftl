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
        <@addressMacros.addressSoap label='address' applicant=true
        country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
        settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
        settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
        street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

        <@addressMacros.addressSoap label='factAddress' applicant=true
        country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
        settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
        settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
        street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
</#assign>

<#assign otherSoapPart>
        <@addressMacros.addressSoap label='addressPost' applicant=false
        country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
</#assign>

<#assign formElements = {
"stat_zayav":{"widgetClass":"dictionary","dictionaryCode":"03_STAT_ZAYAV_64219"},
"dov_enable":{"widgetClass":"boolean"},
"dovLastName":{"widgetClass":"plaintext"},
"dovFirstName":{"widgetClass":"plaintext"},
"dovMiddleName":{"widgetClass":"plaintext"},
"nameBankBenefit":{"widgetClass":"plaintext"},
"filialBankBenefit":{"widgetClass":"plaintext"},
"bikBankBenefit":{"widgetClass":"plaintext"},
"corrAccBankBenefit":{"widgetClass":"plaintext"},
"codeFilialBankBenefit":{"widgetClass":"plaintext"},
"clientAccBankBenefit":{"widgetClass":"plaintext"},
"childSvedClone":{"widgetClass":"virtualParent", "cloneQuantity":(form.lastNameChild?size)!0},
"lastNameChild":{"widgetClass":"plaintext","parentCode":"childSvedClone"},
"firstNameChild":{"widgetClass":"plaintext","parentCode":"childSvedClone"},
"middleNameChild":{"widgetClass":"plaintext","parentCode":"childSvedClone"},
"birthdateChild":{"widgetClass":"date","parentCode":"childSvedClone"},
"stat_child":{"widgetClass":"dictionary","dictionaryCode":"03_STAT_CHILD_64219","parentCode":"childSvedClone"},
"vospitDocType":{"widgetClass":"plaintext","parentCode":"childSvedClone"},
"vospitNo":{"widgetClass":"plaintext","parentCode":"childSvedClone"},
"vospitData":{"widgetClass":"date","parentCode":"childSvedClone"},
"vospitData_ZS":{"widgetClass":"date","parentCode":"childSvedClone"},
"vospitFrom":{"widgetClass":"plaintext","parentCode":"childSvedClone"},
"otherAddress":{"formElementId":"otherAddress", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>
<#assign fileloadElements = {
"identityDocLoad":{},
"dovDovLoad":{},
"dovPasLoad":{},
"vospitDocLoad":{},
"sberKnigDocLoad":{}
}/>

<@requestPattern.makeSoapRequest
owner=stateOrgCode
departmentCode=stateOrgCode
formElements=formElements
fileloadElements=fileloadElements
applicantAttributes= {"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>