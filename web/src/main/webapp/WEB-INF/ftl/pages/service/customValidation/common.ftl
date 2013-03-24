<#include "import_from_validation.ftl">
<#import "/jquery/jquery.ftl" as jquery>

<#macro preScript>
    <#include "commonStrings.js" />

    <#if ! common_inc??>
        <#assign common_inc = true>
        <#include "common.js">
    <#else>
    <!-- using JS header common_inc that is already included above -->
    </#if>

</#macro>

<#macro applyCustomValidation inputid validation params attrMessages=''>
    <#if params?is_hash>
        <@jquery.onready>
            <#list validation?split(" ") as vItem>
                <#if vItem?has_content>
                    <#if attrMessages?is_hash_ex>
                    $(document.getElementById('${inputid}')).rules("add", {${vItem}:[${getMethodParams(vItem, params)}], ${getMethodMes(attrMessages)}});
                    <#else>
                    $(document.getElementById('${inputid}')).rules("add", {${vItem}:[${getMethodParams(vItem, params)}]});
                    </#if>
                </#if>
            </#list>
        </@jquery.onready>
    </#if>
</#macro>

<#--http://fmpp.sourceforge.net/freemarker/ref_directive_list.html-->
<#macro clearValidationMessageOnChange changedElements validatedElements>
    clearValidationMessageOnChange([<#list changedElements as y>'${y}'<#if y_has_next>,</#if></#list>],[<#list validatedElements as x>'${x}'<#if x_has_next>,</#if></#list>]);
</#macro>

<#--
    Changes element's value on event
    Params:
        onload: boolean, apply this validation on load
        srcids: array of ids, elements that will be listened by this listener
        events: string with format ("event1|event2|event3|etc"), events that will trigger this listener
        destids: array of ids, elements that will change its "required" property
        checkFunction: predicate function (should return true or false), its value indicates applying "required" flag
                       please remember that it can be anonymous and this will maintain a clear code.
 -->
<#macro setRequiredIfPredicate onload srcids events destids checkFunction>
    <#list srcids as srcid>
        <#list events?split("|") as event>
            <@jquery.descriptorListener srcid event onload>
            setRequiredIfPredicate(this.id, [<#list destids as x>'${x}'<#if x_has_next>,</#if></#list>], ${checkFunction});
            </@jquery.descriptorListener>
        </#list>
    </#list>
</#macro>