<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as addressmacro>

<#import "/custom/servicerequest/adapters/mfc/requestpattern.ftl" as requestPattern>
<#import "/custom/servicerequest/adapters/mfc/soapelements.ftl" as servicerequestAdapter>
<#import "/custom/servicerequest/adapters/mfc/applicantattributes.ftl" as applicantattributesAdapter>
<#import "/custom/servicerequest/common.ftl" as commonServiceRequestSoapPatterns>


<#macro addressSoapParametr param={}>
    <#if param.prefix?has_content >
        <#assign prefix = param.prefix />
        <@addressmacro.addressSoap label='${prefix}Address' applicant=false country='${prefix}AddressCountry' countryCode='${prefix}AddressCountryCode' input='${prefix}AddressEnterType' country_input='${prefix}AddressCountryInput'
       settlementRF='${prefix}AddressSettlementDict' streetRF='${prefix}AddressStreetDict' area='${prefix}AddressRayon' region='${prefix}AddressRegion'
       settlement_type='${prefix}AddressSettlementType' country_settlement='${prefix}AddressCountrySettlement' settlement='${prefix}AddressSettlementText' city='${prefix}AddressCity'
       street='${prefix}AddressStreetText' house='${prefix}AddressHouse' corp='${prefix}AddressKorpus' flat='${prefix}AddressFlat' post="${prefix}AddressIndex"/>
    <#else>
        <@addressmacro.addressSoap label='address' applicant=true country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                           settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                           settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                           street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"/>
    </#if>
</#macro>

<#macro factAddressSoapParametr param={}>
    <#if param.prefix?has_content >
        <#assign prefix = param.prefix />
        <@addressMacros.addressSoap label='${prefix}FactAddress' applicant=false country='${prefix}FactAddressCountry' countryCode='${prefix}FactAddressCountryCode' input='${prefix}FactAddressEnterType' country_input='${prefix}FactAddressCountryInput'
            settlementRF='${prefix}FactAddressSettlementDict' streetRF='${prefix}FactAddressStreetDict' area='${prefix}FactAddressRayon' region='${prefix}FactAddressRegion'
            settlement_type='${prefix}FactAddressSettlementType' country_settlement='${prefix}FactAddressCountrySettlement' settlement='${prefix}FactAddressSettlementText' city='${prefix}FactAddressCity'
            street='${prefix}FactAddressStreetText' house='${prefix}FactAddressHouse' corp='${prefix}FactAddressKorpus' flat='${prefix}FactAddressFlat' post="${prefix}FactAddressIndex"/>
    <#else>
        <@addressMacros.addressSoap label='factAddress' applicant=true country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
            settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
            settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
            street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"/>
    </#if>
</#macro>

<#macro addressPostSoapParametr param={}>
    <#if param.prefix?has_content >
        <#assign prefix = param.prefix />
        <@addressmacro.addressSoap label='${prefix}AddressPost' applicant=false country='${prefix}AddressPostCountry' countryCode='${prefix}AddressPostCountryCode' input='${prefix}AddressPostEnterType' country_input='${prefix}AddressPostCountryInput'
       settlementRF='${prefix}AddressPostSettlementDict' streetRF='${prefix}AddressPostStreetDict' area='${prefix}AddressPostRayon' region='${prefix}AddressPostRegion'
       settlement_type='${prefix}AddressPostSettlementType' country_settlement='${prefix}AddressPostCountrySettlement' settlement='${prefix}AddressPostSettlementText' city='${prefix}AddressPostCity'
       street='${prefix}AddressPostStreetText' house='${prefix}AddressPostHouse' corp='${prefix}AddressPostKorpus' flat='${prefix}AddressPostFlat' post="${prefix}AddressPostIndex"/>
    <#else>
        <@addressmacro.addressSoap label='addressPost' applicant=false country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
                       settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
                       settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                       street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"/>
    </#if>
</#macro>
<#--
<#macro identityDocTypeSoap fieldvalue prefix>
    <#if fieldvalue?has_content>
        <#switch fieldvalue>
            <#case "1">
            <#case "2">
            <#case "3">
            <#case "4">
                <#global formElements = formElements +{"${prefix}IdentityDocType":{"formElementId":"${prefix}IdentityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}}/>
            <#break >
            <#default>
                <#global formElements = formElements +{"${prefix}IdentityDocType":{"widgetClass":"plaintext"}} />
        </#switch>
        <#global formElements = formElements +{
        "${prefix}PassSeria":{"widgetClass":"plaintext"},
        "${prefix}PassNo":{"widgetClass":"plaintext"},
        "${prefix}PassDate":{"widgetClass":"date"},
        "${prefix}PassFrom":{"widgetClass":"plaintext"}
        } />
    </#if>
</#macro>
-->

