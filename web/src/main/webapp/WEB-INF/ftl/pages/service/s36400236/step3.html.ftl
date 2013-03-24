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
    <@html.head title='Предоставление социальных выплат за счет средств областного бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений, при реализации областных целевых программ'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.unsetRequiredByField 'true' 'recipientIdentityDocType' 'change' 'recipientPassSeria' '2,5'/>
                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassSeria' '1' 'digitsexact' '4'/>
                <@action.applyValidationIf onload='true' srcid='recipientIdentityDocType' event='change' destid='recipientPassSeria' value='3' rules='invaluelist'
                validationAttr={"invaluelist":"80,81,82,83"}
                validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassNo' '1' 'digitsexact' '6'/>
                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassNo' '2,3' 'digitsexact' '7'/>

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
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: phone (перекрыть)-->
<@sf.label path="form.recipientPhone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientPhone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="phone required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: email-->
<@sf.label path="form.recipientEmail" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientEmail" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- блок: statAddressPostAppl-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Почтовый адрес</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap country='recipientPostCountry' countryCode='recipientPostCountryCode' input='recipientPostEnterType' country_input='recipientPostCountryInput'
                settlementRF='recipientPostSettlementDict' streetRF='recipientPostStreetDict' area='recipientPostRayon' region='recipientPostRegion'
                settlement_type='recipientPostSettlementType' country_settlement='recipientPostCountrySettlement' settlement='recipientPostSettlementText' city='recipientPostCity'
                street='recipientPostStreetText' house='recipientPostHouse' corp='recipientPostKorpus' flat='recipientPostFlat' post="recipientPostIndex"  />

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о паспорте лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.recipientPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientPassSeria" qtip="" validation="required digitsexact" validationattr={"digitsexact":"4"} style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.recipientPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientPassNo" qtip="" validation="required digitsexact" validationattr={"digitsexact":"6"} style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.recipientPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
<@sf.datefield path="form.recipientPassDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.recipientPassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
<@sf.textarea path="form.recipientPassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientIdentityDocLoad" title="Паспорт получателя услуги:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientIdentityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
