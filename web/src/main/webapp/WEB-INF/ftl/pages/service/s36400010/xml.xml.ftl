<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">

<#import "/custom/elements.ftl" as customElements>

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:star="http://www.gosuslugi.ru/smev/startRequest/" xmlns:xd="http://www.w3.org/2000/09/xmldsig#" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

    <soapenv:Header/>
    <soapenv:Body>
        <star:start xsi:schemaLocation="http://www.gosuslugi.ru/smev/startRequest/ NewXMLSchema.xsd ">
            <#if form.lic_reason == '2' || form.lic_reason == '3' || form.lic_reason == '4'>
                <@customElements.sirRoutesSOAP template="52ec9482-38ea-70b5-bd46-f48a4cfecbed" />
            <#else>
                <@customElements.sirRoutesSOAP template="7f09ed3f-1452-e8c9-96a2-e85c27355b93" />
            </#if>
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="fio_boss" />
                <@customElements.sirParameterSOAP soapElementName="ip_adress" />
                <@customElements.sirParameterSOAP soapElementName="ip_phone" />
                <@customElements.sirParameterSOAP soapElementName="ip_email" />
                <@customElements.sirParameterSOAP soapElementName="doc_type" formElementType="customLookup" specificOptions={'controller':'MainDocTypeController', 'optionsMap':{}} />
                <@customElements.sirParameterSOAP soapElementName="doc_num" />
                <@customElements.sirParameterSOAP soapElementName="doc_date" />
                <@customElements.sirParameterSOAP soapElementName="doc_org" />
                <@customElements.sirParameterSOAP soapElementName="ogrnip" />
                <@customElements.sirParameterSOAP soapElementName="inn_ip" />
                <@customElements.sirParameterSOAP soapElementName="egrul_num" />
                <@customElements.sirParameterSOAP soapElementName="egrul_org" formElementName="egrul_org1" />
                <@customElements.sirParameterSOAP soapElementName="egrul_date" />
                <@customElements.sirParameterSOAP soapElementName="egrul_place" formElementName="egrul_org2" />
                <@customElements.sirParameterSOAP soapElementName="tax_num" />
                <@customElements.sirParameterSOAP soapElementName="tax_org" />
                <@customElements.sirParameterSOAP soapElementName="tax_date" />
                <@customElements.sirParameterSOAP soapElementName="lic_num" />
                <@customElements.sirParameterSOAP soapElementName="lic_start" />
                <@customElements.sirParameterSOAP soapElementName="lic_org" />
                <@customElements.sirParameterSOAP soapElementName="lic_doc" formElementName="lic_basic" />
                <@customElements.sirParameterSOAP soapElementName="lic_reason" formElementType="dictionary" specificOptions={"dictionaryCode":"CHANGE_MED_REASON_IP"} />
                <#if form.lic_reason == '2' || form.lic_reason == '3' || form.lic_reason == '4'>
                    <@customElements.sirParameterSOAP soapElementName="egrip_new" />
                    <@customElements.sirParameterSOAP soapElementName="egrip_date" />
                    <@customElements.sirParameterSOAP soapElementName="egrip_org" />
                </#if>
            </star:params>
            <star:files>
                <#switch form.lic_reason>
                    <#case "1">
                        <@customElements.getFile "loaddoc52" "Документ, подтверждающий уплату государственной пошлины" />
                        <@customElements.getFile "loaddoc53" "Адреса мест осуществления медицинской деятельности" />
                        <@customElements.getFile "loaddoc54" "Копии документов, подтверждающих наличие зданий, помещений для осуществления мд" />
                        <@customElements.getFile "loaddoc55" "Копии документов, подтверждающих наличие оборудования и другого МТО" />
                        <@customElements.getFile "loaddoc56" "Копии регистрационных удостоверений и сертификатов соответствия на мед. технику" />
                        <@customElements.getFile "loaddoc57" "Копии документов о квалификации работников, осуществляющих ТО мед. техники" />
                        <@customElements.getFile "loaddoc58" "Электронная копия действующей лицензии" />
                        <@customElements.getFile "loaddoc59" "Опись прилагаемых документов" />
                        <#break>
                    <#case "2">
                    <#case "3">
                    <#case "4">
                        <@customElements.getFile "loaddoc62" "Документ, подтверждающий уплату государственной пошлины" />
                        <@customElements.getFile "loaddoc68" "Электронная копия действующей лицензии" />
                        <@customElements.getFile "loaddoc69" "Опись прилагаемых документов" />
                        <#break>
                    <#case "5">
                        <@customElements.getFile "loaddoc96" "Адреса мест, по которым изменяются виды работ (услуг)" />
                        <@customElements.getFile "loaddoc82" "Копии документов, подтверждающих наличие зданий, помещений для осуществления мд" />
                        <@customElements.getFile "loaddoc83" "Копии документов, подтверждающих наличие оборудования и другого МТО" />
                        <@customElements.getFile "loaddoc84" "Копии регистрационных удостоверений и сертификатов соответствия на мед. технику" />
                        <@customElements.getFile "loaddoc86" "Документ, подтверждающий уплату государственной пошлины" />
                        <@customElements.getFile "loaddoc87" "Опись прилагаемых документов" />
                        <@customElements.getFile "loaddoc88" "Электронная копия действующей лицензии" />
                        <#break>
                    <#case "6">
                        <@customElements.getFile "loaddoc91" "Адреса мест осуществления медицинской деятельности" />
                        <@customElements.getFile "loaddoc93" "Документ, подтверждающий уплату государственной пошлины" />
                        <@customElements.getFile "loaddoc94" "Электронная копия действующей лицензии" />
                        <@customElements.getFile "loaddoc95" "Опись прилагаемых документов" />
                        <#break>
                    <#case "7">
                        <@customElements.getFile "loaddoc71" "Адреса мест, по которым прекращена медицинская деятельность" />
                        <@customElements.getFile "loaddoc73" "Документ, подтверждающий уплату государственной пошлины" />
                        <@customElements.getFile "loaddoc74" "Опись прилагаемых документов" />
                        <@customElements.getFile "loaddoc75" "Электронная копия действующей лицензии" />
                        <#break>
                </#switch>
            </star:files>
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>