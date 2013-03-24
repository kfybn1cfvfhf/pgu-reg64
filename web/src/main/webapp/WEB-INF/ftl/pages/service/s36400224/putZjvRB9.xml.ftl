<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
   <soapenv:Header/>
   <soapenv:Body>
      <wss:putZjvRB9>
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
                <typ:eserviceId>36400222</typ:eserviceId>
                <typ:reestrId>1</typ:reestrId>
                <typ:sirRequestId>1</typ:sirRequestId>
                <typ:stateOrgId>1</typ:stateOrgId>
                <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
            </EServiceHeader>

            <idZags>${form.id_agency_in?split("#")[0]}</idZags>

            <@opttag "form.contact_email" "email"/>

            <heFamPosle>${form.he_last_name_notmerried}</heFamPosle>
            <sheFamPosle>${form.she_last_name_notmerried}</sheFamPosle>

            <he>
               <fio>
                  <fam>${form.he_last_name_merried!''}</fam>
                  <nam>${form.he_first_name!''}</nam>
                  <otch>${form.he_middle_name!''}</otch>
               </fio>

               <docum>
				   <nam><#if form.he_doc_type_gr == "1"><#if form.he_doc_type?has_content>${dicRegistry.getItemByKey('DUL_LS', form.he_doc_type).name}</#if>
				   <#else>${form.he_doc_type_m!''}</#if></nam>
				  <seria>${form.he_doc_ser!''}</seria>
                  <num>${form.he_doc_number!''}</num>

                  <dat>
                     <dtDay><#if form.he_doc_date?has_content>${form.he_doc_date?string("dd")}</#if></dtDay>
                     <dtMonth><#if form.he_doc_date?has_content>${form.he_doc_date?string("MM")}</#if></dtMonth>
                     <dtYear><#if form.he_doc_date?has_content>${form.he_doc_date?string("yyyy")}</#if></dtYear>
                  </dat>

                  <ovd>${form.he_doc_place!''}</ovd>
               </docum>

               <mestoLive>
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.he_living_country!'null').name?html}</gos>

                  <@opttag "form.he_living_state" "subGos"/>
                  <@opttag "form.he_living_region " "rayon"/>

                  <#if (form.he_living_place!"")=="7" || (form.he_living_place_m!"")=="г." >
                        <gorod>${form.he_living_settlement!''}</gorod>
                    <#else>
                        <nasPun>${form.he_living_settlement!''}</nasPun>
                        <typeNP>
                            <#if form.he_living_place_gr=="1">
                                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.he_living_place!'null').name?html}
                            <#else>${form.he_living_place_m!''}
                            </#if>
                        </typeNP>
                    </#if>
                  <street>${form.he_living_street!''}</street>

                  <typeStr><#if form.he_living_street_type?has_content>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.he_living_street_type).name}</#if></typeStr>

                  <house>${form.he_living_house!''}</house>

                  <@opttag "form.he_living_building " "korp"/>
                  <@opttag "form.she_living_flat " "kvart"/>

                  <indMal></indMal>
               </mestoLive>

                <datRojd>
                    <dtDay><#if form.he_birth_date?has_content>${form.he_birth_date?string("dd")}</#if></dtDay>
                    <dtMonth><#if form.he_birth_date?has_content>${form.he_birth_date?string("MM")}</#if></dtMonth>
                    <dtYear><#if form.he_birth_date?has_content>${form.he_birth_date?string("yyyy")}</#if></dtYear>
                </datRojd>

                <#if form.he_citizenship?? && form.he_citizenship?has_content>
                    <#assign sheGrajd = dicRegistry.getItemByKey('GRAJD_LS', form.he_citizenship).name/>
                    <#if sheGrajd = "Иное">
                        <grajd>
                            <gosRod/>
                            <type>GRAJD_NO_ESTABL</type>
                        </grajd>
                    <#elseif sheGrajd = "Лицо без гражданства">
                        <grajd>
                            <gosRod/>
                            <type>GRAJD_WITHOUT</type>
                        </grajd>
                    <#else >
                        <grajd>
                            <gosRod>${sheGrajd}</gosRod>
                            <type>GRAJD_YES_GOS</type>
                        </grajd>
                    </#if>
                </#if>

               <@opttag "form.he_nation " "nation"/>

               <mestoRojd>
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.he_birth_place_country!'null').name?html}</gos>

                  <@opttag "form.he_birth_place_state " "subGos"/>

                  <@opttag "form.he_birth_place_region " "rayon"/>

                  <#if (form.he_birth_place_settlement_type!"")=="7" || (form.he_birth_place_settlement_type_m!"")=="г." >
                        <gorod>${form.he_birth_place_settlement!''}</gorod>
                    <#else>
                        <nasPun>${form.he_birth_place_settlement!''}</nasPun>
                        <typeNP>
                            <#if form.he_birth_place_settlement_type_gr=="1">
                                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.he_birth_place_settlement_type!'null').name?html}
                            <#else>${form.he_birth_place_settlement_type_m!''}
                            </#if>
                        </typeNP>
                    </#if>
               </mestoRojd>
            </he>

            <she>
               <fio>
                  <fam>${form.she_last_name_merried!''}</fam>
                  <nam>${form.she_first_name!''}</nam>
                  <otch>${form.she_middle_name!''}</otch>
               </fio>

               <docum>
                  <nam><#if form.she_doc_type_gr == "1"><#if form.she_doc_type?has_content>
						${dicRegistry.getItemByKey('DUL_LS', form.she_doc_type).name}</#if>
						<#else>${form.she_doc_type_m!''}</#if></nam>

                  <seria>${form.she_doc_ser!''}</seria>

                  <num>${form.she_doc_number!''}</num>

                  <dat>
                     <dtDay><#if form.she_doc_type?has_content && form.she_doc_date?has_content>${form.she_doc_date?string("dd")}</#if></dtDay>
                     <dtMonth><#if form.she_doc_type?has_content && form.she_doc_date?has_content>${form.she_doc_date?string("MM")}</#if></dtMonth>
                     <dtYear><#if form.she_doc_type?has_content && form.she_doc_date?has_content>${form.she_doc_date?string("yyyy")}</#if></dtYear>
                  </dat>

                  <ovd>${form.she_doc_place!''}</ovd>
               </docum>

               <mestoLive>
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.she_living_country!'null').name?html}</gos>

                  <@opttag "form.she_living_state " "subGos"/>

                  <@opttag "form.she_living_region " "rayon"/>

                    <#if (form.she_living_place!"")=="7" || (form.she_living_place_m!"")=="г." >
                        <gorod>${form.she_living_settlement!''}</gorod>
                    <#else>
                        <nasPun>${form.she_living_settlement!''}</nasPun>
                        <typeNP>
                            <#if form.she_living_place_gr=="1">
                                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.she_living_place!'null').name?html}
                            <#else>${form.she_living_place_m!''}
                            </#if>
                        </typeNP>
                    </#if>
                  <street>${form.she_living_street!''}</street>

                  <typeStr><#if form.she_living_street_type?has_content>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.she_living_street_type).name}</#if></typeStr>

                  <house>${form.she_living_house!''}</house>

                  <@opttag "form.she_living_building " "korp"/>
                  <@opttag "form.she_living_flat " "kvart"/>

                  <indMal></indMal>
               </mestoLive>

               <datRojd>
                  <dtDay><#if form.she_birth_date?has_content>${form.she_birth_date?string("dd")}</#if></dtDay>
                  <dtMonth><#if form.she_birth_date?has_content>${form.she_birth_date?string("MM")}</#if></dtMonth>
                  <dtYear><#if form.she_birth_date?has_content>${form.she_birth_date?string("yyyy")}</#if></dtYear>
               </datRojd>

               <#if form.she_citizenship?has_content>
                    <#assign sheGrajd = dicRegistry.getItemByKey('GRAJD_LS', form.she_citizenship).name/>
                    <#if sheGrajd = "Иное">
                        <grajd>
                            <gosRod/>
                            <type>GRAJD_NO_ESTABL</type>
                        </grajd>
                    <#elseif sheGrajd = "Лицо без гражданства">
                        <grajd>
                            <gosRod/>
                            <type>GRAJD_WITHOUT</type>
                        </grajd>
                    <#else >
                        <grajd>
                            <gosRod>${sheGrajd}</gosRod>
                            <type>GRAJD_YES_GOS</type>
                        </grajd>
                    </#if>
                </#if>

               <@opttag "form.she_nation " "nation"/>

               <mestoRojd>
                  <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.she_birth_place_country!'null').name?html}</gos>

                  <@opttag "form.she_birth_place_state " "subGos"/>
                  <@opttag "form.she_birth_place_region " "rayon"/>

                 <#if (form.she_birth_place_settlement_type!"")=="7" || (form.she_birth_place_settlement_type_m!"")=="г." >
                    <gorod>${form.she_birth_place_settlement!''}</gorod>
                <#else>
                    <nasPun>${form.she_birth_place_settlement!''}</nasPun>
                    <typeNP>
                        <#if form.she_birth_place_settlement_type_gr=="1">
                            ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.she_birth_place_settlement_type!'null').name?html}
                        <#else>${form.she_birth_place_settlement_type_m!''}
                        </#if>
                    </typeNP>
                </#if>
               </mestoRojd>
            </she>

            <docZB>
               <@opttag "form.merried_akt_num " "num"/>

               <#if form.merried_akt_date?has_content>
                   <dat>
                      <dtDay>${form.merried_akt_date?string("dd")}</dtDay>
                      <dtMonth>${form.merried_akt_date?string("MM")}</dtMonth>
                      <dtYear>${form.merried_akt_date?string("yyyy")}</dtYear>
                   </dat>
              </#if>

			  <#if form.merried_akt_zags_gr == "2"><@opttag "form.merried_akt_zags" "zgs"/>
			  <#else><zgs>${form.merried_akt_zags_list?split("#")[1]}</zgs></#if>
            </docZB>

            <timeQue>
               <@opttag "form.date" "datQue"/>

               <#if form.time?has_content>
                    <#assign tqParts = form.time?split("#")>
                    <hourQue>${tqParts[1]?split(":")[0]}</hourQue>
                    <minQue>${tqParts[1]?split(":")[1]}</minQue>
                    <namKabinet>${tqParts[2]}</namKabinet>

               <#else>
                    <hourQue></hourQue>
                    <minQue></minQue>
                    <namKabinet></namKabinet>
               </#if>
               <typeQue>AZ_RB</typeQue>
            </timeQue>

            <#if form.reason_doc?has_content && form.reason_doc == "1">
                <osnReshenie>
                   <@opttag "form.court_name" "reshen"/>

                   <#if form.decision_date?has_content>
                     <datResh>${form.decision_date?string('yyyy-MM-dd')}</datResh>
                   </#if>

                   <#if form.decision_to_who?has_content>
                        <#if form.decision_to_who == "1">
                            <#--<blToHis>супруга</blToHis>-->
                            <blToHis>True</blToHis>
                        <#else>
                            <#--<blToHis>супруги</blToHis>-->
                            <blToHis>False</blToHis>
                        </#if>
                   <#else>
                        <blToHis/>
                   </#if>

                   <@opttag "form.decision_type" "priznan"/>
                </osnReshenie>
            </#if>

            <#if form.reason_doc?has_content && form.reason_doc == "2">
                <osnPrigovor>
                   <@opttag "form.priznan_law" "reshen"/>
                   <#if form.priznan_date?has_content>
                     <datResh>${form.priznan_date?string('yyyy-MM-dd')}</datResh>
                   </#if>

                   <#if form.priznan_to_who??>
                        <#if form.priznan_to_who == "1">
                            <blToHis>супруга</blToHis>
                        <#else>
                            <blToHis>супруги</blToHis>
                        </#if>
                   <#else>
                        <blToHis/>
                   </#if>

                    <srok>${form.srok} мес.</srok>
                </osnPrigovor>
            </#if>
         </zjv>
      </wss:putZjvRB9>
   </soapenv:Body>
</soapenv:Envelope>
