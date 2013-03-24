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
    <@html.head title='Выдача дубликата документа, подтверждающего наличие лицензии на фармацевтическую деятельность'>
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
						<@sf.empty colspan="2"/>

                        <@sf.label title="Заявитель:" required=true style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- Реализовать выбор между юридическим лицом и индивидуальным предпринимателем радиобаттоном. Если значение поля: Юридическое лицо - переход к шагу 3; если значение поля: ИП - переход к шагу 2.-->
                        <@sf.radiogroup path="form.declarant" staticOpts={'1':'Индивидуальный предприниматель','2':'Юридическое лицо'} qtip="" validation="required" style="text-align:left;" colspan="24" mode="horizontal"/>

						<@sf.empty colspan="3"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="2"/>

						<@sf.label title="Требуемый документ:" required=true style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- радиобаттон: Выбор между «Дубликат документа, подтверждающего наличие лицензии, с приложениями», «Копия документа, подтверждающего наличие лицензии, с приложениями», а также "не требуется"-->
                        <@sf.radiogroup path="form.doc_vid" staticOpts={'1':'Дубликат','2':'Копия'} qtip="" validation="required" style="text-align:left;" colspan="24" mode="vertical"/>

						<@sf.empty colspan="12"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="2"/>


                        <@sf.label title="Причина обращения за дубликатом/копией:" required=true style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- радиобаттон: Выбор между «Дубликат приложения», «Копия приложения», а также "не требуется-->

                        <@sf.radiogroup path="form.doc_tip" staticOpts={'1':'Утрата','2':'Порча'} qtip="" validation="required" style="text-align:left;" colspan="24" mode="vertical"/>

						<@sf.empty colspan="12"/>

                </@sf.fldrow>


                <@sf.fldrow>

						<@sf.empty colspan="2"/>

                        <@sf.label title="Серия и номер действующей лицензии:" required=true style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- в формате - x-x где x - любой набор букв или цифр-->

                        <@sf.textfield  path="form.serie_num" qtip="Серия и номер вводятся в формате x-x где x - любой набор букв или цифр" validation="required licenseSeriaNumberValidator" style="text-align:unknown;" colspan="24"/>

						<@sf.empty colspan="35"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
