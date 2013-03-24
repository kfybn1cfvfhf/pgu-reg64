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
<soap:Envelope xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:rev="http://smev.gosuslugi.ru/rev111111" <#if !namespaces?? || !namespaces?has_content>><#else><#list namespaces?keys as prefix>xmlns<#if prefix?has_content>:${prefix}</#if>="${namespaces[prefix]}"</#list>></#if>
    <#if soapHeader??>
        <soap:Header>
            <#if soapHeader?is_macro><@soapHeader/><#else>${soapHeader}</#if>
        </soap:Header>
    </#if>
    <soap:Body>
        <${operation}>
        <rev:Message>
            <rev:Sender>
                <rev:Code>${pguCode}</rev:Code>
                <rev:Name>${pguName}</rev:Name>
            </rev:Sender>
            <rev:Recipient>
                <rev:Code>${recipientCode}</rev:Code>
                <rev:Name>${recipientName}</rev:Name>
            </rev:Recipient>
            <rev:Originator>
                <rev:Code>${pguCode}</rev:Code>
                <rev:Name>${pguName}</rev:Name>
            </rev:Originator>
            <rev:TypeCode>${typeCode}</rev:TypeCode>
            <rev:Status>${status}</rev:Status>
            <rev:Date>${sysdate}</rev:Date>
            <rev:ExchangeType>${exchangeType}</rev:ExchangeType>
            <rev:ServiceCode>${reestrId}</rev:ServiceCode>
            <rev:CaseNumber>${orderId}</rev:CaseNumber>
        </rev:Message>
        <rev:MessageData>
            <rev:AppData>
                <#if appdata?has_content>${appdata}</#if>
            </rev:AppData>
            <rev:AppDocument>
                <#if binaryData?has_content>
                    <rev:RequestCode>req_${requestCode!"0"}</rev:RequestCode>
                    <rev:BinaryData>${binaryData}</rev:BinaryData>
                </#if>
            </rev:AppDocument>
        </rev:MessageData>
    </${operation}>
    </soap:Body>
</soap:Envelope>
</#macro>









