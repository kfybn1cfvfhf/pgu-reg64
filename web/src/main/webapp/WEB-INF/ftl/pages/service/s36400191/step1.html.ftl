<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Заполнение и направление в аптеки электронных рецептов'>
       <@script.scripttag>
         function IdentityDocTypeChenge () {
                if($('#identityDocType').attr('value') != ${privateRoomData.identityDocType}) {
                    $('#passSeria').attr('value', '');
                    $('#passNo').attr('value','');
                    $('#passFrom').attr('value','');
                    $('#passDate').attr('value','');
                } else {
                    $('#passSeria').attr('value', '${privateRoomData.passSeria}');
                    $('#passNo').attr('value', '${privateRoomData.passNo}');
                    $('#passDate').attr('value', '${(privateRoomData.passDate?string('dd.MM.yyyy'))!}');
                    $('#passFrom').attr('value', '${privateRoomData.passFrom}');
                }
            }
            <@jquery.onready>
                 <@action.setReadonlyByValue onload='true' srcid='addressEq' event='change' destid='addressPost' value='on' />
              $('#addressEq').change(function() {
                    if($('#addressEq').attr('checked')==true) {
                        $('#addressPost').attr('value', $('#factAddress').attr('value'));

                    } else {
                        $('#addressPost').attr('value', '');

                    }
                });

              $('#identityDocType').change(function() {
                        IdentityDocTypeChenge();
                    });
			 <@customValidators.addCustomValidators />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					

<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены. 
Если в заявлении указаны неверные данные заявителя, необходимо выполнить одно из следующих действий:
<br>1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;
<br>2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.textfield  path="form.lastName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.textfield  path="form.firstName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
					

<@sf.textfield  path="form.middleName" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="cyrillic" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.snils" title="СНИЛС:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.snils" qtip="" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required snils" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.sex" title="Пол:" required=true style="text-align:left;" colspan="17"/>

<@sf.radiogroup path="form.sex" staticOpts={"1":"Мужской","2":"Женский"} validation="required" attr='readonly="readonly"' wrapperClass='fieldDisabled' mode="horizontal" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.birthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.datefield path="form.birthdate"  qtip="" attr='readonly="readonly"' wrapperClass='fieldDisabled' validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале. 
Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.factAddress" title="Адрес места жительства (пребывания):" required=true style="text-align:left;" colspan="17"/>
					

<@sf.textarea path="form.factAddress" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.address" title="Адрес регистрации:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.textarea path="form.address" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.addressEq" title="Почтовый адрес совпадает с адресом места жительства (пребывания):" required=false style="text-align:left;" colspan="17"/>
					

<@sf.checkbox path="form.addressEq" qtip="Поставьте отметку, если почтовый адрес совпадает с адресом места жительства (пребывания), в этом случае сведения об адресе места жительства будут скопированы на поле «Почтовый адрес»"  style="text-align:unknown;" colspan="31"/>
					
						<@sf.empty colspan="1"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.addressPost" title="Почтовый адрес:" required=false style="text-align:left;" colspan="17"/>
					
						<@sf.textarea path="form.addressPost" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры. 
В качестве почтового адреса так же может быть указан «адрес до востребования» или абонентский ящик."  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.identityDocType" title="Тип документа, удостоверяющего личность:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.customLookup  controller="MainDocTypeController" optionsMap={'authToken' : '${cAuthToken}'}  path="form.identityDocType" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.passSeria" title="Серия:" required=true style="text-align:left;" colspan="17"/>
					

<@sf.textfield  path="form.passSeria" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					

<@sf.label path="form.passNo" title="Номер:" required=true style="text-align:left;" colspan="17"/>

<@sf.textfield  path="form.passNo" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.passDate" title="Дата выдачи:" required=true style="text-align:left;" colspan="17"/>

<@sf.datefield path="form.passDate"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>

<@sf.label path="form.passFrom" title="Кем выдан:" required=true style="text-align:left;" colspan="17"/>

<@sf.textarea path="form.passFrom" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
