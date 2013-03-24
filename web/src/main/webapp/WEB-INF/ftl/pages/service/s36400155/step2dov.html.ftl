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
    <@html.head title='Прием заявок (запись) на прием к врачу'>
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
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активации чекбокса #dov_enable на ШАГе 1.
2. Скрывается при деактивации чекбокса #dov_enable на ШАГе 1.-->
<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об уполномоченном представителе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активации чекбокса #dov_enable
2. Скрывается при деактивации чекбокса #dov_enable-->
<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активации чекбокса #dov_enable
2. Скрывается при деактивации чекбокса #dov_enable
Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.label path="form.dovDovLoad" title="Документ, подтверждающий право законного представителя (доверенного лица):" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активации чекбокса #dov_enable
2. Скрывается при деактивации чекбокса #dov_enable
Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.fileload path="form.dovDovLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активации чекбокса #dov_enable
2. Скрывается при деактивации чекбокса #dov_enable
Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.label path="form.dovPasLoad" title="Документ, удостоверяющий личность законного представителя (доверенного лица):" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активации чекбокса #dov_enable
2. Скрывается при деактивации чекбокса #dov_enable
Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.fileload path="form.dovPasLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				

                <@sf.fldrow>
					
						<#--
По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- сделать radiogroup
По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.label path="form.birthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.datefield path="form.birthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.label path="form.sex" title="Пол:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
данные из ЛК
Недоступно для редактирования
Логика:
Очищается и дается доступ для редактирования при активации чек-бокса #dov_enable
Валидация: кириллические буквы и знак дефиса-->
<@sf.radiogroup mode="horizontal" staticOpts={"1":"Мужской", "2":"Женский"} path="form.sex" qtip="" validation="required"  style="text-align:left;" colspan="18"/>
					
                </@sf.fldrow>



                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК
Логика:
Очищается при активации чекбокса #dov_enable-->
<@sf.label path="form.address" title="Адрес регистрации:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК
Логика:
Очищается при активации чекбокса #dov_enable-->
<@sf.textarea path="form.address" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК
Логика:
Очищается при активации чекбокса #dov_enable-->
<@sf.label path="form.factAddress" title="Адрес места жительства (пребывания):" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК
Логика:
Очищается при активации чекбокса #dov_enable-->
<@sf.textarea path="form.factAddress" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию:
Данные из ЛК - "Домашний телефон"
Логика:
Очищается при активации чекбокса #dov_enable
Валидация: phone (перекрыть)-->
<@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию:
Данные из ЛК - "Домашний телефон"
Логика:
Очищается при активации чекбокса #dov_enable
Валидация: phone (перекрыть)-->
<@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.email"  title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.polis" title="Страховой медицинский полис обязательного страхования:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.polis" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.workplace" title="Место работы:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.workplace" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>



<@sf.customLookup  controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'} path="form.identityDocType" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>


<@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>


<@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>


<@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>


<@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>


<@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>


<@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>

<@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.label path="form.polisDocLoad" title="Страховой полис обязательного медицинского страхования:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидация: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS-->
<@sf.fileload path="form.polisDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
