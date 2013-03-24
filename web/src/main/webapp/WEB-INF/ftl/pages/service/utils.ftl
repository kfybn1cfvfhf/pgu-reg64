<#ftl>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#function toString value="">
    <#if value?is_date>
        <#return value?string("dd.MM.yyyy") >
    </#if>
    <#return value?string>
</#function>
<#function fieldF fieldName elementName=''>
    <#if elementName == ''>
        <#local tagName = fieldName />
    <#else>
        <#local tagName = elementName />
    </#if>
    <#local result><${tagName}>${toString(form[fieldName]!'')?xml}</${tagName}></#local>
    <#return result>
</#function>
<#macro field fieldName elementName=''>
    ${fieldF(fieldName, elementName)?xml}
</#macro>
<#macro fieldNE fieldName elementName=''>
    ${fieldF(fieldName, elementName)}
</#macro>
<#macro fields fieldNames>
    <#list fieldNames as fn>
        <@field fn/>
    </#list>
</#macro>
<#macro fieldsNE fieldNames>
    <#list fieldNames as fn>
        <@fieldNE fn/>
    </#list>
</#macro>
<#function detectMimeType filename>
    <#local ext_pos=filename?last_index_of(".")/>
    <#if ext_pos != -1>
        <#switch filename?substring(ext_pos)?lower_case>
            <#case ".doc">
                <#return "application/msword">
            <#case ".docx">
                <#return "application/vnd.openxmlformats-officedocument.wordprocessingml.document">
            <#case ".jpg">
                <#return "image/jpeg">
            <#case ".pdf">
                <#return "application/pdf">
            <#case ".rtf">
                <#return "application/rtf">
            <#case ".tif">
                <#return "image/tiff">
            <#case ".txt">
                <#return "text/plain">
            <#case ".xls">
                <#return "application/vnd.ms-excel">
            <#case ".xlsx">
                <#return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet">
            <#case ".zip">
                <#return "application/zip">
        </#switch>
    </#if>
    <#return "application/octet-stream"/>
</#function>
<#function fileF fileField>
    <#local fileInfoUnescaped> <#-- собирём кусок неэкранированного xml с данными по файлу-->
        <#if form[fileField]?? >
            <#local fileObject = form[fileField]/>
        </#if>
        <#if fileObject?? && fileObject.fileName?? && fileObject.fileName?trim?has_content>
            <${fileField}>
        <contentType xmlns:sog="http://idecs.nvg.ru/privateoffice/ws/types/"
                     xmlns:sog="http://idecs.nvg.ru/storageservice/ws/types/">${detectMimeType(fileObject.fileName)?xml}</contentType>
                <fileName>${fileObject.fileName?xml}</fileName>
                <data>${form[fileField + "_base64"]?xml}</data>
            </${fileField}>
        </#if>
    </#local> <#-- fileInfoUnescaped -->
    <#return fileInfoUnescaped>
</#function>
<#macro file fileField>
    ${fileF(fileField)?xml}
</#macro>
<#macro fileNE fileField>
    ${fileF(fileField)}
</#macro>

<#--
    Формируем тэг для файла с именем name и значением field_base64
    field - FileBean or List<FileBean>
    name - имя тэга, необходимое в fileTag (при необходимости переопределите его)
 -->
<#macro file64 field name useIndex=false>
    <#local object = form[field]!''/>
    <#if object?is_sequence>
        <#if object?size gt 0>
            <#list 0..object?size-1 as index>
                <#local fileObj = form[field + '['+ index + ']_base64']!'' >
                <#if fileObj?has_content >
                    <#local _name = name>
                    <#if useIndex>
                        <#local _name = name + ' ' + (index+1)>
                    </#if>
                    <@fileTag fileObj _name/>
                </#if>
            </#list>
        </#if>
    <#elseif object?has_content && object.fileName?? && object.fileName?trim?has_content>
        <@fileTag form[field + '_base64'] name/>
    </#if>
</#macro>
<#-- Тэг для файла -->
<#macro fileTag file name>
            <star:file name = "${name}">
                ${file}
            </star:file>
</#macro>

<#--

-->
<#function join array delim>
    <#local value = "">
    <#list array as val>
        <#if val?? && val?has_content>
            <#local value = value + delim + toString(val)>
        </#if>
    </#list>
    <#if value == ''>
        <#return ''>
    <#else>
        <#return value?substring(delim?length)>
    </#if>
