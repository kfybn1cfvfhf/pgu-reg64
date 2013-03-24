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
    <@html.head title='Подача электронной заявки на выдачу свидетельства о перемене имени'>
        <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                <@birthDatePlusNUntilNow.onReady/>
                <@action.setRequiredIf 'true' 'declarant_birth_place_settlement_type_gr' 'change' 'declarant_birth_place_settlement_type' '1' />
                <@action.setRequiredIf 'true' 'declarant_birth_place_settlement_type_gr' 'change' 'declarant_birth_place_settlement_type_m' '2'/>
                <@action.unsetRequiredByField 'true' 'declarant_birth_place_settlement_type_gr' 'change' 'declarant_birth_place_settlement_type' '2' />
                <@action.unsetRequiredByField 'true' 'declarant_birth_place_settlement_type_gr' 'change' 'declarant_birth_place_settlement_type_m' '1'/>
                <@action.setVisibleByValue  'true' 'declarant_birth_place_settlement_type_gr' 'change' 'declarant_birth_place_settlement_type' "1" />
                <@action.setVisibleByValue  'true' 'declarant_birth_place_settlement_type_gr' 'change' 'declarant_birth_place_settlement_type_m' "2"/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='birth_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_birth_date', 'birth_doc_date', '0'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
                    <@spring.formHiddenInput path="form.declarant_birth_date"/>
                    <@sf.empty colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="№ актовой записи" fieldset=true style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.birth_doc_num" title="Номер" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.birth_doc_num"  qtip="" validation="maxlength regexp required" deprecatedSings=true attr='maxlength="200"' validationattr={'regexp':'/^[0-9]+$/','maxlength':'20'} validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.birth_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.birth_doc_date" qtip="" validation="required relativedays birthDatePlusNUntilNow" maxDate=currentDate?string('dd.MM.yyyy') validationattr={"relativedays":"'<=',0"} validationMessage={"relativedays":"Дата выдачи записи не должна быть больше текущей даты"} style="text-align:unknown;" colspan="6"/>
						<@sf.empty colspan="32"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.birth_doc_org" title="Наименование организации, выдавшей документ" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.birth_doc_org" qtip="" validation="maxlength regexp required" deprecatedSings=true validationattr={'regexp':'/^[\\|\\"А-Яа-яЁё0-9\\s.,/\"№()-]*$/','maxlength':'200'} attr='maxlength="200"' validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:unknown;" colspan="19"/>
						<@sf.empty colspan="19"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Место рождения" fieldset=true style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.empty colspan="1"/>
                        <@sf.label path="form.declarant_birth_place_country" title="Страна" required=true style="text-align:right;" colspan="8"/>
                        <@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.declarant_birth_place_country" dictionaryCode="COUNTRY_LS" qtip="" style="text-align:unknown;" colspan="12"/>
                        <@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_birth_place_state" title="Область (край, респ.)" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_birth_place_state" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яЁё\\s()-]*$/','maxlength':'80'} attr='maxlength="200"'  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:unknown;" colspan="19"/>
						<@sf.empty colspan="19"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_birth_place_region" title="Район" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_birth_place_region" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яЁё\\s()-]*$/','maxlength':'80'} attr='maxlength="200"' validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:unknown;" colspan="19"/>
						<@sf.empty colspan="19"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_birth_place_settlement_type_gr" title="Способ заполнения типа населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.declarant_birth_place_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="20"/>
                    <@sf.empty colspan="18"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_birth_place_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_birth_place_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" validation="required" qtip=""  style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="19"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_birth_place_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield path="form.declarant_birth_place_settlement_type_m"  validation="maxlength regexp required" validationattr={'maxlength':20, 'regexp':'/^[\\|\\"А-Яа-я0-9\\s./-]{0,20}$/', "message":"Допустим ввод кириллицы, цифр и символов №(-)/|."} qtip=""  style="text-align:left;" colspan="12"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_birth_place_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_birth_place_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яЁё0-9\\s./№()-]{0,300}$/','maxlength':'80'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="19"/>
						<@sf.empty colspan="19"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>