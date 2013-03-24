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
    <@html.head title='Предоставление социальных выплат за счет средств областного бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений, при реализации областных целевых программ'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.cloneFormRowWithArrays clonesectionclass='famClone' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='sostavDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='agree1DocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='famIdentityDocLoadClass' hideButtonSections='true'/>


            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>
                    <@sf.label path="form.famQuantity" title="Количество членов семьи:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.textfield  path="form.famQuantity" qtip="" validation="required digits" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о члене
                        семьи</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.famlastName cloneSectionClass='famClone' ; x>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.famlastName" title="Фамилия:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield  path="form.famlastName[${x}]" class="clone-field" qtip="" validation="required cyrillic" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.famfirstName" title="Имя:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield  path="form.famfirstName[${x}]" class="clone-field" qtip="" validation="required cyrillic" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.fammiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="18"/>
                        <@sf.textfield  path="form.fammiddleName[${x}]" class="clone-field" qtip="" validation="cyrillic" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.fambirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.datefield path="form.fambirthdate[${x}]" class="clone-field"  qtip="" validation="required" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.famkin" title="Родственные отношения:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textarea path="form.famkin[${x}]" class="clone-field" qtip="" validation="required cyrillic" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.addRemoveButton addTitle="Добавить сведения о члене семьи" delTitle="Удалить" colspan="31"/>
                        <@sf.empty colspan="46"/>
                    </@sf.fldrow>

                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS. Множественная загрузка-->
                    <@sf.label path="form.famIdentityDocLoad" title="Копия документа, удостоверяющего личность члена семьи:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.famIdentityDocLoad cloneSectionClass="famIdentityDocLoadClass" ; y>
                    <@sf.fldrow class="famIdentityDocLoadClass">
                        <@sf.fileload path="form.famIdentityDocLoad[${y}]" qtip="Для совершеннолетних членов семьи необходимо приложить паспорт (копии всех страниц).-->
<#--<br>Для несовершеннолетних членов семьи необходимо приложить свидетельство о рождении" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="famIdentityDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных
                        копий документов.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
                    <@sf.label path="form.sostavDocLoad" title="Документы, подтверждающие состав семьи:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.sostavDocLoad cloneSectionClass="sostavDocLoadClass" ; x>
                    <@sf.fldrow class="sostavDocLoadClass">
                        <@sf.fileload path="form.sostavDocLoad[${x}]" qtip="В качестве документов, подтверждающих состав семьи к заявлению могут быть приложены следующие документы:
<br>1. Свидетельство о браке;
<br>2. Свидетельство о рождении;
<br>3. Свидетельство о расторжении брака;
<br>4. Свидетельство о смене имени, фамилии, отчества;
<br>5. Свидетельство о смерти;
<br>6. Решение соответствующего суда о признании гражданина членом семьи заявителя;
<br>7. Иные документы в соответствии с административным регламентом;" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="sostavDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.agree1DocLoad" title="Согласие на обработку персональных данных всех членов семьи заявителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.agree1DocLoad cloneSectionClass="agree1DocLoadClass" ; x>
                    <@sf.fldrow class="agree1DocLoadClass">
                        <@sf.fileload path="form.agree1DocLoad[${x}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="agree1DocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
