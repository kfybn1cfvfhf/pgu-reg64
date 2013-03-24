<#--
 # Добавляет следующую валидацию для поля "Дата выдачи":
 #
 # Дата должна принадлежать периоду (Дата рождения заявителя из ЛК + 14 лет, Текущая дата).
 # Если дата рождения заявителя не задана в ЛК, то Дата выдачи должна принадлежать периоду
 # (Текущая дата - 120 лет, Текущая дата).
 # Сообщение при ошибке:
 # "Укажите дату в промежутке с [вычислить дату начала ] по [вычислить дату окончания]"
 #
 # Требует подключения:
 # <script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
 # Требует добавления:
 # <@validation.addvalidatormethod false 'checkIssueDate' 'checkIssueDate(value)' ''/> и
 # validation="checkIssueDate" к полю.
 #-->
<#macro addIssueDateController field_id birth_date_field_id>
function checkRequireElement(msg_type, checkDate, date_birth) {
	setTimeout(function () {
		var current_date = new Date();
		var element = document.getElementById('${field_id}-err');
		var zero = function(num) {
			var s = '0'+num;
			return s.substring(s.length-2);
		};
		var date100 = zero(date_birth.getDate()) + '.' + (zero(date_birth.getMonth()+1)) + '.' + date_birth.getFullYear();
		var currentdate = zero(current_date.getDate()) + '.' + (zero(current_date.getMonth()+1)) + '.' + current_date.getFullYear();
		if (msg_type == "1" || msg_type == "2") {
			$(element).html("Дата должна принадлежать периоду (c " + date100 + " по " + currentdate+")");
		} else
			$(element).html("");
	});
	return true;
};

function isNotNullString(o) {
	return (undefined != o && o != "");
}

function checkIssueDate(value) {
	var birth = $('#${birth_date_field_id}').val();
	var date_birth;
	if(!isNotNullString(birth)){
		date_birth = new Date().addYears(-90);
	} else {
		date_birth = Date.fromString( birth, "dd.mm.yyyy" ).addYears(14);
	}
	var current_date = new Date();
	var isValid1 = true;
	var isValid2 = true;

	if (!/^\s*$/.test(value)) {
		checkDate = Date.fromString( value, "dd.mm.yyyy" );
		if (checkDate < date_birth) {
			isValid1 = false;
		} else if (checkDate > current_date) {
			isValid2 = false;
		}
	}

	if(!isValid1)
		checkRequireElement("1", checkDate, date_birth);
	else if(!isValid2)
		checkRequireElement("2", checkDate, date_birth);
	else checkRequireElement("3", checkDate, date_birth);

	return (isValid1 && isValid2);
};
</#macro>