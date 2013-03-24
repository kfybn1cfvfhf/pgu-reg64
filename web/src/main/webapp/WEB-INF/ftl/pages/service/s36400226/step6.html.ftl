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

                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_country' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_state' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_place_gr' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_place' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_place_m' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_settlement' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_street_type' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_street' 'true' />
                <@action.setRequiredIf 'true' 'he_args_required' 'change' 'he_living_house' 'true' />

                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_country' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_state' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_place_gr' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_place' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_place_m' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_settlement' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_street_type' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_street' 'true' />
                <@action.setRequiredIf 'true' 'she_args_required' 'change' 'she_living_house' 'true' />

                <#if !form.she_args_required && !form.he_args_required>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_country' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_state' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_place_gr' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_place' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_place_m' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_settlement' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_street_type' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_street' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_living_house' 'true' />

                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_country' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_state' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_place_gr' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_place' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_place_m' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_settlement' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_street_type' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_street' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_living_house' 'true' />
                </#if>


                <@action.setVisibleByValue 'true' 'he_living_place_gr' 'change' 'he_living_place' '1' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'he_living_place_gr' 'change' 'he_living_place_m' '2' "LBL+EL"/>

                <#--<@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place' '2' />
                <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place_m' '1' />-->

                <@action.setVisibleByValue 'true' 'she_living_place_gr' 'change' 'she_living_place' '1' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'she_living_place_gr' 'change' 'she_living_place_m' '2' "LBL+EL"/>

                <#--<@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place' '2' />
                <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place_m' '1' />-->

                <#if form.he_args_required && !form.she_args_required>
                    <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place' '2' />
                    <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place_m' '1' />
                <#elseif !form.he_args_required && form.she_args_required>
                    <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place' '2' />
                    <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place_m' '1' />
                <#else>
                    <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place' '2' />
                    <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place_m' '1' />
                    <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place' '2' />
                    <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place_m' '1' />
                </#if>


                <#-- убирать поля ввода названия улицы, если выбран тип улицы "нет улицы" (74 код в справочнике street_type_ls) -->
                <@action.setDisabledByValue 'true' 'he_living_street_type' 'change' 'he_living_street' '74' />

                <@action.setDisabledByValue 'true' 'she_living_street_type' 'change' 'she_living_street' '74' />

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
                    <@sf.label path="form.he_living_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.he_living_country" dictionaryCode="COUNTRY_LS" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.she_living_country" dictionaryCode="COUNTRY_LS" validation="required " style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_state" qtip="" validation="required regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_state" qtip="" validation="required regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_region" title="Район" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_region" qtip="" validation="regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_region" title="Район" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_region" qtip="" validation="regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-)"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_place_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.he_living_place_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_place_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.she_living_place_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_place" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_living_place" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_place" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_living_place" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.he_living_place_m" validation="required regexp" validationattr={"regexp": '/^[-А-ЯЁ\\s./]{0,20}$/i'}    validationMessage={"regexp": "Допустим ввод кириллицы и символов ./"}
                    style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.she_living_place_m" validation="required regexp" validationattr={"regexp": '/^[-А-ЯЁ\\s./]{0,20}$/i'}     validationMessage={"regexp": "Допустим ввод кириллицы и символов ./"}
                    style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_settlement" qtip="" validation="regexp required" attr='maxlength="80"' validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,80}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|. длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_settlement" qtip="" validation="regexp required" attr='maxlength="80"' validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,80}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|. длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip=""  validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip=""  validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_street" title="Улица" required = true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_street" qtip="" validation="regexp required" attr="maxlength='33'" validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,33}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)./|"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_street" title="Улица" required = true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_street" qtip="" validation="regexp required" attr="maxlength='33'" validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,33}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)./|"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_house" title="Дом" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_house" qtip="" validation="required" attr="maxlength='7'" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_house" title="Дом" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_house" qtip="" validation="required" attr="maxlength='7'" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_building" title="Корпус" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_building" qtip="" attr="maxlength='4'" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_building" title="Корпус" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_building" qtip="" attr="maxlength='4'" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_flat" title="Квартира" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_flat" qtip="" attr="maxlength='9'" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_flat" title="Квартира" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_flat" qtip="" attr="maxlength='9'" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>