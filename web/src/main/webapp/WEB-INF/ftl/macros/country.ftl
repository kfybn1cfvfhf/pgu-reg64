<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#--
 * block_country_form
 *
 * Формирует блок ввода адреса для услуг 51ххх
 *
 * @param country страна.
 * @param countryCode хранение признака "Россия"/"неРоссия"
 * @param input способ ввода адреса  :  "Вручную"/"изСправочника"
 * @param country_input вспомогательная переменная
 * @param settlementRF населенный пункт из справочника.
 * @param streetRF улица из справочника.
 * @param region область.
 * @param area район.
 * @param settlement_type "Населенный пункт"/"Город"
 * @param country_settlement вспомогательная переменная
 * @param settlement "Населенный пункт"
 * @param city "Город"
 * @param street "Улица"
 * @param house "Дом"
 * @param corp "Корпус"
 * @param flat "Квартира"
 *-->

<#macro block_country_form  fieldsMap={} country='' post='' countryCode='' input='' country_input='' settlementRF='' streetRF='' region='' area=''  settlement_type='' country_settlement='' settlement='' city='' street='' house='' corp='' flat=''>


            <@script.scripttag>

             <@jquery.onready>

                <@jquery.descriptorListener sourceId='${country}' event='change' onload='false'>
                    set${countryCode}();
                </@jquery.descriptorListener>

                 <#if post?has_content>
                <@action.applyValidationIf 'true' '${country}' 'change' '${post}' '643' 'index'/>
                 </#if>
                <@action.setVisibleByValue 'true' '${country}' 'change' '${input}' '643' />

                <#if house?has_content>
                <@action.setVisibleByValue 'true' '${countryCode}' 'change' '${house}' 'ru,nru' />
                </#if>
                <#if corp?has_content>
                <@action.setVisibleByValue 'true' '${countryCode}' 'change' '${corp}' 'ru,nru' />
                </#if>
                <#if flat?has_content>
                <@action.setVisibleByValue 'true' '${countryCode}' 'change' '${flat}' 'ru,nru' />
                </#if>

                <@action.setRequiredIf 'true' '${country}' 'change' '${input}' '643' />

                <@action.linkDestFromList onload='true' destid='${country_input}' event='change' sourceids=['${countryCode}', '${input}'] eventDest="change" delimited='|' />
                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${settlementRF}' 'ru|1' />
                <@action.setRequiredIf 'true' '${country_input}' 'change' '${settlementRF}' 'ru|1' />

                <#if streetRF?has_content>
                    <@action.setVisibleByValue 'true' '${country_input}' 'change' '${streetRF}' 'ru|1' />
                </#if>

                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${area}' 'ru|2,nru|,nru|1,nru|2' />
                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${region}' 'ru|2,nru|,nru|1,nru|2' />
                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${settlement_type}' 'ru|2,nru|,nru|1,nru|2' />
                <@action.setRequiredIf 'true' '${country_input}' 'change' '${settlement_type}' 'ru|2,nru|,nru|1,nru|2' />

                <#if street?has_content>
                    <@action.setVisibleByValue 'true' '${country_input}' 'change' '${street}' 'ru|2,nru|,nru|1,nru|2' />
                </#if>

                <@action.linkDestFromList onload='true' destid='${country_settlement}' event='change' sourceids=['${countryCode}', '${input}', '${settlement_type}'] eventDest="change" delimited='|'/>

                <@action.setVisibleByValue 'true' '${country_settlement}' 'change' '${city}' 'ru|2|1,nru|1|1,nru|2|1,nru||1'/>
                <@action.setRequiredIf 'true' '${country_settlement}' 'change' '${city}' 'ru|2|1,nru|1|1,nru|2|1,nru||1'/>
                <@action.setVisibleByValue 'true' '${country_settlement}' 'change' '${settlement}' 'ru|2|2,nru|1|2,nru|2|2,nru||2'/>
                <@action.setRequiredIf 'true' '${country_settlement}' 'change' '${settlement}' 'ru|2|2,nru|1|2,nru|2|2,nru||2'/>
             </@jquery.onready>
             </@script.scripttag>
                <@block_country_body fieldsMap=fieldsMap  country='${country}' post='${post}' countryCode='${countryCode}' input='${input}' country_input='${country_input}' settlementRF='${settlementRF}' streetRF='${streetRF}' area='${area}' region='${region}' settlement_type='${settlement_type}' country_settlement='${country_settlement}' settlement='${settlement}' city='${city}' street='${street}' house='${house}' corp='${corp}' flat='${flat}'/>

