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
    <@html.head title='Выдача свидетельства об установлении отцовства по совместному заявлению родителей'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place' '2' />
			    <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_country' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_state' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_region' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_settlement_type' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_settlement' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_settlement_type_gr' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_birth_place_settlement_type_m' '2' />

                <#--NEW-->
                <@action.setVisibleByValue 'true' 'father_birth_place_settlement_type_gr' 'change' 'father_birth_place_settlement_type_m' '2' 'LBL+EL' />
                <@action.setVisibleByValue 'true' 'father_birth_place_settlement_type_gr' 'change' 'father_birth_place_settlement_type' '1' 'LBL+EL'/>
                <@action.setRequiredIf 'true' 'father_birth_place_settlement_type_gr' 'change' 'father_birth_place_settlement_type' '1'/>
                <@action.setRequiredIf 'true' 'father_birth_place_settlement_type_gr' 'change' 'father_birth_place_settlement_type_m' '2'/>

                <@action.setVisibleByValue 'true' 'mother_birth_place_settlement_type_gr' 'change' 'mother_birth_place_settlement_type_m' '2' 'LBL+EL' />
                <@action.setVisibleByValue 'true' 'mother_birth_place_settlement_type_gr' 'change' 'mother_birth_place_settlement_type' '1' 'LBL+EL'/>
                <@action.setRequiredIf 'true' 'mother_birth_place_settlement_type_gr' 'change' 'mother_birth_place_settlement_type' '1'/>
                <@action.setRequiredIf 'true' 'mother_birth_place_settlement_type_gr' 'change' 'mother_birth_place_settlement_type_m' '2'/>
                <#--NEW-->
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

				<input id="usluga_form" type="hidden" value="${form.usluga_form!""}" />

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label id="father_birth_place" title="Место рождения отца" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="3"/>
						<@sf.label id="mother_birth_place" title="Место рождения матери" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_birth_place_country" title="Страна" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/><#--<@sf.textfield  path="form.father_birth_place_country" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s]{0,300}$/','maxlength':200} validationMessage={"regexp":"Допускается заполнение кириллицей"} style="text-align:left;" colspan="13"/>-->
                        <@sf.dictionaryLookup path="form.father_birth_place_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="2"/>
						<@sf.label path="form.mother_birth_place_country" title="Страна" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.mother_birth_place_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<#--<@sf.textfield  path="form.mother_birth_place_country" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s]{0,300}$/','maxlength':200} validationMessage={"regexp":"Допускается заполнение кириллицей"} style="text-align:left;" colspan="13"/>-->
						<@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_birth_place_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_birth_place_state" qtip="" validation="required maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="2"/>
						<@sf.label path="form.mother_birth_place_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_birth_place_state" qtip="" validation="required maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_birth_place_region" title="Район" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_birth_place_region" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="2"/>
						<@sf.label path="form.mother_birth_place_region" title="Район" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_birth_place_region" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>

                <#--NEW-->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_birth_place_settlement_type_gr" title="Способ<br/>заполнения<br/>типа населенного<br/>пункта" required=true style="text-align: right" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.father_birth_place_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='vertical' colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.mother_birth_place_settlement_type_gr" title="Способ<br/>заполнения<br/>типа населенного<br/>пункта" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.mother_birth_place_settlement_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='vertical' colspan="12"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_birth_place_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.father_birth_place_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.mother_birth_place_settlement_type" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.mother_birth_place_settlement_type" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_birth_place_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.father_birth_place_settlement_type_m" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'20', 'regexp': '/^[А-Яа-яёЁ0-9\\s./-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы и символов .-/"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.mother_birth_place_settlement_type_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.mother_birth_place_settlement_type_m" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'20', 'regexp': '/^[А-Яа-яёЁ0-9\\s./-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы и символов .-/"}  style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_birth_place_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_birth_place_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="2"/>
						<@sf.label path="form.mother_birth_place_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_birth_place_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>