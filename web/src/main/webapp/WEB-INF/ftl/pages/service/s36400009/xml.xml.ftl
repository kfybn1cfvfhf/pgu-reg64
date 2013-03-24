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
    <typ:reestrId><#if form.applType=="1"><#switch form.reason_reIP><#case "1">36400009-1<#break ><#case "2"><#case "3"><#case "4">36400009-2<#break ><#case "5">36400009-3<#break ><#case "6">36400009-4<#break ><#case "7">36400009-5<#break ></#switch><#else><#switch form.reason_reUL><#case "1"><#case "2"><#case "3">36400009-6<#break ><#case "4">36400009-7<#break ><#case "5">36400009-8<#break ><#case "6">36400009-9<#break><#case "7">36400009-10<#break><#case "8">36400009-11<#break></#switch></#if></typ:reestrId>
    <sirRequestId xmlns:xsi1="http://www.w3.org/2001/XMLSchema-instance"/>
    <typ:stateOrgCode>${stateOrgCode}</typ:stateOrgCode>
    <typ:orderDate>${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</typ:orderDate>
</eServiceHeader>