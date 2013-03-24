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
<#import "../customTemplates/generic/util.ftl" as util>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки об установлении отцовства'>
        <@localOrGlobalPassportSeries.preHead/>
        <@localOrGlobalPassportNumber.preHead/>
        <@birthDatePlusNUntilNow.preHead/>

    <style type="text/css">
        .form-body {
            width: 100%;
        }
    </style>

        <@script.scripttag>


        var f_checkDate = function() {

        if($("#min_doc_date").val()!=""){
        var inputDate =  Date.fromString( ($("#declarant_ident_doc_date").val()), "dd.mm.yyyy");
        var mindocdate = $("#min_doc_date").val();
        var mindocdate = $("#min_doc_date").val();
        var bornDate14 = Date.fromString( ($("#min_doc_date").val()), "dd.mm.yyyy");
        var currentDate = new Date();

            if(inputDate <= bornDate14){
                $.validator.messages["check"] = "Дата не должна быть меньше даты рождения + 14 лет";
                return false;
            }
            if(inputDate >= currentDate){
                $.validator.messages["check"] = "Дата не должна быть больше текущей даты";
                return false;
            }

            }
            return true;
        }


            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@birthDatePlusNUntilNow.preScript/>
            <@commonValidation.preScript/>
            <@jquery.onready>
                <@localOrGlobalPassportSeries.onReady/>
                <@localOrGlobalPassportNumber.onReady/>
                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_ident_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'declarant_ident_doc_date', '14'"} attrMessages=""/>

                <@commonValidation.clearValidationMessageOnChange ['declarant_ident_doc_type_gr','declarant_ident_doc_type'], ['declarant_ident_doc_ser','declarant_ident_doc_num'] />
                <@util.preSettlementScript field='declarant_ident_doc_type' />
                <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_ident_doc_type,declarant_ident_doc_ser'/>
                <@action.applyValidationIf 'true' 'declarant_ident_doc_type_gr' 'change' 'declarant_ident_doc_num' '1' 'localOrGlobalPassportNumber' 'declarant_ident_doc_type,declarant_ident_doc_num'/>
                <@validation.addvalidatormethod false 'check' 'f_checkDate()' '' />

                <@fioFields.controllCase 'declarant_last_name' 'declarant_first_name' 'declarant_middle_name'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
                    <@spring.formHiddenInput path="form.min_doc_date"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Заявитель" required=false style="text-align:left;" colspan="46"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_last_name" title="Фамилия" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_last_name" qtip="" validation="regexp required" attr="maxlength='40'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,40}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_first_name" qtip="" validation="regexp required" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,20}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, прбела и символа -"}  attr = "maxlength='20'" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_middle_name" qtip="" validation="regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,20}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, прбела и символа -"} attr = "maxlength='20'" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Документ, удостоверяющий личность" required=false style="text-align:left;" colspan="24"/>
                    <@sf.empty colspan="23"/>
                </@sf.fldrow>

                <@util.settlement  field='declarant_ident_doc_type' labelTitle="Способ заполнения типа документа" title="Тип документа" dictionary="DUL_LS"  validationattr={"maxlength":"70"} fieldCollspan=13 labelCollspan=8 rightCollspan=27/>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_ident_doc_ser" title="Серия" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_ident_doc_ser" qtip="" validation="required" attr = "maxlength='250'" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_ident_doc_num" title="Номер" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_ident_doc_num" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_ident_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.datefield path="form.declarant_ident_doc_date" validation="required check" maxDate="${currentDate?string('dd.MM.yyyy')}" minDate="${form.min_doc_date}" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_ident_doc_source" title="Кем выдан" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textarea path="form.declarant_ident_doc_source" qtip=""  attr = "maxlength='200'" validation="regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,250}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."}  style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	