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
    <@html.head title='Выплата  ежемесячной  денежной  выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан, проживающих  и работающих  в  сельской  местности,  рабочих поселках (поселках городского типа)'>
        <@script.scripttag>
            <@jquery.onready>

            <@action.setVisibleByValue 'true' 'wayService' 'change' 'svidRegDocLoad' '2'/>
            <@action.setVisibleByValue 'true' 'wayService' 'change' 'svidRegDocLoad-label' '2'/>

            <@action.setVisibleByValue 'true' 'noTrudKnig' 'change' 'sprTrudDocLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'noTrudKnig' 'change' 'sprTrudDocLoad-label' 'on'/>
            <@action.setVisibleByValue 'true' 'noTrudKnig' 'change' 'trudKnigDocLoad' 'off'/>
            <@action.setVisibleByValue 'true' 'noTrudKnig' 'change' 'trudKnigDocLoad-label' 'off'/>

            <@action.setVisibleByValue 'true' 'pens' 'change' 'pensDocLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'pens' 'change' 'pensDocLoad-label' 'on'/>

            <@action.setVisibleByValue 'true' 'noCentrOtoplen' 'change' 'pechDocLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'noCentrOtoplen' 'change' 'pechDocLoad-label' 'on'/>
            <@action.setVisibleByValue 'true' 'noCentrOtoplen' 'change' 'techPaspDocLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'noCentrOtoplen' 'change' 'techPaspDocLoad-label' 'on'/>

            <@action.setVisibleByValue 'true' 'socRab' 'change' 'trudDogDocLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'socRab' 'change' 'trudDogDocLoad-label' 'on'/>
            <@action.setVisibleByValue 'true' 'socRab' 'change' 'sprSocRabDocLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'socRab' 'change' 'sprSocRabDocLoad-label' 'on'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о запрашиваемой услугe</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.org_soc" title="Управление социальной поддержки населения:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.org_soc" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать орган социальной поддержки населения, в который обращается заявитель по месту нахождения предоставленного жилого помещения" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.wayService" title="Прошу предоставить денежную выплату на оплату жилого помещения и коммунальных услуг:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.wayService" dictionaryCode="03_METHOD_BENEFIT_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.noTrudKnig" title="Трудовая книжка была утрачена, содержит неправильные записи, сведения о работе отсутствуют:" required=false style="text-align:left;" colspan="17"/>
<@sf.checkbox path="form.noTrudKnig" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.pens" title="Лицо, нуждающееся в услуге, является пенсионером:" required=false style="text-align:left;" colspan="17"/>

<@sf.checkbox path="form.pens" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.noCentrOtoplen" title="Жилое помещение, на оплату которого предоставляется денежная выплата, находится в доме не имеющем центрального отопления:" required=false style="text-align:left;" colspan="17"/>

<@sf.checkbox path="form.noCentrOtoplen" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.socRab" title="Лицо, нуждающееся в услуге, является социальным работником:" required=false style="text-align:left;" colspan="17"/>

<@sf.checkbox path="form.socRab" qtip=""  style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.svidRegDocLoad" title="Свидетельство о регистрации по месту пребывания:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.svidRegDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.trudKnigDocLoad" title="Трудовая книжка (или ее копия, заверенная администрацией учреждения):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.trudKnigDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.sprTrudDocLoad" title="Справка (справки) архивных учреждений, организаций-работодателей о трудовом стаже:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.sprTrudDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.sostFamilyDocLoad" title="Справка о составе семьи или домовая книга:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.fileload path="form.sostFamilyDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.pensDocLoad" title="Пенсионное удостоверение:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.pensDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.pechDocLoad" title="Документ, подтверждающий наличие в доме печного отопления:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.fileload path="form.pechDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.techPaspDocLoad" title="Технический паспорт здания (строения):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.techPaspDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.trudDogDocLoad" title="Трудовой договор:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.trudDogDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.sprSocRabDocLoad" title="Справка с места работы, подтверждающая факт осуществления социального обслуживания в сельской местности, рабочем поселке (поселке городского типа), если учреждение зарегистрировано в городе :" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.sprSocRabDocLoad" qtip="Прикладывается в случае, если учреждение зарегистрировано в городе"  fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Соглашение</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
                <@sf.empty colspan="1"/>
					    <@sf.checkbox path="form.agree" qtip="" validation="required" style="text-align:unknown;" colspan="1"/>
						<@sf.label path="form.agree" title="Я ознакомлен(а) с обстоятельствами, влекущими прекращение ежемесячной денежной выплаты и обязуюсь своевременно (в течение одного месяца) известить об их наступлении. В случае переплаты, возникшей вследствие предоставления документов с заведомо неверными сведениями, сокрытия данных, влияющих на право назначения выплаты и её размеров, обязуюсь вернуть денежные средства в соответствии с действующим законодательством:" required=true style="text-align:left;" colspan="37"/>

					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
