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
    <@html.head title='Прием заявлений, постановка на учет и предоставление информации об организации оказания специализированной медицинской помощи в специализированных медицинских учреждениях'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о страховом медицинском полисе заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.seriaMedPolice" title="Серия:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.seriaMedPolice" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.noMedPolice" title="Номер:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.noMedPolice" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.nameOrgMedPolice" title="Наименование страховой организации:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.nameOrgMedPolice" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об инвалидности заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.grInvalid1" title="I группа:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.grInvalid1" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.grInvalid2" title="II группа:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.grInvalid2" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.grInvalid3" title="III группа:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.grInvalid3" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.childInvalid" title="Ребенок-инвалид:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.childInvalid" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.fullLifeInvalid" title="Инвалид с детства:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.fullLifeInvalid" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о социальном статусе заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.socStatus" title="Социальный статус заявителя:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.socStatus" dictionaryCode="64_SOCIAL_STATUS" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о способе получения результата оказания услуги</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.wayDeliveryBenefit" title="Способ получения результата оказания услуги:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.wayDeliveryBenefit" dictionaryCode="64_WAY_DELIVETY_RESULT" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.epicrisisDocLoad" title="Выписной эпикриз из первичной медицинской документации больного:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.epicrisisDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
