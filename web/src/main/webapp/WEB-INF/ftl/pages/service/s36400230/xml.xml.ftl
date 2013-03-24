<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/" xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
   <soapenv:Header/>
   <soapenv:Body>
      <wss:putZjvPovtRB>
         <zjv>
            <!--Optional:-->
			<requestHeader>
			    <typ:authToken>${cAuthToken}</typ:authToken>
			    <typ:requestId>${formRaw.orderId?string("computer")}</typ:requestId>
			    <typ:requestInitiatorCode>
					  <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
					<typ:serviceOrgCode/>
					<!--Optional:-->
					<typ:employee>
						<typ:sname/>
						<typ:fname/>
						<typ:mname/>
						<typ:position/>
					</typ:employee>
			    </typ:requestInitiatorCode>
			    <typ:orgRegistrator>
					  <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
					<typ:serviceOrgCode/>
					<!--Optional:-->
					<typ:employee>
						<typ:sname/>
						<typ:fname/>
						<typ:mname/>
						<typ:position/>
					</typ:employee>
			    </typ:orgRegistrator>
			    <typ:requestTypeCode/>
			    <typ:requestDate>${currentDate?string("yyyy-MM-dd")}</typ:requestDate>
			    <typ:documents/>
			</requestHeader>
            <!--Optional:-->
            <eServiceHeader>
				<typ:userId>${cUserID?string("0")}</typ:userId>
				<typ:eserviceId>36400230</typ:eserviceId>
				<typ:reestrId>1</typ:reestrId>
				<typ:sirRequestId>1</typ:sirRequestId>
				<typ:stateOrgId>1</typ:stateOrgId>
				<typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
            </eServiceHeader>

			<idZags>${form.id_agency_in?split("#")[0]}</idZags>

            <!--Optional:-->
            <#if form.contact_email?has_content><email>${form.contact_email}</email><#else><email/></#if>
            <#if form.contact_phone?has_content><phone>${form.contact_phone}</phone><#else><phone/></#if>
            <!--Optional:-->
            <zjvl>
                <!--Optional:-->
			    <fio>
					<!--Optional:-->
					<fam>${form.declarant_last_name}</fam>
					<!--Optional:-->
					<nam>${form.declarant_first_name}</nam>
					<!--Optional:-->
					<otch><#if form.declarant_middle_name?has_content>${form.declarant_middle_name}</#if></otch>
				</fio>
                <!--Optional:-->
                <pol></pol>
                <!--Optional:-->
                <docum>
					<#if form.declarant_ident_doc_type_gr=="1">
					<nam>${dicRegistry.getItemByKey('DUL_LS', form.declarant_ident_doc_type!'null').name?html}</nam>
                    <#else>
                    <nam>${form.declarant_ident_doc_type_m!""}</nam>
					</#if>
					<#if form.declarant_doc_ser?has_content><seria>${form.declarant_doc_ser}</seria><#else><seria/></#if>
					<!--Optional:-->
					<#if form.declarant_doc_num?has_content><num>${form.declarant_doc_num}</num><#else><num/></#if>
					<!--Optional:-->
                    <#if form.declarant_doc_date?has_content>
                        <dat>
                            <dtDay>${form.declarant_doc_date?string("dd")}</dtDay>
                            <dtMonth>${form.declarant_doc_date?string("MM")}</dtMonth>
                            <dtYear>${form.declarant_doc_date?string("yyyy")}</dtYear>
                        </dat>
                    <#else>
                        <dat/>
                    </#if>
					<!--Optional:-->
					<#if form.declarant_doc_source?has_content><ovd>${form.declarant_doc_source}</ovd><#else><ovd/></#if>
                </docum>
                <!--Optional:-->
                <mestoLive>
					<!--Optional:-->
					<gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.declarant_country!'null').name?html}</gos>
					<!--Optional:-->
					<#if form.declarant_state?has_content><subGos>${form.declarant_state}</subGos><#else><subGos/></#if>
                	<!--Optional:-->
                	<#if form.declarant_region?has_content><rayon>${form.declarant_region}</rayon><#else><rayon/></#if>
                	<!--Optional:-->
                <#if (form.declarant_place!"")=="7" || (form.declarant_place_m!"")=="г." >
                    <gorod>${form.declarant_settlement!''}</gorod>
                <#else>
                    <nasPun>${form.declarant_settlement!''}</nasPun>
                    <typeNP>
                        <#if form.declarant_place_gr=="1">
                            ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.declarant_place!'null').name?html}
                        <#else>${form.declarant_place_m!''}
                        </#if>
                    </typeNP>
                </#if>
                  <#if form.declarant_street?has_content><street>${form.declarant_street}</street><#else><street/></#if>
                	<!--Optional:-->
				  <#if form.declarant_street_type?has_content><typeStr>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.declarant_street_type!'null').name?html}</typeStr><#else><typeStr/></#if>
                	<!--Optional:-->
                  <#if form.declarant_house?has_content><house>${form.declarant_house}</house><#else><house/></#if>
                	<!--Optional:-->
                	<#if form.declarant_building?has_content><korp>${form.declarant_building}</korp><#else><korp/></#if>
                	<!--Optional:-->
                	<#if form.declarant_flat?has_content><kvart>${form.declarant_flat}</kvart><#else><kvart/></#if>
                	<!--Optional:-->
                	<indMal></indMal>
                </mestoLive>
            </zjvl>
            <!--Optional:-->
            <docKind>${form.doc_type}</docKind>
            <#--<docKind>SVIDET</docKind>-->
            <!--Optional:-->
            <#if form.addr_agency?has_content><namZagsTo>${form.addr_agency}</namZagsTo><#else><namZagsTo/></#if>
            <!--Optional:-->
            <typeAZ>AZ_POVT</typeAZ>
            <#if form.addr_agency?has_content && form.addr_agency??>
            <adrZagsTo>
               <gos></gos>
                <subGos></subGos>
                <rayon></rayon>
                <nasPun></nasPun>
                <typeNP></typeNP>
                <street></street>
                <typeStr></typeStr>
                <house></house>
                <korp></korp>
                <indMal></indMal>
            </adrZagsTo>
            <#else>
            <adrZagsTo>
                <gos></gos>
                <subGos></subGos>
                <rayon></rayon>
                <nasPun></nasPun>
                <typeNP></typeNP>
                <street></street>
                <typeStr></typeStr>
                <house></house>
                <korp></korp>
                <kvart></kvart>
                <indMal></indMal>
            </adrZagsTo>
            </#if>
            <!--Optional:-->
            <docRB>
               <!--Optional:-->
               <#if form.divorce_doc_num?has_content><num>${form.divorce_doc_num}</num><#else><num/></#if>
               <!--Optional:-->
                <#if form.divorce_doc_date?has_content>
				<dat>
					<dtDay>${form.divorce_doc_date?string("dd")}</dtDay>
					<dtMonth>${form.divorce_doc_date?string("MM")}</dtMonth>
					<dtYear>${form.divorce_doc_date?string("yyyy")}</dtYear>
				</dat>
                <#else>
                <dat/>
                </#if>
               <!--Optional:-->
               <#if form.divorce_doc_source?has_content><zgs>${form.divorce_doc_source}</zgs><#else><zgs/></#if>
               <!--Optional:-->
				<heDo>
					<!--Optional:-->
					<fam>${form.he_last_name_husband}</fam>
					<!--Optional:-->
					<nam>${form.he_first_name}</nam>
					<!--Optional:-->
                  <otch><#if form.he_middle_name?has_content>${form.he_middle_name}</#if></otch>
				</heDo>
               <!--Optional:-->
					<sheDo>
						<!--Optional:-->
						<fam>${form.she_last_name_wife}</fam>
						<!--Optional:-->
						<nam>${form.she_first_name}</nam>
						<!--Optional:-->
                  <otch><#if form.she_middle_name?has_content>${form.she_middle_name}</#if></otch>
					</sheDo>
            </docRB>
         </zjv>
      </wss:putZjvPovtRB>
   </soapenv:Body>
</soapenv:Envelope>