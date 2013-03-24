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
    <@html.head title='Назначение гражданам, имеющим звание «Почетный гражданин Саратовской области», денежных компенсаций расходов по оплате проезда'>
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

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о лице, нуждающемся в
                        услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
                    <@sf.label path="form.recipientbirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
                    <@sf.datefield path="form.recipientbirthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- блок: recipientadress-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте регистрации лица,
                        нуждающегося в услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='recipientaddressCountry' countryCode='recipientaddressCountryCode' input='recipientaddressEnterType'
                country_input='recipientaddressCountryInput' settlementRF='recipientaddressSettlementDict' streetRF='recipientaddressStreetDict'
                area='recipientaddressRayon' region='recipientaddressRegion' settlement_type='recipientaddressSettlementType'
                country_settlement='recipientaddressCountrySettlement' settlement='recipientaddressSettlementText' city='recipientaddressCity'
                street='recipientaddressStreetText' house='recipientaddressHouse' corp='recipientaddressKorpus' flat='recipientaddressFlat' post="recipientaddressIndex"  />

                <@sf.fldrow>

                <#-- блок: recipientFactAdress-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте жительства (пребывания) лица, нуждающегося в услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='recipientFactAdressCountry' countryCode='recipientFactAdressCountryCode' input='recipientFactAdressEnterType'
                country_input='recipientFactAdressCountryInput' settlementRF='recipientFactAdressSettlementDict' streetRF='recipientFactAdressStreetDict'
                area='recipientFactAdressRayon' region='recipientFactAdressRegion' settlement_type='recipientFactAdressSettlementType'
                country_settlement='recipientFactAdressCountrySettlement' settlement='recipientFactAdressSettlementText' city='recipientFactAdressCity'
                street='recipientFactAdressStreetText' house='recipientFactAdressHouse' corp='recipientFactAdressKorpus' flat='recipientFactAdressFlat' post="recipientFactAdressIndex"  />

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о паспорте лица, нуждающегося в
                        услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидация: 4 цифры-->
                    <@sf.label path="form.recipientPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>

                <#-- Валидация: 4 цифры-->
                    <@sf.textfield  path="form.recipientPassSeria" qtip="" validation="digitsexact required" validationattr={'digitsexact':4} style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидация: 6 цифр-->
                    <@sf.label path="form.recipientPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>

                <#-- Валидация: 6 цифр-->
                    <@sf.textfield  path="form.recipientPassNo" qtip="" validation="digitsexact required" validationattr={'digitsexact':6} style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.recipientPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.datefield path="form.recipientPassDate"  qtip="" validation="required" style="text-align:left;" colspan="7"/>

                    <@sf.empty colspan="24"/>

                </@sf.fldrow>

                <@sf.fldrow>

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
                    <@sf.label path="form.recipientIdentityDocLoad" title="Паспорт лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.recipientIdentityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
