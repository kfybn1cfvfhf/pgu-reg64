<#--
 # Реализует автоматическую расстановку регистра в полях "Имя", "Фамилия" и "Отчество".
 # Порядок аргументов не важен.
 #-->
<#macro controllCase last first middle>
    <@apply last first middle/>
</#macro>

<#macro preScript>
    <#if ! fio_fields_inc??>
        <#assign fio_fields_inc = true>
        <#include "fioFields.js">
    <#else>

        <!-- using JS header fio_fields_inc that is already included above -->

    </#if>
</#macro>

<#macro apply fields...>
    <@preScript/>
    fioFields_apply(<#list fields as field>'${field}'<#if field_has_next>,</#if></#list>);
</#macro>