<#-- Block of fields to input identity doc data -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#macro renderIdentityDocBlockNoFile>

    <@sf.fldrow>

            <@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>

            <@sf.customLookup controller="MainDocTypeController" optionsMap={'authToken':cAuthToken} path="form.identityDocType" qtip="" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>

            <@sf.datefield path="form.passDate" qtip="" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textarea path="form.passFrom"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

</#macro>

<#macro renderIdentityDocBlock>

    <@renderIdentityDocBlockNoFile />

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.identityDocLoad" qtip="" validation="required" style="text-align:left;" validation="required" colspan="48"/>

    </@sf.fldrow>
</#macro>