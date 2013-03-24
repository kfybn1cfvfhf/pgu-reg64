<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">
<#import "land_utils.ftl" as land_utils>

<#assign formatMap={
    "emptyLeft": 1,
    "label": 13,
    "emptyMiddle": 1,
    "fieldLong": 31,
    "emptyRightSmall": 2,
    "emptyRightSmall2": 3,

    "fieldSmall": 7,
    "labelSmall": 8,
    "emptyRightLong": 26,

    "fieldMiddle": 13,
    "emptyRightMiddle": 20,

    "fieldsetEmpty": 1,
    "fieldsetLabel": 46
}/>

<#assign rightTypes=land_utils.rightTypes/>
<#assign condprovownTypes=land_utils.condprovownTypes/>
<#assign zupresonTypes={
"1": "расположены",
"2": "отсутствуют"
}/>
<#assign constructionTypes={
"1": "Капитальное строительство",
"2": "Индивидуальное жилищное строительство"
}/>
<#assign possessionTypes={
"1": "Владелец рекламной конструкции",
"2": "Владелец недвижимого имущества"
}/>

<#macro step1 sf>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.zayvsubjtype" title="Тип субъекта (заявителя):" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.dictionaryLookup path="form.zayvsubjtype" dictionaryCode="SVYAZ_APPL_TYPE" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightShort"]/>
    </@sf.fldrow>

    <#nested formatMap>
</#macro>


<#macro step2action action>
    <@action.setReadonlyByValue 'true' 'force_readonly' 'change' 'zayvfullname' ''/>
    <@action.setReadonlyByValue 'true' 'force_readonly' 'change' 'inn' ''/>
    <@action.setReadonlyByValue 'true' 'force_readonly' 'change' 'passport_type' ''/>
    <@action.setReadonlyByValue 'true' 'force_readonly' 'change' 'passportnumber' ''/>
    <@action.setReadonlyByValue 'true' 'force_readonly' 'change' 'passportissuedate' ''/>
    <@action.setReadonlyByValue 'true' 'force_readonly' 'change' 'passportauthority' ''/>

    <@action.setVisibleByValue 'true' 'address_kladr' 'change' 'address_street' 'off' />
    <@action.setRequiredIf 'true' 'address_kladr' 'change' 'address_street' 'off' />
    <@action.setVisibleByValue 'true' 'address_kladr' 'change' 'address_street_text' 'on' />
    <@action.setRequiredIf 'true' 'address_kladr' 'change' 'address_street_text' 'on' />
    <#nested action>
</#macro>

<#macro step3action action>
    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_region' 'off'   />
    <@action.setRequiredIf 'true' 'equal_address' 'change' 'fact_address_ul_region' 'off'   />
    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_city' 'off'   />
    <@action.setRequiredIf 'true' 'equal_address' 'change' 'fact_address_ul_city' 'off'   />

    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_house' 'off'   />
    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_block' 'off'   />
    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_building' 'off'   />
    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_apartament' 'off'   />

    <@action.setVisibleByValue 'true' 'address_ul_kladr' 'change' 'address_ul_street' 'off' />
    <@action.setRequiredIf 'true' 'address_ul_kladr' 'change' 'address_ul_street' 'off' />
    <@action.setVisibleByValue 'true' 'address_ul_kladr' 'change' 'address_ul_street_text' 'on' />
    <@action.setRequiredIf 'true' 'address_ul_kladr' 'change' 'address_ul_street_text' 'on' />

    <@action.setVisibleByValue 'true' 'equal_address' 'change' 'fact_address_ul_kladr' 'off'   />

    <@action.linkDestFromList onload='true' destid='aggregate' event='change' sourceids=['equal_address','fact_address_ul_kladr'] eventDest='change' delimited='|' />
    <@action.setVisibleByValue 'true' 'aggregate' 'change' 'fact_address_ul_street_text' 'off|on'   />
    <@action.setRequiredIf 'true' 'aggregate' 'change' 'fact_address_ul_street_text' 'off|on'   />

    <@action.setVisibleByValue 'true' 'aggregate' 'change' 'fact_address_ul_street' 'off|off'   />
    <@action.setRequiredIf 'true' 'aggregate' 'change' 'fact_address_ul_street' 'off|off'   />
