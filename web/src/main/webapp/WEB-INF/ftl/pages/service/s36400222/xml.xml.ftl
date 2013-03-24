<#import "../../../macros/nakhodka_xml_macros.ftl" as nakhodka>
<#macro opttag field tagName>
    <#if ((field?eval)?has_content)><${tagName}>${field?eval}</${tagName}><#else><${tagName}/></#if>
</#macro>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:wss="http://wsService.zags.com/"
                  xmlns:typ="http://idecs.nvg.ru/privateoffice/ws/types/">
<soapenv:Header/>
<soapenv:Body>
<#if form.usluga_form=="1"><wss:putZjvRo1><#elseif form.usluga_form=="2"><wss:putZjvRo2></#if>
<zjv>
<EServiceHeader>
    <typ:userId>${cUserID?string("0")}</typ:userId>
    <typ:eserviceId>36400222</typ:eserviceId>
    <typ:reestrId>1</typ:reestrId>
    <typ:sirRequestId>1</typ:sirRequestId>
    <typ:stateOrgId>1</typ:stateOrgId>
    <typ:orderDate>${currentDate?string('yyyy-MM-dd')}</typ:orderDate>
</EServiceHeader>

<@opttag "form.contact_email" "email"/>
<@opttag "form.contact_phone" "phone"/>
<idZags>${form.id_agency_in?split("#")[0]}</idZags>

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

<child>
    <datRojd>
        <dtDay>${form.child_ident_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.child_ident_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.child_ident_birth_date?string("yyyy")}</dtYear>
    </datRojd>
    <fio>
        <fam>${form.child_last_name}</fam>
        <nam>${form.child_first_name}</nam>
        <otch>${form.child_middle_name!""}</otch>
    </fio>
    <mestoRojd>
       <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.birth_child_country!'null').name?html}</gos>

    <#if (form.birth_child_input!"")=="1" && form.birth_child_country?matches("643")>
				<subGos><@nakhodka.fromKladr "birth_child_community" true "KLADRRegion" "region" /></subGos>
    <#else>
        <#if form.birth_child_region_txt??><subGos>${form.birth_child_region_txt}</subGos><#else>
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
        <#if form.birth_child_area_txt??> <rayon>${form.birth_child_area_txt}</rayon> <#else>
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
    </mestoRojd>

<#if form.child_sex = "1" >
    <pol>MAIL</pol>
    <#else>
        <pol>FEMAIL</pol>
</#if>
</child>

