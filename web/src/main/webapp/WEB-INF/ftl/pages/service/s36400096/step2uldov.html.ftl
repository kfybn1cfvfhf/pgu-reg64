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
    <@html.head title='Выдача решения о переводе или об отказе в переводе жилого помещения в нежилое или нежилого помещения в жилое помещение'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.cloneFormRowWithArrays clonesectionclass='founderDocLoadClass' hideButtonSections='true'/>
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
                    <@sf.label path="form.dovlastName" title="Фамилия:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.dovlastName" attr='readonly="true"' wrapperClass='fieldDisabled' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.dovfirstName" title="Имя:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.dovfirstName" attr='readonly="true"' wrapperClass='fieldDisabled' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.dovmiddleName" title="Отчество (если имеется):" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.dovmiddleName" attr='readonly="true"' wrapperClass='fieldDisabled' qtip="Допустимо вносить только кириллические буквы, пробел и знак дефиса"  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><i>
Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа. 
Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.dovUlDovLoad" title="Доверенность на совершение действий от имени заявителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.dovUlDovLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.label path="form.dovUlPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
<@sf.fileload path="form.dovUlPasLoad" validation="required" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" qtip="" style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения об организации</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.org_FullTitle" title="Полное наименование организации:" required=true style="text-align:left;" colspan="17"/>
                    <@sf.dictionaryLookup path="form.org_opf" dictionaryCode="FORM_OF_INCORPORATION_64" qtip="Организационно-правовая форма" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="17" />
                    <@sf.textarea path="form.org_FullTitle" qtip="Наименование организации" validation="required" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.org_SmallTitle" title="Сокращенное наименование организации:" required=false style="text-align:left;" colspan="17"/>
                    <@sf.textfield  path="form.org_SmallTitle" qtip=""  style="text-align:left;" colspan="31"/>
                </@sf.fldrow>

                <@sf.fldrow>

                <#-- блок: statAddressRegAppl-->
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Почтовый адрес
                        организации</h2></@sf.statictext>

                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='org_addressPostCountry' countryCode='org_addressPostCountryCode' input='org_addressPostEnterType'
                country_input='org_addressPostCountryInput' settlementRF='org_addressPostSettlementDict' streetRF='org_addressPostStreetDict'
                area='org_addressPostRayon' region='org_addressPostRegion' settlement_type='org_addressPostSettlementType'
                country_settlement='org_addressPostCountrySettlement' settlement='org_addressPostSettlementText' city='org_addressPostCity'
                street='org_addressPostStreetText' house='org_addressPostHouse' corp='org_addressPostKorpus' office='org_addressPostFlat' post="org_addressPostIndex"  />

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><i>
                        Внимание! Размещенное ниже поле предназначено для представления вместе с заявлением электронной копии документа.
                        Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.
                    </i></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.label path="form.founderDocLoad" title="Копии учредительных документов юридического лица и все изменения и дополнения к ним, если таковые имелись:" required=true style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.initAllClones formElement=form.founderDocLoad cloneSectionClass='founderDocLoadClass' ; x>
                    <@sf.fldrow class="founderDocLoadClass">
                        <@sf.fileload path="form.founderDocLoad[${x}]" fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" validation="required" qtip="" style="text-align:left;" colspan="48"/>
                    </@sf.fldrow>
                    <@sf.fldrow class="founderDocLoadClass">
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить"  colspan="48"/>
                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
