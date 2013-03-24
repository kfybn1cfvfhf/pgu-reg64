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
                if(($('#politicalNationality').attr('value') == '2') || ($('#politicalNationality').attr('value') == '3')) {
                    $('.foreignerDocLoad').show();
                    $('.residenceDocLoad').show();
                } else {
                    $('.foreignerDocLoad').hide();
                    $('.residenceDocLoad').hide();
                }
            }
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
			    <@customValidators.addCustomValidators />
                <@action.setVisibleByValue 'true' 'identityDocType' 'change' 'otherDocTypeName' '5'/>
                 <@action.unsetRequiredByField 'true' 'identityDocType' 'change' 'passSeria' '2,5'/>
                 <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passSeria' '1' 'digitsexact' '4'/>
                 <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passSeria' value='3' rules='invaluelist'
                     validationAttr={"invaluelist":"80,81,82,83"}
                     validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                 <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '1' 'digitsexact' '6'/>
                 <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '2,3' 'digitsexact' '7'/>
                 $('#politicalNationality').change(function () {foreignerDocLoadCheck();}).change();
                <@action.setVisibleByValue 'true' 'politicalNationality' 'change' 'refugeeDocLoad' '4'/>
                <@action.setVisibleByValue 'true' 'politicalNationality' 'change' 'refugeeDocLoad-label' '4'/>
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
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="true"' wrapperClass='fieldDisabled'  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.birthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.birthdate"  qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующее поле заполняется заявителем</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.politicalNationality" title="Гражданство:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.politicalNationality" dictionaryCode="64_CITIZENSHIP_REFUGEE_64202" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале. Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты заявителя</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.phone" title="Контактный телефон:" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации заявителя по месту жительства </h2></@sf.statictext>
                </@sf.fldrow>

            <@address.block_country_form fieldsMap=fieldsMap country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                   settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                   settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                   street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />


                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о фактическом месте проживания заявителя </h2></@sf.statictext>
                </@sf.fldrow>

            <@address.block_country_form fieldsMap=fieldsMap country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                    settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                    settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                    street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />



                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации заявителя по месту пребывания</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap country='addressRegCountry' countryCode='addressRegCountryCode' input='addressRegEnterType' country_input='addressRegCountryInput'
                                   settlementRF='addressRegSettlementDict' streetRF='addressRegStreetDict' area='addressRegRayon' region='addressRegRegion'
                                   settlement_type='addressRegSettlementType' country_settlement='addressRegCountrySettlement' settlement='addressRegSettlementText' city='addressRegCity'
                                   street='addressRegStreetText' house='addressRegHouse' corp='addressRegKorpus' flat='addressRegFlat' post="addressRegIndex" />

                <@sf.fldrow>
                        <@sf.label path="form.addressRegSrok" title="Срок регистрации:" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.addressRegSrok" qtip="" validation="" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>
                </@sf.fldrow>
				
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
				
                <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext></@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.fileload path="form.identityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="foreignerDocLoad">
                    <@sf.label path="form.foreignerDocLoad" title="Копия разрешения на временное проживание по состоянию на 31 декабря 2006 года – для иностранных граждан и лиц без гражданства, временно проживающих на территории Российской Федерации:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="foreignerDocLoad">
                    <@sf.fileload path="form.foreignerDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Представляется в случае, если лицо, нуждающееся в услуге является иностранным гражданином или лицом без гражданства, временно проживающим на территории Российской Федерации" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="residenceDocLoad">
                    <@sf.label path="form.residenceDocLoad" title="Вид на жительство:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="residenceDocLoad">
                    <@sf.fileload path="form.residenceDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"  qtip="Представляется в случае, если лицо, нуждающееся в услуге является иностранным гражданином или лицом без гражданства, постоянно проживающим на территории Российской Федерации" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.refugeeDocLoad" title="Удостоверение беженца:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.fileload path="form.refugeeDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
