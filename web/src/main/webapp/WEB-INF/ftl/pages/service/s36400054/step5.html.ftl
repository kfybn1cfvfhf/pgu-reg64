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
    <@html.head title='Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'addressBenefit' '1'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'nameBankBenefit' '2'/>
                <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'bankinfo_static' '2'/>
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

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о способе перечисления социальной
                        выплаты</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- 03_METHOD_ DELIVERY_BENEFIT_64
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
                    <@sf.label path="form.wayBenefit" title="Способ перечисления социальной выплаты:" required=true style="text-align:left;" colspan="17"/>

                <#-- 03_METHOD_ DELIVERY_BENEFIT_64
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
                    <@sf.dictionaryLookup path="form.wayBenefit" dictionaryCode="03_METHOD_DELIVERY_BENEFIT_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
1. Через организацию федеральной почтовой связи-->
                    <@sf.label path="form.addressBenefit" title="Номер почтового отделения, на которое будет осуществляться перечисление социальной выплаты:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
1. Через организацию федеральной почтовой связи-->
                    <@sf.textarea path="form.addressBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение-->
                    <@sf.statictext attr='id="bankinfo_static"' style="text-align:left;" colspan="48"><h2>Сведения о кредитной организации и номер
                        лицевого счета заявителя</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение-->
                    <@sf.label path="form.nameBankBenefit" title="Наименование кредитной организации:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение-->
                    <@sf.textfield  path="form.nameBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение-->
                    <@sf.label path="form.filialBankBenefit" title="Наименование филиала и/или номер отделения:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение-->
                    <@sf.textfield  path="form.filialBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXX, где X - одна обязательная цифра (9 цифр)-->
                    <@sf.label path="form.bikBankBenefit" title="Банковский идентификационный код:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXX, где X - одна обязательная цифра (9 цифр)-->
                    <@sf.textfield  path="form.bikBankBenefit" qtip="Вносится в формате XXXXXXXXX, где X - одна обязательная цифра (9 цифр)" validation="digitsexact required" validationattr={'digitsexact':9} style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->
                    <@sf.label path="form.corrAccBankBenefit" title="Корреспондентский счет:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->
                    <@sf.textfield  path="form.corrAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)"  validation="digitsexact required" validationattr={'digitsexact':20}  style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)-->
                    <@sf.label path="form.codeFilialBankBenefit" title="Код подразделения:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)-->
                    <@sf.textfield  path="form.codeFilialBankBenefit" qtip="Вносится в формате XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)" validation="digitsexact required" validationattr={'digitsexact':12} style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->
                    <@sf.label path="form.clientAccBankBenefit" title="Номер лицевого счета:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыто
Логика: отображается в случае выбора значения справочника #wayBenefit
2. Через кредитное учреждение
Валидатор: XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)-->
                    <@sf.textfield  path="form.clientAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="digitsexact required" validationattr={'digitsexact':20} style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Соглашение</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.agree" title="Ранее социальную выплату на обустройство предоставленного жилого помещения в соответствии указанным Законом области я не получал(а). О последствиях предоставления документов с заведомо неверными сведениями, сокрытия данных, влияющих на право предоставления социальной выплаты, предупрежден(а):" required=true style="text-align:left;" colspan="17"/>

                    <@sf.checkbox path="form.agree" qtip="" validation="required" style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
