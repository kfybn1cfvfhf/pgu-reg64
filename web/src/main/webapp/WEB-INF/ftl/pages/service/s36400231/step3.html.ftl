
<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/util.ftl" as util>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о смерти'>
	    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>
            <@jquery.onready>
                /* Исправление багов дизайна: */
                $("#declarant_building").parent().parent().css("width", "121px");
                $("#declarant_building").parent().css("width", "141px");
                <@util.preSettlementScript field='declarant_place' />
			    <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '1' />
                $('#declarant_street_type').change(function(){
                    if ($('#declarant_street_type').val() == '1'){
                        setTimeout(function(){
                            $('#declarant_street').valid();
                        }, 200)
                    }
                });
                <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
                <@action.unsetRequiredByField 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
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
						<@sf.label fieldset=true title="Место жительства" required=false style="text-align:left;" colspan="46"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup  path="form.declarant_country"  dictionaryCode="COUNTRY_LS"  qtip="" validation="required "   style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_state" qtip="" validation="required regexp" attr = "maxlength='80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_region" title="Район" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_region" qtip="" validation="regexp" attr = "maxlength='80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>
                <@util.settlement  field='declarant_place' labelTitle="Способ заполнения типа населенного пункта" title="Тип населенного пункта" dictionary="SETTELEMENT_TYPE_LS"
                      validation="regexp required" validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я./\\- ]{0,20}$/',"message":"Допустим ввод кириллицы и символов ./-"}
                   rightCollspan=12 labelCollspan=8 fieldCollspan=26 />

				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_settlement" attr = "maxlength='80'" validation="required regexp" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} qtip=""  style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant_street_type" validation="required" dictionaryCode="STREET_TYPE_LS" qtip=""  style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_street" title="Улица" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_street" attr = "maxlength='33'" validation="regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,33}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} qtip=""  style="text-align:left;" colspan="26"/>
					    <@sf.empty colspan="12"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_house" title="Дом" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield path="form.declarant_house" validation="required" attr = "maxlength='7'" qtip=""  style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="6"/>
						<@sf.label path="form.declarant_building" title="Корпус" required=false style="text-align:right;" colspan="3"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield path="form.declarant_building" qtip=""  attr = "maxlength='4'" style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="16"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_flat" title="Квартира" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_flat" qtip="" attr = "maxlength='9'" style="text-align:left;" colspan="26"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	