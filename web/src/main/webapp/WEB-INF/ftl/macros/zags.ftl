<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "country.ftl" as country>

<#--
 * block_zags_form
 *
 * Формирует блок выбора загса
 *
 * @param zags_request_question поле "Вы знаете в какой отдел ЗАГС обратиться?"
 * @param zags_request_name поле "Отдел ЗАГС для обращения"
 * @param zags_response_question поле "Где хотите получить документ?"
 * @param zags_response_name_reg поле "Отдел ЗАГС для получения документа" при "В данном отделе ЗАГС"
 * @param zags_response_name_region поле "Отдел ЗАГС для получения документа" при "В другом отделе ЗАГС моего региона"
 * @param zags_response_name поле "Отдел ЗАГС для получения документа"  при "В другом отделе ЗАГС другого региона"

 * @param other_region_type вспомогательная переменная.
 * @param country страна.
 * @param countryCode хранение признака "Россия"/"неРоссия"
 * @param input способ ввода адреса  :  "Вручную"/"изСправочника"
 * @param country_input вспомогательная переменная
 * @param settlementRF населенный пункт из справочника.
 * @param streetRF улица из справочника.
 * @param area область.
 * @param region район.
 * @param settlement_type "Населенный пункт"/"Город"
 * @param country_settlement вспомогательная переменная
 * @param settlement "Населенный пункт"
 * @param city "Город"
 * @param street "Улица"
 * @param house "Дом"
 * @param corp "Корпус"
 *
 * @param declarant_phone поле "Телефон заявителя"
 * @param declarant_email gjkt "E-mail заявителя"
 *-->

