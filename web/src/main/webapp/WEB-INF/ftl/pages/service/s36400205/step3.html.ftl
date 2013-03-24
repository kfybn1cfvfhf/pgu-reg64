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
    <@html.head title='Выдача региональных карточек транспортного обслуживания, предоставляющих право бесплатного проезда'>
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
					
						<#-- блок: recipientadress-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType' country_input='recipientaddressCountryInput'
                settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict' area='recipientaddressRayon' region='recipientaddressRegion'
                settlement_type='recipientaddressSettlementType' country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressSettlementText' city='recipientaddressCity'
                street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />

                <@sf.fldrow>
					
						<#-- блок: recipientadress-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания) лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap country='recipientFactAdressCountry' countryCode='recipientFactAdressCountryCode' input='recipientFactAdressEnterType' country_input='recipientFactAdressCountryInput'
                settlementRF='recipientFactAdressSettlementDict' streetRF='recipientFactAdressStreetDict' area='recipientFactAdressRayon' region='recipientFactAdressRegion'
                settlement_type='recipientFactAdressSettlementType' country_settlement='recipientFactAdressCountrySettlement' settlement='recipientFactAdressSettlementText' city='recipientFactAdressCity'
                street='recipientFactAdressStreetText' house='recipientFactAdressHouse' corp='recipientFactAdressKorpus' flat='recipientFactAdressFlat' post="recipientFactAdressIndex"  />

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
