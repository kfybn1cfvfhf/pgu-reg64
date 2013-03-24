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
    <@html.head title='Прием заявлений и организация временного трудоустройства граждан'>
        <@script.scripttag>
            <@jquery.onready>
            <#--<@action.cloneFormRowWithArrays clonesectionclass="clonesectionAddNewObj"/>-->
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>

                <@sf.fldrow>
					     <@sf.textfield  path="form.addr_obl"   tdstyle='display:none;' />
						<@sf.empty colspan="1"/>

						 <@sf.label fieldset=true title="Сведения об образовании" style="text-align:left;" colspan="46"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <#--<@sf.initAllClones formElement=form.obr_type cloneSectionClass="clonesectionAddNewObj" ; x>-->
                <#--<@sf.fldrow class="clonesectionAddNewObj">-->
                <@sf.fldrow>
						<@sf.empty colspan="1"/>

						<@sf.label path="form.obr_type" title="Образование:" required=true style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<@sf.dictionaryLookup path="form.obr_type" dictionaryCode="VARIANT_EDUCATION_LS" qtip=""  validation="required" style="text-align:left;" colspan="33"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label path="form.institution" title="Наименование учебного<br>заведения:" required=false style="text-align:right;" colspan="12"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield  path="form.institution" qtip="" validation="maxlength"
                            validationattr={"maxlength":500} attr="maxlength='500'"  style="text-align:left;" colspan="33"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- Не старше текущей-->
                        <@sf.label path="form.expiry_date" title="Дата окончания:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<#-- Не старше текущей-->
                        <@sf.datefield path="form.expiry_date"  qtip="" validation="relativedays"  validationattr={"relativedays":"'<=', 0"} minDate="-120y" maxDate="${currentDate?string('dd.MM.yyyy')}"  style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="23"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

                        <@sf.label path="form.speciality_diploma" title="Специальность (профессия,<br> должность) по образованию:" required=false style="text-align:right;" colspan="12"/>
					    <@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.speciality_diploma" dictionaryCode="VARIANT_OKPDTR_LS" qtip=""  validation="" style="text-align:left;" colspan="33"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>
                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						 <@sf.label fieldset=true title="Дополнительная информация" style="text-align:left;" colspan="46"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label path="form.employment" title="Отношение к занятости:" required=true style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<@sf.dictionaryLookup path="form.employment" dictionaryCode="VARIANT_EMPLOYMENT_LS" qtip="" validation="required" style="text-align:left;" colspan="33"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>



                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- Доступно для редактирования, если в атрибуте «Желаете получить информацию по имеющимся вакансиям?» стоит галочка, иначе не доступно.
Выбирается из справочника КЛАДР в соответствии с Регионом/Областью-->
                        <@sf.label path="form.addr_raion_info" title="Район, по которому интересует информация:" required=true style="text-align:right;" colspan="12"/>
                        <@sf.empty colspan="1"/>

                        <@sf.dictionaryLookup path="form.addr_raion_info" dictionaryCode="VARIANT_TRANCHE_LS"  title="Район"  terminalLevel="2" qtip="" validation="required" style="text-align:left;" colspan="33"/>

                        <@sf.empty colspan="1"/>
                </@sf.fldrow>
                <@sf.fldrow>
                        <@sf.empty colspan="48"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
