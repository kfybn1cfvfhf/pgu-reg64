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
    <@html.head title='Предоставление разрешения на право организации розничного рынка, продление срока его действия, переоформление разрешения'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <#--<h1><b>Заявление подается в ОИВ:<br>${stateOrgName}</b><h1>-->
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
                    <@sf.label path="form.dovUlType" title="Заявление подает:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.staticLookup path="form.dovUlType" staticData={"1":"Лицо, обладающее правом действовать от имени юридического лица без доверенности","2":"Представитель юридического лица действующий на основании доверенности"} qtip="" validation="required" style="text-align:left;" colspan="31" />
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
