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

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Присвоение, подтверждение или снятие квалификационных категорий специалистов, работающих в системе здравоохранения Российской Федерации'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.cloneFormRowWithArrays clonesectionclass='othersDocLoadClass' hideButtonSections='true'/>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
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

                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    данные из ЛК
                    Недоступно для редактирования

                    Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" attr="readonly='readonly'" wrapperClass="fieldDisabled" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    данные из ЛК
                    Недоступно для редактирования

                    Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" attr="readonly='readonly'" wrapperClass="fieldDisabled" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.post" title="Должность:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.post" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.orgName" title="Наименование медицинской организации:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.orgName" qtip="Место работы" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале.
Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Данные из ЛК - "Домашний телефон"

                    Валидация: phone (перекрыть)-->

                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Данные из ЛК

                    Валидация: email-->

                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Присваиваемая категория по специальности</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Виджет заменить на dictionaryLookup. Использовать справочник MED_CATEGOR
                    Справочник зашить на форму
                    По умолчанию:
                    Не заполнен
                    Значения:
                    1 - Вторая (присвоение)
                    2 - Первая (присвоение)
                    3 - Высшая (присвоение)
                    4 - Вторая (подтверждение)
                    5 - Первая (подтверждение)
                    6 - Высшая (подтверждение)-->

                    <@sf.label path="form.medCategory" title="Категория:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup  path="form.medCategory" qtip="" dictionaryCode="MED_CATEGOR" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.medSpeciality" title="Специальность:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.medSpeciality" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.docLoadQualificationLeaf" title="Квалификационный лист:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.docLoadQualificationLeaf" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Составляется отделом кадров медицинской организации. Форма утверждена приказом Минздрава РФ №808н от 25.07.2011г" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.docLoadReportOnWork" title="Отчет о работе:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.docLoadReportOnWork" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Представляется за последние 3 года – для специалистов с высшим профессиональным образованием, за последний год – для специалистов со средним профессиональным образованием" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
					Множественная загрузка-->

                    <@sf.label path="form.othersDocLoad" title="Дополнительные документы, характеризующие уровень профессиональной подготовки:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.othersDocLoad cloneSectionClass="othersDocLoadClass" ; x>
                    <@sf.fldrow class="othersDocLoadClass">
                        <@sf.fileload path="form.othersDocLoad[${x}]" qtip="Документы об образовании, повышении квалификации, наличие квалификационной категории, трудовая книжка, документы об учетных степенях и т.д." validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="othersDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>