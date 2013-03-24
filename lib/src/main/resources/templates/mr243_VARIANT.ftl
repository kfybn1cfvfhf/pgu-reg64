<#ftl encoding="UTF-8"/>
<@smevSoapEnvelope
    operation="ext:createServiceSmev"
    namespaces={"ext":"http://ext.rtk.cp.org/"}>
    ${appdata}
</@smevSoapEnvelope>


<#macro smevSoapEnvelope
operation=''
namespaces={}
soapHeader=''
sysdate=sysdate?string("yyyy-MM-dd'T'hh:mm:ss")
orderId=orderId reestrId=reestrId pguCode=pguCode pguName=pguName recipientCode=recipientCode recipientName=recipientName>
${appdata}
</#macro>









