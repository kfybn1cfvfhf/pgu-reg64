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
    <@html.head title='Организация отдыха и оздоровления детей, находящихся в трудной жизненной ситуации, проживающих на территории Саратовской области'>
        <@script.scripttag>
            <@jquery.onready>
                            <@customValidators.addCustomValidators />

                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'applCategory' '1,2'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'birthdateAppl' '1,2'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'placeJob' '1,2'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'guardianLabel' '3'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'guardianDocNote' '3'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'dovOpekLoad' '3'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'guardianDocMoneyLoad' '3'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'dovOpekLoad-label' '3'/>
                            <@action.setVisibleByValue 'true' 'applChild' 'change' 'guardianDocMoneyLoad-label' '3'/>

                            <#-- ДУЛ -->
                                <#-- Иной документ -->
                                <@action.setVisibleByValue 'true' 'identityDocType' 'change' 'otherDocTypeName' '5'/>
                                <#-- У Временного удост или Иного документа серия необязательна -->
                                <@action.unsetRequiredByField 'true' 'identityDocType' 'change' 'passSeria' '2,5'/>
                                <#-- Макс длина серии Паспорта Рф 4 цифр -->
                                <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passSeria' '1' 'digitsexact' {"digitsexact":"4"}/>
                                <#-- Значения серии Вида на жительство одно из списка: 80, 81, 82, 83 -->
                                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passSeria' value='3' rules='invaluelist' validationAttr={"invaluelist":"80, 81, 82, 83"} validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                                <#-- Макс длина номера Паспорта Рф 6 цифр -->
                                <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '1' 'digitsexact' {"digitsexact":"6"}/>
                                <#-- Макс длина номера Временного удост или Вида на жительство 7 цифр -->
                                <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '2,3' 'digitsexact' {"digitsexact":"7"}/>
                            <#-- /ДУЛ -->

				
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
<@sf.textfield  path="form.lastName" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
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
<@sf.textfield  path="form.firstName" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
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
<@sf.textfield  path="form.middleName" wrapperClass='fieldDisabled' attr='readonly="readonly"' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются заявителем</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_APPLICANT_CHILD_64053

Значения:
1. Матерью
2. Отцом
3. Опекуном (попечителем)-->
<@sf.label path="form.applChild" title="Заявитель по отношению к ребенку является:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_APPLICANT_CHILD_64053

Значения:
1. Матерью
2. Отцом
3. Опекуном (попечителем)-->
<@sf.dictionaryLookup path="form.applChild" dictionaryCode="64_APPLICANT_CHILD_64053" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_APPLICANT_CATEGORY_64053
По умолчанию: поле скрыто

Значения:
1. Работающий
2. Неработающий (состоящий на учете в службе занятости населения)
3. Неработающий (не состоящий на учете в службе занятости населения)
4. Работающий пенсионер
5. Неработающий пенсионер
6. Учащийся
7. Студент
8. Работающий инвалид
9. Неработающий инвалид

Логика:
1. Отображается при выборе значения  "1. Матерью"
2. Отображается при выборе значения "2. Отцом"
3. Не отображается при выборе значения "3. Опекуном (попечителем)"-->
<@sf.label path="form.applCategory" title="Категория заявителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_APPLICANT_CATEGORY_64053
По умолчанию: поле скрыто

Значения:
1. Работающий
2. Неработающий (состоящий на учете в службе занятости населения)
3. Неработающий (не состоящий на учете в службе занятости населения)
4. Работающий пенсионер
5. Неработающий пенсионер
6. Учащийся
7. Студент
8. Работающий инвалид
9. Неработающий инвалид

Логика:
1. Отображается при выборе значения  "1. Матерью"
2. Отображается при выборе значения "2. Отцом"
3. Не отображается при выборе значения "3. Опекуном (попечителем)"-->
<@sf.dictionaryLookup path="form.applCategory" dictionaryCode="64_APPLICANT_CATEGORY_64053" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения  "1. Матерью"
2. Отображается при выборе значения "2. Отцом"
3. Не отображается при выборе значения "3. Опекуном (попечителем)"-->
<@sf.label path="form.birthdateAppl" title="Дата рождения заявителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения  "1. Матерью"
2. Отображается при выборе значения "2. Отцом"
3. Не отображается при выборе значения "3. Опекуном (попечителем)"-->
<@sf.datefield path="form.birthdateAppl"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения  "1. Матерью"
2. Отображается при выборе значения "2. Отцом"
3. Не отображается при выборе значения "3. Опекуном (попечителем)"-->
<@sf.label path="form.placeJob" title="Место работы (учебы):" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения  "1. Матерью"
2. Отображается при выборе значения "2. Отцом"
3. Не отображается при выборе значения "3. Опекуном (попечителем)"-->
<@sf.textarea path="form.placeJob" qtip="В случае отсутствия места работы (учебы) ставится знак «-»" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- блок: statAddressRegAppl-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>


                <@address.block_country_form fieldsMap=fieldsMap country='addressCountry' countryCode='addressCountryCode' input='addressEnterType' country_input='addressCountryInput'
                                       settlementRF='addressSettlementDict' streetRF='addressStreetDict' area='addressRayon' region='addressRegion'
                                       settlement_type='addressSettlementType' country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                                       street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />


                <@sf.fldrow>

                						<#-- блок: statAddressResStAppl-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания) заявителя</h2></@sf.statictext>

                </@sf.fldrow>


                <@address.block_country_form fieldsMap=fieldsMap country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType' country_input='factAddressCountryInput'
                                                       settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict' area='factAddressRayon' region='factAddressRegion'
                                                       settlement_type='factAddressSettlementType' country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                                                       street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />



				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК - "Домашний телефон"

