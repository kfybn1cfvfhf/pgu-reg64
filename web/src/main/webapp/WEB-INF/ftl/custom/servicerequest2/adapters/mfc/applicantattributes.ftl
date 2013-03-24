<#ftl encoding="UTF-8">

<#-- dictionaryLookup, radiogroup (if dictionary used as data source) -->

<#macro makeDictionarySOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    selectedItemKey     <#-- ключ выбранного элемента справочника -->
    selectedItemValue   <#-- значение выбранного элемента справочника -->
>
    <${formElementMetadata.applicantAttributeName}>${selectedItemValue}</${formElementMetadata.applicantAttributeName}>
</#macro>

<#macro makeClonableDictionarySOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- хэш вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    NOT IMPLEMENTED!!!
</#macro>

<#macro makeEmptyDictionarySOAP formElementId formElementMetadata
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
></#macro>




<#-- checkboxLookup, checkboxGroup -->

<#macro makeMultiselectableDictionarySOAP formElementId
    formElementMetadata <#-- должен содержать optionCode - код, с которым будут передаваться выбранные элементы, applicantAttributeName - название реквизита заявителя -->
    selectedItems       <#-- хэш вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    NOT IMPLEMENTED!!!
</#macro>

<#macro makeClonableMultiselectableDictionarySOAP formElementId
    formElementMetadata <#-- должен содержать optionCode - код, с которым будут передаваться выбранные элементы, applicantAttributeName - название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- сиквенс хэшей вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    NOT IMPLEMENTED!!!
</#macro>

<#macro makeEmptyMultiselectableDictionarySOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
></#macro>




<#-- customLookup -->

<#macro makeCustomLookupSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    selectedItemKey     <#-- ключ выбранного элемента -->
    selectedItemValue   <#-- значение выбранного элемента -->
>
    <@makeDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItemKey=selectedItemKey selectedItemValue=selectedItemValue />
</#macro>

<#macro makeClonableCustomLookupSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- хэш вида "<id выбранного элемента>:<значение выбранного элемента>" -->
>
    <@makeClonableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata clones=clones />
</#macro>

<#macro makeEmptyCustomLookupSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
>
    <@makeEmptyDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
</#macro>




<#-- checkboxes -->

<#macro makeBooleanSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    boolVal             <#-- бинарное значение -->
>
    <${formElementMetadata.applicantAttributeName}>${boolVal}</${formElementMetadata.applicantAttributeName}>
</#macro>

<#macro makeClonableBooleanSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- сиквенс бинарных значений клонов -->
>
    NOT IMPLEMENTED!!!
</#macro>

<#macro makeEmptyBooleanSOAP formElementId formElementMetadata></#macro>




<#-- staticLookup, radiogroup (if staticopts used as data source) -->

<#macro makeStaticOptionsSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    selectedItemKey     <#-- id выбранной статичной опции -->
    selectedItemValue   <#-- значение выбранной статичной опции -->
>
    <@makeDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItemKey=selectedItemKey selectedItemValue=selectedItemValue />
</#macro>

<#macro makeClonableStaticOptionsSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- хэш вида "<id выбранной статичной опции>:<значение выбранной статичной опции>" -->
>
    <@makeClonableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata clones=clones />
</#macro>

<#macro makeEmptyStaticOptionsSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
>
    <@makeEmptyDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
</#macro>




<#-- checkboxGroup (if staticopts used as data source) -->

<#macro makeMultiselectableStaticOptionsSOAP formElementId
    formElementMetadata <#-- должен содержать optionCode - код, с которым будут передаваться выбранные элементы, applicantAttributeName - название реквизита заявителя -->
    selectedItems       <#-- хэш вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    <@makeMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata selectedItems=selectedItems />
</#macro>

<#macro makeClonableMultiselectableStaticOptionsSOAP formElementId
    formElementMetadata <#-- должен содержать optionCode - код, с которым будут передаваться выбранные элементы, applicantAttributeName - название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- сиквенс хэшей вида "<id выбранного элемента справочника>:<значение выбранного элемента справочника>" -->
>
    <@makeClonableMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata clones=clones />
</#macro>

<#macro makeEmptyMultiselectableStaticOptionsSOAP formElementId
    formElementMetadata <#-- должен содержать applicantAttributeName - название реквизита заявителя -->
>
    <@makeEmptyMultiselectableDictionarySOAP formElementId=formElementId formElementMetadata=formElementMetadata />
</#macro>




<#-- datefield -->
<#macro makeDateSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    dateVal             <#-- дата -->
>
    <${formElementMetadata.applicantAttributeName}>${dateVal?string("yyyy-MM-dd'T'HH:mm:ss")}</${formElementMetadata.applicantAttributeName}>
</#macro>

<#macro makeClonableDateSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- сиквенс дат -->
>
    NOT IMPLEMENTED!!!
</#macro>

<#macro makeEmptyDateSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
>
    <${formElementMetadata.applicantAttributeName}></${formElementMetadata.applicantAttributeName}>
</#macro>




<#-- textfield, passwordfield, textarea, datefieldMonth, datefieldYear -->
<#macro makePlainTextSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    textVal             <#-- текст -->
>
    <${formElementMetadata.applicantAttributeName}>${textVal}</${formElementMetadata.applicantAttributeName}>
</#macro>

<#macro makeClonablePlainTextSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
    parentCode          <#-- код виртуального группирующего элемента -->
    clones              <#-- сиквенс текстовых строк -->
>
    NOT IMPLEMENTED!!!
</#macro>

<#macro makeEmptyPlainTextSOAP formElementId
    formElementMetadata <#-- должен содержать в applicantAttributeName название реквизита заявителя -->
>
    <@makePlainTextSOAP formElementId=formElementId formElementMetadata=formElementMetadata textVal="" />
</#macro>