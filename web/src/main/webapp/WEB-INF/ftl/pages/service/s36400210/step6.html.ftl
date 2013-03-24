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
    <@html.head title='Выдача разрешения на ввод в эксплуатацию объекта капитального строительства, если его строительство, реконструкция осуществлялись на территориях двух и более муниципальных образований (муниципальных районов городских округов)'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass2' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.label path="form.constructionName" title="Наименование объекта строительства:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.constructionName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.constructionPlace" title="Сведения о фактическом месте расположения объекта строительства:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.constructionPlace" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.aktPriemkiLoad" title="Акт приемки объекта капитального строительства (в случае осуществления строительства, реконструкции на основании договора):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.aktPriemkiLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sootvetsLoad" title="Документ, подтверждающий соответствие построенного, реконструированного объекта капитального строительства требованиям технических регламентов и подписанный лицом, осуществляющим строительство:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.sootvetsLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sootvetsParamLoad" title="Документ, подтверждающий соответствие параметров построенного, реконструированного объекта капитального строительства проектной документации, в том числе требованиям энергетической эффективности и требованиям оснащенности объекта капитального строительства приборами учета используемых энергетических ресурсов, и подписанный лицом, осуществляющим строительство (лицом, осуществляющим строительство, и застройщиком или техническим заказчиком в случае осуществления строительства, реконструкции на основании договора, а также лицом, осуществляющим строительный контроль, в случае осуществления строительного контроля на основании договора), за исключением случаев осуществления строительства, реконструкции объектов индивидуального жилищного строительства:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.sootvetsParamLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.sootvetsTehUslLoad cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.sootvetsTehUslLoad" title="Документы, подтверждающие соответствие построенного, реконструированного объекта капитального строительства техническим условиям и подписанные представителями организаций, осуществляющих эксплуатацию сетей инженерно-технического обеспечения (при их наличии):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload path="form.sootvetsTehUslLoad[${a}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
<@sf.label path="form.shemObjectLoad" title="Схема, отображающая расположение построенного, реконструированного объекта капитального строительства, расположение сетей инженерно-технического обеспечения в границах земельного участка и планировочную организацию земельного участка и подписанная лицом, осуществляющим строительство (лицом, осуществляющим строительство, и застройщиком или техническим заказчиком в случае осуществления строительства, реконструкции на основании договора), за исключением случаев строительства, реконструкции линейного объекта:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.shemObjectLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.dogStrahLoad" title="Документ, подтверждающий заключение договора обязательного страхования гражданской ответственности владельца опасного объекта за причинение вреда в результате аварии на опасном объекте в соответствии с законодательством Российской Федерации об обязательном страховании гражданской ответственности владельца опасного объекта за причинение вреда в результате аварии на опасном объекте:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.dogStrahLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.stroitRazrLoad" title="Разрешение на строительство:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.stroitRazrLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.pravoDocLoad cloneSectionClass='LoadFileClass2' ; b>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.label path="form.pravoDocLoad" title="Правоустанавливающие документы на земельный участок:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.fileload path="form.pravoDocLoad[${b}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
<@sf.label path="form.planDocLoad" title="Градостроительный план земельного участка или в случае выдачи разрешения на строительство линейного объекта реквизиты проекта планировки территории и проекта межевания территории:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.planDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.zaklGosStroyLoad" title="Заключение органа государственного строительного надзора (в случае, если предусмотрено осуществление государственного строительного надзора) о соответствии построенного, реконструированного объекта капитального строительства требованиям технических регламентов и проектной документации, в том числе требованиям энергетической эффективности и требованиям оснащенности объекта капитального строительства приборами учета используемых энергетических ресурсов, заключение федерального государственного экологического надзора в случаях, предусмотренных частью 7 статьи 54 Градостроительного Кодекса:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.zaklGosStroyLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
