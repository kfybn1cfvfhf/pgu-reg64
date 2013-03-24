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
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<#-- При активации отображается ШАГ3 (Шаги 2,4,5,6 скрыты)
                    При деактивации отображается ШАГ2  (Шаги 3,4,5,6 скрыт)
                    При одновременной активации чекбоксов #dov_enable и #incapable_enable отображается ШАГ5,6 (Шаги 2,3,4 скрыты )-->

                    <@sf.label path="form.dov_enable" title="Заявление подаёт уполномоченный представитель:" required=false style="text-align:left;" colspan="18"/>

                    <@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается уполномоченным представителем. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность уполномоченного представителя, и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- При активации отображается ШАГ4,6 (Шаги 2,3,5 скрыты)
                    При одновременной активации чекбоксов #dov_enable и #incapable_enable отображается ШАГ5,6 (Шаги 2,3,4 скрыты )-->

                    <@sf.label path="form.incapable_enable" title="Заявление подаёт опекун (попечитель):" required=false style="text-align:left;" colspan="18"/>

                    <@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подаёт опекун или попечитель. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность опекуна (попечителя), и документ об установлении опеки (попечительства)."  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
