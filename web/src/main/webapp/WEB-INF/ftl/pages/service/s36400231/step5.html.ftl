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
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о смерти'>
        <@birthDatePlusNUntilNow.preHead/>
    <style type="text/css">
        .inputBasicWrapR {
            width: 100% !important;
        }

        .inputBasicWrap {
            width: 100% !important;
            margin-left: 5px!important;
            position: relative!important;
        }
        .form-body td{
            vertical-align: middle !important;
            padding-bottom:5px !important;
            padding-top:5px !important;
        }
        .radioVer li, .checkVer li
        {
            margin-bottom: 0px!important;
            padding-left: 3px;
        }
    </style>
 	    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                $('#death_doc_source').parent().parent().parent().removeAttr('style');
                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='death_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'death_date', 'death_doc_date', '0'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
                <@sf.fldrow>
                        <@spring.formHiddenInput path="form.death_date"/>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Документ, подтверждающий смерть" required=false style="text-align:left;" colspan="22"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_doc_num" qtip="" validation="regexp" attr="maxlength='20'" validationattr={'regexp':'/^[0-9]+$/'} validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:unknown;" colspan="10"/>
                        <@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_doc_source" title="Место регистрации" required=false style="text-align:right;" colspan="11"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield path="form.death_doc_source" validation="regexp" attr="maxlength='200'" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s.,/№()-]{0,200}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} qtip=""  style="text-align:left;" colspan="10"/>
                        <@sf.empty colspan="25"/>
                </@sf.fldrow>
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_doc_date" title="Дата" required=false style="text-align:right;" colspan="11"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.death_doc_date" minDate="${form.death_date?string('dd.MM.yyyy')}" maxDate="${currentDate?string('dd.MM.yyyy')}"
                            qtip="" style="text-align:unknown;" colspan="10"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	