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
            <@customElements.sirRoutesSOAP template="48aa189c-a5b1-5869-7d68-18837d554d0f" />
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="fio_IP" />
                <@customElements.sirParameterSOAP soapElementName="place_live" />
                <@customElements.sirParameterSOAP soapElementName="tel" />
                <@customElements.sirParameterSOAP soapElementName="email" />
                <@customElements.sirParameterSOAP soapElementName="request" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ogrn" />
                <@customElements.sirParameterSOAP soapElementName="inn" />
                <@customElements.sirParameterSOAP soapElementName="doc_type" formElementType="customLookup" specificOptions={'controller':'MainDocTypeController', 'optionsMap':{}} />
                <@customElements.sirParameterSOAP soapElementName="docSer" />
                <@customElements.sirParameterSOAP soapElementName="docDate" />
                <@customElements.sirParameterSOAP soapElementName="docIssuer" />
                <@customElements.sirParameterSOAP soapElementName="egipser" />
                <@customElements.sirParameterSOAP soapElementName="egipogv" />
                <@customElements.sirParameterSOAP soapElementName="egipdate" />
                <@customElements.sirParameterSOAP soapElementName="egipadress" />
                <@customElements.sirParameterSOAP soapElementName="regser" />
                <@customElements.sirParameterSOAP soapElementName="regogv" />
                <@customElements.sirParameterSOAP soapElementName="regdate" />

                <#assign licensedObjects="" />
                <#list 0..form.licensAdress_1?size-1 as licensedObjectIndex>
                    <#assign licensedObjects = licensedObjects + form.licensAdress_1[licensedObjectIndex] + ":" + dicRegistry.getItemByKey("VID_OBJ_FARMA", form.objectLicensKind_1[licensedObjectIndex]).name + ":" />
                    <#list 0..form.farmWorks_1[licensedObjectIndex]?size-1 as licensedObjectActivityKindIndex>
                        <#assign licensedObjects = licensedObjects + dicRegistry.getItemByKey("VID_RABOT_FARMA", form.farmWorks_1[licensedObjectIndex][licensedObjectActivityKindIndex]).name + "; ">
                    </#list>
                    <#assign licensedObjects = licensedObjects?substring(0, licensedObjects?length-1) + "\n">
                </#list>
                <star:param name="licensAdress_1">${licensedObjects}</star:param>
            </star:params>
            <star:files>
                <@customElements.getFile "loadsan" "Копия санитарно-эпидемиологического заключения о соответствии правилам помещений" />
                <@customElements.getFile "loadDocG1" "Копии документов, подтверждающих наличие зданий, помещений для осуществления ЛД" />
                <@customElements.getFile "loadDocH1" "Копии документов, подтверждающих наличие оборудования для осуществления ЛД" />
                <@customElements.getFile "loadDocF1" "Копии документов об образовании специалистов в сфере обращения лек. средств" />
                <@customElements.getFile "loadDocZ1" "Документ, подтверждающий уплату государственной пошлины" />
                <@customElements.getFile "loadDocdov2" "Опись прилагаемых документов" />
                <@customElements.getFile 'loaddoc_okpo' "Уведомление о постановке на учет с указанием кода по ОКПО" />
                <@customElements.getFile 'loaddoc_building' "Технический паспорт здания или помещения" />
                <@customElements.getFile 'loaddoc_manager' "Документ, подтверждающий стаж работы руководителя " />
            </star:files>
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>