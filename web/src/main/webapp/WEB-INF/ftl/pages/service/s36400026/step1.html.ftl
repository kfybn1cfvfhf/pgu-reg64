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
    <@html.head title='Содействие работодателям в подборе необходимых работников'>
        <@script.scripttag>
            <@jquery.onready>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.statictext style="text-align:left;" colspan="46"><h2>Укажите данные об организации или индивидуальном предпринимателе</h2></@sf.statictext>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Наименование юридического лица / Фамилия, имя, отчество (если имеется) индивидуального предпринимателя:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<@sf.textfield  path="form.brandName" qtip="" validation="required" style="text-align:left;" colspan="37"/>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- дата в прошлом-->
                        <@sf.label title="Дата регистрации ЕГРЮЛ/ЕГРИП:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- дата в прошлом-->
                        <@sf.datefield path="form.ogrnDate"  qtip="" validation="required" style="text-align:left;" colspan="8"/>

						<@sf.empty colspan="32"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- Либо ОГРН ЮЛ либо ОГРН ИП-->
                        <@sf.label title="ОГРН:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- Либо ОГРН ЮЛ либо ОГРН ИП-->
                        <@sf.textfield  path="form.ogrn" qtip="" validation="required ogrn" style="text-align:left;" colspan="25"/>

						<@sf.empty colspan="15"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Организационно-правовая форма:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

                        <@sf.dictionaryLookup path="form.orgFormCode" dictionaryCode="ORGANIZATION_LEGAL_FORM" qtip="" validation="required" style="text-align:left;" colspan="37"/>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Форма собственности:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

                        <@sf.dictionaryLookup path="form.ownershipCode" dictionaryCode="FORM_OF_OWNERSHIP" qtip="" validation="required" style="text-align:left;" colspan="37"/>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Вид экономической деятельности (по ОКВЭД):" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<@sf.dictionaryLookup path="form.okvedCode" dictionaryCode="TYPES_OF_ECONOMIC_ACTIVITIES" qtip="" validation="required" style="text-align:left;" colspan="37"/>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
