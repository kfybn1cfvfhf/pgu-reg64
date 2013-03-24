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

                <@action.cloneFormRowWithArrays clonesectionclass='quartClone' hideButtonSections='true'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>

                <@sf.initAllClones formElement=form.date cloneSectionClass='quartClone' ; x>

                    <@sf.fldrow><@sf.statictext style="text-align:left;" attr="id='quartLabel'" colspan="48"><h2>Квартал
                        исчисления величины прожиточного минимума</h2></@sf.statictext></@sf.fldrow>

                    <@sf.fldrow class="quartClone">
                        <@sf.label path="form.quart" title="За квартал:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.dictionaryLookup path="form.quart[${x}]" class="clone-field" dictionaryCode="64_QUARTER_64233" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="quartClone">
                        <@sf.label path="form.year" title="Года:" required=true style="text-align:left;" colspan="17"/>
                        <#--<@sf.datefield path="form.year[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>-->
                        <@sf.datefieldYear path="form.year[${x}]" class="clone-field" qtip="" validation="required" toYear="1993" style="text-align:left;" colspan="6"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="quartClone">
                        <@sf.addRemoveButton addTitle="Добавить квартал" delTitle="Удалить"  colspan="48"/>
                        <@sf.empty colspan="46"/>
                    </@sf.fldrow>

                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
