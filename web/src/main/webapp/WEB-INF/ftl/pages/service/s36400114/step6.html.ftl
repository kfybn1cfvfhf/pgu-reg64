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
        function statZayavChanged () {
        if($("#statZayav").val() == '3' || $("#statZayav").val() == '4') {
        $(".LoadFileClass1").show();
        } else {
        $(".LoadFileClass1").hide();
        }
        if($("#statZayav").val() == '5') {
        $(".LoadFileClass2").show();
        $(".LoadFileClass3").show();
        $(".LoadFileClass8").show();
        } else {
        $(".LoadFileClass2").hide();
        $(".LoadFileClass3").hide();
        $(".LoadFileClass8").hide();
        }

        }

        function trudKnigDocLoadShow() {
        if($("#trudCh").attr('value') == "on" || $("#parent1Ch").attr('value') == "on") {
        $(".LoadFileClass10").show();
        $(".LoadFileClass11").show();
        } else {
        $(".LoadFileClass10").hide();
        $(".LoadFileClass11").hide();
        }
        }

        function trud1ChChanged() {
        if($("#trud1Ch").attr('value') == "on") {
        $('.LoadFileClass4').show();
        } else {
        $('.LoadFileClass4').hide();
        }
        }

        function parentChChanged() {
        if($("#parentCh").attr('value') == "on") {
        $('.LoadFileClass5').show();
        $('.LoadFileClass9').show();
        } else {
        $('.LoadFileClass5').hide();
        $('.LoadFileClass9').hide();
        }
        }


            <@jquery.onready>

                <@action.setVisibleByValue onload="true"  srcid="parent2Ch" event="change" value="on" destid="vipTrudKnigDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="parent2Ch" event="change" value="on" destid="vipTrudKnigDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="statZayav" event="change" value="5" destid="sudNoRodPopDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="statZayav" event="change" value="5" destid="sudNoRodPopDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="parent2Ch" event="change" value="on" destid="prikazOtpuskDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="parent2Ch" event="change" value="on" destid="prikazOtpuskDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="statZayav" event="change" value="1,2" destid="spravSocZashGitDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="statZayav" event="change" value="1,2" destid="spravSocZashGitDocLoad"/>

                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass2' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass3' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass4' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass5' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass6' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass7' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass8' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass9' hideButtonSections='true'/>
            trudKnigDocLoadShow();
            statZayavChanged();
            trud1ChChanged();
            parentChChanged();

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
                <@spring.formHiddenInput path="form.statZayav"/>
                <@spring.formHiddenInput path="form.parentCh"/>
                <@spring.formHiddenInput path="form.parent1Ch"/>
                <@spring.formHiddenInput path="form.parent2Ch"/>
                <@spring.formHiddenInput path="form.trudCh"/>
                <#if form.statZayav == "5">
                    <@spring.formHiddenInput path="form.trud1Ch"/>
                </#if>
                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
                        Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
                    </i></@sf.statictext>

                </@sf.fldrow>

                <@sf.initAllClones formElement=form.opecDocLoad cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.opecDocLoad" title="Выписка из решения об установлении над ребенком опеки:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload path="form.opecDocLoad[${a}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.vipTrudKnigDocLoad" title="Выписка из трудовой книжки (военного билета) о последнем месте работы (службы), заверенную в установленном порядке, копию приказа о предоставлении отпуска по уходу за ребенком, справку о размере ранее выплаченного пособия по беременности и родам, ежемесячного пособия по уходу за ребенком:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.vipTrudKnigDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow class="LoadFileClass10">
                    <@sf.label path="form.trudKnigDocLoad" title="Трудовая книжка:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow class="LoadFileClass10">
                    <@sf.fileload path="form.trudKnigDocLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.svidDeadDocLoad cloneSectionClass='LoadFileClass2' ; b>
                    <@sf.fldrow  class="LoadFileClass2">
                        <@sf.label path="form.svidDeadDocLoad" title="Свидетельства о смерти родителей:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass2">
                        <@sf.fileload path="form.svidDeadDocLoad[${b}]" qtip="<br>Предоставляется в случае смерти родителей" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.sudLishPravDocLoad cloneSectionClass='LoadFileClass3' ; c>
                    <@sf.fldrow  class="LoadFileClass3">
                        <@sf.label path="form.sudLishPravDocLoad" title="Решения суда о лишении родителей родительских прав (об ограничении в родительских правах), признании родителей недееспособными (ограниченно дееспособными), безвестно отсутствующими или умершими:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass3">
                        <@sf.fileload path="form.sudLishPravDocLoad[${c}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Предоставляется в случае, если родители ребенка лишены родительских прав (ограничены в родительских правах), признаны недееспособными (ограниченно дееспособными), безвестно отсутствующими или умершими" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.sudNoRodPopDocLoad" title="Решение суда об установлении факта отсутствия родительского попечения над ребенком (в том числе в связи с болезнью родителей):" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.sudNoRodPopDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляется в случае установления факта отсутствия родительского попечения над ребенком (в том числе в связи с болезнью родителей)" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.spravPosobDocLoad cloneSectionClass='LoadFileClass4' ; d>
                    <@sf.fldrow  class="LoadFileClass4">
                        <@sf.label path="form.spravPosobDocLoad" title="Справка с места работы (учебы, службы) отца (матери, обоих родителей) ребенка о том, что он (она, они) не использует указанный отпуск и не получает пособия (работодатели, образовательные учреждения):" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass4">
                        <@sf.fileload path="form.spravPosobDocLoad[${d}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow class="LoadFileClass11">
                    <@sf.label path="form.sovmProjivDocLoad" title="Документ, подтверждающий совместное проживание на территории Российской Федерации ребенка с одним из родителей либо лицом, его заменяющим, осуществляющим уход за ним, выданный организацией, уполномоченной на его выдачу:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow class="LoadFileClass11">
                    <@sf.fileload path="form.sovmProjivDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.prikazOtpuskDocLoad" title="Приказ о предоставлении отпуска по уходу за ребенком, справку о размере ранее выплаченного пособия по беременности и родам, ежемесячного пособия по уходу за ребенком:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.prikazOtpuskDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.soglUsinDocLoad cloneSectionClass='LoadFileClass5' ; e>
                    <@sf.fldrow  class="LoadFileClass5">
                        <@sf.label path="form.soglUsinDocLoad" title="Заявления родителей о согласии на усыновление (удочерение) ребенка, оформленное в установленном порядке:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass5">
                        <@sf.fileload path="form.soglUsinDocLoad[${e}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.spravSocZashGitDocLoad" title="Справка из органов социальной защиты населения по месту жительства отца, матери ребенка о неполучении ежемесячного пособия по уходу за ребенком:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.spravSocZashGitDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляется в случае,  если отец (мать, оба родителя) ребенка не работает (не служит) либо обучается по очной форме обучения в образовательных учреждениях начального профессионального, среднего профессионального и высшего профессионального образования и учреждениях послевузовского профессионального образования, – для одного из родителей в соответствующих случаях, а также для лиц, фактически осуществляющих уход за ребенком вместо матери (отца, обоих родителей) ребенка." style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.spravSocZashRegDocLoad" title="Справка из органа социальной защиты населения по месту регистрации, подтверждающую, что ежемесячное пособие по уходу за ребенком не назначалось и не выплачивалось:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.spravSocZashRegDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="Предоставляется в случае наличия регистрации и по месту жительства и по месту пребывания." style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.igripDocLoad cloneSectionClass='LoadFileClass6' ; f>
                    <@sf.fldrow  class="LoadFileClass6">
                        <@sf.label path="form.igripDocLoad" title="Документы, подтверждающие статус физических лиц, осуществляющих деятельность в качестве индивидуальных предпринимателей (выписка из единого государственного реестра индивидуальных предпринимателей):" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass6">
                        <@sf.fileload path="form.igripDocLoad[${f}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Предоставляется в случае если получатель услуги является индивидуальным предпринимателем" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.noSocStrahDocLoad" title="Справка из территориального органа Фонда социального страхования Российской Федерации об отсутствии регистрации родителей (одного из родителей), опекуна ребенка в территориальных органах Фонда социального страхования Российской Федерации в качестве страхователя и о неполучении ежемесячного пособия по уходу за ребенком за счет средств обязательного социального страхования:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.noSocStrahDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.slujZanDocLoad cloneSectionClass='LoadFileClass7' ; g>
                    <@sf.fldrow  class="LoadFileClass7">
                        <@sf.label path="form.slujZanDocLoad" title="Справка из органа государственной службы занятости населения о невыплате пособия по безработице:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass7">
                        <@sf.fileload path="form.slujZanDocLoad[${g}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.lishSvobDocLoad cloneSectionClass='LoadFileClass8' ; h>
                    <@sf.fldrow  class="LoadFileClass8">
                        <@sf.label path="form.lishSvobDocLoad" title="Справка о нахождении родителей под стражей или об отбывании ими наказания в виде лишения свободы:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass8">
                        <@sf.fileload path="form.lishSvobDocLoad[${h}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Предоставляется в случае, если мать и (или) отец отбывают наказание в учреждениях, исполняющих наказание в виде лишения свободы, находятся в местах содержания под стражей подозреваемых и обвиняемых в совершении преступлений." style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.roziskDocLoad cloneSectionClass='LoadFileClass9' ; j>
                    <@sf.fldrow  class="LoadFileClass9">
                        <@sf.label path="form.roziskDocLoad" title="Справка из органов внутренних дел о том, что место нахождения разыскиваемых родителей не установлено:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow  class="LoadFileClass9">
                        <@sf.fileload path="form.roziskDocLoad[${j}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass9">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
