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
    <@html.head title='Предоставление в соответствии с законодательством земельных участков, находящихся в государственной собственности Саратовской области'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue 'true' 'soughtRight' 'change' 'termUse' "1,4"/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Характеристики земельного
                        участка</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.square" title="Площадь:" required=true style="text-align:left;" colspan="18"/>

                    <@sf.textfield  path="form.square" qtip="" validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.landmark" title="Адресные ориентиры:" required=true style="text-align:left;" colspan="18"/>

                    <@sf.textfield  path="form.landmark" qtip="" validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.purposeUse" title="Цель использования:" required=true style="text-align:left;" colspan="18"/>

                    <@sf.textfield  path="form.purposeUse" qtip="" validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.cadastralRight" title="Кадастровый номер:" required=true style="text-align:left;" colspan="18"/>

                    <@sf.textfield  path="form.cadastralRight" qtip="" validation="required" style="text-align:left;" colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.soughtRight" title="Испрашиваемое право:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.dictionaryLookup path="form.soughtRight" dictionaryCode="03_SOUGHT_RIGHT_64208" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.termUse" title="Срок использования:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.textfield  path="form.termUse" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля
                        предназначены для представления вместе с заявлением электронных копий документов. Электронная
                        копия каждого документа должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX,
                        JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ
                        соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по
                        собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.egrpDocLoad" title="Свидетельство из Единого государственного реестра прав на недвижимое имущество на земельный участок:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.egrpDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.kadastrDocLoad" title="Кадастровый паспорт земельного участка:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.kadastrDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
