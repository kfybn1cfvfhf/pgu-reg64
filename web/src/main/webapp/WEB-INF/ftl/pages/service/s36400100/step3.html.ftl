<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title=' Прием заявлений и выдача документов о согласовании переустройства и (или) перепланировки жилого помещения'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об объекте недвижимости (жилом помещении)</h2></@sf.statictext>
					
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressPlacementCountry' countryCode='addressPlacementCountryCode' input='addressPlacementEnterType'
                country_input='addressPlacementCountryInput' settlementRF='addressPlacementSettlementDict' streetRF='addressPlacementStreetDict'
                area='addressPlacementRayon' region='addressPlacementRegion' settlement_type='addressPlacementSettlementType'
                country_settlement='addressPlacementCountrySettlement' settlement='addressPlacementSettlementText' city='addressPlacementCity'
                street='addressPlacementStreetText' house='addressPlacementHouse' corp='addressPlacementKorpus' flat='addressPlacementFlat' post="addressPlacementIndex"  />

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.planDocLoad" title="Подготовленный и оформленный в установленном порядке проект переустройства и (или) перепланировки переустраиваемого и (или) перепланируемого жилого помещения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.planDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.label path="form.pravoDocLoad" title="Правоустанавливающие документы на переустраиваемое и (или) перепланируемое жилое помещение:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.fileload path="form.pravoDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.label path="form.techDocLoad" title="Технический паспорт переустраиваемого и (или) перепланируемого жилого помещения:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.fileload path="form.techDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.label path="form.arhDocLoad" title="Заключение органа по охране памятников архитектуры, истории и культуры о допустимости проведения переустройства и (или) перепланировки жилого помещения, если такое жилое помещение или дом, в котором оно находится, является памятником архитектуры, истории или культуры:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.fileload path="form.arhDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
