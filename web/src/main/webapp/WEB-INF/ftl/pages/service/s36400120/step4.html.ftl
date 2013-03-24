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
    <@html.head title='Учет граждан, обратившихся за предоставлением жилого помещения по договору социального найма из государственного жилищного фонда области'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='fam_member_identityDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='fam_member_kinDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='famClone' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
				<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о членах семьи</h2></@sf.statictext>
                </@sf.fldrow>

				<@sf.initAllClones formElement=form.fam_member_lastName cloneSectionClass='famClone' ; x>

                <@sf.fldrow class="famClone">
                        <@sf.label path="form.fam_member_lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.fam_member_lastName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.fam_member_firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.fam_member_firstName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="famClone">
                        <@sf.label path="form.fam_member_middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.fam_member_middleName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow class="famClone">
<@sf.label path="form.fam_member_snils" title="СНИЛС члена семьи:" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield path="form.fam_member_snils[${x}]" qtip=""  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow class="famClone">
<@sf.label path="form.fam_member_kin" title="Родственные отношения:" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield path="form.fam_member_kin[${x}]" qtip=""  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow class="famClone">
               <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.fam_member_identityDocLoad" title="Документы, удостоверяющие личность членов семьи:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.fam_member_identityDocLoad cloneSectionClass='fam_member_identityDocLoadClass' ; z>
                    <@sf.fldrow class="fam_member_identityDocLoadClass">
                        <@sf.fileload path="form.fam_member_identityDocLoad[${z}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Приложите электронные копии документов, удостоверяющих личность всех членов семьи." style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="fam_member_identityDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.fam_member_kinDocLoad" title="Документы, подтверждающие родственные отношения:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.fam_member_kinDocLoad cloneSectionClass='fam_member_kinDocLoadClass' ; y>
                    <@sf.fldrow class="fam_member_kinDocLoadClass">
                        <@sf.fileload path="form.fam_member_kinDocLoad[${y}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip='Приложите электронные копии документов, подтверждающих родственные отношения всех членов семьи.<br>
В качестве документов, подтверждающих родственные отношения могут быть приложены:<br>
1. Копия свидетельства о браке,<br>
2. Копия свидетельства о расторжении брака,<br>
3. Копии свидетельства о рождении всех членов семьи,<br>
4. Копия решения соответствующего суда о признании гражданина членом семьи заявителя. В случае расторжения брака: справка о заключении брака по форме N 28, утвержденной постановлением Правительства Российской Федерации от 31 октября 1998 г. N 1274 "Об утверждении форм бланков заявлений о государственной регистрации актов гражданского состояния, справок и иных документов, подтверждающих государственную регистрацию актов гражданского состояния'
 style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="fam_member_kinDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
