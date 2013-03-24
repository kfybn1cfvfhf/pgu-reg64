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

<#if form.rec_addressCity?has_content || form.rec_addressSettlementDict?has_content>

                 <@addressMacros.addressSoap label='rec_address' applicant=false
                country='rec_addressCountry' countryCode='rec_AddressCountryCode' input='rec_addressEnterType'
                country_input='rec_AddressCountryInput' settlementRF='rec_addressSettlementDict' streetRF='rec_addressStreetDict'
                area='rec_addressRayon' region='rec_addressRegion' settlement_type='rec_addressSettlementType'
                country_settlement='rec_AddressCountrySettlement' settlement='rec_addressSettlementText' city='rec_addressCity'
                street='rec_addressStreetText' house='rec_addressHouse' corp='rec_addressKorpus' flat='rec_addressFlat' post="rec_addressIndex" />

</#if>

<#if form.rec_factAddressCity?has_content || form.rec_factAddressSettlementDict?has_content>

<@addressMacros.addressSoap label='rec_factAddress' applicant=false
                country='rec_factAddressCountry' countryCode='rec_factAddressCountryCode' input='rec_factAddressEnterType'
                country_input='rec_factAddressCountryInput' settlementRF='rec_factAddressSettlementDict' streetRF='rec_factAddressStreetDict'
                area='rec_factAddressRayon' region='rec_factAddressRegion' settlement_type='rec_factAddressSettlementType'
                country_settlement='rec_factAddressCountrySettlement' settlement='rec_factAddressSettlementText' city='rec_factAddressCity'
                street='rec_factAddressStreetText' house='rec_factAddressHouse' corp='rec_factAddressKorpus' flat='rec_factAddressFlat' post="rec_factAddressIndex"  />

</#if>

</#assign>

<#assign formElements = {
    "dov_enable":{"widgetClass":"boolean"},
    "incapable_enable":{"widgetClass":"boolean"},
    "dovCategory":{"widgetClass":"dictionary", "dictionaryCode":"64_DOV_CATEGORY_64206"},
    "recipientLastName":{"widgetClass":"plaintext"},
    "recipientFirstName":{"widgetClass":"plaintext"},
    "recipientMiddleName":{"widgetClass":"plaintext"},
    "recipientPhone":{"widgetClass":"plaintext"},
    "recipientEmail":{"widgetClass":"plaintext"},
    "recipientPassSeria":{"widgetClass":"plaintext"},
    "recipientPassNo":{"widgetClass":"plaintext"},
    "recipientPassDate":{"widgetClass":"date"},
    "recipientPassFrom":{"widgetClass":"plaintext"},
    "wayBenefit":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_DELIVERY_BENEFIT_64"},
    "addressBenefit":{"widgetClass":"plaintext"},
    "nameBankBenefit":{"widgetClass":"plaintext"},
    "filialBankBenefit":{"widgetClass":"plaintext"},
    "bikBankBenefit":{"widgetClass":"plaintext"},
    "corrAccBankBenefit":{"widgetClass":"plaintext"},
    "codeFilialBankBenefit":{"widgetClass":"plaintext"},
    "clientAccBankBenefit":{"widgetClass":"plaintext"},
    "org_soc":{"widgetClass":"dictionary", "dictionaryCode":"64_SOCIAL_SUPPORT_64053"},
    "wayService":{"widgetClass":"dictionary", "dictionaryCode":"03_METHOD_BENEFIT_64"},
    "noTrudKnig":{"widgetClass":"boolean"},
    "pens":{"widgetClass":"boolean"},
    "noCentrOtoplen":{"widgetClass":"boolean"},
    "socRab":{"widgetClass":"boolean"},
    "agree":{"widgetClass":"boolean"},
    "rec_address":{"formElementId":"rec_address", "widgetClass":"address", "addressSoap":otherSoapPart}
}/>

<#assign applicantSoap>

<#if form.addressCity?has_content || form.addressSettlementDict?has_content>
   <@addressMacros.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                           settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                           settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>

</#if>

<#if form.factAddressCity?has_content || form.factAddressSettlementDict?has_content>

<@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                       settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                       settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                       street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex" />

</#if>
</#assign>



<#assign fileloadElements = {
    "identityDocLoad":{},
    "dovDovLoad":{},
    "dovPasLoad":{},
    "dovOpekLoad":{},
    "recipientIdentityDocLoad":{},
    "svidRegDocLoad":{},
    "trudKnigDocLoad":{},
    "sprTrudDocLoad":{},
    "sostFamilyDocLoad":{},
    "pensDocLoad":{},
    "pechDocLoad":{},
    "techPaspDocLoad":{},
    "trudDogDocLoad":{},
    "sprSocRabDocLoad":{}
}/>


    <@requestPattern.makeSoapRequest
    owner=stateOrgCode
    departmentCode=stateOrgCode
    formElements=formElements
    fileloadElements=fileloadElements
    applicantAttributes={"address":{"formElementId":"address", "widgetClass":"address", "addressSoap":applicantSoap}}
    />
