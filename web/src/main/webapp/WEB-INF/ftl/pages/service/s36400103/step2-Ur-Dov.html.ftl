<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/custom/validators.ftl" as customValidators>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача градостроительных планов земельных участков'>
        <@script.scripttag>
            <@jquery.onready>
            <#--перекрытие валидатора-->
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
<@sf.label path="form.dovUlDovLoad" title="Доверенность на совершение действий от имени заявителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dovUlDovLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.dovUlPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dovUlPasLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>
					
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

                <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о юридическом адресе организации</h2></@sf.statictext></@sf.fldrow>
                <@address.block_country_form fieldsMap=fieldsMap
                country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType'
                country_input='orgAddressCountryInput' settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict'
                area='orgAddressRayon' region='orgAddressRegion' settlement_type='orgAddressSettlementType'
                country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
                street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' office='orgAddressFlat' post="orgAddressIndex"  />

                <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о почтовом адресе организации</h2></@sf.statictext></@sf.fldrow>
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
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.label path="form.org_phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.org_phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.label path="form.org_fax" title="Факс:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.org_fax" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: email-->
<@sf.label path="form.org_email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: email-->
<@sf.textfield  path="form.org_email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о руководителе организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.org_lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.org_lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.org_firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.org_firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.org_middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.org_middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации юридического лица</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)-->
<@sf.label path="form.org_InnUl" title="Индивидуальный номер налогоплательщика (ИНН):" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)-->
<@sf.textfield  path="form.org_InnUl" qtip="Вносится в формате: XXXXXXXXXX, где X - одна обязательная цифра (10 цифр)" validation="innlegal required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)-->
<@sf.label path="form.org_OgrnUl" title="Основной государственный регистрационный номер юридического лица (ОГРН):" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)-->
<@sf.textfield  path="form.org_OgrnUl" qtip="Вносится в формате: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)" validation="digitsexact required" validationattr={'digitsexact':13} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
