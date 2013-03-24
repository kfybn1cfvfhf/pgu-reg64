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
    <@html.head title='Выдача градостроительных планов земельных участков'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.cloneFormRowWithArrays clonesectionclass='ul_owner_clone' hideButtonSections='true'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>

                <@sf.initAllClones formElement=form.ul_owner_FullTitle cloneSectionClass='ul_owner_clone' ; x>


                    <@sf.fldrow class="ul_owner_clone"><@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о правообладателе земельного участка</h2></@sf.statictext></@sf.fldrow>

                <@sf.fldrow class="ul_owner_clone">
                    <@sf.label path="form.ul_owner_FullTitle" title="Полное наименование организации:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.ul_owner_opf[${x}]" class="clone-field" dictionaryCode="FORM_OF_INCORPORATION_64" qtip="Организационно-правовая форма" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
                <@sf.fldrow class="ul_owner_clone">
                    <@sf.empty colspan="17" />
                    <@sf.textarea path="form.ul_owner_FullTitle[${x}]" class="clone-field" qtip="Наименование организации" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_addressUr" title="Юридический адрес организации:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.ul_owner_addressUr[${x}]" class="clone-field" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_addressPost" title="Почтовый адрес организации:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.ul_owner_addressPost[${x}]" class="clone-field" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield path="form.ul_owner_phone[${x}]" class="clone-field" validation="phone required" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_fax" title="Факс:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield path="form.ul_owner_fax[${x}]" class="clone-field" validation="required phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textfield path="form.ul_owner_email[${x}]" class="clone-field" validation="email" qtip="Вносится в формате: name@site.domain" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о руководителе организации</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_Name" title="Фамилия, имя, отчество:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.ul_owner_Name[${x}]" class="clone-field" validation="cyrillic required" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о регистрации юридического лица</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_InnUl" title="Индивидуальный номер налогоплательщика (ИНН):" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield path="form.ul_owner_InnUl[${x}]" class="clone-field" validation="digitsexact required" validationattr={'digitsexact':10} qtip="Вносится в формате: XXXXXXXXXX, где X - одна обязательная цифра (10 цифр)" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow class="ul_owner_clone">
					
						<@sf.label path="form.ul_owner_OgrnUl" title="Основной государственный регистрационный номер юридического лица (ОГРН):" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield path="form.ul_owner_OgrnUl[${x}]" class="clone-field" validation="digitsexact required" validationattr={'digitsexact':13} qtip="Вносится в формате: XXXXXXXXXXXXX, где X – одна обязательная цифра (13 цифр)" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow >

                <@sf.fldrow class="ul_owner_clone">
                    <@sf.addRemoveButton addTitle="Добавить сведения о правообладателе земельного участка" delTitle="Удалить"  colspan="48"/>
                </@sf.fldrow>

                </@sf.initAllClones>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
