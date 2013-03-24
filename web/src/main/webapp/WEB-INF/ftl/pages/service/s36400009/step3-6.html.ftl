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
<@sf.label path="form.licenseNumber" title="Серия и номер действующей лицензии:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Валидация: X-X, где X –  любой набор букв или цифр-->
<@sf.textfield  path="form.licenseNumber" validation="licenseSeriaNumberValidator" qtip="Вносится в формате: X-X, где X –  любой набор букв или цифр" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.startDateLicense" title="Дата начала действия текущей лицензии:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.startDateLicense"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.nameLicensingAuthority" title="Наименование лицензирующего органа, выдавшего лицензию:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.nameLicensingAuthority" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.reason_reIP" title="Причина переоформления:" required=true style="text-align:left;" colspan="17"/>
                 <@sf.empty colspan="1"/>
                <@sf.radiogroup path="form.reason_reIP" staticOpts={'1':'Изменение индивидуальным предпринимателем адресов мест осуществления медицинской деятельности, оказываемых услуг, составляющих лицензируемый вид деятельности',
                                                                      '2':'Изменение имени, фамилии и (в случае, если имеется) отчества индивидуального предпринимателя',
                                                                      '3':'Изменение места жительства индивидуального предпринимателя',
                                                                      '4':'Изменение реквизитов документа, удостоверяющего личность индивидуального предпринимателя',
                                                                      '5':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности',
                                                                      '6':'Изменение перечня выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности с целью прекращения',
                                                                      '7':'Изменение индивидуальным предпринимателем адресов мест осуществления медицинской деятельности или выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности, с целью прекращения'} qtip="" validation="required" style="text-align:left;" colspan="28" mode="horizontal"/>


					

					
                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.label path="form.documentBase" title="Данные документа (вид, название, дата издания и номер), являющегося основанием для переоформления документа, подтверждающего наличие лицензии:" required=false style="text-align:left;" colspan="51"/>
					      </@sf.fldrow>
            <@sf.fldrow>
            <@sf.empty colspan="1"/>
						<@sf.textarea path="form.documentBase" qtip=""  style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
