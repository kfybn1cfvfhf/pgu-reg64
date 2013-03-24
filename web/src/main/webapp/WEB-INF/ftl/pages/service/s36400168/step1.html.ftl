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
    <@html.head title='Выдача направления гражданину на прохождение МСЭ'>
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
					
					<#-- По умолчанию: Не активирован

                    Логика:
                    1. При активации чекбокса осуществляется переход на ШАГ 3 (ШАГ 2 пропускается)
                    2. При деактивации чекбокса осуществляется переход на ШАГ 2 (ШАГ 3 пропускается)-->

                    <@sf.label path="form.dov_enable" title="Заявление подает законный представитель:" required=false style="text-align:left;" colspan="20"/>

                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается законным представителем.
                    В этом случае необходимо:
                    1. Внести в соответствующие поля сведения о заявителе
                    2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, подтверждающий право законного представителя и документ, удостоверяющий личность представителя."  style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
