<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача справок о составе семьи жителям частных жилых домов'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения, подверждающие полномочия опекуна или попечителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.dovOpekLoad" title="Документ, подтверждающий факт установления опеки (попечительства):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.fileload path="form.dovOpekLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о законном представителе лица, нуждающегося в услуге</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены.
Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>


                    <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                    <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>


                    <@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr="readonly='readonly'" wrapperClass="fieldDisabled" validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>


                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале.
Могут быть изменены в ходе заполнения формы заявления</i></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Контакты законного представителя лица, нуждающегося в услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.phone" title="Контактный телефон:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
