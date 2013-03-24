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
    <@html.head title='Выдача постановлений по присвоению адреса земельным участкам и объектам капитального строительства'>
        <@script.scripttag>
            <@jquery.onready>

            <#--скрытие полей-->
                <@action.setVisibleByValue onload='true' srcid='goalAppl' event='change' destid='capitalDocLoad-label' value='1' />
                <@action.setVisibleByValue onload='true' srcid='goalAppl' event='change' destid='capitalDocLoad' value='1' />
                <@action.setVisibleByValue onload='true' srcid='goalAppl' event='change' destid='techDocLoad-label' value='1' />
                <@action.setVisibleByValue onload='true' srcid='goalAppl' event='change' destid='techDocLoad' value='1' />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>
                    <@sf.label path="form.goalAppl" title="Цель обращения:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.dictionaryLookup path="form.goalAppl" dictionaryCode="03_GOAL_APPL_64218" qtip="Указывается цель обращения" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об объекте
                        недвижимости</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.realtyType" title="Тип объекта недвижимости:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.dictionaryLookup path="form.realtyType" dictionaryCode="03_REALTY_TYPE_64218" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.realtyPlace" title="Местонахождение объекта недвижимости:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.textfield  path="form.realtyPlace" qtip="Указывается полный адрес объекта недвижимости (субъект Российской Федерации, муниципальное образование, адресные ориентиры)" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.realtyKadastr" title="Кадастровый номер:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.textfield  path="form.realtyKadastr" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.realtyUsl" title="Условный номер:" required=false style="text-align:left;" colspan="18"/>
                    <@sf.textfield  path="form.realtyUsl" qtip=""  style="text-align:left;" colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных
                        копий документов.
                        <br>Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по
                        собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.landDocLoad" title="Правоустанавливающие документы на земельный участок:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.landDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.capitalDocLoad" title="Правоустанавливающие документы на объект капитального строительства:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.capitalDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.techDocLoad" title="Технический и (или) кадастровый паспорт объекта недвижимости:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.techDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.schemDocLoad" title="Схема расположения земельного участка на кадастровом плане или кадастровой карте соответствующей территории или кадастровая выписка на земельный участок:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.schemDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
