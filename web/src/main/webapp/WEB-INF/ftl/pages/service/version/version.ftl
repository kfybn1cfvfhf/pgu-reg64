<#ftl encoding="UTF-8" >
<#import "/html.ftl" as html>

<@html.html>
    <@html.head title='Служебная информация. Версии услуг Саратов'>
    </@html.head>
    <@html.body>
        <h3>Служебная информация. Версии услуг Саратов</h3>
        <#if svcVersion?? && svcVersion?is_hash>
            <#assign keys = svcVersion?keys>
            <#list keys as svc>
                ${svc?html} : ${svcVersion[svc]?html}<br/>
            </#list>
        </#if>
    </@html.body>
</@html.html>