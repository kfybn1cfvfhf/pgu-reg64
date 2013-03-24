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
    <@html.head title='Подача электронной заявки на регистрацию брака'>
    <@birthDatePlusNUntilNow.preHead/>
        <@script.scripttag>
        <@birthDatePlusNUntilNow.preScript/>
            <@jquery.onready>
                    <@jquery.descriptorListener 'groom_merried_choose' 'change' 'true'>
                        $('#groom_merried_doc_num')[0].value='';
                        $('#groom_merried_doc_source')[0].value='';
                        $('#groom_merried_doc_date')[0].value='';
                        $('#groom_merried_doc_type')[0].value='' ;
                    </@jquery.descriptorListener>
                    <@jquery.descriptorListener 'bride_merried_choose' 'change' 'true'>
                            $('#bride_merried_doc_num')[0].value='';
                            $('#bride_merried_doc_source')[0].value='';
                            $('#bride_merried_doc_date')[0].value='';
                            $('#bride_merried_doc_type')[0].value='';
                    </@jquery.descriptorListener>

				    <@action.setRequiredIf 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_num' '2' />
                    <@action.setRequiredIf 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_source' '2' />
                    <@action.setRequiredIf 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_date' '2' />
                    <@action.setRequiredIf 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_type' '2' />

                    <@action.setRequiredIf 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_num' '2' />
                    <@action.setRequiredIf 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_source' '2' />
                    <@action.setRequiredIf 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_date' '2' />
                    <@action.setRequiredIf 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_type' '2' />

                    <@action.setDisabledByValue 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_num' '1' />
                    <@action.setDisabledByValue 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_source' '1' />
                    <@action.setDisabledByValue 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_date' '1' />
                    <@action.setDisabledByValue 'true' 'groom_merried_choose' 'change' 'groom_merried_doc_type' '1' />

                    <@action.setDisabledByValue 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_num' '1' />
                    <@action.setDisabledByValue 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_source' '1' />
                    <@action.setDisabledByValue 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_date' '1' />
                    <@action.setDisabledByValue 'true' 'bride_merried_choose' 'change' 'bride_merried_doc_type' '1' />

                    <@birthDatePlusNUntilNow.onReady/>
                    <@birthDatePlusNUntilNow.applyCustomValidation inputid='groom_merried_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'groom_date_of_birth', 'groom_merried_doc_date', '18'"} attrMessages=""/>
                    <@birthDatePlusNUntilNow.applyCustomValidation inputid='bride_merried_doc_date' validation='birthDatePlusNUntilNow' params={"birthDatePlusNUntilNow":"'bride_date_of_birth', 'bride_merried_doc_date', '18'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@spring.formHiddenInput path="form.groom_date_of_birth"/>
                <@spring.formHiddenInput path="form.bride_date_of_birth"/>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.groom_merried_choose" title="Сведения о предыдущем браке" required=true style="text-align: right" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.groom_merried_choose" staticOpts={"1":"В браке не состоял","2":"В браке состоял"} mode='horizontal' validation="required" colspan="13"/>
                    <@sf.empty colspan="4"/>
                    <@sf.label path="form.bride_merried_choose" title="Сведения о предыдущем браке" required=true style="text-align: right" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.radiogroup path="form.bride_merried_choose" staticOpts={"1":"В браке не состояла","2":"В браке состояла"} mode='horizontal' validation="required" colspan="13"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>


				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.statictext class='field-qtip' colspan="20" > Документ, подтверждающий прекращение предыдущего брака</@sf.statictext>
					<@sf.empty colspan="4"/>
					<@sf.statictext class='field-qtip' colspan="20" > Документ, подтверждающий прекращение предыдущего брака</@sf.statictext>
					<@sf.empty colspan="3"/>
				</@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true path="form.he" title="Он" required=false style="text-align:left;" colspan="2"/>
						<@sf.empty colspan="22"/>
						<@sf.label fieldset=true path="form.she" title="Она" required=false style="text-align:left;" colspan="2"/>
						<@sf.empty colspan="21"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.groom_merried_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.groom_merried_doc_type" dictionaryCode="DIVORCE_DOC_TYPE_LS" qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
						<@sf.label path="form.bride_merried_doc_type" title="Тип документа" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.bride_merried_doc_type" dictionaryCode="DIVORCE_DOC_TYPE_LS" qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.groom_merried_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.groom_merried_doc_num" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[0-9]+$/','maxlength':'20'}  validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
						<@sf.label path="form.bride_merried_doc_num" title="№ записи акта" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.bride_merried_doc_num" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[0-9]+$/','maxlength':'20'}  validationMessage={"regexp":"Допустим ввод цифр"} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.groom_merried_doc_date" title="Дата" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.groom_merried_doc_date" qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
						<@sf.label path="form.bride_merried_doc_date" title="Дата" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.bride_merried_doc_date" qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.groom_merried_doc_source" title="Место регистрации" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.groom_merried_doc_source" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s.,/№()-]{0,300}$/','maxlength':'200'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробелов, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="4"/>
						<@sf.label path="form.bride_merried_doc_source" title="Место регистрации" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.bride_merried_doc_source" qtip="" validation="maxlength regexp" validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s.,/№()-]{0,300}$/','maxlength':'200'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробелов, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan="13"/>
					    <@sf.empty colspan="3"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	