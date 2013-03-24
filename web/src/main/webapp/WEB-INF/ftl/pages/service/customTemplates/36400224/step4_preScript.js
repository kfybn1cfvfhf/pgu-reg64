function he_living_street_type_result_callback(param){
    person_living_street_type_result_callback_template(param,'he_living_street');
}

function she_living_street_type_result_callback(param){
    person_living_street_type_result_callback_template(param,'she_living_street');
}

function person_living_street_type_result_callback_template(param, destFieldName){
    $dest = descriptorTarget(destFieldName);
    var shouldBeReadOnly = (param[0].code == 74);

    $dest.descriptor("setAttribute", "readonly", shouldBeReadOnly);
    if (shouldBeReadOnly) {
        var unrelatedTarget = $("#"+destFieldName);
        //$dest.descriptor("setAttribute", "value", "");
        unrelatedTarget.val('');
        unrelatedTarget.trigger('change');
    }
}