<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выплата ежемесячной денежной выплаты на оплату жилого помещения и коммунальных услуг отдельным категориям граждан в Саратовской области'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="bankingDetailsLabel"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="1" destid="nameBankBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="nameBankBenefit" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="1" destid="filialBankBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="filialBankBenefit" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="1" destid="bikBankBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="bikBankBenefit" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="1" destid="corrAccBankBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="corrAccBankBenefit" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="1" destid="codeFilialBankBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="codeFilialBankBenefit" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="1" destid="clientAccBankBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="1" destid="clientAccBankBenefit" scope="LBL+EL+ROW"/>

                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="2" destid="addressBenefitLabel"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="2" destid="addressPostIndexBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="2" destid="addressPostIndexBenefit" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="accrualMethod" event="change" value="2" destid="addressPostCountryBenefit"  />
                <@action.setVisibleByValue onload="true"  srcid="accrualMethod" event="change" value="2" destid="addressPostCountryBenefit" scope="LBL+EL+ROW"/>

                <@action.setVisibleByValue onload="true"  srcid="seatApplicant" event="change" value="on" destid="registrationCertificateLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="seatApplicant" event="change" value="on" destid="registrationCertificateLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27" destid="identitySingleSampleLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27" destid="identitySingleSampleLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="28,29" destid="disabilityDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="28,29" destid="disabilityDocLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="29" destid="birthCertificateLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="29" destid="birthCertificateLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="30" destid="medicalCommissionLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="30" destid="medicalCommissionLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="centralHeating" event="change" value="2" destid="technicalCertificateLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="centralHeating" event="change" value="2" destid="technicalCertificateLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27" destid="oldContractPrivatizationLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27" destid="oldContractPrivatizationLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="28,29" destid="oldLeaseAgreementLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="28,29" destid="oldLeaseAgreementLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27" destid="contractPrivatizationLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27" destid="contractPrivatizationLoad"  />
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="28,29" destid="leaseAgreementLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="28,29" destid="leaseAgreementLoad"  />

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
<@sf.dictionaryLookup path="form.preferentialStatus" dictionaryCode="64_PREFERENTIAL_STATUS_64053" qtip="Указать в случае наличия льготный статус заявителя" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.accrualMethod" title="Способ начисления компенсации:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.accrualMethod" dictionaryCode="03_WAY_BENEFIT_64206" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.statictext attr="id='bankingDetailsLabel'" style="text-align:left;" colspan="48"><h2>Сведения о банковских реквизитах</h2></@sf.statictext>
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
<@sf.textfield  path="form.bikBankBenefit" qtip="Вносится в формате XXXXXXXXX, где X - одна обязательная цифра (9 цифр)" validation="digitsexact required" validationattr={"digitsexact":"9"} style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.corrAccBankBenefit" title="Корреспондентский счет:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.corrAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="digitsexact required" validationattr={"digitsexact":"20"} style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.codeFilialBankBenefit" title="Код подразделения:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.codeFilialBankBenefit" qtip="Вносится в формате XXXXXXXXXXXX где X - одна обязательная цифра (12 цифр)" validation="digitsexact required" validationattr={"digitsexact":"12"} style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.clientAccBankBenefit" title="Номер лицевого счета:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.clientAccBankBenefit" qtip="Вносится в формате XXXXXXXXXXXXXXXXXXXX где X - одна обязательная цифра (20 цифр)" validation="digitsexact required" validationattr={"digitsexact":"20"} style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.statictext attr="id='addressBenefitLabel'" style="text-align:left;" colspan="48"><h2>Почтовый адрес, по которому будет осуществлятся доставка пособия</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap country='addressPostCountryBenefit' countryCode='addressPostCountryCodeBenefit' input='addressPostEnterTypeBenefit' country_input='addressPostCountryInputBenefit'
                settlementRF='addressPostSettlementDictBenefit' streetRF='addressPostStreetDictBenefit' area='addressPostRayonBenefit' region='addressPostRegionBenefit'
                settlement_type='addressPostSettlementTypeBenefit' country_settlement='addressPostCountrySettlementBenefit' settlement='addressPostSettlementTextBenefit' city='addressPostCityBenefit'
                street='addressPostStreetTextBenefit' house='addressPostHouseBenefit' corp='addressPostKorpusBenefit' flat='addressPostFlatBenefit' post="addressPostIndexBenefit"  />

                <@sf.fldrow>
