<#ftl encoding="UTF-8">
<#setting locale="en_US">
<#setting number_format="####################.####################">
<#setting date_format="dd.MM.yyyy">
<#setting time_format="HH:mm:ss">

<SOAP-ENV:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wss.variant-sm.ru">
   <SOAP-ENV:Header/>
   <SOAP-ENV:Body>
      <mns:GetSocWorks xmlns:mns="http://wss.variant-sm.ru" SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
			<request xsi:type="tns:dt_socworkq">
				<person xsi:type="tns:dt_person">
					<last_name xsi:type="xsd:string">${form.last_name!''}</last_name>
					<first_name xsi:type="xsd:string">${form.first_name!''}</first_name>
					<middle_name xsi:type="xsd:string">${form.middle_name!''}</middle_name>
					<birth_date xsi:type="xsd:string"><#if form.birth_date?has_content>${form.birth_date?string('dd.MM.yyyy')}</#if></birth_date>
					<sex xsi:type="xsd:string">${form.sex!''}</sex>
					<citizenship xsi:type="xsd:string">${form.citizenship!''}</citizenship>
					<doc xsi:type="tns:dt_doc">
						<passport_type xsi:type="xsd:string">${form.passport_type!''}</passport_type>
						<passport_series xsi:type="xsd:string">${form.passport_series!''}</passport_series>
						<passport_number xsi:type="xsd:string">${form.passport_number!''}</passport_number>
						<passport_given_out xsi:type="xsd:string">${form.passport_given_out!''}</passport_given_out>
						<passport_delivery_date xsi:type="xsd:string"><#if form.passport_delivery_date?has_content>${form.passport_delivery_date?string('dd.MM.yyyy')}</#if></passport_delivery_date>
					</doc>
					<addr xsi:type="tns:dt_addr">
						<addr_index xsi:type="xsd:string">${form.addr_Index!''}</addr_index>
						<addr_city xsi:type="xsd:string">${form.addr_obl!''}</addr_city>
						<addr_ul xsi:type="xsd:string">${form.addr_ul!''}</addr_ul>
						<addr_dom xsi:type="xsd:string">${form.addr_dom!''}</addr_dom>
						<addr_korp xsi:type="xsd:string">${form.addr_korp!''}</addr_korp>
						<addr_kvart xsi:type="xsd:string">${form.addr_kvart!''}</addr_kvart>
					</addr>
					<tel xsi:type="xsd:string">${form.tel!''}</tel>
					<mail xsi:type="xsd:string">${form.mail!''}</mail>
				</person>
				<edu xsi:type="tns:dt_edu">
					<obr_type xsi:type="xsd:string">${form.obr_type!''}</obr_type>
					<institution xsi:type="xsd:string">${form.institution!''}</institution>
					<issue_date xsi:type="xsd:string"><#if form.expiry_date?has_content>${form.expiry_date?string('dd.MM.yyyy')}</#if></issue_date>
					<speciality_diploma xsi:type="xsd:string">${form.speciality_diploma!''}</speciality_diploma>
					<employment xsi:type="xsd:string">${form.employment!''}</employment>
				</edu>
				<addr_raion xsi:type="xsd:string">${form.addr_raion_info!''}</addr_raion>
			</request>
		</mns:GetSocWorks>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
