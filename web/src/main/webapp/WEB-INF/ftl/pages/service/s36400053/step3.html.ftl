<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Организация отдыха и оздоровления детей, находящихся в трудной жизненной ситуации, проживающих на территории Саратовской области'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientStatusDocNote' '6,2,7,4'/>

				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientDangerDocLoad' '6'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientDangerDocLoad-label' '6'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientWarDocLoad' '2'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientWarDocLoad-label' '2'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientProvisionDocLoad' '7'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientProvisionDocLoad-label' '7'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientInvalidDocLoad' '4'/>
				<@action.setVisibleByValue 'true' 'recipientStatus' 'change' 'recipientInvalidDocLoad-label' '4'/>


                                            <#-- ДУЛ -->
                                                <#-- Иной документ -->
                                                <@action.setVisibleByValue 'true' 'recipientIdentityDocType' 'change' 'recipientOtherDocTypeName' '5'/>
                                                <#-- У Временного удост или Иного документа серия необязательна -->
                                                <@action.unsetRequiredByField 'true' 'recipientIdentityDocType' 'change' 'recipientPassSeria' '2,5'/>
                                                <#-- Макс длина серии Паспорта Рф 4 цифр -->
                                                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassSeria' '1' 'digitsexact' {"digitsexact":"4"}/>
                                                <#-- Значения серии Вида на жительство одно из списка: 80, 81, 82, 83 -->
                                                <@action.applyValidationIf onload='true' srcid='recipientIdentityDocType' event='change' destid='recipientPassSeria' value='3' rules='invaluelist' validationAttr={"invaluelist":"80, 81, 82, 83"} validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                                                <#-- Макс длина номера Паспорта Рф 6 цифр -->
                                                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassNo' '1' 'digitsexact' {"digitsexact":"6"}/>
                                                <#-- Макс длина номера Временного удост или Вида на жительство 7 цифр -->
                                                <@action.applyValidationIf 'true' 'recipientIdentityDocType' 'change' 'recipientPassNo' '2,3' 'digitsexact' {"digitsexact":"7"}/>
                                            <#-- /ДУЛ -->

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о лице, нуждающемся в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.recipientLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.recipientLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.recipientFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.recipientFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.recipientMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.recipientMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.recipientBirthDate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования-->
<@sf.datefield path="form.recipientBirthDate"  qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_RECIPIENT_STATUS_64053

Значения:

1. Из малообеспеченной семьи
2. Из семьи военнослужащих, проходивших военную службу по призыву и погибших (умерших), пропавших без вести, ставших инвалидами в связи с выполнением задач в условиях вооруженного конфликта не международного характера в Чеченской республике и на непосредственно прилегающих к ней территориях Северного Кавказа, отнесенных к зоне вооруженного конфликта, а так же с выполнением задач в ходе контртеррористических операций на территории Северо-Кавказского региона
3. Ребенок-сирота
4. Ребенок с ограниченными возможностями здоровья
5. Ребенок, оставшийся без попечения родителей
6. Ребенок из семьи, находящейся в социально-опасном положении
7. Ребенок является воспитанником социального приюта или учреждения интернатного типа-->
<@sf.label path="form.recipientStatus" title="Социальный статус ребенка:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_RECIPIENT_STATUS_64053

Значения:

1. Из малообеспеченной семьи
2. Из семьи военнослужащих, проходивших военную службу по призыву и погибших (умерших), пропавших без вести, ставших инвалидами в связи с выполнением задач в условиях вооруженного конфликта не международного характера в Чеченской республике и на непосредственно прилегающих к ней территориях Северного Кавказа, отнесенных к зоне вооруженного конфликта, а так же с выполнением задач в ходе контртеррористических операций на территории Северо-Кавказского региона
3. Ребенок-сирота
4. Ребенок с ограниченными возможностями здоровья
5. Ребенок, оставшийся без попечения родителей
6. Ребенок из семьи, находящейся в социально-опасном положении
7. Ребенок является воспитанником социального приюта или учреждения интернатного типа-->
<@sf.dictionaryLookup path="form.recipientStatus" dictionaryCode="64_RECIPIENT_STATUS_64053" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значений справочника:

6. Ребенок из семьи, находящейся в социально-опасном положении
2. Из семьи военнослужащих, проходивших военную службу по призыву и погибших (умерших), пропавших без вести, ставших инвалидами в связи с выполнением задач в условиях вооруженного конфликта не международного характера в Чеченской республике и на непосредственно прилегающих к ней территориях Северного Кавказа, отнесенных к зоне вооруженного конфликта, а так же с выполнением задач в ходе контртеррористических операций на территории Северо-Кавказского региона
7. Ребенок является воспитанником социального приюта или учреждения интернатного типа
4. Ребенок с ограниченными возможностями здоровья-->
<@sf.statictext  attr="id='recipientStatusDocNote'" style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

6. Ребенок из семьи, находящейся в социально-опасном положении

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientDangerDocLoad" title="Постановление комиссии по делам несовершеннолетних и защите их прав о признании семьи находящейся в социально-опасном положении:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

6. Ребенок из семьи, находящейся в социально-опасном положении

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientDangerDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

