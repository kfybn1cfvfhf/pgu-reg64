<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/address.ftl" as address>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача градостроительных планов земельных участков'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о земельном участке</h2></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.landKadastr" title="Кадастровый номер:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.landKadastr" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.landSquare" title="Площадь:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.landSquare" qtip="Указывается в кв.м" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о местоположении (адресе) земельного участка</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='landAddressCountry' countryCode='landAddressCountryCode' input='landAddressEnterType'
                country_input='landAddressCountryInput' settlementRF='landAddressSettlementDict' streetRF='landAddressStreetDict'
                area='landAddressRayon' region='landAddressRegion' settlement_type='landAddressSettlementType'
                country_settlement='landAddressCountrySettlement' settlement='landAddressSettlementText' city='landAddressCity'
                street='landAddressStreetText' house='landAddressHouse' corp='landAddressKorpus' flat='landAddressFlat' post="landAddressIndex"  />

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Цель получения градостроительного плана</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- 64_TYPE_OF_WORK_103-->
<@sf.label path="form.landJobs" title="Вид работ:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_TYPE_OF_WORK_103-->
                    <@sf.dictionaryLookup path="form.landJobs" dictionaryCode="64_TYPE_OF_WORK_103" qtip="Вид работ" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.landObjName" title="Наименование объекта капитального строительства планируемого к строительству или реконструкции:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.landObjName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.landDopInfo" title="Дополнительные сведения:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.landDopInfo" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
