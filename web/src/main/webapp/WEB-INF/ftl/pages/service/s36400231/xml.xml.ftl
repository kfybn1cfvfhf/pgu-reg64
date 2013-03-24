<#import "../customTemplates/generic/switchableDeclarantDocumentPlace.ftl" as pl>
<#import "../customTemplates/generic/switchableAgencyPlace.ftl" as adpl>
<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as doc>

<#macro opttag field tagName>
   <#if ((field?eval)?has_content)><${tagName}>${field?eval}</${tagName}><#else><${tagName}/></#if>
</#macro>


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/" xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
   <soapenv:Header/>
   <soapenv:Body>
      <wss:putZjvPovtSm>
         <zjv>
          <requestHeader>
             <typ:authToken>${cAuthToken}</typ:authToken>
             <typ:requestId>${formRaw.orderId?string("computer")}</typ:requestId>
             <typ:requestInitiatorCode>
                <typ:regionCode>${userSelectedRegion!''}</typ:regionCode>
                <typ:serviceOrgCode/>
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
          <EServiceHeader>
             <typ:userId>${cUserID?string("0")}</typ:userId>
             <typ:eserviceId>36400231</typ:eserviceId>
             <typ:reestrId>1</typ:reestrId>
             <typ:sirRequestId>1</typ:sirRequestId>
             <typ:stateOrgId>1</typ:stateOrgId>
             <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
          </EServiceHeader>

            <#assign  param = "0">
            <#if form.id_agency_in?? && form.id_agency_in?has_content>
                <#assign param = form.id_agency_in?split('#')[0]>
            </#if>

            <idZags>${param}</idZags>

			<#if form.contact_email?has_content>
                <email>${form.contact_email}</email><#else><email/>
            </#if>
            <#if form.contact_phone?has_content>
                 <phone>${form.contact_phone}</phone><#else><phone/>
            </#if>
            <zjvl>
               <fio>
                  <fam>${form.declarant_last_name!''}</fam>
                  <nam>${form.declarant_first_name!''}</nam>
                  <otch>${form.declarant_middle_name!""}</otch>
               </fio>
               <docum>
                  <#if form.declarant_ident_doc_type_gr=="1">
                    <nam>${dicRegistry.getItemByKey('DUL_LS', form.declarant_ident_doc_type!'null').name}</nam>
                  <#else>
                      <nam>${form.declarant_ident_doc_type_m!""}</nam>
                  </#if>
                 <#if form.declarant_ident_doc_ser?has_content><seria>${form.declarant_ident_doc_ser}</seria><#else><seria/></#if>
                  <#if form.declarant_ident_doc_num?has_content><num>${form.declarant_ident_doc_num}</num><#else><num/></#if>
                  <dat>
                     <#if form.declarant_ident_doc_date?has_content>
                     <dtDay>${form.declarant_ident_doc_date?string("dd")}</dtDay>
                     <dtMonth>${form.declarant_ident_doc_date?string("MM")}</dtMonth>
                     <dtYear>${form.declarant_ident_doc_date?string("yyyy")}</dtYear>
                     <#else>
                     <dtDay/>
                     <dtMonth/>
                     <dtYear/>
                     </#if>
                  </dat>
                  <#if form.declarant_ident_doc_source?has_content><ovd>${form.declarant_ident_doc_source}</ovd><#else><ovd/></#if>
               </docum>
               <mestoLive>
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.declarant_country!'null').name?html}</gos>
                  <#if form.declarant_state?has_content><subGos>${form.declarant_state}</subGos><#else><subGos/></#if>
                  <#if form.declarant_region?has_content><rayon>${form.declarant_region}</rayon><#else><rayon/></#if>
                  <@pl.switchableNasPun/>
                  <#if form.declarant_street?has_content><street>${form.declarant_street}</street><#else><street/></#if>
                  <#if form.declarant_street_type?has_content><typeStr>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.declarant_street_type!'null').name?html}</typeStr><#else><typeStr/></#if>
                  <#if form.declarant_house?has_content><house>${form.declarant_house}</house><#else><house/></#if>
                  <#if form.declarant_building?has_content><korp>${form.declarant_building}</korp><#else><korp/></#if>
                  <#if form.declarant_flat?has_content><kvart>${form.declarant_flat}</kvart><#else><kvart/></#if>
               </mestoLive>
            </zjvl>

             <docKind>${form.doc_type!''}</docKind>

				<#if form.addr_agency?has_content><namZagsTo>${form.addr_agency}</namZagsTo>
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
                <#else><namZagsTo/>
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
                </#if>
            <docSm>
			   <#if form.death_doc_num?has_content><num>${form.death_doc_num}</num><#else><num/></#if>
			   <dat>
                  <#if form.death_doc_date?has_content>
                  <dtDay>${form.death_doc_date?string("dd")}</dtDay>
                  <dtMonth>${form.death_doc_date?string("MM")}</dtMonth>
                  <dtYear>${form.death_doc_date?string("yyyy")}</dtYear>
                  <#else>
                  <dtDay/>
                  <dtMonth/>
                  <dtYear/>
                  </#if>
               </dat>
			   <#if form.death_doc_source?has_content><zgs>${form.death_doc_source}</zgs><#else><zgs/></#if>
               <fio>
                  <fam>${form.death_person_last_name!''}</fam>
                  <nam>${form.death_person_first_name!''}</nam>
                  <otch>${form.death_person_middle_name!""}</otch>
               </fio>
			   <datSm>
                  <dtDay>${form.death_date_day!''}</dtDay>
                  <dtMonth>${form.death_date_month!''}</dtMonth>
                  <dtYear>${form.death_date_year!''}</dtYear>
               </datSm>
			   <mestoSm>
                  <#if form.death_place_country?has_content><gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.death_place_country!'null').name?html}</gos><#else><gos/></#if>

                  <#if form.death_place_state?has_content><subGos>${form.death_place_state}</subGos><#else><subGos/></#if>
                  <#if form.death_place_region?has_content><rayon>${form.death_place_region}</rayon><#else><rayon/></#if>
                  <#--<nasPun>${form.death_place_settlement}</nasPun>-->
                  <@opttag "form.death_place_settlement" "nasPun"/>
                  <#if form.death_place_settlement_type_gr=="1">
                      <#if form.death_place_settlement_type ?has_content>
                          <typeNP>${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.death_place_settlement_type!'null').name?html}</typeNP>
                      <#else>
                          <typeNP/>
                      </#if>
                  <#else>
                      <typeNP>${form.death_place_settlement_type_m!''}</typeNP>
                  </#if>
                    </mestoSm>
            </docSm>
         </zjv>
      </wss:putZjvPovtSm>
   </soapenv:Body>
</soapenv:Envelope>
