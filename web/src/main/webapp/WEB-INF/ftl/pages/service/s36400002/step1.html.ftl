<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/custom/validators.ftl" as customValidators>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление лицензии на право ведения образовательной деятельности'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="cyrillic required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="cyrillic required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования

Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
данные из ЛК
Недоступно для редактирования
Валидация: phone (перекрыть)-->
<@sf.label path="form.phone" title="Номер контактного телефона:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
данные из ЛК
Недоступно для редактирования
Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
данные из ЛК
Недоступно для редактирования
Валидация: email-->
<@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
данные из ЛК
Недоступно для редактирования
Валидация: email-->
<@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" wrapperClass='fieldDisabled' attr='readonly="readonly"' validation="email" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Заменить на radiogroup. По умолчанию: Не заполнен. Зашить значения на форму: 
1. Прекращение реализации образовательных программ, прекращение осуществления образовательной деятельности по адресу места ее осуществления
2. Изменение наименований образовательных программ, указанных в приложении к документу, подтверждающему наличие лицензии
3. Переоформление лицензии на бессрочную в пределах срока ее действия
4. Необходимость дополнения документа, подтверждающего наличие лицензии, сведениями о филиалах лицензиата, и (или) об адресах мест осуществления образовательной деятельности, и (или) об образовательных программах, изменение места нахождения лицензиата
5. Возникновение образовательного учреждения, научной организации или иной организации в результате реорганизации в форме слияния в случае наличия лицензии у одного или нескольких реорганизованных юридических лиц, реорганизация образовательного учреждения, научной организации или иной организации в форме присоединения к ним юридического лица в случае наличия лицензии у присоединенного юридического лица
6. Реорганизация лицензиата в форме преобразования, изменение наименования лицензиата (в том числе в случае создания образовательного учреждения путем изменения типа существующего государственного или муниципального образовательного учреждения, установления иного государственного статуса образовательного учреждения), изменение наименования места нахождения лицензиата, изменение наименования адреса места осуществления образовательной деятельности
Логика:
1. При выборе значений 1, 2, 3 происходит переход на ШАГ 2 (статичный код: цели 1,3 - Usl_36410015; цель 2 - Usl_36410016)
2. При выборе значения 4 происходит переход на ШАГ 3 (статичный код: цель 4 - Usl_36410012)
3. При выборе значения 5 происходит переход на ШАГ 4 (статичный код: цель 5 - Usl_36410017)
4. При выборе значения 6 происходит переход на ШАГ 5 (статичный код: цель 6 - Usl_36410018)-->
<@sf.label path="form.reason_re" title="Причина переоформления лицензии на образовательную деятельность:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Заменить на radiogroup. По умолчанию: Не заполнен. Зашить значения на форму: 
1. Прекращение реализации образовательных программ, прекращение осуществления образовательной деятельности по адресу места ее осуществления
2. Изменение наименований образовательных программ, указанных в приложении к документу, подтверждающему наличие лицензии
3. Переоформление лицензии на бессрочную в пределах срока ее действия
4. Необходимость дополнения документа, подтверждающего наличие лицензии, сведениями о филиалах лицензиата, и (или) об адресах мест осуществления образовательной деятельности, и (или) об образовательных программах, изменение места нахождения лицензиата
5. Возникновение образовательного учреждения, научной организации или иной организации в результате реорганизации в форме слияния в случае наличия лицензии у одного или нескольких реорганизованных юридических лиц, реорганизация образовательного учреждения, научной организации или иной организации в форме присоединения к ним юридического лица в случае наличия лицензии у присоединенного юридического лица
6. Реорганизация лицензиата в форме преобразования, изменение наименования лицензиата (в том числе в случае создания образовательного учреждения путем изменения типа существующего государственного или муниципального образовательного учреждения, установления иного государственного статуса образовательного учреждения), изменение наименования места нахождения лицензиата, изменение наименования адреса места осуществления образовательной деятельности
Логика:
1. При выборе значений 1, 2, 3 происходит переход на ШАГ 2 (статичный код: цели 1,3 - Usl_36410015; цель 2 - Usl_36410016)
2. При выборе значения 4 происходит переход на ШАГ 3 (статичный код: цель 4 - Usl_36410012)
3. При выборе значения 5 происходит переход на ШАГ 4 (статичный код: цель 5 - Usl_36410017)
4. При выборе значения 6 происходит переход на ШАГ 5 (статичный код: цель 6 - Usl_36410018)-->
<@sf.radiogroup  path="form.reason_re" qtip="" validation="required" style="text-align:left;" colspan="31" staticOpts={
'1':'Прекращение реализации образовательных программ, прекращение осуществления образовательной деятельности по адресу места ее осуществления',
'2':'Изменение наименований образовательных программ, указанных в приложении к документу, подтверждающему наличие лицензии',
'3':'Переоформление лицензии на бессрочную в пределах срока ее действия',
'4':'Необходимость дополнения документа, подтверждающего наличие лицензии, сведениями о филиалах лицензиата, и (или) об адресах мест осуществления образовательной деятельности, и (или) об образовательных программах, изменение места нахождения лицензиата',
'5':'Возникновение образовательного учреждения, научной организации или иной организации в результате реорганизации в форме слияния в случае наличия лицензии у одного или нескольких реорганизованных юридических лиц, реорганизация образовательного учреждения, научной организации или иной организации в форме присоединения к ним юридического лица в случае наличия лицензии у присоединенного юридического лица',
'6':'Реорганизация лицензиата в форме преобразования, изменение наименования лицензиата (в том числе в случае создания образовательного учреждения путем изменения типа существующего государственного или муниципального образовательного учреждения, установления иного государственного статуса образовательного учреждения), изменение наименования места нахождения лицензиата, изменение наименования адреса места осуществления образовательной деятельности'
}/>

                    <@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
