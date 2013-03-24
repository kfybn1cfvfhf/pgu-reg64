<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/elements.ftl" as customElements>
<#import "/custom/actions.ftl" as customActions>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Получение лицензии на фармацевтическую деятельность индивидуальными предпринимателями'>
        <@script.scripttag>
            <@jquery.onready>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocF1" hideButtonSections="true" />
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-loadDocH1" hideButtonSections="true" />
                <@action.cloneFormRowWithArrays clonesectionclass="clonesection-el_prof" hideButtonSections="true" />
                <@customActions.setVisibleCloneDocLoadClassByCheckbox onload=true checkboxId='check_egrp' checkboxStatus='true' CloneDocLoadClass='clonesection-el_prof'/>
                <@action.setVisibleByValue 'true' 'check_egrp' 'change' 'el_prof-label' '1'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >

                <@sf.fldrow>

                           <@sf.empty colspan="1"/>

                               <@sf.checkbox path="form.check_egrp" label="У заявителя имеются здания,строения, сооружения, необходимые для осуществления медицинской деятельности, подлежащие регистрации в Едином государственном реестре прав (ЕГРП)" qtip=""  style="text-align:center;" colspan="45"  />
                               <@sf.empty colspan="5"/>
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.statictext class="field-qtip" style="text-align:left;" colspan="48"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>
					
                </@sf.fldrow>





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

                 <@sf.fldrow>

			    <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.loadsan" fileExtensions="pdf,doc,jpg"  qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                 <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий уплату государственной пошлины за предоставление лицензии:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.el_cash" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label path="form.el_prof" title="Копии документов, подтверждающих право собственности или иное законное основание использование помещений для осуществления лицензируемой деятельности:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
                <@sf.initAllClones formElement=form.el_prof cloneSectionClass="clonesection-el_prof" ; x>
                    <@sf.fldrow class="clonesection-el_prof">

                            <@sf.fileload path="form.el_prof[${x}]" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:unknown;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                 <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий факт внесения сведений об индивидуальном предпринимателе в Единый  государственный реестр индивидуальных предпринимателей:" required=false style="text-align:left;" colspan="46"/>

                </@sf.fldrow>

                 <@sf.fldrow>

						<@sf.fileload path="form.docegip" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="46"/>

                </@sf.fldrow>

                <@sf.fldrow>


						<#-- ВАЛИДАТОР ИНН ИП-->
                        <@sf.label title="Копия свидетельства о постановке на учет в налоговом органе физического лица по месту жительства на территории Российской Федерации:" required=false style="text-align:left;" colspan="40"/>

						  </@sf.fldrow>

                <@sf.fldrow>

						<#-- ВАЛИДАТОР ИНН ИП-->
                        <@sf.fileload fileExtensions="pdf,doc,jpg"  path="form.inn" qtip="" style="text-align:left;" colspan="25"/>



                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
