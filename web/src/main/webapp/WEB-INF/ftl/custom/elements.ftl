<#import "utils.ftl" as customUtils>
<#import "/serviceform.ftl" as sf>
<#import "/jquery/validation.ftl" as validation>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/action.ftl" as action>
<#import "/utils.ftl" as util>

<#macro singleSedDocumentSOAP documentId title formElement="">
    <#if formElement?has_content && form[formElement.fileID+'_base64']?has_content>
        <document>
            <documentId>${documentId}</documentId>
            <mimeType>${customUtils.detectMimeType(formElement.fileName)}</mimeType>
            <documentName>${title}${customUtils.getFileExtension(formElement.fileName)}</documentName>
            <content>${form[formElement.fileID+'_base64']}</content>
        </document>
    </#if>
</#macro>

<#macro multipleSedDocumentsSOAP initDocumentId title formElements>
    <#list 0..formElements?size-1 as index>
        <@singleSedDocumentSOAP documentId=initDocumentId+index formElement=formElements[index] title=title+' ${index+1}' />
    </#list>
</#macro>

<#macro stringParameterSOAP formElementName>
    <#if form[formElementName]?has_content>
        <${formElementName}>${form[formElementName]}</${formElementName}>
    <#else>
        <${formElementName}></${formElementName}>
    </#if>
</#macro>

<#macro dateTimeParameterSOAP dateTimeFormElementName>
    <#if form[dateTimeFormElementName]?has_content>
        <${dateTimeFormElementName}>${form[dateTimeFormElementName]?string("yyyy-MM-dd'T'HH:mm:ss")}</${dateTimeFormElementName}>
    <#else>
        <${dateTimeFormElementName}></${dateTimeFormElementName}>
    </#if>
</#macro>

