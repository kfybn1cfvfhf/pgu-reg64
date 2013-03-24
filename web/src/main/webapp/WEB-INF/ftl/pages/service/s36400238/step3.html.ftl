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
    <@html.head title='Выплата  ежемесячной  денежной  выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан, проживающих  и работающих  в  сельской  местности,  рабочих поселках (поселках городского типа)'>
        <@script.scripttag>
            <@jquery.onready>
			<@customValidators.addCustomValidators/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
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
					

<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                 <@address.block_country_form fieldsMap=fieldsMap
                country='rec_addressCountry' countryCode='rec_AddressCountryCode' input='rec_addressEnterType'
                country_input='rec_AddressCountryInput' settlementRF='rec_addressSettlementDict' streetRF='rec_addressStreetDict'
                area='rec_addressRayon' region='rec_addressRegion' settlement_type='rec_addressSettlementType'
                country_settlement='rec_AddressCountrySettlement' settlement='rec_addressSettlementText' city='rec_addressCity'
                street='rec_addressStreetText' house='rec_addressHouse' corp='rec_addressKorpus' flat='rec_addressFlat' post="rec_addressIndex"  />
				
                <@sf.fldrow>
					
						<#-- блок: rec_statAddressResStAppl-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания) лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@address.block_country_form fieldsMap=fieldsMap
                country='rec_factAddressCountry' countryCode='rec_factAddressCountryCode' input='rec_factAddressEnterType'
                country_input='rec_factAddressCountryInput' settlementRF='rec_factAddressSettlementDict' streetRF='rec_factAddressStreetDict'
                area='rec_factAddressRayon' region='rec_factAddressRegion' settlement_type='rec_factAddressSettlementType'
                country_settlement='rec_factAddressCountrySettlement' settlement='rec_factAddressSettlementText' city='rec_factAddressCity'
                street='rec_factAddressStreetText' house='rec_factAddressHouse' corp='rec_factAddressKorpus' flat='rec_factAddressFlat' post="rec_factAddressIndex"  />
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientIdentityDocLoad" title="Документ, удостоверяющий личность лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientIdentityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
