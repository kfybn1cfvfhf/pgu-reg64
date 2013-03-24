<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">

<#import "/custom/elements.ftl" as customElements>


<#macro getCheckListParameter soapElementName index>
    <#local found="Нет"/>
    <#list form["categories"] as chk>
        <#if chk==index>
            <#local found="Да"/>
            <#break />
        </#if>
    </#list>
    <star:param name="${soapElementName}">${found}</star:param>
</#macro>



<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:star="http://www.gosuslugi.ru/smev/startRequest/" xmlns:xd="http://www.w3.org/2000/09/xmldsig#" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

    <soapenv:Header/>
    <soapenv:Body>
        <star:start xsi:schemaLocation="http://www.gosuslugi.ru/smev/startRequest/ NewXMLSchema.xsd ">
            <@customElements.sirRoutesSOAP template="e3a20014-18d2-369f-6095-3cae0b7377a0" />
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
                <@getCheckListParameter 'q1_inv'      '1' />
                <@getCheckListParameter 'q2_osv'      '2' />
                <@getCheckListParameter 'q3_nesov'    '3' />
                <@getCheckListParameter 'q4_predpens' '4' />
                <@getCheckListParameter 'q5_bezen'    '5' />
                <@getCheckListParameter 'q6_voen'     '6' />
                <@getCheckListParameter 'q7_rodit'    '7' />
                <@getCheckListParameter 'q8_chern'    '8' />
                <@getCheckListParameter 'q9_vipusk'   '9' />
                <@customElements.sirParameterSOAP soapElementName="WantOther" formElementName="wantOther" />
                <@customElements.sirParameterSOAP soapElementName="czn" formElementType="dictionary" specificOptions={"dictionaryCode":"CZN_SARATOV"} />
            </star:params>
            <star:files />
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>