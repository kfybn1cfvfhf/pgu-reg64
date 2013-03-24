<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../customTemplates/generic/util.ftl" as util>
<#import "../customTemplates/generic/noStreet.ftl" as noStreet>
<#import "../../../macros/country.ftl" as country>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<@html.html>
    <@html.head title='Подача электронной заявки на повторную выдачу свидетельства/справки о рождении'>

        <@script.scripttag>

            function widthCorrect(){

                    var width = '170px';
                    if(jQuery.browser.msie)
                       width = '178px';
                    if(jQuery.browser.mozilla)
                        width = '168px';

                $('#declarant_building').parent().css('width',width);
            }
            <@jquery.onready>
            //***********правка дизайна**********//
                widthCorrect();

                <#-- Artem, please take a look at comments in applyInitRules, please -->

                <#--<@noStreet.onReady useDisabledStyle=true/>-->
                <@action.setDisabledByValue 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
                <@action.unsetRequiredByField 'true' 'declarant_street_type' 'change' 'declarant_street' '74' />
                <@util.preSettlementScript field='declarant_place' />
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
						<@sf.label fieldset=true title="Место жительства заявителя" required=false style="text-align:left;" colspan="40"/>
						<#--<@sf.empty colspan="1"/>-->
						<@sf.empty colspan="7"/>
                        <@sf.textfield  path="form.type_street_no" tdstyle='display:none;' />
                </@sf.fldrow>


                <@country.block_country_form fieldsMap=fieldsMap country='living_he_country' countryCode='he_live_countryCode' input='living_he_address_input' country_input='living_he_country_input'
                       settlementRF='living_he_community' streetRF='living_he_street' area='living_he_area_txt' region='living_he_region_txt'
                       settlement_type='living_he_settlement_type' country_settlement='he_country_settlement_live' settlement='living_he_community_txt' city='living_he_city_txt'
                       street='living_he_street_txt' house='living_he_house' corp='living_he_corp' flat='living_he_flat'  />



            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	