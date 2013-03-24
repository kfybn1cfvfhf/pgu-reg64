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
		<mns:GetWorkList xmlns:mns="http://wss.variant-sm.ru" SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
			<request xsi:type="tns:dt_worklistq">
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
						<addr_city xsi:type="xsd:string">${form.addr_city!''}</addr_city>
						<addr_ul xsi:type="xsd:string">${form.addr_ul!''}</addr_ul>
						<addr_dom xsi:type="xsd:string">${form.addr_dom!''}</addr_dom>
						<addr_korp xsi:type="xsd:string">${form.addr_korp!''}</addr_korp>
						<addr_kvart xsi:type="xsd:string">${form.addr_kvart!''}</addr_kvart>
					</addr>
					<tel xsi:type="xsd:string">${form.tel!''}</tel>
					<mail xsi:type="xsd:string">${form.mail!''}</mail>
				</person>
				<edudop xsi:type="tns:dt_edudop">
					<edu xsi:type="tns:dt_edu">
						<obr_type xsi:type="xsd:string">${form.obr_type[0]!''}</obr_type>
						<institution xsi:type="xsd:string">${form.institution[0]!''}</institution>
						<issue_date xsi:type="xsd:string"><#if form.issueDate[0]?has_content>${form.issueDate[0]?string('dd.MM.yyyy')}</#if></issue_date>
						<speciality_diploma xsi:type="xsd:string">${form.speciality_diploma[0]!''}</speciality_diploma>
						<employment xsi:type="xsd:string">${form.employment[0]!''}</employment>
					</edu>
                    <edu2 xsi:type="tns:dt_edu">
                        <obr_type xsi:type="xsd:string">${form.obr_type[1]!''}</obr_type>
                        <institution xsi:type="xsd:string">${form.institution[1]!''}</institution>
                        <issue_date xsi:type="xsd:string"><#if form.issueDate[1]?has_content>${form.issueDate[1]?string('dd.MM.yyyy')}</#if></issue_date>
                        <speciality_diploma xsi:type="xsd:string">${form.speciality_diploma[1]!''}</speciality_diploma>
                        <employment xsi:type="xsd:string">${form.employment[1]!''}</employment>
                    </edu2>
					<obr_lang_name xsi:type="xsd:string">${form.obr_lang_name!''}</obr_lang_name>
					<obr_pc xsi:type="xsd:string">${form.obr_pc!''}</obr_pc>
					<obr_driver_cat xsi:type="xsd:string">${form.obr_driver_cat!''}</obr_driver_cat>
					<account_skills xsi:type="xsd:string">${form.account_skills!''}</account_skills>
				</edudop>
				<workq xsi:type="tns:dt_workq">
					<raion xsi:type="xsd:string">${form.addr_raion!''}</raion>
					<spec xsi:type="xsd:string">${form.prof!''}</spec>
					<category xsi:type="xsd:string">${form.work!''}</category>
					<mode xsi:type="xsd:string">${form.mode!''}</mode>
					<okved xsi:type="xsd:string">${form.type!''}</okved>
					<min_salary xsi:type="xsd:string">${form.money!''}</min_salary>
					<kind xsi:type="xsd:string">${form.character!''}</kind>
				</workq>
				<dopinfo xsi:type="tns:dt_workdopinfo">
					<basic_spec xsi:type="xsd:string">${form.basic_trade!''}</basic_spec>
					<experience xsi:type="xsd:string">${form.experience!''}</experience>
					<basic_money xsi:type="xsd:string">${form.basic_money!''}</basic_money>
				</dopinfo>
			</request>
		</mns:GetWorkList>
	</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
