<#import "../customTemplates/generic/switchableAgencyPlace.ftl" as switchableAgencyPlace>

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/" xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
   <soapenv:Header/>
   <soapenv:Body>
      <wss:putZjvPovtUO>
         <zjv>
            <!--Optional:-->
            <requestHeader>
               <typ:authToken>${cAuthToken}</typ:authToken>
               <typ:requestId>${formRaw.orderId?string("computer")}</typ:requestId>
               <typ:requestInitiatorCode>
                  <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
                    <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
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
                    <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
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
               <typ:eserviceId>36400232</typ:eserviceId>
               <typ:reestrId>1</typ:reestrId>
               <typ:sirRequestId>1</typ:sirRequestId>
               <typ:stateOrgId>1</typ:stateOrgId>
               <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
            </eServiceHeader>
            <idZags>${form.id_agency_in?split("#")[0]}</idZags>
            <!--Optional:-->
            <#if form.contact_email?has_content><email>${form.contact_email}</email><#else><email/></#if>
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
                  <!--Optional:-->

                  <nam><#if form.declarant_ident_doc_type_gr == "1">${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.declarant_ident_doc_type!'null').name?html}<#else>${form.declarant_ident_doc_type_m}</#if></nam>
                  <!--Optional:-->
					<#if form.declarant_ident_doc_ser?has_content><seria>${form.declarant_ident_doc_ser}</seria><#else><seria/></#if>
                  <!--Optional:-->
					<#if form.declarant_ident_doc_num?has_content><num>${form.declarant_ident_doc_num}</num><#else><num/></#if>
                  <!--Optional:-->
                    <#if form.declarant_ident_doc_date?has_content>
                  <dat>
                            <dtDay>${form.declarant_ident_doc_date?string("dd")}</dtDay>
                            <dtMonth>${form.declarant_ident_doc_date?string("MM")}</dtMonth>
                            <dtYear>${form.declarant_ident_doc_date?string("yyyy")}</dtYear>
                  </dat>
                    <#else>
                        <dat/>
                    </#if>
                  <!--Optional:-->
					<#if form.declarant_ident_doc_source?has_content><ovd>${form.declarant_ident_doc_source}</ovd><#else><ovd/></#if>
               </docum>
               <mestoLive>
                  <!--Optional:-->
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.declarant_country!'null').name?html}</gos>
                  <!--Optional:-->
                  <#if form.declarant_state?has_content><subGos>${form.declarant_state}</subGos><#else><subGos/></#if>
                  <!--Optional:-->
                  <#if form.declarant_region?has_content><rayon>${form.declarant_region}</rayon><#else><rayon/></#if>
                  <!--Optional:-->
                  <gorod></gorod>
                  <!--Optional:-->
                  <#if form.declarant_settlement?has_content><nasPun>${form.declarant_settlement}</nasPun><#else><nasPun/></#if>
                  <!--Optional:-->
                  <#if form.declarant_place?has_content><typeNP>${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.declarant_place!'null').name?html}</typeNP><#else><typeNP/></#if>
                  <!--Optional:-->
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
            <docUO>
               <!--Optional:-->
               <#if form.affiliation_doc_num?has_content><num>${form.affiliation_doc_num}</num><#else><num/></#if>
               <!--Optional:-->
               <#if form.affiliation_doc_date?has_content>
               <dat>
                  <dtDay>${form.affiliation_doc_date?string("dd")}</dtDay>
                  <dtMonth>${form.affiliation_doc_date?string("MM")}</dtMonth>
                  <dtYear>${form.affiliation_doc_date?string("yyyy")}</dtYear>
               </dat>
               <#else>
               <dat/>
               </#if>
               <!--Optional:-->
               <#if form.affiliation_doc_source?has_content><zgs>${form.affiliation_doc_source}</zgs><#else><zgs/></#if>
               <!--Optional:-->
               <childDo>
                  <!--Optional:-->
                  <#if form.child_last_name?has_content><fam>${form.child_last_name}</fam><#else><fam/></#if>
                  <!--Optional:-->
                  <#if form.child_first_name?has_content><nam>${form.child_first_name}</nam><#else><nam/></#if>
                  <!--Optional:-->
                  <#if form.child_middle_name?has_content><otch>${form.child_middle_name}</otch><#else><otch/></#if>
              </childDo>
               <!--Optional:-->
               <#if form.child_birthday?has_content>
               <childDatRojd>
                  <dtDay>${form.child_birthday?string("dd")}</dtDay>
                  <dtMonth>${form.child_birthday?string("MM")}</dtMonth>
                  <dtYear>${form.child_birthday?string("yyyy")}</dtYear>
               </childDatRojd>
               <#else>
               <childDatRojd/>
               </#if>
               <!--Optional:-->
               <childMestoRojd>
                  <!--Optional:-->
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.child_birth_place_country!'null').name?html}</gos>
                  <!--Optional:-->
                  <#if form.child_birth_place_state?has_content><subGos>${form.child_birth_place_state}</subGos><#else><subGos/></#if>
                  <!--Optional:-->
                  <#if form.child_birth_place_region?has_content><rayon>${form.child_birth_place_region}</rayon><#else><rayon/></#if>
                   <#if (form.child_birth_place_settlement_type!"")=="7" || (form.child_birth_place_settlement_type_m!"")=="г." >
                        <gorod>${form.child_birth_place_settlement!''}</gorod>
                    <#else>
                        <nasPun>${form.child_birth_place_settlement!''}</nasPun>
                        <typeNP><#if form.child_birth_place_settlement_type_gr=="1">
                        ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.child_birth_place_settlement_type!'null').name?html}
                        <#else>${form.child_birth_place_settlement_type_m!''}</#if></typeNP>
                    </#if>
               </childMestoRojd>
               <!--Optional:-->
			   <fath>
                  <!--Optional:-->
                  <fam>${form.father_last_name}</fam>
                  <!--Optional:-->
                  <nam> ${form.father_first_name}</nam>
                  <!--Optional:-->
                  <otch><#if form.father_middle_name?has_content>${form.father_middle_name}</#if></otch>

                  <typeNP><#if form.declarant_place_gr == "1">${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.declarant_place!'null').name?html}<#else>${form.declarant_place_m}</#if></typeNP>
               </fath>
			   <childPosle>
                  <!--Optional:-->
                  <fam>${form.child_affiliation_last_name}</fam>
                  <!--Optional:-->
                  <nam>${form.child_affiliation_first_name}</nam>
                  <!--Optional:-->
                  <otch><#if form.child_affiliation_middle_name?has_content>${form.child_affiliation_middle_name}</#if></otch>
               </childPosle>
           </docUO>
         </zjv>
      </wss:putZjvPovtUO>
   </soapenv:Body>
</soapenv:Envelope>