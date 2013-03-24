<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/util.ftl" as util>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки о рождении'>
            <@localOrGlobalPassportSeries.preHead/>
            <@localOrGlobalPassportNumber.preHead/>
            <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@fioFields.controllCase 'declarant_first_name' 'declarant_last_name' 'declarant_middle_name'/>
                <@localOrGlobalPassportSeries.onReady/>
                <@localOrGlobalPassportNumber.onReady/>
                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_ident_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'declarant_ident_doc_date', '14'"} attrMessages=""/>

                <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_ident_doc_type,declarant_ident_doc_ser'/>
                <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_num' '1' 'localOrGlobalPassportNumber' 'declarant_ident_doc_type,declarant_ident_doc_num'/>
                <#--
                    <@util.preSettlementScript field='declarant_ident_doc_type' />

                    $('#declarant_ident_doc_type_gr').bind('change', function(){
                        clearValidationMessage('declarant_ident_doc_ser');
                        clearValidationMessage('declarant_ident_doc_num');
                    })
                -->

                <#-- Тип ДУЛ -->
                    <@action.unsetDisabledByValue 'true' 'declarant_ident_doc_type' 'change' 'declarant_ident_doc_type_m' '5' /> <#-- Иной документ -->
                <#-- /Тип ДУЛ -->

                <#-- Серия ДУЛ -->
                    <#-- У Временного удост или Иного документа серия необязательна -->
                    <@action.unsetRequiredByField 'true' 'declarant_ident_doc_type' 'change' 'declarant_ident_doc_ser' '2,5'/>
                <#-- /Серия ДУЛ -->

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
					<@sf.empty colspan="48" />
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Заявитель" required=false style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="41"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.label path="form.declarant_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.textfield  path="form.declarant_last_name" qtip="" validation="required cyrillic maxlength" validationattr={"maxlength":"40"}  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>    <#--validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я\\s/-]{0,20}$/',"message":"Допустим ввод только кириллицы и символа '-'"}-->
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.label path="form.declarant_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.textfield  path="form.declarant_first_name" qtip="" validation="required cyrillic maxlength" validationattr={"maxlength":"20"} style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.label path="form.declarant_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.textfield  path="form.declarant_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Документ, удостоверяющий личность заявителя" required=false style="text-align:left;" colspan="24"/>
						<@sf.empty colspan="23"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_ident_doc_type" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.declarant_ident_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_ident_doc_type_m" title="Иной документ, удостоверяющий личность" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_ident_doc_type_m" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_ident_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_ident_doc_ser" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_ident_doc_num" title="Номер" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_ident_doc_num" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_ident_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.declarant_ident_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
                        <@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_ident_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.declarant_ident_doc_source" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"А-ЯЁ0-9\\s.,№()-]{0,200}$/i',"message":"Допустим ввод кириллицы, цифр и символов \"№(-),."} style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="27"/>
				</@sf.fldrow>


            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	