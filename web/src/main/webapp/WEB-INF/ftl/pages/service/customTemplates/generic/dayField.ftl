<#macro preScript>
  <#include "dayField.js">
</#macro>

<#macro controllDay dayField monthField yearField>
    dayField_apply('${dayField}','${monthField}','${yearField}');
</#macro>

