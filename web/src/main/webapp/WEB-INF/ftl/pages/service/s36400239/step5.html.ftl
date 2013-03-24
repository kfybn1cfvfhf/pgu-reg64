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
    <@html.head title='Предоставление социальных выплат за счет средств федерального бюджета на строительство (приобретение) жилья гражданам, нуждающимся в получении социальных выплат на строительство (приобретение) жилых помещений'>
        <@script.scripttag>

            function CBChanged() {
                if($("#noEGRP").attr('value') == "on") {
                    $(".LoadFileClass2").show();
                } else {
                    $(".LoadFileClass2").hide();
                }
                if($("#lonely").attr('value') == "off") {
                    $(".LoadFileClass6").show();
                    $(".LoadFileClass7").show();
                    $(".LoadFileClass8").show();
                } else {
                    $(".LoadFileClass6").hide();
                    $(".LoadFileClass7").hide();
                    $(".LoadFileClass8").hide();
                }
            }


            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass2' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass3' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass4' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass5' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass6' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass7' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass8' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass9' hideButtonSections='true'/>

                <@action.setVisibleByValue onload="true"  srcid="lonely" event="change" value="off" destid="spravNo28DocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="lonely" event="change" value="off" destid="spravNo28DocLoad"/>
                CBChanged();

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
                <@spring.formHiddenInput path="form.lonely"/>
                <@spring.formHiddenInput path="form.noEGRP"/>

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
                <@sf.initAllClones formElement=form.techInventDocLoad cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.techInventDocLoad" title="Документ соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителя, членов его семьи, рожденных до 1 января 1998, в том числе  выданные на фамилию, имя, отчество имевшиеся у них до их изменения:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload class='clone-field' path="form.techInventDocLoad[${a}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Граждане, которые в течение 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест жительства" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.svidBirthDocLoad" title="Свидетельство о рождении получателя услуги:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.svidBirthDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.noEGRPDocLoad cloneSectionClass='LoadFileClass2' ; b>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.label path="form.noEGRPDocLoad" title="Копии документов, подтверждающие право собственности на жилое помещение, либо копия договора социального найма жилого помещения:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.fileload class='clone-field' path="form.noEGRPDocLoad[${b}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Граждане, которые в течение 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест жительства" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.regPeopleDocLoad cloneSectionClass='LoadFileClass3' ; c>
                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.label path="form.regPeopleDocLoad" title="Справка о зарегистрированных лицах и лицах снятых с регистрационного учета, но сохранивших право пользования жилыми помещениями, выдаваемую жилищными или жилищно-строительными кооперативами:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.fileload class='clone-field' path="form.regPeopleDocLoad[${c}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Граждане, которые в течение 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест жительства" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.statusDocLoad cloneSectionClass='LoadFileClass4' ; d>
                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.label path="form.statusDocLoad" title="Документы, подтверждающие статус ветерана или инвалида:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.fileload class='clone-field' path="form.statusDocLoad[${d}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.uchetNujdaJPDocLoad cloneSectionClass='LoadFileClass5' ; e>
                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.label path="form.uchetNujdaJPDocLoad" title="Документы, свидетельствующие о постановке граждан на учет при признании нуждающимися в улучшении жилищных условий органами местного самоуправления:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.fileload class='clone-field' path="form.uchetNujdaJPDocLoad[${e}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.dulFamilyDocLoad cloneSectionClass='LoadFileClass6' ; f>
                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.label path="form.dulFamilyDocLoad" title="Копии документов удостоверяющих личность всех членов семьи:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.fileload class='clone-field' path="form.dulFamilyDocLoad[${f}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Для совершеннолетних членов семьи необходимо приложить паспорт (копии всех страниц)
<br>Для несовершеннолетних членов семьи необходимо приложить свидетельство о рождении" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.sostavFamilyDocLoad cloneSectionClass='LoadFileClass7' ; g>
                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.label path="form.sostavFamilyDocLoad" title="Документы, подтверждающие состав семьи:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.fileload class='clone-field' path="form.sostavFamilyDocLoad[${g}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>В качестве документов, подтверждающих состав семьи к заявлению могут быть приложены следующие документы:
<br>1. Свидетельство о браке
<br>2. Свидетельство о рождении
<br>3. Свидетельство о расторжении брака
<br>4. Свидетельство о смене имени, фамилии, отчества
<br>5. Свидетельство о смерти
<br>6. Решение соответствующего суда о признании гражданина членом семьи заявителя
<br>7. Иные документы в соответствии с административным регламентом" style="text-align:left;" colspan="48"/>

                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.obrabPDDocLoad cloneSectionClass='LoadFileClass8' ; h>
                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.label path="form.obrabPDDocLoad" title="Согласие на обработку персональных данных всех членов семьи заявителя:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.fileload class='clone-field' path="form.obrabPDDocLoad[${h}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.spravNo28DocLoad" title="Справка о заключении брака по форме №28:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.spravNo28DocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Представляется заявителем в случае если заявитель состоял в браке который был расторгнут" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.EGRPDocLoad cloneSectionClass='LoadFileClass9' ; i>
                    <@sf.fldrow class="LoadFileClass9">
                        <@sf.label path="form.EGRPDocLoad" title="Документы соответствующего органа государственной регистрации прав на недвижимое имущество и сделок с ним на территории Саратовской области об отсутствии (наличии) недвижимости у заявителя и членов его семьи, в том числе выданные на фамилию, имя, отчество имевшиеся у них до их изменения, в случае если данные изменения произошли после 6 июля 1997 года:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow>
                        <@sf.fileload class='clone-field' path="form.EGRPDocLoad[${i}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Граждане, которые в течение 5 лет, предшествовавших дню обращения, для признания их нуждающихся в улучшении жилищных условий изменяли свое место жительство необходимо дополнительно предоставить документы с предыдущих мест жительства" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass9">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
