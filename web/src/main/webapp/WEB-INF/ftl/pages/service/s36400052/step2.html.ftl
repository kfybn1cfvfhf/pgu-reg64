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
                <@action.setRequiredIf 'true' 'dig_result' 'change' 'email_ip' '1,2' />
                <@customActions.makeFieldLabelRequiredByCheckbox onload=true checkboxId="dig_result" checkboxStatus="on" labelId="label-email_ip" />

                <@action.setReadonlyByValue onload='true' srcid='email_ip' event='change' destid='inn_req' value='' />
                $("#email_ip").change(function(eventObj){
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
					
						<#-- данные СИА-->
                        <@sf.label title="Фамилия, Имя, Отчество (если имеется):" required=true style="text-align:left;" colspan="11" />
					
						<@sf.empty colspan="1"/>
					
						<#-- данные СИА-->
                        <@sf.textfield  path="form.declarant_name" validation="required" qtip="" style="text-align:left;" colspan="34" />

                        <@sf.empty colspan="4"/>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- данные СИА-->
                        <@sf.label title="Место регистрации (с указанием индекса):" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- данные СИА-->
                        <@sf.textarea path="form.declarant_adress" qtip="" validation="required" style="text-align:left;" colspan="34"/>

                        <@sf.empty colspan="4"/>

                </@sf.fldrow>
				


                <@sf.fldrow>
					
						<#-- Заполняется из СИА c возможностью правки-->
                        <@sf.label title="Телефон лицензиата:" required=true style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="1"/>
					
						<#-- Заполняется из СИА c возможностью правки-->
                        <@sf.textfield  path="form.phone_ip" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр."   validation="required phone" style="text-align:left;" colspan="11"/>
					
						<@sf.empty colspan="2"/>

                </@sf.fldrow>


                <@sf.fldrow>

                        <@sf.label title="Прошу предоставить результат оказания услуги в электронном виде:" required=false style="text-align:left;" colspan="11"/>

                        <@sf.empty colspan="1"/>

                        <#-- При проставлении email обязательный-->
                        <@sf.checkbox path="form.dig_result" qtip=""  style="text-align:left;" colspan="1"/>

                        <@sf.empty colspan="37"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Заполняется из СИА c возможностью правки-->
                        <@sf.label id="label-email_ip" title="Адрес электронной почты лицензиата:" required=false style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="1"/>

						<#-- Заполняется из СИА c возможностью правки-->
                        <@sf.textfield validation="email" path="form.email_ip" qtip=""  style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="27"/>

                </@sf.fldrow>

                <@sf.fldrow>

                        <#-- При проставлении проверятеся заполненность поля адреса электронной почты ИП и поле становится обязательным-->
                        <@sf.label title="Просьба о направлении лицензиату в электронной форме информации по вопросу лицензирования на указанный адрес электронной почты:" required=false style="text-align:left;" colspan="11"/>

                        <@sf.empty colspan="1"/>

                        <#-- При проставлении проверятеся заполненность поля адреса электронной почты ИП и поле становится обязательным-->
                        <@sf.checkbox path="form.inn_req" qtip=""  style="text-align:left;" colspan="1"/>

                        <@sf.empty colspan="37"/>

                </@sf.fldrow>


                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Электронная копия документа</h2></@sf.statictext>

                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext class="field-qtip" style="text-align:left;" colspan="50"><i>Размещенное ниже поле предназначено для представления электронной копии документа. Электронная копия документа должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                </@sf.fldrow>

             <@sf.fldrow>

						<@sf.label title="ИНН:" required=false style="text-align:left;" colspan="29"/>

						<@sf.empty colspan="1"/>

						<@sf.fileload  path="form.inn" fileExtensions="pdf,doc,docx,jpg" qtip="" style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="27"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.label title="Выписка из Единого государственного реестра индивидуальных предпринимателей:" required=false style="text-align:left;" colspan="29"/>

						<@sf.empty colspan="1"/>

						<@sf.fileload  path="form.egripLoad" fileExtensions="pdf,doc,docx,jpg" qtip="" style="text-align:left;" colspan="11"/>

						<@sf.empty colspan="27"/>

                </@sf.fldrow>

                <#-- в зависимости от поля Причина обращения за дубликатом становится обязательным то или другое-->


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
                        <@sf.label title="Нотариально заверенная доверенность на лицо, представляющее документы на лицензирование:" required=false style="text-align:left;" colspan="29"/>
                        <@sf.empty colspan="1"/>
                        <@sf.fileload fileExtensions="pdf,doc,jpg" path="form.load_doc_a3" qtip="" style="text-align:left;" colspan="7"/>
                        <@sf.empty colspan="13"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>

    </@html.body>
</@html.html>
