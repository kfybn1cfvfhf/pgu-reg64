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
					

						<@sf.label title="Профессия (специальность), квалификация, должность, вид деятельности:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea  path="form.WorkProf" validation="required" qtip=""  style="text-align:left;" colspan="22"/>
					
						<@sf.empty colspan="14"/>					
						
                </@sf.fldrow>
				
                <@sf.fldrow>
					

						<#-- дата, от -100 до +10 лет-->
                        <@sf.label title="Период работы с:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- дата, от -100 до +10 лет-->
                        <@sf.datefield path="form.WorkStart" validation="required" qtip=""  style="text-align:center;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- дата, от -100 до +10 лет-->
                        <@sf.label title="по" required=true style="text-align:unknown;" colspan="2"/>

						<@sf.empty colspan="1"/>

						<#-- дата, от -100 до +10 лет-->
                        <@sf.datefield path="form.WorkEnd" validation="required" qtip=""  style="text-align:center;" colspan="8"/>

						<@sf.empty colspan="16"/>

                </@sf.fldrow>

                <@sf.fldrow>


						<@sf.label title="Характер работы:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.WorkType" validation="required" dictionaryCode="NATURE_OF_THE_WORK" qtip=""  style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="16"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

						<@sf.label title="Заработная плата, руб.:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.WorkMoney" qtip="" validation="digits required" validationattr={"fractcount":"0"} style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="26"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
