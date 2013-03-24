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
<#import "../customTemplates/generic/customForm.ftl" as customForm>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки о рождении'>
        <@script.scripttag>

            function widthCorrect(){

                var width = '170px';
                var separatorWidth = '16px';

                if (jQuery.browser.msie) {
                   width = '178px';
                   separatorWidth = '17px';
                }
                else if (jQuery.browser.mozilla) {
                    width = '168px';
                    separatorWidth = '16px';
                }

                <#--$('#addr_agency_building').parent().css('width',width);
                $('#addr_agency_building_separator').css('width',separatorWidth);-->
            }
            <@jquery.onready>
                //***********правка дизайна**********//
                widthCorrect();



                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_country' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_index' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_place' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_house' ''/>-->
                <#--<@action.setHiddenByValue 'true' 'addr_agency_street_type' 'change' 'addr_agency_street' '74' />-->

                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_country' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_index' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_place_gr' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_street' ''/>-->
                <#--<@action.unsetRequiredByField 'true' 'addr_agency' 'keyup' 'addr_agency_house' ''/>-->


                <#--<@action.setHiddenByValue 'true' 'addr_agency_street_type' 'change' 'addr_agency_street' '74' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency_street_type' 'change' 'addr_agency_street' '1' />-->


                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_country' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_index' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_settlement' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_street_type' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_street' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_house' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_state' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_region' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_building' '' />-->
                <#--<@action.setDisabledByValue 'true' 'addr_agency' 'keyup' 'addr_agency_place_gr' '' />-->
                <#--<@util.preSettlementScript field='addr_agency_place' />-->
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
                    <@sf.statictext style="text-align:left;" colspan="47">
                        Если вы хотите получить повторное свидетельство не в вашем ЗАГСе, то укажите ЗАГС-получатель
                        <br/>
                    </@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.addr_agency" title="ЗАГС - получатель" required=false style="text-align:right;" colspan="6"/>
                        <@sf.empty colspan="1"/>
						<@sf.textfield  path="form.addr_agency" qtip="" validation="regexp maxlength" validationattr={'maxlength':'200', 'regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s.,/№()-]{0,200}$/'} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов №(-)/|,."} style="text-align:left;" colspan="29"/>
					    <@sf.empty colspan="11"/>
                </@sf.fldrow>
				
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label fieldset=true title="Адрес органа ЗАГС" required=false style="text-align:left;" colspan="36"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_country" title="Страна" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.dictionaryLookup  path="form.addr_agency_country" qtip="" dictionaryCode='COUNTRY_LS' style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_state" title="Область (край, респ.)" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.textfield  path="form.addr_agency_state" qtip="" validation="regexp maxlength" validationattr={'regexp':'/^[ёЁА-Яа-я\\s()-]{0,200}$/', "maxlength": "80"}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_region" title="Район" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.textfield  path="form.addr_agency_region" qtip="" validation="regexp maxlength" validationattr={'regexp':'/^[ёЁА-Яа-я\\s()-]{0,200}$/', "maxlength": "80"}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
                        <#--<@sf.label path="form.addr_agency_index" title="Почтовый индекс" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
                        <#--<@sf.textfield  path="form.addr_agency_index" qtip="" validation="index" style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
                <#--<@util.settlement  field='addr_agency_place' labelTitle="Способ заполнения типа населенного пункта" title="Тип населенного пункта" dictionary="SETTELEMENT_TYPE_LS"-->
                <#--validation="regexp required maxlength" validationattr={'maxlength':'20','regexp':'/^[\\|\\"ёЁА-Яа-я./ \\-]{0,200}$/',"message":"Допустим ввод кириллицы и символов ./-"}-->
                <#--labelCollspan=6 fieldCollspan=29 rightCollspan=11/>-->

                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_settlement" title="Населенный пункт" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.textfield  path="form.addr_agency_settlement" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'200','regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,200}$/',"message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_street_type" title="Тип улицы" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.dictionaryLookup path="form.addr_agency_street_type" dictionaryCode="STREET_TYPE_LS" qtip=""  style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_street" title="Улица" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.textfield  path="form.addr_agency_street" qtip="" validation="regexp required maxlength" validationattr={'maxlength':'33','regexp':'/^[\\|\\"ёЁА-Яа-я0-9\\s./№()-]{0,200}$/',"message":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="29"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				<#---->
                <#--<@sf.fldrow>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.label path="form.addr_agency_house" title="Дом" required=false style="text-align:right;" colspan="6"/>-->
						<#--<@sf.empty colspan="1"/>-->
						<#--<@sf.textfield  path="form.addr_agency_house" qtip="" validation="maxlength" validationattr={'maxlength':'7'}  style="text-align:left;" colspan="5"/>-->
						<#--<@sf.empty colspan="7"/>-->
						<#--<@sf.label path="form.addr_agency_building" title="Корпус" required=false style="text-align:right ;" colspan="7"/>-->
						<#--<@customForm.empty id="addr_agency_building_separator" useId=true useAutoWidth=false colspan="1"/>-->
						<#--<@sf.textfield  path="form.addr_agency_building" qtip="" validation="maxlength" validationattr={'maxlength':'4'} style="text-align:left;" colspan="9"/>-->
						<#--<@sf.empty colspan="11"/>-->
                <#--</@sf.fldrow>-->
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	