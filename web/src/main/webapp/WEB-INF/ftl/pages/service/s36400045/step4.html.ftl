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
    <@html.head title='Прием заявлений, постановка на учет и зачисление детей в образовательные учреждения реализующие основную образовательную программу дошкольного образования (детские сады)'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />

                <@action.setVisibleByValue 'true' 'correctCh' 'change' 'commissionDocLoad' '1'/>
                <@action.setVisibleByValue 'true' 'correctCh' 'change' 'commissionDocLoad-label' '1'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                    <@sf.label path="form.SRayon" title="Район:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup path="form.SRayon" dictionaryCode="0364_DISTRICT_SO" title="Район"
                        validation="required"
                        style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.dou_rd" title="Дошкольное образовательное учреждение:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield path="form.dou_rd"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о ребенке</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.childLastName" title="Фамилия ребенка:" required=true style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.childLastName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.childFirstName" title="Имя ребенка:" required=true style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.childFirstName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.label path="form.childMiddleName" title="Отчество ребенка (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
					<#-- Валидация: кириллические буквы и знак дефиса-->
                    <@sf.textfield  path="form.childMiddleName" qtip="Допустимо вносить только кириллические буквы и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.childBirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.childBirthdate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.childGender" title="Пол ребенка:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.radiogroup path="form.childGender" dictionaryCode="DOU_CH_GENDER" qtip="" validation="required" style="text-align:left;" colspan="31" mode="horizontal"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- В случае активации чекбокса отображается документ #commissionDocLoad-->
                    <@sf.label path="form.correctCh" title="Направляется в дошкольное коррекционное учреждение:" required=false style="text-align:left;" colspan="17"/>
					
					<#-- В случае активации чекбокса отображается документ #commissionDocLoad-->
                    <@sf.checkbox path="form.correctCh" qtip=""  style="text-align:left;" colspan="1"/>
					
					<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#--<@sf.label path="form.childNote" title="<html><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></html>" required=false style="text-align:left;" colspan="48"/>-->
                        <@sf.statictext style="text-align:left;" colspan="48"><html><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></html></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.birthCertificateDocLoad" title="Свидетельство о рождении ребенка:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.birthCertificateDocLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.commissionDocLoad" title="Заключение  психолого-медико-педагогической комиссии:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                       <@sf.fileload path="form.commissionDocLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
