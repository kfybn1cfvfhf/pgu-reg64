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
    <@html.head title='Предоставление выписок и сведений из реестра государственного имущества Саратовской области по запросам граждан и юридических лиц'>
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
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об уполномоченном представителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.dovUlDovLoad" title="Доверенность на совершение действий от имени заявителя:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dovUlDovLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляется по желанию представителя юридического лица" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.dovUlPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dovUlPasLoad" qtip="Предоставляется по желанию представителя юридического лица" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				

                <@sf.fldrow>
                <@sf.label path="form.org_FullTitle" title="Полное наименование организации:" required=true style="text-align:left;" colspan="17"/>
                <@sf.dictionaryLookup path="form.org_opf" dictionaryCode="FORM_OF_INCORPORATION_64" qtip="Организационно-правовая форма" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>
                <@sf.fldrow>
                <@sf.empty colspan="17" />
                <@sf.textarea path="form.org_FullTitle" qtip="Наименование организации" validation="required" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.org_SmallTitle" title="Сокращенное наименование организации:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.org_SmallTitle" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- блок: org_addressUr-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Юридический адрес организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                 <@address.block_country_form fieldsMap=fieldsMap country='org_addressUrCountry' countryCode='org_addressUrCountryCode' input='org_addressUrEnterType' country_input='org_addressUrCountryInput'
                                       settlementRF='org_addressUrSettlementDict' streetRF='org_addressUrStreetDict' area='org_addressUrRayon' region='org_addressUrRegion'
                                       settlement_type='org_addressUrSettlementType' country_settlement='org_addressUrCountrySettlement' settlement='org_addressUrSettlementText' city='org_addressUrCity'
                                       street='org_addressUrStreetText' house='org_addressUrHouse' corp='org_addressUrKorpus' office='org_addressUrFlat' post="org_addressUrIndex"  />
				
                <@sf.fldrow>
					
						<#-- блок: org_addressPost-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Почтовый адрес организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@address.block_country_form fieldsMap=fieldsMap country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType' country_input='org_addressPostCountryInput'
                                       settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict' area='org_addressPostRayon' region='org_addressPostRegion'
                                       settlement_type='org_addressPostSettlementType' country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
                                       street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' flat='org_addressPostFlat' post="org_addressPostIndex"  />
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о контактной информации организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.label path="form.org_phone" title="Номер контактного телефона:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.org_phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.label path="form.org_fax" title="Номер факса:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.org_fax" validation="phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: email-->
<@sf.label path="form.org_email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: email-->
<@sf.textfield  path="form.org_email" qtip="Вносится в формате: name@site.domain" validation="email"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о руководителе организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.org_firstName" title="Фамилия руководителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.org_firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.org_lastName" title="Имя руководителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.org_lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.org_middleName" title="Отчество руководителя (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидатор:  cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.org_middleName" validation="cyrillic" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
