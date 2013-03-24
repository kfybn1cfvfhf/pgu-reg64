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
    <@html.head title='Выдача разрешений на строительство, реконструкцию объектов капитального строительства'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.cloneFormRowWithArrays clonesectionclass='materialDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='pravoDocLoadClass' hideButtonSections='true'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>
                    <@sf.label path="form.constructionName" title="Наименование объекта строительства:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.constructionName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.constructionPlace" title="Сведения о фактическом месте расположения объекта строительства:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.constructionPlace" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

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
                <#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.materialDocLoad" title="Материалы, содержащиеся в проектной документации:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.materialDocLoad cloneSectionClass="materialDocLoadClass" ; x>
                    <@sf.fldrow class="materialDocLoadClass">
                        <@sf.fileload path="form.materialDocLoad[${x}]" validation="required" qtip="В качестве материалов, содержащихся в проектной документации, к заявлению могут быть приложены следующие документы:
<br>1. Пояснительная записка
<br>2. Схема планировочной организации земельного участка, выполненная в соответствии с градостроительным планом земельного участка, с обозначением места размещения объекта капитального строительства, подъездов и проходов к нему, границ зон действия публичных сервитутов, объектов археологического наследия
<br>3. Схема планировочной организации земельного участка, подтверждающая расположение линейного объекта в пределах красных линий, утвержденных в составе документации по планировке территории применительно к линейным объектам
<br>4. Схемы, отображающие архитектурные решения
<br>5. Сведения об инженерном оборудовании, сводный план сетей инженерно-технического обеспечения с обозначением мест подключения проектируемого объекта капитального строительства к сетям инженерно-технического обеспечения
<br>6. Проект организации строительства объекта капитального строительства
<br>7. Проект организации работ по сносу или демонтажу объектов капитального строительства, их частей" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="materialDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.expertDocLoad" title="Положительное заключение экспертизы проектной документации объекта капитального строительства (применительно к отдельным этапам строительства в случае, предусмотренном частью 12.1 статьи 48 Градостроительного Кодекса), если такая проектная документация подлежит экспертизе в соответствии со статьей 49 Градостроительного Кодекса, положительное заключение государственной экспертизы проектной документации в случаях, предусмотренных частью 3.4 статьи 49 Градостроительного Кодекса, положительное заключение государственной экологической экспертизы проектной документации в случаях, предусмотренных частью 6 статьи 49 Градостроительного Кодекса:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.expertDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.agreeDocLoad" title="Согласие всех правообладателей объекта капитального строительства в случае реконструкции такого объекта:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.agreeDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.accreditationDocLoad" title="Копия свидетельства об аккредитации юридического лица, выдавшего положительное заключение негосударственной экспертизы проектной документации, в случае, если представлено заключение негосударственной экспертизы проектной документации:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.accreditationDocLoad"  fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i><h2>Документы, предоставляемые Заявителем
                        по собственной инициативе</h2></i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.pravoDocLoad" title="Правоустанавливающие документы на земельный участок:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.pravoDocLoad cloneSectionClass="pravoDocLoadClass" ; x>
                    <@sf.fldrow class="pravoDocLoadClass">
                        <@sf.fileload path="form.pravoDocLoad[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="pravoDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.planDocLoad" title="Градостроительный план земельного участка или, в случае выдачи разрешения на строительство линейного объекта, реквизиты проекта планировки территории и проекта межевания территории:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.planDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.resolutionDocLoad" title="Разрешение на отклонение от предельных параметров разрешенного строительства, реконструкции (в случае, если застройщику было предоставлено такое разрешение в соответствии со статьей 40 Градостроительного Кодекса):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.resolutionDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
