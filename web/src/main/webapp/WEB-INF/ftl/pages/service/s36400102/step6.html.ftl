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
    <@html.head title='Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='familyDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='agree1DocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='socDocLoadClass' hideButtonSections='true'/>
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
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sostavDocLoad" title="Заявление со сведениями о составе и доходах семьи, по форме, утвержденной постановлением Правительства Саратовской области от 17 марта 2003 года № 16-П «Порядок персонифицированного учета населения Саратовской области, нуждающегося в социальной помощи»:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.sostavDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.familyDocLoad cloneSectionClass='familyDocLoadClass' ; x>
                    <@sf.fldrow class="familyDocLoadClass">
<@sf.label path="form.familyDocLoad" title="Документы, подтверждающие правильность указаных в заявлении сведений о составе и доходах семьи:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="familyDocLoadClass">
<@sf.fileload path="form.familyDocLoad[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="familyDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.agree1DocLoad cloneSectionClass='agree1DocLoadClass' ; y>
                <@sf.fldrow class="agree1DocLoadClass">
<@sf.label path="form.agree1DocLoad" title="Документ, подтверждающий согласие на обработку персональных данных третьих лиц:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="agree1DocLoadClass">
<@sf.fileload path="form.agree1DocLoad[${y}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                    <@sf.fldrow class="agree1DocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>


                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.socDocLoad cloneSectionClass='socDocLoadClass' ; z>
                    <@sf.fldrow class="socDocLoadClass">
                        <@sf.label path="form.socDocLoad" title="Документ, подтверждающий сведения о размере пенсии и других социальных выплат каждого из членов малоимущей семьи за расчетный период:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="socDocLoadClass">
                        <@sf.fileload path="form.socDocLoad[${z}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="socDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
