<#-- Block of fields to input contact info -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#macro renderContactInfoFieldBlock>
    <@sf.fldrow>

            <@sf.label path="form.factAddress" title="Адрес места жительства (пребывания):" required=true style="text-align:left;" colspan="17"/>

            <@sf.textarea path="form.factAddress" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.address" title="Адрес регистрации:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textarea path="form.address" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры" validation="required" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@script.scripttag>

        function setAddressPostByCheckbox(checkboxObj) {
            if (checkboxObj.is(":checked")) {
                $("#addressPost").val($("#factAddress").val());
            } else {
                $("#addressPost").val("");
            }
        }

        <@jquery.onready>

            $("#addressEq").change(function(eventObj){
                setAddressPostByCheckbox($(eventObj.target));
            });
            setAddressPostByCheckbox($("#addressEq"));

        </@jquery.onready>
    </@script.scripttag>
    <@sf.fldrow>

            <@sf.label path="form.addressEq" title="Почтовый адрес совпадает с адресом места жительства (пребывания):" required=false style="text-align:left;" colspan="17"/>

            <@sf.checkbox path="form.addressEq" qtip="Поставьте отметку, если почтовый адрес совпадает с адресом места жительства (пребывания), в этом случае сведения об адресе места жительства будут скопированы на поле «Почтовый адрес»"  style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.addressPost" title="Почтовый адрес:" required=false style="text-align:left;" colspan="17"/>

            <@sf.textarea path="form.addressPost" qtip="Указывается почтовый индекс, наименование региона, района, города, иного населенного пункта, улицы, номера дома, корпуса, квартиры. В качестве почтового адреса так же может быть указан «адрес до востребования» или абонентский ящик."  style="text-align:left;" colspan="31"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>

            <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>

    </@sf.fldrow>
</#macro>