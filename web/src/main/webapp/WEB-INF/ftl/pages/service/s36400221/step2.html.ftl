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
    <@html.head title='Подача электронной заявки на регистрацию брака'>
    <@firstDatePlusNUntilLastDatePlusM.preHead/>
        <@script.scripttag>
        <@fioFields.preScript/>
        <@firstDatePlusNUntilLastDatePlusM.preScript/>

        function showZagsAddress(path){
            var pathrec = path[path.length - 1]
            $('#zagsAddress').text(pathrec.additional.fullAdr);
        }
            <@jquery.onready>
                <@fioFields.apply 'groom_first_name' 'groom_last_name' 'groom_middle_name' 'bride_first_name' 'bride_last_name' 'bride_middle_name'/>
                <@firstDatePlusNUntilLastDatePlusM.onReady/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='groom_date_of_birth' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'groom_date_of_birth', 'currentDate', 'currentDate', '-120' , '-18'"} attrMessages=""/>
                <@firstDatePlusNUntilLastDatePlusM.applyCustomValidation inputid='bride_date_of_birth' validation='firstDatePlusNUntilLastDatePlusM' params={"firstDatePlusNUntilLastDatePlusM":"'bride_date_of_birth', 'currentDate', 'currentDate', '-120' , '-18'"} attrMessages=""/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>

                <#--<@sf.textfield  path="form.reg_date_clone" tdstyle='display:none;' />-->
                <@spring.formHiddenInput path="form.reg_date_clone"/>
                <input id="curr_date" value="${currentDate?string("yyyy-MM-dd")}" type="hidden"/>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true path="form.he" title="Он" required=false style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="18"/>
						<@sf.label fieldset=true path="form.she" title="Она" required=false style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="17"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.label path="form.groom_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.textfield  path="form.groom_last_name" qtip="" style="text-align:left;" colspan="13" attr='maxlength="40"' validation="required regexp" validationattr={"regexp":"/^[ЁёА-Яа-я- \\s]{0,40}$/", "message": "Буквы кириллицы, пробел и символ тире"}/>
						<@sf.empty colspan="4"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.label path="form.bride_last_name" title="Фамилия" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.textfield  path="form.bride_last_name" qtip="" style="text-align:left;" colspan="13" attr='maxlength="40"' validation="required regexp" validationattr={"regexp":"/^[ЁёА-Яа-я- \\s]{0,40}$/", "message": "Буквы кириллицы, пробел и символ тире"}/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.label path="form.groom_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.textfield  path="form.groom_first_name" qtip="" style="text-align:left;" colspan="13" attr='maxlength="20"' validation="required regexp" validationattr={"regexp":"/^[ЁёА-Яа-я- \\s]{0,40}$/", "message": "Буквы кириллицы, пробел и символ тире"}/>
						<@sf.empty colspan="4"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.label path="form.bride_first_name" title="Имя" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.textfield  path="form.bride_first_name" qtip="" style="text-align:left;" colspan="13" attr='maxlength="20"' validation="required regexp" validationattr={"regexp":"/^[ЁёА-Яа-я- \\s]{0,40}$/", "message": "Буквы кириллицы, пробел и символ тире"}/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.label path="form.groom_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.textfield  path="form.groom_middle_name" qtip="" style="text-align:left;" colspan="13" attr='maxlength="20"' validation="regexp" validationattr={"regexp":"/^[ЁёА-Яа-я- \\s]{0,40}$/", "message": "Буквы кириллицы, пробел и символ тире"}/>
						<@sf.empty colspan="4"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.label path="form.bride_middle_name" title="Отчество" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.textfield  path="form.bride_middle_name" qtip="" style="text-align:left;" colspan="13" attr='maxlength="20"' validation="regexp" validationattr={"regexp":"/^[ЁёА-Яа-я- \\s]{0,40}$/", "message": "Буквы кириллицы, пробел и символ тире"}/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<#--<@sf.empty colspan="1"/>-->
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.label path="form.groom_date_of_birth" title="Дата рождения" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.datefield path="form.groom_date_of_birth"  qtip="" validation="required checkDat" maxDate="${currentDate?string('dd.MM.yyyy')}" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.label path="form.bride_date_of_birth" title="Дата рождения" required=true style="text-align:right;" colspan="9"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.datefield path="form.bride_date_of_birth"  qtip="" validation="required checkDat2" maxDate="${currentDate?string('dd.MM.yyyy')}" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.label path="form.groom_citizenship" title="Гражданство" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - мужской-->
                        <@sf.dictionaryLookup path="form.groom_citizenship" title="Гражданство" validation="required" dictionaryCode="GRAJD_LS" qtip=""  style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="4"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.label path="form.bride_citizenship" title="Гражданство" required=true style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<#-- Заполняется автоматически данными из СИА, если пол заявителя - женский-->
                        <@sf.dictionaryLookup path="form.bride_citizenship" title="Гражданство" validation="required" dictionaryCode="GRAJD_LS" qtip="" style="text-align:left;" colspan="13"/>
						<@sf.empty colspan="3"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.groom_nationality" title="Национальность" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.groom_nationality" title="Национальность" dictionaryCode="NATIONALITY_LS" excludeCodes="${form.groom_nationality_dictionary}" qtip=""  style="text-align:left;" colspan="13"/>
                        <@sf.empty colspan="4"/>
						<@sf.label path="form.bride_nationality" title="Национальность" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.bride_nationality" title="Национальность" dictionaryCode="NATIONALITY_LS" excludeCodes="${form.bride_nationality_dictionary}" qtip=""  style="text-align:left;" colspan="13"/>
                       <@sf.empty colspan="3"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
