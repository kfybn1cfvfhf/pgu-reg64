<#import "../../../macros/nakhodka_xml_macros.ftl" as nakhodka>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
<soapenv:Header/>
<soapenv:Body>
<wss:putZjvZB>
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
<eServiceHeader>
    <typ:userId>${cUserID?string("0")}</typ:userId>
    <typ:eserviceId>36400221</typ:eserviceId>
    <typ:reestrId>1</typ:reestrId>
    <typ:sirRequestId>1</typ:sirRequestId>
    <typ:stateOrgCode>1</typ:stateOrgCode>
    <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
</eServiceHeader>
<idPersonal>${cUserID?string("0")}</idPersonal>
<idZags>${form.id_agency?split("#")[0]}</idZags>
<#if form.contact_email?has_content>
<email>${form.contact_email}</email><#else>
<email/></#if>
<#if form.contact_phone?has_content>
<phone>${form.contact_phone}</phone><#else>
<phone/></#if>
<timeZB>
    <#if form.reg_date?has_content>
    <dateZB>${form.reg_date}</dateZB>
    </#if>
<#assign idx = 0>
<#assign idx = idx + 1>
<#if form.reg_time??>
    <hourZB>${form.calculatedHour}</hourZB>
    <minZB>${form.calculatedMin}</minZB>
    <blTorj><#if form.reg_is_grand??><#if form.reg_is_grand = "on">true<#else>false</#if><#else>false</#if></blTorj>
</#if>
        <namZal><#if form.calculatedHall?has_content>${form.calculatedHall}</#if></namZal>


</timeZB>
<heFamPosle>${form.groom_new_last_name!''}</heFamPosle>
<sheFamPosle>${form.bride_new_last_name!''}</sheFamPosle>

<he>

    <fio>
        <fam>${form.groom_last_name!""}</fam>
        <nam>${form.groom_first_name!""}</nam>
        <otch>${form.groom_middle_name!""}</otch>
    </fio>
    <pol>MALE</pol>
    <docum>
        <#-- Если в справочнике выбран Иной тип ДУЛ, передаем значение, введенное пользователем вручную -->
        <nam><#if form.groom_ident_doc_type!="5">${dicRegistry.getItemByKey('DUL_LS', form.groom_ident_doc_type!'null').name?html}<#else>${form.groom_ident_doc_type_m!''}</#if></nam>
        <seria>${form.groom_doc_ser!''}</seria>
        <num>${form.groom_doc_num!''}</num>
        <dat>
            <dtDay><#if form.groom_doc_date?has_content>${form.groom_doc_date?string("dd")}</#if></dtDay>
            <dtMonth><#if form.groom_doc_date?has_content>${form.groom_doc_date?string("MM")}</#if></dtMonth>
            <dtYear><#if form.groom_doc_date?has_content>${form.groom_doc_date?string("yyyy")}</#if></dtYear>
        </dat>
        <ovd>${form.groom_doc_source!''}</ovd>
    </docum>
    <mestoLive>
        <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.groom_country!'null').name?html}</gos>

    <#if (form.groom_place_gr!"")=="1" && form.groom_country?matches("643")>
        <subGos><@nakhodka.fromKladr "groom_settlement" true "KLADRRegion" "region" /></subGos>
    <#else>
        <subGos>${form.groom_state}</subGos>
    </#if>

    <#if (form.groom_place_gr!"")=="1" && form.groom_country?matches("643")>
        <#if (dicRegistry.getItemByKey('KLADRRegion', form.groom_settlement?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.groom_settlement?substring(0,2)+"000000000").name)>
            <rayon><@nakhodka.fromKladr "groom_settlement" true "KLADRRegion" "rayon" /></rayon>
        <#else>
            <rayon/>
        </#if>
    <#else>
        <rayon>${form.groom_region}</rayon>
    </#if>

    <#if (form.groom_place_gr!"")=="1" && form.groom_country?matches("643")>
        <nasPun><@nakhodka.fromKladr "groom_settlement" true "KLADRRegion" "gorod" /></nasPun>
        <typeNP><@nakhodka.fromKladr "groom_settlement" false "KLADRRegion" "gorod" /></typeNP>
    <#else>
        <#if (form.living_he_settlement_type!'')=="1">
           <gorod>${form.living_he_city_txt!''}</gorod>
        <#else>
           <nasPun>${form.living_he_community_txt!''}</nasPun>
           <typeNP/>
        </#if>
    </#if>

    <#if (form.groom_place_gr!"")=="1" && form.groom_country?matches("643")>
        <street><@nakhodka.fromKladr "groom_street" true "KLADRStreet" "street" /></street>
        <typeStr><@nakhodka.fromKladr "groom_street" false "KLADRStreet" "street" /></typeStr>
    <#else>
        <street>${form.living_he_street_txt!''}</street>
    </#if>

    <#if form.groom_house?has_content>
        <house>${form.groom_house!''}</house><#else>
        <house/></#if>
    <#if form.groom_building?has_content>
        <korp>${form.groom_building!''}</korp><#else>
        <korp/></#if>
    <#if form.groom_flat?has_content>
        <kvart>${form.groom_flat!''}</kvart><#else>
        <kvart/></#if>
        <indMal/>
    </mestoLive>
    <datRojd>
        <dtDay><#if form.groom_date_of_birth?has_content>${form.groom_date_of_birth?string("dd")}</#if></dtDay>
        <dtMonth><#if form.groom_date_of_birth?has_content>${form.groom_date_of_birth?string("MM")}</#if></dtMonth>
        <dtYear><#if form.groom_date_of_birth?has_content>${form.groom_date_of_birth?string("yyyy")}</#if></dtYear>
    </datRojd>
