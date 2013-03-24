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
    <@html.head title='Подача электронной заявки на выдачу свидетельства о рождении'>
    <style type="text/css">
        .form-body {
            width: 100%;
        }
        </style>

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

				<input id="usluga_form" type="hidden" value="${form.usluga_form!""}" />
                <input type="hidden" id="father_living_street_type_aggregate"/>
            <#if form.usluga_form != "2">
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Место жительства отца" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@country.block_country_form fieldsMap=fieldsMap country='living_he_country' countryCode='he_live_countryCode' input='living_he_address_input' country_input='living_he_country_input'
                       settlementRF='living_he_community' streetRF='living_he_street' area='living_he_area_txt' region='living_he_region_txt'
                       settlement_type='living_he_settlement_type' country_settlement='he_country_settlement_live' settlement='living_he_community_txt' city='living_he_city_txt'
                       street='living_he_street_txt' house='living_he_house' corp='living_he_corp' flat='living_he_flat'  />

            </#if>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Место жительства матери" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@country.block_country_form fieldsMap=fieldsMap country='living_she_country' countryCode='she_live_countryCode' input='living_she_address_input' country_input='living_she_country_input'
                       settlementRF='living_she_community' streetRF='living_she_street' area='living_she_area_txt' region='living_she_region_txt'
                       settlement_type='living_she_settlement_type' country_settlement='she_country_settlement_live' settlement='living_she_community_txt' city='living_she_city_txt'
                       street='living_she_street_txt' house='living_she_house' corp='living_she_corp' flat='living_she_flat'  />


				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	