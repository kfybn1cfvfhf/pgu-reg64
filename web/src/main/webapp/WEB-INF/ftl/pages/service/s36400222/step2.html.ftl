<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/country.ftl" as country>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о рождении'>
        <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>


        <@script.scripttag>
            <#include "../customValidation/dateValidation.js" />
            <#include "../customValidation/fioValidation.js" />
            <@jquery.onready>

                 $.validator.addMethod('checkDateField',function(value, params){return checkDateField(value,"declarant_birthdate,-106,14,0")}, validateMessage);

                 $('#child_last_name').bind('change', fio_change);
                 $('#child_first_name').bind('change', fio_change);
                 $('#child_middle_name').bind('change', fio_change);

                <@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type' '1' />
                <@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '2' />

				<@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type' '1' />
				<@action.setVisibleByValue 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '2' />
				<@action.setRequiredIf 'true' 'child_settlement_type_gr' 'change' 'child_settlement_type_m' '2' />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>
            <@sf.fldrow>
                    <input type="hidden" id="message"/>
                    <@spring.formHiddenInput path="form.declarant_birthdate"/>
                    <@sf.empty colspan="48"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label fieldset=true title="Ребенок" style="text-align:left;" colspan="10"/>
            <@sf.empty colspan="37"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.child_last_name" title="Фамилия" required=true style="text-align:right;" colspan="10"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.child_last_name" qtip="" validation="required maxlength regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":40} style="text-align:left;" colspan="25"/>
            <@sf.empty colspan="11"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.child_first_name" title="Имя" required=true style="text-align:right;" colspan="10"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.child_first_name" qtip="" validation="required maxlength regexp" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":20} style="text-align:left;" colspan="25"/>
            <@sf.empty colspan="11"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.child_middle_name" title="Отчество" required=false style="text-align:right;" colspan="10"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.child_middle_name" qtip="" validation="regexp maxlength" validationattr={"regexp":"/^[-\\А-Яа-яёЁ\\ ]*$/", "message": "Буквы кириллицы, тире", "maxlength":20} style="text-align:left;" colspan="25"/>
            <@sf.empty colspan="11"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.child_sex" title="Пол" required=true style="text-align:right;" colspan="10"/>
            <@sf.empty colspan="1"/>
            <@sf.radiogroup path="form.child_sex" dictionaryCode="SEX_TYPES" mode="horizontal" qtip="" validation="required" style="text-align:left;" colspan="25" mode="horizontal"/>
            <@sf.empty colspan="11"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.child_ident_birth_date" title="Дата рождения" required=true style="text-align:right;" colspan="10"/>
            <@sf.empty colspan="1"/>
            <@sf.datefield path="form.child_ident_birth_date" qtip="" validation="required checkDateField"
            maxDate="${currentDate?string('dd.MM.yyyy')}"
            style="text-align:left;" colspan="5"/>
            <@sf.empty colspan="31"/>
            </@sf.fldrow>

            <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label fieldset=true title="Место рождения" style="text-align:left;" colspan="10"/>
            <@sf.empty colspan="37"/>
            </@sf.fldrow>




            <@country.block_country_form fieldsMap=fieldsMap country='birth_child_country' countryCode='child_countryCode' input='birth_child_input'
                 country_input='birth_child_country_input'  settlementRF='birth_child_community' area='birth_child_area_txt' region='birth_child_region_txt'
                 settlement_type='birth_child_settlement_type' country_settlement='child_country_settlement' settlement='birth_child_community_txt' city='birth_child_city_txt' />


            <@sf.fldrow>
                <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
            </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>