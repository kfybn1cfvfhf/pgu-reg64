<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/elements.ftl" as customElements>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Получение лицензии на фармацевтическую деятельность индивидуальными предпринимателями'>
        <@script.scripttag>
            <@jquery.onready>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocF1" hideButtonSections="true" />
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocG1" hideButtonSections="true" />
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocH1" hideButtonSections="true" />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >
				
                <@sf.fldrow>
					
						<@sf.statictext class="field-qtip" style="text-align:left;" colspan="48"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.loadsan" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии документов, подтверждающих право собственности или иное законное основание использование помещений для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				<@sf.initAllClones formElement=form.loadDocG1 cloneSectionClass="clonesection-loadDocG1" ; x >
                    <@sf.fldrow class="clonesection-loadDocG1">

                            <@sf.fileload path="form.loadDocG1[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:unknown;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<@sf.label title="Копии документов, подтверждающих право собственности или иное законное основание использование оборудования для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				<@sf.initAllClones formElement=form.loadDocH1 cloneSectionClass="clonesection-loadDocH1" ; x >
                    <@sf.fldrow class="clonesection-loadDocH1">

                            <@sf.fileload path="form.loadDocH1[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:unknown;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<@sf.label title="Копии документов о высшем и среднем фармацевтическом образовании  и сертификата специалиста специалистов – для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
                <@sf.initAllClones formElement=form.loadDocF1 cloneSectionClass="clonesection-loadDocF1" ; x >
                    <@sf.fldrow class="clonesection-loadDocF1">

                            <@sf.fileload path="form.loadDocF1[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:unknown;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<@sf.label title="Документ, подтверждающий уплату государственной пошлины за предоставление лицензии:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.loadDocZ1" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Опись прилагаемых документов:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.loadDocdov2" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@customElements.medDocsGivenByUserInitiative
                    sumColspan = 48

                    beforeStaticTextColspan = 0
                    afterStaticTextColspan = 0

                    beforeLabelColspan = 0
                    afterLabelColspan = 0

                    beforeFileloadColspan = 0
                    afterFileloadColspan = 0
                />

                <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий стаж работы руководителя соискателя лицензии:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.loaddoc_manager" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
