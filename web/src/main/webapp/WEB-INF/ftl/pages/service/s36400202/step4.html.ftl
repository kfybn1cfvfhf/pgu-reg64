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
    <@html.head title='Выплата пособия по беременности и родам, единовременного пособия женщинам, вставшим на учет в медицинских учреждениях в ранние сроки беременности'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.setVisibleByValue 'true' 'dismissedCh' 'change' 'workLastName' '1'/>
                <@action.setVisibleByValue 'true' 'dismissedCh' 'change' 'workFirstName' '1'/>
                <@action.setVisibleByValue 'true' 'dismissedCh' 'change' 'workMiddleName' '1'/>
                <@action.setVisibleByValue 'true' 'dismissedCh' 'change' 'workBirthdate' '1'/>
                <@action.setVisibleByValue 'true' 'dismissedCh' 'change' 'doc1Note' '1'/>

                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'womanDocLoad' '2'/>
                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'womanDocLoad-label' '2'/>
                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'socDocLoad' '1'/>
                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'socDocLoad-label' '1'/>
                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'socMedDocLoad' '2'/>
                <@action.setVisibleByValue 'true' 'goalAppl' 'change' 'socMedDocLoad-label' '2'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Необходимо указать вид услуги</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                     <@sf.label path="form.goalAppl" title="Цель обращения:" required=true style="text-align:left;" colspan="17"/>
                     <@sf.dictionaryLookup path="form.goalAppl" dictionaryCode="03_GOAL_APPL_64202" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.socSupport" title="Орган социальной поддержки населения, предоставляющий государственную услугу:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.socSupport" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать один из органов  социальной поддержки населения, в который обращается заявитель (выбрать орган, расположенный  по месту жительства, либо – по месту пребывания, либо – по месту фактического проживания)" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.label path="form.dismissedCh" title="Получатель услуги уволен в связи с прекращением деятельности работодателя:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.dismissedCh" qtip=""  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext attr="id='doc1Note'" style="text-align:left;" colspan="48"><h2>Сведения об индивидуальных предпринимателях,  нотариусах, занимающихся частной практикой, адвокатах и иных физических лицах, профессиональная деятельность которых в соответствии с федеральными законами подлежит государственной регистрации и (или) лицензированию, в случае прекращения их деятельности, повлекшей увольнение получателя услуги</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.workLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.workLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.workFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.workFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.workMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.workMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.workBirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.datefield path="form.workBirthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.disabilityDocLoad" title="Листок нетрудоспособности:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.disabilityDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.employDocLoad" title="Выписка из трудовой книжки о последнем месте работы, заверенная в установленном порядке:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.employDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.womanDocLoad" title="Справка из женской консультации либо другого медицинского учреждения, поставившего женщину на учет в ранние сроки беременности:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.womanDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.nalogDocLoad" title="Решение территориальных органов федеральной налоговой службы о государственной регистрации прекращения физическими лицами деятельности в качестве индивидуальных предпринимателей, прекращения полномочий нотариусами, занимающимися частной практикой, прекращения статуса адвоката и прекращения деятельности иными физическими лицами, профессиональная деятельность которых в соответствии с федеральными законами подлежит государственной регистрации и (или) лицензированию (территориальные органы Федеральной налоговой службы):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.nalogDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.unemployedDocLoad" title="Справка из органов государственной службы занятости населения о признании их безработными (центры занятости населения субъектов Российской Федерации):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.unemployedDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.socDocLoad" title="Справка из органа социальной защиты населения по месту жительства о том, что пособие по беременности и родам не назначалось:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.socDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.socMedDocLoad" title="Справка из органа социальной защиты населения по месту жительства о том, что единовременное пособие женщинам, вставшим на учет в медицинских учреждениях в ранние сроки беременности, не назначалось:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.fileload path="form.socMedDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
