<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "customLookupUtil.ftl" as clu>

<#macro xml guidSession date time room type="AZ_POVT">
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/" xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
       <soapenv:Header/>
       <soapenv:Body>

          <wss:putQueSession>
              <requestHeader>
                  <typ:authToken>${cAuthToken}</typ:authToken>
                  <typ:requestId>${formRaw.orderId?string("computer")}</typ:requestId>
                  <typ:requestInitiatorCode>
                      <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
                      <typ:serviceOrgCode></typ:serviceOrgCode>
                  </typ:requestInitiatorCode>
                  <typ:orgRegistrator>
                      <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
                      <typ:serviceOrgCode></typ:serviceOrgCode>
                  </typ:orgRegistrator>
                  <typ:requestTypeCode></typ:requestTypeCode>
                  <typ:requestDate>${currentDate?string("yyyy-MM-dd")}</typ:requestDate>
                  <typ:documents/>
              </requestHeader>

             <guidSession>${guidSession}</guidSession>
             <timeQue>
                <!--Optional:-->
                <datQue>${date}</datQue>
                <!--Optional:-->
                <typeQue>${type}</typeQue>
                <hourQue>${time?split(':')[0]}</hourQue>
                <minQue>${time?split(':')[1]}</minQue>
                <!--Optional:-->
                <namKabinet>${room}</namKabinet>
             </timeQue>
          </wss:putQueSession>
       </soapenv:Body>
    </soapenv:Envelope>
</#macro>

<#macro step type="AZ_US" id_agency_in_field_name="id_agency_in" dateRequired=true>

    <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label title="Дата и время приема"  fieldset=true style="text-align:left;" colspan="26"/>
            <@sf.empty colspan="21"/>
    </@sf.fldrow>

    <#if dateRequired>
        <#assign requiredValidation = "required" />
    <#else>
        <#assign requiredValidation = "" />
    </#if>

    <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.date" title="Дата" required=dateRequired style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.customLookup  path="form.date" controller='Nahodka_DayQue' qtip="" validation="${requiredValidation}" style="text-align:left;" colspan="13" optionsMap=clu.createOptionsMap(form, {"id_agency_in" : (form[id_agency_in_field_name]!'')?split("#")[0], "operation_type" : type, "userSelectedRegion":"${userSelectedRegion!''}}","method":"getDaysQue"})/>
            <@sf.empty colspan="25"/>
    </@sf.fldrow>

    <@sf.fldrow>
            <@sf.empty colspan="1"/>
            <@sf.label path="form.time" title="Время и кабинет" required=dateRequired style="text-align:right;" colspan="8"/>
            <@sf.empty colspan="1"/>
            <@sf.customLookup path="form.time" validation="${requiredValidation}" controller='Nahodka_TimeQue' optionsMap=clu.createOptionsMap(form, {"id_agency_in" : (form[id_agency_in_field_name]!'')?split("#")[0], "operation_type" : type, "userSelectedRegion":"${userSelectedRegion!''}","method":"getTimesQue"}) dependsOn = [{'fieldId': 'form.date'}] parentLookup={'fieldId': 'date'} qtip=""  style="text-align:left;" colspan="13"/>
            <@sf.empty colspan="25"/>
    </@sf.fldrow>
</#macro>