<#include "defaultHeaders.ftl">

<#macro colspanToWidth colspan>${colspan?number * 17}px;</#macro>
<#macro colspanToWidthDiv colspan more>${(colspan?number * 17)-more}px;</#macro>

<#macro fldcontainer path='' qtip='' attr='' style='' class='' errorDivHeight='' errorDivWidth='' ignoreQTip=false ignoreErrors=false>
<td class="field ${class}" style="${style}" ${attr}>
    <#nested/>
    <#if !ignoreQTip>
        <@fldqtip qtip/>
    </#if>
    <#if !ignoreErrors>
        <@flderrors path=path errorDivHeight=errorDivHeight errorDivWidth=errorDivWidth/>
    </#if>
</td>
</#macro>

<#macro empty colspan='1' id="" useId=false class="" useClass=false useAutoWidth=true>
    <#local csToWidth><@colspanToWidth colspan/></#local>
    <td class="field  <#if useClass>${class}</#if>" <#if useId>id="${id}"</#if> <#if useAutoWidth>width="${csToWidth}"</#if> colspan=${colspan}>&nbsp;</td>
</#macro>