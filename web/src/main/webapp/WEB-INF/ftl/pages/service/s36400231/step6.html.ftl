<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/util.ftl" as util>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о смерти'>
        <@script.scripttag>
            <@jquery.onready>
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_country' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_index' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_place' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_house' ''/>

                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_country' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_index' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_place' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' ''/>

                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_house' ''/>

                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_country' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_index' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' '' />

                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' '' />

                <@action.setDisabledByValue 'true' 'addr_agency_street_type' 'change' 'addr_agency_street' '1' />
                $('#addr_agency_street_type').change(function(){
                    if ($('#addr_agency_street_type').val() == '1'){
                        setTimeout(function(){
                            $('#addr_agency_street').valid();
                        }, 200)
                    }
                });
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_house' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_state' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_region' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_building' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_street' ''/>
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place_gr' ''/>

                $("#addr_agency").keyup(function() {
                    if (!this.value) {
                    setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "disabled", true);');
                    } else if ($("#addr_agency_street_type").val() == "1") {
                    setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "disabled", true);');
                    } else {
                    setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "enabled", true);');
                    }
                });-->

                <@util.preSettlementScript field='addr_agency_place' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Если вы хотите получить повторное свидетельство не в вашем ЗАГСе, то укажите ЗАГС-получатель" colspan="46" style="text-align:left;" />
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <#assign colspans = {
                <#-- left == 1; middle == 1 -->
                "right":    "6",
                "field":    "28",
                "label":    "12"
                }/>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency" title="ЗАГС-получатель" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency" qtip="" validation="regexp" attr="maxlength='200'" validationattr={'regexp':'/^[\\|\\"А-Яа-я0-9Ёё\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <#--<@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label title="Адрес органа ЗАГС" fieldset=true required=false style="text-align:left;font-weight:bold" colspan="36"/>
                    <@sf.empty colspan="11"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_country" title="Страна" required=true style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.addr_agency_country" dictionaryCode="COUNTRY_LS" validation="required " qtip="" style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_state" title="Область (край, респ.)" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency_state" validation="regexp" attr="'maxlength=80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} attr = "maxlength='80'" qtip=""  style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_region" title="Район" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency_region" validation="regexp" attr="'maxlength=80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/i'}  validationMessage={"regexp":"Допустим ввод кириллицы, пробела и символа -"} attr = "maxlength='80'" qtip=""  style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                &lt;#&ndash; Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".&ndash;&gt;
                    <@sf.label path="form.addr_agency_index" title="Почтовый индекс" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                &lt;#&ndash; Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".&ndash;&gt;
                    <@sf.textfield  path="form.addr_agency_index" validation="index" qtip=""  style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>
                <@util.settlement  field='addr_agency_place' labelTitle="Способ заполнения типа населенного пункта" title="Тип населенного пункта" dictionary="SETTELEMENT_TYPE_LS"
                validation="regexp required maxlength"  validationattr={'regexp':'/^[\\|\\"ёЁА-Яа-я./\\- ]*$/',"message":"Допустим ввод кириллицы и символов ./-",'maxlength':20}
                labelCollspan=colspans["label"] fieldCollspan=colspans["field"]  rightCollspan=colspans["right"]/>


                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_settlement" title="Населенный пункт" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency_settlement" validation="regexp" attr="'maxlength=80'" validationattr={'regexp':'/^[\\|\\"А-Яа-я0-9ёЁ\\s./№()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} qtip=""  style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_street_type" title="Тип улицы" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.addr_agency_street_type" dictionaryCode="STREET_TYPE_LS" qtip=""  style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_street" title="Улица" required=false style="text-align:right;" colspan=colspans["label"]/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency_street" validation="regexp" attr="'maxlength=33'" validationattr={'regexp':'/^[\\|\\"А-Яа-я0-9ёЁ\\s./№()-]{0,33}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."}  qtip=""  style="text-align:left;" colspan=colspans["field"]/>
                    <@sf.empty colspan=colspans["right"]/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_house" title="Дом" required=false style="text-align:right;" colspan="12"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency_house" qtip=""  style="text-align:left;"  attr="maxlength='7'" colspan="8"/>
                    <@sf.empty colspan="2"/>
                    <@sf.label path="form.addr_agency_building" title="Корпус" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_agency_building" qtip="" attr="maxlength='4'"  style="text-align:left;" colspan="8"/>
                    <@sf.empty colspan="7"/>
                </@sf.fldrow>-->

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	