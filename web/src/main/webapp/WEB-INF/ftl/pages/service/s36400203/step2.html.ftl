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
    <@html.head title='Возмещение дополнительных расходов на погребение гражданам, осуществляющим захоронение умерших реабилитированных лиц'>
        <@script.scripttag>
            <@jquery.onready>

                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'bankingDetailsLabel' '1'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'nameBankBenefit' '1'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'filialBankBenefit' '1'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'bikBankBenefit' '1'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'corrAccBankBenefit' '1'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'codeFilialBankBenefit' '1'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'clientAccBankBenefit' '1'/>

                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'addressBenefitLabel' '2'/>
                <@action.setVisibleByValue 'true' 'accrualMethod' 'change' 'postOffice' '2'/>


            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Дополнительные сведения, необходимые для предоставления услуги</h2></@sf.statictext>
					
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
           <@sf.dictionaryLookup path="form.socialSupport" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать один из органов социальной поддержки населения, в который обращается заявитель" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- 03_WAY_BENEFIT_64206

Значения:

1. На расчётный счет
2. Посредством отделения почтовой связи-->
<@sf.label path="form.accrualMethod" title="Способ начисления возмещения дополнительных расходов на погребение:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.accrualMethod" dictionaryCode="03_WAY_BENEFIT_64206" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: 
1. Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"
2. Скрывается в случае выбора в параметре #accrualMethod значения "2. Посредством отделения почтовой связи-->
<@sf.statictext attr='id="bankingDetailsLabel"' style="text-align:left;" colspan="48"><h2>Сведения о банковских реквизитах</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"-->
<@sf.label path="form.nameBankBenefit" title="Наименование кредитной организации:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.nameBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"-->
<@sf.label path="form.filialBankBenefit" title="Наименование филиала и/или номер отделения:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.filialBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"

Валидатор: XXXXXXXXX, где X - одна обязательная цифра (9 цифр)-->
<@sf.label path="form.bikBankBenefit" title="Банковский идентификационный код:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.bikBankBenefit" qtip="Вносится в формате XXXXXXXXX, где X - одна обязательная цифра (9 цифр)" validation="digitsexact required" validationattr={'digitsexact':9} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"

Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->
<@sf.label path="form.corrAccBankBenefit" title="Корреспондентский счет:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.corrAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="digitsexact required" validationattr={'digitsexact':20} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"

Валидатор: XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)-->
<@sf.label path="form.codeFilialBankBenefit" title="Код подразделения:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.codeFilialBankBenefit" qtip="Вносится в формате XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)" validation="digitsexact required" validationattr={'digitsexact':12} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: Отображается в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"

Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->
<@sf.label path="form.clientAccBankBenefit" title="Номер лицевого счета:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.clientAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="digitsexact required" validationattr={'digitsexact':20} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию: скрыто
Логика: 
1. отображается в случае выбора значения справочника #accrualMethod значения "2. Посредством отделения почтовой связи"
2. скрывается  в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"-->
<@sf.statictext attr='id="addressBenefitLabel"' style="text-align:left;" colspan="48"><h2>Сведения о почтовом отделении</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- По умолчанию: скрыто
Логика:
1. отображается в случае выбора значения справочника #accrualMethod значения "2. Посредством отделения почтовой связи"
2. скрывается  в случае выбора в параметре #accrualMethod значения "1. На расчётный счет"-->
<@sf.label path="form.postOffice" title="Номер почтового отделения:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.postOffice" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.rehabilitationCertificateLoad" title="Справка о реабилитации умершего (копия):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.rehabilitationCertificateLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.deathCertificateLoad" title="Свидетельство о смерти (копия):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.deathCertificateLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.label path="form.certificatePaymentLoad" title="Справка о произведенной выплате социального пособия на погребение:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
<@sf.fileload path="form.certificatePaymentLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
