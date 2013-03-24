<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/actions.ftl" as customActions>
<#import "/custom/validators.ftl" as customValidators>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Предоставление земельных участков, на которых расположены здания, строения и сооружения'>
        <@script.scripttag>
            <@jquery.onready>

                <@customValidators.addCustomValidators />

                <@action.setVisibleByValue 'true' 'rightKind' 'change' 'rentTerm' '3,4'/>
				
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
				
                <@sf.fldrow>
					
					<@sf.statictext style="text-align:left;" colspan="48"><h2>Характеристики испрашиваемого земельного участка</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- 03_RIGHT_KIND_64209
                    Значения:
                    (1) Собственность за плату
                    (2) Собственность бесплатно
                    (3) Аренда
                    (4) Безвозмездное срочное пользование
                    (5) Постоянное (бессрочное) пользование-->

                    <@sf.label path="form.rightKind" title="Вид права:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup path="form.rightKind" dictionaryCode="03_RIGHT_KIND_64209" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- По умолчанию: скрыто
                    Отображается в случае выбора значений (3), (4) в #rightKind-->

                    <@sf.label path="form.rentTerm" title="Срок аренды (пользования):" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.rentTerm" qtip="Указать количество полных лет (месяцев, дней)" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.squareArea" title="Площадь земельного участка:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.squareArea" qtip="Указывается в кв.м" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.kadastrArea" title="Кадастровый номер участка:" required=false style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.kadastrArea" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.permitUse" title="Разрешенное использование:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.permitUse" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.factUse" title="Фактическое использование:" required=false style="text-align:left;" colspan="17"/>
					
					<@sf.textfield  path="form.factUse" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.locationArea" title="Местоположение участка:" required=true style="text-align:left;" colspan="17"/>
					
					<@sf.textarea  path="form.locationArea" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<#-- 03_CAPITAL_RIGHT_64209-->

                    <@sf.label path="form.capitalRight" title="Вид права на объект капитального строительства, расположенного на земельном участке:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup path="form.capitalRight" dictionaryCode="03_CAPITAL_RIGHT_64209" qtip="" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.otherInfo" title="Иные сведения о земельном участке:" required=false style="text-align:left;" colspan="17"/>
					
					<@sf.textarea path="form.otherInfo" qtip=""  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
					<@sf.label path="form.approveCh" title="Прошу утвердить и выдать схему расположения земельного участка на кадастровом плане или кадастровой карте соответствующей территории:" required=false style="text-align:left;" colspan="17"/>
					
					<@sf.checkbox path="form.approveCh" qtip="Заполняется в случае если не осуществлен государственный кадастровый учет земельного участка или в государственном кадастре недвижимости отсутствуют сведения о земельном участке необходимые для выдачи кадастрового паспорта земельного участка."  style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>