<#if form.usluga_form=="1">
<fath>
  <#if form.usluga_form != "2">
    <docum>
        <dat>
            <dtDay>${form.father_doc_date?string("dd")}</dtDay>
            <dtMonth>${form.father_doc_date?string("MM")}</dtMonth>
            <dtYear>${form.father_doc_date?string("yyyy")}</dtYear>
        </dat>

        <nam>
            <#if form.mother_doc_type_gr == "1">
                ${dicRegistry.getItemByKey('DUL_LS', form.father_doc_type).name}
            <#else>
                ${form.father_doc_type_m!''}
            </#if>
        </nam>
        <num>${form.father_doc_number}</num>
        <ovd>${form.father_doc_place}</ovd>
        <seria>${form.father_doc_ser}</seria>
    </docum>
  </#if>
    <fio>
        <fam>${form.father_last_name}</fam>

        <nam>${form.father_first_name}</nam>
        <otch><#if form.father_middle_name?has_content>${form.father_middle_name}</#if></otch>
    </fio>
  <#if form.usluga_form != "2">
    <mestoLive>
       <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.living_he_country!'null').name?html}</gos>

    <#if (form.living_he_address_input!"")=="1" && form.living_he_country?matches("643")>
				<subGos><@nakhodka.fromKladr "living_he_community" true "KLADRRegion" "region" /></subGos>
    <#else>
        <#if form.living_he_region_txt??> <subGos>${form.living_he_region_txt}</subGos> <#else >
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

    <datRojd>
        <dtDay>${form.father_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.father_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.father_birth_date?string("yyyy")}</dtYear>
    </datRojd>

    <!--Правила заполнения см. Таблица 1-->
    <#if form.father_citizenship?has_content>
        <#assign fatherGrajd = dicRegistry.getItemByKey('NAHODKA_GRAJD', form.father_citizenship).name/>
        <#if fatherGrajd = "Иное">
            <grajd>
                <gosRod/>
                <type>GRAJD_NO_ESTABL</type>
            </grajd>
            <#elseif fatherGrajd = "Лицо без гражданства">
                <grajd>
                    <gosRod/>
                    <type>GRAJD_WITHOUT</type>
                </grajd>
            <#else >
                <grajd>
                    <gosRod>${fatherGrajd}</gosRod>
                    <type>GRAJD_YES_GOS</type>
                </grajd>
        </#if>
    </#if>

    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.birth_he_country!'null').name?html}</gos>

    <#if (form.birth_he_input!"")=="1" && form.birth_he_country?matches("643")>
				<subGos><@nakhodka.fromKladr "birth_he_community" true "KLADRRegion" "region" /></subGos>
    <#else>
        <#if form.birth_he_region_txt??><subGos>${form.birth_he_region_txt}</subGos><#else >
            <subGos />
        </#if>
    </#if>

        <#if (form.birth_he_input!"")=="1" && form.birth_he_country?matches("643")>
        <#if (dicRegistry.getItemByKey('KLADRRegion', form.birth_he_community?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.living_he_community?substring(0,2)+"000000000").name)>
						<rayon><@nakhodka.fromKladr "birth_he_community" true "KLADRRegion" "rayon" /></rayon>
        <#else>
            <rayon/>
        </#if>
    <#else>
        <#if form.birth_he_area_txt??><rayon>${form.birth_he_area_txt}</rayon><#else >
            <rayon/>
        </#if>
    </#if>

        <#if (form.birth_he_input!"")=="1" && form.birth_he_country?matches("643")>
        <nasPun><@nakhodka.fromKladr "birth_he_community" true "KLADRRegion" "gorod" /></nasPun>
				<typeNP><@nakhodka.fromKladr "birth_he_community" false "KLADRRegion" "gorod" /></typeNP>
    <#else>
        <#if (form.birth_he_settlement_type!'')=="1">
           <gorod>${form.birth_he_city_txt!''}</gorod>
        <#else>
           <nasPun>${form.birth_he_community_txt!''}</nasPun>
           <typeNP/>
        </#if>
    </#if>
    </mestoRojd>

    <#if form.father_nation?has_content>
        <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.father_nation?substring(0,1)).name}</nation>
        <#else >
            <nation/>
    </#if>
  </#if>
</fath>
    <#if form.father_cause_doc_type?has_content && form.father_cause_doc_type=="2"><#--dicRegistry.getItemByKey('DUL_LS', form.father_cause_doc_type).name = "Свидетельство об установлении отцовства">-->
    <docUO>
        <dat>
            <@opttag "form.father_cause_doc_date?string(\"dd\")" "dtDay"/>
            <@opttag "form.father_cause_doc_date?string(\"MM\")" "dtMonth"/>
            <@opttag "form.father_cause_doc_date?string(\"yyyy\")" "dtYear"/>
        </dat>

    <@opttag "form.father_cause_doc_num" "num"/>
    <zgs>${form.father_cause_doc_source_list?split("#")[1]}, ${form.father_cause_doc_source_list?split("#")[4]}</zgs>

    </docUO>
        <#else>
        <docUO/>
    </#if>

    <#if form.father_cause_doc_type?has_content && form.father_cause_doc_type=="1"><#--dicRegistry.getItemByKey('DUL_LS', form.father_cause_doc_type).name = "Свидетельство о браке">-->
    <docZB>
        <dat>
            <@opttag "form.father_cause_doc_date?string(\"dd\")" "dtDay"/>
            <@opttag "form.father_cause_doc_date?string(\"MM\")" "dtMonth"/>
            <@opttag "form.father_cause_doc_date?string(\"yyyy\")" "dtYear"/>
        </dat>

    <@opttag "form.father_cause_doc_num" "num"/>
    <zgs>${form.father_cause_doc_source_list?split("#")[1]}, ${form.father_cause_doc_source_list?split("#")[4]}</zgs>
    </docZB>
        <#else>
        <docZB/>
    </#if>

