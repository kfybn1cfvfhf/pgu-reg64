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
    <@html.head title='Назначение единовременного пособия при всех формах устройства детей-сирот и детей, оставшихся без попечения родителей, в семью'>
        <@script.scripttag>
            <@jquery.onready>


            if($('#stat_zayav').attr('value').indexOf('3') !== -1 || $('#stat_zayav').attr('value').length < 3){

            $('#dov_enable').parents("tr:first").hide();
            }    else {
            $('#dov_enable').parents("tr:first").show();
            }
            $('#stat_zayav').change(function() {
            if($('#stat_zayav').attr('value').indexOf('3') !== -1){

            $('#dov_enable').parents("tr:first").hide();
            }    else {
            $('#dov_enable').parents("tr:first").show();
            }
            });

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>

                <@sf.fldrow>


                    <@sf.label path="form.stat_zayav" title="Статус получателя услуги:" required=true style="text-align:left;" colspan="18"/>


                    <@sf.checkboxLookup path="form.stat_zayav" dictionaryCode="03_STAT_ZAYAV_64219" qtip="Выберите из справочника статус получателя услуги по отношению к ребенку (детям) переданных на воспитание в семью." validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>

                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.<br>
В этом случае необходимо: <br>
1. Внести в соответствующие поля сведения о заявителе  <br>
2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="30"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
