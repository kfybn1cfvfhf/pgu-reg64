<#include "switchableFields.ftl">
<#macro formField
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="6" radioGroupFieldColspan="13" radioGroupFieldColspanPaddingRight="27" radioGroupSeparatorColspan="1"

    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="6" dictionaryFieldColspan="13" dictionaryFieldColspanPaddingRight="27" dictionarySeparatorColspan="1"
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="6" textboxFieldColspan="13" textboxFieldColspanPaddingRight="27" textboxSeparatorColspan="1"
>

    <@formFieldAbstract
    radioGroupXFormField="form.declarant_ident_doc_type_gr" radioGroupXLabelTitle="Способ заполнения типа документа" radioGroupXValidation="required" radioGroupXLabelRequired=true
    dictionaryXFormField="form.declarant_ident_doc_type" dictionaryXLabelTitle="Тип документа" dictionaryXDicCode="DUL_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
    textboxXFormField="form.declarant_ident_doc_type_m" textboxXLabelTitle="Тип документа" textboxXValidation="required maxlength regexp" textboxXValidationAttr={'maxlength':70, 'regexp':'/^[ЁёА-Яа-я\\s\\-]{0,70}$/', "message":"Допустим ввод кириллицы, пробела и символа -"} textboxXLabelRequired=true
    radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft
    radioGroupLabelColspan=radioGroupLabelColspan
    radioGroupFieldColspan=radioGroupFieldColspan
    radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight
    radioGroupSeparatorColspan=radioGroupSeparatorColspan
    dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
    textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
    />
</#macro>


<#macro radioGroup
    notd=false nolabel=false nofield=false noseparator=false
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="6" radioGroupFieldColspan="13" radioGroupFieldColspanPaddingRight="27" radioGroupSeparatorColspan="1"
>
    <@radioGroupAbstract
    radioGroupXFormField="form.declarant_ident_doc_type_gr" radioGroupXLabelTitle="Способ заполнения типа документа" radioGroupXValidation="required" radioGroupXLabelRequired=true
    radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft radioGroupLabelColspan=radioGroupLabelColspan radioGroupFieldColspan=radioGroupFieldColspan radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight radioGroupSeparatorColspan=radioGroupSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro dictionary
    notd=false nolabel=false nofield=false noseparator=false
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="6" dictionaryFieldColspan="13" dictionaryFieldColspanPaddingRight="27" dictionarySeparatorColspan="1"
>
    <@dictionaryAbstract
    dictionaryXFormField="form.declarant_ident_doc_type" dictionaryXLabelTitle="Тип документа" dictionaryXDicCode="DUL_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
    dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro textbox
    notd=false nolabel=false nofield=false noseparator=false
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="6" textboxFieldColspan="13" textboxFieldColspanPaddingRight="27" textboxSeparatorColspan="1"
>
    <@textboxAbstract
    textboxXFormField="form.declarant_ident_doc_type_m" textboxXLabelTitle="Тип документа" textboxXValidation="required cyrillic" textboxXValidationAttr={} textboxXLabelRequired=true
    textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>


<#macro requestField>
    <@requestFieldAbstract
    radioGroupXFormField=form.declarant_ident_doc_type_gr!""
    dictionaryXFormField=form.declarant_ident_doc_type!""
    dictionaryXDicCode="DUL_LS"
    textboxXFormField=form.declarant_ident_doc_type_m!""
    xmlName="nam"
    />
</#macro>

<#macro onReady scope="ROW">
    <@onReadyAbstract dictionaryXFormField="declarant_ident_doc_type" scope=scope />
</#macro>