<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выдача дубликата документа, подтверждающего наличие лицензии на фармацевтическую деятельность'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setRequiredIf 'true' 'dig_result' 'change' 'email_ul' '1,2' />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="dig_result" checkboxStatus="on" labelId="label-email_ul" />

                <@action.setReadonlyByValue onload='true' srcid='email_ul' event='change' destid='inn_req' value='' />
                $("#email_ul").change(function(eventObj){
                    if (eventObj.target.value.replace(/\s/g,"") == ""){
                        $("#inn_req").attr("checked", false);
                        $("#inn_req").parent("li.selected").removeClass("selected");
                    }
                });
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >
				
                <@sf.fldrow>
					
						<@sf.label title="Полное наименование лицензиата:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.org_name_ul" qtip="" validation="required" style="text-align:left;" colspan="34" />
					
						<@sf.empty colspan="2"/>
					
                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Организационно-правовая форма лицензиата:" required=true style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

						<@sf.textfield  path="form.juridical_person_form" validation="required" qtip=""  style="text-align:left;" colspan="34"/>

						<@sf.empty colspan="2"/>

                </@sf.fldrow>


                <@sf.fldrow>
					
						<@sf.label title="Место нахождения лицензиата (с указанием индекса):" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textarea path="form.org_adress" qtip="" validation="required" style="text-align:left;" colspan="34"/>
					
						<@sf.empty colspan="2"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label title="Фамилия, имя, отчество (если имеется) руководителя лицензиата:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.fio_mngr" qtip="" validation="required" style="text-align:left;" colspan="34"/>

						<@sf.empty colspan="2"/>
					
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label title="ИНН:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.inn_ul" qtip="" validation="innlegal required" style="text-align:left;" colspan="9"/>
					
						<@sf.empty colspan="2"/>
					

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.label title="Государственный регистрационный номер записи о создании юридического лица (ОГРН):" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<@sf.textfield  path="form.ogrn_ul" qtip="" validation="ogrnlegal required" style="text-align:left;" colspan="9"/>
					
						<@sf.empty colspan="2"/>
					

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- Данные из СИА с возможностью правки-->
                        <@sf.label title="Телефон лицензиата:" required=true style="text-align:left;" colspan="10"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Данные из СИА с возможностью правки-->
                        <@sf.textfield  path="form.phone_ul" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."   validation="required phone" style="text-align:left;" colspan="9"/>
					
						<@sf.empty colspan="2"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

                        <@sf.label title="Прошу предоставить результат оказания услуги в электронном виде:" required=false style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <#-- При проставлении email обязательный-->
                        <@sf.checkbox path="form.dig_result" qtip=""  style="text-align:left;" colspan="26"/>

                        <@sf.empty colspan="13"/>

                </@sf.fldrow>

                <@sf.fldrow>

                        <#-- Данные из СИА с возможностью правки-->
                        <@sf.label id="label-email_ul" title="Адрес электронной почты лицензиата:" required=false style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <#-- Данные из СИА с возможностью правки-->
                        <@sf.textfield validation="email" path="form.email_ul" qtip=""  style="text-align:left;" colspan="34"/>

                        <@sf.empty colspan="2"/>

                </@sf.fldrow>

                <@sf.fldrow>

                        <#-- При проставлении проверятеся заполненность поля адреса электронной почты ИП и поле становится обязательным-->
                        <@sf.label title="Просьба о направлении лицензиату в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты:" required=false style="text-align:left;" colspan="10"/>

                        <@sf.empty colspan="1"/>

                        <#-- При проставлении проверятеся заполненность поля адреса электронной почты ИП и поле становится обязательным-->
                        <@sf.checkbox path="form.inn_req" qtip=""  style="text-align:left;" colspan="26"/>

                        <@sf.empty colspan="13"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="50"><h2>Электронная копия документа</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.statictext class="field-qtip" style="text-align:left;" colspan="50"><i>Размещенное ниже поле предназначено для представления электронной копии документа. Электронная копия документа должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                </@sf.fldrow>
				
                <#if form['doc_vid'] == '1'>
                   <@sf.fldrow>
                           <@sf.label title="Документ, подтверждающий оплату государственной пошлины за выдачу дубликата лицензии:" required=true style="text-align:left;" colspan="29"/>
                           <@sf.empty colspan="1"/>
                           <@sf.fileload fileExtensions="pdf,doc,docx,jpg" path="form.load_doc_a2" qtip="" style="text-align:left;" colspan="7" validation="required"/>
                           <@sf.empty colspan="13"/>
                   </@sf.fldrow>
               <#else>
                   <@sf.fldrow>
                           <@sf.label title="Документ, подтверждающий оплату государственной пошлины за выдачу дубликата лицензии:" required=false style="text-align:left;" colspan="29"/>
                           <@sf.empty colspan="1"/>
                           <@sf.fileload fileExtensions="pdf,doc,docx,jpg" path="form.load_doc_a2" qtip="" style="text-align:left;" colspan="7"/>
                           <@sf.empty colspan="13"/>
                   </@sf.fldrow>
               </#if>


                <#if form['doc_tip'] == '2'>
                    <@sf.fldrow>
                            <@sf.label title="Испорченный бланк лицензии:" required=true style="text-align:left;" colspan="29"/>
                            <@sf.empty colspan="1"/>
                            <@sf.fileload validation="required" fileExtensions="pdf,doc,docx,jpg" path="form.load_doc_a1" qtip="" style="text-align:left;" colspan="7"/>
                            <@sf.empty colspan="13"/>
                    </@sf.fldrow>
                <#else>
                    <@sf.fldrow>
                            <@sf.label title="Испорченный бланк лицензии:" required=false style="text-align:left;" colspan="29"/>
                            <@sf.empty colspan="1"/>
                            <@sf.fileload fileExtensions="pdf,doc,docx,jpg" path="form.load_doc_a1" qtip="" style="text-align:left;" colspan="7"/>
                            <@sf.empty colspan="13"/>
                    </@sf.fldrow>
                </#if>

                <@sf.fldrow>
                        <@sf.label title="Доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="29"/>
                        <@sf.empty colspan="1"/>
                        <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.load_doc_b3" qtip="" style="text-align:left;" colspan="7"/>
                        <@sf.empty colspan="13"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
