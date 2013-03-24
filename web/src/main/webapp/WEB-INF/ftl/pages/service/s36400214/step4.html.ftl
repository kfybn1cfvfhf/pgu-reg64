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
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>
					
						<#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.objectName" title="Наименование объекта недвижимости:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.objectName" qtip="Требуется указать тип объекта недвижимости (квартира, здание, земельный участок и т.п.)" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- блок: objectEstateAddress-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Адрес объекта недвижимости</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@address.block_country_form fieldsMap=fieldsMap country='objectEstateAddressCountry' countryCode='objectEstateAddressCountryCode' input='objectEstateAddressEnterType' country_input='objectEstateAddressCountryInput'
                                       settlementRF='objectEstateAddressSettlementDict' streetRF='objectEstateAddressStreetDict' area='objectEstateAddressRayon' region='objectEstateAddressRegion'
                                       settlement_type='objectEstateAddressSettlementType' country_settlement='objectEstateAddressCountrySettlement' settlement='objectEstateAddressSettlementText' city='objectEstateAddressCity'
                                       street='objectEstateAddressStreetText' house='objectEstateAddressHouse' corp='objectEstateAddressKorpus' office='objectEstateAddressFlat' post="objectEstateAddressIndex"  />
				
                <@sf.fldrow>
					
						<@sf.label path="form.objectEstateSpace" title="Площадь объекта недвижимости (кв.м), протяженность (м):" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.objectEstateSpace" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.objectCadastralNumber" title="Кадастровый (условный) номер:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.objectCadastralNumber" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.dovApplicantDoc" title="Документы, которые, по  мнению заявителя, имеют значение для предоставления  выписки из реестра государственного имущества области:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dovApplicantDoc" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Прикладываются по желанию заявителя" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
