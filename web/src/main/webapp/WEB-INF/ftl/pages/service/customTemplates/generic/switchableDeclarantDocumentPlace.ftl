<#include "switchableFields.ftl">
<#macro formField
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="9" radioGroupFieldColspan="26" radioGroupFieldColspanPaddingRight="11" radioGroupSeparatorColspan="1"
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="9" dictionaryFieldColspan="26" dictionaryFieldColspanPaddingRight="11" dictionarySeparatorColspan="1"
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="9" textboxFieldColspan="26" textboxFieldColspanPaddingRight="11" textboxSeparatorColspan="1" textBoxMaxLength="20"<#--maxlength ограничение длины ввода-->
>

    <@formFieldAbstract
        radioGroupXFormField="form.declarant_place_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
        dictionaryXFormField="form.declarant_place" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
        textboxXFormField="form.declarant_place_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,200}$/', "message":"Допустим ввод кириллицы,пробела, цифр и символов №(-)/|."} textboxXLabelRequired=true
        textBoxMaxLength=textBoxMaxLength  <#--maxlength ограничение длины ввода-->
        radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft radioGroupLabelColspan=radioGroupLabelColspan radioGroupFieldColspan=radioGroupFieldColspan radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight radioGroupSeparatorColspan=radioGroupSeparatorColspan
        dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
        textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
    />
</#macro>

<#macro radioGroup
    notd=false nolabel=false nofield=false noseparator=false
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="9" radioGroupFieldColspan="26" radioGroupFieldColspanPaddingRight="11" radioGroupSeparatorColspan="1"
>
    <@radioGroupAbstract
    radioGroupXFormField="form.declarant_place_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
    radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft radioGroupLabelColspan=radioGroupLabelColspan radioGroupFieldColspan=radioGroupFieldColspan radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight radioGroupSeparatorColspan=radioGroupSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro dictionary
    notd=false nolabel=false nofield=false noseparator=false
    nolabel=false
    nofield=false
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="9" dictionaryFieldColspan="26" dictionaryFieldColspanPaddingRight="11" dictionarySeparatorColspan="1"
>
    <@dictionaryAbstract
    dictionaryXFormField="form.declarant_place" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
    dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro textbox
    notd=false nolabel=false nofield=false noseparator=false
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="9" textboxFieldColspan="26" textboxFieldColspanPaddingRight="11" textboxSeparatorColspan="1"
    textBoxMaxLength=20<#--maxlength ограничение длины ввода-->
>
    <@textboxAbstract
    textboxXFormField="form.declarant_place_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} textboxXLabelRequired=true
    textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator maxlength=textBoxMaxLength  <#--maxlength ограничение длины ввода-->
    />
</#macro>


<#macro switchableNasPun>
    <@switchableNasPunAbstract
    radioGroupXFormField=form.declarant_place_gr!""
    dictionaryXFormField=form.declarant_place!""
    dictionaryXDicCode="SETTELEMENT_TYPE_LS"
    textboxXFormField=form.declarant_place_m!""
    settelement=form.declarant_settlement!''
    />
</#macro>

<#macro onReady scope="ROW">
    <@onReadyAbstract dictionaryXFormField="declarant_place" scope=scope />
</#macro>
