<#include "switchableFields.ftl">
<#macro formField
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="6" radioGroupFieldColspan="29" radioGroupFieldColspanPaddingRight="11" radioGroupSeparatorColspan="1"
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="6" dictionaryFieldColspan="29" dictionaryFieldColspanPaddingRight="11" dictionarySeparatorColspan="1"
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="6" textboxFieldColspan="29" textboxFieldColspanPaddingRight="11" textboxSeparatorColspan="1"
>

    <@formFieldAbstract
    radioGroupXFormField="form.addr_agency_place_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
    dictionaryXFormField="form.addr_agency_place" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="" dictionaryXLabelRequired=true
    textboxXFormField="form.addr_agency_place_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[\\|\\"ЁёА-Яа-я\\s./-]{0,20}$/', "message":"Допускается заполнение кириллицей, пробелом и символами .-/"} textboxXLabelRequired=false
    radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft
    radioGroupLabelColspan=radioGroupLabelColspan
    radioGroupFieldColspan=radioGroupFieldColspan
    radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight
    radioGroupSeparatorColspan=radioGroupSeparatorColspan
    dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft
    dictionaryLabelColspan=dictionaryLabelColspan
    dictionaryFieldColspan=dictionaryFieldColspan
    dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight
    dictionarySeparatorColspan=dictionarySeparatorColspan
    textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft
    textboxLabelColspan=textboxLabelColspan
    textboxFieldColspan=textboxFieldColspan
    textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight
    textboxSeparatorColspan=textboxSeparatorColspan
    />
</#macro>

<#macro radioGroup
    notd=false nolabel=false nofield=false noseparator=false
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="6" radioGroupFieldColspan="29" radioGroupFieldColspanPaddingRight="11" radioGroupSeparatorColspan="1"
>
    <@radioGroupAbstract
    radioGroupXFormField="form.addr_agency_place_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
    radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft radioGroupLabelColspan=radioGroupLabelColspan radioGroupFieldColspan=radioGroupFieldColspan radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight radioGroupSeparatorColspan=radioGroupSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro dictionary
    notd=false nolabel=false nofield=false noseparator=false
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="6" dictionaryFieldColspan="29" dictionaryFieldColspanPaddingRight="11" dictionarySeparatorColspan="1"
>
    <@dictionaryAbstract
    dictionaryXFormField="form.addr_agency_place" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="" dictionaryXLabelRequired=false
    dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro textbox
    notd=false nolabel=false nofield=false noseparator=false
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="6" textboxFieldColspan="29" textboxFieldColspanPaddingRight="11" textboxSeparatorColspan="1"
>
    <@textboxAbstract
    textboxXFormField="form.addr_agency_place_m" textboxXLabelTitle="Тип населенного пункта"
    <#--textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,20}$/', "message":"Допустим ввод кириллицы, пробела, цифр и символов №(-)/|."} -->
    textboxXValidation="regexp required" textboxXValidationAttr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,20}$/', "message":"Допустим ввод кириллицы, пробела, цифр и символов №(-)/|."}
    textboxXLabelRequired=false
    textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro switchableNasPun>
    <@switchableNasPunAbstract
    radioGroupXFormField=form.addr_agency_place_gr!''
    dictionaryXFormField=form.addr_agency_place!''
    dictionaryXDicCode="SETTELEMENT_TYPE_LS"
    textboxXFormField=form.addr_agency_place_m!''
    settelement=form.addr_agency_settlement!''
    />
</#macro>

<#macro onReady scope="ROW">
    <@onReadyAbstract dictionaryXFormField="addr_agency_place" scope=scope />
</#macro>