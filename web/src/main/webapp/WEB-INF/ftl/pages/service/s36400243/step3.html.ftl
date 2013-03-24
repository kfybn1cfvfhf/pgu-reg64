<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../landresource/style.ftl" as st>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@st.style/>
    <@html.head title='Содействие работодателям в подборе необходимых работников'>
        <@script.scripttag>
            <@jquery.onready>
                // правка дизайна
                $('#experience').parent().parent().parent().find('div.field-qtip ').css('padding-left','5px');
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label id='label' title="Требования к работнику" style="text-align:left;" colspan="44" fieldset=true class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.education" title="Образование (не ниже):" required=false style="text-align:right;" colspan="12" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.education" dictionaryCode="VARIANT_EDUCATION_LS" qtip=""  style="text-align:unknown;" colspan="31" class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.spec" title="Профессия (должность):" required=false style="text-align:right;" colspan="12" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <#-- Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)-->
                    <@sf.dictionaryLookup path="form.spec" dictionaryCode="VARIANT_OKPDTR_LS" qtip=""  style="text-align:left;" colspan="31" class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.category" title="Квалификационный разряд, категория:" required=false style="text-align:right;" colspan="12" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.category" dictionaryCode="VARIANT_CATEGORY_LS" qtip=""  style="text-align:left;" colspan="31" class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.experience" title="Стаж работы (не менее):" required=false style="text-align:right;vertical-align: top !important;" colspan="12" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <#-- Сколько полных лет-->
                    <@sf.textfield  path="form.experience" qtip="Сколько полных лет" validation="digits maxlength" validationattr={"maxlength": 255} attr='maxlength="255"' style="text-align:left;" colspan="31" class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.min_age" title="Минимальный возраст:" required=false style="text-align:right;" colspan="12" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.min_age" qtip="" validation="digits" style="text-align:left;" colspan="5" class="clone-field"/>
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.max_age" title="Максимальный возраст:" required=false style="text-align:right;" colspan="10" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.max_age" qtip="" validation="digits" style="text-align:left;" colspan="5" class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.sex" title="Пол:" required=false style="text-align:right;" colspan="12" class="clone-field"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.sex" dictionaryCode="VARIANT_SEX_TYPES_LS" qtip=""  style="text-align:left;" colspan="31" class="clone-field"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="48"/>
                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
