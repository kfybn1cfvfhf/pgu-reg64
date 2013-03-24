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
    <@html.head title='Прием заявок (запись) на прием к врачу'>
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
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Прошу осуществить предварительную запись на прием к врачу:</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 03_LPU_05155-->
<@sf.label path="form.lpu" title="Медицинское учреждение:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 03_LPU_05155-->
<@sf.dictionaryLookup path="form.lpu" dictionaryCode="0364_LPU_SO" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 03_DOCTOR_05155-->
<@sf.label path="form.doctor" title="Специальность врача:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 03_DOCTOR_05155-->
<@sf.dictionaryLookup path="form.doctor" dictionaryCode="0364_DOCTOR_155" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.desiredDate" title="Желаемая дата посещения врача:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.desiredDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
