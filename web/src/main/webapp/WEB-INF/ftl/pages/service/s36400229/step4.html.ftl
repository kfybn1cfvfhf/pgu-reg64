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
<#import "../customTemplates/generic/util.ftl" as util>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../../../macros/country.ftl" as country>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки о рождении'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@fioFields.controllCase 'child_first_name' 'child_last_name' 'child_middle_name'/>
                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='child_birthday' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birthdate', 'child_birthday', '0'"} attrMessages=""/>
                <@util.preSettlementScript field='child_birth_place_settlement_type' />
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
						<@sf.label fieldset=true title="Сведения о ребенке" required=false style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="21"/>
                        <@spring.formHiddenInput path="form.declarant_birthdate"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.child_last_name" title="Фамилия" required=true style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.child_last_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"40"} attr='maxlength="40"' style="text-align:left;" colspan="15"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.child_first_name" title="Имя" required=true style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.child_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="15"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>

                <@sf.fldrow>
                        <@sf.empty colspan="1"/>
						<@sf.label path="form.child_middle_name" title="Отчество" required=false style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.child_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} attr='maxlength="20"' style="text-align:left;" colspan="15"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.child_birthday" title="Дата рождения" required=true style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.child_birthday"  qtip="" validation="required birthDatePlusNUntilNow" maxDate="${currentDate?string('dd.MM.yyyy')}"
								style="text-align:left;" colspan="15"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Место рождения" required=false style="text-align:left;" colspan="22"/>
						<@sf.empty colspan="25"/>
                </@sf.fldrow>



                <@country.block_country_form fieldsMap=fieldsMap country='birth_child_country' countryCode='child_countryCode' input='birth_child_input'
                 country_input='birth_child_country_input'  settlementRF='birth_child_community' area='birth_child_area_txt' region='birth_child_region_txt'
                 settlement_type='birth_child_settlement_type' country_settlement='child_country_settlement' settlement='birth_child_community_txt' city='birth_child_city_txt' />
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	