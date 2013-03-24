<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../utils.ftl" as utils>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о перемене имени'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>

            <@jquery.onready>
                <@birthDatePlusNUntilNow.onReady/>
                <@fioFields.controllCase 'declarant_first_name' 'declarant_last_name' 'declarant_middle_name'/>

                <@utils.customDocTypeValidation/>

                <@action.setRequiredIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_type' '1' />
                <@action.setRequiredIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_type_m' '2'/>

                <@action.setVisibleByValue  'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_type' "1" "LBL+EL"/>
                <@action.setVisibleByValue  'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_type_m' "2" "LBL+EL"/>

                <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_ident_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birth_date', 'declarant_ident_doc_date', '14'"} attrMessages=""/>

                <#--<@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_num' 'MS_NONE' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_prefix' 'MS_NONE' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_restored' 'MS_NONE' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_date' 'MS_NONE' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_zags' 'MS_NONE' />-->

                if (($("#declarant_family_status").val() == "") || ($("#declarant_family_status").val() == "MS_NONE")) {
                    var martialStatus = $("#declarant_family_status").val();
                    setRequiredIf("declarant_family_status", "merried_akt_num", martialStatus, false);
                    setRequiredIf("declarant_family_status", "merried_akt_prefix", martialStatus, false);
                    setRequiredIf("declarant_family_status", "merried_akt_date", martialStatus, false);
                    setRequiredIf("declarant_family_status", "merried_akt_zags", martialStatus, false);

                    setUnsetVisibilityByValue("declarant_family_status", "merried_akt_num", martialStatus, 'hide', "LBL+EL");
                    setUnsetVisibilityByValue("declarant_family_status", "merried_akt_prefix", martialStatus, 'hide', "LBL+EL");
                    setUnsetVisibilityByValue("declarant_family_status", "merried_akt_date", martialStatus, 'hide', "LBL+EL");
                    setUnsetVisibilityByValue("declarant_family_status", "merried_akt_zags", martialStatus, 'hide', "LBL+EL");
                    setUnsetVisibilityByValue("declarant_family_status", "merried_akt_restored", martialStatus, 'hide', "LBL+EL");
                }


                $("#declarant_family_status").change(function() {
                    var martialStatus = $("#declarant_family_status").val();
                    if ((martialStatus == "") || (martialStatus == "MS_NONE")) {
                        setRequiredIf(this.id, "merried_akt_num", martialStatus, false);
                        setRequiredIf(this.id, "merried_akt_prefix", martialStatus, false);
                        setRequiredIf(this.id, "merried_akt_date", martialStatus, false);
                        setRequiredIf(this.id, "merried_akt_zags", martialStatus, false);

                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_num", martialStatus, 'hide', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_prefix", martialStatus, 'hide', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_date", martialStatus, 'hide', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_zags", martialStatus, 'hide', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_restored", martialStatus, 'hide', "LBL+EL");
                    } else {
                        setRequiredIf(this.id, "merried_akt_num", martialStatus, true);
                        setRequiredIf(this.id, "merried_akt_prefix", martialStatus, true);
                        setRequiredIf(this.id, "merried_akt_date", martialStatus, true);
                        setRequiredIf(this.id, "merried_akt_zags", martialStatus, true);
            
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_num", martialStatus, 'show', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_prefix", martialStatus, 'show', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_date", martialStatus, 'show', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_zags", martialStatus, 'show', "LBL+EL");
                        setUnsetVisibilityByValue("declarant_family_status", "merried_akt_restored", martialStatus, 'show', "LBL+EL");
                    }
                });

                <#--<@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_num' '' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_prefix' '' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_restored' '' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_date' '' />
                <@action.unsetRequiredByField 'true' 'declarant_family_status' 'changed' 'merried_akt_zags' '' />