</#macro>


<#macro step2 sf>
    <@common_info_phys sf 'zayvfullname' 'inn'>
        <#nested formatMap>
    </@common_info_phys>
    <@document sf 'passport_type' 'passportnumber' 'passportissuedate' 'passportauthority'/>
    <@address sf 'region' 'city' 'kladr' 'street' 'street_text' 'house' 'block' 'building' 'apartament' 'АДРЕС РЕГИСТРАЦИИ' 'address'; formatMap/>
    <@common_info_phone_email sf 'phone' 'email'; formatMap/>
</#macro>


<#macro step3 sf>
    <@common_info_ul sf 'zayvfullname_ul' 'subjopf' 'inn_ul' 'subjogrn'; formatMap/>
    <@address sf 'region' 'city' 'kladr' 'street' 'street_text' 'house' 'block' 'building' 'apartament' 'АДРЕС РЕГИСТРАЦИИ' 'address_ul'/>
    <@address_fact sf 'region' 'city' 'kladr' 'street' 'street_text' 'house' 'block' 'building' 'apartament' 'ФАКТИЧЕСКИЙ АДРЕС' 'fact_address_ul'/>
    <@common_info_phone_email sf 'phone' 'email'; formatMap/>
</#macro>

<#macro step3_15020 sf>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.zayvfullname_ul" title="Полное наименование юридического лица (с указанием организационно-правовой формы):" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textarea path="form.zayvfullname_ul" qtip="" validation="required maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["empltyRightShort"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.subjogrn" title="ОГРН (ОГРНИП):" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.subjogrn" qtip="" validation="required digits" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["empltyRightMiddle"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.inn_ul" title="ИНН:"  required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.textfield  path="form.inn_ul" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["empltyRightMiddle"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.kpp" title="КПП:"  required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.kpp" qtip="" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["empltyRightMiddle"]/>
    </@sf.fldrow>

    <@address sf 'region' 'city' 'kladr' 'street' 'street_text' 'house' 'block' 'building' 'apartament' 'АДРЕС РЕГИСТРАЦИИ' 'address_ul'/>
    <@address_fact sf 'region' 'city' 'kladr' 'street' 'street_text' 'house' 'block' 'building' 'apartament' 'ФАКТИЧЕСКИЙ АДРЕС' 'fact_address_ul'/>
    <@common_info_phone_email sf 'phone' 'email'; formatMap/>
</#macro>



<#macro address_fact sf region city has_street street street_text house block building apartament label prefix>
    <@sf.fldrow class="fieldHidden">
        <input type=hidden id="aggregate" />
        <@sf.empty colspan="48"/>
    </@sf.fldrow>
    <@address sf region city has_street street street_text house block building apartament label prefix>
        <@sf.fldrow>
            <@sf.empty colspan=formatMap["label"]/>
            <#-- Привязать скрипт, который при отмечании чек-бокса, сделает скрытыми (недоступными к редактированию и невидимыми заявителю) группу полей фактического адреса (область, район, населенный пункт, улица, дом, корпус, строение, квартира (офис)). Если чек-бокс не проставлен, группа полей фактического  адреса доступна для редактирования и отображается на шаге формы заявки.-->
            <@sf.checkbox path="form.equal_address" qtip=""  style="text-align:right;" colspan=formatMap["emptyLeft"]/>
            <@sf.empty colspan=formatMap["emptyMiddle"]/>
            <#-- Привязать скрипт, который при отмечании чек-бокса, сделает скрытыми (недоступными к редактированию и невидимыми заявителю) группу полей фактического адреса (область, район, населенный пункт, улица, дом, корпус, строение, квартира (офис)). Если чек-бокс не проставлен, группа полей фактического  адреса доступна для редактирования и отображается на шаге формы заявки.-->
            <@sf.label path="form.equal_address" title="Фактический адрес совпадает с адресом регистрации?" required=false style="text-align:left;" colspan=formatMap["fieldLong"]/>
            <@sf.empty colspan=formatMap["emptyRightSmall"]/>
        </@sf.fldrow>
    </@address>
