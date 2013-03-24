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
    <@html.head title='Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей'>
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
см. #incapable_enable-->
                    <@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>

                <#-- По умолчанию: Не активирован

Логика:
см. #incapable_enable-->
                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается  уполномоченным представителем.
<br>В этом случае необходимо:
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность уполномоченного представителя и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: Не активирован

Логика:
1. При деактивированном incapable_enable и деактивированном dov_enable  осуществляется
переход на ШАГ 2 (ШАГ 3,4,5,6 пропускаются)
2. При деактивированном incapable_enable и активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5,6 пропускаются)
3. При активированном incapable_enable и деактивированном dov_enable  осуществляется
переход на ШАГ 4,6 (ШАГ 2,3,5 пропускаются)
4. При активированном  incapable_enable и активированном dov_enable  осуществляется переход на ШАГ 5,6 (ШАГ 2,3,4 пропускаются)-->
                    <@sf.label path="form.incapable_enable" title="Заявитель представляет интересы недееспособного лица:" required=false style="text-align:left;" colspan="18"/>

                <#-- По умолчанию: Не активирован

Логика:
1. При деактивированном incapable_enable и деактивированном dov_enable  осуществляется
переход на ШАГ 2 (ШАГ 3,4,5,6 пропускаются)
2. При деактивированном incapable_enable и активированном dov_enable  осуществляется переход на ШАГ 3 (ШАГ 2,4,5,6 пропускаются)
3. При активированном incapable_enable и деактивированном dov_enable  осуществляется
переход на ШАГ 4,6 (ШАГ 2,3,5 пропускаются)
4. При активированном  incapable_enable и активированном dov_enable  осуществляется переход на ШАГ 5,6 (ШАГ 2,3,4 пропускаются)-->
                    <@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подается  законным представителем.
<br>В этом случае необходимо:
<br>1. Внести в соответствующие поля сведения о заявителе
<br>2. На шаге, предназначенном для представления вместе с заявлением электронных документов приложить документ, удостоверяющий личность законного представителя и документ, подтверждающий право законного представителя."  style="text-align:left;" colspan="31"/>

                    <@sf.empty colspan="29"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
