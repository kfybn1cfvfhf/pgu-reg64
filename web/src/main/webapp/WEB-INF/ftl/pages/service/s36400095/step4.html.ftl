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
    <@html.head title='Получение разрешения на установку рекламной конструкции'>
        <@script.scripttag>
        function vladReklChanged () {
        if($("#vladRekl").attr('checked') == true) {
        $(".dogReklClone").show();
        } else {
        $(".dogReklClone").hide();
        }
        }

            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='reklClone' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='dogReklClone' hideButtonSections='true'/>
            vladReklChanged ();
            $("#vladRekl").change(function() {vladReklChanged();});

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm  includeEmptyTr=true>
                <@sf.initAllClones formElement=form.addressReklConstr cloneSectionClass='reklClone' ; x>

                    <@sf.fldrow class="reklClone">
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о адресе и месте установке
                            рекламной конструкции</h2>
                        <i>В случае если установка рекламной конструкции производится на двух и более объектах недвижимости данную группу полей необходимо клонировать с помощью кнопки "Добавить" и внести информацию относящуюся к остальным объектам недвижимости</i></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="reklClone">
                        <@sf.label path="form.addressReklConstr" title="Адрес (местоположение) установки рекламной конструкции:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textarea path="form.addressReklConstr[${x}]" class="clone-field" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, или местоположение относительно ближайшего ориентира (для земельных участков)" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="reklClone">
                        <@sf.label path="form.kadastrNoReklConstr" title="Кадастровый номер объекта недвижимости:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield  path="form.kadastrNoReklConstr[${x}]" class="clone-field" qtip="Указывается кадастровый номер объекта недвижимости на котором необходимо разместить рекламную конструкцию" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="reklClone">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="48"/>
                    </@sf.fldrow>

                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о рекламной
                        конструкции</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.expRekl" title="Срок эксплуатации рекламной конструкции:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.expRekl" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.typeRekl" title="Тип рекламной конструкции:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.typeRekl" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.kolStorRekl" title="Количество сторон рекламной конструкции:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.kolStorRekl" qtip="" validation="required digits" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.areaRekl" title="Площадь информационного поля и его габариты:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textarea path="form.areaRekl" qtip="Указать габариты каждой стороны рекламной конструкции и общую площадь информационного поля всей рекламной конструкции" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.lightRekl" title="Наличие подсветки:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.lightRekl" dictionaryCode="LIGHT_REKLAM_CONSTR_64" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.vladRekl" title="Заявитель не является собственником или иным законным владельцем недвижимого имущества, на которое присоединяется рекламная конструкция" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.vladRekl" qtip=""  style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.sobSobst" title="Для установки и эксплуатации рекламной конструкции необходимо использование общего имущества собственников помещений в многоквартирном доме:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.sobSobst" qtip=""  style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.cultCh" title="Рекламная конструкция размещается на объектах культурного наследия (памятниках истории и культуры) народов Российской Федерации" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.cultCh" qtip=""  style="text-align:unknown;" colspan="31"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.dogRekl cloneSectionClass='dogReklClone' ; y>
                    <@sf.fldrow class="dogReklClone">
                        <@sf.label path="form.dogRekl" title="Срок действия договора на установку и эксплуатацию рекламной конструкции:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield path="form.dogRekl[${y}]" class="clone-field" qtip="В случае если установка рекламной конструкции производится на двух и более объектах недвижимости данное поле необходимо клонировать с помощью кнопки \"Добавить\" и внести информацию относящуюся к остальным объектам недвижимости" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="dogReklClone">
                        <@sf.addRemoveButton addTitle="Добавить информацию о сроке действия договора на установку и эксплуатацию рекламной конструкции" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>

                </@sf.initAllClones>


            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
