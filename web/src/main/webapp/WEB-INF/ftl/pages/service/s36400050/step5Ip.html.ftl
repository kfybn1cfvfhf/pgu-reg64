<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<#import "/custom/elements.ftl" as customElements>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление фармацевтической деятельности для ИП'>
        <@script.scripttag>
            <@jquery.onready>
                <@validators.addCustomValidators/>

                <#if form['lic_reason'] == '5'>
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
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionloaddoc65" hideButtonSections="true" />
                     <@action.cloneFormRowWithArrays clonesectionclass="clonesectionsanCopyLoad" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionstaffEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionstaffAdditionalEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-managerEducationDocs" hideButtonSections="true" />
                </#if>

                <#if form['lic_reason'] == '1'>
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectioncopyLicPravo" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionloaddoc65" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionsanCopyLoad" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionstaffEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionstaffAdditionalEducationDocs" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-managerEducationDocs" hideButtonSections="true" />
                </#if>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <#if form['lic_reason'] == '1'>
                <@sf.serviceStepForm withFileUpload=true>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext class="field-qtip" style="text-align:left;" colspan="46"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg"  path="form.taxPayLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест осуществления лицензируемой деятельности, с указанием  выполняемых работ (услуг):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" validation="required" path="form.loaddoc61" qtip="Вносится файл приложения к заявлению с перечислением мест осуществления деятельности с указанием лицензируемых видов работ и услуг" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>



                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.copyLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

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

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов о высшем или среднем фармацевтическом образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения (за исключением обособленных подразделений медицинских организаций):" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffEducationDocs cloneSectionClass="clonesectionstaffEducationDocs" ; x>
                        <@sf.fldrow class="clonesectionstaffEducationDocs">

                            <@sf.empty colspan="1"/>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation = "required" path="form.staffEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения в обособленных подразделениях медицинских организаций:" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffAdditionalEducationDocs cloneSectionClass="clonesectionstaffAdditionalEducationDocs" ; x>
                        <@sf.fldrow class="clonesectionstaffAdditionalEducationDocs">

                            <@sf.empty colspan="1"/>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation = "required" path="form.staffAdditionalEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов о высшем или среднем фармацевтическом либо высшем или среднем ветеринарном образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для ветеринарного применения:" required=false style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.managerEducationDocs cloneSectionClass="clonesection-managerEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-managerEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.managerEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc65 cloneSectionClass="clonesectionloaddoc65" ; x>
                        <@sf.fldrow class="clonesectionloaddoc65">

                            <@sf.empty colspan="1"/>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc65[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.sanCopyLoad cloneSectionClass="clonesectionsanCopyLoad" ; x>
                        <@sf.fldrow class="clonesectionsanCopyLoad">

                            <@sf.empty colspan="1"/>

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.sanCopyLoad[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                        <@sf.empty colspan="1"/>

                        <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.medActLicenseCopy" qtip="" style="text-align:left;" colspan="46"/>

                        <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['lic_reason'] == '2' || form['lic_reason'] == '3' || form['lic_reason'] == '4'>
                <@sf.serviceStepForm withFileUpload=true >


                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext class="field-qtip" style="text-align:left;" colspan="46"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.taxPayLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.copyLicLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.medActLicenseCopy" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['lic_reason'] == '5'>
                <@sf.serviceStepForm withFileUpload=true >
                                    <@sf.fldrow>

                 <@sf.empty colspan="1"/>

                    <@sf.checkbox path="form.check_egrp" label="У заявителя имеются здания,строения, сооружения, необходимые для осуществления медицинской деятельности, подлежащие регистрации в Едином государственном реестре прав (ЕГРП)" qtip=""  style="text-align:center;" colspan="45"  />
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext class="field-qtip" style="text-align:left;" colspan="46"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>


                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест, по которым изменяются виды работ (услуг), с указанием изменяемых выполняемых видов работ (услуг):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc81" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест, где изменяются виды работ (услуг)" validation="required" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>


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

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>
				</@sf.initAllClones>

                    <#-- add -->
                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.sanCopyLoad cloneSectionClass="clonesectionsanCopyLoad" ; x>
                        <@sf.fldrow class="clonesectionsanCopyLoad">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.sanCopyLoad[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения (за исключением обособленных подразделений медицинских организаций):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                       <@sf.initAllClones formElement=form.staffEducationDocs cloneSectionClass="clonesectionstaffEducationDocs" ; x>
                        <@sf.fldrow class="clonesectionstaffEducationDocs">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation = "required" path="form.staffEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения в обособленных подразделениях медицинских организаций:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffAdditionalEducationDocs cloneSectionClass="clonesectionstaffAdditionalEducationDocs" ; x>
                        <@sf.fldrow class="clonesectionstaffAdditionalEducationDocs">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" validation = "required" path="form.staffAdditionalEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом либо высшем или среднем ветеринарном образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для ветеринарного применения:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.managerEducationDocs cloneSectionClass="clonesection-managerEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-managerEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.managerEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc65 cloneSectionClass="clonesectionloaddoc65" ; x>
                    <@sf.fldrow class="clonesectionloaddoc65">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc65[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.taxPayLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.copyLicLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.medActLicenseCopy" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['lic_reason'] == '6'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext class="field-qtip" style="text-align:left;" colspan="46"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест осуществления лицензируемой деятельности, с указанием прекращаемых выполняемых работ (услуг):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc91" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест  лицензируемой  деятельности, на которых прекращается осуществление деятельности, с указанием лицензируемых видов работ и услуг" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.taxPayLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.copyLicLoad"  qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['lic_reason'] == '7'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext class="field-qtip" style="text-align:left;" colspan="46" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест, по которым прекращена лицензируемая деятельность, с указанием  даты, с которой фактически она прекращена:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc71" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест, по которым будет прекращена отдельная лицензируемая деятельность, с указанием фактических дат прекращения деятельности" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.taxPayLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.copyLicLoad" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
