function localOrGlobalPassportSeries(value, paramz) {
    var passport_type_field_name = paramz[0];
    var passport_value_field_name = paramz[1];
    var passport_type_val = $('#'+passport_type_field_name).val();
    var enablerFunctionName = paramz[2];

    var shouldApplyValidation = true;
    var enablerFunctionDefined = typeof enablerFunctionName !== 'undefined' ? true : false;
    if (enablerFunctionDefined) {
        shouldApplyValidation = window[enablerFunctionName]();
    }
    if (!shouldApplyValidation) {
        return true;
    }

    var mapping = [
        ['1',passport_validation_localPassportSeries,/(^(\d{2}\s?\d{2})$)/],  // Паспорт гражданина Российской Федерации
        ['22',passport_validation_globalPassportSeries,/(^(\d{2})$)/], // Загранпаспорт гражданина Российской Федерации
        //SSSSSSSSSSSSSSSSSSSSSSSSS
        ['2',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Миграционная карта
        ['12',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Временное удостоверение личности гражданина Российской Федерации
        ['13',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Справка об освобождении из мест лишения свободы
        ['14',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Паспорт иностранного гражданина
        ['15',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Вид на жительство
        ['16',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Разрешение на временное проживание
        ['17',certificate_validation_tempCertificateSeries,/(^(.{0,25})$)/],// Удостоверение беженца
        //SSSSSSSSSSSSSSSSSSSSSSSSS
        ['8', birthcertificate_validation_birthCertificateSeries,/(^([I,X,C,V,L,1,У,Х,Л,С]{1}-[А-Я]{2})$)/], // Свидетельство о рождении гражданина
        ['9',passport_validation_militaryPassportSeries,/(^([А-Я]{2})$)/],// Паспорт моряка или удостоверение личности моряка
        ['11',passport_validation_militaryPassportSeries,/(^([А-Я]{2})$)/],// Военный билет
        ['10',passport_validation_militaryPassportSeries,/(^([А-Я]{2})$)/],// Удостоверение личности военнослужащего РФ
        ['18',birthcertificate_validation_birthCertificateSeries,/(^([I,X,C,V,L,1,У,Х,Л,С]{1}-[А-Я]{2})$)/]// Паспорт гражданина СССР образца 1974 года
    ];

    var message = messageByWhitelistRegexpInNumericType(mapping, value, passport_type_val);

    if (message.status=='type_does_not_exist') {
        clearValidationMessage(passport_value_field_name);
        return true;
    } else {
        setValidationMessage(passport_value_field_name,message.isValid,message.message);
    }

    return message.isValid;
}