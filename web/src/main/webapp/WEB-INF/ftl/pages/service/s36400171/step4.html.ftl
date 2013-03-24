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
    <@html.head title='Присвоение звания «Ветеран труда»'>
        <@script.scripttag>
            <@jquery.onready>
			<@action.cloneFormRowWithArrays clonesectionclass='experienceCertificateLoad' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='workActivityLoad' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='employmentHistoryLoad' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Дополнительные сведения, необходимые для предоставления услуги</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.socialSupport" title="Орган социальной поддержки населения, предоставляющий государственную услугу:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.socialSupport" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать один из органов социальной поддержки населения, в который обращается заявитель" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о пенсионном удостоверении получателя услуги</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.pensDocLoad" title="Номер пенсионного удостоверения:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.pensDocLoad"  qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Документы, предоставляемые лицами, награжденными орденами или медалями, либо удостоенными почетных званий СССР, РСФСР или Российской Федерации, либо награжденными ведомственными знаками отличия в труде и имеющих трудовой стаж, необходимый для назначения пенсии по старости или за выслугу лет
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.rewardingCertificateLoad" title="Документ, подтверждающий награждение орденами или медалями, либо присвоение почетных званий СССР, РСФСР или Российской Федерации, либо награждение ведомственными знаками отличия в труде:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.rewardingCertificateLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.experienceCertificateLoad" title="Документ, подтверждающий трудовой стаж, необходимый для назначения пенсии по старости или за выслугу лет:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.experienceCertificateLoad cloneSectionClass='experienceCertificateLoad' ; k>
                <@sf.fldrow class="experienceCertificateLoad">
                <@sf.fileload path="form.experienceCertificateLoad[${k}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"  qtip="В качестве документа, подтверждающего трудовой стаж, необходимый для назначения пенсии по старости или за выслугу лет, к заявлению могут быть приложены следующие документы:<br>
1. Пенсионное удостоверение<br>
2. Трудовая книжка (ее заверенная копия, или выписка из нее) <br>
3. Иные документы в соответствии с административным регламентом <br>
К заявлению допустимо прикладывать несколько документов данного типа" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                <@sf.fldrow class="experienceCertificateLoad">
                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>
                </@sf.initAllClones>


                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Документы, предоставляемые лицами, начавшими трудовую деятельность в несовершеннолетнем возрасте в период Великой Отечественной войны и имеющими трудовой стаж не менее 40 лет для мужчин и 35 лет для женщин
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.workActivityLoad" title="Документ, подтверждающий начало трудовой деятельности в несовершеннолетнем возрасте в период с 22 июня 1941 года по 9 мая 1945 года, исключая время работы в районах, временно оккупированных неприятелем:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.workActivityLoad cloneSectionClass='workActivityLoad' ; k>
                <@sf.fldrow class="workActivityLoad">
                <@sf.fileload path="form.workActivityLoad[${k}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"  qtip="В качестве документа, подтверждающего начало трудовой деятельности в несовершеннолетнем возрасте в период с 22 июня 1941 года по 9 мая 1945 года, исключая время работы в районах, временно оккупированных неприятелем к заявлению могут быть приложены следующие документы:<br>
1. Сведения архивных учреждений и уполномоченных органов<br>
2. Трудовая книжка<br>
К заявлению допустимо прикладывать несколько документов данного типа" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                <@sf.fldrow class="workActivityLoad">
                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.employmentHistoryLoad" title="Документ, подтверждающий трудовой стаж (не менее 40 лет для мужчин и 35 лет для женщин):" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.employmentHistoryLoad cloneSectionClass='employmentHistoryLoad' ; k>
                <@sf.fldrow class="employmentHistoryLoad">
                <@sf.fileload path="form.employmentHistoryLoad[${k}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"  qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                <@sf.fldrow class="employmentHistoryLoad">
                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>
                </@sf.initAllClones>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>