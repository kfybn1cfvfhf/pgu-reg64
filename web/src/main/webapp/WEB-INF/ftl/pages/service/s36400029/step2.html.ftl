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
					
						<@sf.statictext style="text-align:left;" colspan="50">Укажите, относитесь ли Вы к одной из следующих категорий, дающих право на получение дополнительных услуг со стороны службы занятости населения:</@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.checkboxGroup path="form.categories" style="text-align:left;" colspan="50" staticOpts={
						    '1':'Инвалиды',
						    '2':'Лица, освобожденные из учреждений, исполняющих наказание в виде лишения свободы',
						    '3':'Несовершеннолетние в возрасте от 14 до 18 лет',
						    '4':'Лица предпенсионного возраста (за два года до наступления возраста, дающего право выхода на трудовую пенсию по старости, в том числе досрочно назначаемую трудовую пенсию по старости)',
						    '5':'Беженцы и вынужденные переселенцы',
						    '6':'Граждане, уволенные с военной службы, и члены их семей',
						    '7':'Одинокие и многодетные родители, воспитывающие несовершеннолетних детей, детей-инвалидов',
						    '8':'Граждане, подвергшиеся воздействию радиации вследствие чернобыльской и других радиационных аварий и катастроф',
						    '9':'Граждане в возрасте от 18 до 20 лет из числа выпускников учреждений начального и среднего профессионального образования, ищущие работу впервые'
						}/>

                </@sf.fldrow>
 
                <@sf.fldrow>
					
						<@sf.label title="Дополнительная информация:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.wantOther" qtip=""  style="text-align:left;" colspan="29"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- В качестве значения переменной передается поле dicitem_extcode из БД-->
                        <@sf.label title="Выбор места получения услуги:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- В качестве значения переменной передается поле dicitem_extcode из БД-->
                        <@sf.dictionaryLookup path="form.czn" validation="required" dictionaryCode="CZN_SARATOV" qtip=""  style="text-align:left;" colspan="29"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
