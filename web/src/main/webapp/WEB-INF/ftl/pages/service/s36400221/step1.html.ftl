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

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на регистрацию брака'>
    <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>">

    </script>
        <@script.scripttag>

            <@utils.setZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp'}/>

            <@jquery.onready>
                <@utils.clearZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp','clearButton':'id_agency'}/>
                //*****Ошибка дизайна*****//
                //$('#reg_date').siblings('.inputChoice').css('width','170px');


            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>
                <@sf.textfield  path="form.reg_date_clone" tdstyle='display:none;' />
                <@spring.formHiddenInput path="form.agency_id"/>

                <@sf.fldrow>
                        <@sf.empty colspan="1"/>
                        <#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                        <@sf.label path="form.id_agency" title="ЗАГС обращения" required=true style="text-align:right;" colspan="8"/>
                        <@sf.empty colspan="1"/>
                        <#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                    <@sf.customLookup  path="form.id_agency" controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}","getExtZagsesByGroup": "AZ_ZB"}) resultCallbacks=['setZagsDetailsInfo'] qtip="" validation="required" style="text-align:left;" colspan="35"/>
                        <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.adresZags" title="${form.adresZags!''}" required=false style="text-align:left;" colspan="35"/>
                    <@spring.formHiddenInput path="form.adresZags"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.telephMain" title="${form.telephMain!''}" required=false style="text-align:left;" colspan="35"/>
                    <@spring.formHiddenInput path="form.telephMain"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.adresHttp" title="${form.adresHttp!''}" required=false style="text-align:left;" colspan="35"/>
                    <@spring.formHiddenInput path="form.adresHttp"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Желаемые дата и время регистрации" required=false style="text-align:left;" colspan="44"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#--<@sf.label path="form.reg_is_grand" title="Торжественная <br/>регистрация" required=false style="text-align:right;" colspan="8"/>--><@sf.empty colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.checkbox path="form.reg_is_grand" label="Торжественная регистрация" qtip="Регистрация считается неторжественной, если значение не выбрано"  style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <#-- Запрос к веб-сервису-->
                    <@sf.label path="form.reg_date" title="Дата" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <#-- Запрос к веб-сервису-->
                    <@sf.customLookup path="form.reg_date" controller="Nahodka_DateTimeZB_getDaysZB"
                        <#--params=[{'name':'id_agency','value': form.id_agency},{'name':'reg_is_grand','value': form.reg_is_grand}]-->
                        optionsMapSources=[{'fieldId':'id_agency','alias': 'id_agency'},{'fieldId':'reg_is_grand','alias': 'reg_is_grand'}]
                        optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}"})
                        validation="required"
                        qtip="" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.empty colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.empty colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.reg_time" title="Время и зал" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.customLookup  path="form.reg_time" controller='Nahodka_DateTimeZB_getTimesZB'
                    optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}"})
                    validation="required"
                    optionsMapSources=[{'fieldId':'id_agency'},{'fieldId':'reg_date'},{'fieldId':'reg_is_grand'}] qtip="" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
