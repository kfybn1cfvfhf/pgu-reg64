<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>


<#function getSettlType tail>
    <#local tailNew = ""/>
    <#if tail=="г" || tail=="пл" || tail=="д" || tail=="м" || tail=="с" || tail=="сл" || tail=="п" || tail=="пер">
        <#local tailNew = tail + "."/>
    </#if>
    <#if tail=="х">
        <#local tailNew = "хутор"/>
    </#if>
    <#if tail=="дп">
        <#local tailNew = "д.п."/>
    </#if>
    <#if tail=="кп">
        <#local tailNew = "к.п."/>
    </#if>
    <#if tail=="мкр">
        <#local tailNew = "микрорайон"/>
    </#if>
    <#if tail=="рзд">
        <#local tailNew = "разъезд"/>
    </#if>
    <#if tail=="рп">
        <#local tailNew = "р.п."/>
    </#if>
    <#return tailNew>
</#function>

<#function getTail str>
    <#local arr = str?split(" ")/>
    <#return arr?last>
</#function>

<#macro fromKladr strName isName dicName type>
    <#if type=="region">
        <#local str = dicRegistry.getItemByKey((dicName), (form[strName]?substring(0,2)+"000000000")!'null').name?html/>
    <#elseif type=="rayon">
        <#local str = dicRegistry.getItemByKey((dicName), (form[strName]?substring(0,5)+"000000")!'null').name?html/>
    <#else>
        <#if form[strName]?has_content>
            <#local str = dicRegistry.getItemByKey((dicName), (form[strName])!'null').name?html/>
        </#if>
    </#if>
    <#if str??>
    <#local tail = getTail(str)/>
    <#local arr = str?split(" ")/>
    <#local name = ""/>
    <#if dicName=="KLADRRegion">
        <#if tail=="обл">
            <#local tailReg = "область"/>
        </#if>
        <#if tail=="респ" || tail=="Респ">
            <#local tailReg = "Республика"/>
        </#if>
        <#if tail=="р-н">
            <#local tailReg = "район"/>
        </#if>
    </#if>
    <#if dicName=="KLADRStreet">
        <#if tail=="ул">
            <#local tailNew = tail+"."/>
        </#if>
        <#if tail=="б-р">
            <#local tailNew = "бульвар"/>
        </#if>
        <#if tail=="наб">
            <#local tailNew = "набережная"/>
        </#if>
        <#if tail=="нп">
            <#local tailNew = "н.п."/>
        </#if>
        <#if tail=="пр-кт">
            <#local tailNew = "проспект"/>
        </#if>
         <#if tail=="тер">
            <#local tailNew = "тер."/>
        </#if>
        <#if tail=="ш">
            <#local tailNew = "шоссе"/>
        </#if>
    </#if>
    <#local tailNew1 = getSettlType(tail)/>
    <#if tailNew1 != "">
        <#local tailNew = tailNew1/>
    </#if>
<#if isName==true><#list arr as val><#if val != tail && val_has_next><#local name = name + " " + val/></#if></#list><#if tailReg?has_content><#local name = name + " " + tailReg/></#if>${name?trim}<#else><#if tailNew?has_content>${tailNew}<#else>${tail}</#if></#if></#if></#macro>