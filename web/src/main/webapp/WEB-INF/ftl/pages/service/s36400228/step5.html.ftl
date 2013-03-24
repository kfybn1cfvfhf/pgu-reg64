<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../utils.ftl" as utils>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства о браке'>
    <@birthDatePlusNUntilNow.preHead/>
	<@script.scripttag>
        <@birthDatePlusNUntilNow.preScript/>
		<@jquery.onready>
        <@fioFields.controllCase 'husband_last_name_before' 'husband_first_name' 'husband_middle_name'/>
        <@fioFields.controllCase 'wife_last_name_before' 'wife_first_name' 'wife_middle_name'/>

		    <@utils.pguCyrillicNumberValidator/>
        <@birthDatePlusNUntilNow.onReady/>
        <@birthDatePlusNUntilNow.applyCustomValidation inputid='merried_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'merried_doc_date', '14'"} attrMessages=""/>

        </@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>
<@sf.serviceStepForm>

<@sf.fldrow >
    <@spring.formHiddenInput path="form.declarant_birthdate"/>
</@sf.fldrow>


	<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Муж" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="16"/>
	<@sf.label fieldset=true title="Жена" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="15"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.husband_last_name_before" title="Фамилия до брака" required=true style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.husband_last_name_before" attr='maxlength="40"' qtip="" validation="cyrillic required" style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="4"/>
	<@sf.label path="form.wife_last_name_before" title="Фамилия до брака" required=true style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.wife_last_name_before" attr='maxlength="40"' qtip="" validation="cyrillic required" style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.husband_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.husband_first_name" attr='maxlength="20"' qtip="" validation="cyrillic required" style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="4"/>
	<@sf.label path="form.wife_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.wife_first_name" attr='maxlength="20"' qtip="" validation="cyrillic required" style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.husband_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.husband_middle_name" attr='maxlength="20"' qtip="" validation="cyrillic" style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="4"/>
	<@sf.label path="form.wife_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.wife_middle_name" attr='maxlength="20"' qtip="" validation="cyrillic" style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Документ о браке" required=false style="text-align:left;" colspan="44"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.merried_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.merried_doc_num" qtip="" validation="regexp maxlength" attr='maxlength="20"' validationattr={'maxlength':'200', 'regexp':'/^[0-9]+$/'} validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="4"/>
	<@sf.label path="form.merried_doc_source" title="Место регистрации" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>
	<@sf.textarea  path="form.merried_doc_source" validation="regexp maxlength" attr='maxlength="20"' validationattr={'maxlength':'20', 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} qtip=""  style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.merried_doc_date" title="Дата" required=false style="text-align:right;" colspan="8"/>
	<@sf.empty colspan="1"/>																				<#-- не больше-->
	<@sf.datefield path="form.merried_doc_date"  qtip="" maxDate="${currentDate?string('dd.MM.yyyy')}"  style="text-align:left;" colspan="11"/>
	<@sf.empty colspan="27"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	