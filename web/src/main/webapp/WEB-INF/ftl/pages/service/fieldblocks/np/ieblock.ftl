<#-- Block of fields for individual enterpreneur data input -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#macro renderIndividualEntrepreneurFieldBlock>
    <@sf.fldrow>

            <@sf.statictext attr='id="ipLabel"' style="text-align:left;" colspan="48"><h2>Сведения о регистрации заявителя в качестве индивидуального предпринимателя</h2></@sf.statictext>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.inn" title="Индивидуальный номер налогоплательщика:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.inn" qtip="Вносится в формате: XXXXXXXXXXXXX, где X – одна обязательная цифра (12 цифр)" validation="innind required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.ogrnip" title="Основной государственный регистрационный номер индивидуального предпринимателя:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.ogrnip" qtip="Вносится в формате: XXXXXXXXXXXXXXX, где X – одна обязательная цифра (15 цифр)" validation="ipregno required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.statictext attr='id="ipNote"' style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.statictext attr = 'id="ipMv"' style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.docMvRegIP" title="Копия свидетельства о государственной регистрации физического лица в качестве индивидуального предпринимателя:" required=false style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.docMvRegIP" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" qtip="" style="text-align:left;" colspan="48"/>

    </@sf.fldrow>
</#macro>