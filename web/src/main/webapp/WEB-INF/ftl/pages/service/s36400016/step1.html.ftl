<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление лицензии на ведение деятельности, связанной с оборотом наркотических средств и психотропных веществ'>
        <@script.scripttag>
            <@jquery.onready>
				<@action.setReadonlyByValue onload='true' srcid='email_ul' event='change' destid='request' value='' />
				<@customActions.uncheckByEmptyTextfield checkboxid='request' textfieldid='email_ul' />
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
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Сведения о заявителе (юридическое лицо или его уполномоченный представитель)</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется автоматически данными из ЛК заявителя. Недоступно для изменения-->
                        <@sf.label title="Фамилия, имя, отчество (если имеется) заявителя:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется автоматически данными из ЛК заявителя. Недоступно для изменения-->
                        <@sf.textfield  path="form.declarant_name_ul" qtip="" attr='readonly="true"' wrapperClass='fieldDisabled' validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется автоматически данными из ЛК заявителя.-->
                        <@sf.label title="Контактный телефон заявителя:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется автоматически данными из ЛК заявителя.-->
                        <@sf.textfield  path="form.declarant_post_ul" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."  validation="required phone" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется автоматически данными из ЛК заявителя.-->
                        <@sf.label title="Адрес электронной почты заявителя:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется автоматически данными из ЛК заявителя.-->
                        <@sf.textfield  path="form.zaja_email" qtip="" validation="email" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Сведения о соискателе (юридическом лице)</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Полное наименование юридического лица:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.org_name_ul" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Организационно-правовая форма юридического лица:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.org_form" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Сокращенное наименование юридического лица:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.short_name" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Фирменное наименование юридического лица:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.firm_name" qtip="" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Место нахождения юридического лица (с указанием индекса):" required=true style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textarea path="form.org_adress" qtip="" validation="required" style="text-align:left;" colspan="25"/>

                        <@sf.empty colspan="11"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор телефон-->
                        <@sf.label title="Контактный телефон юридического лица:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор телефон-->
                        <@sf.textfield  path="form.tel_ul" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."  validation="required phone" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Адрес электронной почты юридического лица:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.email_ul" qtip="" validation="email" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- при выделение поле имейла юр.лица становится обязательным-->
                        <@sf.label title="Просьба о направлении юридическому лицу в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты:" required=false style="text-align:left;" colspan="10"/>

						<@sf.empty colspan="1"/>

						<#-- при выделение поле имейла юр.лица становится обязательным-->
                        <@sf.checkbox path="form.request" qtip=""  style="text-align:left;" colspan="25"/>

						<@sf.empty colspan="11"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
