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
    <@html.head title='Прием заявлений на участие в общественных работах'>
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
					
						<@sf.label title="Профессия (специальность), квалификация:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.wantProf" qtip=""  style="text-align:left;" colspan="33"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
<#--
                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Должность:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<@sf.textfield  path="form.wantPosition" qtip=""  style="text-align:left;" colspan="33"/>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>
-->
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Вид деятельности:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.wantWork" qtip=""  style="text-align:left;" colspan="33"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дополнительные пожелания:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.wantOther" qtip=""  style="text-align:left;" colspan="33"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- В качестве значения переменной передается поле dicitem_extcode из БД-->
                        <@sf.label title="Выбор места получения услуги:" required=true style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- В качестве значения переменной передается поле dicitem_extcode из БД-->
                        <@sf.dictionaryLookup path="form.czn" dictionaryCode="CZN_SARATOV" qtip="" validation="required" style="text-align:left;" colspan="33"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
