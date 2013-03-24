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
    <@html.head title='Выдача градостроительных планов земельных участков'>
        <@script.scripttag>
            <@jquery.onready>
            <#--перекрытие валидатора-->
                <@customValidators.addCustomValidators />

            <#--отображение полей-->
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='dov_enable' value='1' />
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='dovUlType' value='2' />

                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='anotherFl_enable' value='1' />
                <@action.setVisibleByValue onload='true' srcid='applType' event='change' destid='anotherUl_enable' value='2' />
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
            Отображается поле  #dov_enable

            В случае выбора значения "Юридическое лицо":
            Отображается поле "Заявление подает" #dovUlType-->
                    <@sf.label path="form.applType" title="Заявителем является:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.applType" qtip="Выберите из справочника тип заявителя.
<br>При выборе типа заявителя будет осуществлен переход на шаг для вноса сведений соответствующих выбранному типу заявителя" validation="required" staticData={"1":"Физическое лицо","2":"Юридическое лицо"} style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.anotherFl_enable" title="Кроме заявителя, правообладателями земельного участка являются другие физические лица" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.anotherFl_enable"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
    Отображается в случае выбора значения "Физическое лицо" в #applType
    При отображении:
    По умолчанию: Не активирован

    Логика:
    1. При деактивированном dov_enable  осуществляется переход на ШАГ 2 (ШАГ 3,4,5 пропускаются)
    2. При активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5 пропускаются)-->
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
      (Логика: При выборе осуществляется переход на ШАГ 4 (ШАГИ 2,3,5 пропускаются)
      Представитель юридического лица действующий на основании доверенности
      (Логика: При выборе осуществляется переход на ШАГ 5 (ШАГИ 2,3,4 пропускаются)-->
                    <@sf.label path="form.dovUlType" title="Заявление подает:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.dovUlType" validation="required" staticData={"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"} style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.anotherUl_enable" title="Кроме заявителя, правообладателями земельного участка являются другие юридические лица" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.anotherUl_enable"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
