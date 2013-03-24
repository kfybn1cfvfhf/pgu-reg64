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
                <@action.cloneFormRowWithArrays clonesectionclass='regDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='techDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='otherDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='incomeDocLoad' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='gosRegDocLoad' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='gosRegChangeDocLoad' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Дополнительные сведения</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sitizenCategory" title="Категория гражданина, имеющего право на улучшение жилищных условий:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.sitizenCategory" dictionaryCode="64_CATEGORY_OF_SITIZENS_120" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.applReason" title="Основание (причина) для подачи заявления:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.applReason" dictionaryCode="64_REASON_OF_APPLICATION" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.regDocLoad" title="Справка о зарегистрированных лицах и лицах, снятых с регистрационного учета, но сохранивших право пользования жилым помещением, выдаваемая соответствующей жилищно-эксплуатационной организацией, жилищным или жилищно-строительным кооперативом и т.д.:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.regDocLoad cloneSectionClass='regDocLoadClass' ; x>
                <@sf.fldrow class="regDocLoadClass">
<@sf.fileload path="form.regDocLoad[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Граждане, которые в течение пяти лет, предшествовавших дню обращения для признания их в качестве нуждающихся в жилых помещениях, изменяли свое место жительства, представляют документы, с каждого места жительства, в котором они проживали" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="regDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
<@sf.label path="form.techDocLoad" title="Документы соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителей и членов их семьи, рожденных до 1 января 1998 года, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.techDocLoad cloneSectionClass='techDocLoadClass' ; y>
                    <@sf.fldrow class="techDocLoadClass">
                        <@sf.fileload path="form.techDocLoad[${y}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="Граждане, которые в течение пяти лет, предшествовавших дню обращения для признания их в качестве нуждающихся в жилых помещениях, изменяли свое место жительства, представляют документы, с каждого места жительства, в котором они проживали" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="techDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
<@sf.label path="form.rightDocLoad" title="Документ, подтверждающий право на внеочередное получение жилья:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.rightDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.incomeDocLoad" title="Документы о размере и об источниках доходов:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.incomeDocLoad cloneSectionClass='incomeDocLoad' ; y>
                    <@sf.fldrow class="incomeDocLoad">
                        <@sf.fileload path="form.incomeDocLoad[${y}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляются категориями граждан из числа многодетные семьи и работники бюджетной сферы" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="incomeDocLoad">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
<@sf.label path="form.otherDocLoad" title="Другие документы, подтверждающие факт отнесения к категории граждан, имеющих право на получение жилого помещения по договору социального найма:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.otherDocLoad cloneSectionClass='otherDocLoadClass' ; z>
                    <@sf.fldrow class="otherDocLoadClass">
<@sf.fileload path="form.otherDocLoad[${z}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Документ, подтверждающий утрату жилого помещения на территории области в связи с репрессиями, документ, подтверждающий гибель при исполнении служебных обязанностей сотрудника (работника) государственной противопожарной службы области, медицинское заключение о хроническом заболевании, дающее право гражданам на получение жилых помещений, копию справки ВТЭК об инвалидности" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="otherDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.gosRegDocLoad" title="Документы соответствующего органа по государственной регистрации прав на недвижимое имущество и сделок с ним на территории Саратовской области об отсутствии (наличии) недвижимости у заявителей и членов их семьи, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения в случае, если данные изменения произошли после 6 июля 1997 года:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.gosRegDocLoad cloneSectionClass='gosRegDocLoad' ; z>
                    <@sf.fldrow class="gosRegDocLoad">
<@sf.fileload path="form.gosRegDocLoad[${z}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="gosRegDocLoad">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
<@sf.label path="form.opfDocLoad" title="Справка, выданная территориальным органом Пенсионного фонда Российской Федерации или иным органом, осуществляющим пенсионное обеспечение (пенсионные отделы МО РФ, МВД РФ, ФСБ РФ, Прокуратуры РФ), о размере пенсии и иных социальных выплат за последние 12 месяцев:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.opfDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.socDocLoad" title="Справка, выданная органом социальной защиты населения о размере социальных выплат за последние 12 месяцев:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.socDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.egrpDocLoad" title="Сведения, подтверждающие принадлежность жилого помещения на праве собственности, зарегистрированном в Едином государственном реестре прав на недвижимое имущество и сделок с ним:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.egrpDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.gosRegChangeDocLoad" title="Документы органа, осуществляющего государственную регистрацию прав на недвижимое имущество и сделок с ним на территории Саратовской области, в случае, если указанные граждане и (или) члены их семей в течение пяти лет, предшествовавших дню обращения для признания их в качестве нуждающихся в жилых помещениях, изменяли свое место жительства, запрашиваются с каждого места жительства, в котором они проживали последние пять лет:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.initAllClones formElement=form.gosRegChangeDocLoad cloneSectionClass='gosRegChangeDocLoad' ; z>
                    <@sf.fldrow class="gosRegChangeDocLoad">
<@sf.fileload path="form.gosRegChangeDocLoad[${z}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                    <@sf.fldrow class="gosRegChangeDocLoad">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
<@sf.label path="form.dogovorDocLoad" title="Копия договора социального найма жилого помещения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.dogovorDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
