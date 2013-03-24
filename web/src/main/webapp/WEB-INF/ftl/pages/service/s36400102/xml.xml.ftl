<#if form.goalRef == "1" >
    <#assign codeid = "36400102-1" />
</#if>

<#if form.goalRef == "2" >
    <#assign codeid = "36400102-2" />
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
