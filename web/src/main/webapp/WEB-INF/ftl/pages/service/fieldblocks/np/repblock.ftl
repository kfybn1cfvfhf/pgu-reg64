<#-- Block of fields to input representative of natural person data -->

<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>

<#macro renderRepresentativeFieldBlock>
    <@sf.fldrow>

            <@sf.label path="form.dovDovLoad" title="Нотариально заверенная доверенность на совершение действий от имени заявителя:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.dovDovLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="" style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.label path="form.dovPasLoad" title="Документ, удостоверяющий личность уполномоченного представителя:" required=true style="text-align:left;" colspan="48"/>

    </@sf.fldrow>

    <@sf.fldrow>

            <@sf.fileload path="form.dovPasLoad" fileExtensions="pdf,doc,docx,xls,xlsx,jpg,jpeg,png,mdi,tiff,odt,ods" validation="required" qtip="" style="text-align:left;" colspan="48"/>

    </@sf.fldrow>
</#macro>