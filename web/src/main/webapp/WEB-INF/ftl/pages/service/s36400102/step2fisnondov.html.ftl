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
    <@html.head title='Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам'>
        <@script.scripttag>
        var IdentityDocTypeCurrentValue;
        function identityDocTypeChenge () {
        if(IdentityDocTypeCurrentValue != $('#identityDocType').attr('value')) {
        $('#passSeria').attr('value', '');
        $('#passNo').attr('value','');
        $('#passFrom').attr('value','');
        $('#passDate').attr('value','');
        }
        IdentityDocTypeCurrentValue = $('#identityDocType').attr('value');
        }
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.setVisibleByValue 'true' 'identityDocType' 'change' 'otherDocTypeName' '5' />
                <@action.unsetDisabledByValue onload="true" srcid="identityDocType" event="change" value="5" destid="otherDocTypeName"  />

                <@action.setRequiredIf 'true' 'identityDocType' 'change' 'passSeria' '1,3,4'/>
                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passSeria' value='1' rules='digitsexact' validationAttr = {"digitsexact":"4"}/>
                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passSeria' value='3' rules='invaluelist' validationAttr={"invaluelist":"80,81,82,83"} validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>

                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passNo' value='1' rules='digitsexact' validationAttr = {"digitsexact":"6"}/>
                <@action.applyValidationIf onload='true' srcid='identityDocType' event='change' destid='passNo' value='2,3' rules='digitsexact' validationAttr = {"digitsexact":"7"}/>
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
                    <@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании
                        учетной записи на портале и не могут быть изменены.
                        Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
                        <br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
                        <br>2. В случае необходимости внести изменения в учетную запись в установленном
                        порядке.</i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.snils" title="СНИЛС:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.snils" qtip="" attr='readonly="true"' wrapperClass='fieldDisabled' validation="required snils" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании
                        учетной записи на портале.
                        Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.email" validation="email" qtip="Вносится в формате: name@site.domain"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации заявителя по месту
                        жительства</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='residenceAddressCountry' countryCode='residenceAddressCountryCode' input='residenceAddressEnterType'
                country_input='residenceAddressCountryInput' settlementRF='residenceAddressSettlementDict' streetRF='residenceAddressStreetDict'
                area='residenceAddressRayon' region='residenceAddressRegion' settlement_type='residenceAddressSettlementType'
                country_settlement='residenceAddressCountrySettlement' settlement='residenceAddressSettlementText' city='residenceAddressCity'
                street='residenceAddressStreetText' house='residenceAddressHouse' corp='residenceAddressKorpus' flat='residenceAddressFlat' post="residenceAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации заявителя по месту
                        пребывания</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='stayAddressCountry' countryCode='stayAddressCountryCode' input='stayAddressEnterType'
                country_input='stayAddressCountryInput' settlementRF='stayAddressSettlementDict' streetRF='stayAddressStreetDict'
                area='stayAddressRayon' region='stayAddressRegion' settlement_type='stayAddressSettlementType'
                country_settlement='stayAddressCountrySettlement' settlement='stayAddressSettlementText' city='stayAddressCity'
                street='stayAddressStreetText' house='stayAddressHouse' corp='stayAddressKorpus' flat='stayAddressFlat' post="stayAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о фактическом месте проживания заявителя</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='factAddressCountry' countryCode='factAddressCountryCode' input='factAddressEnterType'
                country_input='factAddressCountryInput' settlementRF='factAddressSettlementDict' streetRF='factAddressStreetDict'
                area='factAddressRayon' region='factAddressRegion' settlement_type='factAddressSettlementType'
                country_settlement='factAddressCountrySettlement' settlement='factAddressSettlementText' city='factAddressCity'
                street='factAddressStreetText' house='factAddressHouse' corp='factAddressKorpus' flat='factAddressFlat' post="factAddressIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе,
                        удостоверяющем личность заявителя</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.identityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.otherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.otherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением
                        электронной копии документа.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF,
                        DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный
                        графический образ соответствующего бумажного документа, заверенного надлежащим образом и
                        снабженного всеми необходимыми подписями и печатями.
                    </i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.identityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
