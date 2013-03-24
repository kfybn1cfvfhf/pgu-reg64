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
    <@html.head title='Предоставление земельных участков, на которых расположены здания, строения и сооружения'>
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
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.listDocLoad" title="Сообщение заявителя (заявителей), содержащее перечень всех зданий, строений, сооружений, расположенных на земельном участке, в отношении которого подано заявление о приобретении прав, с указанием (при их наличии у заявителя) их кадастровых (инвентарных) номеров и адресных ориентиров:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.listDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.realtyDocLoad" title="Копии документов, удостоверяющих (устанавливающих) права на здание, строение, сооружение, если право на такое здание, строение, сооружение в соответствии с законодательством РФ признается возникшим независимо от его регистрации в Едином государственном реестре прав на недвижимое имущество и сделок с ним:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.realtyDocLoad" qtip="Документ представляется в случае если право на  здание, строение, сооружение в соответствии с законодательством РФ признается возникшим независимо от его регистрации в ЕГРП" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.rightDocLoad" title="Копии документов, удостоверяющих (устанавливающих) права на приобретаемый земельный участок, в случае если право на данный земельный участок в соответствии с законодательством РФ признается возникшим независимо от его регистрации в Едином государственном реестре прав на недвижимое имущество и сделок с ним:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.rightDocLoad" qtip="Документ представляется в случае если право на  земельный участок в соответствии с законодательством РФ признается возникшим независимо от его регистрации в ЕГРП" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.circsDocLoad" title="Копия документа, подтверждающего обстоятельства, дающие право приобретения земельного участка, в том числе на особых условиях, постоянное (бессрочное) пользование, безвозмездное срочное пользование, в собственность или в аренду на условиях, установленных земельным законодательством, если данное обстоятельство не следует из документов, указанных выше:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.circsDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.realtyEgrpDocLoad" title="Выписка из Единого государственного реестра прав на недвижимое имущество и сделок с ним о правах на здание, строение, сооружение, находящееся на приобретаемом земельном участке:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.realtyEgrpDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.realtyNoDocLoad" title="Уведомление об отсутствии в Едином государственном реестре прав на недвижимое имущество и сделок с ним запрашиваемых сведений о зарегистрированных правах на здание, строение, сооружение, находящееся на приобретаемом земельном участке:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.realtyNoDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.landEgrpDocLoad" title="Выписка из  Единого государственного реестра прав на недвижимое имущество и сделок с ним о правах на приобретаемый земельный участок:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.landEgrpDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.landNoDocLoad" title="Уведомление об отсутствии в Едином государственном реестре прав на недвижимое имущество и сделок с ним запрашиваемых сведений о зарегистрированных правах на приобретаемый земельный участок:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.landNoDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->

                    <@sf.label path="form.kadastrDocLoad" title="Кадастровый паспорт земельного участка, либо кадастровая выписка о земельном участке в случае, если заявление о приобретении прав на данный земельный участок подано с целю переоформления прав на него:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.kadastrDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				                <@sf.fldrow>


                    <@sf.label path="form.vipUlDocLoad" title="Выписка из ЕГРЮЛ/ЕГРИП:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.fileload path="form.vipUlDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>