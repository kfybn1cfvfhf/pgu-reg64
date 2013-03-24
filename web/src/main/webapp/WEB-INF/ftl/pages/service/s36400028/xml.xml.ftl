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
            <@customElements.sirRoutesSOAP template="be2e9d15-6eeb-2dc3-7ca7-8f2ed8b1913e" />
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="LastName" formElementName="lastName" />
                <@customElements.sirParameterSOAP soapElementName="FirstName" formElementName="firstName" />
                <@customElements.sirParameterSOAP soapElementName="MiddleName" formElementName="middleName" />
                <@customElements.sirParameterSOAP soapElementName="Birthdate" formElementName="birthdate" />
                <@customElements.sirParameterSOAP soapElementName="mail" />
                <@customElements.sirParameterSOAP soapElementName="Citizenship" formElementName="citizenship"  formElementType="dictionary" specificOptions={"dictionaryCode":"KIND_OF_CITIZENSHIP"} />
                <@customElements.sirParameterSOAP soapElementName="Sex" formElementName="sex"  formElementType="dictionary" specificOptions={"dictionaryCode":"DIRECTORY_GENDER"} />
                <@customElements.sirParameterSOAP soapElementName="Tel" formElementName="tel" />
                <@customElements.sirParameterSOAP soapElementName="AddrIndex" formElementName="addrIndex" />
                <@customElements.sirParameterSOAP soapElementName="AddrObl" formElementName="addrObl" />
                <@customElements.sirParameterSOAP soapElementName="AddrRaion" formElementName="addrRaion" />
                <@customElements.sirParameterSOAP soapElementName="AddrGorod" formElementName="addrGorod" />
                <@customElements.sirParameterSOAP soapElementName="AddrUl" formElementName="addrUl" />
                <@customElements.sirParameterSOAP soapElementName="AddrDom" formElementName="addrDom" />
                <@customElements.sirParameterSOAP soapElementName="AddrKorp" formElementName="addrKorp" />
                <@customElements.sirParameterSOAP soapElementName="AddrKvart" formElementName="addrKvart" />
                <@customElements.sirParameterSOAP soapElementName="ObrType" formElementName="obrType"  formElementType="dictionary" specificOptions={"dictionaryCode":"KIND_OF_FORMATION"} />
                <@customElements.sirParameterSOAP soapElementName="ObrOrg" formElementName="obrOrg" />
                <@customElements.sirParameterSOAP soapElementName="ObrYear" formElementName="obrYear" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfByObr" formElementName="obrProfByObr" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfMain" formElementName="obrProfMain" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfMainExp" formElementName="obrProfMainExp" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfExtra" formElementName="obrProfExtra" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfExtraExp" formElementName="obrProfExtraExp" />
                <@customElements.sirParameterSOAP soapElementName="ObrLanguage" formElementName="obrLanguage"  formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ObrLangName" formElementName="obrLangName" />
                <@customElements.sirParameterSOAP soapElementName="ObrPC" formElementName="obrPC"  formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ObrDriver" formElementName="obrDriver"  formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ObrDriverCat" formElementName="obrDriverCat" />
                <@customElements.sirParameterSOAP soapElementName="WorkProf" formElementName="workProf" />
                <@customElements.sirParameterSOAP soapElementName="WorkStart" formElementName="workStart" />
                <@customElements.sirParameterSOAP soapElementName="WorkEnd" formElementName="workEnd" />
                <@customElements.sirParameterSOAP soapElementName="WorkType" formElementName="workType"  formElementType="dictionary" specificOptions={"dictionaryCode":"NATURE_OF_THE_WORK"} />
                <@customElements.sirParameterSOAP soapElementName="WantProf" formElementName="wantProf" />
                <@customElements.sirParameterSOAP soapElementName="WantWork" formElementName="wantWork" />
                <@customElements.sirParameterSOAP soapElementName="WantOther" formElementName="wantOther" />
                <@customElements.sirParameterSOAP soapElementName="czn"  formElementType="dictionary" specificOptions={"dictionaryCode":"CZN_SARATOV"} />
            </star:params>
            <star:files/>
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>