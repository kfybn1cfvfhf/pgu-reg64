<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о браке'>
        <@script.scripttag>
            <@jquery.onready>

            <@fioFields.controllCase 'declarant_first_name' 'declarant_last_name' 'declarant_middle_name'/>

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
						<@sf.label fieldset=true title="Заявитель" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="41"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.label path="form.declarant_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.textfield  path="form.declarant_last_name" validation="cyrillic required maxlength" attr='maxlength="40"' style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.label path="form.declarant_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.textfield  path="form.declarant_first_name" validation="cyrillic required maxlength" attr='maxlength="20"' style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.label path="form.declarant_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА-->
                        <@sf.textfield  path="form.declarant_middle_name" validation="cyrillic maxlength" attr='maxlength="20"' style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	