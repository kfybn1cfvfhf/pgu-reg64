<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/fioFields.ftl" as fioController>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на регистрацию брака'>
        <@script.scripttag>
            <@jquery.onready>
			<@fioController.apply "groom_new_last_name" "bride_new_last_name"/>
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
						<@sf.label fieldset=true path="form.he" title="Он" required=false style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="19"/>
						<@sf.label fieldset=true path="form.she" title="Она" required=false style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.groom_new_last_name" title="Фамилия после <br/>заключения брака" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.groom_new_last_name" qtip="" validation="required regexp" validation="regexp required" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,40}$/", "message": "Буквы кириллицы, пробел и дефис"} attr='maxlength="40"' style="text-align:left;" colspan="12"/>
						<@sf.empty colspan="4"/>
						<@sf.label path="form.bride_new_last_name" title="Фамилия после <br/>заключения брака" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.bride_new_last_name" qtip="" validation="required regexp" validation="regexp required" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,40}$/", "message": "Буквы кириллицы, пробел и дефис"} attr='maxlength="40"' style="text-align:left;" colspan="12"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	