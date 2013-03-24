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
    <@html.head title='Выдача копий архивных документов, подтверждающих право на владение землей'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.cloneFormRowWithArrays clonesectionclass='actDocLoadClass' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о запрашиваемом документе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.actOrgan" title="Орган, выдававший муниципальный правовой акт:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textarea path="form.actOrgan" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.actDate" title="Дата издания муниципального правового акта:" required=true style="text-align:left;" colspan="17"/>
<@sf.datefield path="form.actDate"  qtip="Не ранее 07.1992" validation='required' minDate="01.07.1992" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.actNum" title="Номер муниципального правового акта:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.actNum" qtip="" validation="required digitsDash" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.actCopyAmount" title="Количество экземпляров:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.actCopyAmount" qtip="" validation="required digits" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.actDopInfo" title="Дополнительные сведения:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textarea path="form.actDopInfo" qtip="Сведения, позволяющие идентифицировать содержание постановления (наименование юридического лица, ФИО физического лица, адрес, и т.д.)" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.actPurpose" title="Цель, для которой запрашивается муниципальный правовой акт:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.actPurpose" qtip="Например: для предоставления в судебные органы" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.actDocLoad" title="Документ, удостоверяющий право заявителя на получение муниципального правового акта:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>


                <@sf.initAllClones formElement=form.actDocLoad cloneSectionClass='actDocLoadClass' ; x>
                    <@sf.fldrow class="actDocLoadClass">
                        <@sf.fileload path="form.actDocLoad[${x}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>В качестве документа, удостоверяющего право заявителя на получение муниципального правового акта, к заявлению могут быть приложены следующие документы:<br>
1. Свидетельство о праве наследования;<br>
2. Договор дарения;<br>
3. Договор купли-продажи;<br>
4. Доверенность;<br>
5. Иные документы в соответствии с административным регламентом." style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="actDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
