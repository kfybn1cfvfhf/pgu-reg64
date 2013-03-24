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
    <@html.head title='Прием заявлений, постановка на учет и предоставление информации об организации оказания специализированной медицинской помощи в специализированных медицинских учреждениях'>
        <@script.scripttag>
            <@jquery.onready>
			<@customValidators.addCustomValidators />

                <@action.setVisibleByValue 'true' 'recipientIdentityDocType' 'change' 'recipientOtherDocTypeName' '5'/>
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

                    <@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.recipientSnils" title="СНИЛС:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.recipientSnils" qtip="" validation="required snils" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.recipientBirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>

<@sf.datefield path="form.recipientBirthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.recipientBirthPlace" title="Место рождения:" required=true style="text-align:left;" colspan="17"/>

<@sf.textarea path="form.recipientBirthPlace" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
               <@sf.fldrow>

<@sf.label path="form.recipientSex" title="Пол:" required=true style="text-align:left;" colspan="17"/>

<@sf.radiogroup path="form.recipientSex" staticOpts={'1':'Мужской','2':'Женский'} validation="required" qtip="" colspan="15"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.recipientpoliticalNationality" title="Гражданство:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.recipientpoliticalNationality" dictionaryCode="64_POLITICAL_NATIONALITY_64065" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- блок: statAddressRegAppl-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации лица, лица, имеющего право на получение услуги</h2></@sf.statictext>
					
                </@sf.fldrow>
				
               <@address.block_country_form fieldsMap=fieldsMap country='recipientaddressCountry' countryCode='recipientAddressCountryCode' input='recipientaddressEnterType' country_input='recipientAddressCountryInput'
                                       settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
                                       settlement_type='recipientaddressSettlementType' country_settlement='recipientAddressCountrySettlement' settlement='recipientaddressSettlementText' city='recipientaddressCity'
                                       street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.recipientIdentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup dictionaryCode="DUL_LS"  path="form.recipientIdentityDocType" qtip="" validation="required" style="text-align:left;" colspan="31"/>

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

						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа.
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientIdentityDocLoad" title="Документ, удостоверяющий личность лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientIdentityDocLoad" qtip="" style="text-align:left;" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
