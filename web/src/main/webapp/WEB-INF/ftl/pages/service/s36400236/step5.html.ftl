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
    <@html.head title='Предоставление социальных выплат за счет средств областного бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений, при реализации областных целевых программ'>
        <@script.scripttag>

        function toggleCloneFields() {
            if ($("#dopPravZhil").attr("value") == "on") {
                $(".dopDocLoadClass").show();
            } else {
                $(".dopDocLoadClass").hide();
            }

            if ($("#egrpNoCh").attr("value") == "on") {
                $(".pravoDocLoadClass").show();
            } else {
                $(".pravoDocLoadClass").hide();
            }
        }

            <@jquery.onready>

                <@action.cloneFormRowWithArrays clonesectionclass='techDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='pravoDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='dopDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='regDocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='pravo1DocLoadClass' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='incomeDocLoadClass' hideButtonSections='true'/>

                <@action.setVisibleByValue 'true' 'divorceCh' 'change' 'marryDocLoad-label' 'on'/>
                <@action.setVisibleByValue 'true' 'divorceCh' 'change' 'marryDocLoad' 'on'/>

                toggleCloneFields();
                $('#dopPravZhil').change(function() {toggleCloneFields()});
                $('#egrpNoCh').change(function() {toggleCloneFields()});

                <@action.setVisibleByValue 'true' 'dopPravZhil' 'change' 'dopDocLoad-label' 'on'/>
                <@action.setVisibleByValue 'true' 'egrpNoCh' 'change' 'pravoDocLoad-label' 'on'/>


            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об услуге</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию: не отмечен
Логика:
при активации становится доступным документ #marryDocLoad-->
<@sf.label path="form.divorceCh" title="Получатель услуги состоял в браке, который был расторгнут:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.divorceCh" qtip=""  style="text-align:left;" colspan="31"/>
						<@sf.empty colspan="29"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию: не отмечен
Логика:
при активации становится доступным документ #dopDocLoad-->
<@sf.label path="form.dopPravZhil" title="Заявитель имеет право на дополнительную жилую площадь в соответствии с законодательством :" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.dopPravZhil" qtip=""  style="text-align:left;" colspan="31"/>
						<@sf.empty colspan="29"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию: не отмечен
Логика:
при активации становится доступным документ #pravoDocLoad-->
<@sf.label path="form.egrpNoCh" title="Право собственности на жилое помещение не зарегистрировано в Едином государственном реестре прав на недвижимое имущество и сделок с ним:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.egrpNoCh" qtip=""  style="text-align:left;" colspan="31"/>
						<@sf.empty colspan="29"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.birthDocLoad" title="Свидетельство о рождении получателя услуги:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.birthDocLoad" qtip="В качестве свидетельства о рождении получателя услуги прикладывается:
<br>1. Свидетельство о рождении заявителя, в случае, если заявление подается самим заявителем или его представителем, действующим на основании доверенности.
<br>2. Свидетельство о рождении лица, нуждающегося в услуге, в случае, если заявление подается от имени опекуна (попечителя),  представляющего интересы недееспособного лица" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
<@sf.label path="form.techDocLoad" title="Документ соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителя, членов его семьи, рожденных до 1 января 1998, в том числе  выданные на фамилию, имя, отчество имевшиеся у них до их изменения:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.techDocLoad cloneSectionClass="techDocLoadClass" ; x>
                    <@sf.fldrow class="techDocLoadClass">
                        <@sf.fileload path="form.techDocLoad[${x}]" qtip="Гражданам, которые в течении 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий, изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест регистрации" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="techDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
						<#-- По умолчанию: скрыт
Логика: становится видимым при отметке чекбокса #egrpNoCh

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
<@sf.label path="form.pravoDocLoad" title="Копии документов, подтверждающие право собственности на жилое помещение, либо копия договора социального найма жилого помещения:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.pravoDocLoad cloneSectionClass="pravoDocLoadClass" ; x>
                    <@sf.fldrow class="pravoDocLoadClass">
                        <@sf.fileload path="form.pravoDocLoad[${x}]" qtip="Гражданам, которые в течении 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий, изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест регистрации" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="pravoDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
						<#-- По умолчанию: скрыт
Логика: становится видимым при отметке чекбокса #dopPravZhil

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
<@sf.label path="form.dopDocLoad" title="Документы, подтверждающие право на дополнительную жилую площадь, в соответствии с законодательством, в случае наличия такого права:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.dopDocLoad cloneSectionClass="dopDocLoadClass" ; x>
                    <@sf.fldrow class="dopDocLoadClass">
                        <@sf.fileload path="form.dopDocLoad[${x}]" qtip="Гражданам, которые в течении 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий, изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест регистрации" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="dopDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
<@sf.label path="form.regDocLoad" title="Справка о зарегистрированных лицах и лицах снятых с регистрационного учета, но сохранивших право пользования жилыми помещениями, выдаваемую жилищными или жилищно-строительными кооперативами:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.regDocLoad cloneSectionClass="regDocLoadClass" ; x>
                    <@sf.fldrow class="regDocLoadClass">
                        <@sf.fileload path="form.regDocLoad[${x}]" qtip="Гражданам, которые в течении 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий, изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест регистрации" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="regDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

            <#if form.catAppl?has_content && form.catAppl == "3">
                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.workDocLoad" title="Справка с места работы с указанием периода работы:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                <#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.workDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
            </#if>

                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
<@sf.label path="form.incomeDocLoad" title="Документы о размере и об источнике доходов:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.incomeDocLoad cloneSectionClass="incomeDocLoadClass" ; x>
                    <@sf.fldrow class="incomeDocLoadClass">
                        <@sf.fileload path="form.incomeDocLoad[${x}]" qtip="В качестве документа о рамерах и источниках дохода к заявлению могут быть приложены следующие документы:
<br>1. Справка с места работы с указанием должности и размера средней заработной платы за последние 12 месяцев
<br>2. Документы о доходах об индивидуальной предпринимательской деятельности
<br>3. Документы о доходах от деятельности нотариуса, занимающегося частной практикой
<br>4. Документы о доходах адвоката, учредившего адвокатский кабинет
<br>5. Документы о прочих денежных выплатах, сведения о которых невозможно получить в государственных органах и органах местного самоуправления." validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="incomeDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию: скрыт
Логика: становится видимым при отметке чекбокса #divorceCh

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.marryDocLoad" title="Справка о заключении брака по форме №28:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- По умолчанию: скрыт
Логика: становится видимым при отметке чекбокса #divorceCh

Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.marryDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Представляется заявителем в случае, если заявитель состоял в браке, который был расторгнут" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.
Множественная загрузка-->
<@sf.label path="form.pravo1DocLoad" title="Документы соответствующего органа государственной регистрации прав на недвижимое имущество и сделок с ним на территории Саратовской области об отсутствии (наличии) недвижимости у заявителя и членов его семьи, в том числе выданные на фамилию, имя, отчество имевшиеся у них до их изменения, в случае если данные изменения произошли после 6 июля 1997 года:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.pravo1DocLoad cloneSectionClass="pravo1DocLoadClass" ; x>
                    <@sf.fldrow class="pravo1DocLoadClass">
                        <@sf.fileload path="form.pravo1DocLoad[${x}]" qtip="Гражданам, которые в течении 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий, изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест регистрации" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="pravo1DocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="44" />
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>