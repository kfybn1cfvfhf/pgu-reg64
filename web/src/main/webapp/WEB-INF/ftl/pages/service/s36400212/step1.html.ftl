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
    <@html.head title='Аттестация педагогических и руководящих работников государственных и муниципальных  образовательных учреждений'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.setVisibleByValue onload="true"  srcid="eduRealPost" event="change" value="1,2" destid="eduRealPostData" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="eduRealPost" event="change" value="1,2" destid="eduRealPostData"  />

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
Если в заявлении указаны неверные данные, необходимо выполнить одно из следующих действий:
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
						<@sf.label path="form.post" title="Должность:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.post" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.orgName" title="Место работы:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.orgName" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.eduCategoria" title="Запрашиваемая категория:" required=true style="text-align:left;" colspan="17"/>
<@sf.staticLookup path="form.eduCategoria" staticData={"1":"Первая категория","2":"Высшая категория"} qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduPost" title="Запрашиваемая должность:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduPost" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.eduRealPost" title="Действующая категория:" required=true style="text-align:left;" colspan="17"/>
<@sf.staticLookup path="form.eduRealPost" staticData={"1":"Первая категория","2":"Высшая категория","3":"Не имею категории"} qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.eduRealPostData" title="Срок действия категории" required=true style="text-align:left;" colspan="17"/>
<@sf.datefield path="form.eduRealPostData"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduOsnAttestat" title="Основание для аттестации" required=true style="text-align:left;" colspan="17"/>
						<@sf.textarea path="form.eduOsnAttestat" qtip="Результаты работы, соответствующие требованиям, предъявляемым к указанной квалификационной категории" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>Нижеследующие поля заполняются на основании учетной записи на портале.
Могут быть изменены в ходе заполнения формы заявления.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.email" title="Адрес электронной почты:" required=true style="text-align:left;" colspan="17"/>
<@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="required email" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об аттестуемом</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduOrg" title="Образование:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduOrg" qtip="Когда и какое образовательное учреждение профессионального образования окончил, полученная специальность и квалификация" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduNargady" title="Награды, звания, ученая степень, ученое звание:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduNargady" qtip="В случае отсутствия указать \"не имею\"" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduModernKvalif" title="Сведения о повышении квалификации:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduModernKvalif" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Стаж педагогической работы</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduStagSpec" title="По специальности, лет:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduStagSpec" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduStagPost" title="В данной должности, лет:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduStagPost" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduStagOrg" title="В данном учреждении, лет:" required=true style="text-align:left;" colspan="17"/>
						<@sf.textfield  path="form.eduStagOrg" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об участии аттестуемого в заседании Главной аттестационной комиссии</h2></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.eduGakAgree" title="Аттестацию прошу провести" required=true style="text-align:left;" colspan="17"/>
<@sf.staticLookup path="form.eduGakAgree" staticData={"1":"в моем присутствии","2":"без моего присутствия"} qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.label path="form.eduAttestAgree" title="С порядком аттестации педагогических работников ознакомлен(а):" required=true style="text-align:left;" colspan="17"/>
						<@sf.checkbox path="form.eduAttestAgree" qtip="" validation="required" style="text-align:unknown;" colspan="1"/>
						<@sf.empty colspan="30"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
