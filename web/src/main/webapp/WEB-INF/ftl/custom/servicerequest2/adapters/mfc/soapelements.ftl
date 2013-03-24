<#ftl encoding="UTF-8">

<#-- dictionaryLookup, radiogroup (if dictionary used as data source) -->

<#macro makeDictionarySOAP formElementId formElementMetadata
    selectedItemKey     <#-- ключ выбранного элемента справочника -->
    selectedItemValue   <#-- значение выбранного элемента справочника -->
>
    <attr>
        <code>${formElementId}</code>
        <stringValue>${selectedItemValue}</stringValue>
    </attr>
</#macro>

<#macro makeClonableDictionarySOAP formElementId formElementMetadata
    clones          <#-- хэш вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
    parentCode=""   <#-- код виртуального группирующего элемента -->
>
    <#if clones?has_content>
        <#list clones?keys as cloneKey>
            <#if clones[cloneKey]??>
                <attr>
                    <code>${formElementId}</code>
                    <#if parentCode?has_content>
                        <parentCloneNum>${cloneKey}</parentCloneNum>
                        <parentCode>${parentCode}</parentCode>
                    </#if>
                    <stringValue>${clones[cloneKey].selectedItemValue}</stringValue>
                </attr>
            </#if>
        </#list>
    <#else>
        <@makeEmptyDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
    </#if>
</#macro>

<#macro makeEmptyDictionarySOAP formElementId formElementMetadata></#macro>




<#-- checkboxLookup, checkboxGroup -->

<#macro makeMultiselectableDictionarySOAP formElementId formElementMetadata
    selectedItems           <#-- хэш вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    <#if selectedItems?has_content>
        <#list selectedItems?keys as selectedItemKey>
            <@makeDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItemKey=selectedItemKey selectedItemValue=selectedItems[selectedItemKey] />
        </#list>
    <#else>
        <@makeEmptyDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
    </#if>
</#macro>

<#macro makeClonableMultiselectableDictionarySOAP formElementId formElementMetadata
    parentCode  <#-- код виртуального группирующего элемента -->
    clones      <#-- сиквенс хэшей вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    <#if clones?has_content>
        <#list clones as clone>
            <#if clone??>
                <#list clone?keys as selectedItemKey>
                    <attr>
                        <code>${formElementId}</code>
                        <parentCode>${parentCode}</parentCode>
                        <parentCloneNum>${clone_index}</parentCloneNum>
                        <stringValue>${clone[selectedItemKey]}</stringValue>
                    </attr>
                </#list>
            </#if>
        </#list>
    <#else>
        <@makeEmptyMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
    </#if>
</#macro>

<#macro makeEmptyMultiselectableDictionarySOAP formElementId formElementMetadata></#macro>




<#-- customLookup -->

<#macro makeCustomLookupSOAP formElementId formElementMetadata
    selectedItemKey     <#-- ключ выбранного элемента -->
    selectedItemValue   <#-- значение выбранного элемента -->
>
    <@makeDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItemKey=selectedItemKey selectedItemValue=selectedItemValue />
</#macro>

<#macro makeClonableCustomLookupSOAP formElementId formElementMetadata
    clones          <#-- хэш вида "<id выбранного элемента>:<значение выбранного элемента>" -->
    parentCode=""   <#-- код виртуального группирующего элемента -->
>
    <@makeClonableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata parentCode=parentCode clones=clones />
</#macro>

<#macro makeEmptyCustomLookupSOAP formElementId formElementMetadata>
    <@makeEmptyDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
</#macro>




<#-- checkboxes -->

<#macro makeBooleanSOAP formElementId formElementMetadata
    boolVal <#-- бинарное значение -->
>
    <attr>
        <code>${formElementId}</code>
        <booleanValue>${boolVal?string}</booleanValue>
    </attr>
</#macro>

<#macro makeClonableBooleanSOAP formElementId formElementMetadata
    clones          <#-- сиквенс бинарных значений клонов -->
    parentCode=""   <#-- код виртуального группирующего элемента -->
>
    <#if clones?has_content>
        <#list clones as clone>
            <#if clone??>
                <attr>
                    <code>${formElementId}</code>
                    <#if parentCode?has_content>
                        <parentCode>${parentCode}</parentCode>
                        <parentCloneNum>${clone_index}</parentCloneNum>
                    </#if>
                    <booleanValue>${boolVal?string}</booleanValue>
                </attr>
            </#if>
        </#list>
    <#else>
        <@makeEmptyBooleanSOAP formElementId=formElementId formElementMetadata=formElementMetadata />
    </#if>
</#macro>

<#macro makeEmptyBooleanSOAP formElementId formElementMetadata></#macro>




<#-- staticLookup, radiogroup (if staticopts used as data source) -->

<#macro makeStaticOptionsSOAP formElementId formElementMetadata
    selectedItemKey     <#-- id выбранной статичной опции -->
    selectedItemValue   <#-- значение выбранной статичной опции -->
>
    <@makeDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItemKey=selectedItemKey selectedItemValue=selectedItemValue />
</#macro>

