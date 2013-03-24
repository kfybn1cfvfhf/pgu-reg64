<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#assign year=currentDate?string('yyyy')?number/>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#assign childYear=form.child_ident_birth_date?string('yyyy')?number>
<#assign childAge=year-childYear>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о рождении'>
	<@localOrGlobalPassportSeries.preHead/>
  	<@localOrGlobalPassportNumber.preHead/>
    <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
        <@script.scripttag>
            <#include "../customValidation/dateValidation.js" />


			<@localOrGlobalPassportSeries.preScript/>
   			<@localOrGlobalPassportNumber.preScript/>

            <@jquery.onready>

				<@localOrGlobalPassportSeries.onReady/>
   			    <@localOrGlobalPassportNumber.onReady/>

                <#--<@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_last_name' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_first_name' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_middle_name' '2' />-->
			    <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_birth_date' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_citizenship' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_nation' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_type' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_type_gr' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_type_m' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_ser' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_number' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_date' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'father_doc_place' '2' />
                <@action.unsetRequiredByField 'true' 'usluga_form' 'change' 'father_last_name' '2' />
                <@action.unsetRequiredByField 'true' 'usluga_form' 'change' 'father_first_name' '2' />
                <#--<@action.unsetRequiredByField 'true' 'usluga_form' 'change' 'father_middle_name' '2' />-->

                <@action.linkDestFromList onload='true' destid='arg_validate_pass' event='change' sourceids=['usluga_form', 'father_doc_type','father_doc_type_gr'] eventDest="change" delimited='|' />


                <@action.setVisibleByValue 'true' 'father_doc_type_gr' 'change' 'father_doc_type' '1' 'EL+LBL' />
                <@action.setVisibleByValue 'true' 'father_doc_type_gr' 'change' 'father_doc_type_m' '2' 'EL+LBL' />
                <@action.linkDestFromList onload='true' destid='gr_and_father_doc_type' event='change' eventDest='change' sourceids=['father_doc_type_gr', 'father_doc_type'] delimited='|' />
                <@action.setVisibleByValue 'true' 'mother_doc_type_gr' 'change' 'mother_doc_type' '1' 'EL+LBL' />
                <@action.setVisibleByValue 'true' 'mother_doc_type_gr' 'change' 'mother_doc_type_m' '2''EL+LBL' />
                <@action.linkDestFromList onload='true' destid='gr_and_mother_doc_type' event='change' eventDest='change' sourceids=['mother_doc_type_gr', 'mother_doc_type'] delimited='|' />

                $.validator.addMethod('checkDateFieldBirthDate',function(value, params){return checkDateFieldRelative(value, "child_ident_birth_date,-14,-120")}, validateMessage);
                $.validator.addMethod('checkDateFieldFather',function(value, params){return checkDateField(value,"father_birth_date,14,14,0")}, validateMessage);
                $.validator.addMethod('checkDateFieldMother',function(value, params){return checkDateField(value,"mother_birth_date,14,14,0")}, validateMessage);

                <@action.setRequiredIf 'true' 'father_doc_type_gr' 'change' 'father_doc_type' '1' />
				<@action.setRequiredIf 'true' 'father_doc_type_gr' 'change' 'father_doc_type_m' '2'/>
				<@action.setRequiredIf 'true' 'mother_doc_type_gr' 'change' 'mother_doc_type' '1'/>
				<@action.setRequiredIf 'true' 'mother_doc_type_gr' 'change' 'mother_doc_type_m' '2'/>
                <@action.setHiddenByValue 'true' 'father_nation' 'change' 'father_nation_hint' '' 'EL' />
                <@action.setHiddenByValue 'true' 'mother_nation' 'change' 'mother_nation_hint' '' 'EL' />
                <@action.setVisibleByValue 'true' 'father_nation' 'change' 'father_nation_hint_empty' '' 'EL' />
                <@action.setVisibleByValue 'true' 'mother_nation' 'change' 'mother_nation_hint_empty' '' 'EL' />

                <@fioFields.controllCase 'father_last_name' 'father_first_name' 'father_middle_name'  />
                <@fioFields.controllCase 'mother_last_name' 'mother_first_name' 'mother_middle_name'/>

                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '1' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '1' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '2' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '2' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '22' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '22' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '12' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '12' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '13' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '13' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '14' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '14' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '15' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '15' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '16' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '16' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '17' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '17' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '8' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '8' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '9' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '9' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '10' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '10' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '11' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '11' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_ser' '18' 'localOrGlobalPassportSeries' 'father_doc_type,father_doc_ser'/>
                <@action.applyValidationIf 'true' 'father_doc_type' 'change' 'father_doc_number' '18' 'localOrGlobalPassportNumber' 'father_doc_type,father_doc_number'/>

                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '1' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '1' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '2' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '2' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '22' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '22' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '12' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '12' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '13' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '13' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '14' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '14' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '15' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '15' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '16' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '16' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '17' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '17' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '8' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '8' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '9' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '9' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '10' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '10' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '11' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '11' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '18' 'localOrGlobalPassportSeries' 'mother_doc_type,mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'mother_doc_type' 'change' 'mother_doc_number' '18' 'localOrGlobalPassportNumber' 'mother_doc_type,mother_doc_number'/>

                <#-- Тип ДУЛ 1-->
                    <@action.unsetDisabledByValue 'true' 'father_doc_type' 'change' 'father_doc_type_m' '5' /> <#-- Иной документ -->
                    <@action.unsetDisabledByValue 'true' 'mother_doc_type' 'change' 'mother_doc_type_m' '5' />
                <#-- /Тип ДУЛ -->

                <#-- Серия ДУЛ -->
                    <#--ОН-->
                    <#-- У Временного удост или Иного документа серия необязательна -->
                    <@action.unsetRequiredByField 'true' 'father_doc_type' 'change' 'father_doc_ser' '2,5'/>
                    <#--ОНА-->
                    <#-- У Временного удост или Иного документа серия необязательна -->
                    <@action.unsetRequiredByField 'true' 'mother_doc_type' 'change' 'mother_doc_ser' '2,5'/>
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
            <input type="hidden" id="gr_and_father_doc_type"/>
            <input type="hidden" id="gr_and_mother_doc_type"/>
            <input id="usluga_form" type="hidden" value="${form.usluga_form!""}"/>
            <input type="hidden" id="arg_validate_pass"/>
            <input type="hidden" id="message"/>
            <input type="hidden" id="for_disabling"/>
            <@spring.formHiddenInput path="form.child_ident_birth_date"/>
            <@sf.empty colspan="48"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label fieldset=true title="Отец" style="text-align:left;" colspan="22"/>
            <@sf.empty colspan="1"/>
            <@sf.label fieldset=true title="Мать" style="text-align:left;" colspan="22"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.father_last_name" title="Фамилия" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.father_last_name" qtip="" validation="maxlength required regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":40} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_last_name" title="Фамилия" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.mother_last_name" qtip="" validation="maxlength required regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":40} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.father_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.father_first_name" qtip="" validation="maxlength required regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":20} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.mother_first_name" qtip="" validation="maxlength required regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":20} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.father_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.father_middle_name" qtip="" validation="maxlength regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":20} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.mother_middle_name" qtip="" validation="maxlength regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":20} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>



            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_birth_date" title="Дата <br/>рождения" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <#--<@sf.datefield path="form.father_birth_date"  qtip="" validation="required relativedays reldaysbyfield" validationattr={"relativedays":"'<=', 0","reldaysbyfield":"'<=', 1, 'child_ident_birth_date'"} style="text-align:left;" colspan="13"/>-->
            <@sf.datefield path="form.father_birth_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required checkDateFieldBirthDate"  style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_birth_date" title="Дата <br/>рождения" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <#--<@sf.datefield path="form.mother_birth_date"  qtip="" validation="required relativedays reldaysbyfield" validationattr={"relativedays":"'<=', 0","reldaysbyfield":"'<=', 1, 'child_ident_birth_date'"} style="text-align:left;" colspan="13"/>-->
            <@sf.datefield path="form.mother_birth_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required  checkDateFieldBirthDate"  style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.father_citizenship" dictionaryCode="GRAJD_LS" qtip="" style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.mother_citizenship" dictionaryCode="GRAJD_LS" qtip="" style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_nation" title="Национальность" required=false style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.father_nation" title="Национальность"  excludeCodes="${form.she_nation_dictionary}" dictionaryCode="NATIONALITY_LS" qtip="" style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_nation" title="Национальность" required=false style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.mother_nation" title="Национальность"  excludeCodes="${form.he_nation_dictionary}" dictionaryCode="NATIONALITY_LS" qtip="" style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.empty colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.statictext attr="id='father_nation_hint'"    style="text-align:left;font-size: 11px;" colspan="13">Если указана национальность, то она вносится в запись акта о рождении и в свидетельство о рождении</@sf.statictext>
            <@sf.statictext colspan="13" attr="id='father_nation_hint_empty'"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.empty colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.statictext  attr="id='mother_nation_hint'"     style="text-align:left;font-size: 11px;" colspan="13">Если указана национальность, то она вносится в запись акта о рождении и в свидетельство о рождении</@sf.statictext>
            <@sf.statictext colspan="13" attr="id='mother_nation_hint_empty'"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="48"/>
            </@sf.fldrow>




            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label fieldset=true id="father_doc" title="Документ, удостоверяющий личность" style="text-align:left;" colspan="22"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label fieldset=true title="Документ, удостоверяющий личность" style="text-align:left;" colspan="22"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_doc_type" title="Тип <br/>документа" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.father_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_doc_type" title="Тип <br/>документа" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.mother_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_doc_type_m" title="Иной документ, удостоверяющий личность" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield path="form.father_doc_type_m"  qtip="" validation="required cyrillic" attr="maxlength='70'"  style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_doc_type_m" title="Иной документ, удостоверяющий личность" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield path="form.mother_doc_type_m"  qtip="" validation="required cyrillic" attr="maxlength='70'" style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>


            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_doc_ser" title="Серия" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.father_doc_ser" qtip="" validation="required" style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_doc_ser" title="Серия" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.mother_doc_ser" qtip="" validation="required" style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_doc_number" title="Номер" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.father_doc_number" qtip="" validation="required" style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_doc_number" title="Номер" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.mother_doc_number" qtip="" validation="required" style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.datefield path="form.father_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required checkDateFieldFather "  style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.datefield path="form.mother_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required checkDateFieldMother"  style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
        <#if form.usluga_form != "2">
            <@sf.label path="form.father_doc_place" title="Кем выдан" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textarea path="form.father_doc_place" qtip="" validation="maxlength required regexp" validationattr={"regexp":"/^[А-Яа-яёЁ0-9\\\"№\\(\\)\\s-\\.,]{0,300}$/", "message": "Буквы кириллицы, пробел, символы \"№(-),.", "maxlength":200} style="text-align:left;" colspan="13"/>
        <#else>
            <@sf.empty colspan="22"/>
        </#if>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.mother_doc_place" title="Кем выдан" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.textarea path="form.mother_doc_place" qtip="" validation="maxlength required regexp" validationattr={"regexp":"/^[А-Яа-яёЁ0-9\\\"№\\(\\)\\s-\\.,]{0,300}$/", "message": "Буквы кириллицы,пробел, цифры, символы \"№(-),.", "maxlength":200} style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>



            <@sf.fldrow>
                <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
            </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	