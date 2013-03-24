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
    <@html.head title='Признание граждан участниками подпрограммы "Обеспечение жильем молодых семей" федеральной целевой программы "Жилище" на 2011 - 2015 годы"'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.docLoadMarriageCertficate" title="Копия свидетельства о браке:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.docLoadMarriageCertficate" qtip="Необязателен в случае неполной семьи" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.docDokhod cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.docDokhod" title="Документы,подтверждающие признание молодой семьи, имеющей доходы, позволяющие получить кредит либо иные денежные средства для оплаты расчетной (средней) стоимости жилья в части, превышающей размер предоставляемой социальной выплаты:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload path="form.docDokhod[${a}]" qtip="<br>Необходимо загрузить хотя бы один из указанных ниже документов:
<br>1. Документ, подтверждающий наличие у молодой семьи денежных средств, находящихся на счетах в банках и иных кредитных организациях (действителен 30 дней с даты выдачи)
<br>2. Документ из банка или иного кредитного учреждения о возможности предоставления молодой семье ипотечного (жилищного) кредита  в сумме, необходимой для оплаты расчётной (средней) стоимости жилья, в части, превышающей размер предоставляемой социальной выплаты (действителен 90 дней с даты выдачи)
<br>3. Гарантийное письмо работодателя о предоставлении молодой семье ссуды (финансовой помощи, беспроцентного кредита) в сумме, превышающей размер предоставляемой социальной выплаты для оплаты расчётной (средней) стоимости жилья (действителен 30 дней с даты выдачи)
<br>4. Документ оценки рыночной стоимости недвижимого, иного имущества, при наличии данного имущества в собственности членов молодой семьи, стоимость которого будет превышать размер предоставляемой социальной выплаты для оплаты расчётной (средней) стоимости жилья (действителен 90 дней с даты выдачи)
<br>5. Справки о заработной плате за последние 6 месяцев (2-НДФЛ) (действительна 30 дней с даты выдачи)
<br>6. Иные документы, подтверждающие наличие у молодой семьи денежных средств для оплаты расчётной (средней) стоимости жилья, в части, превышающей размер предоставляемой социальной выплаты (действителен  30 дней с даты выдачи)" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>


                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.docLoadNeedingHousing" title="Документ, подтверждающий признание молодой семьи нуждающейся в жилом помещении:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.docLoadNeedingHousing" qtip="Срок действия 1 месяц" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.docLoadDokhod" title="Копии декларации по налогу на доходы физических лиц за год, предшествующий подаче заявления, заверенной налоговым органом по месту жительства, если в соответствии с законодательством член молодой семьи обязан представлять указанную декларацию:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.docLoadDokhod" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.docLoadDeklENVD" title="Копии декларации по единому налогу на вмененный доход за год, предшествующий подаче заявления, заверенной налоговым органом по месту жительства, если член молодой семьи зарегистрирован как индивидуальный предприниматель и является плательщиком налога на вменённый доход:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.docLoadDeklENVD" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

						<@sf.label path="form.docLoadDeklUSN" title="Копии декларации по налогу, уплачиваемому в связи с применением упрощённой системы налогообложения за год, предшествующий подаче заявления, заверенной налоговым органом по месту жительства, если член молодой семьи зарегистрирован в качестве индивидуального предпринимателя и является плательщиком указанного налога:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.docLoadDeklUSN" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
