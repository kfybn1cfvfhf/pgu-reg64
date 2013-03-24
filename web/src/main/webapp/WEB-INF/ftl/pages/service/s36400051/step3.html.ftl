<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../custom/validators.ftl" as validators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление документа, подтверждающего наличие лицензии на осуществление фармацевтической деятельности для ИП'>
        <@script.scripttag>
            <@jquery.onready>
			    <@validators.addCustomValidators/>
                $('#lic_reason').parent().find('.radioText').css('float','none').css('width','610px');
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
					
						<@sf.label title="Серия и номер действующей лицензии:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.lic_num" qtip="Вносится в формате серия-номер" validation="required licenseSeriaNumberValidator" style="text-align:left;" colspan="25"/>
					
						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Дата начала действия текущей лицензии:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.datefield path="form.lic_start"  qtip="" validation="required" style="text-align:left;" colspan="8"/>
                        <@sf.empty colspan="17"/>

						<@sf.empty colspan="11"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<@sf.label title="Наименование лицензирующего органа, выдавшего лицензию:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.lic_org" qtip="" validation="required" style="text-align:left;" colspan="36"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.empty colspan="1"/>
					
						<#-- Выбирается из справочника «Причины переоформления лицензии на медицинскую деятельность для индивидуальных предпринимателей». ШАГ 4. Прикрепление электронных копий документов в случае  намерения лицензиата осуществлять медицинскую деятельность по адресам не указанным в лицензии. ШАГ 5. Внесение электронных копий документов и сведений в случае изменения имени, места жительства или реквизитов документа, удостоверяющего личность индивидуального предпринимателя  ШАГ 6. Электронные копии документов, требующихся в случае прекращения деятельности по одному или нескольким адресам мест ее осуществления ШАГ 7. Электронные копии документов, требующихся при намерении лицензиата внести изменения в перечень выполняемых работ (услуг) по одному или нескольким адресам мест ее осуществления ШАГ 8. Электронные копии документов, требующихся в случае изменения перечня выполняемых работ (услуг)  с целью прекращения  по одному или нескольким адресам мест ее осуществления-->
                        <@sf.label title="Причина переоформления:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Выбирается из справочника «Причины переоформления лицензии на медицинскую деятельность для индивидуальных предпринимателей». ШАГ 4. Прикрепление электронных копий документов в случае  намерения лицензиата осуществлять медицинскую деятельность по адресам не указанным в лицензии. ШАГ 5. Внесение электронных копий документов и сведений в случае изменения имени, места жительства или реквизитов документа, удостоверяющего личность индивидуального предпринимателя  ШАГ 6. Электронные копии документов, требующихся в случае прекращения деятельности по одному или нескольким адресам мест ее осуществления ШАГ 7. Электронные копии документов, требующихся при намерении лицензиата внести изменения в перечень выполняемых работ (услуг) по одному или нескольким адресам мест ее осуществления ШАГ 8. Электронные копии документов, требующихся в случае изменения перечня выполняемых работ (услуг)  с целью прекращения  по одному или нескольким адресам мест ее осуществления-->

                        <@sf.radiogroup path="form.lic_reason" dictionaryCode="CHANGE_MED_REASON_IP" qtip="" validation="required" style="text-align:left;" colspan="36" mode="horizontal"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.empty colspan="1"/>

						<@sf.label title="Данные документа (вид, название, дата издания и номер), являющегося основанием для переоформления документа, подтверждающего наличие лицензии:" style="text-align:left;" colspan="10"/>

						<@sf.empty colspan="1"/>

						<@sf.textarea path="form.lic_basic" qtip="" style="text-align:left;" colspan="36"/>

                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
