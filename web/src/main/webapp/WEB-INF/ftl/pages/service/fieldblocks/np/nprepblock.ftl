<#-- Block of input fields used when representative of natural person handing in an application -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#import "identitydocblock.ftl" as identityDoc>
<#import "repblock.ftl" as representative>

<#macro renderNaturalPersonRepresentativeFieldBlock
    nameFieldBlockRenderer
    contactInfoFieldBlockRenderer
    representativeFieldBlockRenderer
>

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об уполномоченном представителе</h2></@sf.statictext>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>

    </@sf.fldrow>
    <@representativeFieldBlockRenderer />

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>

    </@sf.fldrow>
    <@nameFieldBlockRenderer />

    <@contactInfoFieldBlockRenderer />

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>

    </@sf.fldrow>

    <@script.scripttag>

        function clearIdentityDocAttributes() {
            $("#passSeria").val("");
            $("#passNo").val("");
            $("#passFrom").val("");
            $("#passDate").val("");
        }

        <@jquery.onready>
            <@customValidators.addCustomValidators />

            <#-- При выборе заявителем того типа удостоверяющего документа, который указан у него в ЛК,
                 заполняем остальные реквизиты удостоверяющего документа данными из ЛК -->
            $("#identityDocType").change(function(eventObj){
                clearIdentityDocAttributes(eventObj.target.value);
            });

        </@jquery.onready>
    </@script.scripttag>
    <@identityDoc.renderIdentityDocBlock />

</#macro>