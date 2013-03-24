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
    <@html.head title='Принятие на учет граждан в качестве нуждающихся в жилых помещениях в целях предоставлении жилых помещений муниципального жилищного фонда по договорам социального найма'>
        <@script.scripttag>
            <@jquery.onready>
                <@customValidators.addCustomValidators />
                <@action.setVisibleByValue onload="true"  srcid="groundsService" event="change" value="3" destid="rightHousingLoad" scope="LBL+EL+ROW"/>
                <@action.unsetDisabledByValue onload="true" srcid="groundsService" event="change" value="3" destid="rightHousingLoad"  />
                <@action.cloneFormRowWithArrays clonesectionclass='family' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass1' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass2' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass3' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass4' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass5' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass6' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass7' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass8' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass9' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass10' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass11' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass12' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass13' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass14' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass15' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='LoadFileClass16' hideButtonSections='true'/>
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
                    <@sf.label path="form.groundsService" title="Основания предоставления услуги:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.groundsService" dictionaryCode="64_GROUNDS_SERVICE_64021" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.zayavIP" title="Заявитель является индивидуальным предпринимателем:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.zayavIP" qtip="" style="text-align:left;" colspan="1"/>
                    <@sf.empty colspan="30"/>
                </@sf.fldrow>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о составе семьи</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.familyAmount" title="Количество членов семьи заявителя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.familyAmount" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.familyLastName cloneSectionClass='family' ; x>
                    <@sf.fldrow class="family">
                        <@sf.label path="form.familyLastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.familyLastName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.familyFirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.familyFirstName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required cyrillic" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.familyMiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                        <@sf.textfield class="clone-field" path="form.familyMiddleName[${x}]" qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="cyrillic" style="text-align:left;" colspan="31"/>

                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.familyBirthDate" title="Дата рождения:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.datefield class="clone-field" path="form.familyBirthDate[${x}]" minDate="01.01.1870" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.familyRelationships" title="Родственные отношения:" required=true style="text-align:left;" colspan="17"/>
                        <@sf.dictionaryLookup class="clone-field" path="form.familyRelationships[${x}]" dictionaryCode="64_FAMILY_RELATIONSHIP_64021" qtip="" validation="required" style="text-align:left;" colspan="31"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.familyIP" title="Член семьи является индивидуальным предпринимателем:" required=false style="text-align:left;" colspan="17"/>
                        <@sf.checkbox class="clone-field" path="form.familyIP[${x}]" qtip="" style="text-align:left;" colspan="1"/>
                        <@sf.empty colspan="30"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.statictext style="text-align:left;" colspan="48"><i>
                            Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов.
                            Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
                        </i></@sf.statictext>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.idDocumentFamilyLoad" title="Документ, удостоверяющий личность члена семьи заявителя, указанного в заявлении:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.fileload class="clone-field" path="form.idDocumentFamilyLoad[${x}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.kinshipLoad" title="Документ, подтверждающий родственные отношения с заявителем:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.fileload class="clone-field" path="form.kinshipLoad[${x}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.label path="form.birthCertificateLoad" title="Свидетельство о рождении:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="family">
                        <@sf.fileload class="clone-field" path="form.birthCertificateLoad[${x}]" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                </@sf.initAllClones>



                <@sf.fldrow>
                    <@sf.label path="form.houseBookLoad" title="Справка о зарегистрированных лицах и лицах, снятых с регистрационного учета, но сохранивших право пользования жилым помещением, выдаваемая управляющей организацией, ТСЖ, ЖСК и др. (справка формы №1):" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.houseBookLoad" qtip="" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass1' ; a>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.label path="form.declarationIncomeLoad" title="Декларация по налогу на доходы физических лиц за год предшествующий дате подаче заявления, заверенной налоговым органом по месту жительства, если в соответствии с законодательством заявитель и член семьи (одинокий гражданин) обязан предоставлять указанную декларацию:" required=true style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.fileload path="form.declarationIncomeLoad[${a}]" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, если в соответствии с законодательством заявитель и член семьи (одинокий гражданин) обязан предоставлять указанную декларацию" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass1">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass2' ; b>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.label path="form.personalIncomeLoad" title="Справка о доходах физического лица (2-НДФЛ):" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.fileload path="form.personalIncomeLoad[${b}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, имеющего доходы в качестве физического лица" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass2">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass3' ; c>
                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.label path="form.otherIncomeLoad" title="Справка, подтверждающая получение всех иных видов доходов заявителя и членов его семьи в денежной и натуральной форме (компенсационные выплаты, вознаграждения, материальная помощь, стипендии, страховые выплаты, проценты по вкладам, доходы по акциям, алименты и т.д.):" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.fileload path="form.otherIncomeLoad[${c}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, в случае получения всех иных видов доходов заявителя и членов его семьи в денежной и натуральной форме (компенсационные выплаты, вознаграждения, материальная помощь, стипендии, страховые выплаты, проценты по вкладам, доходы по акциям, алименты и т.д.)" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass3">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass4' ; d>
                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.label path="form.realEstateLoad" title="Справка с данными о рыночной стоимости недвижимого имущества, определенной независимыми оценщиками:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.fileload path="form.realEstateLoad[${d}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, на которого зарегистрировано недвижимое имущество" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass4">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass5' ; e>
                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.label path="form.priceMotorLoad" title="Документ о рыночной стоимости принадлежащего заявителю и членам его семьи транспортного средства, выданный независимыми оценщиками:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.fileload path="form.priceMotorLoad[${e}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, на которого зарегистрировано транспортное средство" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass5">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass6' ; f>
                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.label path="form.certificateInsuranceLoad" title="Страховое свидетельство обязательного пенсионного страхования всех членов семьи:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.fileload path="form.certificateInsuranceLoad[${f}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass6">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass7' ; g>
                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.label path="form.technicalInventoryLoad" title="Документ соответствующей организации по технической инвентаризации о правах на недвижимое имущество заявителя и членов его семьи, рожденных до 1 января до 1998 года, в том числе выданных на фамилию, имя, отчество, имевшиеся у них до их изменения:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.fileload path="form.technicalInventoryLoad[${g}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass7">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>
                    <@sf.label path="form.rightHousingLoad" title="Документ, подтверждающий право на внеочередное получение жилья:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.rightHousingLoad" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass8' ; h>
                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.label path="form.extractLoad" title="Выписка из Единого государственного реестра индивидуальных предпринимателей:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.fileload path="form.extractLoad[${h}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, являющегося индивидуальным предпринимателем" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass8">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass9' ; j>
                    <@sf.fldrow class="LoadFileClass9">
                        <@sf.label path="form.imputedIncomeLoad" title="Декларация по единому налогу на вмененный доход за год предшествующий дате подаче заявления, заверенной налоговым органом по месту жительства, если член семьи (одинокий гражданин) зарегистрирован как индивидуальный предприниматель и является плательщиком налога на вмененный доход:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass9">
                        <@sf.fileload path="form.imputedIncomeLoad[${j}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>В случае если заявитель и (или) член его семьи является индивидуальным предпринимателем. Необходим для каждого члена семьи." style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass9">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass10' ; i>
                    <@sf.fldrow class="LoadFileClass10">
                        <@sf.label path="form.socialPaymentsLoad" title="Сведения о размере социальных выплат застрахованного лица из бюджетов всех уровней:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass10">
                        <@sf.fileload path="form.socialPaymentsLoad[${i}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, получающего социальные выплаты" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass10">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass11' ; k>
                    <@sf.fldrow class="LoadFileClass11">
                        <@sf.label path="form.semploymentServicesLoad" title="Сведения о размере выплат из органов службы занятости:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass11">
                        <@sf.fileload path="form.semploymentServicesLoad[${k}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, получающего выплаты из органов службы занятости" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass11">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass12' ; l>
                    <@sf.fldrow class="LoadFileClass12">
                        <@sf.label path="form.socialAssistanceLoad" title="Сведения о размере социальных выплатах физическому лицу, признанному нуждающимся в адресной социальной помощи:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass12">
                        <@sf.fileload path="form.socialAssistanceLoad[${l}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, признанному нуждающимся в адресной социальной помощи" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass12">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass13' ; m>
                    <@sf.fldrow class="LoadFileClass13">
                        <@sf.label path="form.transportDocLoad" title="Документы, выданные соответствующими организациями подтверждающие наличие либо отсутствие транспортных средств, принадлежащих заявителю и членам его семьи, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass13">
                        <@sf.fileload path="form.transportDocLoad[${m}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, на которого зарегистрировано транспортное средство" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass13">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass14' ; n>
                    <@sf.fldrow class="LoadFileClass14">
                        <@sf.label path="form.inventCostEastLoad" title="Документ об инвентаризационной стоимости недвижимого имущества, принадлежащего на праве собственности заявителю и членам его семьи (жилые дома, квартиры, дачи, гаражи и иные строение, помещения, сооружения), выдаваемый органами, осуществляющими техническую инвентаризацию по выбору заявителя:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass14">
                        <@sf.fileload path="form.inventCostEastLoad[${n}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи, на которого зарегистрировано недвижимое имущество" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass14">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass15' ; o>
                    <@sf.fldrow class="LoadFileClass15">
                        <@sf.label path="form.cadastrCostZemLoad" title="Документ о величине кадастровой стоимости земельных участков, выдаваемый органами, осуществляющими ведение земельного кадастра:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass15">
                        <@sf.fileload path="form.cadastrCostZemLoad[${o}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Необходим для каждого члена семьи, на которого зарегистрирован земельный участок" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass15">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.initAllClones formElement=form.declarationIncomeLoad cloneSectionClass='LoadFileClass16' ; p>
                    <@sf.fldrow class="LoadFileClass16">
                        <@sf.label path="form.vipIzEGRPLoad" title="Выписка из Единого государственного реестра прав на недвижимое имущество и сделок с ним на заявителя и членов его семьи, в том числе выданные на фамилию, имя, отчество, имевшиеся у них до их изменения:" required=false style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>

                    <@sf.fldrow class="LoadFileClass16">
                        <@sf.fileload path="form.vipIzEGRPLoad[${p}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="<br>Прикладывается для каждого члена семьи" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="LoadFileClass16">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Перечень соглашений</h2></@sf.statictext>

                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.agreementApplicant" title="Об изменении места жительства, составе семьи, семейного положения, а также в случае улучшения жилищных условий, когда норма общей площади жилого помещения на одного члена семьи станет равной норме предоставления жилых помещений по договору социального найма или превысит, или при возникновении других обстоятельств при которых необходимость предоставления жилого помещения отпадет, обязуюсь проинформировать не позднее 30 дней со дня возникновения таких изменений:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.checkbox path="form.agreementApplicant" qtip="" validation="required" style="text-align:left;" colspan="1"/>
                    <@sf.empty colspan="30"/>
                </@sf.fldrow>


            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
