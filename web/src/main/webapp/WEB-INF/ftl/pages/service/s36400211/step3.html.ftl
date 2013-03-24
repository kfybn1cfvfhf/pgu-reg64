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
    <@html.head title='Предоставление государственной услуги по предоставлению выписки из государственного лесного реестра'>
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
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о запрашиваемой информации (в соответствии с приказом МПР России от 20.07.2007 г. № 190 «Об утверждении перечня видов информации, предоставляемой в обязательном порядке заинтересованным лицам и условий ее предоставления»)</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_TYPE_INFO_64211-->
<@sf.label path="form.typeInfo" title="Вид запрашиваемой информации:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_TYPE_INFO_64211-->
<@sf.dictionaryLookup path="form.typeInfo" dictionaryCode="64_TYPE_INFO_64211" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.forestPark" title="Лесничество (лесопарк):" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.forestPark" dictionaryCode="64_FOREST_PARK_64211" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.forestPiece" title="Участковое лесничество:" required=true style="text-align:left;" colspan="17"/>

                <@sf.dictionaryLookup path="form.forestPiece" dictionaryCode="64_FOREST_PIECE_64211" title="Участковое лесничество"
                        dependsOn=[{'fieldId': 'forestPark'}] parentLookup={'fieldId': 'forestPark'}
                        validation="required"
                        style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.quarterNo" title="№ квартала:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.quarterNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.pieceNo" title="№ выдела:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.pieceNo" qtip="" validation="required digits" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>