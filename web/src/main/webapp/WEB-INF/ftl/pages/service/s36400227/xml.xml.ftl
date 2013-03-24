<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
<soapenv:Header/>
<soapenv:Body>
<wss:putZjvPI>
<zjv>
<!--Optional:-->
<#--<requestHeader>
    <typ:authToken>${cAuthToken}</typ:authToken>
    <typ:requestId>${formRaw.orderId?string("computer")}</typ:requestId>
    <typ:requestInitiatorCode>
        <typ:regionCode/>
        <typ:serviceOrgCode/>
        <!--Optional:&ndash;&gt;
        <typ:employee>
            <typ:sname/>
            <typ:fname/>
            <typ:mname/>
            <typ:position>?</typ:position>
        </typ:employee>
    </typ:requestInitiatorCode>
    <typ:orgRegistrator>
        <typ:regionCode>?</typ:regionCode>
        <typ:serviceOrgCode>?</typ:serviceOrgCode>
        <!--Optional:&ndash;&gt;
        <typ:employee>
            <typ:sname/>
            <typ:fname/>
            <typ:mname/>
            <typ:position>/
        </typ:employee>
    </typ:orgRegistrator>
    <typ:requestTypeCode/>
    <typ:requestDate/>
    <typ:documents>
        <!--1 or more repetitions:&ndash;&gt;
        <typ:document>
            <typ:documentId/>
            <typ:mimeType/>
            <typ:documentTypeCode/>
            <!--Optional:&ndash;&gt;
            <typ:documentName/>
            <!--Optional:&ndash;&gt;
            <typ:text/>
            <!--Optional:&ndash;&gt;
            <typ:content></typ:content>
        </typ:document>
    </typ:documents>
</requestHeader>
--><!--Optional:-->

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
<EServiceHeader>
    <typ:userId>${cUserID?string("0")}</typ:userId>
    <typ:eserviceId>36400227</typ:eserviceId>
    <typ:reestrId>1</typ:reestrId>
    <typ:sirRequestId>1</typ:sirRequestId>
    <typ:stateOrgId>1</typ:stateOrgId>
    <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
</EServiceHeader>
<idZags>${form.agency_id!''}</idZags>
<!--Optional:-->
<#if form.contact_phone?has_content>
<teleph>${form.contact_phone!''}</teleph>
<#else>
<teleph/>
</#if>

<!--Optional:-->
<#if form.contact_email?has_content>
<email>${form.contact_email!''}</email>
<#else>
<email/>
</#if>
<!--Optional:-->
<peopDo>
    <!--Optional:-->
    <fio>
        <fam>${form.declarant_last_name!''}</fam>
        <nam>${form.declarant_first_name!''}</nam>
    <#if form.declarant_middle_name?has_content>
        <otch>${form.declarant_middle_name!''}</otch>
    <#else>
        <otch/>
    </#if>
    </fio>
    <docum>
    <#if form.declarant_ident_doc_type_gr == '1'>
        <nam>${dicRegistry.getItemByKey('DUL_LS', form.declarant_ident_doc_type!'null').name?html}</nam>
    <#else>
        <nam>${form.declarant_ident_doc_type_m!""}</nam>
    </#if>
        <seria>${form.declarant_ident_doc_ser!''}</seria>
        <num>${form.declarant_ident_doc_num!''}</num>
        <dat>
            <dtDay>${form.declarant_ident_doc_date?string("dd")}</dtDay>
            <dtMonth>${form.declarant_ident_doc_date?string("MM")}</dtMonth>
            <dtYear>${form.declarant_ident_doc_date?string("yyyy")}</dtYear>
        </dat>
        <ovd>${form.declarant_ident_doc_source!''}</ovd>
    </docum>
    <!--Optional:-->
    <mestoLive>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.declarant_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.declarant_state!''}</subGos>

        <!--Optional:-->
        <rayon>${form.declarant_region!''}</rayon>
    <#if (form.declarant_settlement_type!"")=="7" || (form.declarant_settlement_type_m!"")=="г." >
        <gorod>${form.declarant_settlement!''}</gorod>
    <#else>
        <nasPun>${form.declarant_settlement!''}</nasPun>
        <typeNP>
            <#if form.declarant_settlement_type_gr=="1">
                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.declarant_settlement_type!'null').name?html}
            <#else>${form.declarant_settlement_type_m!''}
            </#if>
        </typeNP>
    </#if>

        <street>${form.declarant_street!""}</street>
        <typeStr>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.declarant_street_type!'null').name?html}</typeStr>
        <house>${form.declarant_house!''}</house>
        <!--Optional:-->
        <korp>${form.declarant_building!''}</korp>
        <!--Optional:-->
        <kvart>${form.declarant_flat!''}</kvart>
        <!--Optional:-->
        <indMal></indMal>
    </mestoLive>
    <datRojd>
        <dtDay>${form.declarant_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.declarant_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.declarant_birth_date?string("yyyy")}</dtYear>
    </datRojd>
    <!--Optional:-->
