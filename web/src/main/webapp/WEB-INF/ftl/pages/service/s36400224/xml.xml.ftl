<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#macro opttag field tagName>
    <#if ((field?eval)?has_content)><${tagName}>${field?eval}</${tagName}><#else><${tagName}/></#if>
</#macro>
<#if form.usluga_form == "1">
    <#include "./putZjvRB8.xml.ftl">
<#elseif form.usluga_form == "2">
    <#include "./putZjvRB9.xml.ftl">
<#else>
    <#include "./putZjvRB10.xml.ftl">
</#if>
