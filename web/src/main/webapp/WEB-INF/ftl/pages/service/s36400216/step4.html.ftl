<#ftl encoding="UTF-8">
<#import "/html.ftl" as html>
<#import "/serviceform.ftl" as sf>
<#import "/spring.ftl" as spring>
<#import "/script.ftl" as script>
<#import "/jquery/jquery.ftl" as jquery>
<#import "/jquery/validation.ftl" as validation>
<#import "/jquery/action.ftl" as action>
<#import "../../../macros/address.ftl" as address>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<@html.html>
    <@html.head title='Признание помещений жилыми помещениями, жилых помещений пригодными (непригодными) для проживания и многоквартирных домов аварийными и подлежащими сносу или реконструкции или о признании необходимости проведения ремонтно-восстановительных работ'>
        <@script.scripttag>
            <@jquery.onready>
                <@action.setVisibleByValue 'true' 'basisFlat' 'change' 'socDocLoad-label' "2"/>
                <@action.setVisibleByValue 'true' 'basisFlat' 'change' 'socDocLoad' "2"/>
                <@action.setVisibleByValue 'true' 'basisFlat' 'change' 'docFlatNote' "2"/>
            </@jquery.onready>
        </@script.scripttag>
    </@html.head>
    <@html.body>
	<@html.sitenavigator step=3/>
        <@sf.serviceForm>
            <@sf.stepList/>
            <@sf.serviceStepForm withFileUpload=true includeEmptyTr=true>
				
                <@sf.fldrow>
					
						<@sf.statictext style="text-align:left;" colspan="48"><h2>Сведения о жилом помещении </h2></@sf.statictext>
					
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.statictext style="text-align:left;" colspan="48"><h2>Адрес жилого помещения</h2></@sf.statictext>
                </@sf.fldrow>

                <@address.block_country_form fieldsMap=fieldsMap
                country='flatAddressCountry' countryCode='flatAddressCountryCode' input='flatAddressEnterType'
                country_input='flatAddressCountryInput' settlementRF='flatAddressSettlementDict' streetRF='flatAddressStreetDict'
                area='flatAddressRayon' region='flatAddressRegion' settlement_type='flatAddressSettlementType'
                country_settlement='flatAddressCountrySettlement' settlement='flatAddressSettlementText' city='flatAddressCity'
                street='flatAddressStreetText' house='flatAddressHouse' corp='flatAddressKorpus' flat='flatAddressFlat' post="flatAddressIndex"  />

                <@sf.fldrow>
                    <@sf.label path="form.basisFlat" title="Основание на котором данный объект принадлежит заявителю:" required=true style="text-align:left;" colspan="18"/>
                    <@sf.dictionaryLookup path="form.basisFlat" dictionaryCode="03_BASIS_FLAT_64216" qtip="" validation="required" style="text-align:left;" colspan="30"/>
                </@sf.fldrow>
				
                <@sf.fldrow>
						<@sf.statictext attr="id='docFlatNote'" style="text-align:left;" colspan="48"><i>Внимание! Размещенные ниже поля предназначены для представления вместе с заявлением электронных копий документов. Электронная копия каждого документа  должна представлять собой один файл в формате PDF, DOC, DOCX, XLS, XLSX, JPG, JPEG, PNG, MDI, TIFF, ODT, ODS, содержащий отсканированный графический образ соответствующего бумажного документа, заверенного надлежащим образом и снабженного всеми необходимыми подписями и печатями.</i></@sf.statictext>
                </@sf.fldrow>
				
                <@sf.fldrow>
                        <@sf.label path="form.socDocLoad" title="Договор социального найма жилого помещения:" required=false style="text-align:left;" colspan="48"/>
                </@sf.fldrow>

                <@sf.fldrow>
                    <@sf.fileload path="form.socDocLoad" qtip='' fileExtensions="PDF,DOC,DOCX,XLS,XLSX,JPG,JPEG,PNG,MDI,TIFF,ODT,ODS" style="text-align:left;" colspan="31"/>
                </@sf.fldrow>
				
            </@sf.serviceStepForm>
        </@sf.serviceForm>
    </@html.body>
</@html.html>
