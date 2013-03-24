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

    <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                           settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                           settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

    <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                           settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                           settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                           street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

</#assign>

<#assign otherSoapPart>

</#assign>



<#assign formElements = {
           "lastName":{"widgetClass":"plaintext"},
           "firstName":{"widgetClass":"plaintext"},
           "middleName":{"widgetClass":"plaintext"},
           "applChild":{"widgetClass":"dictionary", "dictionaryCode":"64_APPLICANT_CHILD_64053"},
           "applCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_APPLICANT_CATEGORY_64053"},
           "birthdateAppl":{"widgetClass":"date"},
           "placeJob":{"widgetClass":"plaintext"},
           "phone":{"widgetClass":"plaintext"},
           "email":{"widgetClass":"plaintext"},
           "passSeria":{"widgetClass":"plaintext"},
           "passNo":{"widgetClass":"plaintext"},
           "passDate":{"widgetClass":"date"},
           "passFrom":{"widgetClass":"plaintext"},
           "recipientLastName":{"widgetClass":"plaintext"},
           "recipientFirstName":{"widgetClass":"plaintext"},
           "recipientBirthDate":{"widgetClass":"date"},
           "recipientStatus":{"widgetClass":"dictionary", "dictionaryCode":"64_RECIPIENT_STATUS_64053"},
           "recipientIdentityDocType":{"widgetClass":"plaintext"},
           "recipientPassSeria":{"widgetClass":"plaintext"},
           "recipientPassNo":{"widgetClass":"plaintext"},
           "recipientPassDate":{"widgetClass":"date"},
           "recipientPassFrom":{"widgetClass":"plaintext"},
           "family":{"widgetClass":"virtualParent", "cloneQuantity":(form.familyLastName?size)!0},
           "familyLastName":{"widgetClass":"plaintext", "parentCode":"family"},
           "familyFirstName":{"widgetClass":"plaintext", "parentCode":"family"},
           "familyMiddleName":{"widgetClass":"plaintext", "parentCode":"family"},
           "familyBirthDate":{"widgetClass":"date", "parentCode":"family"},
           "familyStatus":{"widgetClass":"dictionary", "dictionaryCode":"64_FAMILY_STATUS_64053", "parentCode":"family"},
           "familyCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_APPLICANT_CATEGORY_64053", "parentCode":"family"},
           "familyPlaceJob":{"widgetClass":"plaintext", "parentCode":"family"},
           "commitment":{"widgetClass":"boolean"},
           "organizationRecreation":{"widgetClass":"dictionary", "dictionaryCode":"64_ORGANIZATION_RECREATION_64053"},
           "seasonRecovery":{"widgetClass":"dictionary", "dictionaryCode":"64_SEASON_RECOVERY_64053"},
           "landAvailability":{"widgetClass":"plaintext"},
           "beesAvailability":{"widgetClass":"plaintext"},
           "livestockAvailability":{"widgetClass":"plaintext"},
           "pigsAvailability":{"widgetClass":"plaintext"},
           "sheepAvailability":{"widgetClass":"plaintext"},
           "chickensAvailability":{"widgetClass":"plaintext"},
           "livestockMeat":{"widgetClass":"plaintext"},
           "pigsMeat":{"widgetClass":"plaintext"},
           "sheepMeat":{"widgetClass":"plaintext"},
           "chickensMeat":{"widgetClass":"plaintext"},
           "milk":{"widgetClass":"plaintext"},
           "honey":{"widgetClass":"plaintext"},
           "potatoes":{"widgetClass":"plaintext"},
           "chickenEggs":{"widgetClass":"plaintext"},
           "dopSvedFamily":{"widgetClass":"plaintext"},
           "socialSupport":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"}
}/>

<#assign fileloadElements = {
    "dovDovLoad":{},
    "dovPasLoad":{},
    "identityDocLoad":{},
    "dovOpekLoad":{},
    "guardianDocMoneyLoad":{},
    "recipientDangerDocLoad":{},
    "recipientWarDocLoad":{},
    "recipientProvisionDocLoad":{},
    "recipientInvalidDocLoad":{},
    "recipientIdentityDocLoad":{},
    "familyRentDocLoad":{},
    "familyPensionDocLoad":{}
 }/>



<@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
/>


