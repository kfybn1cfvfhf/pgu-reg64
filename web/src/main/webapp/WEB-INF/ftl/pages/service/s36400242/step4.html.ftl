<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../landresource/style.ftl" as st>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@st.style/>
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
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <#-- Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)-->
                        <@sf.label path="form.basic_trade" title="Основная профессия (должность):" required=false style="text-align:right;" colspan="13"/>

                        <@sf.empty colspan="1"/>

                        <#-- Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)-->
                        <@sf.dictionaryLookup path="form.basic_trade" dictionaryCode="VARIANT_OKPDTR_LS" qtip=""  style="text-align:left;" colspan="30"/>

                        <@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <#-- Сколько полных лет-->
                        <@sf.label path="form.experience" title="Стаж работы по основной профессии (лет):" required=false style="text-align:right;" colspan="13"/>

                        <@sf.empty colspan="1"/>

                        <#-- Сколько полных лет-->
                        <@sf.textfield  path="form.experience" qtip="" validation='digits' style="text-align:left;" colspan="30"/>

                        <@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.basic_money" title="Заработная плата на последнем месте работы, руб.:" required=false style="text-align:right;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.basic_money" qtip="" validation='number' style="text-align:unknown;" colspan="30"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
