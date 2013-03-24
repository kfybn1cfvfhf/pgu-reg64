<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
<@html.head title='Подача электронной заявки на повторную выдачу свидетельства о расторжении брака'>
	<@script.scripttag>
		<@jquery.onready>
			
		</@jquery.onready>
	</@script.scripttag>
</@html.head>
<@html.body>
<@html.sitenavigator step=3/>
<@sf.serviceForm>
<@sf.stepList/>
<@sf.serviceStepForm>
				
<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<#-- валидный адрес email-->
	<@sf.label path="form.contact_email" title="Email заявителя" required=false style="text-align:right;" colspan="7"/>
	<@sf.empty colspan="2"/>
	<#-- валидный адрес email-->
	<@sf.textfield  path="form.contact_email" qtip="" validation="maxlength email" validationattr={'maxlength':200} style="text-align:left;" colspan="29"/>
	<@sf.empty colspan="9"/>
</@sf.fldrow>


<@sf.fldrow>
	<@sf.empty colspan="1"/>
	<#-- валидный адрес email-->
	<@sf.label path="form.contact_phone" title="Телефон" required=false style="text-align:right;" colspan="7"/>
	<@sf.empty colspan="2"/>
	<#-- валидный адрес email-->
	<@sf.textfield  path="form.contact_phone" qtip="" validation="" style="text-align:left;" colspan="29"/>
	<@sf.empty colspan="9"/>
</@sf.fldrow>

<@sf.fldrow>
    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
</@sf.fldrow>
				
</@sf.serviceStepForm>
</@sf.serviceForm>
</@html.body>
</@html.html>
	