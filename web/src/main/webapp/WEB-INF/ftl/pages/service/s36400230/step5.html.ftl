<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача&nbsp;электронной&nbsp;заявки&nbsp;на&nbsp;повторную&nbsp;выдачу&nbsp;свидетельства&nbsp;о&nbsp;расторжении&nbsp;брака'>
    <@birthDatePlusNUntilNow.preHead/>
	<@script.scripttag>
        <@birthDatePlusNUntilNow.preScript/>
		<@jquery.onready>
            <@birthDatePlusNUntilNow.onReady/>
            <@birthDatePlusNUntilNow.applyCustomValidation inputid='divorce_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'divorce_doc_date', '14'"} attrMessages=""/>
		    <@fioFields.controllCase 'he_first_name' 'he_last_name_husband' 'he_middle_name'/>
            <@fioFields.controllCase 'she_first_name' 'she_last_name_wife' 'she_middle_name'/>
		</@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>
<@sf.serviceStepForm >

<@sf.fldrow class="fieldHidden">
    <@spring.formHiddenInput path="form.declarant_birthdate"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Он" required=false style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="12"/>
	<@sf.label fieldset=true title="Она" required=false style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="12"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label path="form.he_last_name_husband" title="Фамилия&nbsp;до&nbsp;расторжения&nbsp;брака" required=true style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield  attr='maxlength="40"' path="form.he_last_name_husband" qtip="" validation="required cyrillic maxlength" validationattr={"maxlength":40} style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="2"/>
		<@sf.label path="form.she_last_name_wife" title="Фамилия&nbsp;до&nbsp;расторжения&nbsp;брака" required=true style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield  attr='maxlength="40"' path="form.she_last_name_wife" qtip="" validation="required cyrillic maxlength" validationattr={"maxlength":40} style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="2"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label path="form.he_first_name" title="Имя" required=true style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield  attr='maxlength="20"' path="form.he_first_name" qtip="" validation="required cyrillic maxlength" validationattr={"maxlength":20} style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="2"/>
		<@sf.label path="form.she_first_name" title="Имя" required=true style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield attr='maxlength="20"' path="form.she_first_name" qtip="" validation="required cyrillic maxlength" validationattr={"maxlength":20} style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="2"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label path="form.he_middle_name" title="Отчество" required=false style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield attr='maxlength="20"' path="form.he_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":40} style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="2"/>
		<@sf.label path="form.she_middle_name" title="Отчество" required=false style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield attr='maxlength="20"' path="form.she_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":40} style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="2"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label fieldset=true title="Документ&nbsp;о&nbsp;расторжении&nbsp;брака" required=false style="text-align:left;" colspan="44"/>
		<@sf.empty colspan="4"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label path="form.divorce_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textfield  path="form.divorce_doc_num" qtip="" validation="regexp" validationattr={'regexp':'/^[0-9]+$/'} validationMessage={"regexp":"Допустим ввод цифр"} attr="maxlength='20'" style="text-align:unknown;" colspan="9"/>
        <@sf.empty colspan="26"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label path="form.divorce_doc_source" title="Место&nbsp;регистрации" required=false style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.textarea  path="form.divorce_doc_source" qtip="" validation="regexp" validationattr={'regexp':'/^[\\|\\"А-Яа-я0-9\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|.,"} attr="maxlength='200'" style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="26"/>
</@sf.fldrow>

<@sf.fldrow>
		<@sf.empty colspan="1"/>
		<@sf.label path="form.divorce_doc_date" title="Дата" required=false style="text-align:right;" colspan="12"/>
		<@sf.empty colspan="1"/>
		<@sf.datefield path="form.divorce_doc_date" validation="relativedays" validationattr={"relativedays":"'<=', 0"} maxDate="${currentDate?string('dd.MM.yyyy')}" minDate="${form.start_date?string('dd.MM.yyyy')}" qtip=""  style="text-align:unknown;" colspan="9"/>
		<@sf.empty colspan="26"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..48 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	