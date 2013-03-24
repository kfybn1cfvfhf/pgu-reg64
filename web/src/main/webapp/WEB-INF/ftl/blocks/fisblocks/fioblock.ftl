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
Список опций для блока fioBlock
"readonly":true - блок только для чтения.
-->

<#macro fioBlock fioblockSettings>

    <#assign settings = fioblockSettings>

    <#if !settings??>
        <#assign settings = {} />
    </#if>

    <#if !settings.readonly?? >
        <#assign settings = settings + {
            "readonly":false
        } />
    </#if>

    <@sf.fldrow>
        <@sf.label path="form.fioBlock.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
        <#if settings.readonly>
            <@sf.textfield  path="form.fioBlock.lastName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>
        <#else>
            <@sf.textfield  path="form.fioBlock.lastName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
        </#if>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.label path="form.fioBlock.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
        <#if settings.readonly>
            <@sf.textfield  path="form.fioBlock.firstName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>
        <#else >
            <@sf.textfield  path="form.fioBlock.firstName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
        </#if>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.label path="form.fioBlock.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
        <#if settings.readonly >
            <@sf.textfield  path="form.fioBlock.middleName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="cyrillic" style="text-align:left;" colspan="31"/>
        <#else >
            <@sf.textfield  path="form.fioBlock.middleName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
        </#if>
    </@sf.fldrow>

</#macro>