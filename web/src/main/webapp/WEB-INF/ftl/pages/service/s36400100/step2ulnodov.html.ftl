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
    <@html.head title=' Прием заявлений и выдача документов о согласовании переустройства и (или) перепланировки жилого помещения'>
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
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.dovUlNonDovLoad" title="Документ, подтверждающий полномочия лица на осуществление действий от имени заявителя (копия решения о назначении или об избрании либо приказа о назначении физического лица на должность), в соответствии с которым такое физическое лицо обладает правом действовать от имени заявителя без доверенности:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.dovUlNonDovLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.dovUlPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.dovUlPasLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
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

                    <@sf.label path="form.org_SmallTitle" title="Сокращённое наименование организации:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.org_SmallTitle" qtip=""  style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о юридическом адресе организации</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='orgAddressCountry' countryCode='orgAddressCountryCode' input='orgAddressEnterType'
                country_input='orgAddressCountryInput' settlementRF='orgAddressSettlementDict' streetRF='orgAddressStreetDict'
                area='orgAddressRayon' region='orgAddressRegion' settlement_type='orgAddressSettlementType'
                country_settlement='orgAddressCountrySettlement' settlement='orgAddressSettlementText' city='orgAddressCity'
                street='orgAddressStreetText' house='orgAddressHouse' corp='orgAddressKorpus' flat='orgAddressFlat' post="orgAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о фактическом адресе организации</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='orgFactAddressCountry' countryCode='orgFactAddressCountryCode' input='orgFactAddressEnterType'
                country_input='orgFactAddressCountryInput' settlementRF='orgFactAddressSettlementDict' streetRF='orgFactAddressStreetDict'
                area='orgFactAddressRayon' region='orgFactAddressRegion' settlement_type='orgFactAddressSettlementType'
                country_settlement='orgFactAddressCountrySettlement' settlement='orgFactAddressSettlementText' city='orgFactAddressCity'
                street='orgFactAddressStreetText' house='orgFactAddressHouse' corp='orgFactAddressKorpus' flat='orgFactAddressFlat' post="orgFactAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о почтовом адресе организации</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='orgPostAddressCountry' countryCode='orgPostAddressCountryCode' input='orgPostAddressEnterType'
                country_input='orgPostAddressCountryInput' settlementRF='orgPostAddressSettlementDict' streetRF='orgPostAddressStreetDict'
                area='orgPostAddressRayon' region='orgPostAddressRegion' settlement_type='orgPostAddressSettlementType'
                country_settlement='orgPostAddressCountrySettlement' settlement='orgPostAddressSettlementText' city='orgPostAddressCity'
                street='orgPostAddressStreetText' house='orgPostAddressHouse' corp='orgPostAddressKorpus' flat='orgPostAddressFlat' post="orgPostAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о контактах организации</h2></@sf.statictext>
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
<@sf.textfield  path="form.org_fax" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 8" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: email-->
<@sf.label path="form.org_email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: email-->
<@sf.textfield  path="form.org_email" qtip="Вносится в формате: name@site.domain" validation="email"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)-->
<@sf.label path="form.org_InnUl" title="Индивидуальный номер налогоплательщика:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: XXXXXXXXXX, где X – одна обязательная цифра (10 цифр)-->
<@sf.textfield  path="form.org_InnUl" qtip="Вносится в формате: XXXXXXXXXX, где X - одна обязательная цифра (10 цифр)" validation="innlegal required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)-->
<@sf.label path="form.org_OgrnUl" title="Основной государственный регистрационный номер юридического лица:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)-->
<@sf.textfield  path="form.org_OgrnUl" qtip="Вносится в формате: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)" validation="required digitsexact" validationattr={'digitsexact':13} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
