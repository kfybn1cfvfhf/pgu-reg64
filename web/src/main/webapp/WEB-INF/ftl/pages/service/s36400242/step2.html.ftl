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
    <@html.head title='Содействие гражданам в поиске подходящей работы'>
        <@script.scripttag>
            <@jquery.onready>
            <@action.setVisibleByValue 'true' 'obr_language' 'change' 'obr_lang_name' 'on' />
            <@action.setVisibleByValue 'true' 'obr_driver' 'change' 'obr_driver_cat' 'on' />
            <@action.cloneFormRowWithArrays clonesectionclass="clonesectionAddNewObj" maxCloneSize="2"/>
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

						 <@sf.label fieldset=true title="Сведения об образовании" style="text-align:left;" colspan="42"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.initAllClones formElement=form.obr_type cloneSectionClass="clonesectionAddNewObj" ; x>
                <@sf.fldrow class="clonesectionAddNewObj">
						<@sf.empty colspan="1"/>

						<@sf.label path="form.obr_type[${x}]" title="Образование:" required=true style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<@sf.dictionaryLookup path="form.obr_type[${x}]" dictionaryCode="VARIANT_EDUCATION_LS" qtip="" class="clone-field" validation="required" style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow class="clonesectionAddNewObj">

						<@sf.empty colspan="1"/>

						<@sf.label path="form.institution[${x}]" title="Наименование учебного<br>заведения:" required=false style="text-align:right;" colspan="12"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield  path="form.institution[${x}]" qtip="" validation="" class="clone-field" style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow class="clonesectionAddNewObj">

						<@sf.empty colspan="1"/>

						<#-- Не старше текущей-->
                        <@sf.label path="form.issueDate[${x}]" title="Дата окончания:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<#-- Не старше текущей-->
                        <@sf.datefield path="form.issueDate[${x}]"  qtip="" validation="relativedays" class="clone-field" validationattr={"relativedays":"'<=', 0"} minDate="-120y" maxDate="${currentDate?string('dd.MM.yyyy')}"  style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow class="clonesectionAddNewObj">

						<@sf.empty colspan="1"/>

                        <@sf.label path="form.speciality_diploma[${x}]" title="Специальность (профессия,<br> должность) по образованию:" required=false style="text-align:right;" colspan="12"/>
					    <@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.speciality_diploma[${x}]" dictionaryCode="VARIANT_OKPDTR_LS" qtip="" class="clone-field" validation="" style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>
                <@sf.fldrow class="clonesectionAddNewObj">

						<@sf.empty colspan="1"/>

                        <@sf.label path="form.employment[${x}]" title="Отношение к занятости:" required=true style="text-align:right;" colspan="12"/>
					    <@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.employment[${x}]" dictionaryCode="VARIANT_EMPLOYMENT_LS" qtip="" class="clone-field" validation="required" style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>
				<@sf.fldrow class="clonesectionAddNewObj clone-buttons-section">
                        <@sf.empty colspan="20"/>
                        <@sf.addRemoveButton addTitle='Добавить' delTitle='Удалить' colspan="8"/>
                        <@sf.empty colspan="20"/>
                </@sf.fldrow>
				</@sf.initAllClones>
                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						 <@sf.label fieldset=true title="Дополнительные навыки" style="text-align:left;" colspan="42"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>


                        <@sf.label path="form.obr_language" title="Знание иностранного языка:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

                        <@sf.checkbox path="form.obr_language" qtip=""  style="text-align:left;" colspan="2"/>

						<@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

                        <@sf.label path="form.obr_lang_name" title="Язык:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.obr_lang_name" qtip=""  style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#--<@sf.empty colspan="1"/>-->

						<@sf.label path="form.obr_pc" title="Знание и умение пользоваться ЭВМ:" required=false style="text-align:right;" colspan="13"/>

						<@sf.empty colspan="1"/>

						<@sf.checkbox path="form.obr_pc" qtip=""  style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

                        <@sf.label path="form.obr_driver" title="Наличие водительского удостоверения:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

                        <@sf.checkbox path="form.obr_driver" qtip=""  style="text-align:left;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- Доступность поля управляется переменной #obr_driver-->
                        <@sf.label path="form.obr_driver_cat" title="Категория:" required=false style="text-align:right;" colspan="12"/>

						<@sf.empty colspan="1"/>

						<#-- Доступность поля управляется переменной #obr_driver-->
                        <@sf.dictionaryLookup path="form.obr_driver_cat" dictionaryCode="VARIANT_DRIVING_LS" qtip=""  style="text-align:unknown;" colspan="30"/>

						<@sf.empty colspan="4"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <@sf.empty colspan="1"/>

            <#-- Если поле «С учетом профессиональных навыков?» #account_skills равно значению «ДА» осуществить переход к ШАГУ 4
Если поле «С учетом профессиональных навыков?» #account_skills  равно значению «НЕТ» осуществить переход к ШАГУ 3, затем к ШАГУ 4-->
                <@sf.label path="form.account_skills" title="Учитывать личные профессиональные навыки?" required=false style="text-align:right;" colspan="12"/>

                <@sf.empty colspan="1"/>

            <#-- Если поле «С учетом профессиональных навыков?» #account_skills равно значению «ДА» осуществить переход к ШАГУ 4
Если поле «С учетом профессиональных навыков?» #account_skills  равно значению «НЕТ» осуществить переход к ШАГУ 3, затем к ШАГУ 4-->
                <@sf.dictionaryLookup path="form.account_skills" dictionaryCode="ACCOUNT_PROF_SKILLS_LS" qtip=""  style="text-align:left;" colspan="30"/>

                <@sf.empty colspan="4"/>

            </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
