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
    <@html.head title='Выдача разрешений на строительство, реконструкцию объектов капитального строительства'>
        <@script.scripttag>
            <@jquery.onready>

            <#--отображение полей-->
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='dov_enable' value='1' />
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='dovUlType' value='2' />

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
В случае выбора значения "Физическое лицо":
Отображается поле  #dov_enable, #incapable_enable

В случае выбора значения "Юридическое лицо":
Отображается поле "Заявление подает" #dovUlType-->
                    <@sf.label path="form.applType" title="Заявителем является:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.applType" qtip="Выберите из справочника тип заявителя.
<br>При выборе типа заявителя будет осуществлен переход на шаг для вноса сведений соответствующих выбранному типу заявителя" validation="required" staticData={"1":"Физическое лицо","2":"Юридическое лицо"} style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- По умолчанию: скрыто
Отображается в случае выбора значения "Физическое лицо" в #applType
При отображении:
По умолчанию: Не активирован

Логика:
1. В случае активации чекбокса осуществляется переход на ШАГ 3, ШАГ6   (ШАГИ 2,4,5,7 пропускаются). Далее ШАГ8
2. В случае деактивации чекбокса осуществляется переход на ШАГ 2 (ШАГИ 3,4,5,6,7 пропускаются). Далее ШАГ8-->
                    <@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.
<br>В этом случае необходимо:
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>
                    <@sf.empty colspan="29"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- По умолчанию: скрыто
Отображается в случае выбора значения "Юридическое лицо" в #applType

Значения в справочнике
textfield заменить на dictionaryLookup, зашить на форму
Значения:

Лицо, обладающее правом действовать от имени юридического лица без доверенности
(Логика: При выборе осуществляется переход на ШАГ 4,ШАГ7 (ШАГИ 2,3,5,6 пропускаются). Далее ШАГ8
Представитель юридического лица действующий на основании доверенности
(Логика: При выборе осуществляется переход на ШАГ 5,ШАГ7 (ШАГИ 2,3,4,6 пропускаются). Далее ШАГ8-->
                    <@sf.label path="form.dovUlType" title="Заявление подает:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.dovUlType" validation="required" staticData={"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"} style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
