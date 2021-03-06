<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#include "common.ftl">

<#macro preHead>
</#macro>

<#macro preScript>
    <#include "commonStrings.js" />

    <#if ! common_inc??>
        <#assign common_inc = true>
        <#include "common.js">
    <#else>
    <!-- using JS header common_inc that is already included above -->
    </#if>

    <#include "localOrGlobalPassportSeries.js" />
</#macro>

<#macro onReady>
    <@validation.addvalidatormethod true 'localOrGlobalPassportSeries' 'localOrGlobalPassportSeries(value, params)' ''/>
</#macro>