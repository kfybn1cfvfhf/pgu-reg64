<#include "defaultHeaders.ftl">
<#macro onReady streetTypeField='declarant_street_type' streetValueField='declarant_street' useDisabledStyle=false>
    <#if useDisabledStyle>
        <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '1' />
    <#else>
        <@action.setHiddenByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '1' />
    </#if>
</#macro>