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
    <@html.head title='Организация отдыха и оздоровления детей, находящихся в трудной жизненной ситуации, проживающих на территории Саратовской области'>
        <@script.scripttag>
            <@jquery.onready>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Дополнительные сведения</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_ORGANIZATION_RECREATION_64053

Значения:

1. Предоставление выдачи путевки в Организации отдыха и оздоровления
2. Зачисление Социозащитным учреждением ребенка в лагерь с дневным пребыванием

Логика:
При выборе значения 1 код цели заменяется на статичный код 36400053-1
При выборе значения 2 код цели заменяется на статичный код 36400053-2-->
<@sf.label path="form.organizationRecreation" title="Выбор цели обращения заявителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_ORGANIZATION_RECREATION_64053

Значения:

1. Предоставление выдачи путевки в Организации отдыха и оздоровления
2. Зачисление Социозащитным учреждением ребенка в лагерь с дневным пребыванием

Логика:
При выборе значения 1 код цели заменяется на статичный код 36400053-1
При выборе значения 2 код цели заменяется на статичный код 36400053-2-->
<@sf.dictionaryLookup path="form.organizationRecreation" dictionaryCode="64_ORGANIZATION_RECREATION_64053" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_SEASON_RECOVERY_64053

Значения:

1. Весна
2. Лето
3. Осень
4. Зима-->
<@sf.label path="form.seasonRecovery" title="Желаемый сезон оздоровления:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_SEASON_RECOVERY_64053

Значения:

1. Весна
2. Лето
3. Осень
4. Зима-->
<@sf.dictionaryLookup path="form.seasonRecovery" dictionaryCode="64_SEASON_RECOVERY_64053" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.landAvailability" title="Наличие земельного участка (га):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.landAvailability" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.beesAvailability" title="Наличие пчелосемей (шт):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.beesAvailability" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.livestockAvailability" title="Наличие крупного рогатого скота (шт):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.livestockAvailability" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.pigsAvailability" title="Наличие свиней (шт):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.pigsAvailability" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.sheepAvailability" title="Наличие овец (шт):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.sheepAvailability" qtip="" validation="required"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.chickensAvailability" title="Наличие кур (шт):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.chickensAvailability" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>За три предыдущих месяца до подачи заявления реализовано:</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.livestockMeat" title="Мясо крупного рогатого скота (кг):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.livestockMeat" qtip=""  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.pigsMeat" title="Мясо свиней (кг):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.pigsMeat" qtip="" validation="required"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.sheepMeat" title="Мясо овец (кг):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.sheepMeat" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.chickensMeat" title="Мясо кур (кг):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.chickensMeat" validation="required" qtip=""  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.milk" title="Молока (л):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.milk" qtip="" validation="required"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.honey" title="Меда (кг):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.honey" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.potatoes" title="Картофеля (кг):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.potatoes" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.chickenEggs" title="Яиц куриных (шт):" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.chickenEggs" qtip="" validation="required"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Выбор органа социальной поддержки населения, предоставляющего государственную услугу</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 64_SOCIAL_SUPPORT_64053

Значения:

