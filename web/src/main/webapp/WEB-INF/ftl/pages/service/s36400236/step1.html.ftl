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
    <@html.head title='Предоставление социальных выплат за счет средств областного бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений, при реализации областных целевых программ'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.setVisibleByValue 'true' 'catAppl' 'change' 'familyCh' '3'/>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<#-- Логика:
см. #incapable_enable-->
<@sf.label path="form.dov_enable" title="Заявление подает представитель заявителя, действующий на основании доверенности:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.dov_enable" qtip="Поставьте отметку, если заявление подается уполномоченным представителем. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность уполномоченного представителя, и документ, подтверждающий право уполномоченного представителя на совершение действий от имени заявителя."  style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Логика:
1. При деактивированных #dov_enable и #incapable_enable отображается ШАГ2  (Шаги 3,4,5,6 скрыт)
2. При активированном #dov_enable и деактивированном #incapable_enable отображается ШАГ3 (Шаги 2,4,5,6 скрыты)
3. При деактивированном #dov_enable и активированном #incapable_enable отображается ШАГ4,6 (Шаги 2,3,5 скрыты)
4. При одновременной активации чекбоксов #dov_enable и #incapable_enable отображается ШАГ5,6 (Шаги 2,3,4 скрыты )-->
<@sf.label path="form.incapable_enable" title="Заявитель представляет интересы недееспособного лица в качестве опекуна (попечителя):" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.incapable_enable" qtip="Поставьте отметку, если заявление подаёт опекун или попечитель. В этом случае необходимо внести в соответствующие поля сведения о заявителе и приложить документ, удостоверяющий личность опекуна (попечителя), и документ об установлении опеки (попечительства)."  style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 03_CATEGORY_APPL_64236
По умолчанию: не выбран
Логика:
1. при выборе значения 1 или 2 - отображается ШАГ 7
2. при выборе значения 3 - отображается #familyCh
3. при выборе значения 3 - отображается документ #workDocLoad на шаге 8-->
<@sf.label path="form.catAppl" title="Категория получателя услуги:" required=true style="text-align:left;" colspan="18"/>
<@sf.dictionaryLookup path="form.catAppl" dictionaryCode="03_CATEGORY_APPL_64236" qtip="" validation="required" style="text-align:left;" colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыт
Логика: 
отображается при выборе значения 3 в справочнике #catAppl
При отображении:
По умолчанию: не активирован
Логика:
1. При активации чекбокса отображается ШАГ7
2. При деактивации - ШАГ7 скрыт-->
<@sf.label path="form.familyCh" title="У получателя услуги имеется семья:" required=false style="text-align:left;" colspan="18"/>
<@sf.checkbox path="form.familyCh" qtip=""  style="text-align:left;" colspan="31"/>
					
						<@sf.empty colspan="29"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
