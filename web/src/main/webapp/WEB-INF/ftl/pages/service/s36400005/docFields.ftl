<#ftl encoding="UTF-8">
<#import "/serviceform.ftl" as sf>
<#import "/jquery/validation.ftl" as validation>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/action.ftl" as action>

<#macro load_doc0>
    <@sf.fldrow>

            <@sf.label title="Заявление образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc0" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc1>
    <@sf.fldrow>

            <@sf.label title="Копия документа, подтверждающего факт изменения наименования, изменения местонахождения:" required=false style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc1" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc2>
    <@sf.fldrow>

            <@sf.label title="Копия устава образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc2" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc3>
    <@script.scripttag>
        <@jquery.onready>
            <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc3' hideButtonSections='true'/>
        </@jquery.onready>
    </@script.scripttag>
    <@sf.fldrow>

            <@sf.label title="Копии документа, подтверждающего наличие лицензии на осуществление образовательной деятельности с приложением (приложениями), а также свидетельства о государственной аккредитации с приложением (приложениями) (если указанные документы выданы иным лицензирующим или аккредитационным органом):" required=false style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.initAllClones formElement=form.load_doc3 cloneSectionClass="clonesectionLoad_doc3" ; x>
        <@sf.fldrow class="clonesectionLoad_doc3">

                <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                <@sf.fileload path="form.load_doc3[${x}]" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                <@sf.empty colspan="46"/>

        </@sf.fldrow>
    </@sf.initAllClones>
</#macro>

<#macro load_doc4>
    <@sf.fldrow>

            <@sf.label title="Свидетельство о внесении изменений в Единый государственный реестр юридических лиц:" required=false style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc4" fileExtensions='pdf,doc,jpg'  qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc5>
    <@sf.fldrow>

            <@sf.label title="Свидетельство о постановке образовательного учреждения на учет в налоговом органе:" required=false style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc5" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc6>
    <@sf.fldrow>

            <@sf.label title="Уведомление о постановке филиала на учет в налоговом органе (если есть в составе образовательного учреждения):" required=false style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc6" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc8>
    <@sf.fldrow>

            <@sf.label title="Опись представленных документов:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.load_doc8" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

            <@sf.empty colspan="47"/>

    </@sf.fldrow>
</#macro>

<#macro load_doc9>
    <@script.scripttag>
        <@jquery.onready>
            <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc9' hideButtonSections='true'/>
        </@jquery.onready>
    </@script.scripttag>
    <@sf.fldrow>

            <@sf.label title="Копии учебных планов образовательного учреждения по всем образовательным программам, заявленным для государственной аккредитации" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.initAllClones formElement=form.load_doc9 cloneSectionClass="clonesectionLoad_doc9" ; x>
        <@sf.fldrow class="clonesectionLoad_doc9">

                <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                <@sf.fileload path="form.load_doc9[${x}]" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                <@sf.empty colspan="46"/>

        </@sf.fldrow>
    </@sf.initAllClones>
</#macro>

<#macro load_doc10>
    <@sf.fldrow>

            <@sf.label title="Копия положения о филиале образовательного учреждения (при наличии филиала):" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>


        <@sf.fldrow>

                <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                <@sf.fileload path="form.load_doc10" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1" validation="required"/>

                <@sf.empty colspan="47"/>

        </@sf.fldrow>

</#macro>

<#macro load_doc11>
    <@script.scripttag>
        <@jquery.onready>
            <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc11' hideButtonSections='true'/>
        </@jquery.onready>
    </@script.scripttag>
    <@sf.fldrow>

            <@sf.label title="Отчет о результатах самообследования образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.initAllClones formElement=form.load_doc11 cloneSectionClass="clonesectionLoad_doc11" ; x>
        <@sf.fldrow class="clonesectionLoad_doc11">

                <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                <@sf.fileload path="form.load_doc11[${x}]" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                <@sf.empty colspan="46"/>

        </@sf.fldrow>
    </@sf.initAllClones>
</#macro>

<#macro load_doc12>
     <@sf.fldrow>

             <@sf.label title="Копия положения о филиале образовательного учреждения (в случае государственной аккредитации отдельной программы в филиале):" required=true style="text-align:left;" colspan="48"/>

     </@sf.fldrow>

     <@sf.fldrow>

             <@sf.fileload path="form.load_doc12" fileExtensions='pdf,doc,jpg' qtip="" style="text-align:left;" colspan="1" validation="required"/>

             <@sf.empty colspan="47"/>

     </@sf.fldrow>
</#macro>

<#macro load_doc13>
    <@script.scripttag>
        <@jquery.onready>
            <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc13' hideButtonSections='true'/>
        </@jquery.onready>
    </@script.scripttag>
    <@sf.fldrow>

            <@sf.label title="Обоснование необходимости установления иного государственного статуса, отличного от установленного ранее:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.initAllClones formElement=form.load_doc13 cloneSectionClass="clonesectionLoad_doc13" ; x>
        <@sf.fldrow class="clonesectionLoad_doc13">

                <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                <@sf.fileload path="form.load_doc13[${x}]" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                <@sf.empty colspan="46"/>

        </@sf.fldrow>
    </@sf.initAllClones>
</#macro>

<#macro load_doc14>
     <@sf.fldrow>

             <@sf.label title="Заявление образовательного учреждения (с указанием кода и наименования укрупненных групп направлений подготовки и специальностей, а также образовательных программ, относящихся к такой укрупненной группе направлений подготовки и специальностей, имеющихся в приложении к свидетельству о государственной аккредитации):" required=true style="text-align:left;" colspan="48"/>

     </@sf.fldrow>

     <@sf.fldrow>

             <@sf.fileload path="form.load_doc14" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

             <@sf.empty colspan="47"/>

     </@sf.fldrow>
</#macro>

<#macro load_doc15>
     <@sf.fldrow>

             <@sf.label title="Документ, подтверждающий уплату государственной пошлины за переоформление свидетельства:" required=true style="text-align:left;" colspan="48"/>

     </@sf.fldrow>

     <@sf.fldrow>

             <@sf.fileload path="form.load_doc15" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

             <@sf.empty colspan="47"/>

     </@sf.fldrow>
</#macro>