function fio_change() {
    var value = this.value;
    var fistLetter = value.substring(0, 1);
    var otherLetters = value.substring(1);
    $('#' + this.id).val(fistLetter.toUpperCase() + otherLetters.toLowerCase());
}