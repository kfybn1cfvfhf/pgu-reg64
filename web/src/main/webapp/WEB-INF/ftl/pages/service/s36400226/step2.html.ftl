<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/fioFields.ftl" as fioController>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация усыновления (удочерения)'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@birthDatePlusNUntilNow.onReady/>
                <@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type' '1' />
                <@action.setDisabledByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type' '2' />
                <@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '2' />
                <@action.setDisabledByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '1' />
                <@fioController.controllCase "child_last_name" "child_first_name" "child_middle_name"/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='child_ident_birth_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'person_birth_date', 'child_ident_birth_date', '14'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>

                <@sf.fldrow>
                    <@spring.formHiddenInput path="form.person_birth_date"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Сведения о ребенке" fieldset=true style="text-align:left;" colspan="39"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_last_name" title="Фамилия" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_last_name" qtip="" validation="cyrillic required maxlength" attr='maxlength="40"'  style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_first_name" qtip="" validation="cyrillic required maxlength" attr='maxlength="20"' style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_middle_name" qtip="" validation="cyrillic maxlength" attr='maxlength="20"' style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_ident_birth_date" title="Дата рождения" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.child_ident_birth_date"  qtip="" maxDate="${currentDate?string('dd.MM.yyyy')}" validation='birthDatePlusNUntilNow required'  style="text-align:left;" colspan="5"/>
                    <@sf.empty colspan="33"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_sex" title="Пол" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.child_sex" dictionaryCode="SEX_TYPES" qtip="" validation="required" style="text-align:left; padding-top:7px;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Место рождения" fieldset=true style="text-align:left;" colspan="31"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>

                 <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.child_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_state" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':'80'}   style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_region" title="Район"  style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_region" qtip="" validation="cyrillic maxlength" validationattr={'maxlength':'80'} style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement_type_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.child_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.child_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" validation="required" qtip="" style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_settlement_type_m" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\"ЁёА-Яа-я0-9\\s./-]{0,20}$/','maxlength':'20'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"-/."} style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-ЯЁ0-9\\s./№()-]*$/i','maxlength':'80'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов “№(-)/|.",'maxlength':'Возможен ввод не более 80 символов'} style="text-align:left;" colspan="30"/>
                    <@sf.empty colspan="8"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>