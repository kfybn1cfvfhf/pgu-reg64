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
    <@html.head title='Предоставление выписок и сведений из реестра государственного имущества Саратовской области по запросам граждан и юридических лиц'>
        <@script.scripttag>
            <@jquery.onready>
			<@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostCountry' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostIndex' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostEnterType' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostRegion' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostRayon' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostSettlementType' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostCity' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostSettlementText' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostSettlementDict' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostStreetText' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostStreetDict' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostHouse' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostKorpus' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'addressPostFlat' '1'/>
            <@action.setVisibleByValue 'true' 'waydelivery' 'change' 'adresstatic' '1'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Укажите способ получения информации (результата оказания услуги)</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.waydelivery" title="Способ получения информации (результата оказания услуги):" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.waydelivery" dictionaryCode="03_METHOD_DELIVERY_RESULT_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.statictext style="text-align:left;" attr="id='adresstatic'" colspan="48"><h2>Почтовый адрес получения извещения</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@address.block_country_form fieldsMap=fieldsMap country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType' country_input='addressPostCountryInput'
                                       settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict' area='addressPostRayon' region='addressPostRegion'
                                       settlement_type='addressPostSettlementType' country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                                       street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
