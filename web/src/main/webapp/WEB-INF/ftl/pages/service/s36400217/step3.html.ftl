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
    <@html.head title='Изменение цели разрешенного использования земельного участка и (при наличии) объекта капитального строительства'>
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
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о земельном участке и (при наличии) объекте капитального строительства</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.sq_ZemUch" title="Площадь объекта недвижимости (кв.м), протяженность (м):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield path="form.sq_ZemUch" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.numbKadas" title="Кадастровый (условный) номер:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield path="form.numbKadas" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.addressObNed" title="Адрес объекта недвижимости:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textarea path="form.addressObNed" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.vidIspNeobh" title="Желаемый вид разрешенного использования  земельного участка и (или) объекта капитального строительства:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textarea path="form.vidIspNeobh" qtip="Перечень территориальных зон и основных видов территориального использования земельных участков и (или) объектов капитального строительства определяется Правилами землепользования и застройки муниципального образования «Город Саратов», утвержденными решениями саратовской городской думы от 29.04.2008 №27-280 (с изменениями от 11.10.2012 №18217)" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
