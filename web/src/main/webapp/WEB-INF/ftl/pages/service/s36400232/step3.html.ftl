<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки об установлении отцовства'>
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
		<@jquery.onready>
            <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
            <@action.unsetRequiredByField 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />

            <@action.setVisibleByValue 'true' 'declarant_place_gr' 'change' 'declarant_place' '1' />
            <@action.setVisibleByValue 'true' 'declarant_place_gr' 'change' 'declarant_place_m' '2' />

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
	<@sf.label fieldset=true title="Место жительства заявителя" required=false style="text-align:left;" colspan="45"/>
	<@sf.empty colspan="2"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_country" title="Страна" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
    <@sf.dictionaryLookup path="form.declarant_country" dictionaryCode="COUNTRY_LS" validation="required" qtip="" style="text-align:left;" colspan="13"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_state" qtip="" validation="required regexp" attr="maxlength='80'" validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_region" title="Район" required=false style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_region" qtip="" validation="regexp" attr="maxlength='80'" validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_place_gr" title="Способ задания типа населенного пункта" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
    <@sf.radiogroup path="form.declarant_place_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_place" title="Тип населенного пункта" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.dictionaryLookup path="form.declarant_place" dictionaryCode="SETTELEMENT_TYPE_LS" validation="required" qtip="" style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
    <@sf.textfield  path="form.declarant_place_m" qtip="" validation="regexp required" validationattr={'regexp':'/^[\\"ЁёА-Яа-я0-9\\s./-]{0,20}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"-/. (не более 20)"} style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
<#--/^[\\|ЁёА-Яа-я0-9\\s.,/№()-]{0,200}$/-->
<#--/^[ЁёА-Яа-я0-9\"№\\(\\)-\\|\\.\\s\\/]{0,200}$/-->
	<@sf.textfield path="form.declarant_settlement" validation="regexp required" attr="maxlength='80'" validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} qtip=""  style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.dictionaryLookup path="form.declarant_street_type" validation="required"  dictionaryCode="STREET_TYPE_LS" qtip=""  style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_street" title="Улица" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_street" qtip="" validation="regexp required" attr="maxlength='33'" validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,33}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_house" title="Дом" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_house" qtip="" validation="required" attr="maxlength='7'" style="text-align:left;" colspan="7"/>
	<@sf.empty colspan="6"/>
	<@sf.label path="form.declarant_building" title="Корпус" required=false style="text-align:right;" colspan="6"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_building" qtip="" attr="maxlength='4'" style="text-align:left;" colspan="7"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.declarant_flat" title="Квартира" required=false style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.declarant_flat" qtip="" attr="maxlength='9'" style="text-align:left;" colspan="27"/>
	<@sf.empty colspan="10"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	