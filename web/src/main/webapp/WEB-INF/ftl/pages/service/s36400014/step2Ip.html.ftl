<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<#import "/custom/validators.ftl" as customValidators>
<#import '/utils.ftl' as util>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Получение лицензии на фармацевтическую деятельность индивидуальными предпринимателями'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <#-- если адрес электронной почты ИП пуст, флаг просьбы о направлении ИП информации на e-mail опускается и блокируется -->
				<@customActions.uncheckByEmptyTextfield checkboxid="request" textfieldid="email" />
				<@action.setReadonlyByValue onload="true" srcid="email" event="change" destid="request" value="" />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о соискателе (индивидуальном предпринимателе)</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Фамилия, имя, отчество (если имеется) индивидуального предпринимателя:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fio_IP" qtip="" validation="required" style="text-align:left;" colspan="22"/>
					
						<@sf.empty colspan="17"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Адрес места жительства индивидуального предпринимателя (с указанием индекса):" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.place_live" qtip="" validation="required" style="text-align:left;" colspan="38"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<#-- валидатор - телефон -->
                        <@sf.label title="Контактный телефон индивидуального предпринимателя:" required=true style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- валидатор - телефон -->
                        <@sf.textfield  path="form.tel" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр." validation="required phone" style="text-align:left;" colspan="25"/>

						<@sf.empty colspan="13"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Данные СИА с возможностью правки-->
                        <@sf.label title="Адрес электронной почты индивидуального предпринимателя:" required=false style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- Данные СИА с возможностью правки-->
                        <@sf.textfield  path="form.email" validation="email" qtip=""  style="text-align:left;" colspan="25"/>

						<@sf.empty colspan="13"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- в случае заполнения адрес эл.плчты становится обязательным для заполнения-->
                        <@sf.label title="Просьба о направлении индивидуальному предпринимателю в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты:" required=false style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- в случае заполнения адрес эл.плчты становится обязательным для заполнения-->
                        <@sf.checkbox path="form.request" qtip=""  style="text-align:left;" colspan="4"/>

						<@sf.empty colspan="34"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- bold-->
                        <@sf.statictext style="text-align:left;" colspan="50"><h2>Документ, удостоверяющий личность индивидуального предпринимателя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Тип документа:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.customLookup  controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'} path="form.doc_type" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="13"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- валидатор серия-номер-->
                        <@sf.label title="Серия и номер документа:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор серия-номер-->
                        <@sf.textfield  path="form.docSer" qtip="Заполняется в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="13"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Дата выдачи документа:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.docDate"  qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="13"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Наименование органа, выдавшего документ:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.docIssuer" qtip="" validation="required" style="text-align:left;" colspan="38"/>
					
                </@sf.fldrow>
				

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
