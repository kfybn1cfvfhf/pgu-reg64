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
    <@html.head title='Узнать мои права (Предоставление информации по дополнительному лекарственному обеспечению)'>
        <@script.scripttag>
            <@jquery.onready>
                $('#document').parent().parent().addClass('fieldDisabled');
                $('#sex[value="1"]').attr('value','Мужской');
                $('#sex[value="2"]').attr('value','Женский');
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm prevButtonLabel='Назад'>
                <@sf.fldrow>

                        <@sf.statictext style="text-align:left;" colspan="48" class="field-qtip"><i>Результатом услуги является информация о доступных для заявителя льготах, предусмотренных в рамках программы по льготному лекарственному обеспечению. Нажмите "Подать заявление" для получения услуги.</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>

                </@sf.fldrow>

                 <@sf.fldrow>

                        <#-- Данные из СИА. Недоступно для редактирования-->
                        <@sf.label title="Фамилия, имя, отчество (если имеется):" required=false style="text-align:left;" colspan="13"/>

                        <@sf.empty colspan="1"/>

                        <#-- Данные из СИА. Недоступно для редактирования-->
                        <@sf.textfield  path="form.fio" qtip=""  attr='readonly="readonly"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="34"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.label title="Дата рождения:" required=false style="text-align:left;" colspan="13"/>

                    <@sf.empty colspan="1"/>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.datefield path="form.birsday"  qtip="" style="text-align:left;" attr='readonly="readonly"' wrapperClass='fieldDisabled' colspan="18"/>

                    <@sf.empty colspan="16"/>

                    </@sf.fldrow>

                <@sf.fldrow>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.label title="Пол:" required=false style="text-align:left;" colspan="13"/>

                    <@sf.empty colspan="1"/>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.textfield  path="form.sex" qtip=""  attr='readonly="readonly"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="18"/>

                    <@sf.empty colspan="16"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.label title="Адрес места жительства (проживания):" required=false style="text-align:left;" colspan="13"/>

                    <@sf.empty colspan="1"/>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.textfield  path="form.address" qtip=""  attr='readonly="readonly"' wrapperClass='fieldDisabled' style="text-align:left;" colspan="34"/>

                    </@sf.fldrow>

                <@sf.fldrow>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.label title="Документ, удостоверяющий личность: тип документа, серия, номер, дата выдачи, кем выдан:" required=false style="text-align:left;" colspan="13"/>

                    <@sf.empty colspan="1"/>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.textarea  path="form.document" qtip=""  attr='readonly="readonly"' style="text-align:left;" colspan="34"/>

                    </@sf.fldrow>

                <@sf.fldrow>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.label title="СНИЛС:" required=false style="text-align:left;" colspan="13"/>

                    <@sf.empty colspan="1"/>

                    <#-- Данные из СИА. Недоступно для редактирования-->
                    <@sf.textfield path="form.snils"  qtip=""  style="text-align:left;" attr='readonly="readonly"' wrapperClass='fieldDisabled' colspan="18"/>

                    <@sf.empty colspan="16"/>

                </@sf.fldrow>
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
