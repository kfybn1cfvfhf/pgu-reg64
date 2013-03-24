<#if form.change_reason == "1" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.change_reason == "2" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.change_reason == "3" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.change_reason == "4" >
    <#assign codeid = "36400050-2" />
</#if>
<#if form.change_reason == "5" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.change_reason == "6" >
    <#assign codeid = "36400050-2" />
</#if>
<#if form.change_reason == "7" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.change_reason == "8" >
    <#assign codeid = "36400050-1" />
</#if>

<#if form.lic_reason == "1" >
    <#assign codeid = "36400050-2" />
</#if>
<#if form.lic_reason == "2" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.lic_reason == "3" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.lic_reason == "4" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.lic_reason == "5" >
    <#assign codeid = "36400050-2" />
</#if>
<#if form.lic_reason == "6" >
    <#assign codeid = "36400050-1" />
</#if>
<#if form.lic_reason == "7" >
    <#assign codeid = "36400050-1" />
</#if>

<requestHeader>
    <typ:authToken>${cAuthToken}</typ:authToken>
    <typ:requestId>${cOrderID?c}</typ:requestId>
    <typ:requestInitiatorCode>
        <typ:regionCode>${userSelectedRegion}</typ:regionCode>
    <typ:serviceOrgCode>${stateOrgCode}</typ:serviceOrgCode>
    </typ:requestInitiatorCode>
    <typ:requestDate>${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</typ:requestDate>
</requestHeader>

<eServiceHeader>
    <typ:userId>${cUserID?c}</typ:userId>
    <typ:eserviceId>${serviceId?c}</typ:eserviceId>
    <typ:reestrId>${codeid}</typ:reestrId>
    <sirRequestId xmlns:xsi1="http://www.w3.org/2001/XMLSchema-instance"/>
    <typ:stateOrgCode>${stateOrgCode}</typ:stateOrgCode>
    <typ:orderDate>${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</typ:orderDate>
</eServiceHeader>