</#function>

<#--
 * trim100
 *
 * Формируем строку длинной в 100 символов.
 *
 * @param start строка с которой начинается результирующая строка
 * @param end страка которой заканчивается результирующая строка
-->
<#function trim100 start end>
    <#local value = start + end />
    <#if value?has_content && (value?length > 100)>
        <#local value = start?substring(0, 100 - end?length) + end/>
    </#if>
    <#return value />
</#function>

<#--
 * file
 *
 * Формируем тег <#namespace:file name="#name">#base64</p:file>
 * Аттрибут name - состоит из fileDescription и расширения загружаемого файла. Длинна 100 символов.
 * Макрос поддерживает клонированные поля.
 *
 * @param fieldName название поля в форме
 * @param fileDescription название результирующего файла
 * @param namespace пространство имен для тега file
-->
<#macro file fieldName fileDescription="" namespace="p">
    <#if form[fieldName]??>
        <#if form[fieldName]?is_sequence>
            <#if (form[fieldName]?size > 0)>
                <#list 0..form[fieldName]?size-1 as index>
                    <#if (form[fieldName][index].fileName?? && form[fieldName][index].fileName?has_content)>
                        <#local filename=form[fieldName][index].fileName/>
                        <#local extension=(filename?substring(filename?last_index_of('.'))?lower_case)!''/>
                        <${namespace}:file name="${trim100(fileDescription + " " + index, extension)}">${form[fieldName + "[" + index + "]_base64"]}</${namespace}:file>
                    </#if>
                </#list>
            </#if>
            <#else>
                <#if (form[fieldName].fileName?? && form[fieldName].fileName?has_content)>
                    <#local filename=form[fieldName].fileName/>
                    <#local extension=(filename?substring(filename?last_index_of('.'))?lower_case)!''/>
                    <${namespace}:file name="${trim100(fileDescription, extension)}">${form[fieldName + "_base64"]}</${namespace}:file>
                </#if>
        </#if>
    </#if>
</#macro>

<#--
 * dictionaryValue
 *
 * Достаем значение из словаря по ключу.
 *
 * @param key ключв словаре по которому хранится ископое значение
 * @param dictionary код словаря
-->
<#function dictionaryValue key dictionary>
    <#local value = ''/>
    <#attempt>
        <#local value = dicRegistry.getItemByKey(dictionary, key).name />
        <#recover>
    </#attempt>
    <#return value />
</#function>

<#--
 * field
 *
 * Формируем тег <#namespace:param name="#name">#value</p:file>
 *
 * @param fieldName название поля в форме
 * @param attributeName название аттрибута name, attributeName==fieldName если не указано
 * @param format форматы даты и boolean. По умолчанию формат даты: yyyy-MM-dd, boolean: true, false
 * @param fieldType правила отображения тега. При отсутствии данных тег отображается пустой. Возможнен вариант BLANK (тег не будет отображаться)
 * @param namespace пространство имен для тега param
 * @param dictionary имя словаря. При имени отличном от '' данные беруться из словаря. В результате отображается значение, а не код словаря.
