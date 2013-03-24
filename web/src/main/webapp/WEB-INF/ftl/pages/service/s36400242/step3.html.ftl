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
					
						<@sf.empty colspan="2"/>
					
						 <@sf.label fieldset=true title="Параметры для поиска вакансий" style="text-align:left;" colspan="43"/>

						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.empty colspan="2"/>

                        <#-- Выбирается из справочника КЛАДР в соответствии с Регион/Область-->
                        <@sf.label path="form.addr_raion" title="Район:" required=true style="text-align:right;" colspan="12"/>

                        <@sf.empty colspan="1"/>

                        <#-- Выбирается из справочника КЛАДР в соответствии с Регион/Область-->
                        <@sf.dictionaryLookup path="form.addr_raion" dictionaryCode="VARIANT_TRANCHE_LS" terminalLevel='2' qtip="" validation="required" style="text-align:left;" colspan="30"/>

                        <@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.empty colspan="2"/>

                        <#-- Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)-->
                        <@sf.label path="form.prof" title="Профессия (должность):" required=false style="text-align:right;" colspan="12"/>

                        <@sf.empty colspan="1"/>

                        <#-- Общероссийский классификатор профессий рабочих, должностей служащих и тарифных разрядов (ОКПДТР)-->
                        <@sf.dictionaryLookup path="form.prof" dictionaryCode="VARIANT_OKPDTR_LS" qtip=""  style="text-align:unknown;" colspan="30"/>

                        <@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label path="form.work" title="Квалификационный разряд, категория:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.work" dictionaryCode="VARIANT_CATEGORY_LS" qtip=""  style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label path="form.mode" title="Режим (график) работы:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.mode" dictionaryCode="VARIANT_OPERATING_MODE_LS" qtip=""  style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label path="form.type" title="Вид экономической деятельности (по ОКВЭД):" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.type" dictionaryCode="VARIANT_WORKTYPE_LS" qtip=""  style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.money" title="Заработная плата (не ниже), руб.:" required=false style="text-align:right;" colspan="13"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.money" qtip=""  style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label path="form.character" title="Характер работы:" required=false style="text-align:right;" colspan="12"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.character" dictionaryCode="VARIANT_KIND_WORK_LS" qtip=""  style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
