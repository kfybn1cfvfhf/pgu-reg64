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
    <@html.head title='Возмещение реабилитированным лицам расходов на установку телефона в пределах установленного тарифа'>
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

                    <@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.
<br>В этом случае необходимо:
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.incapable_enable" title="Заявитель представляет интересы недееспособного лица:" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подается  законным представителем.
<br>В этом случае необходимо:
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность законного представителя и документ, подтверждающий право законного представителя."  style="text-align:left;" colspan="31"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.dovCategory" title="В качестве:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.dictionaryLookup path="form.dovCategory" dictionaryCode="64_DOV_CATEGORY_64206" qtip="" validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
