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
    <@html.head title='Предоставление социальных выплат за счет средств федерального бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Дополнительные сведения</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.baseAppeal" title="Заявитель обращается на  основании:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.baseAppeal" dictionaryCode="64_BASE_APPEAL_64239" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.lonely" title="Получатель услуги является одиноким:" required=false style="text-align:left;" colspan="17"/>
<@sf.checkbox path="form.lonely" qtip=""  style="text-align:left;" colspan="1"/>
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.noEGRP" title="Право собственности на жилое помещение не зарегистрировано в Едином государственном реестре прав на недвижимое имущество и сделок с ним:" required=false style="text-align:left;" colspan="17"/>
<@sf.checkbox path="form.noEGRP" qtip=""  style="text-align:left;" colspan="1"/>
						<@sf.empty colspan="30"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
