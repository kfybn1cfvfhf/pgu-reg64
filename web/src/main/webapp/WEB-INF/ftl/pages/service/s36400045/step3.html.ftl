<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Прием заявлений, постановка на учет и зачисление детей в образовательные учреждения реализующие основную образовательную программу дошкольного образования (детские сады)'>
        <@script.scripttag>
            function IdentityDocTypeChenge () {
                $('#parentPassSeria').attr('value', '');
                $('#parentPassNo').attr('value','');
                $('#parentPassFrom').attr('value','');
                $('#parentPassDate').attr('value','');
            }
            <@jquery.onready>
                <@customValidators.addCustomValidators />
	            <@action.setVisibleByValue 'true' 'parentEmployedCh' 'change' 'parentWorkLabel' '1'/>
	            <@action.setVisibleByValue 'true' 'parentEmployedCh' 'change' 'parentWorkPlace' '1'/>
	            <@action.setVisibleByValue 'true' 'parentEmployedCh' 'change' 'parentWorkPost' '1'/>

                $('#parentIdentityDocType').change(function() {
                    IdentityDocTypeChenge();
                });
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о втором родителе или лице его заменяющем</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.parentLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.parentLastName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.parentFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.parentFirstName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.parentMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.parentMiddleName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="cyrillic"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.parentEmployedCh" title="Второй родитель или лицо его заменяющее трудоустроен:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.checkbox path="form.parentEmployedCh" qtip=""  style="text-align:unknown;" colspan="1"/>

					<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.statictext attr='id="parentWorkLabel"' style="text-align:left;" colspan="48"><h2>Сведения о месте работы  второго родителя или лица его заменяющего</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.parentWorkPlace" title="Место работы:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.parentWorkPlace" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.parentWorkPost" title="Должность:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.parentWorkPost" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность второго родителя или лица его заменяющего</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Используется унифицированное решение – справочник документов удостоверяющих личность поставляемый СИА ЕПГУ-->
                    <@sf.label path="form.parentIdentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>

                    <#-- Используется унифицированное решение – справочник документов удостоверяющих личность поставляемый СИА ЕПГУ-->
                    <@sf.customLookup  controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'} path="form.parentIdentityDocType" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.parentPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.parentPassSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.parentPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.parentPassNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.parentPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.parentPassDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.parentPassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.parentPassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
