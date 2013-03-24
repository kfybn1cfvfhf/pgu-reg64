<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "docFields.ftl" as docFields>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Переоформление свидетельства о государственной аккредитации образовательных учреждений'>
        <@script.scripttag>
            <@jquery.onready>
                $('form').append("<style type='text/css'>.qq-upload-file, .qq-upload-size, .qq-upload-clear-text, .qq-upload-clear { display: inline !important; float:none; }</style>");
                if($('#filial').attr('checked')==true)  {
                    $('#load_doc12').parentsUntil('tbody','tr').css('display','table-row').prev().css('display','table-row');
                } else {
                    $('#load_doc12').parentsUntil('tbody','tr').css('display','none').prev().css('display','none');
                }

                $('#filial').change(function(){
                    if($('#filial').attr('checked')==true)  {
                        $('#load_doc12').parentsUntil('tbody','tr').css('display','table-row').prev().css('display','table-row');
                    } else {
                        $('#load_doc12').parentsUntil('tbody','tr').css('display','none').prev().css('display','none');
                    }
                });
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true >

                <@sf.fldrow>
                    <@sf.checkbox path="form.filial" qtip=""  style="text-align:left;" colspan="1"/>
                    <@sf.label title="Заявитель осуществляет государственную аккредитацию отдельной программы в филиале" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>
                <@sf.fldrow>
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Электронные копии документов</h2></@sf.statictext>
                </@sf.fldrow>
                <@sf.fldrow>

						<@sf.statictext class="field-qtip" style="text-align:left;" colspan="48"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>

                </@sf.fldrow>
                <@docFields.load_doc0 />
                <@docFields.load_doc9 />


                <@docFields.load_doc12 />

                <@docFields.load_doc8 />


                  <@sf.fldrow>

						<@sf.statictext  style="text-align:center;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>
<@docFields.load_doc3 />



            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
