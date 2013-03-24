<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление лицензии на осуществление медицинской деятельности'>
        <@script.scripttag>
            <@jquery.onready>
            <@customActions.setVisibleCloneDocLoadClassByCheckbox onload=true checkboxId='ownership' checkboxStatus='true' CloneDocLoadClass='load_doc5'/>
            <@customActions.setVisibleCloneDocLoadClassByCheckbox onload=true checkboxId='ownership' checkboxStatus='false' CloneDocLoadClass='load_doc4'/>
            <@action.setVisibleByValue 'true' 'ownership' 'change' 'load_doc5-label' '1'/>
            <@action.setVisibleByValue 'true' 'ownership' 'change' 'load_doc4-label' '0'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc2' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc4' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc6' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc7' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc8' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc9' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc5' hideButtonSections='true'/>
            <@action.cloneFormRowWithArrays clonesectionclass='load_doc11' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.label title="<h2>Дополнительные сведения</h2>" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
                <@sf.empty colspan="1"/>
<@sf.checkbox path="form.ownership" qtip=""  style="text-align:left;" colspan="1"/>
                					<@sf.empty colspan="1"/>
<@sf.label path="form.ownership" title="У соискателя лицензии имеются здания, строения, сооружения, необходимые для осуществления медицинской деятельности, подлежащие регистрации в Едином государственном реестре прав (ЕГРП):" required=false style="text-align:left;" colspan="40"/>

					

					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="<h2>Электронные копии документов</h2>" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc1" title="Адреса мест осуществления медицинской деятельности, с указанием выполняемых работ (услуг):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc1" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест осуществления деятельности с указанием лицензируемых видов работ и услуг" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.load_doc2" title="Копии документов об образовании (послевузовском, дополнительном профессиональном образовании, повышении квалификации) и документы, подтверждающие стаж работы индивидуального предпринимателя, связанный с выполнением работ (услуг):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc2 cloneSectionClass='load_doc2' ; x>
                    <@sf.fldrow class="load_doc2">
                        <@sf.fileload path="form.load_doc2[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>

<@sf.label path="form.load_doc4" title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской деятельности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc4 cloneSectionClass='load_doc4' ; x>
                    <@sf.fldrow class="load_doc4">
                        <@sf.fileload path="form.load_doc4[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc4">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>

<@sf.label path="form.load_doc6" title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления медицинской деятельности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc6 cloneSectionClass='load_doc6' ; x>
                    <@sf.fldrow class="load_doc6">
                        <@sf.fileload path="form.load_doc6[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc6">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>

<@sf.label path="form.load_doc7" title="Копии регистрационных удостоверений и сертификатов соответствия на используемую медицинскую технику:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc7 cloneSectionClass='load_doc7' ; x>
                    <@sf.fldrow class="load_doc7">
                        <@sf.fileload path="form.load_doc7[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc7">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>

<@sf.label path="form.load_doc8" title="Копии документов об образовании (послевузовском, дополнительном профессиональном образовании, повышении квалификации) специалистов, состоящих в штате соискателя лицензии или привлекаемых им на законном основании для осуществления работ (услуг):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc8 cloneSectionClass='load_doc8' ; x>
                    <@sf.fldrow class="load_doc8">
                        <@sf.fileload path="form.load_doc8[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc8">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
<@sf.label path="form.load_doc9" title="Копии документов об образовании и квалификации работников соискателя лицензии, осуществляющих техническое обслуживание медицинской техники, или договор с организацией, имеющей лицензию на осуществление этого вида деятельности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc9 cloneSectionClass='load_doc9' ; x>
                    <@sf.fldrow class="load_doc9">
                        <@sf.fileload path="form.load_doc9[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc9">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
<@sf.label path="form.load_doc3" title="Копия выданного в установленном порядке санитарно-эпидемиологического заключения о соответствии санитарным правилам осуществляемой медицинской деятельности:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
<@sf.fileload path="form.load_doc3" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"  qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.load_doc5" title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской деятельности:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc5 cloneSectionClass='load_doc5' ; x>
                    <@sf.fldrow class="load_doc5">
                        <@sf.fileload path="form.load_doc5[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc5">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc10" title="Документ, подтверждающий уплату государственной пошлины за предоставление лицензии:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc10" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc11" title="Технический паспорт здания или помещения, используемого для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.load_doc11 cloneSectionClass='load_doc11' ; x>
                    <@sf.fldrow class="load_doc11">
                        <@sf.fileload path="form.load_doc11[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"  qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc11">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
