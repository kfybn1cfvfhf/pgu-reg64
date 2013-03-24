<#macro opttag field tagName>
    <#if ((field?eval)?has_content)><${tagName}>${field?eval}</${tagName}><#else><${tagName}/></#if>
</#macro>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
<soapenv:Header/>
<soapenv:Body>
<wss:putZjvUs>
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
        <typ:serviceOrgCode>?</typ:serviceOrgCode>
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
    <typ:documents>
        <!--1 or more repetitions:-->
        <typ:document>
            <typ:documentId/>
            <typ:mimeType/>
            <typ:documentTypeCode/>
            <!--Optional:-->
            <typ:documentName/>
            <!--Optional:-->
            <typ:text/>
            <!--Optional:  <typ:content> removed, fail during marshalling-->

        </typ:document>
    </typ:documents>
</requestHeader>
<!--Optional:-->
<eServiceHeader>
    <typ:userId/>
    <typ:eserviceId/>
    <typ:reestrId/>
    <typ:sirRequestId/>
    <typ:stateOrgId/>
    <typ:orderDate/>
</eServiceHeader>
<idZags>${form.id_agency_in?split("#")[0]}</idZags>
<!--Optional:-->
<teleph>${form.contact_phone!''}</teleph>
<!--Optional:-->
<email>${form.contact_email!''}</email>
<!--Optional:-->
<child>
    <!--Optional:-->
    <fio>
        <!--Optional:-->
        <fam>${form.child_last_name!''}</fam>
        <!--Optional:-->
        <nam>${form.child_first_name!''}</nam>
        <!--Optional:-->
        <otch>${form.child_middle_name!''}</otch>
    </fio>
    <!--Optional:-->
<#if form.child_sex == "1" >
    <pol>MALE</pol>
<#else>
    <pol>FEMALE</pol>
</#if>
    <!--Optional:-->
    <datRojd>
        <dtDay>${form.child_ident_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.child_ident_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.child_ident_birth_date?string("yyyy")}</dtYear>
    </datRojd>
    <!--Optional:-->
    <mestoRojd>
        <!--Optional:-->
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.child_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.child_state!''}</subGos>
        <!--Optional:-->
        <rayon>${form.child_region!''}</rayon>
    <#if (form.child_settlement_type!"")=="7" || (form.child_settlement_type_m!"")=="г." >
        <!-- 7 is id for gorod in SETTELEMENT_TYPE_LS dictionary -->
        <gorod>${form.child_settlement!''}</gorod>
    <#else>
        <nasPun>${form.child_settlement!''}</nasPun>
        <typeNP><#if form.child_settlement_type_gr=="1">${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.child_settlement_type!'null').name?html}<#else>${form.child_settlement_type_m!''}</#if></typeNP>
    </#if>

    </mestoRojd>
</child>

