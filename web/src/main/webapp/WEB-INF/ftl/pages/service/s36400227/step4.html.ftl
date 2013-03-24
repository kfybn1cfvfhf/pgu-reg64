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
    <@html.head title='Подача электронной заявки на выдачу свидетельства о перемене имени'>
        <@script.scripttag>
            <@jquery.onready>
			    <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
                <@action.unsetRequiredByField 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
                <#--<@action.setValueByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' '' />-->

                <@action.setRequiredIf 'true' 'declarant_settlement_type_gr' 'change' 'declarant_settlement_type' '1' />
                <@action.setRequiredIf 'true' 'declarant_settlement_type_gr' 'change' 'declarant_settlement_type_m' '2'/>
                <@action.unsetRequiredByField 'true' 'declarant_settlement_type_gr' 'change' 'declarant_settlement_type' '2' />
                <@action.unsetRequiredByField 'true' 'declarant_settlement_type_gr' 'change' 'declarant_settlement_type_m' '1'/>
                <@action.setVisibleByValue  'true' 'declarant_settlement_type_gr' 'change' 'declarant_settlement_type' "1" />
                <@action.setVisibleByValue  'true' 'declarant_settlement_type_gr' 'change' 'declarant_settlement_type_m' "2"/>
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
						<@sf.label title="Место жительства заявителя" fieldset=true style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_country" dictionaryCode="COUNTRY_LS" qtip="" style="text-align:unknown;" colspan="24"/>
                    <@sf.empty colspan="14"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_state" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[А-Яа-яЁё\\s()-]*$/','maxlength':'80'} attr='maxlength="300"' validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:unknown;" colspan="24"/>
						<@sf.empty colspan="14"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_region" title="Район" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_region" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яЁё\\s()-]*$/','maxlength':'80'} attr='maxlength="200"' validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:unknown;" colspan="24"/>
						<@sf.empty colspan="14"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_settlement_type_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.declarant_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="20"/>
                    <@sf.empty colspan="18"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" validation="required" qtip=""  style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
                    <@sf.textfield path="form.declarant_settlement_type_m"  validation="maxlength regexp required" validationattr={'maxlength':20, 'regexp':'/^[\\|\\"А-Яа-я0-9\\s./-]{0,20}$/', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} qtip=""  style="text-align:left;" colspan="12"/>
                        <@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яЁё0-9\\s./№()-]{0,300}$/','maxlength':'80'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="24"/>
						<@sf.empty colspan="14"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_street" title="Улица" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_street" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яЁё0-9\\s./№()-]{0,50}$/','maxlength':'33'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="24"/>
						<@sf.empty colspan="14"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_house" title="Дом" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_house" qtip="" validation="maxlength" validationattr={'maxlength':'7'} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_building" title="Корпус" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_building" qtip="" validation="maxlength" validationattr={'maxlength':'4'} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_flat" title="Квартира" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_flat" qtip="" validation="maxlength" validationattr={'maxlength':'9'} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>