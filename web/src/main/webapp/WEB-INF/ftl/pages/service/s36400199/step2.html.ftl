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
    <@html.head title='Предоставление информации о текущей успеваемости учащегося, ведение электронного дневника и электронного журнала успеваемости'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<#-- сделать справочником
Справочник районов: Srayon-->
<@sf.label path="form.rayon" title="Район:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- сделать справочником
Справочник районов: Srayon-->
                 <@sf.dictionaryLookup path="form.rayon" dictionaryCode="0364_DISTRICT_SO" title="Район"
                        validation="required"
                        style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- сделать справочником
Справочник SGosOrg
SCHOOL_RD код родительского элемента в справочнике SGosOrg-->
<@sf.label path="form.nameSchool" title="Учреждение начального общего, основного общего, среднего (полного) общего образования:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- сделать справочником
Справочник SGosOrg
SCHOOL_RD код родительского элемента в справочнике SGosOrg-->
                    <@sf.textfield path="form.nameSchool"
                       validation="required"
                        style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>


                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о ребенке</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.childLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.childLastName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.childFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.childFirstName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.childMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.childMiddleName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.childBirthdate" title="Дата рождения ребенка:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.childBirthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.childGrade" title="Класс:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.childGrade" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.childDepartment" title="Отделение:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.childDepartment" qtip="Указывается для учреждений дополнительного образования"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
