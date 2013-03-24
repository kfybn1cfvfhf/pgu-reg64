<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customValidation/common.ftl" as commonValidation>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as switchableDeclarantDocumentDocType>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<#import "../customValidation/firstDatePlusNUntilLastDatePlusM.ftl" as firstDatePlusNUntilLastDatePlusM>
<#import "../customTemplates/generic/fioFields.ftl" as fioController>
<#import "../utils.ftl" as utils>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация усыновления (удочерения)'>
    <style type="text/css">
        .form-body {
            width: 100%;
        }
    </style>
    <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
        <@localOrGlobalPassportSeries.preHead/>
        <@localOrGlobalPassportNumber.preHead/>
        <@birthDatePlusNUntilNow.preHead/>
        <@firstDatePlusNUntilLastDatePlusM.preHead/>
        <@script.scripttag>

            <@birthDatePlusNUntilNow.preScript/>
            <@firstDatePlusNUntilLastDatePlusM.preScript/>
            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@jquery.onready>
                <@utils.requireFieldsFromOneBlock first='she_birth_date she_doc_type she_doc_ser she_doc_number she_doc_date she_doc_place'
                second='he_birth_date he_doc_type he_doc_ser he_doc_number he_doc_date he_doc_place' />

                <@switchableDeclarantDocumentDocType.onReady/>
                <@localOrGlobalPassportSeries.onReady/>
                <@localOrGlobalPassportNumber.onReady/>

                <#macro set_he_fields_required>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_last_name' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_first_name' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_birth_date' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_doc_ser' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_doc_type_gr' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_doc_number' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_doc_date' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'he_doc_place' 'true'/>

                    <@action.setRequiredIf 'true' 'he_doc_type_gr' 'change' 'he_doc_type' '1'/>
                    <@action.setRequiredIf 'true' 'he_doc_type_gr' 'change' 'he_doc_type_m' '2'/>
                </#macro>

                <#macro set_he_fields_not_required>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_last_name' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_first_name' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_birth_date' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_doc_ser' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_doc_type_gr' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_doc_number' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_doc_date' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'he_doc_place' 'true'/>

                    <@action.unsetRequiredByField 'true' 'he_doc_type_gr' 'change' 'he_doc_type' '1,2'/>
                    <@action.unsetRequiredByField 'true' 'he_doc_type_gr' 'change' 'he_doc_type_m' '1,2'/>
                </#macro>

                <#macro set_she_fields_required>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_last_name' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_first_name' 'true' />
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_birth_date' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_doc_type_gr' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_doc_ser' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_doc_number' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_doc_date' 'true'/>
                    <@action.setRequiredIf 'true' 'trueField' 'change' 'she_doc_place' 'true'/>

                    <@action.setRequiredIf 'true' 'she_doc_type_gr' 'change' 'she_doc_type' '1'/>
                    <@action.setRequiredIf 'true' 'she_doc_type_gr' 'change' 'she_doc_type_m' '2'/>
                </#macro>

                <#macro set_she_fields_not_required>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_last_name' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_first_name' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_birth_date' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_doc_type_gr' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_doc_ser' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_doc_number' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_doc_date' 'true'/>
                    <@action.unsetRequiredByField 'true' 'trueField' 'change' 'she_doc_place' 'true'/>

                    <@action.unsetRequiredByField 'true' 'she_doc_type_gr' 'change' 'she_doc_type' '1,2'/>
                    <@action.unsetRequiredByField 'true' 'she_doc_type_gr' 'change' 'she_doc_type_m' '1,2'/>
                </#macro>

                <@action.applyValidationIf 'true' 'he_doc_type_gr' 'change' 'he_doc_ser' '1' 'localOrGlobalPassportSeries' 'he_doc_type,he_doc_ser'/>
                <@action.applyValidationIf 'true' 'he_doc_type_gr' 'change' 'he_doc_number' '1' 'localOrGlobalPassportNumber' 'he_doc_type,he_doc_number'/>
                <@commonValidation.clearValidationMessageOnChange ['he_doc_type_gr','he_doc_type'], ['he_doc_ser','he_doc_number'] />

                <@action.applyValidationIf 'true' 'she_doc_type_gr' 'change' 'she_doc_ser' '1' 'localOrGlobalPassportSeries' 'she_doc_type,she_doc_ser'/>
                <@action.applyValidationIf 'true' 'she_doc_type_gr' 'change' 'she_doc_number' '1' 'localOrGlobalPassportNumber' 'she_doc_type,she_doc_number'/>
                <@commonValidation.clearValidationMessageOnChange ['she_doc_type_gr','she_doc_type'], ['she_doc_ser','she_doc_number'] />

                <@firstDatePlusNUntilLastDatePlusM.onReady/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='he_birth_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'he_birth_date', 'currentDate', 'edge_date', '-120' , '0'"} attrMessages=""/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='she_birth_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'she_birth_date', 'currentDate', 'edge_date', '-120' , '0'"} attrMessages=""/>


                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='he_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'he_birth_date', 'he_doc_date', '14'"} attrMessages=""/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='she_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'she_birth_date', 'she_doc_date', '14'"} attrMessages=""/>

                <#if form.he_args_required && form.she_args_required >
                    <@set_he_fields_required/>
                    <@set_she_fields_required/>
                <#elseif form.he_args_required >
                    <@set_he_fields_required/>
                    <@set_she_fields_not_required/>
                <#elseif form.she_args_required >
                    <@set_she_fields_required/>
                    <@set_he_fields_not_required/>
                <#else>
                    <@set_he_fields_required/>
                    <@set_she_fields_required/>

                    <#list ['birth_date','doc_type', 'doc_ser', 'doc_number', 'doc_date', 'doc_place'] as fieldId>
                        <@action.applyValidationIf 'true' 'trueField' 'change' 'she_${fieldId}' 'true' 'requireFromOneBlock'/>
                        <@action.applyValidationIf 'true' 'trueField' 'change' 'he_${fieldId}' 'true' 'requireFromOneBlock'/>

                        $('#she_${fieldId}').bind('change',function()
                        {
                        requireFromOneBlock();
                        });

                        $('#he_${fieldId}').bind('change',function()
                        {
                        requireFromOneBlock();
                        });
                    </#list>

                </#if>

                <@action.setVisibleByValue 'true' 'he_doc_type_gr' 'change' 'he_doc_type' '1' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'he_doc_type_gr' 'change' 'he_doc_type_m' '2' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'she_doc_type_gr' 'change' 'she_doc_type' '1' "LBL+EL"/>
                <@action.setVisibleByValue 'true' 'she_doc_type_gr' 'change' 'she_doc_type_m' '2' "LBL+EL"/>

                <@fioController.controllCase "he_last_name" "he_first_name" "he_middle_name"/>
                <@fioController.controllCase "she_last_name" "she_first_name" "she_middle_name"/>

            </@jquery.onready>

        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow class="fieldHidden">
                <input type="hidden" id="trueField" value="true"/>
                    <@spring.formHiddenInput path="form.he_args_required"/>
                    <@spring.formHiddenInput path="form.she_args_required"/>
                    <@spring.formHiddenInput path="form.person_birth_date"/>
                    <@spring.formHiddenInput path="form.child_ident_birth_date"/>
                    <@spring.formHiddenInput path="form.decision_date"/>
                    <@spring.formHiddenInput path="form.merried_doc_date"/>
                    <@spring.formHiddenInput path="form.edge_date"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="9"/>
                    <@sf.label path="form.declarant_info" attr = "readonly" title="Заявитель" style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_info" attr = "readonly"  qtip="" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="19"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Он" style="text-align:left;" colspan="18"/>
                    <@sf.empty colspan="6"/>
                    <@sf.label fieldset=true title="Она" style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_last_name"  title="Фамилия" required = true style="text-align:right;"  colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_last_name"  qtip="" validation="cyrillic required" attr='maxlength="40"' style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_last_name" title="Фамилия" required = true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_last_name" qtip="" validation="cyrillic required" attr='maxlength="40"' style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_first_name" title="Имя" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_first_name" qtip="" validation="cyrillic required" attr='maxlength="20"' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_first_name" title="Имя" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_first_name" qtip="" validation="cyrillic required" attr='maxlength="20"' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_middle_name" title="Отчество" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_middle_name" qtip="" validation="cyrillic" attr='maxlength="20"' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_middle_name" title="Отчество" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_middle_name" qtip="" validation="cyrillic" attr='maxlength="20"' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_birth_date" title="Дата рождения" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.he_birth_date"  qtip=""  validation='' style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_birth_date" title="Дата рождения" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.she_birth_date"  qtip="" validation='' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_citizenship" dictionaryCode="GRAJD_LS" qtip=""  style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_citizenship" dictionaryCode="GRAJD_LS" qtip=""  style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_nation" title="Национальность" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_nation" dictionaryCode="NATIONALITY_LS" excludeCodes="${form.she_nation_dictionary}" title="Национальность" qtip="" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_nation" title="Национальность" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_nation" dictionaryCode="NATIONALITY_LS" excludeCodes="${form.he_nation_dictionary}" title="Национальность" qtip="" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Документ, удостоверяющий личность" style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label fieldset=true title="Документ, удостоверяющий личность" style="text-align:left;" colspan="21"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_type_gr" title="Способ заполнения типа документа" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.he_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation='required' mode='vertical' style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_type_gr" title="Способ заполнения типа документа" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.she_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation='required' mode='vertical'  style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.he_doc_type" dictionaryCode="DUL_LS" qtip="" validation="" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.she_doc_type" dictionaryCode="DUL_LS" qtip="" validation="" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_type_m" title="Тип документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.he_doc_type_m" validation="cyrillic" attr='maxlength="70"' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_type_m" title="Тип документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.she_doc_type_m" validation="cyrillic" attr='maxlength="70"' style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_ser" title="Серия" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_doc_ser" qtip="" validation="" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_ser" title="Серия" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_doc_ser" qtip="" validation="" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_number" title="Номер" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.he_doc_number" qtip="" validation="" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_number" title="Номер" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.she_doc_number" qtip="" validation="" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_date" title="Дата выдачи" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.he_doc_date"  maxDate="${currentDate?string('dd.MM.yyyy')}" validation="birthDatePlusNUntilNow" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_date" title="Дата выдачи" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.she_doc_date"  maxDate="${currentDate?string('dd.MM.yyyy')}" validation="birthDatePlusNUntilNow" validationattr={"relativedays":"'<=', 1"} style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.he_doc_place" title="Кем выдан" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.he_doc_place" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"ЁёА-Яа-я0-9\\s.,№()"-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-),. длиной не более 200"} style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.she_doc_place" title="Кем выдан" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.she_doc_place" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"ЁёА-Яа-я0-9\\s.,№()"-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-),. длиной не более 200"} style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>