</#macro>

<#--
 * block_country_for_zags
 *
 * Формирует блок ввода адреса для услуг 51ххх
 *
 * @param other_region_type .
 * @param zags_response_question поле "Где хотите получить документ?"
 * @param country страна вспомогательная переменная.
 * @param countryCode хранение признака "Россия"/"неРоссия"
 * @param input способ ввода адреса  :  "Вручную"/"изСправочника"
 * @param country_input вспомогательная переменная
 * @param settlementRF населенный пункт из справочника.
 * @param streetRF улица из справочника.
 * @param region область.
 * @param area район.
 * @param settlement_type "Населенный пункт"/"Город"
 * @param country_settlement вспомогательная переменная
 * @param settlement "Населенный пункт"
 * @param city "Город"
 * @param street "Улица"
 * @param house "Дом"
 * @param corp "Корпус"
 * @param flat "Квартира"
 *-->

<#macro block_country_for_zags  fieldsMap={} optionsMap={} other_region_type='' country='' post='' countryCode='' input='' country_input='' settlementRF='' streetRF='' area='' region='' settlement_type='' country_settlement='' settlement='' city='' street='' house='' corp='' flat=''>

            <#if optionsMap["show_address"]?has_content>
            <@script.scripttag>

             <@jquery.onready>

                <@jquery.descriptorListener sourceId='${country}' event='change' onload='false'>
                    set${countryCode}();
                </@jquery.descriptorListener>

                <#local control_option><@clone_by_list list_parameter='${optionsMap["show_address_value"]}' string_parameter='%s|ru' /></#local>
                <#local control_option1><@clone_by_list list_parameter='${optionsMap["show_address_value"]}' string_parameter='%s|ru,%s|nru' /></#local>

                <@action.linkDestFromList onload='true' destid='${other_region_type}' event='change' sourceids=[ '${optionsMap["show_address"]}', '${countryCode}'] eventDest="change" delimited='|'/>

                <#if house?has_content>
                <@action.setVisibleByValue 'true' '${other_region_type}' 'change' '${house}' '${control_option1}'/>
                </#if>
                <#if corp?has_content>
                <@action.setVisibleByValue 'true' '${other_region_type}' 'change' '${corp}' '${control_option1}' />
                </#if>
                <#if post?has_content>
                <@action.setVisibleByValue 'true' '${other_region_type}' 'change' '${post}' '${control_option1}' />
                <@action.setRequiredIf 'true' '${other_region_type}' 'change' '${post}' '${control_option1}'/>
                <@action.applyValidationIf 'true' '${other_region_type}' 'change' '${post}' '${control_option}' 'index'/>
                </#if>
                <#if flat?has_content>
                <@action.setVisibleByValue 'true' '${other_region_type}' 'change' '${flat}' '${control_option1}' />
                </#if>
                <#if country?has_content>
                <@action.setVisibleByValue 'true' '${optionsMap["show_address"]}' 'change' '${country}' '${optionsMap["show_address_value"]}'/>
                <@action.setRequiredIf 'true' '${optionsMap["show_address"]}' 'change' '${country}' '${optionsMap["show_address_value"]}'/>
                </#if>



                <@action.setVisibleByValue 'true' '${other_region_type}' 'change' '${input}' '${control_option}' />
                <@action.setRequiredIf 'true' '${other_region_type}' 'change' '${input}' '${control_option}'  />

                <#local control_option2><@clone_by_list list_parameter='${optionsMap["show_address_value"]}' string_parameter='%s|ru|1' /></#local>

                <@action.linkDestFromList onload='true' destid='${country_input}' event='change' sourceids=[ '${optionsMap["show_address"]}', '${countryCode}', '${input}'] eventDest="change" delimited='|' />
                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${settlementRF}' '${control_option2}' />
                <@action.setRequiredIf 'true' '${country_input}' 'change' '${settlementRF}' '${control_option2}' />

                <#if streetRF?has_content>
                    <@action.setVisibleByValue 'true' '${country_input}' 'change' '${streetRF}' '${control_option2}' />
                </#if>

                <#local control_option3><@clone_by_list list_parameter='${optionsMap["show_address_value"]}' string_parameter='%s|ru|2,%s|nru|,%s|nru|1,%s|nru|2' /></#local>

                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${area}' '${control_option3}' />
                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${region}' '${control_option3}' />
                <@action.setVisibleByValue 'true' '${country_input}' 'change' '${settlement_type}' '${control_option3}' />
                <@action.setRequiredIf 'true' '${country_input}' 'change' '${settlement_type}' '${control_option3}' />

                <#if street?has_content>
                    <@action.setVisibleByValue 'true' '${country_input}' 'change' '${street}' '${control_option3}' />
                </#if>
                <#local control_option4><@clone_by_list list_parameter='${optionsMap["show_address_value"]}' string_parameter='%s|ru|2|1,%s|nru|1|1,%s|nru|2|1,%s|nru||1' /></#local>
                <#local control_option5><@clone_by_list list_parameter='${optionsMap["show_address_value"]}' string_parameter='%s|ru|2|2,%s|nru|1|2,%s|nru|2|2,%s|nru||2' /></#local>
                <@action.linkDestFromList onload='true' destid='${country_settlement}' event='change' sourceids=[ '${optionsMap["show_address"]}', '${countryCode}', '${input}', '${settlement_type}'] eventDest="change" delimited='|'/>

                <@action.setVisibleByValue 'true' '${country_settlement}' 'change' '${city}' '${control_option4}'/>
                <@action.setRequiredIf 'true' '${country_settlement}' 'change' '${city}' '${control_option4}'/>
                <@action.setVisibleByValue 'true' '${country_settlement}' 'change' '${settlement}' '${control_option5}'/>
                <@action.setRequiredIf 'true' '${country_settlement}' 'change' '${settlement}' '${control_option5}'/>
             </@jquery.onready>
             </@script.scripttag>
                <@block_country_body fieldsMap=fieldsMap country='${country}' post='${post}' countryCode='${countryCode}' input='${input}' country_input='${country_input}' settlementRF='${settlementRF}' streetRF='${streetRF}' area='${area}' region='${region}' settlement_type='${settlement_type}' country_settlement='${country_settlement}' settlement='${settlement}' city='${city}' street='${street}' house='${house}' corp='${corp}' flat='${flat}' />
                <@sf.fldrow>
                        <@sf.textfield  path="form.${other_region_type}"  tdstyle='display:none;' />

                </@sf.fldrow>
        </#if>

