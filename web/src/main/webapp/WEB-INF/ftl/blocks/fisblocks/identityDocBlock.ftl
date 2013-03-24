<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<#import "/custom/validators.ftl" as customValidators>

<#--
Список опций для блока identityDocBlock
clearOnChange: true - чистить при изменении (не выставлять значения из лк)
noScript: true - Без действий.
noBlockTitle: true; - без заголовка блока
blockTitle: "бла бла бла бла" - кастомный текст заголовка
noFile: true - без файла и статика о загрузки файла
fileLoadTitle: "бла бла бла" - Кастомный статик о загрузке файлов
fileTitle: "бла бла бла бла" - Кастомный заголовок к файлу
-->

<#macro identityDocBlock identityDocBlockSettings>

    <#assign settings = identityDocBlockSettings>

    <#if !settings??>
        <#assign settings = {} />
    </#if>

    <#if !settings.noBlockTitle?? >
        <#assign settings = settings + {
            "noBlockTitle":false
        } />
    </#if>

    <#if !settings.noFile??>
        <#assign settings = settings + {
            "noFile":false
        } />
    </#if>

    <#if !settings.noScript??>
        <#assign settings = settings + {
            "noScript":false
        } />
    </#if>

    <#if !settings.clearOnChange??>
        <#assign settings = settings + {
            "clearOnChange":false
        } />
    </#if>

    <#if !settings.noScript>
        <@script.scripttag>
            var IdentityDocTypeCurrentValue;

            <#if settings.clearOnChange>

                function identityDocTypeChenge () {
                    if(IdentityDocTypeCurrentValue != $('#identityDocBlock\\.identityDocType').attr('value')) {
                        $('#identityDocBlock\\.passSeria').attr('value', '');
                        $('#identityDocBlock\\.passNo').attr('value','');
                        $('#identityDocBlock\\.passFrom').attr('value','');
                        $('#identityDocBlock\\.passDate').attr('value','');
                    }
                    IdentityDocTypeCurrentValue = $('#identityDocBlock\\.identityDocType').attr('value');
                }

            <#else>

                function identityDocTypeChenge () {
                    if(IdentityDocTypeCurrentValue != $('#identityDocBlock\\.identityDocType').attr('value'))
                        if($('#identityDocBlock\\.identityDocType').attr('value') != ${privateRoomData.identityDocType}) {
                            $('#identityDocBlock\\.passSeria').attr('value', '');
                            $('#identityDocBlock\\.passNo').attr('value','');
                            $('#identityDocBlock\\.passFrom').attr('value','');
                            $('#identityDocBlock\\.passDate').attr('value','');
                        } else {
                            $('#identityDocBlock\\.passSeria').attr('value', '${privateRoomData.passSeria}');
                            $('#identityDocBlock\\.passNo').attr('value', '${privateRoomData.passNo}');
                            $('#identityDocBlock\\.passDate').attr('value', '${(privateRoomData.passDate?string('dd.MM.yyyy'))!}');
                            $('#identityDocBlock\\.passFrom').attr('value', '${privateRoomData.passFrom}');
                        }
                        IdentityDocTypeCurrentValue = $('#identityDocBlock\\.identityDocType').attr('value');
                    }
            </#if>

            <@jquery.onready>
                $('#identityDocBlock\\.identityDocType').change(function() { identityDocTypeChenge () });
            </@jquery.onready>
        </@script.scripttag>
    </#if>


    <#if !settings.noBlockTitle>

        <#if identityDocBlockSettings.blockTitle??>
            <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>${identityDocBlockSettings.blockTitle}</h2></@sf.statictext></@sf.fldrow>
        <#else>
            <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext></@sf.fldrow>
        </#if>

    </#if>

    <@sf.fldrow>
        <#if settings.identityDocTypeLabel??>
            <@sf.label path="form.identityDocBlock.identityDocType" title="${identityDocBlockSettings.identityDocTypeLabel}" required=true style="text-align:left;" colspan="17"/>
        <#else>
            <@sf.label path="form.identityDocBlock.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
        </#if>
            <@sf.dictionaryLookup path="form.identityDocBlock.identityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
           <#-- <@sf.customLookup path="form.identityDocBlock.identityDocType" controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'} qtip="" validation="required" style="text-align:left;" colspan="31"/> -->
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.label path="form.identityDocBlock.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
        <@sf.textfield  path="form.identityDocBlock.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.label path="form.identityDocBlock.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
        <@sf.textfield  path="form.identityDocBlock.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.label path="form.identityDocBlock.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
        <@sf.datefield path="form.identityDocBlock.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.label path="form.identityDocBlock.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
        <@sf.textarea path="form.identityDocBlock.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
    </@sf.fldrow>

    <#if !settings.noFile>
        <@sf.fldrow>
            <#if !settings.fileLoadTitle??>
                <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
            <#else>
                <@sf.statictext style="text-align:left;" colspan="48"><i>${settings.fileLoadTitle}</i></@sf.statictext>
            </#if>
        </@sf.fldrow>

        <@sf.fldrow>
            <#if !settings.fileTitle??>
                <@sf.label path="form.identityDocBlock.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>
            <#else>
                <@sf.label path="form.identityDocBlock.identityDocLoad" title="${settings.fileTitle}" required=true style="text-align:left;" colspan="48"/>
            </#if>
        </@sf.fldrow>
        <@sf.fldrow>

              <@sf.fileload path="form.identityDocBlock.identityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

        </@sf.fldrow>
    </#if>
</#macro>