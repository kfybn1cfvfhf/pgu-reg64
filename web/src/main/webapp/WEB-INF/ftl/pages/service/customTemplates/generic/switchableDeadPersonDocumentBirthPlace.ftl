<#include "switchableFields.ftl">
<#macro formField
    radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="9" radioGroupFieldColspan="26" radioGroupFieldColspanPaddingRight="11" radioGroupSeparatorColspan="1"
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="9" dictionaryFieldColspan="26" dictionaryFieldColspanPaddingRight="11" dictionarySeparatorColspan="1"
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="9" textboxFieldColspan="26" textboxFieldColspanPaddingRight="11" textboxSeparatorColspan="1"
>

    <@formFieldAbstract
        radioGroupXFormField="form.death_person_birth_settlement_type_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
        dictionaryXFormField="form.death_person_birth_settlement_type" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
        textboxXFormField="death_person_birth_settlement_type_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[ЁёА-Яа-я0-9\\s./-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов -/."} textboxXLabelRequired=true
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
    radioGroupXFormField="form.death_person_birth_settlement_type_gr" radioGroupXLabelTitle="Способ заполнения типа населенного пункта" radioGroupXValidation="required" radioGroupXLabelRequired=true
    radioGroupLabelColspanPaddingLeft=radioGroupLabelColspanPaddingLeft radioGroupLabelColspan=radioGroupLabelColspan radioGroupFieldColspan=radioGroupFieldColspan radioGroupFieldColspanPaddingRight=radioGroupFieldColspanPaddingRight radioGroupSeparatorColspan=radioGroupSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro dictionary
    notd=false nolabel=false nofield=false noseparator=false
    dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="9" dictionaryFieldColspan="26" dictionaryFieldColspanPaddingRight="11" dictionarySeparatorColspan="1"
>
    <@dictionaryAbstract
    dictionaryXFormField="form.death_person_birth_settlement_type" dictionaryXLabelTitle="Тип населенного пункта" dictionaryXDicCode="SETTELEMENT_TYPE_LS" dictionaryXValidation="required" dictionaryXLabelRequired=true
    dictionaryLabelColspanPaddingLeft=dictionaryLabelColspanPaddingLeft dictionaryLabelColspan=dictionaryLabelColspan dictionaryFieldColspan=dictionaryFieldColspan dictionaryFieldColspanPaddingRight=dictionaryFieldColspanPaddingRight dictionarySeparatorColspan=dictionarySeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro textbox
    notd=false nolabel=false nofield=false noseparator=false
    textboxLabelColspanPaddingLeft="1" textboxLabelColspan="9" textboxFieldColspan="26" textboxFieldColspanPaddingRight="11" textboxSeparatorColspan="1"
>
    <@textboxAbstract
    textboxXFormField="form.death_person_birth_settlement_type_m" textboxXLabelTitle="Тип населенного пункта" textboxXValidation="maxlength regexp required" textboxXValidationAttr={'maxlength':20, 'regexp':'/^[ЁёА-Яа-я0-9\\s./-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов -/."} textboxXLabelRequired=true
    textboxLabelColspanPaddingLeft=textboxLabelColspanPaddingLeft textboxLabelColspan=textboxLabelColspan textboxFieldColspan=textboxFieldColspan textboxFieldColspanPaddingRight=textboxFieldColspanPaddingRight textboxSeparatorColspan=textboxSeparatorColspan
    notd=notd nolabel=nolabel nofield=nofield noseparator=noseparator
    />
</#macro>

<#macro switchableNasPun>
    <@switchableNasPunAbstract
    radioGroupXFormField=form.death_person_birth_settlement_type_gr!''
    dictionaryXFormField=form.death_person_birth_settlement_type!''
    dictionaryXDicCode="SETTELEMENT_TYPE_LS"
    textboxXFormField=form.death_person_birth_settlement_type_m!''
    settelement=form.death_person_birth_settlement!''
    />
</#macro>

<#macro onReady scope="ROW">
    <@onReadyAbstract dictionaryXFormField="death_person_birth_settlement_type" scope=scope />
</#macro>