</#if>
<moth>
    <docum>
        <dat>
            <dtDay>${form.mother_doc_date?string("dd")}</dtDay>
            <dtMonth>${form.mother_doc_date?string("MM")}</dtMonth>
            <dtYear>${form.mother_doc_date?string("yyyy")}</dtYear>
        </dat>

        <nam>
            <#if form.mother_doc_type?has_content>
                ${dicRegistry.getItemByKey('DUL_LS', form.mother_doc_type).name}
            <#else>
                ${form.mother_doc_type_m!''}
            </#if>
        </nam>
        <num>${form.mother_doc_number}</num>
        <ovd>${form.mother_doc_place}</ovd>
        <seria>${form.mother_doc_ser}</seria>
    </docum>

    <fio>
        <fam>${form.mother_last_name}</fam>
        <nam>${form.mother_first_name}</nam>
        <otch><#if form.mother_middle_name?has_content>${form.mother_middle_name}</#if></otch>
    </fio>

    <mestoLive>
        <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.living_she_country!'null').name?html}</gos>

    <#if (form.living_she_address_input!"")=="1" && form.living_she_country?matches("643")>
				<subGos><@nakhodka.fromKladr "living_she_community" true "KLADRRegion" "region" /></subGos>
    <#else>
        <#if form.living_she_region_txt><subGos>${form.living_she_region_txt}</subGos><#else >
            <subGos />
        </#if>
    </#if>

    <#if (form.living_she_address_input!"")=="1" && form.living_she_country?matches("643")>
        <#if (dicRegistry.getItemByKey('KLADRRegion', form.living_she_community?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.living_she_community?substring(0,2)+"000000000").name)>
						<rayon><@nakhodka.fromKladr "living_she_community" true "KLADRRegion" "rayon" /></rayon>
        <#else>
            <rayon/>
        </#if>
    <#else>
        <#if form.living_she_area_txt??> <rayon>${form.living_she_area_txt}</rayon><#else >
            <rayon/>
        </#if>
    </#if>

    <#if (form.living_she_address_input!"")=="1" && form.living_she_country?matches("643")>
        <nasPun><@nakhodka.fromKladr "living_she_community" true "KLADRRegion" "gorod" /></nasPun>
				<typeNP><@nakhodka.fromKladr "living_she_community" false "KLADRRegion" "gorod" /></typeNP>
    <#else>
        <#if (form.living_she_settlement_type!'')=="1">
           <gorod>${form.living_she_city_txt!''}</gorod>
        <#else>
           <nasPun>${form.living_she_community_txt!''}</nasPun>
           <typeNP/>
        </#if>
    </#if>

    <#if (form.living_she_address_input!"")=="1" && form.living_she_country?matches("643")>
				<street><@nakhodka.fromKladr "living_she_street" true "KLADRStreet" "street" /></street>
				<typeStr><@nakhodka.fromKladr "living_she_street" false "KLADRStreet" "street" /></typeStr>
    <#else>
        <street>${form.living_she_street_txt!''}</street>
    </#if>

    <#if form.living_she_house?has_content>
        <house>${form.living_she_house!''}</house><#else>
        <house/></#if>
    <#if form.living_she_corp?has_content>
        <korp>${form.living_she_corp!''}</korp><#else>
        <korp/></#if>
    <#if form.living_she_flat?has_content>
        <kvart>${form.living_she_flat!''}</kvart><#else>
        <kvart/></#if>
        <indMal/>
    </mestoLive>

    <datRojd>
        <dtDay>${form.mother_birth_date?string("dd")}</dtDay>
        <dtMonth>${form.mother_birth_date?string("MM")}</dtMonth>
        <dtYear>${form.mother_birth_date?string("yyyy")}</dtYear>
    </datRojd>

    <!--Правила заполнения см. Таблица 1-->
