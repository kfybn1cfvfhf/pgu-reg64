<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/address.ftl" as address>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Выплата социальной выплаты на обустройство предоставленного жилого помещения детям-сиротам и детям, оставшимся без попечения родителей, лицам из числа детей-сирот и детей, оставшихся без попечения родителей'>
        <@script.scripttag>
            <@jquery.onready>

            <#--показ мебели и пр.-->
                <@action.setVisibleByValue 'true' 'bed' 'change' 'qt_bed' 'on'/>
                <@action.setVisibleByValue 'true' 'bed' 'change' 'cost_bed' 'on'/>
                <@action.setVisibleByValue 'true' 'table' 'change' 'qt_table' 'on'/>
                <@action.setVisibleByValue 'true' 'table' 'change' 'cost_table' 'on'/>
                <@action.setVisibleByValue 'true' 'wardrobe' 'change' 'qt_wardrobe' 'on'/>
                <@action.setVisibleByValue 'true' 'wardrobe' 'change' 'cost_wardrobe' 'on'/>
                <@action.setVisibleByValue 'true' 'chair' 'change' 'qt_chair' 'on'/>
                <@action.setVisibleByValue 'true' 'chair' 'change' 'cost_chair' 'on'/>
                <@action.setVisibleByValue 'true' 'icebox' 'change' 'qt_icebox' 'on'/>
                <@action.setVisibleByValue 'true' 'icebox' 'change' 'cost_icebox' 'on'/>
            <#---->
                <@action.setVisibleByValue 'true' 'gaz' 'change' 'cost_gaz' 'on'/>
            <#---->
                <@action.setVisibleByValue 'true' 'gku' 'change' 'qt_gku' 'on'/>
                <@action.setVisibleByValue 'true' 'gku' 'change' 'cost_gku' 'on'/>
                <@action.setVisibleByValue 'true' 'gku' 'change' 'costGKUdocLoad' 'on'/>
                <@action.setVisibleByValue 'true' 'gku' 'change' 'costGKUdocLoad-label' 'on'/>
                <@action.setVisibleByValue 'true' 'gku' 'change' 'gku_static' 'on'/>


            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>

                <@sf.fldrow>

                <#-- блок: statAdressJilPomLabel-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о месте нахождения
                        предоставленного жилого помещения</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='jp_addressCountry' countryCode='jp_addressCountryCode' input='jp_addressEnterType'
                country_input='jp_addressCountryInput' settlementRF='jp_addressSettlementDict' streetRF='jp_addressStreetDict'
                area='jp_addressRayon' region='jp_addressRegion' settlement_type='jp_addressSettlementType'
                country_settlement='jp_addressCountrySettlement' settlement='jp_addressSettlementText' city='jp_addressCity'
                street='jp_addressStreetText' house='jp_addressHouse' corp='jp_addressKorpus' flat='jp_addressFlat' post="jp_addressIndex"  />


                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о договоре социального найма
                        жилого помещения</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.dateDogSocNaim" title="Дата заключения договора:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.datefield path="form.dateDogSocNaim"  qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.label path="form.noDogSocNaim" title="Номер договора:" required=true style="text-align:left;" colspan="17"/>

                    <@sf.textfield  path="form.noDogSocNaim" qtip="" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о запрашиваемой
                        услуге</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- 64_SOCIAL_SUPPORT_64053

Значения:

