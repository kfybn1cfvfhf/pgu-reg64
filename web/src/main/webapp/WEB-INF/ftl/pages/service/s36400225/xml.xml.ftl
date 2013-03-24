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

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
<soapenv:Header/>
<soapenv:Body>
<#if form.usluga_form=="1">
   <wss:putZjvUO12>
<#elseif form.usluga_form=="2">
    <wss:putZjvUO13>
<#elseif form.usluga_form=="3">
    <wss:putZjvUO14>
</#if>
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
    <typ:documents>
        <!--1 or more repetitions:-->
        <typ:document>
            <typ:documentId>?</typ:documentId>
            <typ:mimeType>?</typ:mimeType>
            <typ:documentTypeCode>?</typ:documentTypeCode>
            <!--Optional:-->
            <typ:documentName>?</typ:documentName>
            <!--Optional:-->
            <typ:text>?</typ:text>
            <!--Optional:-->
            <!--<typ:content></typ:content>-->
        </typ:document>
    </typ:documents>
</requestHeader>

<eServiceHeader>
    <typ:userId>${cUserID?string("0")}</typ:userId>
    <typ:eserviceId>36400225</typ:eserviceId>
    <typ:reestrId>1</typ:reestrId>
    <typ:sirRequestId>1</typ:sirRequestId>
    <typ:stateOrgId>1</typ:stateOrgId>
    <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
</eServiceHeader>
<idZags>${form.id_agency_in?split("#")[0]}</idZags>
<!--Optional:-->
<teleph>${form.contact_phone!''}</teleph>
<!--Optional:-->
<email>${form.contact_email!''}</email>

<childDo>
    <fio>
        <fam>${form.child_before_last_name}</fam>
        <nam>${form.child_before_first_name}</nam>
        <otch>${form.child_before_middle_name!''}</otch>
    </fio>
    <pol><#if form.child_sex = "1" >MAIL<#else>FEMAIL</#if></pol>
    <datRojd>
        <dtDay>${form.child_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.child_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.child_birth_date?string("yyyy")}</dtYear>
    </datRojd>
    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.child_country!'null').name?html}</gos>
    <@opttag "form.child_state" "subGos" />
    <@opttag "form.child_region" "rayon" />
        <nasPun>${form.child_settlement}</nasPun>
        <typeNP>
           <#if form.child_settlement_type_gr == "1">
              <#if form.child_settlement_type?has_content>
                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.child_settlement_type).name}
              </#if>
           <#else>
              ${form.child_settlement_type_m!''}
           </#if>
        </typeNP>
    </mestoRojd>
</childDo>
<childFioPo>
    <fam>${form.child_after_last_name}</fam>
    <nam>${form.child_after_first_name}</nam>
    <otch>${form.child_before_middle_name!''}</otch>
</childFioPo>
<fath>
    <fio>
        <fam>${form.declarant_father_last_name}</fam>
        <nam>${form.declarant_father_first_name}</nam>
        <otch>${form.declarant_father_middle_name!''}</otch>
    </fio>
    <docum>
        <nam>
            <#if form.declarant_father_doc_type_gr == "1">
                <#if form.declarant_father_doc_type?has_content>
                  ${dicRegistry.getItemByKey('DUL_LS', form.declarant_father_doc_type).name}
                </#if>
            <#else>
                ${form.declarant_father_doc_type_m!''}
            </#if>
        </nam>
        <seria>${form.declarant_father_doc_ser}</seria>
        <num>${form.declarant_father_doc_number}</num>
        <dat>
            <dtDay>${form.declarant_father_doc_date?string("dd")}</dtDay>
            <dtMonth>${form.declarant_father_doc_date?string("MM")}</dtMonth>
            <dtYear>${form.declarant_father_doc_date?string("yyyy")}</dtYear>
        </dat>
        <ovd>${form.declarant_father_doc_place}</ovd>
    </docum>
    <mestoLive>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.father_living_country!'null').name?html}</gos>
    <@opttag "form.father_living_state" "subGos"/>
    <@opttag "form.father_living_region" "rayon"/>
    <#if (form.father_living_place!"")=="7" || (form.father_living_place_m!"")=="г." >
        <!-- 7 is id for gorod in SETTELEMENT_TYPE_LS dictionary -->
        <gorod>${form.father_living_settlement!''}</gorod>
    <#else>
        <nasPun>${form.father_living_settlement!''}</nasPun>
        <typeNP><#if form.father_living_place_gr=="1">${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.father_living_place!'null').name?html}<#else>${form.father_living_place_m!''}</#if></typeNP>
    </#if>
        <street><#if form.father_living_street?has_content>${form.father_living_street}</#if></street>
        <typeStr><#if form.father_living_street?has_content>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.father_living_street_type).name}</#if></typeStr>
        <house>${form.father_living_house}</house>
    <@opttag "form.father_living_building" "korp"/>
    <@opttag "form.father_living_flat" "kvart"/>
    </mestoLive>
    <datRojd>
        <dtDay>${form.declarant_father_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.declarant_father_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.declarant_father_birth_date?string("yyyy")}</dtYear>
    </datRojd>
    <!--Правила заполнения см. Таблица 1-->

