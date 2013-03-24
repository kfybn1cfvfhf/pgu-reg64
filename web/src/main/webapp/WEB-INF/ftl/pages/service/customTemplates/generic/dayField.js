function isNotNullString(o) {
    return (undefined != o && o != "");
}

function dayField_apply(dayField, monthField, yearField) {
    $("#" + yearField).change(function () {
        $("#" + dayField).val("");
    });

    $("#" + monthField).change(function () {
        $("#" + dayField).val("");
    });

    $("#" + dayField).keyup(function () {
            var day = $('#' + dayField).val();
            var month = $('#' + monthField).val();
            var year = $('#' + yearField).val();
            var date;
            if (/\d+/.test(day)) {
                var day_number = parseInt(day);
                if (day_number < 1) {
                    day_number = 1;
                } else {
                    if (isNotNullString(year) && isNotNullString(month)) {
                        date = new Date()
                        date.setFullYear();
                        date.setFullYear(parseInt(year), parseInt(month) - 1);
                        if (day_number > date.getDaysInMonth()) {
                            day_number = date.getDaysInMonth();
                        }
                    } else {
                        if (day_number > 31) {
                            day_number = 31;
                        }
                    }
                }
                $("#" + dayField).val(day_number);
            } else {
                $("#" + dayField).val("");
            }
        }
    );

    $("#" + dayField).change(function () {
            var day = $('#' + dayField).val();
            var zero = function (num) {
                if (num != 0 && num != "0") {
                    var s = '0' + num;
                    return s.substring(s.length - 2);
                } else {
                    return "";
                }
            };
            if (/\d+/.test(day)) {
                var day_number = parseInt(day);
                $(this).val(zero(day_number));
            }

        }
    );

}




