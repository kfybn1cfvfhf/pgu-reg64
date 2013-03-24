<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация усыновления (удочерения)'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@birthDatePlusNUntilNow.onReady/>

                <@action.setVisibleByValue 'true' 'merried_doc_source_gr' 'change' 'merried_doc_source_info' '1' />
                <@action.unsetDisabledByValue 'true' 'merried_doc_source_gr' 'change' 'merried_doc_source_info' '1' />
                <@action.setVisibleByValue 'true' 'merried_doc_source_gr' 'change' 'merried_doc_source_list' '1' />
                <@action.unsetDisabledByValue 'true' 'merried_doc_source_gr' 'change' 'merried_doc_source_list' '1' />
                <@action.setVisibleByValue 'true' 'merried_doc_source_gr' 'change' 'merried_doc_source' '2' />
                <@action.unsetDisabledByValue 'true' 'merried_doc_source_gr' 'change' 'merried_doc_source' '2' />

                <@birthDatePlusNUntilNow.applyCustomValidation inputid='merried_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'person_birth_date', 'merried_doc_date', '16'"} attrMessages=""/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='decision_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'person_birth_date', 'decision_date', '16'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>
                <@sf.fldrow class="fieldHidden">
                    <@sf.empty colspan="48"/>
                    <@spring.formHiddenInput path="form.edge_date"/>
                	<@spring.formHiddenInput path="form.person_birth_date"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant" title="Заявитель" style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant" dictionaryCode="US_DECLARANT_LS" qtip=""  style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Основание для усыновления (удочерения)"  fieldset=true style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.decision_law" title="Решение суда" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.decision_law" qtip="" validation="regexp maxlength required" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"А-ЯёЁ0-9\\s.,/ №()-]*$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),./|"} style="text-align:unknown;" colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.decision_date" title="Дата" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.decision_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation='required birthDatePlusNUntilNow'
                        qtip=""  style="text-align:unknown;" colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Документ, подтверждающий регистрацию брака"  fieldset=true style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.statictext style="text-align:left; padding-left:10px;" colspan="46"><i>Данные о браке заполняются только в том случае, если усыновители состоят в браке </@sf.statictext>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_doc_num" title="Запись Акта №" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.merried_doc_num" qtip="" validation="regexp maxlength" validationattr={'maxlength':'20', 'regexp':'/^[0-9]+$/'}  validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:unknown;" colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_doc_date" title="Дата" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.merried_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation='birthDatePlusNUntilNow'
                        qtip=""  style="text-align:unknown;" colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_doc_source_gr" title="Способ заполнения наименования органа ЗАГС" style="text-align: right" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.merried_doc_source_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="merried_doc_source_info" title="Справочник содержит перечень ЗАГСов субъекта РФ,  в котором оказывается данная услуга. <br>Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение в способе заполнения наименования органа ЗАГС." style="text-align:left;font-size:8pt;font-style:italic;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_doc_source_list" title="Наименование органа ЗАГС" required = false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.customLookup  path="form.merried_doc_source_list"  controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}"}) qtip="" style="text-align:left;" colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_doc_source" title="Наименование органа ЗАГС" required = false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.merried_doc_source" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"А-ЯЁ0-9\\s.,/№()-]*$/i'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),./|"} style="text-align:unknown;" colspan="22"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>