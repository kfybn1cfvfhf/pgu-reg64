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
    <@html.head title='Выплата пособия по беременности и родам, единовременного пособия женщинам, вставшим на учет в медицинских учреждениях в ранние сроки беременности'>
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
						<@sf.label path="form.agreeCh" title="Я предупреждена об ответственности за достоверность предоставленной мною информации и документов, влияющих на право назначения мне данных пособий. В случае обнаружения переплаты, возникшей по моей вине, обязуюсь возместить излишне выплаченную сумму пособия." required=true style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.agreeCh" qtip="" validation="required" style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.agree1Ch" title="Согласна на обработку своих персональных данных при сохранении их конфиденциальности в соответствии с Федеральным законом от 27 июля 2006 года № 152-ФЗ «О персональных данных»." required=true style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.agree1Ch" qtip="" validation="required" style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