</#macro>


<#macro address sf region city has_street street street_text house block building apartament label prefix>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>
        <@sf.label title="${label}" fieldset=true style="text-align:left;" colspan=formatMap["fieldsetLabel"]/>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>
    </@sf.fldrow>

    <#nested formatMap>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <#-- Выбирается из справочника КЛАДР. Допустимо для редактирования.-->
        <@sf.label path="form.${prefix + '_' + region}" title="Субъект РФ:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Выбирается из справочника КЛАДР. Допустимо для редактирования.-->
        <@sf.dictionaryLookup path="form.${prefix + '_' + region}" dictionaryCode="KLADRRegion" qtip="" validation="required" style="text-align:left;" terminalLevel="1" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <#-- Выбирается из справочника КЛАДР. Допустимо для редактирования.-->
        <@sf.label path="form.${prefix + '_' + city}" title="Район/Город/Населенный пункт:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Выбирается из справочника КЛАДР. Допустимо для редактирования.-->
        <@sf.dictionaryLookup path="form.${prefix + '_' + city}" dictionaryCode="KLADRRegion" qtip="" parentLookup={'fieldId': "${prefix + '_' + region}", 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'} validation="required" style="text-align:left;" transformFunc='LookupWidget.transform["КЛАДР"]' colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <#--<@sf.empty colspan=formatMap["fieldsetEmpty"]/>
        &lt;#&ndash; При проставлении флажка поле доступно для редактирования и заполняется вручную заявителем. Если флажок не проставлен, в поле доступен выбор значения из справочника.&ndash;&gt;
        <@sf.checkbox path="form.address_kladr" qtip=""  style="text-align:unknown;" colspan=formatMap["fieldsetLabel"] label="Улицы нет в КЛАДР"/>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>-->

        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <#-- При проставлении флажка поле доступно для редактирования и заполняется вручную заявителем. Если флажок не проставлен, в поле доступен выбор значения из справочника.-->
        <@sf.label path="form.${prefix + '_' + has_street}" title="Улицы нет в КЛАДР:" required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- При проставлении флажка поле доступно для редактирования и заполняется вручную заявителем. Если флажок не проставлен, в поле доступен выбор значения из справочника.-->
        <@sf.checkbox path="form.${prefix + '_' + has_street}" qtip=""  style="text-align:unknown;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${prefix + '_' + street}" title="Улица:" style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.dictionaryLookup path="form.${prefix + '_' + street}" dictionaryCode="KLADRStreet" qtip="" style="text-align:left;" colspan=formatMap["fieldLong"]  dependsOn=[{'fieldId': "${prefix + '_' + city}"}] parentLookup={'fieldId': "${prefix + '_' + city}", 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'}/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${prefix + '_' + street_text}" title="Улица:" style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield path="form.${prefix + '_' + street_text}" qtip="" validation="maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${prefix + '_' + house}" title="Дом:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.${prefix + '_' + house}" qtip="" validation="required maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldSmall"]/>
        <@sf.empty colspan=formatMap["emptyRightLong"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${prefix + '_' + block}" title="Корпус:" required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.${prefix + '_' + block}" qtip="" validation="maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldSmall"]/>
        <@sf.empty colspan=formatMap["emptyRightLong"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${prefix + '_' + building}" title="Строение:" required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.${prefix + '_' + building}" qtip="" validation="maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldSmall"]/>
        <@sf.empty colspan=formatMap["emptyRightLong"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${prefix + '_' + apartament}" title="Квартира:" required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.${prefix + '_' + apartament}" qtip="" validation="maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldSmall"]/>
        <@sf.empty colspan=formatMap["emptyRightLong"]/>
    </@sf.fldrow>
</#macro>



<#macro document sf type number issuedate authority>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>
        <@sf.label title="ДОКУМЕНТ, УДОСТОВЕРЯЮЩИЙ ЛИЧНОСТЬ" fieldset=true style="text-align:left;" colspan=formatMap["fieldsetLabel"]/>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${type}" title="Тип документа:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.textfield  path="form.${type}" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${number}" title="Серия, номер:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА. Отображать в поле через пробел: пример: 1236 987455-->
        <@sf.textfield  path="form.${number}" qtip="" validation="required" style="text-align:left;" colspan="11"/>
        <@sf.empty colspan="1"/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.label path="form.${issuedate}" title="Дата выдачи:" required=true style="text-align:right;" colspan="11"/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.datefield path="form.${issuedate}"  qtip="" validation="required" style="text-align:left;" colspan="6"/>
        <@sf.empty colspan="3"/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${authority}" title="Кем выдан:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.textfield  path="form.${authority}" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>
</#macro>



<#macro common_info_phys sf name inn>
    <@sf.fldrow>
        <input type=hidden id="force_readonly" />
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${name}" title="Ф.И.О. Заявителя:"  required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.textfield  path="form.${name}" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>

    <#nested formatMap>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${inn}" title="ИНН:"  required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.textfield  path="form.${inn}" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>
</#macro>



<#macro common_info_phone_email sf phone email>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.phone" title="Контактный телефон:" required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.phone" qtip="" validation="phone" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["emptyRightMiddle"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.email" qtip="" validation="email" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["emptyRightMiddle"]/>
    </@sf.fldrow>
</#macro>



<#macro common_info_ul sf name opf inn ogrn>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${name}" title="Полное наименование:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textarea path="form.${name}" qtip="" validation="required maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["empltyRightShort"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${opf}" title="Организационно-правовая форма:" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textarea path="form.${opf}" qtip="" validation="required maxlength" validationattr={"maxlength": 250} attr='maxlength="250"' style="text-align:left;" colspan=formatMap["fieldLong"]/>
        <@sf.empty colspan=formatMap["empltyRightShort"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${inn}" title="ИНН:"  required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#-- Недоступно для редактирования. Данные из СИА.-->
        <@sf.textfield  path="form.${inn}" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["empltyRightMiddle"]/>
    </@sf.fldrow>

    <@sf.fldrow>
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${ogrn}" title="ОГРН (ОГРНИП):" required=true style="text-align:right;" colspan=formatMap["label"]/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <@sf.textfield  path="form.${ogrn}" qtip="" validation="required digits" style="text-align:left;" colspan=formatMap["fieldMiddle"]/>
        <@sf.empty colspan=formatMap["empltyRightMiddle"]/>
    </@sf.fldrow>

    <#nested formatMap>
</#macro>


<#macro file sf field title="" required=false class="">
    <#assign clone_class=""/>
    <#if class?has_content>
        <#assign clone_class="clone-field"/>
    </#if>
    <@sf.fldrow class="${class}">
        <@sf.empty colspan=formatMap["emptyLeft"]/>
        <@sf.label path="form.${field}" title="${title}:" required=required style="text-align:left;" colspan=formatMap["label"] class=clone_class/>
        <@sf.empty colspan=formatMap["emptyMiddle"]/>
        <#if required == true>
            <@sf.fileload path="form.${field}" fileExtensions="pdf,doc,docx,xls,xlsx,jpg" qtip="" validation="required" style="text-align:left;" colspan=formatMap["fieldLong"] class=clone_class/>
        <#else>
            <@sf.fileload path="form.${field}" fileExtensions="pdf,doc,docx,xls,xlsx,jpg" qtip="" style="text-align:left;" colspan=formatMap["fieldLong"] class=clone_class/>
        </#if>
        <@sf.empty colspan=formatMap["emptyRightSmall"]/>
    </@sf.fldrow>
</#macro>

<#macro fileFieldset sf>
    <@sf.fldrow>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>
        <@sf.statictext style="text-align:left;" colspan=formatMap["fieldsetLabel"]>
            <i>Размещенное ниже поле предназначено для представления электронной копии документов. Электронная копия документа должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br/></i>
        </@sf.statictext>
        <@sf.empty colspan=formatMap["fieldsetEmpty"]/>
    </@sf.fldrow>
</#macro>