<#if form.declarant_father_citizenship?has_content>
    <grajd>
        <#if form.declarant_father_citizenship=='4'> <#-- ИНОЕ -->
            <type>GRAJD_NO_ESTABL</type>
            <gosRod/>
            <#elseif form.declarant_father_citizenship=='5'> <#-- ЛИЦО БЕЗ ГРАЖДАНСТВА -->
                <type>GRAJD_WITHOUT</type>
                <gosRod/>
            <#else>
                <type>GRAJD_YES_GOS</type>
                <gosRod>${dicRegistry.getItemByKey('GRAJD_LS', form.declarant_father_citizenship!'null').name?html}</gosRod>
        </#if>
    </grajd>
    <#else>
        <grajd/>
</#if>

    <#if form.declarant_father_nation?has_content>
    <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.declarant_father_nation?substring(0,1)).name}</nation>
    <#else ><nation/></#if>

    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.father_birth_place_country!'null').name?html}</gos>
    <@opttag "form.father_birth_place_state" "subGos"/>
    <@opttag "form.father_birth_place_region" "rayon"/>
    <#if (form.father_birth_place_settlement_type!"")=="7" || (form.father_birth_place_settlement_type_m!"")=="г." >
        <!-- 7 is id for gorod in SETTELEMENT_TYPE_LS dictionary -->
        <gorod>${form.father_birth_place_settlement!''}</gorod>
    <#else>
        <nasPun>${form.father_birth_place_settlement!''}</nasPun>
        <typeNP><#if form.father_birth_place_settlement_type_gr=="1">${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.father_birth_place_settlement_type!'null').name?html}<#else>${form.father_birth_place_settlement_type_m!''}</#if></typeNP>
    </#if>
    </mestoRojd>
</fath>

<docRo>
    <num>${form.birth_akt_num}</num>
    <dat>
        <dtDay>${form.birth_name?string("dd")!''}</dtDay>
        <dtMonth>${form.birth_name?string("MM")!''}</dtMonth>
        <dtYear>${form.birth_name?string("yyyy")!''}</dtYear>
    </dat>
    <zgs>${form.birth_zags}</zgs>
</docRo>

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
    <typeQue>AZ_UO</typeQue>
