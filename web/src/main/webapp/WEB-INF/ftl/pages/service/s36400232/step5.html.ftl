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
<#import "../customValidation/firstDatePlusNUntilLastDatePlusM.ftl" as firstDatePlusNUntilLastDatePlusM>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки об установлении отцовства'>
    <@firstDatePlusNUntilLastDatePlusM.preHead/>
	<@script.scripttag>
        <@firstDatePlusNUntilLastDatePlusM.preScript/>
		<@jquery.onready>
            <@fioFields.controllCase 'child_affiliation_last_name' 'child_affiliation_first_name' 'child_affiliation_middle_name'/>
            <@fioFields.controllCase 'father_last_name' 'father_first_name' 'father_middle_name'/>

            <@firstDatePlusNUntilLastDatePlusM.onReady/>
            <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='affiliation_doc_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'affiliation_doc_date', 'declarant_birthdate', 'currentDate', '14' , '0', '-106','0'"} attrMessages=""/>
		</@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>
<@sf.serviceStepForm >
				
<@sf.fldrow>
    <@spring.formHiddenInput path="form.declarant_birthdate"/>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Сведения о ребенке после установления отцовства" required=false style="text-align:left;" colspan="44"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>

<@sf.fldrow>

	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_affiliation_last_name" title="Фамилия" required=true style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.child_affiliation_last_name" qtip="" validation="regexp required" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,40}$/", "message": "Буквы кириллицы и дефис"} attr='maxlength="40"' style="text-align:unknown;" colspan="10"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_affiliation_first_name" title="Имя" required=true style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.child_affiliation_first_name" validation="regexp required" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,20}$/", "message": "Буквы кириллицы и дефис"} attr='maxlength="20"' style="text-align:unknown;" colspan="10"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_affiliation_middle_name" title="Отчество" required=false style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.child_affiliation_middle_name" validation="regexp" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,20}$/", "message": "Буквы кириллицы и дефис"} attr='maxlength="20"' qtip="" style="text-align:unknown;" colspan="10"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Отец" required=false style="text-align:left;" colspan="22"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.father_last_name" title="Фамилия" required=true style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.father_last_name" qtip="" validation="regexp required" attr='maxlength="40"' validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,40}$/", "message": "Буквы кириллицы и дефис"} style="text-align:unknown;" colspan="10"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.father_first_name" title="Имя" required=true style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.father_first_name" qtip="" validation="regexp required" attr='maxlength="20"' validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,20}$/", "message": "Буквы кириллицы и дефис"} style="text-align:unknown;" colspan="10"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.father_middle_name" title="Отчество" required=false style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.father_middle_name" validation="regexp" attr='maxlength="20"' validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,20}$/", "message": "Буквы кириллицы и дефис"} qtip="" style="text-align:unknown;" colspan="10"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true id="affiliation_doc" title="Документ, подтверждающий установление отцовства" required=false style="text-align:left;" colspan="44"/>
	<@sf.empty colspan="3"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.affiliation_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.affiliation_doc_num" qtip="" validation="regexp" attr='maxlength="40"' validationattr={'regexp':'/^[0-9]+$/'} validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:unknown;" colspan="10"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.affiliation_doc_source" title="Место регистрации" required=false style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.textarea  path="form.affiliation_doc_source" qtip="" validation="regexp" attr='maxlength="200"' validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="10"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.affiliation_doc_date" title="Дата" required=false style="text-align:right;" colspan="11"/>
	<@sf.empty colspan="1"/>
	<@sf.datefield path="form.affiliation_doc_date"  qtip="" style="text-align:left;" colspan="10"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	