</#macro>

<#macro block_country_body  fieldsMap={} country='' post='' countryCode='' input='' country_input='' settlementRF='' streetRF='' region='' area='' settlement_type='' country_settlement='' settlement='' city='' street='' house='' corp='' flat=''>

                <#assign fixFieldsMap={
                "house_label" : 3,
                "house_value" : 3,
                "block_label" : 4,
                "block_value" : 3,
                "flat_label" : 4,
                "flat_value" : 3,
                "post":6,
                "field":25,
                "label":10,
                "emptyLeft":1,
                "emptyRight":11,
                "emptyMiddle": 1 }
                />
                <#local fixFieldsMap=fixFieldsMap+fieldsMap/>

              <@script.scripttag>

             function set${countryCode}() {
                var value = "";
                var info = $('#${country}').val();

                if (info != "") {
                    var cc = info;

                    if(cc == 643){
                        value = "ru";
                    }else value= "nru";
                }
                else value="1";

                var $src = $(document.getElementById('${countryCode}'));
                $src.val(trim(value)).trigger('change');
            };
             <@jquery.onready>

             </@jquery.onready>
             </@script.scripttag>
                <@sf.fldrow>
					    <@sf.textfield  path="form.${countryCode}"  tdstyle='display:none;' />
                        <@sf.textfield  path="form.${country_input}"  tdstyle='display:none;' />
                        <@sf.textfield  path="form.${country_settlement}"  tdstyle='display:none;' />

                </@sf.fldrow>

                <@sf.fldrow>
                <@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                <@sf.label path="form.${country}" title="Страна" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                <@sf.dictionaryLookup path="form.${country}" dictionaryCode="INSOFT_OKSM" title="Страны" valueCode="643" qtip="" validation="required" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

                <#if post?has_content>
                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
				<@sf.label path="form.${post}" title="Почтовый индекс" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${post}" qtip="" validation="maxlength required" validationattr={"maxlength":"10"} style="text-align:left;" colspan=fixFieldsMap["post"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>
                </#if>

                <@sf.fldrow>
			    <@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                <@sf.label path="form.${input}" title="Ввод адреса" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                <@sf.radiogroup path="form.${input}" staticOpts={"1":"Из справочника","2":"Вручную"} validation="required" qtip="" style="text-align:left;" colspan="20" mode="horizontal"/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                <@sf.label path="form.${settlementRF}" title="Населенный пункт" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                <@sf.dictionaryLookup path="form.${settlementRF}" dictionaryCode="KLADRRegion" title="Населенный пункт" validation="required" qtip="" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

              <#if streetRF?has_content>
                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
                <@sf.label path="form.${streetRF}" title="Улица" required=false style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                <@sf.dictionaryLookup path="form.${streetRF}" dictionaryCode="KLADRStreet" title="Улицы" dependsOn=[{'fieldId': '${settlementRF}'}] parentLookup={'fieldId': '${settlementRF}', 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'} qtip="" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>
              </#if>

                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
				<@sf.label path="form.${region}" title="Область (край, республика)" required=false style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${region}" validation="maxlength" validationattr={"maxlength":80} qtip="" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
				</@sf.fldrow>

                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
				<@sf.label path="form.${area}" title="Район" required=false style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${area}" validation="maxlength" validationattr={"maxlength":80} qtip="" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]?number+fixFieldsMap["label"]?number+fixFieldsMap["emptyMiddle"]?number/>
                <@sf.radiogroup path="form.${settlement_type}" staticOpts={"1":"Город","2":"Населенный пункт"} qtip="" validation="required" style="text-align:left;" colspan="20" mode="horizontal"/>
			    <@sf.empty colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
				<@sf.label path="form.${settlement}" title="Населенный пункт" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${settlement}" validation="required maxlength" validationattr={"maxlength":80} qtip="" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>


                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
				<@sf.label path="form.${city}" title="Город" required=true style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${city}" validation="required maxlength" validationattr={"maxlength":80} qtip="" style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
                </@sf.fldrow>

              <#if street?has_content>
                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]/>
				<@sf.label path="form.${street}" title="Улица" required=false style="text-align:right;" colspan=fixFieldsMap["label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${street}" qtip="" validation="maxlength" validationattr={"maxlength":33} style="text-align:left;" colspan=fixFieldsMap["field"]/>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
				</@sf.fldrow>
			  </#if>

              <#if house?has_content>
                <@sf.fldrow>
				<@sf.empty colspan=fixFieldsMap["emptyLeft"]?number+fixFieldsMap["emptyMiddle"]?number+fixFieldsMap["label"]?number/>
				<@sf.label path="form.${house}" title="Дом" required=false style="text-align:right;" colspan=fixFieldsMap["house_label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${house}" qtip="" validation="maxlength" validationattr={"maxlength":7} style="text-align:left;" colspan=fixFieldsMap["house_value"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.label path="form.${corp}" title="Корпус" required=false style="text-align:right;" colspan=fixFieldsMap["block_label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${corp}" qtip="" validation="maxlength" validationattr={"maxlength":4}  style="text-align:left;" colspan=fixFieldsMap["block_value"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
                <#if flat?has_content>
				<@sf.label path="form.${flat}" title="Квартира" required=false style="text-align:right;" colspan=fixFieldsMap["flat_label"]/>
				<@sf.empty colspan=fixFieldsMap["emptyMiddle"]/>
				<@sf.textfield  path="form.${flat}" qtip="" validation="maxlength" validationattr={"maxlength":9} style="text-align:left;" colspan=fixFieldsMap["flat_value"]/>
                </#if>
				<@sf.emptyNoWidth colspan=fixFieldsMap["emptyRight"]/>
				</@sf.fldrow>
              </#if>

</#macro>

<#macro clone_by_list list_parameter string_parameter><#list list_parameter?split(",") as parameter>${string_parameter?replace("%s",parameter)}<#if parameter_has_next>,</#if></#list></#macro>



