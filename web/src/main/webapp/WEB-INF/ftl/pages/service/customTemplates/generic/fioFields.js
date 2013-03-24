<!-- JS header fio_fields_inc -->
function fioFields_apply() {
    for (var i = 0; i < arguments.length; i++) {
        $("#"+arguments[i]).keyup(function() {
            var curVal = $(this).val().replace(/\s+/, ' ').replace(/[-]+/, '-');
            var firstLetter = curVal.substring(0, 1).toUpperCase();
            var remaining = curVal.substr(1).toLowerCase();
            for (var i = 0; i < remaining.length; i++) {
                var chr = remaining.charAt(i);
                if ((chr == "-" || chr == " ") && i != (remaining.length - 1)) {
                    remaining = remaining.substr(0, i + 1) + remaining.charAt(i + 1).toUpperCase() + remaining.substr(i + 2);
                }
            }
            $(this).val(firstLetter + remaining);
        });
    }
}
<!-- end of JS header fio_fields_inc -->