<#macro identityDocTypeSoap prefix>
    <#if form[prefix+'IdentityDocType']??>

        <#switch form[prefix+'IdentityDocType']>
            <#case "1">
            <#case "2">
            <#case "3">
            <#case "4">
                <#global formElements = formElements +{"${prefix}IdentityDocType":{"formElementId":"${prefix}IdentityDocType","widgetClass":"dictionary", "dictionaryCode":"DUL_LS"}}/>
            <#break >
            <#default>
                <#global formElements = formElements +{"${prefix}IdentityDocType":{"widgetClass":"plaintext"}} />
        </#switch>
        <#global formElements = formElements +{
        "${prefix}PassSeria":{"widgetClass":"plaintext"},
        "${prefix}PassNo":{"widgetClass":"plaintext"},
        "${prefix}PassDate":{"widgetClass":"date"},
        "${prefix}PassFrom":{"widgetClass":"plaintext"}
        } />

    </#if>
</#macro>


<#macro address param={} >
    <#if param.prefix?has_content >
        <#assign prefix = param.prefix />
        <@addressmacro.block_country_form fieldsMap=fieldsMap country='${prefix}AddressCountry' countryCode='${prefix}AddressCountryCode' input='${prefix}AddressEnterType' country_input='${prefix}AddressCountryInput'
       settlementRF='${prefix}AddressSettlementDict' streetRF='${prefix}AddressStreetDict' area='${prefix}AddressRayon' region='${prefix}AddressRegion'
       settlement_type='${prefix}AddressSettlementType' country_settlement='${prefix}AddressCountrySettlement' settlement='${prefix}AddressSettlementText' city='${prefix}AddressCity'
       street='${prefix}AddressStreetText' house='${prefix}AddressHouse' corp='${prefix}AddressKorpus' flat='${prefix}AddressFlat' post="${prefix}AddressIndex"  />
    <#else >
    <@addressmacro.block_country_form fieldsMap=fieldsMap country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
               settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
               settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
               street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />
    </#if>

</#macro>

<#macro factAddress param={} >
    <#if param.prefix?has_content >
        <#assign prefix = param.prefix />
            <@addressmacro.block_country_form fieldsMap=fieldsMap country='${prefix}FactAddressCountry' countryCode='${prefix}FactAddressCountryCode' input='${prefix}FactAddressEnterType' country_input='${prefix}FactAddressCountryInput'
            settlementRF='${prefix}FactAddressSettlementDict' streetRF='${prefix}FactAddressStreetDict' area='${prefix}FactAddressRayon' region='${prefix}FactAddressRegion'
            settlement_type='${prefix}FactAddressSettlementType' country_settlement='${prefix}FactAddressCountrySettlement' settlement='${prefix}FactAddressSettlementText' city='${prefix}FactAddressCity'
            street='${prefix}FactAddressStreetText' house='${prefix}FactAddressHouse' corp='${prefix}FactAddressKorpus' flat='${prefix}FactAddressFlat' post="${prefix}FactAddressIndex"  />
        <#else >
            <@addressmacro.block_country_form fieldsMap=fieldsMap country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
            settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
            settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
            street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />
    </#if>
</#macro>

<#macro addressPost param={} >
    <#if param.prefix?has_content >
        <#assign prefix = param.prefix />
        <@addressmacro.block_country_form fieldsMap=fieldsMap country='${prefix}AddressPostCountry' countryCode='${prefix}AddressPostCountryCode' input='${prefix}AddressPostEnterType' country_input='${prefix}AddressPostCountryInput'
       settlementRF='${prefix}AddressPostSettlementDict' streetRF='${prefix}AddressPostStreetDict' area='${prefix}AddressPostRayon' region='${prefix}AddressPostRegion'
       settlement_type='${prefix}AddressPostSettlementType' country_settlement='${prefix}AddressPostCountrySettlement' settlement='${prefix}AddressPostSettlementText' city='${prefix}AddressPostCity'
       street='${prefix}AddressPostStreetText' house='${prefix}AddressPostHouse' corp='${prefix}AddressPostKorpus' flat='${prefix}AddressPostFlat' post="${prefix}AddressPostIndex"  />
    <#else >
        <@addressmacro.block_country_form fieldsMap=fieldsMap country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
        settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
        settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
        street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
    </#if>
</#macro>

