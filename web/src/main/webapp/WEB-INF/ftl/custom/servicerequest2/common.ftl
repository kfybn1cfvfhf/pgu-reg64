<#ftl encoding="UTF-8">

<#import "/utils.ftl" as util>

<#assign virtualParentsRegistry=[] />

<#--
    Макросы, которые должны быть объявлены в адаптерах:
        makeDictionarySOAP, makeEmptyDictionarySOAP, makeClonableDictionarySOAP
        makeCustomLookupSOAP, makeEmptyCustomLookupSOAP, makeClonableCustomLookupSOAP
        makeBooleanSOAP, makeClonableBooleanSOAP
        makeStaticOptionsSOAP, makeEmptyStaticOptionsSOAP, makeClonableStaticOptionsSOAP
        makeMultiselectableStaticOptionsSOAP, makeEmptyMultiselectableStaticOptionsSOAP, makeClonableMultiselectableStaticOptionsSOAP
        makeDateSOAP, makeEmptyDateSOAP, makeClonableDateSOAP
        makePlainTextSOAP, makeEmptyPlainTextSOAP, makeClonablePlainTextSOAP
        makeFileSOAP, makeEmptyFileSOAP, makeClonableFileSOAP

    Каждому полю в передаваемом хэше соответствует элемент, ключом которого является идентификатор поля, а значением - хэш метаданных поля,
    содержащий как минимум класс поля с ключом widgetClass. Тип поля может принимать следующие значения:
        dictionary
        multiselectableDictionary
        customLookup
        boolean
        staticOptions
        multiselectableStaticOptions
        date
    Если тип поля принимает значение, отличное от вышеперечисленнных, считается, что поле содержит текст, не нуждающийся в дополнительных преобразованиях перед передачей в ВИС.

    Помимо типа поля в хэше метаданных может содержаться дополнительная информация, специфичная для разных типов полей (подробнее - см. ниже комментарии для каждого типа поля).
    При необходимости передать в макросы адаптеров дополнительные данные, не предусмотренные в настоящий момент, это можно сделать через хэш метаданных поля, который передаётся
    в каждый макрос адаптера.