1. ГКУ СО «УСПН Александрово-Гайского района» 
2. ГКУ СО «УСПН Аркадакского района»
3. ГКУ СО «УСПН Аткарского района»
4. ГКУ СО « УСПН Базарно-Карабулакского района»
5. ГКУ СО «УСПН Балаковского района»
6. ГКУ СО «УСПН Балашовского района»
7. ГКУ СО «УСПН Балтайского района»
8. ГКУ СО «УСПН Вольского района»
9. ГБУ ЦСЗН Воскресенского района
10. ГКУ СО «УСПН Дергачевского района»
11. ГКУ СО «УСПН Духовницкого района» 
12. ГКУ СО «УСПН Екатериновского района» 
13. ГКУ СО «УСПН Ершовского района»
14. ГКУ СО «УСПН Ивантеевского района» 
15. ГБУ ЦСЗН Калининского района
16. ГКУ СО «УСПН Красноармейского района» 
17. ГКУ СО «УСПН Краснокутского района» 
18. ГКУ СО «УСПН Краснопартизанского района» 
19. ГКУ СО «УСПН Лысогорского района»
20. ГКУ СО «УСПН Марксовского района» 
21. ГКУ СО «УСПН Новобурасского района» 
22. ГКУ СО «УСПН Новоузенского района»
23. ГКУ СО «УСПН Озинского района»
24. ГКУ СО «УСПН Перелюбского района»
25. ГАУ СО УСПН Петровского района
26. ГКУ СО «УСПН Питерского района»
27. ГКУ СО «УСПН Пугачевского района»
28. ГКУ СО «УСПН Ровенского района»
29. ГБУ ЦСЗН Романовского района»
30. ГКУ СО «УСПН Ртищевского района»
31. ГКУ СО «УСПН Самойловского района»
32. ГКУ СО «УСПН Саратовского района»
33. ГКУ СО «УСПН Советского района»
34. ГКУ СО «УСПН Татищевского района» 
35. ГКУ СО «УСПН Турковского района»
36. ГКУ СО «УСПН Федоровского района»
37. ГКУ СО «УСПН Хвалынского района»
38. ГКУ СО «УСПН Энгельсского района
39. ГКУ СО «Комитет социальной поддержки населения г. Саратова»-->
                    <@sf.label path="form.org_soc" title="Управление социальной защиты населения:" required=true style="text-align:left;" colspan="17"/>

                <#-- 64_SOCIAL_SUPPORT_64053

Значения:

1. ГКУ СО «УСПН Александрово-Гайского района» 
2. ГКУ СО «УСПН Аркадакского района»
3. ГКУ СО «УСПН Аткарского района»
4. ГКУ СО « УСПН Базарно-Карабулакского района»
5. ГКУ СО «УСПН Балаковского района»
6. ГКУ СО «УСПН Балашовского района»
7. ГКУ СО «УСПН Балтайского района»
8. ГКУ СО «УСПН Вольского района»
9. ГБУ ЦСЗН Воскресенского района
10. ГКУ СО «УСПН Дергачевского района»
11. ГКУ СО «УСПН Духовницкого района» 
12. ГКУ СО «УСПН Екатериновского района» 
13. ГКУ СО «УСПН Ершовского района»
14. ГКУ СО «УСПН Ивантеевского района» 
15. ГБУ ЦСЗН Калининского района
16. ГКУ СО «УСПН Красноармейского района» 
17. ГКУ СО «УСПН Краснокутского района» 
18. ГКУ СО «УСПН Краснопартизанского района» 
19. ГКУ СО «УСПН Лысогорского района»
20. ГКУ СО «УСПН Марксовского района» 
21. ГКУ СО «УСПН Новобурасского района» 
22. ГКУ СО «УСПН Новоузенского района»
23. ГКУ СО «УСПН Озинского района»
24. ГКУ СО «УСПН Перелюбского района»
25. ГАУ СО УСПН Петровского района
26. ГКУ СО «УСПН Питерского района»
27. ГКУ СО «УСПН Пугачевского района»
28. ГКУ СО «УСПН Ровенского района»
29. ГБУ ЦСЗН Романовского района»
30. ГКУ СО «УСПН Ртищевского района»
31. ГКУ СО «УСПН Самойловского района»
32. ГКУ СО «УСПН Саратовского района»
33. ГКУ СО «УСПН Советского района»
34. ГКУ СО «УСПН Татищевского района» 
35. ГКУ СО «УСПН Турковского района»
36. ГКУ СО «УСПН Федоровского района»
37. ГКУ СО «УСПН Хвалынского района»
38. ГКУ СО «УСПН Энгельсского района
39. ГКУ СО «Комитет социальной поддержки населения г. Саратова»-->
                    <@sf.dictionaryLookup path="form.org_soc" dictionaryCode="64_SOCIAL_SUPPORT_64053" qtip="Указать орган социальной поддержки населения, в который обращается заявитель по месту нахождения предоставленного жилого помещения" validation="required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об имуществе и услугах, для
                        оплаты которых необходима социальная выплата</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_bed и #cost_bed-->
                    <@sf.label path="form.bed" title="Кровать или диван:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_bed и #cost_bed-->
                    <@sf.checkbox path="form.bed" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #bed
