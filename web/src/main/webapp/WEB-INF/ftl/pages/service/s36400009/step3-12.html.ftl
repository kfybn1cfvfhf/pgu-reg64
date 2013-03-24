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
    <@html.head title='Переоформление лицензии на медицинскую деятельность'>
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
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о действующей лицензии</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: X-X, где X –  любой набор букв или цифр-->
<@sf.label path="form.licenseNumberUL" title="Серия и номер действующей лицензии:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: X-X, где X –  любой набор букв или цифр-->
<@sf.textfield  path="form.licenseNumberUL"  validation="licenseSeriaNumberValidator" qtip="Вносится в формате: X-X, где X –  любой набор букв или цифр" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.startDateLicenseUL" title="Дата начала действия текущей лицензии:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.startDateLicenseUL"  qtip="" validation="required" style="text-align:left;" colspan="7"/>
					
						<@sf.empty colspan="24"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.nameLicensingAuthorityUL" title="Наименование лицензирующего органа, выдавшего лицензию:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.nameLicensingAuthorityUL" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.reason_reUL" title="Причина переоформления:" required=true style="text-align:left;" colspan="17"/>

 <@sf.radiogroup path="form.reason_reUL" staticOpts={'1':'Реорганизация юридического лица в форме преобразования',
                                                      '2':'Изменение наименования юридического лица',
                                                      '3':'Изменение адреса места нахождения юридического лица',
                                                      '4':'Изменение юридическим лицом адресов мест осуществления лицензируемого вида деятельности, оказываемых услуг, составляющих лицензируемый вид деятельности',
                                                      '5':'Реорганизация юридических лиц в форме слияния',
                                                      '6':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности',
                                                      '7':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности с целью прекращения',
                                                      '8':'Изменение юридическим лицом адресов мест осуществления лицензируемого вида деятельности и выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности с целью прекращения'} qtip="" validation="required" style="text-align:left;" colspan="31" mode="horizontal"/>


                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