-->
<#macro makeSoapForFields formElements adapterNamespace> <#-- formElements - хэш вида "название элемента -> метаданные элемента". Метаданные элемента специфичны для типов элементов и адаптеров и представлены в виде хэша. -->

    <#list formElements?keys as formElementId>

        <#local formElementMetadata=formElements[formElementId] />

        <#-- formElementMetadata.widgetClass is required -->
        <#switch formElementMetadata.widgetClass>

            <#case "dictionary"> <#-- dictionaryLookup, radiogroup (if dictionary used as data source) -->
                <#-- Required options in formElementMetadata:
                        dictionaryCode
                -->
                <#if form[formElementId]?? && ((form[formElementId]?is_sequence) || (form[formElementId]!=''))>
                    <#if form[formElementId]?is_sequence>
                        <#local clones={} />
                        <#list form[formElementId] as cloneKey>
                            <#if cloneKey?has_content>
                                <#local clones = clones + {"${cloneKey_index}":{
                                    "selectedItemKey":cloneKey,
                                    "selectedItemValue":"${(dicRegistry.getItemByKey(formElementMetadata.dictionaryCode, cloneKey).name)!}"
                                }} />
                            </#if>
                        </#list>
                        <@adapterNamespace.makeClonableDictionarySOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=clones
                        />
                    <#else>
                        <@adapterNamespace.makeDictionarySOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            selectedItemKey=form[formElementId]
                            selectedItemValue="${(dicRegistry.getItemByKey(formElementMetadata.dictionaryCode, form[formElementId]).name)!}"
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyDictionarySOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>

            <#case "multiselectableDictionary"> <#-- checkboxLookup, checkboxGroup -->
                <#-- Required options in formElementMetadata:
                        dictionaryCode
                -->
                 <#--
                    Элемент - всегда сиквенс идентификаторов элементов справочника.
                    Если он пуст, значит ничего не выбрано.
                    Если это скивенс строк, значит он не клонируемый.
                    Если это скивенс сиквенсов, значит он клонируемый.
                 -->
                <#if form[formElementId]?has_content>

                    <#local isClonable = false />
                    <#list form[formElementId] as assumedClone>
                        <#if assumedClone?? && assumedClone?is_sequence>
                            <#local isClonable = true />
                            <#break/>
                        </#if>
                    </#list>

                    <#if isClonable>
                        <#local clones = [] />
                        <#list form[formElementId] as cloneSelectedItemkeys>
                            <#local cloneSelectedItems = {} />
                            <#if cloneSelectedItemkeys?has_content>
                                <#list cloneSelectedItemkeys as cloneSelectedItemkey>
                                    <#local cloneSelectedItems = cloneSelectedItems + {cloneSelectedItemkey:"${(dicRegistry.getItemByKey(formElementMetadata.dictionaryCode, cloneSelectedItemkey).name)!}"} />
                                </#list>
                            </#if>
                            <#local clones = clones + [cloneSelectedItems] />
                        </#list>
                        <@adapterNamespace.makeClonableMultiselectableDictionarySOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=clones
                        />
                    <#else>
                        <#local selectedItems = {} />
                        <#list form[formElementId] as selectedItemKey>
                            <#if selectedItemKey?has_content>
                                <#local selectedItemValue = "${(dicRegistry.getItemByKey(formElementMetadata.dictionaryCode, selectedItemKey).name)!}" />
                                <#local selectedItems = selectedItems + {selectedItemKey:selectedItemValue} />
                            </#if>
                        </#list>
                        <@adapterNamespace.makeMultiselectableDictionarySOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            selectedItems=selectedItems
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyMultiselectableDictionarySOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>

            <#case "customLookup">
                <#-- Required options in formElementMetadata:
                    lookupControllerName
                    optionsMap - хэш дополнительных параметров, передаваемых в ajax-запросе
                -->
                <#if form[formElementId]?? && ((form[formElementId]?is_sequence) || (form[formElementId]!=''))>
                    <#local lookupController = customLookupRegistry.getController(formElementMetadata.lookupControllerName)/>
                    <#local optionsMap = formElementMetadata.optionsMap + {"authToken":cAuthToken} />
                    <#local formElementMetadata = formElementMetadata + {"optionsMap":optionsMap} />
                    <#local optionsJSON><@util.toJSON formElementMetadata.optionsMap/></#local>
                    <#if form[formElementId]?is_sequence>
                        <#local clones={} />
                        <#list form[formElementId] as cloneKey>
                            <#if cloneKey?has_content>
                                <#local clones = clones + {"${cloneKey_index}":{
                                    "selectedItemKey":cloneKey,
                                    "selectedItemValue":"${(lookupController.getValueByCodeWrapper(form[formElementId], optionsJSON))!}"
                                }} />
                            </#if>
                        </#list>
                        <@adapterNamespace.makeClonableCustomLookupSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=clones
                        />
                    <#else>
                        <@adapterNamespace.makeCustomLookupSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            selectedItemKey=form[formElementId]
                            selectedItemValue="${(lookupController.getValueByCodeWrapper(form[formElementId], optionsJSON))!}"
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyCustomLookupSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>

            <#case "boolean"> <#-- checkboxes -->
                <#if form[formElementId]??>
                    <#if form[formElementId]?is_sequence>
                        <#local clones=[] />
                        <#list form[formElementId] as cloneVal>
                            <#if cloneVal?has_content && cloneVal == "on">
                                <#local clones = clones + [true] />
                            <#else>
                                <#local clones = clones + [false] />
                            </#if>
                        </#list>
                        <@adapterNamespace.makeClonableBooleanSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=clones
                        />
                    <#else>
                        <#if form[formElementId] == "on">
                            <@adapterNamespace.makeBooleanSOAP
                                boolVal=true
                                formElementId=formElementId
                                formElementMetadata=formElementMetadata
                            />
                        <#else>
                            <@adapterNamespace.makeBooleanSOAP
                                boolVal=false
                                formElementId=formElementId
                                formElementMetadata=formElementMetadata
                            />
                        </#if>
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyBooleanSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>

            <#case "staticOptions"> <#-- staticLookup, radiogroup (if staticopts used as data source) -->
                <#-- Required options in formElementMetadata:
                    items - хэш возможных значений элемента формы с указанием их кода
                -->
                <#if form[formElementId]?? && ((form[formElementId]?is_sequence) || (form[formElementId]!=''))>
                    <#if form[formElementId]?is_sequence>
                        <#local clones={} />
                        <#list form[formElementId] as cloneKey>
                            <#if cloneKey?has_content>
                                <#local clones = clones + {"${cloneKey_index}":{
                                    "selectedItemKey":cloneKey,
                                    "selectedItemValue":formElementMetadata.items[cloneKey]
                                }} />
                            </#if>
                        </#list>
                        <@adapterNamespace.makeClonableStaticOptionsSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=clones
                        />
                    <#else>
                        <@adapterNamespace.makeStaticOptionsSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            selectedItemKey = form[formElementId]
                            selectedItemValue = formElementMetadata.items[form[formElementId]]
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyStaticOptionsSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>

            <#case "multiselectableStaticOptions"> <#-- checkboxGroup (if staticopts used as data source) -->
                <#-- Required options in formElementMetadata:
                    items - хэш возможных значений элемента формы с указанием их кода
                -->
                 <#--
                    Элемент - всегда сиквенс идентификаторов элементов справочника.
                    Если он пуст, значит ничего не выбрано.
                    Если это скивенс строк, значит он не клонируемый.
                    Если это скивенс сиквенсов, значит он клонируемый.
                 -->
                <#if form[formElementId]?has_content>
                    <#if form[formElementId]?first?is_sequence>
                        <#local clones=[] />
                        <#list form[formElementId] as cloneSelectedItemkeys>
                            <#local cloneSelectedItems={} />
                            <#if cloneSelectedItemkeys?has_content>
                                <#list cloneSelectedItemkeys as cloneSelectedItemKey>
                                    <#local cloneSelectedItems = cloneSelectedItems + {cloneSelectedItemKey:formElementMetadata.items[cloneSelectedItemKey]} />
                                </#list>
                            </#if>
                            <#local clones = clones + [cloneSelectedItems] />
                        </#list>
                        <@adapterNamespace.makeClonableMultiselectableStaticOptionsSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=clones
                        />
                    <#else>
                        <#local selectedItems={} />
                        <#list form[formElementId] as selectedItemId>
                            <#local selectedItems = selectedItems + {selectedItemId:formElementMetadata.items[selectedItemId]} />
                        </#list>
                        <@adapterNamespace.makeMultiselectableStaticOptionsSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            selectedItems=selectedItems
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyMultiselectableStaticOptionsSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>


            <#case "date"> <#-- datefield -->
                <#if form[formElementId]??>
                    <#if form[formElementId]?is_sequence>
                        <@adapterNamespace.makeClonableDateSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=form[formElementId]
                        />
                    <#else>
                        <@adapterNamespace.makeDateSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            dateVal=form[formElementId]
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyDateSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
                <#break>


            <#case "virtualParent"> <#-- виртуальный группирующий элемент -->
            <#--
                required options: cloneQuantity
            -->
                <#if !virtualParentsRegistry?seq_contains(formElementId) && formElementMetadata.cloneQuantity &gt; 0>
                    <#assign virtualParentsRegistry = virtualParentsRegistry + [formElementId] />
                    <@adapterNamespace.makeVirtualParentSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                        cloneQuantity=formElementMetadata.cloneQuantity
                    />
                </#if>
                <#break>

            <#default> <#-- textfield, passwordfield, textarea, datefieldMonth, datefieldYear -->
                <#if form[formElementId]??>
                    <#if form[formElementId]?is_sequence>
                        <@adapterNamespace.makeClonablePlainTextSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            parentCode="${formElementMetadata.parentCode!}"
                            clones=form[formElementId]
                        />
                    <#else>
                        <@adapterNamespace.makePlainTextSOAP
                            formElementId=formElementId
                            formElementMetadata=formElementMetadata
                            textVal=form[formElementId]
                        />
                    </#if>
                <#else>
                    <@adapterNamespace.makeEmptyPlainTextSOAP
                        formElementId=formElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>

        </#switch>
    </#list>
