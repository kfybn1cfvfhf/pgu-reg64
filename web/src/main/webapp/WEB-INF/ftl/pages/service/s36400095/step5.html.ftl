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
    <@html.head title='Получение разрешения на установку рекламной конструкции'>
        <@script.scripttag>

            <@jquery.onready>
                <#if form.vladRekl == "on">
                    <@action.cloneFormRowWithArrays clonesectionclass='dogReklDocLoadClass' hideButtonSections='true'/>
                </#if>

                <#if form.sobSobst == "on">
                    <@action.cloneFormRowWithArrays clonesectionclass='sobSobstDocLoadClass' hideButtonSections='true'/>
                </#if>

                <#if form.vladRekl == "on">
                    <@action.cloneFormRowWithArrays clonesectionclass='soglSobstDocLoadClass' hideButtonSections='true'/>
                </#if>

                <@action.cloneFormRowWithArrays clonesectionclass='egrpDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='eskizReklDocLoadClass' hideButtonSections='true'/>

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

                <#if form.vladRekl == "on">
                    <@sf.fldrow>
                        <@sf.statictext attr="id='dogReklDocLoad-title'" required=true style="text-align:left;" colspan="48">Договор на установку и эксплуатацию рекламной конструкции:</@sf.statictext>
                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.dogReklDocLoad cloneSectionClass='dogReklDocLoadClass' ; a>
                        <@sf.fldrow class="dogReklDocLoadClass">
                            <@sf.fileload path="form.dogReklDocLoad[${a}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="dogReklDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                        </@sf.fldrow>
                    </@sf.initAllClones>
                </#if>

                <#if form.sobSobst == "on">
                    <@sf.fldrow>
                        <@sf.statictext attr="id='sobSobstDocLoad-title'" required=true style="text-align:left;" colspan="48">Протокол общего собрания собственников помещений в многоквартирном доме:</@sf.statictext>
                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.sobSobstDocLoad cloneSectionClass='sobSobstDocLoadClass' ; b>
                        <@sf.fldrow class="sobSobstDocLoadClass">
                            <@sf.fileload path="form.sobSobstDocLoad[${b}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="sobSobstDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                        </@sf.fldrow>
                    </@sf.initAllClones>
                </#if>

                <@sf.fldrow>
                    <@sf.label path="form.eskizReklDocLoad" title="Эскизный проект установки рекламной конструкции с фотографическим снимком, схемой предполагаемого места установки рекламной конструкции с привязкой к ближайшему километровому столбу или капитальному сооружению и привязкой по высоте к поверхности  автомобильной дороги общего пользования местного значения (выполненный в цвете) или проектная документация на рекламную конструкцию, выполненная в соответствии с требованиями законодательства, с указанием габаритов, площади информационного поля, фундамента, наличия (отсутствия) световых и осветительных устройств, срока службы рекламной конструкции:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.eskizReklDocLoad cloneSectionClass='eskizReklDocLoadClass' ; c>
                    <@sf.fldrow class="eskizReklDocLoadClass">
                        <@sf.fileload path="form.eskizReklDocLoad[${c}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="eskizReklDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <#if form.vladRekl == "on">
                    <@sf.fldrow>
                        <@sf.statictext attr="id='soglSobstDocLoad-title'" required=true style="text-align:left;" colspan="48">Подтверждение в письменной форме согласия собственника или иного владельца недвижимого имущества на присоединение к этому имуществу рекламной конструкции:</@sf.statictext>
                    </@sf.fldrow>

                    <@sf.initAllClones formElement=form.soglSobstDocLoad cloneSectionClass='soglSobstDocLoadClass' ; d>
                        <@sf.fldrow class="soglSobstDocLoadClass">
                            <@sf.fileload path="form.soglSobstDocLoad[${d}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                        </@sf.fldrow>
                        <@sf.fldrow class="soglSobstDocLoadClass">
                            <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                        </@sf.fldrow>
                    </@sf.initAllClones>
                </#if>

                <#if form.cultCh == "on">
                    <@sf.fldrow>
                        <@sf.label path="form.expertDocLoad" title="Решение экспертно - методического совета по сохранению историко - культурного наследия:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow>
                        <@sf.fileload path="form.expertDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                </#if>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по
                        собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.gosposhDocLoad" title="Сведения об оплате госпошлины:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.gosposhDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.egrpDocLoad" title="Свидетельство о государственной регистрации права на объект недвижимости:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.egrpDocLoad cloneSectionClass='egrpDocLoadClass' ; f>
                    <@sf.fldrow class="egrpDocLoadClass">
                        <@sf.fileload path="form.egrpDocLoad[${f}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Свидетельство о государственной регистрации права на объект недвижимости  к которому присоединяется рекламная конструкция" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="egrpDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.soglUOdocLoad" title="Документы подтверждающие согласование установки рекламной конструкции с уполномоченными органами:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.soglUOdocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
