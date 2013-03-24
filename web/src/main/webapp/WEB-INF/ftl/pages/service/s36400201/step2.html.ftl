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
    <@html.head title='Прием документов органами опеки и попечительства от лиц, желающих принять детей'>
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
					
						<#-- Множественный выбор-->
<@sf.label path="form.target" title="Цель подачи заявления:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Множественный выбор-->
<@sf.dictionaryLookup path="form.target" dictionaryCode="0364_TARGET_APPEAL_201" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.additionally" title="Дополнительно могу сообщить следующее:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.additionally" qtip="Указывается наличие у гражданина необходимых знаний и навыков в осуществлении опеки (попечительства) над совершеннолетним недееспособным или не полностью дееспособным гражданином, в том числе информация о наличии документов о профессиональной деятельности, о прохождении программ подготовки кандидатов в опекуны или попечители и т.д." style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.agree" title="Материальные возможности, жилищные условия, состояние здоровья и характер работы позволяют мне взять ребенка (детей) под опеку (попечительство) либо принять в семью на воспитание" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.agree" qtip="" validation="required" style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
