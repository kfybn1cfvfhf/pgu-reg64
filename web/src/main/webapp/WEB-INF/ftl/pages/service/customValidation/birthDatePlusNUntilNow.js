function isNotNullString(o){
    return (undefined != o && o!="");
}

function birthDatePlusNUntilNow_checkDate(msg_type, checkDate, date_birth, dest_date_field_name){
    setTimeout( function () {
            var current_date = new Date();
            var element = document.getElementById(dest_date_field_name+'-err');
            var zero = function(num) {
                var s = '0'+num;
                return s.substring(s.length-2);
            };
            var date100 = zero(date_birth.getDate())+'.'+(zero(date_birth.getMonth()+1))+'.'+date_birth.getFullYear();
            var currentdate = zero(current_date.getDate())+'.'+(zero(current_date.getMonth()+1))+'.'+current_date.getFullYear();
            if(msg_type == "1" || msg_type == "2") {
                $(element).html("Необходимо указать дату в промежутке с " + date100 + " по " + currentdate);
            } else $(element).html("");
        }
    );
    return true;
}

function birthDatePlusNUntilNow(value, paramz) {
    var birth_date_field_name = paramz[0];
    var dest_date_field_name = paramz[1];
    var birth_date_plus_value = parseInt(paramz[2]);

    var birth = $('#'+birth_date_field_name).val();

    var date_birth;
    if(!isNotNullString(birth)){
        date_birth = new Date().addYears(-120);
    }else{
        date_birth = Date.fromString( birth, "dd.mm.yyyy" ).addYears(birth_date_plus_value);
    }
    var current_date = new Date();
    var isValid1 = true;
    var isValid2 = true;
    var checkDate;
    if (!/^\s*$/.test(value))
    {
        checkDate = Date.fromString( value, "dd.mm.yyyy" );
        if(checkDate < date_birth) isValid1 = false;
        else if(checkDate > current_date) isValid2 = false;
    }

    if(!isValid1) { birthDatePlusNUntilNow_checkDate("1", checkDate, date_birth, dest_date_field_name);}
    else if(!isValid2) { birthDatePlusNUntilNow_checkDate("2", checkDate, date_birth, dest_date_field_name);}

    if (isValid1 && isValid2) {birthDatePlusNUntilNow_checkDate("3", checkDate, date_birth, dest_date_field_name);}

    return  isValid1 && isValid2;
}