-->
<#macro field fieldName='#ERR: no field name specified' attributeName='' format={"datetime_format": "yyyy-MM-dd", "boolean_format": ["true", "false"]} namespace='p' fieldType='EMPTY' dictionary=''>
    <#if attributeName == ''>
        <#local attrName = fieldName />
    <#else>
        <#local attrName = attributeName />
    </#if>
    <#local fieldTypes=["EMPTY", 'BLANK'] />
    <#local formats={"datetime_format": "yyyy-MM-dd", "boolean_format": ["true", "false"]} />
    <#local value = form[fieldName]!''/>
    <#if dictionary?has_content>
        <#local value = dictionaryValue(value, dictionary)/>
    </#if>
    <#if format?? && format?is_hash_ex>
        <#if format["datetime_format"]?? && format["datetime_format"]?has_content>
            <#local datetime_format = format["datetime_format"]/>
        <#else>
            <#local datetime_format = formats["datetime_format"]/>
        </#if>
        <#if format["boolean_format"]?? && format["boolean_format"]?has_content && format["boolean_format"]?is_sequence && format["boolean_format"]?size == 2 && format["boolean_format"][0]?has_content && format["boolean_format"][1]?has_content>
            <#local boolean_format = format["boolean_format"]/>
        <#else>
            <#local boolean_format = formats["boolean_format"]/>
        </#if>
    </#if>
    <#if fieldTypes?seq_contains(fieldType)>
    <#else>
        <#local fieldType = 'EMPTY'/>
    </#if>
    <#if namespace == ''>
        <#local namespace = 'p'/>
    </#if>
    <#if value?? && value?has_content>
        <#local fieldType = ''/>
    </#if>
    <#switch fieldType>
        <#case 'EMPTY'>
                <${namespace}:param name="${attrName}"></${namespace}:param>
            <#break>
        <#case 'BLANK'>
            <#break>
        <#default>
            <#if value?is_date>
                <${namespace}:param name="${attrName}">${value?string(datetime_format)}</${namespace}:param>
            <#elseif value?is_string && (value == 'on' || value == 'off')>
                <${namespace}:param name="${attrName}">${(value == 'on')?string(boolean_format[0], boolean_format[1])}</${namespace}:param>
            <#else>
                <${namespace}:param name="${attrName}">${value?string}</${namespace}:param>
            </#if>
    </#switch>
</#macro>

<#-- Формирование из даты строку в формате ISO с таймзоной-->
<#function dateToIsoString date>
    <#local main>${date?string("yyyy-MM-dd'T'HH:mm:ss.sssss")}</#local>
    <#local timezone>${date?string("Z")}</#local>
    <#local result>${main + timezone?substring(0, 3) + ':' + timezone?substring(3, 5)}</#local>
    <#return result/>
</#function>

<#-- Создаёт описатель файла (типа ОФКТ1), содержащий ID, имя файла и контент в base64 -->
<#function fileBeanToMap fileObject index isContentType codeFunc numberFunc >
    <#local fileID = fileObject.fileID!''/>
    <#local fileName = fileObject.fileName!''/>
    <#local fileContent = form[fileID + "_base64"]!''/>

    <#if codeFunc?is_directive>
        <#local codeInfo = codeFunc(fileObject, index)/>
    <#else>
        <#local codeInfo = {"isValue" : false}/>
    </#if>
    <#if numberFunc?is_directive>
        <#local numberInfo = numberFunc(fileObject, index)/>
    <#else>
        <#local numberInfo = {"isValue" : false}/>
    </#if>

    <#local result = {"fileID" : fileID, "fileName" : fileName, "fileContent" : fileContent}/>
    <#if numberInfo.isValue>
        <#local result = result + {"fileNumber" : numberInfo.value}/>
    </#if>
    <#if codeInfo.isValue>
        <#local result = result + {"fileCode" : codeInfo.value}/>
    </#if>
    <#if isContentType>
        <#local contentType>${detectMimeType(fileName)}</#local>
        <#local result = result + {"contentType" : contentType}/>
    </#if>
    <#return result/>
</#function>

<#-- Создаёт список описателей файлов (типа ОФКТ1) -->
<#function createFilesList fields useContentType codeFunc numberFunc>
    <#local result = []/>
    <#list fields as fieldName>
        <#if form[fieldName]??>
            <#if form[fieldName]?is_sequence>
                <#list form[fieldName] as fileObj>
                    <#local result = result
                    + [fileBeanToMap(form[fieldName][fileObj_index] fileObj_index useContentType codeFunc numberFunc)]/>
                </#list>
            <#else>
                <#local result = result
                + [fileBeanToMap(form[fieldName] '' useContentType codeFunc numberFunc)]/>
            </#if>
        </#if>
    </#list>
    <#return result />
</#function>

<#-- Формирует XML-дескриптор для файлов в соответствии с методрекомендациями 2.3.4
 В качестве параметров приходит список описателей файлов типа ОФКТ1 -->
<#macro appliedDocuments_2_3_4 filesList>
    <#if filesList?has_content>
    <AppliedDocuments>
        <#list filesList as vv>
        <AppliedDocument>
            <#if vv.fileCode??><CodeDocument>${vv.fileCode?xml}</CodeDocument></#if>
            <Name>${vv.fileName?xml}</Name>
            <#if vv.fileNumber??><Number>${vv.fileNumber?xml}</Number></#if>
            <URL>${vv.fileID?xml}</URL>
            <#if vv.contentType??><Type>${vv.contentType?xml}</Type></#if> 
        </AppliedDocument>
        </#list>
    </AppliedDocuments>
    </#if>
