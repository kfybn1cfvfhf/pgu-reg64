function isNotNullString(o){
    return (undefined != o && o!="");
}

function ErrorMessage(isValid,message,status) {
    this.message = message;
    this.isValid = isValid;
    this.status = status;
}

function SpecialDate(value,isDefault,isField,isUndefinedField,isRuntimeConstant,isPlainDate,cantParse) {
    this.value = value;
    this.isDefault = isDefault;
    this.isField = isField;
    this.isUndefinedField = isUndefinedField;
    this.isRuntimeConstant = isRuntimeConstant;
    this.isPlainDate = isPlainDate;
    this.cantParse = cantParse;
}

/*
 Mapping is array of the following structures:
 [type of records to be processed with this validation,
 message that should be displayed if record is not valid,
 all other params are whitelisted regular expressions]

 acceptEmpty is boolean, indicating that any empty string will not cause validation error.
 default value of acceptEmpty is true, allowing validation="required" to handle empty strings
 */
function messageByWhitelistRegexpInNumericType(mapping, value, type, acceptEmpty) {
    var acceptEmpty = valueOfOptionalParam(acceptEmpty,true,'no_convert');
    if ("" == value && true == acceptEmpty) {
        return new ErrorMessage(true,'','');
    }

    var typeFound = false;
    for(var i=0; i<mapping.length; i++) {
        var currItem = mapping[i];
        var currType = currItem[0];
        if (type==currType) {
            typeFound = true;
            var currMessage = currItem[1];
            var itemFound = false;
            if (currItem.length>=3) {
                for (var n=2; n < currItem.length; n++) {
                    var currRegexp = currItem[n];
                    if (currRegexp.test(value)) {
                        itemFound = true;
                        break;
                    }
                }
            }
            if (itemFound==true) {
                return new ErrorMessage(true,'','');
            } else {
                return new ErrorMessage(false,currMessage,'');
            }
        }
    }

    //typeNotFoundInBindingMessage = typeof typeNotFoundInBindingMessage !== 'undefined' ? typeNotFoundInBindingMessage : 'Введите правильное значение поля';
    return new ErrorMessage(false,currMessage,'type_does_not_exist');
}

function setValidationMessage(elementId, elementValueIsValid, messageIfValueIsInvalid) {
    setTimeout( function () {
            var errElementId = elementId+'-err';
            var errElement = $('#'+errElementId);
            if(!elementValueIsValid) {
                $(errElement).html(messageIfValueIsInvalid);
            } else $(errElement).html("");
        }
    );
    return true;
}

function clearValidationMessage(elementId) {
    if (typeof elementId !== 'undefined') {
        setTimeout(
            function () {
                var errElementId = elementId+'-err';
                var errElement = $('#'+errElementId);
                if (typeof errElement !== 'undefined') {
                    $(errElement).html("");
                }
            }
        )
    }
    return true;
}

function callOnChange(elementId) {
    if (typeof elementId !== 'undefined') {
        var currElement = $('#'+elementId);
        if (typeof currElement !== 'undefined') {
            currElement.trigger('change');
        }
    }
}

function clearValidationMessageOnChange(changedElements,validatedElements) {
    for (var i=0; i<changedElements.length; i++) {
        var changedElement = changedElements[i];
        if (typeof changedElement !== 'undefined') {
            var bindedElement = $('#'+changedElement);
            if (typeof bindedElement !== 'undefined') {
                bindedElement.bind('change', function(){
                    for (var i=0; i<validatedElements.length; i++) {
                        var currValidatedElementId = validatedElements[i];
                        clearValidationMessage(currValidatedElementId);
                        callOnChange(currValidatedElementId);
                    }
                });
            }
        }
    }
}

/*
Сконвертировать строку в булевское значение
 */
function stringToBoolean(string){
    switch(string.toLowerCase()){
        case "true": case "yes": case "1": return true;
        case "false": case "no": case "0": case null: return false;
        default: return Boolean(string);
    }
}

/*
Сконвертировать строку в число.
 */
function stringToInteger(string) {
    return parseInt(string);
}

/*
Сконвертировать значение строки string в нужный тип type.
Значения типа type можно посмотреть в коде метода.
Если тип не распознан, возвращается изначальное значение.
 */
function stringToType(obj,type) {
    var result = undefined;
    var type = type.toLowerCase();

    if ('no_convert'==type) {
        return obj;
    }
    if ('string'==type) {
        result = obj;
    } else
    if ('integer'==type) {
        result = stringToInteger(obj);
    } else
    if ('boolean'==type) {
        result = stringToBoolean(obj);
    } else {
        result = obj;
    }

    return result;
}

/*
Определить, можно ли сконвертировать dateFieldValue в дату.
datePattern - опциональный параметр с выставленным значением по-умолчанию.
 */