2. Из семьи военнослужащих, проходивших военную службу по призыву и погибших (умерших), пропавших без вести, ставших инвалидами в связи с выполнением задач в условиях вооруженного конфликта не международного характера в Чеченской республике и на непосредственно прилегающих к ней территориях Северного Кавказа, отнесенных к зоне вооруженного конфликта, а так же с выполнением задач в ходе контртеррористических операций на территории Северо-Кавказского региона

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientWarDocLoad" title="Копия извещения о гибели (смерти), пропаже без вести военнослужащего или справка медико-социальной экспертизы об установлении военнослужащему инвалидности в связи с выполнением задач по обеспечению правопорядка и общественной безопасности на территории Северо-Кавказского региона:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

2. Из семьи военнослужащих, проходивших военную службу по призыву и погибших (умерших), пропавших без вести, ставших инвалидами в связи с выполнением задач в условиях вооруженного конфликта не международного характера в Чеченской республике и на непосредственно прилегающих к ней территориях Северного Кавказа, отнесенных к зоне вооруженного конфликта, а так же с выполнением задач в ходе контртеррористических операций на территории Северо-Кавказского региона

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientWarDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

7. Ребенок является воспитанником социального приюта или учреждения интернатного типа

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientProvisionDocLoad" title="Выписка из приказа государственного учреждения о нахождении ребенка на полном государственном обеспечении:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

7. Ребенок является воспитанником социального приюта или учреждения интернатного типа

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientProvisionDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

4. Ребенок с ограниченными возможностями здоровья

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientInvalidDocLoad" title="Справка медико-социальной экспертизы об установлении инвалидности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: поле скрыто

Логика:
Отображается при выборе значения справочника:

4. Ребенок с ограниченными возможностями здоровья

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientInvalidDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
По умолчанию:
Не заполнен
Значения:
1 - Паспорт гражданина РФ
2 - Временное удостоверение личности гражданина РФ
3 - Вид на жительство (лица без гражданства)/ (иностранного гражданина)
4 - Иностранный паспорт
5 - Иной документ, удостоверяющий личность
Логика: 
1. При выборе значения из справочника 5 отображается поле #recipientOtherDocTypeName-->
<@sf.label path="form.recipientIdentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Виджет заменить на dictionaryLookup. Использовать справочник DUL_LS
По умолчанию:
Не заполнен
Значения:
1 - Паспорт гражданина РФ
2 - Временное удостоверение личности гражданина РФ
3 - Вид на жительство (лица без гражданства)/ (иностранного гражданина)
4 - Иностранный паспорт
5 - Иной документ, удостоверяющий личность
Логика: 
1. При выборе значения из справочника 5 отображается поле #recipientOtherDocTypeName-->
<@sf.dictionaryLookup path="form.recipientIdentityDocType" dictionaryCode="DUL_LS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Скрыт

Логика: 
1. Отображается при выборе значения  5 из справочника #recipientIdentityDocType

Разработчику: При интеграции передавать в параметре #recipientIdentityDocType-->
<@sf.label path="form.recipientOtherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Скрыт

Логика: 
1. Отображается при выборе значения  5 из справочника #recipientIdentityDocType

Разработчику: При интеграции передавать в параметре #recipientIdentityDocType-->
<@sf.textfield  path="form.recipientOtherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен при выборе из справочника #recipientIdentityDocType значений 1,3,4
2. Не обязателен при выборе из справочника #recipientIdentityDocType значений 2,5
3. При выборе из справочника #recipientIdentityDocType значения 1, валидация: 4 цифры
4. При выборе из справочника #recipientIdentityDocType значения 3, валидация: допустимо для ввода 80 или 81 или 82 или 83
5. При выборе из справочника #recipientIdentityDocType значения 2,4,5, валидация отсутствует-->
<@sf.label path="form.recipientPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен при выборе из справочника #recipientIdentityDocType значений 1,3,4
2. Не обязателен при выборе из справочника #recipientIdentityDocType значений 2,5
3. При выборе из справочника #recipientIdentityDocType значения 1, валидация: 4 цифры
4. При выборе из справочника #recipientIdentityDocType значения 3, валидация: допустимо для ввода 80 или 81 или 82 или 83
5. При выборе из справочника #recipientIdentityDocType значения 2,4,5, валидация отсутствует-->
<@sf.textfield  path="form.recipientPassSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен всегда
2. При выборе из справочника #recipientIdentityDocType значения 1, валидация: 6 цифр
3. При выборе из справочника #recipientIdentityDocType значения 2 или 3, валидация: 7 цифр
4. При выборе из справочника #recipientIdentityDocType значения 4,5, валидация отсутствует-->
<@sf.label path="form.recipientPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен всегда
2. При выборе из справочника #recipientIdentityDocType значения 1, валидация: 6 цифр
3. При выборе из справочника #recipientIdentityDocType значения 2 или 3, валидация: 7 цифр
4. При выборе из справочника #recipientIdentityDocType значения 4,5, валидация отсутствует-->
<@sf.textfield  path="form.recipientPassNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.label path="form.recipientPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.datefield path="form.recipientPassDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.label path="form.recipientPassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Логика: 
1. Обязателен всегда-->
<@sf.textarea path="form.recipientPassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.recipientIdentityDocLoad" title="Документ, удостоверяющий личность лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.recipientIdentityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
