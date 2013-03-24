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
    <@html.head title='Подача электронной заявки на регистрацию брака'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
<#--
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.additionaldata" title="Общие даные" required=false style="text-align:left;" colspan="38"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>
-->

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Общие даные" required=false style="text-align:left;" colspan="38"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                <#-- валидный адрес email-->
                    <@sf.label path="form.contact_phone" title="Телефон"  required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="2"/>
                <#-- валидный адрес email-->
                    <@sf.textfield  path="form.contact_phone" qtip="" validation=""  style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="9"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- валидный адрес email-->
                        <@sf.label path="form.contact_email" title="Email заявителя" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#-- валидный адрес email-->
                        <@sf.textfield  path="form.contact_email" qtip="" validation="required email maxlength" validationattr={'maxlength':'255'} style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="9"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	