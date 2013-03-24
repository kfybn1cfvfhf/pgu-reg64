<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "../utils.ftl" as utils>

<#assign number=0/>

<#assign workKinds = {
"1": "Construction",
"2": "Reconstruction",
"3": "Overhaul"
}
/>

<#assign constructionTypes = {
"1": "MajorConstruction",
"2": "PrivateHousingConstruction"
}
/>

<#assign ownershipTypes = {
"1": "AdvOwner",
"2": "RealPropOwner"
}
/>


<#assign rightTypes = {
"1": "аренда",
"2": "собственность"
}
/>


<#assign condprovownTypes = {
"1": "за плату",
"2": "бесплатно"
}
/>


<#assign zupresonTypes = {
"1": "true",
"2": "false"
}
/>


<#assign dateFormat="yyyy-MM-dd'T'HH:mm:ss"/>


<#function documentName documentCodeKey fileName index=-1>
    <#assign document_name = "">
    <#assign fileExtension=(fileName?substring(fileName?last_index_of('.')))!''/>
    <#if index?? && index &gt; -1>
            <#assign document_name = documentCodes[documentCodeKey].fileName + " " + (index?int+1)?string>
        <#else>
            <#assign document_name = documentCodes[documentCodeKey].fileName>
    </#if>
    <#return utils.trim100(document_name, fileExtension)>
</#function>

<#macro appliedDocument field>
    <#if form[field]??>
        <#if form[field]?is_sequence>
            <#list form[field] as file>
                <#if form[field + "[" + file_index + "]_base64"]?has_content>
                    <AppliedDocument xmlns="http://smev.gosuslugi.ru/request/rev110801">
                        <#assign  number = number + 1 />
                        <CodeDocument>${documentCodes[field].code}</CodeDocument>
                        <#if form[field]?size &gt; 1>
                            <Name>${documentName(field, file.fileName, file_index)}</Name>
                        <#else>
                            <Name>${documentName(field, file.fileName)}</Name>
                        </#if>
                        <Number>${number}</Number>
                        <URL/>
                        <Type>${utils.detectMimeType(file.fileName)}</Type>
                    </AppliedDocument>
                </#if>
            </#list>
        <#else>
            <#if form[field + "_base64"]?has_content>
                <AppliedDocument xmlns="http://smev.gosuslugi.ru/request/rev110801">
                    <#assign  number = number + 1 />
                    <CodeDocument>${documentCodes[field].code}</CodeDocument>
                    <Name>${documentName(field, form[field].fileName)}</Name>
                    <Number>${number}</Number>
                    <URL/>
                    <Type>${utils.detectMimeType(form[field].fileName)}</Type>
                </AppliedDocument>
            </#if>
        </#if>
    </#if>
</#macro>

<#macro request>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:rev="http://smev.gosuslugi.ru/rev110801"
                  xmlns:typ="http://tndmsoft.ru/Kadastr/types"
                  xmlns:xd="http://www.w3.org/2000/09/xmldsig#"
                  xmlns:inc="http://www.w3.org/2004/08/xop/include">
    <soapenv:Header>
        <rev:Header>
            <rev:MessageId>3</rev:MessageId>
            <rev:TimeStamp>${currentDate?string("yyyy-MM-dd'T'HH:mm:ss")}</rev:TimeStamp>
        </rev:Header>
    </soapenv:Header>
    <soapenv:Body>
        <typ:RegisterRequest>
            <rev:Message>
                <rev:Sender>
                    <rev:Code>SID0000124</rev:Code>
                    <rev:Name>ПГУ</rev:Name>
                </rev:Sender>
                <rev:Recipient>
                    <rev:Code>SID0001433</rev:Code>
                    <rev:Name>Kadastr</rev:Name>
                </rev:Recipient>
                <rev:TypeCode>1</rev:TypeCode>
                <rev:Date>${currentDate?string("yyyy-MM-dd'T'HH:mm:ss")}</rev:Date>
                <rev:CaseNumber>${cOrderID?c}</rev:CaseNumber>
            </rev:Message>
            <rev:MessageData>
                <rev:AppDocument>
                    <rev:BinaryData>${binaryData!''}</rev:BinaryData>
                </rev:AppDocument>
            </rev:MessageData>
        </typ:RegisterRequest>
    </soapenv:Body>
