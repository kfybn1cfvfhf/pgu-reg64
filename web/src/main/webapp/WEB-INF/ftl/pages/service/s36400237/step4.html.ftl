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
    <@html.head title='Выплата ежемесячной денежной выплаты на оплату жилого помещения и коммунальных услуг ветеранам и лицам, пострадавшими от политических репрессий'>
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

            <@action.setVisibleByValue 'true' 'seatApplicant' 'change' 'registrationCertificateLoad' 'on'/>
            <@action.setVisibleByValue 'true' 'seatApplicant' 'change' 'registrationCertificateLoad-label' 'on'/>

            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'certificateVeteranLoad' '2,3'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'politicalRepressionLoad' '6'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'pensionCertificateLoad' '1,2,3,4'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'certificateVeteranLoad-label' '2,3'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'politicalRepressionLoad-label' '6'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'pensionCertificateLoad-label' '1,2,3,4'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'docMvLabel' '5'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'certificateRehabilitationLoad' '5'/>
            <@action.setVisibleByValue 'true' 'preferentialStatus' 'change' 'certificateRehabilitationLoad-label' '5'/>

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
					
						<@sf.label path="form.seatApplicant" title="Заявитель обращается за назначением ежемесячной денежной выплаты по месту пребывания:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.checkbox path="form.seatApplicant" qtip="" validation="required" style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="30"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.preferentialStatus" title="Льготный статус:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.dictionaryLookup path="form.preferentialStatus" dictionaryCode="64_PREFERENT_STATUS_64237" qtip="Указать в случае наличия льготный статус заявителя" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.accrualMethod" title="Способ начисления компенсации:" required=true style="text-align:left;" colspan="17"/>

<@sf.dictionaryLookup path="form.accrualMethod" dictionaryCode="03_WAY_BENEFIT_64206" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.statictext style="text-align:left;" attr="id='bankingDetailsLabel'" colspan="48"><h2>Сведения о банковских реквизитах</h2></@sf.statictext>
					
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

<@sf.statictext style="text-align:left;" attr="id='addressBenefitLabel'" colspan="48"><h2>Сведения о почтовом отделении</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

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

<@sf.label path="form.registrationCertificateLoad" title="Свидетельство о регистрации по месту пребывания:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.registrationCertificateLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.certificateVeteranLoad" title="Удостоверение ветерана:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.certificateVeteranLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.politicalRepressionLoad" title="Справка о признании пострадавшим от политических репрессий:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.politicalRepressionLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.pensionCertificateLoad" title="Пенсионное удостоверение:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.pensionCertificateLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.houseBookLoad" title="Справка о составе семьи (или домовая книга):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.houseBookLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.statictext style="text-align:left;" attr="id='docMvLabel'" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.certificateRehabilitationLoad" title="Справка о реабилитации:" required=false style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.fileload path="form.certificateRehabilitationLoad" qtip=""  fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
                         <@sf.empty colspan="1"/>
					    <@sf.checkbox path="form.agreementApplicant" qtip="" validation="required" style="text-align:left;" colspan="2"/>
						<@sf.label path="form.agreementApplicant" title="Я ознакомлен (а) с обстоятельствами, влекущими прекращение  ежемесячной денежной выплаты (изменение состава семьи), и обязуюсь своевременно (в течении одного месяца) известить об их наступлении. В случае переплаты, возникшей вследствие предоставления документов с заведомо неверными сведениями, сокрытия данных, влияющих на право назначения выплаты и ее размеры, обязуюсь вернуть денежные средства в соответствии с действующим законодательством:" required=true style="text-align:left;" colspan="41"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
