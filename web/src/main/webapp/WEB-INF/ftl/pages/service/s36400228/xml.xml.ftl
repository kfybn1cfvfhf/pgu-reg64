<#import "../customTemplates/generic/switchableDeclarantDocumentPlace.ftl" as switchableDocumentDeclarantPlace>
<#import "../customTemplates/generic/switchableDeclarantDocumentDocType.ftl" as switchableDeclarantDocumentDocType>
<#import "../customTemplates/generic/switchableAgencyPlace.ftl" as switchableAgencyPlace>
<#import "../../../macros/nakhodka_xml_macros.ftl" as nakhodka>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/" xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
   <soapenv:Header/>
   <soapenv:Body>
      <wss:putZjvPovtZB>
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
               <typ:eserviceId>36400228</typ:eserviceId>
               <typ:reestrId>1</typ:reestrId>
               <typ:sirRequestId>1</typ:sirRequestId>
               <typ:stateOrgId>1</typ:stateOrgId>
               <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
            </eServiceHeader>
            <#--<idZags>${form.id_agency_in!""}</idZags>-->
            <idZags>${form.agency_id!""}</idZags>
            <!--Optional:-->
            <#if form.contact_email?has_content><email>${form.contact_email}</email><#else><email/></#if>
            <!--Optional:-->
            <zjvl>
               <!--Optional:-->
               <fio>
                  <fam>${form.declarant_last_name!''}</fam>
                  <nam>${form.declarant_first_name!''}</nam>
                  <otch>${form.declarant_middle_name!''}</otch>
               </fio>
               <!--Optional:-->
               <pol></pol>
               <!--Optional:-->
               <docum>
                  <!--Optional:-->
                  <@switchableDeclarantDocumentDocType.requestField/>
                  <!--Optional:-->
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
               <mestoLive>
                    <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.living_he_country!'null').name?html}</gos>

                    <#if (form.living_he_address_input!"")=="1" && form.living_he_country?matches("643")>
                                <subGos><@nakhodka.fromKladr "living_he_community" true "KLADRRegion" "region" /></subGos>
                    <#else>
                        <#if form.living_he_region_txt??> <subGos>${form.living_he_region_txt}</subGos><#else >
                            <subGos />
                        </#if>
                    </#if>

                    <#if (form.living_he_address_input!"")=="1" && form.living_he_country?matches("643")>
                        <#if (dicRegistry.getItemByKey('KLADRRegion', form.living_he_community?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.living_he_community?substring(0,2)+"000000000").name)>
                                        <rayon><@nakhodka.fromKladr "living_he_community" true "KLADRRegion" "rayon" /></rayon>
                        <#else>
                            <rayon/>
                        </#if>
                    <#else>
                        <#if form.living_he_area_txt??><rayon>${form.living_he_area_txt}</rayon><#else >
                        <rayon/>
                        </#if>
                    </#if>

                    <#if (form.living_he_address_input!"")=="1" && form.living_he_country?matches("643")>
                        <nasPun><@nakhodka.fromKladr "living_he_community" true "KLADRRegion" "gorod" /></nasPun>
                                <typeNP><@nakhodka.fromKladr "living_he_community" false "KLADRRegion" "gorod" /></typeNP>
                    <#else>
                        <#if (form.living_he_settlement_type!'')=="1">
                           <gorod>${form.living_he_city_txt!''}</gorod>
                        <#else>
                           <nasPun>${form.living_he_community_txt!''}</nasPun>
                           <typeNP/>
                        </#if>
                    </#if>

                    <#if (form.living_he_address_input!"")=="1" && form.living_he_country?matches("643")>
                                <street><@nakhodka.fromKladr "living_he_street" true "KLADRStreet" "street" /></street>
                                <typeStr><@nakhodka.fromKladr "living_he_street" false "KLADRStreet" "street" /></typeStr>
                    <#else>
                        <street>${form.living_he_street_txt!''}</street>
                    </#if>
                    <#if form.living_he_house?has_content>
                        <house>${form.living_he_house!''}</house><#else>
                        <house/></#if>
                    <#if form.living_he_corp?has_content>
                        <korp>${form.living_he_corp!''}</korp><#else>
                        <korp/></#if>
                    <#if form.living_he_flat?has_content>
                        <kvart>${form.living_he_flat!''}</kvart><#else>
                        <kvart/></#if>
                        <indMal/>
               </mestoLive>
            </zjvl>
            <!--Optional:-->
            <docKind>${form.doc_type}</docKind>
            <#--<docKind>SVIDET</docKind>-->
            <!--Optional:-->
            <typeAZ>AZ_POVT</typeAZ>
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
            <docZB>
               <!--Optional:-->
               <#if form.merried_doc_num?has_content><num>${form.merried_doc_num}</num><#else><num/></#if>
               <!--Optional:-->
               <#if form.merried_doc_num?has_content>
               <dat>
                  <dtDay><#if form.merried_doc_date?has_content>${form.merried_doc_date?string("dd")}</#if></dtDay>
                  <dtMonth><#if form.merried_doc_date?has_content>${form.merried_doc_date?string("MM")}</#if></dtMonth>
                  <dtYear><#if form.merried_doc_date?has_content>${form.merried_doc_date?string("yyyy")}</#if></dtYear>
               </dat>
               <#else>
               <dat/>
               </#if>
               <!--Optional:-->
               <#if form.merried_doc_source?has_content><zgs>${form.merried_doc_source}</zgs><#else><zgs/></#if>
               <!--Optional:-->
               <heDo>
                  <!--Optional:-->
                  <fam>${form.husband_last_name_before}</fam>
                  <!--Optional:-->
                  <nam>${form.husband_first_name}</nam>
                  <!--Optional:-->
                  <otch><#if form.husband_middle_name?has_content>${form.husband_middle_name}</#if></otch>
               </heDo>
               <!--Optional:-->
               <sheDo>
                  <!--Optional:-->
                  <fam>${form.wife_last_name_before}</fam>
                  <!--Optional:-->
                  <nam>${form.wife_first_name}</nam>
                  <!--Optional:-->
                  <otch><#if form.wife_middle_name?has_content>${form.wife_middle_name}</#if></otch>
               </sheDo>
            </docZB>
         </zjv>
      </wss:putZjvPovtZB>
   </soapenv:Body>
</soapenv:Envelope>