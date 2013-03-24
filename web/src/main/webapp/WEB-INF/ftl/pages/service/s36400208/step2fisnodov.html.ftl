<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "/blocks/fisblocks/identityDocBlock.ftl" as identityDoc>
<#import "/blocks/fisblocks/fioblock.ftl" as fio>
<#import "../../../macros/address.ftl" as address>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление в соответствии с законодательством земельных участков, находящихся в государственной собственности Саратовской области'>
        <@script.scripttag>

        var IdentityDocTypeCurrentValue;

        function identityDocTypeChenge () {
        if(IdentityDocTypeCurrentValue != $('#identityDocBlock\\.identityDocType').attr('value')) {
        $('#identityDocBlock\\.passSeria').attr('value', '');
        $('#identityDocBlock\\.passNo').attr('value','');
        $('#identityDocBlock\\.passFrom').attr('value','');
        $('#identityDocBlock\\.passDate').attr('value','');
        }
        IdentityDocTypeCurrentValue = $('#identityDocBlock\\.identityDocType').attr('value');
        }

            <@jquery.onready>
                <@customValidators.addCustomValidators />

            $('#identityDocBlock\\.identityDocType').change(function() { identityDocTypeChenge () });



                <@action.setVisibleByValue 'true' 'identityDocBlock\\.identityDocType' 'change' 'otherDocTypeName' '5' />
                <@action.setRequiredIf 'true' 'identityDocBlock\\.identityDocType' 'change' 'identityDocBlock\\.passSeria' '1,3,4'/>

                <@action.applyValidationIf onload='true' srcid='identityDocBlock\\.identityDocType' event='change' destid='identityDocBlock\\.passSeria' value='1' rules='digitsexact' validationAttr = {"digitsexact":"4"}/>

                <@action.applyValidationIf onload='true' srcid='identityDocBlock\\.identityDocType' event='change' destid='identityDocBlock\\.passSeria' value='3' rules='invaluelist' validationAttr={"invaluelist":"80,81,82,83"} validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>

                <@action.applyValidationIf onload='true' srcid='identityDocBlock\\.identityDocType' event='change' destid='identityDocBlock\\.passNo' value='1' rules='digitsexact' validationAttr = {"digitsexact":"6"}/>
                <@action.applyValidationIf onload='true' srcid='identityDocBlock\\.identityDocType' event='change' destid='identityDocBlock\\.passNo' value='2,3' rules='digitsexact' validationAttr = {"digitsexact":"7"}/>

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

                <@fio.fioBlock {"readonly": true} />

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании
                        учетной записи на портале. Могут быть изменены в ходе заполнения формы
                        заявления.</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты
                    заявителя</h2></@sf.statictext></@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о почтовом адресе
                    заявителя</h2></@sf.statictext></@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressPostCountry' countryCode='addressPostCountryCode' input='addressPostEnterType'
                country_input='addressPostCountryInput' settlementRF='addressPostSettlementDict' streetRF='addressPostStreetDict'
                area='addressPostRayon' region='addressPostRegion' settlement_type='addressPostSettlementType'
                country_settlement='addressPostCountrySettlement' settlement='addressPostSettlementText' city='addressPostCity'
                street='addressPostStreetText' house='addressPostHouse' corp='addressPostKorpus' flat='addressPostFlat' post="addressPostIndex"  />

                <@sf.fldrow><@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе,
                    удостоверяющем личность заявителя</h2></@sf.statictext></@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocBlock.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.identityDocBlock.identityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.otherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.otherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>


                <@sf.fldrow>
                    <@sf.label path="form.identityDocBlock.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.identityDocBlock.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocBlock.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.identityDocBlock.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocBlock.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.datefield path="form.identityDocBlock.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.identityDocBlock.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.identityDocBlock.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле
                        предназначено для представления вместе с заявлением электронной копии документа. Электронная
                        копия каждого документа должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX,
                        JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ
                        соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.</i></@sf.statictext>
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