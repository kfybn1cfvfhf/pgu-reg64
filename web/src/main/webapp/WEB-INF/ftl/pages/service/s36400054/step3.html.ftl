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
    <@html.head title='Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей'>
        <@script.scripttag>
            <@jquery.onready>

            <#--включение поле recipientOtherDocTypeName, если выбран тип документа 5-->
                <@action.setVisibleByValue onload='true' srcid='recipientIdentityDocType' event='change' destid='recipientOtherDocTypeName' value='5'/>

            <#--переключение свойств полей, описывающих документ-->
                <@action.setVisibleByValue 'true' 'recipientIdentityDocType' 'change' 'recipientOtherDocTypeName' '5'/>
                <@action.unsetRequiredByField 'true' 'recipientIdentityDocType' 'change' 'recipientPassSeria' '2,5'/>
                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassSeria' '1' 'digitsexact' '4'/>
                <@action.applyValidationIf onload='true' srcid='recipientIdentityDocType' event='change' destid='recipientPassSeria' value='3' rules='invaluelist'
                validationAttr={"invaluelist":"80,81,82,83"}
                validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassNo' '1' 'digitsexact' '6'/>
                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassNo' '2,3' 'digitsexact' '7'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о лице, нуждающемся в
                        услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
                    <@sf.label path="form.recipientBirthDate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.recipientBirthDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- блок: rec_statAddressRegAppl-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации
                        заявителя:</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='rec_addressCountry' countryCode='rec_addressCountryCode' input='rec_addressEnterType'
                country_input='rec_addressCountryInput' settlementRF='rec_addressSettlementDict' streetRF='rec_addressStreetDict'
                area='rec_addressRayon' region='rec_addressRegion' settlement_type='rec_addressSettlementType'
                country_settlement='rec_addressCountrySettlement' settlement='rec_addressSettlementText' city='rec_addressCity'
                street='rec_addressStreetText' house='rec_addressHouse' corp='rec_addressKorpus' flat='rec_addressFlat' post="rec_addressIndex"  />

                <@sf.fldrow>

                <#-- блок: rec_statAddressResStAppl-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания)
                        заявителя:</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='rec_factAddressCountry' countryCode='rec_factAddressCountryCode' input='rec_factAddressEnterType'
                country_input='rec_factAddressCountryInput' settlementRF='rec_factAddressSettlementDict' streetRF='rec_factAddressStreetDict'
                area='rec_factAddressRayon' region='rec_factAddressRegion' settlement_type='rec_factAddressSettlementType'
                country_settlement='rec_factAddressCountrySettlement' settlement='rec_factAddressSettlementText' city='rec_factAddressCity'
                street='rec_factAddressStreetText' house='rec_factAddressHouse' corp='rec_factAddressKorpus' flat='rec_factAddressFlat' post="rec_factAddressIndex"  />

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем
                        личность лица, нуждающегося в услуге</h2></@sf.statictext>

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
1. При выборе значения из справочника 5 отображается поле #recipientOtherDocTypeName-->
                    <@sf.label path="form.recipientIdentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.recipientIdentityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Скрыт

Логика:
1. Отображается при выборе значения  5 из справочника #recipientIdentityDocType
Разработчику: При интеграции передавать в параметре recipientIdentityDocType-->
                    <@sf.label path="form.recipientOtherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientOtherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен при выборе из справочника #recipientIdentityDocType значений 1,3,4
2. Не обязателен при выборе из справочника #recipientIdentityDocType значений 2,5
3. При выборе из справочника #recipientIdentityDocType значения 1, валидация: 4 цифры
4. При выборе из справочника #recipientIdentityDocType значения 3, валидация: допустимо для ввода 80 или 81 или 82 или 83
5. При выборе из справочника #recipientIdentityDocType значения 2,4,5, валидация отсутствует-->
                    <@sf.label path="form.recipientPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientPassSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен всегда
2. При выборе из справочника #recipientIdentityDocType значения 1, валидация: 6 цифр
3. При выборе из справочника #recipientIdentityDocType значения 2 или 3, валидация: 7 цифр
4. При выборе из справочника #recipientIdentityDocType значения 4,5, валидация отсутствует-->
                    <@sf.label path="form.recipientPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.recipientPassNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен всегда-->
                    <@sf.label path="form.recipientPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.recipientPassDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен всегда-->
                    <@sf.label path="form.recipientPassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.recipientPassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной
                        копии документа.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.recipientIdentityDocLoad" title="Документ, удостоверяющий личность лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.recipientIdentityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
