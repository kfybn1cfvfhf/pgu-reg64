<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/36400224/step4.ftl" as step4>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация расторжения брака'>
    <style type="text/css">
        .form-body {
            width: 100%;
        }
    </style>
        <@script.scripttag>
            <@step4.preScript/>
            <@jquery.onready>
            	    <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_living_country' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
     <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_living_place' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
<@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_living_settlement' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
<@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_living_street_type' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
<@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_living_street' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
<@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_living_house' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />

  <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_living_country' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
  <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_living_place' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
   <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_living_settlement' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
  <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_living_street_type' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
  <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_living_street' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
  <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_living_house' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />


                <@action.setVisibleByValue 'true' 'he_living_place_gr' 'change' 'he_living_place' '1' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'he_living_place_gr' 'change' 'he_living_place_m' '2' "LBL+EL"/>

                <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place' '2' />
                <@action.unsetRequiredByField 'true' 'he_living_place_gr' 'change' 'he_living_place_m' '1' />

                <@action.setVisibleByValue 'true' 'she_living_place_gr' 'change' 'she_living_place' '1' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'she_living_place_gr' 'change' 'she_living_place_m' '2' "LBL+EL"/>

                <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place' '2' />
                <@action.unsetRequiredByField 'true' 'she_living_place_gr' 'change' 'she_living_place_m' '1' />

                <#-- убирать поля ввода названия улицы, если выбран тип улицы "нет улицы" (74 код в справочнике street_type_ls) -->
                <#--<@action.setDisabledByValue 'true' 'father_living_street_type' 'change' 'father_living_street' '74' />
                <@action.unsetRequiredByField 'true' 'father_living_street_type' 'change' 'father_living_street' '74' />

                <@action.setDisabledByValue 'true' 'mother_living_street_type' 'change' 'mother_living_street' '74' />
                <@action.unsetRequiredByField 'true' 'mother_living_street_type' 'change' 'mother_living_street' '74' />-->
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow class="fieldHidden">
                    <@spring.formHiddenInput path="form.aggregate_usluga_type_person"/>
                </@sf.fldrow>

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
            <@sf.dictionaryLookup  path="form.he_living_country" dictionaryCode="COUNTRY_LS" validation="required regexp" validationattr={'regexp':'/^[ЁА-Я]{0,200}$/i', "message":"Разрешены символы кириллицы длиной не более 200"} style="text-align:unknown;" colspan="12"/>
            <@sf.empty colspan="3"/>
            <@sf.label path="form.she_living_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup  path="form.she_living_country" dictionaryCode="COUNTRY_LS" validation="required regexp" validationattr={'regexp':'/^[ЁА-Я]{0,200}$/i', "message":"Разрешены символы кириллицы длиной не более 200"} style="text-align:unknown;" colspan="12"/>
            <@sf.empty colspan="2"/>
            </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_state" qtip="" validation="required regexp maxlength" validationattr={'maxlength':80, 'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-) длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_state" qtip="" validation="required regexp maxlength" validationattr={'maxlength':80, 'regexp':'/^[ёЁА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-) длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_region" title="Район" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_region" qtip="" validation="regexp maxlength" validationattr={'maxlength':80, 'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-) длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_region" title="Район" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_region" qtip="" validation="regexp maxlength" validationattr={'maxlength':80, 'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/', "message":"Допустим ввод кириллицы и символов (-) длиной не более 80"} style="text-align:unknown;" colspan="12"/>
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
                    <@sf.textfield path="form.he_living_place_m" validation="required regexp" validationattr={"regexp": '/^[-А-ЯЁ\\s./]{0,20}$/i'}    validationMessage={"regexp": "Допустим ввод кириллицы и символов ./- длиной не более 20"}
                    style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.she_living_place_m" validation="required regexp" validationattr={"regexp": '/^[-А-ЯЁ\\s./]{0,20}$/i'}     validationMessage={"regexp": "Допустим ввод кириллицы и символов ./- длиной не более 20"}
                    style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_settlement" qtip="" validation="regexp required maxlength" validationattr={'maxlength':80, 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,80}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|. длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_settlement" qtip="" validation="regexp required maxlength" validationattr={'maxlength':80, 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,80}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|. длиной не более 80"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" resultCallbacks=['he_living_street_type_result_callback'] validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" resultCallbacks=['she_living_street_type_result_callback'] validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_street" title="Улица" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_street" qtip="" validation="regexp required maxlength" validationattr={'maxlength':33, 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,33}$/', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|. длиной не более 33"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_street" title="Улица" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_street" qtip="" validation="regexp required maxlength" validationattr={'maxlength':33, 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,33}$/', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|. длиной не более 33"} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_house" title="Дом" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_house" qtip="" validation="required maxlength" validationattr={'maxlength':7} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_house" title="Дом" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_house" qtip="" validation="required maxlength" validationattr={'maxlength':7} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_building" title="Корпус" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_building" qtip="" validation="maxlength" validationattr={'maxlength':4} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_building" title="Корпус" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_building" qtip="" validation="maxlength" validationattr={'maxlength':4} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_living_flat" title="Квартира" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_living_flat" qtip="" validation="maxlength" validationattr={'maxlength':9} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_living_flat" title="Квартира" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_living_flat" qtip="" validation="maxlength" validationattr={'maxlength':9} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>