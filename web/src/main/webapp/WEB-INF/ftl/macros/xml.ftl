<#--
 * optattach
 *
 * Вставляет содержимое файла в SOAP-запрос (в формате base64)
 * если он существует:   <p:file>fieldName_base64</p:file name>.

 *
 * @param fieldName - имя переменной формы.
 * @param fileDescription - описание загруженного файла
 *-->
<#macro optattach fieldName fileDescription>
   <#local fileBean> ${"form." + fieldName} </#local>
   <#if (((fileBean?eval).getFileName())?has_content)>
        <p:file name="${fileDescription}">${form[fieldName + "_base64"]}</p:file>
   </#if>
</#macro>

<#--
 * opt_checked_changed
 *
 * Вставляет содержимое одной из переменных в зависимости от состояния checkbox'а
 *
 * @param checkbox_name - имя переменной checkbox'а
 * @param param_checked - имя переменной, которая вставляется, если CHECKED
 * @param param_unchecked - имя переменной, которая вставляется, если UNCHECKED
 *-->
<#macro opt_checked_changed checkbox_name param_checked param_unchecked><#if form[checkbox_name]?has_content && form[checkbox_name]=="on">${form[param_checked]!""}<#else>${form[param_unchecked]}</#if></#macro>

<#--
 * opt_checked_text
 *
 * Вставляет содержимое переменной если checkbox CHECKED
 *
 * @param checkbox_name - имя переменной checkbox'а
 * @param text - тескт, вставляемый если CHECKED
 *-->
<#macro opt_checked_text checkbox_name text><#if form[checkbox_name]?has_content && form[checkbox_name]=="on">${text};</#if></#macro>

