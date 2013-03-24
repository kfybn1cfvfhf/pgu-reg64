$("#addr_agency").keyup(function () {
    if (!this.value) {
        setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "disabled", true);');
    } else if ($("#addr_agency_street_type").val() == "1") {
        setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "disabled", true);');
    } else {
        setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "enabled", true);');
    }
});