<#import "/serviceform.ftl" as sf>
<#import "/jquery/action.ftl" as action>

<#macro preSettlementScript field>
    <@action.setRequiredIf 'true' '${field+"_gr"}' 'change' '${field}' '1' />
    <@action.setRequiredIf 'true' '${field+"_gr"}' 'change' '${field+"_m"}' '2'/>
    <@action.setVisibleByValue  'true' '${field+"_gr"}' 'change' '${field}' "1" />
    <@action.setVisibleByValue  'true' '${field+"_gr"}' 'change' '${field+"_m"}' "2"/>

</#macro>

<#macro settlement field labelTitle title dictionary validation="required cyrillic maxlength" validationattr={"maxlength":"20"} validationmessage='' rightCollspan='25' labelCollspan='8' fieldCollspan='13'>
    <@sf.fldrow>
        <@sf.empty colspan="1"/>
        <@sf.label path='${"form."+field+"_gr"}' title=labelTitle required=true style="text-align: right" colspan="${labelCollspan}"/>
        <@sf.empty colspan="1"/>
        <@sf.radiogroup path='${"form."+field+"_gr"}' staticOpts={'1':'Из справочника','2':'Вручную'} mode='horizontal' validation="required" colspan="${fieldCollspan}"/>
        <@sf.empty colspan="${rightCollspan}"/>
    </@sf.fldrow>
    <@sf.fldrow>
        <@sf.empty colspan="1"/>
        <@sf.label path='${"form."+field}' title=title required=true style="text-align:right;" colspan="${labelCollspan}"/>
        <@sf.empty colspan="1"/>
        <@sf.dictionaryLookup path='${"form."+field}' dictionaryCode=dictionary qtip="" validation="required" style="text-align:left;" colspan="${fieldCollspan}"/>
        <@sf.empty colspan="${rightCollspan}"/>
    </@sf.fldrow>
    <@sf.fldrow>
        <@sf.empty colspan="1"/>
        <@sf.label path='${"form."+field+"_m"}' title=title required=true style="text-align:right;" colspan="${labelCollspan}"/>
        <@sf.empty colspan="1"/>
        <@sf.textfield path='${"form."+field+"_m"}' validation=validation validationattr=validationattr  validationMessage=validationmessage qtip=""  style="text-align:left;" colspan="${fieldCollspan}"/>
        <@sf.empty colspan="${rightCollspan}"/>
    </@sf.fldrow>
</#macro>


