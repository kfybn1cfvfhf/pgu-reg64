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
<#import "../customValidation/common.ftl" as cm>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства о расторжении брака'>
	<script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
    <@localOrGlobalPassportSeries.preHead/>
    <@localOrGlobalPassportNumber.preHead/>
    <@birthDatePlusNUntilNow.preHead/>
    <@script.scripttag>
        <@localOrGlobalPassportSeries.preScript/>
        <@localOrGlobalPassportNumber.preScript/>
        <@birthDatePlusNUntilNow.preScript/>
		<@jquery.onready>
            <@localOrGlobalPassportSeries.onReady/>
            <@localOrGlobalPassportNumber.onReady/>
            <@birthDatePlusNUntilNow.onReady/>
            <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'declarant_doc_date', '14'"} attrMessages=""/>

            <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_ident_doc_type,declarant_doc_ser'/>
            <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_doc_num' '1' 'localOrGlobalPassportNumber' 'declarant_ident_doc_type,declarant_doc_num'/>
            <@cm.clearValidationMessageOnChange ["declarant_ident_doc_type_gr","declarant_ident_doc_type"],["declarant_doc_ser","declarant_doc_num"]/>

             <@action.setVisibleByValue 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_type' '1' />
             <@action.setVisibleByValue 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_type_m' '2' />
               </@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>

<@sf.serviceStepForm>
<input type="hidden" id="gr_and_doc_type" value="" />
<@sf.fldrow>
    <@spring.formHiddenInput path="form.declarant_birthdate"/>
    <@sf.empty colspan="48"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Документ,&nbsp;удостоверяющий&nbsp;личность&nbsp;заявителя" required=false style="text-align:left;" colspan="43"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>
<@sf.fldrow>
   <@sf.empty colspan="1"/>
   <@sf.label path="form.declarant_ident_doc_type_gr" title="Способ заполнения типа документа" required=true style="text-align: right" colspan=12/>
   <@sf.empty colspan="1"/>
   <@sf.radiogroup path="form.declarant_ident_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="30"/>
<@sf.empty colspan=4/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_ident_doc_type" title="Тип&nbsp;документа" required=true style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="1"/>
	<@sf.dictionaryLookup path="form.declarant_ident_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="30"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_ident_doc_type_m" title="Тип&nbsp;документа" required=true style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield path="form.declarant_ident_doc_type_m"  qtip="" validation="required cyrillic" attr="maxlength='70'" style="text-align:left;" colspan="30"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_doc_ser" title="Серия" required=true style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_doc_ser" qtip="" validation="required" attr="maxlength='25'" style="text-align:left;" colspan="30"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_doc_num" title="Номер" required=true style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_doc_num" qtip="" validation="required" attr="maxlength='25'" style="text-align:left;" colspan="30"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>


<@sf.fldrow>
    <@spring.formHiddenInput path="form.declarantBirthDatePlus14Years"/>
    <@sf.empty colspan="48"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_doc_date" title="Дата&nbsp;выдачи" required=true style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="1"/>
	<@sf.datefield path="form.declarant_doc_date" validation="required" maxDate="${currentDate?string('dd.MM.yyyy')}" minDate="${form.start_date?string('dd.MM.yyyy')}"   qtip=""  style="text-align:left;" colspan="30"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="12"/>
	<@sf.empty colspan="1"/>
	<@sf.textarea path="form.declarant_doc_source" validation="maxlength regexp required" validationattr={'maxlength':200,'regexp':'/^[\\|\\"А-ЯЁ0-9\\s.,/№()-]{0,200}$/i', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|.,"} qtip=""  style="text-align:left;" colspan="30"/>
	<@sf.empty colspan="4"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	