function canBeParsedToDate(dateFieldValue, datePattern) {
    var datePattern = valueOfOptionalParam(datePattern,"dd.mm.yyyy",'string');
    var resultOfParsing = Date.fromString( dateFieldValue, datePattern );
    if (false == resultOfParsing) {
        return false;
    } else {
        return true;
    }
}

/*
Определить, существует ли найденный элемент (jQuery).
 */
function jqElementExists(elementObject) {
    var result = (elementObject.length>0);
    return result;
}

/*
Определить, есть ли на странице элемент с нужным id=elementId. (jQuery)
 */
function elementWithIdExists(elementId) {
    var elementObject = $("#" + elementId);
    var result = jqElementExists(elementObject);
    return result;
}

/*
Получить значение опционального параметра optionalParameter.
Если параметр не указан - в качестве значения по умолчанию использовать defaultValue.
Перед возвращением результата сконвертировать в нужный тип (см. описание stringToType)
 */
function valueOfOptionalParam(optionalParameter,defaultValue,convertToType) {
    var paramDefined = typeof optionalParameter !== 'undefined' ? true : false;

    if (paramDefined) {
        result = optionalParameter;
    } else {
        result = defaultValue;
    }

    result = stringToType(result,convertToType);
    return result;
}

/*
Угадать, что представлят из себя первый параметр и попытаться извлечь из него дату.
Когда хочется добавить еще одну "магическую константу", лучше расширить эту функцию, чем писать еще один if в коде услуги.

1) Если specialDate - зарезервированное слово типа "currentDate", оно возвращает соответствующую дату и выставляет флаг isRuntimeConstant.
2) Если specialDate не найден в списке зарезервированных кейвордов, оно ищет поле с таким id, парсит и возвращает его значение, выставляя флаг isField.
   Если поле найдено, но в нем - пустота, то возвращается defaultValue и выставляются флаги isField, isDefault и isUndefinedField.
3) Если specialDate - не кейворд и не поле на форме, оно пытается распарсить его как дату, возвращает Date и выставляет флаг isPlainDate.
4) Если specialDate - ни одно из вышеперечисленных, оно возвращает specialDate и выставляет флаг cantParse.
 */
function parseSpecialDate(specialDate,defaultValue) {
    var resultValue = undefined;
    var resultIsDefault = false;
    var resultIsField = false;
    var resultIsUndefinedField = false;
    var resultIsRuntimeConstant = false;
    var resultIsPlainDate = false;
    var resultCantParse = false;

    if(specialDate === "currentDate") {
        resultIsRuntimeConstant = true;
        resultValue = new Date();
    } else
    if (elementWithIdExists(specialDate)){
        var dateFieldValue = $('#'+specialDate).val();
        if(!isNotNullString(dateFieldValue)){
            resultIsField = true;
            resultIsUndefinedField = true;
            resultIsDefault = true;
            resultValue = defaultValue;
        }else{
            resultIsField = true;
            resultValue = Date.fromString( dateFieldValue, "dd.mm.yyyy" );
        }
    } else
    if (canBeParsedToDate(specialDate)) {
        resultIsPlainDate = true;
        resultValue = specialDate;
    } else {
        resultCantParse = true;
        resultValue = specialDate;
    }

    var result = new SpecialDate(resultValue, resultIsDefault, resultIsField, resultIsUndefinedField, resultIsRuntimeConstant, resultIsPlainDate, resultCantParse);
    return result;
}

function extractValueFromWidget(srcid) {
    //Элемент-источник
    var $src = $(document.getElementById(srcid));
    //Тип элемента-иточника
    var inputType = $src.attr("type");
    //Ищем тип в таблице соответствий,
    //исходя из него заполняем переменную v (значение источника)
    switch (inputType) {
        case 'textarea':
            v = $src.val().toUpperCase();
            break;
        case 'text':
        case 'select-one':
            v = $src.val().toUpperCase();
            break;
        case 'hidden':
            v = $src.val().toUpperCase();
            break;
        case 'checkbox':
            var isString= (value.indexOf('on') != -1)  || (value.indexOf('off') != -1);
            v = ($src.is(":checked") ? (isString ? 'on': '1') : (isString ? 'off': '0'));
            break;
    }
    return v;
}

/************************************************
 DESCRIPTION: Add 'required' class to element
 depending on value of a predicate checkSet

 PARAMETERS:
 srcid - id, element that will be listened by this listener
 destids - array of ids, array of ids, elements that will change its "required" property
 checkSet - predicate function
 *************************************************/
function setRequiredIfPredicate(srcid, destids, checkSet) {
    for (var i=0; i<destids.length; i++) {
        //Для каждого элемента-приемника из списка...
        var destid = destids[i];
        //Значение источника
        var v = extractValueFromWidget(srcid);
        //Дескриптор элемента-приемника
        var $dest = descriptorTarget(destid, srcid);
        //Проверяем предикат
        var requiredOrNot = checkSet(v,srcid,destid);
        //Устанавливаем required
        $dest.descriptor("setAttribute", "required", requiredOrNot);
    }
}