</timeQue>
<#if form.usluga_form!="2">
<moth>
    <fio>
        <fam>${form.declarant_mother_last_name!""}</fam>
        <nam>${form.declarant_mother_first_name!""}</nam>
        <otch>${form.declarant_mother_middle_name!""}</otch>
    </fio>

    <docum>
        <nam>
            <#if form.declarant_mother_doc_type_gr == "1">
                <#if form.declarant_mother_doc_type?has_content>
                ${dicRegistry.getItemByKey('DUL_LS', form.declarant_mother_doc_type).name}
                </#if>
            <#else>
                ${form.declarant_mother_doc_type_m!''}
            </#if>
        </nam>
        <seria>${form.declarant_mother_doc_ser}</seria>
        <num>${form.declarant_mother_doc_number}</num>
        <dat>
            <dtDay>${form.declarant_mother_doc_date?string("dd")}</dtDay>
            <dtMonth>${form.declarant_mother_doc_date?string("MM")}</dtMonth>
            <dtYear>${form.declarant_mother_doc_date?string("yyyy")}</dtYear>
        </dat>
        <ovd>${form.declarant_mother_doc_place}</ovd>
    </docum>

    <mestoLive>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.mother_living_country!'null').name?html}</gos>
    <@opttag "form.mother_living_state" "subGos"/>
    <@opttag "form.mother_living_region" "rayon"/>
    <#if (form.mother_living_place!"")=="7" || (form.mother_living_place_m!"")=="г." >
        <!-- 7 is id for gorod in SETTELEMENT_TYPE_LS dictionary -->
        <gorod>${form.mother_living_settlement!''}</gorod>
    <#else>
        <nasPun>${form.mother_living_settlement!''}</nasPun>
        <typeNP><#if form.mother_living_place_gr=="1">${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.mother_living_place!'null').name?html}<#else>${form.mother_living_place_m!''}</#if></typeNP>
    </#if>
        <street><#if form.mother_living_street?has_content>${form.mother_living_street}</#if></street>
        <typeStr><#if form.mother_living_street?has_content>${dicRegistry.getItemByKey('STREET_TYPE_LS', form.mother_living_street_type).name}</#if></typeStr>
        <house>${form.mother_living_house}</house>
    <@opttag "form.mother_living_building" "korp"/>
    <@opttag "form.mother_living_flat" "kvart"/>
    </mestoLive>

    <datRojd>
        <dtDay>${form.declarant_mother_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.declarant_mother_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.declarant_mother_birth_date?string("yyyy")}</dtYear>
    </datRojd>


    <#if form.declarant_mother_citizenship?has_content>
    <grajd>
        <#if form.declarant_mother_citizenship=='4'> <#-- ИНОЕ -->
            <type>GRAJD_NO_ESTABL</type>
            <gosRod/>
            <#elseif form.declarant_mother_citizenship=='5'> <#-- ЛИЦО БЕЗ ГРАЖДАНСТВА -->
                <type>GRAJD_WITHOUT</type>
                <gosRod/>
            <#else>
                <type>GRAJD_YES_GOS</type>
                <gosRod>${dicRegistry.getItemByKey('GRAJD_LS', form.declarant_mother_citizenship!'null').name?html}</gosRod>
        </#if>
    </grajd>
    <#else>
        <grajd/>
    </#if>
    
    <#if form.declarant_mother_nation?has_content>
        <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.declarant_mother_nation?substring(0,1)).name}</nation>
        <#else><nation/></#if>
    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('COUNTRY_LS', form.mother_birth_place_country!'null').name?html}</gos>
    <@opttag "form.mother_birth_place_state" "subGos"/>
    <@opttag "form.mother_birth_place_region" "rayon"/>
    <#if (form.mother_birth_place_settlement_type!"")=="7" || (form.mother_birth_place_settlement_type_m!"")=="г." >
        <!-- 7 is id for gorod in SETTELEMENT_TYPE_LS dictionary -->
        <gorod>${form.mother_birth_place_settlement!''}</gorod>
    <#else>
        <nasPun>${form.mother_birth_place_settlement!''}</nasPun>
        <typeNP>
            <#if form.mother_birth_place_settlement_type_gr=="1">
                ${dicRegistry.getItemByKey('SETTELEMENT_TYPE_LS', form.mother_birth_place_settlement_type!'null').name?html}
            <#else>${form.mother_birth_place_settlement_type_m!''}
            </#if>
        </typeNP>
    </#if>
    </mestoRojd>
</moth>
</#if>

<#if form.usluga_form=="2">
<mothFIO>
    <fam>${form.declarant_mother_last_name!""}</fam>
    <nam>${form.declarant_mother_first_name!""}</nam>
    <otch>${form.declarant_mother_middle_name!""}</otch>
</mothFIO>
    <#if form.reason_doc??>
    <#if form.reason_doc=="1">
    <docSm>
        <!--Optional:-->
        <num>${form.death_doc_num!""}</num>
        <!--Optional:-->
        <dat>
            <dtDay>${form.death_doc_date_day!""}</dtDay>
            <dtMonth>${form.death_doc_date_month!""}</dtMonth>
            <dtYear>${form.death_doc_date_year!""}</dtYear>
        </dat>
        <!--Optional:-->
        <zgs>${form.death_doc_source!""}</zgs>
    </docSm>
        <#elseif form.reason_doc=="2">
        <reshen>
            <!--Optional:-->
            <reshen>${form.court_name!""}</reshen>
            <!--Optional:-->
            <datResh><#if form.decision_date??>${form.decision_date?string('yyyy-MM-dd')}</#if></datResh>
            <!--Optional:-->
            <priznan>${form.decision_type!""}</priznan>
        </reshen>
        <#elseif form.reason_doc=="3">
        <spravka>
            <!--Optional:-->
            <num>${form.certificate_num!""}</num>
            <!--Optional:-->
            <dat>
                <dtDay>${form.certificate_date_day!""}</dtDay>
                <dtMonth>${form.certificate_date_month!""}</dtMonth>
                <dtYear>${form.certificate_date_year!""}</dtYear>
            </dat>
            <!--Optional:-->
            <zgs>${form.certificate_source!""}</zgs>
        </spravka>
    </#if>
    </#if>
</#if>
<#if form.usluga_form=="3">
<reshen>
    <!--Optional:-->
    <reshen>${form.name_law!""}</reshen>
    <!--Optional:-->
    <datResh><#if form.decision_law_date??>${form.decision_law_date?string('yyyy-MM-dd')}</#if></datResh>
    <!--Optional:-->
    <reshenie>${form.decision_law_type!""}</reshenie>
</reshen>
</#if>
</zjv>

<#if form.usluga_form=="1">
    </wss:putZjvUO12>
<#elseif form.usluga_form=="2">
    </wss:putZjvUO13>
<#elseif form.usluga_form=="3"></wss:putZjvUO14>
</#if>

</soapenv:Body>
</soapenv:Envelope>