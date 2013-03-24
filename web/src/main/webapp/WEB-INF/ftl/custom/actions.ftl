<#ftl encoding="UTF-8">
<#import "/jquery/action.ftl" as action>

<#macro uncheckByEmptyTextfield checkboxid textfieldid>

    $("#${textfieldid}").change(function(eventObj){
        if (eventObj.target.value.replace(/\s/g,"") == ""){
            $("#${checkboxid}").attr("checked", false);
            $("#${checkboxid}").parent().removeClass("selected");
        }
    });

</#macro>

<#macro makeFieldLabelRequiredByCheckbox onload checkboxId checkboxStatus labelId>

    <#switch checkboxStatus>
        <#case "on">
            <#local checkboxStatus="true">
            <#break>
        <#case "off">
            <#local checkboxStatus="false">
    </#switch>

    $("#${checkboxId}").change(function(eventObj){
        if ($(eventObj.target).is(":checked") === ${checkboxStatus}) {
            $("label#${labelId}.fieldprompt-label").addClass("fieldRequired");
        } else {
            $("label#${labelId}.fieldprompt-label").removeClass("fieldRequired");
        }
    });
    <#if onload>$("#${checkboxId}").change();</#if>

</#macro>

<#macro setCustomLookupValueByCheckbox onload checkboxId checkboxStatus lookupId dicItemCode="" dicItemName="">

    <#switch checkboxStatus>
        <#case "on">
            <#local checkboxStatus="true">
            <#break>
        <#case "off">
            <#local checkboxStatus="false">
    </#switch>

    $("#${checkboxId}").change(function(eventObj){
        if ($(eventObj.target).is(":checked") === ${checkboxStatus}) {
            <@setLookupValue lookupId dicItemCode dicItemName />
            if('${dicItemCode}' == '') {
                $("#${lookupId}-lookup-form-text").attr('value','[Выбрать]');
                $("#${lookupId}-lookup-form-clear-button").css('display','none');
            } else {
                $("#${lookupId}-lookup-form-clear-button").css('display','block');
            }
        }
    });

    <#if onload>$("#${checkboxId}").change();</#if>

</#macro>


<#macro setValueByCheckbox onload checkboxid checkboxstatus destid value="">

    <#switch checkboxstatus>
        <#case "on">
            <#local checkboxstatus="true">
            <#break>
        <#case "off">
            <#local checkboxstatus="false">
    </#switch>

    <#if value?is_date>
        <#local value=value?string('dd.MM.yyyy')>
    </#if>

    $("#${checkboxid}").change(function(eventObj){
        if ($(eventObj.target).is(":checked") === ${checkboxstatus}) {
            $("#${destid}").val("${value}");
        }
    });
    <#if onload>$("#${checkboxid}").change();</#if>

</#macro>

<#macro setLookupReadonly lookupId isReadonly>

    <#if isReadonly>
        <#-- перевод справочника в режим "только для чтения" -->

        <#-- отключение реакции на клик мышью -->
        if (typeof lookupClickHandlers != "object") lookupClickHandlers = {};
        if (($("#${lookupId}-lookup-form-text").data("events") != null) && (typeof $("#${lookupId}-lookup-form-text").data("events").click != "undefined")) {
            <#-- если есть обработчики клика на лукапе, сохраняем их -->
            lookupClickHandlers.${lookupId} = $.extend(true, {}, $("#${lookupId}-lookup-form-text").data("events").click);
        }
        $("#${lookupId}-lookup-form-text").unbind("click");
        <#-- затемняем поле -->
        $("#${lookupId}-lookup-form-text").parents("div.inputBasicWrap").addClass("fieldDisabled");
        <#-- скрываем кнопку очистки поля справочника -->
        $("#${lookupId}-lookup-form-clear-button").hide();
    <#else>
        <#-- отключение режима "только для чтения" -->

        <#-- включение реакции на клик мышью -->
        if ((typeof lookupClickHandlers == "object") && (typeof lookupClickHandlers.${lookupId} == "object")) {
            $.each(lookupClickHandlers.${lookupId}, function(key, handlerObj){
                if (typeof handlerObj == "object") $("#${lookupId}-lookup-form-text").click(handlerObj.handler);
            });
        }
        <#-- убираем затемнение с поля -->
        $("#${lookupId}-lookup-form-text").parents("div.inputBasicWrap").removeClass("fieldDisabled");
        <#-- показываем кнопку очистки поля справочника -->
        if ($("#${lookupId}").val()) $("#${lookupId}-lookup-form-clear-button").show();
    </#if>

</#macro>

<#macro setLookupValue lookupId dicItemCode dicItemName>

    $("#${lookupId}").val("${dicItemCode}");
    $("#${lookupId}-lookup-form-text").val("${dicItemName}");

</#macro>

<#macro setLookupReadonlyByCheckbox onload checkboxId checkboxStatus lookupId>

    <#switch checkboxStatus>
        <#case "on">
            <#local checkboxStatus="true">
            <#break>
        <#case "off">
            <#local checkboxStatus="false">
    </#switch>

    $("#${checkboxId}").change(function(eventObj){
        if ($(eventObj.target).is(":checked") === ${checkboxStatus}) {
            <@setLookupReadonly lookupId true />
        } else {
            <@setLookupReadonly lookupId false />
        }
    });
    <#if onload>$("#${checkboxId}").change();</#if>

</#macro>

<#macro setLookupValueByCheckbox onload checkboxId checkboxStatus lookupId dicItemCode dicItemName>

    <#switch checkboxStatus>
        <#case "on">
            <#local checkboxStatus="true">
            <#break>
        <#case "off">
            <#local checkboxStatus="false">
    </#switch>

    $("#${checkboxId}").change(function(eventObj){
        if ($(eventObj.target).is(":checked") === ${checkboxStatus}) {
            <@setLookupValue lookupId dicItemCode dicItemName />
        }
    });
    <#if onload>$("#${checkboxId}").change();</#if>

</#macro>

<#macro setVisibleCloneDocLoadClassByCheckbox onload checkboxId checkboxStatus CloneDocLoadClass>

    <#switch checkboxStatus>
        <#case "on">
            <#local checkboxStatus="true">
            <#break>
        <#case "off">
            <#local checkboxStatus="false">
    </#switch>

    $("#${checkboxId}").change(function(eventObj){
        if ($(eventObj.target).is(":checked") === ${checkboxStatus}) {
            $(".${CloneDocLoadClass}").show();
        } else {
           $(".${CloneDocLoadClass}").hide();
        }
    });
    <#if onload>$("#${checkboxId}").change();</#if>

</#macro>