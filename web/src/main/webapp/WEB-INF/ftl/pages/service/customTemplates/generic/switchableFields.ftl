<#include "defaultHeaders.ftl">
<#macro updateSwitchableField field scope="ROW">
<@action.setRequiredIf 'true' '${field+"_gr"}' 'change' '${field}' '1' />
<@action.setRequiredIf 'true' '${field+"_gr"}' 'change' '${field+"_m"}' '2'/>
<@action.setVisibleByValue  'true' '${field+"_gr"}' 'change' '${field}' "1" scope/>
<@action.setVisibleByValue  'true' '${field+"_gr"}' 'change' '${field+"_m"}' "2" scope/>
</#macro>

<#macro formFieldAbstract
radioGroupXFormField="form.addr_agency_place_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
dictionaryXFormField="form.addr_agency_place" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
textboxXFormField="form.addr_agency_place_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[\\|\\"А-ЯЁ0-9\\s./№()-]{0,20}$/i', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} textboxXLabelRequired=false
radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="6" radioGroupFieldColspan="29" radioGroupFieldColspanPaddingRight="1" radioGroupSeparatorColspan="1"
dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="6" dictionaryFieldColspan="29" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
textboxLabelColspanPaddingLeft="1" textboxLabelColspan="6" textboxFieldColspan="29" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1" textBoxMaxLength="20">
    <@sf.fldrow>
        <@radioGroupAbstract
            labelHaveLeftPadding=true
            fieldHaveRightPadding=true
            notd=false
            nolabel=false
            nofield=false
            noseparator=false
            radioGroupXFormField=radioGroupXFormField radioGroupXLabelTitle=radioGroupXLabelTitle radioGroupXValidation=radioGroupXValidation radioGroupXLabelRequired=true
            radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft radioGroupLabelColspan=radioGroupLabelColspan radioGroupFieldColspan=radioGroupFieldColspan radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight radioGroupSeparatorColspan=radioGroupSeparatorColspan
        />
    </@sf.fldrow>
    <@sf.fldrow>
        <@dictionaryAbstract
            labelHaveLeftPadding=true
            fieldHaveRightPadding=true
            notd=false
            nolabel=false
            nofield=false
            noseparator=false
            dictionaryXFormField=dictionaryXFormField dictionaryXLabelTitle=dictionaryXLabelTitle dictionaryXDicCode=dictionaryXDicCode dictionaryXValidation=dictionaryXValidation dictionaryXLabelRequired=dictionaryXLabelRequired
            dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
        />
    </@sf.fldrow>
    <@sf.fldrow>
        <@textboxAbstract
            labelHaveLeftPadding=true
            fieldHaveRightPadding=true
            notd=false
            nolabel=false
            nofield=false
            noseparator=false
            maxlength=textBoxMaxLength
            textboxXFormField=textboxXFormField textboxXLabelTitle=textboxXLabelTitle textboxXValidation=textboxXValidation textboxXValidationAttr=textboxXValidationAttr textboxXLabelRequired=textboxXLabelRequired
            textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
        />
    </@sf.fldrow>
</#macro>

<#macro radioGroupAbstract
    labelHaveLeftPadding=false
    fieldHaveRightPadding=false
    notd=false
    nolabel=false
    nofield=false
    noseparator=false
    radioGroupXFormField="form.addr_agency_place_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="6" radioGroupFieldColspan="29" radioGroupFieldColspanPaddingRight="1" radioGroupSeparatorColspan="1"
>

    <#if !nolabel>
        <#if labelHaveLeftPadding>
            <@sf.empty colspan=radioGroupLabelColspanPaddingLeft/>
        </#if>
        <@sf.label notd=notd path="${radioGroupXFormField}" title="${radioGroupXLabelTitle}" style="text-align: right" colspan=radioGroupLabelColspan required=radioGroupXLabelRequired />
    </#if>
    <#if !noseparator>
        <@sf.empty colspan=radioGroupSeparatorColspan/>
    </#if>
    <#if !nofield>
        <@sf.radiogroup notd=notd path="${radioGroupXFormField}" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' colspan=radioGroupFieldColspan  validation="${radioGroupXValidation}" />
        <#if fieldHaveRightPadding>
            <@sf.empty colspan=radioGroupFieldColspanPaddingRight/>
        </#if>
    </#if>
