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
    <@html.head title='Выплата ежемесячного пособия по уходу за ребенком'>
        <@script.scripttag>
            function childChChanged () {
                if($("#childCh").attr('checked') == true) {
                    $(".child1Clone").show();
                    $(".LoadFileClass2").show();
                } else {
                    $(".child1Clone").hide();
                    $(".LoadFileClass2").hide();
                }
            }
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.cloneFormRowWithArrays clonesectionclass='childClone' hideButtonSections='true'/>
                childChChanged ();
                $("#childCh").change(function() {childChChanged();});
                <@action.setVisibleByValue onload="true"  srcid="childCh" event="change" value="on" destid="child1Label"/>
                <@action.cloneFormRowWithArrays clonesectionclass='child1Clone' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass2' hideButtonSections='true'/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о ребенке (детях), на которых назначается пособие</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.childlastName cloneSectionClass='childClone' ; x>
                    <@sf.fldrow class='childClone'>
                        <@sf.label path="form.childlastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.childlastName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class='childClone'>
                        <@sf.label path="form.childfirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.childfirstName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class='childClone'>
                        <@sf.label path="form.childmiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.childmiddleName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class='childClone'>
                        <@sf.label path="form.childBirthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.datefield class="clone-field" path="form.childBirthdate[${x}]"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="childClone">
                        <@sf.addRemoveButton addTitle="Добавить сведения о ребенке" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.childCh" title="Предыдущие дети, рожденные матерью ребенка (детей) по уходу за которым (которыми) назначается пособие, отсутствуют:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.childCh" qtip=""  style="text-align:unknown;" colspan="1"/>
                    <@sf.empty colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" attr="id='child1Label'" colspan="48"><h2>Сведения о предыдущем ребенке (детях), рожденных матерью ребенка (детей) по уходу за которым (которыми) назначается пособие</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.child1lastName cloneSectionClass='child1Clone' ; y>
                    <@sf.fldrow class='child1Clone'>
                        <@sf.label path="form.child1lastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.child1lastName[${y}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class='child1Clone'>
                        <@sf.label path="form.child1firstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.child1firstName[${y}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class='child1Clone'>
                        <@sf.label path="form.child1middleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.child1middleName[${y}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"  style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class='child1Clone'>
                        <@sf.label path="form.child1Birthdate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.datefield class="clone-field" path="form.child1Birthdate[${y}]"  qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="child1Clone">
                        <@sf.addRemoveButton addTitle="Добавить сведения о ребенке" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
                        Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
                    </i></@sf.statictext>

                </@sf.fldrow>

                <@sf.initAllClones formElement=form.childDocLoad cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.childDocLoad" title="Свидетельство о рождении (усыновлении) ребенка (детей), за которым осуществляется уход:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload path="form.childDocLoad[${a}]" qtip="<br>Предоставляется на каждого ребенка, за которым осуществляется уход." validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.child1DocLoad cloneSectionClass='LoadFileClass2' ; b>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.label path="form.child1DocLoad" title="Свидетельство о рождении (усыновлении, смерти) предыдущего ребенка (детей):" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.fileload path="form.child1DocLoad[${b}]" qtip="<br>Предоставляется на каждого ребенка, рожденных матерью ребенка (детей) по уходу за которым (которыми) назначается пособие." validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
