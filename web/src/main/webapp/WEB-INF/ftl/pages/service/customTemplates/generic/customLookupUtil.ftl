<#ftl encoding="UTF-8">

<#function createOptionsMap form mapBase>
    <#assign resultMap = mapBase + {"okato":"${form['okato']}", "regionMappingType":"${form['regionMappingType']}"} >
    <#return resultMap>
</#function>