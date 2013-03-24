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

                <#if form['lic_reason'] == '1'>
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc54" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc55" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc101" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc102" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc103" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-staffEducationDocs" hideButtonSections="true" />
                </#if>

                <#if form['lic_reason'] == '5'>
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc82" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc83" hideButtonSections="true" />                    
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc101" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc102" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesectionLoaddoc103" hideButtonSections="true" />
                    <@action.cloneFormRowWithArrays clonesectionclass="clonesection-staffEducationDocs" hideButtonSections="true" />
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
                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" validation="required" path="form.loaddoc52" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Адреса мест осуществления лицензируемой деятельности, с указанием  выполняемых работ (услуг):" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" validation="required" path="form.loaddoc53" qtip="Вносится файл приложения к заявлению с перечислением мест осуществления деятельности с указанием лицензируемых видов работ и услуг" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc54 cloneSectionClass="clonesectionLoaddoc54" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc54">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc54[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <#-- add -->
                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc101 cloneSectionClass="clonesectionLoaddoc101" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc101">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc101[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения (за исключением обособленных подразделений медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc102 cloneSectionClass="clonesectionLoaddoc102" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc102">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc102[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>


                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения в обособленных подразделениях медицинских организаций:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc103 cloneSectionClass="clonesectionLoaddoc103" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc103">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc103[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом либо высшем или среднем ветеринарном образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для ветеринарного применения:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffEducationDocs cloneSectionClass="clonesection-staffEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-staffEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.staffEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc55 cloneSectionClass="clonesectionLoaddoc55" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc55">

                                <@sf.empty colspan="1"/>

                                <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                                <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc55[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                                <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc58" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Опись прилагаемых документов:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc59" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc105" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['lic_reason'] == '2' || form['lic_reason'] == '3' || form['lic_reason'] == '4'>
                <@sf.serviceStepForm withFileUpload=true >

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.statictext style="text-align:left;" colspan="46"><h2>Данные документа, подтверждающего факт внесения изменений в сведения об индивидуальном предпринимателе в Единый государственный реестр индивидуальных предпринимателей</h2></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Серия и номер документа:" required=true style="text-align:left;" colspan="10"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textfield  path="form.egrip_new" qtip="Вносится в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>

                            <@sf.empty colspan="11"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Дата выдачи:" required=true style="text-align:left;" colspan="10"/>

                            <@sf.empty colspan="1"/>

                            <@sf.datefield path="form.egrip_date"  qtip="" validation="required" style="text-align:left;" colspan="25"/>

                            <@sf.empty colspan="11"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Наименование органа, выдавшего документ:" required=true style="text-align:left;" colspan="10"/>

                            <@sf.empty colspan="1"/>

                            <@sf.textarea path="form.egrip_org" qtip="" validation="required" style="text-align:left;" colspan="35"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- выделить синим-->
                            <@sf.statictext class="field-qtip" style="text-align:left;" colspan="46"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc62" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc68" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Опись прилагаемых документов:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc69" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc105" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>

            <#if form['lic_reason'] == '5'>
                <@sf.serviceStepForm withFileUpload=true >

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

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc96" validation="required" qtip="Вносится файл приложения к заявлению с перечислением мест, где изменяются виды работ (услуг)" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>


                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании зданий, помещений, необходимых для осуществления лицензируемой деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc82 cloneSectionClass="clonesectionLoaddoc82" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc82">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc82[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <#-- add -->
                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия санитарно-эпидемиологического заключения о соответствии санитарным правилам помещений для осуществления лицензируемого вида деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc101 cloneSectionClass="clonesectionLoaddoc101" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc101">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc101[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения (за исключением обособленных подразделений медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc102 cloneSectionClass="clonesectionLoaddoc102" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc102">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc102[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о дополнительном профессиональном образовании в части розничной торговли лекарственными препаратами для медицинского применения - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для медицинского применения в обособленных подразделениях медицинских организаций:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc103 cloneSectionClass="clonesectionLoaddoc103" ; x>
                        <@sf.fldrow class="clonesectionLoaddoc103">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc103[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов о высшем или среднем фармацевтическом либо высшем или среднем ветеринарном образовании и сертификата специалиста - для осуществления фармацевтической деятельности в сфере обращения лекарственных средств для ветеринарного применения:" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.staffEducationDocs cloneSectionClass="clonesection-staffEducationDocs" ; x>
                        <@sf.fldrow class="clonesection-staffEducationDocs">

                            <@sf.empty colspan="1"/>

                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.staffEducationDocs[${x}]"  qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                        </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копии документов, подтверждающих наличие у соискателя лицензии на праве собственности или ином законном основании оборудования и другого материально-технического оснащения, необходимых для осуществления лицензируемого вида деятельности:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.loaddoc83 cloneSectionClass="clonesectionLoaddoc83" ; x>
                    <@sf.fldrow class="clonesectionLoaddoc83">

                            <@sf.empty colspan="1"/>

                            <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                            <@sf.fileload  fileExtensions="pdf,doc,jpg" path="form.loaddoc83[${x}]" validation="required" qtip="" style="text-align:left;" colspan="38"/>

                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="8"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>
                    </@sf.initAllClones>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc86" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Опись прилагаемых документов:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc87" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc88" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc105" qtip="" style="text-align:left;" colspan="46"/>

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

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc93" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc94" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Опись прилагаемых документов:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc95" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc105" qtip="" style="text-align:left;" colspan="46"/>

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

                            <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc73" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Опись прилагаемых документов:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc74" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Электронная копия действующей лицензии:" required=true style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc75" validation="required" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.label title="Копия лицензии на осуществление медицинской деятельности (для медицинских организаций):" required=false style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                    <@sf.fldrow>

                            <@sf.empty colspan="1"/>

                            <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.loaddoc105" qtip="" style="text-align:left;" colspan="46"/>

                            <@sf.empty colspan="1"/>

                    </@sf.fldrow>

                </@sf.serviceStepForm>
            </#if>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
