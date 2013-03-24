<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../utils.ftl" as utils>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<#import "../customValidation/threeFieldsDateLessThenNow.ftl" as threeFieldsDateLessThenNow>
<#import "../customTemplates/generic/dayField.ftl" as dayController>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача свидетельства об установлении отцовства по совместному заявлению родителей'>
        <@birthDatePlusNUntilNow.preHead/>
        <@threeFieldsDateLessThenNow.preHead/>
    <style type="text/css">
        .form-body {
            width: 100%;
        }
    </style>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@threeFieldsDateLessThenNow.preScript/>
            <@dayController.preScript/>
            <@utils.setZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp'} classVisible='visibleInfo'/>

            <@jquery.onready>
                <@utils.clearZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp','clearButton':'id_agency_in'} classVisible='visibleInfo'/>
                <@birthDatePlusNUntilNow.onReady/>
                <@threeFieldsDateLessThenNow.onReady/>
                <#-- usluga_form = 1 -->
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='merried_akt_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthday', 'merried_akt_date', '14'"} attrMessages=""/>
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'merried_doc' '1' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'merried_info' '1' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'merried_akt_num' '1' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'merried_akt_date' '1' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'merried_akt_zags_gr' '1' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'merried_doc' '1' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'merried_info' '1' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'merried_akt_num' '1' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'merried_akt_date' '1' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'merried_akt_zags_gr' '1' />

                <@action.setVisibleByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list' '1' />
                <@action.unsetDisabledByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list' '1' />
                <@action.setVisibleByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list_info' '1' />
                <@action.unsetDisabledByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list_info' '1' />

                <@action.setVisibleByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags' '2' />
                <@action.unsetDisabledByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags' '2' />

                <#--<@action.setRequiredIf 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list' '1'/>-->
                <#--<@action.setRequiredIf 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags' '2'/>-->
                <#------------------------------------------->

                <#-- usluga_form = 2 -->
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'reason' '2' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'reason_doc' '2' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'reason_doc' '2' />
                <#-- reason_doc = 1 -->
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_doc_date_day' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_doc_date_day', 'death_doc_date_month', 'death_doc_date_year'"} attrMessages=""/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_doc_date_month' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_doc_date_day', 'death_doc_date_month', 'death_doc_date_year'"} attrMessages=""/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_doc_date_year' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_doc_date_day', 'death_doc_date_month', 'death_doc_date_year'"} attrMessages=""/>
                <@dayController.controllDay "death_doc_date_day" "death_doc_date_month" "death_doc_date_year"  />


                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_num' '1' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_date_info' '1' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_date_date' '1' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_date_day' '1' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_date_month' '1' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_date_year' '1' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'death_doc_source' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_num' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_date_info' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_date_date' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_date_day' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_date_month' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_date_year' '1' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'death_doc_source' '1' />
                <#-------------------->
                <#-- reason_doc = 2 -->
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='decision_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthday', 'decision_date', '14'"} attrMessages=""/>
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'court_name' '2' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'decision_date' '2' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'decision_type' '2' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'court_name' '2' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'decision_date' '2' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'decision_type' '2' />
                <#-------------------->
                <#-- reason_doc = 3 -->
                <@dayController.controllDay "certificate_date_day" "certificate_date_month" "certificate_date_year"/>
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_num' '3' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_date_info' '3' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_date' '3' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_date_day' '3' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_date_month' '3' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_date_year' '3' />
                <@action.setVisibleByValue 'true' 'reason_doc' 'change' 'certificate_source' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_num' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_date_info' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_date' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_date_day' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_date_month' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_date_year' '3' />
                <@action.unsetDisabledByValue 'true' 'reason_doc' 'change' 'certificate_source' '3' />
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='certificate_date_day' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'certificate_date_day', 'certificate_date_month', 'certificate_date_year'"} attrMessages=""/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='certificate_date_month' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'certificate_date_day', 'certificate_date_month', 'certificate_date_year'"} attrMessages=""/>
                <@threeFieldsDateLessThenNow.applyCustomValidation inputid='certificate_date_year' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'certificate_date_day', 'certificate_date_month', 'certificate_date_year'"} attrMessages=""/>
                <#-------------------->
                <#------------------------------------------->

                <#-- usluga_form = 3 -->
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='decision_law_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthday', 'decision_law_date', '14'"} attrMessages=""/>
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'details_decision_law' '3' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'name_law' '3' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'decision_law_date' '3' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'decision_law_type' '3' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'details_decision_law' '3' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'name_law' '3' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'decision_law_date' '3' />
                <@action.unsetDisabledByValue 'true' 'usluga_form' 'change' 'decision_law_type' '3' />
                <#------------------------------------------->
               <#--<@validation.addvalidationmethod false 'nowMax'  'nowMax()' ''/>-->
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm >

            <#--Блок загса------------------------------------------------------------------------------------------>
                <@sf.fldrow>
                <input type="hidden" id="arg_usluga_reason"/>
                    <@spring.formHiddenInput path="form.declarant_birthday"/>
                    <@spring.formHiddenInput path="form.agency_in_info"/>
                    <@spring.formHiddenInput path="form.agency_id"/>
                    <@spring.formHiddenInput path="form.adresZags"/>
                    <@spring.formHiddenInput path="form.telephMain"/>
                    <@spring.formHiddenInput path="form.adresHttp"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.id_agency_in" title="ЗАГС обращения" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.customLookup  path="form.id_agency_in" controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}", "method": "36400224", "typeAZ" : "AZ_UO"}) resultCallbacks=['setZagsDetailsInfo'] qtip="" validation="required" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow class="visibleInfo" style="display:none;">
                    <@sf.empty colspan="12"/>
                    <@sf.label path="form.telephMain" title="${form.telephMain!''}" required=false style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow class="visibleInfo" style="display:none;">
                    <@sf.empty colspan="12"/>
                    <@sf.label path="form.adresHttp" title="${form.adresHttp!''}" required=false style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow class="visibleInfo" style="display:none;">
                    <@sf.empty colspan="12"/>
                    <@sf.label path="form.adresZags" title="${form.adresZags!''}" required=false style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
            <#------------------------------------------------------------------------------------------------>
            <#--Форма заявления------------------------------------------------------------------------------->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.usluga_form" title="Форма заявления" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.staticLookup path="form.usluga_form" staticData={"1":"Выдача свидетельства об установлении отцовства по совместному заявлению родителей","2":"Выдача свидетельства об установлении отцовства по заявлению отца","3":"Выдача свидетельства об установлении отцовства на основании решения суда"} qtip="" validation="required" style="text-align:unknown;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
            <#--Если выбран пункт 1---------------------------------------------------------------------------->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="merried_doc" title="Документ, подтверждающий регистрацию брака" fieldset=true style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="merried_info" title="Данные о браке заполняются только в том случае, если брак был заключен после рождения ребенка" style="text-align:left;font-size:8pt;font-style:italic;" colspan="46" />
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_num" title="Запись Акта №" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.merried_akt_num" qtip=""  style="text-align:unknown;"  validation="maxlength regexp" validationattr={'regexp':'/^[0-9]+$/','maxlength':'20'}
                    validationMessage={"regexp":"Допустим ввод цифр","maxlength":"Максимум 20 символов"} colspan="11"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_date" title="Дата" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.merried_akt_date" style="text-align:unknown;" colspan="11"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_zags_gr" title="Способ заполнения наименования органа ЗАГС" style="text-align: right" colspan="9"/>
                    <@sf.empty colspan="2"/>
                    <@sf.radiogroup path="form.merried_akt_zags_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' colspan="28"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="merried_akt_zags_list_info" title="Справочник содержит перечень ЗАГСов субъекта РФ,  в котором оказывается данная услуга. <br>Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение в способе заполнения наименования органа ЗАГС." style="text-align:left;font-size:8pt;font-style:italic;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_zags_list" title="Наименование органа ЗАГС" required = false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.customLookup  path="form.merried_akt_zags_list" controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}"}) qtip="" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_zags" title="Наименование органа ЗАГС" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.merried_akt_zags" qtip=""  validation="maxlength regexp" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]*$/' ,'maxlength':'200'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

            <#------------------------------------------------------------------------------------------------->
            <#--Если выбран пункт 2 ---------------------------------------------------------------------------->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="reason" title="Основание для установления отцовства" fieldset=true style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.reason_doc" title="Тип документа" required=true  style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.staticLookup path="form.reason_doc" validation="required" staticData={"1":"Запись акта о смерти матери","2":"Решение суда о признании матери безвестно отсутствующей, недееспособной или лишённой родительских прав","3":"Справка из органа внутренних дел, подтверждающая невозможность установления места пребывания матери"} qtip=""  style="text-align:unknown;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

            <#-- reason_doc = 1 -->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_doc_num" title="Номер" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_doc_num" qtip=""  validation="required" style="text-align:unknown;"  validation="regexp" attr="maxlength='20'" validationattr={'regexp':'/^[0-9]+$/'} validationMessage={"regexp":"Допустим ввод цифр"} colspan="11"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="death_doc_date_info" title="Если точная дата  неизвестна, то заполните только поля, значения которых вы знаете" style="text-align:left;font-size:8pt;font-style:italic;" colspan="46" />
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="death_doc_date" title="Дата актовой записи<br> (число, месяц, <span style='color: red;'>*</span>год)" style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.death_doc_date_day" validation="digitsRedesign min max" validationMessage={"digitsRedesign" : "Поле может содержать только цифры"} validationattr={"max":31,"min":1} colspan="4"/>
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldMonth path="form.death_doc_date_month" qtip="" style="text-align:left;" colspan="6" />
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldYear path="form.death_doc_date_year" qtip="" validation="required" validationattr={"range":"1900, ${currentDate?string('yyyy')}"} style="text-align:left;" colspan="5"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_doc_source" title="Наименование органа ЗАГС" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.death_doc_source" qtip="" validation="regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]*$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>
            <#----------------------------->
            <#-- reason_doc = 2 -->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.court_name" title="Наименование суда" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.court_name" qtip="" validation="required regexp maxlength"  validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]*$/' ,'maxlength':'200'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.decision_date" title="Дата решения" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.decision_date"  qtip="" validation="required" maxDate="${currentDate?string('dd.MM.yyyy')}" style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.decision_type" title="Тип решения" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.decision_type" dictionaryCode="PRIZNANUO_DECISION_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>
            <#----------------------------->
            <#-- reason_doc = 3 -->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.certificate_num" title="Номер справки" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.certificate_num" qtip="" validation="required maxlength regexp" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]*$/','maxlength':'20'}
                    validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,.","maxlength":"Максимум 20 символов"} style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="certificate_date_info" title="Если точная дата  неизвестна, то заполните только поля, значения которых вы знаете" style="text-align:left;font-size:8pt;font-style:italic;" colspan="46" />
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Дата выдачи справки<br> (число, месяц, <span style='color: red;'>*</span>год)" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.certificate_date_day" validation="digitsRedesign min max " validationMessage={"digitsRedesign" : "Поле может содержать только цифры"} validationattr={"max":31,"min":1} colspan="4"/>
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldMonth path="form.certificate_date_month" qtip="" validation="" style="text-align:left;" colspan="5"/>
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldYear path="form.certificate_date_year" qtip="" validation="required " validationattr={"range":"1900, ${currentDate?string('yyyy')}"} style="text-align:left;" colspan="5"/>
                    <@sf.empty colspan="18"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.certificate_source" title="Наименование<br> организации, выдавшей<br> справку" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.certificate_source" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-.,"]{0,200}$/','maxlength':'200'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan="27"/>
                    <@sf.empty colspan="9"/>
                </@sf.fldrow>
            <#----------------------------->
            <#------------------------------------------------------------------------------------------------->
            <#--Если выбран пункт 3 ---------------------------------------------------------------------------->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="details_decision_law" required=true title="Реквизиты решения суда" fieldset=true style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.name_law" title="Наименование суда" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.name_law" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]+$/','maxlength':'200'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.decision_law_date" title="Дата" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.decision_law_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation='birthDatePlusNUntilNow required' style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.decision_law_type" title="Тип решения суда" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.decision_law_type" dictionaryCode="RSUO_DECISION_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="26"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

            <#------------------------------------------------------------------------------------------------->
            <#------------------------------------------------------------------------------------------------->
                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>