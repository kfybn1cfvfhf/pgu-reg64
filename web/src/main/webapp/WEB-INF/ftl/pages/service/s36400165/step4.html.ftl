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
    <@html.head title='Лицензирование розничной продажи алкогольной продукции в Саратовской области'>
        <@script.scripttag>
            <@jquery.onready>
			<@action.cloneFormRowWithArrays clonesectionclass='orgClone' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.label path="form.license" title="Срок, на который испрашивается лицензия:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.textfield  path="form.license" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о лицензии</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.licenseNum" title="Номер лицензии:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.textfield  path="form.licenseNum" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.licenseReg" title="Регистрационный номер лицензии:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.textfield  path="form.licenseReg" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.licenseSrok" title="Срок действия лицензии c:" required=true style="text-align:left;" colspan="18"/>


					
						<@sf.datefield  path="form.licenseSrok" qtip="" validation="required" style="text-align:left;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.label path="form.licensePo" title="по:" required=true style="text-align:left;" colspan="5"/>


                        <@sf.datefield  path="form.licensePo" qtip="" validation="required" style="text-align:left;" colspan="8"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.orgPlace cloneSectionClass='orgClone' ; x>

                <@sf.fldrow class="orgClone">
					
						<@sf.label title="<h2>Сведения об обособленных подразделениях организации, осуществляющих лицензируемый вид деятельности</h2>" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="orgClone">
					
						<@sf.label path="form.orgPlace" title="Место нахождения обособленного подразделения, осуществляющего лицензируемый вид деятельности:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.textfield  path="form.orgPlace[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="orgClone">
					
						<@sf.label path="form.activKind" title="Вид деятельности обособленного подразделения:" required=true style="text-align:left;" colspan="18"/>
					
						<@sf.textfield  path="form.activKind[${x}]" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>

                <@sf.fldrow class="orgClone">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>

                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:unknown;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.dutyDocLoad" title="Сведения об уплате Государственной пошлины:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.dutyDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
