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
    <@html.head title='Организация профессиональной ориентации граждан'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setReadonlyByValue onload="true"  srcid="skillLanguage" event="change" value="off" destid="skillLangName"/>
                <@action.unsetDisabledByValue onload="true" srcid="skillLanguage" event="change" value="on" destid="skillLangName"  />
                <@action.setReadonlyByValue onload="true"  srcid="skillDriver" event="change" value="off" destid="skillDriverCat"/>
                <@action.unsetDisabledByValue onload="true" srcid="skillDriver" event="change" value="on" destid="skillDriverCat"  />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения об образовании</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.eduType" title="Образование:" required=false style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.eduType" dictionaryCode="64_EDUCATION_170" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduOrg" title="Учебное заведение:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduOrg" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduYear" title="Год окончания:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield path="form.eduYear"  qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduProf" title="Профессия (специальность), квалификация:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduProf" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения об основной профессии</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.profName" title="Основная профессия (специальность):" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.profName" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.profQual" title="Квалификация:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.profQual" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.profPost" title="Должность:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.profPost" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.profAge" title="Стаж работы:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.profAge" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о дополнительной профессии</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.dopProfName" title="Основная профессия (специальность):" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.dopProfName" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.dopProfQual" title="Квалификация:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.dopProfQual" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.dopProfPost" title="Должность:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.dopProfPost" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.dopProfAge" title="Стаж работы:" required=false style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.dopProfAge" qtip=""  style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Дополнительные навыки</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.skillLanguage" title="Знание иностранного языка:" required=false style="text-align:left;" colspan="17"/>
<@sf.checkbox path="form.skillLanguage" qtip=""  style="text-align:unknown;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.skillLangName" title="Язык:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.skillLangName" qtip="" validation="required" style="text-align:left;" colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.skillPC" title="Умение пользоваться ЭВМ:" required=false style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.skillPC" qtip=""  style="text-align:unknown;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.skillDriver" title="Наличие водительского удостоверения:" required=false style="text-align:left;" colspan="17"/>
<@sf.checkbox path="form.skillDriver" qtip=""  style="text-align:unknown;" colspan="33"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.skillDriverCat" title="Категория:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.skillDriverCat" qtip="" validation="required" style="text-align:left;" colspan="33"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
