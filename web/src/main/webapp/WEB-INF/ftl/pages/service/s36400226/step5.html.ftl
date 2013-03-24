<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация усыновления (удочерения)'>
		<style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>
            <@jquery.onready>

                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_birth_place_country' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_birth_place_state' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_birth_place_settlement_type_gr' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_birth_place_settlement_type' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_birth_place_settlement_type_m' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_birth_place_settlement' 'true' />

                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_birth_place_country' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_birth_place_state' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_birth_place_settlement_type_gr' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_birth_place_settlement_type' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_birth_place_settlement_type_m' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_birth_place_settlement' 'true' />

                <#if !form.she_args_required && !form.he_args_required>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_place_country' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_place_state' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_place_settlement_type_gr' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_place_settlement_type' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_place_settlement_type_m' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_place_settlement' 'true' />

                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_place_country' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_place_state' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_place_settlement_type_gr' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_place_settlement_type' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_place_settlement_type_m' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_place_settlement' 'true' />
                </#if>

                <@action.setVisibleByValue 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type' '1' 'LBL+EL'/>
                <@action.setVisibleByValue 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type_m' '2' 'LBL+EL'/>

                <#--<@action.unsetRequiredByField 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type' '2' />
                <@action.unsetRequiredByField 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type_m' '1' />-->

                <@action.setVisibleByValue 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type' '1' 'LBL+EL'/>
                <@action.setVisibleByValue 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type_m' '2' 'LBL+EL'/>

                <#if form.he_args_required && !form.she_args_required>
                    <@action.unsetRequiredByField 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type' '2' />
                    <@action.unsetRequiredByField 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type_m' '1' />
                <#elseif !form.he_args_required && form.she_args_required>
                    <@action.unsetRequiredByField 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type' '2' />
                    <@action.unsetRequiredByField 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type_m' '1' />
                <#else>
                    <@action.unsetRequiredByField 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type' '2' />
                    <@action.unsetRequiredByField 'true' 'he_birth_place_settlement_type_gr' 'change' 'he_birth_place_settlement_type_m' '1' />
                    <@action.unsetRequiredByField 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type' '2' />
                    <@action.unsetRequiredByField 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type_m' '1' />
                </#if>

                <#--<@action.unsetRequiredByField 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type' '2' />
                <@action.unsetRequiredByField 'true' 'she_birth_place_settlement_type_gr' 'change' 'she_birth_place_settlement_type_m' '1' />-->

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
                <input type="hidden" id="trueField" value="true"/>
                <input type="hidden" id="he_args_required" value="${form.he_args_required?string}" />
                <input type="hidden" id="she_args_required" value="${form.she_args_required?string}" />
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Он" style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label fieldset=true title="Она" style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.he_birth_place_country" dictionaryCode="COUNTRY_LS" validation="ciryllic required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.she_birth_place_country" dictionaryCode="COUNTRY_LS" validation="cirillyc required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_state" title="Область (край, респ.)" required = true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_birth_place_state" qtip="" validation="regexp required" attr="maxlength='80'" validationattr={'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_state" title="Область (край, респ.)" required = true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_birth_place_state" qtip="" validation="regexp required" attr="maxlength='80'" validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_region" title="Район" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_birth_place_region" qtip="" validation="regexp maxlength" validationattr={'maxlength':80, 'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_region" title="Район" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_birth_place_region" qtip="" validation="regexp maxlength" validationattr={'maxlength':80, 'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_settlement_type_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.he_birth_place_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_settlement_type_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.she_birth_place_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_birth_place_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_birth_place_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.he_birth_place_settlement_type_m" validation="required regexp" validationattr={"regexp": '/^[-А-ЯЁ\\s./]{0,20}$/i'}
                    validationMessage={"regexp": "Допустим ввод кириллицы и символов ./-"}
                    style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.she_birth_place_settlement_type_m" validation="required regexp" validationattr={"regexp": '/^[-А-ЯЁ\\s./]{0,20}$/i'}
                    validationMessage={"regexp": "Допустим ввод кириллицы и символов ./-"}
                    style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_place_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_birth_place_settlement" qtip="" validation="regexp required" attr="maxlength='80'" validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./ №()-]{0,80}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_place_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_birth_place_settlement" qtip="" validation="regexp required" attr="maxlength='80'" validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s. /№()-]{0,80}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>