</#macro>


<#--Переопределенный макрос file64 из utils.ftl (т.к. используется нестандартная разметка soap request - M0)-->
<#macro file_document control name useIndex=false>
<#local object = form[control]!''/>
    <#if object?is_sequence>
        <#if object?size gt 0>
            <#list 0..object?size-1 as index>
                <#local fileObj = form[control + '['+ index + ']']!'' >
                <#if fileObj?has_content >
                    <#local _name = name>
                    <#if useIndex>
                        <#local _name = name + ' ' + (index+1)>
                    </#if>
                    <m0:document>
					    <m0:documentId>${index}</m0:documentId>
					    <m0:mimeType>${detectMimeType(fileObj.fileName)?xml}</m0:mimeType>
					    <m0:documentTypeCode>String</m0:documentTypeCode>
					    <m0:documentName>${_name}</m0:documentName>
					    <m0:text>${object[index].fileName?xml}</m0:text>
					    <m0:content>${fileObj+'_base64'}</m0:content>
                    </m0:document>
                </#if>
            </#list>
        </#if>
    <#elseif object?has_content && object.fileName?? && object.fileName?trim?has_content>
        <m0:document>
					<m0:documentId>1</m0:documentId>
					<m0:mimeType>${detectMimeType(object.fileName)?xml}</m0:mimeType>
					<m0:documentTypeCode>String</m0:documentTypeCode>
					<m0:documentName>${name}</m0:documentName>
					<m0:text>${object.fileName?xml}</m0:text>
					<m0:content>${form[control+'_base64']}</m0:content>
        </m0:document>
    </#if>
</#macro>

<#--Переопределенный макрос file64 из utils.ftl (т.к. используется нестандартная разметка soap request - SOG)-->
<#macro file_document_sog control name useIndex=false>
<#local object = form[control]!''/>
    <#if object?is_sequence>
        <#if object?size gt 0>
            <#list 0..object?size-1 as index>
                <#local fileObj = form[control + '['+ index + ']']!'' >
                <#if fileObj?has_content >
                    <#local _name = name>
                    <#if useIndex>
                        <#local _name = name + ' ' + (index+1)>
                    </#if>
                <sog:document>
                   <!--Optional:-->
                    <sog:documentId>${index}</sog:documentId>
                   <!--Optional:-->
                    <sog:documentName>${_name}</sog:documentName>
                   <!--Optional:-->
                    <sog:documentTypeCode>String</sog:documentTypeCode>
                   <!--Optional:-->
                    <sog:mimeType>${detectMimeType(object[index].fileName)?xml}</sog:mimeType>
                   <!--Optional:-->
                    <sog:content>${form[control+'_base64']}</sog:content>
                </sog:document>
                </#if>
            </#list>
        </#if>
    <#elseif object?has_content && object.fileName?? && object.fileName?trim?has_content>
                 <sog:document>
                   <!--Optional:-->
                    <sog:documentId>#Код поля</sog:documentId>
                   <!--Optional:-->
                    <sog:documentName>${name}</sog:documentName>
                   <!--Optional:-->
                    <sog:documentTypeCode>String</sog:documentTypeCode>
                   <!--Optional:-->
                    <sog:mimeType>${detectMimeType(object.fileName)?xml}</sog:mimeType>
                   <!--Optional:-->
                    <sog:content>${form[control+'_base64']}</sog:content>
                </sog:document>
    </#if>
</#macro>

