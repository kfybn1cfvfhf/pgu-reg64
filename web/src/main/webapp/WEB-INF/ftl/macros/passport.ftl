<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#--
 * block_passport_form
 *
 * Формирует блок ввода паспортных данных для услуг
 *
 * @param optionsMap={} массив, содержащий переменные citizenship "Гражданство", identity_card_attention "Внимание ..."  не обязателен.
 * @param identity_card_type "Тип документа"
 * @param identity_card_serial "Серия"
 * @param identity_card_number "Номер"
 * @param identity_card_place "Выдан"
 * @param identity_card_date "Дата выдачи".
 *-->

<#macro block_passport_form  fieldsMap={} optionsMap={} identity_card_type='' identity_card_serial='' identity_card_number='' identity_card_place='' identity_card_date=''  >
<#assign fixFieldsMap={
                "field":25,
                "label":10,
                "emptyLeft":1,
                "emptyRight":11,
                "emptyMiddle": 1 }
                />
                <#local fixFieldsMap=fixFieldsMap+fieldsMap/>
    <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
    <@script.scripttag>
            <@jquery.onready>
                <#if optionsMap?is_hash && optionsMap["citizenship"]?has_content>
                <@action.setDisabledByValue 'true' '${optionsMap["citizenship"]}' 'change' '${identity_card_type}' ''/>
                </#if>

                <#if optionsMap?is_hash && optionsMap["identity_card_attention"]?has_content>
                <@action.setVisibleByValue 'true' '${identity_card_type}' 'change' '${optionsMap["identity_card_attention"]}' '10,12'/>
                </#if>

                <@action.setDisabledByValue 'true' '${identity_card_type}' 'change' '${identity_card_serial}' ''/>
                <@action.setDisabledByValue 'true' '${identity_card_type}' 'change' '${identity_card_number}' ''/>
                <@action.setDisabledByValue 'true' '${identity_card_type}' 'change' '${identity_card_date}' ''/>
                <@action.setDisabledByValue 'true' '${identity_card_type}' 'change' '${identity_card_place}' ''/>

                <@action.setRequiredIf 'true' '${identity_card_type}' 'change' '${identity_card_serial}' '21,22'/>
                <@action.applyValidationIf 'true' '${identity_card_type}' 'change' '${identity_card_serial}' '21' 'digitsexact' '4'/>
                <@action.applyValidationIf 'true' '${identity_card_type}' 'change' '${identity_card_serial}' '22' 'digitsexact' '2'/>

                <@action.setRequiredIf 'true' '${identity_card_type}' 'change' '${identity_card_number}' '21,22'/>
                <@action.applyValidationIf 'true' '${identity_card_type}' 'change' '${identity_card_number}' '21' 'digitsexact' '6'/>
                <@action.applyValidationIf 'true' '${identity_card_type}' 'change' '${identity_card_number}' '22' 'digitsexact' '7'/>

                <@action.setRequiredIf 'true' '${identity_card_type}' 'change' '${identity_card_place}' '21,22'/>

            </@jquery.onready>
    </@script.scripttag>



                <@sf.fldrow>

						<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                        <@sf.label path="form.${identity_card_type}" title="Тип документа" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
					    <@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                        <#if optionsMap?is_hash && optionsMap["citizenship"]?has_content>
                        <@sf.dictionaryLookup path="form.${identity_card_type}" dictionaryCode="INSOFT_IDENTITY_DOCUMENT_TYPES"
                              dependsOn=[{'fieldId': '${optionsMap["citizenship"]}'}] parentLookup={'fieldId': '${optionsMap["citizenship"]}'}
                            qtip="" validation="required" style="text-align:left;" colspan="15"/>
                        <#else>
                        <@sf.dictionaryLookup path="form.${identity_card_type}" dictionaryCode="INSOFT_IDENTITY_DOCUMENT_TYPES" rootItemCode="643"  qtip="" validation="required" style="text-align:left;" colspan="15"/>
                        </#if>
					    <@sf.empty colspan=fixFieldsMap["emptyRight"]/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                        <@sf.label path="form.${identity_card_serial}" title="Серия" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
					    <@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                        <@sf.textfield  path="form.${identity_card_serial}" qtip="" validation="required" style="text-align:left;" colspan="4"/>
					    <@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                        <@sf.label path="form.${identity_card_number}" title="Номер" required=true style="text-align:right;" colspan="5"/>
					    <@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                        <@sf.textfield  path="form.${identity_card_number}" qtip="" validation="required" style="text-align:left;" colspan="4"/>
					    <@sf.empty colspan=fixFieldsMap["emptyRight"]/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                        <@sf.label path="form.${identity_card_place}" title="Выдан" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
					    <@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                        <@sf.textarea path="form.${identity_card_place}" qtip="" validation="required maxlength" validationattr={"maxlength":240} style="text-align:left;" colspan=fixFieldsMap["field"]/>
					    <@sf.empty colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                        <@sf.label path="form.${identity_card_date}" title="Дата выдачи" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
					    <@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                        <@sf.datefield path="form.${identity_card_date}"  qtip="" validation="required relativedays relativeyears" validationattr={"relativedays":"'<=',0", "relativeyears":"'>=',-120"} style="text-align:left;" colspan="5"/>
					    <@sf.empty colspan=fixFieldsMap["emptyRight"]/>

                </@sf.fldrow>

                <#if optionsMap?is_hash && optionsMap["identity_card_attention"]?has_content>
                <@sf.fldrow>

						<@sf.empty colspan="1"/>
						<@sf.label id="${optionsMap['identity_card_attention']}" title="Внимание! При посещении отдела ЗАГС Вам потребуется нотариально заверенный перевод документов, удостоверяющих личность" required=false style="text-align:left;" colspan="46"/>
					    <@sf.empty colspan="1"/>

                </@sf.fldrow>
                </#if>
</#macro>

