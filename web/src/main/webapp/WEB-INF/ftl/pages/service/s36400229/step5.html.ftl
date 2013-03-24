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
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки о рождении'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='birth_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'child_birthday', 'birth_doc_date', '0'"} attrMessages=""/>
			    <@fioFields.controllCase 'mother_first_name' 'mother_last_name' 'mother_middle_name'/>
			    <@fioFields.controllCase 'father_first_name' 'father_last_name' 'father_middle_name'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Сведения о матери" required=false style="text-align:left;" colspan="22"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.mother_last_name" title="Фамилия" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_last_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"40"} attr='maxlength="40"' style="text-align:unknown;" colspan="10"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.mother_first_name" title="Имя" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_first_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:unknown;" colspan="10"/>
                		<@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.mother_middle_name" title="Отчество" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:unknown;" colspan="10"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Сведения об отце" required=false style="text-align:left;" colspan="22"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_last_name" title="Фамилия" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_last_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"40"} attr='maxlength="40"' style="text-align:unknown;" colspan="10"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_first_name" title="Имя" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_first_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:unknown;" colspan="10"/>
                        <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_middle_name" title="Отчество" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:unknown;" colspan="10"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Документ, подтверждающий рождение ребенка" required=false style="text-align:left;" colspan="44"/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.birth_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.birth_doc_num" qtip="" validation="regexp maxlength" validationattr={'maxlength':'20','regexp':'/^[0-9]+$/',"message":"Допустим ввод цифр"} style="text-align:unknown;" colspan="10"/>
                        <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.birth_doc_source" title="Место регистрации" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.birth_doc_source" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200','regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s.,/№()-]{0,200}$/',"message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="10"/>
                        <@sf.empty colspan="25"/>
                </@sf.fldrow>

				<input id="child_birthday" type="hidden" value="${form.child_birthday?string("dd.MM.yyyy")}" />

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.birth_doc_date" title="Дата" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.birth_doc_date"  qtip="" validation="relativedays birthDatePlusNUntilNow"
                            validationattr={"relativedays":"'<=', 0"}
                            validationMessage={"relativedays": "Дата выдачи документа не может быть больше текущей даты."}
                            style="text-align:unknown;" colspan="10"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	