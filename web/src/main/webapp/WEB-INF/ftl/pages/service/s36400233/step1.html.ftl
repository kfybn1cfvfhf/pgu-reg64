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
    <@html.head title='Выдача справок гражданам о величине прожиточного минимума на душу населения и по основным социально-демографическим группам населения Саратовской области'>
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
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- блок: statAddressPostAppl-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о почтовом адресе заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
                country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
                area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
                country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
