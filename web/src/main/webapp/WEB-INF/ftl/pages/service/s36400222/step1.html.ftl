<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../utils.ftl" as utils>
<#import "util.ftl" as util>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о рождении'>
        <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>


        <@script.scripttag>
            <#include "../customValidation/dateValidation.js" />

            <@utils.setZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp'}/>

            <@jquery.onready>

                $.validator.addMethod('checkDateField',function(value, params){return checkDateField(value,"declarant_birthdate,-106,14,0")}, validateMessage);

                <@utils.clearZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp','clearButton':'id_agency_in'}/>

                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'declarant' '1' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'father_label' '1' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'father_cause_doc_type' '1' />
                <#--<@action.setVisibleByValue 'true' 'usluga_form' 'change' 'father_cause_doc_source_gr' '1' />-->
                <@action.linkDestFromList onload='true' destid='arg_usluga_type' event='change' sourceids=['usluga_form', 'father_cause_doc_type'] eventDest="change" delimited='|' />


                <@action.setVisibleByValue 'true' 'father_cause_doc_type' 'change' 'father_cause_doc_num' '1,2' />
                <@action.setVisibleByValue 'true' 'father_cause_doc_type' 'change' 'father_cause_doc_date' '1,2' />
                <@action.setRequiredIf 'true' 'father_cause_doc_type' 'change' 'father_cause_doc_num' '1,2' />
                <@action.setRequiredIf 'true' 'father_cause_doc_type' 'change' 'father_cause_doc_date' '1,2' />

                <@action.setVisibleByValue 'true' 'father_cause_doc_type' 'change' 'father_cause_doc_source_gr' '1,2' />
                <@action.setVisibleByValue 'true' 'father_cause_doc_type' 'change' 'father_cause_doc_source_list' '1,2' />

                <@action.setVisibleByValue 'true' 'hintAgr' 'change' 'hint' '1|1,1|2' />
                <@action.setVisibleByValue 'true' 'father_cause_doc_source_gr' 'change' 'father_cause_doc_source_list' '1' />
                <@action.setVisibleByValue 'true' 'father_cause_doc_source_gr' 'change' 'father_cause_doc_source_info' '1' />
                <@action.setVisibleByValue 'true' 'father_cause_doc_source_gr' 'change' 'father_cause_doc_source' '2' />

                <@action.setRequiredIf 'true' 'father_cause_doc_source_gr' 'change' 'father_cause_doc_source' '2' />

                <@action.setRequiredIf 'true' 'arg_usluga_type' 'change' 'father_cause_doc_num' '1|2' />
                <@action.setRequiredIf 'true' 'arg_usluga_type' 'change' 'father_cause_doc_date' '1|2' />
                <@action.setRequiredIf 'true' 'arg_usluga_type' 'change' 'father_cause_doc_source' '1|2' />
                <@action.setRequiredIf 'true' 'arg_usluga_type' 'change' 'father_cause_doc_source_gr' '1,2' />

                <@action.setRequiredIf 'true' 'usluga_form' 'change' 'declarant' '1' />
                <@action.setRequiredIf 'true' 'usluga_form' 'change' 'father_cause_doc_type' '1' />
                <@action.setRequiredIf 'true' 'usluga_form' 'change' 'father_cause_doc_num' '1' />
                <@action.setRequiredIf 'true' 'usluga_form' 'change' 'father_cause_doc_date' '1' />

                <@action.setRequiredIf 'true' 'usluga_form' 'change' 'father_cause_doc_source_gr' '1' />

                <@action.linkDestFromList onload='true' destid='hintAgr' event='change' sourceids=['father_cause_doc_source_gr','father_cause_doc_type'] eventDest='change' delimited='|' />



            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>

                <@sf.fldrow>
                    <input type="hidden" id="arg_usluga_type"/>
                    <input type="hidden" id="message"/>
                    <@spring.formHiddenInput path="form.agency_id"/>
                    <@spring.formHiddenInput path="form.adresZags"/>
                    <@spring.formHiddenInput path="form.telephMain"/>
                    <@spring.formHiddenInput path="form.adresHttp"/>

                    <@spring.formHiddenInput path="form.declarant_birthdate"/>


                    <@spring.formHiddenInput path="form.hintAgr"/>

                    <@sf.empty colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                <#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                    <@sf.label path="form.id_agency_in" title="ЗАГС обращения" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.customLookup  path="form.id_agency_in" controller='Nahodka_Zagses' resultCallbacks=['setZagsDetailsInfo'] optionsMap={"okato":"${form['okato']}", "regionMappingType":"${form['regionMappingType']}","method":"getExtZagsesByGroup","typeAZ":"AZ_RO"}  qtip="" validation="required" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- 1. Регистрация рождения по заявлению родителей
                        2. Регистрация рождения по заявлению одинокой матери
                        Если выбрано значение 2, то поле "Заявитель" не отображается-->
                        <@sf.label path="form.usluga_form" title="Форма заявления" required=true style="text-align:right;" colspan="10"/>
                        <@sf.empty colspan="1"/>
                        <#-- 1. Регистрация рождения по заявлению родителей
                        2. Регистрация рождения по заявлению одинокой матери
                        Если выбрано значение 2, то поле "Заявитель" не отображается-->
                        <@sf.staticLookup path="form.usluga_form" staticData={"1":"Регистрация рождения по заявлению родителей","2":"Регистрация рождения по заявлению одинокой матери"} qtip="" validation="required" style="text-align:unknown;" colspan="35"/>
                        <@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant" title="Заявитель" required=true style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant" dictionaryCode="BIRTH_APPLICANT_TYPES_LS"  qtip="" style="text-align:left;" colspan="35"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true id="father_label" title="Сведения об отце указываются на основании" style="text-align:left;" colspan="46"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Значения:
                        1. Свидетельство о заключении брака
                        2. Свидетельство об установлении отцовства
                        3. Отсутствует-->
                        <@sf.label path="form.father_cause_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="10"/>
                        <@sf.empty colspan="1"/>
                        <#-- Значения:
                        1. Свидетельство о заключении брака
                        2. Свидетельство об установлении отцовства
                        3. Отсутствует-->
                        <@sf.staticLookup path="form.father_cause_doc_type" staticData={"1":"Свидетельство о заключении брака","2":"Свидетельство об установлении отцовства","3":"Отсутствует"} qtip=""  style="text-align:unknown;" colspan="35"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_cause_doc_num" title="Запись Акта №" required=false style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_cause_doc_num" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[0-9]+$/','maxlength':'20'}  validationMessage={"regexp":"Допустим ввод цифр"}  style="text-align:unknown;" colspan="15"/>
						<@sf.empty colspan="20"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_cause_doc_date" title="Дата" required=false style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>

						<@sf.datefield path="form.father_cause_doc_date" validation="checkDateField"   qtip=""  style="text-align:unknown;" colspan="15"/>

						<@sf.empty colspan="20"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_cause_doc_source_gr" title="Способ заполнения<br> наименования органа<br> ЗАГС" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.father_cause_doc_source_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <#--<@util.settlement  field='father_cause_doc_source_gr' labelTitle="Способ заполнения наименования органа ЗАГС" title="Тип документа" dictionary="DUL_LS"-->
                <#--validation="cyrillic maxlength" validationattr={'maxlength':'70'} validationmessage='' labelCollspan=6 rightCollspan=27/>-->

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.father_cause_doc_source" title="Наименование<br/> органа ЗАГС" required=false style="text-align:right;" colspan="10"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.father_cause_doc_source" qtip="" validation="maxlength regexp" validationattr={"regexp":"/^[-\\|\\sА-Яа-яёЁ0-9\"№\\(\\)\\.,\\/]*$/",'maxlength':'200'} validationMessage={"regexp":"Допустим ввод кириллицы, пробела,  цифр и символов \"№(-)/|."} style="text-align:unknown;" colspan="35"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="12"/>
					<#--<@sf.label id="father_cause_doc_source_info" fieldset=true colspan="46" title="<html>-->
					<#--Справочник содержит перечень ЗАГСов субъекта РФ,  в котором оказывается данная услуга. <br>-->
					<#--Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение-->
					<#--в способе заполнения наименования органа ЗАГС.</html>" style="text-align: left" />-->
					<@sf.statictext attr='id="hint"' class='field-qtip' colspan="35" >Справочник содержит перечень ЗАГСов субъекта РФ, в котором оказывается данная услуга. <br />
										Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение
										в способе заполнения наименования органа ЗАГС.</@sf.statictext>
					<@sf.empty colspan="1"/>
				</@sf.fldrow>

				<#--<@sf.statictext class='field-qtip' colspan="20" > Документ, подтверждающий прекращение предыдущего брака</@sf.statictext>-->

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.father_cause_doc_source_list" title="Наименование<br/> органа ЗАГС" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.customLookup  path="form.father_cause_doc_source_list" controller='Nahodka_Zagses' resultCallbacks=['setZagsDetailsInfo'] optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}"}) qtip="" validation="required" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	