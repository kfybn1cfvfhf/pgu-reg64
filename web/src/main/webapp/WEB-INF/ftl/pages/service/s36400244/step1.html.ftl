<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../landresource/style.ftl" as st>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@st.style/>
    <@html.head title='Организация проведения оплачиваемых общественных работ'>
    <#assign fieldsMap={
                "field":25,
                "label":10,
                "emptyLeft":1,
                "emptyRight":11,
                "emptyMiddle": 1 }
                />
        <@script.scripttag>
            <@jquery.onready>
			<@action.setReadonlyByValue  'true' 'label_1' 'change' 'last_name' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'first_name' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'middle_name' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'birth_date' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'sex' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'passport_type' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'passport_series' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'passport_number' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'passport_given_out' ''/>
            <@action.setReadonlyByValue  'true' 'label_1' 'change' 'passport_delivery_date' ''/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.last_name" title="Фамилия:" required=true style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.last_name" validation="required maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" qtip=""  style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.first_name" title="Имя:" required=true style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.first_name" validation="required maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" qtip=""  style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.middle_name" title="Отчество:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.middle_name" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.birth_date" title="Дата рождения:" required=true style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.birth_date" qtip="" validation="required"  style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.sex" title="Пол:" required=true style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield path="form.sex" qtip="" validation="required" style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.citizenship" title="Гражданство:" required=true style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.citizenship" dictionaryCode="CITIZENSHIP_LS" title='Гражданство' qtip="" validation="required" style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.label fieldset=true id='label_1' title="Документ, удостоверяющий личность" style="text-align:left;"  colspan="46"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.passport_type" title="Тип документа:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.passport_type" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.passport_series" title="Серия:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.passport_series" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.passport_number" title="Номер:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.passport_number" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.passport_given_out" title="Кем выдан:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.passport_given_out" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.label path="form.passport_delivery_date" title="Дата выдачи:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Недоступно для редактирования. Данные из СИА.-->
                        <@sf.textfield  path="form.passport_delivery_date" qtip=""  style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						 <@sf.label fieldset=true title="Место регистрации" style="text-align:left;" colspan="46"/>

						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.addr_Index" title="Почтовый индекс:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addr_Index" qtip="" validation="index maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- Выбирается из справочника КЛАДР-->
                        <@sf.label path="form.addr_obl" title="Город/Населенный пункт:" required=true style="text-align:right;" colspan="9"/>

						<@sf.empty colspan="1"/>

						<#-- Выбирается из справочника КЛАДР-->
                        <@sf.dictionaryLookup path="form.addr_obl" dictionaryCode="KLADRRegion" title="Город/Населенный пункт" qtip=""  validation="required" style="text-align:left;" colspan="34"/>

                        <@sf.empty colspan="3"/>
                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.empty colspan="1"/>
					
						<#-- Выбирается из справочника КЛАДР в соответствии с Городом/Населенным пунктом-->
                        <@sf.label path="form.addr_ul" title="Улица:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Выбирается из справочника КЛАДР в соответствии с Городом/Населенным пунктом-->
                        <@sf.dictionaryLookup path="form.addr_ul" dictionaryCode="KLADRStreet" qtip="" title="Улица"
                            dependsOn=[{'fieldId': 'addr_obl'}] parentLookup={'fieldId': 'addr_obl', 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'}
                            style="text-align:left;" colspan="34"/>
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.addr_dom" title="Дом:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addr_dom" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.addr_korp" title="Корпус (строение):" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addr_korp" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.addr_kvart" title="Квартира:" required=false style="text-align:right;" colspan="7"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addr_kvart" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="5"/>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						 <@sf.label fieldset=true title="Контактные данные" style="text-align:left;" colspan="46"/>

						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.tel" title="Контактный телефон:" required=false style="text-align:right;" colspan="9"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.tel" qtip="" validation="phone maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="12"/>
					
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#--<@sf.empty colspan="1"/>-->
					
						<#-- Значение должно валидироваться по маске электронной почты: x@x.x-->
                        <@sf.label path="form.mail" title="Адрес электронной почты:" required=false style="text-align:right;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Значение должно валидироваться по маске электронной почты: x@x.x-->
                        <@sf.textfield  path="form.mail" qtip="" validation="email maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'" style="text-align:left;" colspan="12"/>
						<@sf.empty colspan="25"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
