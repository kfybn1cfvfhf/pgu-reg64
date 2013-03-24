<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача решения о переводе или об отказе в переводе жилого помещения в нежилое или нежилого помещения в жилое помещение'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
						<@sf.label path="form.agree1Ch" title="Заверяю, что право собственности на помещение не обременено правами третьих лиц:" required=true style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.agree1Ch" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.agree2Ch" title="Обязуюсь использовать данное помещение, не нарушая прав и охраняемых законом интересов других лиц согласно действующему в Российской Федерации законодательству, участвовать в расходах по совместной эксплуатации и обслуживанию всего строения, соразмерно занимаемой площади:" required=true style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.agree2Ch" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
