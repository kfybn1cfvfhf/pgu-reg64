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
    <@html.head title='Назначение единовременного пособия при всех формах устройства детей-сирот и детей, оставшихся без попечения родителей, в семью'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='childSvedClone' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.initAllClones formElement=form.lastNameChild cloneSectionClass="childSvedClone" ; x>
                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.statictext style="text-align:left;" class='clone-field' colspan="48"><h2>Сведения о ребенке
                            переданном на воспитание в семью</h2></@sf.statictext>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.lastNameChild[${x}]" class='clone-field' title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.textfield  path="form.lastNameChild[${x}]" class='clone-field' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.firstNameChild[${x}]" class='clone-field' title="Имя:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.textfield  path="form.firstNameChild[${x}]" class='clone-field' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.middleNameChild[${x}]" class='clone-field' title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                        <@sf.textfield  path="form.middleNameChild[${x}]" class='clone-field' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic"  style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.birthdateChild[${x}]" class='clone-field' title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.datefield path="form.birthdateChild[${x}]" class='clone-field'  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                    <#-- 03_STAT_CHILD_64219
Значения:
1. Опекаемый
2. Находится под попечительством
3. Усыновлен
4. Находится в приемной семье

Логика:
1. При выборе значения 1 или 2 отображается поле #docOpec
2. При выборе значения 3 отображается поле #docUsin
3. При выборе значения 4 отображаетя поле #docPriemS-->
                        <@sf.label path="form.stat_child" class='clone-field' title="Статус ребенка:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.dictionaryLookup path="form.stat_child[${x}]" class='clone-field' dictionaryCode="03_STAT_CHILD_64219" qtip="Выберите из справочника статус ребенка, переданного на воспитание в семью." validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.statictext style="text-align:left;" class='clone-field' colspan="48"><h2>Сведения о
                            документе, подтверждающем передачу ребенка на воспитание в семью</h2></@sf.statictext>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.vospitDocType[${x}]" class='clone-field' title="Вид документа подтверждающего передачу ребенка на воспитание в семью:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.textfield  path="form.vospitDocType[${x}]" class='clone-field' qtip="" validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.vospitNo[${x}]" class='clone-field' title="Номер документа:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.textfield  path="form.vospitNo[${x}]" class='clone-field' qtip="" validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.vospitData[${x}]" class='clone-field' title="Дата принятия решения:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.datefield path="form.vospitData[${x}]" class='clone-field'  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.vospitData_ZS[${x}]" class='clone-field' title="Дата вступления документа в законную силу:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.datefield path="form.vospitData_ZS[${x}]" class='clone-field'  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label path="form.vospitFrom[${x}]" class='clone-field' title="Наименование органа выдавшего документ:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.textarea path="form.vospitFrom[${x}]" class='clone-field' qtip="" validation="required" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.statictext style="text-align:left;" colspan="48"><i>
                            Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением
                            электронной копии документа.
                            Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                            DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                            образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного
                            всеми необходимыми подписями и печатями.
                        </i></@sf.statictext>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>

                        <@sf.label  title="Документ, подтверждающий факт передачи ребенка на воспитание в семью:" required=true style="text-align:left;" colspan="48"/>

                    </@sf.fldrow>

                    <@sf.fldrow  class='childSvedClone'>
                        <@sf.fileload path="form.vospitDocLoad[${x}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"
                        qtip="В случае, если ребенок находится под опекой или попечительством, необходимо приложить решение органа опеки и попечительства об установлении над ребенком опеки (попечительства).<br>
<br>В случае, если ребенок усыновлен, необходимо приложить вступившее в законную силу решение суда об усыновлении (удочерении).<br>
<br>В случае, если ребенок передан на воспитание в приемную семью, необходимо приложить договор о передаче ребенка на воспитание в приемную семью" class='clone-field'  style="text-align:left;" colspan="48"/>

                    </@sf.fldrow>



                    <@sf.fldrow  class='childSvedClone'>


                        <@sf.addRemoveButton addTitle="Добавить сведения о ребенке, переданном на воспитание в семью" delTitle="Удалить"  colspan="41"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
