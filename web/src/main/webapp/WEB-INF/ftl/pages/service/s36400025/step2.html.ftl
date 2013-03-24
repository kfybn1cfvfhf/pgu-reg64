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
    <@html.head title='Содействие гражданам в поиске подходящей работы'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.setDisabledByValue onload='true' srcid='ObrLanguage' event='change' destid='ObrLangName' value='off' />
                <@action.setDisabledByValue onload='true' srcid='ObrDriver' event='change' destid='ObrDriverCat' value='off' />

                <@action.unsetRequiredByField 'true' 'ObrType' 'change' 'ObrYear' '1' />
                <@action.unsetRequiredByField 'true' 'ObrType' 'change' 'ObrProfByObr' '1,2,3' />

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  >


                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения об образовании</h2></@sf.statictext>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Образование:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.dictionaryLookup path="form.ObrType" dictionaryCode="KIND_OF_FORMATION" qtip="" validation="required" style="text-align:left;" colspan="20"/>

						<@sf.empty colspan="32"/>
					
                </@sf.fldrow>


                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.label title="Учебное заведение:" required=false style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.textfield  path="form.ObrOrg" qtip="" style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="1"/>
					
                        <@sf.label path="form.ObrYear" title="Год окончания:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>

                        <@sf.datefieldYear path="form.ObrYear"  qtip="" validation="required" fromYear="${(cDate?string('yyyy'))?number}" toYear="${(cDate?string('yyyy'))?number-60}" style="text-align:left;" colspan="6"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
		
		
		        <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label path="form.ObrProfByObr" title="Профессия (специальность), квалификация (по образованию):" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ObrProfByObr" qtip="" validation="required" style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="32"/>
					
                </@sf.fldrow>
		
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Основная профессия (специальность), квалификация, должность:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ObrProfMain" qtip="" validation="required" style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Стаж осн.:" required=true style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ObrProfMainExp" qtip="Количество полных лет" validation="fractcount required" validationattr={"fractcount":"0"} style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дополнительная профессия (специальность), квалификация, должность:" style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ObrProfExtra" qtip="" style="text-align:left;" colspan="20"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Стаж доп.:" style="text-align:right;" colspan="8"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ObrProfExtraExp" qtip="Количество полных лет" validation="fractcount" validationattr={"fractcount":"0"} style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="12"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Дополнительные навыки</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>


                <@sf.fldrow>
					
                        <@sf.empty colspan="9"/>

                        <@sf.checkbox path="form.ObrLanguage" qtip=""  style="text-align:left;" colspan="1"/>


                        <@sf.label title="Знание иностранного языка" required=false style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Язык" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.ObrLangName" qtip=""  style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="17"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
                        <@sf.empty colspan="9"/>

                        <@sf.checkbox path="form.ObrPC" qtip=""  style="text-align:left;" colspan="1"/>

                        <@sf.label title="Знание и умение пользоваться ЭВМ" required=false style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="37"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
                        <@sf.empty colspan="9"/>

                        <@sf.checkbox path="form.ObrDriver" qtip=""  style="text-align:left;" colspan="1"/>

                        <@sf.label title="Наличие водительского удостоверения" required=false style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <@sf.label title="Категории" required=false style="text-align:right;" colspan="8"/>

                        <@sf.empty colspan="1"/>

                        <@sf.textfield  path="form.ObrDriverCat" qtip=""  style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="17"/>
					
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
