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
					
						<@sf.label title="Профессия (специальность), квалификация, должность, вид деятельности:" required=false style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea  path="form.workProf" qtip=""  style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- дата, от -100 до +10 лет-->
                        <@sf.label title="Период работы с:" required=false style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- дата, от -100 до +10 лет-->
                        <@sf.datefield path="form.workStart"  qtip=""  style="text-align:center;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- дата, от -100 до +10 лет-->
                        <@sf.label title="по:" required=false style="text-align:right;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- дата, от -100 до +10 лет-->
                        <@sf.datefield path="form.workEnd"  qtip=""  style="text-align:center;" colspan="8"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Характер работы:" required=false style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.workType" dictionaryCode="NATURE_OF_THE_WORK" qtip=""  style="text-align:left;" colspan="12"/>

						<@sf.empty colspan="19"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
