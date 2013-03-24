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
    <@html.head title='Организация отдыха и оздоровления детей, находящихся в трудной жизненной ситуации, проживающих на территории Саратовской области'>
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
					
						<#-- По умолчанию: отображается

При отображении:
По умолчанию: Не активирован

Логика:
1. При деактивированном dov_enable  осуществляется 
переход на ШАГ 2 (ШАГ 3 пропускаются). Далее ШАГ 4,5,6
2. При активированном dov_enable  осуществляется 
переход на ШАГ 3 (ШАГ 2 пропускаются). Далее ШАГ 4,5,6-->
<@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>
					
						<#-- По умолчанию: отображается

При отображении:
По умолчанию: Не активирован

Логика:
1. При деактивированном dov_enable  осуществляется 
переход на ШАГ 2 (ШАГ 3 пропускаются). Далее ШАГ 4,5,6
2. При активированном dov_enable  осуществляется 
переход на ШАГ 3 (ШАГ 2 пропускаются). Далее ШАГ 4,5,6-->
<@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем. 
В этом случае необходимо: 
1. Внести в соответствующие поля сведения о заявителе
2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="29"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
