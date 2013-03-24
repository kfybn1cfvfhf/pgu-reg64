<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/custom/validators.ftl" as customValidators>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача постановлений по присвоению адреса земельным участкам и объектам капитального строительства'>
        <@script.scripttag>
            <@jquery.onready>
            <#--перекрытие валидатора-->
                <@customValidators.addCustomValidators />

            <#--отображение полей-->
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='dov_enable' value='1' />
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='ip_enable' value='1' />
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='dovUlType' value='2' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <h1><b>Заявление подается в ОИВ:<br>${stateOrgName}</b><h1>
            <@sf.serviceStepForm  includeEmptyTr=true>

                <@sf.fldrow>
                    <@sf.label path="form.applType" title="Заявителем является:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.applType" qtip="Выберите из справочника тип заявителя.
<br>При выборе типа заявителя будет осуществлен переход на шаг для вноса сведений соответствующих выбранному типу заявителя" validation="required" staticData={"1":"Физическое лицо","2":"Юридическое лицо"} style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.
В этом случае необходимо: 
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="29"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.dovUlType" title="Заявление подает:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.dovUlType" validation="required" staticData={"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"} style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
