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
<#import "../customTemplates/generic/switchableDeadPersonDocumentDocType.ftl" as switchableDeadPersonDocumentDocType>
<#import "../customValidation/threeFieldsDateLessThenNow.ftl" as threeFieldsDateLessThenNow>
<#import "../customTemplates/generic/dayField.ftl" as dayController>
<#import "../customTemplates/generic/fioFields.ftl" as fioController>
<#import "../customValidation/threeFieldsDateLessThenNow.js" as dateScript>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о смерти'>
        <@localOrGlobalPassportSeries.preHead/>
        <@localOrGlobalPassportNumber.preHead/>
        <@threeFieldsDateLessThenNow.preHead/>

    <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
    <style type="text/css">
        .form-body {
            width: 100%;
        }
    </style>
        <@script.scripttag>
            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@threeFieldsDateLessThenNow.preScript/>
            <@dayController.preScript/>

        <#--a lot of JS-->
        <#--Глобальная проверка-->
        function dateBirthDeathValidation() {
            clearBirthDate();
            clearDeathDate();
            return validBirthDeathDateFields()
        }

        function errorDeathLessBirthday() {
            setTimeout(function () {
                $('#death_date_year-err').html("Дата смерти не должна быть меньше даты рождения");
                $('#death_date_month-err').html("Дата смерти не должна быть меньше даты рождения");
                $('#death_date_day-err').html("Дата смерти не должна быть меньше даты рождения");
            });
        }

        function clearBirthDate() {
            $('#death_person_birthday_year-err').html("");
            $('#death_person_birthday_month-err').html("");
            $('#death_person_birthday_day-err').html("");
        }

        function clearDeathDate() {
            $('#death_date_year-err').html("");
            $('#death_date_month-err').html("");
            $('#death_date_day-err').html("");
        }

        function validBirthDeathDateFields() {
            if (($('#death_date_year').val() != '') && $('#death_person_birthday_year').val() != '') {
                var year_death = $('#death_date_year').val();
                var date_birth_year = $('#death_person_birthday_year').val();
                if ($('#death_date_month').val() != '' && $('#death_person_birthday_month').val() != '') {
                    var month_death = ($('#death_date_month').val() - 1);
                    var date_birth_month = $('#death_person_birthday_month').val() - 1;
                } else {
                    var month_death = 0;
                    var date_birth_month = 0;
                }
                if ($('#death_date_day').val() != '' && $('#death_person_birthday_day').val() != '') {
                    var date_birth_day = $('#death_person_birthday_day').val();
                    var day_death = $('#death_date_day').val();
                } else {
                    var day_death = 1;
                    var date_birth_day = 1;
                }
                var date_death = new Date(year_death, month_death, day_death, 0, 0, 0, 0);
                var date_birth = new Date(date_birth_year, date_birth_month, date_birth_day, 0, 0, 0, 0);
                if ((date_death < date_birth)) {
                    errorDeathLessBirthday();
                    return false;
                }
            }
            checkDateField()
            return true;
        }


        function checkDateField() {
        var val = $('#death_person_ident_doc_date').val()
        if (val == "") {
        return(true);
        }
        var dateArray = val.split(".");
        var value = new Date(dateArray[2], dateArray[1] - 1, dateArray[0]);
        var current_date = new Date();
        var isMinDate = false;
        var isMaxDate = false;
        var date_birth_year;
        var year_death;
        $('#death_person_ident_doc_date-err').html("");
        if ($('#death_person_birthday_year').val() != '') {
        isMinDate = true;
        date_birth_year = $('#death_person_birthday_year').val();
        if ($('#death_person_birthday_month').val() == '') {
        var date_birth_month = 0;
        } else {
        var date_birth_month = $('#death_person_birthday_month').val() - 1;
        }
        if ($('#death_person_birthday_day').val() == '') {
        var date_birth_day = 1;
        } else {
        var date_birth_day = $('#death_person_birthday_day').val();
        }
        var date_birth = new Date(date_birth_year, date_birth_month, date_birth_day, 0, 0, 0, 0);
        }
        if ($('#death_date_year').val() != '') {
        isMaxDate = true;
        year_death = $('#death_date_year').val();
        if ($('#death_date_month').val() == '') {
        var month_death = 11;
        } else {
        var month_death = $('#death_date_month').val() - 1;
        }
        if ($('#death_date_day').val() == '') {
        var day_death = 31;
        } else {
        var day_death = $('#death_date_day').val();
        }
        var date_death = new Date(year_death, month_death, day_death, 0, 0, 0, 0);
        }
        if ((isMinDate && isMaxDate)) {
        if ((value >= date_birth) && (value <= date_death)) {
        return true;
        } else
        return(checkRequireElement(date_birth, date_death));
        } else {
        if ((isMinDate && !isMaxDate)) {
        if ((value >= date_birth) && (value <= current_date)) {
        return true;
        } else
        return(checkRequireElement(date_birth, 'no'));
        } else {
        if ((!isMinDate && isMaxDate)) {
        if ((value <= date_death )) {
        return true;
        } else return(checkRequireElement('no', date_death))
        }
        }

        return true;
        }
        }


        function checkRequireElement(minDate_, maxDate_) {
        setTimeout(function (minDate, maxDate) {
        var element = $('#death_person_ident_doc_date-err');
        var zero = function(num) {
        var s = '0' + num;
        return s.substring(s.length - 2);
        };

        if ((minDate_ != "no") && (maxDate_ != "no")) {
        var dateBirth = zero(minDate_.getDate()) + '.' + (zero(minDate_.getMonth() + 1)) + '.' + minDate_.getFullYear();
        var dateDeath = zero(maxDate_.getDate()) + '.' + (zero(maxDate_.getMonth() + 1)) + '.' + maxDate_.getFullYear();
        $(element).html("Необходимо указать дату в промежутке с " + dateBirth + " по " + dateDeath);
        }

        if ((minDate_ != "") && (maxDate_ == "no")) {
        var dateBirth = zero(minDate_.getDate()) + '.' + (zero(minDate_.getMonth() + 1)) + '.' + minDate_.getFullYear();
        var current_date = new Date()
        var dateDeath = zero(current_date.getDate()) + '.' + (zero(current_date.getMonth() + 1)) + '.' + current_date.getFullYear();
        $(element).html("Необходимо указать дату в промежутке с " + dateBirth + " по " + dateDeath);
        }

        if ((minDate_ == "no") && (maxDate_ != "")) {
        var dateDeath = zero(maxDate_.getDate()) + '.' + (zero(maxDate_.getMonth() + 1)) + '.' + maxDate_.getFullYear();
        $(element).html("Необходимо указать дату в промежутке до " + dateDeath);
        }

        }
        );
        return false;
        }


        <#---->
        <@jquery.onready>
        /* Исправление багов дизайна: */
        $("#death_person_birthday_month-lookup-form-text").parent().parent().css("width", "102px");
        $("#death_date_month-lookup-form-text").parent().parent().css("width", "102px");
        <@action.setRequiredIf 'true' 'death_date_year' 'change' 'death_date_day' ''/>
        <@action.setRequiredIf 'true' 'death_date_month' 'change' 'death_date_day' ''/>
        <@action.setRequiredIf 'true' 'death_date_year' 'change' 'death_date_month' ''/>
        <@action.setRequiredIf 'true' 'death_date_day' 'change' 'death_date_month' ''/>
        <@action.setRequiredIf 'true' 'death_date_day' 'change' 'death_date_year' ''/>
        <@action.setRequiredIf 'true' 'death_date_month' 'change' 'death_date_year' ''/>
        <#--Выравнивание поля #Пол (radio-buttons) по вертикали-->
         $('tr.sex > td.field').attr("style", "vertical-align: middle;");
         <@localOrGlobalPassportSeries.onReady/>
         <@localOrGlobalPassportNumber.onReady/>
         <@action.applyValidationIf 'true' 'death_person_ident_doc_type_gr' 'change' 'death_person_ident_doc_ser' '1' 'localOrGlobalPassportSeries' 'death_person_ident_doc_type,death_person_ident_doc_ser'/>
         <@action.applyValidationIf 'true' 'death_person_ident_doc_type_gr' 'change' 'death_person_ident_doc_num' '1' 'localOrGlobalPassportNumber' 'death_person_ident_doc_type,death_person_ident_doc_num'/>
         <@commonValidation.clearValidationMessageOnChange ['death_person_ident_doc_type_gr','death_person_ident_doc_type'], ['death_person_ident_doc_ser','death_person_ident_doc_num'] />
         <@validation.addvalidatormethod false 'dateBirthDeathValidation' 'dateBirthDeathValidation()' ''/>
         <@action.setVisibleByValue 'true' 'death_person_ident_doc_type_gr' 'change' 'death_person_ident_doc_type' '1' />
         <@action.setVisibleByValue 'true' 'death_person_ident_doc_type_gr' 'change' 'death_person_ident_doc_type_m' '2' />
         <@fioController.controllCase "death_person_last_name" "death_person_first_name" "death_person_middle_name"/>
         <@threeFieldsDateLessThenNow.onReady/>
         <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_person_birthday_day' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_person_birthday_day', 'death_person_birthday_month', 'death_person_birthday_year'"} attrMessages=""/>
         <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_person_birthday_month' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_person_birthday_day', 'death_person_birthday_month', 'death_person_birthday_year'"} attrMessages=""/>
         <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_person_birthday_year' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_person_birthday_day', 'death_person_birthday_month', 'death_person_birthday_year'"} attrMessages=""/>
            <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_date_day' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_date_day', 'death_date_month', 'death_date_year'"} attrMessages=""/>
            <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_date_month' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_date_day', 'death_date_month', 'death_date_year'"} attrMessages=""/>
            <@threeFieldsDateLessThenNow.applyCustomValidation inputid='death_date_year' validation='threeFieldsDateLessThenNow' params={"threeFieldsDateLessThenNow":"'death_date_day', 'death_date_month', 'death_date_year'"} attrMessages=""/>
         <@dayController.controllDay "death_person_birthday_day" "death_person_birthday_month" "death_person_birthday_year"  />
         <@dayController.controllDay "death_date_day" "death_date_month" "death_date_year"  />
         <@validation.addvalidatormethod false 'checkDateField' 'checkDateField()' ''/>

         var checkNonEmpty = function(value) {
            return (undefined != value && "" != value);
         }

         <@commonValidation.setRequiredIfPredicate
         'true',
         ['death_person_ident_doc_type','death_person_ident_doc_type_m'],
         'change|keyup',
         ['death_person_ident_doc_ser','death_person_ident_doc_date','death_person_ident_doc_num','death_person_ident_doc_source'],
         'checkNonEmpty'/>

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
                    <@sf.label fieldset=true title="Сведения об умершем" required=false style="text-align:left;" colspan="26"/>
                    <@sf.empty colspan="21"/>
                </@sf.fldrow>

                <@sf.fldrow class="sex">
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_last_name" title="Фамилия" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_last_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"40"} attr='maxlength="40"' style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_sex" title="Пол" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.death_person_sex" dictionaryCode="SEX_TYPES" qtip="" validation="required" style="text-align:left;" colspan="16" mode="horizontal"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_first_name" title="Имя" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="16"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.statictext required=false style="text-align:left;font-style:italic;" colspan="44">
                    <html><i>Если точные даты смерти и рождения неизвестны, то заполните только поля, значения которых
                        вы знаете</i></html>
                    </@sf.statictext>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#--<@sf.empty colspan="1"/>-->
                    <@sf.label path="form.death_person_birthday_day" title="Дата рождения (число, месяц, год)" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.death_person_birthday_day" validation="dateBirthDeathValidation digits min max" validationattr={"max":31,"min":1} colspan="4"/>
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldMonth path="form.death_person_birthday_month" validation="dateBirthDeathValidation" title="Месяц смерти" colspan="7" />
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldYear path="form.death_person_birthday_year" validation="dateBirthDeathValidation" colspan="4" />
                    <@sf.empty colspan="20"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#--<@sf.empty colspan="1"/>-->
                    <@sf.label title="Дата смерти (число, месяц, год)" colspan="8" required=true style="text-align:right;" />
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.death_date_day" validation="dateBirthDeathValidation digits min max" validationattr={"max":31,"min":1} colspan="4"/>
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldMonth path="form.death_date_month" validation="dateBirthDeathValidation" title="Месяц смерти" colspan="7" />
                    <@sf.empty colspan="2"/>
                    <@sf.datefieldYear path="form.death_date_year" validation="dateBirthDeathValidation" colspan="4" />
                    <@sf.empty colspan="20"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.death_person_citizenship" dictionaryCode="GRAJD_LS" qtip=""  style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_nationality" title="Национальность" required=false style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.death_person_nationality" dictionaryCode="NATIONALITY_LS" qtip="" title="Национальности" style="text-align:left;" colspan="16"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Документ, удостоверяющий личность умершего" required=false style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_type_gr" title="Способ заполнения типа документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.death_person_ident_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal'  colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.death_person_ident_doc_type" dictionaryCode="DUL_LS"  qtip="" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_type_m" title="Тип документа" required=false style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_ident_doc_type_m" qtip="" validation="maxlength regexp" validationattr={'maxlength':70, 'regexp':'/^[ЁёА-Яа-я\\s\\-]{0,70}$/', "message":"Допустим ввод кириллицы, пробела и символа -"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_ser" title="Серия"  style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_ident_doc_ser" qtip="" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_date" title="Дата выдачи"  style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.death_person_ident_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="relativedays checkDateField" validationattr={"relativedays":"'<=', 0"} style="text-align:left;" colspan="16"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_num" title="Номер"  style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.death_person_ident_doc_num" qtip="" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.death_person_ident_doc_source" title="Кем выдан"  style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.death_person_ident_doc_source" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[\\"А-Яа-яёЁ0-9\\s.,№()-]{0,200}$/', 'maxlength':200} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)ё,.","maxlength":"Пожалуйста, введите не более 200 символов"} style="text-align:left;" colspan="16"/>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