<#macro makeClonableStaticOptionsSOAP formElementId formElementMetadata
    clones          <#-- хэш вида "<id выбранной статичной опции>:<значение выбранной статичной опции>" -->
    parentCode=""   <#-- код виртуального группирующего элемента -->
>
    <@makeClonableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata parentCode=parentCode clones=clones />
</#macro>

<#macro makeEmptyStaticOptionsSOAP formElementId formElementMetadata>
    <@makeEmptyDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
</#macro>




<#-- checkboxGroup (if staticopts used as data source) -->

<#macro makeMultiselectableStaticOptionsSOAP formElementId formElementMetadata
    selectedItems           <#-- хэш вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    <@makeMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItems=selectedItems />
</#macro>

<#macro makeClonableMultiselectableStaticOptionsSOAP formElementId formElementMetadata
    parentCode  <#-- код виртуального группирующего элемента -->
    clones      <#-- сиквенс хэшей вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    <@makeClonableMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata parentCode=parentCode clones=clones />
</#macro>

<#macro makeEmptyMultiselectableStaticOptionsSOAP formElementId formElementMetadata>
    <@makeEmptyMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
</#macro>




<#-- datefield -->
<#macro makeDateSOAP formElementId formElementMetadata
    dateVal <#-- дата -->
>
    <attr>
        <code>${formElementId}</code>
        <dateValue>${dateVal?string("yyyy-MM-dd'T'HH:mm:ss")}</dateValue>
    </attr>
</#macro>

<#macro makeClonableDateSOAP formElementId formElementMetadata
    clones          <#-- сиквенс дат -->
    parentCode=""   <#-- код виртуального группирующего элемента -->
>
    <#if clones?has_content>
        <#list clones as clone>
            <#if clone??>
                <attr>
                    <code>${formElementId}</code>
                    <#if parentCode?has_content>
                        <parentCode>${parentCode}</parentCode>
                        <parentCloneNum>${clone_index}</parentCloneNum>
                    </#if>
                    <dateValue>${clone?string("yyyy-MM-dd'T'HH:mm:ss")}</dateValue>
                </attr>
            </#if>
        </#list>
    <#else>
        <@makeEmptyDateSOAP formElementId=formElementId formElementMetadata=formElementMetadata />
    </#if>
</#macro>

<#macro makeEmptyDateSOAP formElementId formElementMetadata></#macro>




<#macro makeVirtualParentSOAP formElementId formElementMetadata
    cloneQuantity <#-- количество клонов -->
>
    <#list 0..cloneQuantity-1 as cloneNum>
        <attr>
            <code>${formElementId}</code>
            <cloneNum>${cloneNum}</cloneNum>
        </attr>
    </#list>
</#macro>




<#-- textfield, passwordfield, textarea, datefieldMonth, datefieldYear -->
<#macro makePlainTextSOAP formElementId formElementMetadata
    textVal <#-- текст -->
>
    <attr>
        <code>${formElementId}</code>
        <stringValue>${textVal}</stringValue>
    </attr>
</#macro>

<#macro makeClonablePlainTextSOAP formElementId formElementMetadata
    clones          <#-- сиквенс текстовых строк -->
    parentCode=""   <#-- код виртуального группирующего элемента -->
>
    <#if clones?has_content>
        <#list clones as clone>
            <#if clone??>
                <attr>
                    <code>${formElementId}</code>
                    <#if parentCode?has_content>
                        <parentCode>${parentCode}</parentCode>
                        <parentCloneNum>${clone_index}</parentCloneNum>
                    </#if>
                    <stringValue>${clone}</stringValue>
                </attr>
            </#if>
        </#list>
    <#else>
        <@makeEmptyPlainTextSOAP formElementId=formElementId formElementMetadata=formElementMetadata />
    </#if>
</#macro>

<#macro makeEmptyPlainTextSOAP formElementId formElementMetadata></#macro>



<#-- fileload -->

<#macro makeFileSOAP
    formElementId           <#-- id элемента загрузки файла на форме -->
    formElementMetadata     <#-- метаданные -->
    fileName                <#-- имя загруженного файла -->
    fileContentName         <#-- имя поля формы, в котором находится содержимое файла -->
>
    <item>
        <docTypeId>${formElementId}</docTypeId>
        <docClassId/>
        <files>
            <FileBinary>${form[fileContentName]}</FileBinary>
            <Filename>${fileName}</Filename>
        </files>
    </item>
</#macro>

<#macro makeClonableFileSOAP
    formElementId           <#-- id элемента загрузки файла на форме -->
    formElementMetadata     <#-- метаданные -->
    fileNames               <#-- сиквенс имён файлов -->
    fileContentNames        <#-- сиквенс имён полей на форме, хранящих содержимое файла -->
>
    <item>
        <docTypeId>${formElementId}</docTypeId>
        <docClassId/>
        <#list fileNames as fileName>
            <files>
                <FileBinary>${form[fileContentNames[fileName_index]]}</FileBinary>
                <Filename>${fileName}</Filename>
            </files>
        </#list>
    </item>
</#macro>

<#macro makeEmptyFileSOAP formElementId formElementMetadata></#macro>