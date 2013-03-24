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
    <@html.head title='Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
            <#--переключение свойств полей, описывающих документ-->
                <@action.setVisibleByValue 'true' 'identityDocType' 'change' 'otherDocTypeName' '5'/>
                <@action.unsetRequiredByField 'true' 'identityDocType' 'change' 'passSeria' '2,5'/>
                <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passSeria' '1' 'digitsexact' '4'/>
                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passSeria' value='3' rules='invaluelist'
                validationAttr={"invaluelist":"80,81,82,83"}
                validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '1' 'digitsexact' '6'/>
                <@action.applyValidationIf 'true' 'identityDocType' 'change' 'passNo' '2,3' 'digitsexact' '7'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об уполномоченном
                        представителе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных
                        копий документов.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.dovDovLoad" title="Нотариально заверенная доверенность на совершение действий от имени заявителя:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.dovDovLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.dovPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.dovPasLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
                    <@sf.label path="form.birthdate" title="Дата рождения заявителя:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
                    <@sf.datefield path="form.birthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- блок: statAddressRegAppl-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации
                        заявителя:</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressCountry' countryCode='addressCountryCode' input='addressEnterType'
                country_input='addressCountryInput' settlementRF='addressSettlementDict' streetRF='addressStreetDict'
                area='addressRayon' region='addressRegion' settlement_type='addressSettlementType'
                country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                street='addressStreetText' house='addressHouse' corp='addressKorpus' flat='addressFlat' post="addressIndex"  />

                <@sf.fldrow>

                <#-- блок: statAddressResStAppl-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания)
                        заявителя:</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
                country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
                area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
                country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

                <@sf.fldrow>

                <#-- По умолчанию: не заполнено

Валидация: phone (перекрыть)-->
                    <@sf.label path="form.phone" title="Контактный телефон (домашний):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="phone" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не заполнено
Валидация: phone (перекрыть)-->
                    <@sf.label path="form.phoneWork" title="Контактный телефон (рабочий):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.phoneWork" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="phone" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не заполнено
Валидация: email-->
                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем
                        личность заявителя:</h2></@sf.statictext>

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
                    <@sf.dictionaryLookup path="form.identityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Скрыт

Логика:
1. Отображается при выборе значения  5 из справочника #identityDocType

Разработчику: При интеграции передавать в параметре identityDocType-->
                    <@sf.label path="form.otherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
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
                    <@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен всегда
2. При выборе из справочника #identityDocType значения 1, валидация: 6 цифр
3. При выборе из справочника #identityDocType значения 2 или 3, валидация: 7 цифр
4. При выборе из справочника #identityDocType значения 4,5, валидация отсутствует-->
                    <@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен всегда-->
                    <@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Логика:
1. Обязателен всегда-->
                    <@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>

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
                    <@sf.label path="form.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.identityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
