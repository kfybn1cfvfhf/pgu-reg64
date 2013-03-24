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
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление фармацевтической деятельности для ИП'>
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
					
						<#-- Валидатор ОГРНИП-->
                        <@sf.label title="Государственный регистрационный номер записи о государственной регистрации индивидуального предпринимателя (ОГРНИП):" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Валидатор ОГРНИП-->
                        <@sf.textfield  path="form.ogrnip" qtip="" validation="ipregno required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- ВАЛИДАТОР ИНН ИП-->
                        <@sf.label title="ИНН:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- ВАЛИДАТОР ИНН ИП-->
                        <@sf.textfield  path="form.inn_ip" qtip="" validation="innind required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Данные документа, подтверждающего факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей </h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Серия и номер бланка:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.egrul_num" qtip="Вносится в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Наименование органа, выдавшего документ:" required=true style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textarea path="form.egrul_org1" qtip="" validation="required" style="text-align:left;" colspan="25"/>

                        <@sf.empty colspan="10"/>
                        <@sf.empty colspan="1"/>

                </@sf.fldrow>


                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Дата выдачи:" required=true style="text-align:left;" colspan="10"/>

						<@sf.empty colspan="1"/>

						<@sf.datefield path="form.egrul_date"  qtip="" validation="required" style="text-align:left;" colspan="8"/>
						<@sf.empty colspan="17"/>

						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Адрес места нахождения органа, осуществившего государственную регистрацию:" required=true style="text-align:left;" colspan="10"/>

						<@sf.empty colspan="1"/>

						<@sf.textarea path="form.egrul_org2" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Данные документа о постановке лицензиата на учет в налоговом органе</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Серия и номер бланка:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.tax_num" qtip="Вносится в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Наименование, код подразделения, выдавшего документ:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.tax_org" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дата выдачи:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.tax_date"  qtip="" validation="required" style="text-align:left;" colspan="8"/>
						<@sf.empty colspan="17"/>

						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
