<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#--
 * block_dates_interval
 *
 * Формирует блок выбора диапазона дат
 *
 * @param fieldsMap={} массив содержащий значения ширины (colspan) для колонок
 * @param optionsMap={} - for future use
 * @param date_begin "Дата начала интервала"
 * @param date_begin_label "Подпись даты начала интервала"
 * @param date_end "Дата окончания интервала"
 * @param date_end_label "Подпись даты окончания интервала"
 *-->

<#macro block_dates_interval  fieldsMap={} optionsMap={}  date_begin='' date_begin_label='' date_end='' date_end_label='' >
<#assign fixMap={
                "field":25,
                "label":10,
                "emptyLeft":1,
                "emptyRight":11,
                "emptyMiddle": 1 }
                />
                <#local fixMap=fixMap+fieldsMap/>

<#assign intervalfunction="interval_"+date_begin+"_"+date_end>

<script type="text/javascript" src="<@spring.url '/htdocs/js/date/date.js'/>"></script>
    <@script.scripttag>

    function ${intervalfunction}(value) {
        var val_begin = $('#${date_begin}').val();
        var val_end   = $('#${date_end}').val();
        if ( /^\s*$/.test( val_begin ) || /^\s*$/.test( val_end ) )
        return true;
        else {
            return Date.fromString(val_end, "dd.mm.yyyy") >= Date.fromString(val_begin, "dd.mm.yyyy");
        }
    }

    <@jquery.onready>

    <@validation.addvalidatormethod false '${intervalfunction}' '${intervalfunction}(value)' 'Предпочитаемая дата начала периода должна быть меньше даты окончания.'/>

    <@jquery.descriptorListener '${date_begin}' 'change' 'false'>
				    var $dest_begin = $('#${date_begin}');
				    var $dest_end =   $('#${date_end}');

	                $dest_begin.valid();
	                $dest_end.valid();
    </@jquery.descriptorListener>
    <@jquery.descriptorListener '${date_end}' 'change' 'false'>
                    var $dest_begin = $('#${date_begin}');
                    var $dest_end =   $('#${date_end}');

                    $dest_begin.valid();
                    $dest_end.valid();
    </@jquery.descriptorListener>

    </@jquery.onready>
    </@script.scripttag>

    <@sf.fldrow>

            <@sf.empty colspan=fixMap["emptyLeft"]/>

            <@sf.label path="form.${date_begin}" title="${date_begin_label}" required=true style="text-align:right;"  colspan=fixMap["label"] />

            <@sf.empty  colspan=fixMap["emptyMiddle"] />

            <@sf.datefield path="form.${date_begin}"  qtip="" validation="required ${intervalfunction}" style="text-align:left;" colspan="5"/>

            <@sf.empty colspan="2"/>

            <#-- Дата должна быть больше #lic_date_begin-->
            <@sf.label path="form.${date_end}" title="${date_end_label}" required=true style="text-align:right;" colspan=fixMap["field"]-14/>

            <@sf.empty colspan="2"/>

            <#-- Дата должна быть больше #lic_date_begin-->
            <@sf.datefield path="form.${date_end}"  qtip="" validation="required ${intervalfunction}" style="text-align:left;" colspan="5"/>

    </@sf.fldrow>

</#macro>