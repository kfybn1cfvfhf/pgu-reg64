function isNotNullString(o){
    return (undefined != o && o!="");
}

function firstDatePlusNUntilLastDatePlusM_checkDate(msg_type, checkDate, first_date, last_date, dest_date_field_name){
    setTimeout( function () {

            var element = document.getElementById(dest_date_field_name+'-err');
            var zero = function(num) {
                var s = '0'+num;
                return s.substring(s.length-2);
            };
            var date100 = zero(first_date.getDate())+'.'+(zero(first_date.getMonth()+1))+'.'+first_date.getFullYear();
            var date200 = zero(last_date.getDate())+'.'+(zero(last_date.getMonth()+1))+'.'+last_date.getFullYear();
            if(msg_type == "1" || msg_type == "2") {
                $(element).html("Необходимо указать дату в промежутке с " + date100 + " по " + date200);
            } else $(element).html("");
        }
    );
    return true;
}

function firstDatePlusNUntilLastDatePlusM(value, paramz) {
    //Откуда читать валидирующуюся дату (id поля)
    var dest_date_field_name = paramz[0];
    //Откуда читать левый конец интервала времени (id поля)
    var first_date_field_name = paramz[1];
    //Откуда читать правый конец интервала времени (id поля)
    var last_date_field_name = paramz[2];
    //Сколько плюсовать к левому концу интервала
    var date_plus_n = parseInt(paramz[3]);
    //Сколько плюсовать к правому концу интервала
    var date_plus_m = parseInt(paramz[4]);
    //Опционально: если левый конец не определен, он будет равен текущей дате со сдвигом на этот аргумент
    var shift_left_side_if_undefined_value = valueOfOptionalParam(paramz[5],'-120','integer');
    //Опционально: если правый конец не определен, он будет равен текущей дате со сдвигом на этот аргумент
    var shift_right_side_if_undefined_value = valueOfOptionalParam(paramz[6],'0','integer');

    //Вычислим абсолютные значения "сдвинутых" дат, для случая когда один из концов временного интервала не определен
    var right_side_shifted_value = new Date().addYears(shift_left_side_if_undefined_value);
    var left_side_shifted_value = new Date().addYears(shift_right_side_if_undefined_value);

    //Маничской функцией вытянем даты. Значения по умолчанию - "сдвинутые" даты
    var first_date_o = parseSpecialDate(first_date_field_name, right_side_shifted_value);
    var last_date_o = parseSpecialDate(last_date_field_name, left_side_shifted_value);

    //Для любых дат, кроме "сдвинутых" нужно приплюсовать сдвиги
    if (!first_date_o.isUndefinedField) {
        first_date_o.value = first_date_o.value.addYears(date_plus_n);
    }
    if (!last_date_o.isUndefinedField) {
        last_date_o.value = last_date_o.value.addYears(date_plus_m);
    }

    //Переложим занчения обсчитанных дат в отдельные переменные.
    //На самом деле, можно было продолжать использовать объект типа SpecialDate, но в таком виде
    //можно без изменений использовать тот алгоритм, что был раньше.
    var first_date = first_date_o.value;
    var last_date = last_date_o.value;

    var isValid1 = true;
    var isValid2 = true;
    var checkDate;
    if (!/^\s*$/.test(value))
    {
        checkDate = Date.fromString( value, "dd.mm.yyyy" );
        if(checkDate < first_date) isValid1 = false;
        else if(checkDate > last_date) isValid2 = false;
    }

    if(!isValid1) { firstDatePlusNUntilLastDatePlusM_checkDate("1", checkDate, first_date,last_date, dest_date_field_name);}
    else if(!isValid2) { firstDatePlusNUntilLastDatePlusM_checkDate("2", checkDate, first_date,last_date, dest_date_field_name);}

    if (isValid1 && isValid2) {firstDatePlusNUntilLastDatePlusM_checkDate("3", checkDate, first_date,last_date, dest_date_field_name);}

    return  isValid1 && isValid2;
}
