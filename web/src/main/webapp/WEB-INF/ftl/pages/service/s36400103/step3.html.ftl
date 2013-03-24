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
    <@html.head title='Выдача градостроительных планов земельных участков'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.cloneFormRowWithArrays clonesectionclass='fl_owner_clone' hideButtonSections='true'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.initAllClones formElement=form.fl_owner_Name cloneSectionClass='fl_owner_clone' ; x>

                    <@sf.fldrow class="fl_owner_clone">
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о правообладателях земельного участка</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования
Валидация: cyrillicText-->
<@sf.label path="form.fl_owner_Name" title="Фамилия, Имя, Отчество:" required=true style="text-align:left;" colspan="17"/>
<@sf.textarea path="form.fl_owner_Name[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<#-- По умолчанию: 
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.fl_owner_address" title="Адрес места регистрации:" required=true style="text-align:left;" colspan="17"/>
<@sf.textarea path="form.fl_owner_address[${x}]" class="clone-field" qtip="Адрес указывается в формате: почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры." validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.fl_owner_phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield path="form.fl_owner_phone[${x}]" class="clone-field" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="phone required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.fl_owner_email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield path="form.fl_owner_email[${x}]" class="clone-field" validation="email" qtip="Вносится в формате: name@site.domain"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность правообладателя земельного участка</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">

						<#-- По умолчанию:
Незаполнено, Доступно для редактирования-->
<@sf.label path="form.fl_owner_identityDocType" title="Реквизиты документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
<@sf.textarea path="form.fl_owner_identityDocType[${x}]" class="clone-field" qtip="Реквизиты должны содержать: наименование документа, удостоверяющего личность, серию, номер, дату выдачи и орган, выдавший документ." validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS. 
Множественная загрузка-->
<@sf.label path="form.fl_owner_identityDocLoad" title="Документ, удостоверяющий личность правообладателя земельного участка:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="fl_owner_clone">
<@sf.fileload path="form.fl_owner_identityDocLoad[${x}]" class="clone-field" qtip="Приложите электронные копии документов, удостоверяющих личность всех правообладателей земельного участка - физических лиц, кроме заявителя."
fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.fldrow class="fl_owner_clone">
                    <@sf.addRemoveButton addTitle="Добавить сведения о правообладателе земельного участка" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>

            </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
