<#import "../customTemplates/generic/util.ftl" as util>
<#import "../../../macros/nakhodka_xml_macros.ftl" as nakhodka>
<#--
    Макрос формирует теги для опциональных полей.
    Если в значение поля field не пустое, то формируем тег вида
    <tagName>field</tagName>,
    иначе
    <tagName/>.
-->
<#macro opttag field tagName>
   <#if ((field?eval)?has_content)><${tagName}>${field?eval}</${tagName}><#else><${tagName}/></#if>
</#macro>

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/" xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
   <soapenv:Header/>
   <soapenv:Body>
      <wss:putZjvPovtRo>
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
            <typ:eserviceId>36400229</typ:eserviceId>
            <typ:reestrId>1</typ:reestrId>
            <typ:reestrId>1</typ:reestrId>
            <typ:sirRequestId>1</typ:sirRequestId>
            <typ:stateOrgId>1</typ:stateOrgId>
            <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
         </EServiceHeader>

           <idZags>${form.id_agency_in?split("#")[0]}</idZags>

                <@opttag "form.contact_email" "email"/>
                <@opttag "form.contact_phone" "phone"/>
            <zjvl>
                <fio>
                    <fam>${form.declarant_last_name}</fam>
                    <nam>${form.declarant_first_name}</nam>
                    <@opttag "form.declarant_middle_name" "otch"/>
                </fio>

                <docum>
                   <dat>
                       <@opttag "form.declarant_ident_doc_date?string(\"dd\")" "dtDay"/>
                       <@opttag "form.declarant_ident_doc_date?string(\"MM\")" "dtMonth"/>
                       <@opttag "form.declarant_ident_doc_date?string(\"yyyy\")" "dtYear"/>
                   </dat>
                    <nam><#if form.declarant_ident_doc_type_gr=='1'>${dicRegistry.getItemByKey('DUL_LS', form.declarant_ident_doc_type!'null').name?html}
                    <#else>${form.declarant_ident_doc_type_m}</#if></nam>
                    <@opttag "form.declarant_ident_doc_num" "num"/>
                    <@opttag "form.declarant_ident_doc_source" "ovd"/>
                    <@opttag "form.declarant_ident_doc_ser" "seria"/>
                </docum>


                <mestoLive>
                    <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.living_he_country!'null').name?html}</gos>

                    <#if (form.living_he_address_input!"")=="1" && form.living_he_country?matches("643")>
                                <subGos><@nakhodka.fromKladr "living_he_community" true "KLADRRegion" "region" /></subGos>
                    <#else>
                        <#if form.living_he_region_txt??><subGos>${form.living_he_region_txt}</subGos><#else >
                            <subGos/>
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
                      <docKind>${form.doc_type}</docKind>

           <#if form.addr_agency?? &&  form.addr_agency?has_content>
          <namZagsTo>${form.addr_agency}</namZagsTo>
          </#if>

         <#if form.addr_agency?? && form.addr_agency?has_content>

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
                <gorod></gorod>
                <gos></gos>
                <nasPun></nasPun>
                <rayon></rayon>
                <subGos></subGos>
                <typeNP></typeNP>
                <house></house>
                <indMal></indMal>
                <korp></korp>
                <kvart></kvart>
                <street></street>
                <typeStr></typeStr>
          </adrZagsTo>
          </#if>


               <docRo>
                        <@opttag "form.birth_doc_num" "num"/>

               <dat>
               <#if form.birth_doc_date?has_content>
                   <dtDay>${form.birth_doc_date?string("dd")}</dtDay>
                   <dtMonth>${form.birth_doc_date?string("MM")}</dtMonth>
                   <dtYear>${form.birth_doc_date?string("yyyy")}</dtYear>
               <#else>
                   <dtDay/>
                   <dtMonth/>
                   <dtYear/>
               </#if>
               </dat>
               <@opttag "form.birth_doc_source" "zgs"/>

               <child>
                  <fam>${form.child_last_name}</fam>
                  <nam>${form.child_first_name}</nam>
                  <@opttag "form.child_middle_name" "otch"/>
               </child>

               <childDatRojd>
                  <dtDay>${form.child_birthday?string("dd")}</dtDay>
                  <dtMonth>${form.child_birthday?string("MM")}</dtMonth>
                  <dtYear>${form.child_birthday?string("yyyy")}</dtYear>
               </childDatRojd>

               <childMestoRojd>
                    <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.birth_child_country!'null').name?html}</gos>

                    <#if (form.birth_child_input!"")=="1" && form.birth_child_country?matches("643")>
                                <subGos><@nakhodka.fromKladr "birth_child_community" true "KLADRRegion" "region" /></subGos>
                    <#else>
                        <#if form.birth_child_region_txt?? ><subGos>${form.birth_child_region_txt}</subGos><#else >
                        <subGos />
                        </#if>
                    </#if>

                        <#if (form.birth_child_input!"")=="1" && form.birth_child_country?matches("643")>
                        <#if (dicRegistry.getItemByKey('KLADRRegion', form.birth_child_community?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.birth_child_community?substring(0,2)+"000000000").name)>
                                        <rayon><@nakhodka.fromKladr "birth_child_community" true "KLADRRegion" "rayon" /></rayon>
                        <#else>
                            <rayon/>
                        </#if>
                    <#else>
                        <#if form.birth_child_area_txt??><rayon>${form.birth_child_area_txt}</rayon><#else >
                            <rayon/>
                        </#if>
                    </#if>

                        <#if (form.birth_child_input!"")=="1" && form.birth_child_country?matches("643")>
                        <nasPun><@nakhodka.fromKladr "birth_child_community" true "KLADRRegion" "gorod" /></nasPun>
                                <typeNP><@nakhodka.fromKladr "birth_child_community" false "KLADRRegion" "gorod" /></typeNP>
                    <#else>
                        <#if (form.birth_child_settlement_type!'')=="1">
                           <gorod>${form.birth_child_city_txt!''}</gorod>
                        <#else>
                           <nasPun>${form.birth_child_community_txt!''}</nasPun>
                           <typeNP/>
                        </#if>
                    </#if>

               </childMestoRojd>


               <fath>
                  <@opttag "form.father_last_name" "fam"/>
                  <@opttag "form.father_first_name" "nam"/>
                  <@opttag "form.father_middle_name" "otch"/>
               </fath>

               <moth>
                  <@opttag "form.mother_last_name" "fam"/>
                  <@opttag "form.mother_first_name" "nam"/>
                  <@opttag "form.mother_middle_name" "otch"/>
               </moth>
            </docRo>

      </zjv>
      </wss:putZjvPovtRo>
   </soapenv:Body>
</soapenv:Envelope>