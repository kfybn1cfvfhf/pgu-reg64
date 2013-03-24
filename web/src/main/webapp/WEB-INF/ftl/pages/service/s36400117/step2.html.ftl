<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<#import "/custom/validators.ftl" as customValidators>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выплата социального пособия на погребение'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об умершем</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.deadLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.deadLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.deadFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.deadFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.deadMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.deadMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию не активирован.

                    Логика:
                    1. При активации на ШАГ 4 отображаются поля #grrDeadChild и #deadChildDocLoad
                    2. При деактивации на ШАГ 4 отображается поле #sprDeadDocLoad-->

                    <@sf.label path="form.deadChild" title="Погребение мертворожденного ребенка по истечении 154 дней беременности:" required=false style="text-align:left;" colspan="18"/>

                    <@sf.checkbox path="form.deadChild" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.noSocStrah" title="Умерший не подлежал обязательному социальному страхованию на случай временной нетрудоспособности и в связи с материнством на деть смерти и не являлся пенсионером:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.checkbox path="form.noSocStrah" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.deadMoney" title="Погребение осуществлялось за счет заявителя:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.checkbox path="form.deadMoney" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