Валидация: цифры-->
                    <@sf.label path="form.qt_bed" title="Количество:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #bed
Валидация: цифры-->
                    <@sf.textfield  path="form.qt_bed" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #bed
Валидация: цифры-->
                    <@sf.label path="form.cost_bed" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #bed
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_bed" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_table и #cost_table-->
                    <@sf.label path="form.table" title="Стол:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_table и #cost_table-->
                    <@sf.checkbox path="form.table" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #bed
Валидация: цифры-->
                    <@sf.label path="form.qt_bed" title="Количество:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #table
Валидация: цифры-->
                    <@sf.textfield  path="form.qt_table" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #bed
Валидация: цифры-->
                    <@sf.label path="form.cost_bed" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #table
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_table" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_wardrobe и #cost_wardrobe-->
                    <@sf.label path="form.wardrobe" title="Шкаф:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_wardrobe и #cost_wardrobe-->
                    <@sf.checkbox path="form.wardrobe" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #wardrobe
Валидация: цифры-->
                    <@sf.label path="form.qt_wardrobe" title="Количество:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #wardrobe
Валидация: цифры-->
                    <@sf.textfield  path="form.qt_wardrobe" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #wardrobe
Валидация: цифры-->
                    <@sf.label path="form.cost_wardrobe" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #wardrobe
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_wardrobe" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_chair и #cost_chair-->
                    <@sf.label path="form.chair" title="Стул или табуретка:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_chair и #cost_chair-->
                    <@sf.checkbox path="form.chair" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #chair
Валидация: цифры-->
                    <@sf.label path="form.qt_chair" title="Количество:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #chair
Валидация: цифры-->
                    <@sf.textfield  path="form.qt_chair" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #chair
Валидация: цифры-->
                    <@sf.label path="form.cost_chair" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #chair
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_chair" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_icebox и #cost_icebox-->
                    <@sf.label path="form.icebox" title="Холодильник:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_icebox и #cost_icebox-->
                    <@sf.checkbox path="form.icebox" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #icebox
Валидация: цифры-->
                    <@sf.label path="form.qt_icebox" title="Количество:" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #icebox
Валидация: цифры-->
                    <@sf.textfield  path="form.qt_icebox" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #icebox
Валидация: цифры-->
                    <@sf.label path="form.cost_icebox" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #icebox
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_icebox" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображается поле #cost_gaz-->
                    <@sf.label path="form.gaz" title="Услуги по подключению газовых приборов и инструктажу по пользованию газовыми приборами:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображается поле #cost_gaz-->
                    <@sf.checkbox path="form.gaz" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gaz
Валидация: цифры-->
                    <@sf.label path="form.cost_gaz" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gaz
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_gaz" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_gku,  #cost_gku и #costGKUdocLoad-->
                    <@sf.label path="form.gku" title="Жилищно-коммунальные услуги:" required=false style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: не активирован
Логика:
1. При активации отображаются поля #qt_gku,  #cost_gku и #costGKUdocLoad-->
                    <@sf.checkbox path="form.gku" qtip=""  style="text-align:unknown;" colspan="31"/>

                    <@sf.empty colspan="30"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku
Валидация: цифры-->
                    <@sf.label path="form.qt_gku" title="Количество (месяцев):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku
Валидация: цифры-->
                    <@sf.textfield  path="form.qt_gku" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku
Валидация: цифры-->
                    <@sf.label path="form.cost_gku" title="Стоимость (руб.):" required=true style="text-align:left;" colspan="17"/>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku
Валидация: цифры-->
                    <@sf.textfield  path="form.cost_gku" qtip="" validation="digits required" style="text-align:left;" colspan="31"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku-->
                    <@sf.statictext attr='id="gku_static"' style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных
                        копий документов.
                        Электронная копия каждого документа должна представлять собой один файл в формате PDF, DOC,
                        DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический
                        образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми
                        необходимыми подписями и печатями.
                    </i></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.label path="form.costGKUdocLoad" title="Платежные документы и их копии (при необходимости оплаты жилищно-коммунальных услуг):" required=true style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

                <@sf.fldrow>

                <#-- По умолчанию: скрыт
Логика:
1. Отображается при активаци чекбокса #gku
Валидатор: PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS.-->
                    <@sf.fileload path="form.costGKUdocLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
