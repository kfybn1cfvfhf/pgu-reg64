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
    <@html.head title='Признание помещений жилыми помещениями, жилых помещений пригодными (непригодными) для проживания и многоквартирных домов аварийными и подлежащими сносу или реконструкции или о признании необходимости проведения ремонтно-восстановительных работ'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='gosDocLoadclass' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
                    <@sf.label path="form.targetAppl" title="Цель обращения:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.dictionaryLookup path="form.targetAppl" dictionaryCode="03_TARGET_APPL_64216" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.egrpDocLoad" title="Выписка из Единого государственного реестра прав на недвижимое имущество и сделок с ним о правах на жилое помещение:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.fileload path="form.egrpDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="В соответствии с ч. 2 п. 2.8 Административного регламента в предоставлении муниципальной услуги может быть отказано в случае поступления секретарю комиссии ответа на межведомственный запрос свидетельствующий об отсутствии документа и (или) информации, необходимых для предоставления муниципальной услуг, если соответствующий документ не представлен заявителем самостоятельно." style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.techDocLoad"  title="Технический паспорт на объект недвижимого имущества:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.techDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="В соответствии с ч. 2 п. 2.8 Административного регламента в предоставлении муниципальной услуги может быть отказано в случае поступления секретарю комиссии ответа на межведомственный запрос свидетельствующий об отсутствии документа и (или) информации, необходимых для предоставления муниципальной услуг, если соответствующий документ не представлен заявителем самостоятельно." style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.actDocLoad" title="Акт Государственной жилищной инспекции Саратовской области:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.actDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.gosDocLoad" title="Заключение органа, уполномоченного на проведение государственного контроля и надзора:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.gosDocLoad cloneSectionClass='gosDocLoadclass' ; x>
                    <@sf.fldrow class="gosDocLoadclass">
                        <@sf.fileload path="form.gosDocLoad[${x}]" qtip=''  fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="gosDocLoadclass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="31"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
						<@sf.label path="form.agreeCh" title="Я даю согласие в соответствии со ст. 9 Федерального закона «О персональных данных» на автоматизированную, а также без использования средств автоматизации обработку персональных данных в целях предоставления данной услуги, а именно на совершение действий предусмотренных п. 3 ст. 3 Федерального закона «О персональных данных» со сведениями представленными мной для предоставления муниципальной услуги:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.checkbox path="form.agreeCh" qtip="" validation="required" style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
