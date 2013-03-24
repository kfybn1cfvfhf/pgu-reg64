<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "../customTemplates/generic/customLookupUtil.ftl" as clu>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/country.ftl" as country>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Подача электронной заявки на регистрацию брака'>
        <@script.scripttag>
            <@jquery.onready>

            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
        <@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm includeEmptyTr=true>

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Он" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@country.block_country_form fieldsMap=fieldsMap country='groom_country' countryCode='he_live_countryCode' input='groom_place_gr' country_input='living_he_country_input'
                                            settlementRF='groom_settlement' streetRF='groom_street' area='groom_region' region='groom_state'
                                            settlement_type='living_he_settlement_type' country_settlement='he_country_settlement_live' settlement='living_he_community_txt' city='living_he_city_txt'
                                            street='living_he_street_txt' house='groom_house' corp='groom_building' flat='groom_flat'  />

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Она" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>


                <@country.block_country_form fieldsMap=fieldsMap country='bride_country' countryCode='she_live_countryCode' input='bride_place_gr' country_input='living_she_country_input'
                                            settlementRF='bride_settlement' streetRF='bride_street' area='bride_region' region='bride_state'
                                            settlement_type='living_she_settlement_type' country_settlement='she_country_settlement_live' settlement='living_she_community_txt' city='living_she_city_txt'
                                            street='living_she_street_txt' house='bride_house' corp='bride_building' flat='bride_flat'  />

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	