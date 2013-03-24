<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "/custom/actions.ftl" as customActions>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление лицензии на осуществление фармацевтической деятельности для ЮЛ'>
        <@script.scripttag>
            <@jquery.onready>
				<@customValidators.addCustomValidators />

				<#-- если поле "Адрес электронной почты юридического лица" пусто, флаг с просьбой высылать оповещения на этот адрес опускается и блокируется -->
				<@customActions.uncheckByEmptyTextfield checkboxid="request" textfieldid="email_ul" />
				<@action.setReadonlyByValue onload="true" srcid="email_ul" event="change" destid="request" value="" />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе (юридическое лицо или его уполномоченный представитель)</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА-->
                        <@sf.label title="Фамилия, имя, отчество (если имеется) заявителя:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА-->
                        <@sf.textfield  path="form.juristic_Person_Fio" qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА валидатор - телефон-->
                        <@sf.label title="Контактный телефон заявителя:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА валидатор - телефон-->
                        <@sf.textfield  path="form.phone_zaja" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр." validation="required phone" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА валидатор - эл.почта-->
                        <@sf.label title="Адрес электронной почты заявителя:" required=false style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА валидатор - эл.почта-->
                        <@sf.textfield  path="form.email_zaja" qtip="" validation="email" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о соискателе (юридическом лице)</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Полное наименование юридического лица:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.juristic_Person_Fullname" qtip="" validation="required" style="text-align:left;" colspan="36"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Организационно-правовая форма юридического лица:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.org_form" qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Сокращенное наименование юридического лица:" required=false style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.org_short_name" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Фирменное наименование юридического лица:" required=false style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.firmname" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- При новом заполнении –не отмечена.  Если отмечена - переход после шага 3 к шагу 5, если нет - к 4 после него - окончание-->
                        <@sf.label title="Соискатель лицензии является медицинской организацией:" required=false style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- При новом заполнении –не отмечена.  Если отмечена - переход после шага 3 к шагу 5, если нет - к 4 после него - окончание-->
                        <@sf.checkbox path="form.is_med_org" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Адрес места нахождения юридического лица (с указанием индекса):" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.declarantAdressUL" qtip="" validation="required" style="text-align:left;" colspan="36"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- валидатор - телефон-->
                        <@sf.label title="Контактный телефон юридического лица:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор - телефон-->
                        <@sf.textfield  path="form.phone_ul" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр." validation="required phone" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- валидатор - эл.почта-->
                        <@sf.label title="Адрес электронной почты юридического лица:" required=false style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- валидатор - эл.почта-->
                        <@sf.textfield  path="form.email_ul" qtip="" validation="email" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- В случае заполнения Адрес электронной почты юридического лица становится обязательным для заполнения-->
                        <@sf.label title="Просьба о направлении юридическому лицу в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты:" required=false style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- В случае заполнения Адрес электронной почты юридического лица становится обязательным для заполнения-->
                        <@sf.checkbox path="form.request" qtip=""  style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Допускается ввод только цифровых символов. Корректный номер состоит из 13-ти символов. Валидатор ОГРН юр.лица-->
                        <@sf.label title="Государственный регистрационный номер записи о создании юридического лица (ОГРН):" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Допускается ввод только цифровых символов. Корректный номер состоит из 13-ти символов. Валидатор ОГРН юр.лица-->
                        <@sf.textfield  path="form.ogrnUL" qtip="" validation="ogrnlegal required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Формат: "xxxxxxxxxx", где x = 0..9. Иными словами, 10 цифр. Валидатор - ИНН юрлица-->
                        <@sf.label title="ИНН:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Формат: "xxxxxxxxxx", где x = 0..9. Иными словами, 10 цифр. Валидатор - ИНН юрлица-->
                        <@sf.textfield  path="form.innUL" qtip="" validation="innlegal required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
