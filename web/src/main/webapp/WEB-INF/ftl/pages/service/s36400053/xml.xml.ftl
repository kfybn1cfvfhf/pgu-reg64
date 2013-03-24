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
    <typ:reestrId><#switch form.organizationRecreation><#case "1">36400053-1<#break><#case "2">36400053-2<#break></#switch></typ:reestrId>
    <sirRequestId xmlns:xsi1="http://www.w3.org/2001/XMLSchema-instance"/>
    <typ:stateOrgCode>${stateOrgCode}</typ:stateOrgCode>
    <typ:orderDate>${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</typ:orderDate>
</eServiceHeader>
