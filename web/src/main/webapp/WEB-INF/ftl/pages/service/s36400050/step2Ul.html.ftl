<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление лицензируемой деятельности для ЮЛ'>
        <@script.scripttag>
            <@jquery.onready>
                <@validators.addCustomValidators/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Сведения о заявителе</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА-->
                        <@sf.label title="Фамилия, имя, отчество (если имеется) заявителя:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА-->
                        <@sf.textfield  path="form.fio_zaja" qtip="" validation="required" style="text-align:left;" colspan="25" attr='readonly="true"' wrapperClass='fieldDisabled'/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА, с возможностью правки, валидатор - телефон-->
                        <@sf.label title="Контактный телефон заявителя:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА, с возможностью правки, валидатор - телефон-->
                        <@sf.textfield  path="form.phone_zaja" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."  validation="required phone" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА, валидатор - email-->
                        <@sf.label title="Адрес электронной почты заявителя:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА, валидатор - email-->
                        <@sf.textfield  path="form.enail_zaja" qtip=""  style="text-align:left;" colspan="25" validation="email"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Сведения о лицензиате (правопреемнике)</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Полное наименование юридического лица:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.full" qtip="" validation="required" style="text-align:left;" colspan="35"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Организационно-правовая форма юридического лица:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.form" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Сокращенное наименование юридического лица:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.short_name" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Фирменное наименование юридического лица:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.firm" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Адрес места нахождения юридического лица (с указанием индекса):</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType'
                country_input='orgAddressCountryInput' settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict'
                area='orgAddressRayon' region='orgAddressRegion' settlement_type='orgAddressSettlementType'
                country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
                street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' office='orgAddressFlat' post="orgAddressIndex"  />
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор телефон-->
                        <@sf.label title="Контактный телефон юридического лица:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор телефон-->
                        <@sf.textfield  path="form.phone" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."  validation="required phone" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор - email-->
                        <@sf.label title="Адрес электронной почты юридического лица:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор - email-->
                        <@sf.textfield  path="form.email" qtip=""  style="text-align:left;" colspan="25"  validation="email"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
