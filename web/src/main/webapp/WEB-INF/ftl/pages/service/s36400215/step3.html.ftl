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
    <@html.head title='Предоставление разрешения на право организации розничного рынка, продление срока его действия, переоформление разрешения'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'typeMarket' '1,3'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<#-- 03_GOAL_APPL_64215-->
<@sf.label path="form.goalAppl" title="Цель подачи заявления:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- 03_GOAL_APPL_64215-->
<@sf.dictionaryLookup path="form.goalAppl" dictionaryCode="03_GOAL_APPL_64215" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 03_TYPE_MARKET_64215-->
<@sf.label path="form.typeMarket" title="Тип рынка:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- 03_TYPE_MARKET_64215-->
<@sf.dictionaryLookup path="form.typeMarket" dictionaryCode="03_TYPE_MARKET_64215" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.marketDocLoad" title="Копия документа, подтверждающего право на объект (объекты) недвижимости, расположенные на территории, в пределах которой предполагается организация рынка:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.marketDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
