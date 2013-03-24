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
    <@html.head title='Подтверждение документов государственного образца об образовании, ученых степенях и ученых званиях'>
        <@script.scripttag>
            <@jquery.onready>
			<@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressBenefitLabel' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostCountryBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostIndexBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostEnterTypeBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostRegionBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostRayonBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostSettlementTypeBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostCityBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostSettlementTextBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostSettlementDictBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostStreetTextBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostStreetDictBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostHouseBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostKorpusBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayObtain' 'change' 'addressPostFlatBenefit' '2'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Цель подачи заявления</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.documentAgree" title="Подтверждаемый документ:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.documentAgree" dictionaryCode="03_DOC_AGREE_64158" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о подтверждаемом документе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.eduLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса. Заполняется в соответствии с документом" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.eduFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса. Заполняется в соответствии с документом" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.eduMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса. Заполняется в соответствии с документом"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.kindAttestat" title="Вид документа:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.kindAttestat" qtip="Заполняется в соответствии с документом" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduSeria" title="Серия:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.eduSeria" qtip="Заполняется в соответствии с документом"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduNumber" title="Номер:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.eduNumber" qtip="Заполняется в соответствии с документом"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduFrom" title="Полное наименование образовательного учреждения или организации, выдавшей документ:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.eduFrom" qtip="Заполняется в соответствии с документом" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.eduDate" title="Дата выдачи документа:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.eduDate"  qtip="Заполняется в соответствии с документом" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: только цифры-->
<@sf.label path="form.regNum" title="Регистрационный номер:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: только цифры-->
<@sf.textfield  path="form.regNum" qtip="Заполняется в соответствии с документом" validation="digits" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.apostil" title="Страна предъявления документа, подтверждаемого штампом «Апостиль»:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.apostil" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о способе получения результата услуги</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.wayObtain" title="Способ получения документа:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.wayObtain" dictionaryCode="64_WAY_OF_DELIVERY_64158" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.statictext attr="id='addressBenefitLabel'"  style="text-align:left;" colspan="48"><h2>Почтовый адрес</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@address.block_country_form fieldsMap=fieldsMap country='addressPostCountryBenefit' countryCode='addressPostCountryCodeBenefit' input='addressPostEnterTypeBenefit' country_input='addressPostCountryInputBenefit'
                settlementRF='addressPostSettlementDictBenefit' streetRF='addressPostStreetDictBenefit' area='addressPostRayonBenefit' region='addressPostRegionBenefit'
                settlement_type='addressPostSettlementTypeBenefit' country_settlement='addressPostCountrySettlementBenefit' settlement='addressPostSettlementTextBenefit' city='addressPostCityBenefit'
                street='addressPostStreetTextBenefit' house='addressPostHouseBenefit' corp='addressPostKorpusBenefit' flat='addressPostFlatBenefit' post="addressPostIndexBenefit"  />
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Перечень соглашений</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>

<@sf.checkbox path="form.agreeCh" qtip="" validation="required" style="text-align:unknown;" colspan="1"/>
<@sf.label path="form.agreeCh" title="Подтверждаю согласие на обработку персональных данных в целях подтверждения документов государственного образца об образовании, об ученой степени и ученом звании путем проставления штампа «Апостиль»:" required=true style="text-align:left;" colspan="44"/>


					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
 <@sf.empty colspan="1"/>
<@sf.checkbox path="form.agree1Ch" qtip="" validation="required" style="text-align:unknown;" colspan="1"/>
<@sf.label path="form.agree1Ch" title="С технологией оформления штампа «Апостиль» ознакомлен, согласен:" required=true style="text-align:left;" colspan="24"/>

					
						<@sf.empty colspan="23"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.eduDocLoad" title="Копия документа, представленного к подтверждению:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" path="form.eduDocLoad" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.label path="form.edu1DocLoad" title="Копия приложения к документу, представленного к подтверждению:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.fileload path="form.edu1DocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label  title="<h2>Документы, предоставляемые Заявителем по собственной инициативе</h2>" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.apostilDocLoad" title="Документ, подтверждающий уплату госпошлины:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.apostilDocLoad"  fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
