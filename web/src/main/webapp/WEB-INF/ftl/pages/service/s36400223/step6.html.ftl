<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о смерти'>
	    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>
            <@jquery.onready>
			<@action.unsetRequiredByField 'true' 'date' 'change' 'time' '' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
                    <@spring.formHiddenInput path="form.id_agency_in"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Дата и время приема" required=false style="text-align:left;" colspan="26"/>
					    <@sf.empty colspan="21"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- lookup Обращение к методу GetDayQue-->
                        <@sf.label path="form.date" title="Дата" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#-- lookup Обращение к методу GetDayQue-->
                        <#--<@sf.textfield  path="form.date" qtip=""  style="text-align:left;" colspan="13"/>-->
                        <@sf.customLookup  path="form.date" controller='Nahodka_DayQue' qtip="" style="text-align:left;" optionsMap=clu.createOptionsMap(form, {"id_agency_in" : form.id_agency_in?split("#")[0], "operation_type" : "AZ_SM", "userSelectedRegion":"${userSelectedRegion!''}"}) colspan="13"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- lookup Обращение к методу GetTimeQue-->
                        <@sf.label path="form.time" title="Время и кабинет" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#-- lookup Обращение к методу GetTimeQue-->
                        <#--<@sf.textfield  path="form.time" qtip=""  style="text-align:left;" colspan="13"/>-->
                        <@sf.customLookup  path="form.time" controller='Nahodka_TimeQue' qtip="" style="text-align:left;" colspan="13" optionsMap=clu.createOptionsMap(form, {"id_agency_in" : form.id_agency_in?split("#")[0], "operation_type" : "AZ_SM", "userSelectedRegion":"${userSelectedRegion!''}"}) dependsOn = [{'fieldId': 'form.date'}] parentLookup={'fieldId': 'date'}/>
					    <@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Контактные данные" required=false style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="21"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.contact_phone" title="Телефон" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.contact_phone" qtip=""  style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.contact_email" title="E-mail заявителя" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.contact_email" qtip="" validation="email" style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	