<#macro pguCyrillicNumberValidator functionName='pguCyrillicNumberValidator' fieldName=''>
    function ${functionName}(element) {
        var regex = /(^[А-Яа-яЁё0-9,-;.:"«»\!\@\#\$\%\^\&\*\(\)\{\}\[\]\s]*[А-Яа-яЁё\!\@\#\$\%\^\&\*\(\)\{\}\[\]]+[А-Яа-яЁё0-9,-;.:"«»\!\@\#\$\%\^\&\*\(\)\{\}\[\]\s]*$)|(^$)/;
        var fieldName = '${fieldName}';
        var field = fieldName != "" ? $('#${fieldName}') : $(element);
        return regex.test(field.val());
    }
    <@validation.addvalidatormethod false '${functionName}' ' ${functionName}(element)' 'Допустим ввод кириллических символов (не менее одного), цифр 0-9 и знаков препинания'/>
</#macro>

<#macro caseControlFIO selectors functionName='caseControlFIO'>

    $(selectors).bind('keyup',function(){

        var srcTxt = $(this).val();
        var resultTxt = srcTxt.charAt(0).toUpperCase();

        for(var i = 1; i < srcTxt.length - 1; i++){

        resultTxt += srcTxt.charAt(i).toLowerCase();
        }

        $(this).val(resultTxt);
    });
</#macro>

<#macro setZagsDetailsInfo functionName='setZagsDetailsInfo' fieldsMap={'agency_id':'','adresZags':'','telephMain':'','adresHttp':''} classVisible='visibleInfo'>
    function ${functionName}(path) {
        var pathrec = path[path.length - 1];
        var agency_id = pathrec.additional.idZagsOnly;
        var telephMain = pathrec.additional.telephMain;
        var adresHttp = pathrec.additional.adresHttp;
        var adresZags = pathrec.additional.addrZags;//fullAdr;

        if (isNotNullString(adresZags)){
            $('#${fieldsMap["adresZags"]}').val(adresZags).trigger('change');
            $('#${fieldsMap["adresZags"]}-label').text("Адрес: "+adresZags);
            $('.${classVisible}').show();
        } else if(isNotNullString(pathrec.additional.addrZags)){
            $('#${fieldsMap["adresZags"]}').val(pathrec.additional.addrZags).trigger('change');
            $('#${fieldsMap["adresZags"]}-label').text("Адрес: "+pathrec.additional.addrZags);
            $('.${classVisible}').show();
        } else {
                $('#${fieldsMap["adresZags"]}').val('').trigger('change');
                <#--$('.${classVisible}').hide();-->
                $('#${fieldsMap["adresZags"]}-label').parent().parent().hide();
          }
        if (isNotNullString(telephMain)){
            $('#${fieldsMap["telephMain"]}').val("Контактный телефон: "+telephMain).trigger('change');
            $('#${fieldsMap["telephMain"]}-label').text("Контактный телефон: "+telephMain);
            <#--$('.${classVisible}').show();-->
			$('#${fieldsMap["telephMain"]}-label').parent().parent().show();
        } else {
                $('#${fieldsMap["telephMain"]}').val('').trigger('change');
                <#--$('.${classVisible}').hide();-->
                $('#${fieldsMap["telephMain"]}-label').parent().parent().hide();
        }
        if (isNotNullString(adresHttp)){
            $('#${fieldsMap["adresHttp"]}').val("URL веб-сайта: "+adresHttp).trigger('change');
            $('#${fieldsMap["adresHttp"]}-label').text("URL веб-сайта: "+adresHttp);
            $('.${classVisible}').show();
        } else {
                $('#${fieldsMap["adresHttp"]}').val('').trigger('change');
                <#--$('.${classVisible}').hide();-->
                $('#${fieldsMap["adresHttp"]}-label').parent().parent().hide();
            }
        if (isNotNullString(agency_id)){
            $('#${fieldsMap["agency_id"]}').val(agency_id).trigger('change');
            <#--$('.${classVisible}').show();-->
        } else $('.${classVisible}').hide();
    }

    function isNotNullString(o){
        return (undefined != o && o!="");
    }
</#macro>

<#macro clearZagsDetailsInfo functionName='clearZagsDetailsInfo' fieldsMap={'agency_id':'','adresZags':'','telephMain':'','adresHttp':'','clearButton':''} classVisible='visibleInfo'>

        $('#${fieldsMap["clearButton"]}-lookup-form-clear-button').click(function(){
        $('#${fieldsMap["agency_id"]}').val('').trigger('change');
        $('#${fieldsMap["adresHttp"]}').val('').trigger('change');
        $('#${fieldsMap["adresHttp"]}-label').text('');
        $('#${fieldsMap["telephMain"]}').val('').trigger('change');
        $('#${fieldsMap["telephMain"]}-label').text('');
        $('#${fieldsMap["adresZags"]}').val('').trigger('change');
        $('#${fieldsMap["adresZags"]}-label').text('');
        $('.${classVisible}').hide();
    });
</#macro>

<#--Формирует и выводит информацию о ЗАГСе в установленные поля-->
<#macro showZagsAddress functionName='showZagsAddress' fieldsMap={'agency_id':'agency_id','adresZags':'adresZags','telephMain':'telephMain','adresHttp':'adresHttp'} classVisible='visibleInfo'>

        function isNotNullString(o){
        return (undefined != o && o!="");
        }

        function showZagsAddress(info){

            if (info == null || info.length <= 0) {
                return;
            }

            var infoParts = info[0].code.split('#');
            var telephMain = infoParts[1];
            var adresHttp = infoParts[2];
            var adresZags = infoParts[3];

            if (isNotNullString(adresZags)){
                $('#${fieldsMap["adresZags"]}-label').text("Адрес: "+adresZags);
                $('#${fieldsMap["adresZags"]}').val("Адрес: "+adresZags);
            }
            if (isNotNullString(telephMain)){
                $('#${fieldsMap["telephMain"]}-label').text("Контактный телефон: "+telephMain);
                $('#${fieldsMap["telephMain"]}').val("Контактный телефон: "+telephMain);
            }
            if (isNotNullString(adresHttp)){
                $('#${fieldsMap["adresHttp"]}-label').text("URL веб-сайта: "+adresHttp);
                $('#${fieldsMap["adresHttp"]}').val("URL веб-сайта: "+adresHttp);
            }

            $('#${fieldsMap["adresZags"]}').trigger('change');
            $('#${fieldsMap["telephMain"]}').trigger('change');
            $('#${fieldsMap["adresHttp"]}').trigger('change');
        }
</#macro>


<#--
 * fieldNoNamespace
 *
 * Формируем тег <#param name="#name">#value</p:file>
 *
 * @param fieldName название поля в форме
 * @param attributeName название аттрибута name, attributeName==fieldName если не указано
 * @param format форматы даты и boolean. По умолчанию формат даты: yyyy-MM-dd, boolean: true, false
 * @param fieldType правила отображения тега. При отсутствии данных тег отображается пустой. Возможнен вариант BLANK (тег не будет отображаться)
 * @param dictionary имя словаря. При имени отличном от '' данные беруться из словаря. В результате отображается значение, а не код словаря.
-->
<#macro fieldNoNamespace fieldName='#ERR: no field name specified' attributeName='' format={"datetime_format": "yyyy-MM-dd", "boolean_format": ["true", "false"]} fieldType='EMPTY' dictionary=''>
    <#if attributeName == ''>
        <#local attrName = fieldName />
    <#else>
        <#local attrName = attributeName />
    </#if>
    <#local fieldTypes=["EMPTY", 'BLANK'] />
    <#local formats={"datetime_format": "yyyy-MM-dd", "boolean_format": ["true", "false"]} />
    <#local value = form[fieldName]!''/>
    <#if dictionary?has_content>
        <#local value = dictionaryValue(value, dictionary)/>
    </#if>
    <#if format?? && format?is_hash_ex>
        <#if format["datetime_format"]?? && format["datetime_format"]?has_content>
            <#local datetime_format = format["datetime_format"]/>
        <#else>
            <#local datetime_format = formats["datetime_format"]/>
        </#if>
        <#if format["boolean_format"]?? && format["boolean_format"]?has_content && format["boolean_format"]?is_sequence && format["boolean_format"]?size == 2 && format["boolean_format"][0]?has_content && format["boolean_format"][1]?has_content>
            <#local boolean_format = format["boolean_format"]/>
        <#else>
            <#local boolean_format = formats["boolean_format"]/>
        </#if>
    </#if>
    <#if fieldTypes?seq_contains(fieldType)>
    <#else>
        <#local fieldType = 'EMPTY'/>
    </#if>
    <#if value?? && value?has_content>
        <#local fieldType = ''/>
    </#if>
    <#switch fieldType>
        <#case 'EMPTY'>
        <${attrName}></${attrName}>
            <#break>
        <#case 'BLANK'>
            <#break>
        <#default>
            <#if value?is_date>
            <${attrName}>${value?string(datetime_format)}</${attrName}>
            <#elseif value?is_string && (value == 'on' || value == 'off')>
            <${attrName}>${(value == 'on')?string(boolean_format[0], boolean_format[1])}</${attrName}>
            <#else>
            <${attrName}>${value?string}</${attrName}>
            </#if>
    </#switch>
</#macro>


<#macro customDocTypeValidation declarant_ident_doc_type='declarant_ident_doc_type' declarant_ident_doc_ser='declarant_ident_doc_ser' declarant_ident_doc_num='declarant_ident_doc_num'>

    <#list [
    {"value":["1"], "regexp":"/^\\d{2}\\s?\\d{2}$/", "message":"Введите значение в формате «XX XХ» или «XXXХ», где Х - цифры"},
    {"value":["22"], "regexp":"/^\\d{2}$/", "message":"Введите значение в формате «XX», где Х - цифры"},
    {"value":["12", "13", "14", "15", "16", "17", "2"], "regexp":"/^.{0,25}$/", "message":"Введите не больше 25ти символов"},
    {"value":["8", "18"], "regexp":"/^[IVXLC]+-[А-ЯЁ]{2}$/", "message":"Введите сообщение в формате «R-ББ», где R - римское число буквами I, V, X, L, С. Б - русская заглавная буква"},
    {"value":["9", "11"], "regexp":"/^[А-ЯЁ]{2}$/", "message":"Введите сообщение в формате «ББ», Б - русская заглавная буква"}
    ] as validation>
        <#list validation.value as value>
            <@action.applyValidationIf onload='true' srcid=declarant_ident_doc_type event='change' destid=declarant_ident_doc_ser value=value rules='regexp' validationAttr=[validation.regexp]
            validationMessage={"regexp": validation.message} />
        </#list>
    </#list>

    <#list [
    {"value":["1"], "regexp":"/^\\d{6}$/", "message":"Введите значение в формате «XXXXXХ», где Х - цифры"},
    {"value":["22"], "regexp":"/^\\d{7}$/", "message":"Введите значение в формате «XXXXXХX», где Х - цифры"},
    {"value":["12", "13", "14", "15", "16", "17", "2"], "regexp":"/^.{0,25}$/", "message":"Введите не больше 25ти символов"},
    {"value":["8", "10", "18"], "regexp":"/^\\d{6}$/", "message":"Введите число в формате «XXXXXX», где Х - цифры"},
    {"value":["9", "11"], "regexp":"/^\\d{6,7}$/", "message":"Введите число в формате «XXXXXX» или «XXXXXXX», где Х - цифры"}
    ] as validation>
        <#list validation.value as value>
            <@action.applyValidationIf onload='true' srcid=declarant_ident_doc_type event='change' destid=declarant_ident_doc_num value=value rules='regexp' validationAttr=[validation.regexp]
            validationMessage={"regexp": validation.message} />
        </#list>
    </#list>
