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
    <@html.head title='Выплата ежемесячного пособия по уходу за ребенком'>
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
						<@sf.label path="form.izmSved" title="Я ознакомился(лась) с обстоятельствами, влекущими изменение размера пособия или прекращение его выплаты,  и обязуюсь своевременно (не позднее, чем в месячный срок) извещать орган социальной защиты населения о их наступлении:" required=true style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.izmSved" qtip="" validation="required" style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.noWork" title="Получатель услуги нигде не работал и не работает по трудовому договору, не осуществляет деятельность в качестве индивидуального предпринимателя, адвоката, нотариуса, занимающегося частной практикой, не относится к иным физическим лицам, профессиональная деятельность которых в соответствии с федеральными законами подлежит государственной регистрации и (или) лицензированию:" required=false style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.noWork" qtip=""  style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
