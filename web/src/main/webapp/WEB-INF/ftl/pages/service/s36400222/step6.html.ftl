<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о рождении'>
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
            <@sf.serviceStepForm includeEmptyTr=true>

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
                        <@sf.customLookup  path="form.date" controller='Nahodka_DayQue' qtip="" validation="" style="text-align:left;" colspan="13" optionsMap=clu.createOptionsMap(form, {"id_agency_in" : form.id_agency_in?split("#")[0], "operation_type" : "AZ_RO", "userSelectedRegion":"${userSelectedRegion!''}}","method":"getDaysQue"})/>
                        <#--<@sf.customLookup  path="form.date" controller='Nahodka_DayQue' qtip="" validation="required" style="text-align:left;" colspan="13" optionsMap={"id_agency_in" : form.id_agency_in?split("#")[0], "operation_type" : "AZ_RO", "userSelectedRegion":"${userSelectedRegion!''}"}/>-->
						<@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- lookup Обращение к методу GetTimeQue-->
                        <@sf.label path="form.time" title="Время и кабинет" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
					    <#-- lookup Обращение к методу GetTimeQue-->
                        <@sf.customLookup path="form.time" controller='Nahodka_TimeQue' optionsMap=clu.createOptionsMap(form, {"id_agency_in" : form.id_agency_in?split("#")[0], "operation_type" : "AZ_RO", "userSelectedRegion":"${userSelectedRegion!''}","method":"getTimesQue"}) dependsOn = [{'fieldId': 'form.date'}] parentLookup={'fieldId': 'date'} qtip=""  style="text-align:left;" colspan="13"/>
                        <#--<@sf.customLookup  path="form.que_time" controller='Nahodka_TimeQue' qtip="" style="text-align:left;" colspan="13" optionsMap={"id_agency_in" : form.id_agency_in?split("#")[0], "operation_type" : "AZ_RO", "userSelectedRegion":"${userSelectedRegion!''}"} dependsOn = [{'fieldId': 'form.date'}] parentLookup={'fieldId': 'que_date'}/>-->
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
						<@sf.textfield  path="form.contact_phone" qtip="" validation="maxlength" validationattr={"maxlength":200} style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.contact_email" title="E-mail заявителя" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.contact_email" qtip="" validation="email maxlength" validationattr={"maxlength":200} style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	