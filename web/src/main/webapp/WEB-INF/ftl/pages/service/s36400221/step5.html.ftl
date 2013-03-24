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
    <@html.head title='Подача электронной заявки на регистрацию брака'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>


            <#-- Тип ДУЛ -->
                <@action.unsetDisabledByValue 'true' 'groom_ident_doc_type' 'change' 'groom_ident_doc_type_m' '5' /> <#-- Иной документ -->
                <@action.unsetDisabledByValue 'true' 'bride_ident_doc_type' 'change' 'bride_ident_doc_type_m' '5' />
            <#-- /Тип ДУЛ -->


            <#-- Серия ДУЛ -->
                <#--ОН-->
                <#-- У Временного удост или Иного документа серия необязательна -->
                <@action.unsetRequiredByField 'true' 'groom_ident_doc_type' 'change' 'groom_doc_ser' '2,5'/>

                <#-- Макс длина серии Паспорта Рф 4 цифр -->
                <@action.applyValidationIf 'true' 'groom_ident_doc_type' 'change' 'groom_doc_ser' '1' 'digitsexact' {"digitsexact":"4"}/>

                <#-- Значения серии Вида на жительство одно из списка: 80, 81, 82, 83 -->
                <@action.applyValidationIf onload='true' srcid='groom_ident_doc_type' event='change' destid='groom_doc_ser' value='3' rules='invaluelist' validationAttr={"invaluelist":"80, 81, 82, 83"} validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>

                <#--ОНА-->
                <#-- У Временного удост или Иного документа серия необязательна -->
                <@action.unsetRequiredByField 'true' 'bride_ident_doc_type' 'change' 'bride_doc_ser' '2,5'/>
                <#-- Макс длина серии Паспорта Рф 4 цифр -->
                <@action.applyValidationIf 'true' 'bride_ident_doc_type' 'change' 'bride_doc_ser' '1' 'digitsexact' {"digitsexact":"4"}/>

                <#-- Значения серии Вида на жительство одно из списка: 80, 81, 82, 83 -->
                <@action.applyValidationIf onload='true' srcid='bride_ident_doc_type' event='change' destid='bride_doc_ser' value='3' rules='invaluelist' validationAttr={"invaluelist":"80, 81, 82, 83"} validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
            <#-- /Серия ДУЛ -->

            <#-- Номер ДУЛ -->
                <#--ОН-->
                <#-- Макс длина номера Паспорта Рф 6 цифр -->
                <@action.applyValidationIf 'true' 'groom_ident_doc_type' 'change' 'groom_doc_num' '1' 'digitsexact' {"digitsexact":"6"}/>

                <#-- Макс длина номера Временного удост или Вида на жительство 7 цифр -->
                <@action.applyValidationIf 'true' 'groom_ident_doc_type' 'change' 'groom_doc_num' '2,3' 'digitsexact' {"digitsexact":"7"}/>

                <#--ОНА-->
                <#-- Макс длина номера Паспорта Рф 6 цифр -->
                <@action.applyValidationIf 'true' 'bride_ident_doc_type' 'change' 'bride_doc_num' '1' 'digitsexact' {"digitsexact":"6"}/>

                <#-- Макс длина номера Временного удост или Вида на жительство 7 цифр -->
                <@action.applyValidationIf 'true' 'bride_ident_doc_type' 'change' 'bride_doc_num' '2,3' 'digitsexact' {"digitsexact":"7"}/>
            <#-- /Номер ДУЛ -->

                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='groom_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'groom_date_of_birth', 'groom_doc_date', '14'"} attrMessages=""/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='bride_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'bride_date_of_birth', 'bride_doc_date', '14'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>

            <@spring.formHiddenInput path="form.groom_date_of_birth"/>
            <@spring.formHiddenInput path="form.bride_date_of_birth"/>

            <@sf.fldrow>
                <@sf.empty colspan="1"/>
                <@sf.label fieldset=true title="Он" style="text-align:left;" colspan="20"/>
                <@sf.empty colspan="4"/>
                <@sf.label fieldset=true title="Она" style="text-align:left;" colspan="20"/>
                <@sf.empty colspan="3"/>
            </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_ident_doc_type" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.groom_ident_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_ident_doc_type" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.bride_ident_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_ident_doc_type_m" title="Иной документ, удостоверяющий личность" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.groom_ident_doc_type_m" colspan="13" validation="required" qtip=""  style="text-align:left;" />
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_ident_doc_type_m" title="Иной документ, удостоверяющий личность" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.bride_ident_doc_type_m" colspan="12" validation="required" qtip=""  style="text-align:left;" />
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.groom_doc_ser" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.bride_doc_ser" validation="required" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_doc_num" title="Номер" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.groom_doc_num" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_doc_num" title="Номер" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.bride_doc_num" validation="required" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.groom_doc_date" validation="required" qtip="" maxDate="${currentDate?string('dd.MM.yyyy')}" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.bride_doc_date" validation="required" qtip="" maxDate="${currentDate?string('dd.MM.yyyy')}" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.groom_doc_source" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.bride_doc_source" validation="required" style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