</#macro>

<#macro dictionaryAbstract
    labelHaveLeftPadding=false
    fieldHaveRightPadding=false
    notd=false
    nolabel=false
    nofield=false
    noseparator=false

    dictionaryXFormField="form.addr_agency_place" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="6" dictionaryFieldColspan="29" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
>

    <#if !nolabel>
        <#if labelHaveLeftPadding>
            <@sf.empty colspan=dictionaryLabelColspanPaddingLeft/>
        </#if>
        <@sf.label notd=notd path="${dictionaryXFormField}" title="${dictionaryXLabelTitle}" required=dictionaryXLabelRequired style="text-align:right;" colspan=dictionaryLabelColspan/>
    </#if>
    <#if !noseparator>
        <@sf.empty colspan=dictionarySeparatorColspan/>
    </#if>
    <#if !nofield>
        <@sf.dictionaryLookup notd=notd path="${dictionaryXFormField}" dictionaryCode="${dictionaryXDicCode}" qtip=""  validation="${dictionaryXValidation}" style="text-align:left;" colspan=dictionaryFieldColspan/>
        <#if fieldHaveRightPadding>
            <@sf.empty colspan=dictionaryFieldColspanPaddingRight/>
        </#if>
    </#if>
</#macro>

<#macro textboxAbstract
    labelHaveLeftPadding=false
    fieldHaveRightPadding=false
    notd=false
    nolabel=false
    nofield=false
    noseparator=false
    maxlength=20

    textboxXFormField="form.addr_agency_place_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,20}$/', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} textboxXLabelRequired=false
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="6" textboxFieldColspan="29" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
>
    <#if !nolabel>
        <#if labelHaveLeftPadding>
            <@sf.empty colspan=textboxLabelColspanPaddingLeft/>
        </#if>
        <@sf.label notd=notd path="${textboxXFormField}" title="${textboxXLabelTitle}" required=textboxXLabelRequired style="text-align:right;" colspan=textboxLabelColspan/>
    </#if>
    <#if !noseparator>
        <@sf.empty colspan=textboxSeparatorColspan/>
    </#if>
    <#if !nofield>
        <@sf.textfield notd=notd path="${textboxXFormField}" validation="${textboxXValidation}" validationattr=textboxXValidationAttr qtip=""  style="text-align:left;" colspan=textboxFieldColspan attr="maxlength="+maxlength/>
        <#if fieldHaveRightPadding>
            <@sf.empty colspan=textboxFieldColspanPaddingRight/>
        </#if>
    </#if>
</#macro>

<#macro requestFieldAbstract radioGroupXFormField dictionaryXDicCode dictionaryXFormField textboxXFormField xmlName="typeNP">
    <#if radioGroupXFormField=="1">
        <#if dictionaryXFormField?has_content>
        <${xmlName}>${dicRegistry.getItemByKey(dictionaryXDicCode, dictionaryXFormField!'null').name?html}</${xmlName}>
        <#else>
        <${xmlName}/>
        </#if>
    <#else>
    <${xmlName}>${textboxXFormField!''}</${xmlName}>
    </#if>
</#macro>

<#macro switchableNasPunAbstract radioGroupXFormField dictionaryXDicCode dictionaryXFormField textboxXFormField settelement>
    <#if (dictionaryXFormField!'')=='7' || (textboxXFormField!'')=='г.'>
        <gorod>${settelement}</gorod>
    <#else>
        <nasPun>${settelement}</nasPun>
        <#if radioGroupXFormField=="1">
            <#if dictionaryXFormField?has_content>
            <typeNP>${dicRegistry.getItemByKey(dictionaryXDicCode, dictionaryXFormField!'null').name?html}</typeNP>
            <#else>
            <typeNP/>
            </#if>
        <#else>
        <typeNP>${textboxXFormField!''}</typeNP>
        </#if>
    </#if>
</#macro>

<#macro onReadyAbstract dictionaryXFormField scope="ROW">
    <@updateSwitchableField dictionaryXFormField scope/>
</#macro>