<#if form.groom_citizenship?has_content>
    <grajd>
        <#if form.groom_citizenship=='4'> <#-- ИНОЕ -->
            <type>GRAJD_NO_ESTABL</type>
            <gosRod/>
        <#elseif form.groom_citizenship=='5'> <#-- ЛИЦО БЕЗ ГРАЖДАНСТВА -->
            <type>GRAJD_WITHOUT</type>
            <gosRod/>
        <#else>
            <type>GRAJD_YES_GOS</type>
            <gosRod>${dicRegistry.getItemByKey('GRAJD_LS', form.groom_citizenship!'null').name?html}</gosRod>
        </#if>
    </grajd>
<#else>
    <grajd/>
</#if>
<#if form.groom_nationality?has_content>
    <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.groom_nationality!'null').name?html}</nation><#else>
    <nation/></#if>
    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.groom_birth_country!'null').name?html}</gos>

        <#if (form.groom_birth_place_gr!"")=="1" && form.groom_birth_country?matches("643")>
            <subGos><@nakhodka.fromKladr "groom_birth_settlement" true "KLADRRegion" "region" /></subGos>
        <#else>
            <#-- <subGos>${form.groom_birth_state}</subGos> -->
            <#if form.groom_birth_state?? ><subGos>${form.groom_birth_state}</subGos><#else>
            <subGos />
            </#if>
        </#if>

        <#if (form.groom_birth_place_gr!"")=="1" && form.groom_birth_country?matches("643")>
            <#if (dicRegistry.getItemByKey('KLADRRegion', form.groom_birth_settlement?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.groom_birth_settlement?substring(0,2)+"000000000").name)>
                <rayon><@nakhodka.fromKladr "groom_birth_settlement" true "KLADRRegion" "rayon" /></rayon>
            <#else>
                <rayon/>
            </#if>
        <#else>
            <#--<rayon>${form.groom_birth_region}</rayon>-->
            <#if form.groom_birth_region??><rayon>${form.groom_birth_region}</rayon><#else>
                <rayon/>
            </#if>
        </#if>

        <#if (form.groom_birth_place_gr!"")=="1" && form.groom_birth_country?matches("643")>
            <nasPun><@nakhodka.fromKladr "groom_birth_settlement" true "KLADRRegion" "gorod" /></nasPun>
            <typeNP><@nakhodka.fromKladr "groom_birth_settlement" false "KLADRRegion" "gorod" /></typeNP>
        <#else>
            <#if (form.birth_he_settlement_type!'')=="1">
               <gorod>${form.birth_he_city_txt!''}</gorod>
            <#else>
               <nasPun>${form.birth_he_community_txt!''}</nasPun>
               <typeNP/>
            </#if>
        </#if>

    </mestoRojd>
