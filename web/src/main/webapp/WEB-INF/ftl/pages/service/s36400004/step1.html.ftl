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
    <@html.head title='Проведение государственной аккредитации образовательного учреждения'>
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
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                		<@sf.fldrow>
					
						<#-- Данные из СИА. Недоступно для редактирования-->
                        <@sf.label title="Фамилия, имя, отчество (если имеется) заявителя:" style="text-align:left;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА. Недоступно для редактирования-->
                        <@sf.textfield  path="form.fio" qtip="" attr='readonly="readonly"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="18"/>
					
						<@sf.empty colspan="18"/>
					
                </@sf.fldrow>
				
				
				
                <@sf.fldrow>
					
						<#-- Данные из СИА. Доступно для редактирования.-->
                        <@sf.label title="Контактный телефон заявителя:" required=true style="text-align:left;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА. Доступно для редактирования.-->
                        <@sf.textfield  path="form.phone" qtip="Вносится в формате (К)Н, где К от 3 до 5 цифр, Н - от 5 до 7 цифр" validation="required phone" style="text-align:left;" colspan="18"/>
					
						<@sf.empty colspan="18"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА. Доступно для редактирования. Значение валидируется по маске адреса электронной почты-->
                        <@sf.label title="Адрес электронной почты заявителя:" required=false style="text-align:left;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА. Доступно для редактирования. Значение валидируется по маске адреса электронной почты-->
                        <@sf.textfield  path="form.email" qtip="" validation="email" style="text-align:left;" colspan="18"/>
					
						<@sf.empty colspan="18"/>
					
                </@sf.fldrow>
				
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
