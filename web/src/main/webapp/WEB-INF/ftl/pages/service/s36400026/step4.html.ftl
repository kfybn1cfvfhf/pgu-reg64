<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Содействие работодателям в подборе необходимых работников'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
			    <@action.cloneFormRowWithArrays clonesectionclass='clonesectionVacation' hideButtonSections='true' />
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
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Сведения о вакансиях предприятия</h2></@sf.statictext>
					
						<@sf.empty colspan="3"/>
					
                </@sf.fldrow>


                <@sf.initAllClones formElement=form.prof cloneSectionClass="clonesectionVacation" ; x>

				
                    <@sf.fldrow class="clonesectionVacation" >

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Профессия:" required=true style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field" path="form.prof[${x}]" qtip="" validation="required" style="text-align:left;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Квалификация:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.kval[${x}]" qtip=""  style="text-align:left;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Разряд:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.razrjad[${x}]" qtip=""  style="text-align:unknown;" colspan="12"/>

                            <@sf.empty colspan="28"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Количество мест:" required=true style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.countVacancy[${x}]" qtip="" validation="required digits moreThenNumber" validationattr={"thenNumber":"0"} style="text-align:unknown;" colspan="12"/>

                            <@sf.empty colspan="28"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Система оплаты:" required=true style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.dictionaryLookup class="clone-field" path="form.systOplat[${x}]" dictionaryCode="PAYMENT_SYSTEM" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>

                            <@sf.empty colspan="28"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Средняя заработная плата (доход):" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.srZarplat[${x}]" validation="digits" qtip=""  style="text-align:unknown;" colspan="12"/>

                            <@sf.empty colspan="28"/>


                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Характер работы:" required=true style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.dictionaryLookup class="clone-field"  path="form.workType[${x}]" dictionaryCode="NATURE_OF_THE_WORK" qtip="" validation="required" style="text-align:unknown;" colspan="12"/>

                            <@sf.empty colspan="28"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Режим работы:" required=true style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.dictionaryLookup class="clone-field" path="form.workRegim[${x}]" dictionaryCode="MODE_OF_EMPLOYMENT" qtip="" validation="required" style="text-align:unknown;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Условия труда:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.dictionaryLookup class="clone-field" path="form.workExtrim[${x}]" dictionaryCode="LABOR_CONDITIONS" qtip=""  style="text-align:unknown;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>


                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Начало работы:" required=false style="text-align:right;" colspan="8" />

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.workBeginTime[${x}]" qtip=""  style="text-align:unknown;" colspan="12" validation="regexp" validationattr={"regexp":"/^([01]?[0-9]|2[0-3]):[0-5][0-9]$/", "message":"ЧЧ:ММ"}/>

                            <@sf.empty colspan="4"/>

                            <@sf.label title="Окончание работы:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.workEndTime[${x}]" qtip=""  style="text-align:unknown;" colspan="12" validation="regexp" validationattr={"regexp":"/^([01]?[0-9]|2[0-3]):[0-5][0-9]$/", "message":"ЧЧ:ММ"}/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Соц. льготы:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.checkboxLookup class="clone-field" path="form.workSocial[${x}]" dictionaryCode="SOCIAL_CONDITIONS"  qtip="" style="text-align:left;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.statictext style="text-align:left;" colspan="46"><h2>Карточка требований к соискателю</h2></@sf.statictext>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Образование:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.dictionaryLookup class="clone-field" path="form.education[${x}]" dictionaryCode="KIND_OF_FORMATION" qtip=""  style="text-align:left;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Специальность:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.specifikation[${x}]" qtip=""  style="text-align:left;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Минимальный стаж:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field" validation="digits" path="form.profStage[${x}]" qtip="Количество полных лет"  style="text-align:unknown;" colspan="12"/>

                            <@sf.empty colspan="28"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Пол:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.radiogroup path="form.pol[${x}]" staticOpts={'1':'Мужской','2':'Женский'} qtip="" colspan="15" mode="horizontal" class="clone-field" />
                            <@sf.empty colspan="25"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="clonesectionVacation">

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Дополнительные требования:" required=false style="text-align:right;" colspan="8"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield class="clone-field"  path="form.dopWorkersParametrs[${x}]" qtip=""  style="text-align:left;" colspan="37"/>

                            <@sf.empty colspan="3"/>

                    </@sf.fldrow>


                    <@sf.fldrow class="clonesectionVacation" >

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="48"  />

                    </@sf.fldrow>

                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
