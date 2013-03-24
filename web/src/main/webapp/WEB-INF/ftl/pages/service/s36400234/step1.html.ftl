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
    <@html.head title='Информирование о положении на рынке труда в Саратовской области'>
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
					
						<#-- По умолчанию: значения в справочнике
                    textfield заменить на dictionaryLookup, зашить на форму
                    Значения:
                    Физическое лицо
                    Юридическое лицо


                    Логика:
                    Физическое лицо: отображается ШАГ2 (ШАГ3 пропускается)
                    Юридическое лицо: отображается ШАГ3 (ШАГ2 пропускается)-->
                    <@sf.label path="form.applType" title="Заявителем является:" required=true style="text-align:left;" colspan="18"/>

                    <@sf.staticLookup  path="form.applType" qtip="Выберите из справочника тип заявителя.
                    При выборе типа заявителя будет осуществлен переход на шаг для вноса сведений соответствующих выбранному типу заявителя"
                        staticData={"1":"Индивидуальный предприниматель","2":"Юридическое лицо"}
                        validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