<#macro defaultdulblock param={}>

    <#if param.filelabel?has_content>
        <#assign filelabel = param.filelabel />
    <#else >
         <#assign filelabel = "Документ, удостоверяющий личность заявителя:"/>
    </#if>

    <#if param.prefix?has_content>

        <#assign prefix = param.prefix />

        <@script.scripttag>
            var IdentityDocTypeCurrentValue = '';
            function identityDocTypeChenge () {
                if(IdentityDocTypeCurrentValue != $('#${prefix}IdentityDocType').attr('value')) {
                    $('#${prefix}OtherDocTypeName').attr('value','');
                    $('#${prefix}PassSeria').attr('value', '');
                    $('#${prefix}PassNo').attr('value','');
                    $('#${prefix}PassFrom').attr('value','');
                    $('#${prefix}PassDate').attr('value','');
                }
                IdentityDocTypeCurrentValue = $('#${prefix}IdentityDocType').attr('value');
            }

            <@jquery.onready>
            <@action.setVisibleByValue 'true' '${prefix}IdentityDocType' 'change' '${prefix}OtherDocTypeName' '5'/>
             <@action.unsetRequiredByField 'true' '${prefix}IdentityDocType' 'change' '${prefix}PassSeria' '2,5'/>
             <@action.applyValidationIf 'true' '${prefix}IdentityDocType' 'change' '${prefix}PassSeria' '1' 'digitsexact' '4'/>
            <@action.applyValidationIf onload='true' srcid='${prefix}IdentityDocType' event='change' destid='${prefix}PassSeria' value='3' rules='invaluelist'
                 validationAttr={"invaluelist":"80,81,82,83"}
                 validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
             <@action.applyValidationIf 'true' '${prefix}IdentityDocType' 'change' '${prefix}PassNo' '1' 'digitsexact' '6'/>
             <@action.applyValidationIf 'true' '${prefix}IdentityDocType' 'change' '${prefix}PassNo' '2,3' 'digitsexact' '7'/>
            $('#${prefix}IdentityDocType').change(function () {identityDocTypeChenge();});
            </@jquery.onready>
        </@script.scripttag>

        <@sf.fldrow>
            <@sf.label path="form.${prefix}IdentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
            <@sf.dictionaryLookup path="form.${prefix}IdentityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.label path="form.${prefix}OtherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
            <@sf.textfield  path="form.${prefix}OtherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.label path="form.${prefix}PassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
            <@sf.textfield  path="form.${prefix}PassSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.label path="form.${prefix}PassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
            <@sf.textfield  path="form.${prefix}PassNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.label path="form.${prefix}PassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
            <@sf.datefield path="form.${prefix}PassDate"  qtip="" validation="required" style="text-align:left;" colspan="7"/>
            <@sf.empty colspan="24"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.label path="form.${prefix}PassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
            <@sf.textarea path="form.${prefix}PassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
        </@sf.fldrow>

        <@sf.fldrow>
                <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
        </@sf.fldrow>

        <@sf.fldrow>
                <@sf.label path="form.${prefix}IdentityDocLoad" title="${filelabel}" required=true style="text-align:left;" colspan="48"/>
        </@sf.fldrow><@sf.fldrow>
                <@sf.fileload path="form.${prefix}IdentityDocLoad" fileExtensions='pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods' validation="required" qtip="" style="text-align:left;" colspan="48"/>
        </@sf.fldrow>

    <#else>

        <@script.scripttag>
        var IdentityDocTypeCurrentValue = '';
        function identityDocTypeChenge () {
            if(IdentityDocTypeCurrentValue != $('#identityDocType').attr('value')) {
                $('#otherDocTypeName').attr('value','');
                $('#passSeria').attr('value', '');
                $('#passNo').attr('value','');
                $('#passFrom').attr('value','');
                $('#passDate').attr('value','');
            }
            IdentityDocTypeCurrentValue = $('#identityDocType').attr('value');
        }

            <@jquery.onready>
                <@action.setVisibleByValue 'true' 'identityDocType' 'change' 'otherDocTypeName' '5'/>
                 <@action.unsetRequiredByField 'true' 'identityDocType' 'change' 'passSeria' '2,5'/>
                 <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passSeria' '1' 'digitsexact' '4'/>
                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passSeria' value='3' rules='invaluelist'
                     validationAttr={"invaluelist":"80,81,82,83"}
                     validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                 <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '1' 'digitsexact' '6'/>
                 <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '2,3' 'digitsexact' '7'/>
                $('#identityDocType').change(function () {identityDocTypeChenge();});
            </@jquery.onready>
        </@script.scripttag>

            <@sf.fldrow>
                <@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                <@sf.dictionaryLookup path="form.identityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>

            <@sf.fldrow>
                <@sf.label path="form.otherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                <@sf.textfield  path="form.otherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>

            <@sf.fldrow>
                <@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
                <@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>

            <@sf.fldrow>
                <@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
                <@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>

            <@sf.fldrow>
                <@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
                <@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="7"/>
                <@sf.empty colspan="24"/>
            </@sf.fldrow>

            <@sf.fldrow>
                <@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
                <@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                        <@sf.label path="form.identityDocLoad" title="${filelabel}" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow><@sf.fldrow>
                        <@sf.fileload path="form.identityDocLoad" fileExtensions='pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods' validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

    </#if>
</#macro>