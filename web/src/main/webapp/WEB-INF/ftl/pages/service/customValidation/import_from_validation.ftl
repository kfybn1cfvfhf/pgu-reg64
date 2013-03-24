<#function getMethodParams methodName paramsMap>
    <#assign paramkeys = paramsMap?keys/>
    <#list paramkeys as key>
        <#if key == methodName>
            <#return paramsMap[methodName]/>
        </#if>
    </#list>
</#function>

<#function getMethodMes mess>
    <#local ret = "messages:{" />
    <#assign keys = mess?keys />
    <#list keys as key>
        <#local ret=ret + "'${key}'" + ":" +  "'${mess[key]}'" />
        <#if key_has_next>
            <#local ret=ret +"," />
        </#if>
    </#list>
    <#local ret=ret + "}" />
    <#return ret />
</#function>