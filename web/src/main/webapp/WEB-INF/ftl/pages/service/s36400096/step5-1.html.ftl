<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача решения о переводе или об отказе в переводе жилого помещения в нежилое или нежилого помещения в жилое помещение'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue onload="true"  srcid="roomStatusAfter" event="change" value="2" destid="roomPurpose" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="roomStatusAfter" event="change" value="2" destid="roomPurpose"  />
                <@action.setVisibleByValue onload="true"  srcid="roomStatusNow" event="change" value="2" destid="techPlanDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="roomStatusNow" event="change" value="2" destid="techPlanDocLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="roomStatusNow" event="change" value="1" destid="techPassport" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="roomStatusNow" event="change" value="1" destid="techPassport"  />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о помещении, в отношении которого принимается решение о переводе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.roomStatusNow" title="Статус помещения в настоящий момент:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.roomStatusNow" dictionaryCode="64_STATUS_PREMISES_64096" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.roomStatusAfter" title="Статус, который необходимо присвоить помещению:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.roomStatusAfter" dictionaryCode="64_STATUS_PREMISES_64096" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.roomPurpose" title="Назначение помещения после перевода его в статус «нежилое»:" required=true style="text-align:left;" colspan="17"/>
<@sf.textarea path="form.roomPurpose" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- блок: statAddressRegAppl-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Адрес помещения</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='roomAddressCountry' countryCode='roomAddressCountryCode' input='roomAddressEnterType'
                country_input='roomAddressCountryInput' settlementRF='roomAddressSettlementDict' streetRF='roomAddressStreetDict'
                area='roomAddressRayon' region='roomAddressRegion' settlement_type='roomAddressSettlementType'
                country_settlement='roomAddressCountrySettlement' settlement='roomAddressSettlementText' city='roomAddressCity'
                street='roomAddressStreetText' house='roomAddressHouse' corp='roomAddressKorpus' flat='roomAddressFlat' post="roomAddressIndex"  />
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о способе передачи уведомления о принятом решении о переводе помещения</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.wayOfDelivery" title="Способ передачи уведомления о принятом решении о переводе помещения:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.wayOfDelivery" dictionaryCode="64_WAY_OF_DELIVERY_64096" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.proectDocLoad" title="Подготовленный и оформленный в установленном порядке проект переустройства и (или) перепланировки переводимого помещения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.proectDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляется в случае, если переустройство и (или) перепланировка требуется для обеспечения использования такого помещения в качестве жилого или нежилого помещения" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
<@sf.label path="form.agreeUlDocLoad" title="Документ, подтверждающий наличие согласия, предусмотренного частью 3 статьи 7 Федерального закона от 27 июля 2010 г. № 210-ФЗ «Об организации предоставления государственных и муниципальных услуг»:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.agreeUlDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляется в случаях, предусмотренных частью 3 статьи 7 Федерального закона от 27 июля 2010 г. № 210-ФЗ «Об организации предоставления государственных и муниципальных услуг»" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.lowDocLoad" title="Правоустанавливающие документы на переводимое помещение" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.lowDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.housePlanDocLoad" title="Поэтажный план дома, в котором находится переводимое помещение:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.housePlanDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.techPlanDocLoad" title="План переводимого помещения с техническим описанием :" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.techPlanDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.techPassport" title="Технический паспорт:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.techPassport" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
