<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='personClone' hideButtonSections='true'/>
                <@customValidators.addCustomValidators />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
<@sf.label path="form.gkuUspn" title="Управление социальной поддержки населения:" required=true style="text-align:left;" colspan="18"/>
<@sf.dictionaryLookup path="form.gkuUspn" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.goalRef" title="Цель обращения:" required=true style="text-align:left;" colspan="18"/>
<@sf.dictionaryLookup path="form.goalRef" dictionaryCode="03_GOAL_REF_64102" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Причины, по которым семья (одиноко проживающий гражданин) является малоимущей (по каждому трудоспособному члену семьи)</h2>
                        <i>В состав малоимущей семьи при расчете среднедушевого дохода включаются лица, связанные родством и (или) свойством. К ним относятся совместно проживающие и ведущие совместное хозяйство супруги, их дети и родители, усыновители и усыновленные, братья и сестры, пасынки и падчерицы</i></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.famLastName cloneSectionClass='personClone' ; x>
                    <@sf.fldrow class="personClone">
                        <@sf.label path="form.famLastName" title="Фамилия:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield class="clone-field" path="form.famLastName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="30"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="personClone">
                        <@sf.label path="form.famFirstName" title="Имя:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield class="clone-field" path="form.famFirstName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="personClone">
                        <@sf.label path="form.famMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="18"/>
                        <@sf.textfield class="clone-field" path="form.famMiddleName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="30"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="personClone">
                        <@sf.label path="form.famReason" title="Причина:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield class="clone-field"  path="form.famReason[${x}]" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="personClone">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
