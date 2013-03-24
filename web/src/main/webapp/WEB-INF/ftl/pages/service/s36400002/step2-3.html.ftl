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
    <@html.head title='Переоформление лицензии на право ведения образовательной деятельности'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.setVisibleByValue 'true' 'checkBox1' 'change' 'load_doc7' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox1' 'change' 'load_doc7-label' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox2' 'change' 'load_doc5' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox2' 'change' 'load_doc5-label' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox3' 'change' 'load_doc3' 'on'/>
                <@action.setVisibleByValue 'true' 'checkBox3' 'change' 'load_doc3-label' 'on'/>

                <@action.cloneFormRowWithArrays clonesectionclass='load_doc4Class' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='load_doc28Class' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='load_doc37Class' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='load_doc35Class' hideButtonSections='true'/>

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
Подаются документы, содержащие информацию в отношении филиалов, и (или) адресов мест осуществления образовательной деятельности, и (или) образовательных программ<br>
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox1 отображается документ «Копия документа, подтверждающего проведение учредителем государственного или муниципального учреждения в соответствии с пунктом 4 статьи 13 Федерального закона "Об основных гарантиях прав ребенка в Российской Федерации" экспертной оценки последствий договора аренды для обеспечения образования, воспитания, развития, отдыха и оздоровления детей, оказания им медицинской, лечебно-профилактической помощи, социальной защиты и социального обслуживания детей (в случае аренды соискателем лицензии помещений для организации образовательного процесса в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей)»-->
<@sf.label path="form.checkBox1" title="Соискателем лицензии осуществляется аренда помещений для организации образовательного процесса в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox1 отображается документ «Копия документа, подтверждающего проведение учредителем государственного или муниципального учреждения в соответствии с пунктом 4 статьи 13 Федерального закона "Об основных гарантиях прав ребенка в Российской Федерации" экспертной оценки последствий договора аренды для обеспечения образования, воспитания, развития, отдыха и оздоровления детей, оказания им медицинской, лечебно-профилактической помощи, социальной защиты и социального обслуживания детей (в случае аренды соискателем лицензии помещений для организации образовательного процесса в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей)»-->
<@sf.checkbox path="form.checkBox1" validation="required" qtip="" style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox2 отображается документ «Копия положения о филиале (в случае, если лицензиат обращается за разрешением на осуществление образовательной деятельности в филиале)»-->
<@sf.label path="form.checkBox2" title="Соискатель обращается за разрешением на осуществление деятельности в филиале:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox2 отображается документ «Копия положения о филиале (в случае, если лицензиат обращается за разрешением на осуществление образовательной деятельности в филиале)»-->
<@sf.checkbox path="form.checkBox2" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox3 отображается документ «Копия положения о структурном подразделении (в случае, если в качестве лицензиата выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки»-->
<@sf.label path="form.checkBox3" title="В качестве соискателя лицензии выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки:" required=true style="text-align:left;" colspan="18"/>
					
						<#-- По умолчанию: Не активирован
Логика:
1. При активированном #checkBox3 отображается документ «Копия положения о структурном подразделении (в случае, если в качестве лицензиата выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки»-->
<@sf.checkbox path="form.checkBox3" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Электронные копии документов</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.  <br>
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc0" title="Заявление образовательного учреждения, согласованное с учредителем:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc0" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc4" title="Копии учредительных документов образовательного учреждения, засвидетельствованные в нотариальном порядке:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc4 cloneSectionClass="load_doc4Class" ; x>
                    <@sf.fldrow class="load_doc4Class">
                        <@sf.fileload path="form.load_doc4[${x}]" validation="required" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc4Class">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox1
2. Скрывается при деактивировации чекбокса #checkBox1
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc7" title="Копия документа, подтверждающего проведение учредителем государственного или муниципального учреждения в соответствии с пунктом 4 статьи 13 Федерального закона «Об основных гарантиях прав ребенка в Российской Федерации» экспертной оценки последствий договора аренды для обеспечения образования, воспитания, развития, отдыха и оздоровления детей, оказания им медицинской, лечебно-профилактической помощи, социальной защиты и социального обслуживания детей (в случае аренды соискателем лицензии или лицензиатом помещений для организации образовательного процесса в государственном или муниципальном учреждении, являющемся объектом социальной инфраструктуры для детей):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox1
2. Скрывается при деактивировации чекбокса #checkBox1
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc7" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox2
2. Скрывается при деактивировации чекбокса #checkBox2
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc5" title="Копия положения о филиале (в случае, если лицензиат обращается за разрешением на осуществление образовательной деятельности в филиале):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox2
2. Скрывается при деактивировации чекбокса #checkBox2
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc5" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox3
2. Скрывается при деактивировации чекбокса #checkBox3
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc3" title="Копия положения о структурном подразделении (в случае, если в качестве лицензиата выступает организация, структурное подразделение которой осуществляет реализацию образовательных программ профессиональной подготовки):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. Отображается при активировации чекбокса #checkBox3
2. Скрывается при деактивировации чекбокса #checkBox3
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc3" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc6" title="Подписанная руководителем лицензиата справка о материально-техническом обеспечении образовательной деятельности по заявленным для лицензирования образовательным программам:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc6" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc39" title="Опись представленных документов:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc39" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc38" title="Документ, подтверждающий уплату государственной пошлины:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc38" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc28" title="Копии документов, подтверждающих наличие у лицензиата в собственности или на ином законном основании оснащенных зданий, строений, сооружений, помещений и территорий, соответствующих установленным лицензионным нормативам обеспечения образовательной деятельности по заявленным для лицензирования образовательным программам:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc28 cloneSectionClass="load_doc28Class" ; x>
                    <@sf.fldrow class="load_doc28Class">
                        <@sf.fileload path="form.load_doc28[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc28Class">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc37" title="Заключение Министерства Российской Федерации по делам гражданской обороны, чрезвычайным ситуациям и ликвидации последствий стихийных бедствий о соответствии зданий, строений, сооружений, помещений и территорий, заявленных соискателем лицензии для осуществления образовательной деятельности, установленным законодательством Российской Федерации требованиям пожарной безопасности:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc37 cloneSectionClass="load_doc37Class" ; x>
                    <@sf.fldrow class="load_doc37Class">
                        <@sf.fileload path="form.load_doc37[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc37Class">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<#-- Множественная загрузка
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc35" title="Заключение Федеральной службы по надзору в сфере защиты прав потребителей и благополучия человека и Федерального медико-биологического агентства о соответствии зданий, строений, сооружений, помещений и территорий, заявленных соискателем лицензии для осуществления образовательной деятельности, установленным законодательством Российской Федерации санитарно-эпидемиологическим требованиям:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.load_doc35 cloneSectionClass="load_doc35Class" ; x>
                    <@sf.fldrow class="load_doc35Class">
                        <@sf.fileload path="form.load_doc35[${x}]" qtip="" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="load_doc35Class">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.load_doc40" title="Выписка из Единого государственного реестра юридических лиц:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.load_doc40" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
