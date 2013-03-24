<#ftl encoding="UTF-8">

<#import "/jquery/validation.ftl" as validation>

<#macro addCustomValidators>

    <#-- license seria-number-->
    function validateLicenseSeriaNumber(value) {
        if (!value) {
            return true;
        }
        var pos = value.indexOf("-");
        return pos > 0 && pos < value.length-1;
    }

    function moreThenNumber(value, params)
    {
        alert(value);
        alert(params);
    }

    function moreThenZero(value)
    {

        if (value > 0)
            return true;
        return false;
    }

    <#-- Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7  -->
    function phoneNumber(value){
        <#-- return /^(((\+7|8)?\(\d{3,5}\)\d{5,7})|((8|\+7)(?=\d{8,12})\d{8,12})|\d{8,12}|)$/.test(value); -->
        return /^((\+7|8)?\(\d{3,5}\)\d{5,7}|)$/.test(value);
    }

    function digitsDash(value){
        return /(^([0-9]+[-]{0,1}[0-9]*)$)/.test(value);
    }


<#-- Проверка валидности ГРН -->
    <@validation.addvalidatormethod false 'grnlegal' 'validateOgrnLegal(value)' 'Введите верный ГРН'/>
    <@validation.addvalidatormethod false 'licenseSeriaNumberValidator' 'validateLicenseSeriaNumber(value)' 'Серия и номер вводятся в формате x-x где x - любой набор букв или цифр'/>
    <@validation.addvalidatormethod true 'moreThenNumber' 'moreThenNumber(value, params)' 'Значение должно быть больше нуля'/>
    <@validation.addvalidatormethod false 'moreThenZero' 'moreThenZero(value)' 'Значение должно быть больше нуля'/>
    <@validation.addvalidatormethod false 'phone' 'phoneNumber(value)' 'Пожалуйста, введите корректное значение, соответствующее формату'/>
    <@validation.addvalidatormethod false 'digitsDash' 'digitsDash(value)' 'Допустимы только цифры и дефис'/>
</#macro>