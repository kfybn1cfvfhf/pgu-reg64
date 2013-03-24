 <#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
 <#import '../customTemplates/generic/appiontment.ftl' as appointment />

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация усыновления (удочерения)'>
        <@script.scripttag>
            <@jquery.onready>
                <#--<@action.setRequiredIf 'true' 'date' 'change' 'time' '%' />-->
			    <@action.unsetRequiredByField 'true' 'date' 'change' 'time' '' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>
				
                <@appointment.step dateRequired=false type="AZ_US"/>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Контактные данные" style="text-align:left;"  fieldset=true colspan="26"/>
						<@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.contact_phone" title="Телефон" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.contact_phone" qtip=""  style="text-align:unknown;" colspan="20"/>
                    <@sf.empty colspan="18"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.contact_email" title="E-mail заявителя" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.contact_email" qtip="" validation="email" style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="18"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>