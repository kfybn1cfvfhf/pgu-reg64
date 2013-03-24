<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление гражданам жилых помещений по договорам социального найма из государственного жилищного фонда'>
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
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об адресе предоставленного жилого помещения по договору социального найма</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressRentCountry' countryCode='addressRentCountryCode' input='addressRentEnterType'
                country_input='addressRentCountryInput' settlementRF='addressRentSettlementDict' streetRF='addressRentStreetDict'
                area='addressRentRayon' region='addressRentRegion' settlement_type='addressRentSettlementType'
                country_settlement='addressRentCountrySettlement' settlement='addressRentSettlementText' city='addressRentCity'
                street='addressRentStreetText' house='addressRentHouse' corp='addressRentKorpus' flat='addressRentFlat' post="addressRentIndex"  />
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о договоре социального найма</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: только цифры-->
<@sf.label path="form.socNo" title="Номер договора социального найма:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- Валидация: только цифры-->
<@sf.textfield  path="form.socNo" qtip="" validation="required digits" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.socDate" title="Дата договора социального найма:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.datefield path="form.socDate"  qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.socFio" title="Фамилия, имя, отчество (если имеется) нанимателя жилого помещения по договору социального найма:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.textfield  path="form.socFio" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
