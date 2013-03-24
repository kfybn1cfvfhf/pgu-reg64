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
    <@html.head title='Предоставление лицензии на ведение деятельности, связанной с оборотом наркотических средств и психотропных веществ'>
        <@script.scripttag>
            <@jquery.onready>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesectionDrugAction" hideButtonSections="true" />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

				<@sf.initAllClones formElement=form.actionKind cloneSectionClass="clonesectionDrugAction" ; x>
                    <@sf.fldrow class="clonesectionDrugAction">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Виды деятельности:" required=true style="text-align:left;" colspan="21"/>

                            <@sf.empty colspan="1"/>

                            <@sf.checkboxLookup dictionaryCode='DRUGS_TURNOVER_ACTION_KIND' path="form.actionKind[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="24"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionDrugAction">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адрес места осуществления деятельности (с указанием индекса):" required=true style="text-align:left;" colspan="21"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textarea path="form.license_objects_address[${x}]" qtip="" class="clone-field" validation="required" style="text-align:left;" colspan="24"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionDrugAction">

                            <@sf.empty colspan="1"/>

                            <#-- При нажатии Добавить клонируется весь блок-->
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="7"/>

                            <@sf.empty colspan="40"/>

                    </@sf.fldrow>
				</@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
