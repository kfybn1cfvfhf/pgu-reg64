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

               <@action.cloneFormRowWithArrays clonesectionclass='personclone' hideButtonSections='true' maxCloneSize='50'/>
               <@action.cloneFormRowWithArrays clonesectionclass='familyPensionDocLoadclass' hideButtonSections='true'/>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о составе семьи</h2></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.familyLastName cloneSectionClass="personclone" ; x>
				
                <@sf.fldrow class="personclone">
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.familyLastName[${x}]" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.familyLastName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.familyFirstName[${x}]" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.familyFirstName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.label path="form.familyMiddleName[${x}]" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->
<@sf.textfield  path="form.familyMiddleName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.familyBirthDate[${x}]" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования-->
<@sf.datefield path="form.familyBirthDate[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
					
						<#-- 64_FAMILY_STATUS_64053

Значения:

1. Мать
2. Отец
3. Брат
4. Сестра-->
<@sf.label path="form.familyStatus[${x}]" title="Степень родства по отношению к ребенку:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_FAMILY_STATUS_64053

Значения:

1. Мать
2. Отец
3. Брат
4. Сестра-->
<@sf.dictionaryLookup path="form.familyStatus[${x}]" class="clone-field" dictionaryCode="64_FAMILY_STATUS_64053" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
					
						<#-- 64_APPLICANT_CATEGORY_64053

Значения:
Значения:
1. Работающий
2. Неработающий (состоящий на учете в службе занятости населения)
3. Неработающий (не состоящий на учете в службе занятости населения)
4. Работающий пенсионер
5. Неработающий пенсионер
6. Учащийся
7. Студент
8. Работающий инвалид
9. Неработающий инвалид-->
<@sf.label path="form.familyCategory[${x}]" title="Категория заявителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_APPLICANT_CATEGORY_64053

Значения:
Значения:
1. Работающий
2. Неработающий (состоящий на учете в службе занятости населения)
3. Неработающий (не состоящий на учете в службе занятости населения)
4. Работающий пенсионер
5. Неработающий пенсионер
6. Учащийся
7. Студент
8. Работающий инвалид
9. Неработающий инвалид-->
<@sf.dictionaryLookup path="form.familyCategory[${x}]" class="clone-field" dictionaryCode="64_APPLICANT_CATEGORY_64053" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
					
						<@sf.label path="form.familyPlaceJob[${x}]" title="Место работы (учебы) члена семьи:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.familyPlaceJob[${x}]" class="clone-field" qtip="В случае отсутствия места работы (учебы) ставится знак «-»" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				


                    <@sf.fldrow class="personclone">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>

                </@sf.initAllClones>

            <@sf.fldrow>
                <@sf.label path="form.dopSvedFamily" title="Дополнительные сведения о семье:" required=false style="text-align:left;" colspan="17"/>
                <@sf.textarea path="form.dopSvedFamily" qtip="Не заполняется в случае подачи заявления опекуном, а также в случае, если ребенок, нуждающийся в услуге, является инвалидом" style="text-align:left;" colspan="31"/>
            </@sf.fldrow>

				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о всех видах доходов семьи</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.familyRentDocLoad" title="Сведения о всех видах доходов семьи:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.familyRentDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Сведения заполняются на момент подачи заявления (с формой документа можно ознакомиться на карточке услуги в разделе \"Документы, необходимые для получения услуги\" или в разделе \"Приложения\" Административного регламента предоставления государственной услуги)" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

                		<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.familyPensionDocLoad" title="Сведения о размере пенсии:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				

                <@sf.initAllClones formElement=form.familyPensionDocLoad cloneSectionClass='familyPensionDocLoadclass' ; x>
                             <@sf.fldrow class="familyPensionDocLoadclass">
                                <@sf.fileload path="form.familyPensionDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                             </@sf.fldrow>
                             <@sf.fldrow class="familyPensionDocLoadclass">
                                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                             </@sf.fldrow>
                </@sf.initAllClones>
				

				
                <@sf.fldrow>
					
						<#-- По умолчанию: не активирован-->
<@sf.label path="form.commitment" title="Обязуюсь при извещении меня о наличии путевки (предоставлении места в лагере с дневным пребыванием) предоставить все требуемые документы (доходы всех членов семьи за три предыдущих месяца до момента выдачи путевки):" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию: не активирован-->
<@sf.checkbox path="form.commitment" qtip="" validation="required" style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