<#if form.mother_citizenship?has_content>
    <#assign motherGrajd = dicRegistry.getItemByKey('GRAJD_LS', form.mother_citizenship).name/>
    <#if motherGrajd = "Иное">
        <grajd>
            <gosRod/>
            <type>GRAJD_NO_ESTABL</type>
        </grajd>
        <#elseif motherGrajd = "Лицо без гражданства">
            <grajd>
                <gosRod/>
                <type>GRAJD_WITHOUT</type>
            </grajd>
        <#else >
            <grajd>
                <gosRod>${motherGrajd}</gosRod>
                <type>GRAJD_YES_GOS</type>
            </grajd>
    </#if>

</#if>

    <mestoRojd>
        <gos>${dicRegistry.getItemByKey('INSOFT_OKSM', form.birth_she_country!'null').name?html}</gos>

    <#if (form.birth_she_input!"")=="1" && form.birth_she_country?matches("643")>
				<subGos><@nakhodka.fromKladr "birth_she_community" true "KLADRRegion" "region" /></subGos>
    <#else>
        <#if form.birth_she_region_txt??><subGos>${form.birth_she_region_txt}</subGos><#else >
            <subGos/>
        </#if>
    </#if>

        <#if (form.birth_she_input!"")=="1" && form.birth_she_country?matches("643")>
        <#if (dicRegistry.getItemByKey('KLADRRegion', form.birth_she_community?substring(0,5)+"000000").name)!=(dicRegistry.getItemByKey('KLADRRegion', form.living_she_community?substring(0,2)+"000000000").name)>
						<rayon><@nakhodka.fromKladr "birth_she_community" true "KLADRRegion" "rayon" /></rayon>
        <#else>
            <rayon/>
        </#if>
    <#else>
        <#if form.birth_she_area_txt><rayon>${form.birth_she_area_txt}</rayon><#else >
            <rayon/>
        </#if>
    </#if>

        <#if (form.birth_she_input!"")=="1" && form.birth_she_country?matches("643")>
        <nasPun><@nakhodka.fromKladr "birth_she_community" true "KLADRRegion" "gorod" /></nasPun>
				<typeNP><@nakhodka.fromKladr "birth_she_community" false "KLADRRegion" "gorod" /></typeNP>
    <#else>
        <#if (form.birth_she_settlement_type!'')=="1">
           <gorod>${form.birth_she_city_txt!''}</gorod>
        <#else>
           <nasPun>${form.birth_she_community_txt!''}</nasPun>
           <typeNP/>
        </#if>
    </#if>
    </mestoRojd>

<#if form.mother_nation?has_content>
    <nation>${dicRegistry.getItemByKey('NATIONALITY_LS', form.mother_nation?substring(0,1)).name}</nation>
    <#else >
        <nation/>
</#if>
</moth>

<#if form.usluga_form=="2">
<fathFio>
    <fam>${form.father_last_name!""}</fam>

    <nam>${form.father_first_name!""}</nam>

    <otch>${form.father_middle_name!""}</otch>
</fathFio>

</#if>

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
    <typeQue>AZ_RO</typeQue>
</timeQue>
<zjvl>${form.declarant!""}</zjvl>
</zjv>
<#if form.usluga_form=="1"></wss:putZjvRo1><#elseif form.usluga_form=="2"></wss:putZjvRo2></#if>
</soapenv:Body>
</soapenv:Envelope>
