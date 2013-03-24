<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/switchableDeclarantDocumentPlace.ftl" as switchableDocumentDeclarantPlace>
<#--<#import "../customTemplates/generic/noStreet.ftl" as noStreet>-->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о смерти'>
	    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>
            <@jquery.onready>
                <#--<@noStreet.onReady useDisabledStyle=true/>-->
                <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
                <@action.unsetRequiredByField 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />

                <@switchableDocumentDeclarantPlace.onReady/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label fieldset=true title="Место жительства" required=false style="text-align:left;" colspan="38"/>
					    <@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_index" title="Индекс" required=false style="text-align:right;" colspan="18"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_index" qtip="" validation="index" style="text-align:left;" colspan="19"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.empty colspan="5"/>
                    <@sf.label path="form.declarant_country" title="Страна"  required=true style="text-align:right;" colspan="18"/>
                    <@sf.empty colspan="1"/>
                    <@sf.dictionaryLookup path="form.declarant_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="19"/>
                    <@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_state" title="Область (край, респ.)" required=true style="text-align:right;" colspan="18"/>
					    <@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_state" qtip="" validation="required regexp maxlength" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,200}$/', "maxlength": 80}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="19"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_region" title="Район" required=false style="text-align:right;" colspan="18"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_region" qtip="" validation="regexp" attr="maxlength='80'" validationattr={'regexp':'/^[А-Яа-яёЁ\\s()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="19"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>

                <@switchableDocumentDeclarantPlace.formField
                radioGroupLabelColspanPaddingLeft="5" radioGroupLabelColspan="18" radioGroupFieldColspan="19" radioGroupFieldColspanPaddingRight="5" radioGroupSeparatorColspan="1"
                dictionaryLabelColspanPaddingLeft="5" dictionaryLabelColspan="18" dictionaryFieldColspan="19" dictionaryFieldColspanPaddingRight="5" dictionarySeparatorColspan="1"
                textboxLabelColspanPaddingLeft="5" textboxLabelColspan="18" textboxFieldColspan="19" textboxFieldColspanPaddingRight="5" textboxSeparatorColspan="1" textBoxMaxLength="20"/>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="18"/>
					    <@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_settlement" attr="maxlength='80'" validation="regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9ёЁ\\s./№()-]{0,80}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} qtip="" style="text-align:left;" colspan="19"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="18"/>
                        <@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.declarant_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="19"/>
					    <@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_street" title="Улица" required=true style="text-align:right;" colspan="18"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_street" qtip="" attr="maxlength='33'" validation="regexp required" validationattr={'regexp':'/^[\\|\\"А-Яа-яёЁ0-9ёЁ\\s./№()-]{0,33}$/'}  validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|."} style="text-align:left;" colspan="19"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_house" title="Дом" required=true style="text-align:right;" colspan="18"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_house" qtip="" validation="required" attr="maxlength='7'" style="text-align:unknown;" colspan="6"/>
						<@sf.label path="form.declarant_building" title="Корпус" required=false style="text-align:right;" colspan="4"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_building" qtip=""  attr="maxlength='4'" style="text-align:unknown;" colspan="6"/>
						<@sf.empty colspan="7"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="5"/>
						<@sf.label path="form.declarant_flat" title="Квартира" required=false style="text-align:right;" colspan="18"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.declarant_flat" qtip="" style="text-align:left;" attr="maxlength='9'" colspan="19"/>
						<@sf.empty colspan="5"/>
                </@sf.fldrow>

				<@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	