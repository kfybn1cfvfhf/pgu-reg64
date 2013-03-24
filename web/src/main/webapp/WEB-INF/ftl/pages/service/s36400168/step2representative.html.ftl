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
    <@html.head title='Выдача направления гражданину на прохождение МСЭ'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.setReadonlyByValue 'true' 'addressEq' 'change' 'addressPost' '1' />
                $("#addressEq").change(function() {
                    if($('#addressEq').attr('checked') == true) {
                        $('#addressPost').attr('value', $('#factAddress').attr('value'));
                    } else {
                        $('#addressPost').attr('value', '');
                    }
                });

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<#-- #dovLabel-->

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о законном представителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- #dovDocNote-->

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.dovDovLoad" title="Документ, подтверждающий право законного представителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.dovDovLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.dovPasLoad" title="Документ, удостоверяющий личность представителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.dovPasLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- #applLabel-->

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования
                    Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования
                    Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования
                    Валидация: cyrillic (кириллические буквы, пробел и знак дефиса)-->

                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- сделать radiogroup-->

                    <@sf.label path="form.sex" title="Пол:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.radiogroup mode="horizontal" staticOpts={"1":"Мужской", "2":"Женский"} path="form.sex" qtip="" validation="required"  style="text-align:left;" colspan="18"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.birthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.datefield path="form.birthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.factAddress" title="Адрес места жительства (пребывания):" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textarea path="form.factAddress" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.address" title="Адрес регистрации:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textarea path="form.address" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию не активирован
                    Логика
                    При активации значение поля #factAddress копируется на поле #addressPost-->

                    <@sf.label path="form.addressEq" title="Почтовый адрес совпадает с адресом места жительства (пребывания):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.checkbox path="form.addressEq" qtip="Поставьте отметку, если почтовый адрес совпадает с адресом места жительства (пребывания), в этом случае сведения об адресе места жительства будут скопированы на поле «Почтовый адрес»"  style="text-align:unknown;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.addressPost" title="Почтовый адрес:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.addressPost" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры. 
В качестве почтового адреса так же может быть указан «адрес до востребования» или абонентский ящик."  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования
                    Валидация: phone (перекрыть)-->

                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования
                    Валидация: email-->

                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- #identityDoc-->

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.customLookup  path="form.identityDocType" controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'} qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию:
                    Незаполнено, Доступно для редактирования-->

                    <@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- #identityDocNote-->

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.identityDocLoad" title="Документ, удостоверяющий личность заявителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.identityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
