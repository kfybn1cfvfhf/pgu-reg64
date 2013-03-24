<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customValidation/common.ftl" as commonValidation>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as switchableDeclarantDocumentDocType>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
	<@html.head title='Подача электронной заявки на выдачу свидетельства о смерти'>
        <@birthDatePlusNUntilNow.preHead/>
		<@localOrGlobalPassportSeries.preHead/>
		<@localOrGlobalPassportNumber.preHead/>
	<style type="text/css">
		.form-body {
			width: 100%;
		}
	</style>
		<@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
			<@localOrGlobalPassportSeries.preScript/>
			<@localOrGlobalPassportNumber.preScript/>
			<@jquery.onready>
                <@fioFields.controllCase 'declarant_first_name' 'declarant_last_name' 'declarant_middle_name'/>
				<@switchableDeclarantDocumentDocType.onReady/>
                <@birthDatePlusNUntilNow.onReady/>
				<@localOrGlobalPassportSeries.onReady/>
				<@localOrGlobalPassportNumber.onReady/>
				<@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_ident_doc_type,declarant_ident_doc_ser'/>
				<@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_num' '1' 'localOrGlobalPassportNumber' 'declarant_ident_doc_type,declarant_ident_doc_num'/>
				<@commonValidation.clearValidationMessageOnChange ['declarant_ident_doc_type_gr','declarant_ident_doc_type'], ['declarant_ident_doc_ser','declarant_ident_doc_num'] />
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_ident_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'declarant_ident_doc_date', '14'"} attrMessages=""/>
			</@jquery.onready>
		</@script.scripttag>
	</@html.head>
	<@html.body>
		<@html.sitenavigator step=3/>
		<@sf.serviceForm>
			<@sf.stepList/>
			<@sf.serviceStepForm>


				<@sf.fldrow>
					<@spring.formHiddenInput path="form.declarant_birthdate"/>
					<@sf.empty colspan="1"/>
					<@sf.label fieldset=true title="Заявитель" required=false style="text-align:left;" colspan="46"/>
					<@sf.empty colspan="1"/>
				</@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
				    <#-- Заполняется автоматически данными из СИА-->
					<@sf.label path="form.declarant_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
					<@sf.empty colspan="1"/>
				    <#-- Заполняется автоматически данными из СИА-->
					<@sf.textfield  path="form.declarant_last_name" qtip="" validation="cyrillic required" attr = "maxlength='40'" style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="27"/>
				</@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
				    <#-- Заполняется автоматически данными из СИА-->
					<@sf.label path="form.declarant_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
					<@sf.empty colspan="1"/>
				    <#-- Заполняется автоматически данными из СИА-->
					<@sf.textfield  path="form.declarant_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="5"/>
				    <#-- Заполняется автоматически данными из СИА-->
					<@sf.label path="form.declarant_middle_name" title="Отчество" required=false style="text-align:right;" colspan="7"/>
					<@sf.empty colspan="1"/>
				<#-- Заполняется автоматически данными из СИА-->
					<@sf.textfield  path="form.declarant_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="1"/>
				</@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label fieldset=true title="Документ, удостоверяющий личность" required=false style="text-align:left;" colspan="46"/>
					<@sf.empty colspan="1"/>
				</@sf.fldrow>

				<@switchableDeclarantDocumentDocType.formField />

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.declarant_ident_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
					<@sf.empty colspan="1"/>
					<@sf.textfield  path="form.declarant_ident_doc_ser"  attr="maxlength='25'" qtip="" validation="required" style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="5"/>
					<@sf.label path="form.declarant_ident_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="7"/>
					<@sf.empty colspan="1"/>
					<@sf.datefield path="form.declarant_ident_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required relativedays birthDatePlusNUntilNow" validationattr={"relativedays": "'<=', 0"}
							validationMessage={"relativedays": "Дата не может быть больше текущей"} style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="1"/>
				</@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.declarant_ident_doc_num" title="Номер" required=true style="text-align:right;" colspan="6"/>
					<@sf.empty colspan="1"/>
					<@sf.textfield  path="form.declarant_ident_doc_num" qtip=""  attr="maxlength='25'" validation="required" style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="5"/>
					<@sf.label path="form.declarant_ident_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="7"/>
					<@sf.empty colspan="1"/>
					<@sf.textarea path="form.declarant_ident_doc_source" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"А-Яа-яёЁ0-9ёЁ\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),."} attr='maxlength="200"' style="text-align:left;" colspan="13"/>
					<@sf.empty colspan="1"/>
				</@sf.fldrow>

				<@sf.fldrow>
					<#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
				</@sf.fldrow>

			</@sf.serviceStepForm>
		</@sf.serviceForm>
	</@html.body>
</@html.html>