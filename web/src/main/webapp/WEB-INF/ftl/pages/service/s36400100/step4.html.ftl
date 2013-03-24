<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title=' Прием заявлений и выдача документов о согласовании переустройства и (или) перепланировки жилого помещения'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.cloneFormRowWithArrays clonesectionclass='personclone' hideButtonSections='true' maxCloneSize='50'/>
                <@action.cloneFormRowWithArrays clonesectionclass='agreeDocLoadclass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='agree1DocLoadclass' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.initAllClones formElement=form.lastNamProp cloneSectionClass="personclone" ; x>

                <@sf.fldrow class="personclone">
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о собственнике (собственниках) жилого помещения</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
						<@sf.label path="form.lastNamProp[${x}]" title="Фамилия:" required=true style="text-align:left;" colspan="18"/>
						<@sf.textfield  path="form.lastNamProp[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" class="clone-field" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
						<@sf.label path="form.firstNameProp[${x}]" title="Имя:" required=true style="text-align:left;" colspan="18"/>
						<@sf.textfield  path="form.firstNameProp[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" class="clone-field" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="personclone">
						<@sf.label path="form.middleNameProp[${x}]" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="18"/>
						<@sf.textfield  path="form.middleNameProp[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" class="clone-field"  style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                    <@sf.fldrow class="personclone">
                            <@sf.addRemoveButton addTitle="Добавить сведения о собственнике жилого помещения" delTitle="Удалить"  colspan="31"/>
                    </@sf.fldrow>

                </@sf.initAllClones>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.agreeDocLoad" title="Согласие в письменной форме всех членов семьи нанимателя (в том числе временно отсутствующих членов семьи нанимателя), занимающих переустраиваемое и (или) перепланируемое жилое помещение на основании договора социального найма (в случае, если заявителем является уполномоченный наймодателем на представление предусмотренных настоящим пунктом документов наниматель переустраиваемого и (или) перепланируемого жилого помещения по договору социального найма):" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.agreeDocLoad cloneSectionClass='agreeDocLoadclass' ; x>
                    <@sf.fldrow class="agreeDocLoadclass">
                        <@sf.fileload path="form.agreeDocLoad[${x}]" qtip='' validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="agreeDocLoadclass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="31"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                        <@sf.label path="form.agree1DocLoad" title="Документ, подтверждающий согласие на обработку персональных данных третьих лиц:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.agree1DocLoad cloneSectionClass='agree1DocLoadclass' ; x>
                    <@sf.fldrow class="agree1DocLoadclass">
                        <@sf.fileload path="form.agree1DocLoad[${x}]" qtip='' validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="agree1DocLoadclass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="31"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
