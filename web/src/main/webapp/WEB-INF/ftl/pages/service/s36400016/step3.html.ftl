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
    <@html.head title='Предоставление лицензии на ведение деятельности, связанной с оборотом наркотических средств и психотропных веществ'>
        <@script.scripttag>
            <@jquery.onready>
              $('form').append("<style type='text/css'>.qq-upload-file, .qq-upload-size, .qq-upload-clear-text, .qq-upload-clear { display: inline !important; float:none; }</style>");
                <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoad_doc2" hideButtonSections="true"/>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoad_doc5" hideButtonSections="true"/>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoad_doc6" hideButtonSections="true"/>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoad_doc7" hideButtonSections="true"/>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoad_doc8" hideButtonSections="true"/>
				<@action.cloneFormRowWithArrays clonesectionclass="clonesection-load_doc12" hideButtonSections="true"/>
                <@action.cloneFormRowWithArrays clonesectionclass="clonesection-load_doc22" hideButtonSections="true"/>
                <@action.cloneFormRowWithArrays clonesectionclass="clonesection-load_doc21" hideButtonSections="true"/>
                <@action.cloneFormRowWithArrays clonesectionclass="clonesection-load_doc19" hideButtonSections="true"/>
                <@customActions.setVisibleCloneDocLoadClassByCheckbox onload=true checkboxId='check_egrp' checkboxStatus='true' CloneDocLoadClass='clonesectionLoad_doc5'/>
                <@customActions.setVisibleCloneDocLoadClassByCheckbox onload=true checkboxId='check_egrp' checkboxStatus='true' CloneDocLoadClass='clonesection-load_doc19'/>
                <@action.setVisibleByValue 'true' 'check_egrp' 'change' 'load_doc5-label' '1'/>
                <@action.setVisibleByValue 'true' 'check_egrp' 'change' 'load_doc19-label' '1'/>
             </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >

                <@sf.fldrow>
                    <@sf.checkbox path="form.check_egrp" qtip=""  style="text-align:right;" colspan="1" />
                    <@sf.label path="form.check_egrp" title="У заявителя имеются здания,строения, сооружения, необходимые для осуществления медицинской деятельности, подлежащие регистрации в Едином государственном реестре прав (ЕГРП)" required=false style="text-align:left;" colspan="37"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- сделать синим-->
                        <@sf.statictext style="text-align:left;" colspan="48" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии учредительных документов юридического лица, засвидетельствованные в нотариальном порядке:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				<@sf.initAllClones formElement=form.load_doc2 cloneSectionClass="clonesectionLoad_doc2" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc2">

                            <@sf.fileload path="form.load_doc2[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
				</@sf.initAllClones>

                <@sf.fldrow>
					
						<@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.load_doc13" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.load_doc5" title="Копии документов, подтверждающих право собственности или иное законное основание использования помещений и оборудования для осуществления деятельности, связанной с оборотом наркотических средств и психотропных веществ:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				<@sf.initAllClones formElement=form.load_doc5 cloneSectionClass="clonesectionLoad_doc5" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc5">

                            <@sf.fileload path="form.load_doc5[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<@sf.label title="Копия сертификата специалиста, подтверждающего соответствующую профессиональную подготовку руководителя юридического лица или руководителя соответствующего подразделения юридического лица:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				<@sf.initAllClones formElement=form.load_doc6 cloneSectionClass="clonesectionLoad_doc6" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc6">

                            <@sf.fileload path="form.load_doc6[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии документов об образовании лиц, осуществляющих деятельность, связанную с оборотом наркотических средств и психотропных веществ, а также о квалификации фармацевтических и медицинских работников:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				<@sf.initAllClones formElement=form.load_doc7 cloneSectionClass="clonesectionLoad_doc7" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc7">

                            <@sf.fileload path="form.load_doc7[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<@sf.label title="Копии справок, выданных государственными или муниципальными учреждениями здравоохранения в установленном законодательством Российской Федерации порядке, об отсутствии у работников, которые в соответствии со своими служебными обязанностями должны иметь доступ к наркотическим средствам или психотропным веществам либо культивируемым наркосодержащим растениям, заболеваний наркоманией, токсикоманией, хроническим алкоголизмом:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				<@sf.initAllClones formElement=form.load_doc8 cloneSectionClass="clonesectionLoad_doc8" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc8">

                            <@sf.fileload path="form.load_doc8[${x}]" fileExtensions="pdf,doc,jpg" validation="required" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                            <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

						<@sf.label title="Заключение компетентных экспертных организаций (экспертов), которые по инициативе соискателя провели независимую проверку возможности выполнения соискателем лицензионных требований и условий:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
                <@sf.initAllClones formElement=form.load_doc12 cloneSectionClass="clonesection-load_doc12" ; x>
                    <@sf.fldrow class="clonesection-load_doc12">

                            <@sf.fileload path="form.load_doc12[${x}]" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle=" Добавить" delTitle="Удалить" colspan="1" />

                            <@sf.empty colspan="46" />

                    </@sf.fldrow>
                   </@sf.initAllClones>

                   <@sf.fldrow>
						<#-- сделать синим-->
                        <@sf.statictext style="text-align:left;" colspan="48" class="field-qtip"><i>Документы, подаваемые по инициативе заявителя</i></@sf.statictext>
                </@sf.fldrow>

                 <@sf.fldrow>

						<@sf.label title="Уведомление о постановке на учет с указанием кода по Общероссийскому классификатору предприятий и организаций (ОКПО):" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.load_doc16" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Технический паспорт здания или помещения, используемого для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.load_doc17" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                  <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий факт внесения сведений о юридическом лице в Единый государственный реестр юридических лиц:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.load_doc18" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Документ, подтверждающий уплату государственной пошлины за предоставление лицензии:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.load_doc10" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label path="form.load_doc19" title="Копии документов, подтверждающих право собственности или иное законное основание использования помещений и оборудования для осуществления деятельности, связанной с оборотом наркотических средств и психотропных веществ:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc19 cloneSectionClass="clonesection-load_doc19" ; x>
                    <@sf.fldrow class="clonesection-load_doc19">

                            <@sf.fileload path="form.load_doc19[${x}]" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle=" Добавить" delTitle="Удалить" colspan="1" />

                            <@sf.empty colspan="46" />

                    </@sf.fldrow>
                   </@sf.initAllClones>

                 <@sf.fldrow>

						<@sf.label title="Копия документа, подтверждающего факт внесения сведений о юридическом лице в Единый государственный реестр юридических лиц:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.fileload path="form.load_doc20" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                 <@sf.fldrow>

						<@sf.label title="Копия заключения органов по контролю за оборотом наркотических средств и психотропных веществ об отсутствии у работников, которые в соответствии со своими служебными обязанностями должны иметь доступ к наркотическим средствам или психотропным веществам либо культивируемым наркосодержащим растениям, непогашенной или неснятой судимости за преступление средней тяжести, тяжкое, особо тяжкое преступление или преступление, связанное с незаконным оборотом наркотических средств, психотропных веществ, их прекурсоров либо с незаконным культивированием наркосодержащих растений, в том числе за преступление, совершенное за пределами Российской Федерации:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc21 cloneSectionClass="clonesection-load_doc21" ; x>
                    <@sf.fldrow class="clonesection-load_doc21">

                            <@sf.fileload path="form.load_doc21[${x}]" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle=" Добавить" delTitle="Удалить" colspan="1" />

                            <@sf.empty colspan="46" />

                    </@sf.fldrow>
                   </@sf.initAllClones>

                  <@sf.fldrow>

						<@sf.label title="Копия заключения органов по контролю за оборотом наркотических средств и психотропных веществ о соответствии объектов и помещений, в которых осуществляются деятельность, связанная с оборотом наркотических средств и психотропных веществ, и (или) культивирование наркосодержащих растений, установленным требованиям к оснащению этих объектов и помещений инженерно-техническими средствами охраны:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc22 cloneSectionClass="clonesection-load_doc22" ; x>
                    <@sf.fldrow class="clonesection-load_doc22">

                            <@sf.fileload path="form.load_doc22[${x}]" fileExtensions="pdf,doc,jpg" qtip="" style="text-align:left;" colspan="1"/>

                            <@sf.addRemoveButton addTitle=" Добавить" delTitle="Удалить" colspan="1" />

                            <@sf.empty colspan="46" />

                    </@sf.fldrow>
                   </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
