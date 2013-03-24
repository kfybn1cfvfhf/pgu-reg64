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
            <@customElements.sirRoutesSOAP template="b5c2074d-8148-9af9-cc43-cd84755006ac" />
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="fio_IP" />
                <@customElements.sirParameterSOAP soapElementName="declarantadress" />
                <@customElements.sirParameterSOAP soapElementName="doc_type" formElementType="customLookup" specificOptions={'controller':'MainDocTypeController', 'optionsMap':{}} />
                <@customElements.sirParameterSOAP soapElementName="docser" />
                <@customElements.sirParameterSOAP soapElementName="docdate" />
                <@customElements.sirParameterSOAP soapElementName="docissuer" />
                <@customElements.sirParameterSOAP soapElementName="ogrnip" />
                <@customElements.sirParameterSOAP soapElementName="phone_ip" />
                <@customElements.sirParameterSOAP soapElementName="email_ip" />
                <@customElements.sirParameterSOAP soapElementName="inn_req" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="taxpayer_idIP" />
                <@customElements.sirParameterSOAP soapElementName="blank_num" />
                <@customElements.sirParameterSOAP soapElementName="org_name2" />
                <@customElements.sirParameterSOAP soapElementName="date_g" />
                <@customElements.sirParameterSOAP soapElementName="org_name1" />
                <@customElements.sirParameterSOAP soapElementName="inn_ser" />
                <@customElements.sirParameterSOAP soapElementName="inn_org" />
                <@customElements.sirParameterSOAP soapElementName="inn_date" />
            </star:params>
            <star:files>
                <@customElements.getFile 'licensadress_1' "Адреса мест осуществления медицинской деятельности" />
                <@customElements.getFile 'loaddoc61' "Копии документов об образовании и документов, подтверждающих стаж работы ИП" />
                <@customElements.getFile 'loaddoc62' "Копия выданного в установленном порядке санитарно-эпидемиологического заключения" />
                <@customElements.getFile 'loaddoc63' "Копии документов, подтверждающих наличие  зданий, помещений" />
                <@customElements.getFile 'loaddoc64' "Копии документов, подтверждающих наличие оборудования и другого МТО" />
                <@customElements.getFile 'loaddoc65' "Копии регистрационных удостоверений и сертификатов соответствия на мед. технику" />
                <@customElements.getFile 'loaddoc60' "Копии документов об образовании специалистов" />
                <@customElements.getFile 'loaddoc67' "Копии документов о квалификации работников, осуществляющих ТО мед. техники" />
                <@customElements.getFile 'loaddoc68' "Документ, подтверждающий уплату государственной пошлины" />
                <@customElements.getFile 'loaddoc70' "Опись прилагаемых документов" />
                <@customElements.getFile 'loaddoc_okpo' "Уведомление о постановке на учет с указанием кода по  ОКПО" />
                <@customElements.getFile 'loaddoc_building' "Технический паспорт здания или помещения" />
            </star:files>
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>
