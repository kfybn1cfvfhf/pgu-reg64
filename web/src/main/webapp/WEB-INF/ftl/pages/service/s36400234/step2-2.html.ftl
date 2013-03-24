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
    <@html.head title='Информирование о положении на рынке труда в Саратовской области'>
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
					
						<#-- #orgLabel-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.org_FullTitle" title="Полное наименование организации:" required=true style="text-align:left;" colspan="17"/>

                        <@sf.dictionaryLookup path="form.org_opf" dictionaryCode="FORM_OF_INCORPORATION_64" qtip=""
                            validation="required" style="text-align:left;" colspan="11"/>

                        <@sf.empty colspan="3" />

						<@sf.textarea path="form.org_FullTitle" qtip="" validation="required" style="text-align:left;" colspan="17"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label path="form.org_sokr" title="Сокращенное наименование организации:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.org_sokr" qtip="Заполняется в случае, если у организации имеется сокращенное наименование"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

                <#-- #applNoteEdited-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о почтовом адресе организации</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='orgPostAddressCountry' countryCode='orgPostAddressCountryCode' input='orgPostAddressEnterType'
                country_input='orgPostAddressCountryInput' settlementRF='orgPostAddressSettlementDict' streetRF='orgPostAddressStreetDict'
                area='orgPostAddressRayon' region='orgPostAddressRegion' settlement_type='orgPostAddressSettlementType'
                country_settlement='orgPostAddressCountrySettlement' settlement='orgPostAddressSettlementText' city='orgPostAddressCity'
                street='orgPostAddressStreetText' house='orgPostAddressHouse' corp='orgPostAddressKorpus' office='orgPostAddressFlat' post="orgPostAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о контактной информации организации</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
						<#-- Валидация: email-->
                    <@sf.label path="form.org_email" title="Адрес электронной почты:" required=true style="text-align:left;" colspan="17"/>
                                            <#-- Валидация: email-->
                    <@sf.textfield  path="form.org_email" qtip="Вносится в формате: name@site.domain"
                        validation="required email" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
