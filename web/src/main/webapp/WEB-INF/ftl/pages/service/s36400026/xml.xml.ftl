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
            <@customElements.sirRoutesSOAP template="39e5ad58-64e1-9087-aab1-b3d35d3c42fc" />
            <star:params>
                <@customElements.sirParameterSOAP soapElementName="BrandName" formElementName="brandName" />
                <@customElements.sirParameterSOAP soapElementName="OgrnDate" formElementName="ogrnDate" />
                <@customElements.sirParameterSOAP soapElementName="Ogrn" formElementName="ogrn" />
                <@customElements.sirParameterSOAP soapElementName="OrgFormCode" formElementName="orgFormCode" formElementType="dictionary" specificOptions={"dictionaryCode":"ORGANIZATION_LEGAL_FORM"} />
                <@customElements.sirParameterSOAP soapElementName="OwnershipCode" formElementName="ownershipCode" formElementType="dictionary" specificOptions={"dictionaryCode":"FORM_OF_OWNERSHIP"} />
                <@customElements.sirParameterSOAP soapElementName="OkvedCode" formElementName="okvedCode" formElementType="dictionary" specificOptions={"dictionaryCode":"TYPES_OF_ECONOMIC_ACTIVITIES"} />
                <@customElements.sirParameterSOAP soapElementName="DecName" formElementName="decName" />
                <@customElements.sirParameterSOAP soapElementName="DecProf" formElementName="decProf" />
                <@customElements.sirParameterSOAP soapElementName="DecMobilePhone" formElementName="decMobilePhone" />
                <@customElements.sirParameterSOAP soapElementName="DecFax" formElementName="decFax" />
                <@customElements.sirParameterSOAP soapElementName="DecEmail" formElementName="decEmail" />
                <@customElements.sirParameterSOAP soapElementName="AdrPostalCode" formElementName="adrPostalCode" />
                <@customElements.sirParameterSOAP soapElementName="AdrLocality" formElementName="adrLocality" />
                <@customElements.sirParameterSOAP soapElementName="AdrCity" formElementName="adrCity" />
                <@customElements.sirParameterSOAP soapElementName="AdrStreet" formElementName="adrStreet" />
                <@customElements.sirParameterSOAP soapElementName="AdrHouse" formElementName="adrHouse" />
                <@customElements.sirParameterSOAP soapElementName="AdrBuilding" formElementName="adrBuilding" />
                <@customElements.sirParameterSOAP soapElementName="AdrFlat" formElementName="adrFlat" />
                <@customElements.sirParameterSOAP soapElementName="FAdrPostalCode" formElementName="fAdrPostalCode" />
                <@customElements.sirParameterSOAP soapElementName="AdrOKATO" formElementName="adrOKATO" formElementType="dictionary" specificOptions={"dictionaryCode":"OKATO"} />
                <@customElements.sirParameterSOAP soapElementName="FAdrOKATO" formElementName="fAdrOKATO" formElementType="dictionary" specificOptions={"dictionaryCode":"OKATO"} />
                <@customElements.sirParameterSOAP soapElementName="FAdrLocality" formElementName="fAdrLocality" />
                <@customElements.sirParameterSOAP soapElementName="FAdrCity" formElementName="fAdrCity" />
                <@customElements.sirParameterSOAP soapElementName="FAdrStreet" formElementName="fAdrStreet" />
                <@customElements.sirParameterSOAP soapElementName="FAdrHouse" formElementName="fAdrHouse" />
                <@customElements.sirParameterSOAP soapElementName="FAdrBuilding" formElementName="fAdrBuilding" />
                <@customElements.sirParameterSOAP soapElementName="FAdrFlat" formElementName="fAdrFlat" />
                <@customElements.sirParameterSOAP soapElementName="czn" formElementType="dictionary" specificOptions={"dictionaryCode":"CZN_SARATOV"} />
                <@customElements.sirParameterSOAP soapElementName="driveway" />
                <@customElements.sirParameterSOAP soapElementName="Workers" formElementName="workers" />
                <@customElements.sirParameterSOAP soapElementName="Discharge" formElementName="discharge" />
                <@customElements.sirParameterSOAP soapElementName="WorkersCount" formElementName="workersCount" />

                <#assign socialPacket="" />
                <#if form.socialPacket??>
                    <#list 0..form.socialPacket?size-1 as socialPacketElementIndex>
                        <#assign socialPacket = socialPacket + dicRegistry.getItemByKey("SOCIAL_CONDITIONS", form.socialPacket[socialPacketElementIndex]).name + "\n">
                    </#list>
                    <#--<#assign socialPacket = socialPacket?substring(0, socialPacket?length-1)>-->
                </#if>
                <star:param name="SocialPacket">${socialPacket}</star:param>

                <#assign bankVacan="" />
                <#if form.bankVacan??>
                    <#list 0..form.bankVacan?size-1 as bankVacanElementIndex>
                        <#assign bankVacan = bankVacan + dicRegistry.getItemByKey("JOB_BANK", form.bankVacan[bankVacanElementIndex]).name + ",">
                    </#list>
                    <#assign bankVacan = bankVacan?substring(0, bankVacan?length-1)>
                </#if>
                <star:param name="bankVacan">${bankVacan}</star:param>

                <@customElements.sirParameterSOAP soapElementName="placement4" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="placement5" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="active_Actions" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="active_Actions1" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="active_Actions2" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="active_Actions3" formElementType="checkbox" />
                <@customElements.sirParameterSOAP soapElementName="active_Actions4" formElementType="checkbox" />

                <#assign vacancyList="">
                <#list 0..form.prof?size-1 as profIndex>

                    <#if vacancy??>
                        <#assign vacancyList = vacancyList + vacancy + "\n===================\n">
                    </#if>

                    <#assign workSocialList = "">
                    <#if form.workSocial[profIndex]??>
                        <#assign workSocialList="" />
                        <#list form.workSocial[profIndex] as workSocialDicItemCode>
                            <#assign workSocialList = workSocialList + dicRegistry.getItemByKey("SOCIAL_CONDITIONS", workSocialDicItemCode).name + ", ">
                        </#list>
                        <#if workSocialList?has_content>
                            <#assign workSocialList = workSocialList?substring(0, workSocialList?length-2) >
                        </#if>
                    </#if>

                    <#assign workExtrim = "" >
                    <#if form.workExtrim[profIndex]?has_content>
                        <#assign workExtrim = dicRegistry.getItemByKey("LABOR_CONDITIONS", form.workExtrim[profIndex]).name >
                    </#if>

                    <#assign education ="" >
                    <#if form.education[profIndex]?has_content>
                        <#assign education = dicRegistry.getItemByKey("KIND_OF_FORMATION", form.education[profIndex]).name >
                    </#if>

                    <#assign sexDictionary={'1':'Мужской','2':'Женский'} sex="">
                    <#if form.pol[profIndex]?has_content>
                        <#assign sex=sexDictionary[form.pol[profIndex]]>
                    </#if>

                    <#assign vacancy = "Профессия: " + form.prof[profIndex] + "\n" +
                        "Квалификация: " + form.kval[profIndex] + "\n" +
                        "Разряд: " + form.razrjad[profIndex] + "\n" +
                        "Количество мест: " + form.countVacancy[profIndex] + "\n" +
                        "Система оплаты: " + dicRegistry.getItemByKey("PAYMENT_SYSTEM", form.systOplat[profIndex]).name + "\n" +
                        "Средняя заработная плата (доход): " + form.srZarplat[profIndex] + "\n" +
                        "Характер работы: " + dicRegistry.getItemByKey("NATURE_OF_THE_WORK", form.workType[profIndex]).name + "\n" +
                        "Режим работы: " + dicRegistry.getItemByKey("MODE_OF_EMPLOYMENT", form.workRegim[profIndex]).name + "\n" +
                        "Условия труда: " + workExtrim + "\n" +
                        "Начало работы: " + form.workBeginTime[profIndex] + "\n" +
                        "Окончание работы: " + form.workEndTime[profIndex] + "\n" +
                        "Соц. льготы: " + workSocialList + "\n" +
                        "Карточка требований к соискателю\n" +
                        "Образование: " + education + "\n" +
                        "Специальность: " + form.specifikation[profIndex] + "\n" +
                        "Минимальный стаж: " + form.profStage[profIndex] + "\n" +
                        "Пол: " + sex + "\n" +
                        "Дополнительные требования: " + form.dopWorkersParametrs[profIndex]
                    >
                </#list>
                <#assign vacancyList = vacancyList + vacancy>
                <star:param name="prof">${vacancyList}</star:param>
            </star:params>
            <star:files />
        </star:start>
   </soapenv:Body>
</soapenv:Envelope>