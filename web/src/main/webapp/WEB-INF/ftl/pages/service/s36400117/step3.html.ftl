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
    <@html.head title='Выплата социального пособия на погребение'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'addressBenefit' '1'/>

                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'bankBenefitLabel' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'nameBankBenefit' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'filialBankBenefit' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'bikBankBenefit' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'corrAccBankBenefit' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'codeFilialBankBenefit' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'clientAccBankBenefit' '2'/>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о способе перечисления социального пособия по погребение</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- 03_METHOD_DELIVERY_BENEFIT_64
                    1. Через организацию федеральной почтовой связи
                    #addressBenefit
                    2. Через кредитное учреждение
                    #bankBenefitLabel
                    #nameBankBenefit
                    #filialBankBenefit
                    #bikBankBenefit
                    #corrAccBankBenefit
                    #codeFilialBankBenefit
                    #clientAccBankBenefit-->

                    <@sf.label path="form.wayBenefit" title="Способ перечисления назначенного пособия:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup path="form.wayBenefit" dictionaryCode="03_METHOD_DELIVERY_BENEFIT_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    1. Через организацию федеральной почтовой связи-->

                    <@sf.label path="form.addressBenefit" title="Номер почтового отделения на которое будет осуществлятся перечисление социального пособия на погребение:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textarea path="form.addressBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение-->

                    <@sf.statictext attr="id='bankBenefitLabel'" style="text-align:left;" colspan="48"><h2>Сведения о кредитной организации и номер лицевого счета заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение-->

                    <@sf.label path="form.nameBankBenefit" title="Наименование кредитной организации:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.nameBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение-->

                    <@sf.label path="form.filialBankBenefit" title="Наименование филиала и/или номер отделения:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.filialBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение
                    Валидатор: XXXXXXXXX, где X - одна обязательная цифра (9 цифр)-->

                    <@sf.label path="form.bikBankBenefit" title="Банковский идентификационный код:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.bikBankBenefit" qtip="Вносится в формате XXXXXXXXX, где X - одна обязательная цифра (9 цифр)" validation="bikbank required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение
                    Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->

                    <@sf.label path="form.corrAccBankBenefit" title="Корреспондентский счет:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.corrAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="required ksbank" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение
                    Валидатор: XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)-->

                    <@sf.label path="form.codeFilialBankBenefit" title="Код подразделения:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.codeFilialBankBenefit" qtip="Вносится в формате XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)" validation="required digitsexact" validationattr={'digitsexact':12} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Логика: отображается в случае выбора значения справочника #wayBenefit
                    2. Через кредитное учреждение
                    Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->

                    <@sf.label path="form.clientAccBankBenefit" title="Номер лицевого счета:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.clientAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="required ksbank" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
