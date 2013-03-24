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
    <@html.head title='Прием заявлений на участие в общественных работах'>
        <@script.scripttag>
            <@jquery.onready>

				<#-- если флаг "Знание иностранного языка" опущен, на поле "Язык" включается режим "только для чтения"  -->
				<@action.setReadonlyByValue onload="true" srcid="obrLanguage" event="change" destid="obrLangName" value="off" />

				<#-- если флаг "Наличие водительского удостоверения" опущен, на поле "Категории" включается режим "только для чтения"  -->
				<@action.setReadonlyByValue onload="true" srcid="obrDriver" event="change" destid="obrDriverCat" value="off" />

                <@action.unsetRequiredByField onload="true" srcid="obrType" event="change" value="1" destid="obrYear" />
                <@action.unsetRequiredByField onload="true" srcid="obrType" event="change" value="1,2,3" destid="obrProf" />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >
				
                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения об образовании</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label title="Образование:" required=true style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.obrType" dictionaryCode="KIND_OF_FORMATION" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                        <@sf.label title="Учебное заведение:" required=false style="text-align:right;" colspan="18"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.obrOrg" qtip="" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                        <@sf.label title="Год окончания:" path="form.obrYear" required=true style="text-align:right;" colspan="18"/>

                        <@sf.empty colspan="1"/>

                        <#--<@sf.datefield path="form.obrYear" validation="required" qtip="Количество полных лет" style="text-align:left;" colspan="8"/>-->
				<@sf.datefieldYear path="form.obrYear"  qtip="" validation="required"  fromYear="${(cDate?string('yyyy'))?number}" toYear="${(cDate?string('yyyy'))?number-60}" style="text-align:left;" colspan="6"/>
                        <@sf.empty colspan="25"/>

                </@sf.fldrow>


                <@sf.fldrow>
					
						<@sf.label title="Профессия (специальность), квалификация (по образованию):" path="form.obrProfByObr" required=true style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.obrProfByObr" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Основная профессия (специальность), квалификация, должность:" required=true style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.obrProfMain" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Стаж осн.:" required=true style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					    
						<@sf.textfield  path="form.obrProfMainExp" qtip="Количество полных лет" validation="digits required" validationattr={"fractcount":"0"} style="text-align:left;" colspan="5"/>
						
					
						<@sf.empty colspan="26"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Дополнительная профессия (специальность), квалификация, должность:" required=false style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.obrProfExtra" qtip="" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Стаж доп.:" required=false style="text-align:right;" colspan="18"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.obrProfExtraExp" qtip="Количество полных лет" validation="digits" validationattr={"fractcount":"0"} style="text-align:left;" colspan="5"/>
						<@sf.empty colspan="26"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Дополнительные навыки</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Если стоит галочка, то становится доступным поле #ObrLangName. Если галочки нет, то поле #ObrLangName недоступно и его значение = “”-->
                        <@sf.label title="Знание иностранного языка:" required=false style="text-align:right;" colspan="18"/>

						<@sf.empty colspan="1"/>
					
						<#-- Если стоит галочка, то становится доступным поле #ObrLangName. Если галочки нет, то поле #ObrLangName недоступно и его значение = “”-->
                        <@sf.checkbox path="form.obrLanguage" qtip=""  style="text-align:left;" colspan="1"/>

						<@sf.empty colspan="1"/>
					
						<#-- Доступность поля управляется переменной #ObrLanguage-->
                        <@sf.label title="Язык:" required=false style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Доступность поля управляется переменной #ObrLanguage-->
                        <@sf.textfield  path="form.obrLangName" qtip=""  style="text-align:left;" colspan="17"/>
                        <@sf.empty colspan="12"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Знание и умение пользоваться ЭВМ:" required=false style="text-align:right;" colspan="18"/>

						<@sf.empty colspan="1"/>
					
						<@sf.checkbox path="form.obrPC" qtip=""  style="text-align:left;" colspan="1"/>

						<@sf.empty colspan="35"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Если стоит галочка, то становится доступным поле # ObrDriverCat. Если галочки нет, то поле # ObrDriverCat недоступно и его значение = “”-->
                        <@sf.label title="Наличие водительского удостоверения:" required=false style="text-align:right;" colspan="18"/>

						<@sf.empty colspan="1"/>
					
						<#-- Если стоит галочка, то становится доступным поле # ObrDriverCat. Если галочки нет, то поле # ObrDriverCat недоступно и его значение = “”-->
                        <@sf.checkbox path="form.obrDriver" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Доступность поля управляется переменной #ObrDriver-->
                        <@sf.label title="Категории:" required=false style="text-align:right;" colspan="4"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Доступность поля управляется переменной #ObrDriver-->
                        <@sf.textfield  path="form.obrDriverCat" qtip=""  style="text-align:left;" colspan="17"/>
                        <@sf.empty colspan="12"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
