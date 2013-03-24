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
    <@html.head title='Предоставление лицензии на осуществление фармацевтической деятельности для ЮЛ'>
        <@script.scripttag>
            <@jquery.onready>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocB1" hideButtonSections="true" />
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocB3" hideButtonSections="true" />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >
				
                <@sf.fldrow>
					
						<#-- сделать синим-->
                        <@sf.statictext class="field-qtip" style="text-align:left;" colspan="48"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии учредительных документов юридического лица, засвидетельствованные в нотариальном порядке:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				<@sf.initAllClones formElement=form.loadDocB1 cloneSectionClass="clonesection-loadDocB1" ; x>
                    <@sf.fldrow class="clonesection-loadDocB1">

                            <@sf.fileload path="form.loadDocB1[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.loadDocB5" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения – для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				<@sf.initAllClones formElement=form.loadDocB3 cloneSectionClass="clonesection-loadDocB3" ; x>
                    <@sf.fldrow class="clonesection-loadDocB3">

                            <@sf.fileload path="form.loadDocB3[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>


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

                    <@sf.fileload path="form.loadDocB8" fileExtensions="pdf,doc,jpg" style="text-align:left;" colspan="48" />

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Копия лицензии на осуществление медицинской деятельности:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.lic_med" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий уплату государственной пошлины за предоставление лицензии:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.el_cash" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий факт внесения сведений о юридическом лице в Единый государственный реестр юридических лиц:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.docegul" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
