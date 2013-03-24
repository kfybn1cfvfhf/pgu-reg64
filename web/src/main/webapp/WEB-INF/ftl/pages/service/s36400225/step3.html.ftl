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
<#import "../customValidation/localOrGlobalPassportSeries.ftl" as localOrGlobalPassportSeries>
<#import "../customValidation/localOrGlobalPassportNumber.ftl" as localOrGlobalPassportNumber>
<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as switchableDeclarantDocumentDocType>
<#import "../customValidation/birthDatePlusNUntilNow.ftl" as birthDatePlusNUntilNow>
<#import "../customValidation/firstDatePlusNUntilLastDatePlusM.ftl" as firstDatePlusNUntilLastDatePlusM>
<#import "../customTemplates/generic/fioFields.ftl" as fioController>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача свидетельства об установлении отцовства по совместному заявлению родителей'>
        <@birthDatePlusNUntilNow.preHead/>
        <@localOrGlobalPassportSeries.preHead/>
        <@localOrGlobalPassportNumber.preHead/>
        <@firstDatePlusNUntilLastDatePlusM.preHead/>
        <@script.scripttag>
            <@birthDatePlusNUntilNow.preScript/>
            <@localOrGlobalPassportSeries.preScript/>
            <@localOrGlobalPassportNumber.preScript/>
            <@firstDatePlusNUntilLastDatePlusM.preScript/>



            <@jquery.onready>
                <@birthDatePlusNUntilNow.onReady/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_father_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_father_birth_date', 'declarant_father_doc_date', '14'"} attrMessages=""/>
                <@birthDatePlusNUntilNow.applyCustomValidation inputid='declarant_mother_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'declarant_mother_birth_date', 'declarant_mother_doc_date', '14'"} attrMessages=""/>

                <@switchableDeclarantDocumentDocType.onReady/>
                <@localOrGlobalPassportSeries.onReady/>
                <@localOrGlobalPassportNumber.onReady/>


                <@action.applyValidationIf 'true' 'declarant_father_doc_type_gr' 'change' 'declarant_father_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_father_doc_type,declarant_father_doc_ser'/>
                <@action.applyValidationIf 'true' 'declarant_father_doc_type_gr' 'change' 'declarant_father_doc_number' '1' 'localOrGlobalPassportNumber' 'declarant_father_doc_type,declarant_father_doc_number'/>
                <@action.applyValidationIf 'true' 'declarant_mother_doc_type_gr' 'change' 'declarant_mother_doc_ser' '1' 'localOrGlobalPassportSeries' 'declarant_mother_doc_type,declarant_mother_doc_ser'/>
                <@action.applyValidationIf 'true' 'declarant_mother_doc_type_gr' 'change' 'declarant_mother_doc_number' '1' 'localOrGlobalPassportNumber' 'declarant_mother_doc_type,declarant_mother_doc_number'/>
                <@commonValidation.clearValidationMessageOnChange ['declarant_father_doc_type_gr','declarant_father_doc_type'], ['declarant_father_doc_ser','declarant_father_doc_number'] />
                <@commonValidation.clearValidationMessageOnChange ['declarant_mother_doc_type_gr','declarant_mother_doc_type'], ['declarant_mother_doc_ser','declarant_mother_doc_number'] />
                <@action.setVisibleByValue 'true' 'declarant_father_doc_type_gr' 'change' 'declarant_father_doc_type_m' '2' 'LBL+EL' />
                <@action.setVisibleByValue 'true' 'declarant_father_doc_type_gr' 'change' 'declarant_father_doc_type' '1' 'LBL+EL'/>
                <@action.setRequiredIf 'true' 'declarant_father_doc_type_gr' 'change' 'declarant_father_doc_type' '1'/>
                <@action.setRequiredIf 'true' 'declarant_father_doc_type_gr' 'change' 'declarant_father_doc_type_m' '2'/>

                <@action.setVisibleByValue 'true' 'declarant_mother_doc_type_gr' 'change' 'declarant_mother_doc_type_m' '2' 'LBL+EL' />
                <@action.setVisibleByValue 'true' 'declarant_mother_doc_type_gr' 'change' 'declarant_mother_doc_type' '1' 'LBL+EL'/>
                <@action.setRequiredIf 'true' 'declarant_mother_doc_type_gr' 'change' 'declarant_mother_doc_type' '1'/>
                <@action.setRequiredIf 'true' 'declarant_mother_doc_type_gr' 'change' 'declarant_mother_doc_type_m' '2'/>

			    <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_birth_date' '2' />
			    <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_citizenship' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_nation' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_type' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_ser' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_number' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_date' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_place' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_type_gr' '2' />
                <@action.setDisabledByValue 'true' 'usluga_form' 'change' 'declarant_mother_doc_type_m' '2' />

                <@fioController.controllCase "declarant_father_last_name" "declarant_father_first_name" "declarant_father_middle_name"/>
                <@fioController.controllCase "declarant_mother_last_name" "declarant_mother_first_name" "declarant_mother_middle_name"/>
                <@firstDatePlusNUntilLastDatePlusM.onReady/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='declarant_father_birth_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'declarant_father_birth_date', 'currentDate', 'edge_date', '-120' , '0'"} attrMessages=""/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='declarant_mother_birth_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'declarant_mother_birth_date', 'currentDate', 'edge_date', '-120' , '0'"} attrMessages=""/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
				<input id="usluga_form" type="hidden" value="${form.usluga_form!""}" />

                <@sf.fldrow class="fieldHidden">
                    <@spring.formHiddenInput path="form.edge_date"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Отец" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="3"/>
						<@sf.label title="Мать" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_father_last_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"40"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_mother_last_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"40"} style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_father_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_mother_first_name" qtip="" validation="cyrillic required maxlength" validationattr={"maxlength":"20"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_father_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_mother_middle_name" qtip="" validation="cyrillic maxlength" validationattr={"maxlength":"20"} style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="4"/>
                </@sf.fldrow>

				<@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_birth_date" title="Дата рождения" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.declarant_father_birth_date"  qtip="" validation="required relativedays checkBirthDateFather" validationattr={"relativedays":"'<=', 0"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_birth_date" title="Дата рождения" required=true style="text-align:right;" colspan="6"/>
					    <@sf.empty colspan="1"/>
						<@sf.datefield path="form.declarant_mother_birth_date"  qtip="" validation="required relativedays checkBirthDateMother" validationattr={"relativedays":"'<=', 0"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant_father_citizenship" dictionaryCode="GRAJD_LS" excludeCodes="193" qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_citizenship" title="Гражданство" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant_mother_citizenship" dictionaryCode="GRAJD_LS" excludeCodes="193" qtip="" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_nation" title="Национальность" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup  path="form.declarant_father_nation" title="Национальность" dictionaryCode='NATIONALITY_LS' excludeCodes="${form.declarant_father_nation_dictionary}" validation="" style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_nation" title="Национальность" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup  path="form.declarant_mother_nation" title="Национальность" dictionaryCode='NATIONALITY_LS' excludeCodes="${form.declarant_mother_nation_dictionary}" validation="" style="text-align:left;" colspan="13"/>
				        <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Документ, удостоверяющий личность" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="3"/>
						<@sf.label title="Документ, удостоверяющий личность" fieldset=true style="text-align:left;" colspan="20"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_father_doc_type_gr" title="Способ заполнения<br>типа документа" required=true style="text-align: right" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.declarant_father_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='vertical' colspan="12"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.declarant_mother_doc_type_gr" title="Способ заполнения<br>типа документа" required=true style="text-align:right;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.declarant_mother_doc_type_gr" staticOpts={'1':'Из справочника','2':'Вручную'} validation="required" mode='vertical' colspan="13"/>
                    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_doc_type" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.declarant_father_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_doc_type" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant_mother_doc_type" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.declarant_father_doc_type_m" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_father_doc_type_m" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':'70'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),."} style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="3"/>
                    <@sf.label path="form.declarant_mother_doc_type_m" title="Тип документа" required=true style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.declarant_mother_doc_type_m" qtip="" validation="cyrillic required maxlength" validationattr={'maxlength':'70'}  style="text-align:left;" colspan="13"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_father_doc_ser" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_doc_ser" title="Серия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_mother_doc_ser" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_doc_number" title="Номер" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_father_doc_number" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_doc_number" title="Номер" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_mother_doc_number" qtip="" validation="required" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.declarant_father_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}"
								validation="required relativedays birthDatePlusNUntilNow" validationattr={"relativedays":"'<=', 0"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_doc_date" title="Дата выдачи" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.declarant_mother_doc_date" maxDate="${currentDate?string('dd.MM.yyyy')}"
								validation="required relativedays birthDatePlusNUntilNow" validationattr={"relativedays":"'<=', 0"}
								style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.declarant_father_doc_place" title="Кем выдан" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_father_doc_place" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"А-Яа-яёЁ0-9\\s.,№()-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),."} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
						<@sf.label path="form.declarant_mother_doc_place" title="Кем выдан" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_mother_doc_place" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\"А-Яа-яёЁ0-9\\s.,№()-]{0,300}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-),."} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>