<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Проведение государственной аккредитации образовательного учреждения'>
        <@script.scripttag>
            <@jquery.onready>
                $('form').append("<style type='text/css'>.qq-upload-file, .qq-upload-size, .qq-upload-clear-text, .qq-upload-clear { display: inline !important; float:none; }</style>");
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc3' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc4' hideButtonSections='true'/>
                <@action.cloneFormRowWithArrays clonesectionclass='clonesectionLoad_doc6' hideButtonSections='true'/>

                if($('#filial').attr('checked')==true)  {
                    $('#load_doc2').parentsUntil('tbody','tr').css('display','table-row').prev().css('display','table-row');
                } else {
                    $('#load_doc2').parentsUntil('tbody','tr').css('display','none').prev().css('display','none');
                }

                $('#filial').change(function(){
                    if($('#filial').attr('checked')==true)  {
                        $('#load_doc2').parentsUntil('tbody','tr').css('display','table-row').prev().css('display','table-row');
                    } else {
                        $('#load_doc2').parentsUntil('tbody','tr').css('display','none').prev().css('display','none');
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
                    <@sf.label title="Заявитель обращается за проведением государственной аккредитации в отношении филиала" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                        <@sf.statictext style="text-align:left;" colspan="48"><h2>Электронные копии документов</h2></@sf.statictext>
                </@sf.fldrow>

                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48" class="field-qtip"><i>Размещенные ниже поля предназначены для представления электронных копий документов. Электронная копия документа  должна представлять собой один файл в формате PDF, DOC или JPG, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями. <br></i></@sf.statictext>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Заявление образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.load_doc0" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="47"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Копия устава образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.load_doc1" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="47"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label path="form.load_doc2" title="Копия положения о филиале образовательного учреждения (в случае проведения государственной аккредитации в отношении филиала):" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.fileload path="form.load_doc2" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:unknown;" colspan="1"/>
					
						<@sf.empty colspan="47"/>
					
                </@sf.fldrow>
				
                <@sf.fldrow>
					
						<@sf.label title="Отчет о результатах самообследования образовательного учреждения:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
                <@sf.initAllClones formElement=form.load_doc3 cloneSectionClass="clonesectionLoad_doc3" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc3">
                        <@sf.fileload path="form.load_doc3[${x}]" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:unknown;" colspan="1"/>
                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>
                        <@sf.empty colspan="46"/>
                    </@sf.fldrow>
                </@sf.initAllClones>
                <@sf.fldrow>
					
						<@sf.label title="Копии учебных планов образовательного учреждения по всем образовательным программам, заявленным для государственной аккредитации:" required=true style="text-align:left;" colspan="48"/>
					
                </@sf.fldrow>
		
        		<@sf.initAllClones formElement=form.load_doc4 cloneSectionClass="clonesectionLoad_doc4" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc4">

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                        <@sf.fileload path="form.load_doc4[${x}]" fileExtensions='pdf,doc,jpg' validation="required" qtip="" style="text-align:left;" colspan="1"/>

                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                        <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

                <@sf.fldrow>

						<@sf.statictext style="text-align:center;" colspan="48"><h2>Документы, предоставляемые Заявителем по собственной инициативе</h2></@sf.statictext>

                </@sf.fldrow>

                 <@sf.fldrow>

						<@sf.label title="Копии документа, подтверждающего наличие лицензии на осуществление образовательной деятельности, с приложением (приложениями), а также свидетельства о государственной аккредитации с приложением (приложениями) (если указанные документы выданы иным лицензирующим или аккредитационным органом):" required=false style="text-align:left;" colspan="48"/>

                </@sf.fldrow>

        		<@sf.initAllClones formElement=form.load_doc6 cloneSectionClass="clonesectionLoad_doc6" ; x>
                    <@sf.fldrow class="clonesectionLoad_doc6">

                        <#-- Поле прикрепления файла клонируется по кнопке «Добавить»-->
                        <@sf.fileload path="form.load_doc6[${x}]" fileExtensions='pdf,doc,jpg'  qtip="" style="text-align:left;" colspan="1"/>

                        <@sf.addRemoveButton addTitle="Добавить" delTitle="Удалить" colspan="1"/>

                        <@sf.empty colspan="46"/>

                    </@sf.fldrow>
                </@sf.initAllClones>

            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
