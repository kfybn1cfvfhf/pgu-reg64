<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Прием заявлений на организацию временного трудоустройства'>
        <@script.scripttag>
            <@jquery.onready>

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
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Гражданство:" required=true style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.citizenship" dictionaryCode="KIND_OF_CITIZENSHIP" qtip="" validation="required" style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>
 
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Имя:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.firstName" qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Пол:" required=false style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>

						<@sf.radiogroup path="form.sex" dictionaryCode="SEX_TYPES" qtip="" colspan="15" mode="horizontal" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled'/>
					    
						<@sf.empty colspan="5"/>

                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.label title="Отчество (если имеется):" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.middleName" qtip=""  attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="1"/>

						<@sf.label title="Электронная почта:" required=false style="text-align:right;" colspan="4"/>

						<@sf.empty colspan="1"/>

						<@sf.textfield  path="form.mail" validation="email" qtip=""  style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>


                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Дата рождения:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.birthdate"  qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Номер контактного телефона:" required=true style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.tel" qtip="" validation="phone required" style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>


                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Адрес места жительства (пребывания)</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Индекс:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrIndex" qtip="" validation="index required" validationattr={"fractcount":"0"} style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Улица:" required=true style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrUl" qtip="" validation="required" style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>


                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Область:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.textfield path="form.addrObl" qtip="" style="text-align:unknown;" colspan="15"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дом:" required=true style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrDom" qtip="" validation="required" style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>


                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Район:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrRaion" validation="required" qtip=""  style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Корпус:" required=false style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrKorp" qtip=""  style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>


                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.label title="Город/населенный пункт:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrGorod" qtip="" validation="required" style="text-align:left;" colspan="15"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Квартира:" required=false style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.addrKvart" qtip=""  style="text-align:left;" colspan="15"/>
						
						<@sf.empty colspan="5"/>


                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
