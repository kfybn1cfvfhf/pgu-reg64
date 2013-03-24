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
    <@html.head title='Назначение гражданам, имеющим звание «Почетный гражданин Саратовской области», денежных компенсаций расходов по оплате проезда'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue onload='true' srcid='incapable_enable' event='change' destid='dovCategory' value='on' />

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
см. #incapable_enable-->
                    <@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>

                <#-- По умолчанию: Не активирован

Логика:
см. #incapable_enable-->
                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.
В этом случае необходимо: 
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: Не активирован

Логика:
1. При активации чекбокса отображается справочник #dovCategory
2. При деактивации чекбокс #dovCategory не отображен
3. При деактивированном incapable_enable и деактивированном dov_enable  осуществляется 
переход на ШАГ 2 (ШАГ 3,4,5,6 пропускаются). Далее ШАГ7
4. При деактивированном incapable_enable и активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5,6 пропускаются). Далее ШАГ7-->
                    <@sf.label path="form.incapable_enable" title="Заявитель представляет интересы недееспособного лица:" required=false style="text-align:left;" colspan="18"/>

                <#-- По умолчанию: Не активирован

Логика:
1. При активации чекбокса отображается справочник #dovCategory
2. При деактивации чекбокс #dovCategory не отображен
3. При деактивированном incapable_enable и деактивированном dov_enable  осуществляется 
переход на ШАГ 2 (ШАГ 3,4,5,6 пропускаются). Далее ШАГ7
4. При деактивированном incapable_enable и активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5,6 пропускаются). Далее ШАГ7-->
                    <@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подается  законным представителем.
В этом случае необходимо: 
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность законного представителя и документ, подтверждающий право законного представителя."  style="text-align:left;" colspan="31"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- 64_DOV_CATEGORY_64206
По умолчанию: поле скрыто

Значения:
1. Родителя
2. Опекуна
3. Попечителя

Логика:
1. Отображается при активации чекбокса #incapable_enable
2. Скрывается при деактивации чекбокса #incapable_enable
3. При выборе "1. Родителя" и деактивированном dov_enable осуществляется переход на ШАГ 2,6 (ШАГИ 3,4,5 пропускаются). Далее ШАГ7
4. При выборе "2. Опекун" или "3. Попечитель" и деактивированном dov_enable осуществляется переход на ШАГ 4,6 (ШАГИ 2,3,5 пропускаются). Далее ШАГ7
5. При выборе "1. Родителя" и активированном dov_enable  осуществляется переход на ШАГ 3,6 (ШАГИ 2,4,5 пропускаются). Далее ШАГ7
6. При выборе "2. Опекун" или "3. Попечитель" и активированном dov_enable осуществляется переход на ШАГ 5,6 (ШАГИ 2,3,4 пропускаются). Далее ШАГ7-->
                    <@sf.label path="form.dovCategory" title="В качестве:" required=true style="text-align:left;" colspan="18"/>

                <#-- 64_DOV_CATEGORY_64206
По умолчанию: поле скрыто

Значения:
1. Родителя
2. Опекуна
3. Попечителя

Логика:
1. Отображается при активации чекбокса #incapable_enable
2. Скрывается при деактивации чекбокса #incapable_enable
3. При выборе "1. Родителя" и деактивированном dov_enable осуществляется переход на ШАГ 2,6 (ШАГИ 3,4,5 пропускаются). Далее ШАГ7
4. При выборе "2. Опекун" или "3. Попечитель" и деактивированном dov_enable осуществляется переход на ШАГ 4,6 (ШАГИ 2,3,5 пропускаются). Далее ШАГ7
5. При выборе "1. Родителя" и активированном dov_enable  осуществляется переход на ШАГ 3,6 (ШАГИ 2,4,5 пропускаются). Далее ШАГ7
6. При выборе "2. Опекун" или "3. Попечитель" и активированном dov_enable осуществляется переход на ШАГ 5,6 (ШАГИ 2,3,4 пропускаются). Далее ШАГ7-->
                    <@sf.dictionaryLookup path="form.dovCategory" dictionaryCode="64_DOV_CATEGORY_64206" qtip="" validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