<#macro block_zags_form  fieldsMap={} zags_request_question='' zags_request_name='' zags_response_question=''
                                      zags_response_name_reg='' zags_response_name_region='' zags_response_name=''
                                      other_region_type='' zags_response_country='' zags_response_post='' zags_countryCode=''
                                      zags_response_address_input='' zags_address_input='' zags_response_settlementRF=''
                                      zags_response_streetRF='' zags_response_area='' zags_response_region=''
                                      zags_response_settlement_type='' zags_address_input_type='' zags_response_settlement=''
                                      zags_response_city='' zags_response_street='' zags_response_house='' zags_response_building=''
                                      declarant_phone='' declarant_email=''>
        <#assign fixMap={
                "field":20,
                "label":20,
                "emptyLeft":6,
                "emptyRight":1,
                "emptyMiddle":1 }
                />
                <#local fixMap=fixMap+fieldsMap/>

        <@script.scripttag>

            function setOrgReqInfo(info) {
                if (info == null || info.length <= 0) {
                    return;
                }

                var name = info[0].additional['name'][0];

                var element = document.getElementById('${zags_response_name_reg}');
                if (element != null) element.value = name;
            };

            function setOrgResInfo(info) {
                if (info == null || info.length <= 0) {
                    return;
                }

                var name = info[0].additional['name'][0];

                var element = document.getElementById('${zags_response_name}');
                element.value = name;
            };

            function setSameZagsName(info) {
                $('#zags_response_question').click();

                setTimeout(function(){ var element = document.getElementById('${zags_request_name}-lookup-form-text');
                var value = element.value;
                if (value=="[Выбрать]") value = "";

                var element = document.getElementById('${zags_response_name_reg}');
                element.value = value;  });

                return true;
            };

            <@jquery.onready>
				<@action.setVisibleByValue 'true' '${zags_response_question}' 'change' '${zags_response_name_reg}' ',1'/>
                <@action.setReadonlyByValue 'true' '${zags_response_question}' 'change' '${zags_response_name_reg}' '1'/>
                <@action.setDisabledByValue 'true' '${zags_response_question}' 'change' '${zags_response_name_reg}' '' />
                <@action.setVisibleByValue 'true' '${zags_response_question}' 'change' '${zags_response_name_region}' '2'/>
				<@action.setVisibleByValue 'true' '${zags_response_question}' 'change' '${zags_response_name}' '3'/>

                <@action.setRequiredIf 'true' '${zags_response_question}' 'change' '${zags_response_name_reg}' '1' />
                <@action.setRequiredIf 'true' '${zags_response_question}' 'change' '${zags_response_name}' '3' />
                <@action.setRequiredIf 'true' '${zags_response_question}' 'change' '${zags_response_name_region}' '2' />

                <@action.setDisabledByValue 'true' '${zags_request_name}' 'change' '${zags_response_question}' ''/>
                <@action.setDisabledByValue 'true' '${zags_request_question}' 'change' '${zags_request_name}' ''/>
                <@action.setDisabledByValue 'true' '${zags_request_name}' 'change' '${zags_response_name_region}' ''/>

                <@action.setVisibleByValue 'true' '${zags_response_question}' 'change' 'zags_address' '3'/>

                <@jquery.descriptorListener sourceId='${zags_request_name}' event='change' onload='false'>
                    setSameZagsName();
                </@jquery.descriptorListener>

                <@jquery.descriptorListener sourceId='${zags_response_question}' event='change' onload='false'>
                    setSameZagsName();
                </@jquery.descriptorListener>


            </@jquery.onready>
        </@script.scripttag>


              <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Орган ЗАГС для обращения" fieldset=true style="text-align:right;" colspan="25"/>
						<@sf.empty colspan="22"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${zags_request_question}" title="Вы знаете в какой отдел ЗАГС обратиться?" required=true style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.radiogroup path="form.${zags_request_question}" dictionaryCode="DA_NET" qtip="" validation="required" style="text-align:left;" colspan="20" mode="horizontal"/>
						<@sf.empty colspan=fixMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${zags_request_name}" required=true title="Отдел ЗАГС для обращения" style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.customLookup path="form.${zags_request_name}" controller="InsoftOrgs" validation="required" resultCallbacks=['setOrgReqInfo'] optionsMap={"AISID":"2170", "userSelectedRegion":"${userSelectedRegion!'66000000000'}"} optionsMapSources=[{'fieldId': 'zags_request_question','alias':'commonType'}] qtip=""  style="text-align:left;" colspan=fixMap["field"]/>
                        <@sf.empty colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Орган ЗАГС для получения документа" fieldset=true style="text-align:right;" colspan="25"/>
						<@sf.empty colspan="22"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${zags_response_question}" title="Где хотите получить документ?" required=true style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.staticLookup path="form.${zags_response_question}" staticData={"1":"В данном отделе ЗАГС","2":"В другом отделе ЗАГС моего региона", "3":"В другом отделе ЗАГС другого региона"} qtip="" validation="required" style="text-align:left;" colspan=fixMap["field"]-3 />
						<@sf.empty colspan="17"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${zags_response_name_region}" title="Отдел ЗАГС для получения документа" required=true style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.customLookup path="form.${zags_response_name_region}" controller="InsoftOrgs" resultCallbacks=['setOrgResInfo'] optionsMap={"AISID":"2170", "userSelectedRegion":"${userSelectedRegion!'66000000000'}"}  qtip="" validation="required" style="text-align:left;" colspan=fixMap["field"]/>
						<@sf.empty colspan=fixMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${zags_response_name}" title="Отдел ЗАГС для получения документа" required=true style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.textfield  path="form.${zags_response_name}" qtip="" validation="required" style="text-align:left;" colspan=fixMap["field"]/>
						<@sf.empty colspan=fixMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${zags_response_name_reg}" title="Отдел ЗАГС для получения документа" required=true style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.textfield  path="form.${zags_response_name_reg}" qtip="" attr='readonly="readonly"' validation="required" style="text-align:left;" colspan=fixMap["field"]/>
						<@sf.empty colspan=fixMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label id="zags_address" title="Адрес отдела ЗАГС для отправки по почте" fieldset=true style="text-align:right" colspan="25"/>
						<@sf.empty colspan="22"/>
                </@sf.fldrow>

                <@country.block_country_for_zags fieldsMap=fixMap optionsMap={"show_address" : "${zags_response_question}","show_address_value" : "3"}
                           other_region_type='${other_region_type}' country='${zags_response_country}' post='${zags_response_post}' countryCode='${zags_countryCode}'
                           input='${zags_response_address_input}' country_input='${zags_address_input}' settlementRF='${zags_response_settlementRF}' streetRF='${zags_response_streetRF}'
                           area='${zags_response_area}' region='${zags_response_region}' settlement_type='${zags_response_settlement_type}' country_settlement='${zags_address_input_type}'
                           settlement='${zags_response_settlement}' city='${zags_response_city}' street='${zags_response_street}' house='${zags_response_house}' corp='${zags_response_building}'/>

                <@sf.fldrow>
                        <@sf.empty colspan="1" />
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label title="Контактная информация" fieldset=true style="text-align:right;" colspan="25"/>
						<@sf.empty colspan="22"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${declarant_phone}" title="Телефон заявителя" required=true style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.textfield  path="form.${declarant_phone}" qtip="" validation="required phone" style="text-align:left;" colspan="12"/>
						<@sf.empty colspan=fixMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan=fixMap["emptyLeft"]/>
						<@sf.label path="form.${declarant_email}" title="E-mail заявителя" required=false style="text-align:right;" colspan=fixMap["label"]/>
						<@sf.empty colspan=fixMap["emptyMiddle"]/>
						<@sf.textfield  path="form.${declarant_email}" qtip="" validation="email" style="text-align:left;" colspan="12"/>
						<@sf.empty colspan=fixMap["emptyRight"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="27"/>
                    <@sf.label title='Дата составления заявления ${currentDate?string("dd.MM.yyyy")}' fieldset=true  style="text-align:right;" colspan="20"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#list 0..47 as x>
                    <@sf.empty colspan="1"/>
                </#list>
                </@sf.fldrow>

</#macro>