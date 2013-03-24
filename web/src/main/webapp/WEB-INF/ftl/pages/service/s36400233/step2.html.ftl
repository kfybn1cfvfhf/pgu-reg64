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
    <@html.head title='Выдача справок гражданам о величине прожиточного минимума на душу населения и по основным социально-демографическим группам населения Саратовской области'>
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
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о запрашиваемой
                        услуге</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- 64_SOC_GROUP_64233-->
                    <@sf.label path="form.socGroup" title="Социально-демографическая группа населения:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.socGroup" dictionaryCode="64_SOC-DEMO_GROUP_233" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.period" title="Cведения запрашиваются:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.period" dictionaryCode="64_PERIOD_64233" qtip="Сведения предоставляются за период не ранее 1993 года" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