</soapenv:Envelope>
</#macro>

<#macro physical>
<PhysicalPerson>
    <FullName>${form.zayvfullname!""}</FullName>
    <Birthday>${form.birthDate?string("yyyy-MM-dd")}</Birthday>
    <BirthPlace>${form.birthPlace!"BirthPlace"}</BirthPlace>
    <PassportType>${form.passport_type!""}</PassportType>
    <PassportNumber>${form.passportnumber!""}</PassportNumber>
    <PassportIssueDate>${form.passportissuedate?string("yyyy-MM-dd")}</PassportIssueDate>
    <PassportAuthority>${form.passportauthority!""}</PassportAuthority>
    <INN>${form.inn!""}</INN>
    <Address>
        <@address "address"/>
    </Address>
    <PhoneNumber>${form.phone!""}</PhoneNumber>
    <Email>${form.email!""}</Email>
</PhysicalPerson>
</#macro>


<#macro jyridical>
<JyridicalPerson>
    <FullName>${form.zayvfullname!""}</FullName>
    <FormOfIncorporation>${form.subjopf!""}</FormOfIncorporation>
    <OGRN>${form.subjogrn!""}</OGRN>
    <INN>${form.inn_ul!""}</INN>
    <Address>
        <@address "address_ul"/>
    </Address>
    <PhysicalAddress>
    <#if form['equal_address']?? && form['equal_address'] == 'on'>
        <@address "address_ul"/>
    <#else>
        <@address "fact_address_ul"/>
    </#if>
    </PhysicalAddress>
    <PhoneNumber>${form.phone!""}</PhoneNumber>
    <Email>${form.email!""}</Email>
    <#nested>
</JyridicalPerson>
</#macro>


<#macro address prefix="">
    <Region>${utils.dictionaryValue(form[prefix + "_region"]!'', 'KLADRRegion')}</Region>
    <Area>${utils.dictionaryValue(form[prefix + "_area"]!'', 'KLADRRegion')}</Area>
    <Locality>${utils.dictionaryValue(form[prefix + "_city"]?split(",")[0]!'', 'KLADRRegion')}</Locality>
    <#if form[prefix + "_kladr"]?? && form[prefix + "_kladr"] == 'on'>
        <Street>${form[prefix + "_street_text"]!''}</Street>
    <#else>
        <Street>${utils.dictionaryValue(form[prefix + "_street"]!'', 'KLADRStreet')}</Street>
    </#if>
    <House>${form[prefix + "_house"]!''}</House>
    <Block>${form[prefix + "_block"]!''}</Block>
    <Building>${form[prefix + "_building"]!''}</Building>
    <Apartament>${form[prefix + "_apartament"]!''}</Apartament>
    <KLADRCode>${form[prefix + "_city"]?split(",")[0]!''}</KLADRCode>
</#macro>


<#function getWorkKind code>
    <#return workKinds[code]>
</#function>

<#function getConstructionType code>
    <#return constructionTypes[code]>
</#function>

<#function getOwnershipType code>
    <#return ownershipTypes[code]>
</#function>

<#function getRightType code>
    <#return rightTypes[code]>
</#function>

<#function getCondprovownType code>
    <#return condprovownTypes[code]>
</#function>

<#function getZupresonType code>
    <#return zupresonTypes[code]>
</#function>

<#function getArea field>
    <#assign splitted_array = form[field]?split(",")>
    <#assign result = "">
    <#if splitted_array?size &gt; 1>
        <#assign result = utils.dictionaryValue(splitted_array[1], 'KLADRRegion')>
    </#if>
    <#return result>
</#function>

<#function getLocality field>
    <#assign splitted_array = form[field]?split(",")>
    <#return utils.dictionaryValue(splitted_array[0], 'KLADRRegion')>
</#function>

<#macro subjectType field physicalValue>
    <#if form[field] == physicalValue>
        <SubjectType>PhysicalPerson</SubjectType>
    <#else>
        <SubjectType>JyridicalPerson</SubjectType>
    </#if>
</#macro>
