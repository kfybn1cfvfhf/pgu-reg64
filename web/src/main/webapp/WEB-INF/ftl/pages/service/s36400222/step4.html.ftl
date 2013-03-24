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
            <#if form.usluga_form != "2">
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Место рождения отца" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@country.block_country_form fieldsMap=fieldsMap country='birth_he_country' countryCode='he_countryCode' input='birth_he_input'
                 country_input='birth_he_country_input'  settlementRF='birth_he_community' area='birth_he_area_txt' region='birth_he_region_txt'
                 settlement_type='birth_he_settlement_type' country_settlement='he_country_settlement' settlement='birth_he_community_txt' city='birth_he_city_txt' />
            </#if>
                <@sf.fldrow>
                    <@sf.empty colspan="1"/>
                    <@sf.label fieldset=true title="Место рождения матери" style="text-align:left;" colspan="20"/>
                    <@sf.empty colspan="27"/>
                </@sf.fldrow>

                <@country.block_country_form fieldsMap=fieldsMap country='birth_she_country' countryCode='she_countryCode' input='birth_she_input'
                 country_input='birth_she_country_input'  settlementRF='birth_she_community' area='birth_she_area_txt' region='birth_she_region_txt'
                 settlement_type='birth_she_settlement_type' country_settlement='she_country_settlement' settlement='birth_she_community_txt' city='birth_she_city_txt' />

				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
	