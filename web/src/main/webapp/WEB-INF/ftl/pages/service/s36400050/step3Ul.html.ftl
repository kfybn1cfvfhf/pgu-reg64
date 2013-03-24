<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление лицензируемой деятельности для ЮЛ'>
        <@script.scripttag>
            <@jquery.onready>
			    <@validators.addCustomValidators/>
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
					
						<#-- валижатор - ОГРН юр.лица-->
                        <@sf.label title="Государственный регистрационный номер записи о государственной регистрации юридического лица (ОГРН):" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валижатор - ОГРН юр.лица-->
                        <@sf.textfield  path="form.ogrn" qtip="" validation="ogrnlegal required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор - ИНН юр.лица-->
                        <@sf.label title="ИНН:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор - ИНН юр.лица-->
                        <@sf.textfield  path="form.inn" qtip="" validation="innlegal required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Данные документа, подтверждающего факт внесения сведений о юридическом лице в Единый государственный реестр юридических лиц </h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор: Заполняется в формате серия-номер-->
                        <@sf.label title="Серия и номер бланка:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор: Заполняется в формате серия-номер-->
                        <@sf.textfield  path="form.egrul_num" qtip="Заполняется в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Наименование органа, выдавшего документ:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.egrul_org" qtip="" validation="required" style="text-align:left;" colspan="35"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дата выдачи:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.date_give"  qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Адрес места нахождения органа, осуществившего государственную регистрацию:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.egrul_place" qtip="" validation="required" style="text-align:left;" colspan="35"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий факт внесения сведений о юридическом лице в Единый государственный реестр юридических лиц (полная выписка из ЕГРЮЛ):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.egrulLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
