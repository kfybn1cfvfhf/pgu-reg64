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
    <@html.head title='Выдача удостоверений тракториста-машиниста (тракториста)'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.setVisibleByValue 'true' 'drivingCategory' 'change' 'drivingdocLoad' 'on'/>
                <@action.setVisibleByValue 'true' 'drivingCategory' 'change' 'drivingdocLoad-label' 'on'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<#-- 03_PURPOSE_APPL_64180-->

                    <@sf.label path="form.purpose" title="Цель обращения:" required=true style="text-align:left;" colspan="18"/>

                    <@sf.dictionaryLookup path="form.purpose" dictionaryCode="03_PURPOSE_APPL_64180" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.drivingCategory" title="Заявитель обращается за получением права на управление самоходными машинами категорий «A II»,  «A III», «A IV»" required=false style="text-align:left;" colspan="18"/>

                    <@sf.checkbox path="form.drivingCategory" qtip="Поставьте отметку, если заявитель обращается за получением права на управление самоходными машинами категорий «A II»,  «A III», «A IV»"  style="text-align:left;" colspan="31"/>

                </@sf.fldrow>


                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о ранее выданном удостоверении</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.sertKind" title="Наименование удостоверения:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.textfield  path="form.sertKind" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.sertSeria" title="Серия документа:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.textfield  path="form.sertSeria" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.sertNo" title="Номер документа:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.textfield  path="form.sertNo" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.sertCat" title="Категория (квалификация):" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.textfield  path="form.sertCat" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.sertOrg" title="Наименование органа, выдавшего документ:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.textarea path="form.sertOrg" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.sertDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="18"/>
					
					<@sf.datefield path="form.sertDate"  qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.meddocLoad" title="Медицинская справка о годности к управлению самоходными машинами или отдельных категорий:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.meddocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.edudocLoad" title="Документ о прохождении обучения:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.edudocLoad" qtip="Представляется  в случае, если заявитель проходил обучение в соответствующем учреждении" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.drivingdocLoad" title="Водительское удостоверение:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.drivingdocLoad" qtip="Документ предоставляется в случае получения права на управление самоходными машинами категории AII, AIII или AIV." validation="required" style="text-align:left;" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.dutydocLoad" title="Документ, подтверждающий оплату  государственной пошлины:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.dutydocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
