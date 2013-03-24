<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление лицензируемой деятельности для ЮЛ'>
        <@script.scripttag>
            <@jquery.onready>
			    <@validators.addCustomValidators/>
                $('#change_reason').parent().find('.radioText').css('float','none').css('width','610px');
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
					
						<#-- Валидатор серия-номер-->
                        <@sf.label title="Серия и номер действующей лицензии:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Валидатор серия-номер-->
                        <@sf.textfield  path="form.lic_num" qtip="Вноcится в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дата начала действия текущей лицензии:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.lic_date_st"  qtip="" validation="required" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="10"/>
						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Наименование лицензирующего органа, выдавшего лицензию:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.lic_org" qtip="" validation="required" style="text-align:left;" colspan="35"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Выбирается из справочника «Причины переоформления лицензии на лицензируемую деятельность для юридических лиц»(change_med_reason_org) В зависимости от выбранной причины происходит переход на один из шагов 4-8:-->
                        <@sf.label title="Причина переоформления:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Выбирается из справочника «Причины переоформления лицензии на лицензируемую деятельность для юридических лиц»(change_med_reason_org) В зависимости от выбранной причины происходит переход на один из шагов 4-8:-->

                        <@sf.radiogroup path="form.change_reason" dictionaryCode="CHANGE_MED_REASON_UL" qtip="" validation="required" style="text-align:left;" colspan="35" mode="horizontal"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
