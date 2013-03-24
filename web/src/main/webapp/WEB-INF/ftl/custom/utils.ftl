<#ftl encoding="UTF-8">

<#function getFileExtension filename>
    <#local ext_pos=filename?last_index_of(".")/>
    <#if ext_pos != -1>
        <#return filename?substring(ext_pos)?lower_case>
    <#else>
        <#return "">
    </#if>
</#function>

<#function detectMimeType filename>
    <#switch getFileExtension(filename)>
        <#case ".doc">
            <#return "application/msword">
            <#break>
        <#case ".docx">
            <#return "application/vnd.openxmlformats-officedocument.wordprocessingml.document">
            <#break>
        <#case ".jpg">
            <#return "image/jpeg">
            <#break>
        <#case ".pdf">
            <#return "application/pdf">
            <#break>
        <#case ".rtf">
            <#return "application/rtf">
            <#break>
        <#case ".tif">
            <#return "image/tiff">
            <#break>
        <#case ".txt">
            <#return "text/plain">
            <#break>
        <#case ".xls">
            <#return "application/vnd.ms-excel">
            <#break>
        <#case ".xlsx">
            <#return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet">
            <#break>
        <#case ".zip">
            <#return "application/zip">
            <#break>
        <#default>
            <#return "application/octet-stream">
    </#switch>
</#function>
