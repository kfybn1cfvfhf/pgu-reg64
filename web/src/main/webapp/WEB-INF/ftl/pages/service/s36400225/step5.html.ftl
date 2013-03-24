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
                <@action.linkDestFromList onload='true' destid='usluga_form_agregate' event='change' sourceids=['usluga_form', 'mother_living_street_type'] eventDest="change" delimited='|' />

			    <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_place' '2' />
			    <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_country' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_state' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_region' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_settlement_type' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_settlement' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_street_type' '2' />

                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_house' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_building' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_flat' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_place_m' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_place_gr' '2' />

                <#-- убирать поля ввода названия улицы, если выбран тип улицы "нет улицы" (74 код в справочнике street_type_ls) -->
                <@action.setDisabledByValue 'true' 'father_living_street_type' 'change' 'father_living_street' '74' />
                <@action.unsetRequiredByField 'true' 'father_living_street_type' 'change' 'father_living_street' '74' />

                <@action.setDisabledByValue 'true' 'mother_living_street_type' 'change' 'mother_living_street' '74' />
                <@action.unsetRequiredByField 'true' 'mother_living_street_type' 'change' 'mother_living_street' '74' />
                <#-- -->

                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'mother_living_street' '2' />
                <#--NEW-->
                <@action.setVisibleByValue 'true' 'father_living_place_gr' 'change' 'father_living_place_m' '2' 'LBL+EL' />
                <@action.setVisibleByValue 'true' 'father_living_place_gr' 'change' 'father_living_place' '1' 'LBL+EL'/>
                <@action.setRequiredIf 'true' 'father_living_place_gr' 'change' 'father_living_place' '1'/>
                <@action.setRequiredIf 'true' 'father_living_place_gr' 'change' 'father_living_place_m' '2'/>

                <@action.setVisibleByValue 'true' 'mother_living_place_gr' 'change' 'mother_living_place_m' '2' 'LBL+EL' />
                <@action.setVisibleByValue 'true' 'mother_living_place_gr' 'change' 'mother_living_place' '1' 'LBL+EL'/>
                <@action.setRequiredIf 'true' 'mother_living_place_gr' 'change' 'mother_living_place' '1'/>
                <@action.setRequiredIf 'true' 'mother_living_place_gr' 'change' 'mother_living_place_m' '2'/>
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
                <input id="usluga_form_agregate" type="hidden" />

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label id="father_living_place_label" title="Место жительства отца" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="3"/>
						<@sf.label id="mother_living_place_label" title="Место жительства матери" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_country" title="Страна" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/><#--<@sf.textfield  path="form.father_living_country" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s]{0,300}$/','maxlength':200} validationMessage={"regexp":"Допускается заполнение кириллицей"} style="text-align:left;" colspan="13"/>-->
                        <@sf.dictionaryLookup path="form.father_living_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_country" title="Страна" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/><#--<@sf.textfield  path="form.mother_living_country" qtip="" validation="maxlength required regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s]{0,300}$/','maxlength':200} validationMessage={"regexp":"Допускается заполнение кириллицей"} style="text-align:left;" colspan="13"/>-->
                        <@sf.dictionaryLookup path="form.mother_living_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_state" qtip="" validation="required maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_state" qtip="" validation="required maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_region" title="Район" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_region" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_region" title="Район" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_region" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов (-)"} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>

                <#--NEW-->
            <#--NEW-->
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_living_place_gr" title="Способ<br/>заполнения<br/>типа населенного<br/>пункта" required=true style="text-align: right" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.father_living_place_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='vertical' colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.mother_living_place_gr" title="Способ<br/>заполнения<br/>типа населенного<br/>пункта" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.mother_living_place_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='vertical' colspan="12"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_living_place" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.father_living_place" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.mother_living_place" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.mother_living_place" dictionaryCode="SETTELEMENT_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_living_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.father_living_place_m" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'20', 'regexp': '/^[А-Яа-яёЁ0-9\\s./-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы и символов .-/"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.mother_living_place_m" title="Тип населенного пункта" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.mother_living_place_m" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'20', 'regexp': '/^[А-Яа-яёЁ0-9\\s./-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы и символов .-/"} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_settlement" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,300}$/','maxlength':80}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.father_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.mother_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_street" title="Улица" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_street" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,300}$/','maxlength':33}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_street" title="Улица" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_street" qtip="" validation="maxlength regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9\\s./№()-]{0,300}$/','maxlength':33}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_house" title="Дом" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_house" qtip="" validation="required maxlength" validationattr={'maxlength':'7'} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_house" title="Дом" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_house" qtip="" validation="required maxlength" validationattr={'maxlength':'7'} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_building" title="Корпус" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_building" qtip="" validation="maxlength" validationattr={'maxlength':'4'}  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_building" title="Корпус" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_building" qtip="" validation="maxlength" validationattr={'maxlength':'4'}  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_living_flat" title="Квартира" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_living_flat" qtip="" validation="maxlength" validationattr={'maxlength':'9'} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.mother_living_flat" title="Квартира" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.mother_living_flat" qtip="" validation="maxlength" validationattr={'maxlength':'9'} style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>