<!--Optional:-->
<#if form.declarant?has_content && ( form.declarant=="ZJVL_HE" || form.declarant=="ZJVL_BOTH" || form.declarant=="ZJVL_NOZJVL") >
<peopUsl>
    <!--Optional:-->
    <fio>
        <!--Optional:-->
        <fam>${form.he_last_name!''}</fam>
        <!--Optional:-->
        <nam>${form.he_first_name!''}</nam>
        <!--Optional:-->
        <otch>${form.he_middle_name!''}</otch>
    </fio>
    <!--Optional:-->
    <pol>MALE</pol>
    <!--Optional:-->
    <docum>
        <!--Optional:-->

        <#if form.he_doc_type_gr == "1" >

            <nam>
                <#if form['he_doc_type']?has_content>
                   ${dicRegistry.getItemByKey('DUL_LS',form['he_doc_type']).name}
                   </#if>
            </nam>
        <#else>
            <nam>${form.he_doc_type_m!''}</nam>
        </#if>
        <!--Optional:-->
        <seria>${form.he_doc_ser!''}</seria>
        <!--Optional:-->
        <num>${form.he_doc_number!''}</num>
        <!--Optional:-->
        <dat>
            <dtDay><#if form.he_doc_date??>${form.he_doc_date?string("dd")}</#if></dtDay>
            <dtMonth><#if form.he_doc_date??>${form.he_doc_date?string("MM")}</#if></dtMonth>
            <dtYear><#if form.he_doc_date??>${form.he_doc_date?string("yyyy")}</#if></dtYear>
        </dat>
        <!--Optional:-->
        <ovd>${form.he_doc_place!''}</ovd>
    </docum>
    <!--Optional:-->
    <mestoLive>
        <!--Optional:-->
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.he_living_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.he_living_state!''}</subGos>
        <!--Optional:-->
        <rayon>${form.he_living_region!''}</rayon>
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
        <!--Optional:-->
        <street>${form.he_living_street!''}</street>
        <!--Optional:-->
        <typeStr><#if form.he_living_street_type?has_content>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.he_living_street_type).name}</#if></typeStr>
        <!--Optional:-->
        <house>${form.he_living_house!''}</house>
        <!--Optional:-->
        <korp>${form.he_living_building!''}</korp>
        <!--Optional:-->
        <kvart>${form.he_living_flat!''}</kvart>
        <!--Optional:-->
        <indMal></indMal>
    </mestoLive>
    <!--Optional:-->
    <datRojd>
        <dtDay><#if form.he_birth_date??>${form.he_birth_date?string("dd")}</#if></dtDay>
        <dtMonth><#if form.he_birth_date??>${form.he_birth_date?string("MM")}</#if></dtMonth>
        <dtYear><#if form.he_birth_date??>${form.he_birth_date?string("yyyy")}</#if></dtYear>
    </datRojd>

    <!--Optional:-->
    <#if form.he_citizenship?has_content>
        <!--Правила заполнения см. Таблица 1-->
        <#assign grajd = dicRegistry.getItemByKey('GRAJD_LS', form.he_citizenship).name/>
        <#if grajd = "Иное">
            <grajd>
                <gosRod/>
                <type>GRAJD_NO_ESTABL</type>
            </grajd>
        <#elseif grajd = "Лицо без гражданства">
            <grajd>
                <gosRod/>
                <type>GRAJD_WITHOUT</type>
            </grajd>
        <#else >
            <grajd>
                <gosRod>${grajd}</gosRod>
                <type>GRAJD_YES_GOS</type>
            </grajd>
        </#if>
    </#if>
    <!--Optional:-->
    <#if form.he_nation?has_content >
        <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.he_nation?substring(0,1)).name}</nation>
    <#else ><nation /></#if>
    <!--Optional:-->
    <mestoRojd>
        <!--Optional:-->
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.he_birth_place_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.he_birth_place_state!''}</subGos>
        <!--Optional:-->
        <rayon>${form.he_birth_place_region!''}</rayon>
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
</peopUsl>
</#if>

