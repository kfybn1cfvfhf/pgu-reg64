<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>
<#import "../customValidation/firstDatePlusNUntilLastDatePlusM.ftl" as firstDatePlusNUntilLastDatePlusM>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки об установлении отцовства'>
    <@firstDatePlusNUntilLastDatePlusM.preHead/>
	<@script.scripttag>
        <@firstDatePlusNUntilLastDatePlusM.preScript/>
		<@jquery.onready>

            <@action.setVisibleByValue 'true' 'child_birth_place_settlement_type_gr' 'change' 'child_birth_place_settlement_type' '1' />
            <@action.setVisibleByValue 'true' 'child_birth_place_settlement_type_gr' 'change' 'child_birth_place_settlement_type_m' '2' />

            <@fioFields.controllCase 'child_last_name' 'child_first_name' 'child_middle_name'/>

            <@firstDatePlusNUntilLastDatePlusM.onReady/>
            <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='child_birthday' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'child_birthday', 'declarant_birthdate', 'currentDate', '18' , '0', '-106','0'"} attrMessages=""/>
		</@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>
<@sf.serviceStepForm >
				
<@sf.fldrow>
    <@spring.formHiddenInput path="form.declarant_birthdate"/>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Сведения о ребенке до установления отцовства" required=false style="text-align:left;" colspan="26"/>
	<@sf.empty colspan="21"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_last_name" title="Фамилия" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.child_last_name" attr='maxlength="40"' qtip="" validation="required regexp" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,40}$/", "message": "Буквы кириллицы, тире"} style="text-align:left;" colspan="12"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_first_name" title="Имя" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.child_first_name" attr='maxlength="20"' qtip="" validation="required regexp" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,20}$/", "message": "Буквы кириллицы, тире"} style="text-align:left;" colspan="12"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_middle_name" title="Отчество" required=false style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.textfield  path="form.child_middle_name" attr='maxlength="20"' validation="regexp" validationattr={"regexp":"/^[ЁёА-Яа-я-\\s]{0,20}$/", "message": "Буквы кириллицы, тире"}  qtip="" style="text-align:left;" colspan="12"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_birthday" title="Дата рождения" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>																					<#-- "'<', 1" тек. день не включен -->
	<@sf.datefield path="form.child_birthday"  qtip="" validation="required" style="text-align:left;" colspan="12"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label fieldset=true title="Место рождения" required=false style="text-align:left;" colspan="22"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_birth_place_country" title="Страна" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.dictionaryLookup path="form.child_birth_place_country" dictionaryCode="COUNTRY_LS" validation="required" qtip="" style="text-align:left;" colspan="12"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
    <@sf.empty colspan="1"/>
    <@sf.label path="form.child_birth_place_state" title="Область (край, респ.)" required=false style="text-align:right;" colspan="9"/>
    <@sf.empty colspan="1"/>
    <@sf.textfield  path="form.child_birth_place_state" validation="regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} qtip=""  style="text-align:left;" colspan="12"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>



<@sf.fldrow>
    <@sf.empty colspan="1"/>
    <@sf.label path="form.child_birth_place_region" title="Район" required=false style="text-align:right;" colspan="9"/>
    <@sf.empty colspan="1"/>
    <@sf.textfield  path="form.child_birth_place_region" qtip=""  validation="regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="12"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<@sf.label path="form.child_birth_place_settlement_type_gr" title="Способ задания типа населенного пункта" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
    <@sf.radiogroup path="form.child_birth_place_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" colspan="12"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
	<@sf.empty colspan="1"/>
    <@sf.label path="form.child_birth_place_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
	<@sf.dictionaryLookup path="form.child_birth_place_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="12"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>
<@sf.fldrow>
	<@sf.empty colspan="1"/>
    <@sf.label path="form.child_birth_place_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="9"/>
	<@sf.empty colspan="1"/>
    <@sf.textfield  path="form.child_birth_place_settlement_type_m" qtip="" validation="required" attr='maxlength="20"' style="text-align:left;" colspan="12"/>
	<@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
    <@sf.empty colspan="1"/>
    <@sf.label path="form.child_birth_place_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="9"/>
    <@sf.empty colspan="1"/>
    <@sf.textfield  path="form.child_birth_place_settlement" qtip="" validation="regexp required" attr='maxlength="80"' validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="12"/>
    <@sf.empty colspan="25"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	