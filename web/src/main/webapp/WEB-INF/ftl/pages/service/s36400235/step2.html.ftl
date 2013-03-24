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
    <@html.head title='Предоставление гражданам компенсации за счет средств областного бюджета на возмещение части расходов по оплате процентов ипотечного займа (кредита) '>
        <@script.scripttag>
            <@jquery.onready>

                <@action.cloneFormRowWithArrays clonesectionclass='compFamilyClone' hideButtonSections='true'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                <#-- Блок клонируемых полей:
familyLastName
familyLastName
familyMiddleName
familyRelation
ipDocNote
identityFamilyDocLoad
compFamilyDocLoad
Код родительского элемента: compFamilyClone-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о составе
                        семьи</h2></@sf.statictext></@sf.fldrow>

                <@sf.initAllClones formElement=form.familyLastName cloneSectionClass='compFamilyClone' ; x>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                        <@sf.label path="form.familyLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.familyLastName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                        <@sf.label path="form.familyFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.familyFirstName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                        <@sf.label path="form.familyMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.familyMiddleName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- 64_FAMILY_RELATION_64235-->
                        <@sf.label path="form.familyRelation" title="Родственные отношения:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.dictionaryLookup path="form.familyRelation[${x}]" class="clone-field" dictionaryCode="64_FAMILY_RELATION_64235" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                        <@sf.statictext style="text-align:left;" colspan="48"><i>
                            Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением
                            электронной копии документа.
                            Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                            DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                            образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного
                            всеми необходимыми подписями и печатями.
                        </i></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.label path="form.identityFamilyDocLoad" title="Копия документа, удостоверяющего личность члена семьи:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.fileload path="form.identityFamilyDocLoad[${x}]" class="clone-field" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Необходимы копии всех страниц документа" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.label path="form.compFamilyDocLoad" title="Копия документа, подтверждающего состав семьи:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                    <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.fileload path="form.compFamilyDocLoad[${x}]" class="clone-field" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Копия свидетельства о браке, копия свидетельства о расторжении брака, копии свидетельства о рождении всех членов семьи, копия решения соответствующего суда о признании гражданина членом семьи заявителя; в случае расторжения брака - справка о заключении брака по форме N 28, утвержденной постановлением Правительства Российской Федерации от 31 октября 1998 г. N 1274 \"Об утверждении форм бланков заявлений о государственной регистрации актов гражданского состояния, справок и иных документов, подтверждающих государственную регистрацию актов гражданского состояния\"" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="compFamilyClone">
                        <@sf.addRemoveButton addTitle="Добавить сведения о члене семьи" delTitle="Удалить" colspan="31"/>
                        <@sf.empty colspan="46"/>
                    </@sf.fldrow>

                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Логика:
1. При активации отображается поле #noEGRPDocLoad и скрывается поле #EGRPDocLoad
2. При деактивации скрывается поле #noEGRPDocLoad и отображается поле #EGRPDocLoad-->
                    <@sf.label path="form.noEGRP" title="Право собственности на жилое помещение не зарегистрировано в Едином государственном реестре прав на недвижимое имущество и сделок с ним:" required=false style="text-align:left;" colspan="18"/>
                    <@sf.checkbox path="form.noEGRP" qtip=""  style="text-align:left;" colspan="31"/>
                    <@sf.empty colspan="29"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