<#macro requestHeader>
     <RequestHeader xsi:type="urn:RequestHeader" xmlns:urn="urn:RequestIntf">
        <authToken xsi:type="xsd:string">${cAuthToken}</authToken>
        <requestId xsi:type="xsd:string">${cOrderID?c}</requestId>
        <requestInitiatorCode xsi:type="urn:requestInitiatorCode">
           <regionCode xsi:type="xsd:string">${userSelectedRegion}</regionCode>
           <serviceOrgCode xmlns:xsi1="http://www.w3.org/2001/XMLSchema-instance" />
        </requestInitiatorCode>
        <requestDate xsi:type="xsd:dateTime">${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</requestDate>
     </RequestHeader>
</#macro>

<#macro eServiceHeader stateOrgId>
     <EServiceHeader xsi:type="urn:EServiceHeader" xmlns:urn="urn:RequestIntf">
        <userId xsi:type="xsd:long">${cUserID?c}</userId>
        <eserviceId xsi:type="xsd:long">${serviceId?c}</eserviceId>
        <reestrId xsi:type="xsd:string">${serviceId?c}</reestrId>
        <sirRequestId xmlns:xsi1="http://www.w3.org/2001/XMLSchema-instance"/>
        <stateOrgId xsi:type="xsd:long">${stateOrgId}</stateOrgId>
        <orderDate xsi:type="xsd:dateTime">${cDate?string("yyyy-MM-dd'T'HH:mm:ss")}</orderDate>
     </EServiceHeader>
</#macro>


<#macro getFile file comment>
    <#if form[file]?has_content>
    <#--form[file]?has_content ${comment}-->
        <#if form[file]?size &gt; 0>
        <#--form[file]?size ${comment}-->
            <#if form[file]?is_sequence>
            <#--form[file]?is_sequence ${comment}-->
                <#list 0..form[file]?size-1 as index>
                    <#assign fName>${file}[${index}]</#assign>
                    <#assign fNameB64>${fName}_base64</#assign>
                    <#if form[fNameB64]?has_content>
                    <#--form[fNameB64]?has_content ${comment}-->
                        <#--<star:file name="${comment} ${index+1}.${form[file][index].fileName?substring(form[file][index].fileName?last_index_of('.') + 1)}"></star:file>-->
                        <star:file name="${comment} ${index+1}.${form[file][index].fileName?substring(form[file][index].fileName?last_index_of('.') + 1)}">${form[fNameB64]}</star:file>
                    </#if>
                </#list>
            <#else>
                <#assign fName>${file}</#assign>
                <#assign fNameB64>${fName}_base64</#assign>
                <#if form[fNameB64]?has_content>
                <#--form[fNameB64]?has_content ${comment}-->
                    <#--<star:file name="${comment}.${form[file].fileName?substring(form[file].fileName?last_index_of('.') + 1)}"></star:file>-->
                    <star:file name="${comment}.${form[file].fileName?substring(form[file].fileName?last_index_of('.') + 1)}">${form[fNameB64]}</star:file>
                </#if>
            </#if>
        </#if>
    </#if>
</#macro>

<#macro sirRoutesSOAP template="" processKey="${serviceId?c}">
    <star:routes>
        <star:process>${processKey}</star:process>
        <#if template?has_content><star:template>${template}</star:template></#if>
        <star:orderId>${cOrderID?c}</star:orderId>
        <star:userId>${cUserID?c}</star:userId>
    </star:routes>
</#macro>

<#macro sirParameterSOAP soapElementName formElementName="" formElementType="" specificOptions={}>
    <#if !formElementName?has_content>
        <#local formElementName=soapElementName>
    </#if>

    <#switch formElementType>
        <#case "dictionary">
            <#if form[formElementName]?has_content>
                <star:param name="${soapElementName}">${dicRegistry.getItemByKey(specificOptions.dictionaryCode, form[formElementName]).name}</star:param>
            </#if>
            <#break>
        <#case "customLookup">
            <#local lookupController = customLookupRegistry.getController(specificOptions.controller)/>
            <#local optionsMap=specificOptions.optionsMap + {"authToken":cAuthToken}>
            <#local optionsJSON><@util.toJSON optionsMap/></#local>
            <star:param name="${soapElementName}">${lookupController.getValueByCodeWrapper(form[formElementName], optionsJSON)}</star:param>
            <#break>
        <#case "checkbox">
            <#if form[formElementName]?has_content && form[formElementName] == "on">
                <star:param name="${soapElementName}">Да</star:param>
            <#else>
                <star:param name="${soapElementName}">Нет</star:param>
            </#if>
            <#break>
        <#case "staticOptions">
            <#if form[formElementName]?has_content>
                <star:param name="${soapElementName}">${specificOptions.staticOpts[form[formElementName]]}</star:param>
            </#if>
            <#break>
        <#case "stringList">
            <#if form[formElementName]?is_sequence>
                <#local items=""/>
                <#list 0..form[formElementName]?size-1 as index>
                    <#local items=items + form[formElementName][index] + "\n">
                </#list>
                <star:param name="${soapElementName}">${items}</star:param>
            </#if>
            <#break>
        <#default>
            <#if form[formElementName]?has_content && form[formElementName]?is_date>
                <star:param name="${soapElementName}">${(form[formElementName]?string("dd.MM.yyyy"))!""}</star:param>
            <#else>
                <star:param name="${soapElementName}">${form[formElementName]!""}</star:param>
            </#if>
    </#switch>
</#macro>

<#macro medDocsGivenByUserInitiative
    sumColspan

    beforeStaticTextColspan
    afterStaticTextColspan

    beforeLabelColspan
    afterLabelColspan

    beforeFileloadColspan
    afterFileloadColspan
>

    <#if sumColspan <= 0>
        <#stop "Summaru colspan must be greater than 0">
    </#if>

    <#local labelColspan = sumColspan - beforeLabelColspan - afterLabelColspan />
    <#local fileloadColspan = sumColspan - beforeFileloadColspan - afterFileloadColspan />
    <#local staticTextColspan = sumColspan - beforeStaticTextColspan - afterStaticTextColspan />

    <@sf.fldrow>

        <#if beforeStaticTextColspan &gt; 0>
            <@sf.empty colspan="${beforeStaticTextColspan}"/>
        </#if>

        <@sf.statictext style="text-align:left;" colspan="${staticTextColspan}"><h2>Документы, подаваемые по инициативе заявителя</h2><br></@sf.statictext>

        <#if afterStaticTextColspan &gt; 0>
            <@sf.empty colspan="${afterStaticTextColspan}"/>
        </#if>

    </@sf.fldrow>

    <@sf.fldrow>

        <#if beforeLabelColspan &gt; 0>
            <@sf.empty colspan="${beforeLabelColspan}"/>
        </#if>

        <@sf.label title="Уведомление о постановке на учет с указанием кода по Общероссийскому классификатору предприятий и организаций (ОКПО):" required=false style="text-align:left;" colspan="${labelColspan}"/>

        <#if afterLabelColspan &gt; 0>
            <@sf.empty colspan="${afterLabelColspan}"/>
        </#if>

    </@sf.fldrow>

    <@sf.fldrow>

        <#if beforeFileloadColspan &gt; 0>
            <@sf.empty colspan="${beforeFileloadColspan}" />
        </#if>

        <@sf.fileload path="form.loaddoc_okpo" fileExtensions="pdf,doc,jpg" style="text-align:left;" colspan="${fileloadColspan}" />

        <#if afterFileloadColspan &gt; 0>
            <@sf.empty colspan="${afterFileloadColspan}" />
        </#if>

    </@sf.fldrow>

    <@sf.fldrow>

        <#if beforeLabelColspan &gt; 0>
            <@sf.empty colspan="${beforeLabelColspan}"/>
        </#if>

        <@sf.label title="Технический паспорт здания или помещения, используемого для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="${labelColspan}"/>

        <#if afterLabelColspan &gt; 0>
            <@sf.empty colspan="${afterLabelColspan}"/>
        </#if>

    </@sf.fldrow>

    <@sf.fldrow>

        <#if beforeFileloadColspan &gt; 0>
            <@sf.empty colspan="${beforeFileloadColspan}" />
        </#if>

        <@sf.fileload path="form.loaddoc_building" fileExtensions="pdf,doc,jpg" style="text-align:left;" colspan="${fileloadColspan}" />

        <#if afterFileloadColspan &gt; 0>
            <@sf.empty colspan="${afterFileloadColspan}" />
        </#if>

    </@sf.fldrow>
</#macro>