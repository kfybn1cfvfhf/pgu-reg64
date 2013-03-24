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
            <@customElements.sirRoutesSOAP template="842a0a05-6116-a712-5f47-e7c0eb4b8172" />
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="LastName" formElementName="lastName" />
                <@customElements.sirParameterSOAP soapElementName="FirstName" formElementName="firstName" />
                <@customElements.sirParameterSOAP soapElementName="MiddleName" formElementName="middleName" />
                <@customElements.sirParameterSOAP soapElementName="Birthdate" formElementName="birthdate" />
                <@customElements.sirParameterSOAP soapElementName="mail" />
                <@customElements.sirParameterSOAP soapElementName="Citizenship" formElementName="citizenship" formElementType="dictionary" specificOptions={"dictionaryCode":"KIND_OF_CITIZENSHIP"} />
                <@customElements.sirParameterSOAP soapElementName="Sex" formElementName="sex" formElementType="staticOptions" specificOptions={"staticOpts":{'1':'Мужской','2':'Женский'}} />
                <@customElements.sirParameterSOAP soapElementName="Tel" formElementName="tel" />
                <@customElements.sirParameterSOAP soapElementName="AddrIndex" formElementName="addrIndex" />
                <@customElements.sirParameterSOAP soapElementName="AddrObl" formElementName="addrObl" />
                <@customElements.sirParameterSOAP soapElementName="AddrRaion" formElementName="addrRaion" />
                <@customElements.sirParameterSOAP soapElementName="AddrGorod" formElementName="addrGorod" />
                <@customElements.sirParameterSOAP soapElementName="AddrUl" formElementName="addrUl" />
                <@customElements.sirParameterSOAP soapElementName="AddrDom" formElementName="addrDom" />
                <@customElements.sirParameterSOAP soapElementName="AddrKorp" formElementName="addrKorp" />
                <@customElements.sirParameterSOAP soapElementName="AddrKvart" formElementName="addrKvart" />
                <@customElements.sirParameterSOAP soapElementName="ObrType" formElementType="dictionary" specificOptions={"dictionaryCode":"KIND_OF_FORMATION"} />
                <@customElements.sirParameterSOAP soapElementName="ObrOrg" />
                <@customElements.sirParameterSOAP soapElementName="ObrYear" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfByObr" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfMain" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfMainExp" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfExtra" />
                <@customElements.sirParameterSOAP soapElementName="ObrProfExtraExp" />
                <@customElements.sirParameterSOAP soapElementName="ObrLanguage" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ObrLangName" />
                <@customElements.sirParameterSOAP soapElementName="ObrPC" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ObrDriver" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="ObrDriverCat" />
                <@customElements.sirParameterSOAP soapElementName="WorkProf" />
                <@customElements.sirParameterSOAP soapElementName="WorkStart" />
                <@customElements.sirParameterSOAP soapElementName="WorkEnd" />
                <@customElements.sirParameterSOAP soapElementName="WorkType" formElementType="dictionary" specificOptions={"dictionaryCode":"NATURE_OF_THE_WORK"} />
                <@customElements.sirParameterSOAP soapElementName="WorkMoney" />
                <@customElements.sirParameterSOAP soapElementName="WantProf" />
                <@customElements.sirParameterSOAP soapElementName="WantPost" />
                <@customElements.sirParameterSOAP soapElementName="WantWork" />
                <@customElements.sirParameterSOAP soapElementName="WantType" formElementType="dictionary" specificOptions={"dictionaryCode":"NATURE_OF_THE_WORK"} />
                <@customElements.sirParameterSOAP soapElementName="WantMoney" />
                <@customElements.sirParameterSOAP soapElementName="WantOther" />
                <@customElements.sirParameterSOAP soapElementName="ExtarN1" />
                <@customElements.sirParameterSOAP soapElementName="ExtraPost1" />
                <@customElements.sirParameterSOAP soapElementName="ExtarN2" />
                <@customElements.sirParameterSOAP soapElementName="ExtraPost2" />
                <@customElements.sirParameterSOAP soapElementName="ExtarN3" />
                <@customElements.sirParameterSOAP soapElementName="ExtraPost3" />
                <@customElements.sirParameterSOAP soapElementName="czn" formElementType="dictionary" specificOptions={"dictionaryCode":"CZN_SARATOV"} />
                <@customElements.sirParameterSOAP soapElementName="Q1" formElementType="checkbox" />
            </star:params>
            <star:files />
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>