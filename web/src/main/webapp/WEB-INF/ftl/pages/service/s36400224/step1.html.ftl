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
<#import "../customValidation/common.ftl" as commonValidation>
<#--<#import "../customTemplates/generic/issueDateField.ftl" as issueDate>-->
<#import "../customValidation/firstDatePlusNUntilLastDatePlusM.ftl" as firstDatePlusNUntilLastDatePlusM>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Регистрация расторжения брака'>
		<style type="text/css">
			.form-body {
				width: 100%;
			}
		</style>
        <@firstDatePlusNUntilLastDatePlusM.preHead/>
        <@script.scripttag>

        var checkDate = function(){

            var valDate = Date.fromString($('#merried_akt_date').val(), "dd.mm.yyyy");
            var  birthdate_str = $('#declarant_birthdate').val().replace(/-/g,'.');
            var curDate = new Date();

            if(birthdate_str != ''){// если дата рождения есть в ЛК

                var birthdate = Date.fromString(birthdate_str, "yyyy.mm.dd");
                var birthdate16 = birthdate;
                birthdate16.setFullYear(birthdate.getFullYear()+16)

                if(valDate < birthdate16 || valDate > curDate){// дата вне промеж ДР+16 текДата

                    var day = birthdate16.getDate();
                    var month = (birthdate16.getMonth()+1);

                    if(day.toString().length ==1) day = '0'+day;
                    if(month.toString().length == 1) month = '0'+month;

                    var periodbegin = day+'.'+month+'.'+birthdate16.getFullYear();

                    day = curDate.getDate();
                    month = (curDate.getMonth()+1);
                    if(day.toString().length ==1) day = '0'+day;
                    if(month.toString().length == 1) month = '0'+month;

                    var periodend = day+'.'+month+'.'+curDate.getFullYear();
                    $.validator.messages["check"] = 'Дата должна принадлежать периоду с '+periodbegin+' по '+periodend;
                    return false;
                }
                else {$('#merried_akt_date-err').text('');return true;}
            }
            else{// если нет даты рождения, то промежуток = текущая минус 106 до текущая

                    var date106 = new Date();
                    date106.setFullYear(date106.getFullYear()-104);

                    if(valDate < date106 || valDate > curDate){

                        var day = date106.getDate();
                        var month = (date106.getMonth()+1);

                        if(day.toString().length == 1) day = '0'+day;
                        if(month.toString().length == 1) month = '0'+month;

                        var periodbegin = day+'.'+month+'.'+date106.getFullYear();

                        day = curDate.getDate();
                        month = (curDate.getMonth()+1);
                        if(day.toString().length == 1) day = '0'+day;
                        if(month.toString().length == 1) month = '0'+month;

                        var periodend = day+'.'+month+'.'+curDate.getFullYear();
                        //$('#merried_akt_date-err').text('Дата должна принадлежать периоду с '+periodbegin+' по '+periodend);
                        $.validator.messages["check"] = 'Дата должна принадлежать периоду с '+periodbegin+' по '+periodend;
                        return false;
                    }
                    else {$('#merried_akt_date-err').text('');return true;}
                }
        }

        <@firstDatePlusNUntilLastDatePlusM.preScript/>
        <@utils.setZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp'} classVisible='visibleInfo'/>

            <@jquery.onready>

                <@utils.clearZagsDetailsInfo fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp','clearButton':'id_agency_in'}/>

                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'reason' '2,3' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'reason_doc' '2' />

                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'name_law' '3' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'declarant' '3' />
                <@action.setVisibleByValue 'true' 'usluga_form' 'change' 'decision_law_date' '3' />

                <@action.linkDestFromList onload='true' destid='arg_usluga_type' event='change' sourceids=['usluga_form', 'reason_doc'] eventDest="change" delimited='|' />
                <@action.linkDestFromList onload='true' destid='aggregate_usluga_type_person' event='change' sourceids=['usluga_form', 'decision_to_who', 'priznan_to_who', 'declarant'] eventDest="change" delimited='|' />

                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'court_name' '2|1' />
                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'decision_date' '2|1' />
                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'decision_type' '2|1' />
                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'decision_to_who' '2|1' />

                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'priznan_law' '2|2' />
                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'priznan_date' '2|2' />
                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'priznan_to_who' '2|2' />
                <@action.setVisibleByValue 'true' 'arg_usluga_type' 'change' 'srok' '2|2' />
                <@action.applyValidationIf 'true' 'arg_usluga_type' 'change' 'srok' '2|2' 'min' '37'/>

				<@action.setVisibleByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list' '1' />
				<@action.setVisibleByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags' '2' />
				<@action.setVisibleByValue 'true' 'merried_akt_zags_gr' 'change' 'merried_akt_zags_list_info' '1' />

                <@jquery.descriptorListener 'id_agency_in' 'change' 'true' >
                 var val= $('#id_agency_in').val().split('#');
                 if(val.length==4)
                 {
                     var add={idZagsOnly:val[0],telephMain:val[1], adresHttp:val[2],addrZags:val[3]};
                     var req={additional:add} ;
                     setZagsDetailsInfo([req]);
                 }
                </@jquery.descriptorListener>
                <@validation.addvalidatormethod false 'check' 'checkDate()' '' />

                <@firstDatePlusNUntilLastDatePlusM.onReady/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='decision_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'decision_date', 'merried_akt_date', 'currentDate', '0' , '0', '-106','0'"} attrMessages=""/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='priznan_date' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'priznan_date', 'merried_akt_date', 'currentDate', '0' , '0', '-106','0'"} attrMessages=""/>

            </@jquery.onready>
       </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <input type="hidden" id="arg_usluga_type"/>
            <input type="hidden" id="declarant_birthdate" value="${form.declarant_birthdate?string("yyyy-MM-dd")!""}"/>
            <@sf.serviceStepForm >

				<#assign colspans = {
					"label":	"8",
					"right":	"10"
				} />

                <@sf.fldrow class="fieldHidden">
                    <@spring.formHiddenInput path="form.aggregate_usluga_type_person"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                        <@sf.label path="form.id_agency_in" title="ЗАГС обращения" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- lookup Запрос к веб-сервису списка ЗАГСов-->
                        <@sf.customLookup  path="form.id_agency_in" controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}", "method": "36400224","typeAZ":"AZ_RB"}) resultCallbacks=['setZagsDetailsInfo'] qtip="" validation="required" style="text-align:left;" colspan="28"/>
					   <@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow class="visibleInfo" style="display:none;">
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.adresZags" title="${form.adresZags!''}" required=false style="text-align:left;" colspan="28"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

                <@sf.fldrow class="visibleInfo" style="display:none;">
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.telephMain" title="${form.telephMainLabel!''}" required=false style="text-align:left;" colspan="28"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

                <@sf.fldrow class="visibleInfo" style="display:none;">
                    <@sf.empty colspan="10"/>
                    <@sf.label path="form.adresHttp" title="${form.adresHttpLabel!''}" required=false style="text-align:left;" colspan="28"/>
                    <@sf.empty colspan="10"/>
                </@sf.fldrow>

       <@sf.fldrow style="display:none;">
				<@sf.empty colspan="1"/>
				<@sf.label path="form.agency_id" title="Информация о ЗАГСе" required=false style="text-align:right;" colspan="10"/>
				<@sf.empty colspan="1"/>
				<@sf.textarea path="form.agency_id" attr="readonly='true'" qtip=""  style="text-align:left;" colspan="32"/>
                <@sf.empty colspan="4"/>
        </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Значения:
                        1. Расторжение брака по взаимному согласию супругов
                        2. Расторжение брака по заявлению одного из супругов
                        3. Расторжение брака на основании решения суда-->
                        <@sf.label path="form.usluga_form" title="Форма заявления" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Значения:
                        1. Расторжение брака по взаимному согласию супругов
                        2. Расторжение брака по заявлению одного из супругов
                        3. Расторжение брака на основании решения суда-->
                        <@sf.staticLookup path="form.usluga_form" staticData={"1":"Расторжение брака по взаимному согласию супругов","2":"Расторжение брака по заявлению одного из супругов", "3":"Расторжение брака на основании решения суда"} qtip="" validation="required" style="text-align:unknown;" colspan="28"/>
					   <@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Реквизиты записи акта о заключении расторгаемого брака" fieldset=true style="text-align:left;" colspan="21"/>
                     <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.merried_akt_num" title="Запись Акта №" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.merried_akt_num" qtip="" validation="required maxlength regexp" validationattr={'regexp':'/^[0-9]+$/','maxlength':20, "message":"Допустим ввод цифр длинной не более 20"} style="text-align:unknown;" colspan="12"/>
						 <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.merried_akt_date" title="Дата" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<@sf.datefield path="form.merried_akt_date" minDate="${form.declarant_birthdate?string('dd.MM.yyyy')!''}" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required relativedays check" validationattr={"relativedays":"'<=', 0"} style="text-align:unknown;" colspan="12"/>
						 <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<@sf.label path="form.merried_akt_zags_gr" title="Способ заполнения наименования органа ЗАГС" required=true style="text-align: right" colspan=colspans["label"]/>
					<@sf.empty colspan="1"/>
					<@sf.radiogroup path="form.merried_akt_zags_gr" staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="28"/>
					<@sf.emptyNoWidth colspan=colspans["right"]/>
				</@sf.fldrow>

                    <@sf.fldrow>
					<@sf.empty colspan="10"/>
					<#--<@sf.label id="father_cause_doc_source_info" fieldset=true colspan="46" title="<html>-->
					<#--Справочник содержит перечень ЗАГСов субъекта РФ,  в котором оказывается данная услуга. <br>-->
					<#--Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение-->
					<#--в способе заполнения наименования органа ЗАГС.</html>" style="text-align: left" />-->

                    <@sf.label id="merried_akt_zags_list_info" title="Справочник содержит перечень ЗАГСов субъекта РФ,  в котором оказывается данная услуга. <br>Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение в способе заполнения наименования органа ЗАГС." style="text-align:left;" colspan="28"/>

					<#--<@sf.statictext attr='id="hint"' class='field-qtip' colspan="28" >Справочник содержит перечень ЗАГСов субъекта РФ, в котором оказывается данная услуга.-->
										<#--Если справочник не содержит нужного ЗАГСа, внесите его вручную, выбрав соответствующее значение-->
										<#--в способе заполнения наименования органа ЗАГС.</@sf.statictext>-->
					<@sf.empty colspan="10"/>
				</@sf.fldrow>



                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.merried_akt_zags" title="Наименование органа ЗАГС" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.merried_akt_zags" qtip="" validation="required regexp  maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s.,"/№()-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,. длинной не более 200"} style="text-align:unknown;" colspan="28"/>
						<@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>

				<@sf.fldrow>
					<@sf.empty colspan="1"/>
					<#-- lookup Запрос к веб-сервису списка ЗАГСов-->
					<@sf.label path="form.merried_akt_zags_list" title="Наименование органа ЗАГС" required=true style="text-align:right;" colspan=colspans["label"]/>
					<@sf.empty colspan="1"/>
					<#-- lookup Запрос к веб-сервису списка ЗАГСов-->
					<@sf.customLookup  path="form.merried_akt_zags_list" controller='Nahodka_Zagses' optionsMap=clu.createOptionsMap(form, {"userSelectedRegion":"${userSelectedRegion!''}"}) qtip="" validation="required" style="text-align:left;" colspan="28"/>
					<@sf.emptyNoWidth colspan=colspans["right"]/>
				</@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label id="reason" title="Основание для расторжения брака" fieldset=true style="text-align:left;" colspan="21"/>
                     <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Значения:
                        1. Решение суда о признании второго супруга недееспособным или безвестно отсутствующим
                        2. Решение суда об осуждении второго супруга к лишению свободы на срок свыше трёх лет
                        Отображается, если Форма заявления = 2-->
                        <@sf.label path="form.reason_doc" title="Тип документа" required=true style="text-align:right;" colspan=colspans["label"]/>
                        <@sf.empty colspan="1"/>
                        <#-- Значения:
                        1. Решение суда о признании второго супруга недееспособным или безвестно отсутствующим
                        2. Решение суда об осуждении второго супруга к лишению свободы на срок свыше трёх лет
                        Отображается, если Форма заявления = 2-->
                        <@sf.staticLookup  path="form.reason_doc" staticData={"1":" Решение суда о признании второго супруга недееспособным или безвестно отсутствующим","2":"Приговор суда об осуждении второго супруга к лишению свободы на срок свыше трёх лет"} qtip="" validation="required" style="text-align:unknown;" colspan="28"/>
                       <@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.label path="form.court_name" title="Наименование суда" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.textarea path="form.court_name" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s.,"/№()-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,. длинной не более 200"} style="text-align:unknown;" colspan="28"/>
						<@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.label path="form.decision_date" title="Дата решения" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.datefield path="form.decision_date" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>

                <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- 1. Супруга  2. Супруги Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.label path="form.decision_to_who" title="Решение суда в отношении" required=true style="text-align:right;" colspan=colspans["label"]/>
                        <@sf.empty colspan="1"/>
					    <@sf.radiogroup path="form.decision_to_who" staticOpts={'1':'Супруга','2':'Супруги'} mode='horizontal' validation="required" colspan="12"/>
                        <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- PRIZNANRB_DECISION_TYPE
                        1. NONEPRIZNAN Не указано
                        2. MISSING Решение о признании второго супруга безвестно отсутствующим
                        3. DISABLE Решение о признании второго супруга недееспособным
                        Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.label path="form.decision_type" title="Тип решения" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
                        <#-- PRIZNANRB_DECISION_TYPE
                        1. NONEPRIZNAN Не указано
                        2. MISSING Решение о признании второго супруга безвестно отсутствующим
                        3. DISABLE Решение о признании второго супруга недееспособным
                        Отображается, если Форма заявления = 2 и Тип документа = 1-->
                        <@sf.dictionaryLookup path="form.decision_type" dictionaryCode="PRIZNANRB_DECISION_TYPE_LS" excludeCodes="NONEPRIZNAN" qtip="" validation="required" style="text-align:unknown;" colspan="28"/>
						<@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.label path="form.priznan_law" title="Наименование суда" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.textfield  path="form.priznan_law" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s.,"/№()-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,. длинной не более 200"} style="text-align:unknown;" colspan="28"/>
						<@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.label path="form.priznan_date" title="Дата приговора" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.datefield path="form.priznan_date"  qtip="" validation="required" colspan="12"/>
						 <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.label path="form.priznan_to_who" title="Приговор суда в отношении" required=true style="text-align:right;" colspan=colspans["label"]/>
                        <@sf.empty colspan="1"/>
				        <@sf.radiogroup path="form.priznan_to_who" staticOpts={'1':'Супруга','2':'Супруги'} mode='horizontal' validation="required" colspan="10"/>
                        <@sf.emptyNoWidth colspan="28"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Тип документа = 2
                        Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.label path="form.srok" title="Срок осуждения (в месяцах)" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Тип документа = 2
                        Отображается, если Форма заявления = 2 и Тип документа = 2-->
                        <@sf.textfield  path="form.srok" qtip="" validation="required digits" style="text-align:unknown;" colspan="12"/>
						 <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 3-->
                        <@sf.label path="form.name_law" title="Наименование суда" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 3-->
                        <@sf.textfield  path="form.name_law" qtip=""validation="regexp required maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s.,/№()-]{0,200}$/', "message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,. длинной не более 200"} style="text-align:unknown;" colspan="28"/>
						<@sf.emptyNoWidth colspan=colspans["right"]/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 3-->
                        <@sf.label path="form.decision_law_date" title="Дата" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- Отображается, если Форма заявления = 3-->
                            <@sf.datefield path="form.decision_law_date" maxDate="${currentDate?string('dd.MM.yyyy')}" validation="required relativedays reldaysbyfield" validationattr={"relativedays":"'<=',0","reldaysbyfield":"'>=',0, 'merried_akt_date'"} validationMessage={"reldaysbyfield":"Дата не должна быть меньше даты акта о браке","relativedays":"Дата не должна быть больше текущей даты"} style="text-align:unknown;" colspan="12"/>
						 <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- RB_DECLARANT
                        ZJVL_HE - Муж
                        ZJVL_SHE  - Жена
                        ZJVL_BOTH  - Оба супруга
                        Отображается, если Форма заявления = 3-->
                        <@sf.label path="form.declarant" title="Заявитель" required=true style="text-align:right;" colspan=colspans["label"]/>
						<@sf.empty colspan="1"/>
						<#-- RB_DECLARANT
                        ZJVL_HE - Муж
                        ZJVL_SHE  - Жена
                        ZJVL_BOTH  - Оба супруга
                        Отображается, если Форма заявления = 3-->
                        <@sf.dictionaryLookup path="form.declarant" dictionaryCode="RB_DECLARANT_LS" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
						 <@sf.emptyNoWidth colspan="26"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>