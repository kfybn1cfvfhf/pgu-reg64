<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам'>
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
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о лице, нуждающемся в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.recipientSnils" title="СНИЛС:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.recipientSnils" qtip="" validation="required snils" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации по месту жительства лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='recipientResidenceAddressCountry' countryCode='recipientResidenceAddressCountryCode' input='recipientResidenceAddressEnterType'
                country_input='recipientResidenceAddressCountryInput' settlementRF='recipientResidenceAddressSettlementDict' streetRF='recipientResidenceAddressStreetDict'
                area='recipientResidenceAddressRayon' region='recipientResidenceAddressRegion' settlement_type='recipientResidenceAddressSettlementType'
                country_settlement='recipientResidenceAddressCountrySettlement' settlement='recipientResidenceAddressSettlementText' city='recipientResidenceAddressCity'
                street='recipientResidenceAddressStreetText' house='recipientResidenceAddressHouse' corp='recipientResidenceAddressKorpus' flat='recipientResidenceAddressFlat' post="recipientResidenceAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации по месту пребывания лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='recipientStayAddressCountry' countryCode='recipientStayAddressCountryCode' input='recipientStayAddressEnterType'
                country_input='recipientStayAddressCountryInput' settlementRF='recipientStayAddressSettlementDict' streetRF='recipientStayAddressStreetDict'
                area='recipientStayAddressRayon' region='recipientStayAddressRegion' settlement_type='recipientStayAddressSettlementType'
                country_settlement='recipientStayAddressCountrySettlement' settlement='recipientStayAddressSettlementText' city='recipientStayAddressCity'
                street='recipientStayAddressStreetText' house='recipientStayAddressHouse' corp='recipientStayAddressKorpus' flat='recipientStayAddressFlat' post="recipientStayAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о фактическом месте проживания лица, нуждающегося в услуге</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='recipientFactAddressCountry' countryCode='recipientFactAddressCountryCode' input='recipientFactAddressEnterType'
                country_input='recipientFactAddressCountryInput' settlementRF='recipientFactAddressSettlementDict' streetRF='recipientFactAddressStreetDict'
                area='recipientFactAddressRayon' region='recipientFactAddressRegion' settlement_type='recipientFactAddressSettlementType'
                country_settlement='recipientFactAddressCountrySettlement' settlement='recipientFactAddressSettlementText' city='recipientFactAddressCity'
                street='recipientFactAddressStreetText' house='recipientFactAddressHouse' corp='recipientFactAddressKorpus' flat='recipientFactAddressFlat' post="recipientFactAddressIndex"  />

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