</he>
<she>
    <fio>
        <fam>${form.bride_last_name!""}</fam>
        <nam>${form.bride_first_name!""}</nam>
        <otch>${form.bride_middle_name!""}</otch>
    </fio>
    <pol>FEMALE</pol>
    <docum>
        <#-- Если в справочнике выбран Иной тип ДУЛ, передаем значение, введенное пользователем вручную -->
        <nam><#if form.bride_ident_doc_type!="5">${dicRegistry.getItemByKey('DUL_LS', form.bride_ident_doc_type!'null').name?html}<#else>${form.bride_ident_doc_type_m}</#if></nam>
        <seria>${form.bride_doc_ser!''}</seria>
        <num>${form.bride_doc_num!''}</num>
        <dat>
            <dtDay><#if form.bride_doc_date?has_content>${form.bride_doc_date?string("dd")}</#if></dtDay>
            <dtMonth><#if form.bride_doc_date?has_content>${form.bride_doc_date?string("MM")}</#if></dtMonth>
            <dtYear><#if form.bride_doc_date?has_content>${form.bride_doc_date?string("yyyy")}</#if></dtYear>
        </dat>
        <ovd>${form.bride_doc_source!''}</ovd>
    </docum>
    <mestoLive>
        <!--Optional:-->
    <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.bride_country!'null').name?html}</gos>
        <!--Optional:-->
    <#if (form.bride_place_gr!"")=="1" && form.bride_country?matches("643")>
        <subGos><@nakhodka.fromKladr "bride_settlement" true "KLADRRegion" "region" /></subGos>
    <#else>
        <#--<subGos>${form.bride_state}</subGos>-->
        <#if form.bride_state??><subGos>${form.bride_state}</subGos><#else>
            </subGos>
        </#if>
    </#if>

    <#if (form.bride_place_gr!"")=="1" && form.bride_country?matches("643")>
        <#if (dicRegistry.getItemByKey('KLADRRegion', form.bride_settlement?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.bride_settlement?substring(0,2)+"000000000").name)>
            <rayon><@nakhodka.fromKladr "bride_settlement" true "KLADRRegion" "rayon" /></rayon>
        <#else>
            <rayon/>
        </#if>
    <#else>
        <#--<rayon>${form.bride_region}</rayon>-->
        <#if form.bride_region??><rayon>${form.bride_region}</rayon><#else>
            <rayon/>
        </#if>
    </#if>


    <#if (form.bride_place_gr!"")=="1" && form.bride_country?matches("643")>
        <nasPun><@nakhodka.fromKladr "bride_settlement" true "KLADRRegion" "gorod" /></nasPun>
        <typeNP><@nakhodka.fromKladr "bride_settlement" false "KLADRRegion" "gorod" /></typeNP>
    <#else>
        <#if (form.living_she_settlement_type!'')=="1">
           <gorod>${form.living_she_city_txt!''}</gorod>
        <#else>
           <nasPun>${form.living_she_community_txt!''}</nasPun>
           <typeNP/>
        </#if>
    </#if>

    <#if (form.bride_place_gr!"")=="1" && form.bride_country?matches("643")>
        <street><@nakhodka.fromKladr "bride_street" true "KLADRStreet" "street" /></street>
        <typeStr><@nakhodka.fromKladr "bride_street" false "KLADRStreet" "street" /></typeStr>
    <#else>
        <street>${form.living_she_street_txt!''}</street>
    </#if>


    <#if form.bride_house?has_content>
        <house>${form.bride_house}</house><#else>
        <house/></#if>
        <!--Optional:-->
    <#if form.bride_building?has_content>
        <korp>${form.bride_building}</korp><#else>
        <korp/></#if>
        <!--Optional:-->
    <#if form.bride_flat?has_content>
        <kvart>${form.bride_flat}</kvart><#else>
        <kvart/></#if>
        <!--Optional:-->
        <indMal/>
    </mestoLive>
    <!--Optional:-->
    <datRojd>
        <dtDay><#if form.bride_date_of_birth?has_content>${form.bride_date_of_birth?string("dd")}</#if></dtDay>
        <dtMonth><#if form.bride_date_of_birth?has_content>${form.bride_date_of_birth?string("MM")}</#if></dtMonth>
        <dtYear><#if form.bride_date_of_birth?has_content>${form.bride_date_of_birth?string("yyyy")}</#if></dtYear>
    </datRojd>
    <!--Optional:-->
