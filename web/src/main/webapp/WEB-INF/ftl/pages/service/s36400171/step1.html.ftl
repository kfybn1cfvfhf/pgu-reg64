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
    <@html.head title='Присвоение звания «Ветеран труда»'>
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
                    <@sf.label path="form.dov_enable" title="Заявление подаёт уполномоченный представитель:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается уполномоченным представителем. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность уполномоченного представителя, и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.incapable_enable" title="Заявление подаёт опекун (попечитель):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подаёт опекун или попечитель. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность опекуна (попечителя), и документ об установлении опеки (попечительства)."  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