1. ГКУ СО «УСПН Александрово-Гайского района» 
2. ГКУ СО «УСПН Аркадакского района»
3. ГКУ СО «УСПН Аткарского района»
4. ГКУ СО « УСПН Базарно-Карабулакского района»
5. ГКУ СО «УСПН Балаковского района»
6. ГКУ СО «УСПН Балашовского района»
7. ГКУ СО «УСПН Балтайского района»
8. ГКУ СО «УСПН Вольского района»
9. ГБУ ЦСЗН Воскресенского района
10. ГКУ СО «УСПН Дергачевского района»
11. ГКУ СО «УСПН Духовницкого района» 
12. ГКУ СО «УСПН Екатериновского района» 
13. ГКУ СО «УСПН Ершовского района»
14. ГКУ СО «УСПН Ивантеевского района» 
15. ГБУ ЦСЗН Калининского района
16. ГКУ СО «УСПН Красноармейского района» 
17. ГКУ СО «УСПН Краснокутского района» 
18. ГКУ СО «УСПН Краснопартизанского района» 
19. ГКУ СО «УСПН Лысогорского района»
20. ГКУ СО «УСПН Марксовского района» 
21. ГКУ СО «УСПН Новобурасского района» 
22. ГКУ СО «УСПН Новоузенского района»
23. ГКУ СО «УСПН Озинского района»
24. ГКУ СО «УСПН Перелюбского района»
25. ГАУ СО УСПН Петровского района
26. ГКУ СО «УСПН Питерского района»
27. ГКУ СО «УСПН Пугачевского района»
28. ГКУ СО «УСПН Ровенского района»
29. ГБУ ЦСЗН Романовского района»
30. ГКУ СО «УСПН Ртищевского района»
31. ГКУ СО «УСПН Самойловского района»
32. ГКУ СО «УСПН Саратовского района»
33. ГКУ СО «УСПН Советского района»
34. ГКУ СО «УСПН Татищевского района» 
35. ГКУ СО «УСПН Турковского района»
36. ГКУ СО «УСПН Федоровского района»
37. ГКУ СО «УСПН Хвалынского района»
38. ГКУ СО «УСПН Энгельсского района
39. ГКУ СО «Комитет социальной поддержки населения г. Саратова»-->
<@sf.label path="form.socialSupport" title="Орган социальной поддержки населения, предоставляющий государственную услугу:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- 64_SOCIAL_SUPPORT_64053

Значения:

1. ГКУ СО «УСПН Александрово-Гайского района» 
2. ГКУ СО «УСПН Аркадакского района»
3. ГКУ СО «УСПН Аткарского района»
4. ГКУ СО « УСПН Базарно-Карабулакского района»
5. ГКУ СО «УСПН Балаковского района»
6. ГКУ СО «УСПН Балашовского района»
7. ГКУ СО «УСПН Балтайского района»
8. ГКУ СО «УСПН Вольского района»
9. ГБУ ЦСЗН Воскресенского района
10. ГКУ СО «УСПН Дергачевского района»
11. ГКУ СО «УСПН Духовницкого района» 
12. ГКУ СО «УСПН Екатериновского района» 
13. ГКУ СО «УСПН Ершовского района»
14. ГКУ СО «УСПН Ивантеевского района» 
15. ГБУ ЦСЗН Калининского района
16. ГКУ СО «УСПН Красноармейского района» 
17. ГКУ СО «УСПН Краснокутского района» 
18. ГКУ СО «УСПН Краснопартизанского района» 
19. ГКУ СО «УСПН Лысогорского района»
20. ГКУ СО «УСПН Марксовского района» 
21. ГКУ СО «УСПН Новобурасского района» 
22. ГКУ СО «УСПН Новоузенского района»
23. ГКУ СО «УСПН Озинского района»
24. ГКУ СО «УСПН Перелюбского района»
25. ГАУ СО УСПН Петровского района
26. ГКУ СО «УСПН Питерского района»
27. ГКУ СО «УСПН Пугачевского района»
28. ГКУ СО «УСПН Ровенского района»
29. ГБУ ЦСЗН Романовского района»
30. ГКУ СО «УСПН Ртищевского района»
31. ГКУ СО «УСПН Самойловского района»
32. ГКУ СО «УСПН Саратовского района»
33. ГКУ СО «УСПН Советского района»
34. ГКУ СО «УСПН Татищевского района» 
35. ГКУ СО «УСПН Турковского района»
36. ГКУ СО «УСПН Федоровского района»
37. ГКУ СО «УСПН Хвалынского района»
38. ГКУ СО «УСПН Энгельсского района
39. ГКУ СО «Комитет социальной поддержки населения г. Саратова»-->
<@sf.dictionaryLookup path="form.socialSupport" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать один из органов социальной поддержки населения, в который обращается заявитель" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
