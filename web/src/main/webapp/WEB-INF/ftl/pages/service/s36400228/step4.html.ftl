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
<#import "../customValidation/common.ftl" as commonValidation>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as switchableDeclarantDocumentDocType>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о браке'>
    <@localOrGlobalPassportSeries.preHead/>
    <@localOrGlobalPassportNumber.preHead/>
    <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@utils.pguCyrillicNumberValidator/>
                <@birthDatePlusNUntilNow.onReady/>
                <@switchableDeclarantDocumentDocType.onReady/>
                <@localOrGlobalPassportSeries.onReady/>
                <@localOrGlobalPassportNumber.onReady/>

                <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_ident_doc_type,declarant_doc_ser'/>
                <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_doc_num' '1' 'localOrGlobalPassportNumber' 'declarant_ident_doc_type,declarant_doc_num'/>
                <@commonValidation.clearValidationMessageOnChange ['declarant_ident_doc_type_gr','declarant_ident_doc_type'], ['declarant_doc_ser','declarant_doc_num'] />

                <#-- Тип ДУЛ 1-->
                    <@action.unsetDisabledByValue 'true' 'declarant_ident_doc_type' 'change' 'declarant_ident_doc_type_m' '5' /> <#-- Иной документ -->
                <#-- /Тип ДУЛ -->

                <#-- Серия ДУЛ -->
                    <#-- У Временного удост или Иного документа серия необязательна -->
                    <@action.unsetRequiredByField 'true' 'declarant_ident_doc_type' 'change' 'declarant_doc_ser' '2,5'/>
                <#-- /Серия ДУЛ -->

            <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'declarant_doc_date', '14'"} attrMessages=""/>
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
                    <@sf.empty colspan="48"/>
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
						<@sf.textfield  path="form.declarant_ident_doc_type_m"  validation="required" qtip="" attr="maxlength='25'" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_doc_ser" qtip=""  validation="required" attr="maxlength='25'" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_doc_num" title="Номер" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_doc_num"  validation="required" qtip="" attr="maxlength='25'" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.declarant_doc_date" validation="relativedays required checkDateField" validationattr={"relativedays":"'<', 0"}  qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.declarant_doc_source" validation="regexp required maxlength" attr='maxlength="200"' validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} qtip="" style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="27"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	