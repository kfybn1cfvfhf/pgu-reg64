<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "/custom/validators.ftl" as customValidators>
<#import "/pages/service/fieldblocks/np/nameblock.ftl" as nameblock>
<#import "/pages/service/fieldblocks/np/identitydocblock.ftl" as iddoc>
<#import "/pages/service/fieldblocks/np/repblock.ftl" as repblock>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Прием заявлений, постановка на учет и зачисление детей в образовательные учреждения реализующие основную образовательную программу дошкольного образования (детские сады)'>
        <@script.scripttag>
            function IdentityDocTypeChenge () {
                $('#passSeria').attr('value', '');
                $('#passNo').attr('value','');
                $('#passFrom').attr('value','');
                $('#passDate').attr('value','');
            }

            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.setVisibleByValue 'true' 'applEmployedCh' 'change' 'workLabel' '1'/>
                <@action.setVisibleByValue 'true' 'applEmployedCh' 'change' 'applWorkPlace' '1'/>
                <@action.setVisibleByValue 'true' 'applEmployedCh' 'change' 'applWorkPost' '1'/>
                <@action.setVisibleByValue 'true' 'applEmployedCh' 'change' 'applWorkPhone' '1'/>

                <@action.setVisibleByValue 'true' 'applPrivilegeCh' 'change' 'infPrivilege' '1'/>
                <@action.setVisibleByValue 'true' 'applPrivilegeCh' 'change' 'privilegeCategory' '1'/>

                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'privilegeDocNote' '1,2,3'/>
                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'topPriorityDocLoad' '1'/>
                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'topPriorityDocLoad-label' '1'/>
                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'priorityDocLoad' '2'/>
                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'priorityDocLoad-label' '2'/>
                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'advantageDocLoad' '3'/>
                <@action.setVisibleByValue 'true' 'privilegeCategory' 'change' 'advantageDocLoad-label' '3'/>

                //IdentityDocTypeChenge();
                $('#identityDocType').change(function() {
                    IdentityDocTypeChenge();
                });

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

            <@sf.fldrow>

                <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об уполномоченном представителе</h2></@sf.statictext>

            </@sf.fldrow>

            <@sf.fldrow>

                <@sf.statictext style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>

            </@sf.fldrow>

                <@repblock.renderRepresentativeFieldBlock />

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о заявителе</h2></@sf.statictext>

                </@sf.fldrow>

                <@nameblock.renderNameFieldBlock />

                <@sf.fldrow>

                    <@sf.label path="form.phone" title="Контактный телефон:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.phone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где  K - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.email" title="Адрес электронной почты:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.email" qtip="Вносится в формате: name@site.domain" validation="email" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.applEmployedCh" title="Заявитель трудоустроен:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.checkbox path="form.applEmployedCh" qtip=""  style="text-align:left;" colspan="31"/>

					<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext attr='id="workLabel"' style="text-align:left;" colspan="48"><h2>Сведения о месте работы заявителя</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.applWorkPlace" title="Место работы:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.applWorkPlace" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.applWorkPost" title="Должность:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.applWorkPost" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.applWorkPhone" title="Рабочий телефон:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.applWorkPhone" qtip="Вносится в одном из следующих форматов: +7(K)N, 8(K)N, (К)N, где К - n-ое количество цифр от 3 до 5, N - n-ое количество цифр от 5 до 7" validation="required phone" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о документе, удостоверяющем личность заявителя</h2></@sf.statictext>

                </@sf.fldrow>

                <@iddoc.renderIdentityDocBlock />

                <@sf.fldrow>

                    <@sf.label path="form.applStatus" title="Статус заявителя:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup path="form.applStatus" dictionaryCode="0364_APPL_STATUS" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- Логика:
При активации чекбокса ШАГ 3 пропускается и осуществляется переход на ШАГ 4.-->
<@sf.label path="form.parent2DisableCh" title="Второй родитель или лицо его заменяющее отсутствует:" required=false style="text-align:left;" colspan="17"/>

						<#-- Логика:
При активации чекбокса ШАГ 3 пропускается и осуществляется переход на ШАГ 4.-->
<@sf.checkbox path="form.parent2DisableCh" qtip=""  style="text-align:unknown;" colspan="1"/>

						<@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.applPrivilegeCh" title="Заявитель обладает льготами на зачисление ребенка в дошкольное образовательное учреждение:" required=false style="text-align:left;" colspan="17"/>

                    <@sf.checkbox path="form.applPrivilegeCh" qtip=""  style="text-align:unknown;" colspan="1"/>

				    <@sf.empty colspan="1"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext attr = "id='infPrivilege'" style="text-align:left;" colspan="48"><h2>Сведения о льготах заявителя</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.privilegeCategory" title="Льготная категория:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.dictionaryLookup path="form.privilegeCategory" dictionaryCode="0364_PRIVILEGE_CATEGORY" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

						<#-- По умолчанию: скрыто Отображается в случае выбора любого значения в #privilegeСategory-->
                        <@sf.statictext attr='id="privilegeDocNote"' style="text-align:left;" colspan="48"><i>Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.topPriorityDocLoad" title="Документ, подтверждающий право на внеочередное право на зачисление:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.fileload path="form.topPriorityDocLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="В качестве документа, подтверждающего право на внеочередное зачисление ребенка в дошкольное образовательное учреждение к заявлению может быть прикреплен один из следующих документов:<br>
1. Удостоверение судьи<br>
2. Удостоверение прокурора<br>
3. Удостоверение следователя" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.priorityDocLoad" title="Документ, подтверждающий право на первоочередное право на зачисление:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.fileload path="form.priorityDocLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="В качестве документа, подтверждающего право на первоочередное зачисление ребенка в дошкольное образовательное учреждение к заявлению может быть прикреплен один из следующих документов:<br>
1. Удостоверение личности военнослужащего<br>
2. Удостоверение сотрудника полиции<br>
3. Свидетельство о смерти<br>
4. Справка с места работы о смерти, в связи с осуществлением служебной деятельности<br>
5. Справка с места работы об увольнении вследствие ранения (контузии), заболевания, полученных в период прохождения службы<br>
6. Справка с места работы о получении телесных повреждений, исключающих для них возможность дальнейшего прохождения службы<br>
7. Удостоверение сотрудника внутренних дел<br>
8. Удостоверение сотрудника Государственной противопожарной службы<br>
9. Удостоверение сотрудника уголовно-исполнительной системы<br>
10. Решение суда о признании лица безвестно отсутствующим<br>
11. Удостоверение многодетной семьи<br>
12. Документ, подтверждающий опеку над ребенком<br>
13. Удостоверение инвалида/ справка об инвалидности<br>
14. Справка, подтверждающая факт, что один из родителей находится на военной службе по призыву, на срочной военной службе<br>
15. Справка о факте перенесенного заболевания" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.advantageDocLoad" title="Документ, подтверждающий право на преимущественное право на зачисление:" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

<@sf.fileload path="form.advantageDocLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="В качестве документа, подтверждающего право на преимущественное  зачисление ребенка в дошкольное образовательное учреждение к заявлению может быть прикреплен один из следующих документов:<br>
1. Справка Ф-25 (для одинокой матери)<br>
2. Справка с места работы для работников дошкольных образовательных учреждений на период их работы в учреждении<br>
3. Справка с места работы для работников здравоохранения на период их работы в учреждении" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