</#macro>

<#--This macros triggers validation on dest field-->
<#--when action is performed over any of source fields-->
<#macro validOnAction action='change' source='' dest=''>
    $(function(){
        var $sourceItems = $()
        <#list source?split(' ') as sourceId>
            .add('#${sourceId}')
        </#list>;
        $sourceItems.bind('${action}', function(){
            <#list dest?split(' ') as destId>
                $('#${destId}').valid();
            </#list>
        })
    });
</#macro>

<#macro requireFieldsFromOneBlock first='' second=''>
    <@validation.addvalidatormethod true 'requireFromOneBlock' 'requireFromOneBlock()' ''/>
        function requireFromOneBlock(value){
            var filterFunction = function(){
                return $(this).val() == '';
            };

            var $first = $()
            <#list first?split(' ') as firstId>
                .add('#${firstId}')
            </#list>
            ;

            var $second = $()
            <#list second?split(' ') as secondId>
                .add('#${secondId}')
            </#list>
            ;

            var errMsg = 'Необходимо заполнить все поля для одного из блоков.';

            if (!$first.filter(filterFunction).length || !$second.filter(filterFunction).length){
                setTimeout(function(){
                    $first.add($second).each(function(){
                        var $errField = $('#' + $(this).attr('id') + '-err');
                        if ($errField.html() == errMsg){
                            $errField.html('');
                            $(this).removeClass('fielderror-invalidfield');
                        }
                    });
                }, 100);
                return true;
            }

            setTimeout(function(){
                $first.add($second).filter(filterFunction).each(function(){
                    var $errField = $('#' + $(this).attr('id') + '-err');
                    $errField.html(errMsg);
                });
            }, 100);

            return false;
        }
</#macro>