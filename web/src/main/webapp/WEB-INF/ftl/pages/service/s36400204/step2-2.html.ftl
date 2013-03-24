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
    <@html.head title='Назначение гражданам, имеющим звание «Почетный гражданин Саратовской области», денежных компенсаций расходов по оплате проезда'>
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
<@sf.textfield  path="form.lastName" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
					
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
<@sf.textfield  path="form.firstName" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
					
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
<@sf.textfield  path="form.middleName"  wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования-->
<@sf.label path="form.birthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования-->
<@sf.datefield path="form.birthdate" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК - "Домашний телефон"

Валидация: phone (перекрыть)-->
<@sf.label path="form.phone" title="Контактный телефон:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК - "Домашний телефон"

Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.phone" validation="phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК

Валидация: email-->
<@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК

Валидация: email-->
<@sf.textfield  path="form.email" validation="email" qtip="Вносится в формате: name@site.domain"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- блок: address-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
                <@address.block_country_form fieldsMap=fieldsMap
                country='addressCountry' countryCode='addressCountryCode' input='addressEnterType'
                country_input='addressCountryInput' settlementRF='addressSettlementDict' streetRF='addressStreetDict'
                area='addressRayon' region='addressRegion' settlement_type='addressSettlementType'
                country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

                <@sf.fldrow>

                <#-- блок: factAddress-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания)
                        заявителя</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
                country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
                area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
                country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о паспорте заявителя</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield path="form.identityDocType" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Валидация: 4 цифры-->
<@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>

						<#-- Валидация: 4 цифры-->
<@sf.textfield  path="form.passSeria" validation="digitsexact required" validationattr={'digitsexact':4} qtip="" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Валидация: 6 цифр-->
<@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>

						<#-- Валидация: 6 цифр-->
<@sf.textfield  path="form.passNo" validation="digitsexact required" validationattr={'digitsexact':6} qtip="" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>

						<@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="7"/>

						<@sf.empty colspan="24"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>

						<@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.identityDocLoad" title="Паспорт заявителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.identityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
