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
    <@html.head title='Осуществление социальных выплат гражданам, признанным в установленном порядке безработными'>
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
                    <@sf.textfield  path="form.last_name" qtip="" validation="required" attr='readonly="readonly"' style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.first_name" title="Имя:" required=true style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.first_name" qtip="" validation="required" attr='readonly="readonly"'  style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.middle_name" title="Отчество:" required=true style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.middle_name" qtip="" validation="required" attr='readonly="readonly"' style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.birth_date" title="Дата рождения:" required=true style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.birth_date" qtip="" validation="required" attr='readonly="readonly"' style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.sex" title="Пол:" required=true style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield path="form.sex" qtip="" validation="required" attr='readonly="readonly"' style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.citizenship" title="Гражданство:" required=true style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.citizenship" dictionaryCode="CITIZENSHIP_LS" qtip="" validation="required" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- <@sf.fldsetlabel title="Документ, удостоверяющий личность" style="text-align:left;font-weight:bold;color:#004B7F;padding:7px;padding-top:10px;font-size:15px;" colspan="46"/>-->
                    <@sf.label id="label_1" title="Документ, удостоверяющий личность" style="text-align:left;" colspan="46" fieldset=true/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.passport_type" title="Тип документа:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.passport_type" qtip="" attr='readonly="readonly"' style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.passport_series" title="Серия:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.passport_series" qtip="" attr='readonly="readonly"' style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.passport_number" title="Номер:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.passport_number" qtip="" attr='readonly="readonly"' style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.passport_given_out" title="Кем выдан:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.passport_given_out" qtip="" attr='readonly="readonly"' style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="17"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.label path="form.passport_delivery_date" title="Дата выдачи:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА.-->
                    <@sf.textfield  path="form.passport_delivery_date" qtip="" attr='readonly="readonly"' style="text-align:left;" colspan="11"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- <@sf.fldsetlabel title="Место регистрации" style="text-align:left;font-weight:bold;color:#004B7F;padding:7px;padding-top:10px;font-size:15px;" colspan="46"/>-->
                    <@sf.label title="Место регистрации" style="text-align:left;" colspan="46" fieldset=true/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_Index" title="Почтовый индекс:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_Index" qtip="" validation="index" style="text-align:left;" colspan="14"/>
                    <@sf.empty colspan="23"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Выбирается из справочника КЛАДР в соответствии с Регионом/Областью-->
                    <@sf.label path="form.addr_common" title="Город/Населенный пункт:" required=true style="text-align:right; " colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Выбирается из справочника КЛАДР в соответствии с Регионом/Областью-->
                    <@sf.dictionaryLookup path="form.addr_common" dictionaryCode="KLADRRegion" title="Город/населенный пункт"

                        qtip="" validation="required" style="text-align:left;" colspan="14"/>
                    <@sf.empty colspan="1"/>
                    <#-- Выбирается из справочника КЛАДР в соответствии с Городом/Населенным пунктом-->
                    <@sf.label path="form.addr_ul" title="Улица:" required=false style="text-align:right;" colspan="4"/>
                    <@sf.empty colspan="1"/>
                    <#-- Выбирается из справочника КЛАДР в соответствии с Городом/Населенным пунктом-->
                    <@sf.dictionaryLookup path="form.addr_ul" dictionaryCode="KLADRStreet" qtip="" title="Улица"
                            dependsOn=[{'fieldId': 'addr_common'}] parentLookup={'fieldId': 'addr_common', 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'}
                        qtip="" style="text-align:left;" colspan="14"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_dom" title="Дом:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_dom" qtip="" validation="maxlength" validationattr={"maxlength": 10} attr='maxlength="10"' style="text-align:left;" colspan="7"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_korp" title="Корпус (строение):" required=false style="text-align:right;" colspan="8"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_korp" qtip="" validation="maxlength" validationattr={"maxlength": 10} attr='maxlength="10"' style="text-align:left;" colspan="5"/>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_kvart" title="Квартира:" required=false style="text-align:right;" colspan="5"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_kvart" qtip="" validation="maxlength" validationattr={"maxlength": 10} attr='maxlength="10"' style="text-align:left;" colspan="5"/>
                    <@sf.empty colspan="3"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- <@sf.fldsetlabel title="Контактные данные" style="text-align:left;font-weight:bold;color:#004B7F;padding:7px;padding-top:10px;font-size:15px;" colspan="46"/>-->
                    <@sf.label title="Контактные данные" style="text-align:left;" colspan="46" fieldset=true/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.tel" title="Контактный телефон:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.tel" qtip="" validation="phone" style="text-align:left;" colspan="14"/>
                    <@sf.empty colspan="23"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Значение должно валидироваться по маске электронной почты: x@x.x-->
                    <@sf.label path="form.mail" title="Адрес электронной почты:" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <#-- Значение должно валидироваться по маске электронной почты: x@x.x-->
                    <@sf.textfield  path="form.mail" qtip="" validation="email" style="text-align:left;" colspan="14"/>
                    <@sf.empty colspan="23"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="48"/>
                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
