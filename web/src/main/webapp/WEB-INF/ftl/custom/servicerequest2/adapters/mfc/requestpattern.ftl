<#ftl encoding="UTF-8">

<#function detectMimeType filename>
    <#local ext_pos=filename?last_index_of(".")/>
    <#if ext_pos != -1>
        <#switch filename?substring(ext_pos)?lower_case>
            <#case ".doc">
                <#return "application/msword">
            <#case ".docx">
                <#return "application/vnd.openxmlformats-officedocument.wordprocessingml.document">
            <#case ".jpg">
                <#return "image/jpeg">
            <#case ".pdf">
                <#return "application/pdf">
            <#case ".rtf">
                <#return "application/rtf">
            <#case ".tif">
                <#return "image/tiff">
            <#case ".txt">
                <#return "text/plain">
            <#case ".xls">
                <#return "application/vnd.ms-excel">
            <#case ".xlsx">
                <#return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet">
            <#case ".zip">
                <#return "application/zip">
        </#switch>
    </#if>
    <#return "application/octet-stream"/>
</#function>

<#function getApplicantAttributeElement
    applicantAttributeName      <#-- название реквизита заявителя, который надо добавить в результирующий хэш -->
    applicantAttributes         <#-- хэш вида "<название реквизита заявителя>:<метаданные элемента формы>" -->
>
    <#if applicantAttributes[applicantAttributeName]?has_content>
        <#local applicantAttribute = applicantAttributes[applicantAttributeName] + {"applicantAttributeName":applicantAttributeName} />
        <#return {applicantAttribute.formElementId:applicantAttribute} />
    <#else>
        <#if form[applicantAttributeName]??>
            <#if form[applicantAttributeName]?is_date>
                <#local widgetClass = "date" />
            <#else>
                <#local widgetClass = "plainText" />
            </#if>
            <#return {applicantAttributeName:{
                "widgetClass":widgetClass,
                "applicantAttributeName":applicantAttributeName
            }} />
        <#else>
            <#return {} />
        </#if>
    </#if>
</#function>

<#macro makeSoapRequest
    owner                       <#-- Код организационной единицы, задаётся при настройке услуги -->
    departmentCode              <#-- Код ведомства -->
    _formElements                <#-- Хэш вида "<id элемента формы>:<метаданные элемента формы>" -->
    _fileloadElements            <#-- Хэш вида "<id элемента загрузки файлов>:<метаданные элемента загрузки файлов>" -->
    _blocks
    applicantAttributes={}      <#-- Хэш вида "<название реквизита заявителя>:<метаданные элемента формы>" -->
>

    <#assign fileloadElements = _fileloadElements />

    <#assign formElements = _formElements />

    <#assign blocks = _blocks />

    <#local applicantAttributeElements={} />

    <#if blocks.identityDocBlock??>

        <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("identityDocType", applicantAttributes) />
        <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("identityDocId", applicantAttributes) />
        <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("passSeria", applicantAttributes) />
        <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("passNo", applicantAttributes) />
        <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("passFrom", applicantAttributes) />
        <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("passDate", applicantAttributes) />

        <#if !blocks.identityDocBlock.noFile??>
            <#assign fileloadElements = fileloadElements + {
                "identityDocLoad":{}
            }>
        <#else>
            <#if !blocks.identityDocBlock.noFile>
                <#assign fileloadElements = fileloadElements + {
                    "identityDocLoad":{}
                }>
            </#if>
        </#if>

    </#if>

    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("firstName", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("lastName", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("middleName", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("address", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("factAddress", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("email", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("birthdate", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("phone", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("cellPhone", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("inn", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("sex", applicantAttributes) />
    <#local applicantAttributeElements = applicantAttributeElements + getApplicantAttributeElement("snils", applicantAttributes) />



                <createServiceInfoSmev xmlns:rev="http://smev.gosuslugi.ru/request/rev111111">
                    <serviceId>${serviceId?c}</serviceId>
                    <goalId>${serviceTargetExtId}</goalId>
                    <owner>${owner}</owner>
                    <authToken>${cAuthToken}</authToken>
                    <request>${cOrderID?c}</request>
                    <applicant>

                        <@commonServiceRequestSoapPatterns.makeSoapForFields formElements=applicantAttributeElements adapterNamespace=applicantattributesAdapter />

                    </applicant>

                    <@commonServiceRequestSoapPatterns.makeSoapForFields formElements=formElements adapterNamespace=servicerequestAdapter />

                    <@makeFiles fileloadElements=fileloadElements />

                </createServiceInfoSmev>

</#macro>

<#macro makeFiles fileloadElements>
    <#if fileloadElements??>
        <rev:AppliedDocuments>
            <#local idx=1/>
            <#list fileloadElements?keys as file>
                <#if form[file]??>
                    <#local field = form[file]/>
                    <#if field?is_sequence>
                        <#list field as clone>
                            <#local fileDoc = field[clone_index]/>
                            <#if fileDoc?? && fileDoc.fileID?? && fileDoc.fileID?has_content>
                                <rev:AppliedDocument>
                                    <rev:CodeDocument>${file}</rev:CodeDocument>
                                    <rev:Name>${fileDoc.fileName}</rev:Name>
                                    <rev:Number>${idx}</rev:Number>
                                    <rev:URL>${fileDoc.fileID}</rev:URL>
                                    <rev:Type>${detectMimeType(fileDoc.fileName)}</rev:Type>
                                </rev:AppliedDocument>
                                <#local idx = idx + 1/>
                            </#if>
                        </#list>
                    <#else>
                        <#if field?? && field.fileID?? && field.fileID?has_content>
                            <rev:AppliedDocument>
                                <rev:CodeDocument>${file}</rev:CodeDocument>
                                <rev:Name>${field.fileName}</rev:Name>
                                <rev:Number>${idx}</rev:Number>
                                <rev:URL>${field.fileID}</rev:URL>
                                <rev:Type>${detectMimeType(field.fileName)}</rev:Type>
                            </rev:AppliedDocument>
                            <#local idx = idx + 1/>
                        </#if>
                    </#if>
                </#if>
            </#list>
        </rev:AppliedDocuments>
    <#else>
        <rev:AppliedDocuments/>
    </#if>
</#macro>