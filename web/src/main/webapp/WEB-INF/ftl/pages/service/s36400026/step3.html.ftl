<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title=' Содействие работодателям в подборе необходимых работников'>
        <@script.scripttag>
            <@jquery.onready>
	            <@validators.addCustomValidators/>

	            function workPlacesCountValidate(value) {
	                return Number(value) > Number($("#workers").val());
	            }
	            <@validation.addvalidatormethod hasparams=false name="workplacescount" funcname="workPlacesCountValidate(value)" messagecode="Количество рабочих мест должно быть больше количества работников" />
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
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Дополнительные сведения об организации</h2></@sf.statictext>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- > 0-->
                        <@sf.label title="Численность работников:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- > 0-->
                        <@sf.textfield  path="form.workers" qtip="" validation="required digits moreThenZero" style="text-align:unknown;" colspan="12"/>

						<@sf.empty colspan="28"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- >= 0-->
                        <@sf.label title="Уволено в году:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- >= 0-->
                        <@sf.textfield  path="form.discharge" qtip="" validation="digits required" style="text-align:unknown;" colspan="12"/>

						<@sf.empty colspan="28"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- >= Численность работников-->
                        <@sf.label title="Количество рабочих мест:" required=true style="text-align:right;" colspan="8"/>

						<@sf.empty colspan="1"/>

						<#-- >= Численность работников-->
                        <@sf.textfield  path="form.workersCount" qtip="" validation="required workplacescount" style="text-align:unknown;" colspan="12"/>

						<@sf.empty colspan="28"/>

                </@sf.fldrow>

                <@sf.fldrow>



                        <@sf.empty colspan="41"/>

                </@sf.fldrow>


                    <@sf.fldrow >

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Соц. пакет:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.checkboxLookup path="form.socialPacket" dictionaryCode="SOCIAL_CONDITIONS"  qtip="" style="text-align:left;" colspan="20"/>

                            <@sf.empty colspan="29"/>

                    </@sf.fldrow>


                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.statictext style="text-align:left;" colspan="37"><h2>Укажите способ размещения вакансий</h2></@sf.statictext>

						<@sf.empty colspan="12"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="В банке вакансий на:" required=false style="text-align:left;" colspan="8"/>

						<@sf.empty colspan="1"/>

                        <@sf.checkboxLookup path="form.bankVacan" dictionaryCode="JOB_BANK" qtip="" colspan="20" />

						<@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="2"/>

						<@sf.checkbox path="form.placement4" qtip=""  style="text-align:unknown;" colspan="1"/>

						<@sf.empty colspan="1"/>

						<@sf.label title="В сети интернет" required=false style="text-align:left;" colspan="34"/>

						<@sf.empty colspan="12"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="2"/>

						<@sf.checkbox path="form.placement5" qtip=""  style="text-align:unknown;" colspan="1"/>

						<@sf.empty colspan="1"/>

						<@sf.label title="В средствах массовой информации" required=false style="text-align:left;" colspan="34"/>

						<@sf.empty colspan="12"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.statictext style="text-align:left;" colspan="37"><h2>Согласен на участие в следующих мероприятиях активной политики занятости (выбрать нужное)</h2></@sf.statictext>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.checkbox path="form.active_Actions" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Участвовать в ярмарках" required=false style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.checkbox path="form.active_Actions1" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Участвовать в оплачиваемых общественных работах" required=false style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.checkbox path="form.active_Actions2" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Участвовать во временном трудоустройстве несовершеннолетних граждан в возрасте от 14 до 18 лет в свободное от учебы время" required=false style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.checkbox path="form.active_Actions3" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Участвовать во временном трудоустройстве безработных граждан в возрасте от 18 до 20 лет из числа выпускников учреждений начального и среднего профессионального образования, ищущих работу впервые" required=false style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="2"/>
					
						<@sf.checkbox path="form.active_Actions4" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Участвовать во временном трудоустройстве безработных граждан, испытывающих трудности в поиске работы" required=false style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
