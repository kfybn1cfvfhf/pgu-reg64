<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../utils.ftl" as utils>
<#import "../customTemplates/generic/switchableAgencyPlace.ftl" as switchableAgencyPlace>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства о браке'>
        <@script.scripttag>
            <@jquery.onready>
                <@utils.pguCyrillicNumberValidator/>
                <#--<@switchableAgencyPlace.onReady/>

				<@action.linkDestFromList onload='true' destid='street' event='change' sourceids=['addr_agency', 'addr_agency_street_type'] eventDest="change" delimited='|' />

                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_country' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_index' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_place' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_house' ''/>
                <@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_place_gr' ''/>

                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_country' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_state' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_region' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_index' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place_m' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place_gr' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_street' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_house' '' />
                <@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_building' '' />

                <@action.setDisabledByValue 'false' 'addr_agency_street_type' 'change' 'addr_agency_street' '1' />-->

				<#--<@action.setVisibleByValue 'true' 'addr_agency_place_gr' 'change' 'addr_agency_place' '1' />-->
				<#--<@action.setVisibleByValue 'true' 'addr_agency_place_gr' 'change' 'addr_agency_place_m' '2' />-->

				<#--$("#addr_agency").keyup(function() {
					if (!this.value) {
						setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "disabled", true);');
					} else if ($("#addr_agency_street_type").val() == "1") {
						setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "disabled", true);');
					} else {
						setTimeout('descriptorTarget("addr_agency_street").descriptor("setAttribute", "enabled", true);');
					}
				});-->

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
						<@sf.label title="Если вы хотите получить повторное свидетельство не в вашем ЗАГСе, то укажите ЗАГС-получатель" required=false style="text-align:left;" colspan="46"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency" title="ЗАГС - получатель" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency" qtip="" validation="regexp" attr='maxlength="200"' validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|,."} style="text-align:left;" colspan="29"/>
					    <@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <#--<@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Адрес органа ЗАГС" required=false style="text-align:left;font-weight:bold;" colspan="36"/>
						<@sf.empty colspan="11"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_agency_country" title="Страна" required=false style="text-align:right;" colspan="6"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup  path="form.addr_agency_country" qtip="" attr='maxlength="200"'  dictionaryCode="COUNTRY_LS" style="text-align:left;" colspan="29"/>
                    <@sf.empty colspan="11"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency_state" title="Область (край, респ.)" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency_state" qtip="" validation="regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="29"/>
					    <@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency_region" title="Район" required=false style="text-align:right;" colspan="6"/>
                        <@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency_region" qtip="" validation="regexp" attr='maxlength="80"' validationattr={'regexp':'/^[ЁёА-Яа-я\\s()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="29"/>
					    <@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						&lt;#&ndash; Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".&ndash;&gt;
                        <@sf.label path="form.addr_agency_index" title="Почтовый индекс" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						&lt;#&ndash; Формат корректного почтового индекса: "xxxxxx", где x = 0..9. Если неверно введён, предупреждаем об этом и блокируем кнопку "Продолжить".&ndash;&gt;
                        <@sf.textfield  path="form.addr_agency_index" validation="index maxlength" attr='maxlength="6"' qtip=""  style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="11"/>
                </@sf.fldrow>

				
                <@switchableAgencyPlace.formField />

				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency_settlement" title="Населенный пункт" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency_settlement" qtip="" validation="regexp maxlength" attr='maxlength="200"'  validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,200}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)./|"} style="text-align:left;" colspan="29"/>
					    <@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency_street_type" title="Тип улицы" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.addr_agency_street_type" dictionaryCode="STREET_TYPE_LS" qtip=""  style="text-align:left;" colspan="29"/>
						<@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency_street" title="Улица" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency_street" qtip="" validation="regexp required" attr='maxlength="33"' validationattr={'regexp':'/^[\\|\\"ЁёА-Яа-я0-9\\s./№()-]{0,33}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="29"/>
					    <@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency_house" title="Дом" required=false style="text-align:right;" colspan="6"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency_house" qtip=""  validation="maxlength" attr='maxlength="7"'  style="text-align:left;" colspan="6"/>
						<@sf.empty colspan="2"/>
						<@sf.label path="form.addr_agency_building" title="Корпус" required=false style="text-align:right;" colspan="9"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency_building" qtip="" validation="maxlength" attr='maxlength="4"'  style="text-align:left;" colspan="10"/>
						<@sf.empty colspan="12"/>
                </@sf.fldrow>-->

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>