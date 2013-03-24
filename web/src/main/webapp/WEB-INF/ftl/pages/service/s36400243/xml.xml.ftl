<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">

<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
                   xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                   xmlns:tns="http://wss.variant-sm.ru">
	<SOAP-ENV:Header/>
	<SOAP-ENV:Body>
		<mns:GetCardList xmlns:mns="http://wss.variant-sm.ru" SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
			<request xsi:type="tns:dt_cardlistq">
				<org xsi:type="tns:dt_organisation">
					<org_name xsi:type="xsd:string">${form.org_name!''}</org_name>
					<opf xsi:type="xsd:string">${form.opf!''}</opf>
					<ownership xsi:type="xsd:string">${form.ownership!''}</ownership>
					<ogrn xsi:type="xsd:string">${form.ogrn!''}</ogrn>
					<inn xsi:type="xsd:string">${form.inn!''}</inn>
					<okved xsi:type="xsd:string">${form.okved!''}</okved>
					<boss_name xsi:type="xsd:string">${form.boss_name!''}</boss_name>
					<boss_phone xsi:type="xsd:string">${form.boss_phone!''}</boss_phone>
					<dec_name xsi:type="xsd:string">${form.dec_name!''}</dec_name>
					<dec_position xsi:type="xsd:string">${form.dec_position!''}</dec_position>
					<tel xsi:type="xsd:string">${form.tel!''}</tel>
					<mail xsi:type="xsd:string">${form.mail!''}</mail>
					<uraddr xsi:type="tns:dt_addr">
						<addr_index xsi:type="xsd:string">${form.addr_index_doc!''}</addr_index>
						<addr_city xsi:type="xsd:string">${form.commonAddress!''}</addr_city>
						<addr_ul xsi:type="xsd:string">${form.addr_ul_doc!''}</addr_ul>
						<addr_dom xsi:type="xsd:string">${form.addr_dom_doc!''}</addr_dom>
						<addr_korp xsi:type="xsd:string">${form.addr_korp_doc!''}</addr_korp>
						<addr_kvart xsi:type="xsd:string"></addr_kvart>
					</uraddr>
                    <#if form['coincidenc_adress']?? && form['coincidenc_adress']=='on'>
					<factaddr xsi:type="tns:dt_addr">
                        <addr_index xsi:type="xsd:string">${form.addr_index_doc!''}</addr_index>
                        <addr_city xsi:type="xsd:string">${form.commonAddress!''}</addr_city>
                        <addr_ul xsi:type="xsd:string">${form.addr_ul_doc!''}</addr_ul>
                        <addr_dom xsi:type="xsd:string">${form.addr_dom_doc!''}</addr_dom>
                        <addr_korp xsi:type="xsd:string">${form.addr_korp_doc!''}</addr_korp>
                        <addr_kvart xsi:type="xsd:string"></addr_kvart>
					</factaddr>
                    <#else>
                        <addr_index xsi:type="xsd:string">${form.addr_index!''}</addr_index>
                        <addr_city xsi:type="xsd:string">${form.fcommonAddress!''}</addr_city>
                        <addr_ul xsi:type="xsd:string">${form.addr_ul!''}</addr_ul>
                        <addr_dom xsi:type="xsd:string">${form.addr_dom!''}</addr_dom>
                        <addr_korp xsi:type="xsd:string">${form.addr_korp!''}</addr_korp>
                        <addr_kvart xsi:type="xsd:string"></addr_kvart>
                    </#if>
				</org>
				<cardq xsi:type="tns:dt_cardq">
					<spec xsi:type="xsd:string">${form.spec!''}</spec>
					<category xsi:type="xsd:string">${form.category!''}</category>
					<experience xsi:type="xsd:string">${form.experience!''}</experience>
					<education xsi:type="xsd:string">${form.education!''}</education>
					<min_age xsi:type="xsd:string">${form.min_age!''}</min_age>
					<max_age xsi:type="xsd:string">${form.max_age!''}</max_age>
					<sex xsi:type="xsd:string">${form.sex!''}</sex>
					<min_salary xsi:type="xsd:string"></min_salary>
					<max_salary xsi:type="xsd:string"></max_salary>
					<raion xsi:type="xsd:string">${form.raion!''}</raion>
				</cardq>
			</request>
		</mns:GetCardList>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
