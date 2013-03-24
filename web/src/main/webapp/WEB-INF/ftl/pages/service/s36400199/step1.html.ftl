<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "/pages/service/fieldblocks/np/ronameblock.ftl" as ronames>
<#import "/pages/service/fieldblocks/np/identitydocblock.ftl" as iddocbloc>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление информации о текущей успеваемости учащегося, ведение электронного дневника и электронного журнала успеваемости'>
        <@script.scripttag>
            function setIdentityDocAttributesByType(identitytDocTypeId) {
                if (identitytDocTypeId == "${privateRoomData.identityDocType}") {
                    $("#passSeria").val("${privateRoomData.passSeria}");
                    $("#passNo").val("${privateRoomData.passNo}");
                    $("#passFrom").val("${privateRoomData.passFrom}");
                    $("#passDate").val("${privateRoomData.passDate?string("dd.MM.yyyy")}");
                } else {
                    $("#passSeria").val("");
                    $("#passNo").val("");
                    $("#passFrom").val("");
                    $("#passDate").val("");
                }
            }
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                $("#identityDocType").change(function(eventObj){
                    setIdentityDocAttributesByType(eventObj.target.value);
                });
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
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале и не могут быть изменены.<br>
Если в заявлении указаны неверные данные заявителя, необходимо выполнить одно из следующих действий:<br>
1. Выйти из учетной записи и авторизоваться заново под вашим логином и паролем;<br>
2. В случае необходимости внести изменения в учетную запись в установленном порядке.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                        <@ronames.renderReadOnlyNameFieldBlock />

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>Поля «Адрес места регистрации»,  «Контактный телефон», «Адрес электронной почты» заполняются на основании учетной записи на портале. 
Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из ЛК-->
                    <@sf.label path="form.address" title="Адрес места регистрации:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Данные из ЛК-->
                    <@sf.textarea path="form.address" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из ЛК - "Домашний телефон"

Валидация: phone (перекрыть)-->
                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
					
						<#-- Данные из ЛК - "Домашний телефон"

Валидация: phone (перекрыть)-->
                        <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<#-- Данные из ЛК
Валидация: email-->
                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>
					
						<#-- Данные из ЛК
Валидация: email-->
                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                    <@iddocbloc.renderIdentityDocBlockNoFile />
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
