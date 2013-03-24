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
    <@html.head title='Выдача региональных карточек транспортного обслуживания, предоставляющих право бесплатного проезда'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="1,6,7,8,9" destid="recipientIdentityDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="1,6,7,8,9" destid="recipientIdentityDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="2" destid="vetTrudDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="2" destid="vetTrudDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="2" destid="vetVoenSlugDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="2" destid="vetVoenSlugDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="3" destid="vetTrudSODocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="3" destid="vetTrudSODocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="4" destid="vetVOVDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="4" destid="vetVOVDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="5" destid="sprRepDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="5" destid="sprRepDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="1,6,7,8,9" destid="svedRojDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="1,6,7,8,9" destid="svedRojDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="1" destid="edBiletDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="1" destid="edBiletDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="1" destid="reshOpecDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="1" destid="reshOpecDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="1" destid="sprObrUchDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="1" destid="sprObrUchDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="6" destid="mnogodetDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="6" destid="mnogodetDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="7,8" destid="childInvDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="7,8" destid="childInvDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="9" destid="ogrZdorDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="9" destid="ogrZdorDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="10" destid="geroiDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="10" destid="geroiDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="11,12,13,15" destid="udostLgotDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="11,12,13,15" destid="udostLgotDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="14" destid="blokadLenDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="14" destid="blokadLenDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="15" destid="sprInvDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="15" destid="sprInvDocLoad"/>
                <@action.setVisibleByValue onload="true"  srcid="preferentialStatus" event="change" value="16" destid="conclagerDocLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="preferentialStatus" event="change" value="16" destid="conclagerDocLoad"/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Дополнительные сведения, необходимые для предоставления услуги</h2></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.socialSupport" title="Орган социальной поддержки населения, предоставляющий государственную услугу:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.socialSupport" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать один из органов социальной поддержки населения, в который обращается заявитель" validation="required" style="text-align:left;" colspan="31"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.preferentialStatus" title="Льготный статус лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="17"/>
<@sf.dictionaryLookup path="form.preferentialStatus" dictionaryCode="64_PREFERENTIAL_STATUS_64205" qtip="Указать в случае наличия льготный статус лица, нуждающегося в услуге" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.recipientIdentityDocLoad" title="Документ, удостоверяющий личность лица, нуждающегося в услуге:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
                    <@sf.fileload path="form.recipientIdentityDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip='<br>В качестве документа удостоверяющего личность могут быть приложены вид на жительство или разрешение на временное проживание для граждан, относящихся к категориям:<br>
1. Лица, проработавшие в тылу в период с 22 июня 1941 года по 9 мая 1945 года не менее 6 месяцев, исключая период работы на временно оккупированных территориях СССР, либо проработавшие менее 6 месяцев и награжденные орденом или медалями СССР за самоотверженный труд в годы ВОВ, - жители Саратовской области<br>
2. Реабилитированные лица и лица, признанные пострадавшими от политических репрессий, - жители Саратовской области<br>
3. Дети из многодетных семей, обучающиеся в общеобразовательных учреждениях Саратовской области<br>
4. Дети-инвалиды, обучающиеся в общеобразовательных учреждениях<br>
5. Лица, сопровождающие в поездках детей-инвалидов<br>
6. Инвалиды Великой Отечественной войны<br>
7. Участники Великой Отечественной войны из числа лиц, указанных в подпунктах "а"-"ж", "и" пункта 1 статьи 2 Федерального закона "О ветеранах"<br>
8. Военнослужащие, проходившие военную службу в воинских частях, учреждениях, военно-учебных заведениях, не входивших в состав действующей армии, в период с 22 июня 1941 года по 3 сентября 1945 года не менее 6 месяцев, военнослужащие, награжденные орденами или медалями СССР за службу в указанный период<br>
9. Лица, награжденные знаком "Жителю блокадного Ленинграда"<br>
10. Лица, признанные инвалидами, работавшие в период Великой Отечественной войны на объектах противовоздушной обороны, местной противовоздушной обороны, на строительстве оборонительных сооружений, военно-морских баз, аэродромов и других военных объектов в пределах тыловых границ действующих фронтов, операционных зон действующих флотов, на прифронтовых участках железных и автомобильных дорог, а также члены экипажей судов транспортного флота, интернированных в начале Великой Отечественной войны в портах других государств<br>
11. Бывшие несовершеннолетние узники концлагерей, гетто, других мест принудительного содержания, созданных немецко-фашистскими захватчиками и их союзниками в период Второй мировой войны' style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
<@sf.label path="form.vetTrudDocLoad" title="Удостоверение ветерана труда:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.vetTrudDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.vetVoenSlugDocLoad" title="Удостоверение ветерана военной службы:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.vetVoenSlugDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.vetTrudSODocLoad" title="Удостоверение ветерана труда Саратовской области:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.vetTrudSODocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.vetVOVDocLoad" title="Удостоверение ветерана Великой Отечественной войны:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.vetVOVDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sprRepDocLoad" title="Справка правоохранительных органов о реабилитации или признании пострадавшим от политических репрессий:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.sprRepDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.svedRojDocLoad" title="Свидетельство о рождении ребенка либо паспорт на ребенка старше 14 лет:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.svedRojDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.edBiletDocLoad" title="Единый билет, выданный органами опеки и попечительства администрации муниципального района:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.edBiletDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.reshOpecDocLoad" title="Решение (постановление) об установлении опеки или попечительства над ребенком:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.reshOpecDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sprObrUchDocLoad" title="Справка из образовательного учреждения  с обязательным указанием бюджета финансирования учреждения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.sprObrUchDocLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Не требуется для  учащихся общеобразовательных школ" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.mnogodetDocLoad" title="Удостоверение и вкладыш к удостоверению многодетной семьи:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.mnogodetDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.childInvDocLoad" title="Справка федерального учреждения медико-социальной экспертизы об установлении ребенку категории «ребенок-инвалид»:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.childInvDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.ogrZdorDocLoad" title="Заключение медицинского учреждения о наличии у ребенка ограниченных возможностей здоровья:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.ogrZdorDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.geroiDocLoad" title="Документ, удостоверяющий статус Героя или полного кавалера ордена Славы:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.geroiDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.udostLgotDocLoad" title="Удостоверение единого образца, установленного для каждой льготной категории граждан законодательством:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.udostLgotDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.blokadLenDocLoad" title="Удостоверение к знаку «Жителю блокадного Ленинграда»:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.blokadLenDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.sprInvDocLoad" title="Справка федерального учреждения медико-социальной экспертизы, подтверждающую факт установления инвалидности:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.sprInvDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.conclagerDocLoad" title="Удостоверение о праве на льготы бывшим несовершеннолетним узником концлагерей, гетто, других мест принудительного содержания, созданных фашистами и их союзниками в период Второй мировой войны:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.conclagerDocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