<#if form.declarant_citizenship?has_content>
    <!--Правила заполнения см. Таблица 1-->
    <grajd>
    <#if form.declarant_citizenship=='4'>
        <gosRod/>
        <type>GRAJD_NO_ESTABL</type>
    <#elseif form.declarant_citizenship=='5'>
        <gosRod/>
        <type>GRAJD_WITHOUT</type>
    <#else >
        <gosRod>${dicRegistry.getItemByKey('GRAJD_LS', form.declarant_citizenship!'null').name?html}</gosRod>
        <type>GRAJD_YES_GOS</type>
    </#if>
    </grajd>
<#else>
    <grajd/>
</#if>
    <!--Optional:-->
<#if form.declarant_nation?has_content>
    <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.declarant_nation?substring(0,1)).name}</nation>
<#else>
    <nation></nation>
</#if>
    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.declarant_birth_place_country!'null').name?html}</gos>
        <!--Optional:-->
        <subGos>${form.declarant_birth_place_state!''}</subGos>
        <!--Optional:-->
        <rayon>${form.declarant_birth_place_region!''}</rayon>
    <#if (form.declarant_birth_place_settlement_type!"")=="7" || (form.declarant_birth_place_settlement_type_m!"")=="г." >
        <gorod>${form.declarant_birth_place_settlement!''}</gorod>
    <#else>
        <nasPun>${form.declarant_birth_place_settlement!''}</nasPun>
        <typeNP>
            <#if form.declarant_birth_place_settlement_type_gr=="1">
                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.declarant_birth_place_settlement_type!'null').name?html}
            <#else>${form.declarant_birth_place_settlement_type_m!''}
            </#if>
        </typeNP>
    </#if>
     </mestoRojd>
</peopDo>
<!--Optional:-->
<fioPo>
    <fam>${form.person_new_last_name!''}</fam>
    <nam>${form.person_new_first_name!''}</nam>
    <otch>${form.person_new_middle_name!''}</otch>
</fioPo>
<docRo>
    <!--Optional:-->
    <num>${form.birth_doc_num!''}</num>
    <!--Optional:-->
    <dat>
        <dtDay><#if form.birth_doc_date?has_content>${form.birth_doc_date?string("dd")}</#if></dtDay>
        <dtMonth><#if form.birth_doc_date?has_content>${form.birth_doc_date?string("MM")}</#if></dtMonth>
        <dtYear><#if form.birth_doc_date?has_content>${form.birth_doc_date?string("yyyy")}</#if></dtYear>
    </dat>
    <!--Optional:-->
    <zgs>${form.birth_doc_org!''}</zgs>
</docRo>
<!--Optional:-->
<prichPI>${form.change_name_reason!''}</prichPI>

<maritalStatus>${form.declarant_family_status!''}</maritalStatus>
<#if (form.declarant_family_status?has_content) && form.declarant_family_status!="MS_NONE">
<maritalStatusActInfo>
   <num>${form.merried_akt_num}</num>
   <prefix>${form.merried_akt_prefix}</prefix>
   <#if (form.merried_akt_restored!'off')=='on'>
   <restored>true</restored>
   <#else>
   <restored>false</restored>
   </#if>
   <dat>
      <dtDay>${form.merried_akt_date?string("dd")}</dtDay>
      <dtMonth>${form.merried_akt_date?string("MM")}</dtMonth>
      <dtYear>${form.merried_akt_date?string("yyyy")}</dtYear>
   </dat>
   <zgs>${form.merried_akt_zags}</zgs>
</maritalStatusActInfo>
</#if>

<!--Optional:-->
<teleph>${form.contact_phone!''}</teleph>
<!--Optional:-->
<timeQue>
    <typeQue>AZ_PI</typeQue>
<#if form.date?has_content && form.time?has_content>
    <datQue>${form.date!''}</datQue>
    <#assign tqParts = form.time?split("#")>
    <#assign time = tqParts[1]?split(":")>
    <hourQue>${time[0]}</hourQue>
    <minQue>${time[1]}</minQue>
    <namKabinet>${tqParts[2]}</namKabinet>
<#else>
    <datQue></datQue>
    <hourQue></hourQue>
    <minQue></minQue>
    <namKabinet></namKabinet>
</#if>
</timeQue>
</zjv>
</wss:putZjvPI>
</soapenv:Body>
</soapenv:Envelope>
