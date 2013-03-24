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
    <@html.head title='Прием документов органами опеки и попечительства от лиц, желающих принять детей'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='writtenConsentDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='sanNormsMvDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='techNormsMvDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='certPensMvDocLoadClass' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных
                        копий документов.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.emplDocLoad" title="Справка с места работы с указанием должности и размера средней заработной платы за последние 12 месяцев, а для граждан, не состоящих в трудовых отношениях, - иной документ, подтверждающий доходы:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.emplDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Для пенсионеров - копии пенсионного удостоверения, справки из территориального органа Пенсионного фонда Российской Федерации или иного органа, осуществляющего пенсионное обеспечение" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.rightHousingExplDocLoad" title="Документ, подтверждающий право пользования жилым помещением либо право собственности на жилое помещение, в случае, если он выдается жилищно-эксплуатационной организацией государственной или муниципальной формой собственности, управляющей компанией или иной организацией частной формы собственности, осуществляющей управление эксплуатацией жилых помещений:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.rightHousingExplDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.rightHousingNonEgrpDocLoad" title="Документ, подтверждающий право собственности на жилое помещение, если данные о праве на объект недвижимого имущества не внесены в ЕГРП:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.rightHousingNonEgrpDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.medicalReportDocLoad" title="Медицинское заключение о состоянии здоровья по результатам освидетельствования гражданина, выразившего желание стать опекуном, выданное в порядке, устанавливаемом Министерством здравоохранения Российской Федерации:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.medicalReportDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.certMarriageDocLoad" title="Копия свидетельства о браке:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow><@sf.fldrow>
                    <@sf.fileload path="form.certMarriageDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Прикладывается заявителем в случае, если заявитель состоит в браке" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
                    <@sf.label path="form.writtenConsentDocLoad" title="Письменное согласие совершеннолетних членов семьи с учетом мнения детей, достигших 10-летнего возраста, проживающих совместно с гражданином, выразившим желание стать опекуном, на прием ребенка (детей) в семью:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
                    <#--<@sf.fileload path="form.writtenConsentDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>-->
                    <@sf.initAllClones formElement=form.writtenConsentDocLoad cloneSectionClass="writtenConsentDocLoadClass" ; x>
                        <@sf.fldrow class="writtenConsentDocLoadClass">
                            <@sf.fileload path="form.writtenConsentDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="writtenConsentDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                        </@sf.fldrow>
                    </@sf.initAllClones>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.trainingDocLoad" title="Копия свидетельства или иного документа о прохождении подготовки лица, желающего усыновить ребенка, в порядке, установленном пунктом 4 статьи 127 Семейного кодекса Российской Федерации:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.trainingDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Кроме близких родственников детей, а также лиц, которые являются или являлись опекунами (попечителями) детей и которые не были отстранены от исполнения возложенных на них обязанностей" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.autobiographyDocLoad" title="Автобиография:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.autobiographyDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по
                        собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.certCznMvDocLoad" title="Справка из Центра занятости населения, органа социальной защиты населения о получении (неполучении) пособий и компенсационных выплат:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.certCznMvDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.rightHousingOmsuMvDocLoad" title="Документ, подтверждающий право пользования жилым помещением либо право собственности на жилое помещение, в случае, если он выдается органами местного самоуправления:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.rightHousingOmsuMvDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.rightHousingEgrpMvDocLoad" title="Свидетельство о государственной регистрации права собственности на жилое помещение:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.rightHousingEgrpMvDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.certMvdMvDocLoad" title="Справка органов внутренних дел, подтверждающая отсутствие у гражданина, выразившего желание стать опекуном, судимости за умышленное преступление против жизни и здоровья граждан:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.certMvdMvDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.sanNormsMvDocLoad" title="Справки о соответствии жилых помещений санитарным правилам и нормам, выданные соответствующими уполномоченными органами:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <#--<@sf.fileload path="form.sanNormsMvDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>-->
                    <@sf.initAllClones formElement=form.sanNormsMvDocLoad cloneSectionClass="sanNormsMvDocLoadClass" ; x>
                        <@sf.fldrow class="sanNormsMvDocLoadClass">
                            <@sf.fileload path="form.sanNormsMvDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="sanNormsMvDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                        </@sf.fldrow>
                    </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
        Множественная загрузка-->
                    <@sf.label path="form.techNormsMvDocLoad" title="Справки о соответствии жилых помещений техническим правилам и нормам, выданные соответствующими уполномоченными органами " required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

            <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
        Множественная загрузка-->
                <@sf.initAllClones formElement=form.techNormsMvDocLoad cloneSectionClass="techNormsMvDocLoadClass" ; x>
                    <@sf.fldrow class="techNormsMvDocLoadClass">
                        <@sf.fileload path="form.techNormsMvDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="techNormsMvDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
                    <@sf.label path="form.certPensMvDocLoad" title="Справка из территориальных органов Пенсионного фонда Российской Федерации, либо иных органов, осуществляющих пенсионное обеспечение в соответствии с компетенцией:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
                    <#--<@sf.fileload path="form.certPensMvDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>-->
                    <@sf.initAllClones formElement=form.certPensMvDocLoad cloneSectionClass="certPensMvDocLoadClass" ; x>
                        <@sf.fldrow class="certPensMvDocLoadClass">
                            <@sf.fileload path="form.certPensMvDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="certPensMvDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                        </@sf.fldrow>
                    </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
