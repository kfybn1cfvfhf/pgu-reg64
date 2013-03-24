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
    <@html.head title='Выдача разрешений, переоформление разрешений и выдача дубликатов разрешений на осуществление деятельности по перевозке пассажиров и багажа легковым такси'>
        <@script.scripttag>
            <@jquery.onready>
             <@action.setVisibleByValue 'true' 'sobstTS' 'change' 'gosRegTSDocLoad' 'on' />
             <@action.setVisibleByValue 'true' 'sobstTS' 'change' 'dogArendaTSDocLoad' 'off' />
             <@action.setVisibleByValue 'true' 'sobstTS' 'change' 'dovTSDocLoad' 'off' />
             <@action.setVisibleByValue 'true' 'sobstTS' 'change' 'gosRegTSDocLoad-label' 'on' />
             <@action.setVisibleByValue 'true' 'sobstTS' 'change' 'dogArendaTSDocLoad-label' 'off' />
             <@action.setVisibleByValue 'true' 'sobstTS' 'change' 'dovTSDocLoad-label' 'off' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о запрашиваемой информации</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.label path="form.intention" title="Цель обращения:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.intention" dictionaryCode="64_INTENTION_64187" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.label path="form.sobstTS" title="Заявитель является собственником транспортного средства, заявляемого к использованию к оказанию услуг по перевозке пассажиров и багажа легковым такси:" required=false style="text-align:left;" colspan="18"/>

<@sf.checkbox path="form.sobstTS" qtip=""  style="text-align:left;" colspan="1"/>

						<@sf.empty colspan="29"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа.
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.label path="form.gosRegTSDocLoad" title="Копия свидетельства о государственной регистрации транспортного средства, заявляемого к использованию к оказанию услуг по перевозке пассажиров и багажа легковым такси:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.fileload path="form.gosRegTSDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.label path="form.dogArendaTSDocLoad" title="Копия договора аренды (лизинга) транспортного средства, заявляемого к использованию к оказанию услуг по перевозке пассажиров и багажа легковым такси:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.fileload path="form.dogArendaTSDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.label path="form.dovTSDocLoad" title="Копия нотариально заверенной доверенности на право распоряжения транспортным средством, заявляемого к использованию к оказанию услуг по перевозке пассажиров и багажа легковым такси:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.fileload path="form.dovTSDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.label path="form.gosposhDocLoad" title="Сведения об оплате госпошлины:" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.fileload path="form.gosposhDocLoad" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>