<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача решения о переводе или об отказе в переводе жилого помещения в нежилое или нежилого помещения в жилое помещение'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='ul_owner' hideButtonSections='true'/>
                <@customValidators.addCustomValidators />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
                <@sf.initAllClones formElement=form.ul_owner_FullTitle cloneSectionClass='ul_owner' ; y>
                    <@sf.fldrow class="ul_owner">
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о собственнике помещения, являющемся юридическим лицом</h2></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.label path="form.ul_owner_FullTitle" title="Полное наименование организации:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.dictionaryLookup path="form.ul_owner_opf[${y}]" class="clone-field" dictionaryCode="FORM_OF_INCORPORATION_64" qtip="Организационно-правовая форма" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.empty colspan="17" />
                        <@sf.textarea path="form.ul_owner_FullTitle[${y}]" class="clone-field" qtip="Наименование организации" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.label path="form.ul_owner_SmallTitle" title="Сокращенное наименование организации:" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.ul_owner_SmallTitle[${y}]" class="clone-field" qtip=""  style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем полномочия заявителя представлять интересы собственника жилья (юридического лица)</h2></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.label path="form.ul_owner_docType" title="Тип документа:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textarea path="form.ul_owner_docType[${y}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.label path="form.ul_owner_docNum" title="Номер документа:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.ul_owner_docNum[${y}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.label path="form.ul_owner_docDate" title="Дата выдачи документа:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.datefield path="form.ul_owner_docDate[${y}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.statictext style="text-align:left;" colspan="48"><i>
                            Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа.
                            Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
                        </i></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.label path="form.ul_owner_DocLoad" title="Документ, удостоверяющий полномочия заявителя представлять интересы собственника жилья (юридического лица):" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.fileload path="form.ul_owner_DocLoad[${y}]" class="clone-field" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="ul_owner">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>


                </@sf.initAllClones>
                    </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