</#macro>

<#macro makeSoapForFiles adapterNamespace
    fileloadElements    <#-- хэш вида "<id поля загрузки файла на форме>:<метаданные поля загрузки файла на форме>" -->
>


    <#list fileloadElements?keys as fileloadElementId>

        <#local formElementMetadata=fileloadElements[fileloadElementId] />

        <#if form[fileloadElementId]??>
            <#if form[fileloadElementId]?is_sequence>
                <#local fileNames=[] />
                <#local fileContentNames=[] />
                <#list form[fileloadElementId] as clone>
                    <#local fileName = form[fileloadElementId][clone_index].fileName />
                    <#local fileContentName>${fileloadElementId}[${clone_index}]_base64</#local>
                    <#if form[fileContentName]??>
                        <#local fileNames = fileNames + [fileName] />
                        <#local fileContentNames = fileContentNames + [fileContentName] />
                    </#if>
                </#list>
                <#if fileContentNames?has_content>
                    <@adapterNamespace.makeClonableFileSOAP
                        formElementId=fileloadElementId
                        formElementMetadata=formElementMetadata
                        fileNames=fileNames
                        fileContentNames=fileContentNames
                    />
                <#else>
                    <@adapterNamespace.makeEmptyFileSOAP
                        formElementId=fileloadElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
            <#else>
                <#local fileContentName="${fileloadElementId}_base64" />
                <#if form[fileContentName]??>
                    <@adapterNamespace.makeFileSOAP
                        formElementId=fileloadElementId
                        formElementMetadata=formElementMetadata
                        fileName=form[fileloadElementId].fileName
                        fileContentName="${fileloadElementId}_base64"
                    />
                <#else>
                    <@adapterNamespace.makeEmptyFileSOAP
                        formElementId=fileloadElementId
                        formElementMetadata=formElementMetadata
                    />
                </#if>
            </#if>
        <#else>
            <@adapterNamespace.makeEmptyFileSOAP
                formElementId=fileloadElementId
                formElementMetadata=formElementMetadata
            />
        </#if>
    </#list>
</#macro>