<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/util.ftl" as util>
<#import "../utils.ftl" as utils>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../customValidation/threeFieldsDateLessThenNow.ftl" as threeFieldsDateLessThenNow>
<#import "../customTemplates/generic/dayField.ftl" as dayController>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о смерти'>
        <@threeFieldsDateLessThenNow.preHead/>

    <style type="text/css">
        .form-body {
            width: 100%;
        }
    </style>
    <style type="text/css">
        .inputBasicWrapR {
            width: 100% !important;
        }

        .inputBasicWrap {
            width: 100% !important;
            margin-left: 5px !important;
            position: relative !important;
        }

        .form-body td {
            vertical-align: middle !important;
            padding-bottom: 5px !important;
            padding-top: 5px !important;
        }

        .radioVer li, .checkVer li {
            margin-bottom: 0px !important;
            padding-left: 3px;
        }
    </style>
        <@script.scripttag>
            <@threeFieldsDateLessThenNow.preScript/>
            <@dayController.preScript/>

        function requiredDate() {
        if ($('#death_date_day').val() == '' && $('#death_date_month').val() == '' && $('#death_date_year').val() == '') {
        return false;
        }
        return true;
        }


            <@jquery.onready>
            /* Исправление багов дизайна: */
            $('#death_date_month').siblings('.inputBasicWrap').css('width','119px');

                <@threeFieldsDateLessThenNow.onReady/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_date_day' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_date_day', 'death_date_month', 'death_date_year'"} attrMessages=""/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_date_month' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_date_day', 'death_date_month', 'death_date_year'"} attrMessages=""/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_date_year' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_date_day', 'death_date_month', 'death_date_year'"} attrMessages=""/>
                <@dayController.controllDay "death_date_day" "death_date_month" "death_date_year"/>
                <@utils.validOnAction source='death_date_month death_date_year' dest='death_date_day'/>


                <@validation.addvalidatormethod false 'requiredDate' 'requiredDate()' ''/>

                <@util.preSettlementScript field='death_place_settlement_type' />
                <@action.setRequiredIf 'true' 'death_place_settlement_type_gr' 'change' 'death_place_settlement_type' ''/>
                <@action.setRequiredIf 'true' 'death_place_settlement_type_gr' 'change' 'death_place_settlement_type_m' ''/>
                <@action.setRequiredIf 'true' 'death_place_settlement_type_gr' 'change' 'death_place_settlement_type_gr' ''/>
                <@fioFields.controllCase 'death_person_last_name' 'death_person_first_name' 'death_person_middle_name'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Сведения об умершем" required=false style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_last_name" title="Фамилия" required=true style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_last_name" qtip="" validation="regexp required" attr="maxlength='40'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,40}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_first_name" title="Имя" required=true style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_first_name" qtip="" validation="regexp required" attr="maxlength='20'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,20}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_middle_name" title="Отчество" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_middle_name" qtip="" validation="regexp" attr="maxlength='20'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,20}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.statictext style="text-align:left; padding-left:10px;" colspan="46"><i>Если точная дата смерти неизвестна, то заполните только те поля, значения которых вы знаете.</i></@sf.statictext>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Дата смерти (число, месяц, год)" required=true style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.death_date_day" validation="digitsRedesign min max deathDateVal requiredDate" validationMessage={"requiredDate":"Необходимо заполнить хотя бы одно из полей", "digitsRedesign" : "Поле может содержать только цифры"}
                    validationattr={"max":31,"min":1} colspan="4"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefieldMonth path="form.death_date_month" title="Месяц смерти" validation="deathDateVal requiredDate" validationMessage={"requiredDate":"Необходимо заполнить хотя бы одно из полей"} colspan="8"/>
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldYear path="form.death_date_year" validation="deathDateVal requiredDate" validationMessage={"requiredDate":"Необходимо заполнить хотя бы одно из полей"}  colspan="4" />
                    <@sf.empty colspan="15"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Место смерти" required=false style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_place_country" title="Страна" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.death_place_country" qtip="" dictionaryCode="COUNTRY_LS"  style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_place_state" title="Область (край, респ.)" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_place_state" qtip="" validation="regexp" attr="maxlength='80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_place_region" title="Район" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_place_region" qtip="" validation="regexp" attr="maxlength='80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@util.settlement  field='death_place_settlement_type' labelTitle="Способ заполнения типа населенного пункта" title="Тип населенного пункта" dictionary="SETTELEMENT_TYPE_LS"
                validation="regexp required" validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я./\\- ]{0,20}$/',"message":"Допустим ввод кириллицы и символов ./-"}
                labelCollspan=12 fieldCollspan=13 rightCollspan=21 />

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_place_settlement" title="Населенный пункт" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_place_settlement" qtip="" validation="regexp" attr="maxlength='80'" validationattr={'regexp':'/^[А-Яа-яёЁ0-9\\s./№()-]{0,80}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символами ./№()-"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	