<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Содействие гражданам в поиске подходящей работы'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="47" class="field-qtip">Прошу рассмотреть возможность собеседования с работодателями по вакансиям, размещенным на сайте www.trudvsem.ru из списка: (указать номер выбранной вакансии и профессию)</@sf.statictext>
					
						<@sf.empty colspan="2"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="№ Вакансии:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ExtarN1" qtip=""  style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="профессия:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ExtraPost1" qtip=""  style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="10"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="№ Вакансии:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ExtarN2" qtip=""  style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="профессия:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ExtraPost2" qtip=""  style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="10"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="№ Вакансии:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ExtarN3" qtip=""  style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="профессия:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ExtraPost3" qtip=""  style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="10"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- В качестве значения переменной передается поле dicitem_extcode из БД-->
                        <@sf.label title="Выбор места получения услуги:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- В качестве значения переменной передается поле dicitem_extcode из БД-->
                        <@sf.dictionaryLookup path="form.czn" dictionaryCode="CZN_SARATOV" qtip="" validation="required" style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="20"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.checkbox path="form.Q1" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Прошу предоставить информацию о проведении ярмарок вакансий" required=false style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="17"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
