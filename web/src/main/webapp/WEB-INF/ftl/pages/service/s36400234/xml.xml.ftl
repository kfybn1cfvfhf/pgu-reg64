<requestHeader xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
    <typ:authToken>${cAuthToken}</typ:authToken>
    <typ:requestId>${cOrderID?c}</typ:requestId>
    <typ:requestInitiatorCode>
        <typ:regionCode>${userSelectedRegion}</typ:regionCode>
        <typ:serviceOrgCode>${stateOrgCode}</typ:serviceOrgCode>
    </typ:requestInitiatorCode>
    <typ:requestDate>${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</typ:requestDate>
</requestHeader>

<eServiceHeader xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
    <typ:userId>${cUserID?c}</typ:userId>
    <typ:eserviceId>${serviceId?c}</typ:eserviceId>
    <typ:reestrId>${serviceTargetExtId}</typ:reestrId>
    <sirRequestId xmlns:xsi1="http://www.w3.org/2001/XMLSchema-instance"/>
    <typ:stateOrgCode>${stateOrgCode}</typ:stateOrgCode>
    <typ:orderDate>${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</typ:orderDate>
</eServiceHeader>