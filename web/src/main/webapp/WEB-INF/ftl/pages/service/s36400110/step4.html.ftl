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
    <@html.head title='Выплата ежемесячной денежной выплаты ветеранам труда, ветеранам труда Саратовской области, ветеранам военной и государственной службы, труженикам тыла, реабилитированным лицам и лицам, признанным пострадавшими от политических репрессий'>
        <@script.scripttag>
            <@jquery.onready>
			<@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'addressBenefit' '1'/>

            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'bankBenefitLabel' '2'/>
            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'nameBankBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'filialBankBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'bikBankBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'corrAccBankBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'codeFilialBankBenefit' '2'/>
            <@action.setVisibleByValue 'true' 'wayBenefit' 'change' 'clientAccBankBenefit' '2'/>

            <@action.setVisibleByValue 'true' 'wayService' 'change' 'svidRegDocLoad' '2'/>
            <@action.setVisibleByValue 'true' 'wayService' 'change' 'svidRegDocLoad-label' '2'/>

            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'udostVeteranDocLoad' '1,3,4'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'udostVeteranSODocLoad' '2'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'veteranVOVDocLoad' '7'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'spravPostradRepresDocLoad' '6'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'pensiaDocLoad' '1'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'reabilDocLoad' '5'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'udostVeteranDocLoad-label' '1,3,4'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'udostVeteranSODocLoad-label' '2'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'veteranVOVDocLoad-label' '7'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'spravPostradRepresDocLoad-label' '6'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'pensiaDocLoad-label' '1'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'reabilDocLoad-label' '5'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'svedlabel' '5'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'vnimLabel' '1,2,3,4,5,6,7'/>
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
					

<@sf.label path="form.socialSupport" title="Орган социальной поддержки населения, предоставляющий государственную услугу:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.socialSupport" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать один из органов социальной поддержки населения, в который обращается заявитель" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
<@sf.label path="form.preferentialStatus" title="Льготный статус:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.preferentialStatus" dictionaryCode="64_PREFERENTIAL_STATUS_64110" qtip="Указать в случае наличия льготный статус заявителя" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.wayService" title="Прошу предоставить денежную выплату на оплату жилого помещения и коммунальных услуг:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.wayService" dictionaryCode="03_METHOD_BENEFIT_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.empty colspan="1"/>

					    <@sf.checkbox path="form.agreementApplicant" qtip="" validation="required" style="text-align:left;" colspan="1"/>

						<@sf.label path="form.agreementApplicant" title="Я ознакомлен (а) с обстоятельствами, влекущими прекращение  ежемесячной денежной выплаты (изменение состава семьи), и обязуюсь своевременно (в течении одного месяца) известить об их наступлении. В случае переплаты, возникшей вследствие предоставления документов с заведомо неверными сведениями, сокрытия данных, влияющих на право назначения выплаты и ее размеры, обязуюсь вернуть денежные средства в соответствии с действующим законодательством:" required=true style="text-align:left;" colspan="51"/>


					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о способе перечисления социальной выплаты</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.wayBenefit" title="Способ перечисления социальной выплаты:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.wayBenefit" dictionaryCode="03_METHOD_DELIVERY_BENEFIT_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.addressBenefit" title="Номер почтового отделения на которое будет осуществлятся перечисление социальной выплаты:" required=true style="text-align:left;" colspan="17"/>

<@sf.textarea path="form.addressBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.statictext style="text-align:left;" attr="id='bankBenefitLabel'" colspan="48"><h2>Сведения о кредитной организации и номер лицевого счета заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.nameBankBenefit" title="Наименование кредитной организации:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.nameBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.filialBankBenefit" title="Наименование филиала и/или номер отделения:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.filialBankBenefit" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.bikBankBenefit" title="Банковский идентификационный код:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.bikBankBenefit" qtip="Вносится в формате XXXXXXXXX, где X - одна обязательная цифра (9 цифр)" validation="bikbank required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.corrAccBankBenefit" title="Корреспондентский счет:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.corrAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="ksbank required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.codeFilialBankBenefit" title="Код подразделения:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.codeFilialBankBenefit" qtip="Вносится в формате XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)" validation="required digitsexact" validationattr={"digitsexact":"12"} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.clientAccBankBenefit" title="Номер лицевого счета:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.clientAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="required digitsexact" validationattr={"digitsexact":"20"} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext attr="id='vnimLabel'" style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.svidRegDocLoad" title="Свидетельство о регистрации по месту пребывания:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.svidRegDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.udostVeteranDocLoad" title="Удостоверение ветерана:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.udostVeteranDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.udostVeteranSODocLoad" title="Удостоверение ветерана труда Саратовской области:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.udostVeteranSODocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.veteranVOVDocLoad"  title="Удостоверение ветерана Великой Отечественной войны или удостоверение о праве на льготы:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.veteranVOVDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.spravPostradRepresDocLoad" title="Справка о признании пострадавшим от политических репрессий:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.spravPostradRepresDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.pensiaDocLoad" title="Пенсионное удостоверение:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.pensiaDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" attr="id='svedlabel'" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.reabilDocLoad" title="Справка о реабилитации:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.reabilDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
