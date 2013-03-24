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
    <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
</#macro>

<#macro preScript>
    <#include "birthDatePlusNUntilNow.js" />
</#macro>

<#macro onReady>
    <@validation.addvalidatormethod true 'birthDatePlusNUntilNow' 'birthDatePlusNUntilNow(value, params)' ''/>
</#macro>