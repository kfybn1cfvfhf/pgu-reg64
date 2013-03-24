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
    <@html.head title='Информирование о положении на рынке труда в Саратовской области'>
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
            <@sf.serviceStepForm  includeEmptyTr=true>

                <@sf.fldrow>

                <#-- #applLabel-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- #applNoteRO-->
                    <@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании
                        учетной записи на портале и не могут быть изменены.
                        Если в заявлении указаны неверные данные заявителя, необходимо выполнить одно из следующих
                        действий:
                        <br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
                        <br>2. В случае необходимости внести изменения в учетную запись в установленном
                        порядке.</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
            данные из ЛК
            Недоступно для редактирования

            Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"
                    validation="required" attr="readonly='readonly'" wrapperClass="fieldDisabled" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
            данные из ЛК
            Недоступно для редактирования

            Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"
                    validation="required" attr="readonly='readonly'" wrapperClass="fieldDisabled" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"
                    attr="readonly='readonly'" wrapperClass="fieldDisabled" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- #applNoteEdited-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Адрес места жительства
                        (пребывания)</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
                country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
                area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
                country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

                <@sf.fldrow>

                <#-- #applNoteEdited-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Почтовый адрес</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
                country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
                area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
                country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />


                <@sf.fldrow>

                <#-- #applNoteEdited-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты заявителя</h2></@sf.statictext>

                </@sf.fldrow>


                <@sf.fldrow>

                <#-- По умолчанию:
            Данные из ЛК - "Домашний телефон"

            Валидация: phone (перекрыть)-->
                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7"
                    validation="required phone" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию:
            Данные из ЛК

            Валидация: email-->
                    <@sf.label path="form.email" title="Адрес электронной почты:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain"
                    validation="required email" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
