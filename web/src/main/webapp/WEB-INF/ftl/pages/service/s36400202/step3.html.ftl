<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выплата пособия по беременности и родам, единовременного пособия женщинам, вставшим на учет в медицинских учреждениях в ранние сроки беременности'>
        <@script.scripttag>
            function foreignerDocLoadCheck() {
                if(($('#recipientpoliticalNationality').attr('value') == '2') || ($('#recipientpoliticalNationality').attr('value') == '3')) {
                    $('.recForeignerDocLoad').show();
                    $('.recResidenceDocLoad').show();
                } else {
                    $('.recForeignerDocLoad').hide();
                    $('.recResidenceDocLoad').hide();
                }
            }
            var IdentityDocTypeCurrentValue = '';
            function identityDocTypeChenge () {
                if(IdentityDocTypeCurrentValue != $('#recipientIdentityDocType').attr('value')) {
                    $('#recipientOtherDocTypeName').attr('value','');
                    $('#recipientPassSeria').attr('value', '');
                    $('#recipientPassNo').attr('value','');
                    $('#recipientPassFrom').attr('value','');
                    $('#recipientPassDate').attr('value','');
                }
                IdentityDocTypeCurrentValue = $('#recipientIdentityDocType').attr('value');
            }

            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.setVisibleByValue 'true' 'recipientIentityDocType' 'change' 'recipientOtherDocTypeName' '5'/>
                 <@action.unsetRequiredByField 'true' 'recipientIentityDocType' 'change' 'recipientPassSeria' '2,5'/>
                 <@action.applyValidationIf 'true' 'recipientIentityDocType' 'change' 'recipientPassSeria' '1' 'digitsexact' '4'/>
                 <@action.applyValidationIf onload='true' srcid='recipientIentityDocType' event='change' destid='recipientPassSeria' value='3' rules='invaluelist'
                     validationAttr={"invaluelist":"80,81,82,83"}
                     validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                 <@action.applyValidationIf 'true' 'recipientIentityDocType' 'change' 'recipientPassNo' '1' 'digitsexact' '6'/>
                 <@action.applyValidationIf 'true' 'recipientIentityDocType' 'change' 'recipientPassNo' '2,3' 'digitsexact' '7'/>
                 $('#recipientpoliticalNationality').change(function () {foreignerDocLoadCheck();}).change();
                <@action.setVisibleByValue 'true' 'recipientpoliticalNationality' 'change' 'recRefugeeDocLoad' '4'/>
                <@action.setVisibleByValue 'true' 'recipientpoliticalNationality' 'change' 'recRefugeeDocLoad-label' '4'/>
                $('#identityDocType').change(function () {identityDocTypeChenge();});
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о лице, нуждающемся в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.recipientBirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
						<@sf.datefield path="form.recipientBirthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.recipientpoliticalNationality" title="Гражданство:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.dictionaryLookup path="form.recipientpoliticalNationality" dictionaryCode="64_CITIZENSHIP_REFUGEE_64202" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации по месту жительства  лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@address.block_country_form fieldsMap=fieldsMap country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType' country_input='recipientaddressCountryInput'
                                   settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
                                   settlement_type='recipientaddressSettlementType' country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressaettlementText' city='recipientaddressCity'
                                   street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о фактическом месте проживания  лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>
					
                <@address.block_country_form fieldsMap=fieldsMap country='recFactAddressCountry' countryCode='recFactAddressCountryCode' input='recFactAddressEnterType' country_input='recFactAddressCountryInput'
                                                    settlementRF='recFactAddressSettlementDict' streetRF='recFactAddressStreetDict' area='recFactAddressRayon' region='recFactAddressRegion'
                                                    settlement_type='recFactAddressSettlementType' country_settlement='recFactAddressCountrySettlement' settlement='recFactAddressSettlementText' city='recFactAddressCity'
                                                    street='recFactAddressStreetText' house='recFactAddressHouse' corp='recFactAddressKorpus' flat='recFactAddressFlat' post="recFactAddressIndex"  />

                <@sf.fldrow>
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации лица, нуждающегося в услуге, по месту пребывания</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap country='addressRecRegCountry' countryCode='addressRecRegCountryCode' input='addressRecRegEnterType' country_input='addressRecRegCountryInput'
                                   settlementRF='addressRecRegSettlementDict' streetRF='addressRecRegStreetDict' area='addressRecRegRayon' region='addressRecRegRegion'
                                   settlement_type='addressRecRegSettlementType' country_settlement='addressRecRegCountrySettlement' settlement='addressRecRegSettlementText' city='addressRecRegCity'
                                   street='addressRecRegStreetText' house='addressRecRegHouse' corp='addressRecRegKorpus' flat='addressRecRegFlat' post="addressRecRegIndex"  />

                <@sf.fldrow>
                        <@sf.label path="form.addressRecRegSrok" title="Срок регистрации:" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.addressRecRegSrok" qtip="" validation="" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientIentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.recipientIentityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientOtherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientOtherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientPassSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientPassNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.recipientPassDate"  qtip="" validation="required" style="text-align:left;" colspan="7"/>
				    <@sf.empty colspan="24"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.recipientPassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.recipientPassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.recipientIdentityDocLoad" title="Документ, удостоверяющий личность лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.recipientIdentityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="recForeignerDocLoad">
                        <@sf.label path="form.doc1" title="Копия разрешения на временное проживание по состоянию на 31 декабря 2006 года – для иностранных граждан и лиц без гражданства, временно проживающих на территории Российской Федерации:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="recForeignerDocLoad">
                        <@sf.fileload path="form.doc1" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Представляется в случае, если лицо, нуждающееся в услуге является иностранным гражданином или лицом без гражданства, временно проживающим на территории Российской Федерации" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="recResidenceDocLoad">
                        <@sf.label path="form.recResidenceDocLoad" title="Вид на жительство:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="recResidenceDocLoad">
                        <@sf.fileload path="form.recResidenceDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Представляется в случае, если лицо, нуждающееся в услуге является иностранным гражданином или лицом без гражданства, постоянно проживающим на территории Российской Федерации" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="recRefugeeDocLoad">
                        <@sf.label path="form.recRefugeeDocLoad" title="Удостоверение беженца:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="recRefugeeDocLoad">
                        <@sf.fileload path="form.recRefugeeDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
