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
    <@html.head title='Назначение опекуном (попечителем), выдача заключения о возможности быть опекуном (попечителем) совершеннолетнего недееспособного (не полностью дееспособного) гражданина'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue onload="true"  srcid="targetAppeal" event="change" value="1,2" destid="opinionBeGuardLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="targetAppeal" event="change" value="1,2" destid="opinionBeGuardLoad"  />
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass2' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass3' hideButtonSections='true'/>
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
<@sf.label path="form.targetAppeal" title="Цель подачи заявления:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.targetAppeal" dictionaryCode="0364_TARGET_APPEAL_101" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.materialCapabilities" title="Материальные возможности, жилищные условия, состояние здоровья и характер работы позволяют мне взять совершеннолетнего недееспособного (или не полностью дееспособного) гражданина под опеку (попечительство):" required=true style="text-align:left;" colspan="17"/>
<@sf.checkbox path="form.materialCapabilities" qtip="" validation="required" style="text-align:left;" colspan="1"/>
						<@sf.empty colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.furtherInform" title="Дополнительно могу сообщить следующее:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.furtherInform" qtip="Указывается наличие у гражданина необходимых знаний и навыков в осуществлении опеки (попечительства) над совершеннолетним недееспособным или не полностью дееспособным гражданином, в том числе информация о наличии документов о профессиональной деятельности, о прохождении программ подготовки кандидатов в опекуны или попечители и т.д." validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.opinionBeGuardLoad" title="Заключение о возможности быть опекуном (попечителем):" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.opinionBeGuardLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.certificateEmploymentLoad" title="Справка с места работы с указанием должности и размера средней заработной платы за последние 12 месяцев, а для граждан, не состоящих в трудовых отношениях, - иной документ, подтверждающий доходы:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.certificateEmploymentLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Для пенсионеров - копии пенсионного удостоверения, справки из территориального органа Пенсионного фонда Российской Федерации или иного органа, осуществляющего пенсионное обеспечение" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.medicalReportLoad" title="Медицинское заключение о состоянии здоровья по результатам освидетельствования гражданина, выразившего желание стать опекуном, выданное в порядке, устанавливаемом Министерством здравоохранения Российской Федерации:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.medicalReportLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.marriageCertificateLoad" title="Копия свидетельства о браке:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.marriageCertificateLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.writtenConsentLoad cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.writtenConsentLoad" title="Письменное согласие совершеннолетних членов семьи с учетом мнения детей, достигших 10-летнего возраста, проживающих совместно с гражданином, выразившим желание стать опекуном, на совместное проживание совершеннолетнего подопечного с опекуном (в случае принятия решения опекуном о совместном проживании совершеннолетнего подопечного с семьей опекуна):" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload path="form.writtenConsentLoad[${a}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.personalDataConsentLoad cloneSectionClass='LoadFileClass2' ; b>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.label path="form.personalDataConsentLoad" title="Документ подтверждающий согласие на обработку персональных данных всех членов семьи заявителя и полномочия на их передачу:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.fileload path="form.personalDataConsentLoad[${b}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>


                <@sf.fldrow>
<@sf.label path="form.guardTrainingLoad" title="Документ о прохождении подготовки гражданином, выразившим желание стать опекуном:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.guardTrainingLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.autobiographyLoad" title="Автобиография:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.autobiographyLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.excerptHomeLoad" title="Выписка из домовой (поквартирной) книги с места жительства или иной документ, подтверждающий право пользования жилым помещением либо право собственности на жилое помещение и копия финансового лицевого счета с места жительства гражданина, выразившего желание стать опекуном:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.excerptHomeLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.convictionLoad" title="Справка органов внутренних дел, подтверждающая отсутствие у гражданина, выразившего желание стать опекуном, судимости за умышленное преступление против жизни и здоровья граждан:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.convictionLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.accordingPremisesLoad" title="Справки о соответствии жилых помещений санитарным правилам и нормам, выданные соответствующими уполномоченными органами:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.accordingPremisesLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.technicalRulesLoad" title="Справки о соответствии жилых помещений техническим правилам и нормам, выданные соответствующими уполномоченными органами:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.technicalRulesLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.certificatePensionLoad cloneSectionClass='LoadFileClass3' ; c>
                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.label path="form.certificatePensionLoad" title="Справка из территориальных органов Пенсионного фонда Российской Федерации, либо иных органов, осуществляющих пенсионное обеспечение, о размере пенсии и иных социальных выплат за последние 12 месяцев:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.fileload path="form.certificatePensionLoad[${c}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="В случае если заявитель и (или) член его семьи является индивидуальным предпринимателем. Необходим для каждого члена семьи." style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
<@sf.label path="form.socialPaymentsLoad" title="Справка, выданная органами социальной защиты населения, о размере социальных выплат за последние 12 месяцев:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.socialPaymentsLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Прикладывается для каждого члена семьи, получающего социальные выплаты" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
