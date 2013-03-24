function isNotNullString(o) {
    return (undefined != o && o != "");
}

function threeFieldsDateLessThenNow_check(msg_type, current_field) {
    setTimeout(function () {
            var current_date = new Date();
            var element = document.getElementById(current_field + '-err');
            var zero = function (num) {
                var s = '0' + num;
                return s.substring(s.length - 2);
            };
            var edgeDate = zero(current_date.getDate()) + '.' + (zero(current_date.getMonth() + 1)) + '.' + current_date.getFullYear();
            if (msg_type == "1") {
                $(element).html("Необходимо указать дату меньшую чем " + edgeDate);
            } else $(element).html("");
        }
    );
    return true;
}

function threeFieldsDateLessThenNow(value, paramz) {
    var date_day_field = paramz[0];
    var date_month_field = paramz[1];
    var date_year_field = paramz[2];

    var date_day = $('#' + date_day_field).val();
    var date_month = $('#' + date_month_field).val();
    var date_year = $('#' + date_year_field).val();
    var current_date = new Date();
    var rezult = true;
    if (isNotNullString(date_year)) {
        if (current_date.getFullYear() < parseInt(date_year)) {
            threeFieldsDateLessThenNow_check("1", date_year_field);
            rezult = false;
        } else {
            if (current_date.getFullYear() == parseInt(date_year) && isNotNullString(date_month)) {
                if (current_date.getMonth() + 1 < parseInt(date_month)) {
                    threeFieldsDateLessThenNow_check("1", date_month_field);
                    rezult = false;
                } else {
                    if (current_date.getMonth() + 1 == parseInt(date_month) && isNotNullString(date_day)) {
                        if (current_date.getDate() < parseInt(date_day)) {
                            threeFieldsDateLessThenNow_check("1", date_day_field);
                            rezult = false;
                        }
                    }
                }
            }
        }
    }
    if (rezult == true) {

        if (isNotNullString(date_year)) {
            threeFieldsDateLessThenNow_check("2", date_year_field);
            if (isNotNullString(date_month)) {
                threeFieldsDateLessThenNow_check("2", date_month_field);
                if (isNotNullString(date_day)) {
                    threeFieldsDateLessThenNow_check("2", date_day_field);
                }
            }
        }
    }
    return rezult;

}
