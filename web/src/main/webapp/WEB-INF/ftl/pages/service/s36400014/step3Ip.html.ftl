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
    <@html.head title='Получение лицензии на фармацевтическую деятельность индивидуальными предпринимателями'>
        <@script.scripttag>

            function cloneDep (cloneNum){
                window.__lookup__farmWorks_1_0__config.dependsOn[0].fieldId = "objectLicensKind_1["+cloneNum+"]";
                window.__lookup__farmWorks_1_0__config.parentLookup.fieldId = "objectLicensKind_1["+cloneNum+"]";

                $('textarea[name="licensAdress_1[' + cloneNum + ']"]').parents("tr.fieldrow").prev("tr.fieldrow").find("h2").text("Объект лицензирования "+(cloneNum+1));
            }

            <@jquery.onready>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-licenseobject" hideButtonSections="true" onAfterReindexClone='cloneDep(index)' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
			    <@sf.initAllClones formElement=form.licensAdress_1 cloneSectionClass="clonesection-licenseobject" ; x>
                    <@sf.fldrow class="clonesection-licenseobject">

                            <#-- блок копируется по кнопке "добавить объект" с добавлением порядкового номера от 1 до N-->
                            <@sf.statictext style="text-align:left;" colspan="48"><h2>Объект лицензирования ${x+1}</h2></@sf.statictext>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesection-licenseobject">

                            <@sf.label title="Адрес места осуществления деятельности (с указанием индекса):" required=true style="text-align:left;" colspan="11"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textarea path="form.licensAdress_1[${x}]" qtip="" validation="required" class="clone-field" style="text-align:left;" colspan="25"/>

                            <@sf.empty colspan="11"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesection-licenseobject">

                            <#-- Выбирается из справочника «Вид обособленного объекта»-->
                            <@sf.label title="Вид обособленного объекта:" required=true style="text-align:left;" colspan="11"/>

                            <@sf.empty colspan="1"/>

                            <#-- Выбирается из справочника «Вид обособленного объекта»-->
                            <@sf.dictionaryLookup path="form.objectLicensKind_1[${x}]" dictionaryCode="VID_OBJ_FARMA" qtip="" validation="required" class="clone-field" style="text-align:left;" colspan="25"/>

                            <@sf.empty colspan="11"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesection-licenseobject">

                            <#-- Выбирается из справочника «Виды работ фармацевтической деятельности». Список отображаемых элементов соответствует выбранному значению в поле «Вид обособленного объекта». При смене значения поля «Вид обособленного объекта», данное поле очищается-->
                            <@sf.label title="Виды работ, осуществляемые на объекте:" required=true style="text-align:left;" colspan="11"/>

                            <@sf.empty colspan="1"/>

                            <#-- Выбирается из справочника «Виды работ фармацевтической деятельности». Список отображаемых элементов соответствует выбранному значению в поле «Вид обособленного объекта». При смене значения поля «Вид обособленного объекта», данное поле очищается-->
                            <@sf.checkboxLookup path="form.farmWorks_1[${x}]" dictionaryCode="VID_RABOT_FARMA" dependsOn=[{'fieldId': 'objectLicensKind_1[${x}]'}] parentLookup={'fieldId': 'objectLicensKind_1[${x}]'} qtip="" validation="required" class="clone-field" style="text-align:left;" colspan="25"/>

                            <@sf.empty colspan="11"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesection-licenseobject">

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="11"/>

                            <@sf.empty colspan="37"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
