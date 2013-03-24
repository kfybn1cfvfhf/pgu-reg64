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
    <@html.head title='Выдача копий архивных документов, подтверждающих право на владение землей'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue 'true' 'applType' 'change' 'dov_enable' '1'/>
                <@action.setVisibleByValue 'true' 'applType' 'change' 'dovUlType' '2'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
<@sf.label path="form.applType" title="Заявителем является:" required=true style="text-align:left;" colspan="18"/>
<@sf.staticLookup path="form.applType" staticData={"1":"Физическое лицо","2":"Юридическое лицо"} qtip="Выберите из справочника тип заявителя.<br>
При выборе типа заявителя будет осуществлен переход на шаг для вноса сведений соответствующих выбранному типу заявителя" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.
В этом случае необходимо:<br>
1. Внести в соответствующие поля сведения о заявителе<br>
2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.dovUlType" title="Заявление подает:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.dovUlType" staticData={"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"} qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
