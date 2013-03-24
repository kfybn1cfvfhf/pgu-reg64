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
					
						<@sf.label title="Профессия (специальность), квалификация:" required=true style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.WantProf" qtip="" validation="required" style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="15"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Должность:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.WantPost" qtip=""  style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="15"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Вид деятельности:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.WantWork" qtip=""  style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="15"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.label title="Характер работы:" required=true style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.dictionaryLookup path="form.WantType" validation="required" dictionaryCode="NATURE_OF_THE_WORK" qtip=""  style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="15"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Заработная плата, руб.:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.WantMoney" qtip="" validation="digits" validationattr={"fractcount":"0"} style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дополнительные пожелания:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.WantOther" qtip=""  style="text-align:left;" colspan="33"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
