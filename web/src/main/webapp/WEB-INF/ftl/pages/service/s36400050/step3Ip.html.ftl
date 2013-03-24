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

                        <@sf.label title="ИНН:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>

                        <@sf.fileload  path="form.inn_ip" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.empty colspan="1"/>

                        <@sf.label title="Документ, подтверждающий факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей (полная выписка из ЕГРИП):" required=false style="text-align:left;" colspan="10"/>

						<@sf.empty colspan="1"/>

                        <@sf.fileload  path="form.egripLoad" fileExtensions="pdf,doc,jpg" qtip=""  style="text-align:left;" colspan="25"/>

						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
