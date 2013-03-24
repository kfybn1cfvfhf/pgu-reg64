<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<#import "/custom/actions.ftl" as customActions>
<#import '/utils.ftl' as util>
<#import "../../../macros/address.ftl" as address>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление фармацевтической деятельности для ИП'>
        <@script.scripttag>
            <@jquery.onready>
                <@validators.addCustomValidators/>
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
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Сведения о лицензиате (индивидуальном предпринимателе)</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Фамилия, имя, отчество (если имеется) индивидуального предпринимателя:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fio_boss" qtip="" validation="required" attr='readonly="true"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="25"/>
						<@sf.empty colspan="10"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Адрес места жительства индивидуального предпринимателя:</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='addressCountry' countryCode='addressCountryCode' input='addressEnterType'
                country_input='addressCountryInput' settlementRF='addressSettlementDict' streetRF='addressStreetDict'
                area='addressRayon' region='addressRegion' settlement_type='addressSettlementType'
                country_settlement='addressCountrySettlement' settlement='addressSettlementText' city='addressCity'
                street='addressStreetText' house='addressHouse' corp='addressKorpus' office='addressFlat' post="addressIndex"  />
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА, с возможностью правки, валидатор - телефон-->
                        <@sf.label title="Контактный телефон индивидуального предпринимателя:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА, с возможностью правки, валидатор - телефон-->
                        <@sf.textfield  path="form.ip_phone" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."  validation="required phone" style="text-align:left;" colspan="25"/>
						<@sf.empty colspan="10"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Адрес электронной почты индивидуального предпринимателя:" required=false style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ip_email" qtip=""  style="text-align:left;" colspan="25" validation="email"/>
						<@sf.empty colspan="10"/>

						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.statictext style="text-align:left;" colspan="46"><h2>Документ, удостоверяющий личность индивидуального предпринимателя</h2></@sf.statictext>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.label title="Тип документа:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->

                        <@sf.customLookup  controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'} path="form.doc_type" qtip="" validation="required" style="text-align:left;" colspan="25"/>
						<@sf.empty colspan="10"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.label title="Серия и номер документа:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.textfield  path="form.doc_num" qtip="Вносится в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
						<@sf.empty colspan="10"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.label title="Дата выдачи документа:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.datefield path="form.doc_date"  qtip="" validation="required" style="text-align:left;" colspan="8"/>
						<@sf.empty colspan="17"/>
						<@sf.empty colspan="10"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.label title="Наименование органа, выдавшего документ:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные СИА: Если чек-бокс «Совпадает с ФИО Заявителя» отмечен, поля заполняются автоматически данными из ЛК и недоступны для изменения, в противном случае поля  доступны для изменения-->
                        <@sf.textarea path="form.doc_org" qtip="" validation="required" style="text-align:left;" colspan="35"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