<#if form.bride_citizenship?has_content>
    <grajd>
        <#if form.bride_citizenship=='4'>
            <gosRod/>
            <type>GRAJD_NO_ESTABL</type>
            <#elseif form.bride_citizenship=='5'>
                <gosRod/>
                <type>GRAJD_WITHOUT</type>
            <#else>
                <gosRod>${dicRegistry.getItemByKey('GRAJD_LS', form.bride_citizenship!'null').name?html}</gosRod>
                <type>GRAJD_YES_GOS</type>
        </#if>
    </grajd>
    <#else>
        <grajd/>
</#if>
<#if form.bride_nationality?has_content>
    <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.bride_nationality!'null').name?html}</nation><#else>
    <nation/></#if>
    <mestoRojd>

        <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.bride_birth_country!'null').name?html}</gos>

        <#if (form.bride_birth_place_gr!"")=="1" && form.bride_birth_country?matches("643")>
            <subGos><@nakhodka.fromKladr "bride_birth_settlement" true "KLADRRegion" "region" /></subGos>
        <#else>
            <#if form.bride_birth_state??><subGos>${form.bride_birth_state}</subGos><#else>
                </subGos>
            </#if>
        </#if>

        <#if (form.bride_birth_place_gr!"")=="1" && form.bride_birth_country?matches("643")>
            <#if (dicRegistry.getItemByKey('KLADRRegion', form.bride_birth_settlement?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.bride_birth_settlement?substring(0,2)+"000000000").name)>
                <rayon><@nakhodka.fromKladr "bride_birth_settlement" true "KLADRRegion" "rayon" /></rayon>
            <#else>
                <rayon/>
            </#if>
        <#else>
            <#if form.bride_birth_region??><rayon>${form.bride_birth_region}</rayon><#else>
                <rayon/>
            </#if>
        </#if>

        <#if (form.bride_birth_place_gr!"")=="1" && form.bride_birth_country?matches("643")>
            <nasPun><@nakhodka.fromKladr "bride_birth_settlement" true "KLADRRegion" "gorod" /></nasPun>
            <typeNP><@nakhodka.fromKladr "bride_birth_settlement" false "KLADRRegion" "gorod" /></typeNP>
        <#else>
            <#if (form.birth_she_settlement_type!'')=="1">
               <gorod>${form.birth_she_city_txt!''}</gorod>
            <#else>
               <nasPun>${form.birth_she_community_txt!''}</nasPun>
               <typeNP/>
            </#if>
        </#if>


    </mestoRojd>
