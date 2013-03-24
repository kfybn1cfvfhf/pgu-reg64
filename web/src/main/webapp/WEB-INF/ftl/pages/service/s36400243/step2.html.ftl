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
    <@html.head title='Содействие работодателям в подборе необходимых работников'>
        <style type="text/css">
            .form-body {
                width:100%;
            }
        </style>
        <@script.scripttag>

            function updateFactAddress(){
                if ($('#coincidenc_adress').val() == 'on'){
                    var pairs = [
                        { from: 'addr_index_doc', to: 'addr_index' }
                       ,{ from: 'commonAddress-lookup-form-text', to: 'fcommonAddress-lookup-form-text' }
                       ,{ from: 'addr_ul_doc-lookup-form-text', to: 'addr_ul-lookup-form-text' }
                       ,{ from: 'addr_dom_doc', to: 'addr_dom' }
                       ,{ from: 'addr_korp_doc', to: 'addr_korp' }
                    ];
                    $.each(pairs, function(){
                        setValueByField(this.from, this.to);
                    });
                }
            }

            <@jquery.onready>
			    <@action.setDisabledByValue 'true' 'coincidenc_adress' 'change' 'addr_index' 'on'/>
			    <@action.setDisabledByValue 'true' 'coincidenc_adress' 'change' 'fcommonAddress' 'on'/>
			    <@action.setDisabledByValue 'true' 'coincidenc_adress' 'change' 'addr_ul' 'on'/>
			    <@action.setDisabledByValue 'true' 'coincidenc_adress' 'change' 'addr_dom' 'on'/>
			    <@action.setDisabledByValue 'true' 'coincidenc_adress' 'change' 'addr_korp' 'on'/>
                $('#coincidenc_adress')
                    .add('#addr_index_doc')
                    .add('#commonAddress-lookup-form-text')
                    .add('#addr_ul_doc-lookup-form-text')
                    .add('#addr_dom_doc')
                    .add('#addr_korp_doc')
                    .change(function(){
                    updateFactAddress();
                });

                    if ($('#coincidenc_adress').val() == 'on'){
                    updateFactAddress();
                    }

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
                    <#-- Недоступно для редактирования. Данные из СИА-->
                    <@sf.label path="form.dec_name" title="Ф.И.О. заявителя:" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <#-- Недоступно для редактирования. Данные из СИА-->
                    <@sf.textfield  path="form.dec_name" qtip="" attr='readonly="readonly"' validation="required" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.dec_position" title="Должность заявителя:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.dec_position" qtip="" validation="maxlength" validationattr={"maxlength": 255} attr='maxlength="255"'
                        style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.tel" title="Телефон заявителя:" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.tel" qtip="" validation="phone maxlength required"
                            validationattr={"maxlength":30} attr="maxlength='30'" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Значение должно валидироваться по маске электронной почты: x@x.x-->
                    <@sf.label path="form.mail" title="Адрес электронной почты заявителя:" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <#-- Значение должно валидироваться по маске электронной почты: x@x.x-->
                    <@sf.textfield  path="form.mail" qtip="" validation="email required" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- <@sf.fldsetlabel title="Сведения об образовании" style="text-align:left;font-weight:bold;color:#004B7F;padding:7px;padding-top:10px;font-size:15px;" colspan="46"/>-->
                    <@sf.label title="Адрес юридического лица по учредительным документам" style="text-align:left;" colspan="46" fieldset=true/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_index_doc" title="Индекс:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_index_doc" qtip="" validation="index" style="text-align:left;" colspan="10"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.commonAddress" title="Город/Населенный пункт:" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.commonAddress" dictionaryCode="KLADRRegion" qtip="" terminalLevel="3" validation="required"
                        style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_ul_doc" title="Улица:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <#-- Содержимое поля #street  выбирается из справочника КЛАДР в соответствии с Город/Населенный пункт.-->
                    <@sf.dictionaryLookup path="form.addr_ul_doc" dictionaryCode="KLADRStreet"
                        parentLookup={'fieldId': 'commonAddress', 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'}
                        qtip="" style="text-align:unknown;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_dom_doc" title="Дом:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_dom_doc" qtip="" validation="maxlength" validationattr={"maxlength": 5} attr='maxlength="5"'
                        style="text-align:unknown;" colspan="10"/>
                    <@sf.empty colspan="5"/>
                    <@sf.label path="form.addr_korp_doc" title="Корпус (строение):" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_korp_doc" qtip="" validation="maxlength" validationattr={"maxlength": 5} attr='maxlength="5"'
                        style="text-align:unknown;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- <@sf.fldsetlabel title="Сведения об образовании" style="text-align:left;font-weight:bold;color:#004B7F;padding:7px;padding-top:10px;font-size:15px;" colspan="46"/>-->
                    <@sf.label title="Фактический адрес юридического лица" style="text-align:left;" colspan="46" fieldset=true/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.coincidenc_adress" title="Фактический адрес юридического лица совпадает с адресом по учредительным документам"
                        required=false style="text-align:right;" colspan="20"/>
                    <@sf.empty colspan="1"/>
                    <@sf.checkbox path="form.coincidenc_adress" qtip=""  style="text-align:left;" colspan="10"/>
                    <@sf.empty colspan="16"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_index" title="Индекс:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_index" qtip="" validation="index" style="text-align:unknown;" colspan="10"/>
                    <@sf.empty colspan="26"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.fcommonAddress" title="Город/Населенный пункт:" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.fcommonAddress" dictionaryCode="KLADRRegion" qtip="" terminalLevel="3" validation="required" style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Содержимое поля #street  выбирается из справочника КЛАДР в соответствии с Город/Населенный пункт.-->
                    <@sf.label path="form.addr_ul" title="Улица:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <#-- Содержимое поля #street  выбирается из справочника КЛАДР в соответствии с Город/Населенный пункт.-->
                    <@sf.dictionaryLookup path="form.addr_ul" dictionaryCode="KLADRStreet"
                        parentLookup={'fieldId': 'fcommonAddress', 'dependency': 'LookupWidget.dependency["КЛАДР:Населённый-пункт"]'}
                        qtip="" style="text-align:unknown;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label path="form.addr_dom" title="Дом:" required=false style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_dom" qtip="" validation="maxlength" validationattr={"maxlength": 5} attr='maxlength="5"'
                        style="text-align:unknown;" colspan="10"/>
                    <@sf.empty colspan="5"/>
                    <@sf.label path="form.addr_korp" title="Корпус (строение):" required=false style="text-align:right;" colspan="9"/>
                    <@sf.empty colspan="1"/>
                    <@sf.textfield  path="form.addr_korp" qtip="" validation="maxlength" validationattr={"maxlength": 5} attr='maxlength="5"'
                        style="text-align:unknown;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <#-- Выбирается из справочника КЛАДР в соответствии с Регион/Область-->
                    <@sf.label path="form.raion" title="Выберите район для получения услуги:" required=true style="text-align:right;" colspan="10"/>
                    <@sf.empty colspan="1"/>
                    <#-- Выбирается из справочника КЛАДР в соответствии с Регион/Область-->
                    <@sf.dictionaryLookup path="form.raion" dictionaryCode="VARIANT_TRANCHE_LS" select=true qtip="" terminalLevel="2" validation="required"
                        style="text-align:left;" colspan="35"/>
                    <@sf.empty colspan="1"/>
                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
