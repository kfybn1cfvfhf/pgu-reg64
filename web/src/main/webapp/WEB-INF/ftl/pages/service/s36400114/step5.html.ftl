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
    <@html.head title='Выплата ежемесячного пособия по уходу за ребенком'>
        <@script.scripttag>

            <@jquery.onready>
                <@action.setVisibleByValue onload="true"  srcid="statZayav" event="change" value="5" destid="parentCh" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="statZayav" event="change" value="5" destid="parentCh"/>
                <@action.setVisibleByValue onload="true"  srcid="statZayav" event="change" value="5" destid="parent1Ch" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="statZayav" event="change" value="5" destid="parent1Ch"/>
                <@action.setVisibleByValue onload="true"  srcid="statZayav" event="change" value="1,2,3,4" destid="trudCh" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="statZayav" event="change" value="1,2,3,4" destid="trudCh"/>
                <@action.setVisibleByValue onload="true"  srcid="statZayav" event="change" value="5" destid="trud1Ch" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="statZayav" event="change" value="5" destid="trud1Ch"/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
                <@sf.fldrow>
                    <@sf.label path="form.statZayav" title="Статус получателя услуги по отношению к ребенку, на которого назначается пособие:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup  path="form.statZayav" dictionaryCode="03_STATUS_ZAYAV_64114" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.parentCh" title="Родители ребенка уклоняются от воспитания детей или от защиты их прав и интересов или отказались взять своего ребенка из воспитательных, лечебных учреждений, учреждений социальной защиты населения и других аналогичных учреждений:" required=false style="text-align:left;" colspan="46"/>
                    <@sf.checkbox path="form.parentCh" qtip=""  style="text-align:center;" colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.parent1Ch" title="Мать и (или) отец умерли, объявлены умершими, лишены родительских прав, ограничены в родительских правах, признаны безвестно отсутствующими, недееспособными (ограниченно дееспособными), по состоянию здоровья не могут лично воспитывать и содержать ребенка, отбывают наказание в учреждениях, исполняющих наказание в виде лишения свободы, находятся в местах содержания под стражей подозреваемых и обвиняемых в совершении преступлений, уклоняются от воспитания детей или от защиты их прав и интересов или отказались взять своего ребенка из воспитательных, лечебных учреждений, учреждений социальной защиты населения и других аналогичных учреждений:" required=false style="text-align:left;" colspan="46"/>
                    <@sf.checkbox path="form.parent1Ch" qtip=""  style="text-align:center;" colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.parent2Ch" title="Получателями услуги являются уволенные в период отпуска по уходу за ребенком (матери, уволенные в период беременности, отпуска по беременности) в связи с ликвидацией организации, прекращением физическими лицами деятельности в качестве индивидуальных предпринимателей, прекращением полномочий нотариусами, занимающимися частной практикой, и прекращением статуса адвоката, а также в связи с прекращением деятельности иными физическими лицами, профессиональная деятельность которых в соответствии с федеральными законами подлежит государственной регистрации и (или) лицензированию, не получающие пособие по безработице:" required=false style="text-align:left;" colspan="46"/>
                    <@sf.checkbox path="form.parent2Ch" qtip=""  style="text-align:center;" colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.trudCh" title="Получателями услуги являются лица, фактически осуществляющие уход за ребенком, не подлежащие обязательному социальному страхованию и не получающие пособие по безработице (в том числе обучающиеся по очной форме обучения в образовательных учреждениях и находящиеся в отпуске по уходу за ребенком):" required=false style="text-align:left;" colspan="46"/>
                    <@sf.checkbox path="form.trudCh" qtip=""  style="text-align:center;" colspan="2"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.trud1Ch" title="Второй родитель является работающим, или оба родителя работают:" required=false style="text-align:left;" colspan="46"/>
                    <@sf.checkbox path="form.trud1Ch" qtip=""  style="text-align:center;" colspan="2"/>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