-->
                <#--<@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_num' 'MARRIED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_prefix' 'MARRIED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_restored' 'MARRIED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_date' 'MARRIED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_zags' 'MARRIED' />

                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_num' 'DIVORCED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_prefix' 'DIVORCED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_restored' 'DIVORCED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_date' 'DIVORCED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_zags' 'DIVORCED' />

                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_num' 'WIDOWED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_prefix' 'WIDOWED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_restored' 'WIDOWED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_date' 'WIDOWED' />
                <@action.setRequiredIf 'true' 'declarant_family_status' 'changed' 'merried_akt_zags' 'WIDOWED' />-->

                <#--<@action.setHiddenByValue 'true' 'declarant_family_status' 'changed' 'merried_akt_num' 'MS_NONE' 'LBL+EL' />
                <@action.setHiddenByValue 'true' 'declarant_family_status' 'changed' 'merried_akt_prefix' 'MS_NONE' 'LBL+EL' />
                <@action.setHiddenByValue 'true' 'declarant_family_status' 'changed' 'merried_akt_restored' 'MS_NONE' 'LBL+EL' />
                <@action.setHiddenByValue 'true' 'declarant_family_status' 'changed' 'merried_akt_date' 'MS_NONE' 'LBL+EL' />
                <@action.setHiddenByValue 'true' 'declarant_family_status' 'changed' 'merried_akt_zags' 'MS_NONE' 'LBL+EL' />-->
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
                    <@sf.label title="&nbsp;<br>Заявитель" fieldset=true style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Документ, удостоверяющий личность заявителя" fieldset=true style="text-align:left;" colspan="22"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                <#-- Заполняется автоматически данными из СИА-->
                    <@sf.label path="form.declarant_last_name" title="Фамилия" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_last_name" qtip="" validation="required cyrillic maxlength" attr='maxlength="40"' style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_ident_doc_type_gr" title="Способ заполнения типа документа" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.declarant_ident_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_first_name" qtip="" validation="cyrillic required maxlength" attr='maxlength="20"' style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_ident_doc_type" title="Тип документа" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_ident_doc_type"  dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_middle_name" qtip="" validation="cyrillic maxlength" attr='maxlength="20"' style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_ident_doc_type_m" title="Тип документа" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.declarant_ident_doc_type_m"  validation="regexp maxlength" validationattr={'maxlength':'70','regexp':'/^[А-Яа-яЁё\\s]+$/'} validationMessage={"regexp": "Допустим ввод кириллицы"} qtip=""  style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_birth_date" title="Дата рождения" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.declarant_birth_date"  qtip="" validation="required relativeyears" maxDate=currentDate?string('dd.MM.yyyy') validationattr={"relativeyears":"'<=', 14"} validationMessage={"relativeyears": "Возраст заявителя должен быть больше 14 лет"} style="text-align:unknown;" colspan="6"/>
                    <@sf.empty colspan="8"/>
                    <@sf.label path="form.declarant_ident_doc_ser" title="Серия" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_ident_doc_ser" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_citizenship" dictionaryCode="GRAJD_LS" qtip="" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_ident_doc_num" title="Номер" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.declarant_ident_doc_num" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_nation" title="Национальность" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_nation" dictionaryCode="NATIONALITY_LS" title="Национальности" qtip="" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_ident_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.declarant_ident_doc_date" qtip="" validation="required relativedays" maxDate=currentDate?string('dd.MM.yyyy') validationattr={"relativedays":"'<=', 0"}  validationMessage={"relyearsbyfield":"Дата выдачи должна быть не раньше чем через 14 лет с даты рождения"} style="text-align:unknown;" colspan="6"/>
                    <@sf.empty colspan="9"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_family_status" title="Семейное положение" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_family_status" dictionaryCode="FAMILY_STATUS_LS" qtip="" style="text-align:unknown;" colspan="12" valueCode="MS_NONE"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_ident_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.declarant_ident_doc_source" qtip="" validation="maxlength regexp required" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"А-Яа-яЁё0-9\\s.,№()-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),."} style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_num" title="Номер актовой записи" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.merried_akt_num" qtip=""  style="text-align:unknown;"
                        validation="regexp" validationattr={'regexp':'/^[0-9]+$/'}
                    validationMessage={"regexp":"Допустим ввод цифр"} colspan="12"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_prefix" title="Префикс актовой записи" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.merried_akt_prefix" qtip=""  style="text-align:unknown;" validationattr={'regexp':'/^[0-9]+$/'} colspan="12"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>



                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_date" title="Дата актовой записи" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.merried_akt_date" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.merried_akt_zags" title="Наименование органа ЗАГС, выдавшего документ" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.merried_akt_zags" qtip=""  style="text-align:unknown;"  validation="maxlength regexp" validationattr={"regexp":"/^[-\\|\\sА-Яа-яёЁ0-9\"№\\(\\)\\.,\\/]*$/",'maxlength':'200'} validationMessage={"regexp":"Допустим ввод кириллицы, пробела,  цифр и символов \"№(-)/|."} colspan="12"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#--<@sf.empty colspan="1"/>-->
                    <#--<@sf.label path="form.merried_akt_restored" title="Актовая запись является восстановленной" required=false style="text-align:right;" colspan="8"/>-->
                    <@sf.empty colspan="10"/>
                    <@sf.checkbox path="form.merried_akt_restored" qtip="" label="Актовая запись является восстановленной" style="text-align:unknown;" requiredMark=false colspan="12"/>
                    <@sf.empty colspan="12"/>
                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>