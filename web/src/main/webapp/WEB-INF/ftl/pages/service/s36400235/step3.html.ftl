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
    <@html.head title='Предоставление гражданам компенсации за счет средств областного бюджета на возмещение части расходов по оплате процентов ипотечного займа (кредита) '>
        <@script.scripttag>
            <@jquery.onready>

                <@action.cloneFormRowWithArrays clonesectionclass='techInventDocLoadClass' hideButtonSections='true'/>
                <#if form.noEGRP=="on">
                    <@action.cloneFormRowWithArrays clonesectionclass='noEGRPDocLoadClass' hideButtonSections='true'/>
                </#if>
                <@action.cloneFormRowWithArrays clonesectionclass='regPeopleDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='dohodDocLoadClass' hideButtonSections='true'/>
                <#if form.noEGRP=="off">
                    <@action.cloneFormRowWithArrays clonesectionclass='EGRPDocLoadClass' hideButtonSections='true'/>
                </#if>

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
                        Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной
                        копии документа.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Множественная загрузка.
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.techInventDocLoad" title="Документы соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителей и членов их семьи, рожденных до 1 января 1998 года, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения, выданные не ранее, чем за 60 календарных дней до момента предъявления:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.techInventDocLoad cloneSectionClass="techInventDocLoadClass" ; x>
                    <@sf.fldrow class="techInventDocLoadClass">
                        <@sf.fileload path="form.techInventDocLoad[${x}]" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="techInventDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.motherCapDocLoad" title="Копия государственного сертификата на материнский (семейный) капитал, удостоверенную в нотариальном порядке:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.motherCapDocLoad" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <#if form.noEGRP=="on">
                    <@sf.fldrow>
                    <#-- По умолчанию скрыто.
    Логика:
    1. Отображается при активном #noEGRP
    2. Скрывается при деактивированном #noEGRP
    Множественная загрузка.
    Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.label path="form.noEGRPDocLoad" title="Копии документов, подтверждающие право собственности на жилое помещение (документ, подтверждающий право пользования жилым помещением, либо право собственности на жилое помещение):" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.noEGRPDocLoad cloneSectionClass="noEGRPDocLoadClass" ; x>
                        <@sf.fldrow class="noEGRPDocLoadClass">
                            <@sf.fileload path="form.noEGRPDocLoad[${x}]" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="noEGRPDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                        </@sf.fldrow>
                    </@sf.initAllClones>
                </#if>


                <@sf.fldrow>
                <#-- Множественная загрузка.
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.regPeopleDocLoad" title="Справка о зарегистрированных лицах и лицах, снятых с регистрационного учета, но сохранивших право пользования жилым помещением, выдаваемую соответствующей жилищно-эксплуатационной организацией, жилищным или жилищно-строительным кооперативом, иной уполномоченной организацией:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.regPeopleDocLoad cloneSectionClass="regPeopleDocLoadClass" ; x>
                    <@sf.fldrow class="regPeopleDocLoadClass">
                        <@sf.fileload path="form.regPeopleDocLoad[${x}]" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="regPeopleDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Множественная загрузка.
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.dohodDocLoad" title="Документы о размере и об источниках доходов:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.dohodDocLoad cloneSectionClass="dohodDocLoadClass" ; x>
                    <@sf.fldrow class="dohodDocLoadClass">
                        <@sf.fileload path="form.dohodDocLoad[${x}]" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="dohodDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>


                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по
                        собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.noSobstDocLoad" title="Документы соответствующего органа по государственной регистрации прав на недвижимое имущество и сделок с ним на территории Саратовской области об отсутствии (наличии) недвижимости у заявителей и членов их семьи, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения, в случае если данные изменения произошли после 6 июля 1997 года, выданные не ранее, чем за 60 календарных дней до момента предъявления:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.noSobstDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <#if form.noEGRP=="off">
                    <@sf.fldrow>
                    <#-- По умолчанию отображается.
    Логика:
    1. Скрывается при активном #noEGRP
    2. Отображается при деактивированном #noEGRP
    Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                        <@sf.label path="form.EGRPDocLoad" title="Копии документов, подтверждающих право собственности на жилое помещение (документ, подтверждающий право пользования жилым помещением, либо право собственности на жилое помещение), либо копию договора социального найма жилого помещения:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.EGRPDocLoad cloneSectionClass="EGRPDocLoadClass" ; x>
                        <@sf.fldrow class="EGRPDocLoadClass">
                            <@sf.fileload path="form.EGRPDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="EGRPDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                        </@sf.fldrow>
                    </@sf.initAllClones>
                </#if>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.uchetNujdaJPDocLoad" title="Документ о постановке гражданина на учет нуждающимся в улушении жилищных условий путем предоставления социаьной выплаты на приобретение (строительство) жилого помещения, выданный соответствующим уполномоченным органом для категорий граждан, определенных Законом Саратовской области «Об ипотечном жилищном кредитовании» (кроме граждан или членов их семей, получивших в соответствии с Федеральным законом от 29 декабря 2006 года N 256-ФЗ «О дополнительных мерах государственной поддержки семей, имеющих детей» государственный сертификат на материнский (семейный) капитал):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.uchetNujdaJPDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS"qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
