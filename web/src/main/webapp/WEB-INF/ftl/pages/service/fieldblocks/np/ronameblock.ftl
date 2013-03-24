<#-- Block of read only fields to show first, last and middle names -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#macro renderReadOnlyNameFieldBlock>
    <@sf.fldrow>

            <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="cyrillic" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>
</#macro>