<#if form.declarant?has_content && ( form.declarant=="ZJVL_SHE" || form.declarant=="ZJVL_BOTH" || form.declarant=="NOZJVL" ) >
<!--Optional:-->
<peopUsca>
    <!--Optional:-->
    <fio>
        <!--Optional:-->
        <fam>${form.she_last_name!''}</fam>
        <!--Optional:-->
        <nam>${form.she_first_name!''}</nam>
        <!--Optional:-->
        <otch>${form.she_middle_name!''}</otch>
    </fio>
    <!--Optional:-->
    <pol>FEMALE</pol>
    <!--Optional:-->
    <docum>
        <!--Optional:-->
        <#if form.she_doc_type_gr == "1" >
            <nam><#if form.she_doc_type??>${dicRegistry.getItemByKey('DUL_LS',
            form['she_doc_type']!'null').name}</#if></nam>
        <#else>
            <nam>${form.she_doc_type_m!''}</nam>
        </#if>
        <!--Optional:-->
        <seria>${form.she_doc_ser!''}</seria>
        <!--Optional:-->
        <num>${form.she_doc_number!''}</num>
        <!--Optional:-->
        <dat>
            <dtDay><#if form.she_doc_date??>${form.she_doc_date?string("dd")}</#if></dtDay>
            <dtMonth><#if form.she_doc_date??>${form.she_doc_date?string("MM")}</#if></dtMonth>
            <dtYear><#if form.she_doc_date??>${form.she_doc_date?string("yyyy")}</#if></dtYear>
        </dat>
        <!--Optional:-->
        <ovd>${form.she_doc_place!''}</ovd>
    </docum>
    <!--Optional:-->
    <mestoLive>
        <!--Optional:-->
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.she_living_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.she_living_state!''}</subGos>
        <!--Optional:-->
        <rayon>${form.she_living_region!''}</rayon>
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
        <!--Optional:-->
        <street>${form.she_living_street!''}</street>
        <!--Optional:-->
        <typeStr><#if form.she_living_street_type?has_content>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.she_living_street_type).name}</#if></typeStr>
        <!--Optional:-->
        <house>${form.she_living_house!''}</house>
        <!--Optional:-->
        <korp>${form.she_living_building!''}</korp>
        <!--Optional:-->
        <kvart>${form.she_living_flat!''}</kvart>
        <!--Optional:-->
        <indMal></indMal>
    </mestoLive>
    <!--Optional:-->
    <datRojd>
        <dtDay><#if form.she_birth_date??>${form.she_birth_date?string("dd")}</#if></dtDay>
        <dtMonth><#if form.she_birth_date??>${form.she_birth_date?string("MM")}</#if></dtMonth>
        <dtYear><#if form.she_birth_date??>${form.she_birth_date?string("yyyy")}</#if></dtYear>
    </datRojd>
    <!--Optional:-->
    <#if form.she_citizenship?has_content>
        <!--Правила заполнения см. Таблица 1-->
        <#assign grajd = dicRegistry.getItemByKey('GRAJD_LS', form.she_citizenship).name/>
        <#if grajd = "Иное">
            <grajd>
                <gosRod/>
                <type>GRAJD_NO_ESTABL</type>
            </grajd>
        <#elseif grajd = "Лицо без гражданства">
            <grajd>
                <gosRod/>
                <type>GRAJD_WITHOUT</type>
            </grajd>
        <#else >
            <grajd>
                <gosRod>${grajd}</gosRod>
                <type>GRAJD_YES_GOS</type>
            </grajd>
        </#if>
    </#if>
    <!--Optional:-->
    <#if form.she_nation?has_content >
        <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.she_nation?substring(0,1)).name}</nation>
    <#else><nation/></#if>
    <!--Optional:-->
    <mestoRojd>
        <!--Optional:-->
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.she_birth_place_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.she_birth_place_state!''}</subGos>
        <!--Optional:-->
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
</peopUsca>
</#if>


<!--Optional:-->
<reshSud>
    <!--Optional:-->
    <reshen>${form.decision_law!''}</reshen>
    <!--Optional:-->
<#if form.decision_date??>
    <datResh>${form.decision_date?string("yyyy-MM-dd")!""}</datResh>
</#if>

</reshSud>
<!--Optional:-->
<docZB>
    <!--Optional:-->
    <num>${form.merried_doc_num!''}</num>
    <!--Optional: fgdf-->
    <dat>
        <dtDay><#if form.merried_doc_date?has_content>${form.merried_doc_date?string("dd")}</#if></dtDay>
        <dtMonth><#if form.merried_doc_date?has_content>${form.merried_doc_date?string("MM")}</#if></dtMonth>
        <dtYear><#if form.merried_doc_date?has_content>${form.merried_doc_date?string("yyyy")}</#if></dtYear>
    </dat>
    <!--Optional:-->
<#if form.merried_doc_source_gr?has_content>
    <#if form.merried_doc_source_gr == "1" >
        <#--<zgs>${dicRegistry.getItemByKey('Nahodka_Zagses', form['merried_doc_source_list']!'null').name}</zgs>-->
        <zgs><#if form.merried_doc_source_list?has_content>${form.merried_doc_source_list?split("#")[1]}</#if></zgs>
    <#else>
        <zgs>${form.merried_doc_source!''}</zgs>
    </#if>
</#if>

</docZB>
<!--Optional:-->
<zjvl>${form.declarant!''}</zjvl>
<!--Optional:-->
<timeQue>
<#if form.date?has_content && form.time?has_content>
    <datQue>${form.date!''}</datQue>
    <typeQue>AZ_US</typeQue>
    <#assign tqParts = form.time?split("#")>
    <hourQue>${tqParts[1]?split(":")[0]}</hourQue>
    <minQue>${tqParts[1]?split(":")[1]}</minQue>
    <namKabinet>${tqParts[2]}</namKabinet>
<#else>
    <datQue></datQue>
    <hourQue></hourQue>
    <minQue></minQue>
    <namKabinet></namKabinet>
</#if>

    <typeQue>AZ_US</typeQue>
</timeQue>
</zjv>
</wss:putZjvUs>
</soapenv:Body>
</soapenv:Envelope>
