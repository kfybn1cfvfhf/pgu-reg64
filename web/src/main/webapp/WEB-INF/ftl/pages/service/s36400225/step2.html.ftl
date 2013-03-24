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
<#import "../customTemplates/generic/fioFields.ftl" as fioController>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача свидетельства об установлении отцовства по совместному заявлению родителей'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>

                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='child_birth_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthday', 'child_birth_date', '14'"} attrMessages=""/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='birth_name' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'child_birth_date', 'birth_name', '0'"} attrMessages=""/>

                <@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '2' 'ROW' />
                <@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type' '1' 'ROW' />

                <@action.setRequiredIf 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type' '1'/>
                <@action.setRequiredIf 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '2'/>

                <@fioController.controllCase "child_before_last_name" "child_before_first_name" "child_before_middle_name"/>
                <@fioController.controllCase "child_after_last_name" "child_after_first_name" "child_after_middle_name"/>

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
                    <@spring.formHiddenInput path="form.declarant_birthday"/>
                    <@sf.label id="merried_doc" title="Сведения о ребенке" fieldset=true style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_birth_date" title="Дата рождения" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.child_birth_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="birthDatePlusNUntilNow required" style="text-align:unknown;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.child_sex" title="Пол" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.child_sex" dictionaryCode="SEX_TYPES" qtip="" validation="required" style="text-align:left;" colspan="16" mode="horizontal"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Реквизиты записи акта о рождении ребенка" fieldset=true style="text-align:left;" colspan="36"/>
                    <@sf.empty colspan="11"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.birth_akt_num" title="Запись Акта №" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.birth_akt_num" qtip="" validation="regexp required" attr="maxlength='20'" validationattr={'regexp':'/^[0-9]+$/'} style="text-align:left;" validationMessage={"regexp":"Допустим ввод цифр"} colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.birth_zags" title="Наименование<br> органа ЗАГС" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea  path="form.birth_zags" qtip="" validation="regexp required" attr="maxlength='200'" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]{0,200}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.birth_name" title="Дата" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.birth_name"  qtip="" validation="birthDatePlusNUntilNow required" maxDate="${currentDate?string('dd.MM.yyyy')}" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Место рождения" fieldset=true style="text-align:left;" colspan="37"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>
                <#--Тип населенного пункта-->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_country" title="Страна" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.child_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_state" title="Область (край,<br> респ.)" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_state" qtip="" validation="regexp maxlength"  validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]*$/','maxlength':80} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_region" title="Район" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_region" qtip="" validation="regexp maxlength"  validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]*$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

            <#--NEW-->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement_type_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align: right" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.child_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='horizontal' colspan="28"/>
                    <@sf.empty colspan="11"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement_type" title="Тип<br>населенного<br> пункта" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.child_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement_type_m" title="Тип<br> населенного<br> пункта" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_settlement_type_m" qtip="" validation="regexp maxlength"  validationattr={'regexp':'/^[А-Яа-яёЁ\\s./-]*$/','maxlength':20}  validationMessage={"regexp":"Допустим ввод кириллицы, символов ./-"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_settlement" qtip="" validation="regexp required maxlength"  validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]*$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>



                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="ФИО ребенка до установления отцовства" fieldset=true style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label title="ФИО ребенка после установления отцовства" fieldset=true style="text-align:left;" colspan="22"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_before_last_name" title="Фамилия" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_before_last_name" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':40} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.child_after_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_after_last_name" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':40} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_before_first_name" title="Имя" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_before_first_name" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':20} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.child_after_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_after_first_name" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':20} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.child_before_middle_name" title="Отчество" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_before_middle_name" qtip="" validation="cyrillic maxlength" validationattr={'maxlength':20} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.child_after_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.child_after_middle_name" qtip="" validation="cyrillic maxlength" validationattr={'maxlength':20} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            <script>
                $("#child_before_last_name").change(function () {
                    if ($("#child_after_last_name").val() == "") {
                        $("#child_after_last_name").val(this.value);
                    }
                });
                $("#child_before_first_name").change(function () {
                    if ($("#child_after_first_name").val() == "") {
                        $("#child_after_first_name").val(this.value);
                    }
                });
                $("#child_before_middle_name").change(function () {
                    if ($("#child_after_middle_name").val() == "") {
                        $("#child_after_middle_name").val(this.value);
                    }
                });
            </script>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>