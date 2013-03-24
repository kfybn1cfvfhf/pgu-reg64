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
                <@action.cloneFormRowWithArrays clonesectionclass='fl_owner' hideButtonSections='true'/>
                <@customValidators.addCustomValidators />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
                <@sf.initAllClones formElement=form.fl_owner_lastName cloneSectionClass='fl_owner' ; x>
                    <@sf.fldrow class="fl_owner">
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о собственнике помещения,
                            являющемся физическим лицом</h2></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.fl_owner_lastName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.fl_owner_firstName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.fl_owner_middleName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем
                            полномочия заявителя представлять интересы собственника жилья (физического
                            лица)</h2></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_docType" title="Тип документа:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textarea path="form.fl_owner_docType[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_docNum" title="Номер документа:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.fl_owner_docNum[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_docDate" title="Дата выдачи документа:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.datefield path="form.fl_owner_docDate[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.statictext style="text-align:left;" colspan="48"><i>
                            Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением
                            электронной копии документа.
                            Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                            DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                            образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного
                            всеми необходимыми подписями и печатями.
                        </i></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.label path="form.fl_owner_DocLoad" title="Документ, удостоверяющий полномочия заявителя представлять интересы собственника жилья (физического лица):" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.fileload path="form.fl_owner_DocLoad[${x}]" class="clone-field" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="fl_owner">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>

                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
