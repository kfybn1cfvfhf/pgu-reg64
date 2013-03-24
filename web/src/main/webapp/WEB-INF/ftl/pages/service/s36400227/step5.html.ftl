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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о перемене имени'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.unsetRequiredByField 'true' 'declarant_middle_name' 'change' 'person_new_middle_name' ''/>
                <@fioFields.controllCase 'person_new_first_name' 'person_new_last_name' 'person_new_middle_name'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

              <@sf.fldrow>
		      <@spring.formHiddenInput path="form.declarant_middle_name"/>
              </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="ФИО после перемены имени" fieldset=true style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.person_new_last_name" title="Фамилия" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.person_new_last_name" qtip="" validation="regexp required maxlength" validationattr={'regexp':'/^[А-Яа-яЁё\\s-]{0,200}$/','maxlength':'40'}  validationMessage={"regexp":"Допустим ввод кириллицы и символ тире"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.person_new_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.person_new_first_name" qtip="" validation="regexp required maxlength" validationattr={'regexp':'/^[А-Яа-яЁё\\s-]{0,200}$/','maxlength':'20'}  validationMessage={"regexp":"Допустим ввод кириллицы и символ тире"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.person_new_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.person_new_middle_name" qtip="" validation="regexp maxlength" validationattr={'regexp':'/^[А-Яа-яЁё\\s-]{0,200}$/','maxlength':'20'}  validationMessage={"regexp":"Допустим ввод кириллицы и символ тире"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.change_name_reason" title="Причина перемены имени" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.change_name_reason" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"А-Яа-яЁё0-9\\s.,/№()-]*$/'} attr='maxlength="200"' validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="38"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>