</she>
<!--Optional:-->
<#if form.groom_merried_doc_type?has_content>
    <#if form.groom_merried_doc_type=='1'>
    <heDocRB>
        <#if form.groom_merried_doc_num?has_content>
            <num>${form.groom_merried_doc_num}</num><#else>
            <num/></#if>
        <#if form.groom_merried_doc_date?has_content>
            <dat>
                <dtDay><#if form.groom_merried_doc_date?has_content>${form.groom_merried_doc_date?string("dd")}</#if></dtDay>
                <dtMonth><#if form.groom_merried_doc_date?has_content>${form.groom_merried_doc_date?string("MM")}</#if></dtMonth>
                <dtYear><#if form.groom_merried_doc_date?has_content>${form.groom_merried_doc_date?string("yyyy")}</#if></dtYear>
            </dat>
            <#else>
                <dat/>
        </#if>
        <#if form.groom_merried_doc_source?has_content>
            <zgs>${form.groom_merried_doc_source}</zgs><#else>
            <zgs/></#if>
    </heDocRB>
    </#if>
</#if>
<#if form.groom_merried_doc_type?has_content>
    <#if form.groom_merried_doc_type=='2'>
    <heDocSm>
        <num>${form.groom_merried_doc_num}</num>
        <#if form.groom_merried_doc_date?has_content>
            <dat>
                <dtDay><#if form.groom_merried_doc_date?has_content>${form.groom_merried_doc_date?string("dd")}</#if></dtDay>
                <dtMonth><#if form.groom_merried_doc_date?has_content>${form.groom_merried_doc_date?string("MM")}</#if></dtMonth>
                <dtYear><#if form.groom_merried_doc_date?has_content>${form.groom_merried_doc_date?string("yyyy")}</#if></dtYear>
            </dat>
            <#else>
                <dat/>
        </#if>
        <#if form.groom_merried_doc_source?has_content>
            <zgs>${form.groom_merried_doc_source}</zgs><#else>
            <zgs/></#if>
    </heDocSm>
    </#if>
</#if>
<#if form.bride_merried_doc_type?has_content>
    <#if form.bride_merried_doc_type=='1'>
    <sheDocRB>
        <#if form.bride_merried_doc_num?has_content>
            <num>${form.bride_merried_doc_num}</num><#else>
            <num/></#if>
        <dat>
            <dtDay><#if form.bride_merried_doc_date?has_content>${form.bride_merried_doc_date?string("dd")}</#if></dtDay>
            <dtMonth><#if form.bride_merried_doc_date?has_content>${form.bride_merried_doc_date?string("MM")}</#if></dtMonth>
            <dtYear><#if form.bride_merried_doc_date?has_content>${form.bride_merried_doc_date?string("yyyy")}</#if></dtYear>
        </dat>
        <#if form.bride_merried_doc_source?has_content>
            <zgs>${form.bride_merried_doc_source}</zgs><#else>
            <zgs/></#if>
    </sheDocRB>
    </#if>
</#if>
<#if form.bride_merried_doc_type?has_content>
    <#if form.bride_merried_doc_type=='2'>
    <sheDocSm>
        <#if form.bride_merried_doc_num?has_content>
            <num>${form.bride_merried_doc_num}</num><#else>
            <num/></#if>
        <dat>
            <dtDay><#if form.bride_merried_doc_date?has_content>${form.bride_merried_doc_date?string("dd")}</#if></dtDay>
            <dtMonth><#if form.bride_merried_doc_date?has_content>${form.bride_merried_doc_date?string("MM")}</#if></dtMonth>
            <dtYear><#if form.bride_merried_doc_date?has_content>${form.bride_merried_doc_date?string("yyyy")}</#if></dtYear>
        </dat>
        <#if form.bride_merried_doc_source?has_content>
            <zgs>${form.bride_merried_doc_source}</zgs><#else>
            <zgs/></#if>
    </sheDocSm>
    </#if>
</#if>
</zjv>
</wss:putZjvZB>
</soapenv:Body>
</soapenv:Envelope>