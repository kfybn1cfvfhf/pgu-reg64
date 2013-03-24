function checkRequireElement(msg_type, date_to, date_birth) {

    var current_date = date_to;
    var message = ""
    var zero = function(num) {
        var s = '0' + num;
        return s.substring(s.length - 2);
    };
    var date100 = zero(date_birth.getDate()) + '.' + (zero(date_birth.getMonth() + 1)) + '.' + date_birth.getFullYear();
    var currentdate = zero(current_date.getDate()) + '.' + (zero(current_date.getMonth() + 1)) + '.' + current_date.getFullYear();

    if (msg_type == "1" || msg_type == "2") {

        message = "Дата должна принадлежать периоду (c " + date100 + " по " + currentdate + ")";
    }


    return message;
};

function isNotNullString(o) {
    return (undefined != o && o != "");
}

function checkDateField(value, params) {
    $('#message').val("")
    var paramsArray = params.split(",")
    var birth_date_field_name = paramsArray[0];
    var year_from_lk = paramsArray[2];
    var year_from = paramsArray[1];
    var year_depends = paramsArray[3];

    var birth = $('#' + birth_date_field_name).val();
    // если дата рождения null, то не валидируем другое поле
    if(birth == undefined || birth == '')
        return true;

    var date_birth;
    if (!isNotNullString(birth)) {
        date_birth = new Date().addYears(parseInt(year_from));
    } else {
        date_birth = Date.fromString(birth, "dd.mm.yyyy").addYears(parseInt(year_from_lk));
    }
    var current_date = new Date().addYears(parseInt(year_depends));
    var isValid1 = true;
    var isValid2 = true;

    if (!/^\s*$/.test(value)) {
        checkDate = Date.fromString(value, "dd.mm.yyyy");
        if (checkDate < date_birth) isValid1 = false;
        else if (checkDate > current_date) isValid2 = false;
        var message = "";
        if (!isValid1) message = checkRequireElement("1", current_date, date_birth);
        else if (!isValid2) message = checkRequireElement("2", current_date, date_birth);
        else checkRequireElement("3", checkDate, date_birth);
        if (!isValid1 || !isValid2) {

            $('#message').val(message);
        }
    }

    return  isValid1 && isValid2;
}
;
function checkDateFieldRelative(value, params) {
    $('#message').val("")
    var paramsArray = params.split(",")
    var relative_field_name = paramsArray[0];
    var year_to = paramsArray[1];
    var year_from = paramsArray[2];

    var birth = $('#' + relative_field_name).val();
    var date_birth = Date.fromString(birth, "dd.mm.yyyy");
    var date_to = new Date().addYears(parseInt(year_to));
    var current_date = new Date();
    var isValid1 = true;
    var msgType = "3";
    var date_from = new Date().addYears(parseInt(year_from));
    if (!/^\s*$/.test(value)) {
        var checkDate = Date.fromString(value, "dd.mm.yyyy");
        if (checkDate > date_birth) {
            isValid1 = false;
            msgType = "1";
        }
        else if (checkDate > date_to) {
            isValid1 = false;
            msgType = "1";
        }
        else if (checkDate > current_date) {
            isValid1 = false;
            msgType = "1";
        }
        else if (checkDate < date_from) {
            isValid1 = false;
            msgType = "1";
        }
    }
    var message = "";
    if (!isValid1) {
        if (birth < year_to) {
            message = checkRequireElement(msgType, birth, date_from);
        } else {
            message = checkRequireElement(msgType, date_to, date_from);
        }
        $('#message').val(message);
    }


    return  isValid1;
}
;
function validateMessage() {

    return  $("#message").val();

}