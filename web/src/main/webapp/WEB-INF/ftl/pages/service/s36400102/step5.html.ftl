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
    <@html.head title='Выплата государственной социальной помощи малоимущим семьям и малоимущим одиноко проживающим гражданам'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='person1Clone' hideButtonSections='true'/>
                <@customValidators.addCustomValidators />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о членах семьи на которых запрашивается справка(ки) о нуждаемости в государственной социальной помощи</h2></@sf.statictext>
					
                </@sf.fldrow>
                <@sf.initAllClones formElement=form.fam1LastName cloneSectionClass='person1Clone' ; x>

                    <@sf.fldrow class="person1Clone">
                        <@sf.label path="form.fam1LastName" title="Фамилия:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield  path="form.fam1LastName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="person1Clone">
                        <@sf.label path="form.fam1FirstName" title="Имя:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.textfield  path="form.fam1FirstName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="30"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="person1Clone">
                        <@sf.label path="form.fam1MiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="18"/>
                        <@sf.textfield  path="form.fam1MiddleName[${x}]" class="clone-field" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"  style="text-align:left;" colspan="30"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="person1Clone">
                        <@sf.label path="form.socSupport" title="Мера социальной поддержки:" required=true style="text-align:left;" colspan="18"/>
                        <@sf.checkboxLookup path="form.socSupport[${x}]" dictionaryCode="03_SOC_SUPPORT_64102" class="clone-field" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="person1Clone">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
