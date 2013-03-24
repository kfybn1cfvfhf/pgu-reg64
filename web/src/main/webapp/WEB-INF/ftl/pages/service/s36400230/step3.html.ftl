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
<#import "../customValidation/common.ftl" as commonValidation>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства о расторжении брака'>
<style type="text/css">
    .inputBasicWrapR
    {
        width: 100% !important;
    }
    .inputBasicWrap
    {
        width: 100% !important;

        margin-right: 10px;
        position: relative;
    }
</style>
	<@script.scripttag>
    <@commonValidation.preScript/>
		<@jquery.onready>

		    <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
             <@action.setVisibleByValue 'true' 'declarant_place_gr' 'change' 'declarant_place' '1' />
             <@action.setVisibleByValue 'true' 'declarant_place_gr' 'change' 'declarant_place_m' '2' />
             <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
            <@commonValidation.clearValidationMessageOnChange ['declarant_street_type'], ['declarant_street'] />


		</@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>
<@sf.serviceStepForm >
				
        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label fieldset=true title="Место&nbsp;жительства&nbsp;заявителя" required=false style="text-align:left;" colspan="45"/>
            <@sf.empty colspan="2"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_country" title="Страна" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup  path="form.declarant_country" dictionaryCode="COUNTRY_LS" qtip=""validation="required"  style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.declarant_state" qtip="" validation="maxlength regexp required" validationattr={'maxlength':'80', 'regexp':'/^[А-ЯЁ\\s()-]{0,200}$/i', "message":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_region" title="Район" required=false style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.declarant_region" qtip="" validation="maxlength regexp" validationattr={'maxlength':80, 'regexp':'/^[А-ЯЁ\\s()-]{0,200}$/i', "message":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>
        <@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.declarant_place_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align: right" colspan=7/>
					<@sf.empty colspan="1"/>
					<@sf.radiogroup path="form.declarant_place_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="26"/>
					<@sf.empty colspan=13/>
				</@sf.fldrow>
        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_place" title="Тип населенного пункта" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.declarant_place" dictionaryCode="SETTELEMENT_TYPE_LS" validation="required" qtip=""  style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>
         <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield path="form.declarant_place_m"  validation="maxlength regexp required" validationattr={'maxlength':20, 'regexp':'/^[\\|\\"А-ЯЁ0-9\\s./№()-]{0,20}$/i', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} qtip=""  style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>
        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.declarant_settlement" qtip="" validation="maxlength regexp required" validationattr={'maxlength':80, 'regexp':'/^[\\|\\"А-ЯЁ0-9\\s./№()-]{0,200}$/i', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.dictionaryLookup path="form.declarant_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" validation="required"  style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_street" title="Улица" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.declarant_street" validation="maxlength regexp required" validationattr={'maxlength':33, 'regexp':'/^[\\|\\"А-ЯЁ0-9\\s./№()-]{0,200}$/i', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} qtip=""  style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_house" title="Дом" required=true style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.declarant_house" validation="maxlength required" validationattr={'maxlength':7} qtip=""  style="text-align:unknown;" colspan="6"/>
            <@sf.empty colspan="9"/>
            <@sf.label path="form.declarant_building" title="Корпус" required=false style="text-align:center;" colspan="5"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield path="form.declarant_building" validation="maxlength" validationattr={'maxlength':4} qtip=""  style="text-align:unknown;" wrapperstyle='margin-right:0' colspan="5"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.declarant_flat" title="Квартира" required=false style="text-align:right;" colspan="7"/>
            <@sf.empty colspan="1"/>
            <@sf.textfield  path="form.declarant_flat" validation="maxlength" validationattr={'maxlength':9} qtip=""  style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="13"/>
        </@sf.fldrow>

        <@sf.fldrow>
            <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
        </@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	