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
    <@html.head title='Переоформление свидетельства о государственной аккредитации образовательных учреждений'>
        <@script.scripttag>
            <@jquery.onready>
		        $('#reason_re').parent().css('padding-left','10px').find('.radioText').css('float','none').css('padding-left','30px');
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
                        <@sf.label title="Фамилия, имя, отчество (если имеется) заявителя:"  required=true style="text-align:left;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА. Недоступно для редактирования-->
                        <@sf.textfield  path="form.fio" qtip="" validation="required" attr='readonly="readonly"' wrapperClass='fieldDisabled'  style="text-align:left;" colspan="18"/>
					
						<@sf.empty colspan="18"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА. Доступно для редактирования-->
                        <@sf.label title="Контактный телефон заявителя:" required=false style="text-align:left;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА. Доступно для редактирования-->
                        <@sf.textfield  path="form.phone" qtip=""  attr='readonly="readonly"' wrapperClass='fieldDisabled'  style="text-align:left;" colspan="18"/>
					
						<@sf.empty colspan="18"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА. Доступно для редактирования. Валидатор - email-->
                        <@sf.label title="Адрес электронной почты заявителя:" required=false style="text-align:left;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА. Доступно для редактирования. Валидатор - email-->
                        <@sf.textfield  path="form.email" qtip=""  attr='readonly="readonly"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="18"/>
					
						<@sf.empty colspan="18"/>
					
                </@sf.fldrow>
		        <@sf.fldrow>
                        <@sf.label path="form.reason_re" title="Причина переоформления свидетельства о государственной аккредитации:" required=true style="text-align:left;" colspan="50"/>
                </@sf.fldrow>
                <@sf.fldrow>

                        <@sf.radiogroup path="form.reason_re" qtip="" validation="required" style="text-align:left;width:800px" colspan="50" mode="vertical" dictionaryCode="REASON_RENEW_ACCREDIT" />
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
