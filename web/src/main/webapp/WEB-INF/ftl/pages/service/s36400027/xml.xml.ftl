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
            <@customElements.sirRoutesSOAP template="5fe5195c-70a2-dc79-4c02-84946c45be43" />
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="LastName" formElementName="lastName" />
                <@customElements.sirParameterSOAP soapElementName="FirstName" formElementName="firstName" />
                <@customElements.sirParameterSOAP soapElementName="MiddleName" formElementName="middleName" />
                <@customElements.sirParameterSOAP soapElementName="Snils" formElementName="snils" />
                <@customElements.sirParameterSOAP soapElementName="date_start" />
                <@customElements.sirParameterSOAP soapElementName="date_end" />
                <@customElements.sirParameterSOAP soapElementName="Q1" formElementName="q1"  formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="czn" formElementType="dictionary" specificOptions={"dictionaryCode":"CZN_SARATOV"} />
                <@customElements.sirParameterSOAP soapElementName="Q2" formElementName="q2"  formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="email" />
                <@customElements.sirParameterSOAP soapElementName="Q3" formElementName="q3"  formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="AddrIndex" formElementName="addrIndex" />
                <@customElements.sirParameterSOAP soapElementName="AddrObl" formElementName="addrObl" />
                <@customElements.sirParameterSOAP soapElementName="AddrRaion" formElementName="addrRaion" />
                <@customElements.sirParameterSOAP soapElementName="AddrGorod" formElementName="addrGorod" />
                <@customElements.sirParameterSOAP soapElementName="AddrUl" formElementName="addrUl" />
                <@customElements.sirParameterSOAP soapElementName="AddrDom" formElementName="addrDom" />
                <@customElements.sirParameterSOAP soapElementName="AddrKorp" formElementName="addrKorp" />
                <@customElements.sirParameterSOAP soapElementName="AddrKvart" formElementName="addrKvart" />
            </star:params>
            <star:files/>
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>