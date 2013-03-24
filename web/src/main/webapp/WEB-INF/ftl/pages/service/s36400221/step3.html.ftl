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

                <@country.block_country_form fieldsMap=fieldsMap country='groom_birth_country' countryCode='he_countryCode' input='groom_birth_place_gr' country_input='birth_he_country_input'
                                            settlementRF='groom_birth_settlement' area='groom_birth_region' region='groom_birth_state' settlement_type='birth_he_settlement_type'
                                            country_settlement='he_country_settlement' settlement='birth_he_community_txt' city='birth_he_city_txt' />

                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Она" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@country.block_country_form fieldsMap=fieldsMap country='bride_birth_country' countryCode='she_countryCode' input='bride_birth_place_gr' country_input='birth_she_country_input'
                                            settlementRF='bride_birth_settlement' area='bride_birth_region' region='bride_birth_state' settlement_type='birth_she_settlement_type'
                                            country_settlement='she_country_settlement' settlement='birth_she_community_txt' city='birth_she_city_txt' />



            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	