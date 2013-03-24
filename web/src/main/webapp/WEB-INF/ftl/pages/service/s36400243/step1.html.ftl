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
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.org_name" title="Полное наименование юридического лица:" required=true style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.org_name" qtip="" validation="required maxlength" validationattr={"maxlength": 400}
                        attr='maxlength="400"' style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.opf" title="Организационно-правовая форма:" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.opf" dictionaryCode="VARIANT_OPF_LS" qtip=""  style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- В строку можно ввести только строку следующего формата: «ххххххххххххххх», где х=0…9, т.е. 13 цифр-->
                    <@sf.label path="form.ogrn" title="ОГРН:" required=true style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <#-- В строку можно ввести только строку следующего формата: «ххххххххххххххх», где х=0…9, т.е. 13 цифр-->
                    <@sf.textfield  path="form.ogrn" qtip="" validation="required ogrnlegal maxlength"
                            validationattr={"maxlength":13} attr="maxlength='13'" style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- В строку можно ввести только строку следующего формата: «хххххххххххх», где х=0…9, т.е. 10 цифр-->
                    <@sf.label path="form.inn" title="ИНН:" required=true style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <#-- В строку можно ввести только строку следующего формата: «хххххххххххх», где х=0…9, т.е. 10 цифр-->
                    <@sf.textfield  path="form.inn" qtip="" validation="required innlegal maxlength"
                            validationattr={"maxlength":10} attr="maxlength='10'" style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.ownership" title="Форма собственности:" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.ownership" dictionaryCode="VARIANT_OWNERSHIP_LS" qtip=""  style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.okved" title="Вид экономической деятельности (по ОКВЭД):" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.okved" dictionaryCode="VARIANT_OKVED_LS" qtip=""  style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.boss_name" title="Ф.И.О. руководителя:" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.boss_name" qtip="" validation="maxlength" validationattr={"maxlength": 255} attr='maxlength="255"'
                        style="text-align:unknown;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.boss_phone" title="Контактный телефон руководителя:" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.boss_phone" qtip="" validation="phone" style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
