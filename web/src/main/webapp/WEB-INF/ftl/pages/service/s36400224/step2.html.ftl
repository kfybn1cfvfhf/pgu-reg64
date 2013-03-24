<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customValidation/common.ftl" as commonValidation>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<#import "../customValidation/firstDatePlusNUntilLastDatePlusM.ftl" as firstDatePlusNUntilLastDatePlusM>
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/fioFields.ftl" as fioFields>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация расторжения брака'>
 		<style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@localOrGlobalPassportSeries.preHead/>
        <@localOrGlobalPassportNumber.preHead/>
        <@birthDatePlusNUntilNow.preHead/>
        <@firstDatePlusNUntilLastDatePlusM.preHead/>

        <@script.scripttag>
            <#--var checkDate = function(){-->

                <#--var valDate = Date.fromString($('#merried_akt_date').val(), "dd.mm.yyyy");-->
                <#--var  birthdate_str = $('#declarant_birthdate').val().replace(/-/g,'.');-->
                <#--var curDate = new Date();-->

                <#--if(birthdate_str != ''){// если дата рождения есть в ЛК-->

                    <#--var birthdate = Date.fromString(birthdate_str, "yyyy.mm.dd");-->
                    <#--var birthdate14 = birthdate;-->
                    <#--birthdate14.setFullYear(birthdate.getFullYear()+14)-->

                    <#--if(valDate < birthdate14 || valDate > curDate){// дата вне промеж ДР+14 текДата-->

                        <#--var day = birthdate14.getDate();-->
                        <#--var month = (birthdate14.getMonth()+1);-->

                        <#--if(day.toString().length ==1) day = '0'+day;-->
                        <#--if(month.toString().length == 1) month = '0'+month;-->

                        <#--var periodbegin = day+'.'+month+'.'+birthdate14.getFullYear();-->

                        <#--day = curDate.getDate();-->
                        <#--month = (curDate.getMonth()+1);-->
                        <#--if(day.toString().length ==1) day = '0'+day;-->
                        <#--if(month.toString().length == 1) month = '0'+month;-->

                        <#--var periodend = day+'.'+month+'.'+curDate.getFullYear();-->
                        <#--$.validator.messages["check"] = 'Дата должна принадлежать периоду с '+periodbegin+' по '+periodend;-->
                        <#--return false;-->
                    <#--}-->
                    <#--else {$('#merried_akt_date-err').text('');return true;}-->
                <#--}-->
                <#--else{// если нет даты рождения, то промежуток = текущая минус 106 до текущая-->

                    <#--var date106 = new Date();-->
                    <#--date106.setFullYear(date106.getFullYear()-106);-->

                    <#--if(valDate < date106 || valDate > curDate){-->

                        <#--var day = date106.getDate();-->
                        <#--var month = (date106.getMonth()+1);-->

                        <#--if(day.toString().length == 1) day = '0'+day;-->
                        <#--if(month.toString().length == 1) month = '0'+month;-->

                        <#--var periodbegin = day+'.'+month+'.'+date106.getFullYear();-->

                        <#--day = curDate.getDate();-->
                        <#--month = (curDate.getMonth()+1);-->
                        <#--if(day.toString().length == 1) day = '0'+day;-->
                        <#--if(month.toString().length == 1) month = '0'+month;-->

                        <#--var periodend = day+'.'+month+'.'+curDate.getFullYear();-->
                        <#--$.validator.messages["check"] = 'Дата должна принадлежать периоду с '+periodbegin+' по '+periodend;-->
                        <#--return false;-->
                    <#--}-->
                    <#--else {$('#merried_akt_date-err').text('');return true;}-->
                <#--}-->
            <#--}-->

            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@birthDatePlusNUntilNow.preScript/>
            <@firstDatePlusNUntilLastDatePlusM.preScript/>

            <@jquery.onready>
                <@localOrGlobalPassportSeries.onReady/>
                <@localOrGlobalPassportNumber.onReady/>

                <@fioFields.controllCase 'she_first_name' 'she_last_name_notmerried' 'she_middle_name' />
                <@fioFields.controllCase 'she_last_name' 'she_last_name_merried' 'she_middle_name'/>
                <@fioFields.controllCase 'he_first_name' 'he_last_name_merried' 'he_middle_name'/>
                <@fioFields.controllCase 'he_last_name' 'he_last_name_notmerried' 'he_middle_name'/>

                <@action.linkDestFromList onload='true' destid='aggregate_usluga_type_person_' event='change' sourceids=['aggregate_usluga_type_person','he_doc_type_gr','she_doc_type_gr'] eventDest="change" delimited='~' />

                <@action.applyValidationIf 'true' 'he_doc_type_gr' 'change' 'he_doc_ser' '1' 'localOrGlobalPassportSeries' 'he_doc_type,he_doc_ser'/>
                <@action.applyValidationIf 'true' 'he_doc_type_gr' 'change' 'he_doc_number' '1' 'localOrGlobalPassportNumber' 'he_doc_type,he_doc_number'/>
                <@commonValidation.clearValidationMessageOnChange ['he_doc_type_gr','he_doc_type'], ['he_doc_ser','he_doc_number'] />

                <@action.applyValidationIf 'true' 'she_doc_type_gr' 'change' 'she_doc_ser' '1' 'localOrGlobalPassportSeries' 'she_doc_type,she_doc_ser'/>
                <@action.applyValidationIf 'true' 'she_doc_type_gr' 'change' 'she_doc_number' '1' 'localOrGlobalPassportNumber' 'she_doc_type,she_doc_number'/>
                <@commonValidation.clearValidationMessageOnChange ['she_doc_type_gr','she_doc_type'], ['she_doc_ser','she_doc_number'] />

                <#--<@action.unsetRequiredByField 'true' 'she_doc_type_gr' 'change' 'she_doc_type_m' '1' />
                <@action.setRequiredIf 'true' 'she_doc_type_gr' 'change' 'she_doc_type_m' '2' />
                <@action.unsetRequiredByField 'true' 'she_doc_type_gr' 'change' 'she_doc_type' '2' />
                <@action.setRequiredIf 'true' 'she_doc_type_gr' 'change' 'she_doc_type' '1' />-->


                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_birth_date' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />

                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person_' 'change' 'he_doc_type' '2|2||~1~1,2||2|~1~1,3|||ZJVL_HE~1~1,3|||ZJVL_BOTH~1~1,1|||~1~1,2|2||~1~2,2||2|~1~2,3|||ZJVL_HE~1~2,3|||ZJVL_BOTH~1~2,1|||~1~2' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person_' 'change' 'he_doc_type_m' '2|2||~2~1,2||2|~2~1,3|||ZJVL_HE~2~1,3|||ZJVL_BOTH~2~1,1|||~2~1,2|2||~2~1,2||2|~2~2,3|||ZJVL_HE~2~2,3|||ZJVL_BOTH~2~2,1|||~2~2' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_doc_ser' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_doc_number' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_doc_date' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'he_doc_place' '2|2||,2||2|,3|||ZJVL_HE,3|||ZJVL_BOTH,1|||' />

                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_birth_date' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />

                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person_' 'change' 'she_doc_type' '2|1||~1~1,2||1|~1~1,3|||ZJVL_SHE~1~1,3|||ZJVL_BOTH~1~1,1|||~1~1,2|1||~2~1,2||1|~2~1,3|||ZJVL_SHE~2~1,3|||ZJVL_BOTH~2~1,1|||~2~1' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person_' 'change' 'she_doc_type_m' '2|1||~1~2,2||1|~1~2,3|||ZJVL_SHE~1~2,3|||ZJVL_BOTH~1~2,1|||~1~1,2|1||~1~2,2||1|~2~2,3|||ZJVL_SHE~2~2,3|||ZJVL_BOTH~2~2,1|||~2~2' />

                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_doc_ser' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_doc_number' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_doc_date' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />
                <@action.setRequiredIf 'true' 'aggregate_usluga_type_person' 'change' 'she_doc_place' '2|1||,2||1|,3|||ZJVL_SHE,3|||ZJVL_BOTH,1|||' />


                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='he_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'he_birth_date', 'he_doc_date', '14'"} attrMessages=""/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='she_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'she_birth_date', 'she_doc_date', '14'"} attrMessages=""/>

				<@action.setVisibleByValue 'true' 'he_doc_type_gr' 'change' 'he_doc_type' '1' "LBL+EL"/>
				<@action.setVisibleByValue 'true' 'he_doc_type_gr' 'change' 'he_doc_type_m' '2' "LBL+EL"/>
				<@action.setVisibleByValue 'true' 'she_doc_type_gr' 'change' 'she_doc_type' '1' "LBL+EL"/>
				<@action.setVisibleByValue 'true' 'she_doc_type_gr' 'change' 'she_doc_type_m' '2' "LBL+EL"/>

                <@firstDatePlusNUntilLastDatePlusM.onReady/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='he_birth_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'he_birth_date', 'currentDate', 'merried_akt_date', '-120' , '-16', '0','0'"} attrMessages=""/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='she_birth_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'she_birth_date', 'currentDate', 'merried_akt_date', '-120' , '-16', '0','0'"} attrMessages=""/>

			</@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
                    <@spring.formHiddenInput path="form.declarantBirthDatePlus14Years"/>
                </@sf.fldrow>

                <@sf.fldrow class="fieldHidden">
                    <@spring.formHiddenInput path="form.aggregate_usluga_type_person"/>
                    <@spring.formHiddenInput path="form.aggregate_usluga_type_person_"/>
                    <@spring.formHiddenInput path="form.merried_akt_date"/>

                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Он" style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="3"/>
						<@sf.label fieldset=true title="Она" style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_last_name_merried" title="Фамилия (до расторжения брака)" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.he_last_name_merried" qtip="" validation="cyrillic required maxlength fio_change_he_last_name_merried" validationattr={"maxlength":"40"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_last_name_merried" title="Фамилия (до расторжения брака)" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.she_last_name_merried" qtip="" validation="cyrillic required maxlength fio_change_she_last_name_merried" validationattr={"maxlength":"40"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_last_name_notmerried" title="Фамилия (после расторжения брака)" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.he_last_name_notmerried" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"40"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_last_name_notmerried" title="Фамилия (после расторжения брака)" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.she_last_name_notmerried" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"40"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.he_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_first_name" title="Имя" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.she_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                        <@sf.empty colspan="1"/>
                        <@sf.label path="form.he_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield  path="form.he_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} style="text-align:unknown;" colspan="12"/>
                        <@sf.empty colspan="3"/>
						<@sf.label path="form.she_middle_name" title="Отчество" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.she_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_birth_date" title="Дата рождения" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.he_birth_date"  qtip="" maxDate="${currentDate?string('dd.MM.yyyy')}"
                            <#--validation="relativeyears" validationattr={"relativeyears":"'<=',16"} validationMessage={"relativeyears":"Возраст не должен быть меньше 16-ти лет"}  -->
                        style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_birth_date" title="Дата рождения" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.she_birth_date"  qtip="" maxDate="${currentDate?string('dd.MM.yyyy')}"
                        <#--validation="relativeyears" validationattr={"relativeyears":"'<=',16"} validationMessage={"relativeyears":"Возраст не должен быть меньше 16-ти лет"} -->
                        style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.he_citizenship" dictionaryCode="GRAJD_LS" qtip=""  style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.she_citizenship" dictionaryCode="GRAJD_LS" qtip=""  style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_nation" title="Национальность" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#--<@sf.textfield  path="form.he_nation" qtip=""  style="text-align:unknown;" colspan="12"/>-->
                        <@sf.dictionaryLookup path="form.he_nation" dictionaryCode="NATIONALITY_LS" title="Национальность" excludeCodes="${form.she_nation_dictionary}" qtip="" style="text-align:left;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_nation" title="Национальность" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<#--<@sf.textfield  path="form.she_nation" qtip=""  style="text-align:unknown;" colspan="12"/>-->
                        <@sf.dictionaryLookup path="form.she_nation" dictionaryCode="NATIONALITY_LS" title="Национальность" excludeCodes="${form.he_nation_dictionary}" qtip="" style="text-align:left;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                        <@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Документ, удостоверяющий личность" style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="3"/>
						<@sf.label fieldset=true title="Документ, удостоверяющий личность" style="text-align:left;" colspan="21"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.he_doc_type_gr" title="Способ заполнения типа документа" required=false style="text-align:right;" colspan="8"/>
					<@sf.empty colspan="1"/>
					<@sf.radiogroup path="form.he_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="" style="text-align:unknown;" colspan="12"/>
					<@sf.empty colspan="3"/>
					<@sf.label path="form.she_doc_type_gr" title="Способ заполнения типа документа" required=false style="text-align:right;" colspan="8"/>
					<@sf.empty colspan="1"/>
					<@sf.radiogroup path="form.she_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="" style="text-align:unknown;" colspan="12"/>
					<@sf.empty colspan="2"/>
				</@sf.fldrow>

                <@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.he_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="8"/>
					<@sf.empty colspan="1"/>
					<@sf.dictionaryLookup path="form.he_doc_type" dictionaryCode="DUL_LS" qtip="" validation="" style="text-align:unknown;" colspan="12"/>
					<@sf.empty colspan="3"/>
					<@sf.label path="form.she_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="8"/>
					<@sf.empty colspan="1"/>
					<@sf.dictionaryLookup path="form.she_doc_type" dictionaryCode="DUL_LS" qtip="" validation="" style="text-align:unknown;" colspan="12"/>
					<@sf.empty colspan="2"/>
                </@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.he_doc_type_m" title="Тип документа" required=false style="text-align:right;" colspan="8"/>
					<@sf.empty colspan="1"/>
					<@sf.textfield path="form.he_doc_type_m" validation="cyrillic maxlength" validationattr={"maxlength": "70"} style="text-align:unknown;" colspan="12"/>
					<@sf.empty colspan="3"/>
					<@sf.label path="form.she_doc_type_m" title="Тип документа" required=false style="text-align:right;" colspan="8"/>
					<@sf.empty colspan="1"/>
					<@sf.textfield path="form.she_doc_type_m" validation="cyrillic maxlength" validationattr={"maxlength": "70"} style="text-align:unknown;" colspan="12"/>
					<@sf.empty colspan="2"/>
				</@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_doc_ser" title="Серия" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.he_doc_ser" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_doc_ser" title="Серия" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.she_doc_ser" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_doc_number" title="Номер" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.he_doc_number" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_doc_number" title="Номер" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.she_doc_number" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.he_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="birthDatePlusNUntilNow required" style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.she_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="birthDatePlusNUntilNow required" validationattr={"relativedays":"'<=', 1"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.he_doc_place" title="Кем выдан" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.he_doc_place" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"ЁёА-Яа-я0-9\\s.,№()"-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-),. длиной не более 200"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.she_doc_place" title="Кем выдан" required=false style="text-align:right;" colspan="8"/>
						<@sf.empty colspan="1"/>
						<@sf.textarea path="form.she_doc_place" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"ЁёА-Яа-я0-9\\s.,№()"-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-),. длиной не более 200"} style="text-align:unknown;" colspan="12"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>