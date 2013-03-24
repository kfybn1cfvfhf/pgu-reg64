<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление лицензии на право ведения образовательной деятельности'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.setVisibleByValue 'true' 'checkBox2' 'change' 'load_doc5' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox2' 'change' 'load_doc5-label' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox3' 'change' 'load_doc3' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox3' 'change' 'load_doc3-label' 'on'/>

                <@action.cloneFormRowWithArrays clonesectionclass='load_doc4Class' hideButtonSections='true'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox2 отображается документ «Копия положения о филиале (в случае, если лицензиат обращается за разрешением на осуществление образовательной деятельности в филиале)»-->
<@sf.label path="form.checkBox2" title="Соискатель обращается за разрешением на осуществление деятельности в филиале:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox2 отображается документ «Копия положения о филиале (в случае, если лицензиат обращается за разрешением на осуществление образовательной деятельности в филиале)»-->
<@sf.checkbox path="form.checkBox2" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox3 отображается документ «Копия положения о структурном подразделении (в случае, если в качестве лицензиата выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки»-->
<@sf.label path="form.checkBox3" title="В качестве соискателя лицензии выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox3 отображается документ «Копия положения о структурном подразделении (в случае, если в качестве лицензиата выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки»-->
<@sf.checkbox path="form.checkBox3" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Электронные копии документов</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.  <br>
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc0" title="Заявление образовательного учреждения, согласованное с учредителем:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc0" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc4" title="Копии учредительных документов образовательного учреждения, засвидетельствованные в нотариальном порядке:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc4 cloneSectionClass="load_doc4Class" ; x>
                    <@sf.fldrow class="load_doc4Class">
                        <@sf.fileload path="form.load_doc4[${x}]" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc4Class">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox2
2. Скрывается при деактивировации чекбокса #checkBox2
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc5" title="Копия положения о филиале (в случае, если лицензиат обращается за разрешением на осуществление образовательной деятельности в филиале):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox2
2. Скрывается при деактивировации чекбокса #checkBox2
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc5" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox3
2. Скрывается при деактивировации чекбокса #checkBox3
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc3" title="Копия положения о структурном подразделении (в случае, если в качестве лицензиата выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox3
2. Скрывается при деактивировации чекбокса #checkBox3
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc3" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc39" title="Опись представленных документов:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc39" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc38" title="Документ, подтверждающий уплату государственной пошлины:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc38" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc40" title="Выписка из Единого государственного реестра юридических лиц:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc40"  fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
