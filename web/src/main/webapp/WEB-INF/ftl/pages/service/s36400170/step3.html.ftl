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
    <@html.head title='Организация профессиональной ориентации граждан'>
        <@script.scripttag>
            function applCat1Changed () {
                if($("#applCat1").attr('checked') == true) {
                    $(".applCatDoc1LoadClass").show();
                } else {
                    $(".applCatDoc1LoadClass").hide();
                }
            }

            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='applCatDoc1LoadClass' hideButtonSections='true'/>
                applCat1Changed ();
                $("#applCat1").change(function() {applCat1Changed();});
                <@action.setVisibleByValue onload="true"  srcid="applCat1" event="change" value="on" destid="applCatDoc1Load-title"/>
                <@action.setVisibleByValue onload="true"  srcid="applCat2" event="change" value="on" destid="applCatDoc2Load" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="applCat2" event="change" value="on" destid="applCatDoc2Load"  />
                <@action.setVisibleByValue onload="true"  srcid="applCat3" event="change" value="on" destid="applCatDoc3Load" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="applCat3" event="change" value="on" destid="applCatDoc3Load"  />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Согласие на проведение тестирования с целью</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.testAgreeCh1" title="Выбор сферы деятельности (профессии (специальности)):" required=false style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.testAgreeCh1" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.testAgreeCh2" title="Трудоустройство:" required=false style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.testAgreeCh2" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.testAgreeCh3" title="Профессиональное обучение:" required=false style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.testAgreeCh3" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.testAgreeCh4" title="Удовлетворение потребности в профессиональном самоопределении:" required=false style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.testAgreeCh4" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.testAgreeCh5" title="Выбор оптимального вида занятости:" required=false style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.testAgreeCh5" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.testAgreeCh6" title="Развитие профессиональной карьеры:" required=false style="text-align:left;" colspan="18"/>
						<@sf.checkbox path="form.testAgreeCh6" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Категория заявителя</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.applCat1" title="Заявитель имеет профессию (специальность), квалификацию:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.applCat1" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.applCat1" title="Заявитель ищет работу впервые (ранее не работал) и не имеет профессии (специальности):" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.applCat2" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.applCat1" title="Заявитель относится к категории инвалидов:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.applCat3" qtip=""  style="text-align:unknown;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.statictext attr='id="applCatDocLabel"' style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.statictext attr="id='applCatDoc1Load-title'" required=true style="text-align:left;" colspan="48">Документы, удостоверяющие профессиональную квалификацию:</@sf.statictext>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.applCatDoc1Load cloneSectionClass='applCatDoc1LoadClass' ; k>
                    <@sf.fldrow class="applCatDoc1LoadClass">
                        <@sf.fileload path="form.applCatDoc1Load[${k}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="applCatDoc1LoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
<@sf.label path="form.applCatDoc2Load" title="Документ об образовании:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.applCatDoc2Load" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.applCatDoc3Load" title="Индивидуальная программа реабилитации инвалида, выдаваемая в установленном порядке:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.applCatDoc3Load" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
