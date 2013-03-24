<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/switchableDeadPersonDocumentBirthPlace.ftl" as switchableDeadPersonDocumentBirthPlace>
<#import "../customTemplates/generic/switchableDeadPersonDocumentLivingPlace.ftl" as switchableDeadPersonDocumentLivingPlace>
<#import "../customTemplates/generic/switchableDeadPersonDocumentDeathPlace.ftl" as switchableDeadPersonDocumentDeathPlace>
<#import "../customTemplates/generic/noStreet.ftl" as noStreet>
<#import "../customTemplates/generic/customForm.ftl" as customForm>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на выдачу свидетельства о смерти'>
	    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>
        <@script.scripttag>
            function widthCorrect(){

                var width = '63px';
                if(jQuery.browser.safari)
                    width = '66px';
                $('#death_person_living_building').parent().css('width',width);
            }
            <@jquery.onready>
                //***********правка дизайна**********//
                widthCorrect();
                <@noStreet.onReady useDisabledStyle=true streetTypeField='death_person_living_street_type' streetValueField='death_person_living_street'/>
                <@switchableDeadPersonDocumentBirthPlace.onReady scope="EL+LBL"/>
                <@switchableDeadPersonDocumentLivingPlace.onReady scope="EL+LBL"/>
                <@switchableDeadPersonDocumentDeathPlace.onReady scope="EL+LBL"/>

				<@action.setDisabledByValue 'true' 'death_person_living_street_type' 'change' 'death_person_living_street' '74' />
                <@action.unsetRequiredByField 'true' 'death_person_living_street_type' 'change' 'death_person_living_street' '74' />
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Место рождения умершего" required=false style="text-align:left;" colspan="45"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_birth_country" title="Страна" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.death_person_birth_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@switchableDeadPersonDocumentBirthPlace.radioGroup
                            radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="7" radioGroupFieldColspan="14" radioGroupFieldColspanPaddingRight="1" radioGroupSeparatorColspan="1"
                        />

                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_birth_state" title="Область<br/>(край, респ.)" required=false style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_birth_state" qtip="" validation="regexp maxlength" validationattr={"regexp":"/^[\\|А-Яа-яёЁ\\s()-]{0,80}$/", "maxlength": 80} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="14"/>
						<@sf.empty colspan="2"/>
                        <@customForm.fldcontainer ignoreQTip=true ignoreErrors=true style="text-align:right;" attr='colspan="7"'>
                            <@switchableDeadPersonDocumentBirthPlace.dictionary
                            notd=true nolabel=false nofield=true noseparator=true
                            dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="7" dictionaryFieldColspan="14" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
                            />
                            <@switchableDeadPersonDocumentBirthPlace.textbox
                            notd=true nolabel=false nofield=true noseparator=true
                            textboxLabelColspanPaddingLeft="1" textboxLabelColspan="7" textboxFieldColspan="14" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
                            />
                        </@customForm.fldcontainer>
                    <@sf.empty colspan="1"/>
                        <@sf.fldcontainer path="form.death_person_birth_settlement_type_m" qtip='' style="text-align:left;" attr='colspan="14"   id="byHand_2"'>
                            <@switchableDeadPersonDocumentBirthPlace.dictionary
                            notd=true nolabel=true nofield=false noseparator=true
                            dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="7" dictionaryFieldColspan="14" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
                            />
                            <@switchableDeadPersonDocumentBirthPlace.textbox
                            notd=true nolabel=true nofield=false  noseparator=true
                            textboxLabelColspanPaddingLeft="1" textboxLabelColspan="7" textboxFieldColspan="14" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
                            />
                        </@sf.fldcontainer>

                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_birth_region" title="Район" required=false style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_birth_region" qtip="" validation="regexp maxlength" validationattr={"regexp":"/^[\\|А-Яа-яёЁ\\s()-]{0,80}$/", "maxlength": 80} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="14"/>
						<@sf.empty colspan="2"/>
                        <@sf.label path="form.death_person_birth_settlement" title="Населенный<br/> пункт" required=true style="text-align:right;" colspan="7"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield  path="form.death_person_birth_settlement" qtip="" validation="regexp required maxlength" validationattr={"regexp":"/^[\\|\"А-Яа-я0-9ёЁ\\s./№()-]{0,80}$/", "maxlength": 80} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|.,"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Место жительства умершего" required=false style="text-align:left;" colspan="45"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_living_country" title="Страна" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.death_person_living_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@switchableDeadPersonDocumentLivingPlace.radioGroup
                            radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="7" radioGroupFieldColspan="14" radioGroupFieldColspanPaddingRight="1" radioGroupSeparatorColspan="1"
                        />
                        <@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_living_state" title="Область<br/>(край, респ.)" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_living_state" qtip="" validation="required regexp" attr="maxlength='80'"  validationattr={"regexp":"/^[\\|А-Яа-яёЁ\\s()-]{0,80}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@customForm.fldcontainer ignoreQTip=true ignoreErrors=true style="text-align:right;" attr='colspan="7"'>
                            <@switchableDeadPersonDocumentLivingPlace.dictionary
                            notd=true nolabel=false nofield=true noseparator=true
                            dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="7" dictionaryFieldColspan="14" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
                            />
                            <@switchableDeadPersonDocumentLivingPlace.textbox
                            notd=true nolabel=false nofield=true noseparator=true
                            textboxLabelColspanPaddingLeft="1" textboxLabelColspan="7" textboxFieldColspan="14" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
                            />
                        </@customForm.fldcontainer>
                        <@sf.empty colspan="1"/>
                        <@sf.fldcontainer path="form.death_person_living_settlement_type_m" qtip='' style="text-align:left;" attr='colspan="14"   id="byHand_2"'>
                            <@switchableDeadPersonDocumentLivingPlace.dictionary
                            notd=true nolabel=true nofield=false noseparator=true
                            dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="7" dictionaryFieldColspan="14" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
                            />
                            <@switchableDeadPersonDocumentLivingPlace.textbox
                            notd=true nolabel=true nofield=false  noseparator=true
                            textboxLabelColspanPaddingLeft="1" textboxLabelColspan="7" textboxFieldColspan="14" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
                            />
                        </@sf.fldcontainer>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_living_region" title="Район" required=false style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_living_region" qtip="" validation="regexp" attr="maxlength='80'" validationattr={"regexp":"/^[\\|А-Яа-яёЁ\\s()-]{0,80}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@sf.label path="form.death_person_living_settlement" title="Населенный пункт" required=true style="text-align:right;" colspan="7"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield  path="form.death_person_living_settlement" qtip="" validation="regexp required" attr="maxlength='200'" validationattr={"regexp":"/^[\\|\"А-Яа-я0-9ёЁ\\s./№()-]{0,200}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|.,"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_living_street_type" title="Тип улицы" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.dictionaryLookup path="form.death_person_living_street_type" dictionaryCode="STREET_TYPE_LS" qtip="" validation="required" style="text-align:left;" colspan="14"/>
					    <@sf.empty colspan="2"/>
						<@sf.label path="form.death_person_living_street" title="Улица" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_living_street" qtip="" validation="required regexp" attr="maxlength='33'" validationattr={"regexp":"/^[\\|\"А-Яа-я0-9ёЁ\\s./№()-]{0,33}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|.,"} style="text-align:left;" colspan="14"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_person_living_house" title="Дом" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_living_house" qtip="" validation="required" attr="maxlength='7'" style="text-align:left;" colspan="4"/>
						<#--<@sf.empty colspan="1"/>-->
						<@sf.label path="form.death_person_living_building" title="Корпус" required=false style="text-align:right;" colspan="4"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_living_building" qtip=""  style="text-align:left;" attr="maxlength='4'" colspan="4"/>
						<@sf.empty colspan="3"/>
						<@sf.label path="form.death_person_living_flat" title="Квартира" required=false style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_person_living_flat" attr="maxlength='9'" qtip=""  style="text-align:left;" colspan="14"/>
						<@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label fieldset=true title="Место смерти" required=false style="text-align:left;" colspan="45"/>
						<@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_country" title="Страна" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
                        <@sf.dictionaryLookup path="form.death_country" dictionaryCode="COUNTRY_LS" qtip="" validation="required" attr="maxlength='80'" style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@switchableDeadPersonDocumentDeathPlace.radioGroup
                        radioGroupLabelColspanPaddingLeft="1" radioGroupLabelColspan="7" radioGroupFieldColspan="14" radioGroupFieldColspanPaddingRight="1" radioGroupSeparatorColspan="1"
                        />
                        <@sf.empty colspan="1"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_state" title="Область <br/>(край, респ.)" required=true style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_state" qtip="" validation="required regexp" attr="maxlength='80'" validationattr={"regexp":"/^[\\|А-Яа-яёЁ\\s()-]{0,80}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@customForm.fldcontainer ignoreQTip=true ignoreErrors=true style="text-align:right;" attr='colspan="7"'>
                            <@switchableDeadPersonDocumentDeathPlace.dictionary
                            notd=true nolabel=false nofield=true noseparator=true
                            dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="7" dictionaryFieldColspan="14" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
                            />
                            <@switchableDeadPersonDocumentDeathPlace.textbox
                            notd=true nolabel=false nofield=true noseparator=true
                            textboxLabelColspanPaddingLeft="1" textboxLabelColspan="7" textboxFieldColspan="14" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
                            />
                        </@customForm.fldcontainer>
                        <@sf.empty colspan="1"/>
                        <@sf.fldcontainer path="form.death_settlement_type_m" qtip='' style="text-align:left;" attr='colspan="14"   id="byHand_2"' attr="maxlength='20'">
                            <@switchableDeadPersonDocumentDeathPlace.dictionary
                            notd=true nolabel=true nofield=false noseparator=true
                            dictionaryLabelColspanPaddingLeft="1" dictionaryLabelColspan="7" dictionaryFieldColspan="14" dictionaryFieldColspanPaddingRight="1" dictionarySeparatorColspan="1"
                            />
                            <@switchableDeadPersonDocumentDeathPlace.textbox
                            notd=true nolabel=true nofield=false  noseparator=true
                            textboxLabelColspanPaddingLeft="1" textboxLabelColspan="7" textboxFieldColspan="14" textboxFieldColspanPaddingRight="1" textboxSeparatorColspan="1"
                            />
                        </@sf.fldcontainer>
                    <@sf.empty colspan="2"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.empty colspan="1"/>
						<@sf.label path="form.death_region" title="Район" required=false style="text-align:right;" colspan="7"/>
						<@sf.empty colspan="1"/>
						<@sf.textfield  path="form.death_region" qtip="" validation="regexp" attr="maxlength='80'" validationattr={"regexp":"/^[\\|А-Яа-яёЁ\\s()-]{0,80}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, символов (-)"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="2"/>
                        <@sf.label path="form.death_settlement" title="Населенный <br/>пункт" required=true style="text-align:right;" colspan="7"/>
                        <@sf.empty colspan="1"/>
                        <@sf.textfield  path="form.death_settlement" qtip="" validation="regexp required" attr="maxlength='80'" validationattr={"regexp":"/^[\\|\"А-Яа-я0-9ёЁ\\s./№()-]{0,80}$/"} validationMessage={"regexp":"Допустим ввод кириллицы, цифр и символов \"№(-)/|.,"} style="text-align:left;" colspan="14"/>
                        <@sf.empty colspan="1"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <#list 0..47 as nothing><@sf.empty colspan="1"/></#list>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	