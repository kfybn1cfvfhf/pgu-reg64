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
    <@html.head title='Подача электронной заявки на выдачу свидетельства о перемене имени'>
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
						<@sf.empty colspan="1"/>
						<@sf.label title="Дата и время приема" fieldset=true style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Обращение к методу GetDayQue-->
                        <@sf.label path="form.date" title="Дата" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#-- Обращение к методу GetDayQue-->
                        <@sf.customLookup path="form.date" controller='Nahodka_DayQue' validation=""
                            optionsMap=clu.createOptionsMap(form, {"id_agency_in" : form.agency_id,"operation_type":"AZ_PI", "userSelectedRegion":"${userSelectedRegion!''}"})
                            qtip=""  style="text-align:left;" colspan="10"/>
						<@sf.empty colspan="28"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Обращение к методу GetTimeQue-->
                        <@sf.label path="form.time" title="Время и кабинет" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#-- Обращение к методу GetTimeQue-->
                        <@sf.customLookup path="form.time" controller='Nahodka_TimeQue'  validation=""
                            optionsMap=clu.createOptionsMap(form, {"id_agency_in" : form.agency_id, "operation_type" : "AZ_PI", "userSelectedRegion":"${userSelectedRegion!''}"})
                            dependsOn = [{'fieldId': 'form.date'}] parentLookup={'fieldId': 'date'}
                            qtip=""  style="text-align:left;" colspan="10"/>
						<@sf.empty colspan="28"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Контактные данные" fieldset=true style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Автоматически подставляется из СИА-->
                        <@sf.label path="form.contact_phone" title="Телефон" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#-- Автоматически подставляется из СИА-->
                        <@sf.textfield  path="form.contact_phone" qtip=""  style="text-align:unknown;" colspan="20"/>
						<@sf.empty colspan="18"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.contact_email" title="E-mail заявителя" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.contact_email" validation="email maxlength" qtip="" validationattr={'maxlength':255} style="text-align:unknown;" colspan="20"/>
						<@sf.empty colspan="18"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>