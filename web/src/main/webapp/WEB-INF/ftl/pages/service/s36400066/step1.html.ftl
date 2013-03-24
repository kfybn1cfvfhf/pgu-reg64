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
    <@html.head title='Выдача справки о наличии объекта культурного наследия'>
        <@script.scripttag>

            function showHideFldRowsByCheckbox(checkboxElement) {
                if(checkboxElement.is(":checked")){
                    $("#bossCh").parentsUntil("tbody", "tr.fieldrow").prev().show();
                    $("#bossCh").parentsUntil("tbody", "tr.fieldrow").show();
                    $("#corp").parentsUntil("tbody", "tr.fieldrow").show();
                    $("#bossName").parentsUntil("tbody", "tr.fieldrow").show();
                } else {
                    $("#bossCh").parentsUntil("tbody", "tr.fieldrow").prev().hide();
                    $("#bossCh").parentsUntil("tbody", "tr.fieldrow").hide();
                    $("#corp").parentsUntil("tbody", "tr.fieldrow").hide();
                    $("#bossName").parentsUntil("tbody", "tr.fieldrow").hide();
                }
            }

            function setElementValueByCheckbox(checkboxElementId, destElementId, onValue, offValue) {
                if ($("#"+checkboxElementId).is(":checked")) {
                    $("#"+destElementId).val(onValue);
                } else {
                    $("#"+destElementId).val(offValue);
                }
            }

            <@jquery.onready>

			    <@action.setRequiredIf onload="true" srcid="answerRg" event="change" value="1" destid="email" />
			    <@action.setRequiredIf onload="true" srcid="answerRg" event="change" value="2" destid="adressPost" />

			    showHideFldRowsByCheckbox($("#corpCh"));
			    $("#corpCh").change(function(eventObj){
			        showHideFldRowsByCheckbox($(eventObj.target));
			    });

			    setElementValueByCheckbox("corpCh", "adressReg", "", "${applicantPersonalData.getRegistrationAddress()}");
			    $("#corpCh").change(function(){
			        setElementValueByCheckbox("corpCh", "adressReg", "", "${applicantPersonalData.getRegistrationAddress()}");
			        setElementValueByCheckbox("adressRegCh", "adressPost", $("#adressReg").val(), "");
                    setElementValueByCheckbox("adressObjCh", "adressObj", $("#adressReg").val(), "");
			    });

			    $("#adressReg").change(function(eventObj){
			        setElementValueByCheckbox("adressRegCh", "adressPost", eventObj.target.value, "");
                    setElementValueByCheckbox("adressObjCh", "adressObj", eventObj.target.value, "");
			    });

			    setElementValueByCheckbox("corpCh", "phone", "", "${applicantPersonalData.getPhone()}");
			    $("#corpCh").change(function(){
			        setElementValueByCheckbox("corpCh", "phone", "", "${applicantPersonalData.getPhone()}");
			    });

                <@action.setReadonlyByValue onload="true" srcid="bossCh" event="change" value="on" destid="bossName" />
			    setElementValueByCheckbox("bossCh", "bossName", "${applicantPersonalData.getFio()}", "");
			    $("#bossCh").change(function(){
			        setElementValueByCheckbox("bossCh", "bossName", "${applicantPersonalData.getFio()}", "");
			    });

                <@action.setReadonlyByValue onload="true" srcid="adressRegCh" event="change" value="on" destid="adressPost" />
                setElementValueByCheckbox("adressRegCh", "adressPost", $("#adressReg").val(), "");
                $("#adressRegCh").change(function(){
			        setElementValueByCheckbox("adressRegCh", "adressPost", $("#adressReg").val(), "");
                });

                <@action.setReadonlyByValue onload="true" srcid="adressObjCh" event="change" value="on" destid="adressObj" />
                setElementValueByCheckbox("adressObjCh", "adressObj", $("#adressReg").val(), "");
                $("#adressObjCh").change(function(eventObj){
                    setElementValueByCheckbox("adressObjCh", "adressObj", $("#adressReg").val(), "");
                });
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА-->
                        <@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Данные из СИА-->
                        <@sf.textfield  path="form.lastName" qtip="" validation="required" style="text-align:left;" attr='readonly="true"' wrapperClass='fieldDisabled' colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА-->
                        <@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Данные из СИА-->
                        <@sf.textfield  path="form.firstName" qtip="" validation="required" style="text-align:left;" attr='readonly="true"' wrapperClass='fieldDisabled' colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из СИА-->
                        <@sf.label path="form.midlle" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Данные из СИА-->
                        <@sf.textfield  path="form.midlle" qtip=""  style="text-align:left;" attr='readonly="true"' wrapperClass='fieldDisabled' colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- При выборе значения "в виде электронного документа на электронную почту" поле #email  - обязательное. При выборе значения "в письменной форме посредством почтовой связи" поле #adressPost - обязательно.-->
                        <@sf.label path="form.answerRg" title="Ответ должен быть направлен:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- При выборе значения "в виде электронного документа на электронную почту" поле #email  - обязательное. При выборе значения "в письменной форме посредством почтовой связи" поле #adressPost - обязательно.-->
                        <@sf.radiogroup path="form.answerRg" dictionaryCode="TYPE_ANSW_APPL" qtip="" validation="required" style="text-align:left;" colspan="33" mode="horizontal"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- При активации #corpCh отображаются поля: #bossCh, #corp, #bossName. Поле #adressPost очищается.-->
                        <@sf.label path="form.corpCh" title="Заявление подается от имени юридического лица:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- При активации #corpCh отображаются поля: #bossCh, #corp, #bossName. Поле #adressPost очищается.-->
                        <@sf.checkbox path="form.corpCh" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="32"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh-->
                        <@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о юридическом лице</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh. При активации #bossCh значения #lastname, #firstname, #midlle - копируются в #bossName-->
                        <@sf.label path="form.bossCh" title="Заявление подает руководитель юридического лица:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh. При активации #bossCh значения #lastname, #firstname, #midlle - копируются в #bossName-->
                        <@sf.checkbox path="form.bossCh" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="32"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh. Отображется при активации #corpCh-->
                        <@sf.label path="form.corp" title="Наименование организации:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh. Отображется при активации #corpCh-->
                        <@sf.textfield  path="form.corp" qtip="" validation="required" style="text-align:left;" colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh. Отображется при активации #corpCh-->
                        <@sf.label path="form.bossName" title="Фамилия, имя, отчество (если имеется) руководителя:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- По умолчанию скрыто. Отображется при активации #corpCh. Отображется при активации #corpCh-->
                        <@sf.textfield  path="form.bossName" qtip="" validation="required" style="text-align:left;" colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

						<#-- При активации #adressRegCh - заполняется значением из #adressPost-->
                        <@sf.label path="form.adressReg" title="Адрес регистрации, с указанием индекса:" required=true style="text-align:left;" colspan="17"/>

						<#-- При активации #adressRegCh - заполняется значением из #adressPost-->
                        <@sf.textfield  path="form.adressReg" qtip="" validation="required" style="text-align:left;" colspan="33"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- При активации #adressRegCh - #adressReg заполняется значением из #adressPost-->
                        <@sf.label path="form.adressRegCh" title="Почтовый адрес совпадает с адресом регистрации:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- При активации #adressRegCh - #adressReg заполняется значением из #adressPost-->
                        <@sf.checkbox path="form.adressRegCh" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="32"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

						<#-- Данные из СИА. Очищается при активации #corpCh. Обязательно при условии выбора значения "в письменной форме посредством почтовой связи" поля #answerRg-->
                        <@sf.label path="form.adressPost" title="Почтовый адрес, с указанием индекса:" required=false style="text-align:left;" colspan="17"/>

						<#-- Данные из СИА. Очищается при активации #corpCh. Обязательно при условии выбора значения "в письменной форме посредством почтовой связи" поля #answerRg-->
                        <@sf.textfield  path="form.adressPost" qtip=""  style="text-align:left;" colspan="33"/>

                </@sf.fldrow>

                <@sf.fldrow>
					
						<#-- Данные из СИА. Очищается при активации #corpCh.-->
                        <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Данные из СИА. Очищается при активации #corpCh.-->
                        <@sf.textfield  path="form.phone" qtip="Номер телефона вводится в формате (N)К, где N - от 3 до 5 цифр, К - от 5 до 7 цифр." validation="phone required" style="text-align:left;" colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Валидатор - email. Обязательно при выборе значения "в виде электронного документа на электронную почту" поля #answerRg-->
                        <@sf.label path="form.email" title="Электронная почта:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Валидатор - email. Обязательно при выборе значения "в виде электронного документа на электронную почту" поля #answerRg-->
                        <@sf.textfield  path="form.email" qtip="" validation="email" style="text-align:left;" colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Сведения о предполагаемом объекте культурного наследия</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- При активации #adressObjCh значение из #adressReg копируется в #adressObj-->
                        <@sf.label path="form.adressObjCh" title="Адрес регистрации совпадает с адресом предполагаемого объекта культурного наследия:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- При активации #adressObjCh значение из #adressReg копируется в #adressObj-->
                        <@sf.checkbox path="form.adressObjCh" qtip=""  style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="32"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.adressObj" title="Адрес предполагаемого объекта культурного наследия:" required=true style="text-align:left;" colspan="17"/>
					
						<@sf.textfield  path="form.adressObj" qtip="" validation="required" style="text-align:left;" colspan="33"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><h2>Электронные копии документов</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="50"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.<br></i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.loaddoc" title="План домовладения (генплан дворового участка) из органа технической инвентаризации с указанием улиц и всех литеров строений по запрашиваемому адресу (представляется в случае расположения по запрашиваемому адресу больше одного строения):" required=false style="text-align:left;" colspan="50"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.loaddoc" qtip="" style="text-align:left;" colspan="1"/>
					
						<@sf.empty colspan="49"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
