<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Содействие работодателям в подборе необходимых работников'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrPostalCode' value='on' />

                <@customActions.setLookupReadonlyByCheckbox onload=true checkboxId="addrIdentical" checkboxStatus="on" lookupId="fAdrOKATO" />

                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrLocality' value='on' />
                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrCity' value='on' />
                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrStreet' value='on' />
                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrHouse' value='on' />
                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrBuilding' value='on' />
                <@action.setReadonlyByValue onload='true' srcid='addrIdentical' event='change' destid='fAdrFlat' value='on' />

                $("#addrIdentical").change(function(eventObj){
                    if ($(eventObj.target).attr("checked")) {
                        $("#fAdrPostalCode").attr('value',$("#adrPostalCode").attr('value'));

                        $("#fAdrOKATO").attr('value',$("#adrOKATO").attr('value'));
                        $("#fAdrOKATO-lookup-form-text").attr('value',$("#adrOKATO-lookup-form-text").attr('value'));

                        $("#fAdrLocality").attr('value',$("#adrLocality").attr('value'));
                        $("#fAdrCity").attr('value',$("#adrCity").attr('value'));
                        $("#fAdrStreet").attr('value',$("#adrStreet").attr('value'));
                        $("#fAdrHouse").attr('value',$("#adrHouse").attr('value'));
                        $("#fAdrBuilding").attr('value',$("#adrBuilding").attr('value'));
                        $("#fAdrFlat").attr('value',$("#adrFlat").attr('value'));
                    }
                });

                $("#adrPostalCode").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrPostalCode").attr('value',eventObj.target.value);
                    }
                });
                $("#adrOKATO-lookup-form-text").change(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrOKATO").attr('value',$("#adrOKATO").attr('value'));
                        $("#fAdrOKATO-lookup-form-text").attr('value',eventObj.target.value);
                    }
                });
                $("#adrLocality").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrLocality").attr('value',eventObj.target.value);
                    }
                });
                $("#adrCity").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrCity").attr('value',eventObj.target.value);
                    }
                });
                $("#adrStreet").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrStreet").attr('value',eventObj.target.value);
                    }
                });
                $("#adrHouse").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrHouse").attr('value',eventObj.target.value);
                    }
                });
                $("#adrBuilding").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrBuilding").attr('value',eventObj.target.value);
                    }
                });
                $("#adrFlat").blur(function(eventObj){
                    if ($("#addrIdentical").attr("checked")) {
                        $("#fAdrFlat").attr('value',eventObj.target.value);
                    }
                });

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Контактная информация</h2></@sf.statictext>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Фамилия, имя, отчество (если имеется):" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.decName" qtip="" validation="required" style="text-align:unknown;" colspan="12" attr='readonly="true"' wrapperClass='fieldDisabled'/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Телефон:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.decMobilePhone" qtip="" validation="phone required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>



                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Должность:" required=false style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.decProf" qtip=""  style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Факс:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.decFax" qtip="" validation="phone" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="22"/>
					
						<@sf.label title="Адрес электронной почты:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.decEmail" qtip="" validation="email"  style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="18"><h2>Юридический адрес</h2></@sf.statictext>
					
						<@sf.empty colspan="3"/>
					
						<@sf.statictext style="text-align:left;" colspan="21"><h2>Фактический адрес</h2></@sf.statictext>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="22"/>
					
						<@sf.checkbox path="form.addrIdentical" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Совпадение адресов" required=false style="text-align:left;" colspan="19"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Индекс:" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrPostalCode" qtip="" validation="required" style="text-align:unknown;" colspan="12" validation="index"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Индекс:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrPostalCode" qtip="" validation="required" style="text-align:unknown;" colspan="12" validation="index"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>

				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Регион:" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.adrOKATO" dictionaryCode="OKATO" rootItemCode="00000000000" terminalLevel="1" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<#-- Передаем DICITEM_EXTCODE-->
                        <@sf.label title="Регион:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Передаем DICITEM_EXTCODE-->
                        <@sf.dictionaryLookup path="form.fAdrOKATO" dictionaryCode="OKATO" rootItemCode="00000000000" terminalLevel="1" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Район:" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrLocality" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Район:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrLocality" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Город:" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrCity" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Город:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrCity" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Улица:" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrStreet" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Улица:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrStreet" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дом:" required=true style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrHouse" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Дом:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrHouse" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Корпус:" required=false style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrBuilding" qtip=""  style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Корпус:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrBuilding" qtip=""  style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Квартира:" required=false style="text-align:right;" colspan="5"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.adrFlat" qtip=""  style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="3"/>
					
						<@sf.label title="Квартира:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fAdrFlat" qtip=""  style="text-align:unknown;" colspan="12"/>
					
						<@sf.empty colspan="7"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Проезд (вид транспорта, название остановки):" required=false style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<@sf.textfield  path="form.driveway" qtip=""  style="text-align:unknown;" colspan="25"/>

						<@sf.empty colspan="15"/>

                </@sf.fldrow>



		
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Передаем DICITEM_EXTCODE-->
<@sf.label title="Выберите центр занятости населения для получения данной услуги:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Передаем DICITEM_EXTCODE-->
<@sf.dictionaryLookup path="form.czn" dictionaryCode="CZN_SARATOV" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="15"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