<@sf.label path="form.centralHeating" title="Наличие в доме проживания центрального отопления:" required=true style="text-align:left;" colspan="17"/>
<@sf.radiogroup path="form.centralHeating" staticOpts={'1':' Имеется','2':'Отсутствует'} mode="horizontal" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.rightRegister" title="Право на недвижимое имущество зарегистрировано в Едином государственном реестре прав (ЕГРП):" required=true style="text-align:left;" colspan="17"/>
<@sf.radiogroup  path="form.rightRegister" staticOpts={'1':' Зарегистрировано','2':'Не зарегистрировано'} mode="horizontal" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.oldHousing" title="Жилое помещение относится к жилищному фонду РСФСР:" required=true style="text-align:left;" colspan="17"/>
<@sf.radiogroup  path="form.oldHousing" staticOpts={'1':' Относится','2':'Не относится'} mode="horizontal" qtip="" validation="required" style="text-align:left;" colspan="31"/>
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
<@sf.fileload path="form.registrationCertificateLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.identitySingleSampleLoad" title="Удостоверение единого образца:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.identitySingleSampleLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.disabilityDocLoad" title="Справка, подтверждающая факт установления инвалидности:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.disabilityDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.birthCertificateLoad" title="Свидетельство о рождении:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.birthCertificateLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.medicalCommissionLoad" title="Заключение врачебной комиссии для лиц в возрасте до 18 лет, зараженных вирусом иммунодефицита человека:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.medicalCommissionLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.houseBookLoad" title="Справка о составе семьи (или домовая книга):" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.fileload path="form.houseBookLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.technicalCertificateLoad" title="Документ, подтверждающий наличие у гражданина в доме печного отопления, или технический паспорт здания или строения:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.technicalCertificateLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.oldContractPrivatizationLoad" title="Договор приватизации жилого помещения или договор найма жилого помещения в домах государственного и муниципального жилищного фонда РСФСР:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.oldContractPrivatizationLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Необходимо приложить документ в случае, если жилое помещение относится к жилищному фонду РСФСР и право на недвижимое имущество зарегистрировано в Едином государственном реестре прав (ЕГРП)" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.oldLeaseAgreementLoad" title="Договор найма жилого помещения в домах государственного и муниципального жилищного фонда в РСФСР:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.oldLeaseAgreementLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Необходимо приложить документ в случае, если жилое помещение относится к жилищному фонду РСФСР и право на недвижимое имущество не зарегистрировано в Едином государственном реестре прав (ЕГРП)" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.contractPrivatizationLoad" title="Договор приватизации жилого помещения или договор социального найма жилого помещения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.contractPrivatizationLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.leaseAgreementLoad" title="Договор социального найма жилого помещения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.leaseAgreementLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.agreementApplicant" title="Я ознакомлен (а) с обстоятельствами, влекущими прекращение  ежемесячной денежной выплаты (изменение состава семьи), и обязуюсь своевременно (в течении одного месяца) известить об их наступлении. В случае переплаты, возникшей вследствие предоставления документов с заведомо неверными сведениями, сокрытия данных, влияющих на право назначения выплаты и ее размеры, обязуюсь вернуть денежные средства в соответствии с действующим законодательством:" required=true style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.agreementApplicant" qtip="" validation="required" style="text-align:left;" colspan="1"/>
						<@sf.empty colspan="30"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