Валидация: phone (перекрыть)-->
<@sf.label path="form.phone" title="Номер контактного телефона:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК - "Домашний телефон"

Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК

Валидация: email-->
<@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК

Валидация: email-->
<@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
По умолчанию:
Не заполнен
Значения:
1 - Паспорт гражданина РФ
2 - Временное удостоверение личности гражданина РФ
3 - Вид на жительство (лица без гражданства)/ (иностранного гражданина)
4 - Иностранный паспорт
5 - Иной документ, удостоверяющий личность
Логика: 
1. При выборе значения из справочника 5 отображается поле #otherDocTypeName-->
<@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
По умолчанию:
Не заполнен
Значения:
1 - Паспорт гражданина РФ
2 - Временное удостоверение личности гражданина РФ
3 - Вид на жительство (лица без гражданства)/ (иностранного гражданина)
4 - Иностранный паспорт
5 - Иной документ, удостоверяющий личность
Логика: 
1. При выборе значения из справочника 5 отображается поле #otherDocTypeName-->
<@sf.dictionaryLookup path="form.identityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Скрыт

Логика: 
1. Отображается при выборе значения  5 из справочника #identityDocType

Разработчику: При интеграции передавать в параметре identityDocType-->
<@sf.label path="form.otherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Скрыт

Логика: 
1. Отображается при выборе значения  5 из справочника #identityDocType

Разработчику: При интеграции передавать в параметре identityDocType-->
<@sf.textfield  path="form.otherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен при выборе из справочника #identityDocType значений 1,3,4
2. Не обязателен при выборе из справочника #identityDocType значений 2,5
3. При выборе из справочника #identityDocType значения 1, валидация: 4 цифры
4. При выборе из справочника #identityDocType значения 3, валидация: допустимо для ввода 80 или 81 или 82 или 83
5. При выборе из справочника #identityDocType значения 2,4,5, валидация отсутствует-->
<@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен при выборе из справочника #identityDocType значений 1,3,4
2. Не обязателен при выборе из справочника #identityDocType значений 2,5
3. При выборе из справочника #identityDocType значения 1, валидация: 4 цифры
4. При выборе из справочника #identityDocType значения 3, валидация: допустимо для ввода 80 или 81 или 82 или 83
5. При выборе из справочника #identityDocType значения 2,4,5, валидация отсутствует-->
<@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен всегда
2. При выборе из справочника #identityDocType значения 1, валидация: 6 цифр
3. При выборе из справочника #identityDocType значения 2 или 3, валидация: 7 цифр
4. При выборе из справочника #identityDocType значения 4,5, валидация отсутствует-->
<@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен всегда
2. При выборе из справочника #identityDocType значения 1, валидация: 6 цифр
3. При выборе из справочника #identityDocType значения 2 или 3, валидация: 7 цифр
4. При выборе из справочника #identityDocType значения 4,5, валидация отсутствует-->
<@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен всегда-->
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
                        <@sf.label path="form.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow><@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.fileload path="form.identityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Прикладываются сканированные страницы документа, содержащие Ф.И.О., фото, место жительства" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения "3. Опекуном (попечителем)"
2. Не отображается при выборе значения  "1. Матерью"
3. Не отображается при выборе значения "2. Отцом"-->
<@sf.statictext attr="id='guardianLabel'" style="text-align:left;" colspan="48"><h2>Сведения, подтверждающие полномочия опекуна или попечителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения "3. Опекуном (попечителем)"
2. Не отображается при выборе значения  "1. Матерью"
3. Не отображается при выборе значения "2. Отцом"-->
<@sf.statictext attr="id='guardianDocNote'" style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения "3. Опекуном (попечителем)"
2. Не отображается при выборе значения  "1. Матерью"
3. Не отображается при выборе значения "2. Отцом"

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.dovOpekLoad" title="Документ, подтверждающий факт установления опеки (попечительства):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения "3. Опекуном (попечителем)"
2. Не отображается при выборе значения  "1. Матерью"
3. Не отображается при выборе значения "2. Отцом"

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dovOpekLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения "3. Опекуном (попечителем)"
2. Не отображается при выборе значения  "1. Матерью"
3. Не отображается при выборе значения "2. Отцом"

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.guardianDocMoneyLoad" title="Справка или иной документ, подтверждающий назначение денежных выплат, направленных на содержание опекаемого ребенка, в случаях предусмотренных федеральным законодательством:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
1. Отображается при выборе значения "3. Опекуном (попечителем)"
2. Не отображается при выборе значения  "1. Матерью"
3. Не отображается при выборе значения "2. Отцом"

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.guardianDocMoneyLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
