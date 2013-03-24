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
    <@html.head title='Информирование безработных о социальных выплатах'>
        <@script.scripttag>
            <@jquery.onready>

                <#-- при поднятии флага "На электронную почту" поле "Адрес электронной почты" становится обязательным -->
                <@action.setRequiredIf onload="true" srcid="q2" event="change" destid="email" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q2" checkboxStatus="on" labelId="label-email" />

                <#-- при опущенном флаге "На почтовый адрес" поля почтового адреса становятся доступны только для чтения -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrIndex" value="off" />   <#-- индекс -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrRaion" value="off" />   <#-- район -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrGorod" value="off" />   <#-- город -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrObl" value="off" />     <#-- область -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrUl" value="off" />      <#-- улица -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrDom" value="off" />     <#-- дом -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrKvart" value="off" />   <#-- квартира -->
                <@action.setReadonlyByValue onload="true" srcid="q3" event="change" destid="addrKorp" value="off" />    <#-- корпус -->

                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrRaion" value="on" />

                <#-- при поднятом флаге "На почтовый адрес" поля почтового адреса заполняются данными из СИА и становятся обязательными для заполнения -->
                <#-- индекс -->
                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrIndex" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q3" checkboxStatus="on" labelId="label-addrIndex" />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrIndex" value=form.prAddrIndex />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrIndex" value="" />
                <#-- район -->
                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrRaion" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q3" checkboxStatus="on" labelId="label-addrRaion" />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrRaion" value=form.prAddrRaion />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrRaion" value="" />
                <#-- город -->
                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrGorod" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q3" checkboxStatus="on" labelId="label-addrGorod" />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrGorod" value=form.prAddrGorod />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrGorod" value="" />
                <#-- область -->
                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrObl" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q3" checkboxStatus="on" labelId="label-addrObl" />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrObl" value=form.prAddrObl />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrObl" value="" />
                <#-- улица -->
                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrUl" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q3" checkboxStatus="on" labelId="label-addrUl" />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrUl" value=form.prAddrUl />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrUl" value="" />
                <#-- дом -->
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrDom" value=form.prAddrDom />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrDom" value="" />
                <#-- квартира -->
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrKvart" value=form.prAddrKvart />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrKvart" value="" />
                <#-- корпус -->
                <@action.setRequiredIf onload="true" srcid="q3" event="change" destid="addrDom" value="on" />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="q3" checkboxStatus="on" labelId="label-addrDom" />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="on" destid="addrKorp" value=form.prAddrKorp />
                <@customActions.setValueByCheckbox onload=true checkboxid="q3" checkboxstatus="off" destid="addrKorp" value="" />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о заявителе</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Фамилия:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.lastName" qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label title="Отчество (если имеется):" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.middleName" qtip="" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Имя:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.firstName" qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label title="СНИЛС:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.snils" qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о запрашиваемой услуге</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Период выплат c:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.date_start"  qtip="" validation="required" style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="2"/>
					
						<@sf.label title="по:" required=true style="text-align:unknown;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.date_end"  qtip="" validation="required" style="text-align:left;" colspan="15"/>


                </@sf.fldrow>

                <@sf.fldrow>
		
						<@sf.empty colspan="8"/>

						<@sf.checkbox path="form.q1" qtip=""  style="text-align:unknown;" colspan="1"/>

						<@sf.label title="В информацию об осуществлении социальных выплат прошу включить выписку из приказов, являющихся основанием для начисления социальных выплат" required=false style="text-align:left;" colspan="41"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Выбор места получения услуги:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.czn" dictionaryCode="CZN_SARATOV" qtip="" validation="required" style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="26"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Информацию о результате предоставления государственной услуги прошу направить</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="8"/>
					
						<@sf.checkbox path="form.q2" qtip=""  style="text-align:right;" colspan="1"/>

						<@sf.label title="На электронную почту" required=false style="text-align:left;" colspan="15"/>

						<@sf.empty colspan="2"/>
						
						<@sf.label id="label-email" title="Адрес электронной почты:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.email" validation="email" qtip=""  style="text-align:left;" colspan="15"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
		
						<@sf.empty colspan="8"/>
					
						<@sf.checkbox path="form.q3" qtip=""  style="text-align:unknown;" colspan="1"/>

						<@sf.label title="На почтовый адрес" required=false style="text-align:left;" colspan="41"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label id="label-addrIndex" title="Индекс:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrIndex" validation="index" qtip=""  style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="2"/>

                        <@sf.label id="label-addrUl" title="Улица:" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.addrUl" qtip=""  style="text-align:left;" colspan="15"/>



                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label id="label-addrObl" title="Область:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.textfield  path="form.addrObl" qtip=""  style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="2"/>
					
                        <@sf.label id="label-addrDom" title="Дом:" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.addrDom" qtip=""  style="text-align:left;" colspan="15"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label id="label-addrRaion" title="Район:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrRaion" qtip=""  style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="2"/>
					
                        <@sf.label id="label-addrKorp"  title="Корпус:" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.addrKorp" qtip=""  style="text-align:left;" colspan="15"/>


                </@sf.fldrow>
				
                <@sf.fldrow>


                        <@sf.label id="label-addrGorod" title="Город/населенный пункт:" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.addrGorod" qtip=""  style="text-align:left;" colspan="15"/>

                        <@sf.empty colspan="2"/>

                        <@sf.label id="label-addrKvart" title="Квартира:" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.addrKvart" qtip=""  style="text-align:left;" colspan="15"/>


                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
