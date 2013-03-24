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
    <@html.head title='Предоставление гражданам жилых помещений по договорам социального найма из государственного жилищного фонда'>
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
					
						<#-- последовательность шагов при активации чекбокса: ШАГ3,ШАГ4,ШАГ5
последовательность шагов при деактивации чекбокса: ШАГ2,ШАГ5-->
<@sf.label path="form.incapable_enable" title="Заявление подаёт опекун (попечитель):" required=false style="text-align:left;" colspan="18"/>
					
						<#-- последовательность шагов при активации чекбокса: ШАГ3,ШАГ4,ШАГ5
последовательность шагов при деактивации чекбокса: ШАГ2,ШАГ5-->
<@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подаёт опекун или попечитель. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность опекуна (попечителя), и документ об установлении опеки (попечительства)."  style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
