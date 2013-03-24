<#-- Block of fields used when natural person handing in an application by his self -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#import "identitydocblock.ftl" as identityDoc>

<#macro renderNaturalPersonFieldBlock
    nameFieldBlockRenderer
    contactInfoFieldBlockRenderer
>
    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. Если в заявлении указаны неверные данные заявителя, необходимо выполнить одно из следующих действий:<br/>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;<br/>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>

    </@sf.fldrow>
    <@nameFieldBlockRenderer />

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><i>Поля «Адрес регистрации», «Адрес места жительства (пребывания)», «Контактный телефон» заполняются на основании учетной записи на портале.Могут быть изменены в ходе заполнения формы заявления</i></@sf.statictext>

    </@sf.fldrow>

    <@contactInfoFieldBlockRenderer />

    <@sf.fldrow>

            <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>

    </@sf.fldrow>

    <@script.scripttag>

        function setIdentityDocAttributesByType(identitytDocTypeId) {
            if (identitytDocTypeId == "${privateRoomData.identityDocType}") {
                $("#passSeria").val("${privateRoomData.passSeria}");
                $("#passNo").val("${privateRoomData.passNo}");
                $("#passFrom").val("${privateRoomData.passFrom}");
                <#if privateRoomData.passDate??>
                $("#passDate").val("${privateRoomData.passDate?string("dd.MM.yyyy")}");
                <#else>
                $("#passDate").val('');
                </#if>
            } else {
                $("#passSeria").val("");
                $("#passNo").val("");
                $("#passFrom").val("");
                $("#passDate").val("");
            }
        }

        <@jquery.onready>
            <@customValidators.addCustomValidators />

            <#-- При выборе заявителем того типа удостоверяющего документа, который указан у него в ЛК, заполняем остальные реквизиты удостоверяющего документа данными из ЛК -->
            $("#identityDocType").change(function(eventObj){
                setIdentityDocAttributesByType(eventObj.target.value);
            });

        </@jquery.onready>
    </@script.scripttag>
    <@identityDoc.renderIdentityDocBlock />
</#macro>