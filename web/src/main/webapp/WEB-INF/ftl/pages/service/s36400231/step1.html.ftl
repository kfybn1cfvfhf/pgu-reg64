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
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства о смерти'>
	    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>

           <@utils.setZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp'}/>

         <@jquery.onready>
		   <@utils.clearZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp','clearButton':'id_agency_in'}/>
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
                <@sf.label path="form.doc_type" title="Вид запрашиваемого <br/>документа" required=true style="text-align:right;" colspan="10"/>
                <@sf.empty colspan="1"/>
                <@sf.staticLookup path="form.doc_type" staticData={"SVIDET":"Повторное свидетельство","SPRAVKA":"Справка"} validation="required" qtip="" style="text-align:left;" colspan="32"/>
                <@sf.empty colspan="4"/>
        </@sf.fldrow>

        <@sf.fldrow>
                <@sf.empty colspan="1"/>
                <#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                <@sf.label path="form.id_agency_in" title="ЗАГС обращения" required=true style="text-align:right;" colspan="10"/>
                <@sf.empty colspan="1"/>
                <#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                <@sf.customLookup  path="form.id_agency_in" controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}","typeAZ":"AZ_POVT","method":"getExtZagsesByGroup"}) resultCallbacks=['setZagsDetailsInfo'] qtip="" validation="required" style="text-align:left;" colspan="32"/>
                <@sf.empty colspan="4"/>
        </@sf.fldrow>

        <@sf.fldrow>
			<@sf.empty colspan="12"/>
			<@sf.label path="form.adresZags" title="${form.adresZags!''}" required=false style="text-align:left;" colspan="30"/>
			<@sf.empty colspan="6"/>
			<@spring.formHiddenInput path="form.adresZags"/>
        </@sf.fldrow>

        <@sf.fldrow>
			<@sf.empty colspan="12"/>
			<@sf.label path="form.telephMain" title="${form.telephMain!''}" required=false style="text-align:left;" colspan="30"/>
			<@sf.empty colspan="6"/>
			<@spring.formHiddenInput path="form.telephMain"/>
        </@sf.fldrow>

        <@sf.fldrow>
			<@sf.empty colspan="12"/>
			<@sf.label path="form.adresHttp" title="${form.adresHttp!''}" required=false style="text-align:left;" colspan="30"/>
			<@sf.empty colspan="6"/>
			<@spring.formHiddenInput path="form.adresHttp"/>
        </@sf.fldrow>

        <@sf.fldrow style="visibility:hidden;">
			<@sf.empty colspan="1"/>
			<@sf.label path="form.agency_id" title="Информация о ЗАГСе" required=false style="text-align:right;" colspan="10"/>
			<@sf.empty colspan="1"/>
			<@sf.textarea path="form.agency_id" attr="readonly='true'" qtip=""  style="text-align:left;" colspan="32"/>
			<@sf.empty colspan="4"/>
        </@sf.fldrow>

        <@sf.fldrow>
                <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
        </@sf.fldrow>

</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>