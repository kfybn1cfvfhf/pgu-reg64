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
    <@html.head title='Предоставление лицензии на право ведения образовательной деятельности'>
        <@script.scripttag>
            <@jquery.onready>
                $('form').append("<style type='text/css'>.qq-upload-file, .qq-upload-size, .qq-upload-clear-text, .qq-upload-clear { display: inline !important; float:none; }</style>");
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc2' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc3' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc4' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label title="Заявление образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.load_doc0" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="47"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии учредительных документов образовательного учреждения, засвидетельствованные в нотариальном порядке:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
		        <@sf.initAllClones formElement=form.load_doc1 cloneSectionClass="clonesectionLoad_doc1" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc1">
		    
                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload path="form.load_doc1[${x}]" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>
		

				<#if form.isTenant=="on">
                    <@sf.fldrow>

                            <@sf.label title='Копия документа, подтверждающего проведение учредителем государственного или муниципального учреждения в соответствии с пунктом 4 статьи 13 Федерального закона "Об основных гарантиях прав ребенка в Российской Федерации" экспертной оценки последствий договора аренды для обеспечения образования, воспитания, развития, отдыха и оздоровления детей, оказания им медицинской, лечебно-профилактической помощи, социальной защиты и социального обслуживания детей (в случае аренды соискателем лицензии помещений для организации образовательного процесса в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей):' required=true style="text-align:left;" colspan="48"/>

                    </@sf.fldrow>
                    <@sf.fldrow>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload path="form.load_doc5" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.empty colspan="47"/>

                    </@sf.fldrow>
                </#if>

                <@sf.fldrow>
					
						<@sf.label title="Подписанная руководителем соискателя лицензии справка о материально-техническом обеспечении образовательной деятельности по заявленным для лицензирования образовательным программам:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                        <@sf.fileload path="form.load_doc6" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                        <@sf.empty colspan="47"/>

                </@sf.fldrow>

				<#if form.isBranch=="on">
                    <@sf.fldrow>

                            <@sf.label title="Копия положения о филиале (в случае, если соискатель лицензии обращается за разрешением на осуществление образовательной деятельности в филиале):" required=true style="text-align:left;" colspan="48"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.fileload path="form.load_doc7" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.empty colspan="47"/>

                    </@sf.fldrow>
                </#if>

                <#if form.isOrgWithEduUnit=="on">
                    <@sf.fldrow>

                            <@sf.label title="Копия положения о структурном подразделении (в случае, если в качестве соискателя лицензии выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки):" required=true style="text-align:left;" colspan="48"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.fileload path="form.load_doc8" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.empty colspan="47"/>

                    </@sf.fldrow>
                </#if>


		        <@sf.fldrow>
					
						<@sf.label title="Опись представленных документов:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.load_doc14" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="47"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="<html><h2>Документы, предоставляемые заявителем самостоятельно по собственной инициативе</h2></html>" required=false style="text-align:center;" colspan="50"/>

                </@sf.fldrow>

                    <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий уплату государственной пошлины:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.load_doc13" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

						<@sf.empty colspan="47"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Сведения, подтверждающие наличие у лицензиата в собственности или на ином законном основании оснащенных зданий, строений, сооружений, помещений и территорий, соответствующих установленным лицензионным нормативам обеспечения образовательной деятельности по заявленным для лицензирования образовательным программам, а также копии правоустанавливающих документов в случае, если право на указанные здания, строения, сооружения, помещения и территории и сделки с ними не подлежит государственной регистрации в соответствии с законодательством Российской Федерации:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

		        <@sf.initAllClones formElement=form.load_doc2 cloneSectionClass="clonesectionLoad_doc2" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc2">

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload path="form.load_doc2[${x}]" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>


                <@sf.fldrow>

						<@sf.label title="Заключение Министерства Российской Федерации по делам гражданской обороны, чрезвычайным ситуациям и ликвидации последствий стихийных бедствий о соответствии зданий, строений, сооружений, помещений и территорий, заявленных соискателем лицензии для осуществления образовательной деятельности, установленным законодательством Российской Федерации требованиям пожарной безопасности:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
		        <@sf.initAllClones formElement=form.load_doc3 cloneSectionClass="clonesectionLoad_doc3" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc3">

                            <@sf.fileload path="form.load_doc3[${x}]" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

						<@sf.label title="Заключение Федеральной службы по надзору в сфере защиты прав потребителей и благополучия человека и Федерального медико-биологического агентства о соответствии зданий, строений, сооружений, помещений и территорий, заявленных соискателем лицензии для осуществления образовательной деятельности, установленным законодательством Российской Федерации санитарно-эпидемиологическим требованиям:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
                <@sf.initAllClones formElement=form.load_doc4 cloneSectionClass="clonesectionLoad_doc4" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc4">

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload path="form.load_doc4[${x}]" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

                    <@sf.label title="Выписка из Единого государственного реестра юридических лиц:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
                <@sf.fldrow>

                    <@sf.fileload path="form.load_doc15" fileExtensions="pdf,doc,jpg" style="text-align:left;" colspan="1" />
                    <@sf.empty colspan="46" />

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
