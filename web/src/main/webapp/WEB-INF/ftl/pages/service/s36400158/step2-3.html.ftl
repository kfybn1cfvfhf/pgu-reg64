<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подтверждение документов государственного образца об образовании, ученых степенях и ученых званиях'>
        <@script.scripttag>
            <@jquery.onready>
						<@customValidators.addCustomValidators />
           <@action.setVisibleByValue 'true' 'dovIdentityDocType' 'change' 'dovOtherDocTypeName' '5'/>
                <@action.unsetRequiredByField 'true' 'dovIdentityDocType' 'change' 'dovPassSeria' '2,5'/>
                <@action.applyValidationIf 'true' 'dovIdentityDocType' 'change' 'dovPassSeria' '1' 'digitsexact' '4'/>
                <@action.applyValidationIf onload='true' srcid='dovIdentityDocType' event='change' destid='dovPassSeria' value='3' rules='invaluelist'
                    validationAttr={"invaluelist":"80,81,82,83"}
                    validationMessage={"invaluelist":"Значение должно быть из списка: 80, 81, 82, 83"}/>
                <@action.applyValidationIf 'true' 'dovIdentityDocType' 'change' 'dovPassNo' '1' 'digitsexact' '6'/>
                <@action.applyValidationIf 'true' 'dovIdentityDocType' 'change' 'dovPassNo' '2,3' 'digitsexact' '7'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об уполномоченном представителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.dovLastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="required cyrillic"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.dovFirstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="required cyrillic"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.dovMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.dovMiddleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="cyrillic"  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о доверенности</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.dovPlace" title="Место составления:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.dovPlace" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.dovDate" title="Дата составления:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.datefield path="form.dovDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.dovSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.dovSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.dovNumber" title="Номер:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.dovNumber" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.dovRegNumber" title="Регистрационный номер:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.dovRegNumber" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность уполномоченного представителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovIdentityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup dictionaryCode="DUL_LS"  path="form.dovIdentityDocType" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovOtherDocTypeName" title="Название иного документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.dovOtherDocTypeName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovPassSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.dovPassSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovPassNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.dovPassNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovPassDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>

<@sf.datefield path="form.dovPassDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovPassFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>

<@sf.textarea path="form.dovPassFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.dovDovLoad" title="Нотариально заверенная доверенность на совершение действий от имени заявителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.dovDovLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.dovPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.dovPasLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
