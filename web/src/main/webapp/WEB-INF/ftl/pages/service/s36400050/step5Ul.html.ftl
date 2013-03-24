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
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление лицензируемой деятельности для ЮЛ'>
        <@script.scripttag>
            <@jquery.onready>

                <#if form['change_reason'] == '4'>
                if($('#check_egrp').attr('checked')==false) {
                   $('#copyLicPravo-label').addClass("fieldRequired");
                   $('input[id^=copyLicPravo][type=text]').addClass('required');
            } else {
                   $('#copyLicPravo-label').removeClass("fieldRequired");
                   $('input[id^=copyLicPravo][type=text]').removeClass('required');
                   }
                $('#check_egrp').change(function() {
                if($('#check_egrp').attr('checked')==false) {
                   $('#copyLicPravo-label').addClass("fieldRequired");
                   $('input[id^=copyLicPravo][type=text]').addClass('required');
            } else {
                   $('#copyLicPravo-label').removeClass("fieldRequired");
                   $('input[id^=copyLicPravo][type=text]').removeClass('required');
                   }
            });
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectioncopyLicPravo" hideButtonSections="true" />
                  	<@action.cloneFormRowWithArrays clonesectionclass="clonesection-sanCopyLoad" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc65" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-managerEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-staffEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-staffAdditionalEducationDocs" hideButtonSections="true" />
                </#if>

                <#if form['change_reason'] == '6'>
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-sanCopyLoad" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectioncopyLicPravo" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc65" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-staffAdditionalEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-managerEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-staffEducationDocs" hideButtonSections="true" />
                </#if>


            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>

            <#-- шаг 4 -->
            <#if form['change_reason'] == '1' || form['change_reason'] == '2' || form['change_reason'] == '3' || form['change_reason'] == '5'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext style="text-align:left;" colspan="46" class="field-qtip" ><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.dovLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.label title="Электронная копия действующей лицензии юридического лица (в случае реорганизации в форме слияния  - копии лицензий каждого участвующего в слиянии юридического лица):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.taxPayLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.medActLicenseCopy" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#-- шаг 5 -->
            <#if form['change_reason'] == '4'>
                <@sf.serviceStepForm withFileUpload=true >

                <@sf.fldrow>

                 <@sf.empty colspan="1"/>

                    <@sf.checkbox path="form.check_egrp" label="У заявителя имеются здания, строения, сооружения, необходимые для осуществления медицинской деятельности, подлежащие регистрации в Едином государственном реестре прав (ЕГРП)" qtip=""  style="text-align:center;" colspan="45"  />
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext style="text-align:left;" colspan="46" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>



                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                        <@sf.label path="form.copyLicPravo" title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской деятельности:" required=false style="text-align:left;" colspan="34"/>

						<@sf.empty colspan="13"/>

                </@sf.fldrow>
				<@sf.initAllClones formElement=form.copyLicPravo cloneSectionClass="clonesectioncopyLicPravo" ; x>
                    <@sf.fldrow class="clonesectioncopyLicPravo">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload path="form.copyLicPravo[${x}]" fileExtensions="pdf,doc,xls,xlsx,jpg"  qtip="" style="text-align:left;" colspan="26"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="13"/>

                    </@sf.fldrow>
				</@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест осуществления лицензируемой деятельности, с указанием  выполняемых работ (услуг) (не указанных в лицензии):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.loaddoc61" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест осуществления деятельности с указанием лицензируемых видов работ и услуг" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.dovLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.taxPayLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.sanCopyLoad cloneSectionClass="clonesection-sanCopyLoad" ; x>
                        <@sf.fldrow class="clonesection-sanCopyLoad">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg"  path="form.sanCopyLoad[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc65 cloneSectionClass="clonesectionLoaddoc65" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc65">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg"  validation="required" path="form.loaddoc65[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом либо высшем или среднем ветеринарном образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для ветеринарного применения:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.managerEducationDocs cloneSectionClass="clonesection-managerEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-managerEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation="required" path="form.managerEducationDocs[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения (за исключением обособленных подразделений медицинских организаций):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffEducationDocs cloneSectionClass="clonesection-staffEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-staffEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation="required" path="form.staffEducationDocs[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения в обособленных подразделениях медицинских организаций:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffAdditionalEducationDocs cloneSectionClass="clonesection-staffAdditionalEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-staffAdditionalEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation="required" path="form.staffAdditionalEducationDocs[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.copyLicLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.medActLicenseCopy" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['change_reason'] == '8'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext style="text-align:left;" colspan="46" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест, по которым есть намерение прекратить лицензируемую деятельность, с указанием даты, с которой фактически она прекращена:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.loaddoc71" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест, по которым прекращается лицензируемая деятельность  с указанием фактических дат" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.dovLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.taxPayLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.copyLicLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>


                </@sf.serviceStepForm>
            </#if>

            <#-- шаг 7 -->
            <#if form['change_reason'] == '6'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext style="text-align:left;" colspan="46" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест, по которым изменяются виды работ (услуг), с указанием изменяемых выполняемых видов работ (услуг):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.loaddoc81" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест, где изменяются виды работ и услуг" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg" path="form.dovLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.copyLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>


                    <#--п.11 постановки на корректировку-->

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.sanCopyLoad cloneSectionClass="clonesection-sanCopyLoad" ; x>
                        <@sf.fldrow class="clonesection-sanCopyLoad">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg"  path="form.sanCopyLoad[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                    <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                        <@sf.label path="form.copyLicPravo" title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления медицинской деятельности:" required=false style="text-align:left;" colspan="34"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>
                    <@sf.initAllClones formElement=form.copyLicPravo cloneSectionClass="clonesectioncopyLicPravo" ; x>
                        <@sf.fldrow class="clonesectioncopyLicPravo">

                            <@sf.empty colspan="1"/>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload path="form.copyLicPravo[${x}]" fileExtensions="pdf,doc,xls,xlsx,jpg"  qtip="" style="text-align:left;" colspan="26"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="13"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                    <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                        <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc65 cloneSectionClass="clonesectionLoaddoc65" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc65">

                            <@sf.empty colspan="1"/>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,docx,jpg"  validation="required" path="form.loaddoc65[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения в обособленных подразделениях медицинских организаций:" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffAdditionalEducationDocs cloneSectionClass="clonesection-staffAdditionalEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-staffAdditionalEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation="required" path="form.staffAdditionalEducationDocs[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов о высшем или среднем фармацевтическом либо высшем или среднем ветеринарном образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для ветеринарного применения:" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.managerEducationDocs cloneSectionClass="clonesection-managerEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-managerEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation="required" path="form.managerEducationDocs[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов о высшем или среднем фармацевтическом образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения (за исключением обособленных подразделений медицинских организаций):" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffEducationDocs cloneSectionClass="clonesection-staffEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-staffEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation="required" path="form.staffEducationDocs[${x}]" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                </@sf.serviceStepForm>
            </#if>

            <#if form['change_reason'] == '7'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext style="text-align:left;" colspan="46" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест, по которым изменяются виды работ (услуг), с указанием прекращаемых выполняемых видов работ и услуг:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc91" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест, где изменяются виды работ и услуг c целью прекращения" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.dovLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.taxPayLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.copyLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
